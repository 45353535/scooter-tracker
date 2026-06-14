package com.bytedance.adsdk.ugeno.mo.ud;

import android.view.View;
import com.bytedance.adsdk.ugeno.jpc.lnr;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements lnr.mzz {
    final float qdl = 0.8f;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    final float f16201ud = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.jpc.lnr.mzz
    public void qdl(View view, float f10) {
        float f11 = ((f10 < 0.0f ? 0.19999999f : -0.19999999f) * f10) + 1.0f;
        float f12 = (f10 * (f10 < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f10 < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f11);
        view.setScaleY(f11);
        view.setAlpha(Math.abs(f12));
    }
}
