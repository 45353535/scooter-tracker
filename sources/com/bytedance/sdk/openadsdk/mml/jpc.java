package com.bytedance.sdk.openadsdk.mml;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.aaj;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jpc {
    private static Method lnr;
    private static Method mml;
    private static boolean mzz;
    private static Method qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static Class<?> f17665ud;

    static {
        ud();
    }

    private static boolean lnr() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("s_i_e", 0) == 1;
    }

    public static JSONObject qdl() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i10 = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i10 >= 35 && lnr()) {
            ud();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.yt.qdl().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = qdl) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i10 >= 36 && obj != null && (method3 = lnr) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                        }
                        if (obj != null && (method2 = mml) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th2) {
                    th = th2;
                    jSONObject = jSONObject2;
                    aaj.lnr(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return jSONObject;
    }

    private static void ud() {
        int i10;
        if (mzz || (i10 = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (lnr()) {
                qdl = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                f17665ud = cls;
                mml = cls.getMethod("getReason", null);
                if (i10 >= 36) {
                    lnr = f17665ud.getMethod("getStartComponent", null);
                }
                mzz = true;
            }
        } catch (Throwable th2) {
            aaj.lnr(th2.getMessage(), new Object[0]);
        }
    }
}
