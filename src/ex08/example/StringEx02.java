package ex08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        // username.trim() 공백제거
        // username.toLowerCase 소문자로 전부 변경
        // username값과, password값 찾아보기
        String username;
        String password;

        String url = "http://www.naver.com?username=ssar&password=1234";
        int index = url.indexOf("?") + 1;
        String queryString = url.substring(index);
        String test1[] = queryString.split("&");
        String test2[] = test1[0].split("=");
        String test3[] = test1[1].split("=");

        for (int i = 0; i < test2.length; i++) {
            if(test2[i].equals("username")){
                continue;
            }else {
                username = test2[i];
                System.out.println(username);
            }
        }

        for (int i = 0; i < test3.length; i++) {
            if(test3[i].equals("password")){
                continue;
            }else {
                password = test3[i];
                System.out.println(password);
            }
        }





    }
}