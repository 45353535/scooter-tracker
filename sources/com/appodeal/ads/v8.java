package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9 f15151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdType f15152s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(d9 d9Var, AdType adType, Continuation continuation) {
        super(2, continuation);
        this.f15151r = d9Var;
        this.f15152s = adType;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v8(this.f15151r, this.f15152s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v8(this.f15151r, this.f15152s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AppodealRequestCallbacks appodealRequestCallbacks = this.f15151r.f13237b;
        if (appodealRequestCallbacks != null) {
            appodealRequestCallbacks.onWaterfallStart(this.f15152s.getDisplayName());
        }
        return Unit.f93236a;
    }
}
