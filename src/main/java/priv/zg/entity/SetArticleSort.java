package priv.zg.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 文章设置分类表
 * </p>
 *
 * @author xm
 * @since 2022-02-17
 */
@TableName("set_article_sort")
public class SetArticleSort implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 分类ID
     */
    private Long sortId;


    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    @Override
    public String toString() {
        return "SetArticleSort{" +
        "articleId=" + articleId +
        ", sortId=" + sortId +
        "}";
    }
}
