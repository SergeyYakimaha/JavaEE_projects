package ex_001_filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName = "filter_third")
public class ThirdFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ThirdFilter filter");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        List<String> listFilters = (ArrayList<String>)servletRequest.getAttribute("filters");

        if (listFilters == null)
            listFilters = new ArrayList<String>();

        listFilters.add("ThirdFilter was used");

        servletRequest.setAttribute("filters", listFilters);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("destroy ThirdFilter filter");
    }
}
