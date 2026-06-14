package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24049a;

    public v(String str) {
        this.f24049a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.o.f23888a, this.f24049a, 0).show();
    }
}
