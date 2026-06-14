package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3867ln extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3967pn f38996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ij f38997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3867ln(C3967pn c3967pn, Ij ij, Continuation continuation) {
        super(2, continuation);
        this.f38996a = c3967pn;
        this.f38997b = ij;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3867ln(this.f38996a, this.f38997b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3867ln(this.f38996a, this.f38997b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3967pn c3967pn = this.f38996a;
        c3967pn.f39317h = this.f38997b;
        c3967pn.f39315f.a(c3967pn.f39319j);
        return Unit.f93236a;
    }
}
