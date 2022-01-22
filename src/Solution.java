import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        List<Character> elems = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for(Character e: elems) {
                System.out.println(e);
            }
            System.out.println(elems.size());
            System.out.println("----------------");
            Character elem = s.charAt(i);
            switch (elem) {
                case '(':
                case '[':
                case '{':
                    elems.add(elem);
                    break;
                case ')':
                    if (!elems.contains('(')) {
                        return false;
                    } else if (elems.get(elems.size() - 1) != '(') {
                        return false;
                    }
                        elems.remove(elems.size() - 1);

                    break;
                case '}':
                    if (!elems.contains('{')) {
                        return false;
                    } else if (elems.get(elems.size() - 1) != '{') {
                        return false;
                    }
                    elems.remove(elems.size() - 1);
                    break;
                case ']':
                    if (!elems.contains('[')) {
                        return false;
                    } else if (elems.get(elems.size() - 1) != '[') {
                        return false;
                    }
                        elems.remove(elems.size() - 1);

                    break;
                default:
                    return false;
            }
        }
        for(Character e: elems) {
            System.out.println(e);
        }
        if (elems.isEmpty()) {
            return true;
        }
        return false;
    }
}