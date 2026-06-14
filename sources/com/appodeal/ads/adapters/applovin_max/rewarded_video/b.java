package com.appodeal.ads.adapters.applovin_max.rewarded_video;

import com.applovin.mediation.ads.MaxRewardedAd;
import com.appodeal.ads.adapters.applovin_max.mediation.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MaxRewardedAd f12072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.applovin_max.b f12073t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MaxRewardedAd maxRewardedAd, com.appodeal.ads.adapters.applovin_max.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f12072s = maxRewardedAd;
        this.f12073t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f12072s, this.f12073t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f12072s, this.f12073t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12071r;
        if (i10 == 0) {
            d.b(obj);
            MaxRewardedAd maxRewardedAd = this.f12072s;
            Intrinsics.checkNotNull(maxRewardedAd);
            ArrayList arrayList = this.f12073t.f11977b;
            this.f12071r = 1;
            if (h.c(maxRewardedAd, arrayList, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.f12072s.loadAd();
        return Unit.f93236a;
    }
}
