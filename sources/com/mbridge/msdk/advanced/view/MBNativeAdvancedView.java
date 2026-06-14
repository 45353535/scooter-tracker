package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBNativeAdvancedView extends RelativeLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f46427i = "MBAdvancedNativeView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBNativeAdvancedWebview f46428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f46429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    MBAdChoice f46433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.advanced.signal.b f46434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f46435h;

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBNativeAdvancedView.f46427i, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBNativeAdvancedView.this.f46428a.getLocationOnScreen(iArr);
                    q0.b(MBNativeAdvancedView.f46427i, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBNativeAdvancedView.f46427i, th2.getMessage(), th2);
                }
                f.a().a((WebView) MBNativeAdvancedView.this.f46428a, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBNativeAdvancedView(Context context) {
        this(context, null);
    }

    private void b() {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46428a;
        if (mBNativeAdvancedWebview != null && mBNativeAdvancedWebview.getParent() == null) {
            addView(this.f46428a, new ViewGroup.LayoutParams(-1, -1));
        }
        c();
        View view = this.f46429b;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = v0.a(getContext(), 2.0f);
                layoutParams.topMargin = v0.a(getContext(), 2.0f);
                addView(this.f46429b, layoutParams);
            } else {
                bringChildToFront(this.f46429b);
            }
        }
        if (this.f46433f == null) {
            MBAdChoice mBAdChoice = new MBAdChoice(getContext());
            this.f46433f = mBAdChoice;
            mBAdChoice.setFeedbackDialogEventListener(new a());
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.f46428a.getLocationInWindow(iArr);
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46428a;
        transInfoForMraid(mBNativeAdvancedWebview, iArr[0], iArr[1], mBNativeAdvancedWebview.getWidth(), this.f46428a.getHeight());
        MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f46428a;
        if (mBNativeAdvancedWebview2 != null) {
            mBNativeAdvancedWebview2.setObject(this.f46434g);
            this.f46428a.post(new b());
        }
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        q0.b(f46427i, "transInfoForMraid");
        try {
            int i14 = c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i14 == 2 ? "landscape" : i14 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float fN = m0.n(c.n().d());
            float fM = m0.m(c.n().d());
            HashMap mapV = m0.v(c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
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
            q0.b(f46427i, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f46429b;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f46432e = false;
        this.f46431d = false;
        this.f46430c = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f46429b;
        if (view != null && view.getParent() != null) {
            removeView(this.f46429b);
        }
        MBAdChoice mBAdChoice = this.f46433f;
        if (mBAdChoice == null || mBAdChoice.getParent() == null) {
            return;
        }
        removeView(this.f46433f);
    }

    public void destroy() {
        removeAllViews();
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46428a;
        if (mBNativeAdvancedWebview != null && !mBNativeAdvancedWebview.isDestoryed()) {
            this.f46428a.release();
            com.mbridge.msdk.advanced.signal.a.a(this.f46428a, "onSystemDestory", "");
        }
        if (this.f46435h != null) {
            this.f46435h = null;
        }
    }

    public com.mbridge.msdk.advanced.signal.b getAdvancedNativeSignalCommunicationImpl() {
        return this.f46434g;
    }

    public MBNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f46428a;
    }

    public View getCloseView() {
        return this.f46429b;
    }

    public boolean isEndCardReady() {
        return this.f46432e;
    }

    public boolean isH5Ready() {
        return this.f46430c;
    }

    public boolean isVideoReady() {
        return this.f46431d;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.f46432e = false;
        this.f46431d = false;
        this.f46430c = false;
    }

    public void setAdChoiceCampaign(CampaignEx campaignEx) {
        MBAdChoice mBAdChoice = this.f46433f;
        if (mBAdChoice != null) {
            mBAdChoice.setCampaign(campaignEx);
            if (this.f46433f.getParent() != null) {
                bringChildToFront(this.f46433f);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(c.n().d(), 6.0f), v0.a(c.n().d(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.f46433f, layoutParams);
        }
    }

    public void setAdvancedNativeSignalCommunicationImpl(com.mbridge.msdk.advanced.signal.b bVar) {
        this.f46434g = bVar;
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46428a;
        if (mBNativeAdvancedWebview != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setAdvancedNativeWebview(MBNativeAdvancedWebview mBNativeAdvancedWebview) {
        this.f46428a = mBNativeAdvancedWebview;
        com.mbridge.msdk.advanced.signal.b bVar = this.f46434g;
        if (bVar != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setCloseView(View view) {
        this.f46429b = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z10) {
        this.f46432e = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f46430c = z10;
    }

    public void setVideoReady(boolean z10) {
        this.f46431d = z10;
    }

    public void show() {
        b();
        clearResState();
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46435h = context;
    }

    class a implements com.mbridge.msdk.foundation.feedback.a {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBNativeAdvancedView.f46427i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBNativeAdvancedView.f46427i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBNativeAdvancedView.f46427i, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) MBNativeAdvancedView.this.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }
}
