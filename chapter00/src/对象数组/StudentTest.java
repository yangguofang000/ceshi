package 对象数组;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        //创建数组Student[]
        Student[] students = new Student[20];   // 动态创建了20个Student对象

        //循环给数组赋值
        for(int i=0;i<=19;i++){
            students[i] = new Student();
            students[i].number = i+1;
            students[i].state = (int)(Math.random()*6 + 1);  //
            students[i].score = (int)(Math.random()*101);

        }

        for(int i=0 ; i<20 ; i++){
            if(students[i].state == 3){
                // System.out.println("学号：" + students[i].number + "  成绩：" + students[i].score);
                Student newStudents =  students[i];
                System.out.println(newStudents.show());

                // System.out.println(Arrays.toString());
            }
        }

    }

}
