class LTCode003 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        
        int sign = 1, index = 0, result = 0;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index++) == '-' ? -1 : 1;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index++) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
        }

        return result * sign;
    }
}
