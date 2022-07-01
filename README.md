자바의 특징

연산자 5*3,= 15 
5/2, = 2 -> 정수
11%7 = 4 -> 나머지
형변환
문자를 숫자로 바꿔야 한다 또는 숫자를 문자로 바꿔야 한다
"69" -> Integer.parseInt("78(숫자)"); int로 바꾸기
"96" -> Integer.toString(96), 혹은 String.valueOf(96) -> string으로 바꾸기

double -> int로 형변환하기
double a = 253.635 -> 253 , 254    
int b = (int)a;   ->소수는 버림
int c = (int)Math.ceil(a) ->올림하고 int로 형변환
ceil(double a) ->올림 
round

접근제한자 
public: 공용 
protected 같은 패키지, 다른패키지인 경우 상속받아 사용 
default 같은 패키지
private 같은 클래스에서 상속안함, 오버라이딩 안됨 
->범위가 넓은 순서대로 나열한것

컬렉션
3개로 나눠서 함
List: 입력 순서 유지, index가 있다. 중복데이터를 허용한다. 
ArrayList, LinkedList, Vector
Set: 입력순서를 유지하지 않는다. (섞여버림), 중복데이터를 허용하지 않는다. 
HashSet(정렬안됨), TreeSet(정렬가능)
Map: key와 value의 구조로 저장, key는 중복허용하지 않음 
HashMap(비동기화), Hashtable(동기화), TreeMap(key로 정렬)

오버라이딩, 
상속관계에서 상위클래스의 메소드(일반메소드를의미) 다시 정의하는것
메소드명, 매개변수 갯수, 매개변수 데이터 타입이 같아야 한다.

오버로딩
같은 클래스에서 메소드명이 같은 메소드를 여러개 만드는 것
단, 매개변수의 갯수나 데이터 형이 달라야 한다.
사용자가 가지고 있는 데이터가 인트일경우 인트 메소드가 있으면 상관없지만 
인트 메소드가 없으면 스트링으로 변환해서 넣어주여야 한다.
method1(int a) {
 } 
method1(String b) {
 }
method1(int a, String b) {
 }

상속 ( subTest 찾아보기 superTest)
자바 상속문제 찾아보기

추상 클래스
추상메소드와 일반메소드가 같이있는 것 
extends 로 상속받아 모든 추상메소드를 오버라이딩 해야한다.

인터페이스 
추상메소드가 있고 final static 변수가 존재하는 클래스이다.
(일반클래스는) implements로 상속받아 추상메소드를 모두 오버라이딩 해줘야 한다.
인터페이스가 인터페이스를 상속받을 때는 extends로 상속을 받는다.

입출력
기본적으로 컴퓨터는 byte 단위를 가져온다. 
하지만 우리나라는 문자단위 char로 가져온다
줄단위로 가져오는 것도 있다.
byte -> InputStream, OutputStream 
char -> InputStreamReader, OutputStreamWriter
줄단위 -> BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter
버퍼리더를 만들겠다 하면 인풋스트림과 인풋스트림리더 둘다 필요하다. (단계별로 상위가 무조건 필요함)
스캐너는 저걸 이용해서 만든것임 Scanner sc= new Scanner(System.in)
fileinputstream과 filereader의 차이 바이트로 읽어오는지 문자로 읽어오는지 차이

네트워크
	TCP: 연결한 후 통신하는것
	 Socket, SeverSocket(접속을 기다렸다가 받는 것)
	UDP: 비연결상태에서 통신하는 것
	MultcastSocket(공용IP에 보내는것 멀티가능), DatagramSocket(상대방에게 보내는것만하는것 1대1로)
데이터는 DatagramPacket에 담아서 전송

내장함수
숫자함수: round()반올림, ceil()올림 floor(), format()소수점 아래 자릿수까지만
문자함수: concat()문자연결, substr(), length()[Bit, Char(문자수), 그냥length] char_length(), bit_length(). locate()위치, insert()길이만큼 변경 ...
날짜함수: now(), curdate(), AddDate(), last_Day(),...
변환함수: date_format
그룹함수: sum(), avg(), count(), max(), min()...

데이터 조작어 <DML>
dml-> crud 
select : 레코드 선택
insert: 레코드를 추가
update: 레코드를 수정
delete: 레코드를 삭제