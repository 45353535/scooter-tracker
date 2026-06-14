package com.startapp.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.ACMConfig;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f65059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65060d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f65062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f65063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f65064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f65065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f65066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lb f65067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lb f65068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lb f65069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lb f65070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lb f65071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb f65072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lb f65073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lb f65074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lb f65075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lb f65076t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f65057a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f65058b = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f65061e = new ConcurrentLinkedQueue();

    public p(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10, lb lbVar11, lb lbVar12, lb lbVar13) {
        this.f65063g = context;
        this.f65065i = lbVar;
        this.f65066j = lbVar2;
        this.f65064h = lbVar3;
        this.f65067k = lbVar4;
        this.f65068l = lbVar5;
        this.f65069m = lbVar6;
        this.f65070n = lbVar7;
        this.f65071o = lbVar8;
        this.f65072p = lbVar9;
        this.f65073q = lbVar10;
        this.f65074r = lbVar11;
        this.f65075s = lbVar12;
        this.f65076t = lbVar13;
    }

    public final /* synthetic */ p a() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f b(CacheKey cacheKey) {
        x2 x2Var;
        ?? r82;
        if (cacheKey == null || (x2Var = (x2) this.f65057a.get(cacheKey)) == null || (r82 = x2Var.f65514o) == 0 || !r82.isReady()) {
            return null;
        }
        ?? r83 = x2Var.f65514o;
        x2Var.f65522w = 0;
        x2Var.f65524y = null;
        if (!i0.f64666f.booleanValue() && x2Var.f65523x && CacheMetaData.d() && MetaData.E().f0()) {
            x2Var.a(null, null, true, true, null);
            return r83;
        }
        if (!x2Var.f65523x) {
            m mVar = x2Var.f65525z;
            if (mVar != null) {
                mVar.a(x2Var);
            }
            r2 r2Var = x2Var.f65519t;
            if (r2Var != null) {
                r2Var.e();
            }
        }
        return r83;
    }

    public final void a(AdPreferences.Placement placement) {
        try {
            String str = "90db0b5573c3d1f6_" + q0.a(this.f65063g) + '_' + placement.getIndex();
            ((SharedPreferences) this.f65065i.a()).edit().putLong(str, Math.max(((SharedPreferences) this.f65065i.a()).getLong(str, 0L), 0L) + 1).apply();
            ACMConfig aCMConfigA = CacheMetaData.b().a();
            ComponentInfoEventConfig componentInfoEventConfigD = aCMConfigA != null ? aCMConfigA.d() : null;
            if (componentInfoEventConfigD == null || !componentInfoEventConfigD.a(1)) {
                return;
            }
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "ACM.opf";
            g9Var.f64554e = String.valueOf(placement.getIndex());
            g9Var.a();
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.startapp.sdk.adsbase.cache.CacheKey a(com.startapp.sdk.adsbase.StartAppAd r10, com.startapp.sdk.adsbase.StartAppAd.AdMode r11, com.startapp.sdk.adsbase.model.AdPreferences r12, com.startapp.sdk.adsbase.k r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.p.a(com.startapp.sdk.adsbase.StartAppAd, com.startapp.sdk.adsbase.StartAppAd$AdMode, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.k, java.lang.String):com.startapp.sdk.adsbase.cache.CacheKey");
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f a(CacheKey cacheKey) {
        x2 x2Var = cacheKey != null ? (x2) this.f65057a.get(cacheKey) : null;
        if (x2Var != null) {
            return x2Var.f65514o;
        }
        return null;
    }

    public final CacheKey a(StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, boolean z10, int i10, com.startapp.sdk.adsbase.k kVar, String str) throws Throwable {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        AdPreferences adPreferences2 = adPreferences == null ? new AdPreferences() : adPreferences;
        CacheKey cacheKey = str != null ? new CacheKey(placement, adPreferences2, UUID.randomUUID().toString()) : new CacheKey(placement, adPreferences2);
        if (this.f65060d && !z10) {
            this.f65061e.add(new o(startAppAd, placement, adPreferences2, kVar));
            return cacheKey;
        }
        AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
        ConcurrentHashMap concurrentHashMap3 = this.f65057a;
        synchronized (concurrentHashMap3) {
            try {
                try {
                    x2 x2Var = (x2) this.f65057a.get(cacheKey);
                    if (x2Var == null) {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            concurrentHashMap = concurrentHashMap3;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        concurrentHashMap = concurrentHashMap3;
                                                    }
                                                    try {
                                                        concurrentHashMap2 = concurrentHashMap3;
                                                        x2 x2Var2 = new x2(this.f65063g, placement, adPreferences3, this.f65067k, this.f65068l, this.f65069m, new lb(new k7() { // from class: com.startapp.sdk.internal.nm
                                                            @Override // com.startapp.sdk.internal.k7
                                                            public final Object a() {
                                                                return this.f64973a.a();
                                                            }
                                                        }), this.f65070n, this.f65071o, this.f65073q, this.f65074r, this.f65075s, this.f65076t);
                                                        if (this.f65062f == null) {
                                                            this.f65062f = new m(this);
                                                        }
                                                        x2Var2.f65525z = this.f65062f;
                                                        if (z10) {
                                                            x2Var2.f65517r = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                                                            x2Var2.f65518s = true;
                                                            x2Var2.f65522w = i10;
                                                        }
                                                        a(cacheKey, x2Var2);
                                                        x2Var = x2Var2;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        concurrentHashMap = concurrentHashMap3;
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    concurrentHashMap = concurrentHashMap3;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                concurrentHashMap = concurrentHashMap3;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            concurrentHashMap = concurrentHashMap3;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        concurrentHashMap = concurrentHashMap3;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    concurrentHashMap = concurrentHashMap3;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                concurrentHashMap = concurrentHashMap3;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            concurrentHashMap = concurrentHashMap3;
                        }
                    } else {
                        concurrentHashMap2 = concurrentHashMap3;
                        x2Var.f65513n = adPreferences3;
                    }
                    ((z6) ((y6) this.f65067k.a())).a(startAppAd, x2Var);
                    CacheKey cacheKey2 = cacheKey;
                    x2Var.a(startAppAd, kVar, false, true, str);
                    return cacheKey2;
                } catch (Throwable th12) {
                    th = th12;
                    concurrentHashMap = concurrentHashMap3;
                }
            } catch (Throwable th13) {
                th = th13;
            }
        }
    }

    public final void a(CacheKey cacheKey, x2 x2Var) {
        synchronized (this.f65057a) {
            try {
                int iE = CacheMetaData.b().a().e();
                if (iE != 0 && this.f65057a.size() >= iE) {
                    long j10 = Long.MAX_VALUE;
                    CacheKey cacheKey2 = null;
                    for (CacheKey cacheKey3 : this.f65057a.keySet()) {
                        x2 x2Var2 = (x2) this.f65057a.get(cacheKey3);
                        if (x2Var2.f65511l == x2Var.f65511l) {
                            long j11 = x2Var2.f65516q;
                            if (j11 < j10) {
                                cacheKey2 = cacheKey3;
                                j10 = j11;
                            }
                        }
                    }
                    if (cacheKey2 != null) {
                        this.f65057a.remove(cacheKey2);
                    }
                }
                this.f65057a.put(cacheKey, x2Var);
                if (Math.random() * 100.0d < CacheMetaData.b().c()) {
                    g9 g9Var = new g9(h9.f64609d);
                    g9Var.f64553d = "Cache Size";
                    g9Var.f64554e = String.valueOf(this.f65057a.size());
                    g9Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
