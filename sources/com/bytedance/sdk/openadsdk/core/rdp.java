package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class rdp {
    public static long mzz;
    public static volatile boolean qdl;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private static volatile HandlerThread f17418wd;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static AtomicBoolean f17417ud = new AtomicBoolean(false);
    public static long lnr = 0;
    private static volatile int mo = 0;
    public static float mml = 1.0f;
    private static volatile Handler jpc = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.rdp.1
            boolean qdl = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.qdl) {
                    return;
                }
                this.qdl = true;
                super.start();
            }
        };
        f17418wd = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.jpc.qdl(f17418wd);
        mzz = System.currentTimeMillis();
    }

    public static void jpc() {
        ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rdp.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.rdp.4.1
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                            qdlVar.ud("init");
                            return qdlVar;
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.aaj.lnr("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static Handler lnr() {
        return new Handler(Looper.getMainLooper());
    }

    public static int mml() {
        return mo;
    }

    public static void mo() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lnr <= 10000) {
            return;
        }
        lnr = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.fco.qdl(new com.bytedance.sdk.component.jpc.jpc("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.rdp.2
            @Override // java.lang.Runnable
            public void run() {
                String strUd = com.bytedance.sdk.openadsdk.core.settings.rq.ud(yt.qdl());
                if (TextUtils.equals(strUd, com.bytedance.sdk.openadsdk.core.settings.rq.mml)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(6, true);
                com.bytedance.sdk.openadsdk.core.settings.rq.mml = strUd;
            }
        });
    }

    public static boolean mzz() {
        return mml() == 1;
    }

    public static void qdl(long j10) {
        mzz = j10;
    }

    public static Handler ud() {
        if (f17418wd == null || !f17418wd.isAlive()) {
            synchronized (rdp.class) {
                try {
                    if (f17418wd == null || !f17418wd.isAlive()) {
                        f17418wd = com.bytedance.sdk.component.utils.jpc.qdl("csj_init_handle", -1);
                        jpc = new Handler(f17418wd.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (jpc == null) {
            synchronized (rdp.class) {
                try {
                    if (jpc == null) {
                        jpc = new Handler(f17418wd.getLooper());
                    }
                } finally {
                }
            }
        }
        return jpc;
    }

    public static void wd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lnr <= 10000) {
            return;
        }
        synchronized (rdp.class) {
            try {
                if (jElapsedRealtime - lnr <= 10000) {
                    return;
                }
                lnr = jElapsedRealtime;
                com.bytedance.sdk.component.utils.tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rdp.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String strUd = com.bytedance.sdk.openadsdk.core.settings.rq.ud(yt.qdl());
                        if (TextUtils.equals(strUd, com.bytedance.sdk.openadsdk.core.settings.rq.mml)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.rq.mml = strUd;
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static long qdl() {
        return mzz;
    }

    public static void qdl(int i10) {
        mo = i10;
    }

    public static void qdl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    tvp.ud().ud(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("InitHelper", th2.getMessage());
        }
    }
}
