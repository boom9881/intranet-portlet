<%@ include file="/html/init.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	PortletURL randerURL = renderResponse.createRenderURL();

	randerURL.setWindowState(WindowState.MAXIMIZED);

	randerURL.setParameter("mvcPath","/html/satff/edit_satff.jsp");
	
	
	PortletURL portletURL = renderResponse.createRenderURL();

	portletURL.setWindowState(WindowState.MAXIMIZED);

	portletURL.setParameter("mvcPath","/html/satff/view.jsp");

	List headerNames = new ArrayList();

	headerNames.add("编号");

	headerNames.add("姓名");

	headerNames.add("离职时间");

	headerNames.add("入职时间");

	headerNames.add("");

	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null,SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL,headerNames, null);

	int total = SatffLocalServiceUtil.getSatffsCount();;

	searchContainer.setTotal(total);

	List results = SatffLocalServiceUtil.getSatffs(searchContainer.getStart(), searchContainer.getEnd());
	
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();

	for (int i = 0; i < results.size(); i++) {

		Satff satff = (Satff) results.get(i);

		ResultRow row = new ResultRow(satff,satff.getId(), i);

		PortletURL rowURL = renderResponse.createRenderURL();

		rowURL.setWindowState(WindowState.MAXIMIZED);

		rowURL.setParameter("mvcPath","/html/satff/action.jsp");

		rowURL.setParameter("id", String.valueOf(satff.getId()));

		row.addText(String.valueOf(satff.getId()), rowURL);

		row.addText(satff.getName(), rowURL);

		row.addText(sdf.format(satff.getTurnover_time()), rowURL);

		row.addText(sdf.format(satff.getEntry_time()), rowURL);

		//row.addJSP("left",SearchEntry.DEFAULT_VALIGN,"/html/satff/action.jsp");

		resultRows.add(row);

	}
%>

<form action="<%=randerURL.toString() %>" name="fm">
	<input type="submit" value="submit"/>
</form>

<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />