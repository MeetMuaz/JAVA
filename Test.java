public class Test {
    public static void main(String a[]) {
        // String name = new String("muaz");
        // System.out.println("hello " + name);
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat("balogun"));

        StringBuffer sb = new StringBuffer("Navin");
        sb.append(" Reddy");

        sb.insert(6, "Java ");
        sb.setLength(30);
        System.out.println(sb);
    }
}
