package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3844l0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3869m0 f38914a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3844l0(C3869m0 c3869m0, Continuation continuation) {
        super(2, continuation);
        this.f38914a = c3869m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3844l0(this.f38914a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3844l0(this.f38914a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Map mapA = AbstractC3789ik.a(this.f38914a.f39000b);
        long j10 = this.f38914a.f39001c.f38309b;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        mapA.put("latency", kotlin.coroutines.jvm.internal.b.e(SystemClock.elapsedRealtime() - j10));
        mapA.put("networkType", C4148x5.m());
        Wj wj = Wj.f37959a;
        Wj.b("ServerNoFill", mapA, EnumC3585ak.f38215a);
        return Unit.f93236a;
    }
}
