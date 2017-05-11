# String_Array_Collection
배열
	1. 배열이란
		1) 배열은 '같은 타입'의 여러 변수를 하나의 묶음으로 다루는 것
		2) 배열은 인스턴스화(new)를 통해서 메모리에 올라간다.
			§ Ex) ArraySub subs[] = new ArraySub[10];
		3) 매 배열마다 인스턴스화를 따로 해줘야한다.
			§ Ex) subs[0] = new ArraySub();
			       subs[1] = new ArraySub();

	2. 배열의 선언과 생성
		1) 배열 선언 : 참조변수의 공간 생성
		2) 배열 생성 : 값을 저장할 수 있는 공간이 생성(메모리에 로드)
		3) 타입[] 변수이름 = new 타입[길이];
		4) 타입 변수이름[] = {데이터};
	3. 배열의 길이와 인덱스
		1) 인덱스
			i. 배열의 요소마다 붙여진 일련번호(각 요소를 구별하는데 사용)
			ii. 인덱스의 범위 : 0 ~ 배열길이-1
			Ex) int[] array = new int[5];	// 길이가 5인 int형 배열
			Array[3] = 100;	Array배열의 4번째 요소에 100을 저장
		2) 배열의 길이
			i. 배열의 요수의 개수(값을 저장할 수 있는 공간의 개수)
			ii. 타입[] 변수이름 = new 타입[길이];
			iii. 배열의 길이는 int범위의 양의 정수(0을 포함)이어야함
			iv. 배열이름.length
				• 배열이름.length을 사용하여 배열의 길이에 대한 정보를 가져옴
				• Ex) int[] array = new int[5];
				     int length = array.length;	array.length의 값은 5, length에 5가 저장
				• 배열이름.length는 상수로 사용
				• 값을 읽을 수만 있을뿐, 변경은 할 수 없음
String
	1. String 배열
		1) 여러개의 문자열을 저장할 때 사용
		2) 초기화는 특별한 값이 없을 경우 null을 입력해준다.
		3) Null 값은 변수나 클래스가 값을 가지고 있지 않다는 뜻이다. - 메모리에는 올라가 있음
	2. String 클래스
		1) Char배열이 아닌  String 클래스를 이용해서 문자열을 처리하는 이유
		-> String 클래스= char배열 + 기능
		2) String 클래스의 주요 메서드
		String name = "안녕하세요.";
			i. // 글자 자르기
			//	beginIndex~EndIndex까지의 글자 출력
			// substring(beginIndex, endIndex)
			String secondWord = name.substring(1,2);
			System.out.println(secondWord);

			ii. // 문자열 길이 출력
			// 변수명이나 클래스명을 한글로는 가능하나 안쓰는 것이 좋음
			int 문자열길이	= name.length();
			System.out.println(문자열길이);

			iii. // charAt의 숫자 번째에 해당하는 한 글자를 출력
			char 한글자 = name.charAt(3);
			System.out.println(한글자);

			iv. // indexOf에 오는 값이 몇번째에 있는지 출력
			// indexOf는 주로 String과 int를 받는 것만 사용함
			int 몇번째 = name.indexOf("하세");
			System.out.println(몇번째);

			v. // split을 기준으로 문자를 쪼개서 사용
			String 두덩이[] = name.split("하");
			System.out.println(두덩이[0]);
			System.out.println(두덩이[1]);

			vi. // 첫번째에 해당하는 글자를 두번째에 해당하는 글자로 바꿔줌
			String 바뀐글 = name.replaceAll("하", "랄라라");
			System.out.println(바뀐글);

			vii. // beginIndex ~ endIndex 번째의 글자 출력
			// substring(beginIndex, endIndex)
			String secondWord = name.substring(1,2);
			위와 같은 경우
			" 0 안 1 녕 2 하 3 세 4 요 5 "으로 되어서
			출력은  "녕" 이 출력된다.
Collection & Generic
	1. 컬렉션프레임워크
		1) 컬렉션이란
			i. 여러 객체(데이터를 모아 놓은 것
		2) 프레임워크란
			i. 라이브러리(기능) + 프로그래밍 방식
		3) 컬렉션 프레임워크
			i. 컬렉션(다수의 객체)를 다루기 위한 표준화된 프로그래밍 방식
			ii. 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스를 제공
		4) 컬렉션 클래스
			i. 다수의 데이터를 저장할 수 있는 클래스
			ii. Ex) ArrayList, HashMap….
	2. 종류
		1) List
			i. 순서가 있는 데이터의 집합
			ii. 데이터의 중복을 허용
		2) Set
			i. 순서를 유지하지 않는 데이터의 집합
			ii. 데이터의 중복을 허용하지 않음
		3) Map
			i. 키와 값으로 이루어진 데이터의 집합.
			ii. 순서대로 저장되지 않음
			iii. 키의 중복을 허용하지 않음
			iv. 데이터의 중복을 허용

	3. 제네릭
		1) 제네릭이란
			i. 클래스에 사용할 타입을 사용자가 지정할 수 있도록 임의의 타입을 지정하는 것
		2) 제네릭의 사용 목적
			i. Return 타입을 일관성있게 유지
			ii. Casting 오류를 범하지 않도록 유도
			iii. Collection의 Key 또는 값의 타입을 통일 시키기 위해
	4. ArrayList
		1) 내부적으로 값이 입력되면 값과 함께 순서가 저장된다.
		2)  제네릭을 사용하지 않는 컬렉션은 입력되는 값을 Object로 Casting한다. 길이 출력
		3) arrayList를 사용하면 Object 형태로 데이터 관리함(타입이 오브젝트)
		4) Arraylist에서는 자동으로 박싱/언박싱이 되어서 객체에 집어넣게 된다.
		5) Ex) ArrayList<Integer> list = new ArrayList<>(); // 동적계체배열
		int a = 33;
		list.add(a);
		list.add(1234); // 제네릭을 사용하지 않는 컬렉션은 입력되는 값을 Object로 Casting한다.
		6) Ex)  ArrayList list = new ArrayList<>(); 이라면
		ArrayList<Integer> list = new ArrayList<>();	Integer 타입의 ArrayList
		ArrayList<Double> list1 = new ArrayList<>();	double 타입의 ArrayList
		뒤에 둘을 같이 선언해서 사용 가능함
		7) ArrayList의 주요 메소드
			i.  .add(객체) : 값 입력
			ii. .get(순서) : 값 출력
			iii. .size() :ArrayList의 길이 출력
			Ex) int list_Length = list.size();
			// list.size : arraylist의 길이 구하기
			for(int item : list)	// 향상된 for문
			{
				System.out.println(item);
				// list.get : arraylist에 해당하는 값 가져오기
			}
	5. Map 계열
		1) 키와 값으로 이루어진 데이터의 집합.
		2) 순서대로 저장되지 않음
		3) 키의 중복을 허용하지 않음
		4) 데이터의 중복을 허용
		5) 키와 값은 항상 같은 제네릭이 아니어도 된다.
		// - 키1 : 값, 키2 : 값  의 형태로 저장된다.
		6) Key값이 필요한 곳에서 사용한다.
		Ex) 주민등록번호를 입력하여 정보를 제공 등
		7) ArrayList와 Map계열의 가장 큰 차이는 키를 쓰느냐 마느냐이다.
		8) 키와 타입의 경우
			• 키와 타입이 지정되지 않는 경우 - Object형태로 캐스팅 되어 어떤 것을 넣어도 상관없다.
			HashMap map = new HashMap<>();

			• 키와 값의 타입이 같은 경우
			HashMap<String, String> map = new HashMap<>();
			map.put("key1", "홍길동");
			map.put("key2", "이순신");

			System.out.println(map.get("key1"));
			System.out.println(map.get("key2"));

			• 키와 값의 타입이 다른 경우
			HashMap<String, Student> map = new HashMap<>();
			map.put("key1", a1);
			map.put("key2", a2);

			System.out.println(map.get("key1"));
			System.out.println(map.get("key2"));
