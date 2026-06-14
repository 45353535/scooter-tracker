package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public class k extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected View f100829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected RoundedImageView f100830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected TextView f100831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected View f100832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected RoundedImageView f100833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected RoundedImageView f100834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Button f100835u;

    public k(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void a(double d10) {
        TextView textView;
        int i10;
        if (d10 <= 3.0d) {
            textView = this.f100730l;
            if (textView == null) {
                return;
            } else {
                i10 = sg.bigo.ads.ad.interstitial.d.f100903b;
            }
        } else {
            textView = this.f100730l;
            if (textView == null) {
                return;
            } else {
                i10 = sg.bigo.ads.ad.interstitial.d.f100902a;
            }
        }
        textView.setTextColor(sg.bigo.ads.common.w.b.a(i10, 0.6f));
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void d(final sg.bigo.ads.ad.interstitial.q qVar) {
        ViewGroup viewGroup = this.f100729k;
        if (viewGroup == null) {
            return;
        }
        this.f100829o = viewGroup.findViewById(R.id.inter_end_page);
        this.f100830p = (RoundedImageView) this.f100729k.findViewById(R.id.inter_icon);
        this.f100831q = (TextView) this.f100729k.findViewById(R.id.inter_title);
        l().a(this.f100830p);
        l().a(this.f100831q, null);
        this.f100832r = this.f100729k.findViewById(R.id.inter_end_page_image_layout);
        this.f100833s = (RoundedImageView) this.f100729k.findViewById(R.id.inter_end_page_image);
        this.f100834t = (RoundedImageView) this.f100729k.findViewById(R.id.inter_end_page_image_background);
        float fA = sg.bigo.ads.common.utils.e.a(this.f100833s.getContext(), 8);
        this.f100833s.setCornerRadius(fA);
        this.f100834t.setCornerRadius(fA);
        this.f100834t.setBackgroundColor(654311423);
        sg.bigo.ads.common.utils.u.a(this.f100832r, new u.a() { // from class: sg.bigo.ads.ad.interstitial.c.k.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(@NonNull Rect rect) {
                k.this.a(qVar, rect);
            }
        });
        a(f(qVar));
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_18;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f101780f.f()).i();
        TextView textView = (TextView) this.f100729k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    @NonNull
    protected sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f100665d;
    }

    protected final void m() {
        if (this.f100835u == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.f100835u);
    }

    protected void a(int i10) {
        Button button = (Button) this.f100729k.findViewById(R.id.inter_btn_cta);
        this.f100835u = button;
        if (button != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 8);
            this.f100835u.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, i10));
            sg.bigo.ads.ad.interstitial.d.a(this.f100835u, sg.bigo.ads.common.w.b.a(i10));
            l().a(this.f100835u);
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

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void a(int i10, boolean z10, boolean z11) {
        sg.bigo.ads.ad.b.a.a(this.f100833s, 5);
        sg.bigo.ads.ad.b.a.a(this.f100834t, 5);
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100833s, 4, this.f101780f, i10);
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100834t, 4, this.f101780f, i10);
        } else {
            ViewGroup viewGroup = this.f100728j;
            RoundedImageView roundedImageView = this.f100833s;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.q.F;
            sg.bigo.ads.ad.b.a.a(viewGroup, roundedImageView, 4, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100834t, 4, hVar, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.f100729k, 9);
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100729k, 4, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100729k, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void a(final Runnable runnable) {
        super.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.k.2
            @Override // java.lang.Runnable
            public final void run() {
                k.this.m();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    protected void a(sg.bigo.ads.ad.interstitial.q qVar, @NonNull Rect rect) {
        sg.bigo.ads.common.p pVarB = b(qVar);
        int iA = sg.bigo.ads.common.utils.e.a(this.f100832r.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i10 = iA * 2;
        int i11 = iWidth - i10;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f100832r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100833s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f100834t.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(pVarB.f102604b, pVarB.f102605c, iWidth, iHeight - i10);
        sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarB.f102604b, pVarB.f102605c, i11, iHeight);
        if (pVarA.a(pVarA2)) {
            layoutParams.width = pVarA.f102604b;
            layoutParams.height = pVarA.f102605c + i10;
            marginLayoutParams.topMargin = iA;
            marginLayoutParams.bottomMargin = iA;
            marginLayoutParams2.leftMargin = iA;
            marginLayoutParams2.rightMargin = iA;
        } else {
            layoutParams.width = pVarA2.f102604b + i10;
            layoutParams.height = pVarA2.f102605c;
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams2.topMargin = iA;
            marginLayoutParams2.bottomMargin = iA;
        }
        this.f100832r.requestLayout();
        this.f100833s.requestLayout();
        this.f100834t.requestLayout();
    }
}
