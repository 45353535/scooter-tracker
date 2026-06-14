package com.inmobi.media;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4031sd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f39526a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4031sd(Dd dd2, Continuation continuation) {
        super(2, continuation);
        this.f39526a = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4031sd(this.f39526a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4031sd(this.f39526a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        int i10 = AbstractC3834kf.f38883a;
        Context applicationContext = this.f39526a.f39960a.f39882a.f39144b.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return kotlin.coroutines.jvm.internal.b.a(AbstractC3834kf.a(applicationContext));
    }
}
