package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class se2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public te2 f115772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f115773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f115774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ne2 f115775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f115776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ te2 f115777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115778h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se2(te2 te2Var, Continuation continuation) {
        super(continuation);
        this.f115777g = te2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f115776f = obj;
        this.f115778h |= Integer.MIN_VALUE;
        return this.f115777g.a((Context) null, (List) null, this);
    }
}
