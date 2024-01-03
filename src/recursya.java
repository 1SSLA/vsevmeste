public class recursya{
    public static void chisla(int a, int b){
        if(a==b){
            System.out.println(a);
        }
        else if(a > b){
            System.out.println(a);
            chisla(a - 1  ,b);

        }
        else{
            System.out.println(a);
            chisla(a + 1 , b);
        }
    }
    public static void main(String[] args){
        int a = 10;
        int b = 5;


        if(a < b){
            chisla(a,b);

        } else{
            chisla(a,b);
        }
    }
}
