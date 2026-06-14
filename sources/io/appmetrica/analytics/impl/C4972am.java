package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4972am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f76851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f76852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Xl f76853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f76854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f76855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f76856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f76858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4965af f76859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f76860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K3 f76861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E6 f76862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C4960aa f76863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z9 f76864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ro f76865o;

    public C4972am(Context context, C4965af c4965af) {
        this(c4965af, new P(), new K3(), C5186j4.l().a(context), new E6(), new C4960aa(), new Z9(), new ro());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set r0 = io.appmetrica.analytics.impl.AbstractC5127gm.f77275a     // Catch: java.lang.Throwable -> L27
            java.util.Set r0 = kotlin.collections.CollectionsKt.intersect(r9, r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r8.a(r0)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L27
        Lf:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L29
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r4 = r8.f76851a     // Catch: java.lang.Throwable -> L27
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lf
            r9 = r3
            goto L2a
        L27:
            r9 = move-exception
            goto L46
        L29:
            r9 = r2
        L2a:
            long r4 = r8.f76858h     // Catch: java.lang.Throwable -> L27
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r1 = io.appmetrica.analytics.impl.AbstractC5127gm.f77276b     // Catch: java.lang.Throwable -> L27
            long r6 = r1.currentTimeSeconds()     // Catch: java.lang.Throwable -> L27
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L38
            r1 = r3
            goto L39
        L38:
            r1 = r2
        L39:
            if (r0 == 0) goto L43
            if (r9 != 0) goto L43
            if (r1 != 0) goto L43
            boolean r9 = r8.f76857g     // Catch: java.lang.Throwable -> L27
            if (r9 == 0) goto L44
        L43:
            r2 = r3
        L44:
            monitor-exit(r8)
            return r2
        L46:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L27
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4972am.a(java.util.List):boolean");
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f76852b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            ro roVar = this.f76865o;
            String str = identifiersResult.f78675id;
            roVar.getClass();
            if (ro.a(str)) {
                this.f76852b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C5012ca c5012ca;
        C4965af c4965afD = this.f76859i.i((IdentifiersResult) this.f76852b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f76852b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f76852b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f76852b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f76852b.get("appmetrica_report_ad_url")).e(this.f76856f).h((IdentifiersResult) this.f76852b.get("appmetrica_clids")).j(Jm.a((Map) this.f76855e)).f((IdentifiersResult) this.f76852b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f76852b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f76852b.get("appmetrica_yandex_adv_id")).b(this.f76857g).c(this.f76862l.f75727d).d(this.f76858h);
        C4960aa c4960aa = this.f76863m;
        synchronized (c4960aa) {
            c5012ca = c4960aa.f76807b;
        }
        c4965afD.a(c5012ca).b();
    }

    public C4972am(C4965af c4965af, P p10, K3 k32, Cd cd2, E6 e62, C4960aa c4960aa, Z9 z92, ro roVar) {
        HashSet hashSet = new HashSet();
        this.f76851a = hashSet;
        this.f76852b = new HashMap();
        this.f76853c = new Xl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f76859i = c4965af;
        this.f76860j = p10;
        this.f76861k = k32;
        this.f76862l = e62;
        this.f76863m = c4960aa;
        this.f76864n = z92;
        this.f76865o = roVar;
        c(cd2.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c4965af.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c4965af.i());
        a("appmetrica_get_ad_url", c4965af.d());
        a("appmetrica_report_ad_url", c4965af.e());
        b(c4965af.o());
        a("appmetrica_google_adv_id", c4965af.l());
        a("appmetrica_huawei_oaid", c4965af.m());
        a("appmetrica_yandex_adv_id", c4965af.r());
        e62.a(c4965af.h());
        c4960aa.a(c4965af.k());
        this.f76854d = c4965af.g();
        String strI = c4965af.i((String) null);
        this.f76855e = strI != null ? Jm.a(strI) : null;
        this.f76857g = c4965af.a(true);
        this.f76856f = c4965af.b(0L);
        this.f76858h = c4965af.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f76852b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.f78675id.isEmpty()) {
            return no.a((Map) this.f76855e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f78675id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f78675id)) {
            return;
        }
        this.f76852b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f76852b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f76862l.f75726c.get(str2);
                }
                if (identifiersResult == null) {
                    C5012ca c5012ca = this.f76863m.f76807b;
                    if (!Intrinsics.areEqual(str2, "appmetrica_lib_ssl_enabled") || (bool = c5012ca.f76960a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c5012ca.f76961b;
                        String str3 = c5012ca.f76962c;
                        if (zBooleanValue) {
                            str = "true";
                        } else if (!zBooleanValue) {
                            str = "false";
                        } else {
                            throw new lf.m();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f76857g || a(identifiersResult) || (identifiersResult.f78675id.isEmpty() && !no.a((Map) this.f76855e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f78675id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
