package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3751h6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3674e6 f38688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3850l6 f38690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3751h6(C3674e6 c3674e6, boolean z10, C3850l6 c3850l6, Continuation continuation) {
        super(2, continuation);
        this.f38688a = c3674e6;
        this.f38689b = z10;
        this.f38690c = c3850l6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3751h6(this.f38688a, this.f38689b, this.f38690c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3751h6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return Unit.f93236a;
    }
}
