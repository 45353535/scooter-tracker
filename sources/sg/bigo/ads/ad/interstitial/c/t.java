package sg.bigo.ads.ad.interstitial.c;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public class t extends s {
    public t(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, bVar2, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.s, sg.bigo.ads.ad.interstitial.c.b
    protected final void g(sg.bigo.ads.ad.interstitial.q qVar) {
        super.g(qVar);
        this.f100775r.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100730l.getLayoutParams();
        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f100730l.getContext(), 0);
        this.f100730l.setLayoutParams(marginLayoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.s, sg.bigo.ads.ad.interstitial.c.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_7;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.s, sg.bigo.ads.ad.interstitial.c.a
    protected final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        if (this.f101781g == null) {
            return;
        }
        final View viewFindViewById = this.f100729k.findViewById(R.id.inter_btn_cta_layout);
        final Button button = (Button) this.f100729k.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        int iMax = Math.max(1, i10);
        final Pair<Integer, Boolean> pairE = e(qVar);
        button.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.t.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) t.this.f101780f)) {
                    return;
                }
                sg.bigo.ads.ad.interstitial.d.a(button, ((Integer) pairE.first).intValue(), new b.a() { // from class: sg.bigo.ads.ad.interstitial.c.t.1.1
                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i11) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (viewFindViewById == null || !((Boolean) pairE.second).booleanValue()) {
                            return;
                        }
                        sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
                    }
                });
            }
        }, ((long) iMax) * 1000);
    }
}
