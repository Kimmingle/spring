package spring1;

import com.spring1.dto.Store;

public class InjectionAnnotation1 {  //수정자 주입(set)
	
	private Store storeBean1;
	private Store storeBean2;
	
	
	public Store getStoreBean1() {
		return storeBean1;
	}
	public void setStoreBean1(Store storeBean1) {
		this.storeBean1 = storeBean1;
	}
	public Store getStoreBean2() {
		return storeBean2;
	}
	public void setStoreBean2(Store storeBean2) {
		this.storeBean2 = storeBean2;
	}
	
	
}
