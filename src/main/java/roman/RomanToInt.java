package roman;

public class RomanToInt {
    public int romanToInt(String s) {
        int sum = 0;
        if (s.isBlank()) {
            return sum;
        }
        char curr = 0;
        char prev = 0;

        for (int i = 0; i < s.length(); i++) {
            prev = curr;
            curr = s.charAt(i);

            switch (curr) {
                case ('I'):
                    sum++;
                    break;
                case ('V'):
                    if (prev == 'I') {
                        sum += 3;
                    } else {
                        sum += 5;
                    }
                    break;
                case ('X'):
                    if (prev == 'I') {
                        sum+= 8;
                    } else {
                        sum += 10;
                    }
                    break;
                case ('L'):
                    if (prev == 'X') {
                        sum += 30;
                    } else {
                        sum += 50;
                    }
                    break;
                case ('C'):
                    if (prev == 'X') {
                        sum += 80;
                    } else {
                        sum += 100;
                    }
                    break;
                case ('D'):
                    if (prev == 'C') {
                        sum += 300;
                    } else {
                        sum += 500;
                    }
                    break;
                case ('M'):
                    if (prev == 'C') {
                        sum += 800;
                    } else {
                        sum += 1000;
                    }
                    break;
            }
        }

        return sum;
    }
}
