package org.hades.wonder.framework.utils;

/**
* 创建时间 2017/9/22
* author Hades
* 描述: app在后台因内存被回收，会导致全局静态变量失效，该类用来控制重启app
 * 需要在启动时配置正常启动状态
**/
public class AppStatusManager {

    /**
    * 创建时间 2017/9/22
    * author Hades
    * 描述 appStatus when recycled it turns to -1 [AppStatusConstant.STATUS_FORCE_KILLED]
    **/
    private int appStatus = -1;
    private static AppStatusManager appStatusManager;

    private AppStatusManager() {
    }

    public static AppStatusManager getInstance() {
        if(appStatusManager == null) {
            appStatusManager = new AppStatusManager();
        }

        return appStatusManager;
    }

    public int getAppStatus() {
        return this.appStatus;
    }

    /**
    * 创建时间 2017/9/22
    * author Hades
    * 描述 需要在启动页配置正常启动状态
     * @param appStatus  AppStatusConstant.STATUS_NORMAL
    **/
    public void setAppStatus(int appStatus) {
        this.appStatus = appStatus;
    }
}
