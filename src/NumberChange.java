public class NumberChange {

    static void change(int i,int value){
        String returnString = "";

        while(value != 0){

            // 나머지가 0~9 사이이면  캐릭터 값을 배열에 저장
            if( (value % i) < 10 ) {
                //문자열 우->좌로 배열
                returnString = (value % i) + returnString;
                //몫을 구함
                value /= i;
            }
        }
        System.out.println(returnString);
    }
    public static void main(String[] args){
        change(5,6);

    }
}
