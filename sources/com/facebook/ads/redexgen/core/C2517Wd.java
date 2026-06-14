package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2517Wd {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final InterfaceC2516Wc A06;

    public C2517Wd(int i10, float f10, long j10, Handler handler, InterfaceC2516Wc interfaceC2516Wc) {
        this(i10, interfaceC2516Wc, handler);
        this.A02 = j10;
        this.A01 = f10;
    }

    public C2517Wd(int i10, InterfaceC2516Wc interfaceC2516Wc) {
        this(i10, interfaceC2516Wc, new Handler());
    }

    public C2517Wd(int i10, InterfaceC2516Wc interfaceC2516Wc, Handler handler) {
        this.A04 = false;
        this.A00 = i10;
        this.A06 = interfaceC2516Wc;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        this.A00 -= this.A01;
        this.A06.AEn(this.A00);
        if (this.A00 <= 0.0f && !this.A03) {
            this.A03 = true;
            this.A06.ACp();
            this.A04 = false;
        }
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A04;
    }

    public final boolean A06() {
        if (!A05()) {
            return false;
        }
        this.A04 = false;
        return true;
    }

    public final boolean A07() {
        if (A04() && !this.A03) {
            this.A03 = true;
            this.A06.ACp();
        }
        if (A04() || A05()) {
            return false;
        }
        this.A04 = true;
        this.A06.AEn(this.A00);
        this.A05.postDelayed(new C2334Oz(this), this.A02);
        return true;
    }
}
