package com.bytedance.sdk.openadsdk.core.mo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aaj;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends TextView {
    public jpc(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(i10, i11);
        } catch (Throwable th2) {
            aaj.lnr("PAGTextView", th2.toString());
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        super.setGravity(tvp.qdl(i10));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public jpc(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        qdl();
    }
}
