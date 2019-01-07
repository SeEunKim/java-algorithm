package programmers;

public class RepresentationOfNumbers12924 {
    public static void main(String[] args) {
        SolutionRepresentationOfNumbers s = new SolutionRepresentationOfNumbers();
        int result = s.solution(15);
        System.out.println(result);
    }
}
class SolutionRepresentationOfNumbers {
    public int solution(int n) {
        int half = (int)Math.ceil(n / 2.0);
        int sum = 0;
        int count = 0;

        for (int i = half; i > 0; i--) {
            int tmp = i;
            while (sum >= 0 && sum < n) {
                sum += tmp;
                if (sum == n) {
                    count++;
                    break;
                }
                tmp--;
            }
            sum = 0;
        }
        return count + 1;
    }
}