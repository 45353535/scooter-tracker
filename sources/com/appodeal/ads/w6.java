package com.appodeal.ads;

import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class w6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w5 f15185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f15186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f15187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0 f15188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f15189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(w5 w5Var, Function0 function0, w wVar, l0 l0Var, long j10, Continuation continuation) {
        super(2, continuation);
        this.f15185s = w5Var;
        this.f15186t = function0;
        this.f15187u = wVar;
        this.f15188v = l0Var;
        this.f15189w = j10;
    }

    public static final Event c(l0 l0Var, long j10) {
        AdType adType = l0Var.f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new SdkInternalEvent.SdkInternalPostBid(adType, j10, true);
    }

    public static final Event i(l0 l0Var, long j10) {
        AdType adType = l0Var.f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new SdkInternalEvent.SdkInternalPostBid(adType, j10, false);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new w6(this.f15185s, this.f15186t, this.f15187u, this.f15188v, this.f15189w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f15184r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            w5 w5Var = this.f15185s;
            this.f15184r = 1;
            objA = com.appodeal.ads.networking.a0.a(w5Var, com.appodeal.ads.networking.processors.c.f14154b, this);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objA = ((Result) obj).l();
        }
        Function0 function0 = this.f15186t;
        w wVar = this.f15187u;
        final l0 l0Var = this.f15188v;
        final long j10 = this.f15189w;
        if (Result.j(objA)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.u6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.c(l0Var, j10);
                }
            });
            function0.invoke();
            wVar.b((JSONObject) objA);
        }
        Function0 function02 = this.f15186t;
        w wVar2 = this.f15187u;
        final l0 l0Var2 = this.f15188v;
        final long j11 = this.f15189w;
        Throwable thG = Result.g(objA);
        if (thG != null) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.v6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.i(l0Var2, j11);
                }
            });
            function02.invoke();
            wVar2.f15166c.f13567g.Q(wVar2.f15164a, null, com.appodeal.ads.networking.w.a(thG));
        }
        return Unit.f93236a;
    }
}
