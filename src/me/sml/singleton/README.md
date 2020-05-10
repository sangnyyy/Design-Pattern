## Singleton

특정 객체의 인스턴스가 애플리케이션 실행 중 단 한개만 존재하게 하고싶다.

1) 방법 1
    ```java
    public class Person {
        
        private static Person person;
        private String name;
        
        private Person(String name){ this.name = name; }
        
        public static Person getInstance(String name){
            if (person == null) {
                person = new Person(name);
            }
            return person;
        }
        
    }
     
    ```
    * 문제점은 Thread-Safe 하지 못하다는 것
        * ex) 동시에 getInstance 메서드 호출 시 2개 이상의 인스턴스가 생길 수 있다.

2) 방법 2 - DCL
    ```java
    public class PersonWithDCL {
        private volatile static PersonWithDCL personWithDCL;
        private String name;
        
        private PersonWithDCL(String name){ this.name = name; }
        
        public static Person getInstance(String name) {
            if (personWithDCL == null) {   // 한번!
                synchronized (PersonWithDCL.class) {
                    if (personWithDCL == null) {   // 두번!
                        personWithDCL = new PersonWithDCL(name);
                    }
                }
            }
            return personWithDCL;
        }
        
    }
    ```
    * DCL (Double Check Locking) 이란, 인스턴스 변수의 null 체크를 2번 하는 것을 의미
        * 한번 더 체크하는 이유는, 메인 메모리의 값을 스레드에서 바꿨을 수 있기 때문이다.
    * volatile 키워드를 써서 변수를 cpu cache가 아닌, main memory에 r/w할 수 있도록 한다.
    
3) 방법 3 - Holder
    ```java
    public class PersonWithHolder {
        private String name;
        
        private PersonWithHolder() {
            this.name = "person with holder";
        }
        
        public static class LazyHolder {
            public static final PersonWithHolder INSTANCE = new PersonWithHolder();
        }
        
        public static PersonWithHolder getInstance() {
            return LazyHolder.INSTANCE;
        }
        
    }
    ```
    * 클래서 로더의 경우 클래스 호출 시 로딩을 해오게 되는데, Holder 클래스의 경우 inner 클래스이기 떄문에
    호출 시 읽어들어오기 떄문에 애플리케이션 구동 시 인스턴스를 생성하는 문제를 해결할 수 있다.