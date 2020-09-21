package per.goweii.rxhttp.core.manager;

import retrofit2.Retrofit;

/**
 * 用于管理Retrofit实例
 * 子类继承后自行判断是否采用单例模式
 *
 * @author YZP
 */
public abstract class BaseClientManager {
    protected abstract Retrofit create();
}
