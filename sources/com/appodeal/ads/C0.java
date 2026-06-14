package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class C0 extends AdNetworkBuilder {
    public C0() {
        super("debug", "1");
    }

    @Override // com.appodeal.ads.AdNetworkBuilder
    public final AdNetwork build() {
        return new D0(this);
    }
}
