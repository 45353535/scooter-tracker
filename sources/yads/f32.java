package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f110590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x22 f110591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c42 f110592c;

    public /* synthetic */ f32(Context context, es2 es2Var, v5 v5Var, rx1 rx1Var, CoroutineScope coroutineScope) {
        this(coroutineScope, new x22(context, coroutineScope, v5Var, rx1Var), new c42(context, ((pr3) es2Var).e()));
    }

    public f32(CoroutineScope coroutineScope, x22 x22Var, c42 c42Var) {
        this.f110590a = coroutineScope;
        this.f110591b = x22Var;
        this.f110592c = c42Var;
    }
}
