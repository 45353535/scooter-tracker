package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Hb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3980qb f37006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3980qb f37007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Jb f37009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hb(Jb jb2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37009e = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37008d = obj;
        this.f37010f |= Integer.MIN_VALUE;
        return this.f37009e.b(null, null, this);
    }
}
