package yads;

import android.view.View;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v0 f116421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f116422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ref$ObjectRef f116423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f116424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f116425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f116426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f116427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, Continuation continuation) {
        super(continuation);
        this.f116426g = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f116425f = obj;
        this.f116427h |= Integer.MIN_VALUE;
        return this.f116426g.a(null, null, this);
    }
}
