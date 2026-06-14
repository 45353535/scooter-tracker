package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class G6 implements InterfaceC2516Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC2507Vt A01;
    public final /* synthetic */ G2 A02;
    public final /* synthetic */ C2023Cw A03;

    public G6(G2 g22, int i10, C2023Cw c2023Cw, AbstractRunnableC2507Vt abstractRunnableC2507Vt) {
        this.A02 = g22;
        this.A00 = i10;
        this.A03 = c2023Cw;
        this.A01 = abstractRunnableC2507Vt;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2516Wc
    public final void ACp() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2516Wc
    public final void AEn(float f10) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f10 / this.A00)));
        if (this.A03 != null) {
            C2023Cw c2023Cw = this.A03;
            float percentage = this.A00;
            c2023Cw.A07((int) ((percentage - f10) * 1000.0f));
        }
    }
}
