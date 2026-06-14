package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f50061id;

    public Id3Frame(String str) {
        this.f50061id = (String) Assertions.checkNotNull(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f50061id;
    }
}
