package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3701f7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3876m7 f38560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701f7(C3876m7 c3876m7, Continuation continuation) {
        super(2, continuation);
        this.f38560c = c3876m7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3701f7 c3701f7 = new C3701f7(this.f38560c, continuation);
        c3701f7.f38559b = obj;
        return c3701f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3701f7 c3701f7 = new C3701f7(this.f38560c, (Continuation) obj2);
        c3701f7.f38559b = (Xf) obj;
        return c3701f7.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38558a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Xf xf2 = (Xf) this.f38559b;
            C3876m7 c3876m7 = this.f38560c;
            this.f38558a = 1;
            Object objA = c3876m7.f38121b.a(xf2, this);
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
