package overload;

public class OverloadExer {

    public void meo(int num) {
        System.out.println(num * num);
    }
    public void meo(int num1 ,int num2){
        System.out.println(num1 * num2);
    }
    public void meo(String  message){
        System.out.println(message);
    }
    public int max(int  i , int j){
        return  (i >= j) ?  i : j ;
    }
    public double max(double  i , double j) {
        return (i >= j) ? i : j;
    }
    public double max(double d1 ,double d2,double d3){
      return  max(max(d1,d2),d3);
    }
};


