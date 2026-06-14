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
public final class i5 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ te f13416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ xe f13417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0 f13418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f13419w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(te teVar, xe xeVar, l0 l0Var, w wVar, Continuation continuation) {
        super(2, continuation);
        this.f13416t = teVar;
        this.f13417u = xeVar;
        this.f13418v = l0Var;
        this.f13419w = wVar;
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e c(te teVar) {
        return new com.appodeal.ads.analytics.breadcrumbs.d(teVar.u(), "getRequest");
    }

    public static final Event i(l0 l0Var, long j10) {
        AdType adType = l0Var.f13566f;
        Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
        return new SdkInternalEvent.SdkInternalGet(adType, j10, true);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i5(this.f13416t, this.f13417u, this.f13418v, this.f13419w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        final long j10;
        Object objG = pf.b.g();
        int i10 = this.f13415s;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.appodeal.ads.analytics.breadcrumbs.n nVar = com.appodeal.ads.analytics.breadcrumbs.n.f12678b;
            final te teVar = this.f13416t;
            nVar.b(new Function0() { // from class: com.appodeal.ads.d5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i5.c(teVar);
                }
            });
            long jCurrentTimeMillis = System.currentTimeMillis();
            ma maVar = new ma(this.f13416t, this.f13417u, this.f13418v);
            this.f13414r = jCurrentTimeMillis;
            this.f13415s = 1;
            objA = com.appodeal.ads.networking.v.a(maVar, com.appodeal.ads.networking.processors.c.f14154b, this);
            if (objA == objG) {
                return objG;
            }
            j10 = jCurrentTimeMillis;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f13414r;
            kotlin.d.b(obj);
            objA = ((Result) obj).l();
        }
        w wVar = this.f13419w;
        final l0 l0Var = this.f13418v;
        if (Result.j(objA)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.e5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i5.i(l0Var, j10);
                }
            });
            wVar.b((JSONObject) objA);
        }
        l0 l0Var2 = this.f13418v;
        w wVar2 = this.f13419w;
        Throwable thG = Result.g(objA);
        if (thG != null) {
            AdType adType = l0Var2.f13566f;
            Intrinsics.checkNotNullExpressionValue(adType, "getAdType(...)");
            new SdkInternalEvent.SdkInternalGet(adType, j10, false);
            wVar2.f15166c.f13567g.Q(wVar2.f15164a, null, com.appodeal.ads.networking.w.a(thG));
        }
        return Unit.f93236a;
    }
}
