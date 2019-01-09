package co.thebeat.ExerciseN;

public class Days {
    //
//    public static void main (String[] args) {
//
//    String a = new String("foo");
//    String b = new String("foo");
//
//
////System.out.println(a.hashCode()); // prints false
////System.out.println(b.hashCode());  // prints true
//
//        System.out.println(a==b); //prints false
//        System.out.print(a.equals(b)); // prints true
//
//        class Test
//        {
    public static void main(String args[]) {
        String a = "nikhil";     // it stores in String constant pool
        String s = new String("nikhil");    //with new stores in heap
        System.out.println(Integer.toHexString(System.identityHashCode(a)));
        System.out.println(Integer.toHexString(System.identityHashCode(s)));
    }
}



