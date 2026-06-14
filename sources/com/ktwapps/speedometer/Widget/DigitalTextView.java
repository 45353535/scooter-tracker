package com.ktwapps.speedometer.Widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes10.dex */
public class DigitalTextView extends AppCompatTextView {
    public DigitalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void a() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "font/speedometer.ttf"));
    }
}
