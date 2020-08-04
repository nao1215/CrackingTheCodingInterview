/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testReplaceSpace() {
        /* [テスト観点]
         * 1. null
         * 2. 空文字
         * 3. 空白5個
         * 4. 文字列の先頭、中間、末尾が空白（英字と記号のみ）
         * 5. 文字列の先頭、中間、末尾が空白（日本語を含む場合）
         * 6. ２バイトの空白の場合
         */
        assertEquals(null, App.replaceSpace(null, 0));
        assertEquals("", App.replaceSpace("", 0));
        assertEquals("%20%20%20%20%20", App.replaceSpace("     ", 5));
        assertEquals("%20White%20Space!%20", App.replaceSpace(" White Space! ", 14));
        assertEquals("%20ナ%20オ%20", App.replaceSpace(" ナ オ ", 5));
        assertEquals("　", App.replaceSpace("　", 1));
    }
}
