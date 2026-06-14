package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes10.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    };
    public final String description;
    public final String value;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (this.f50061id.equals(textInformationFrame.f50061id) && Util.areEqual(this.description, textInformationFrame.description) && Util.areEqual(this.value, textInformationFrame.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f50061id.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f50061id + ": value=" + this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f50061id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }

    TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.description = parcel.readString();
        this.value = parcel.readString();
    }
}
