package ru.cat;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Xeks on 13.04.14.
 */
public class WebDispatchServletTest extends TestCase {
    @Test
    public void testTestHandleRequestView() throws Exception {
        WebDispatchServlet controller = new WebDispatchServlet();
        String s = controller.hello(new ModelMap());
        assertEquals("hello", s);
    }
}
