public class Solutions {

    public static int max3(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }
        if (b > a && b > c){
            return b;
        }
        if (c > a && c > b){
            return c;
        }
        return 0;
    }
    public static double max3(double a, double b, double c) {
        if (a > b && a > c){
            return a;
        }
        if (b > a && b > c){
            return b;
        }
        if (c > a && c > b){
            return c;
        }
        return 0;
        
    }
    public static boolean odd(boolean a, boolean b, boolean c) {
        if (a && !b && !c || !a && b && !c || !a && !b && c){
            return true;
        }if (!a || !b || !c){
            return false;    
        }else{
            return true;
        }
        
    }
    public static boolean majority(boolean a, boolean b, boolean c){
        /* 
        if (a && b && !c || a && !b && c || !a && b && c){
            return true;
        }if (!a || !b || !c){
            return false;    
        }else{
            return true;
        }
        */
    
    }

    public static double trigIdentity(double x){
        return (Math.pow(Math.sin(x),2) + Math.pow(Math.cos(x),2));
    }

    public static void main(String[] args) {
        System.out.println(majority(true, false, true));
    }
}