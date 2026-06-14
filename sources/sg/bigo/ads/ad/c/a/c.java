package sg.bigo.ads.ad.c.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MaxWidthMediaView;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {
    public c(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull Context context) {
        super(bVar, context);
        sg.bigo.ads.api.c.b.a(20);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int a() {
        return R.layout.bigo_ad_native_banner_small;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int b() {
        return e.a(this.f100380c, 6);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int[] c() {
        return new int[]{e.a(this.f100380c, -24), e.a(this.f100380c, 236)};
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final void d() {
        this.f100379b = new FrameLayout(this.f100380c);
        int iA = e.a(this.f100380c, 38);
        int iA2 = e.a(this.f100380c, 60);
        MaxWidthMediaView maxWidthMediaView = new MaxWidthMediaView(this.f100380c);
        this.f100381d = maxWidthMediaView;
        maxWidthMediaView.setLayoutParams(new ViewGroup.LayoutParams(-2, iA));
        this.f100381d.setMinimumWidth(iA);
        ((MaxWidthMediaView) this.f100381d).setMaxWidth(iA2);
        this.f100381d.setImageBlurBorder(true);
        this.f100381d.setVisibility(8);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int i() {
        return 320;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int j() {
        return 50;
    }
}
