package ex_001_filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter(filterName = "filter_current", urlPatterns = "/home")
public class CurrentFilter implements Filter {

    private boolean status;

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init CurrentFilter filter");
//        status = Boolean.parseBoolean(filterConfig.getInitParameter("status"));
//        Enumeration<String> params = filterConfig.getInitParameterNames();
//
//        while (params.hasMoreElements()) {
//            String element = params.nextElement();
//            System.out.println(element + " " + filterConfig.getInitParameter(element));
//        }
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        request.setAttribute("status", status);
        System.out.println("doFilter CurrentFilter filter");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }

}
