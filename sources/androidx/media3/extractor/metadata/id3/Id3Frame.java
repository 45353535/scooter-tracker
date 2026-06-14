package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.o;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f5301id;

    public Id3Frame(String str) {
        this.f5301id = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return o.a(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return o.b(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        o.c(this, builder);
    }

    public String toString() {
        return this.f5301id;
    }
}
