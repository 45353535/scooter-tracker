package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class jn extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rn f112391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e83 f112392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f112393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn f112394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f112395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(rn rnVar, Continuation continuation) {
        super(continuation);
        this.f112394e = rnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f112393d = obj;
        this.f112395f |= Integer.MIN_VALUE;
        return rn.a(this.f112394e, null, this);
    }
}
