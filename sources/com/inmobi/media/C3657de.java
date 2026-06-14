package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3657de extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4057te f38445a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3657de(C4057te c4057te, Continuation continuation) {
        super(2, continuation);
        this.f38445a = c4057te;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3657de(this.f38445a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3657de(this.f38445a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AbstractC4116vn.a(this.f38445a.f39594b.f39671c.f37731c);
        AbstractC4116vn.a(this.f38445a.f39594b.f39671c.f37730b);
        return Unit.f93236a;
    }
}
