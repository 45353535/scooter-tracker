package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Bitmap;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public class u extends b {
    private TextView A;
    private TextView B;
    private ImageView C;
    private RoundedFrameLayout D;
    private Button E;
    private boolean F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RoundedFrameLayout f100852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private LinearLayout f100853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RoundedFrameLayout f100854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ImageView f100855z;

    public u(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, bVar2, cVar);
        this.F = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    protected final void b(double d10) {
        Button button;
        int i10;
        super.b(d10);
        if (this.F) {
            return;
        }
        if (d10 <= 3.0d) {
            button = this.E;
            if (button == null) {
                return;
            } else {
                i10 = 857743652;
            }
        } else {
            button = this.E;
            if (button == null) {
                return;
            } else {
                i10 = 872415231;
            }
        }
        button.setBackgroundColor(i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_8;
    }

    static /* synthetic */ boolean b(u uVar) {
        uVar.F = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b, sg.bigo.ads.ad.interstitial.c.a
    protected final void a(int i10, boolean z10, boolean z11) {
        super.a(i10, z10, z11);
        sg.bigo.ads.api.a.m mVar = this.f101781g;
        boolean z12 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z12 = false;
        }
        sg.bigo.ads.ad.b.a.a(this.f100852w, 18);
        if (z12) {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100852w, 8, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100852w, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    protected final void g(sg.bigo.ads.ad.interstitial.q qVar) {
        Bitmap bitmapA;
        super.g(qVar);
        if (l()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100775r.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 24);
            this.f100775r.setLayoutParams(marginLayoutParams);
            this.f100775r.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.f100729k.findViewById(R.id.inter_media_ad_card_layout);
        this.f100852w = roundedFrameLayout;
        this.f100853x = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_info_container);
        this.f100854y = (RoundedFrameLayout) this.f100852w.findViewById(R.id.inter_rounded_icon_layout);
        this.f100855z = (ImageView) this.f100852w.findViewById(R.id.inter_icon);
        this.A = (TextView) this.f100852w.findViewById(R.id.inter_title);
        this.B = (TextView) this.f100852w.findViewById(R.id.inter_description);
        this.D = (RoundedFrameLayout) this.f100729k.findViewById(R.id.inter_btn_cta_layout);
        this.E = (Button) this.f100852w.findViewById(R.id.inter_btn_cta);
        this.C = (ImageView) this.f100852w.findViewById(R.id.inter_star);
        RoundedFrameLayout roundedFrameLayout2 = this.f100852w;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.f100852w.getCornerRadiusTopRight(), this.D.getCornerRadiusBottomLeft(), this.D.getCornerRadiusBottomRight());
        ImageView imageView = this.C;
        if (imageView != null && (bitmapA = sg.bigo.ads.ad.interstitial.r.a(imageView.getContext(), this.f101780f, ((a) this).f100727i, sg.bigo.ads.ad.interstitial.g.BLACK)) != null) {
            this.C.setImageBitmap(bitmapA);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f100730l.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f100730l.getContext(), 0);
        this.f100730l.setLayoutParams(marginLayoutParams2);
        this.f100772o.b(this.A);
        this.f100772o.b(this.B);
        this.f100772o.b(this.f100730l);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        final int iA = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 12);
        final int iA2 = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 16);
        final int iA3 = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 20);
        final int iA4 = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 72);
        int iMax = Math.max(1, i10);
        final boolean[] zArr = {false, false};
        final Pair<Integer, Boolean> pairE = e(qVar);
        this.f100729k.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.u.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) u.this.f101780f)) {
                    return;
                }
                u.b(u.this);
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.c.u.1.1
                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition) {
                        u.this.n();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        zArr[0] = true;
                        RoundedFrameLayout roundedFrameLayout = u.this.D;
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        boolean[] zArr2 = zArr;
                        sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, zArr2[0], zArr2[1], ((Boolean) pairE.second).booleanValue());
                    }

                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                    public final void onTransitionStart(final Transition transition) {
                        u.this.m();
                        sg.bigo.ads.common.w.b.a(u.this.f100853x, -1, new b.a() { // from class: sg.bigo.ads.ad.interstitial.c.u.1.1.1
                            @Override // sg.bigo.ads.common.w.b.a
                            public final long a() {
                                return transition.getDuration();
                            }
                        });
                        RoundedFrameLayout roundedFrameLayout = u.this.D;
                        Button button = u.this.E;
                        int iIntValue = ((Integer) pairE.first).intValue();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, button, iIntValue, zArr, ((Boolean) pairE.second).booleanValue(), transition.getDuration());
                    }
                });
                TransitionManager.beginDelayedTransition(u.this.f100729k, transitionSet);
                u.this.f100852w.setCornerRadius(iA);
                if (u.this.l()) {
                    ViewGroup.LayoutParams layoutParams = u.this.f100775r.getLayoutParams();
                    layoutParams.height = iA2;
                    u.this.f100775r.setLayoutParams(layoutParams);
                }
                int childCount = u.this.f100853x.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = u.this.f100853x.getChildAt(i11);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    int i12 = iA2;
                    layoutParams2.leftMargin = i12;
                    layoutParams2.rightMargin = i12;
                    if (i11 == 0) {
                        layoutParams2.topMargin = i12;
                    }
                    if (i11 == childCount - 1) {
                        layoutParams2.bottomMargin = i12;
                    }
                    if (childAt.getId() == R.id.inter_btn_cta_layout) {
                        layoutParams2.topMargin = iA3;
                    }
                    childAt.setLayoutParams(layoutParams2);
                }
                u.this.f100854y.setCornerRadius(iA2);
                ViewGroup.LayoutParams layoutParams3 = u.this.f100855z.getLayoutParams();
                int i13 = iA4;
                layoutParams3.width = i13;
                layoutParams3.height = i13;
                u.this.f100855z.setLayoutParams(layoutParams3);
                u uVar = u.this;
                uVar.f100772o.a(uVar.A);
                u uVar2 = u.this;
                uVar2.f100772o.a(uVar2.B);
                u.this.A.setTextColor(sg.bigo.ads.ad.interstitial.d.f100903b);
                u.this.B.setTextColor(sg.bigo.ads.ad.interstitial.d.f100903b);
                u.this.C.setVisibility(0);
            }
        }, ((long) iMax) * 1000);
    }
}
