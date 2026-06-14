package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.z1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class d2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d2 f59466n = new d2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f59467a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f59468b = new u1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f59469c = new z1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2 f59470d = new i2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h8 f59471e = new h8();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r2 f59472f = new r2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f59473g = new s0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0 f59474h = new p0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n0 f59475i = new n0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ec f59476j = new ec();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z6 f59477k = new z6();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile String f59478l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile String f59479m = null;

    public static d2 b() {
        return f59466n;
    }

    public t1 a() {
        return this.f59468b.a();
    }

    public String a(Context context) {
        return this.f59468b.a(context);
    }

    public Map a(MyTargetConfig myTargetConfig, MyTargetPrivacy myTargetPrivacy, h6 h6Var, Context context) {
        Map mapA;
        Map map;
        Map mapA2;
        Map mapA3;
        HashMap map2;
        if (f0.a()) {
            gb.a("FingerprintDataProvider: You must not call collectData method from main thread");
            return Collections.EMPTY_MAP;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map mapA4 = this.f59467a.a(myTargetConfig, context);
        a(h6Var, 23, jCurrentTimeMillis);
        Map mapA5 = this.f59468b.a(myTargetConfig, context);
        long jA = a(h6Var, 10, jCurrentTimeMillis);
        Map mapA6 = this.f59476j.a(myTargetConfig, context);
        a(h6Var, 21, jA);
        Map mapA7 = this.f59475i.a(myTargetConfig, context);
        long jA2 = a(h6Var, 16, jA);
        Map mapA8 = this.f59477k.a(myTargetConfig, context);
        a(h6Var, 22, jA2);
        Map map3 = new HashMap();
        if (myTargetPrivacy.isConsent()) {
            this.f59469c.b(myTargetConfig, context);
            long jA3 = a(h6Var, 15, jA2);
            Map mapA9 = this.f59470d.a(myTargetConfig, context);
            long jA4 = a(h6Var, 11, jA3);
            Map mapA10 = this.f59471e.a(myTargetConfig, context);
            long jA5 = a(h6Var, 14, jA4);
            mapA2 = this.f59472f.a(myTargetConfig, context);
            long jA6 = a(h6Var, 13, jA5);
            mapA3 = this.f59474h.a(myTargetConfig, context);
            long jA7 = a(h6Var, 17, jA6);
            mapA = this.f59473g.a(myTargetConfig, context);
            a(h6Var, 18, jA7);
            map = mapA9;
            map3 = mapA10;
        } else {
            mapA = map3;
            map = mapA;
            mapA2 = map;
            mapA3 = mapA2;
        }
        synchronized (this) {
            try {
                map2 = new HashMap();
                map2.putAll(mapA4);
                map2.putAll(mapA5);
                map2.putAll(mapA6);
                map2.putAll(mapA7);
                map2.putAll(mapA8);
                if (myTargetPrivacy.isConsent()) {
                    z1.d dVarA = this.f59469c.a();
                    if (h6Var != null) {
                        h6Var.b(15, dVarA.a());
                    }
                    map2.putAll(dVarA.b());
                    map2.putAll(map);
                    map2.putAll(map3);
                    map2.putAll(mapA2);
                    map2.putAll(mapA3);
                    map2.putAll(mapA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    public String a(MyTargetConfig myTargetConfig, MyTargetPrivacy myTargetPrivacy, Context context) {
        if (f0.a()) {
            gb.a("FingerprintDataProvider: You must not call getBidderToken method from main thread");
            return "";
        }
        if (this.f59478l == null) {
            synchronized (this) {
                try {
                    if (this.f59478l == null) {
                        HashMap map = new HashMap();
                        map.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
                        map.putAll(this.f59468b.a(myTargetConfig, context));
                        this.f59478l = y1.a(map);
                        map.putAll(this.f59470d.a(myTargetConfig, context));
                        map.putAll(this.f59472f.a(myTargetConfig, context));
                        this.f59479m = y1.a(map);
                    }
                } finally {
                }
            }
        }
        String str = myTargetPrivacy.isConsent() ? this.f59479m : this.f59478l;
        return str != null ? str : "";
    }

    public void a(MyTargetConfig myTargetConfig, Context context) {
        if (f0.a()) {
            gb.a("FingerprintDataProvider: You must not call collectData method from main thread");
            return;
        }
        this.f59467a.a(myTargetConfig, context);
        this.f59468b.a(myTargetConfig, context);
        this.f59470d.a(myTargetConfig, context);
        this.f59472f.a(myTargetConfig, context);
    }

    public final long a(h6 h6Var, int i10, long j10) {
        if (h6Var == null) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        h6Var.b(i10, jCurrentTimeMillis - j10);
        return jCurrentTimeMillis;
    }
}
