package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3734ge extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4032se f38630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3734ge(C4032se c4032se, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f38630a = c4032se;
        this.f38631b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3734ge(this.f38630a, this.f38631b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3734ge(this.f38630a, this.f38631b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f38630a.f39529h.onAudioStateChanged(this.f38631b);
        return Unit.f93236a;
    }
}
