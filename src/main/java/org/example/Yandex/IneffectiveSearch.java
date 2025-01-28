package org.example.Yandex; //IneffectiveSearch

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class IneffectiveSearch {
    static class Node {
        int[] next = new int[26];
        ArrayList<Integer> idx = new ArrayList<>();
        Node(){Arrays.fill(next,-1);}
    }
    static ArrayList<Node> trie=new ArrayList<>();
    static void addWord(String w,int i){
        w=w.toUpperCase();
        int cur=0;
        for(int k=0;k<w.length();k++){
            int c=w.charAt(k)-'A';
            if(trie.get(cur).next[c]<0){
                trie.get(cur).next[c]=trie.size();
                trie.add(new Node());
            }
            cur=trie.get(cur).next[c];
            trie.get(cur).idx.add(i);
        }
    }
    static int getCount(int node,int x){
        ArrayList<Integer>a=trie.get(node).idx;
        int l=0,r=a.size()-1,res=-1;
        while(l<=r){
            int m=(l+r)>>>1;
            if(a.get(m)<=x){res=m;l=m+1;}else r=m-1;
        }
        return res+1;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        trie.add(new Node());
        String[]dict=new String[N];
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<N;i++){
            dict[i]=br.readLine();
            if(!map.containsKey(dict[i]))map.put(dict[i],i);
        }
        for(int i=0;i<N;i++) addWord(dict[i],i);
        for(Node nd:trie) Collections.sort(nd.idx);
        int Q=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(Q-->0){
            String q=br.readLine();
            String qq=q.toUpperCase();
            int upTo=map.containsKey(q)?map.get(q):N-1;
            long s=0;int node=0;
            for(int i=0;i<qq.length();i++){
                int c=qq.charAt(i)-'A';
                if(trie.get(node).next[c]<0)break;
                node=trie.get(node).next[c];
                s+=getCount(node,upTo);
            }
            sb.append((upTo+1)+s).append("\n");
        }
        System.out.print(sb);
    }
}



