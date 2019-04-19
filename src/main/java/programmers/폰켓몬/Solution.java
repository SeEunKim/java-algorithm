package programmers.폰켓몬;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-19
 * Time: 15:18
 */

class Solution {
    public int solution(int[] nums) {
        int selectablePokemonNumbers = nums.length / 2;

        Set<Integer> pokemonType = new HashSet<>();

        for (int num : nums) {
            pokemonType.add(num);
        }
        return Math.min(selectablePokemonNumbers, pokemonType.size());
    }
}