class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindif=Integer.MAX_VALUE;;
        for(int i=0;i<arr.length-1;i++)
        {
            if((arr[i+1]-arr[i])<mindif) mindif=arr[i+1]-arr[i];
        }
         List<List<Integer>> outerList = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if((arr[i+1]-arr[i])==mindif)
            {
                List<Integer> innerList = new ArrayList<>();
                innerList.add(arr[i]);
                innerList.add(arr[i+1]);
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}