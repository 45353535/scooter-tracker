package com.taurusx.tax.g;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.taurusx.tax.log.LogUtil;
import java.lang.Thread;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class a0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static a0 f66083y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f66084w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f66085z = Thread.getDefaultUncaughtExceptionHandler();

    private void z(Throwable th2, Thread thread) {
        String strY;
        String strW = "";
        if (th2 != null) {
            String str = thread.getName() + " java.lang.RuntimeException: " + th2.getMessage();
            Throwable cause = th2.getCause();
            boolean zEquals = false;
            if (cause != null) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    str = str + "\n at: " + stackTraceElement.toString();
                }
            } else {
                for (StackTraceElement stackTraceElement2 : th2.getStackTrace()) {
                    str = str + "\n at: " + stackTraceElement2.toString();
                }
            }
            try {
                strY = w.y(this.f66084w);
                try {
                    zEquals = TextUtils.equals(strY, this.f66084w.getPackageName());
                    strW = b.z().w(this.f66084w, b.f66093o, b.f66095s);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                strY = "";
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.taurusx.tax.w.s.s.I, com.taurusx.tax.w.s.s.f67503i);
                jSONObject.put("crash_cause", str);
                jSONObject.put(com.taurusx.tax.w.s.s.J, System.currentTimeMillis());
                jSONObject.put("proc_name", strY);
                jSONObject.put("proc_main", zEquals);
                jSONObject.put("proc_session", strW);
                com.taurusx.tax.w.z.t().a().w(jSONObject);
            } catch (Exception unused3) {
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        LogUtil.d("taurusx", "uncaughtException");
        z(th2, thread);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f66085z;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    public void z(Context context) {
        this.f66084w = context;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static a0 z() {
        if (f66083y == null) {
            synchronized (a0.class) {
                try {
                    if (f66083y == null) {
                        f66083y = new a0();
                    }
                } finally {
                }
            }
        }
        return f66083y;
    }
}
