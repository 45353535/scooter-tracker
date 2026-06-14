package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes6.dex */
public class jl extends mo {
    public ud qdl;

    public jl(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    protected GradientDrawable getDrawable() {
        ud udVar = new ud();
        this.qdl = udVar;
        return udVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    protected ud qdl(Bitmap bitmap) {
        qdl qdlVar = new qdl(bitmap, this.qdl);
        this.qdl = qdlVar;
        return qdlVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        return super.tvp();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    protected GradientDrawable qdl(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        ud udVar = new ud(orientation, iArr);
        this.qdl = udVar;
        return udVar;
    }
}
