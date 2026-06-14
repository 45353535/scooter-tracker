package com.mbridge.msdk.foundation.download;

/* JADX INFO: loaded from: classes10.dex */
public interface OnProgressStateListener<T> {
    void onProgress(DownloadMessage<T> downloadMessage, DownloadProgress downloadProgress);
}
