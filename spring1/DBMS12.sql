create table sample (num int, title varchar2(50), res TIMESTAMP DEFAULT sysdate);
SELECT * from sample;
insert into sample values (1, '샘플1', default);
insert into sample values (2, '샘플2', default);
insert into sample values (3, '샘플3', default);
commit;

s