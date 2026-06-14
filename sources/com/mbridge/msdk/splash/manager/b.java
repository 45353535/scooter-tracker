package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import com.taurusx.tax.ui.CircularProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f50696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MBSplashView f50697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f50698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f50699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f50700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f50701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f50702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f50703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f50704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected MBridgeIds f50705k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f50711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f50712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Context f50713s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f50715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f50716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdSession f50717w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f50695a = "SplashShowManager";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f50706l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f50707m = "点击跳过|";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f50708n = "点击跳过|";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f50709o = "秒";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f50710p = "秒后自动关闭";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f50714t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnClickListener f50718x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f50719y = new HandlerC0569b(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f50720z = true;
    protected j A = new e();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f50700f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    class HandlerC0569b extends Handler {
        HandlerC0569b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r9) {
            /*
                Method dump skipped, instruction units count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.b.HandlerC0569b.handleMessage(android.os.Message):void");
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    class e implements j {
        e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f50697c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f50697c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, b.this.f50697c);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f50726a;

        f(int i10) {
            this.f50726a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f50726a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f50728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50729b;

        g(Context context, CampaignEx campaignEx) {
            this.f50728a = context;
            this.f50729b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f50728a)).b(this.f50729b.getId());
            } catch (Exception unused) {
                q0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    class h implements com.mbridge.msdk.foundation.feedback.a {
        h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }
    }

    private class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f50697c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }

        /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            q0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f50706l = i10;
            bVar.f50719y.removeMessages(1);
            b.this.f50719y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f50719y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f50698d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f50698d.a(bVar.f50705k);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f50696b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    b.this.b(campaignWithBackData, true, str);
                }
            } catch (Exception e10) {
                q0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f50719y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f50706l = i11;
                bVar.f50719y.removeMessages(1);
                b.this.f50719y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f50703i = str2;
        this.f50704j = str;
        this.f50705k = new MBridgeIds(str, str2);
        this.f50713s = context;
        if (this.f50701g == null) {
            TextView textView = new TextView(context);
            this.f50701g = textView;
            textView.setGravity(1);
            this.f50701g.setTextIsSelectable(false);
            this.f50701g.setPadding(v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f50701g.getLayoutParams();
            this.f50701g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v0.a(context, 100.0f), v0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        try {
            if (this.f50696b == null) {
                return;
            }
            this.f50712r = true;
            if (this.f50698d != null && (mBSplashView = this.f50697c) != null) {
                if (mBSplashView.getContext() != null && (this.f50697c.getContext() instanceof Activity) && ((Activity) this.f50697c.getContext()).isFinishing()) {
                    q0.a("SplashShowManager", "Activity is finishing");
                }
                if (this.f50697c.isShown()) {
                    this.f50698d.b(this.f50705k);
                } else {
                    this.f50698d.a(this.f50705k, "SplashView or container is not visibility");
                }
            }
            if (!this.f50696b.isReport()) {
                MBSplashView mBSplashView2 = this.f50697c;
                if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                    a(this.f50696b);
                } else {
                    b(this.f50696b);
                }
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50696b, this.f50703i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void j() {
        String str;
        if (this.f50700f) {
            str = this.f50708n + this.f50706l + this.f50709o;
        } else {
            str = this.f50706l + this.f50710p;
        }
        this.f50701g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f50697c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f50697c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(splashWebview2, this.f50696b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f50696b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        } else if (this.f50720z) {
            this.f50720z = false;
            this.f50697c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
            if (this.f50696b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f50696b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f50697c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), splashWebview, splashWebview.getUrl(), this.f50696b);
                this.f50717w = adSessionA;
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    this.f50717w.registerAdView(splashWebview);
                    this.f50717w.start();
                }
                q0.a(POBOMSDKUtil.TAG, "adSession.start()");
            } catch (Throwable th2) {
                q0.a(POBOMSDKUtil.TAG, th2.getMessage());
                CampaignEx campaignEx2 = this.f50696b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = this.f50696b.getRequestIdNotice();
                    String id2 = this.f50696b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, this.f50703i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f50703i);
        this.f50719y.removeMessages(1);
        this.f50719y.sendEmptyMessageDelayed(1, 1000L);
        this.f50719y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f50696b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50696b.getMaitve(), this.f50696b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f50703i, this.f50696b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f50715u == null) {
                    this.f50715u = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f50715u.getVisibility() != 0) {
                    this.f50715u.setVisibility(0);
                }
                v0.a(this.f50715u, bitmapDrawableA, this.f50697c.getResources().getDisplayMetrics());
                if (this.f50715u.getParent() == null) {
                    this.f50697c.addView(this.f50715u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f50717w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f50715u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f50714t = true;
        if (this.f50697c != null && this.f50706l > 0 && (handler = this.f50719y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f50697c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f50697c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f50696b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.h.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f50719y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f48549f || (mBSplashView = this.f50697c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f50697c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    public void h() {
        if (this.f50698d != null) {
            this.f50698d = null;
        }
        if (this.f50716v != null) {
            this.f50716v = null;
        }
        if (this.f50718x != null) {
            this.f50718x = null;
        }
        MBSplashView mBSplashView = this.f50697c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f50703i);
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING, strI);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING, strI);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING, strI);
            this.f50708n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f50710p = string;
            this.f50707m = string;
            this.f50709o = contextD.getResources().getString(identifier3);
            this.f50701g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f50701g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strI)));
        }
    }

    public void c(int i10) {
        this.f50706l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f50696b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f50696b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f50714t = false;
        if (this.f50697c != null && this.f50706l > 0 && (handler = this.f50719y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f50697c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f50697c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f50696b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f50703i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f50703i, campaignEx, "splash");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f50703i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f50703i);
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f50698d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) {
        MBSplashView mBSplashView = this.f50697c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f50697c.getSplashSignalCommunicationImpl() != null) {
                this.f50697c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.f50706l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f50698d;
        if (dVar != null) {
            dVar.a(this.f50705k, i10 * 1000);
        }
        if (this.f50702h == null) {
            j();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f50718x);
        }
        this.f50702h = viewGroup;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f50700f);
        this.f50696b = campaignEx;
        this.f50697c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        if (splashSignalCommunicationImpl == null) {
            splashSignalCommunicationImpl = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f50704j, this.f50703i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            splashSignalCommunicationImpl.a(arrayList);
        }
        splashSignalCommunicationImpl.b(this.f50706l);
        splashSignalCommunicationImpl.a(this.f50700f ? 1 : 0);
        if (this.f50716v == null) {
            this.f50716v = new i(this, null);
        }
        splashSignalCommunicationImpl.a(this.f50716v);
        mBSplashView.setSplashSignalCommunicationImpl(splashSignalCommunicationImpl);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f50702h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f50701g.setVisibility(8);
            }
            j();
            a(this.f50701g);
            mBSplashView.setCloseView(this.f50701g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f50702h);
            mBSplashView.setCloseView(this.f50702h);
        }
        b1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f50696b.getLocalRequestId(), this.f50696b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f50720z = true;
        k();
    }

    class d implements com.mbridge.msdk.foundation.feedback.a {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f50697c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f50697c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f50697c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    protected void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f50697c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f50719y != null && (campaignEx = this.f50696b) != null && campaignEx.isActiveOm()) {
            this.f50719y.postDelayed(new f(i10), CircularProgressBar.E);
        } else {
            a(i10);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f46604n);
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f50696b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() != 1 || (mBSplashView = this.f50697c) == null || mBSplashView.getSplashWebview() == null || this.f50697c.isDynamicView() || !this.f50696b.isMraid() || (context = this.f50697c.getContext()) == null) {
            return;
        }
        try {
            int iA = i0.a(context, "mbridge_splash_notice", "drawable");
            int iA2 = v0.a(context, 35.0f);
            int iA3 = v0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            v0.a(3, imageView, this.f50696b, context, true, new h());
            this.f50697c.addView(imageView);
        } catch (Throwable th2) {
            q0.b("SplashShowManager", th2.getMessage());
        }
    }

    private void a() {
        RelativeLayout.LayoutParams layoutParams;
        CampaignEx campaignEx = this.f50696b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f50703i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f50703i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f50703i, this.f50696b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f50697c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f50703i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f50703i);
                if (feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f48548e, com.mbridge.msdk.foundation.feedback.b.f48547d);
                    }
                    layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f50697c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f50703i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f50703i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f50703i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f50703i, campaignEx, "splash");
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f50698d;
        if (dVar != null) {
            dVar.a(this.f50705k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f50697c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f50697c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f50697c.getParent()).removeView(this.f50697c);
    }

    public void a(boolean z10) {
        this.f50700f = z10;
        if (z10) {
            this.f50707m = this.f50708n;
        } else {
            this.f50707m = this.f50710p;
        }
    }

    protected void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f50699e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50703i);
            this.f50699e = aVar;
            aVar.a(this.A);
        }
        campaignEx.setCampaignUnitId(this.f50703i);
        this.f50699e.a(campaignEx);
        if (!this.f50696b.isReportClick()) {
            this.f50696b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f50698d;
        if (dVar != null) {
            dVar.a(this.f50705k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f50703i, str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f50718x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f50698d;
            if (dVar != null) {
                dVar.a(this.f50705k, i10);
                this.f50698d = null;
                com.mbridge.msdk.splash.report.a.a(this.f50703i, this.f50696b);
            }
            ImageView imageView = this.f50715u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f50697c) != null) {
                mBSplashView.removeView(this.f50715u);
                this.f50715u.setVisibility(8);
            }
            this.f50712r = false;
            com.mbridge.msdk.splash.report.a.a(this.f50703i, i10, this.f50696b);
            Handler handler = this.f50719y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            q0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f46603m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
