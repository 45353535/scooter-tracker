package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Sl implements Tl {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f76453k = DesugarCollections.unmodifiableMap(new Pl());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bi f76455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4972am f76456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f76457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f76458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ql f76459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f76460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakHashMap f76461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f76462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f76463j;

    public Sl(@NonNull Context context, Bi bi2, C4965af c4965af, @NonNull Handler handler) {
        this(bi2, new C4972am(context, c4965af), handler);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        synchronized (this.f76460g) {
            try {
                C4972am c4972am = this.f76456c;
                c4972am.getClass();
                if (!no.a((Map) map) && !no.a(map, c4972am.f76855e)) {
                    c4972am.f76855e = new HashMap(map);
                    c4972am.f76857g = true;
                    c4972am.c();
                }
                a(startupParamsCallback, list);
                if (this.f76456c.a((List) list)) {
                    a(list, new Rl(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:12:0x0085, B:14:0x00b4, B:15:0x00bb, B:17:0x00c1, B:18:0x00c8, B:20:0x00dd, B:23:0x00e8, B:24:0x00f4, B:21:0x00e2, B:11:0x0082), top: B:30:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Sl.b(android.os.Bundle):void");
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final H6 c() {
        return this.f76459f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f76456c.f76852b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f78675id;
    }

    @NonNull
    public final C5063ea e() {
        C5012ca c5012ca;
        C4972am c4972am = this.f76456c;
        Z9 z92 = c4972am.f76864n;
        C4960aa c4960aa = c4972am.f76863m;
        synchronized (c4960aa) {
            c5012ca = c4960aa.f76807b;
        }
        z92.getClass();
        Boolean bool = c5012ca.f76960a;
        return new C5063ea();
    }

    public final long f() {
        return this.f76456c.f76856f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f76456c.f76852b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f78675id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f76461h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f76456c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f76460g) {
            try {
                if (!this.f76463j || this.f76456c.b()) {
                    this.f76463j = true;
                    a(this.f76454a, this.f76459f, this.f76462i, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Sl(Bi bi2, C4972am c4972am, Handler handler) {
        this.f76454a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f76460g = new Object();
        this.f76461h = new WeakHashMap();
        this.f76463j = false;
        this.f76455b = bi2;
        this.f76456c = c4972am;
        this.f76457d = handler;
        this.f76459f = new Ql(this);
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f76458e = publicLogger;
    }

    public final void a(List list, H6 h62, Map map, boolean z10) {
        I6 i62 = new I6(this.f76457d, h62);
        Bi bi2 = this.f76455b;
        bi2.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C5064eb(i62, list, map, z10));
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = D9.f75657a;
        U3 u32 = new U3("", "", 1536, 0, anonymousInstance);
        u32.f76626m = bundle;
        M4 m42 = bi2.f75592a;
        bi2.a(Bi.a(u32, m42), m42, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (no.a((Map) map)) {
            return;
        }
        synchronized (this.f76460g) {
            try {
                HashMap mapB = Jm.b(map);
                this.f76462i = mapB;
                this.f76455b.a(mapB);
                C4972am c4972am = this.f76456c;
                c4972am.getClass();
                if (!no.a((Map) mapB) && !no.a(mapB, c4972am.f76855e)) {
                    c4972am.f76855e = new HashMap(mapB);
                    c4972am.f76857g = true;
                    c4972am.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f76460g) {
            this.f76455b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Nl nl;
        if (this.f76461h.containsKey(startupParamsCallback)) {
            List list = (List) this.f76461h.get(startupParamsCallback);
            if (this.f76456c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i10 = bundle.getInt("startup_error_key_code");
                    nl = Nl.UNKNOWN;
                    if (i10 == 1) {
                        nl = Nl.NETWORK;
                    } else if (i10 == 2) {
                        nl = Nl.PARSE;
                    }
                } else {
                    nl = null;
                }
                if (nl == null) {
                    if (!this.f76456c.a()) {
                        PublicLogger publicLogger = this.f76458e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f76462i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        nl = Nl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f76453k, nl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f76461h.remove(startupParamsCallback);
            if (this.f76461h.isEmpty()) {
                C5334p0 c5334p0 = this.f76455b.f75595d;
                synchronized (c5334p0.f77945f) {
                    c5334p0.f77942c = false;
                    c5334p0.c();
                }
            }
        }
    }

    public final void b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        synchronized (this.f76460g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f76460g) {
            try {
                List list2 = this.f76456c.f76854d;
                if (no.a((Collection) list)) {
                    if (!no.a((Collection) list2)) {
                        C4972am c4972am = this.f76456c;
                        c4972am.f76854d = null;
                        c4972am.f76859i.a((List<String>) null);
                        this.f76455b.a((List) null);
                    }
                } else if (!no.a(list, list2)) {
                    C4972am c4972am2 = this.f76456c;
                    c4972am2.f76854d = list;
                    c4972am2.f76859i.a(list);
                    this.f76455b.a(list);
                } else {
                    this.f76455b.a(list2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap map = new HashMap();
        C4972am c4972am = this.f76456c;
        synchronized (c4972am) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c4972am.f76852b.get(str);
                    if (identifiersResult != null) {
                        map.put(str, c4972am.f76853c.a(identifiersResult));
                    }
                }
                c4972am.f76862l.a(list, map);
                c4972am.f76863m.a(list, map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new StartupParamsCallback.Result(map);
    }

    public final void b(@Nullable String str) {
        synchronized (this.f76460g) {
            this.f76455b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f76456c.f76852b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f78675id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC5295nb.a(str);
        }
        return this.f76462i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f76461h.isEmpty()) {
            C5334p0 c5334p0 = this.f76455b.f75595d;
            synchronized (c5334p0.f77945f) {
                c5334p0.f77942c = true;
                c5334p0.b();
            }
        }
        this.f76461h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        C4972am c4972am = this.f76456c;
        P p10 = c4972am.f76860j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c4972am.f76852b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c4972am.f76852b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c4972am.f76852b.get("appmetrica_yandex_adv_id");
        p10.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}
