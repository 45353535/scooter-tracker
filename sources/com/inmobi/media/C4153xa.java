package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4153xa extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.k f39920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4153xa(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f39920c = (kotlin.coroutines.jvm.internal.k) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4153xa c4153xa = new C4153xa(this.f39920c, continuation);
        c4153xa.f39919b = obj;
        return c4153xa;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4153xa c4153xa = new C4153xa(this.f39920c, (Continuation) obj2);
        c4153xa.f39919b = (CoroutineScope) obj;
        return c4153xa.invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39918a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f39919b;
            ?? r12 = this.f39920c;
            this.f39918a = 1;
            if (r12.invoke(coroutineScope, this) == objG) {
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
