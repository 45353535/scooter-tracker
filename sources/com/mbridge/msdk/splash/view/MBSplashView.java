package com.mbridge.msdk.splash.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBSplashView extends RelativeLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f50973u = "MBSplashView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBSplashWebview f50975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.splash.view.a f50976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f50977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f50978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f50979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f50983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ViewGroup f50984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f50985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f50986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f50987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout.LayoutParams f50988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.splash.signal.b f50989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private DyCountDownListener f50990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f50991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnTouchListener f50992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50993t;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f50991r;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50995a;

        b(CampaignEx campaignEx) {
            this.f50995a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.f50995a);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBSplashView.f50973u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f50975b.getLocationOnScreen(iArr);
                    q0.b(MBSplashView.f50973u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBSplashView.f50973u, th2.getMessage(), th2);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f50975b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f50975b, iArr2[0], iArr2[1], MBSplashView.this.f50975b.getWidth(), MBSplashView.this.f50975b.getHeight());
                f.a().a((WebView) MBSplashView.this.f50975b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        q0.b(f50973u, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i14 == 2 ? "landscape" : i14 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "default");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            q0.b(f50973u, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f50978e;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f50983j = false;
        this.f50982i = false;
        this.f50981h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f50984k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f50975b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.f50975b.finishAdSession();
        com.mbridge.msdk.splash.signal.c.a(this.f50975b, "onSystemDestory", "");
        this.f50975b.release();
        this.f50975b = null;
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f50992s;
    }

    public View getCloseView() {
        return this.f50978e;
    }

    public ViewGroup getDevContainer() {
        return this.f50984k;
    }

    public View getIconVg() {
        return this.f50979f;
    }

    public View getSplashNativeView() {
        return this.f50985l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.f50989p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f50975b;
    }

    public boolean isAttach() {
        return this.f50987n;
    }

    public boolean isDynamicView() {
        return this.f50986m;
    }

    public boolean isH5Ready() {
        return this.f50981h;
    }

    public boolean isImageReady() {
        return this.f50983j;
    }

    public boolean isVideoReady() {
        return this.f50982i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50987n = true;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.f50985l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f50985l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f50982i = false;
        this.f50981h = false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setAllowClickSplash(boolean z10) {
        this.f50991r = z10;
        setOnTouchListener(this.f50992s);
    }

    public void setCloseView(View view) {
        this.f50978e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f50984k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f50990q = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f50986m = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f50981h = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f50979f = view;
        this.f50988o = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f50983j = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        View view = this.f50985l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f50975b != null) {
            f.a().a((WebView) this.f50975b, "oncutoutfetched", Base64.encodeToString(d0.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f50985l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.f50989p = bVar;
        MBSplashWebview mBSplashWebview = this.f50975b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.f50975b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f50975b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.f50989p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.f50976c;
                if (aVar != null) {
                    this.f50975b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.f50976c = aVar2;
                this.f50975b.setWebViewClient(aVar2);
            } catch (Throwable th2) {
                q0.b(f50973u, th2.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f50982i = z10;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f50989p != null && (viewGroup = this.f50984k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f50989p.a(this.f50984k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.f50976c;
            if (aVar != null) {
                aVar.a(this.f50989p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i10) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f50975b != null && !this.f50986m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                f.a().a((WebView) this.f50975b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (this.f50986m && (view = this.f50985l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (!this.f50986m || (dyCountDownListener = this.f50990q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i10);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        setBackgroundColor(0);
        this.f50974a = getResources().getConfiguration().orientation;
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f50991r = true;
        this.f50992s = new a();
        this.f50993t = true;
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f50993t = true;
        if (this.f50979f == null) {
            if (this.f50986m && (view3 = this.f50985l) != null) {
                if (view3.getParent() != null) {
                    f1.a(this.f50985l);
                }
                addView(this.f50985l, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f50975b;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f50975b, new ViewGroup.LayoutParams(-1, -1));
                }
                b(campaignEx);
            }
        } else {
            if (this.f50977d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f50977d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f50974a == 2) {
                this.f50980g = v0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f50977d.getId());
                if (this.f50986m && (view2 = this.f50985l) != null) {
                    if (view2.getParent() != null) {
                        f1.a(this.f50985l);
                    }
                    addView(this.f50985l, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f50975b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f50975b, layoutParams);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup = this.f50977d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f50988o.width;
                    f1.a(this.f50979f);
                    int i11 = this.f50980g / 4;
                    if (i10 > i11) {
                        this.f50977d.addView(this.f50979f, i11, -1);
                        i10 = i11;
                    } else {
                        this.f50977d.addView(this.f50979f, i10, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f50977d, layoutParams2);
                }
            } else {
                this.f50980g = v0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f50977d.getId());
                if (this.f50986m && (view = this.f50985l) != null) {
                    if (view.getParent() != null) {
                        f1.a(this.f50985l);
                    }
                    addView(this.f50985l, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f50975b;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f50975b, layoutParams3);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup2 = this.f50977d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f50988o.height;
                    int i13 = this.f50980g / 4;
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    f1.a(this.f50979f);
                    this.f50977d.addView(this.f50979f, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f50977d, layoutParams4);
                }
            }
        }
        View view4 = this.f50978e;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v0.a(getContext(), 100.0f), v0.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v0.a(getContext(), 10.0f);
                layoutParams5.topMargin = v0.a(getContext(), 10.0f);
                addView(this.f50978e, layoutParams5);
                return;
            }
            bringChildToFront(this.f50978e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.f50975b;
        if (mBSplashWebview != null) {
            if (!(campaignEx != null ? h.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true)) {
                if (this.f50993t) {
                    this.f50993t = false;
                    this.f50975b.postDelayed(new b(campaignEx), 200L);
                    return;
                }
                return;
            }
            this.f50975b.setObject(this.f50989p);
            this.f50975b.post(new c());
        }
    }
}
