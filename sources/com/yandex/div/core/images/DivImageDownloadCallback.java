package com.yandex.div.core.images;

import android.graphics.drawable.PictureDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DivImageDownloadCallback {
    @UiThread
    public void onError() {
    }

    @UiThread
    public void onSuccess(@NonNull PictureDrawable pictureDrawable) {
    }

    @UiThread
    public void onSuccess(@NonNull CachedBitmap cachedBitmap) {
    }
}
