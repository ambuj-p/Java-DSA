// how many way to invite n guests single and pairs
class GuestInviteWays {
    public static int guestInvite(int n){
        if(n<=1) return 1;
        int single=guestInvite(n-1);
        int pair=(n-1)*guestInvite(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Total ways: "+guestInvite(n));
    }
}
