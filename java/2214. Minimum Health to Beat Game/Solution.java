class Solution {

    public long minimumHealth(int[] damage, int armor) {

        int maxDamage = Integer.MIN_VALUE;
        long totalDamage = 0;
        for (int dmg : damage) {
            maxDamage = Math.max(maxDamage, dmg);
            totalDamage += dmg;
        }

        return totalDamage - Math.min(armor, maxDamage) + 1;
    }
}