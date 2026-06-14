package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f62147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f62148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f62149c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f62150d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f62148b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static PglSSManager getInstance() {
        return f62147a;
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f62114b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f62147a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f62147a == null) {
                        f62147a = new PglSSManager(context, pglSSConfig);
                        if (b.d() == 0) {
                            f62147a.f62150d = pglSSConfig.getCallBack();
                            f62147a.f62148b.a(pglSSConfig.getCustomInfo());
                            f62147a.f62148b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f62147a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f62148b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f62148b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f62150d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f62148b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f62148b.a(str);
            int i10 = this.f62149c;
            b bVar = this.f62148b;
            if (i10 % bVar.f62131p == 0) {
                bVar.a(str, map);
            }
            this.f62149c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f62148b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f62148b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f62148b.d(str);
        }
    }
}
