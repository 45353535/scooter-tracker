package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class q8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9 f14299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdType f14300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ te f14301t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(d9 d9Var, AdType adType, te teVar, Continuation continuation) {
        super(2, continuation);
        this.f14299r = d9Var;
        this.f14300s = adType;
        this.f14301t = teVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q8(this.f14299r, this.f14300s, this.f14301t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AppodealRequestCallbacks appodealRequestCallbacks = this.f14299r.f13237b;
        if (appodealRequestCallbacks != null) {
            String displayName = this.f14300s.getDisplayName();
            te teVar = this.f14301t;
            appodealRequestCallbacks.onWaterfallFinish(displayName, teVar.f14907s, teVar.f14911w || teVar.f14912x);
        }
        return Unit.f93236a;
    }
}
