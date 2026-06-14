package yads;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class r42 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f115299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f115300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m30 f115301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f115303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u42 f115304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115305h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r42(u42 u42Var, Continuation continuation) {
        super(continuation);
        this.f115304g = u42Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f115303f = obj;
        this.f115305h |= Integer.MIN_VALUE;
        return this.f115304g.a(false, (Context) null, (dx1) null, (m30) null, (Continuation) this);
    }
}
