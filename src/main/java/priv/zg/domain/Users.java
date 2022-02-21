package priv.zg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户表
 *
 * @TableName users
 */
@TableName(value = "users")
@Data
public class Users implements Serializable {
    /**
     * 用户ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户IP
     */
    @TableField(value = "user_ip")
    private String userIp;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 用户邮箱
     */
    @TableField(value = "user_email")
    private String userEmail;

    /**
     * 用户头像
     */
    @TableField(value = "user_profile_photo")
    private String userProfilePhoto;

    /**
     * 注册时间
     */
    @TableField(value = "user_registration_time")
    private Date userRegistrationTime;

    /**
     * 用户生日
     */
    @TableField(value = "user_birthday")
    private Date userBirthday;

    /**
     * 用户年龄
     */
    @TableField(value = "user_age")
    private Integer userAge;

    /**
     * 用户手机号
     */
    @TableField(value = "user_telephone_number")
    private Integer userTelephoneNumber;

    /**
     * 用户昵称
     */
    @TableField(value = "user_nickname")
    private String userNickname;

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
        Users other = (Users) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserIp() == null ? other.getUserIp() == null : this.getUserIp().equals(other.getUserIp()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
                && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
                && (this.getUserProfilePhoto() == null ? other.getUserProfilePhoto() == null : this.getUserProfilePhoto().equals(other.getUserProfilePhoto()))
                && (this.getUserRegistrationTime() == null ? other.getUserRegistrationTime() == null : this.getUserRegistrationTime().equals(other.getUserRegistrationTime()))
                && (this.getUserBirthday() == null ? other.getUserBirthday() == null : this.getUserBirthday().equals(other.getUserBirthday()))
                && (this.getUserAge() == null ? other.getUserAge() == null : this.getUserAge().equals(other.getUserAge()))
                && (this.getUserTelephoneNumber() == null ? other.getUserTelephoneNumber() == null : this.getUserTelephoneNumber().equals(other.getUserTelephoneNumber()))
                && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserIp() == null) ? 0 : getUserIp().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserProfilePhoto() == null) ? 0 : getUserProfilePhoto().hashCode());
        result = prime * result + ((getUserRegistrationTime() == null) ? 0 : getUserRegistrationTime().hashCode());
        result = prime * result + ((getUserBirthday() == null) ? 0 : getUserBirthday().hashCode());
        result = prime * result + ((getUserAge() == null) ? 0 : getUserAge().hashCode());
        result = prime * result + ((getUserTelephoneNumber() == null) ? 0 : getUserTelephoneNumber().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userIp=").append(userIp);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userProfilePhoto=").append(userProfilePhoto);
        sb.append(", userRegistrationTime=").append(userRegistrationTime);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userAge=").append(userAge);
        sb.append(", userTelephoneNumber=").append(userTelephoneNumber);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}