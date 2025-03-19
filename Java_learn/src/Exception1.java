public class Exception1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello Guys");
        
        try {
            System.out.println(a[9]); // This will throw ArrayIndexOutOfBoundsException
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Out of bounds: " + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("General Exception: " + e.getMessage());
//        }
//        
        }catch (Exception e) {
            System.out.println("All exception handling: " + e.getMessage());
        }
        System.out.println("Bye");
    }
}
