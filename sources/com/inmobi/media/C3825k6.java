package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3825k6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3850l6 f38862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3825k6(C3850l6 c3850l6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38862d = c3850l6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38861c = obj;
        this.f38863e |= Integer.MIN_VALUE;
        return this.f38862d.a(0L, 0L, this);
    }
}
