package com.appodeal.ads.adapters.applovin_max.mrec;

import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
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
    public int f12054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MaxAdView f12055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.applovin_max.b f12056t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MaxAdView maxAdView, com.appodeal.ads.adapters.applovin_max.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f12055s = maxAdView;
        this.f12056t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f12055s, this.f12056t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f12055s, this.f12056t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12054r;
        if (i10 == 0) {
            d.b(obj);
            MaxAdView maxAdView = this.f12055s;
            ArrayList arrayList = this.f12056t.f11977b;
            MaxAdFormat MREC = MaxAdFormat.MREC;
            Intrinsics.checkNotNullExpressionValue(MREC, "MREC");
            this.f12054r = 1;
            if (h.a(maxAdView, arrayList, MREC, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.f12055s.loadAd();
        return Unit.f93236a;
    }
}
