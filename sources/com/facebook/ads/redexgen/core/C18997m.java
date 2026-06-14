package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C18997m {
    public static final C18997m A03;
    public final String A00;
    public final C18987l A01;
    public final Object A02;

    static {
        C18997m c18997m;
        if (AbstractC18094a.A02 < 31) {
            c18997m = new C18997m("");
        } else {
            c18997m = new C18997m(C18987l.A01, "");
        }
        A03 = c18997m;
    }

    public C18997m(C18987l c18987l, String str) {
        this.A01 = c18987l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C18997m(String str) {
        C3M.A08(AbstractC18094a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C18987l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18997m)) {
            return false;
        }
        C18997m c18997m = (C18997m) obj;
        if (Objects.equals(this.A00, c18997m.A00) && Objects.equals(this.A01, c18997m.A01) && Objects.equals(this.A02, c18997m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
