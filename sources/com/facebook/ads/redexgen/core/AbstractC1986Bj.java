package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1986Bj implements InterfaceC2941fK {
    public final EnumC2933fC A00;
    public final AbstractC17581z A01;

    public AbstractC1986Bj(AbstractC17581z abstractC17581z, EnumC2933fC enumC2933fC) {
        this.A01 = abstractC17581z;
        this.A00 = enumC2933fC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2941fK
    public void A45(Map<InterfaceC2924f2, EnumC2946fP> map, Map<SyncModifiableBundle, EnumC2933fC> map2) {
        map2.put(null, this.A00);
    }
}
