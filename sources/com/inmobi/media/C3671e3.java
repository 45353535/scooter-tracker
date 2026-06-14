package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3671e3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f38495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3671e3(S2 s22, Continuation continuation) {
        super(2, continuation);
        this.f38495b = s22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3671e3(this.f38495b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3671e3(this.f38495b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38494a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            W2 w22 = (W2) C4121w3.f39817b.getValue();
            int i11 = this.f38495b.f37684a;
            this.f38494a = 1;
            Object objA = w22.f37928a.a("click", "id=?", new String[]{String.valueOf(i11)}, this);
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
