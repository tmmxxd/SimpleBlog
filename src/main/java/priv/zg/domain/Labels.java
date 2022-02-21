package priv.zg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 标签表
 *
 * @TableName labels
 */
@TableName(value = "labels")
@Data
public class Labels implements Serializable {
    /**
     * 标签ID
     */
    @TableId(value = "label_id", type = IdType.AUTO)
    private Long labelId;

    /**
     * 标签名称
     */
    @TableField(value = "label_name")
    private String labelName;

    /**
     * 标签别名
     */
    @TableField(value = "label_alias")
    private String labelAlias;

    /**
     * 标签描述
     */
    @TableField(value = "label_description")
    private String labelDescription;

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
        Labels other = (Labels) that;
        return (this.getLabelId() == null ? other.getLabelId() == null : this.getLabelId().equals(other.getLabelId()))
                && (this.getLabelName() == null ? other.getLabelName() == null : this.getLabelName().equals(other.getLabelName()))
                && (this.getLabelAlias() == null ? other.getLabelAlias() == null : this.getLabelAlias().equals(other.getLabelAlias()))
                && (this.getLabelDescription() == null ? other.getLabelDescription() == null : this.getLabelDescription().equals(other.getLabelDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLabelId() == null) ? 0 : getLabelId().hashCode());
        result = prime * result + ((getLabelName() == null) ? 0 : getLabelName().hashCode());
        result = prime * result + ((getLabelAlias() == null) ? 0 : getLabelAlias().hashCode());
        result = prime * result + ((getLabelDescription() == null) ? 0 : getLabelDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", labelId=").append(labelId);
        sb.append(", labelName=").append(labelName);
        sb.append(", labelAlias=").append(labelAlias);
        sb.append(", labelDescription=").append(labelDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}