package com.fyber.inneractive.sdk.ui;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f23828a;

    public b(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f23828a = fyberAdIdentifierLocal;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Bitmap bitmap = (Bitmap) obj;
        if (exc != null || bitmap == null) {
            return;
        }
        this.f23828a.f23808r = bitmap;
    }
}
