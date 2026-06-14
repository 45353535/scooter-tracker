package com.appodeal.ads.adapters.level_play.banner;

import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LevelPlayBannerAdView f12387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.level_play.b f12388t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdSize f12389u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LevelPlayBannerAdView levelPlayBannerAdView, com.appodeal.ads.adapters.level_play.b bVar, LevelPlayAdSize levelPlayAdSize, Continuation continuation) {
        super(2, continuation);
        this.f12387s = levelPlayBannerAdView;
        this.f12388t = bVar;
        this.f12389u = levelPlayAdSize;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f12387s, this.f12388t, this.f12389u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12386r;
        if (i10 == 0) {
            d.b(obj);
            ArrayList arrayList = this.f12388t.f12382c;
            LevelPlayAdSize levelPlayAdSize = this.f12389u;
            this.f12386r = 1;
            if (com.appodeal.ads.adapters.level_play.mediation.k.b(arrayList, levelPlayAdSize, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.f12387s.loadAd();
        return Unit.f93236a;
    }
}
