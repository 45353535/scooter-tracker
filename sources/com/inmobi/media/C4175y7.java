package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4175y7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f39978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4175y7(Continuation continuation, N7 n72, boolean z10) {
        super(2, continuation);
        this.f39978a = n72;
        this.f39979b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4175y7(continuation, this.f39978a, this.f39979b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4175y7((Continuation) obj2, this.f39978a, this.f39979b).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f39978a.f37415n.setVisibility(this.f39979b ? 0 : 8);
        return Unit.f93236a;
    }
}
