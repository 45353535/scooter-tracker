package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC2540Xc implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C2321Om A01;

    public DialogInterfaceOnClickListenerC2540Xc(C2321Om c2321Om, EditText editText) {
        this.A01 = c2321Om;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A01.A03.execute(new C2324Op(this, dialogInterface));
    }
}
