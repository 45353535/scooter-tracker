package com.bytedance.sdk.component.tvp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends lnr {
    private float jpc;
    private final long lnr;
    private final Context mml;
    private View.OnTouchListener mo;
    private final mo mzz;
    private final View.OnTouchListener qdl;
    private String to;
    private float tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int f16672ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private long f16673wd = -1;

    public mml(Context context, View.OnTouchListener onTouchListener, int i10, long j10, mo moVar) {
        this.mml = context;
        this.qdl = onTouchListener;
        this.f16672ud = i10;
        this.lnr = j10;
        this.mzz = moVar;
    }

    private boolean qdl(long j10) {
        long j11 = this.f16673wd;
        if (j11 == -1) {
            this.f16673wd = j10;
            return false;
        }
        int i10 = this.f16672ud;
        if (i10 == 1) {
            if (j10 - j11 <= this.lnr) {
                return true;
            }
            this.f16673wd = j10;
            return false;
        }
        if (i10 == 2) {
            if (j10 - j11 <= this.lnr) {
                this.f16673wd = j10;
                return true;
            }
            this.f16673wd = j10;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        mml mmlVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            mmlVar = this;
            mmlVar.jpc = x10;
            mmlVar.tvp = y10;
        } else if (action != 1) {
            mmlVar = this;
        } else {
            mmlVar = this;
            if (mmlVar.qdl(x10, y10, this.jpc, this.tvp, this.mml)) {
                if (qdl(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    qdl(1, x10, y10);
                } else {
                    qdl(0, x10, y10);
                }
            }
        }
        View.OnTouchListener onTouchListener = mmlVar.qdl;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = mmlVar.mo;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void qdl(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f16672ud);
            jSONObject.put("lp_click_interval", this.lnr);
        } catch (Throwable th2) {
            aaj.qdl("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th2);
        }
        if (com.bytedance.sdk.component.tvp.qdl.qdl.qdl().ud() != null) {
            com.bytedance.sdk.component.tvp.qdl.ud udVarUd = com.bytedance.sdk.component.tvp.qdl.qdl.qdl().ud();
            mo moVar = this.mzz;
            udVarUd.qdl(moVar != null ? moVar.getMaterialMeta() : null, this.to, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void qdl(String str) {
        this.to = str;
    }

    @Override // com.bytedance.sdk.component.tvp.lnr
    public void qdl(View.OnTouchListener onTouchListener) {
        this.mo = onTouchListener;
    }
}
