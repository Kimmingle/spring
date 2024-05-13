package com.spring5.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.spring5.dto.Classroom;
import com.spring5.dto.Store;
import com.spring5.dto.Student;
import com.spring5.service.SampleService;
import com.spring5.service.StoreService;
import com.spring5.vo.Maker;


@RestController
@RequestMapping("/api/")
public class RestfulController {
	
	private static final Logger Log= LoggerFactory.getLogger(RestController.class);  // Logger불러오기
	
	@Autowired
	private SampleService sampleService;
	
	@Autowired
	private StoreService storeService;
	
	
 //기본적으로 json으로 제공한다.
	@GetMapping("api1.do")
	public int getApi1() {
		
		return 1004;
	}
	
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1, "EmArt");
		return store;
	}
	
	@GetMapping("api3.do")
	public List<Store> getApi3() {
		Store store1 = new Store(1, "EmArt");
		Store store2 = new Store(2, "HomePlus");
		Store store3 = new Store(3, "Costco");
		ArrayList<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		return storeList;
	}
	
	@GetMapping("api4.do")
	public Maker getApi4() {
		Store store1 = new Store(1, "EmArt");
		Store store2 = new Store(2, "HomePlus");
		Store store3 = new Store(3, "Costco");
		ArrayList<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		
		Maker maker = new Maker("GreateMall",1,storeList);
		return maker;
	}
	
	@PostMapping("api5.do")
	public Store postApi5(@RequestBody Store store) {
		storeService.insStore(store);
		
		return store;
	}
	
	@PostMapping("api6.do")  //RestController의 post를 활용한 student -> jsonString
	public String postStudent(@RequestBody Student std) { //객체를 sudent로 받아 json으로 출력
		String response = String.format("\n<학생정보>\n이름 : %s\n번호 : %d\n나이 : %d", 
				std.getName(), std.getStdNumber(), std.getAge());
		Log.info("postStudent response :"+response);
		return response;
	}
	
	@PostMapping("api7.do")
	public String postAllStudent(@RequestBody List<Student> stds) {  // stds list로 전달받음
		String response = "\n<학급정보>\n";
		int i = 1;
		for(Student s : stds) {
			response += String.format("학생 : %d 이름 : %s, \t번호 : %d\t나이: %d\n", i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
		Log.info("postAllStudent response : "+response);
		return response;
	}
	
	
	@PostMapping("api8.do")
	public String postClassroom(@RequestBody Classroom team) {  // team으로 전달받음
		String response = String.format("\n<팀 정보>\n학과명: %s\n반 : %d\n", team.getPart(), team.getClassNum());
	
		int i = 1;
		for(Student s : team.getStudents()) {
			response += String.format("학생 : %d 이름 : %s, \t번호 : %d\t나이: %d\n", i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
		Log.info("postAllStudent response : "+response);
		return response;
	}
	
	@PostMapping("api9.do")
	public Student converStringToStudent1(@RequestBody String jsonStr) {  // team으로 전달받음
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
		
		Student std = new Student(Integer.valueOf(jsonObject.get("stdNumber").toString()),jsonObject.get("name").toString(),Integer.valueOf(jsonObject.get("age").toString()));
		
		Log.info("convertStringToStudent1 resoinse : "+std);
		return std;
	}
	
	//simple-json을 활용한 Student -> JsonString
    @PostMapping(value="api10.do", produces="application/json;charset=UTF-8")    
    public String convertStudentToString1(@RequestBody Student std) {
        JSONObject jsonPlayer = new JSONObject();
        jsonPlayer.put("stdNumber", std.getStdNumber());
        jsonPlayer.put("name", std.getName());
        jsonPlayer.put("age", std.getAge());
        String jsonStr = jsonPlayer.toJSONString();
        log.info("convertStudentToString1 result : "+jsonStr);
        return jsonStr;
    }
    /* 여기 까지는 simple-json 라이브러리 사용한 Receive & Transfer */
    
    /* 여기 부터는 Gson 라이브러리 사용한 Receive & Transfer */
    @PostMapping(value="api11.do", produces="application/json;charset=UTF-8") //gson을 활용한 JsonString -> Student
    public Student convertStringToStudent2(@RequestBody String jsonStr) {
        Gson gson = new Gson();
        Student std = gson.fromJson(jsonStr, Student.class);
        log.info("convertStringToStudent2 result : "+std);
        return std;
    }

    //gson을 활용한 JsonString -> Classroom
    @PostMapping(value="api12.do", produces="application/json;charset=UTF-8") 
    public Classroom convertStringToClassroom2(@RequestBody String jsonStr) {
        Gson gson = new Gson();
        Classroom team = gson.fromJson(jsonStr, Classroom.class);
        log.info("convertStringToClassroom2 result : "+team);
        return team;
    }

    //gson을 활용한 Classroom -> JsonString
    @PostMapping(value="api13.do", produces="application/json;charset=UTF-8")
    public String convertClassroomToString2(@RequestBody Classroom team) {
        Gson gson = new Gson();
        String jsonStr = gson.toJson(team);
        log.info("convertClassroomToString2 : "+jsonStr);
        return jsonStr;
    }
    /* 여기 까지는 Gson 라이브러리 사용한 Receive & Transfer */
    
    /* 여기 부터는 jackson 라이브러리 사용한 Receive & Transfer */
    @PostMapping(value="api14.do", produces="application/json;charset=UTF-8")   //jackson을 활용한 JsonString -> Classroom
    public Classroom convertStringToClassroom3(@RequestBody String jsonStr) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> teamMap = objectMapper.readValue(jsonStr, new TypeReference<>(){});
        Classroom team = new Classroom(
                teamMap.get("part").toString(),
                Integer.valueOf(teamMap.get("classNum").toString()),
                (ArrayList<Student>) teamMap.get("students"));
        log.info("convertStringToClassroom3 result : "+team);
        return team;
    }

    @PostMapping(value="api15.do", produces="application/json;charset=UTF-8") //jackson을 활용한 Classroom -> JsonString
    public String convertClassroomToString3(@RequestBody Classroom team) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(team);
        log.info("convertClassroomToString3 result : "+jsonStr);
        return jsonStr;
    }
    /* 여기 까지는 jackson 라이브러리 사용한 Receive & Transfer */
}s
}
