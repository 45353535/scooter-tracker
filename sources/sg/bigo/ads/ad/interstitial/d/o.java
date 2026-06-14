package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public class o extends m {
    private View G;
    private TextView H;

    public o(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final sg.bigo.ads.ad.interstitial.multi_img.d E() {
        sg.bigo.ads.ad.interstitial.multi_img.d dVarE = super.E();
        if (!L() || dVarE != sg.bigo.ads.ad.interstitial.multi_img.d.LTR) {
            return dVarE;
        }
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f101734c);
        return (!pVarA.a() || pVarA.f102604b < pVarA.f102605c) ? dVarE : sg.bigo.ads.ad.interstitial.multi_img.d.TILE;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final sg.bigo.ads.ad.interstitial.multi_img.c F() {
        return E() == sg.bigo.ads.ad.interstitial.multi_img.d.TILE ? sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF : super.F();
    }

    protected boolean L() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected void b(int i10) {
        super.b(i10);
        final View viewFindViewById = this.f100916q.findViewById(R.id.inter_media_ad_desc);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
        if (i10 < 0) {
            return;
        }
        viewFindViewById.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.o.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.t) o.this).f101734c)) {
                    return;
                }
                viewFindViewById.setVisibility(0);
                o.b(o.this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.625f, 1, 0.0f);
                translateAnimation.setDuration(600L);
                viewFindViewById.startAnimation(translateAnimation);
            }
        }, ((long) i10) * 1000);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    protected final void t() {
        super.t();
        if (E() == sg.bigo.ads.ad.interstitial.multi_img.d.TILE) {
            if (this.f100987z != null) {
                ((m) this).f100986y.setType(1);
                LinearLayout linearLayout = (LinearLayout) this.f100916q.findViewById(R.id.inter_media_container);
                if (linearLayout != null) {
                    Object tag = this.f100987z.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f101525e);
                    if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = (sg.bigo.ads.ad.interstitial.multi_img.view.b) tag;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.f101532k.getLayoutParams();
                        layoutParams.gravity = 17;
                        layoutParams.topMargin = 0;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.height = -1;
                        layoutParams.width = -1;
                        bVar.f101532k.setLayoutParams(layoutParams);
                    }
                    ((m) this).f100985x.removeView(this.f100987z);
                    Context context = ((m) this).f100985x.getContext();
                    int iA = sg.bigo.ads.common.utils.e.a(context, 20);
                    int iA2 = sg.bigo.ads.common.utils.e.a(context, 12);
                    final LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.leftMargin = iA;
                    layoutParams2.rightMargin = iA;
                    layoutParams2.bottomMargin = iA2;
                    linearLayout.addView(this.f100987z, 1, layoutParams2);
                    final LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((m) this).f100985x.getLayoutParams();
                    sg.bigo.ads.common.utils.u.a(((m) this).f100985x, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.o.2
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            int iA3 = sg.bigo.ads.common.utils.e.a(((m) o.this).f100985x.getContext(), 100);
                            int measuredHeight = ((m) o.this).f100985x.getMeasuredHeight();
                            if (measuredHeight < iA3) {
                                LinearLayout.LayoutParams layoutParams4 = layoutParams3;
                                layoutParams4.weight = 0.0f;
                                layoutParams4.height = iA3;
                                ((m) o.this).f100985x.setLayoutParams(layoutParams4);
                                int measuredHeight2 = o.this.f100987z.getMeasuredHeight();
                                LinearLayout.LayoutParams layoutParams5 = layoutParams2;
                                layoutParams5.height = measuredHeight2 - (iA3 - measuredHeight);
                                o.this.f100987z.setLayoutParams(layoutParams5);
                            }
                        }
                    });
                }
            }
            K();
        }
    }

    static /* synthetic */ void b(o oVar) {
        View view = oVar.G;
        if (view == null || oVar.H == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        oVar.H.getLocationOnScreen(iArr2);
        ViewGroup.LayoutParams layoutParams = oVar.H.getLayoutParams();
        layoutParams.width = (iArr[0] - iArr2[0]) - sg.bigo.ads.common.utils.e.a(oVar.f100916q.getContext(), 28);
        oVar.H.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected final void a(int i10, boolean z10, int i11, boolean z11) {
        if (E() == sg.bigo.ads.ad.interstitial.multi_img.d.TILE) {
            z11 = false;
            i11 = i10;
        }
        super.a(i10, z10, i11, z11);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    protected void a(sg.bigo.ads.ad.interstitial.q qVar) {
        super.a(qVar);
        this.G = qVar != null ? qVar.p(R.id.inter_btn_close) : null;
        TextView textView = (TextView) this.f100916q.findViewById(R.id.inter_title);
        this.H = textView;
        this.f100914o.b(textView);
        this.f100914o.b(this.f100921v);
        if (C()) {
            ((m) this).f100986y.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100921v.getLayoutParams();
            marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f100921v.getContext(), 0);
            this.f100921v.setLayoutParams(marginLayoutParams);
        }
    }
}
