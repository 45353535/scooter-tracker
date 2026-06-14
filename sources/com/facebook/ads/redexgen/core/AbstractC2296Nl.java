package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2296Nl {

    @Nullable
    public static HandlerC2295Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC2295Nk A00(C2794cu c2794cu) {
        if (A00 == null) {
            A00 = new HandlerC2295Nk(c2794cu);
        }
        return A00;
    }

    public static void A01(C2794cu c2794cu) {
        if (UA.A0F(c2794cu)) {
            A03(c2794cu);
        }
    }

    public static void A02(C2794cu c2794cu) {
        if (UA.A0E(c2794cu)) {
            A03(c2794cu);
        }
    }

    public static void A03(C2794cu c2794cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C3030go(c2794cu));
        }
    }
}
