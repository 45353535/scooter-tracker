package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3806jc extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3856lc f38807a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3806jc(C3856lc c3856lc, Continuation continuation) {
        super(2, continuation);
        this.f38807a = c3856lc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3806jc(this.f38807a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3806jc(this.f38807a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3903n9 c3903n9 = this.f38807a.f38970a;
        if (c3903n9 != null) {
            c3903n9.a("MediaViewManager", "destroy called");
        }
        AbstractC3796j2 abstractC3796j2 = this.f38807a.f38971b;
        if (abstractC3796j2 != null) {
            abstractC3796j2.a();
        }
        this.f38807a.f38971b = null;
        return Unit.f93236a;
    }
}
