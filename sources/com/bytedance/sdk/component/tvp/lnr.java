package com.bytedance.sdk.component.tvp;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lnr implements View.OnTouchListener {
    private ViewConfiguration qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16671ud = -1;

    abstract void qdl(View.OnTouchListener onTouchListener);

    boolean qdl(float f10, float f11, float f12, float f13, Context context) {
        if (this.qdl == null) {
            this.qdl = ViewConfiguration.get(context);
        }
        if (this.f16671ud == -1) {
            this.f16671ud = this.qdl.getScaledTouchSlop();
        }
        return Math.abs(f10 - f12) <= ((float) this.f16671ud) && Math.abs(f11 - f13) <= ((float) this.f16671ud);
    }
}
