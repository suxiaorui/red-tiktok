package com.rui.utils;
import java.util.List;

/**
 * @Author suxiaorui
 * @Description 用来返回分页Grid的数据格式
 * @Date 2023/7/29 10:35
 * @Version 1.0
 */




public class PagedGridResult {

    private int page;			// 当前页数
    private long total;			// 总页数
    private long records;		// 总记录数
    private List<?> rows;		// 每行显示的内容

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public long getRecords() {
        return records;
    }
    public void setRecords(long records) {
        this.records = records;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}

