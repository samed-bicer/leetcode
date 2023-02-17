class Solution:
    def minimumHealth(self, damage: List[int], armor: int) -> int:
        maxDamage = 0
        health = 1

        for dmg in damage:
            maxDamage = max(maxDamage, dmg)
            health += dmg

        return health - min(maxDamage, armor)