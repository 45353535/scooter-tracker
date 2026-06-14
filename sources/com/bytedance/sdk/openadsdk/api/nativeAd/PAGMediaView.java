package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
public class PAGMediaView extends FrameLayout {
    protected Integer qdl;

    public PAGMediaView(@NonNull Context context) {
        super(context);
    }

    public void close() {
    }

    public void setMrcTrackerKey(Integer num) {
        this.qdl = num;
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @RequiresApi(api = 21)
    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
