package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2241Lh {
    public static final C2241Lh A02 = new C2241Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C2241Lh)) {
            return false;
        }
        C2241Lh c2241Lh = (C2241Lh) obj;
        return this.A00 == c2241Lh.A00 && this.A01 == c2241Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
