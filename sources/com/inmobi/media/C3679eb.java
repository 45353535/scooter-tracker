package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3679eb extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3705fb f38514a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3679eb(C3705fb c3705fb, Continuation continuation) {
        super(2, continuation);
        this.f38514a = c3705fb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3679eb(this.f38514a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3679eb(this.f38514a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3705fb c3705fb = this.f38514a;
        c3705fb.f38572f.onAdLoadFailed(c3705fb.f38571e);
        return Unit.f93236a;
    }
}
