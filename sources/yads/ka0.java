package yads;

import android.view.View;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class ka0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la0 f112660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(la0 la0Var, Continuation continuation) {
        super(continuation);
        this.f112660c = la0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f112659b = obj;
        this.f112661d |= Integer.MIN_VALUE;
        return this.f112660c.a((View) null, (ja0) null, this);
    }
}
