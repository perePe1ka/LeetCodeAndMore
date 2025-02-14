package org.example.YandexInterview.FirstAlgoInterview;


/**
 * Дан непустой массив из нулей и единиц.
 * Нужно определить, какой максимальный по длине подынтервал единиц можно получить,
 * удалив (пропустив) ровно один элемент массива.
 *
 * Удалять один элемент из массива обязательно.
 */

//assert(maxOnes(new int[]{1, 1, 0, 1})) == 3
//assert(maxOnes(new int[]{1, 1, 0, 0, 1})) == 2

public class SolutionYandexTask {
    public int maxOfOnex(int[] nums) {
        int maxLen = 0;
        int temp = 0;
        int count = -1;

        for(int i = 0; i < nums.length; i++) { //i = 4; temp = 3; count = 3;
            if(nums[i] == 0) {
                temp = count + 1;
                count = i;
                //count++;
            }

            //while(count > 1) {
            //if(nums[temp] == 0) {
            //    count--;
            //}
            //temp++;
            //}

            maxLen = Math.max(maxLen, i - temp); //maxLen = 2
        }
        return maxLen;
    }
}

//1)
//-> {1, 1, 0, 0, 1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 0; nums[0] = 1 false
//-> while false
//-> maxLen = 0;
//
//2)
//-> {1, 1, 0, 0, 1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 1; nums[1] = 1 false
//-> while false
//-> maxlen = 1;
//
//3)
//-> {1, 1, 0, 0, 1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 2; nums[2] = 0 true; count ++ = 1
//-> while false;
//-> maxlen = 2
//
//4)
//-> {1, 1, 0, 0, 1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 3; nums[3] = 0 true; count++ = 2;
//-> while count > 1
//->      if(nums[0] == 0) false
//->      temp++ = 1;
//->      if(nums[1] == 0) false;
//->      temp++ = 2;
//->      if(nums[2] == 0) true; count--; count = 1
//->      temp++ = 3;
//-> while false
//-> maxlen(2, 3 - 3 = 0) = 2
//
//5)
//-> {1, 1, 0, 0, 1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 4; nums[4] = 1 false
//-> while false
//-> maxlen(2, 4-3 = 1) = 2
//
//2
//
//1)
//-> {1,1,0,1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 0; nums[0] == 1 false
//-> while false
//-> maxLen = maxOf(0, 0-0) = 0;
//
//2)
//-> {1,1,0,1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 1; nums[1] == 1 false
//-> while false
//-> maxLen = maxOf(0, 1-0) = 1
//
//3)
//-> {1,1,0,1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 2; nums[2] = 0; count++ = 1;
//-> while false;
//-> maxLen(1, 2-0) = 2
//
//4)
//-> {1,1,0,1}
//-> maxLen = 0; temp = 0; count = 0;
//-> i = 3; nums[3] = 1 false
//-> while false
//-> maxLen = maxOf(1, 3) = 3

