package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f109374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd f109375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zd f109376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fy0 f109377d;

    public /* synthetic */ ce(Context context) {
        this(i10.a(), new hy0(context), new iz0(context), gy0.a(context));
    }

    public ce(CoroutineDispatcher coroutineDispatcher, zd zdVar, zd zdVar2, fy0 fy0Var) {
        this.f109374a = coroutineDispatcher;
        this.f109375b = zdVar;
        this.f109376c = zdVar2;
        this.f109377d = fy0Var;
    }
}
