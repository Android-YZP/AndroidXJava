package per.goweii.rxhttp.download.exception;

/**
 * @author YZP
 *
 */
public class RangeLengthIsZeroException extends RuntimeException {
    public RangeLengthIsZeroException() {
        super("断点处请求长度为0");
    }
}
