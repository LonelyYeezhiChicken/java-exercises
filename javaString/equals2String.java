package javaString;

public class equals2String {
    public static void main(String[] args) {
        // 宣告字串
        String hi1 = "hi hi";
        String hi2 = new String("hi hi");

        // 印出結果
        System.out.println("hi1.equals(hi2) " + hi1.equals(hi2));
        System.out.println("hi1 == hi2 " + (hi1 == hi2));
    }
}
