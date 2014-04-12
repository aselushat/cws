package ru.cat;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.ui.ModelMap;

/**
 * Created by Xeks on 13.04.14.
 */
public class WebDispatchServletTest extends TestCase {
    @Test
    public void testTestHandleRequestView() throws Exception {
        HelloController controller = new HelloController();
        String s = controller.hello(new ModelMap());
        assertEquals("hello", s);
    }
}
