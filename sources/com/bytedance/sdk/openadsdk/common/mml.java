package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml implements koa.qdl {
    private String aaj;
    private long bjy;
    private int exc;
    private int exu;
    private float jpc;
    private boolean jtx;
    private WebView lnr;
    private final com.bytedance.sdk.component.tvp.mo mml;
    private lnr mzz;
    private final ljh qdl;
    private boolean rdp;
    private long to;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final boolean f16977ud;
    private String mo = "landingpage";

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final Handler f16978wd = new koa(com.bytedance.sdk.openadsdk.core.rdp.ud().getLooper(), this);
    private final AtomicBoolean rq = new AtomicBoolean(false);
    private Pattern fs = null;
    private long jl = -1;
    private final List<Integer> yt = new ArrayList();

    public mml(ljh ljhVar, com.bytedance.sdk.component.tvp.mo moVar, String str, boolean z10) {
        this.qdl = ljhVar;
        this.mml = moVar;
        this.f16977ud = z10;
        ud();
    }

    private void jpc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.jl);
            jSONObject.put("loading_show_timestamp", this.bjy);
            WebView webView = this.lnr;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.qdl, this.mo, jSONObject);
    }

    private void mml() {
        Handler handler = this.f16978wd;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mo() {
        return wd() > 0 && !this.rq.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void mzz() {
        this.rdp = false;
        if (this.rq.getAndSet(true)) {
            return;
        }
        this.to = SystemClock.elapsedRealtime();
        this.bjy = System.currentTimeMillis();
        jpc();
        if (this.mzz == null) {
            return;
        }
        WebView webView = this.lnr;
        if (webView != null) {
            this.aaj = webView.getUrl();
        }
        this.mzz.setVisibility(0);
        this.mzz.qdl(this.qdl);
        this.mzz.qdl();
        this.mzz.setAlpha(this.jpc);
        this.mzz.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.mml.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        mml();
        lnr();
    }

    private void ud() {
        com.bytedance.sdk.component.tvp.mo moVar = this.mml;
        if (moVar != null) {
            this.lnr = moVar.getWebView();
            View arbitrageLoadingView = this.mml.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof lnr) {
                this.mzz = (lnr) arbitrageLoadingView;
            }
        }
        this.tvp = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().bqt();
        this.jpc = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().koa();
    }

    private int wd() {
        try {
            return this.lnr.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void lnr(WebView webView, String str, boolean z10) {
        this.yt.clear();
        this.jtx = z10;
        if (z10) {
            this.rdp = true;
        }
        this.exc = wd();
    }

    public void qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mo = str;
    }

    public void qdl(WebView webView, String str, boolean z10) {
        if (z10 && mo()) {
            qdl();
        }
    }

    private void lnr() {
        Handler handler = this.f16978wd;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.tvp);
        }
    }

    public void qdl(WebView webView, String str) {
        ljh ljhVar = this.qdl;
        if (ljhVar == null || !com.bytedance.sdk.component.tvp.ud.qdl(ljhVar.jyq().lnr(), str)) {
            return;
        }
        this.exu++;
        com.bytedance.sdk.component.utils.tvp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mml.1
            @Override // java.lang.Runnable
            public void run() {
                if (mml.this.mo()) {
                    mml.this.qdl();
                }
            }
        });
    }

    public void ud(WebView webView, String str, boolean z10) {
        if (!z10 || this.mzz == null) {
            return;
        }
        qdl(1);
    }

    public void qdl(WebView webView, int i10) {
        lnr lnrVar = this.mzz;
        if (lnrVar != null) {
            lnrVar.qdl(i10);
        }
        if (this.jtx) {
            if (qdl(i10, 30)) {
                qdl(30, webView);
            }
            if (qdl(i10, 50)) {
                qdl(50, webView);
            }
            if (qdl(i10, 70)) {
                qdl(70, webView);
            }
        }
        if (this.mzz == null || i10 != 100) {
            return;
        }
        qdl(1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void qdl() {
        if (fco.mo()) {
            mzz();
        } else {
            com.bytedance.sdk.component.utils.tvp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mml.2
                @Override // java.lang.Runnable
                public void run() {
                    mml.this.mzz();
                }
            });
        }
    }

    private void qdl(final int i10) {
        WebView webView = this.lnr;
        if (webView != null && i10 == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.aaj)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.tvp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mml.4
            @Override // java.lang.Runnable
            public void run() {
                if (mml.this.mzz != null) {
                    mml.this.rq.set(false);
                    mml.this.mzz.qdl(mml.this.qdl, mml.this.mo, i10, mml.this.aaj, mml.this.to, mml.this.rdp, mml.this.exu, mml.this.bjy);
                    mml.this.exu = 0;
                }
            }
        });
        mml();
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        if (message.what == 1) {
            qdl(0);
        }
    }

    public void qdl(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.jl = SystemClock.elapsedRealtime();
        }
    }

    private boolean qdl(int i10, int i11) {
        if (i10 < i11 || this.yt.contains(Integer.valueOf(i11)) || this.exc < 2) {
            return false;
        }
        this.yt.add(Integer.valueOf(i11));
        return true;
    }

    private void qdl(int i10, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i10);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.qdl, this.mo, jSONObject);
    }
}
