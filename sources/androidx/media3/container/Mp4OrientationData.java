package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.o;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class Mp4OrientationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4OrientationData> CREATOR = new Parcelable.Creator<Mp4OrientationData>() { // from class: androidx.media3.container.Mp4OrientationData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4OrientationData createFromParcel(Parcel parcel) {
            return new Mp4OrientationData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4OrientationData[] newArray(int i10) {
            return new Mp4OrientationData[i10];
        }
    };
    public final int orientation;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4OrientationData) && this.orientation == ((Mp4OrientationData) obj).orientation;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return o.a(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return o.b(this);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.orientation;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        o.c(this, builder);
    }

    public String toString() {
        return "Orientation= " + this.orientation;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.orientation);
    }

    public Mp4OrientationData(int i10) {
        Assertions.checkArgument(i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270, "Unsupported orientation");
        this.orientation = i10;
    }

    private Mp4OrientationData(Parcel parcel) {
        this.orientation = parcel.readInt();
    }
}
