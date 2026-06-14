package sg.bigo.ads.ad.interstitial.k;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.c;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.e.a;

/* JADX INFO: loaded from: classes4.dex */
public class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected w f101411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    protected m f101412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.AbstractC1257a f101413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f101414d;

    protected a(@NonNull Activity activity) {
        super(activity);
        this.f101413c = new a.AbstractC1257a() { // from class: sg.bigo.ads.ad.interstitial.k.a.1
            @Override // sg.bigo.ads.common.e.a.AbstractC1257a
            public final void a(boolean z10) {
                a aVar = a.this;
                if (z10) {
                    aVar.ac();
                } else {
                    aVar.ae();
                }
            }
        };
        this.f101414d = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int Y() {
        return R.layout.bigo_ad_activity_interstitial_vpaid;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Z() {
        return true;
    }

    protected void a() {
        if (this.A == null) {
            return;
        }
        int i10 = this.f101411a.f101803c;
        if (((s) this.f101384y).f().x() != 4) {
            i10 = 0;
        }
        this.A.a(i10, (AdCountDownButton.b) null);
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        VideoController videoControllerAk = ak();
        if (videoControllerAk != null && videoControllerAk.isPaused() && this.f101414d) {
            videoControllerAk.play();
            this.f101414d = false;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f100519c) {
            return;
        }
        adCountDownButton.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public final void i() {
        VideoController videoControllerAk = ak();
        boolean z10 = videoControllerAk != null && videoControllerAk.isPlaying();
        this.f101414d = z10;
        if (z10) {
            videoControllerAk.pause();
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.b();
        }
        super.i();
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void l() {
        super.l();
        this.f101412b = ((s) this.f101384y).f().e();
        w wVar = new w();
        m mVar = this.f101412b;
        if (mVar != null) {
            wVar.f101806f = mVar.c("video_play_page.media_view_clickable_switch");
            wVar.f101807g = this.f101412b.c("video_play_page.other_space_clickable_switch");
            wVar.f101809i = this.f101412b.a("video_play_page.click_type");
            wVar.f101803c = this.f101412b.a("video_play_page.force_staying_time");
        }
        this.f101411a = wVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int n() {
        return 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void g(int i10) {
        super.g(i10);
        if (this.D == null) {
            a("can not find ad root view.");
            return;
        }
        if (this.f101384y == 0) {
            a("Illegal InterstitialAd.");
            return;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            sg.bigo.ads.common.e.a.a(adCountDownButton, this.f101413c);
            this.A.setShowCloseButtonInCountdown(false);
            this.A.setTakeoverTickEvent(false);
            if (this.A.getVisibility() != 0) {
                this.A.setVisibility(0);
                c.b((View) this.A);
            }
            a();
        }
        ViewGroup viewGroup = this.D;
        if (viewGroup != null && this.C != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
            TextView textView2 = (TextView) this.D.findViewById(R.id.inter_ad_label);
            String advertiser = this.C.getAdvertiser();
            if (textView != null && textView2 != null) {
                boolean zIsEmpty = TextUtils.isEmpty(advertiser);
                textView.setVisibility(!zIsEmpty ? 0 : 8);
                if (!zIsEmpty) {
                    textView.setText(advertiser);
                    textView2.setText(R.string.bigo_ad_tag);
                }
            }
        }
        t tVarAj = aj();
        ViewGroup viewGroup2 = this.D;
        tVarAj.a(viewGroup2, viewGroup2, ai(), 12, this.f101411a.f101809i, this.A);
    }
}
