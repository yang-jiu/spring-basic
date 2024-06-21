package hello.core.singleton;

public class SingletonService {

    //딱 하나만 존재
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //생성자를 private로 선언 -> new 키워드로 생성 못하게 방지
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
