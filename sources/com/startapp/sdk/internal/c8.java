package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public class c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences f64341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f64342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MetaData f64343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BannerMetaData f64344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CacheMetaData f64345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AdInformationMetaData f64346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdsCommonMetaData f64347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k7 f64348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f64349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64350l;

    public c8(Context context, lb lbVar, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, k7 k7Var, int i10) {
        this.f64339a = context;
        this.f64340b = lbVar;
        this.f64341c = adPreferences;
        this.f64342d = metaDataRequest$RequestReason;
        this.f64348j = k7Var;
        this.f64349k = i10;
    }

    public final void a(final Boolean bool) {
        m8 m8Var = (m8) com.startapp.sdk.components.a.a(this.f64339a).f64198y.a();
        m8Var.f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.ql
            @Override // java.lang.Runnable
            public final void run() {
                this.f65173b.b(bool);
            }
        });
    }

    public final void b() {
        ((Executor) com.startapp.sdk.components.a.a(this.f64339a).A.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.rl
            @Override // java.lang.Runnable
            public final void run() {
                this.f65229b.c();
            }
        });
    }

    public final /* synthetic */ void c() {
        a(a());
    }

    public final void d() {
        synchronized (MetaData.H()) {
            try {
                if ((this.f64348j == null ? true : Integer.valueOf(this.f64349k).equals(this.f64348j.a())) && this.f64343e != null) {
                    WeakHashMap weakHashMap = vi.f65408a;
                    if (this.f64347i != null) {
                        try {
                            if (!vi.a((Object) AdsCommonMetaData.k(), (Object) this.f64347i)) {
                                this.f64350l = true;
                                AdsCommonMetaData.a(this.f64339a, this.f64347i);
                            }
                        } catch (Throwable th2) {
                            g9.a(th2);
                        }
                    }
                    WeakHashMap weakHashMap2 = vi.f65408a;
                    if (this.f64344f != null) {
                        try {
                            if (!vi.a((Object) BannerMetaData.c(), (Object) this.f64344f)) {
                                this.f64350l = true;
                                BannerMetaData.a(this.f64339a, this.f64344f);
                            }
                        } catch (Throwable th3) {
                            g9.a(th3);
                        }
                    }
                    WeakHashMap weakHashMap3 = vi.f65408a;
                    if (this.f64345g != null) {
                        try {
                            if (!vi.a((Object) CacheMetaData.b(), (Object) this.f64345g)) {
                                this.f64350l = true;
                                CacheMetaData.a(this.f64339a, this.f64345g);
                            }
                        } catch (Throwable th4) {
                            g9.a(th4);
                        }
                    }
                    WeakHashMap weakHashMap4 = vi.f65408a;
                    if (this.f64346h != null) {
                        try {
                            if (!vi.a((Object) AdInformationMetaData.c(), (Object) this.f64346h)) {
                                this.f64350l = true;
                                AdInformationMetaData.a(this.f64339a, this.f64346h);
                            }
                        } catch (Throwable th5) {
                            g9.a(th5);
                        }
                    }
                    try {
                        MetaData.a(this.f64339a, this.f64343e.k());
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Boolean bool) {
        MetaData metaData;
        WeakHashMap weakHashMap = vi.f65408a;
        synchronized (MetaData.H()) {
            try {
                if (this.f64348j == null ? true : Integer.valueOf(this.f64349k).equals(this.f64348j.a())) {
                    if (!Boolean.TRUE.equals(bool) || (metaData = this.f64343e) == null) {
                        MetaData.a(this.f64342d);
                    } else {
                        MetaData.a(this.f64339a, metaData, this.f64342d, this.f64350l);
                    }
                }
            } catch (Throwable th2) {
                g9.a(th2);
            } finally {
            }
        }
    }

    public Boolean a() {
        try {
            mc mcVar = new mc(this.f64339a, (vf) com.startapp.sdk.components.a.a(this.f64339a).G.a(), this.f64342d);
            mcVar.a(this.f64339a, this.f64341c);
            String strA = a(this.f64339a, mcVar);
            if (TextUtils.isEmpty(strA)) {
                return Boolean.FALSE;
            }
            MetaData metaData = (MetaData) JsonParser.fromJson(strA, MetaData.class);
            this.f64343e = metaData;
            if (metaData == null) {
                return Boolean.FALSE;
            }
            if (metaData.m() != null) {
                r0 r0Var = (r0) com.startapp.sdk.components.a.a(this.f64339a).f64186m.a();
                String strM = this.f64343e.m();
                if (strM != null) {
                    strM = strM.trim();
                }
                synchronized (r0Var.f65176a) {
                    uf ufVarEdit = r0Var.f65177b.edit();
                    ufVarEdit.a("31721150b470a3b9", strM);
                    ufVarEdit.f65346a.putString("31721150b470a3b9", strM);
                    ufVarEdit.f65346a.commit();
                }
            }
            WeakHashMap weakHashMap = vi.f65408a;
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) JsonParser.fromJson(strA, AdsCommonMetaData.class);
            if (adsCommonMetaData != null) {
                this.f64347i = adsCommonMetaData;
            }
            BannerMetaData bannerMetaData = (BannerMetaData) JsonParser.fromJson(strA, BannerMetaData.class);
            if (bannerMetaData != null) {
                this.f64344f = bannerMetaData;
            }
            CacheMetaData cacheMetaData = (CacheMetaData) JsonParser.fromJson(strA, CacheMetaData.class);
            if (cacheMetaData != null) {
                this.f64345g = cacheMetaData;
            }
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) JsonParser.fromJson(strA, AdInformationMetaData.class);
            if (adInformationMetaData != null) {
                this.f64346h = adInformationMetaData;
            }
            d();
            return Boolean.TRUE;
        } catch (Throwable th2) {
            g9.a(th2);
            return Boolean.FALSE;
        }
    }

    public final Void b(p8 p8Var) {
        y6 y6Var = (y6) this.f64340b.a();
        WeakHashMap weakHashMap = vi.f65408a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }

    public final String a(Context context, mc mcVar) {
        String strB;
        q8 q8Var = (q8) com.startapp.sdk.components.a.a(context).f64187n.a();
        MetaData metaData = this.f64343e;
        double dY = metaData != null ? metaData.y() : 0.0d;
        for (String str : MetaData.E().I()) {
            if (vi.a(dY)) {
                p8 p8Var = new p8(q8Var, str + i0.f64664d);
                p8Var.f65092c = mcVar.a(((HttpClientConfig) q8Var.f65149f.a()).e());
                new i7() { // from class: com.startapp.sdk.internal.sl
                    @Override // com.startapp.sdk.internal.i7
                    public final Object a(Object obj) {
                        return this.f65272b.a((p8) obj);
                    }
                }.a(p8Var);
                p8Var.f65093d = ((HttpClientConfig) q8Var.f65149f.a()).a(2);
                strB = p8Var.b();
            } else {
                p8 p8Var2 = new p8(q8Var, mcVar.a(str + i0.f64664d));
                new i7() { // from class: com.startapp.sdk.internal.tl
                    @Override // com.startapp.sdk.internal.i7
                    public final Object a(Object obj) {
                        return this.f65325b.b((p8) obj);
                    }
                }.a(p8Var2);
                p8Var2.f65093d = ((HttpClientConfig) q8Var.f65149f.a()).a(2);
                t8 t8VarA = p8Var2.a();
                strB = t8VarA != null ? t8VarA.f65299b : null;
            }
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            if (!((g6) com.startapp.sdk.components.a.a(context).f64193t.a()).b()) {
                break;
            }
        }
        return null;
    }

    public final Void a(p8 p8Var) {
        y6 y6Var = (y6) this.f64340b.a();
        WeakHashMap weakHashMap = vi.f65408a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }
}
