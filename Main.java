//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  System.out.println("kowshik");

        String name="kowshik";
        String channel="codeWithHarry";
        System.out.println(name);
        System.out.println(name.length());
//        that will make lower name into upper name
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println( name + "from"+ channel);

//        escape sequence---   \",\\,\t,\n -- will give space an hide "".....\ will del that symbol attach with it.
        System.out.println( name + " from\" "+ channel);
        System.out.println( name + " from\\ "+ channel);
        System.out.println( name + " from\t "+ channel);
        System.out.println( name + " from\n "+ channel);

//name.contains will return true or false as that char is present in that string
        System.out.println(name.contains("kow"));
        System.out.println(name.charAt(2));
        System.out.println(name.endsWith("ik"));
        System.out.println(name.indexOf("hik"));
//        java string method .... search and learn from Google

    }
}
