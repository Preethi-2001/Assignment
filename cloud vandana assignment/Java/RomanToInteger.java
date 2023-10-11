import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        int result = romanToInt(roman);
        if(result!=0){
        System.out.println("Integer value of " + roman + " is " + result);
        }
        else{
            System.out.println("Not a Roman Number. Cannot be converted.");
        }
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0; 
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
              if(romanMap.containsKey(currentChar)){
                int currentValue = romanMap.get(currentChar);
          
                if (currentValue < prevValue) {
                    result -= currentValue;
                }
                else {
                    result += currentValue;
                }

                prevValue = currentValue;
             }
            else{
                return 0;
             }
        }

        return result;
    }
}
