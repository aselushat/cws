package ru.cat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Xeks on 06.04.14.
 */
public class WebDispatchServlet  extends HttpServlet{

        public WebDispatchServlet(){

        }

        @Override
        public void init() throws ServletException {
            super.init();
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            process(req, resp);
        }
        private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setStatus(200);
            response.getWriter().write("Hello am Servlet11q1");
        }
}
