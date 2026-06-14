package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.tools.q0;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile e f48797d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48798a = "CrashHandlerUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f48799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f48800c;

    private e(Context context) {
        this.f48800c = new WeakReference<>(context);
    }

    public static e a(Context context) {
        if (f48797d == null) {
            synchronized (e.class) {
                try {
                    if (f48797d == null) {
                        f48797d = new e(context);
                    }
                } finally {
                }
            }
        }
        return f48797d;
    }

    private void b(Thread thread, Throwable th2) {
        try {
            List<String> listA = b.a();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            StringBuilder sb2 = new StringBuilder();
            String str = th2.getClass() + ": " + th2.getMessage();
            sb2.append(str);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            boolean zA = a(listA, str);
            int i10 = 0;
            for (int i11 = 0; i11 < stackTrace.length; i11++) {
                String string = stackTrace[i11].toString();
                if (a(listA, string)) {
                    zA = true;
                    if (i11 == 0) {
                        i10 = 1;
                    }
                }
                sb2.append(string);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            if (zA && sb2.length() >= 1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C4240b4.i.W, "2000052");
                jSONObject.put("crash_first_index_from_mtg", i10);
                JSONObject jSONObjectA = a(String.valueOf(System.currentTimeMillis()));
                jSONObjectA.put("crashinfo", sb2.toString());
                jSONObject.put("exception", jSONObjectA);
                if (jSONObject.length() > 0) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
                try {
                    Thread.sleep(500L);
                    return;
                } catch (InterruptedException e10) {
                    q0.b("CrashHandlerUtil", e10.getMessage());
                    return;
                }
            }
            a(thread, th2);
        } catch (Throwable th3) {
            a(thread, th2);
            q0.b("CrashHandlerUtil", th3.getMessage());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (th2 != null) {
            try {
                b(thread, th2);
            } catch (Throwable th3) {
                q0.b("CrashHandlerUtil", th3.getMessage());
            }
        }
        a(thread, th2);
    }

    public void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f48799b = defaultUncaughtExceptionHandler;
        if (defaultUncaughtExceptionHandler instanceof e) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f48800c.get() == null) {
                return jSONObject;
            }
            jSONObject.put("max_memory", String.valueOf((float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d)));
            jSONObject.put("memoryby_app", String.valueOf((float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d)));
            jSONObject.put("remaining_memory", (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d));
            jSONObject.put("crashtime", str);
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("CrashHandlerUtil", th2.getMessage());
            return jSONObject;
        }
    }

    private boolean a(List<String> list, String str) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(Thread thread, Throwable th2) {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f48799b;
            if (uncaughtExceptionHandler != null) {
                if (uncaughtExceptionHandler instanceof e) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                Process.killProcess(Process.myPid());
                System.exit(1);
            }
        } catch (Throwable th3) {
            q0.b("CrashHandlerUtil", th3.getMessage());
        }
    }
}
