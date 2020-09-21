package per.goweii.rxhttp.core.utils;

/**
 * 描述：检查BaseUrl是否以"/"结尾
 *
 * @author YZP
 *
 */
public class BaseUrlUtils {

    public static String checkBaseUrl(String url) {
        if (url.endsWith("/")) {
            return url;
        } else {
            return url + "/";
        }
    }
}
