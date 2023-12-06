package javaString;

public class contentEqualsString {
    public static void main(String[] args) {
        // 宣告字串
        String hi1 = "hi hi";
        String hi2 = "hi hi";
        String hi3 = "你好";

        // 印出結果
        System.out.println("hi1:hi2 " + hi1.contentEquals(hi2));
        System.out.println("hi1:hi3 " + hi1.contentEquals(hi3));
    }
}
