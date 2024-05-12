package BasicJava;

public class Basics {

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("abhishek");
        System.out.println(sb.append("pardesh"));

        System.out.println(sb);

    }

    public int getAge(int age){
        return age+10;
    }
}
