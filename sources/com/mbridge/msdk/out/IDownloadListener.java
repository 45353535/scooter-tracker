package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes10.dex */
public interface IDownloadListener {
    void onEnd(int i10, int i11, String str);

    void onProgressUpdate(int i10);

    void onStart();

    void onStatus(int i10);
}
