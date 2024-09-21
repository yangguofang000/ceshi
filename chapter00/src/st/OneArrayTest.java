package st;

import java.util.Scanner;

public class OneArrayTest {
    public static void main(String[] args) {
        double[] priase;
        priase = new double[]{10.0,20.0,30.0,40.0,50.0};
        System.out.println("priase[0]="+ priase[0]);
        String[] names = new String[]{"张三","李四","王五"};
        names[0] = "哈哈哈" ;
        for (int i = 0; i < names.length; i++) {
            System.out.println("names["+i+"]="+names[i]);
        }
        String[] weeks = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字1-7:");
        int index = scanner.nextInt() ;
        System.out.println("今天是: "+weeks[index - 1]);


        // 输入人数
        System.out.println("请输入人数:");
        int count = scanner.nextInt();

        //创建分数数组
        int MaxScore = 0 ;
        int[] scores = new int[count];
        for(int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个人的成绩:");
            scores[i] = scanner.nextInt();
            if(scores[i] > MaxScore){
                MaxScore = scores[i];
            }
            }
        System.out.println("最高分是:"+MaxScore);
        // 分数等级判断
        String grade;
        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= MaxScore -10){
                grade = "A";
            }else if(scores[i] >= MaxScore -20){
                grade = "B";
            }else if(scores[i] >= MaxScore -30){
                grade = "C";
            }else{
                grade = "D";
            }
            System.out.println("第"+(i+1)+"个人的成绩为:"+scores[i]+",等级为:"+grade);

        }
        scanner.close();
    }
}
