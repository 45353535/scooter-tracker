package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3875m6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Le f39011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3674e6 f39013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f39014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f39015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f39016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Ak f39017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C3850l6 f39018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f39019k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3875m6(long j10, Le le2, int i10, C3674e6 c3674e6, String str, int i11, long j11, Ak ak, C3850l6 c3850l6, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f39010b = j10;
        this.f39011c = le2;
        this.f39012d = i10;
        this.f39013e = c3674e6;
        this.f39014f = str;
        this.f39015g = i11;
        this.f39016h = j11;
        this.f39017i = ak;
        this.f39018j = c3850l6;
        this.f39019k = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3875m6(this.f39010b, this.f39011c, this.f39012d, this.f39013e, this.f39014f, this.f39015g, this.f39016h, this.f39017i, this.f39018j, this.f39019k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3875m6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r14 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3875m6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
