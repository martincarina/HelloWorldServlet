package ru.academits.martin.helloworldservlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getOutputStream().write("Hello from HelloWorldServlet".getBytes(Charset.forName("UTF-8")));
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }
}
