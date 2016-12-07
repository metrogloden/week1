public class Main {
    public static void main(String[] args) {
        String name = "Java is cool ";
        System.out.println(name);
        
        //charAt(10); charAt(0); charAt(5);
        System.out.println(name.charAt(10));

        //contains("is"); contains("Cool");
        System.out.println(name.contains("cool"));

        //equals("JAVA IS COOL"); equalsIgnoreCase("JAVA IS COOL");
        System.out.println(name.equals("JAVA IS COOL"));

        //indexOf('o'); indexOf("a",3);
        System.out.println(name.indexOf("a",3));

        //length();
        System.out.println(name.length());

        //replace("J","K");
        System.out.println(name.replace("a","K"));

        //startsWith("J"); endsWith("L");
        System.out.println(name.startsWith("J"));

        //substring(2); substring(0,4);
        System.out.println(name.substring(4));

        //toLowerCase(); toUpperCase();
        System.out.println(name.toUpperCase());

        //trim();
        System.out.println(name.trim());

        //chain these commands together: .trim() .toUpperCase() replace("o","--")
        System.out.println(name.trim().replace("o","r").toUpperCase());

        //Using the same class, manipulate StringBuilder str = new StringBuilder("java is");
        StringBuilder str = new StringBuilder("java is");
        System.out.println(str);

    }
}
