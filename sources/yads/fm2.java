package yads;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fm2 extends gm2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f110792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lj2 f110793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hx2 f110794h;

    public fm2(long j10, yv0 yv0Var, y31 y31Var, yu2 yu2Var, ArrayList arrayList) {
        super(yv0Var, y31Var, yu2Var, arrayList);
        Uri.parse(((mo) y31Var.get(0)).f113562a);
        lj2 lj2VarB = yu2Var.b();
        this.f110793g = lj2VarB;
        this.f110792f = null;
        this.f110794h = lj2VarB == null ? new hx2(new lj2(null, 0L, -1L)) : null;
    }

    @Override // yads.gm2
    public final String c() {
        return this.f110792f;
    }

    @Override // yads.gm2
    public final v20 d() {
        return this.f110794h;
    }

    @Override // yads.gm2
    public final lj2 e() {
        return this.f110793g;
    }
}
