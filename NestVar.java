public class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("Thi is count: " + count);

            for(count = 0; count < 2; count++)
            System.out.println("This program is in error");
        }
    }
}
