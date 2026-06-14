package sg.bigo.ads.ad.interstitial.d.a.a;

import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.b;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends sg.bigo.ads.ad.interstitial.d.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected MediaView f100947x;

    public a(@NonNull b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        return this.f100947x;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void t() {
        super.t();
        ViewGroup viewGroup = this.f100916q;
        if (viewGroup != null) {
            this.f100947x = (MediaView) viewGroup.findViewById(R.id.inter_media);
        }
    }
}
