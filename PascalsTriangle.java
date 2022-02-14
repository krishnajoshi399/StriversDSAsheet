/*

for n = 4, print

      1
    1 2 1
   1 3 3 1
  1 4 6 4 1

*/


import java.util.*;

class PascalsTriangle{
    public static List<List<Integer>> pascalsTriangle(int n){
        List<List<Integer>> l = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> t = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i)
                    t.add(1);
                else
                    t.add(prev.get(j-1)+prev.get(j));
            }
            prev = t;
            l.add(t);
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        List<List<Integer>> l = pascalsTriangle(n);
        System.out.println(l);
    }
}
