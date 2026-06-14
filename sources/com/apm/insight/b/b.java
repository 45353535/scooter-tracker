package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.adjust.sdk.purchase.ADJPConstants;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile boolean f7615z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f7616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f7618c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f7622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f7623h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONArray f7628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f7629n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONArray f7632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private JSONArray f7633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private JSONObject f7634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7635t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f7637v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7619d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f7620e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7621f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f7624i = "unknown";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7625j = "unknown";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f7626k = "unknown";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7627l = "npth_inner_default";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7630o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f7631p = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f7636u = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f7638w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f7639x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f7640y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.f7617b = context;
    }

    private static boolean h() {
        boolean zA = com.apm.insight.l.a.a();
        boolean z10 = !zA;
        if (zA || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z10;
        }
        return false;
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.f7617b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(StringUtils.PROCESS_POSTFIX_DELIMITER, "_"));
        }
        return this.D;
    }

    public final void b() {
        if (this.f7618c) {
            this.f7618c = false;
            c cVar = this.f7616a;
            if (cVar != null) {
                cVar.b();
            }
            this.f7616a = null;
        }
    }

    public final void c() {
        c cVar = this.f7616a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.f7636u) {
        }
        this.f7640y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
        this.f7638w = SystemClock.uptimeMillis();
        this.f7637v = true;
    }

    public final void f() {
        File fileI = i();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX)).intValue();
            this.A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    final boolean g() {
        boolean z10;
        int i10;
        String str;
        String str2;
        boolean z11;
        JSONArray jSONArrayB;
        boolean z12;
        JSONArray jSONArrayA;
        JSONObject jSONObject;
        JSONObject jSONObjectA;
        String str3;
        String str4;
        JSONArray jSONArray;
        final long j10;
        JSONObject jSONObjectA2;
        boolean z13;
        JSONObject jSONObject2;
        boolean zB = com.apm.insight.runtime.i.a().b();
        long jUptimeMillis = SystemClock.uptimeMillis();
        a(jUptimeMillis);
        String strA = d.a(this.f7617b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str5 = Constants.NORMAL;
        TextUtils.isEmpty(strA);
        if (TextUtils.isEmpty(strA)) {
            z10 = zB;
            i10 = 1;
            str = "unknown";
            str2 = "unknown";
            z11 = false;
            jSONArrayB = null;
            z12 = false;
            jSONArrayA = null;
            jSONObject = null;
            jSONObjectA = null;
            str3 = Constants.NORMAL;
            str4 = "unknown";
            jSONArray = null;
            j10 = jCurrentTimeMillis;
            jSONObjectA2 = null;
        } else {
            synchronized (this.f7636u) {
            }
            if (this.f7622g == null || System.currentTimeMillis() - this.f7619d > 20000) {
                if (this.f7637v) {
                    this.f7637v = false;
                    str5 = "trace_after";
                }
                b(jUptimeMillis);
            } else {
                str5 = "trace_last";
            }
            JSONObject jSONObject3 = this.f7622g;
            String str6 = this.f7624i;
            String str7 = this.f7625j;
            String str8 = this.f7626k;
            JSONArray jSONArray2 = this.f7628m;
            JSONArray jSONArray3 = this.f7633r;
            JSONArray jSONArray4 = this.f7632q;
            i10 = 1;
            JSONObject jSONObject4 = this.f7634s;
            JSONObject jSONObject5 = this.f7623h;
            z10 = zB;
            z11 = this.f7635t;
            long j11 = this.f7631p;
            this.f7622g = null;
            this.f7628m = null;
            this.f7632q = null;
            this.f7623h = null;
            this.f7633r = null;
            this.f7624i = "unknown";
            this.f7625j = "unknown";
            this.f7626k = "unknown";
            this.f7630o = 0;
            str2 = str8;
            str4 = str6;
            jSONArray = jSONArray2;
            jSONObjectA = jSONObject5;
            jSONArrayA = jSONArray4;
            jSONArrayB = jSONArray3;
            str = str7;
            str3 = str5;
            j10 = j11;
            jSONObjectA2 = jSONObject3;
            jSONObject = jSONObject4;
            z12 = true;
        }
        if (TextUtils.isEmpty(strA)) {
            if (this.f7622g == null || System.currentTimeMillis() - this.f7619d <= 20000) {
                if (this.f7622g == null || System.currentTimeMillis() - this.f7619d <= 2000 || !NativeImpl.h()) {
                    return false;
                }
                com.apm.insight.l.f.a(i());
                return false;
            }
            this.f7622g = null;
            this.f7628m = null;
            this.f7632q = null;
            this.f7623h = null;
            this.f7633r = null;
            this.f7624i = "unknown";
            this.f7625j = "unknown";
            this.f7626k = "unknown";
            this.f7630o = 0;
            this.f7620e = null;
            return false;
        }
        if (jSONObjectA2 == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB = f.b().b();
                    jSONArrayA = j.a(jUptimeMillis);
                    z13 = z11;
                    try {
                        jSONObjectA = f.b().a(jUptimeMillis).a();
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.f7617b, jSONObject6);
                            jSONObject = jSONObject6;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject6;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z13 = z11;
                }
            } else {
                z13 = z11;
            }
            jSONObjectA2 = d.a();
        } else {
            z13 = z11;
        }
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObjectA;
        if (jSONObjectA2 == null || jSONObjectA2.length() <= 0) {
            return z12;
        }
        boolean z14 = z12;
        try {
            jSONObjectA2.put("pid", Process.myPid());
            jSONObjectA2.put("package", this.f7617b.getPackageName());
            jSONObjectA2.put("is_remote_process", 0);
            jSONObjectA2.put("is_new_stack", 10);
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
            JSONObject jSONObject9 = jSONObjectA2;
            aVar.a("data", (Object) jSONObject9.toString());
            aVar.a("is_anr", Integer.valueOf(i10));
            aVar.a("anrType", (Object) str3);
            if (com.apm.insight.e.x()) {
                aVar.a("history_message", (Object) jSONArrayB);
                aVar.a("current_message", jSONObject8);
                aVar.a("pending_messages", (Object) jSONArrayA);
            }
            aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_time", Long.valueOf(j10));
            com.apm.insight.c.a.b();
            aVar.c(jSONObject7);
            aVar.a("anr_info", (Object) strA);
            if (jSONArray != null) {
                aVar.a("dump_trace", (Object) jSONArray);
            }
            JSONObject jSONObject10 = this.f7629n;
            aVar.a("all_thread_stacks", (jSONObject10 == null || jSONObject10.length() == 0) ? m.b((String) null) : this.f7629n);
            com.apm.insight.runtime.a.f fVarA = com.apm.insight.runtime.a.f.a();
            CrashType crashType = CrashType.ANR;
            com.apm.insight.entity.a aVarA = fVarA.a(crashType, aVar);
            aVarA.a("is_background", Boolean.valueOf(z13));
            aVarA.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
            aVarA.a("has_dump", (Object) "true");
            aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j10, crashType, false, false));
            JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
            com.apm.insight.entity.d.b(aVarA.c());
            if (jSONObjectOptJSONObject == null) {
                try {
                    jSONObject2 = new JSONObject();
                    try {
                        aVarA.a("filters", jSONObject2);
                    } catch (Throwable unused4) {
                        jSONObjectOptJSONObject = jSONObject2;
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } catch (Throwable unused5) {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
            } else {
                jSONObject2 = jSONObjectOptJSONObject;
            }
            jSONObject2.put("anrType", str3);
            jSONObject2.put("max_utm_thread", str4);
            jSONObject2.put("max_stm_thread", str);
            jSONObject2.put("max_utm_stm_thread", str2);
            jSONObject2.put("max_utm_thread_version", this.f7627l);
            long j12 = j10 - com.apm.insight.e.j();
            jSONObject2.put("crash_length", j12 < 30000 ? "0 - 30s" : j12 < 60000 ? "30s - 1min" : j12 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS ? "1min - 2min" : j12 < 300000 ? "2min - 5min" : j12 < 600000 ? "5min - 10min" : j12 < 1800000 ? "10min - 30min" : j12 < 3600000 ? "30min - 1h" : "1h - ");
            jSONObject2.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
            jSONObject2.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
            jSONObject2.put(ADJPConstants.KEY_SDK_VERSION, "2008-20250701130429");
            jSONObject2.put("has_logcat", String.valueOf(aVarA.a()));
            jSONObject2.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
            jSONObject2.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
            jSONObject2.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
            jSONObject2.put("is_64_devices", String.valueOf(Header.a()));
            jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.f()));
            jSONObject2.put("is_x86_devices", String.valueOf(Header.b()));
            jSONObject2.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
            jSONObject2.put("is_root", com.apm.insight.nativecrash.a.k() ? "true" : "false");
            jSONObject2.put("anr_normal_trace", String.valueOf(!this.f7637v));
            jSONObject2.put("anr_no_run", String.valueOf(z10));
            jSONObject2.put("crash_after_crash", Npth.hasCrash() ? "true" : "false");
            jSONObject2.put("from_file", String.valueOf(d.b()));
            jSONObject2.put("has_dump", "true");
            jSONObject2.put("from_kill", "false");
            jSONObject2.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
            int i11 = this.f7630o;
            if (i11 > 0) {
                jSONObject2.put("may_have_stack_overflow", String.valueOf(i11));
            }
            try {
                a(strA, jSONObject2);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.a.a();
            CrashType crashType2 = CrashType.LAUNCH;
            com.apm.insight.e.e();
            try {
                if (com.apm.insight.a.e().length() > 1024) {
                    aVarA.a("has_system_traces", "true");
                }
            } catch (Throwable unused6) {
            }
            try {
                JSONArray jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
                if (jSONArrayA2.length() > 0) {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                }
            } catch (Throwable unused7) {
            }
            String strOptString = jSONObject9.optString("mainStackFromTrace");
            JSONArray jSONArrayA3 = com.apm.insight.entity.b.a(strOptString);
            com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA3, new b.a() { // from class: com.apm.insight.b.b.2
                @Override // com.apm.insight.entity.b.a
                public final void a(JSONObject jSONObject11) {
                    com.apm.insight.k.d.a().a(jSONObject11, j10, b.this.f7621f);
                }
            });
            b(strOptString, jSONArrayA3);
            return z14;
        } catch (Throwable th3) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
            return z14;
        }
    }

    public final void a() {
        if (this.f7618c) {
            return;
        }
        this.f7616a = new c(this);
        this.f7619d = com.apm.insight.e.j();
        this.f7618c = true;
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f7630o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                sb2.append(jSONArrayB.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean a(long j10) {
        if (this.f7637v) {
            this.f7637v = false;
            b(j10);
        }
        return false;
    }

    private void b(long j10) {
        if (this.f7639x != this.f7638w) {
            try {
                this.f7631p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.f7633r = f.b().b();
                    this.f7632q = j.a(j10);
                    this.f7623h = f.b().a(j10).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.f7634s = jSONObject;
                com.apm.insight.l.a.a(this.f7617b, jSONObject);
                this.f7635t = h();
                this.f7621f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f7619d = this.f7631p;
                String strB = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.f7617b), strB), "trace_" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + IOUtils.LINE_SEPARATOR_UNIX, false);
                n.a("anr_trace", strB);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.f7628m = jSONArrayA;
                    a(jSONArrayA);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
                if (this.f7622g == null) {
                    this.f7622g = d.a();
                }
            } catch (Throwable th3) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.f7619d = this.f7631p;
                String strB2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.f7617b), strB2), "trace" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + IOUtils.LINE_SEPARATOR_UNIX, false);
                n.a("anr_trace", strB2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.f7628m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (IOException unused3) {
                } catch (Throwable th4) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
                }
                if (this.f7622g == null) {
                    this.f7622g = d.a();
                }
            } catch (Throwable th5) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th5, "NPTH_CATCH");
            }
        }
        long j11 = this.f7638w;
        this.f7639x = j11;
        this.f7638w = -1L;
        if (j11 == -1) {
            this.f7639x = (-1) - 1;
        }
    }

    private void a(JSONArray jSONArray) {
        int i10;
        int[] iArrB;
        int[] iArrB2;
        if (jSONArray == null) {
            return;
        }
        this.f7622g = null;
        this.f7629n = null;
        this.f7630o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f7624i = "unknown";
        this.f7625j = "unknown";
        this.f7626k = "unknown";
        int[] iArr = new int[3];
        iArr[0] = 0;
        iArr[1] = 0;
        int i11 = 2;
        iArr[2] = 0;
        JSONArray jSONArray5 = jSONArray4;
        String string = null;
        int i12 = 0;
        boolean z10 = false;
        while (i12 < jSONArray.length()) {
            String strOptString = jSONArray.optString(i12);
            int i13 = i11;
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.f7622g == null && C4240b4.i.Z.equals(string)) {
                        this.f7622g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(string, jSONArray5));
                    }
                    try {
                        if (!C4240b4.i.Z.equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = string;
                    if (!a(str)) {
                        try {
                            iArrB2 = b(jSONArray5);
                        } catch (IllegalArgumentException e10) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e10, "NPTH_CATCH");
                            iArrB2 = null;
                        } catch (Throwable unused2) {
                            iArrB2 = null;
                        }
                        if (iArrB2 != null) {
                            int i14 = iArrB2[0];
                            if (i14 > iArr[0]) {
                                iArr[0] = i14;
                                this.f7624i = str;
                            }
                            int i15 = iArrB2[1];
                            if (i15 > iArr[1]) {
                                iArr[1] = i15;
                                this.f7625j = str;
                            }
                            int i16 = iArrB2[i13];
                            if (i16 > iArr[i13]) {
                                iArr[i13] = i16;
                                this.f7626k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                i10 = i13;
                string = null;
            } else if (!z10) {
                i10 = i13;
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z10 = true;
                }
                jSONArray3.put(strOptString);
            } else if (!z10) {
                i10 = i13;
            } else if (strOptString.contains(" prio=")) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.f7622g == null && C4240b4.i.Z.equals(string)) {
                        this.f7622g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(string, jSONArray5));
                    }
                    try {
                        if (!C4240b4.i.Z.equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused3) {
                    }
                    String str2 = string;
                    if (!a(str2)) {
                        try {
                            iArrB = b(jSONArray5);
                        } catch (IllegalArgumentException e11) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e11, "NPTH_CATCH");
                            iArrB = null;
                        } catch (Throwable unused4) {
                            iArrB = null;
                        }
                        if (iArrB != null) {
                            int i17 = iArrB[0];
                            if (i17 > iArr[0]) {
                                iArr[0] = i17;
                                this.f7624i = str2;
                            }
                            int i18 = iArrB[1];
                            if (i18 > iArr[1]) {
                                iArr[1] = i18;
                                this.f7625j = str2;
                            }
                            int i19 = iArrB[i13];
                            if (i19 > iArr[i13]) {
                                iArr[i13] = i19;
                                this.f7626k = str2;
                            }
                        }
                    }
                }
                String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                if (C4240b4.i.Z.equals(strSubstring)) {
                    i10 = i13;
                    string = strSubstring;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strSubstring);
                    sb2.append("  (");
                    i10 = i13;
                    sb2.append(strOptString.substring(strOptString.indexOf(34, i10) + 1));
                    sb2.append(" )");
                    string = sb2.toString();
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                jSONArray5.put(strOptString);
            } else {
                i10 = i13;
                if (TextUtils.isEmpty(string)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
            i12++;
            i11 = i10;
        }
        if (jSONArray2.length() > 0) {
            this.f7628m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f7629n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f7629n.put("thread_stacks", jSONArray2);
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) throws IllegalArgumentException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
            }
        }
        return null;
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.B = new LinkedList();
                this.f7627l = jSONArrayB.optString(0);
                for (int i10 = 1; i10 < jSONArrayB.length(); i10++) {
                    try {
                        this.B.add(Pattern.compile(jSONArrayB.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f7630o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        r10 = r24 + 3;
        r24 = r12;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fb, code lost:
    
        r12 = "softirq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
    
        if (r8 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
    
        r28 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0202, code lost:
    
        if (r8 != 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
    
        if (r8 != 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0208, code lost:
    
        if (r8 != 3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020b, code lost:
    
        if (r8 != 4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020d, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0210, code lost:
    
        if (r8 != 5) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0214, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0217, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021a, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021d, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0220, code lost:
    
        r28 = r4;
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022c, code lost:
    
        if ("user".equalsIgnoreCase(r28[r10]) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022e, code lost:
    
        r12 = "user";
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0239, code lost:
    
        if ("kernel".equalsIgnoreCase(r28[r10]) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023b, code lost:
    
        r12 = "kernel";
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0246, code lost:
    
        if ("iowait".equalsIgnoreCase(r28[r10]) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0248, code lost:
    
        r12 = "iowait";
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0253, code lost:
    
        if ("irq".equalsIgnoreCase(r28[r10]) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0255, code lost:
    
        r12 = "irq";
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x025e, code lost:
    
        if ("softirq".equalsIgnoreCase(r28[r10]) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0260, code lost:
    
        r8 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0268, code lost:
    
        if ("softirq".equalsIgnoreCase(r28[r10]) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x026a, code lost:
    
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026c, code lost:
    
        r8 = r29;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026f, code lost:
    
        if (r12 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0273, code lost:
    
        r4 = java.lang.Float.valueOf(r28[r10 - 1].replace(r3, "")).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0281, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0283, code lost:
    
        r3 = r5 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0292, code lost:
    
        if (r0 == r6) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0295, code lost:
    
        r4 = r4 / com.apm.insight.l.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029e, code lost:
    
        r0.put(r3, java.lang.Float.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a7, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a9, code lost:
    
        r0.put(r5 + r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02bc, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bf, code lost:
    
        if (r8 >= 6) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02c1, code lost:
    
        r10 = r10 + 3;
        r3 = r27;
        r4 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
    
        r10 = java.lang.Float.valueOf(r4[r8].replace("%", "")).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        r8 = r5 + com.ironsource.C4240b4.i.f42636l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c9, code lost:
    
        if (r0 != r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cc, code lost:
    
        r10 = r10 / com.apm.insight.l.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r0.put(r8, java.lang.Float.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dd, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01df, code lost:
    
        r0.put(r5 + com.ironsource.C4240b4.i.f42636l, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024b A[PHI: r28 r29
  0x024b: PHI (r28v3 java.lang.String[]) = (r28v2 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r29v3 char) = (r29v2 char), (r29v10 char) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0258 A[PHI: r28 r29
  0x0258: PHI (r28v4 java.lang.String[]) = (r28v3 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]
  0x0258: PHI (r29v4 char) = (r29v3 char), (r29v11 char) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0262 A[PHI: r28 r29
  0x0262: PHI (r28v7 java.lang.String[]) = (r28v4 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]
  0x0262: PHI (r29v7 char) = (r29v4 char), (r29v12 char) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c1 A[LOOP:2: B:101:0x01f8->B:153:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e1 A[EDGE_INSN: B:233:0x03e1->B:204:0x03e1 BREAK  A[LOOP:0: B:3:0x0047->B:206:0x03f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c9 A[EDGE_INSN: B:237:0x02c9->B:154:0x02c9 BREAK  A[LOOP:2: B:101:0x01f8->B:153:0x02c1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r31, org.json.JSONObject r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 += entry.getValue().floatValue();
            }
        }
        float f10 = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(strConcat + "_total", b(f10));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f10));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f10));
    }

    private static String a(float f10, float f11) {
        if (f11 > 0.0f) {
            return a(f10 / f11);
        }
        return f10 > 0.0f ? "100%" : "0%";
    }

    private static String a(float f10) {
        if (f10 <= 0.0f) {
            return "0%";
        }
        if (f10 <= 0.1f) {
            return "0% - 10%";
        }
        if (f10 <= 0.3f) {
            return "10% - 30%";
        }
        if (f10 <= 0.6f) {
            return "30% - 60%";
        }
        if (f10 <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }
}
