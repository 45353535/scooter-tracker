package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2145Ho implements Parcelable.Creator<SlowMotionData.Segment> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final SlowMotionData.Segment createFromParcel(Parcel parcel) {
        return new SlowMotionData.Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SlowMotionData.Segment[] newArray(int i10) {
        return new SlowMotionData.Segment[i10];
    }
}
