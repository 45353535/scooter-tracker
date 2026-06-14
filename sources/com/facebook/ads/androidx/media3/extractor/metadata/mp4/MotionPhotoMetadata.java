package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.PlaybackException;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC17612c;
import com.facebook.ads.redexgen.core.AbstractC3553q7;
import com.facebook.ads.redexgen.core.C2142Hl;
import com.facebook.ads.redexgen.core.C3497or;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static byte[] A05;
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{13, 1, 81, 73, 80, 85, 80, 49, 83, 70, 84, 70, 79, 85, 66, 85, 74, 80, 79, 53, 74, 78, 70, 84, 85, 66, 78, 81, 54, 84, Ascii.RS, -27, -39, 41, 33, 40, 45, 40, Ascii.FF, 34, 51, Ascii.RS, -10, 3, -9, 77, SignedBytes.MAX_POWER_OF_TWO, 59, 60, 70, 42, SignedBytes.MAX_POWER_OF_TWO, 81, 60, Ascii.DC4, -49, -61, Ascii.EM, Ascii.FF, 7, 8, Ascii.DC2, -10, Ascii.ETB, 4, Ascii.NAK, Ascii.ETB, -13, Ascii.DC2, Ascii.SYN, Ascii.FF, Ascii.ETB, Ascii.FF, Ascii.DC2, 17, -32, Ascii.DC2, 52, 57, 46, 52, 51, -27, 53, 45, 52, 57, 52, -27, 50, 42, 57, 38, 41, 38, 57, 38, -1, -27, 53, 45, 52, 57, 52, Ascii.CAN, 57, 38, 55, 57, Ascii.NAK, 52, 56, 46, 57, 46, 52, 51, 2};
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
        CREATOR = new C2142Hl();
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.A02 = j10;
        this.A01 = j11;
        this.A00 = j12;
        this.A04 = j13;
        this.A03 = j14;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, C2142Hl c2142Hl) {
        this(parcel);
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
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01 && this.A00 == motionPhotoMetadata.A00 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03;
    }

    public final int hashCode() {
        int result = AbstractC3553q7.A00(this.A02);
        int iA00 = ((((17 * 31) + result) * 31) + AbstractC3553q7.A00(this.A01)) * 31;
        int result2 = AbstractC3553q7.A00(this.A00);
        int iA002 = (((iA00 + result2) * 31) + AbstractC3553q7.A00(this.A04)) * 31;
        int result3 = AbstractC3553q7.A00(this.A03);
        return iA002 + result3;
    }

    public final String toString() {
        return A00(76, 42, 93) + this.A02 + A00(31, 12, 81) + this.A01 + A00(0, 31, 121) + this.A00 + A00(55, 21, 59) + this.A04 + A00(43, 12, 111) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
