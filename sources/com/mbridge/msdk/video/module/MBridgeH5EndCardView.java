package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private int A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K;
    Handler L;
    private boolean M;
    private boolean N;
    boolean O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected View f52574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected RelativeLayout f52575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ImageView f52576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected WindVaneWebView f52577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f52578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Handler f52579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f52580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f52581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f52582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f52583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f52584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f52585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f52586y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f52587z;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (MBridgeH5EndCardView.this.C) {
                MBridgeH5EndCardView.this.notifyListener.a(122, "");
            }
            MBridgeH5EndCardView.this.notifyListener.a(103, "");
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    class c extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f52590a;

        c(boolean z10) {
            this.f52590a = z10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            q0.c("WindVaneWebView", "h5EncardView readyStatus:" + i10 + "- isError" + MBridgeH5EndCardView.this.f52582u);
            MBridgeH5EndCardView.this.A = i10;
            if (!MBridgeH5EndCardView.this.f52582u) {
                MBridgeH5EndCardView.this.a(System.currentTimeMillis() - MBridgeH5EndCardView.this.B, false);
            }
            if (this.f52590a) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 3);
                    eVar.a("result", Integer.valueOf(i10));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f52527b, eVar);
                } catch (Throwable th2) {
                    q0.b("WindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
            super.b(webView, i10);
            MBridgeH5EndCardView.this.A = i10;
            if (MBridgeH5EndCardView.this.f52587z) {
                return;
            }
            MBridgeH5EndCardView.this.f52587z = true;
            if (i10 == 1) {
                MBridgeH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                MBridgeH5EndCardView.this.notifyListener.a(127, "");
                MBridgeH5EndCardView.this.reportRenderResult(C4240b4.i.f42652t, 6);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f52582u) {
                return;
            }
            mBridgeH5EndCardView.f52581t = true;
            mBridgeH5EndCardView.notifyListener.a(100, "");
            if (MBridgeH5EndCardView.this.f52527b != null) {
                n nVar = new n();
                nVar.n(MBridgeH5EndCardView.this.f52527b.getRequestId());
                nVar.o(MBridgeH5EndCardView.this.f52527b.getRequestIdNotice());
                nVar.b(MBridgeH5EndCardView.this.f52527b.getId());
                nVar.d(1);
                nVar.e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.B));
                nVar.m("onPageFinished");
                String str2 = "2";
                if (MBridgeH5EndCardView.this.f52527b.getAdType() == 287) {
                    nVar.a("3");
                } else if (MBridgeH5EndCardView.this.f52527b.getAdType() == 94) {
                    nVar.a("1");
                } else if (MBridgeH5EndCardView.this.f52527b.getAdType() == 42) {
                    nVar.a("2");
                }
                if (MBridgeH5EndCardView.this.f52527b.isMraid()) {
                    nVar.b(n.N);
                } else {
                    nVar.g(MBridgeH5EndCardView.this.f52527b.getendcard_url());
                    if (a1.b(MBridgeH5EndCardView.this.f52527b.getendcard_url()) && MBridgeH5EndCardView.this.f52527b.getendcard_url().contains(".zip")) {
                        str2 = "1";
                    }
                    nVar.f(str2);
                    nVar.b(n.O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f52527b);
            }
            MBridgeH5EndCardView.this.notifyListener.a(120, "");
            if (this.f52590a) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 3);
                eVar.a("result", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f52527b, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f52582u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.a(118, "onReceivedError " + i10 + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.a(127, "");
            MBridgeH5EndCardView.this.notifyListener.a(129, "");
            MBridgeH5EndCardView.this.f52582u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                q0.a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.f52577p.getLocationOnScreen(iArr);
                    q0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        jSONObject.put("startX", v0.b(contextD, iArr[0]));
                        jSONObject.put("startY", v0.b(contextD, iArr[1]));
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f48600l, v0.d(contextD));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                    string = "";
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f52577p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.a(109, "");
                MBridgeH5EndCardView.this.i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                com.mbridge.msdk.mbsignalcommon.windvane.f fVarA = com.mbridge.msdk.mbsignalcommon.windvane.f.a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                fVarA.a((WebView) mBridgeH5EndCardView.f52577p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.K.getBytes(), 0));
                MBridgeH5EndCardView.this.e();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f52594a;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f52594a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e10) {
                q0.b("CloseRunnable", e10.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f52594a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    private class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f52596a;

        public g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f52596a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f52596a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f52587z) {
                return;
            }
            this.f52596a.f52587z = true;
            this.f52596a.f52581t = false;
            MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f52596a.notifyListener.a(127, "");
            q0.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    private static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f52598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52599b;

        public h(MBridgeH5EndCardView mBridgeH5EndCardView, int i10) {
            this.f52598a = mBridgeH5EndCardView;
            this.f52599b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f52598a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f52527b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.f52586y) {
                    q0.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.f52598a.f52586y = true;
                n nVar = new n("m_download_end", 12, (this.f52599b * 1000) + "", this.f52598a.f52527b.getendcard_url(), this.f52598a.f52527b.getId(), this.f52598a.unitId, "ready timeout", (a1.b(this.f52598a.f52527b.getendcard_url()) && this.f52598a.f52527b.getendcard_url().contains(".zip")) ? "1" : "2");
                try {
                    if (this.f52598a.f52527b.getAdType() == 287) {
                        nVar.a("3");
                    } else if (this.f52598a.f52527b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f52598a.f52527b.getAdType() == 42) {
                        nVar.a("2");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                nVar.n(this.f52598a.f52527b.getRequestId());
                nVar.k(this.f52598a.f52527b.getCurrentLocalRid());
                nVar.o(this.f52598a.f52527b.getRequestIdNotice());
                nVar.a(this.f52598a.f52527b.getAdSpaceT());
                this.f52598a.isLoadSuccess();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    private class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f52600a;

        public i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f52600a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f52600a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.G = true;
            }
        }
    }

    private class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f52602a;

        public j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f52602a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f52602a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.H = true;
            }
        }
    }

    private class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f52604a;

        public k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f52604a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f52604a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f52604a.D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f52578q = false;
        this.f52579r = new Handler();
        this.f52581t = false;
        this.f52582u = false;
        this.f52583v = false;
        this.f52584w = 1;
        this.f52585x = 1;
        this.f52586y = false;
        this.f52587z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i10 != 0) {
            if (i10 == 1) {
                str = "portrait";
            } else if (i10 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", "default");
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fN = m0.n(getContext());
            float fM = m0.m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f52577p, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f52577p, f10, f11);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f52577p, r7.getLeft(), this.f52577p.getTop(), this.f52577p.getWidth(), this.f52577p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f52577p, r13.getLeft(), this.f52577p.getTop(), this.f52577p.getWidth(), this.f52577p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f52577p, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f52577p, com.mbridge.msdk.mbsignalcommon.mraid.d.f49775f);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f52577p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.f52576o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i10) {
        this.f52579r.postDelayed(new h(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (this.f52583v || this.f52584w <= -1) {
            return;
        }
        this.f52579r.postDelayed(new k(this), this.f52584w * 1000);
    }

    public void executeEndCardShow(int i10) {
        this.f52579r.postDelayed(new g(this), i10 * 1000);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f52527b;
    }

    protected String getURL() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null) {
            this.C = false;
            return null;
        }
        this.C = true;
        if (campaignEx.isMraid()) {
            this.f52583v = false;
            String mraid = this.f52527b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.f52527b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.f52527b.getEndScreenUrl();
                }
                return "file:////" + mraid;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
                return mraid;
            }
        }
        String str = this.f52527b.getendcard_url();
        if (a1.a(str)) {
            this.f52583v = false;
            return this.f52527b.getEndScreenUrl();
        }
        this.f52583v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            return h5ResAddress + "&native_adtype=" + this.f52527b.getAdType();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                String endScreenUrl = this.f52527b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.f52583v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th3) {
            q0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        return str + "&native_adtype=" + this.f52527b.getAdType();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.f52582u) {
            return;
        }
        this.f52582u = true;
        this.f52581t = false;
        if (this.f52527b != null) {
            n nVar = new n();
            nVar.n(this.f52527b.getRequestId());
            nVar.o(this.f52527b.getRequestIdNotice());
            nVar.b(this.f52527b.getId());
            nVar.m(str);
            com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f52526a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f52528c.inflate(iFindLayout, (ViewGroup) null);
            this.f52574m = viewInflate;
            try {
                this.f52530e = a(viewInflate);
            } catch (Exception unused) {
                this.f52530e = false;
            }
            addView(this.f52574m, getContentLayoutParams());
            d();
            j();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f52581t;
    }

    public boolean isPlayable() {
        return this.f52583v;
    }

    protected void j() {
        if (this.f52530e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.E = true;
        } else {
            if (i10 != 1) {
                return;
            }
            this.F = true;
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.D || (((z10 = this.E) && this.F) || (!(z10 || !this.G || this.O) || (!z10 && this.H && this.O)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f52577p != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f52577p, "onSystemDestory", "");
                new Thread(new f(this)).start();
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(119, "webview is null when closing webview");
            }
        } catch (Exception e10) {
            this.notifyListener.a(103, "");
            this.notifyListener.a(119, "close webview exception" + e10.getMessage());
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f52527b);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 || this.J) {
            return;
        }
        this.J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f52577p, "true");
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f52577p, "false");
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f52577p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f52530e || this.f52527b == null || TextUtils.isEmpty(url) || this.f52577p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
        } else {
            this.B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f52527b);
            aVar.a(this.f52527b.getAppName());
            this.f52577p.setDownloadListener(aVar);
            this.f52577p.setCampaignId(this.f52527b.getId());
            this.f52577p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null) {
                this.f52577p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f52577p.setApiManagerJSFactory(bVar);
            if (this.f52527b.isMraid()) {
                this.f52577p.setMraidObject(this);
            }
            boolean z10 = url.contains("wfr=1") || url.contains("wfl=1");
            b1.a(this.f52577p, this.f52527b.getLocalRequestId(), this.f52527b.getLocalAllowTrackClick());
            this.f52577p.setWebViewListener(new c(z10));
            if (TextUtils.isEmpty(this.f52527b.getMraid())) {
                h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            if (TextUtils.isEmpty(this.f52580s)) {
                this.f52577p.loadUrl(url);
            } else {
                this.f52577p.loadDataWithBaseURL(url, this.f52580s, "text/html", "UTF-8", null);
            }
        }
        this.O = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i10) {
    }

    public void release() {
        Handler handler = this.f52579r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f52579r = null;
        }
        Handler handler2 = this.L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.f52575n.removeAllViews();
        this.f52577p.release();
        this.f52577p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f52527b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i10) {
        if (this.f52527b == null || this.f52582u) {
            return;
        }
        n nVar = new n();
        nVar.n(this.f52527b.getRequestId());
        nVar.o(this.f52527b.getRequestIdNotice());
        nVar.b(this.f52527b.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.B));
        nVar.m(str);
        String str2 = "2";
        if (this.f52527b.getAdType() == 287) {
            nVar.a("3");
        } else if (this.f52527b.getAdType() == 94) {
            nVar.a("1");
        } else if (this.f52527b.getAdType() == 42) {
            nVar.a("2");
        }
        if (this.f52527b.isMraid()) {
            nVar.b(n.N);
        } else {
            nVar.g(this.f52527b.getendcard_url());
            if (a1.b(this.f52527b.getendcard_url()) && this.f52527b.getendcard_url().contains(".zip")) {
                str2 = "1";
            }
            nVar.f(str2);
            nVar.b(n.O);
        }
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f52527b);
    }

    public void setCloseDelayShowTime(int i10) {
        this.f52584w = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f52530e) {
            this.f52576o.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f52530e) {
            this.I = true;
            if (i10 == 4) {
                this.f52576o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f52576o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f52576o.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f52582u = z10;
    }

    public void setHtmlSource(String str) {
        this.f52580s = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.O = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        if (!TextUtils.isEmpty(str)) {
            this.K = str;
        }
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        q0.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f52576o.getLayoutParams();
        int iA = v0.a(getContext(), 20.0f);
        layoutParams.setMargins(i10 + iA, i12 + iA, i11 + iA, i13 + iA);
        this.f52576o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f52585x = i10;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f52527b.getendcard_url();
            if (a1.b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split(C4240b4.j.f42670c);
                int iA = 15;
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (a1.b(str2) && str2.contains("timeout") && str2.split(C4240b4.j.f42668b) != null && str2.split(C4240b4.j.f42668b).length > 0) {
                            iA = v0.a((Object) str2.split(C4240b4.j.f42668b)[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f52576o.getVisibility();
        if (i10 == 1) {
            this.D = true;
            visibility = 0;
        } else if (i10 == 2) {
            this.D = false;
            if (this.O) {
                g();
            } else {
                f();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            setCloseVisibleForMraid(z10 ? 4 : 0);
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void volumeChange(double d10) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f52577p, d10);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f52577p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }

    private void f() {
        if (this.M || this.E) {
            return;
        }
        this.M = true;
        int i10 = this.f52584w;
        if (i10 == 0) {
            this.G = true;
            return;
        }
        this.G = false;
        if (i10 > -1) {
            this.f52579r.postDelayed(new i(this), this.f52584w * 1000);
        }
    }

    private void g() {
        if (this.N || this.E) {
            return;
        }
        this.N = true;
        int i10 = this.f52585x;
        if (i10 == 0) {
            this.H = true;
            return;
        }
        this.H = false;
        if (i10 > -1) {
            this.f52579r.postDelayed(new j(this), this.f52585x * 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            r7 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3b
            r7.B = r2     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f52527b     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r2.getendcard_url()     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.videocommon.setting.b r3 = com.mbridge.msdk.videocommon.setting.b.b()     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.foundation.controller.c r4 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r7.unitId     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.videocommon.setting.c r3 = r3.c(r4, r5)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r7.f52583v     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto La1
            boolean r4 = com.mbridge.msdk.foundation.tools.a1.b(r2)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto La1
            boolean r4 = r2.contains(r0)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L3d
            if (r3 == 0) goto La1
            int r4 = r3.v()     // Catch: java.lang.Throwable -> L3b
            if (r4 <= 0) goto La1
            goto L3d
        L3b:
            r0 = move-exception
            goto L98
        L3d:
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L3b
            r4 = 20
            if (r0 == 0) goto L80
            java.lang.String r0 = "&"
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L8d
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r2 <= 0) goto L8d
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L52:
            if (r3 >= r2) goto L8d
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L3b
            boolean r6 = com.mbridge.msdk.foundation.tools.a1.b(r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String r6 = "to"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.length     // Catch: java.lang.Throwable -> L3b
            if (r6 <= 0) goto L7d
            java.lang.String[] r0 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L3b
            int r0 = com.mbridge.msdk.foundation.tools.v0.a(r0)     // Catch: java.lang.Throwable -> L3b
            goto L8e
        L7d:
            int r3 = r3 + 1
            goto L52
        L80:
            if (r3 == 0) goto L8d
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L3b
            if (r0 <= 0) goto L8d
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L3b
            goto L8e
        L8d:
            r0 = r4
        L8e:
            if (r0 < 0) goto L94
            r7.excuteEndCardShowTask(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L94:
            r7.excuteEndCardShowTask(r4)     // Catch: java.lang.Throwable -> L3b
            return
        L98:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.q0.b(r2, r1, r0)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.h():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                com.mbridge.msdk.foundation.feedback.b.b().d(this.unitId + "_1");
                com.mbridge.msdk.foundation.feedback.b.b().a(this.unitId + "_2", this.f52527b);
            }
            CampaignEx campaignEx2 = this.f52527b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = this.f52576o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
                layoutParams2.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            v0.a(4, imageView, this.f52527b, com.mbridge.msdk.foundation.controller.c.n().d(), false, new e());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        if (this.f52530e) {
            this.f52576o.setOnClickListener(new b());
        }
    }

    private boolean a(View view) {
        this.f52576o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.f52575n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.f52577p = windVaneWebView;
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.f52577p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f52575n.addView(this.f52577p);
        return isNotNULL(this.f52576o, this.f52577p);
    }

    class e implements com.mbridge.msdk.foundation.feedback.a {
        e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f52577p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f52577p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f52577p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:5|6|(1:13)(1:10)|14|(1:16)(2:17|(1:19)(9:22|21|23|49|24|(1:26)(2:29|(1:31)(2:32|(1:34)))|48|37|(1:55)(4:40|(1:42)(1:43)|44|56)))|20|21|23|49|24|(0)(0)|48|37|(1:55)(1:54)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r15, boolean r17) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.a(long, boolean):void");
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52578q = false;
        this.f52579r = new Handler();
        this.f52581t = false;
        this.f52582u = false;
        this.f52583v = false;
        this.f52584w = 1;
        this.f52585x = 1;
        this.f52586y = false;
        this.f52587z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    private static void a(n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }
}
