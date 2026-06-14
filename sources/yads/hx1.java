package yads;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class hx1 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dx1 f111795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f111796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx1 f111797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(kx1 kx1Var, Continuation continuation) {
        super(continuation);
        this.f111797d = kx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f111796c = obj;
        this.f111798e |= Integer.MIN_VALUE;
        return this.f111797d.a((Context) null, (dx1) null, this);
    }
}
