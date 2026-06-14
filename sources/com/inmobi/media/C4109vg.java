package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4109vg extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4134wg f39780a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4109vg(C4134wg c4134wg, Continuation continuation) {
        super(2, continuation);
        this.f39780a = c4134wg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4109vg(this.f39780a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4109vg(this.f39780a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C4134wg c4134wg = this.f39780a;
        c4134wg.f39853b.setValue(c4134wg.f39852a.a());
        return Unit.f93236a;
    }
}
