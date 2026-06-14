package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f24087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24090d;

    public y0(x0 x0Var, Context context) {
        this.f24087a = x0Var;
        this.f24090d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f24087a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((i) this.f24087a).i();
                this.f24088b = motionEvent.getX();
                this.f24089c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((i) this.f24087a).i();
                this.f24089c = -1.0f;
                this.f24088b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f10 = this.f24088b;
                if (f10 >= 0.0f && this.f24089c >= 0.0f) {
                    float fRound = Math.round(Math.abs(f10 - motionEvent.getX()));
                    float fRound2 = Math.round(Math.abs(this.f24089c - motionEvent.getY()));
                    float f11 = this.f24090d;
                    if (fRound < f11 && fRound2 < f11) {
                        i iVar = (i) this.f24087a;
                        iVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (iVar.f23981l != null) {
                            IAlog.e("Native click detected in time. Processing pending click", new Object[0]);
                            iVar.f23981l.d();
                            d dVar = iVar.f23982m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar);
                            }
                            iVar.f23981l = null;
                            iVar.i();
                        } else {
                            if (iVar.f23983n != null) {
                                com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(iVar.f23983n, IAConfigManager.O.f20315u.f20484b.a("click_timeout", 1000, 1000));
                            }
                            iVar.f23979j = true;
                        }
                    }
                    this.f24088b = -1.0f;
                    this.f24089c = -1.0f;
                }
            }
        }
        return false;
    }
}
