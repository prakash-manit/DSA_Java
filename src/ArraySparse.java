import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class ArraySparse {
        public static void main(String[] args) throws Exception {
            Driver();
        }
        
        public static void Driver() {
            var scanner = new Scanner(System.in);

            int stringListCount = Integer.parseInt(scanner.nextLine().trim());
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < stringListCount; i++) {
                String stringListItem = scanner.nextLine();
                stringList.add(stringListItem);
            }

            int queriesCount = Integer.parseInt(scanner.nextLine().trim());
            List<String> queries = new ArrayList<>();
            for (int i = 0; i < queriesCount; i++) {
                String queriesItem = scanner.nextLine();
                queries.add(queriesItem);
            }

            List<Integer> res = matchingStrings(stringList, queries);
            System.out.println(String.join("\n", res.stream().map(Object::toString).toArray(String[]::new)));
            scanner.close();
        }

        private static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
            List<Integer> res = new ArrayList<>();
            for (String query : queries) {
                int count = 0;
                for (String str : stringList) {
                    if (query.equals(str)) {
                        count++;
                    }
                }
                res.add(count);
            }
            return res;
        }
    }