-- hr 유저의 계정의 암호를 hr로 설정하고 계정의 잠금을 해제한다
alter user hr identified by hr account unlock;

-- hr 유저로 접속한다
connect hr/hr;

-- 기본적으로 제공되는 테이블의 이름을 확인한다
select tname from tab;
