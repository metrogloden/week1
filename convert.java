public class Main {
    
    public static void main(String[] args) {
        String str = "1";
        System.out.println(Integer.parseInt(str));
        
        String bull = "1234";
        long number = Long.parseLong(bull);
        System.out.println(number);
        
        String cool = "100";
        Short sh = Short.valueOf(cool);
        System.out.println(sh);
        
        String rock = "12.54";
        double value = Double.parseDouble(rock);
        System.out.println(value);
    }
}
