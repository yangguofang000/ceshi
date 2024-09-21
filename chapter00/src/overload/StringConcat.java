package overload;

public class StringConcat {
    public static void main(String[] args) {
        StringConcat stringConcat = new StringConcat();
        String info =stringConcat.concat("+","a","b","c");
        System.out.println(info);

    }

    public String concat(String operator, String ... strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
            if (i < strs.length - 1) {
                sb.append(operator);
            }
        }
        return sb.toString();
    }


}
