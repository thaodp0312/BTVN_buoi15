public class xehoi {

    String[] sosanh(String[] xe) {
        String temp;

        for (int i = 0; i < xe.length - 1; i++) {
            for (int j = i+1; j < xe.length; j++) {
                if (xe[i].compareTo(xe[j]) > 0) {
                    temp = xe[i];
                    xe[i] = xe[j];
                    xe[j] = temp;
                }
            }
        }
        return xe;
    }
}
