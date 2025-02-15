import java.util.List;

public class Temperatur {
    public int[] temperatur;
    public Temperatur(int[] temperatur) {
        this.temperatur = temperatur;
    }
    public int average() {
        int sum = 0;
        for(Integer temperature : temperatur){
            sum += temperature;
        }
        return sum/temperatur.length;
    }
    public int max(){
        int max = temperatur[0];
        for(Integer temperature : temperatur){
            if(temperature > max){
                max = temperature;
            }
        }
        return max;
    }
    public int min() {
        int min = temperatur[0];
        for (Integer temperature : temperatur) {
            if (temperature < min) {
                min = temperature;
            }
        }
        return min;
    }

    public int[] maxDifference() {
        int maxDiff=0;
        int index=0;
        for(int i=0; i<temperatur.length-1; i++){
            if(temperatur[i+1]-temperatur[i]>maxDiff){
                maxDiff=temperatur[i+1]-temperatur[i];
                index=i;
            }
            if(temperatur[i]-temperatur[i+1]>maxDiff){
                maxDiff=temperatur[i+1]-temperatur[i];
                index=i;
            }
        }
        return new int[]{index+1,index+2};
    }

}
