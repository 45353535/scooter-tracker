package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f24084a;

    public x(i0 i0Var) {
        this.f24084a = i0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (exc != null || TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.r.f23896b.post(new w(this));
            return;
        }
        i0 i0Var = this.f24084a;
        if (com.fyber.inneractive.sdk.util.o.a(i0Var.f23971b) != null) {
            a0 a0Var = new a0(str);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(com.fyber.inneractive.sdk.util.o.a(i0Var.f23971b).getApplicationContext(), a0Var);
            a0Var.f23928b = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }
}
