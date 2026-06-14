package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes8.dex */
final class zzcjd implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsResult zza;

    zzcjd(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
