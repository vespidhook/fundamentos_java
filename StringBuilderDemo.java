public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.hashCode());
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, ",");
        System.out.println(sb);
        sb.replace(6, 11, "Java");
        System.out.println(sb);
        sb.delete(5, 6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.hashCode());
    }
}
