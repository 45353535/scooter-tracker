package com.ktwapps.speedometer.Widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes10.dex */
public class MirroredTextView extends AppCompatTextView {
    public MirroredTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.translate(getWidth(), 0.0f);
        canvas.scale(-1.0f, 1.0f);
        super.onDraw(canvas);
    }
}
