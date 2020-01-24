package ex_001_filter;

import javax.servlet.*;
import java.io.IOException;

public class ThirdFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ThirdFilter filter");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter ThirdFilter filter");
    }

    public void destroy() {
        System.out.println("destroy ThirdFilter filter");
    }
}
