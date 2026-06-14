package yads;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class u53 implements l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f116529d = {ub.a(u53.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c22 f116530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f116531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk2 f116532c;

    public u53(Activity activity, c22 c22Var, w0 w0Var) {
        this.f116530a = c22Var;
        this.f116531b = w0Var;
        this.f116532c = hk2.a(activity);
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        gk2 gk2Var = this.f116532c;
        KProperty kProperty = f116529d[0];
        Context context = (Context) gk2Var.f111244a.get();
        if (context == null || !Intrinsics.areEqual(context, activity)) {
            return;
        }
        this.f116530a.f109182a.h();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        gk2 gk2Var = this.f116532c;
        KProperty kProperty = f116529d[0];
        Context context = (Context) gk2Var.f111244a.get();
        if (context == null || !Intrinsics.areEqual(context, activity)) {
            return;
        }
        this.f116530a.f109182a.g();
    }
}
