package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class pf2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2 f114656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf2(sf2 sf2Var, Continuation continuation) {
        super(continuation);
        this.f114656c = sf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f114655b = obj;
        this.f114657d |= Integer.MIN_VALUE;
        return sf2.a(0L, null, null, null, this.f114656c, null, this);
    }
}
