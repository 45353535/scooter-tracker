package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.purchase.ADJPConstants;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.l.h;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.o;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f7986d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f7988b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f7989c;

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$a, reason: collision with other inner class name */
    static class C0163a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        com.apm.insight.a.a((Closeable) bufferedReader2);
                        return "";
                    }
                    if (line.startsWith("[FATAL:jni_android.cc") && line.contains("Please include Java exception stack in crash report ttwebview:")) {
                        StringBuilder sb2 = new StringBuilder();
                        int iIndexOf = line.indexOf(" ttwebview:");
                        sb2.append("Caused by: ");
                        sb2.append("Please include Java exception stack in crash report");
                        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                        sb2.append(line.substring(iIndexOf + 11));
                        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                        while (true) {
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null) {
                                String string = sb2.toString();
                                com.apm.insight.a.a((Closeable) bufferedReader2);
                                return string;
                            }
                            sb2.append(line2);
                            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                    } else {
                        com.apm.insight.a.a((Closeable) bufferedReader2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.insight.c.a();
                        j.a(th, "NPTH_CATCH");
                    } finally {
                        com.apm.insight.a.a((Closeable) bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            return "";
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.apm.insight.nativecrash.c f7990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.apm.insight.h.b f7991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final File f7992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File f7993d;

        public b(File file) {
            this.f7992c = file;
            this.f7993d = com.apm.insight.l.j.a(com.apm.insight.e.g(), file.getName());
            com.apm.insight.h.b bVar = new com.apm.insight.h.b(file);
            this.f7991b = bVar;
            com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(file);
            this.f7990a = cVar;
            if (bVar.d() && cVar.a() == null) {
                cVar.a(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long a() {
            /*
                r2 = this;
                com.apm.insight.h.b r0 = r2.f7991b
                java.util.Map r0 = r0.f()
                if (r0 == 0) goto L19
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r0 = move-exception
                goto L21
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L29
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L17
                return r0
            L21:
                com.apm.insight.c.a()
                java.lang.String r1 = "NPTH_CATCH"
                com.apm.insight.runtime.j.a(r0, r1)
            L29:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.a.b.a():long");
        }

        public final File b() {
            return this.f7992c;
        }

        public final boolean c() {
            return this.f7991b.d();
        }
    }

    public class c extends e {
        c() {
            super();
            this.f7998b = "Total FD Count:";
            this.f7997a = com.apm.insight.l.j.i(a.this.f7989c.b());
            this.f7999c = StringUtils.PROCESS_POSTFIX_DELIMITER;
            this.f8000d = -2;
        }
    }

    public class d extends e {
        d() {
            super();
            this.f7998b = "VmSize:";
            this.f7997a = com.apm.insight.l.j.k(a.this.f7989c.b());
            this.f7999c = "\\s+";
            this.f8000d = -1;
        }
    }

    public class f extends e {
        f() {
            super();
            this.f7998b = "Total Threads Count:";
            this.f7997a = com.apm.insight.l.j.j(a.this.f7989c.b());
            this.f7999c = StringUtils.PROCESS_POSTFIX_DELIMITER;
            this.f8000d = -2;
        }
    }

    public a(Context context) {
        this.f7987a = context;
    }

    public static long g() {
        if (NativeImpl.f()) {
            return Long.MAX_VALUE;
        }
        return Header.a() ? 3891200L : 2867200L;
    }

    public static boolean k() {
        Boolean bool = f7986d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 11; i10++) {
            try {
                if (new File(strArr[i10]).exists()) {
                    f7986d = Boolean.TRUE;
                    return true;
                }
                continue;
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
        }
        f7986d = Boolean.FALSE;
        return false;
    }

    @Nullable
    private String l() {
        b bVar = this.f7989c;
        if (bVar == null) {
            return null;
        }
        String strC = bVar.f7990a.c();
        return (strC == null || strC.isEmpty()) ? this.f7989c.f7991b.e() : strC;
    }

    public final JSONObject b() {
        File fileF = com.apm.insight.l.j.f(this.f7989c.b());
        if (!fileF.exists()) {
            return null;
        }
        try {
            String strA = com.apm.insight.l.f.a(fileF.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
            if (strA != null && !strA.isEmpty()) {
                return new JSONObject(strA);
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
        return null;
    }

    public final void c() {
        BufferedWriter bufferedWriter;
        Throwable th2;
        try {
            File fileE = com.apm.insight.l.j.e(this.f7989c.b());
            File file = new File(fileE.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i10 = 0;
            if (fileE.exists()) {
                while (i10 < NativeCrashCollector.a()) {
                    File file2 = new File(fileE.getAbsolutePath() + '.' + i10);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i10++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i11 = 0; i11 < NativeCrashCollector.a(); i11++) {
                File file3 = new File(fileE.getAbsolutePath() + '.' + i11);
                if (file3.exists()) {
                    try {
                        String strA = com.apm.insight.l.f.a(file3.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                        if (!TextUtils.isEmpty(strA)) {
                            JSONObject jSONObject = new JSONObject(strA);
                            if (jSONObject.length() > 0) {
                                aVar.c(jSONObject);
                            }
                        }
                    } catch (JSONException e10) {
                        com.apm.insight.c.a();
                        j.a(e10, "NPTH_CATCH");
                    }
                }
            }
            JSONObject jSONObjectC = aVar.c();
            try {
                if (jSONObjectC.length() != 0 && jSONObjectC.opt(C4240b4.a.f42506k) == null) {
                    com.apm.insight.e.g();
                    com.apm.insight.entity.a.a(jSONObjectC, n.a());
                }
            } catch (Throwable unused) {
            }
            if (jSONObjectC.length() != 0) {
                this.f7988b = jSONObjectC;
                file.getParentFile().mkdirs();
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                    try {
                        h.a(jSONObjectC, bufferedWriter);
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            try {
                                jSONObjectC.put("err_write", th2.toString());
                                com.apm.insight.entity.a.a(jSONObjectC, "filters", "err_write", th2.getLocalizedMessage());
                            } catch (JSONException unused2) {
                            }
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } finally {
                            com.apm.insight.a.a((Closeable) bufferedWriter);
                        }
                    }
                } catch (Throwable th4) {
                    bufferedWriter = null;
                    th2 = th4;
                }
                if (file.renameTo(fileE)) {
                    while (i10 < NativeCrashCollector.a()) {
                        File file4 = new File(fileE.getAbsolutePath() + '.' + i10);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i10++;
                    }
                }
            }
        } catch (IOException e11) {
            com.apm.insight.c.a();
            j.a(e11, "NPTH_CATCH");
        }
    }

    public final boolean d() {
        ICrashFilter iCrashFilterB = com.apm.insight.e.b().b();
        if (iCrashFilterB == null) {
            return true;
        }
        try {
            return iCrashFilterB.onNativeCrashFilter(l(), "");
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
            return true;
        }
    }

    public final boolean e() {
        return com.apm.insight.e.a.a().a(com.apm.insight.l.j.f(this.f7989c.b()).getAbsolutePath());
    }

    public final void f() {
        com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(com.apm.insight.l.j.f(this.f7989c.b()).getAbsolutePath()));
    }

    public final JSONObject h() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            Header header = new Header(this.f7987a);
            JSONObject jSONObjectA = o.a().a(this.f7989c.a());
            if (jSONObjectA != null) {
                header.a(jSONObjectA);
                header.d();
                header.e();
            }
            Header.b(header);
            aVar.a(header);
            boolean z10 = true;
            aVar.a("is_native_crash", (Object) 1);
            aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_uuid", this.f7989c.b().getName());
            b bVar = this.f7989c;
            Map<String, String> mapF = bVar != null ? bVar.f7991b.f() : null;
            if (mapF != null) {
                Object obj = (String) mapF.get("process_name");
                if (obj != null) {
                    aVar.a("process_name", obj);
                }
                String str = mapF.get("start_time");
                if (str != null) {
                    try {
                        aVar.a(Long.decode(str).longValue());
                    } catch (Throwable th2) {
                        com.apm.insight.c.a();
                        j.a(th2, "NPTH_CATCH");
                    }
                }
                String str2 = mapF.get("pid");
                if (str2 != null) {
                    try {
                        aVar.a("pid", Long.decode(str2));
                    } catch (Throwable th3) {
                        com.apm.insight.c.a();
                        j.a(th3, "NPTH_CATCH");
                    }
                }
                Object obj2 = (String) mapF.get("crash_thread_name");
                if (obj2 != null) {
                    aVar.a("crash_thread_name", obj2);
                }
                String str3 = mapF.get("crash_time");
                if (str3 != null) {
                    try {
                        aVar.a("crash_time", Long.decode(str3));
                    } catch (Throwable th4) {
                        com.apm.insight.c.a();
                        j.a(th4, "NPTH_CATCH");
                    }
                }
                aVar.a("data", l());
            }
            Map<String, String> mapB = this.f7989c.f7990a.b();
            if (!mapB.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str4 : mapB.keySet()) {
                    String strA = a(mapB.get(str4));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lib_name", str4);
                        jSONObject.put("lib_uuid", strA);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        com.apm.insight.c.a();
                        j.a(e10, "NPTH_CATCH");
                    }
                }
                aVar.a("crash_lib_uuid", (Object) jSONArray);
            }
            File fileE = com.apm.insight.l.j.e(this.f7989c.b());
            if (fileE.exists() || this.f7988b != null) {
                try {
                    JSONObject jSONObject2 = this.f7988b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject(com.apm.insight.l.f.a(fileE.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX));
                    }
                    aVar.c(jSONObject2);
                    aVar.a("has_callback", "true");
                    if (aVar.c().opt(C4240b4.a.f42506k) == null) {
                        com.apm.insight.e.g();
                        aVar.b(n.a());
                    }
                    com.apm.insight.a.a(aVar, aVar.d(), CrashType.NATIVE);
                } catch (Throwable th5) {
                    com.apm.insight.c.a();
                    j.a(th5, "NPTH_CATCH");
                }
                long j10 = -1;
                long jOptLong = aVar.c().optLong("crash_time", -1L);
                long jOptLong2 = aVar.c().optLong("java_end", -1L);
                if (jOptLong2 != -1 && jOptLong != -1) {
                    j10 = jOptLong2 - jOptLong;
                }
                try {
                    aVar.b("total_cost", String.valueOf(j10));
                    aVar.a("total_cost", String.valueOf(j10 / 1000));
                } catch (Throwable unused) {
                }
            } else {
                com.apm.insight.e.g();
                aVar.b(n.a());
                aVar.a("has_callback", "false");
            }
            File fileG = com.apm.insight.l.j.g(this.f7989c.b());
            String strA2 = "";
            if (fileG.exists()) {
                try {
                    strA2 = m.a(fileG.getAbsolutePath());
                } catch (Throwable th6) {
                    com.apm.insight.c.a();
                    j.a(th6, "NPTH_CATCH");
                }
            }
            File fileO = com.apm.insight.l.j.o(this.f7989c.b());
            if (fileO.exists()) {
                String strB = C0163a.b(fileO);
                strA2 = strA2.isEmpty() ? strB : strA2 + IOUtils.LINE_SEPARATOR_UNIX + strB;
            }
            try {
                if (!strA2.isEmpty()) {
                    aVar.a("java_data", (Object) strA2);
                }
            } catch (Throwable th7) {
                com.apm.insight.c.a();
                j.a(th7, "NPTH_CATCH");
            }
            b(aVar);
            a(aVar);
            com.apm.insight.entity.d.b(aVar.c());
            Map<? extends String, ? extends String> map = new HashMap<>();
            if (k()) {
                map.put("is_root", "true");
                aVar.a("is_root", "true");
            } else {
                map.put("is_root", "false");
                aVar.a("is_root", "false");
            }
            map.put("has_fds_file", com.apm.insight.l.j.i(this.f7989c.b()).exists() ? "true" : "false");
            File fileH = com.apm.insight.l.j.h(this.f7989c.b());
            map.put("has_logcat_file", (!fileH.exists() || fileH.length() <= 128) ? "false" : "true");
            map.put("has_maps_file", com.apm.insight.l.j.d(this.f7989c.b()).exists() ? "true" : "false");
            map.put("has_tombstone_file", com.apm.insight.l.j.b(this.f7989c.b()).exists() ? "true" : "false");
            map.put("has_meminfo_file", com.apm.insight.l.j.k(this.f7989c.b()).exists() ? "true" : "false");
            map.put("has_threads_file", com.apm.insight.l.j.j(this.f7989c.b()).exists() ? "true" : "false");
            int iA = new c().a();
            if (iA > 0) {
                if (iA > 960) {
                    map.put("fd_leak", "true");
                } else {
                    map.put("fd_leak", "false");
                }
                aVar.a("fd_count", Integer.valueOf(iA));
            }
            int iA2 = new f().a();
            if (iA2 > 0) {
                if (iA2 > 350) {
                    map.put("threads_leak", "true");
                } else {
                    map.put("threads_leak", "false");
                }
                aVar.a("threads_count", Integer.valueOf(iA2));
            }
            int iA3 = new d().a();
            if (iA3 > 0) {
                if (iA3 > g()) {
                    map.put("memory_leak", "true");
                } else {
                    map.put("memory_leak", "false");
                }
                aVar.a("memory_size", Integer.valueOf(iA3));
            }
            map.put(ADJPConstants.KEY_SDK_VERSION, "2008-20250701130429");
            if (aVar.c().opt("java_data") == null) {
                z10 = false;
            }
            map.put("has_java_stack", String.valueOf(z10));
            JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(this.f7989c.f7992c), com.apm.insight.l.j.m(this.f7989c.f7992c));
            map.put("leak_threads_count", String.valueOf(jSONArrayA.length()));
            if (jSONArrayA.length() > 0) {
                try {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.n(this.f7989c.f7992c), jSONArrayA);
                } catch (Throwable unused2) {
                }
            }
            aVar.b();
            aVar.a("is_64_devices", String.valueOf(Header.a()));
            aVar.a("is_64_runtime", String.valueOf(NativeImpl.f()));
            aVar.a("is_x86_devices", String.valueOf(Header.b()));
            aVar.c(map);
            File fileF = com.apm.insight.l.j.f(this.f7989c.b());
            JSONObject jSONObjectC = aVar.c();
            com.apm.insight.l.f.a(fileF, jSONObjectC);
            return jSONObjectC;
        } catch (Throwable th8) {
            com.apm.insight.c.a();
            j.a(th8, "NPTH_CATCH");
            return null;
        }
    }

    public final boolean i() {
        return com.apm.insight.l.f.a(this.f7989c.b());
    }

    public final void j() {
        try {
            com.apm.insight.l.f.b(this.f7989c.b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + com.apm.insight.e.g().getPackageName() + "/" + this.f7989c.b().getName() + ".zip");
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
    }

    public final void a(File file) {
        this.f7989c = new b(file);
    }

    public final boolean a() {
        b bVar = this.f7989c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    private void a(com.apm.insight.entity.a aVar) {
        File fileA = com.apm.insight.l.j.a(this.f7989c.b());
        if (fileA.exists()) {
            try {
                String strA = com.apm.insight.l.f.a(fileA.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                JSONArray jSONArray = new JSONArray();
                if (strA != null) {
                    for (String str : strA.split(IOUtils.LINE_SEPARATOR_UNIX)) {
                        jSONArray.put(str);
                    }
                }
                aVar.a("native_log", (Object) jSONArray);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected File f7997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f7998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f7999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f8000d;

        public e() {
        }

        public final int a() {
            int i10;
            Throwable th2;
            if (!this.f7997a.exists() || !this.f7997a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f7997a));
                int iA = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iA = a(line);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = iA;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (iA == -1);
                com.apm.insight.a.a((Closeable) bufferedReader2);
                return iA;
            } catch (Throwable th4) {
                i10 = -1;
                th2 = th4;
            }
        }

        private int a(String str) {
            int i10 = this.f8000d;
            if (!str.startsWith(this.f7998b)) {
                return i10;
            }
            try {
                i10 = Integer.parseInt(str.split(this.f7999c)[1].trim());
            } catch (NumberFormatException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
            if (i10 < 0) {
                return -2;
            }
            return i10;
        }
    }

    private void b(com.apm.insight.entity.a aVar) {
        BufferedReader bufferedReader;
        File fileH = com.apm.insight.l.j.h(this.f7989c.b());
        if (!fileH.exists()) {
            NativeImpl.a(fileH.getAbsolutePath(), String.valueOf(com.apm.insight.e.i().getLogcatDumpCount()), String.valueOf(com.apm.insight.e.i().getLogcatLevel()));
        }
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.f7989c.f7991b.f().get("pid") + " ";
        try {
            bufferedReader = new BufferedReader(new FileReader(fileH));
            try {
                if (fileH.length() > 512000) {
                    bufferedReader.skip(fileH.length() - 512000);
                }
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(str)) {
                        jSONArray.put(line);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        com.apm.insight.a.a((Closeable) bufferedReader);
        aVar.a("logcat", (Object) jSONArray);
    }

    private static String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb2.append(str);
            } else {
                sb2.append(str.charAt(6));
                sb2.append(str.charAt(7));
                sb2.append(str.charAt(4));
                sb2.append(str.charAt(5));
                sb2.append(str.charAt(2));
                sb2.append(str.charAt(3));
                sb2.append(str.charAt(0));
                sb2.append(str.charAt(1));
                sb2.append(str.charAt(10));
                sb2.append(str.charAt(11));
                sb2.append(str.charAt(8));
                sb2.append(str.charAt(9));
                sb2.append(str.charAt(14));
                sb2.append(str.charAt(15));
                sb2.append(str.charAt(12));
                sb2.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb2.append((CharSequence) str, 16, 32);
                    sb2.append('0');
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
        return sb2.toString().toUpperCase();
    }
}
