package com.bytedance.sdk.openadsdk.core.widget.qdl;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.bjy.qdl.qdl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class mo implements koa.qdl {
    float bjy;
    private final boolean bqt;
    long exc;
    float exu;
    float fs;
    boolean jl;
    boolean jpc;
    long jtx;
    private boolean kdv;
    WebView mml;
    Context qdl;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private long f17570rc;
    float rdp;
    float rq;
    int to;
    String tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    ljh f17571ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    boolean f17572wd;
    boolean yt;
    private final Handler xmv = new koa(rdp.ud().getLooper(), this);
    String lnr = "landingpage";
    int mo = 0;
    private final String koa = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String vu = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    qdl bch = new qdl() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.mo.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mo.qdl
        public void qdl() {
            mo moVar = mo.this;
            moVar.jpc = true;
            moVar.mo();
            mo moVar2 = mo.this;
            moVar2.qdl(2, moVar2.tvp, moVar2.to);
        }
    };
    GestureDetector uw = new GestureDetector(yt.qdl(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.mo.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            mo.this.yt = true;
            return false;
        }
    });
    int mzz = yt.mml().ljh();
    Map<Integer, Long> aaj = new HashMap();
    Map<Integer, Float> jyq = new HashMap();
    Map<Integer, Long> oth = new HashMap();
    List<Integer> ljh = new ArrayList();

    public interface qdl {
        void qdl();
    }

    public mo(WebView webView, ljh ljhVar, Context context, boolean z10) {
        this.f17571ud = ljhVar;
        this.mml = webView;
        this.qdl = context;
        this.bqt = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpc() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.mml.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.to = currentIndex + 1;
            if (this.bqt) {
                this.to = currentIndex + 2;
            }
        }
    }

    private void mml(String str) {
        if (wd()) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.f17571ud, new qdl.C0249qdl().qdl(this.tvp).ud(Uri.decode(str)).qdl(), this.lnr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void mo() {
        if (this.jyq.get(Integer.valueOf(this.to)) != null) {
            return;
        }
        float height = this.mml.getHeight() / ax.ud(this.qdl, this.mml.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.jyq.put(Integer.valueOf(this.to), Float.valueOf(height));
    }

    private boolean mzz() {
        try {
            int i10 = this.to;
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.tvp)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.tvp);
        } catch (Throwable th2) {
            aaj.lnr("WebArbitrageBehavior", th2.toString());
            return false;
        }
    }

    private boolean wd() {
        int i10 = this.mo + 1;
        this.mo = i10;
        if (i10 > this.mzz) {
            return true;
        }
        return ("landingpage".equals(this.lnr) || "landingpage_endcard".equals(this.lnr) || "landingpage_split_screen".equals(this.lnr) || "landingpage_direct".equals(this.lnr) || "landingpage_split_ceiling".equals(this.lnr)) ? false : true;
    }

    public void lnr(String str) {
        if (this.f17572wd) {
            this.jl = true;
        }
        if (this.to == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf(C4240b4.j.f42670c, iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            mml(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void ud(String str) {
        this.tvp = str;
        jpc();
        this.aaj.put(Integer.valueOf(this.to), Long.valueOf(SystemClock.elapsedRealtime()));
        this.oth.put(Integer.valueOf(this.to), Long.valueOf(SystemClock.elapsedRealtime()));
        this.kdv = mzz();
    }

    public void qdl(String str) {
        this.lnr = str;
    }

    public void qdl() {
        ud(this.to);
    }

    public void qdl(int i10) {
        float height = (i10 + this.mml.getHeight()) / ax.ud(this.qdl, this.mml.getContentHeight());
        Float f10 = this.jyq.get(Integer.valueOf(this.to));
        if (height > (f10 == null ? 0.0f : f10.floatValue())) {
            this.jyq.put(Integer.valueOf(this.to), Float.valueOf(height));
        }
    }

    public void ud() {
        this.mml.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.mo.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z10) {
                if (!z10) {
                    mo moVar = mo.this;
                    if (!moVar.jpc) {
                        moVar.mo();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - mo.this.f17570rc >= 50) {
                            mo moVar2 = mo.this;
                            moVar2.qdl(3, moVar2.tvp, moVar2.to);
                            mo.this.f17570rc = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    moVar.jpc = false;
                }
                if (z10) {
                    mo.this.jpc();
                    mo moVar3 = mo.this;
                    moVar3.aaj.put(Integer.valueOf(moVar3.to), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void mml() {
        if (wd()) {
            return;
        }
        com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVarQdl = new qdl.C0249qdl().qdl(this.tvp).qdl(this.to).mml(this.rq).mzz(this.fs).mo(this.bjy).wd(this.exc).qdl();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = qdlVarQdl;
        this.xmv.sendMessageDelayed(messageObtain, 20L);
    }

    private void ud(int i10) {
        if (wd() || this.ljh.contains(Integer.valueOf(i10))) {
            return;
        }
        this.ljh.add(Integer.valueOf(i10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.f17571ud, new qdl.C0249qdl().qdl(this.tvp).qdl(this.to).to(jElapsedRealtime - (this.oth.get(Integer.valueOf(i10)) != null ? r6.longValue() : jElapsedRealtime)).qdl(), this.lnr);
    }

    public qdl lnr() {
        return this.bch;
    }

    private void lnr(int i10) {
        if (wd()) {
            return;
        }
        mo();
        this.f17572wd = true;
        com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVarQdl = new qdl.C0249qdl().qdl(this.tvp).qdl(this.to).qdl(this.rq).ud(this.fs).lnr(this.exc).lnr(i10).qdl();
        try {
            if (this.kdv) {
                WebView.HitTestResult hitTestResult = this.mml.getHitTestResult();
                qdlVarQdl.qdl(hitTestResult.getExtra());
                qdlVarQdl.qdl(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = qdlVarQdl;
        this.xmv.sendMessageDelayed(messageObtain, 100L);
    }

    public void qdl(MotionEvent motionEvent) {
        this.uw.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.rq = motionEvent.getX();
            this.fs = motionEvent.getY();
            this.jtx = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            lnr(2);
        } else {
            this.exc = SystemClock.elapsedRealtime() - this.jtx;
            if (ud(motionEvent)) {
                mml();
            } else {
                lnr(1);
            }
        }
    }

    private boolean ud(MotionEvent motionEvent) {
        this.exu = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.rdp = y10;
        float f10 = this.fs;
        if (y10 - f10 == 0.0f) {
            return false;
        }
        this.bjy = y10 - f10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i10, String str, int i11) {
        if (wd()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.aaj.get(Integer.valueOf(i11));
        long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
        Float f10 = this.jyq.get(Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(this.f17571ud, new qdl.C0249qdl().qdl(str).qdl(i11).jpc(jElapsedRealtime - jLongValue).tvp(f10 == null ? 0.0f : f10.floatValue()).ud(i10).qdl(), this.lnr);
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        int i10 = message.what;
        com.bytedance.sdk.openadsdk.bjy.qdl.qdl qdlVar = (com.bytedance.sdk.openadsdk.bjy.qdl.qdl) message.obj;
        if (i10 == 100) {
            qdlVar.mml(this.yt ? 2 : 1);
            com.bytedance.sdk.openadsdk.mml.lnr.mml(this.f17571ud, qdlVar, this.lnr);
            this.yt = false;
        } else if (i10 == 200) {
            if (this.jl) {
                qdl(1, qdlVar.lnr(), qdlVar.mml());
            }
            qdlVar.lnr(this.jl ? 1 : 0);
            com.bytedance.sdk.openadsdk.mml.lnr.mzz(this.f17571ud, qdlVar, this.lnr);
            this.f17572wd = false;
            this.jl = false;
        }
    }
}
