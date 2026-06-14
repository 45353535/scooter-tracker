package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes8.dex */
final class zzcjg implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsPromptResult zza;

    zzcjg(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
