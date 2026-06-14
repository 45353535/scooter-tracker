package com.startapp.sdk.internal;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class xm implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HttpURLConnection f65588b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f65588b.disconnect();
    }
}
