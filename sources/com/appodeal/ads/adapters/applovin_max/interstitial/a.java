package com.appodeal.ads.adapters.applovin_max.interstitial;

import com.applovin.mediation.ads.MaxInterstitialAd;
import com.appodeal.ads.adapters.applovin_max.mediation.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MaxInterstitialAd f12014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.applovin_max.b f12015t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MaxInterstitialAd maxInterstitialAd, com.appodeal.ads.adapters.applovin_max.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f12014s = maxInterstitialAd;
        this.f12015t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f12014s, this.f12015t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f12014s, this.f12015t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12013r;
        if (i10 == 0) {
            d.b(obj);
            MaxInterstitialAd maxInterstitialAd = this.f12014s;
            ArrayList arrayList = this.f12015t.f11977b;
            this.f12013r = 1;
            if (h.b(maxInterstitialAd, arrayList, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.f12014s.loadAd();
        return Unit.f93236a;
    }
}
