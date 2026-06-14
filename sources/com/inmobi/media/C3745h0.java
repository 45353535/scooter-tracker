package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3745h0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f38676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3869m0 f38677b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3745h0(C3869m0 c3869m0, Map map, Continuation continuation) {
        super(2, continuation);
        this.f38676a = map;
        this.f38677b = c3869m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3745h0(this.f38677b, this.f38676a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map map = this.f38676a;
        return new C3745h0(this.f38677b, map, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        long jElapsedRealtime;
        pf.b.g();
        kotlin.d.b(obj);
        Object obj2 = this.f38676a.get("errorCode");
        Short sh2 = obj2 instanceof Short ? (Short) obj2 : null;
        Map mapA = AbstractC3789ik.a(this.f38677b.f39000b);
        C3869m0 c3869m0 = this.f38677b;
        if (sh2 != null && sh2.shortValue() == 2138) {
            j10 = c3869m0.f39001c.f38310c;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh2 == null || sh2.shortValue() != 2139) && (sh2 == null || sh2.shortValue() != 2203)) {
            j10 = c3869m0.f39001c.f38308a;
            CoroutineScope coroutineScope2 = AbstractC3790il.f38771a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = c3869m0.f39001c.f38312e;
            CoroutineScope coroutineScope3 = AbstractC3790il.f38771a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        mapA.put("latency", kotlin.coroutines.jvm.internal.b.e(jElapsedRealtime - j10));
        mapA.putAll(this.f38676a);
        Wj wj = Wj.f37959a;
        Wj.b("AdLoadFailed", mapA, EnumC3585ak.f38215a);
        return Unit.f93236a;
    }
}
