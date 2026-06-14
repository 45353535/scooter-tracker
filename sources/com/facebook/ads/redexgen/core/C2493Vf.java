package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2493Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C2493Vf(VN vn) {
        this.A00 = vn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6J(C3544pu<UE, UJ> c3544pu, InterfaceC3535pk interfaceC3535pk) {
        switch (interfaceC3535pk.A9M(c3544pu)) {
            case A02:
            case A04:
                this.A00.A02(c3544pu, interfaceC3535pk);
                break;
        }
    }
}
