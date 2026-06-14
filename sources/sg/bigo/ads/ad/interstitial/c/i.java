package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public class i extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f100822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private RoundedImageView f100823u;

    public i(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    protected final void d(final sg.bigo.ads.ad.interstitial.q qVar) {
        super.d(qVar);
        ViewGroup viewGroup = this.f100729k;
        if (viewGroup == null) {
            return;
        }
        this.f100822t = viewGroup.findViewById(R.id.inter_end_page_image_layout);
        this.f100823u = (RoundedImageView) this.f100729k.findViewById(R.id.inter_end_page_image);
        sg.bigo.ads.common.utils.u.a(this.f100822t, new u.a() { // from class: sg.bigo.ads.ad.interstitial.c.i.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(@NonNull Rect rect) {
                int iA;
                float fA;
                int i10;
                int i11;
                sg.bigo.ads.common.p pVarB = i.this.b(qVar);
                if (pVarB.a(rect.width(), rect.height())) {
                    i11 = -1;
                    fA = 0.0f;
                    iA = 0;
                    i10 = -1;
                } else {
                    iA = sg.bigo.ads.common.utils.e.a(i.this.f100823u.getContext(), 20);
                    int i12 = iA * 2;
                    sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(pVarB.f102604b, pVarB.f102605c, rect.width() - i12, rect.height() - i12);
                    int i13 = pVarA.f102604b;
                    int i14 = pVarA.f102605c;
                    fA = sg.bigo.ads.common.utils.e.a(i.this.f100823u.getContext(), 8);
                    i10 = i14;
                    i11 = i13;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i.this.f100823u.getLayoutParams();
                marginLayoutParams.setMargins(iA, iA, iA, iA);
                marginLayoutParams.width = i11;
                marginLayoutParams.height = i10;
                i.this.f100823u.requestLayout();
                i.this.f100823u.setCornerRadius(fA);
            }
        });
        TextView textView = this.f100730l;
        if (textView != null) {
            sg.bigo.ads.ad.interstitial.d.a(textView, -1);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_16_17;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g
    protected final void l() {
        View view = this.f100810o;
        if (view != null) {
            view.setBackgroundColor(-1);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        sg.bigo.ads.core.a.a aVar;
        sg.bigo.ads.ad.b.b bVar = this.f101780f;
        if (bVar == null || (aVar = (sg.bigo.ads.core.a.a) bVar.f()) == null) {
            return true;
        }
        return aVar.aR();
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    protected final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    protected final void a(int i10, boolean z10, boolean z11) {
        sg.bigo.ads.ad.b.a.a(this.f100823u, 5);
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100823u, 4, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100823u, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.f100822t, 9);
        ViewGroup viewGroup = this.f100728j;
        if (z11) {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f100822t, 4, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f100822t, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        sg.bigo.ads.api.a.m mVar = this.f101781g;
        boolean z12 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z12 = false;
        }
        View view = this.f100810o;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            if (z12) {
                sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100810o, 8, this.f101780f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100810o, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    protected final void a(final Runnable runnable) {
        b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.i.2
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                i.this.m();
            }
        });
    }
}
