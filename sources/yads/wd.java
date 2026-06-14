package yads;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes4.dex */
public final class wd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f117422d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile wd f117423e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce f117424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua0 f117425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deferred f117426c;

    public wd(CoroutineScope coroutineScope, fe feVar, ce ceVar) {
        this.f117424a = ceVar;
        feVar.getClass();
        this.f117425b = fe.a();
        this.f117426c = eg.i.b(coroutineScope, null, eg.f0.f69147c, new ud(this, null), 1, null);
    }
}
