package com.appodeal.ads.adapters.level_play.mediation.amazon;

import com.amazon.device.ads.DTBAdNetwork;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdSize;
import com.appodeal.ads.ext.LogExtKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DTBAdSize f12421s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DTBAdSize dTBAdSize, Continuation continuation) {
        super(2, continuation);
        this.f12421s = dTBAdSize;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f12421s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f12421s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12420r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return obj;
        }
        d.b(obj);
        DTBAdSize dTBAdSize = this.f12421s;
        this.f12420r = 1;
        e eVar = new e(pf.b.d(this), 1);
        eVar.I();
        LogExtKt.logInternal$default("AmazonAdLoader", "load call for ad type: " + dTBAdSize, null, 4, null);
        DTBAdRequest dTBAdRequest = new DTBAdRequest(new DTBAdNetworkInfo(DTBAdNetwork.UNITY_LEVELPLAY));
        dTBAdRequest.setSizes(dTBAdSize);
        dTBAdRequest.loadAd(new a(eVar, dTBAdSize));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(this);
        }
        return objC == objG ? objG : objC;
    }
}
