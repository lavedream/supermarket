package com.flyjaky.supermarket.common.page;

/**
 * 分页参数类
 * 
 */
public class PageParameter {

    public static final int DEFAULT_PAGE_SIZE = 20;

    private int pageSize;
    private int currentPage;
    private int prePage;
    private int nextPage;
    private int totalPage;
    private int totalCount;

    public PageParameter() {
        this.currentPage = 1;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    /**
     * 
     * @param currentPage
     * @param pageSize
     */
    public PageParameter(int currentPage, int pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getTotalPage() {
        return this.getTotalCount()%this.pageSize > 0?  this.getTotalCount()/this.pageSize +1: this.getTotalCount()/this.pageSize;
    }

    public void setTotalPage(int totalPage) {
    	if(currentPage>totalPage){
    		this.currentPage = (totalPage==0?1:totalPage);
    	}
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    
    //开始位置，结束位置
	public int getStartPos() {
		return Math.max(0, (currentPage-1) * pageSize);
	}

	public int getEndPos() {
		return Math.min(totalCount, getStartPos() + pageSize);
	}

    
    
    
    
}
