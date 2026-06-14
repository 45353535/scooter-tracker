package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f24076a;

    public w(x xVar) {
        this.f24076a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24076a.f24084a.getClass();
        com.fyber.inneractive.sdk.util.r.f23896b.post(new v("Image failed to download."));
        this.f24076a.f24084a.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}
