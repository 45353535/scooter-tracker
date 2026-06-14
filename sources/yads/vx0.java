package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class vx0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f117219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f117220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0 f117221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f117222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx0(wx0 wx0Var, Continuation continuation) {
        super(continuation);
        this.f117221d = wx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f117220c = obj;
        this.f117222e |= Integer.MIN_VALUE;
        return this.f117221d.a(null, false, this);
    }
}
