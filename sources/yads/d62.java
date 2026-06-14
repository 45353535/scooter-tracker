package yads;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class d62 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e62 f109808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f109809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dx1 f109810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f109811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u5 f109812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f109813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f109814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e62 f109815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f109816j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d62(e62 e62Var, Continuation continuation) {
        super(continuation);
        this.f109815i = e62Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f109814h = obj;
        this.f109816j |= Integer.MIN_VALUE;
        return this.f109815i.a(null, null, this);
    }
}
