package com.bytedance.sdk.openadsdk.core.mo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends LinearLayout {
    public mzz(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutDirection(3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i10) {
        super.setGravity(tvp.qdl(i10));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public mzz(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public mzz(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }
}
