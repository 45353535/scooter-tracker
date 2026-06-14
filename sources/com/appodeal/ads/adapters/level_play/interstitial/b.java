package com.appodeal.ads.adapters.level_play.interstitial;

import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LevelPlayInterstitialAd f12407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.level_play.b f12408t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LevelPlayInterstitialAd levelPlayInterstitialAd, com.appodeal.ads.adapters.level_play.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f12407s = levelPlayInterstitialAd;
        this.f12408t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f12407s, this.f12408t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f12407s, this.f12408t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12406r;
        if (i10 == 0) {
            d.b(obj);
            ArrayList arrayList = this.f12408t.f12382c;
            this.f12406r = 1;
            if (com.appodeal.ads.adapters.level_play.mediation.k.c(arrayList, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.f12407s.loadAd();
        return Unit.f93236a;
    }
}
