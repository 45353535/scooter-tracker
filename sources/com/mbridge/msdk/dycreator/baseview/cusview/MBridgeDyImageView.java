package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeDyImageView extends ImageView {
    public MBridgeDyImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th2) {
            q0.b("MBridgeDyImageView", th2.getMessage());
        }
    }

    public MBridgeDyImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeDyImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
