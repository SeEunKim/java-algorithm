package kakaocodingtest.problem8071;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution("01012345678"); // 2
        System.out.println("1 + " + result);
        result = s.solution("010-1212-333"); // -1
        System.out.println("2 + " + result);
        result = s.solution("+82-10-3434-2323"); // 3
        System.out.println("3 + " + result);
        result = s.solution("+82-010-3434-2323"); // -1
        System.out.println("4 + " + result);
        result = s.solution("010-3434-2323"); // 1
        System.out.println("5 + " + result);
    }
}

class Solution{
    public int solution(String phone_number) {
        int answer = -1;

        int length = phone_number.length();

        if (length < 11 | length > 17) {
            answer = -1;
        }

        if ((length == 11) && (phone_number.matches("^[0-9]*$"))) {
            answer = 2;
        }

        if (length == 13) {
            String[] strings = phone_number.split("-");
            if ((strings[0].length() == 3) && (strings[1].length() == 4) && (strings[2]).length() == 4) {
                phone_number = phone_number.replace("-", "");

                if (phone_number.matches("^[0-9]*$")) {
                    answer = 1;
                } else {
                    answer = -1;
                }
            }
        }

        if (length == 16) {
            String[] strings = phone_number.split("-");

            if ((strings[0].length() == 3) && (strings[1].length() == 2) && (strings[2].length() == 4) && (strings[3].length() == 4)) {
                if (strings[0].startsWith("+")) {
                    String tmp = phone_number.replace("-", "");
                    tmp = tmp.replace("+", "");

                    if (tmp.matches("^[0-9]*$")) {
                        answer = 3;
                    }
                }
            }
        }
        return answer;
    }
}
