package com.appodeal.ads.utils.debug;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14985b;

    public b(f fVar) {
        this.f14985b = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f14985b.a(i10);
        dialogInterface.dismiss();
    }
}
