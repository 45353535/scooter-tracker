package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R7 implements View.OnLongClickListener {
    public final /* synthetic */ C2973fq A00;
    public final /* synthetic */ C2602Zm A01;

    public R7(C2973fq c2973fq, C2602Zm c2602Zm) {
        this.A00 = c2973fq;
        this.A01 = c2602Zm;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A00 != null) {
            this.A01.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
