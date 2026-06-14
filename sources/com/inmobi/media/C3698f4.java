package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3698f4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3774i4 f38542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3698f4(C3774i4 c3774i4, Continuation continuation) {
        super(2, continuation);
        this.f38542b = c3774i4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3698f4(this.f38542b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3698f4(this.f38542b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38541a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3774i4 c3774i4 = this.f38542b;
            this.f38541a = 1;
            if (c3774i4.b(this) == objG) {
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
