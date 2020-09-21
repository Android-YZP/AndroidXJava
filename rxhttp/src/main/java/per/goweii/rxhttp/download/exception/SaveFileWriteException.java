package per.goweii.rxhttp.download.exception;

/**
 * @author YZP
 *
 */
public class SaveFileWriteException extends RuntimeException {
    public SaveFileWriteException() {
        super("下载保存的文件写入失败");
    }
}
