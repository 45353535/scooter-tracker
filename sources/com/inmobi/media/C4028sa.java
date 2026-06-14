package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4028sa extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3929oa f39518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t0 f39519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t0 f39520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4028sa(ViewTreeObserverOnGlobalLayoutListenerC3929oa viewTreeObserverOnGlobalLayoutListenerC3929oa, kotlin.jvm.internal.t0 t0Var, kotlin.jvm.internal.t0 t0Var2, Continuation continuation) {
        super(2, continuation);
        this.f39518b = viewTreeObserverOnGlobalLayoutListenerC3929oa;
        this.f39519c = t0Var;
        this.f39520d = t0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4028sa(this.f39518b, this.f39519c, this.f39520d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4028sa) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39517a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            eg.p pVar = this.f39518b.f39181e;
            this.f39517a = 1;
            if (pVar.await(this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        kotlin.jvm.internal.t0 t0Var = this.f39519c;
        ViewTreeObserverOnGlobalLayoutListenerC3929oa viewTreeObserverOnGlobalLayoutListenerC3929oa = this.f39518b;
        t0Var.f93331b = viewTreeObserverOnGlobalLayoutListenerC3929oa.f39179c;
        this.f39520d.f93331b = viewTreeObserverOnGlobalLayoutListenerC3929oa.f39180d;
        return Unit.f93236a;
    }
}
