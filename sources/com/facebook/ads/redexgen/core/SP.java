package com.facebook.ads.redexgen.core;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SP {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", "h", "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C2794cu> A01 = new AtomicReference<>();

    public static C2794cu A00() {
        AtomicReference<C2794cu> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP;
        return atomicReference.get();
    }

    public static void A01(C2794cu c2794cu) {
        if (c2794cu == null) {
            return;
        }
        AB.A00(A01, null, c2794cu);
    }
}
