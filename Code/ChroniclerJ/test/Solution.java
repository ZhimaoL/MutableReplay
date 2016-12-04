import java.util.*;
import java.lang.*;

public class Solution {

    int counter = 0;

    public static void main(String[] args) {
	    
		List<String> list = new ArrayList<>();
   		
		list.add("notepad.exe");
      
   		// create the process builder
   		ProcessBuilder pb = new ProcessBuilder(list);
      
   		// get the command list
   		System.out.println(""+pb.command());

        func1(); // 2
        func3(); // 3

        Solution s = new Solution(); // 4
        s.func4(); // 5

        List<Double> l = null;
        l.add(23.2); //6 , 7
    }    


    public static void func1() {
        int x = 1;
        int y = 2;
        int z = func2(x, y); // 8
    }

    public static int func2(int x ,int y) {
        func22();
        return 100;
    }

    public static int func22() {
        return 23;
    }

    public static Double func3() {
        Random r = new Random();
        int x = r.nextInt(100);
        return 1.0; // 9
   //     String a = "a" + "b";
    }

    private void func4() {
        ++counter;
        if (counter < 10) {
            func4();    // 10
        }

        return ;
    }
}
