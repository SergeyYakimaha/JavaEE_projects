package ex_001_filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebFilter(//urlPatterns = {"/home"},
        filterName = "filter_second",
        initParams = {
        @WebInitParam(name = "SecondFilter_web_param", value = "3333"),
})
public class SecondFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init SecondFilter filter");

//        Enumeration<String> params = filterConfig.getInitParameterNames();
//
//        while (params.hasMoreElements()) {
//            String element = params.nextElement();
//            System.out.println(element + " " + filterConfig.getInitParameter(element));
//        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        List<String> listFilters = (ArrayList<String>)servletRequest.getAttribute("filters");

        if (listFilters == null)
            listFilters = new ArrayList<String>();

        listFilters.add("SecondFilter was used");

        servletRequest.setAttribute("filters", listFilters);

        //filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
