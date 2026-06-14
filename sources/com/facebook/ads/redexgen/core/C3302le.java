package com.facebook.ads.redexgen.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3302le implements InterfaceC2056Ed {
    public final int A00;

    public C3302le() {
        this(-1);
    }

    public C3302le(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2056Ed
    public final int A8R(int i10) {
        if (this.A00 == -1) {
            if (i10 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2056Ed
    public final long A8m(C2055Ec c2055Ec) {
        IOException iOException = c2055Ec.A03;
        if ((iOException instanceof C17652i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C19339h) || (iOException instanceof C2066En) || C18344z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c2055Ec.A00 - 1) * 1000, 5000);
    }
}
