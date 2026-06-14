package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3749h4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3774i4 f38686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3749h4(C3774i4 c3774i4, Continuation continuation) {
        super(2, continuation);
        this.f38686b = c3774i4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3749h4(this.f38686b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3749h4(this.f38686b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38685a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3774i4 c3774i4 = this.f38686b;
            this.f38685a = 1;
            Object objCollect = hg.i.B(new C4085uh(new C4110vh((C3569a4) c3774i4.f38740b.f38791b.getValue()), null)).collect(new C3672e4(c3774i4), this);
            if (objCollect != pf.b.g()) {
                objCollect = Unit.f93236a;
            }
            if (objCollect == objG) {
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
