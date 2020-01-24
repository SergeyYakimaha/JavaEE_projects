package ex_001_filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter (filterName = "filter_first",
        urlPatterns = {"/home"},
        initParams = {
        @WebInitParam(name = "web_param_1", value = "111"),
        @WebInitParam(name = "web_param_2", value = "222")
})
public class FirstFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init FirstFilter filter");
//        Enumeration<String> params = filterConfig.getInitParameterNames();
//
//        while (params.hasMoreElements()) {
//            String element = params.nextElement();
//            System.out.println(element + " " + filterConfig.getInitParameter(element));
//        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter FirstFilter filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("destroy FirstFilter filter");
    }
}
