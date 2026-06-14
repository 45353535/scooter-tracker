package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3727g7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3876m7 f38618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rf f38619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3727g7(C3876m7 c3876m7, Rf rf2, Continuation continuation) {
        super(2, continuation);
        this.f38618b = c3876m7;
        this.f38619c = rf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3727g7(this.f38618b, this.f38619c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3727g7(this.f38618b, this.f38619c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38617a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3876m7 c3876m7 = this.f38618b;
            Rf rf2 = this.f38619c;
            C3701f7 c3701f7 = new C3701f7(c3876m7, null);
            this.f38617a = 1;
            if (c3876m7.a(rf2, c3701f7, this) == objG) {
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
