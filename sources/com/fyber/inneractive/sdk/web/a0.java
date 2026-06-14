package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements MediaScannerConnection.MediaScannerConnectionClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaScannerConnection f23928b;

    public a0(String str) {
        this.f23927a = str;
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        MediaScannerConnection mediaScannerConnection = this.f23928b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.scanFile(this.f23927a, null);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        MediaScannerConnection mediaScannerConnection = this.f23928b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }
}
