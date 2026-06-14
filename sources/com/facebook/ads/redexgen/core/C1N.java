package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1N {
    public final AudioAttributes A00;

    public C1N(C3503oy c3503oy) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c3503oy.A02).setFlags(c3503oy.A03).setUsage(c3503oy.A05);
        if (AbstractC18094a.A02 >= 29) {
            C1L.A00(usage, c3503oy.A01);
        }
        if (AbstractC18094a.A02 >= 32) {
            C1M.A00(usage, c3503oy.A04);
        }
        this.A00 = usage.build();
    }
}
