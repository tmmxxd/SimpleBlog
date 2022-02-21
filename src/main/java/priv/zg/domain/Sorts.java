package priv.zg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 分类表
 *
 * @TableName sorts
 */
@TableName(value = "sorts")
@Data
public class Sorts implements Serializable {
    /**
     * 分类ID
     */
    @TableId(value = "sort_id")
    private Long sortId;

    /**
     * 分类名称
     */
    @TableField(value = "sort_name")
    private String sortName;

    /**
     * 分类别名
     */
    @TableField(value = "sort_alias")
    private String sortAlias;

    /**
     * 分类描述
     */
    @TableField(value = "sort_description")
    private String sortDescription;

    /**
     * 父分类ID
     */
    @TableField(value = "parent_sort_id")
    private Long parentSortId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Sorts other = (Sorts) that;
        return (this.getSortId() == null ? other.getSortId() == null : this.getSortId().equals(other.getSortId()))
                && (this.getSortName() == null ? other.getSortName() == null : this.getSortName().equals(other.getSortName()))
                && (this.getSortAlias() == null ? other.getSortAlias() == null : this.getSortAlias().equals(other.getSortAlias()))
                && (this.getSortDescription() == null ? other.getSortDescription() == null : this.getSortDescription().equals(other.getSortDescription()))
                && (this.getParentSortId() == null ? other.getParentSortId() == null : this.getParentSortId().equals(other.getParentSortId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSortId() == null) ? 0 : getSortId().hashCode());
        result = prime * result + ((getSortName() == null) ? 0 : getSortName().hashCode());
        result = prime * result + ((getSortAlias() == null) ? 0 : getSortAlias().hashCode());
        result = prime * result + ((getSortDescription() == null) ? 0 : getSortDescription().hashCode());
        result = prime * result + ((getParentSortId() == null) ? 0 : getParentSortId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sortId=").append(sortId);
        sb.append(", sortName=").append(sortName);
        sb.append(", sortAlias=").append(sortAlias);
        sb.append(", sortDescription=").append(sortDescription);
        sb.append(", parentSortId=").append(parentSortId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}