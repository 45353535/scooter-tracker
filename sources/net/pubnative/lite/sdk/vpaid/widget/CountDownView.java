package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CountDownView extends FrameLayout {
    public CountDownView(Context context) {
        super(context);
    }

    public abstract void setProgress(int i10, int i11);

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
