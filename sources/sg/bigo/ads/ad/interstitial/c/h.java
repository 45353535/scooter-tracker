package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public class h extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Button f100821t;

    public h(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g
    protected final void a(int i10) {
        super.a(i10);
        Button button = (Button) this.f100729k.findViewById(R.id.inter_btn_cta_main);
        this.f100821t = button;
        if (button != null) {
            button.setVisibility(0);
            float fA = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 8);
            this.f100821t.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -16724924));
            this.f100821t.setTextColor(sg.bigo.ads.ad.interstitial.d.f100902a);
            sg.bigo.ads.ad.interstitial.b.f100662a.a(this.f100821t);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g
    protected final void m() {
        super.m();
        if (this.f100821t == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.f100821t);
    }
}
