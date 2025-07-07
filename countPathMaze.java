//counting the total possible path to traversal (0,0) to (m,n)

class Main {
    static int countPath(int i,int j,int m,int n){
        if(i==m || j==n)return 0;
        if(i==m-1 && j==n-1) return 1;
        
        int down=countPath(i+1,j,m,n);
        int right=countPath(i,j+1,m,n);
        return down+right;
    }
    public static void main(String[] args) {
        int totalPath= countPath(0,0,44,4);
        System.out.println("Total path is: "+totalPath);
    }
}
