package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.b.h;
import com.apm.insight.l.m;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f7649a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f7650b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static FileObserver f7652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f7653e;

    public static boolean b() {
        return f7651c;
    }

    public static void c() {
        f7653e = null;
    }

    public static void a(final String str, final h.a aVar) {
        FileObserver fileObserver = f7652d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i10, @Nullable String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f7649a = aVar.a();
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            }
        };
        f7652d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static JSONObject a() throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", m.a(stackTrace));
            return jSONObject;
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            return null;
        }
    }

    static String a(Context context) {
        if (SystemClock.uptimeMillis() - f7650b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoA = com.apm.insight.l.a.a(context);
            if (processErrorStateInfoA != null && Process.myPid() == processErrorStateInfoA.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f7653e;
                if (processErrorStateInfo != null && String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfoA.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfoA.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfoA.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfoA.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfoA.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfoA.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfoA.longMsg))) {
                    return null;
                }
                f7653e = processErrorStateInfoA;
                f7649a = null;
                f7650b = SystemClock.uptimeMillis();
                f7651c = false;
                if (!com.apm.insight.e.t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("|------------- processErrorStateInfo--------------|\n");
                sb2.append("condition: " + processErrorStateInfoA.condition + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("processName: " + processErrorStateInfoA.processName + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("pid: " + processErrorStateInfoA.pid + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("uid: " + processErrorStateInfoA.uid + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("tag: " + processErrorStateInfoA.tag + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("shortMsg : " + processErrorStateInfoA.shortMsg + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("longMsg : " + processErrorStateInfoA.longMsg + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("-----------------------end----------------------------");
                return sb2.toString();
            }
        } catch (Throwable unused) {
        }
        String str = f7649a;
        if (str == null) {
            return null;
        }
        f7651c = true;
        f7649a = null;
        f7650b = SystemClock.uptimeMillis();
        return str;
    }
}
