class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

       int i = 0;

       while (i < intervals.length && newInterval[0] > intervals[i][1]){

            list.add(intervals[i]);
            i++;
       }    

       // overlapping
       /*
        interval[i][0] - s1
        interval[i][1] - e1
        newInteval[0] - s2
        newInterval[1] - e2

//overlapping case -- e1 >= s2 && e2 >= s1
            interval[i][1] >= newInteval[0]  &&  newInterval[1] >= interval[i][0]
                    // put that in loop

    
       */

       while (i < intervals.length && (intervals[i][1] >= newInterval[0]  &&  newInterval[1] >= intervals[i][0])){

            newInterval[0] = Math.min(intervals[i][0], newInterval[0] );

            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
       }

       list.add(newInterval);

       while(i < intervals.length){
        list.add(intervals[i]);
        i++;
       }

       int[][] res = new int[list.size()][2];

       for (int j = 0; j < list.size(); j++){
            res[j]  = list.get(j);
       }

       return res;
        
    }
}
