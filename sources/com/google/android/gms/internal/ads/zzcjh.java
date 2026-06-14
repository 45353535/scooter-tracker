package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes8.dex */
final class zzcjh implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;

    zzcjh(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.cancel();
    }
}
