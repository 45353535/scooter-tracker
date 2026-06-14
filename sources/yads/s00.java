package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class s00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f115654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f115655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f115656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bz1 f115657d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s00(Context context, pr3 pr3Var) {
        qz qzVar = qz.f115224g;
        Context applicationContext = context.getApplicationContext();
        this(pr3Var, applicationContext, l10.a(pr3Var.a()), new bz1(applicationContext, pr3Var, qzVar));
    }

    public s00(pr3 pr3Var, Context context, CoroutineScope coroutineScope, bz1 bz1Var) {
        this.f115654a = pr3Var;
        this.f115655b = context;
        this.f115656c = coroutineScope;
        this.f115657d = bz1Var;
    }
}
