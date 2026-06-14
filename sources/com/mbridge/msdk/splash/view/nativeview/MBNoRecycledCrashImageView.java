package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes10.dex */
public class MBNoRecycledCrashImageView extends ImageView {
    public MBNoRecycledCrashImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    public MBNoRecycledCrashImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBNoRecycledCrashImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @RequiresApi(api = 21)
    public MBNoRecycledCrashImageView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
