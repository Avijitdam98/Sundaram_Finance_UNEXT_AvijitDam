public class FinallyblockException {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello World!");

        try {
            System.out.println(a[7]); // This will throw ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("I will always run.");
        }
        
        System.out.println("Bye world!");

        try {
            getNumberFromArray(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in method: " + e.getMessage());
        }
    }

    static int getNumberFromArray(int a[]) throws ArrayIndexOutOfBoundsException {
        return a[8]; 
    }
}
