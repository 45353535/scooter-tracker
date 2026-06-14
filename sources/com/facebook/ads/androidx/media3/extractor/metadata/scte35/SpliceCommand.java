package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC17612c;
import com.facebook.ads.redexgen.core.C3497or;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{54, 38, 49, 32, 72, 86, 80, 69, Ascii.SYN, Ascii.NAK, 9, Ascii.FF, 6, 0, 69, 6, 10, 8, 8, 4, Ascii.VT, 1, 95, 69, 17, Ascii.FS, Ascii.NAK, 0, 88};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9S() {
        return AbstractC17612c.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C3497or A9T() {
        return AbstractC17612c.A00(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return A02(0, 29, 61) + getClass().getSimpleName();
    }
}
