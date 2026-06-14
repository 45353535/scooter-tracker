package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* JADX INFO: loaded from: classes11.dex */
public final class gj implements ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek f64582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f64583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f64584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij f64585d;

    public gj(ij ijVar, ek ekVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f64585d = ijVar;
        this.f64582a = ekVar;
        this.f64583b = cachedVideoAd;
        this.f64584c = context;
    }

    @Override // com.startapp.sdk.internal.ek
    public final void a(String str) {
        ek ekVar = this.f64582a;
        if (ekVar != null) {
            ekVar.a(str);
        }
        if (str != null) {
            this.f64583b.a(System.currentTimeMillis());
            this.f64583b.a(str);
            ij ijVar = this.f64585d;
            Context context = this.f64584c;
            CachedVideoAd cachedVideoAd = this.f64583b;
            ijVar.f64722a.remove(cachedVideoAd);
            ijVar.a(AdsCommonMetaData.k().F().c() - 1);
            ijVar.f64722a.add(cachedVideoAd);
            g7.b(context, "CachedAds", ijVar.f64722a);
        }
    }
}
