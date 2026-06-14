package com.appodeal.ads.adapters.unityads;

import android.content.Context;
import eg.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UnityadsNetwork f12592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f12593t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(UnityadsNetwork unityadsNetwork, Context context, Continuation continuation) {
        super(2, continuation);
        this.f12592s = unityadsNetwork;
        this.f12593t = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f12592s, this.f12593t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n(this.f12592s, this.f12593t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12591r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            j unityMetaData = this.f12592s.getUnityMetaData();
            Context context = this.f12593t;
            this.f12591r = 1;
            unityMetaData.getClass();
            Object objG2 = eg.g.g(o0.b(), new g(context, null), this);
            if (objG2 != pf.b.g()) {
                objG2 = Unit.f93236a;
            }
            if (objG2 == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
