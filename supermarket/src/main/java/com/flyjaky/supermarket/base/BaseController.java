package com.flyjaky.supermarket.base;

import javax.servlet.http.HttpServletRequest;

import com.flyjaky.supermarket.common.page.PageParameter;

public class BaseController {

	
	public PageParameter initPage(HttpServletRequest request){
		Integer pageNow=1;
		String currentPage=request.getParameter("currentPage");
		
		if(null != currentPage && currentPage.length()>0){
			pageNow=Integer.parseInt(currentPage);
		}
		
		Integer pageSize=request.getParameter("pageSize") == null ? null : Integer.parseInt(request.getParameter("pageSize"));
		
		PageParameter page=new PageParameter();
		if(pageSize  != null){
			page.setPageSize(pageSize);
		}else{
			page.setPageSize(PageParameter.DEFAULT_PAGE_SIZE);
		}
		
		page.setCurrentPage(pageNow);
		
		return page;
		
	}
	
	
	
}
