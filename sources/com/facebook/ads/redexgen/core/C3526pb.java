package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3526pb {
    public static C3526pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C3537pm A02;

    public C3526pb(ViewpointQeConfig viewpointQeConfig, AbstractC3542ps abstractC3542ps, C3537pm c3537pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c3537pm;
        abstractC3542ps.A03(new A4(c3537pm));
    }

    public static C3526pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC3542ps abstractC3542ps, InterfaceC3547px interfaceC3547px, A6 a62) {
        C3526pb localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C3526pb(viewpointQeConfig, abstractC3542ps, new C3537pm(viewpointQeConfig, interfaceC3547px, C1983Bg.A00, a62, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC3541pr interfaceC3541pr) {
        this.A02.A0E(interfaceC3541pr);
    }

    public final void A02(InterfaceC3539pp interfaceC3539pp) {
        this.A02.A0F(interfaceC3539pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C3548q0 c3548q0) {
        if (this.A00.A00 && c3548q0 != null) {
            this.A01.A06(dspViewableNode, c3548q0);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C3548q0 c3548q0, C3544pu c3544pu) {
        if (this.A00.A00 && c3548q0 != null) {
            this.A01.A07(dspViewableNode, c3548q0, c3544pu);
        } else {
            this.A01.A08(dspViewableNode, c3544pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C3544pu c3544pu) {
        A05(dspViewableNode, null, c3544pu);
    }
}
