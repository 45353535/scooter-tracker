package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class yt {
    private static int lnr = -1;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile oth<com.bytedance.sdk.openadsdk.mml.qdl> f17588ud;

    private static class qdl {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application qdl;

        static {
            try {
                Object objUd = ud();
                qdl = (Application) objUd.getClass().getMethod("getApplication", null).invoke(objUd, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.qdl("MyApplication", "application get failed", th2);
            }
        }

        @Nullable
        public static Application qdl() {
            return qdl;
        }

        private static Object ud() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.qdl("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th2);
                return null;
            }
        }
    }

    public static oth<com.bytedance.sdk.openadsdk.mml.qdl> lnr() {
        if (f17588ud == null) {
            synchronized (yt.class) {
                try {
                    if (f17588ud == null) {
                        f17588ud = new ljh(qdl);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17588ud;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.rq mml() {
        return com.bytedance.sdk.openadsdk.core.settings.rq.lnr();
    }

    public static com.bytedance.sdk.openadsdk.bjy.lnr.lnr mzz() {
        return !com.bytedance.sdk.openadsdk.core.settings.wd.qdl() ? com.bytedance.sdk.openadsdk.bjy.lnr.mml.qdl() : com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl();
    }

    public static Context qdl() {
        if (qdl == null) {
            ud(null);
        }
        return qdl;
    }

    public static void ud(Context context) {
        if (qdl == null) {
            synchronized (yt.class) {
                try {
                    if (qdl == null) {
                        if (context != null) {
                            qdl = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                qdl = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationQdl = qdl.qdl();
                            if (applicationQdl != null) {
                                qdl = applicationQdl;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Context qdl(Context context) {
        if (context == null) {
            context = qdl();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int ud() {
        Context contextQdl;
        if (lnr < 0 && (contextQdl = qdl()) != null) {
            lnr = ViewConfiguration.get(contextQdl).getScaledTouchSlop();
        }
        return lnr;
    }
}
