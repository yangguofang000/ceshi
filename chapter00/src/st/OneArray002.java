package st;

public class OneArray002 {
    public static void main(String[] args) {
        int[] tpp = new int[] {200,34,56,34,78,90,23,45,67} ;
        for (int i = 0 ; i < tpp.length ; i++) {
            System.out.print(tpp[i]+"\t");
        }
        System.out.println() ;
        for(int i = 0 ; i < tpp.length / 2 ; i++) {
            int tmp = tpp[i];
            tpp[i] = tpp[tpp.length - i - 1] ;
            tpp[tpp.length - i - 1] = tmp ;
        }
        for(int i = 0 ; i < tpp.length ; i++) {
            System.out.print(tpp[i]+"\t");
        }

        }

}
