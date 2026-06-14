package com.apm.insight.i;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.e;
import com.apm.insight.g.c;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.h;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.io.IOException;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7845a;

    public b(@NonNull Context context) {
        this.f7845a = context;
    }

    private synchronized void b(final long j10, final Thread thread, final Throwable th2, final String str, final String str2, final boolean z10) {
        final File file = new File(j.a(this.f7845a), str);
        com.apm.insight.g.a.a().a(file.getName());
        file.mkdirs();
        f.d(file);
        final boolean zC = m.c(th2);
        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(CrashType.LAUNCH, new c.a() { // from class: com.apm.insight.i.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f7846a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
                this.f7846a = SystemClock.uptimeMillis();
                if (i10 == 0) {
                    aVar.a("stack", (Object) m.a(th2));
                    aVar.a(Reporting.Key.EVENT_TYPE, "start_crash");
                    aVar.a("isOOM", Boolean.valueOf(zC));
                    aVar.a("crash_time", Long.valueOf(j10));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str3 = str2;
                    if (str3 != null) {
                        aVar.a("crash_md5", (Object) str3);
                        aVar.a("crash_md5", str2);
                        boolean z11 = z10;
                        if (z11) {
                            aVar.a("has_ignore", String.valueOf(z11));
                        }
                    }
                } else {
                    if (i10 == 1) {
                        aVar.a("timestamp", Long.valueOf(j10));
                        aVar.a("main_process", Boolean.valueOf(com.apm.insight.l.a.b(b.this.f7845a)));
                        aVar.a("crash_type", CrashType.JAVA);
                        Thread thread2 = thread;
                        aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                        aVar.a(ScarConstants.TOKEN_ID_KEY, Integer.valueOf(Process.myTid()));
                        aVar.a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                        aVar.a("crash_after_native", NativeImpl.e() ? "true" : "false");
                        com.apm.insight.g.a.a().a(thread, th2, true, aVar);
                        return aVar;
                    }
                    if (i10 == 2) {
                        if (zC) {
                            com.apm.insight.l.a.a(b.this.f7845a, aVar.c());
                        }
                        aVar.a("launch_did", (Object) a.a(b.this.f7845a));
                        if (e.x()) {
                            JSONArray jSONArrayB = com.apm.insight.b.f.b().b();
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            JSONObject jSONObjectA = com.apm.insight.b.f.b().a(jUptimeMillis).a();
                            JSONArray jSONArrayA = com.apm.insight.b.j.a(jUptimeMillis);
                            aVar.a("history_message", (Object) jSONArrayB);
                            aVar.a("current_message", jSONObjectA);
                            aVar.a("pending_messages", (Object) jSONArrayA);
                        }
                        aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                        aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.a()));
                        return aVar;
                    }
                    if (i10 == 3) {
                        JSONObject jSONObjectB = m.b(Thread.currentThread().getName());
                        if (jSONObjectB != null) {
                            aVar.a("all_thread_stacks", jSONObjectB);
                        }
                        aVar.a("logcat", (Object) h.a(e.f()));
                        return aVar;
                    }
                    if (i10 != 4) {
                        if (i10 == 5) {
                            aVar.a("crash_uuid", (Object) str);
                            return aVar;
                        }
                    } else if (!zC) {
                        com.apm.insight.l.a.a(b.this.f7845a, aVar.c());
                        return aVar;
                    }
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a b(int i10, com.apm.insight.entity.a aVar) {
                try {
                    f.a(new File(file, file.getName() + "." + i10), aVar.c());
                    return aVar;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return aVar;
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        try {
            aVarA.a("crash_type", Constants.NORMAL);
            aVarA.b("crash_cost", String.valueOf(jCurrentTimeMillis));
            aVarA.a("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th3) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
        }
        if (Npth.isStopUpload()) {
        }
    }

    @Override // com.apm.insight.g.c
    public final void a(long j10, Thread thread, Throwable th2, String str, String str2, boolean z10) {
        b(j10, thread, th2, str, str2, z10);
    }
}
