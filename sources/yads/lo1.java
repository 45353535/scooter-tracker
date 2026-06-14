package yads;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class lo1 implements qm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym1 f113178a;

    public lo1(ym1 ym1Var) {
        this.f113178a = ym1Var;
    }

    @Override // yads.qm1
    public final om1 a(Context context) {
        return this.f113178a.a(context, MediatedRewardedAdapter.class);
    }
}
