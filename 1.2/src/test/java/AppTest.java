/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        /* [テスト観点]
         * 1. 片方の引数がnull
         * 2. null比較
         * 3. 英字でのアナグラム
         * 4. 空文字の比較
         * 5. 記号のアナグラム
         */
        assertFalse(App.isAnagram(null, "test"));
        assertFalse(App.isAnagram(null, null));
        assertTrue(App.isAnagram("test", "tset"));
        assertTrue(App.isAnagram("", ""));
        assertTrue(App.isAnagram("+*}", "}*+"));
        /* [テスト観点]
         * 6. アナグラム可能だが、余分な文字が存在
         * 7. 数値でのアナグラム
         * 8. 記号のアナグラムではない
         * 9. 日本語のアナグラム
         * 10. 日本語のアナグラムではない
         */
        assertFalse(App.isAnagram("tsetp", "test"));
        assertTrue(App.isAnagram("123456789", "987654321"));
        assertFalse(App.isAnagram("[]:", "@[]"));
        assertTrue(App.isAnagram("あいうえお", "うえおいあ"));
        assertFalse(App.isAnagram("あいうえお", "かきくけこ"));
        /* [テスト観点]
         * 11. 英字、記号、日本語のアナグラム
         */
        assertTrue(App.isAnagram("あ*a", "a*あ"));
    }
}