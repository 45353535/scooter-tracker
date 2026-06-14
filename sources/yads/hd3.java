package yads;

import android.content.Context;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj2 f111555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh2 f111556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x93 f111557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ia3 f111558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wi3 f111559e;

    public hd3(Context context, xb3 xb3Var, kh3 kh3Var, xd3 xd3Var, fh3 fh3Var, vc3 vc3Var, oc3 oc3Var) {
        this.f111555a = new hj2(fh3Var);
        this.f111556b = new mh2(context, xb3Var);
        this.f111557c = new x93(xb3Var, kh3Var, fh3Var, oc3Var);
        this.f111558d = new ia3(kh3Var, fh3Var, vc3Var);
        this.f111559e = new wi3(xb3Var, kh3Var, xd3Var, fh3Var, oc3Var);
    }

    public final void a(fd3 fd3Var, boolean z10) {
        if (!z10) {
            CollectionsKt.addAll(fd3Var.f110692a, new ed3[]{this.f111557c});
        } else {
            CollectionsKt.addAll(fd3Var.f110692a, new ed3[]{this.f111555a, this.f111556b, this.f111558d, this.f111557c, this.f111559e});
            CollectionsKt.addAll(fd3Var.f110693b, new gd3[]{this.f111559e});
        }
    }
}
