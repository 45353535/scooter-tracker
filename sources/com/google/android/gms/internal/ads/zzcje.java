package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes8.dex */
final class zzcje implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult zza;

    zzcje(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.cancel();
    }
}
