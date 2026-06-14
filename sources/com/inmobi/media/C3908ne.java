package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3908ne extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4057te f39104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3908ne(C4057te c4057te, Continuation continuation) {
        super(2, continuation);
        this.f39104b = c4057te;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3908ne(this.f39104b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3908ne(this.f39104b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39103a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            InterfaceC3878m9 interfaceC3878m9L = this.f39104b.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            Flow flowB = ((C3707fd) this.f39104b.f39594b.f39678j.getValue()).b();
            C3883me c3883me = new C3883me(null);
            this.f39103a = 1;
            if (hg.i.y(flowB, c3883me, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        this.f39104b.m();
        ((C3707fd) this.f39104b.f39594b.f39678j.getValue()).a();
        return Unit.f93236a;
    }
}
