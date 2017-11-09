/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
import java.util.Arrays;

public class GetMean {
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }
//public class GetMean {
//    public int getMean(int[] array) {
//        int total=0;
//        for(int i=0;i<array.length;i++)
//            total+=array[i];
//        return total/array.length;
//    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
//    함수를 완성해서 매개변수 list의 평균값을 return하도록 만들어 보세요.
//        어떠한 크기의 list가 와도 평균값을 구할 수 있어야 합니다.
//평균이라는게 double형이어야 하는게 아닌가라는 생각이 들었는데 그냥 답은 int형으로 해도 무방했다.