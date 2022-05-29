package Exercise;

import java.util.*;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> users = new LinkedHashMap<>();
        while (!line.equals("Lumpawaroo")) {

            if (line.contains("|")) {
                String[] data = line.split("\\s+\\|\\s+");
                String side = data[0];
                String member = data[1];
                users.putIfAbsent(side, new ArrayList<>());

                boolean noneMatch = users.entrySet()
                        .stream().noneMatch(entry -> entry.getValue().contains(member));

                if (noneMatch) {
                    users.get(side).add(member);
                }


            } else if (line.contains("->")) {
                String[] data = line.split("\\s+->\\s+");
                String side = data[1];
                String member = data[0];
                users.forEach((k, v) -> v.remove(member));
                users.putIfAbsent(side, new ArrayList<>());
                users.get(side).add(member);

                System.out.printf("%s joins the %s side!%n",member,side);

            }


            line = scanner.nextLine();
        }


        for (Map.Entry<String, List<String>> entry : users.entrySet()) {
            if (entry.getValue().size()!=0){
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            }
            for (String s : entry.getValue()) {
                System.out.printf("! %s%n", s);

            }

        }

    }
}