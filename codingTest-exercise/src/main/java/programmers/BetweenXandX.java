package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenXandX {
    public int[] solution(String myString) {
        String[] subString = myString.split("x", -100);
        int[] answer = new int[subString.length];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = subString[i].length();
        }
//        문자열 입력
//        문자 x를 기준으로 나눌때
//        문자열 각각 길이 순서대로 저장한 배열 출력
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();
        BetweenXandX bxandx = new BetweenXandX();

        System.out.println(Arrays.toString(bxandx.solution(myString)));
    }
}

//class Solution {
//    public int[] solution(String myString) {
//        String strArr[] = myString.split("x");
//
//        int lengthOfArr = strArr.length;
//
//        if (myString.charAt(myString.length() - 1) == 'x'){
//            lengthOfArr++;
//        }
//        int answer[] = new int[lengthOfArr];
//
//
//        for (int i = 0; i < strArr.length; i++){
//            answer[i] = strArr[i].length();
//        }
//        return answer;
//    }
//}
