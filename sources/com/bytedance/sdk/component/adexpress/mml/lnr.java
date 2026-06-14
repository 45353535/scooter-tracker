package com.bytedance.sdk.component.adexpress.mml;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    public static Drawable qdl(Context context, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        if (context == null || wdVar == null) {
            return null;
        }
        return qdl(context, (int) wd.qdl(context, wdVar.yt()), wdVar.jtx(), wdVar.koa());
    }

    public static Drawable qdl(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
