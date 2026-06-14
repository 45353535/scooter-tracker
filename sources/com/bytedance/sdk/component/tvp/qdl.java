package com.bytedance.sdk.component.tvp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.component.utils.rc;
import com.bytedance.sdk.component.utils.tvp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends lnr implements koa.qdl {
    private View.OnTouchListener aaj;
    private String exc;
    private int exu;
    private long fs;
    private float jl;
    private volatile float jpc;
    private boolean jtx;
    private final int lnr;
    private final List<Integer> mml;
    private final Context mo;
    private final int mzz;
    private long rq;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int f16683ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private volatile float f16684wd;
    private float yt;
    private float tvp = -1.0f;
    private float to = -1.0f;
    private final Handler bjy = new koa(tvp.qdl().getLooper(), this);
    InterfaceC0236qdl qdl = new InterfaceC0236qdl() { // from class: com.bytedance.sdk.component.tvp.qdl.1
        @Override // com.bytedance.sdk.component.tvp.qdl.InterfaceC0236qdl
        public void qdl() {
            if (qdl.this.tvp == -1.0f && qdl.this.to == -1.0f && qdl.this.fs == -1) {
                float unused = qdl.this.tvp;
                float unused2 = qdl.this.to;
                qdl qdlVar = qdl.this;
                qdlVar.tvp = qdlVar.f16684wd;
                qdl qdlVar2 = qdl.this;
                qdlVar2.to = qdlVar2.jpc;
                qdl qdlVar3 = qdl.this;
                qdlVar3.fs = qdlVar3.rq;
                qdl.this.jtx = true;
            }
            float unused3 = qdl.this.tvp;
            float unused4 = qdl.this.to;
        }

        @Override // com.bytedance.sdk.component.tvp.qdl.InterfaceC0236qdl
        public void qdl(int i10) {
            qdl.this.exu = i10;
            qdl.this.ud();
        }
    };
    private int jyq = -1;
    private final List<Integer> rdp = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.tvp.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0236qdl {
        void qdl();

        void qdl(int i10);
    }

    public qdl(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.mo = context;
        if (i10 == -1) {
            this.f16683ud = rc.qdl(context);
        } else {
            this.f16683ud = rc.qdl(context, i10);
        }
        this.lnr = rc.qdl(context, i11);
        this.mml = list;
        this.mzz = i12;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        qdl qdlVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.rq = SystemClock.elapsedRealtime();
        this.f16684wd = x10;
        this.jpc = y10;
        if (action == 0) {
            qdlVar = this;
            qdlVar.yt = x10;
            qdlVar.jl = y10;
        } else if (action != 1) {
            qdlVar = this;
        } else {
            qdlVar = this;
            if (qdlVar.qdl(x10, y10, this.yt, this.jl, this.mo)) {
                int iQdl = qdl(qdlVar.f16684wd, qdlVar.jpc, qdlVar.rq);
                boolean zContains = qdlVar.rdp.contains(Integer.valueOf(qdlVar.exu));
                qdl(view, motionEvent, iQdl, !zContains);
                if (!zContains) {
                    qdlVar.rdp.add(Integer.valueOf(qdlVar.exu));
                }
                if (iQdl == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = qdlVar.aaj;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud() {
        this.tvp = -1.0f;
        this.to = -1.0f;
        this.fs = -1L;
    }

    @Override // com.bytedance.sdk.component.tvp.lnr
    public void qdl(View.OnTouchListener onTouchListener) {
        this.aaj = onTouchListener;
    }

    public InterfaceC0236qdl qdl() {
        return this.qdl;
    }

    private void qdl(View view, MotionEvent motionEvent, int i10, boolean z10) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z10 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.exu);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.bjy.sendMessageDelayed(messageObtain, 200L);
    }

    public void qdl(String str) {
        this.exc = str;
    }

    private int qdl(float f10, float f11, long j10) {
        if (this.tvp == -1.0f && this.to == -1.0f && this.fs == -1) {
            return 1;
        }
        if (!this.mml.contains(Integer.valueOf(this.exu))) {
            return 2;
        }
        if (j10 - this.fs > this.mzz) {
            ud();
            return 3;
        }
        float fAbs = Math.abs(f10 - this.tvp);
        float fAbs2 = Math.abs(f11 - this.to);
        if (fAbs <= this.f16683ud / 2.0f && fAbs2 <= this.lnr / 2.0f) {
            return 0;
        }
        ud();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.jtx ? 1 : 0);
                    this.jtx = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.tvp.qdl.qdl.qdl().ud() != null) {
                com.bytedance.sdk.component.tvp.qdl.qdl.qdl().ud().qdl(this.exc, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
