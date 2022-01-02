 public class TimeSpanClient {
    public static void main(String[] args) {
        int h1 = 13, m1 = 30;
        int h2 = 13, m2 = 45;
        TimeSpan t1 = new TimeSpan(h1, m1);
        TimeSpan t2 = new TimeSpan(h2, m2);
        System.out.println("New object t1: " + t1);
        
        h1 = 3; m1 = 40;
        System.out.println("Adding " + h1 + " hours, " + m1 + " minutes to t1");        
        t1.add(h1, m1);
        System.out.println("New t1 state: " + t1);
        
        //creats an ArrayList of TimeSpan
        ArrayList<TimeSpan> list = new ArrayList<TimeSpan>();
        
        //add elements to the ArrayList
        list.add(t1);
        list.add(t2);
        
        //print unsorted list
        System.out.println("Unsorted order: " +list);
        
        //compare and sort list
        t1.compareTo(t2);
        Collections.sort(list);
        
        //Print ordered list
        System.out.println("TimeSpan sorted from shortest to longest: " + list);
    }
}
