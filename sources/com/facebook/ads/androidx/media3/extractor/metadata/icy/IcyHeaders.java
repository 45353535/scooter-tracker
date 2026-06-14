package com.facebook.ads.androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC17612c;
import com.facebook.ads.redexgen.core.AbstractC18094a;
import com.facebook.ads.redexgen.core.C3497or;
import com.facebook.ads.redexgen.core.HT;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static byte[] A06;
    public static String[] A07 = {"ghaGnAUOt2SitSRHHz423X90tSKTPAXx", "FBrp2nvQgqmyeffboeTEyGvTZbETTMzG", "eMo1BdFVOzvhBgFL81jHh", "7Uh1kBGFxd7GLg5A0JuRGjBqdN4vVDce", "ZLGEUlzQT0qHH0ct6", "61ApNNUKl6RqFIc15O7NgM3p8KU8Sqmx", "LSx5TaQkP", "Wz18oCr93"};
    public static final Parcelable.Creator<IcyHeaders> CREATOR;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{93, 83, 95, Ascii.GS, Ascii.SYN, Ascii.VT, 13, Ascii.RS, Ascii.VT, Ascii.SUB, 66, 110, 96, 108, 43, 41, 34, 62, 41, 113, 110, 103, 107, 38, 46, Utf8.REPLACEMENT_BYTE, 42, 47, 42, Utf8.REPLACEMENT_BYTE, 42, 2, 37, Utf8.REPLACEMENT_BYTE, 46, 57, 61, 42, 39, 118, 4, 46, 52, 5, 40, 44, 41, 40, Utf8.REPLACEMENT_BYTE, 62, 119, 109, 35, 44, 32, 40, 112, 111};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9S() {
        return AbstractC17612c.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C3497or A9T() {
        return AbstractC17612c.A00(this);
    }

    static {
        A01();
        CREATOR = new HT();
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = AbstractC18094a.A1C(parcel);
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.A00 == icyHeaders.A00) {
            boolean zA1E = AbstractC18094a.A1E(this.A02, icyHeaders.A02);
            if (A07[4].length() == 20) {
                throw new RuntimeException();
            }
            A07[5] = "I4GVatcg3Odw2bdDZmPqVg6Hl1I8OBM0";
            if (zA1E && AbstractC18094a.A1E(this.A03, icyHeaders.A03) && AbstractC18094a.A1E(this.A04, icyHeaders.A04) && this.A05 == icyHeaders.A05 && this.A01 == icyHeaders.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((17 * 31) + this.A00) * 31) + (this.A02 != null ? this.A02.hashCode() : 0)) * 31) + (this.A03 != null ? this.A03.hashCode() : 0)) * 31) + (this.A04 != null ? this.A04.hashCode() : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public final String toString() {
        return A00(40, 18, 62) + this.A03 + A00(11, 10, 63) + this.A02 + A00(0, 11, 12) + this.A00 + A00(21, 19, 56) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AbstractC18094a.A0w(parcel, this.A05);
        parcel.writeInt(this.A01);
    }
}
