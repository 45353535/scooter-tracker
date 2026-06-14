package yads;

import android.content.Context;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes4.dex */
public final class nv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f114056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mr1 f114057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f114059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f114060e;

    public nv1(Context context, t9 t9Var, es2 es2Var) {
        this.f114056a = t9Var;
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        this.f114057b = ve.a(context, pr3Var.b());
        this.f114058c = true;
        this.f114059d = true;
        this.f114060e = true;
    }

    public final void a(String str) {
        xl2 xl2Var = xl2.f117866c;
        this.f114057b.a(new zl2("multibanner_event", MapsKt.toMutableMap(MapsKt.hashMapOf(TuplesKt.to(Reporting.Key.EVENT_TYPE, str))), this.f114056a.f116116i));
    }
}
