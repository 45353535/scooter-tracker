package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeVideoView extends MBridgeBaseView implements com.mbridge.msdk.video.signal.j {
    private static int R0;
    private static int S0;
    private static int T0;
    private static int U0;
    private static int V0;
    private static boolean W0;
    private static long X0;
    private boolean A;
    private int A0;
    private FrameLayout B;
    private int B0;
    private MBridgeClickCTAView C;
    private int C0;
    private com.mbridge.msdk.video.signal.factory.b D;
    private AcquireRewardPopViewParameters D0;
    private int E;
    private MBAcquireRewardPopView E0;
    private int F;
    private boolean F0;
    private RelativeLayout G;
    private RelativeLayout G0;
    private boolean H;
    private CollapsibleWebView H0;
    private boolean I;
    private RelativeLayout I0;
    private boolean J;
    private boolean J0;
    private String K;
    private int K0;
    private int L;
    private boolean L0;
    private int M;
    private boolean M0;
    private int N;
    private w N0;
    private MBAlertDialog O;
    private boolean O0;
    private com.mbridge.msdk.widget.dialog.b P;
    private Runnable P0;
    private String Q;
    private final Runnable Q0;
    private double R;
    private double S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f52658a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f52659b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f52660c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f52661d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f52662e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f52663f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f52664g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f52665h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private AdSession f52666i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private MediaEvents f52667j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private String f52668k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f52669l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f52670m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f52671m0;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;
    public PlayerView mPlayerView;
    public SoundImageView mSoundImageView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f52672n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f52673n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout f52674o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f52675o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f52676p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f52677p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ProgressBar f52678q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f52679q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private FeedBackButton f52680r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f52681r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f52682s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f52683s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MBridgeSegmentsProgressBar f52684t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f52685t0;
    public TextView tvFlag;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.video.module.listener.a f52686u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f52687u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u f52688v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f52689v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f52690w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f52691w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f52692x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private AlphaAnimation f52693x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.f f52694y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private MBridgeBaitClickView f52695y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f52696z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f52697z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeVideoView.this.f52661d0 = true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f52700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f52701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f52702d;

        b(int i10, int i11, int i12, int i13) {
            this.f52699a = i10;
            this.f52700b = i11;
            this.f52701c = i12;
            this.f52702d = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f52674o == null) {
                return;
            }
            MBridgeVideoView.this.f52674o.setVisibility(0);
            CampaignEx campaignEx = MBridgeVideoView.this.f52527b;
            if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
                return;
            }
            MBridgeVideoView.this.f52674o.setPadding(this.f52699a, this.f52700b, this.f52701c, this.f52702d);
            MBridgeVideoView.this.f52674o.startAnimation(MBridgeVideoView.this.f52693x0);
        }
    }

    class c implements com.mbridge.msdk.foundation.same.image.c {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f52705a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$c$a$a, reason: collision with other inner class name */
            class RunnableC0596a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Bitmap f52707a;

                RunnableC0596a(Bitmap bitmap) {
                    this.f52707a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MBridgeVideoView.this.f52676p.setVisibility(0);
                    MBridgeVideoView.this.f52676p.setImageBitmap(this.f52707a);
                }
            }

            a(Bitmap bitmap) {
                this.f52705a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    MBridgeVideoView.this.f52676p.post(new RunnableC0596a(a0.a(this.f52705a, 10)));
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b(MBridgeBaseView.TAG, str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled() || MBridgeVideoView.this.f52676p == null) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new a(bitmap));
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage());
                }
            }
        }
    }

    class d implements CollapsibleWebView.e {
        d() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, Map<String, String> map) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, Map<String, String> map) {
            String str;
            String str2;
            str = "";
            if (map != null) {
                String str3 = map.get("url");
                str = str3 != null ? str3 : "";
                str2 = map.get("description");
            } else {
                str2 = "";
            }
            a(str, str2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, String str) {
            JSONObject jSONObject;
            if (MBridgeVideoView.this.J0) {
                return;
            }
            MBridgeVideoView.this.J0 = true;
            if (MBridgeVideoView.this.G0 != null && MBridgeVideoView.this.G0.getVisibility() != 0) {
                MBridgeVideoView.this.G0.setVisibility(0);
            }
            Context context = MBridgeVideoView.this.getContext();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.click.a.a(context, mBridgeVideoView.f52527b, mBridgeVideoView.getUnitId(), MBridgeVideoView.this.f52527b.getNoticeUrl(), true, false, com.mbridge.msdk.click.retry.a.f46605o);
            try {
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                new com.mbridge.msdk.click.a(mBridgeVideoView2.f52526a, mBridgeVideoView2.Q).c(MBridgeVideoView.this.f52527b);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), MBridgeVideoView.this.f52527b);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("result", 1);
            if (MBridgeVideoView.this.f52686u != null) {
                try {
                    jSONObject = new JSONObject();
                } catch (JSONException e10) {
                    e = e10;
                    jSONObject = null;
                }
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f48598j, MBridgeVideoView.this.a(0));
                } catch (JSONException e11) {
                    e = e11;
                    e.printStackTrace();
                }
                MBridgeVideoView.this.f52686u.a(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, jSONObject);
                MBridgeVideoView.this.f52527b.setClickType(1);
                MBridgeVideoView.this.f52527b.setClickTempSource(1);
                MBridgeVideoView.this.f52527b.setTriggerClickSource(2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", MBridgeVideoView.this.f52527b);
                eVar.a("type", 9);
                ArrayList arrayList = new ArrayList();
                arrayList.add("web_view");
                eVar.a("click_path", arrayList.toString());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", MBridgeVideoView.this.f52527b, eVar);
            }
            eVar.a("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_render", MBridgeVideoView.this.f52527b, eVar);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, String str) {
            a(str, "timeout");
        }

        private void a(String str, String str2) {
            if (MBridgeVideoView.this.J0) {
                return;
            }
            MBridgeVideoView.this.J0 = true;
            if (str == null) {
                str = "";
            }
            if (MBridgeVideoView.this.G0 != null && MBridgeVideoView.this.G0.getVisibility() == 0) {
                MBridgeVideoView.this.G0.setVisibility(8);
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("result", 2);
            eVar.a("url", str);
            eVar.a("reason", str2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_render", MBridgeVideoView.this.f52527b, eVar);
        }
    }

    class e extends WebViewClient {
        e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            q0.b(MBridgeBaseView.TAG, "WebView called onRenderProcessGone");
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage());
                }
            }
            return true;
        }
    }

    class f implements CommonWebView.h {
        f() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (MBridgeVideoView.this.I0 != null) {
                MBridgeVideoView.this.I0.setVisibility(0);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("status", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_zoom", MBridgeVideoView.this.f52527b, eVar);
            }
            if (MBridgeVideoView.this.H0 != null) {
                MBridgeVideoView.this.H0.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
            }
            MBridgeVideoView.this.p();
        }
    }

    class g implements CommonWebView.h {
        g() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (MBridgeVideoView.this.I0 != null) {
                MBridgeVideoView.this.I0.setVisibility(8);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("status", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_zoom", MBridgeVideoView.this.f52527b, eVar);
            }
            if (MBridgeVideoView.this.H0 != null) {
                MBridgeVideoView.this.H0.setCustomizedToolBarMarginWidthPixel(0, MBridgeVideoView.this.K0, 0, 0);
            }
            MBridgeVideoView.this.o();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeVideoView.this.I0 != null) {
                MBridgeVideoView.this.I0.setVisibility(0);
            }
            if (MBridgeVideoView.this.G0 != null) {
                MBridgeVideoView.this.G0.setVisibility(8);
            }
            if (MBridgeVideoView.this.f52683s0) {
                return;
            }
            MBridgeVideoView.this.p();
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener != null) {
                mBridgeVideoView.f52527b.setTriggerClickSource(2);
                MBridgeVideoView.this.b("bait_click_clicked");
            }
        }
    }

    class j implements AcquireRewardPopViewBehaviourListener {
        j() {
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onOutOfContentClicked(float f10, float f11) {
            if (MBridgeVideoView.this.f52686u != null) {
                MBridgeVideoView.this.f52686u.a(105, "");
            }
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedFail(String str) {
            MBridgeVideoView.this.J = false;
            if (com.mbridge.msdk.util.b.b()) {
                MBridgeVideoView.this.setCover(false);
            }
            MBridgeVideoView.this.p();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView.f52527b, mBridgeVideoView.Q, MBridgeVideoView.this.f52697z0, 2, str);
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedSuccess(int i10) {
            MBridgeVideoView.this.J = false;
            if (com.mbridge.msdk.util.b.b()) {
                MBridgeVideoView.this.setCover(false);
            }
            int videoCompleteTime = MBridgeVideoView.this.getVideoCompleteTime() - i10;
            MBridgeVideoView.this.f52527b.setVideoCompleteTime(videoCompleteTime);
            MBridgeVideoView.this.p();
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(130, Integer.valueOf(videoCompleteTime));
            }
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView.f52527b, mBridgeVideoView.Q, MBridgeVideoView.this.f52697z0, 1, "");
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.B != null) {
                MBridgeVideoView.this.B.setVisibility(8);
            }
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.A0 <= 0) {
                MBridgeVideoView.this.showRewardPopView();
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                mBridgeVideoView.removeCallbacks(mBridgeVideoView.Q0);
            } else {
                MBridgeVideoView.W(MBridgeVideoView.this);
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                mBridgeVideoView2.postDelayed(mBridgeVideoView2.Q0, 1000L);
            }
        }
    }

    class n implements PlayerView.OnPlayerViewVisibleListener {
        n() {
        }

        @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
        public void playerViewVisibleCallback() {
            if (MBridgeVideoView.this.f52690w) {
                return;
            }
            MBridgeVideoView.this.f52690w = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener == null || mBridgeVideoView.f52688v == null) {
                return;
            }
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            mBridgeVideoView2.notifyListener.a(20, mBridgeVideoView2.f52688v);
        }
    }

    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f48598j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                MBridgeVideoView.this.f52527b.setClickTempSource(1);
                MBridgeVideoView.this.f52527b.setTriggerClickSource(2);
                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
            }
            if (MBridgeVideoView.this.f52667j0 != null) {
                try {
                    MBridgeVideoView.this.f52667j0.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "play video view:  click");
                } catch (Exception e11) {
                    q0.b("omsdk", e11.getMessage());
                }
            }
            MBridgeVideoView.this.setCTALayoutVisibleOrGone();
        }
    }

    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoView.this.f52527b.setClickTempSource(1);
            MBridgeVideoView.this.f52527b.setTriggerClickSource(2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_player_click", MBridgeVideoView.this.f52527b);
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f48598j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
            }
        }
    }

    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            Integer num = 2;
            PlayerView playerView = MBridgeVideoView.this.mPlayerView;
            if (playerView != null) {
                eVar.a("mute_state", Boolean.valueOf(playerView.isSilent()));
                if (MBridgeVideoView.this.mPlayerView.isSilent()) {
                    num = 1;
                }
            }
            if (num.intValue() == 1) {
                MBridgeVideoView.this.mMuteSwitch = 2;
            } else {
                MBridgeVideoView.this.mMuteSwitch = 1;
            }
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(5, num);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_sound_click", MBridgeVideoView.this.f52527b, eVar);
        }
    }

    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000148", MBridgeVideoView.this.f52527b, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            if (!MBridgeVideoView.this.f52664g0) {
                CampaignEx campaignEx = MBridgeVideoView.this.f52527b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || MBridgeVideoView.this.f52527b.getRewardTemplateMode().k() != 5002010 || !MBridgeVideoView.this.f52683s0) {
                    MBridgeVideoView.this.y();
                    return;
                }
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                if (mBridgeVideoView.notifyListener != null) {
                    mBridgeVideoView.L0 = true;
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.notifyListener.a(2, mBridgeVideoView2.c(mBridgeVideoView2.f52683s0));
                    return;
                }
                return;
            }
            MBridgeVideoView.this.f52689v0 = true;
            CampaignEx campaignEx2 = MBridgeVideoView.this.f52527b;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && MBridgeVideoView.this.f52527b.getRewardTemplateMode().k() == 5002010 && MBridgeVideoView.this.f52683s0) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.c(mBridgeVideoView4.f52683s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f52681r0) {
                MBridgeVideoView.this.y();
                return;
            }
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(123, "");
            }
        }
    }

    class s implements com.mbridge.msdk.widget.dialog.b {
        s() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            MBridgeVideoView.this.I = false;
            MBridgeVideoView.this.f52679q0 = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.I);
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView2.f52526a, mBridgeVideoView2.f52527b, mBridgeVideoView2.f52668k0, MBridgeVideoView.this.Q, 1, 1, 1);
            if (MBridgeVideoView.this.f52664g0 && MBridgeVideoView.this.f52669l0 == com.mbridge.msdk.foundation.same.a.H) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.c(mBridgeVideoView4.f52683s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f52664g0 && MBridgeVideoView.this.f52669l0 == com.mbridge.msdk.foundation.same.a.I) {
                MBridgeVideoView.this.p();
                return;
            }
            MBridgeVideoView mBridgeVideoView5 = MBridgeVideoView.this;
            if (mBridgeVideoView5.notifyListener != null) {
                mBridgeVideoView5.L0 = true;
                MBridgeVideoView.this.notifyListener.a(2, "");
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            MBridgeVideoView.this.I = false;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.I);
            if (MBridgeVideoView.this.f52664g0 && (MBridgeVideoView.this.f52669l0 == com.mbridge.msdk.foundation.same.a.I || MBridgeVideoView.this.f52669l0 == com.mbridge.msdk.foundation.same.a.H)) {
                MBridgeVideoView.this.f52677p0 = true;
                com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
                if (aVar != null) {
                    aVar.a(124, "");
                }
                MBridgeVideoView.this.f52687u0 = true;
                MBridgeVideoView.this.gonePlayingCloseView();
            }
            MBridgeVideoView.this.p();
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView2.f52526a, mBridgeVideoView2.f52527b, mBridgeVideoView2.f52668k0, MBridgeVideoView.this.Q, 1, 0, 1);
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }
    }

    class t implements com.mbridge.msdk.foundation.feedback.a {
        t() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeVideoView.this.o();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeVideoView.this.p();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeVideoView.this.p();
        }
    }

    public interface u {
        void a();
    }

    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f52731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f52732c;

        public String toString() {
            return "ProgressData{curPlayPosition=" + this.f52730a + ", allDuration=" + this.f52731b + '}';
        }
    }

    private static final class w extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeVideoView f52733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f52736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f52737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MediaEvents f52738f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f52743k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f52744l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CampaignEx f52745m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f52746n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f52747o;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private v f52739g = new v();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f52740h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f52741i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f52742j = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f52748p = false;

        public w(MBridgeVideoView mBridgeVideoView) {
            this.f52733a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.f52744l = mBridgeVideoView.getUnitId();
                this.f52745m = mBridgeVideoView.getCampaign();
            }
        }

        private void c() {
            int i10;
            CampaignEx campaignEx;
            String str;
            if (!s0.a().a("h_c_r_w_p_c", false) || (i10 = this.f52746n) == 100 || this.f52747o != 0 || this.f52748p || i10 == 0 || (campaignEx = this.f52745m) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f52745m.getAdType() == 287) {
                    str = this.f52745m.getRequestId() + this.f52745m.getId() + this.f52745m.getVideoUrlEncode();
                } else {
                    str = this.f52745m.getId() + this.f52745m.getVideoUrlEncode() + this.f52745m.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f52744l, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f52748p = true;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                }
            }
        }

        private void e() {
            MBridgeVideoView mBridgeVideoView = this.f52733a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f52670m.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 25.0f);
                this.f52733a.f52670m.setLayoutParams(layoutParams);
            }
            int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
            this.f52733a.f52670m.setPadding(iA, 0, iA, 0);
        }

        public int b() {
            return this.f52736d;
        }

        public void d() {
            this.f52733a = null;
            boolean unused = MBridgeVideoView.W0 = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                MediaEvents mediaEvents = this.f52738f;
                if (mediaEvents != null) {
                    mediaEvents.bufferFinish();
                    q0.a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f52733a.notifyListener.a(14, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f52738f != null) {
                    q0.a("omsdk", "play:  videoEvents.bufferStart()");
                    this.f52738f.bufferStart();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                this.f52733a.notifyListener.a(13, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.f52733a.f52683s0 = true;
            CampaignEx campaignEx = this.f52745m;
            if (campaignEx != null) {
                if (this.f52743k && campaignEx.getRewardTemplateMode() != null && this.f52745m.getRewardTemplateMode().k() == 5002010) {
                    this.f52733a.f52670m.setText("0");
                } else {
                    this.f52733a.f52670m.setText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                }
                this.f52745m.setVideoPlayProgress(100);
                if (this.f52745m.getAdSpaceT() == 2) {
                    this.f52733a.f52672n.setVisibility(4);
                    if (this.f52733a.f52680r != null) {
                        this.f52733a.f52680r.setClickable(false);
                    }
                    SoundImageView soundImageView = this.f52733a.mSoundImageView;
                    if (soundImageView != null) {
                        soundImageView.setClickable(false);
                    }
                }
            } else {
                this.f52733a.f52670m.setText("0");
            }
            MediaEvents mediaEvents = this.f52738f;
            if (mediaEvents != null) {
                mediaEvents.complete();
                q0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f52733a.mPlayerView.setClickable(false);
            String strC = this.f52733a.c(true);
            CampaignEx campaignEx2 = this.f52745m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.f52745m.getRewardTemplateMode().k() == 5002010) {
                this.f52733a.x();
            }
            CampaignEx campaignEx3 = this.f52745m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.f52733a) != null && mBridgeVideoView.f52692x != null) {
                MBridgeVideoView mBridgeVideoView2 = this.f52733a;
                if (mBridgeVideoView2.mCampaignSize > mBridgeVideoView2.mCurrPlayNum) {
                    HashMap map = new HashMap();
                    map.put(C4240b4.i.L, Integer.valueOf(this.f52733a.mCurrPlayNum));
                    int i10 = this.f52733a.mMuteSwitch;
                    if (i10 != 0) {
                        map.put("mute", Integer.valueOf(i10));
                    }
                    this.f52733a.f52692x.a(map);
                    return;
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f52733a;
            if (mBridgeVideoView3 != null) {
                mBridgeVideoView3.notifyListener.a(121, "");
                this.f52733a.notifyListener.a(11, strC);
            }
            int i11 = this.f52735c;
            this.f52734b = i11;
            this.f52733a.mCurrentPlayProgressTime = i11;
            boolean unused = MBridgeVideoView.W0 = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            q0.b("DefaultVideoPlayerStatusListener", "errorStr" + str);
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f52733a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.notifyListener.a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i10, int i11) {
            CampaignEx campaignEx;
            int videoCompleteTime;
            super.onPlayProgress(i10, i11);
            if (MBridgeVideoView.X0 == 0) {
                long unused = MBridgeVideoView.X0 = System.currentTimeMillis();
            }
            if (!this.f52733a.M0 && this.f52733a.f52694y != null) {
                this.f52733a.M0 = true;
                this.f52733a.f52694y.a();
            }
            if (this.f52733a.f52530e) {
                CampaignEx campaignEx2 = this.f52745m;
                if (campaignEx2 != null) {
                    videoCompleteTime = campaignEx2.getVideoCompleteTime();
                    if (videoCompleteTime <= 0) {
                        videoCompleteTime = i11;
                    }
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.f52745m.getCampaignUnitId() + "_1", i10);
                } else {
                    videoCompleteTime = 0;
                }
                CampaignEx campaignEx3 = this.f52745m;
                if (campaignEx3 != null && campaignEx3.isDynamicView() && this.f52745m.getDynamicTempCode() == 5) {
                    try {
                        b(videoCompleteTime, this.f52733a.f52696z, i10);
                    } catch (Exception e10) {
                        q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                    }
                } else {
                    a(videoCompleteTime, i11, i10);
                    this.f52739g.f52730a = i10;
                }
            }
            this.f52735c = i11;
            v vVar = this.f52739g;
            vVar.f52731b = i11;
            vVar.f52732c = this.f52733a.f52687u0;
            this.f52734b = i10;
            if (this.f52733a.f52682s != null) {
                this.f52733a.f52682s.setTag("" + this.f52734b);
            }
            MBridgeVideoView mBridgeVideoView = this.f52733a;
            mBridgeVideoView.mCurrentPlayProgressTime = i10;
            mBridgeVideoView.notifyListener.a(15, this.f52739g);
            MediaEvents mediaEvents = this.f52738f;
            if (mediaEvents != null) {
                int i12 = (i10 * 100) / i11;
                int i13 = ((i10 + 1) * 100) / i11;
                if (i12 <= 25 && 25 < i13 && !this.f52740h) {
                    this.f52740h = true;
                    mediaEvents.firstQuartile();
                    q0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i12 <= 50 && 50 < i13 && !this.f52741i) {
                    this.f52741i = true;
                    mediaEvents.midpoint();
                    q0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i12 <= 75 && 75 < i13 && !this.f52742j) {
                    this.f52742j = true;
                    mediaEvents.thirdQuartile();
                    q0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f52733a.f52664g0 && !this.f52733a.f52675o0 && this.f52733a.f52669l0 == com.mbridge.msdk.foundation.same.a.I) {
                this.f52733a.y();
            }
            try {
                MBridgeVideoView mBridgeVideoView2 = this.f52733a;
                if (mBridgeVideoView2 != null && mBridgeVideoView2.f52684t != null) {
                    int i14 = (i10 * 100) / i11;
                    this.f52733a.f52684t.setProgress(i14, this.f52733a.mCurrPlayNum - 1);
                    this.f52745m.setVideoPlayProgress(i14);
                }
                MBridgeVideoView mBridgeVideoView3 = this.f52733a;
                if (mBridgeVideoView3 != null) {
                    int i15 = mBridgeVideoView3.F != -5 ? this.f52733a.F : this.f52733a.E;
                    if (i15 != -1 && i10 == i15 && (campaignEx = this.f52733a.f52527b) != null && campaignEx.isDynamicView()) {
                        this.f52733a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th2) {
                q0.b("DefaultVideoPlayerStatusListener", th2.getMessage());
            }
            a(i10, i11);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i10) {
            PlayerView playerView;
            CampaignEx campaignEx;
            super.onPlayStarted(i10);
            MBridgeVideoView mBridgeVideoView = this.f52733a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.g();
            }
            if (!this.f52737e) {
                MBridgeVideoView mBridgeVideoView2 = this.f52733a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.A = true;
                    this.f52733a.notifyListener.a(10, this.f52739g);
                }
                this.f52737e = true;
            }
            this.f52736d = i10;
            CampaignEx campaignEx2 = this.f52745m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i10;
                }
                if (this.f52745m.isDynamicView()) {
                    b(videoCompleteTime);
                } else {
                    a(videoCompleteTime);
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f52733a;
            if (mBridgeVideoView3 != null && mBridgeVideoView3.f52678q != null) {
                this.f52733a.f52678q.setMax(i10);
            }
            MBridgeVideoView mBridgeVideoView4 = this.f52733a;
            if (mBridgeVideoView4 != null && mBridgeVideoView4.f52674o != null && (campaignEx = this.f52745m) != null && campaignEx.getAdSpaceT() == 2) {
                this.f52733a.f52674o.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView5 = this.f52733a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.f52670m != null && this.f52733a.f52670m.getVisibility() == 0) {
                this.f52733a.f();
            }
            boolean unused = MBridgeVideoView.W0 = false;
            if (this.f52733a != null && this.f52745m.isDynamicView()) {
                if (this.f52733a.F != -5) {
                    if (this.f52733a.F == 0) {
                        this.f52733a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f52733a.E == 0) {
                    this.f52733a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView6 = this.f52733a;
            if (mBridgeVideoView6 != null) {
                mBridgeVideoView6.showMoreOfferInPlayTemplate();
                this.f52733a.showBaitClickView();
                this.f52733a.q();
            }
            if (this.f52738f != null) {
                try {
                    MBridgeVideoView mBridgeVideoView7 = this.f52733a;
                    this.f52738f.start(i10, (mBridgeVideoView7 == null || (playerView = mBridgeVideoView7.mPlayerView) == null) ? 0.0f : playerView.getVolume());
                    q0.a("omsdk", "play video view:  videoEvents.start");
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
        }

        public void a(CampaignEx campaignEx) {
            this.f52745m = campaignEx;
        }

        public void b(int i10, int i11) {
            this.f52746n = i10;
            this.f52747o = i11;
            c();
        }

        public void a(boolean z10) {
            this.f52743k = z10;
        }

        public void a(String str) {
            this.f52744l = str;
        }

        private void b(int i10) {
            MBridgeVideoView mBridgeVideoView = this.f52733a;
            if (mBridgeVideoView == null || mBridgeVideoView.f52670m == null) {
                return;
            }
            String str = "mbridge_reward_video_time_count_num_bg";
            if (this.f52745m.getDynamicTempCode() == 5) {
                MBridgeVideoView mBridgeVideoView2 = this.f52733a;
                if (mBridgeVideoView2.mCurrPlayNum > 1 && i10 <= 0) {
                    mBridgeVideoView2.f52670m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    e();
                    return;
                }
            }
            if (i10 > 0) {
                if (!this.f52743k || this.f52745m.getDynamicTempCode() == 5) {
                    e();
                }
            } else {
                str = "mbridge_reward_shape_progress";
            }
            CampaignEx campaignEx = this.f52745m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1 && this.f52743k) {
                e();
            }
            this.f52733a.f52670m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "drawable"));
        }

        public int a() {
            return this.f52734b;
        }

        private void a(int i10) {
            if (i10 > 0) {
                this.f52733a.f52670m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
                int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
                layoutParams.addRule(1, i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_native_endcard_feed_btn", "id"));
                layoutParams.setMargins(iA, 0, 0, 0);
                this.f52733a.f52670m.setPadding(iA, 0, iA, 0);
                this.f52733a.f52670m.setLayoutParams(layoutParams);
                return;
            }
            this.f52733a.f52670m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_shape_progress", "drawable"));
        }

        private void a(int i10, int i11) {
            int i12;
            String str;
            int i13 = this.f52746n;
            if (i13 == 100 || this.f52748p || i13 == 0) {
                return;
            }
            if (this.f52747o > i13) {
                this.f52747o = i13 / 2;
            }
            int i14 = this.f52747o;
            if (i14 < 0 || i10 < (i12 = (i11 * i14) / 100)) {
                return;
            }
            if (this.f52745m.getAdType() != 94 && this.f52745m.getAdType() != 287) {
                str = this.f52745m.getId() + this.f52745m.getVideoUrlEncode() + this.f52745m.getBidToken();
            } else {
                str = this.f52745m.getRequestId() + this.f52745m.getId() + this.f52745m.getVideoUrlEncode();
            }
            com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f52744l, str);
            if (aVarA != null) {
                aVarA.A();
                this.f52748p = true;
                q0.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i12 + " and start download !");
            }
        }

        private void b(int i10, int i11, int i12) {
            int i13;
            StringBuilder sb2;
            MBridgeVideoView mBridgeVideoView = this.f52733a;
            if (mBridgeVideoView == null) {
                return;
            }
            String string = (String) mBridgeVideoView.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
            String str = (String) this.f52733a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
            if (i10 >= 0) {
                if (this.f52745m.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f52733a.L, i10);
                    if (iMin >= i10 || iMin <= 0) {
                        i13 = i10 - i12;
                        if (this.f52743k) {
                            if (i13 <= 0) {
                                this.f52733a.f52670m.setVisibility(4);
                            } else {
                                str = (String) this.f52733a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                            }
                        }
                    } else {
                        i13 = iMin - i12;
                        if (i13 <= 0) {
                            i13 = i10 - i12;
                            if (this.f52743k) {
                                this.f52733a.f52670m.setVisibility(4);
                            }
                        } else {
                            str = (String) this.f52733a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING));
                        }
                    }
                } else {
                    i13 = i10 - i12;
                }
                if (i13 > 0) {
                    string = i13 + str;
                }
            } else {
                i13 = i11 - i12;
                if (i13 > 0) {
                    if (i10 <= 0) {
                        sb2 = new StringBuilder();
                        sb2.append(i13);
                        sb2.append("");
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(i13);
                        sb2.append(str);
                    }
                    string = sb2.toString();
                } else if (i10 <= 0) {
                    string = "0";
                }
            }
            this.f52739g.f52730a = i12;
            this.f52733a.f52670m.setText(string);
            if (this.f52733a.f52678q != null && this.f52733a.f52678q.getVisibility() == 0) {
                this.f52733a.f52678q.setProgress(i12);
            }
            if (i13 >= this.f52733a.C0 || this.f52733a.E0 == null || !this.f52733a.J) {
                return;
            }
            this.f52733a.E0.onTimeLessThanReduce(i13);
        }

        private void a(int i10, int i11, int i12) {
            StringBuilder sb2;
            String str;
            String string;
            String str2;
            int i13 = 0;
            MBridgeVideoView mBridgeVideoView = this.f52733a;
            if (mBridgeVideoView == null) {
                return;
            }
            if (this.f52743k) {
                str2 = String.format("%s", Integer.valueOf(i11 - i12));
            } else {
                if (i10 > i11) {
                    i10 = i11;
                }
                int i14 = i10 <= 0 ? i11 - i12 : i10 - i12;
                if (i14 <= 0) {
                    string = i10 <= 0 ? "0" : (String) mBridgeVideoView.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    if (i10 <= 0) {
                        sb2 = new StringBuilder();
                        sb2.append(i14);
                        str = "";
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(i14);
                        str = (String) this.f52733a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
                    }
                    sb2.append(str);
                    string = sb2.toString();
                    i13 = i14;
                }
                if (i13 < this.f52733a.C0 && this.f52733a.E0 != null && this.f52733a.J) {
                    this.f52733a.E0.onTimeLessThanReduce(i13);
                }
                str2 = string;
            }
            CampaignEx campaignEx = this.f52745m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1) {
                int iMin = Math.min(this.f52733a.L, i11);
                if (iMin >= i10 || iMin < 0) {
                    int i15 = i10 - i12;
                    if (this.f52743k) {
                        if (i15 > 0) {
                            str2 = i15 + ((String) this.f52733a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                        } else if (i15 == 0) {
                            this.f52733a.f52670m.setVisibility(4);
                        }
                    }
                } else {
                    int i16 = iMin - i12;
                    if (i16 > 0) {
                        str2 = i16 + ((String) this.f52733a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                    } else if (this.f52743k && i16 == 0) {
                        this.f52733a.f52670m.setVisibility(4);
                    }
                }
            }
            this.f52733a.f52670m.setText(str2);
            if (this.f52733a.f52678q == null || this.f52733a.f52678q.getVisibility() != 0) {
                return;
            }
            this.f52733a.f52678q.setProgress(i12);
        }
    }

    public MBridgeVideoView(Context context) {
        super(context);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f52690w = false;
        this.f52696z = 0;
        this.H = false;
        this.I = false;
        this.J = false;
        this.Q = "";
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f52658a0 = false;
        this.f52659b0 = false;
        this.f52660c0 = false;
        this.f52661d0 = false;
        this.f52662e0 = false;
        this.f52664g0 = false;
        this.f52665h0 = 2;
        this.f52675o0 = false;
        this.f52677p0 = false;
        this.f52679q0 = false;
        this.f52681r0 = true;
        this.f52683s0 = false;
        this.f52685t0 = false;
        this.f52687u0 = false;
        this.f52689v0 = false;
        this.f52691w0 = false;
        this.f52697z0 = 0;
        this.A0 = 5;
        this.B0 = 5;
        this.C0 = 5;
        this.F0 = false;
        this.J0 = false;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        this.N0 = new w(this);
        this.O0 = false;
        this.P0 = new k();
        this.Q0 = new m();
    }

    static /* synthetic */ int W(MBridgeVideoView mBridgeVideoView) {
        int i10 = mBridgeVideoView.A0;
        mBridgeVideoView.A0 = i10 - 1;
        return i10;
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.Q, false).g();
    }

    private int getVideoAllDuration() {
        try {
            w wVar = this.N0;
            int iB = wVar != null ? wVar.b() : 0;
            return iB == 0 ? this.f52527b.getVideoLength() : iB;
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoCompleteTime() {
        int videoCompleteTime = 0;
        try {
            int videoAllDuration = getVideoAllDuration();
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null) {
                videoCompleteTime = campaignEx.getVideoCompleteTime();
                if (this.f52527b.getDynamicTempCode() != 5 && videoCompleteTime > videoAllDuration) {
                    videoCompleteTime = videoAllDuration;
                }
                if (videoCompleteTime > 0) {
                    return videoCompleteTime;
                }
            }
            return videoAllDuration;
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
            return videoCompleteTime;
        }
    }

    private void setBlurBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new c());
    }

    private void setPlayerViewRadius(int i10) {
        if (i10 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v0.a(getContext(), i10));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.mPlayerView.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.mPlayerView.setClipToOutline(true);
        }
    }

    private void t() {
    }

    public void addCTAView() {
        if (this.B == null) {
            return;
        }
        if (this.C == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.C = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.f52527b);
            this.C.setUnitId(this.Q);
            com.mbridge.msdk.video.module.listener.a aVar = this.f52686u;
            if (aVar != null) {
                this.C.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.i(aVar));
            }
            this.C.preLoadData(this.D);
        }
        this.B.addView(this.C);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        this.I = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        if (i10 == 1) {
            this.f52689v0 = true;
            if (getVisibility() == 0) {
                y();
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000148", this.f52527b, eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f52527b);
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
        if (i11 == 1) {
            gonePlayingCloseView();
        } else if (i11 == 2) {
            if (this.f52687u0 && getVisibility() == 0) {
                return;
            }
            x();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.T = true;
        showVideoLocation(0, 0, v0.g(this.f52526a), v0.f(this.f52526a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.L == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.O;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(125, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return V0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return T0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return R0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return S0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return U0;
    }

    public int getBufferTimeout() {
        return this.M;
    }

    public int getCloseAlert() {
        return this.N;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        try {
            int iA = this.N0.a();
            CampaignEx campaignEx = this.f52527b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(iA, videoLength));
            jSONObject.put("time", iA);
            jSONObject.put("duration", videoLength + "");
            return jSONObject.toString();
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return JsonUtils.EMPTY_JSON;
        }
    }

    public int getMute() {
        return this.f52665h0;
    }

    public String getPlayURL() {
        return this.K;
    }

    public String getUnitId() {
        return this.Q;
    }

    public int getVideoSkipTime() {
        return this.L;
    }

    public void gonePlayingCloseView() {
        if (this.f52530e && this.f52672n.getVisibility() != 8) {
            this.f52672n.setVisibility(8);
            this.f52658a0 = false;
        }
        i();
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        if (this.I) {
            this.I = false;
            this.f52675o0 = true;
            setShowingAlertViewCover(false);
            com.mbridge.msdk.foundation.same.report.j.a(this.f52526a, this.f52527b, com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.Q, false).c(), this.Q, 1, i10, 1);
            if (i10 == 0) {
                p();
                if (this.f52664g0) {
                    int i11 = this.f52669l0;
                    if (i11 == com.mbridge.msdk.foundation.same.a.I || i11 == com.mbridge.msdk.foundation.same.a.H) {
                        this.f52677p0 = true;
                        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        CampaignEx campaignEx = this.f52527b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f52527b.getRewardTemplateMode().k() == 5002010) {
                            x();
                            return;
                        } else {
                            this.f52687u0 = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.f52679q0 = true;
            boolean z10 = this.f52664g0;
            if (z10 && this.f52669l0 == com.mbridge.msdk.foundation.same.a.I) {
                p();
                return;
            }
            if (z10 && this.f52669l0 == com.mbridge.msdk.foundation.same.a.H) {
                com.mbridge.msdk.video.module.listener.a aVar2 = this.notifyListener;
                if (aVar2 != null) {
                    this.L0 = true;
                    aVar2.a(2, c(this.f52683s0));
                    return;
                }
                return;
            }
            com.mbridge.msdk.video.module.listener.a aVar3 = this.notifyListener;
            if (aVar3 != null) {
                this.L0 = true;
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return getLayoutParams().height < v0.f(this.f52526a.getApplicationContext());
    }

    public boolean isInstDialogShowing() {
        return this.F0;
    }

    public boolean isMiniCardShowing() {
        return this.W;
    }

    public boolean isRewardPopViewShowing() {
        return this.J;
    }

    public boolean isShowingAlertView() {
        return this.I;
    }

    public boolean isShowingTransparent() {
        return this.f52662e0;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i10 = iIndexOfChild + 1;
        boolean z10 = false;
        while (i10 <= childCount - 1) {
            if (viewGroup.getChildAt(i10).getVisibility() == 0 && this.W) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.f52659b0 = true;
            this.f52661d0 = false;
        } else if (i10 == 1) {
            this.f52660c0 = true;
        }
    }

    public void notifyVideoClose() {
        this.L0 = true;
        this.notifyListener.a(2, "");
    }

    public void onActivityPause() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onPause();
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.W || this.I || this.f52677p0) {
            return;
        }
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f52527b.getRewardTemplateMode().k() == 5002010 && (z10 = this.f52683s0)) {
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                this.L0 = true;
                aVar.a(2, c(z10));
                return;
            }
            return;
        }
        if (this.f52658a0) {
            y();
            return;
        }
        boolean z11 = this.f52659b0;
        if (z11 && this.f52660c0) {
            y();
        } else {
            if (z11 || !this.f52661d0) {
                return;
            }
            y();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f52527b;
        if ((campaignEx == null || !campaignEx.isDynamicView()) && this.f52530e && this.T) {
            u();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.P0 != null) {
                getHandler().removeCallbacks(this.P0);
            }
            if (this.f52697z0 != 0) {
                removeCallbacks(this.Q0);
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.D = bVar;
        if (!this.f52530e) {
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(12, "MBridgeVideoView initSuccess false");
            }
        } else if (!TextUtils.isEmpty(this.K) && this.f52527b != null) {
            AdSession adSession = this.f52666i0;
            if (adSession != null) {
                adSession.registerAdView(this.mPlayerView);
                SoundImageView soundImageView = this.mSoundImageView;
                if (soundImageView != null) {
                    this.f52666i0.addFriendlyObstruction(soundImageView, FriendlyObstructionPurpose.OTHER, null);
                }
                this.f52666i0.addFriendlyObstruction(this.f52670m, FriendlyObstructionPurpose.OTHER, null);
                this.f52666i0.addFriendlyObstruction(this.f52672n, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            k();
            this.mPlayerView.initBufferIngParam(this.M);
            this.mPlayerView.initVFPData(this.K, this.f52527b.getVideoUrlEncode(), this.N0);
            soundOperate(this.f52665h0, -1, null);
        }
        W0 = false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        ProgressBar progressBar;
        if (this.f52530e) {
            if (i10 == 1) {
                ProgressBar progressBar2 = this.f52678q;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i10 != 2 || (progressBar = this.f52678q) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        if (this.f52530e) {
            q0.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
            CampaignEx campaignEx = this.f52527b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            if (i10 > 0 && i10 <= videoLength && this.mPlayerView != null) {
                q0.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
                this.mPlayerView.seekTo(i10 * 1000);
            }
            if (i11 == 1) {
                this.f52670m.setVisibility(8);
            } else if (i11 == 2) {
                this.f52670m.setVisibility(0);
            }
            if (this.f52670m.getVisibility() == 0) {
                f();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null && !this.V) {
                playerView.release();
                if (!TextUtils.isEmpty(this.K)) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    long jCurrentTimeMillis = X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - X0;
                    }
                    eVar.a("duration", Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f52527b, eVar);
                }
            }
            w wVar = this.N0;
            if (wVar != null) {
                wVar.d();
            }
            if (this.f52686u != null) {
                this.f52686u = null;
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f52666i0 = adSession;
    }

    public void setBufferTimeout(int i10) {
        this.M = i10;
    }

    public void setCTALayoutVisibleOrGone() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || this.B == null) {
            return;
        }
        if (campaignEx.getRewardTemplateMode() == null || this.f52527b.getRewardTemplateMode().k() != 902) {
            int i10 = this.F;
            if (i10 != -5) {
                if (i10 == -3) {
                    return;
                }
                if (this.C == null) {
                    addCTAView();
                }
                if (this.F == -1) {
                    if (this.B.getVisibility() != 0) {
                        this.B.setVisibility(0);
                        postDelayed(this.P0, 3000L);
                    } else {
                        this.B.setVisibility(8);
                        getHandler().removeCallbacks(this.P0);
                    }
                }
                if (this.F >= 0) {
                    this.B.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.E < -1) {
                return;
            }
            if (this.C == null) {
                addCTAView();
            }
            int i11 = this.E;
            if (i11 >= 0) {
                this.B.setVisibility(0);
                return;
            }
            if (i11 == -1) {
                if (this.B.getVisibility() != 0) {
                    this.B.setVisibility(0);
                    postDelayed(this.P0, 3000L);
                } else {
                    this.B.setVisibility(8);
                    getHandler().removeCallbacks(this.P0);
                }
            }
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.listener.a aVar, List<CampaignEx> list, int i10, int i11) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.f52692x = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i10;
        this.f52696z = i11;
        this.mCampOrderViewData = list;
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || campaignEx.getDynamicTempCode() != 5) {
            CampaignEx campaignEx2 = this.f52527b;
            if (campaignEx2 == null || campaignEx2.getProgressBarShow() != 1 || (mBridgeSegmentsProgressBar = this.f52684t) == null) {
                return;
            }
            mBridgeSegmentsProgressBar.init(1, 3);
            this.f52684t.setVisibility(0);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.f52684t;
        if (mBridgeSegmentsProgressBar2 == null || this.mCampOrderViewData == null) {
            return;
        }
        if (this.mCampaignSize > 1) {
            mBridgeSegmentsProgressBar2.setVisibility(0);
            this.f52684t.init(this.mCampaignSize, 2);
            for (int i12 = 0; i12 < this.mCampOrderViewData.size(); i12++) {
                int videoPlayProgress = this.mCampOrderViewData.get(i12).getVideoPlayProgress();
                if (videoPlayProgress > 0) {
                    this.f52684t.setProgress(videoPlayProgress, i12);
                }
                if (this.mCampOrderViewData.get(i12).isRewardPopViewShowed) {
                    this.H = true;
                }
            }
            return;
        }
        CampaignEx campaignEx3 = this.f52527b;
        if (campaignEx3 == null || campaignEx3.getProgressBarShow() != 1) {
            this.f52684t.setVisibility(8);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.f52684t;
        if (mBridgeSegmentsProgressBar3 != null) {
            mBridgeSegmentsProgressBar3.init(1, 3);
            this.f52684t.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        w wVar = this.N0;
        if (wVar != null) {
            wVar.a(campaignEx);
            this.N0.b(a(campaignEx), getCDRate());
        }
    }

    public void setCloseAlert(int i10) {
        this.N = i10;
    }

    public void setContainerViewOnNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f52686u = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        if (this.f52530e) {
            this.mPlayerView.setIsCovered(z10);
        }
    }

    public void setDialogRole(int i10) {
        this.f52681r0 = i10 == 1;
        q0.b(MBridgeBaseView.TAG, i10 + " " + this.f52681r0);
    }

    public void setIPlayVideoViewLayoutCallBack(com.mbridge.msdk.video.dynview.listener.f fVar) {
        this.f52694y = fVar;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f52669l0 = i10;
        this.f52671m0 = i11;
        this.f52673n0 = i12;
    }

    public void setInstDialogState(boolean z10) {
        PlayerView playerView;
        this.F0 = z10;
        if (!com.mbridge.msdk.util.b.a() || (playerView = this.mPlayerView) == null) {
            return;
        }
        playerView.setIsCovered(z10);
    }

    public void setIsIV(boolean z10) {
        this.f52664g0 = z10;
        w wVar = this.N0;
        if (wVar != null) {
            wVar.a(z10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        this.W = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        RelativeLayout relativeLayout;
        MBridgeVideoView mBridgeVideoView;
        try {
            q0.b(MBridgeBaseView.TAG, "NOTCH VideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i14 = layoutParams.leftMargin;
            int i15 = layoutParams.rightMargin;
            int i16 = layoutParams.topMargin;
            int i17 = layoutParams.bottomMargin;
            this.K0 = i12;
            if (Math.max(Math.max(i14, i15), Math.max(i16, i17)) <= Math.max(Math.max(i10, i11), Math.max(i12, i13)) && (relativeLayout = this.f52674o) != null) {
                mBridgeVideoView = this;
                try {
                    relativeLayout.postDelayed(mBridgeVideoView.new b(i10, i12, i11, i13), 200L);
                } catch (Exception e10) {
                    e = e10;
                    q0.b(MBridgeBaseView.TAG, e.getMessage());
                    return;
                }
            } else {
                mBridgeVideoView = this;
            }
            if (mBridgeVideoView.f52670m.getVisibility() == 0) {
                f();
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void setPlayURL(String str) {
        this.K = str;
    }

    public void setPlayerViewAttachListener(u uVar) {
        this.f52688v = uVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        this.f52663f0 = i10;
    }

    public void setShowingAlertViewCover(boolean z10) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z10 && (mBAcquireRewardPopView = this.E0) != null && this.J && this.I) {
            mBAcquireRewardPopView.onPause();
        }
        this.mPlayerView.setIsCovered(z10);
    }

    public void setShowingTransparent(boolean z10) {
        this.f52662e0 = z10;
    }

    public void setSoundState(int i10) {
        this.f52665h0 = i10;
    }

    public void setUnitId(String str) {
        this.Q = str;
        w wVar = this.N0;
        if (wVar != null) {
            wVar.a(str);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f52667j0 = mediaEvents;
        w wVar = this.N0;
        if (wVar != null) {
            wVar.f52738f = mediaEvents;
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f52527b = campaignEx;
            this.f52533h = campaignEx.isDynamicView();
        }
        if (this.f52533h) {
            a(this, campaignEx);
        } else {
            h();
        }
    }

    public void setVideoSkipTime(int i10) {
        this.L = i10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        setVisibility(i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        CampaignEx campaignEx;
        if (this.W) {
            return;
        }
        if (this.P == null) {
            this.P = new s();
        }
        if (this.O == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.P);
            this.O = mBAlertDialog;
            AdSession adSession = this.f52666i0;
            if (adSession != null) {
                adSession.addFriendlyObstruction(mBAlertDialog.getWindow().getDecorView(), FriendlyObstructionPurpose.NOT_VISIBLE, null);
            }
        }
        if (this.f52664g0) {
            this.O.makeIVAlertView(this.f52669l0, this.Q);
        } else {
            this.O.makeRVAlertView(this.Q);
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (playerView.isComplete() && ((campaignEx = this.f52527b) == null || campaignEx.getRewardTemplateMode() == null || this.f52527b.getRewardTemplateMode().k() != 5002010)) {
                return;
            }
            this.O.show();
            this.f52675o0 = true;
            this.I = true;
            setShowingAlertViewCover(true);
            String strC = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.Q, false).c();
            this.f52668k0 = strC;
            com.mbridge.msdk.foundation.same.report.j.a(this.f52526a, this.f52527b, strC, this.Q, 1, 1);
        }
    }

    public void showBaitClickView() {
        int i10;
        MBridgeBaitClickView mBridgeBaitClickView;
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f52527b.getRewardTemplateMode() == null) {
            return;
        }
        String strJ = this.f52527b.getRewardTemplateMode().j();
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        try {
            String strA = c1.a(strJ, "bait_click");
            if (TextUtils.isEmpty(strA) || (i10 = Integer.parseInt(strA)) == 0 || (mBridgeBaitClickView = this.f52695y0) == null) {
                return;
            }
            mBridgeBaitClickView.setVisibility(0);
            this.f52695y0.init(i10);
            this.f52695y0.startAnimation();
            this.f52695y0.setOnClickListener(new i());
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.notifyListener.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || this.G == null || !campaignEx.isDynamicView() || this.f52527b.getRewardTemplateMode() == null) {
            return;
        }
        String strJ = this.f52527b.getRewardTemplateMode().j();
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        try {
            String strA = c1.a(strJ, "mof");
            if (TextUtils.isEmpty(strA) || Integer.parseInt(strA) != 1) {
                return;
            }
            com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f52527b, this, new com.mbridge.msdk.video.module.listener.impl.i(this.f52686u), 1);
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void showRewardPopView() {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters;
        MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
        if (mBAcquireRewardPopView == null || (acquireRewardPopViewParameters = this.D0) == null) {
            return;
        }
        try {
            mBAcquireRewardPopView.init(acquireRewardPopViewParameters);
            this.E0.setVisibility(0);
            setCover(true);
            o();
            this.J = true;
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null) {
                campaignEx.isRewardPopViewShowed = true;
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        float f10;
        if (this.f52530e) {
            this.f52674o.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f52674o.getVisibility() != 0) {
                this.f52674o.setVisibility(0);
            }
            if (this.f52670m.getVisibility() == 0) {
                f();
            }
            if (!b(i12, i13) || this.T) {
                u();
                return;
            }
            S0 = i15;
            T0 = i16;
            U0 = i17 + 4;
            V0 = i18 + 4;
            float f11 = i12 / i13;
            try {
                f10 = (float) (this.R / this.S);
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                f10 = 0.0f;
            }
            if (i14 > 0) {
                R0 = i14;
                setPlayerViewRadius(i14);
            }
            if (Math.abs(f11 - f10) > 0.1f && this.f52663f0 != 1) {
                u();
                videoOperate(1);
                return;
            }
            u();
            if (!this.f52662e0) {
                setLayoutParam(i11, i10, i12, i13);
                return;
            }
            setLayoutCenter(i12, i13);
            if (W0) {
                this.notifyListener.a(114, "");
            } else {
                this.notifyListener.a(116, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        soundOperate(i10, i11, "2");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        q0.a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i10);
        if (this.f52530e) {
            if (i10 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    q0.a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.I0;
                    if ((relativeLayout != null && relativeLayout.getVisibility() != 0) || this.I || com.mbridge.msdk.foundation.feedback.b.f48549f) {
                        return;
                    }
                    if (!com.mbridge.msdk.util.b.a()) {
                        p();
                        return;
                    } else {
                        if (this.W || this.F0) {
                            return;
                        }
                        p();
                        return;
                    }
                }
                return;
            }
            if (i10 == 2) {
                if (getVisibility() == 0 && isfront()) {
                    q0.a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    o();
                    return;
                }
                return;
            }
            if (i10 == 3) {
                if (this.V) {
                    return;
                }
                this.mPlayerView.stop();
                CampaignEx campaignEx = this.f52527b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f52527b.getRewardTemplateMode().k() != 5002010) {
                    this.mPlayerView.release();
                    this.V = true;
                    if (TextUtils.isEmpty(this.K)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    long jCurrentTimeMillis = X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - X0;
                    }
                    eVar.a("duration", Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f52527b, eVar);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.util.b.a()) {
                    this.F0 = true;
                    if (this.V) {
                        return;
                    }
                    o();
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (com.mbridge.msdk.util.b.a()) {
                    this.F0 = false;
                    if (this.V || isMiniCardShowing()) {
                        return;
                    }
                    p();
                    return;
                }
                return;
            }
            if (i10 != 6 || this.V) {
                return;
            }
            this.mPlayerView.release();
            this.V = true;
            if (TextUtils.isEmpty(this.K)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            long jCurrentTimeMillis2 = X0;
            if (jCurrentTimeMillis2 != 0) {
                jCurrentTimeMillis2 = System.currentTimeMillis() - X0;
            }
            eVar2.a("duration", Long.valueOf(jCurrentTimeMillis2));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f52527b, eVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        w wVar;
        RelativeLayout relativeLayout;
        try {
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f52527b.getRewardTemplateMode().k() != 5002010 || (relativeLayout = this.I0) == null || relativeLayout.getVisibility() == 0) {
                if (!this.U) {
                    boolean zPlayVideo = this.mPlayerView.playVideo();
                    CampaignEx campaignEx2 = this.f52527b;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() != 2 && !zPlayVideo && (wVar = this.N0) != null) {
                        wVar.onPlayError("play video failed");
                    }
                    this.U = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
                if (mBAcquireRewardPopView != null && this.J) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.J) {
                    return;
                }
                if (!com.mbridge.msdk.util.b.a()) {
                    w();
                } else {
                    if (this.F0 || this.I) {
                        return;
                    }
                    this.mPlayerView.setIsCovered(false);
                    w();
                }
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String strJ;
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.H) {
            return;
        }
        if (!TextUtils.isEmpty(this.f52527b.getMof_template_url())) {
            strJ = this.f52527b.getMof_template_url();
        } else if (this.f52527b.getRewardTemplateMode() == null) {
            return;
        } else {
            strJ = this.f52527b.getRewardTemplateMode().j();
        }
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        try {
            String strA = c1.a(strJ, "guideShow");
            String strA2 = c1.a(strJ, "guideDelay");
            String strA3 = c1.a(strJ, "guideTime");
            String strA4 = c1.a(strJ, "guideRewardTime");
            if (!TextUtils.isEmpty(strA)) {
                this.f52697z0 = Integer.parseInt(strA);
            }
            if (!TextUtils.isEmpty(strA2)) {
                int i10 = Integer.parseInt(strA2);
                this.A0 = i10;
                if (i10 > 10 || i10 < 3) {
                    this.A0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA3)) {
                int i11 = Integer.parseInt(strA3);
                this.B0 = i11;
                if (i11 > 10 || i11 < 3) {
                    this.B0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA4)) {
                int i12 = Integer.parseInt(strA4);
                this.C0 = i12;
                if (i12 > 10 || i12 < 5) {
                    this.C0 = 5;
                }
            }
            int i13 = this.f52697z0;
            if (i13 > 0 && i13 <= 2) {
                int videoCompleteTime = getVideoCompleteTime();
                if (videoCompleteTime == 0 || videoCompleteTime > this.A0) {
                    int i14 = videoCompleteTime - this.A0;
                    if (i14 >= 0 && this.C0 > i14) {
                        this.C0 = i14;
                    }
                    int videoAllDuration = getVideoAllDuration();
                    if (this.C0 >= videoAllDuration) {
                        this.C0 = videoAllDuration - this.A0;
                    }
                    if (this.A0 >= videoAllDuration) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(this.f52527b.getAppName());
                    com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
                    this.D0 = new AcquireRewardPopViewParameters.Builder("", this.Q, this.f52697z0, gVarB != null ? gVarB.k() : "US").setAutoDismissTime(this.B0).setReduceTime(this.C0).setBehaviourListener(new j()).setRightAnswerList(arrayList).build();
                    postDelayed(this.Q0, 1000L);
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void r() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || campaignEx.getAdSpaceT() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.tvFlag.setText("AD");
        } else {
            this.tvFlag.setText("广告");
        }
    }

    private void s() {
        int iG;
        int iK;
        float fG = v0.g(this.f52526a);
        float f10 = v0.f(this.f52526a);
        double d10 = this.R;
        if (d10 > 0.0d) {
            double d11 = this.S;
            if (d11 > 0.0d && fG > 0.0f && f10 > 0.0f) {
                double d12 = d10 / d11;
                double d13 = fG / f10;
                q0.c(MBridgeBaseView.TAG, "videoWHDivide:" + d12 + "  screenWHDivide:" + d13);
                double dA = v0.a(Double.valueOf(d12));
                double dA2 = v0.a(Double.valueOf(d13));
                q0.c(MBridgeBaseView.TAG, "videoWHDivideFinal:" + dA + "  screenWHDivideFinal:" + dA2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
                if (dA > dA2) {
                    double d14 = (((double) fG) * this.S) / this.R;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d14;
                    layoutParams.gravity = 17;
                } else if (dA < dA2) {
                    layoutParams.width = (int) (((double) f10) * d12);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    CampaignEx campaignEx = this.f52527b;
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        if (this.f52527b.getRewardTemplateMode() != null) {
                            iK = this.f52527b.getRewardTemplateMode().k();
                            iG = this.f52527b.getRewardTemplateMode().g();
                        } else {
                            iG = this.f52526a.getResources().getConfiguration().orientation;
                            iK = 904;
                        }
                        if (iK == 102 || iK == 202) {
                            if (iG == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.S / (this.R / ((double) fG)));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (((double) f10) * d12);
                            }
                        }
                        if (iK == 202 && !TextUtils.isEmpty(this.f52527b.getImageUrl())) {
                            setBlurBackgroundImage(this.f52527b.getImageUrl());
                        }
                        if (iK == 302 || iK == 802 || iK == 5002010) {
                            double d15 = this.R;
                            double d16 = this.S;
                            if (d15 / d16 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d16 * ((double) fG)) / d15);
                            } else {
                                int iA = v0.a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.R * ((double) iA)) / this.S);
                                layoutParams.height = iA;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage());
                }
                this.mPlayerView.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        v();
    }

    private void u() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null) {
            return;
        }
        if (campaignEx.getAdSpaceT() == 2) {
            t();
        } else {
            s();
        }
    }

    private void v() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f52530e) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
            int iG = v0.g(this.f52526a);
            layoutParams.width = -1;
            layoutParams.height = (iG * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void w() {
        if (this.f52683s0) {
            if (!this.f52685t0) {
                this.mPlayerView.seekToEndFrame();
            }
            this.f52685t0 = true;
        } else {
            this.mPlayerView.onResume();
        }
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || campaignEx.isRewardPopViewShowed) {
            return;
        }
        post(this.Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (!this.f52530e || this.f52672n.getVisibility() == 0) {
            return;
        }
        if (!this.f52533h || this.A) {
            this.f52672n.setVisibility(0);
        }
        this.f52658a0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        int i10;
        com.mbridge.msdk.video.module.listener.a aVar;
        boolean z10;
        try {
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f52527b.getRewardTemplateMode().k() == 5002010 && this.L0 && !(z10 = this.f52683s0)) {
                com.mbridge.msdk.video.module.listener.a aVar2 = this.notifyListener;
                if (aVar2 != null) {
                    this.L0 = true;
                    aVar2.a(2, c(z10));
                    return;
                }
                return;
            }
            if (!this.f52664g0 || ((i10 = this.f52669l0) != com.mbridge.msdk.foundation.same.a.H && i10 != com.mbridge.msdk.foundation.same.a.I)) {
                CampaignEx campaignEx2 = this.f52527b;
                if (campaignEx2 == null || campaignEx2.getAdSpaceT() == 2) {
                    com.mbridge.msdk.video.module.listener.a aVar3 = this.notifyListener;
                    if (aVar3 != null) {
                        this.L0 = true;
                        aVar3.a(2, "");
                        return;
                    }
                    return;
                }
                boolean zM = m();
                if (zM && this.N == 1 && !this.f52662e0) {
                    o();
                    com.mbridge.msdk.video.module.listener.a aVar4 = this.notifyListener;
                    if (aVar4 != null) {
                        aVar4.a(8, "");
                        return;
                    }
                    return;
                }
                if (this.notifyListener != null) {
                    this.L0 = true;
                    if (this.f52527b.getAdType() == 94 && !zM) {
                        this.notifyListener.a(17, "");
                    }
                    this.notifyListener.a(2, c(!zM));
                    return;
                }
                return;
            }
            if (this.f52675o0) {
                if (i10 != com.mbridge.msdk.foundation.same.a.I || (aVar = this.notifyListener) == null) {
                    return;
                }
                this.L0 = true;
                aVar.a(2, c(this.f52683s0));
                return;
            }
            if (i10 == com.mbridge.msdk.foundation.same.a.I && this.f52689v0) {
                com.mbridge.msdk.video.module.listener.a aVar5 = this.notifyListener;
                if (aVar5 != null) {
                    this.L0 = true;
                    aVar5.a(2, c(this.f52683s0));
                    return;
                }
                return;
            }
            if (this.f52681r0) {
                int curPosition = this.mPlayerView.getCurPosition() / 1000;
                int videoLength = (int) ((curPosition / (this.mPlayerView.getDuration() == 0 ? this.f52527b.getVideoLength() : this.mPlayerView.getDuration())) * 100.0f);
                if (this.f52669l0 == com.mbridge.msdk.foundation.same.a.H) {
                    o();
                    int i11 = this.f52671m0;
                    if (i11 == com.mbridge.msdk.foundation.same.a.J && videoLength >= this.f52673n0) {
                        com.mbridge.msdk.video.module.listener.a aVar6 = this.notifyListener;
                        if (aVar6 != null) {
                            this.L0 = true;
                            aVar6.a(2, c(this.f52683s0));
                            return;
                        }
                        return;
                    }
                    if (i11 == com.mbridge.msdk.foundation.same.a.K && curPosition >= this.f52673n0) {
                        com.mbridge.msdk.video.module.listener.a aVar7 = this.notifyListener;
                        if (aVar7 != null) {
                            this.L0 = true;
                            aVar7.a(2, c(this.f52683s0));
                            return;
                        }
                        return;
                    }
                    com.mbridge.msdk.video.module.listener.a aVar8 = this.notifyListener;
                    if (aVar8 != null) {
                        aVar8.a(8, "");
                    }
                }
                if (this.f52669l0 == com.mbridge.msdk.foundation.same.a.I) {
                    int i12 = this.f52671m0;
                    if (i12 == com.mbridge.msdk.foundation.same.a.J && videoLength >= this.f52673n0) {
                        o();
                        com.mbridge.msdk.video.module.listener.a aVar9 = this.notifyListener;
                        if (aVar9 != null) {
                            aVar9.a(8, "");
                            return;
                        }
                        return;
                    }
                    if (i12 != com.mbridge.msdk.foundation.same.a.K || curPosition < this.f52673n0) {
                        return;
                    }
                    o();
                    com.mbridge.msdk.video.module.listener.a aVar10 = this.notifyListener;
                    if (aVar10 != null) {
                        aVar10.a(8, "");
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        com.mbridge.msdk.video.module.listener.a aVar;
        SoundImageView soundImageView;
        if (this.f52530e) {
            this.f52665h0 = i10;
            if (i10 == 1) {
                this.D.getJSCommon().g(i10);
                SoundImageView soundImageView2 = this.mSoundImageView;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.mPlayerView.closeSound();
                try {
                    MediaEvents mediaEvents = this.f52667j0;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                        q0.a("omsdk", "play video view:  mute");
                    }
                } catch (Exception e10) {
                    q0.a(POBOMSDKUtil.TAG, e10.getMessage());
                }
            } else if (i10 == 2) {
                this.D.getJSCommon().g(i10);
                SoundImageView soundImageView3 = this.mSoundImageView;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.mPlayerView.openSound();
                try {
                    MediaEvents mediaEvents2 = this.f52667j0;
                    if (mediaEvents2 != null) {
                        mediaEvents2.volumeChange(1.0f);
                        q0.a("omsdk", "play video view:  unmute");
                    }
                } catch (Exception e11) {
                    q0.a(POBOMSDKUtil.TAG, e11.getMessage());
                }
            }
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                SoundImageView soundImageView4 = this.mSoundImageView;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i11 == 1) {
                SoundImageView soundImageView5 = this.mSoundImageView;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i11 == 2 && (soundImageView = this.mSoundImageView) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.notifyListener) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(boolean z10) {
        if (!this.f52664g0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f52675o0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.F);
            }
            if (this.f52679q0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.D);
            }
            if (this.f52677p0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.E);
            }
            jSONObject.put("complete_info", z10 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            q0.b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.Q);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.Q + "_1", this.f52527b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            if (this.f52680r != null) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.Q + "_1", this.f52680r);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = this.f52680r;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CollapsibleWebView collapsibleWebView = this.H0;
        if (collapsibleWebView == null || this.f52527b == null || !TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            return;
        }
        this.H0.loadUrl(this.f52527b.getClickURL());
        this.H0.setToolBarTitle(this.f52527b.getAppName());
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = com.mbridge.msdk.setting.h.b().a();
        }
        this.H0.setPageLoadTimtout((int) gVarD.p0());
        this.H0.setPageLoadListener(new d());
        this.H0.setWebViewClient(new e());
        this.H0.setCollapseListener(new f());
        this.H0.setExpandListener(new g());
        this.H0.setExitsClickListener(new h());
    }

    private void h() {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (i0.a(iFindLayout)) {
            this.f52528c.inflate(iFindLayout, this);
            n();
        }
        W0 = false;
        r();
    }

    private void i() {
        if (this.O0 || this.f52661d0 || this.f52659b0) {
            return;
        }
        this.O0 = true;
        int i10 = this.L;
        if (i10 < 0) {
            return;
        }
        if (i10 == 0) {
            this.f52661d0 = true;
        } else {
            new Handler().postDelayed(new a(), this.L * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.B == null) {
            return;
        }
        if (this.C == null) {
            addCTAView();
        }
        if (this.B.getVisibility() != 0) {
            this.B.setVisibility(0);
            postDelayed(this.P0, 3000L);
        } else {
            this.B.setVisibility(8);
            getHandler().removeCallbacks(this.P0);
        }
    }

    private void k() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || !a1.b(campaignEx.getVideoResolution())) {
            return;
        }
        String videoResolution = this.f52527b.getVideoResolution();
        q0.c(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
        String[] strArrSplit = videoResolution.split("x");
        if (strArrSplit.length == 2) {
            if (v0.m(strArrSplit[0]) > 0.0d) {
                this.R = v0.m(strArrSplit[0]);
            }
            if (v0.m(strArrSplit[1]) > 0.0d) {
                this.S = v0.m(strArrSplit[1]);
            }
            q0.c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.R + "  mVideoH:" + this.S);
        }
        if (this.R <= 0.0d) {
            this.R = 1280.0d;
        }
        if (this.S <= 0.0d) {
            this.S = 720.0d;
        }
    }

    private boolean l() {
        try {
            this.mPlayerView = (PlayerView) findViewById(filterFindViewId(this.f52691w0, "mbridge_vfpv"));
            this.mSoundImageView = (SoundImageView) findViewById(filterFindViewId(this.f52691w0, "mbridge_sound_switch"));
            this.f52670m = (TextView) findViewById(filterFindViewId(this.f52691w0, "mbridge_tv_count"));
            View viewFindViewById = findViewById(filterFindViewId(this.f52691w0, "mbridge_rl_playing_close"));
            this.f52672n = viewFindViewById;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            this.f52674o = (RelativeLayout) findViewById(filterFindViewId(this.f52691w0, "mbridge_top_control"));
            this.f52676p = (ImageView) findViewById(filterFindViewId(this.f52691w0, "mbridge_videoview_bg"));
            this.f52678q = (ProgressBar) findViewById(filterFindViewId(this.f52691w0, "mbridge_video_progress_bar"));
            this.f52680r = (FeedBackButton) findViewById(filterFindViewId(this.f52691w0, "mbridge_native_endcard_feed_btn"));
            this.f52682s = (ImageView) findViewById(filterFindViewId(this.f52691w0, "mbridge_iv_link"));
            this.G0 = (RelativeLayout) findViewById(filterFindViewId(this.f52691w0, "mbridge_reward_scale_webview_layout"));
            this.I0 = (RelativeLayout) findViewById(filterFindViewId(this.f52691w0, "mbridge_reward_header_layout"));
            if (this.G0 != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.H0 = collapsibleWebView;
                this.G0.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            v0.a(1, this.f52682s, this.f52527b, this.f52526a, false, new t());
            this.f52684t = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.f52691w0, "mbridge_reward_segment_progressbar"));
            this.B = (FrameLayout) findViewById(filterFindViewId(this.f52691w0, "mbridge_reward_cta_layout"));
            this.f52695y0 = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f52691w0, "mbridge_animation_click_view"));
            this.G = (RelativeLayout) findViewById(filterFindViewId(this.f52691w0, "mbridge_reward_moreoffer_layout"));
            this.E0 = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.f52691w0, "mbridge_reward_popview"));
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.f52691w0, "mbridge_tv_flag"));
            return isNotNULL(this.mPlayerView, this.mSoundImageView, this.f52670m, this.f52672n);
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    private boolean m() {
        int videoCompleteTime = getVideoCompleteTime();
        int curPosition = (this.mPlayerView.getCurPosition() / 1000) + 1;
        if (this.f52527b.getDynamicTempCode() != 5 || this.mCurrPlayNum <= 1) {
            if ((videoCompleteTime <= 0 || curPosition >= videoCompleteTime) && videoCompleteTime != 0) {
                return false;
            }
        } else if (videoCompleteTime == 0 || videoCompleteTime <= 0 || curPosition >= videoCompleteTime) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        PlayerView playerView;
        boolean zL = l();
        this.f52530e = zL;
        if (!zL) {
            q0.b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (s0.a().a("i_l_s_t_r_i", false) && (playerView = this.mPlayerView) != null) {
            playerView.setNotifyListener(new n());
        }
        d();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f52693x0 = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.onPause();
                CampaignEx campaignEx = this.f52527b;
                if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
                    removeCallbacks(this.Q0);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    this.mPlayerView.setIsCovered(this.F0 || this.I || this.J);
                }
                CampaignEx campaignEx2 = this.f52527b;
                if (campaignEx2 == null || campaignEx2.getNativeVideoTracking() == null || this.f52527b.isHasReportAdTrackPause()) {
                    return;
                }
                this.f52527b.setHasReportAdTrackPause(true);
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx3 = this.f52527b;
                com.mbridge.msdk.click.a.a(contextD, campaignEx3, this.Q, campaignEx3.getNativeVideoTracking().s(), false, false);
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        if (this.f52530e) {
            b1.a(this.mPlayerView, this.f52527b.getLocalRequestId(), this.f52527b.getLocalAllowTrackClick());
            if (this.f52533h) {
                if (com.mbridge.msdk.video.dynview.util.a.b(this.f52527b) == -1 || com.mbridge.msdk.video.dynview.util.a.b(this.f52527b) == 100) {
                    this.mPlayerView.setOnClickListener(new o());
                }
            } else {
                this.mPlayerView.setOnClickListener(new p());
            }
            SoundImageView soundImageView = this.mSoundImageView;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new q());
            }
            this.f52672n.setOnClickListener(new r());
        }
    }

    private boolean b(int i10, int i11) {
        return i10 > 0 && i11 > 0 && v0.g(this.f52526a) >= i10 && v0.f(this.f52526a) >= i11;
    }

    private void a(ViewGroup viewGroup, CampaignEx campaignEx) {
        com.mbridge.msdk.video.dynview.c cVarB = new com.mbridge.msdk.video.dynview.wrapper.c().b(viewGroup, campaignEx);
        com.mbridge.msdk.video.dynview.b.a().a(cVarB, new l(viewGroup, campaignEx, cVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        JSONObject jSONObject;
        if (this.f52686u != null) {
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null) {
                campaignEx.setClickTempSource(1);
                try {
                    CampaignEx.c rewardTemplateMode = this.f52527b.getRewardTemplateMode();
                    String str2 = "";
                    if (rewardTemplateMode != null) {
                        str2 = rewardTemplateMode.k() + "";
                    }
                    com.mbridge.msdk.foundation.same.report.j.a(this.f52526a, str, this.f52527b.getCampaignUnitId(), this.f52527b.isBidCampaign(), this.f52527b.getRequestId(), this.f52527b.getRequestIdNotice(), this.f52527b.getId(), str2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e11) {
                e = e11;
                jSONObject = null;
            }
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f48598j, a(0));
            } catch (JSONException e12) {
                e = e12;
                e.printStackTrace();
            }
            this.f52686u.a(105, jSONObject);
            if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                try {
                    com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), this.f52527b);
                } catch (Exception e13) {
                    q0.b(MBridgeBaseView.TAG, e13.getMessage());
                }
            }
        }
    }

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return v0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return i11 + "";
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.Q, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.Q, false).w();
    }

    class l implements com.mbridge.msdk.video.dynview.listener.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f52717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f52718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.dynview.c f52719c;

        class a extends com.mbridge.msdk.widget.a {
            a() {
            }

            @Override // com.mbridge.msdk.widget.a
            protected void a(View view) {
                if (view instanceof TextView) {
                    MBridgeVideoView.this.f52527b.setTriggerClickSource(1);
                } else {
                    MBridgeVideoView.this.f52527b.setTriggerClickSource(2);
                }
                if (MBridgeVideoView.this.f52527b.getRewardTemplateMode() == null || MBridgeVideoView.this.f52527b.getRewardTemplateMode().k() != 902) {
                    MBridgeVideoView.this.b("video_play_click");
                } else {
                    MBridgeVideoView.this.j();
                }
            }
        }

        l(ViewGroup viewGroup, CampaignEx campaignEx, com.mbridge.msdk.video.dynview.c cVar) {
            this.f52717a = viewGroup;
            this.f52718b = campaignEx;
            this.f52719c = cVar;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                if (this.f52717a != null && aVar.b() != null) {
                    aVar.b().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f52717a.addView(aVar.b());
                }
                if (aVar.a() != null) {
                    for (View view : aVar.a()) {
                        b1.a(view, this.f52718b.getLocalRequestId(), this.f52718b.getLocalAllowTrackClick());
                        view.setOnClickListener(new a());
                    }
                }
                MBridgeVideoView.this.f52691w0 = aVar.c();
                MBridgeVideoView.this.n();
                boolean unused = MBridgeVideoView.W0 = false;
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                CampaignEx campaignEx = mBridgeVideoView.f52527b;
                if (campaignEx != null) {
                    campaignEx.setTemplateRenderSucc(mBridgeVideoView.f52691w0);
                }
                MBridgeVideoView.this.E = this.f52719c.j();
                MBridgeVideoView.this.F = this.f52719c.e();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            q0.b(MBridgeBaseView.TAG, "errorMsg：" + aVar.g());
        }
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f52690w = false;
        this.f52696z = 0;
        this.H = false;
        this.I = false;
        this.J = false;
        this.Q = "";
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f52658a0 = false;
        this.f52659b0 = false;
        this.f52660c0 = false;
        this.f52661d0 = false;
        this.f52662e0 = false;
        this.f52664g0 = false;
        this.f52665h0 = 2;
        this.f52675o0 = false;
        this.f52677p0 = false;
        this.f52679q0 = false;
        this.f52681r0 = true;
        this.f52683s0 = false;
        this.f52685t0 = false;
        this.f52687u0 = false;
        this.f52689v0 = false;
        this.f52691w0 = false;
        this.f52697z0 = 0;
        this.A0 = 5;
        this.B0 = 5;
        this.C0 = 5;
        this.F0 = false;
        this.J0 = false;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        this.N0 = new w(this);
        this.O0 = false;
        this.P0 = new k();
        this.Q0 = new m();
    }
}
