class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> buildings = new ArrayList<>();
        int currentMax = 0;

        for (int i = heights.length - 1; i >= 0; i--) {
            if(heights[i] > currentMax) buildings.add(i);
            currentMax = Math.max(currentMax, heights[i]);
        }

        int[] answer = new int[buildings.size()];
        for (int i = 0; i < buildings.size(); i++) {
            answer[i] = buildings.get(buildings.size() - 1 -i);
        }

        return answer;

    }
}