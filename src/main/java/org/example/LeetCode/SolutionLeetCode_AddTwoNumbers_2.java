package org.example.LeetCode;// public class Main {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        ListNode listNode = new ListNode(2);
//        listNode.next = new ListNode(4);
//        listNode.next.next = new ListNode(3);
//
//
//        ListNode listNode1 = new ListNode(5);
//        listNode1.next = new ListNode(6);
//        listNode1.next.next = new ListNode(4);
//
//        System.out.println(solution.addTwoNumbers(listNode, listNode1));
//
//    }
//}

import java.util.*;

class SolutionLeetCode_AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<String> listL1 = new ArrayList<>();
        while (l1 != null) {
            listL1.add(String.valueOf(l1.val));
            l1 = l1.next;
        }

        List<String> listL2 = new ArrayList<>();
        while (l2 != null) {
            listL2.add(String.valueOf(l2.val));
            l2 = l2.next;
        }

        String s1 = "";
        for (int i = listL1.size() - 1; i >= 0; i--) {
            s1 += listL1.get(i);
        }

        String s2 = "";
        for (int i = listL2.size() - 1; i >= 0; i--) {
            s2 += listL2.get(i);
        }

        String s3 = String.valueOf(Long.parseLong(s1) + Long.parseLong(s2));

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = s3.length() - 1; i >= 0; i--) {
            curr.next = new ListNode(s3.charAt(i) - '0');
            curr = curr.next;
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}