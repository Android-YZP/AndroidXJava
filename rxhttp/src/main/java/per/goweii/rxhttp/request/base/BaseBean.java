package per.goweii.rxhttp.request.base;

import com.google.gson.Gson;

import java.io.Serializable;

import per.goweii.rxhttp.request.utils.JsonFormatUtils;

/**
 * 描述：网络请求的实体类基类
 *
 * @author YZP
 */
public class BaseBean implements Serializable {

    public String toJson() {
        return new Gson().toJson(this);
    }

    public String toFormatJson() {
        return JsonFormatUtils.format(toJson());
    }
}