package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.purchase.ADJPConstants;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f7864b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7865a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0162b f7869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, C0162b> f7870g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<File> f7866c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<File> f7867d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7868e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f7871h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f7872i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f7873j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    /* JADX INFO: renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    static class C0162b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f7888a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f7891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a f7892e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<a> f7889b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<a> f7890c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f7893f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7894g = 0;

        C0162b(String str) {
            this.f7888a = str;
        }
    }

    private b(Context context) {
        this.f7865a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.f7871h || this.f7870g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f7865a)) {
            e();
        }
        if (this.f7868e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.f7868e = 1;
            } else {
                this.f7868e = 0;
            }
        }
        boolean z10 = this.f7868e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f7865a);
        Iterator<C0162b> it = this.f7870g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z10, fVar);
        }
        Iterator<C0162b> it2 = this.f7870g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z10, fVar);
        }
        Iterator<C0162b> it3 = this.f7870g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f7865a, it3.next().f7888a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.f7871h = true;
        this.f7870g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.f7871h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f7865a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.f7872i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f7865a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            }
        }
    }

    public static b a() {
        if (f7864b == null) {
            synchronized (b.class) {
                try {
                    if (f7864b == null) {
                        f7864b = new b(com.apm.insight.e.g());
                    }
                } finally {
                }
            }
        }
        return f7864b;
    }

    public final void b() {
        try {
            if (!this.f7871h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.f7873j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.f7871h;
    }

    private void b(HashMap<String, C0162b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f7865a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0162b c0162b = map.get(name);
                    if (c0162b == null) {
                        c0162b = new C0162b(name);
                        map.put(name, c0162b);
                    }
                    c0162b.f7890c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f7883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f7884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f7885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        CrashType f7886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f7887e;

        a(File file, @Nullable CrashType crashType) {
            this.f7884b = -1L;
            this.f7885c = -1L;
            this.f7883a = file;
            this.f7886d = crashType;
            this.f7887e = file.getName();
        }

        a(File file, long j10, @Nullable CrashType crashType) {
            this.f7885c = -1L;
            this.f7883a = file;
            this.f7884b = j10;
            this.f7886d = crashType;
            this.f7887e = file.getName();
        }
    }

    public final void a(boolean z10) throws Throwable {
        if (!Npth.isStopUpload() && z10) {
            if (this.f7869f == null) {
                this.f7869f = new C0162b("old_uuid");
                HashMap<String, C0162b> map = new HashMap<>();
                this.f7870g = map;
                a(map);
                a(this.f7870g, this.f7869f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f7865a));
                b(this.f7870g);
                b(this.f7869f, true, null);
                a(this.f7869f, true, null);
                this.f7869f = null;
                if (this.f7870g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void b(final C0162b c0162b, boolean z10, @Nullable com.apm.insight.runtime.f fVar) {
        boolean z11;
        JSONObject jSONObjectA;
        if (c0162b.f7890c.size() <= 1 && c0162b.f7890c.isEmpty()) {
            c0162b.f7892e = c0162b.f7891d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f7865a);
        c0162b.f7892e = c0162b.f7891d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f7865a);
        for (a aVar2 : c0162b.f7890c) {
            final File file = aVar2.f7883a;
            try {
                aVar.a(file);
                jSONObjectA = a(aVar);
            } catch (Throwable th2) {
                th = th2;
                z11 = zB;
            }
            if (jSONObjectA != null && jSONObjectA.length() != 0) {
                if (jSONObjectA.length() != 0) {
                    if (!z10) {
                        long jOptLong = jSONObjectA.optLong("crash_time");
                        try {
                            a aVar3 = c0162b.f7892e;
                            if (aVar3 == null) {
                                c0162b.f7892e = aVar2;
                                c0162b.f7893f = true;
                                if (fVar == null || fVar.a("default")) {
                                    z11 = zB;
                                } else {
                                    aVar.i();
                                }
                            } else {
                                z11 = zB;
                                try {
                                    if (!c0162b.f7893f && jOptLong < aVar3.f7884b) {
                                        c0162b.f7892e = aVar2;
                                        if (fVar != null && !fVar.a("default")) {
                                            aVar.i();
                                            zB = z11;
                                        } else {
                                            a(file);
                                            c0162b.f7893f = true;
                                        }
                                    } else {
                                        com.apm.insight.entity.a.a(jSONObjectA, "filters", "aid", String.valueOf(jSONObjectA.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER).opt("aid")));
                                        jSONObjectA.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER).put("aid", 2010);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(file);
                                    zB = z11;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z11 = zB;
                        }
                    } else {
                        z11 = zB;
                        if (fVar != null && !fVar.a("default")) {
                            aVar.i();
                        }
                    }
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0162b.f7888a);
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                    if (z11) {
                        try {
                            c.a aVar4 = new c.a(jSONObjectA, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar4.c(), aVar4.a(), o.a().b(aVar4.b() == -1 ? System.currentTimeMillis() : aVar4.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public final void a(JSONObject jSONObject) {
                                    d.a();
                                    d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f7865a, c0162b.f7888a));
                                }
                            });
                            if (!aVar.i()) {
                                aVar.f();
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                        }
                    }
                    c.a(CrashType.NATIVE, jSONObjectA);
                } else {
                    z11 = zB;
                }
                zB = z11;
            } else {
                z11 = zB;
                aVar.i();
                zB = z11;
            }
        }
    }

    private void a(HashMap<String, C0162b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f7865a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0162b c0162b = map.get(name);
                    if (c0162b == null) {
                        c0162b = new C0162b(name);
                        map.put(name, c0162b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0162b.f7894g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:57:0x00d8, B:59:0x00e0, B:60:0x00e8, B:62:0x00f3, B:70:0x010b, B:65:0x00fd, B:67:0x0101, B:69:0x0109, B:54:0x00d0, B:55:0x00d3, B:56:0x00d6, B:38:0x00a7, B:41:0x00b1, B:44:0x00bb, B:71:0x0111, B:72:0x012e, B:29:0x0080), top: B:79:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:57:0x00d8, B:59:0x00e0, B:60:0x00e8, B:62:0x00f3, B:70:0x010b, B:65:0x00fd, B:67:0x0101, B:69:0x0109, B:54:0x00d0, B:55:0x00d3, B:56:0x00d6, B:38:0x00a7, B:41:0x00b1, B:44:0x00bb, B:71:0x0111, B:72:0x012e, B:29:0x0080), top: B:79:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:57:0x00d8, B:59:0x00e0, B:60:0x00e8, B:62:0x00f3, B:70:0x010b, B:65:0x00fd, B:67:0x0101, B:69:0x0109, B:54:0x00d0, B:55:0x00d3, B:56:0x00d6, B:38:0x00a7, B:41:0x00b1, B:44:0x00bb, B:71:0x0111, B:72:0x012e, B:29:0x0080), top: B:79:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0162b> r17, com.apm.insight.k.b.C0162b r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b):void");
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:97|38|39|(1:41)(1:43)|44|(18:46|89|47|(1:49)|91|55|56|87|57|70|71|93|72|(1:74)|75|78|69|113)(1:52)|53|(5:91|55|56|87|57)(4:64|(0)(1:68)|69|113)|70|71|93|72|(0)|75|78|69|113) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154 A[Catch: all -> 0x0166, TryCatch #4 {all -> 0x0166, blocks: (B:72:0x0148, B:74:0x0154, B:78:0x0168), top: B:93:0x0148 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.apm.insight.k.b.C0162b r19, boolean r20, @androidx.annotation.Nullable com.apm.insight.runtime.f r21) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.f):void");
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j10, long j11) {
        com.apm.insight.f.b bVar = null;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th2) {
                        th = th2;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b bVarA = com.apm.insight.l.f.a(file, crashType);
                try {
                    JSONObject jSONObjectB = bVarA.b();
                    try {
                        if (bVarA.b() != null) {
                            if (crashType == CrashType.ANR) {
                                return bVarA;
                            }
                            jSONObjectB.put("crash_time", j10);
                            boolean z11 = z10;
                            jSONObjectB.put("app_start_time", j11);
                            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = Header.a(j10).f();
                            } else if (z11) {
                                jSONObjectB.remove(POBCTAOverlayData.KEY_CTA_HEADER);
                            }
                            String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                            if (strOptString == null) {
                                strOptString = "2008-20250701130429";
                            }
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", ADJPConstants.KEY_SDK_VERSION, strOptString);
                            JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("logcat");
                            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                                jSONObjectB.put("logcat", com.apm.insight.runtime.h.a(str));
                            }
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", "true");
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(jSONObjectB, "logcat")));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", String.valueOf(Header.a()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", String.valueOf(Header.b()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                            jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.f7865a));
                            jSONObjectB.put("crash_uuid", file.getName());
                            try {
                                long j12 = Long.parseLong(com.apm.insight.runtime.b.a(j10, str));
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", Math.abs(j12 - j10) < 60000 ? "< 60s" : "> 60s");
                                jSONObjectB.put("lastAliveTime", String.valueOf(j12));
                            } catch (Throwable unused) {
                                jSONObjectB.put("lastAliveTime", "unknown");
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                            }
                            jSONObjectB.put("has_dump", "true");
                            if (jSONObjectB.opt(C4240b4.a.f42506k) == null) {
                                com.apm.insight.e.g();
                                com.apm.insight.entity.a.a(jSONObjectB, n.a());
                            }
                            if (Header.b(jSONObjectOptJSONObject)) {
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                            }
                            com.apm.insight.entity.d.b(jSONObjectB);
                            bVarA.b().put("upload_scene", "launch_scan");
                            if (z11) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObjectB.put(Reporting.Key.EVENT_TYPE, "start_crash");
                                jSONObjectB.put("stack", jSONObjectB.remove("data"));
                                jSONObject.put("data", new JSONArray().put(jSONObjectB));
                                jSONObject.put(POBCTAOverlayData.KEY_CTA_HEADER, jSONObjectOptJSONObject);
                                bVarA.a(jSONObject);
                                return bVarA;
                            }
                            jSONObjectB.put("isJava", 1);
                            return bVarA;
                        }
                        com.apm.insight.l.f.a(file);
                        return bVarA;
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = bVarA;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        com.apm.insight.l.f.a(file);
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        return bVar;
    }
}
