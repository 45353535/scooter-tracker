package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.MediaContent;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class MediaView extends FrameLayout {
    public MediaView(@NonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
    }

    public void setMediaContent(@NonNull MediaContent mediaContent) {
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
