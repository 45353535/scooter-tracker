package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.qdl.mo;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jtx {
    private mo.qdl jpc;
    private final ljh lnr;
    private final String mml;
    private ImageView mo;
    private final Context mzz;
    private final LinearLayout qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.component.tvp.mo f16975ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private ImageView f16976wd;

    public jtx(Context context, LinearLayout linearLayout, com.bytedance.sdk.component.tvp.mo moVar, ljh ljhVar, String str) {
        this.mzz = context;
        this.qdl = linearLayout;
        this.f16975ud = moVar;
        this.lnr = ljhVar;
        this.mml = str;
        lnr();
    }

    private void lnr() {
        this.mo = (ImageView) this.qdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.f17866ra);
        this.f16976wd = (ImageView) this.qdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.qk);
        ImageView imageView = (ImageView) this.qdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.tqd);
        ImageView imageView2 = (ImageView) this.qdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.fzn);
        this.mo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.jtx.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jtx.this.f16975ud == null || !jtx.this.f16975ud.tvp()) {
                    return;
                }
                if (jtx.this.jpc != null) {
                    jtx.this.jpc.qdl();
                }
                jtx.this.qdl(ToolBar.BACKWARD);
                jtx.this.f16975ud.to();
            }
        });
        this.f16976wd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.jtx.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jtx.this.f16975ud == null || !jtx.this.f16975ud.rq()) {
                    return;
                }
                jtx.this.qdl(ToolBar.FORWARD);
                jtx.this.f16975ud.fs();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.jtx.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jtx.this.f16975ud != null) {
                    jtx.this.ud(ToolBar.REFRESH);
                    jtx.this.f16975ud.jpc();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.jtx.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jtx.this.f16975ud != null) {
                    jtx.this.ud("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = jtx.this.f16975ud.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.ud.qdl(jtx.this.mzz, intent, null);
                }
            }
        });
        this.qdl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.jtx.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.mo.setClickable(false);
        this.f16976wd.setClickable(false);
        ImageView imageView3 = this.mo;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView3.setColorFilter(color, mode);
        this.f16976wd.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
    }

    public void qdl(WebView webView, mo.qdl qdlVar) {
        this.jpc = qdlVar;
        try {
            if (this.mo != null) {
                if (webView.canGoBack()) {
                    this.mo.setClickable(true);
                    this.mo.clearColorFilter();
                } else {
                    this.mo.setClickable(false);
                    this.mo.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f16976wd != null) {
                if (webView.canGoForward()) {
                    this.f16976wd.setClickable(true);
                    this.f16976wd.clearColorFilter();
                } else {
                    this.f16976wd.setClickable(false);
                    this.f16976wd.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void ud() {
        if (this.qdl.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.qdl, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(String str) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f16975ud.getWebView() != null && (webBackForwardListCopyBackForwardList = this.f16975ud.getWebView().copyBackForwardList()) != null) {
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f16975ud.getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("first_page", Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), this.lnr, this.mml, str, jSONObject);
    }

    public void qdl() {
        if (this.qdl.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.qdl, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f16975ud.getWebView() != null && (webBackForwardListCopyBackForwardList = this.f16975ud.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f16975ud.getUrl();
                }
                String url2 = "";
                if (str.equals(ToolBar.BACKWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i10 = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i10 = 0;
                }
                jSONObject.putOpt("first_page", Integer.valueOf(i10));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), this.lnr, this.mml, str, jSONObject);
    }
}
