package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3770i0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f38727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3869m0 f38728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3770i0(G g10, C3869m0 c3869m0, Continuation continuation) {
        super(2, continuation);
        this.f38727a = g10;
        this.f38728b = c3869m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3770i0(this.f38727a, this.f38728b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3770i0(this.f38727a, this.f38728b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Map mapA = AbstractC3789ik.a(this.f38727a);
        C3869m0 c3869m0 = this.f38728b;
        mapA.put("networkType", C4148x5.m());
        long j10 = c3869m0.f39001c.f38313f;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        mapA.put("latency", kotlin.coroutines.jvm.internal.b.e(SystemClock.elapsedRealtime() - j10));
        Wj wj = Wj.f37959a;
        Wj.b("ParseSuccess", mapA, EnumC3585ak.f38215a);
        return Unit.f93236a;
    }
}
