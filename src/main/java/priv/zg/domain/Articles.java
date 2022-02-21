package priv.zg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 博文表
 *
 * @TableName articles
 */
@TableName(value = "articles")
@Data
public class Articles implements Serializable {
    /**
     * 博文ID
     */
    @TableId(value = "article_id", type = IdType.AUTO)
    private Long articleId;

    /**
     * 发表用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 博文标题
     */
    @TableField(value = "article_title")
    private String articleTitle;

    /**
     * 博文内容
     */
    @TableField(value = "article_content")
    private String articleContent;

    /**
     * 浏览量
     */
    @TableField(value = "article_views")
    private Long articleViews;

    /**
     * 评论总数
     */
    @TableField(value = "article_comment_count")
    private Long articleCommentCount;

    /**
     * 发表时间
     */
    @TableField(value = "article_date")
    private Date articleDate;

    /**
     * 点赞数
     */
    @TableField(value = "article_like_count")
    private Long articleLikeCount;

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
        Articles other = (Articles) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
                && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()))
                && (this.getArticleViews() == null ? other.getArticleViews() == null : this.getArticleViews().equals(other.getArticleViews()))
                && (this.getArticleCommentCount() == null ? other.getArticleCommentCount() == null : this.getArticleCommentCount().equals(other.getArticleCommentCount()))
                && (this.getArticleDate() == null ? other.getArticleDate() == null : this.getArticleDate().equals(other.getArticleDate()))
                && (this.getArticleLikeCount() == null ? other.getArticleLikeCount() == null : this.getArticleLikeCount().equals(other.getArticleLikeCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        result = prime * result + ((getArticleViews() == null) ? 0 : getArticleViews().hashCode());
        result = prime * result + ((getArticleCommentCount() == null) ? 0 : getArticleCommentCount().hashCode());
        result = prime * result + ((getArticleDate() == null) ? 0 : getArticleDate().hashCode());
        result = prime * result + ((getArticleLikeCount() == null) ? 0 : getArticleLikeCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", userId=").append(userId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", articleViews=").append(articleViews);
        sb.append(", articleCommentCount=").append(articleCommentCount);
        sb.append(", articleDate=").append(articleDate);
        sb.append(", articleLikeCount=").append(articleLikeCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}