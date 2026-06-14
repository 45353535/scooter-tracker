package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3700f6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ak f38548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3623c6 f38549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f38554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f38555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3850l6 f38556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3700f6(C3850l6 c3850l6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38556i = c3850l6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38555h = obj;
        this.f38557j |= Integer.MIN_VALUE;
        return C3850l6.a(this.f38556i, false, (kotlin.coroutines.jvm.internal.d) this);
    }
}
