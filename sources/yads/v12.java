package yads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class v12 implements l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f116840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yw0 f116841b;

    public v12(q2 q2Var, yw0 yw0Var) {
        this.f116840a = q2Var;
        this.f116841b = yw0Var;
    }

    @Override // yads.l00
    public final void a(i5 i5Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", i5Var);
        ((q2) this.f116840a).a(16, bundle);
    }

    @Override // yads.l00
    public final void closeNativeAd() {
        hr2 hr2Var = this.f116841b.f118413a;
        if (hr2Var == null || hr2Var.f111753t) {
            return;
        }
        ((q2) this.f116840a).f114851a.finish();
    }

    @Override // yads.l00
    public final void onAdClicked() {
    }

    @Override // yads.l00
    public final void onLeftApplication() {
        ((q2) this.f116840a).a(17, null);
    }

    @Override // yads.l00
    public final void onReturnedToApplication() {
        ((q2) this.f116840a).a(18, null);
    }
}
