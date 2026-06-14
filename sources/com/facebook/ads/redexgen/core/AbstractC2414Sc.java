package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2414Sc<T> {
    public EnumC2413Sb A00;

    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sc != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final EnumC2413Sb A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sc != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final void A01(EnumC2413Sb enumC2413Sb) {
        this.A00 = enumC2413Sb;
    }
}
