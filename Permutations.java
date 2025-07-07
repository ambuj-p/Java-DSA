class Permutations{
   static int totalPermutation=0;
    public static void permute(String str,String answer){
        if(str.length()==0){
            totalPermutation++;
            System.out.println(answer);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String newStr=left+right;
            permute(newStr, answer+ch);
        }
    }
    public static void main(String[] args){
        String str="ABC";
        permute(str,"");
        System.out.println("Total Permutation: "+totalPermutation);
                
        
    }
}
