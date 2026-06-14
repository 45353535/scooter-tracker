package com.bytedance.sdk.openadsdk.core.mo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends ImageView {
    public mml(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public mml(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public mml(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
