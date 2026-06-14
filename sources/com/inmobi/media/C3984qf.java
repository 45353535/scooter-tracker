package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4240b4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3984qf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4033sf f39388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f39389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3984qf(C4033sf c4033sf, AdConfig.OmidConfig omidConfig, Continuation continuation) {
        super(2, continuation);
        this.f39388a = c4033sf;
        this.f39389b = omidConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3984qf(this.f39388a, this.f39389b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3984qf(this.f39388a, this.f39389b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Ea ea2 = this.f39388a.f39531a.f40054a;
        ea2.getClass();
        Intrinsics.checkNotNullParameter("last_ts", C4240b4.i.W);
        return kotlin.coroutines.jvm.internal.b.a((System.currentTimeMillis() / ((long) 1000)) - ea2.f36783a.getLong("last_ts", 0L) > this.f39389b.getExpiry());
    }
}
