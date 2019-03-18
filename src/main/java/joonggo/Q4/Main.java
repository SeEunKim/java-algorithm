package joonggo.Q4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputStrings = br.readLine().split("");
        StringBuffer sb = new StringBuffer();

        int stringLength = inputStrings.length;

        for (int index = 0; index < stringLength / 2; index++) {
            sb.append(inputStrings[index]);
            sb.append(inputStrings[stringLength - 1 - index]);
        }

        if (stringLength % 2 == 1) {
            sb.append(inputStrings[(stringLength / 2)]);
        }

        bw.write(sb.toString());
        bw.newLine();
        bw.close();
        br.close();

    }
}
