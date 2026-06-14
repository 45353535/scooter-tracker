package sg.bigo.ads.ad.interstitial.c;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public class v extends b {
    private ImageView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private IconListView E;
    private RoundedFrameLayout F;
    private Button G;
    private boolean H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RoundedFrameLayout f100866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private LinearLayout f100867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LinearLayout f100868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private RoundedFrameLayout f100869z;

    public v(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, bVar2, cVar);
        this.H = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    protected final void b(double d10) {
        Button button;
        int i10;
        super.b(d10);
        if (this.H) {
            return;
        }
        if (d10 <= 3.0d) {
            button = this.G;
            if (button == null) {
                return;
            } else {
                i10 = 857743652;
            }
        } else {
            button = this.G;
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
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_9;
    }

    static /* synthetic */ boolean b(v vVar) {
        vVar.H = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b, sg.bigo.ads.ad.interstitial.c.a
    protected final void a(int i10, boolean z10, boolean z11) {
        super.a(i10, z10, z11);
        sg.bigo.ads.api.a.m mVar = this.f101781g;
        if (mVar == null || mVar.a("endpage.ad_component_clickable_switch") == 1) {
            sg.bigo.ads.ad.b.a.a(this.f100866w, 18);
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100866w, 8, this.f101780f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f100728j, this.f100866w, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        IconListView iconListView = this.E;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i11 = 0; items != null && i11 < items.size(); i11++) {
                IconListView.a aVar = items.get(i11);
                sg.bigo.ads.ad.b.a.a(aVar.f101499d, 26);
                sg.bigo.ads.ad.b.a.a(this.f100728j, aVar.f101499d, 8, this.f101780f, i10);
                sg.bigo.ads.ad.b.a.a(aVar.f101502g, 26);
                sg.bigo.ads.ad.b.a.a(this.f100728j, aVar.f101502g, 8, this.f101780f, i10);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    protected final void g(sg.bigo.ads.ad.interstitial.q qVar) {
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
        this.f100866w = roundedFrameLayout;
        this.f100867x = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.f100868y = (LinearLayout) this.f100866w.findViewById(R.id.inter_media_ad_card_top_layout);
        this.f100869z = (RoundedFrameLayout) this.f100866w.findViewById(R.id.inter_rounded_icon_layout);
        this.A = (ImageView) this.f100866w.findViewById(R.id.inter_icon);
        this.B = (TextView) this.f100866w.findViewById(R.id.inter_title);
        this.C = (TextView) this.f100866w.findViewById(R.id.inter_company);
        this.D = (TextView) this.f100866w.findViewById(R.id.inter_description);
        this.F = (RoundedFrameLayout) this.f100866w.findViewById(R.id.inter_btn_cta_layout);
        this.G = (Button) this.f100866w.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.f100866w;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.F.getCornerRadiusTopRight(), this.f100866w.getCornerRadiusBottomLeft(), this.F.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.f100866w.findViewById(R.id.inter_download_msg);
        this.E = iconListView;
        iconListView.a(((a) this).f100727i);
        this.E.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f100730l.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f100730l.getContext(), 0);
        this.f100730l.setLayoutParams(marginLayoutParams2);
        this.f100772o.b(this.B);
        this.f100772o.b(this.D);
        this.f100772o.b(this.f100730l);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        final int iA = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 16);
        final int iA2 = sg.bigo.ads.common.utils.e.a(this.f100728j.getContext(), 40);
        final int iA3 = sg.bigo.ads.common.utils.e.a(this.f100729k.getContext(), 72);
        final Pair<Integer, Boolean> pairE = e(qVar);
        if (((a) this).f100727i != null) {
            final boolean[] zArr = {false, false};
            this.f100729k.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.v.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) v.this.f101780f)) {
                        return;
                    }
                    v.b(v.this);
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.c.v.1.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            v.this.n();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            zArr[0] = true;
                            RoundedFrameLayout roundedFrameLayout = v.this.F;
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            boolean[] zArr2 = zArr;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, zArr2[0], zArr2[1], ((Boolean) pairE.second).booleanValue());
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(final Transition transition) {
                            v.this.m();
                            sg.bigo.ads.common.w.b.a(v.this.f100867x, -1, new b.a() { // from class: sg.bigo.ads.ad.interstitial.c.v.1.1.1
                                @Override // sg.bigo.ads.common.w.b.a
                                public final long a() {
                                    return transition.getDuration();
                                }
                            });
                            RoundedFrameLayout roundedFrameLayout = v.this.F;
                            Button button = v.this.G;
                            int iIntValue = ((Integer) pairE.first).intValue();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, button, iIntValue, zArr, ((Boolean) pairE.second).booleanValue(), transition.getDuration());
                        }
                    });
                    TransitionManager.beginDelayedTransition(v.this.f100729k, transitionSet);
                    v.this.f100866w.setCornerRadius(iA);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.this.f100868y.getLayoutParams();
                    int i11 = iA;
                    marginLayoutParams.setMargins(i11, i11, i11, 0);
                    v.this.f100868y.setLayoutParams(marginLayoutParams);
                    v.this.f100869z.setCornerRadius(iA);
                    ViewGroup.LayoutParams layoutParams = v.this.A.getLayoutParams();
                    int i12 = iA3;
                    layoutParams.width = i12;
                    layoutParams.height = i12;
                    v.this.A.setLayoutParams(layoutParams);
                    v.this.C.setVisibility(0);
                    v.this.C.setTextColor(((Integer) pairE.first).intValue());
                    v.this.D.setTextSize(2, 12.0f);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v.this.D.getLayoutParams();
                    marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(v.this.f100728j.getContext(), 4);
                    v.this.D.setLayoutParams(marginLayoutParams2);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) v.this.E.getLayoutParams();
                    marginLayoutParams3.topMargin = iA;
                    v.this.E.setLayoutParams(marginLayoutParams3);
                    if (sg.bigo.ads.common.utils.k.a((Collection) v.this.E.getItems())) {
                        v.this.E.setVisibility(8);
                    } else {
                        v.this.E.setVisibility(0);
                    }
                    v.this.f100868y.removeView(v.this.F);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iA2);
                    int i13 = iA;
                    layoutParams2.setMargins(i13, i13, i13, i13);
                    v.this.f100867x.addView(v.this.F, layoutParams2);
                    v vVar = v.this;
                    vVar.f100772o.a(vVar.B);
                    v vVar2 = v.this;
                    vVar2.f100772o.a(vVar2.D);
                    v.this.B.setTextColor(sg.bigo.ads.ad.interstitial.d.f100903b);
                    v.this.D.setTextColor(sg.bigo.ads.ad.interstitial.d.f100903b);
                }
            }, ((long) Math.max(1, i10)) * 1000);
        } else {
            if (this.F == null || !((Boolean) pairE.second).booleanValue()) {
                return;
            }
            sg.bigo.ads.ad.interstitial.c.e(this.F);
        }
    }
}
