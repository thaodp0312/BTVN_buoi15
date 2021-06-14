public class chuanhoa {
    String[] chuanhoaten(String[] ten) {
        for (int i = 0; i < ten.length; i++) {
            ten[i] = chuanhoaten2(ten[i]);
        }
        return ten;
    }

    String chuanhoaten2(String str) {
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        String[] mang = str.split("\\s");
        StringBuilder[] mang2 = new StringBuilder[str.length()];
        StringBuilder xau = new StringBuilder();
        for (int i = 0; i < mang.length; i++) {
            mang2[i] = new StringBuilder(mang[i]);
            mang2[i] = mang2[i].replace(0, 1, Character.toString(mang[i].charAt(0)).toUpperCase());
            xau = xau.append(mang2[i]).append(" ");
        }
        return (xau.toString().trim());
    }

}


