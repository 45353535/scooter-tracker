package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class hp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f111663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dn1 f111664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ep1 f111665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dp1 f111666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sm1 f111667e;

    public hp1(Executor executor, dn1 dn1Var, ep1 ep1Var, dp1 dp1Var, sm1 sm1Var) {
        this.f111663a = executor;
        this.f111664b = dn1Var;
        this.f111665c = ep1Var;
        this.f111666d = dp1Var;
        this.f111667e = sm1Var;
    }

    public final void a(Context context, mx2 mx2Var, cp1 cp1Var, wo woVar, fp1 fp1Var) {
        this.f111664b.a(context, cp1Var, com.monetization.ads.mediation.base.a.class);
        fp1Var.a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp1(jn1 jn1Var) {
        this(ze1.a().a(), new dn1(jn1Var), new ep1(), new dp1(jn1Var), new sm1());
        Object obj = af1.f108670d;
    }
}
