package com.ktwapps.speedometer.Widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes10.dex */
public class DigitalMirroredTextView extends AppCompatTextView {
    public DigitalMirroredTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void a() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "font/speedometer.ttf"));
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.translate(getWidth(), 0.0f);
        canvas.scale(-1.0f, 1.0f);
        super.onDraw(canvas);
    }
}
