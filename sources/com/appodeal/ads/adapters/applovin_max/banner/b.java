package com.appodeal.ads.adapters.applovin_max.banner;

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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MaxAdView f11983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.adapters.applovin_max.b f11984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MaxAdFormat f11985u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MaxAdView maxAdView, com.appodeal.ads.adapters.applovin_max.b bVar, MaxAdFormat maxAdFormat, Continuation continuation) {
        super(2, continuation);
        this.f11983s = maxAdView;
        this.f11984t = bVar;
        this.f11985u = maxAdFormat;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f11983s, this.f11984t, this.f11985u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f11982r;
        if (i10 == 0) {
            d.b(obj);
            MaxAdView maxAdView = this.f11983s;
            ArrayList arrayList = this.f11984t.f11977b;
            MaxAdFormat maxAdFormat = this.f11985u;
            Intrinsics.checkNotNull(maxAdFormat);
            this.f11982r = 1;
            if (h.a(maxAdView, arrayList, maxAdFormat, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.f11983s.loadAd();
        return Unit.f93236a;
    }
}
