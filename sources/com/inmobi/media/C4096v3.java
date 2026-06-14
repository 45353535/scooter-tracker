package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4096v3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f39730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4096v3(S2 s22, Continuation continuation) {
        super(2, continuation);
        this.f39730b = s22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4096v3(this.f39730b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4096v3(this.f39730b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39729a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            W2 w22 = (W2) C4121w3.f39817b.getValue();
            S2 s22 = this.f39730b;
            this.f39729a = 1;
            Object objA = C3729g9.a(w22.f37928a, "click", Y2.a(s22), null, null, this, 28);
            if (objA != pf.b.g()) {
                objA = Unit.f93236a;
            }
            if (objA == objG) {
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
