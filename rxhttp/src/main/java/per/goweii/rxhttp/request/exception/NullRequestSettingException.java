package per.goweii.rxhttp.request.exception;

/**
 * @author YZP
 *
 */
public class NullRequestSettingException extends RuntimeException {
    public NullRequestSettingException() {
        super("RequestSetting未设置");
    }
}
