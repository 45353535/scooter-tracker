package com.bytedance.sdk.openadsdk.mml;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.exc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.widget.qdl.mo;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class fs {
    private static final int[] lnr = {10, 30, 50, 75, 100};
    private boolean aaj;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private rq f17637ag;
    private boolean ax;
    private int bch;
    private final Context bjy;
    private long bqt;
    private String car;
    private final AtomicInteger cx;
    private boolean ekw;
    private tvp exc;
    private String exu;
    private WeakReference<WebView> fco;
    private boolean fs;
    private int gt;
    private com.bytedance.sdk.openadsdk.mml.mml.mzz gy;
    private final boolean hkc;
    private final AtomicInteger hzv;
    private volatile long irn;
    private volatile long jjk;
    private com.bytedance.sdk.openadsdk.aaj.jpc jl;
    private final AtomicBoolean jpc;
    private com.bytedance.sdk.openadsdk.core.widget.qdl.mo jtx;
    private int jyq;
    private long kdv;
    private long koa;
    private long ljh;
    private int mml;
    private int mo;
    private boolean mrf;
    private long mzz;
    private final AtomicInteger om;
    private long oth;
    public mo.qdl qdl;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private long f17638rc;
    private String rdp;
    private int rq;
    private final AtomicBoolean sy;
    private String taz;
    private long tid;
    private final AtomicBoolean to;
    private final AtomicBoolean tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    AtomicBoolean f17639ud;
    private final ljh uw;
    private long vu;
    private volatile int wak;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    private volatile long f17640wc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final AtomicBoolean f17641wd;
    private volatile long xi;
    private String xmv;

    /* JADX INFO: renamed from: yh, reason: collision with root package name */
    private final AtomicBoolean f17642yh;
    private boolean yt;
    private final AtomicBoolean zlt;

    private class qdl {
        private qdl() {
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i10 = 0;
            try {
                int iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    i10 = 100;
                } else if (iIntValue >= 0) {
                    i10 = iIntValue;
                }
            } catch (Throwable unused) {
            }
            fs.this.hzv.set(i10);
        }
    }

    public fs(ljh ljhVar, WebView webView, rq rqVar, int i10) {
        this(ljhVar, webView);
        this.f17637ag = rqVar;
        this.gt = i10;
    }

    private int to() {
        WeakReference<WebView> weakReference = this.fco;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null) {
                    if (webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    private boolean tvp() {
        ljh ljhVar;
        return this.ax && (ljhVar = this.uw) != null && ljhVar.koa();
    }

    public void jpc() {
        if (("landingpage".equals(this.xmv) || "landingpage_endcard".equals(this.xmv) || "landingpage_split_screen".equals(this.xmv) || "landingpage_direct".equals(this.xmv) || "aggregate_page".equals(this.xmv) || "landingpage_split_ceiling".equals(this.xmv)) && this.mo == 2) {
            if (this.koa > 0 || !lnr()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.bqt, this.koa);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.mo);
                    jSONObject.put("max_scroll_percent", this.hzv.get());
                    jSONObject.put("jump_times", this.om.getAndSet(0));
                    jSONObject.put("click_times", this.cx.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.to.set(true);
                qdl("stay_page", jSONObject, Math.min(jCurrentTimeMillis, 600000L));
                com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("landingPause", this.uw, this.car);
            }
        }
    }

    public void mo() {
        if (tvp() && this.xi > 0 && this.jjk > 0 && !this.zlt.getAndSet(true)) {
            lnr.ud(this.jjk - this.xi, this.uw, this.taz, (String) null);
        }
    }

    public void wd() {
        if (this.kdv == 0) {
            this.kdv = System.currentTimeMillis();
        }
        this.bqt = System.currentTimeMillis();
        if ("landingpage".equals(this.xmv) || "landingpage_endcard".equals(this.xmv) || "landingpage_split_screen".equals(this.xmv) || "landingpage_direct".equals(this.xmv) || "aggregate_page".equals(this.xmv)) {
            if (this.sy.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("landingStart", this.uw, this.car);
            } else {
                com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("landingContinue", this.uw, this.car);
            }
        }
        if (aaj.jpc(this.uw) || aaj.ud(this.uw)) {
            qdl(true, SystemClock.elapsedRealtime());
        }
    }

    public boolean lnr() {
        return this.ax;
    }

    public void mml() {
        if (tvp()) {
            this.irn = SystemClock.elapsedRealtime();
            lnr.qdl(this.uw, this.taz);
        }
    }

    public void mzz() {
        if (tvp()) {
            this.xi = SystemClock.elapsedRealtime();
            mo();
        }
    }

    public com.bytedance.sdk.openadsdk.mml.mml.mzz ud() {
        return this.gy;
    }

    public void lnr(boolean z10) {
        this.ax = z10;
    }

    public fs ud(boolean z10) {
        this.mrf = z10;
        return this;
    }

    public fs(ljh ljhVar, WebView webView) {
        this(ljhVar, webView, false);
    }

    private String lnr(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public ljh qdl() {
        return this.uw;
    }

    public void ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.taz = str;
    }

    public fs(ljh ljhVar, WebView webView, boolean z10) {
        this.mml = 0;
        this.mzz = -1L;
        this.mo = 1;
        this.f17641wd = new AtomicBoolean(false);
        this.jpc = new AtomicBoolean(false);
        this.tvp = new AtomicBoolean(false);
        this.to = new AtomicBoolean(false);
        this.rq = -1;
        this.aaj = false;
        this.jyq = 0;
        this.f17639ud = new AtomicBoolean(false);
        this.xmv = "landingpage";
        this.bqt = 0L;
        this.koa = 0L;
        this.vu = 0L;
        this.f17638rc = 0L;
        this.kdv = 0L;
        this.ekw = false;
        this.hkc = false;
        this.hzv = new AtomicInteger(0);
        this.mrf = false;
        this.ax = false;
        this.f17640wc = 0L;
        this.om = new AtomicInteger(0);
        this.cx = new AtomicInteger(0);
        this.f17642yh = new AtomicBoolean(false);
        this.wak = 0;
        this.gt = -1;
        this.zlt = new AtomicBoolean(false);
        this.sy = new AtomicBoolean(false);
        Context contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl();
        this.bjy = contextQdl;
        this.uw = ljhVar;
        if (webView == null) {
            return;
        }
        this.aaj = z10;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.fco = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (ljhVar != null && ljhVar.hr()) {
            com.bytedance.sdk.openadsdk.core.widget.qdl.mo moVar = new com.bytedance.sdk.openadsdk.core.widget.qdl.mo(webView2, ljhVar, contextQdl, this.aaj);
            this.jtx = moVar;
            this.qdl = moVar.lnr();
        }
        if (ljhVar != null && ljhVar.se() && com.bytedance.sdk.openadsdk.core.settings.rq.lnr().xmv()) {
            this.exc = new tvp(ljhVar, webView, this.aaj);
        }
        if (webView instanceof com.bytedance.sdk.component.tvp.mzz) {
            this.tid = ((com.bytedance.sdk.component.tvp.mzz) webView2).qdl;
        } else {
            this.tid = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new qdl(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.aaj.qdl("LandingPageLog", "addJavascriptInterface exception", e10);
        }
        if (ljhVar != null && ljhVar.uzn() != null) {
            this.mzz = ljhVar.uzn().optLong("page_id", -1L);
        }
        this.car = String.valueOf(SystemClock.elapsedRealtime());
    }

    public void mml(boolean z10) {
        WeakReference<WebView> weakReference = this.fco;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.aaj.qdl("LandingPageLog", "removeJavascriptInterface exception", e10);
            }
        }
        if (this.jpc.compareAndSet(false, true)) {
            qdl(z10, "1");
            if (this.mrf) {
                lnr.qdl(this.uw, this.xmv, System.currentTimeMillis() - this.kdv, this.gt, to());
            }
        } else if (this.mo == 2 && !this.to.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.mo);
                jSONObject.put("max_scroll_percent", this.hzv.get());
                jSONObject.put("jump_times", this.om.getAndSet(0));
                jSONObject.put("click_times", this.cx.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            qdl("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.xmv) || "landingpage_endcard".equals(this.xmv) || "landingpage_split_screen".equals(this.xmv) || "landingpage_direct".equals(this.xmv) || "aggregate_page".equals(this.xmv) || "landingpage_split_ceiling".equals(this.xmv)) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("landingFinish", this.uw, this.car);
        }
    }

    public void qdl(boolean z10) {
        if (z10) {
            this.jyq = 1;
        }
    }

    public void qdl(rq rqVar) {
        this.f17637ag = rqVar;
    }

    public void ud(WebView webView, String str, boolean z10) {
        tvp tvpVar = this.exc;
        if (tvpVar == null || !z10) {
            return;
        }
        tvpVar.qdl(webView, str);
    }

    public void qdl(long j10) {
        this.koa = j10;
    }

    public void qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.qdl.mo moVar = this.jtx;
        if (moVar != null) {
            moVar.qdl(str);
        }
        tvp tvpVar = this.exc;
        if (tvpVar != null) {
            tvpVar.lnr(str);
        }
        this.xmv = str;
    }

    public void ud(int i10) {
        com.bytedance.sdk.openadsdk.core.widget.qdl.mo moVar = this.jtx;
        if (moVar == null || !this.yt) {
            return;
        }
        moVar.qdl(i10);
    }

    public void qdl(int i10) {
        this.gt = i10;
    }

    public void qdl(com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar) {
        this.gy = mzzVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.aaj.jpc jpcVar) {
        this.jl = jpcVar;
    }

    public void qdl(WebView webView, int i10) {
        if (webView == null) {
            return;
        }
        if (this.f17640wc == 0) {
            this.f17640wc = SystemClock.elapsedRealtime();
        }
        if (this.vu == 0 && i10 > 0) {
            this.vu = System.currentTimeMillis();
        } else if (this.f17638rc == 0 && i10 == 100) {
            this.f17638rc = System.currentTimeMillis();
        }
        if (this.mml != lnr.length && ("landingpage".equals(this.xmv) || "landingpage_endcard".equals(this.xmv) || "landingpage_split_screen".equals(this.xmv) || "landingpage_direct".equals(this.xmv) || "aggregate_page".equals(this.xmv))) {
            int i11 = this.mml;
            while (true) {
                int[] iArr = lnr;
                if (i11 >= iArr.length || i10 < iArr[this.mml]) {
                    break;
                }
                int i12 = i11 + 1;
                this.mml = i12;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j10 = this.mzz;
                    if (j10 != -1) {
                        jSONObject.put("page_id", j10);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i11]);
                } catch (Exception unused) {
                }
                qdl("progress_load_finish", jSONObject);
                i11 = i12;
            }
        }
        if (i10 == 100) {
            qdl(false, SystemClock.elapsedRealtime());
            qdl(webView.getUrl(), "progress", Math.min(this.f17638rc - this.vu, 600000L));
        }
    }

    private void qdl(String str, String str2, long j10) {
        if (this.tvp.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i10 = 300;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i10 = iIndexOf;
                    }
                    str = str.substring(0, i10);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            qdl("load_finish_progress", jSONObject, j10);
        }
    }

    public void qdl(WebView webView, String str, Bitmap bitmap, boolean z10, int i10) {
        this.yt = z10;
        this.bch++;
        com.bytedance.sdk.openadsdk.core.widget.qdl.mo moVar = this.jtx;
        if (moVar != null && z10) {
            moVar.ud(str);
            this.jtx.ud();
        }
        tvp tvpVar = this.exc;
        if (tvpVar != null && z10) {
            tvpVar.qdl(str, i10);
        }
        WeakReference<WebView> weakReference = this.fco;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.wak) {
                    this.om.incrementAndGet();
                }
                this.wak = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.aaj.qdl("LandingPageLog", "copyBackForwardList exception", e10);
            }
        }
        if (this.f17640wc == 0) {
            this.f17640wc = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.gy;
        if (mzzVar != null) {
            mzzVar.mzz();
        }
        if (this.f17641wd.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i11 = this.gt;
                if (i11 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i11));
                }
            } catch (Exception unused) {
            }
            qdl("load_start", jSONObject);
        }
    }

    public void qdl(WebView webView, String str, boolean z10) {
        qdl(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.qdl.mo moVar = this.jtx;
        if (moVar != null && z10) {
            moVar.qdl();
        }
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.gy;
        if (mzzVar != null) {
            mzzVar.mo();
        }
        tvp tvpVar = this.exc;
        if (tvpVar != null && z10) {
            tvpVar.qdl(str);
        }
        if (webView != null && !this.ekw && this.mrf) {
            this.ekw = true;
            com.bytedance.sdk.component.utils.rdp.qdl(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.jpc.compareAndSet(false, true)) {
            if (this.mo != 3) {
                this.mo = 2;
            }
            this.bqt = System.currentTimeMillis();
            boolean z11 = this.mo == 2;
            int i10 = to();
            if (z11) {
                long j10 = this.f17638rc - this.vu;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.rq);
                    jSONObject.put("error_msg", this.exu);
                    jSONObject.put("error_url", this.rdp);
                    int i11 = this.gt;
                    if (i11 >= 0) {
                        jSONObject.put("preload_status", i11);
                    }
                    jSONObject.put("first_page", i10);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.uw.od());
                    jSONObject.put("preload_h5_type", this.uw.kdv());
                } catch (Exception unused) {
                }
                qdl(z10, "0");
                long jMin = Math.min(j10, 600000L);
                qdl("load_finish", jSONObject, jMin);
                if (tvp()) {
                    this.jjk = SystemClock.elapsedRealtime();
                    mo();
                    lnr.qdl(this.uw, this.taz, this.jjk - this.irn);
                }
                qdl(str, "load_finish", jMin);
                rq rqVar = this.f17637ag;
                if (rqVar != null) {
                    rqVar.qdl(i10);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.rq);
                jSONObject2.put("error_msg", this.exu);
                jSONObject2.put("error_url", this.rdp);
                jSONObject2.put("first_page", i10);
                int i12 = this.gt;
                if (i12 >= 0) {
                    jSONObject2.put("preload_status", i12);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.uw.od());
                jSONObject2.put("preload_h5_type", this.uw.kdv());
            } catch (Exception unused2) {
            }
            qdl(z10, "2");
            qdl(Reporting.EventType.LOAD_FAIL, jSONObject2);
            if (tvp()) {
                lnr.qdl(this.uw, this.taz, SystemClock.elapsedRealtime() - this.irn, this.rq, this.exu, this.rdp);
            }
            if (this.fs) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                qdl("load_fail_main", jSONObject2);
            }
        }
    }

    public void qdl(WebView webView, int i10, String str, String str2, String str3, boolean z10) {
        com.bytedance.sdk.openadsdk.mml.mml.mzz mzzVar = this.gy;
        if (mzzVar != null) {
            mzzVar.qdl((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.mo != 2) {
            this.mo = 3;
        }
        this.rq = i10;
        this.exu = str;
        this.rdp = str2;
        this.fs = z10;
    }

    public void qdl(com.bytedance.sdk.component.tvp.mo moVar) {
        int iKab;
        Bitmap bitmapQdl;
        ljh ljhVar;
        if ((!"landingpage".equals(this.xmv) && !"landingpage_endcard".equals(this.xmv) && !"landingpage_split_screen".equals(this.xmv) && !"landingpage_direct".equals(this.xmv) && !"aggregate_page".equals(this.xmv)) || (iKab = com.bytedance.sdk.openadsdk.core.yt.mml().kab()) == 0 || new Random().nextInt(100) + 1 > iKab || moVar == null || moVar.getWebView() == null || moVar.getVisibility() != 0 || (bitmapQdl = ax.qdl(moVar)) == null || (ljhVar = this.uw) == null) {
            return;
        }
        ax.qdl(ljhVar, this.xmv, "landing_page_blank", bitmapQdl, moVar.getUrl(), this.mzz);
    }

    private void qdl(String str, JSONObject jSONObject) {
        qdl(str, jSONObject, -1L);
    }

    private void qdl(final String str, final JSONObject jSONObject, final long j10) {
        if (!this.mrf || this.uw == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.aaj.jpc jpcVar = this.jl;
        final int iMrf = jpcVar != null ? jpcVar.mrf() : -1;
        lnr.qdl(System.currentTimeMillis(), this.uw, this.xmv, str, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.fs.1
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                if (jSONObject != null) {
                    try {
                        boolean zUd = vu.ud(fs.this.uw);
                        int i10 = 0;
                        jSONObject.put("is_playable", zUd ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(fs.this.uw) ? 1 : 0);
                        if (zUd && ("load_finish".equals(str) || Reporting.EventType.LOAD_FAIL.equals(str))) {
                            jSONObject.put("playable_has_show", iMrf);
                        }
                        if ("stay_page".equals(str)) {
                            JSONObject jSONObject2 = jSONObject;
                            if (fs.this.bch <= 1) {
                                i10 = 1;
                            }
                            jSONObject2.put("first_page", i10);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = fs.this.xmv;
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                if (!com.bytedance.sdk.openadsdk.exu.qdl.lnr(fs.this.uw)) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_lp_pre_render", fs.this.jyq);
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 > 0) {
                        jSONObject2.put("duration", j11);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public void qdl(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.qdl.mo moVar = this.jtx;
        if (moVar != null && this.yt) {
            moVar.qdl(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f17640wc != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.cx.incrementAndGet();
                if (this.f17642yh.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.uw.od());
                } catch (JSONException unused) {
                }
                qdl("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.f17640wc, 0L));
            }
        }
    }

    public void qdl(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.widget.qdl.mo moVar = this.jtx;
        if (moVar != null && z10) {
            moVar.lnr(str);
        }
        tvp tvpVar = this.exc;
        if (tvpVar == null || !z10) {
            return;
        }
        tvpVar.ud(str);
    }

    private void qdl(boolean z10, final String str) {
        if (z10) {
            final int i10 = to();
            lnr.qdl(new com.bytedance.sdk.component.jpc.jpc("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.mml.fs.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.mo moVarHzv = com.bytedance.sdk.openadsdk.core.yt.mml().hzv();
                        boolean zQdl = fs.this.qdl(moVarHzv, str);
                        if (zQdl) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.mo.f17471ud)) {
                                fs.this.qdl(i10, str);
                                return;
                            }
                            if (TextUtils.isEmpty(moVarHzv.lnr) || !zQdl) {
                                return;
                            }
                            String str2 = moVarHzv.lnr;
                            com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
                            udVarLnr.ud(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            udVarLnr.mml(map);
                            udVarLnr.qdl(9);
                            udVarLnr.qdl("sendPrefLog");
                            udVarLnr.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.fs.2.1
                                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.mo.f17471ud = udVar.mml();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        fs.this.qdl(i10, str);
                                    } catch (Exception e10) {
                                        com.bytedance.sdk.component.utils.aaj.qdl("LandingPageLog", "TTWebViewClient : onPageFinished", e10);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.aaj.lnr(th2.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i10, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.mo.f17471ud)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.mo.f17471ud);
            jSONObject.putOpt("cid", qdl().yre());
            jSONObject.putOpt("ad_id", qdl().yre());
            jSONObject.put("log_extra", qdl().ir());
            gy.qdl(sb2, "\"/** adInfo **/\"", jSONObject.toString());
            gy.qdl(sb2, "\"/** first_page **/\"", String.valueOf(i10));
            gy.qdl(sb2, "\"/** ix_to_externalurl **/\"", this.mzz != -1 ? "1" : "0");
            gy.qdl(sb2, "\"/** preload_status **/\"", this.gt == 2 ? "2" : "0");
            gy.qdl(sb2, "\"/** scene_state **/\"", str);
            gy.qdl(sb2, "\"/** web_init_time **/\"", String.valueOf(this.tid));
            gy.qdl(sb2, "\"/** channel_name **/\"", "\"" + qdl().xmr() + "\"");
            gy.qdl(sb2, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            gy.qdl(sb2, "\"/** web_url **/\"", "\"" + qdl().od() + "\"");
            String string = sb2.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strLnr = lnr(string);
            WeakReference<WebView> weakReference = this.fco;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strLnr) || webView == null) {
                return;
            }
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mml.fs.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.rdp.qdl(webView, strLnr);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr(th2.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(com.bytedance.sdk.openadsdk.core.settings.mo moVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return moVar.mml;
            case "1":
                return moVar.mzz;
            case "2":
                return moVar.mo;
            default:
                return false;
        }
    }

    public void qdl(boolean z10, long j10) {
        if (z10) {
            this.oth = j10;
        } else {
            this.ljh = j10;
        }
        if (this.oth <= 0 || this.ljh <= 0 || !this.yt || !this.f17639ud.compareAndSet(false, true)) {
            return;
        }
        qdl(this.uw, this.xmv, this.ljh - this.oth, this.jyq);
    }

    public static void qdl(final ljh ljhVar, final String str, final long j10, final int i10) {
        lnr.qdl(System.currentTimeMillis(), ljhVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.fs.4
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i10);
                    jSONObject.put("meta_pre_render", ljhVar.tu() ? 1 : 0);
                    exc excVarOth = ljhVar.oth();
                    if (excVarOth == null) {
                        excVarOth = new exc();
                    }
                    jSONObject.put("pre_render_status", excVarOth.lnr());
                    jSONObject.put("pre_render_use_gecko", excVarOth.ud());
                    jSONObject.put("pre_render_add_type", excVarOth.qdl());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
