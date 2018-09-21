package yj.spring.template.util;

import java.util.List;

/**
 * 分页实体类
 */
public class PageBean<T> {
    /** 行实体类 */
    private List<T> rows;
    /** 总条数 */
    private long total;

    public PageBean() {
        super();
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}