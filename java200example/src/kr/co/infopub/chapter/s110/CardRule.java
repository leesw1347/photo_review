package kr.co.infopub.chapter.s110;

public class CardRule {
    public int toV(Card c) {
        int count = 0;
        switch (c.getCardVal().charAt(1)) {
            case 'A' -> count = 1;
            case 'T' -> count = 10;
            default -> count = c.getCardVal().charAt(1) - '0';
        }
        return count;
    }

    // 광SUIT C
    public boolean isLight(Card c) { // 광 모든 SUIT가 C
        boolean isL = false;
        if (c.getCardVal().charAt(0) == 'C') {
            isL = true;
        }
        return isL;
    }

    // 광 (C) 이면서 Value가 1,3,8 -> C1, C3, C8
    private boolean is138(Card c) {
        boolean isC = false;
        if (isLight(c)) { // 'C'를 Light라고 한다
            isC = true ? (c.getCardVal().charAt(1) == '3' || c.getCardVal().charAt(1) == '8' || c.getCardVal().charAt(1) == '1') : false;
//            if ((c.getCardVal().charAt(1) == '3') ||
//                    (c.getCardVal().charAt(1) == '8') ||
//                    (c.getCardVal().charAt(1) == '1')) {
//                isC = true;
//            }
        }
        return isC;
    }

    // 이차원 방정식을 이용 : 더해서 11, 곱해서 24 -> 3,8
    public int rule(Card c1, Card c2) {
        int count = 0;
        if (is138(c1) && is138(c2)) { // C1, C3, C8은 광
            // 광처리 1,3,8
            if ((toV(c1) * toV(c2) == 24) && (toV(c1) + toV(c2) == 11)) { // 3 8 (38광땡),
                count = 3000;
            } else if ((toV(c1) * toV(c2) == 3) && (toV(c1) + toV(c2) == 4)) { // 1 3 (13광땡)
                count = 2000;
            } else if ((toV(c1) * toV(c2) == 8) && (toV(c1) + toV(c2) == 9)) {  // 1 8 (18광땡)
                count = 2000;
            }
        } else { // C1,C3,C8이 아닐경우 여기로 들어온다
            // 땡처리
            if ((toV(c1) == toV(c2))) { // 10,10 -> 1000
                // Card의 value 값이 같으면 * 100을 한다
                count = toV(c1) * 100;
            } else {
                // 낫땡
                if ((toV(c1) * toV(c2) == 2) && (toV(c1) * toV(c2) == 3)) { // 1 2
                    count = 99;
                } else if ((toV(c1) * toV(c2) == 4) && (toV(c1) * toV(c2) == 5)) { // 1 2
                    count = 98;
                } else if ((toV(c1) * toV(c2) == 9) && (toV(c1) * toV(c2) == 10)) { // 1 2
                    count = 97;
                } else if ((toV(c1) * toV(c2) == 10) && (toV(c1) * toV(c2) == 11)) { // 1 2
                    count = 96;
                } else if ((toV(c1) * toV(c2) == 40) && (toV(c1) * toV(c2) == 14)) { // 1 2
                    count = 95;
                } else if ((toV(c1) * toV(c2) == 24) && (toV(c1) * toV(c2) == 10)) { // 1 2
                    count = 94;
                } else { // 끗
                    count = ((toV(c1) + toV(c2) % 10) * 10);
                }
            }
        }
        return count;
    }
}
