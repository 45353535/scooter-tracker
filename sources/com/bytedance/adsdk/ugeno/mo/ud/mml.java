package com.bytedance.adsdk.ugeno.mo.ud;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.jpc.lnr;

/* JADX INFO: loaded from: classes6.dex */
public class mml implements lnr.mzz {
    private String qdl;

    public void qdl(String str) {
        this.qdl = str;
    }

    @Override // com.bytedance.adsdk.ugeno.jpc.lnr.mzz
    public void qdl(View view, float f10) {
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f10));
            view.setTranslationY(view.getHeight() * f10);
        }
        if (TextUtils.equals(this.qdl, "cube")) {
            float height = f10 < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f10 * (-90.0f));
        }
    }
}
