package com.yandex.div.core.images;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public interface DivImageLoader {
    Boolean hasSvgSupport();

    @NonNull
    @MainThread
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10);

    @NonNull
    @MainThread
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10);
}
