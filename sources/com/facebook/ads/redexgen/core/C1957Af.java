package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1957Af<K, V> extends AbstractC3525pV<Map.Entry<K, V>, V> {
    public C1957Af(Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC3525pV
    @ParametricNullness
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final V A01(Map.Entry<K, V> entry) {
        return entry.getValue();
    }
}
