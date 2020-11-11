<%-- 
    Document   : _hitcounter
    Created on : Nov 9, 2020, 1:29:24 AM
    Author     : Rex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--<div class="hit-counter">
    <a href="https://www.hitwebcounter.com" target="_blank">
        <img src="https://hitwebcounter.com/counter/counter.php?page=7707184&style=0001&nbdigits=5&type=page&initCount=0" title="Total Website Hits" Alt="Web Hits"   border="0" />
    </a>                                    
</div>-->

<div class="hit-counter" style="display: block;">
    <%
        Integer homeCount = (Integer) application.getAttribute("homeCounts");
        if (homeCount == null || homeCount == 0) {
            homeCount = 1;
        } else {
            homeCount += 1;
        }
        application.setAttribute("homeCounts", homeCount);
    %>
    <p style="margin: 0;">
        <%
            int size = 5;
            int countSize = homeCount.toString().length();
            for (int i = 0; i < size - countSize; i++) {
                out.print("<span class=\"hit-counter-number font-weight-bolder\">0</span>");
            }
            for (int i = 0; i < countSize; i++) {
                out.print("<span class=\"hit-counter-number font-weight-bolder\">" + homeCount.toString().charAt(i) + "</span>");
            }
        %> 
    </p>
</div>