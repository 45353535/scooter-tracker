package com.google.android.exoplayer2.source;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class TrackGroup implements Bundleable {
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f25051id;
    public final int length;
    public final int type;
    private static final String FIELD_FORMATS = Util.intToStringMaxRadix(0);
    private static final String FIELD_ID = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<TrackGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.a0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return TrackGroup.a(bundle);
        }
    };

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }

    public static /* synthetic */ TrackGroup a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_FORMATS);
        return new TrackGroup(bundle.getString(FIELD_ID, ""), (Format[]) (parcelableArrayList == null ? ImmutableList.of() : BundleableUtil.fromBundleList(Format.CREATOR, parcelableArrayList)).toArray(new Format[0]));
    }

    private static void logErrorMessage(String str, @Nullable String str2, @Nullable String str3, int i10) {
        Log.e(TAG, "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String normalizeLanguage(@Nullable String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int normalizeRoleFlags(int i10) {
        return i10 | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i10 = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i10 >= formatArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(formatArr[i10].language))) {
                Format[] formatArr2 = this.formats;
                logErrorMessage("languages", formatArr2[0].language, formatArr2[i10].language, i10);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.formats[i10].roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i10].roleFlags), i10);
                    return;
                }
                i10++;
            }
        }
    }

    @CheckResult
    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.f25051id.equals(trackGroup.f25051id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public Format getFormat(int i10) {
        return this.formats[i10];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f25051id.hashCode()) * 31) + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public int indexOf(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i10 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.formats.length);
        for (Format format : this.formats) {
            arrayList.add(format.toBundle(true));
        }
        bundle.putParcelableArrayList(FIELD_FORMATS, arrayList);
        bundle.putString(FIELD_ID, this.f25051id);
        return bundle;
    }

    public TrackGroup(String str, Format... formatArr) {
        Assertions.checkArgument(formatArr.length > 0);
        this.f25051id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        int trackType = MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        verifyCorrectness();
    }
}
