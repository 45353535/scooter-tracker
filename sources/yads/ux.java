package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class ux implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f116793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116794b;

    public ux(k00 k00Var, int i10) {
        this.f116793a = k00Var;
        this.f116794b = i10;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        k00 k00Var = this.f116793a;
        wx wxVar = new wx(k00Var, this.f116794b, new sw1());
        ImageView imageViewA = wxVar.a(extendedNativeAdView, vx.f117215b, k00Var.f112530b);
        ImageView imageViewA2 = wxVar.a(extendedNativeAdView, vx.f117216c, k00Var.f112531c);
        if (imageViewA != null) {
            imageViewA.setId(R$id.favicon);
        }
        if (imageViewA2 != null) {
            imageViewA2.setId(R$id.icon);
        }
    }

    @Override // yads.hf0
    public final void c() {
    }
}
