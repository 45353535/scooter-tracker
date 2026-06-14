package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class sv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dv0 f115961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f115962b;

    public /* synthetic */ sv0(Context context) {
        this(new dv0(context.getApplicationContext()), kotlinx.coroutines.i.a(eg.o0.b().plus(eg.m1.b(null, 1, null))));
    }

    public sv0(dv0 dv0Var, CoroutineScope coroutineScope) {
        this.f115961a = dv0Var;
        this.f115962b = coroutineScope;
    }
}
