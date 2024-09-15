package org.example.TinkoffCotext;

import java.util.*;
public class Task5TBank {
    public static int parseTime(String time) {
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int ss = Integer.parseInt(parts[2]);
        return hh * 3600 + mm * 60 + ss;
    }
    public static int calculatePenalty(int requestTime, int startTime) {
        int penalty = requestTime - startTime;
        if (penalty < 0) {
            penalty += 24 * 3600;
        }
        return penalty / 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startTime = parseTime(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, TeamResult> teams = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            String[] parts = line.split("\"", 3);
            String teamName = parts[1];
            String[] otherParts = parts[2].trim().split("\\s+");
            int requestTime = parseTime(otherParts[0]);
            String result = otherParts[2];

            teams.putIfAbsent(teamName, new TeamResult(teamName));

            TeamResult team = teams.get(teamName);

            if (result.equals("FORBIDEN") || result.equals("DENIED")) {
                team.denied++;
            }

            if (result.equals("ACCESSED")) {
                team.accessed++;
                team.penaltyTime += calculatePenalty(requestTime, startTime) + team.denied * 20;
            }
        }

        List<TeamResult> results = new ArrayList<>(teams.values());
        results.sort((a, b) -> {
            if (a.accessed != b.accessed) {
                return Integer.compare(b.accessed, a.accessed);
            }
            if (a.penaltyTime != b.penaltyTime) {
                return Integer.compare(a.penaltyTime, b.penaltyTime);
            }
            return a.name.compareTo(b.name);
        });

        int rank = 1;
        for (int i = 0; i < results.size(); i++) {
            TeamResult team = results.get(i);

            if (i > 0 && (results.get(i - 1).accessed != team.accessed || results.get(i - 1).penaltyTime != team.penaltyTime)) {
                rank = i + 1;
            }
            System.out.printf("%d \"%s\" %d %d\n", rank, team.name, team.accessed, team.penaltyTime);
        }

        scanner.close();
    }
}
class TeamResult {
    String name;
    int accessed;
    int penaltyTime;
    int denied;

    public TeamResult(String name) {
        this.name = name;
        this.accessed = 0;
        this.penaltyTime = 0;
        this.denied = 0;
    }
}