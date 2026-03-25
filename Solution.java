class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(tomatoSlices % 2 != 0 ){
            return new ArrayList<>();
        }
        int Jumbo = (tomatoSlices  -2 * cheeseSlices)/ 2;
        int Small =  cheeseSlices - Jumbo;
        if(Jumbo <0 || Small <0){
            return new ArrayList<>();
        }
        return Arrays.asList(Jumbo,Small);
        
    }
}