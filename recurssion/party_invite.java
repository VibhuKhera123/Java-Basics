package recurssion;
//Find the number of ways in which you can invite n people to your party single or in pair

public class party_invite {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        //single
        int single = callGuest(n-1);
        //pair
        int pair = (n-1) * callGuest(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(callGuest(n));
    }
}
