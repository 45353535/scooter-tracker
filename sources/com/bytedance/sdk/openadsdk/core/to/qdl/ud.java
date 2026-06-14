package com.bytedance.sdk.openadsdk.core.to.qdl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4240b4;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static volatile ud qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final ArrayList<String> f17489ud = new ArrayList<>();
    private final AtomicBoolean lnr = new AtomicBoolean(false);
    private long mml = System.currentTimeMillis();
    private long mzz = 0;
    private long mo = 0;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private String f17490wd = "";
    private String jpc = "";
    private String tvp = "";
    private boolean to = false;
    private boolean rq = false;

    public static ud qdl(Application application) {
        if (qdl == null) {
            synchronized (ud.class) {
                try {
                    if (qdl == null) {
                        ud udVar = new ud();
                        qdl = udVar;
                        udVar.to = qdl((Context) application);
                        qdl.rq = qdl(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        qdl.qdl();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public void ud(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f17489ud.contains(localClassName)) {
            this.f17489ud.remove(localClassName);
        }
        if (this.f17489ud.size() == 0) {
            this.mml = System.currentTimeMillis();
            this.lnr.set(true);
            this.jpc = localClassName;
        }
    }

    private static int qdl(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean qdl(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void qdl(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f17489ud.size() == 0) {
            this.f17490wd = localClassName;
            this.mzz = System.currentTimeMillis();
            this.mo = System.currentTimeMillis() - this.mml;
            this.lnr.set(false);
        }
        if (!this.f17489ud.contains(localClassName)) {
            this.f17489ud.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.tvp = localClassName;
    }

    private void qdl() {
        int size;
        boolean z10 = true;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(C4240b4.i.f42629h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objValueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.f17489ud.contains(localClassName)) {
                            this.f17489ud.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.lnr;
                if (this.f17489ud.size() > 0) {
                    z10 = false;
                }
                atomicBoolean.set(z10);
            }
        } catch (Throwable unused) {
        }
    }

    public String qdl(String str, long j10, int i10) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.mzz;
        long j12 = jCurrentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.lnr.get() && this.rq) {
            i11 |= 2;
        }
        if (!this.lnr.get() && this.mo >= 5000 && j11 < 1000) {
            i11 = this.jpc.equals(this.tvp) ? i11 | 4 : i11 | 8;
        }
        try {
            string = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.mo).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.lnr).put("alert", this.rq).put(NotificationCompat.CATEGORY_SYSTEM, this.to).put("actsize", this.f17489ud.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.ud.lnr()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.f17490wd = "";
        this.mo = 0L;
        this.mzz = 0L;
        this.mml = System.currentTimeMillis();
        return string;
    }
}
