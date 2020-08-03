import java.util.Objects;

public class App {
    public static void main(String[] args) {
        String[] strs =  {"aaa", "bduenpfafpa", "テスト", "あiうeお",""};
        String[] strs_for_book_method =  {"\\あ\\"};
        for (String str : strs) {
            System.out.printf("%sは、文字列に重複があるか：%s\n",
                                str, isCharDuplicated(str));
        }
        for (String str : strs_for_book_method) {
            System.out.printf("%sは、文字列に重複があるか：%s\n",
                                str, isUniqueChars(str));
        }
    }

    /* [自作の解答]
     * 文字列（引数）に重複する文字がある場合はtrue、ない場合はfalseを返す。
     *
     * 計算量は、O(N^2)。Nは文字列の長さ。
     * indexOfは、第一引数で与えられた文字に一致する文字があるかを調べるため、
     * N回のループで長さ(N-1), (N-2)...1の文字列に対して検索する（ループ一回毎に探索範囲が狭まる）。
     * 1からnまでの和の公式が"n(n+1)÷2"である事から、計算量はおおよそO(N^2)。
     */
    public static boolean isCharDuplicated(String str) {
        if(Objects.isNull(str)) {
            return false;
        }

        if(str.equals("")) {
            return false;
        }

        String[] split = str.split("");

        for (int i=0; i< split.length; i++) {
            int index = str.indexOf(split[i], i+1);
            if (index != -1) {
                return true;
            }
        }
        return false;
    }

    /* [書籍の解答]
     * 文字列（引数）に重複する文字がある場合はfalse、ない場合はtrueを返す。
     *  自作回答isCharDuplicated()とは、結果が逆転している。
     *
     * 文字コードがASCII（128文字）である事を前提にしている。
     * つまり、日本語は非対応。ASCII文字は、"$ man ascii"で確認できる。
     * ASCII文字は、1文字を7ビットで表し、十進数で0〜127で表す。
     *
     * 計算量は、文字セットサイズをcとするとO(c)。
     * 計算量が少ないが、機能制約がある。
     */
    public static boolean isUniqueChars(String str) {
        // 書籍には存在しないコード。NULLはfalseとして扱う。
        if(Objects.isNull(str)) {
            return false;
        }

        if(str.length() > 128) {
            return false;
        }

        // 書籍には存在しないコード。ASCII以外の文字列はfalseとして扱う。
        if (str.matches("^.*[^\\p{ASCII}].*")) {
            return false;
        }

        boolean[] cahr_set = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if(cahr_set[val]) {
                /* この文字は既に文字列に登場している（配列に存在する） */
                return  false;
            }
            cahr_set[val] = true;
        }
        return true;
    }
}