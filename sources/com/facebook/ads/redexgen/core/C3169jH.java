package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C3169jH {
    public final int A00;
    public final BZ A01;
    public final InterfaceC3168jG A02;
    public final boolean A03;

    public C3169jH(InterfaceC3168jG strategy) {
        this(strategy, false, BZ.A03(), Integer.MAX_VALUE);
    }

    public C3169jH(InterfaceC3168jG strategy, boolean omitEmptyStrings, BZ trimmer, int limit) {
        this.A02 = strategy;
        this.A03 = omitEmptyStrings;
        this.A01 = trimmer;
        this.A00 = limit;
    }

    public static C3169jH A02(char separator) {
        return A03(BZ.A02(separator));
    }

    public static C3169jH A03(final BZ separatorMatcher) {
        AbstractC3162jA.A04(separatorMatcher);
        return new C3169jH(new BK(separatorMatcher));
    }

    private Iterator<String> A04(CharSequence sequence) {
        return this.A02.AAc(this, sequence);
    }

    public final List<String> A06(CharSequence sequence) {
        AbstractC3162jA.A04(sequence);
        Iterator<String> itA04 = A04(sequence);
        List<String> result = new ArrayList<>();
        while (itA04.hasNext()) {
            result.add(itA04.next());
        }
        return Collections.unmodifiableList(result);
    }
}
