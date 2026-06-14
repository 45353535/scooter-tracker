package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1953Ab extends AbstractC3461oF<Object> {
    public final /* synthetic */ int A00;

    public C1953Ab(final int val$expectedKeys) {
        this.A00 = val$expectedKeys;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3461oF
    public final <K, V> Map<K, Collection<V>> A04() {
        return AbstractC3478oY.A00(this.A00);
    }
}
