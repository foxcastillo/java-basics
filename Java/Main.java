class Main {
    public static void main (String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if(b) System.out.println(" this is executed");
        // a boolean value can control the if statement

        b = false;
        if (b) System.out.println("This is not executed");
        
        // Outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " (10 > 9));
    }
}