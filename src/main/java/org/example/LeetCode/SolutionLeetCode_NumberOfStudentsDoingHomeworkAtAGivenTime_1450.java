package org.example.LeetCode;

public class SolutionLeetCode_NumberOfStudentsDoingHomeworkAtAGivenTime_1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        if (startTime.length != endTime.length) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
//        if(startTime.length != endTime.length) {
//            return -1;
//        }
//        int i = 0;
//        int count = 0;
//        while(i != startTime.length) {
//            if (startTime[i] == queryTime || endTime[i] == queryTime) {
//                count++;
//                i++;
//                continue;
//            }
//            int temp = endTime[i] - startTime[i];
//            for(int j = 0; j < temp; j++) {
//                if(startTime[i] == queryTime) {
//                    count++;
//                    break;
//                }
//
//                startTime[i]++;
//            }
//            i++;
//        }
//        System.out.println(count);
//        return count;

}