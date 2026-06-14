package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4240b4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.Thread;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4462o4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44539k = "1.0.6";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f44540l = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4634y7 f44541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f44544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f44545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ContextProvider f44546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f44547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f44549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f44550j;

    /* JADX INFO: renamed from: com.ironsource.o4$a */
    class a implements InterfaceC4235b {
        a() {
        }

        @Override // com.ironsource.InterfaceC4235b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(" ");
                    sb2.append("(");
                    sb2.append(thread.getState().toString());
                    sb2.append(")");
                    sb2.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(" ");
                        sb2.append(thread.getState().toString());
                        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                }
            }
            C4462o4.f44540l = sb2.toString();
        }

        @Override // com.ironsource.InterfaceC4235b
        public void b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o4$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f44552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44553b;

        b(Context context, String str) {
            this.f44552a = context;
            this.f44553b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strI = C4462o4.this.f44541a.I(this.f44552a);
                if (!TextUtils.isEmpty(strI)) {
                    C4462o4.this.f44543c = strI;
                }
                String strB = C4462o4.this.f44541a.b(this.f44552a);
                if (!TextUtils.isEmpty(strB)) {
                    C4462o4.this.f44545e = strB;
                }
                SharedPreferences.Editor editorEdit = this.f44552a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C4462o4.this.f44543c);
                editorEdit.putString("sId", this.f44553b);
                editorEdit.apply();
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o4$c */
    class c extends RunnableC4479p4 {
        c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o4$d */
    @SuppressLint({"StaticFieldLeak"})
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile C4462o4 f44556a = new C4462o4();

        private d() {
        }
    }

    String e() {
        return this.f44549i;
    }

    private C4462o4() {
        this.f44550j = false;
        this.f44541a = Ib.U().i();
        this.f44546f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f44547g = defaultUncaughtExceptionHandler;
        this.f44549i = " ";
        this.f44548h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C4426m4(defaultUncaughtExceptionHandler));
    }

    static List<M5> c() {
        return null;
    }

    public static C4462o4 d() {
        return d.f44556a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) {
        Context applicationContext = this.f44546f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f44549i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f44548h = str;
            }
            this.f44544d = str3;
            if (z10) {
                new C4217a(i10).a(z11).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f44550j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return f44539k;
    }

    public void a(Throwable th2) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f44550j);
        if (!this.f44550j || th2 == null) {
            return;
        }
        new M5(new C4445n4(th2).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f44543c);
        String string2 = sharedPreferences.getString("sId", this.f44544d);
        List<M5> listB = F4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (M5 m52 : listB) {
            JSONObject jSONObject = new JSONObject();
            String strB = m52.b();
            String strE = m52.e();
            String strD = m52.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoN = this.f44541a.n(context);
                if (memoryInfoN != null) {
                    jSONObject2.put("availRam", this.f44541a.c(memoryInfoN));
                    jSONObject2.put(N6.f41434x, this.f44541a.b(memoryInfoN));
                    jSONObject2.put("mThreshold", this.f44541a.a(memoryInfoN));
                }
                String strT = this.f44541a.t();
                if (strT != null) {
                    jSONObject2.put(N6.f41440z, strT);
                }
                jSONObject2.put("crashDate", strB);
                jSONObject2.put("stacktraceCrash", strE);
                jSONObject2.put("crashType", strD);
                jSONObject2.put("CrashReporterVersion", f44539k);
                jSONObject2.put(C4240b4.j.f42698q, "9.1.0");
                jSONObject2.put(C4240b4.j.f42708x, this.f44541a.c(context));
                jSONObject2.put("appVersion", B1.b(context, packageName));
                jSONObject2.put(C4240b4.j.f42692n, this.f44541a.i());
                jSONObject2.put("network", strA);
                jSONObject2.put(C4240b4.j.f42696p, this.f44541a.e());
                jSONObject2.put("deviceModel", this.f44541a.l());
                jSONObject2.put("totalRam", this.f44541a.q(context));
                jSONObject2.put(Ya.f42169o, this.f44541a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.f44541a.q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f44545e)) {
                    jSONObject2.put(C4240b4.j.M, Boolean.parseBoolean(this.f44545e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObject2.has(str)) {
                                jSONObject.put(str, jSONObject2.opt(str));
                            }
                        } catch (Exception e10) {
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        F4.a();
    }

    Context a() {
        return this.f44546f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return X3.f42018b;
            }
            return networkCapabilities.hasTransport(0) ? X3.f42023g : "none";
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }
}
