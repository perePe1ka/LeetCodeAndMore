package org.example.Yandex; //AlternateHistory

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class AlternateHistory {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
        }
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
        }
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                C[i] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[] presenceB = new boolean[N + 1];
        boolean[] presenceC = new boolean[N + 1];
        Arrays.fill(presenceB, false);
        Arrays.fill(presenceC, false);

        for (int i = 0; i < N; i++) {
            presenceB[B[i]] = true;
            presenceC[C[i]] = true;
        }

        boolean[] S = new boolean[N + 1];
        for (int x = 1; x <= N; x++) {
            S[x] = (presenceB[x] && presenceC[x]);
        }

        boolean[] active = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (S[A[i]] && S[B[i]] && S[C[i]]) {
                active[i] = true;
            } else {
                active[i] = false;
            }
        }

        int[] countA = new int[N + 1];
        int[] countB = new int[N + 1];
        int[] countC = new int[N + 1];
        Arrays.fill(countA, 0);
        Arrays.fill(countB, 0);
        Arrays.fill(countC, 0);

        int[] Apos = new int[N + 1];
        Arrays.fill(Apos, -1);

        ArrayList<Integer>[] Bpos = new ArrayList[N + 1];
        ArrayList<Integer>[] Cpos = new ArrayList[N + 1];
        for (int x = 0; x <= N; x++) {
            Bpos[x] = new ArrayList<>();
            Cpos[x] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B[i];
            int c = C[i];
            if (Apos[a] == -1) {
                Apos[a] = i;
            }
            Bpos[b].add(i);
            Cpos[c].add(i);
        }

        for (int i = 0; i < N; i++) {
            if (active[i]) {
                countA[A[i]]++;
                countB[B[i]]++;
                countC[C[i]]++;
            }
        }

        Queue<Integer> queue = new ArrayDeque<>();

        for (int x = 1; x <= N; x++) {
            if (S[x]) {
                if (countA[x] == 0 || countB[x] == 0 || countC[x] == 0) {
                    queue.add(x);
                }
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();
            if (!S[x]) {
                continue;
            }
            S[x] = false;

            {
                int iA = Apos[x];
                if (iA != -1 && active[iA]) {
                    deactivate(iA, active, A, B, C, countA, countB, countC, S, queue);
                }
            }
            for (int iB : Bpos[x]) {
                if (active[iB]) {
                    deactivate(iB, active, A, B, C, countA, countB, countC, S, queue);
                }
            }
            for (int iC : Cpos[x]) {
                if (active[iC]) {
                    deactivate(iC, active, A, B, C, countA, countB, countC, S, queue);
                }
            }
        }

        int kept = 0;
        for (int i = 0; i < N; i++) {
            if (active[i]) {
                kept++;
            }
        }

        out.println(N - kept);

        out.close();
    }

    static void deactivate(int i,
                           boolean[] active,
                           int[] A,
                           int[] B,
                           int[] C,
                           int[] countA,
                           int[] countB,
                           int[] countC,
                           boolean[] S,
                           Queue<Integer> queue)
    {
        active[i] = false;
        int a = A[i];
        int b = B[i];
        int c = C[i];
        countA[a]--;
        countB[b]--;
        countC[c]--;

        if (S[a]) {
            if (countA[a] == 0 || countB[a] == 0 || countC[a] == 0) {
                queue.add(a);
            }
        }
        if (S[b]) {
            if (countA[b] == 0 || countB[b] == 0 || countC[b] == 0) {
                queue.add(b);
            }
        }
        if (S[c]) {
            if (countA[c] == 0 || countB[c] == 0 || countC[c] == 0) {
                queue.add(c);
            }
        }
    }
}


