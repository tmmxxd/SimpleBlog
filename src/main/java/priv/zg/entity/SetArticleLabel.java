package priv.zg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 文章设置标签表
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@TableName("set_article_label")
public class SetArticleLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    @TableId(value = "article_id", type = IdType.AUTO)
    private Long articleId;

    /**
     * 标签ID
     */
    private Long labelId;


    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    @Override
    public String toString() {
        return "SetArticleLabel{" +
        "articleId=" + articleId +
        ", labelId=" + labelId +
        "}";
    }
}
