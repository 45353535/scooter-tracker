package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class xn1 implements qm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym1 f117912a;

    public xn1(ym1 ym1Var) {
        this.f117912a = ym1Var;
    }

    @Override // yads.qm1
    public final om1 a(Context context) {
        return this.f117912a.a(context, MediatedNativeAdapter.class);
    }
}
