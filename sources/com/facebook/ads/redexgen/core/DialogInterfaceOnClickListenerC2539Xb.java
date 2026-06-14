package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC2539Xb implements DialogInterface.OnClickListener {
    public final /* synthetic */ C2321Om A00;

    public DialogInterfaceOnClickListenerC2539Xb(C2321Om c2321Om) {
        this.A00 = c2321Om;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }
}
