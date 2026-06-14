package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes4.dex */
public final class dx0 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf0 f110103a;

    public dx0(hf0 hf0Var) {
        this.f110103a = hf0Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f110103a.a((ExtendedNativeAdView) viewGroup);
    }

    @Override // yads.hf0
    public final void c() {
        this.f110103a.c();
    }
}
