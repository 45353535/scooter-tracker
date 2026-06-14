package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1985Bi implements InterfaceC2941fK {
    public final By A00;
    public final EnumC2946fP A01;

    public AbstractC1985Bi(By by, EnumC2946fP enumC2946fP) {
        this.A00 = by;
        this.A01 = enumC2946fP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2941fK
    public void A45(Map<InterfaceC2924f2, EnumC2946fP> map, Map<SyncModifiableBundle, EnumC2933fC> map2) {
        map.put(this.A00, this.A01);
    }
}
