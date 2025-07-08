// how many way to place 1*m tile to n*m floor
class placeTileToFloor {
    public static int placeTile(int n,int m){
        if(m==n) return 2;
        if(n<m) return 1;
        //vertical
        int V=placeTile(n-m,m);
        //horizontal
        int H=placeTile(n-1,m);
        return V+H;
    }
    public static void main(String[] args) {
        int m=4;
        int n=3;
        int totalWays=placeTile(n,m); 
        System.out.println("Total ways to place tile is:"+totalWays);
    }
}
