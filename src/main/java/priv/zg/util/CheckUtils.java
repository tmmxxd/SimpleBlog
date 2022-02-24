package priv.zg.util;

/**
 * 校验工具类
 *
 * @author tsz
 * @date 2022-02-24
 */
public class CheckUtils {

    /**
     * 判断分页数据是否正确
     */
    public static boolean checkPage(Integer page, Integer pageSize) {
        return page != null && pageSize != null && page > 0 && pageSize > 0;
    }
}
