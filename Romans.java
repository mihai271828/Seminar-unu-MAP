public class Romans {


    public int romanToInt(String roman) {
        int number = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I') {
                if(i<roman.length()-1 && (roman.charAt(i+1) == 'V' || roman.charAt(i+1) == 'X')) {
                    number -=1;
                }
               else number+=1;
            }
            if (roman.charAt(i) == 'V') {
                number+=5;
            }
            if (roman.charAt(i) == 'X') {
                number+=10;
            }
        }
        return number;
    }
}
