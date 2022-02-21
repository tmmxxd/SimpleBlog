package priv.zg.entity;

import java.io.Serializable;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
public class Sorts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    private Long sortId;

    /**
     * 分类名称
     */
    private String sortName;

    /**
     * 分类别名
     */
    private String sortAlias;

    /**
     * 分类描述
     */
    private String sortDescription;

    /**
     * 父分类ID
     */
    private Long parentSortId;


    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortAlias() {
        return sortAlias;
    }

    public void setSortAlias(String sortAlias) {
        this.sortAlias = sortAlias;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    public Long getParentSortId() {
        return parentSortId;
    }

    public void setParentSortId(Long parentSortId) {
        this.parentSortId = parentSortId;
    }

    @Override
    public String toString() {
        return "Sorts{" +
        "sortId=" + sortId +
        ", sortName=" + sortName +
        ", sortAlias=" + sortAlias +
        ", sortDescription=" + sortDescription +
        ", parentSortId=" + parentSortId +
        "}";
    }
}
