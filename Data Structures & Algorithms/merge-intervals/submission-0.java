class Solution {
    public int[][] merge(int[][] intervals) {

        //Brute force approach 

        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals){
            list.add(interval);
        }

        boolean flag = true;

        while (flag){

            flag = false;

            for (int i = 0; i<list.size(); i++){
                int j = i +1;
                while (j < list.size()){

                    int[] prev = list.get(i);
                    int[] curr = list.get(j);

                    if (isOverlap(prev, curr)){
                        prev[0] = Math.min(prev[0], curr[0]);
                        prev[1] = Math.max(prev[1], curr[1]);

                        list.remove(j);
                        flag = true;
                    }
                    else {
                        j++;
                    }
                }
            }

        }

        int[][] res = new int[list.size()][2];

        for (int i = 0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        
        return res;
    }

    private boolean isOverlap(int[] a, int[] b){
        return (a[1] >= b[0]) && (b[1] >= a[0]);
    }
}
