package sg.bigo.ads.ad.interstitial.c;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public class s extends b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f100843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f100844x;

    public s(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @NonNull sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, bVar2, cVar);
    }

    static /* synthetic */ void b(s sVar) {
        View view = sVar.f100843w;
        if (view == null || sVar.f100844x == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        sVar.f100844x.getLocationOnScreen(iArr2);
        ViewGroup.LayoutParams layoutParams = sVar.f100844x.getLayoutParams();
        layoutParams.width = (iArr[0] - iArr2[0]) - sg.bigo.ads.common.utils.e.a(sVar.f100729k.getContext(), 28);
        sVar.f100844x.setLayoutParams(layoutParams);
        sVar.f100844x.setLayerType(1, null);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    protected void g(sg.bigo.ads.ad.interstitial.q qVar) {
        super.g(qVar);
        this.f100843w = qVar != null ? qVar.p(R.id.inter_btn_close) : null;
        TextView textView = (TextView) this.f100729k.findViewById(R.id.inter_title);
        this.f100844x = textView;
        this.f100772o.b(textView);
        this.f100772o.b(this.f100730l);
        if (l()) {
            this.f100775r.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100730l.getLayoutParams();
            marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f100730l.getContext(), 0);
            this.f100730l.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_6;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    protected void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        final View viewFindViewById = this.f100729k.findViewById(R.id.inter_media_ad_desc);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
        if (i10 < 0) {
            return;
        }
        viewFindViewById.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.s.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) s.this.f101780f)) {
                    return;
                }
                viewFindViewById.setVisibility(0);
                s.b(s.this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.625f, 1, 0.0f);
                translateAnimation.setDuration(600L);
                viewFindViewById.startAnimation(translateAnimation);
            }
        }, ((long) i10) * 1000);
    }
}
