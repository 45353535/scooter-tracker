package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class ln1 implements qm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym1 f113164a;

    public ln1(ym1 ym1Var) {
        this.f113164a = ym1Var;
    }

    @Override // yads.qm1
    public final om1 a(Context context) {
        return this.f113164a.a(context, MediatedBannerAdapter.class);
    }
}
