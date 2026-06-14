package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new Parcelable.Creator<BinaryFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.BinaryFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BinaryFrame[] newArray(int i10) {
            return new BinaryFrame[i10];
        }
    };
    public final byte[] data;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f24982id.equals(binaryFrame.f24982id) && Arrays.equals(this.data, binaryFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f24982id.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24982id);
        parcel.writeByteArray(this.data);
    }

    BinaryFrame(Parcel parcel) {
        super((String) Util.castNonNull(parcel.readString()));
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
    }
}
