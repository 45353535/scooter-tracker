package com.appodeal.ads.adapters.level_play.rewarded_video;

import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LevelPlayRewardedAd f12460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.level_play.b f12461t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LevelPlayRewardedAd levelPlayRewardedAd, com.appodeal.ads.adapters.level_play.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f12460s = levelPlayRewardedAd;
        this.f12461t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f12460s, this.f12461t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f12460s, this.f12461t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12459r;
        if (i10 == 0) {
            d.b(obj);
            ArrayList arrayList = this.f12461t.f12382c;
            this.f12459r = 1;
            if (com.appodeal.ads.adapters.level_play.mediation.k.i(arrayList, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.f12460s.loadAd();
        return Unit.f93236a;
    }
}
