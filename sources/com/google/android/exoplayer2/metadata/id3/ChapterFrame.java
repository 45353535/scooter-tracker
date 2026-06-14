package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator<ChapterFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ChapterFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    };
    public static final String ID = "CHAP";
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final Id3Frame[] subFrames;

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.chapterId = str;
        this.startTimeMs = i10;
        this.endTimeMs = i11;
        this.startOffset = j10;
        this.endOffset = j11;
        this.subFrames = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && Util.areEqual(this.chapterId, chapterFrame.chapterId) && Arrays.equals(this.subFrames, chapterFrame.subFrames)) {
                return true;
            }
        }
        return false;
    }

    public Id3Frame getSubFrame(int i10) {
        return this.subFrames[i10];
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31;
        String str = this.chapterId;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.chapterId);
        parcel.writeInt(this.startTimeMs);
        parcel.writeInt(this.endTimeMs);
        parcel.writeLong(this.startOffset);
        parcel.writeLong(this.endOffset);
        parcel.writeInt(this.subFrames.length);
        for (Id3Frame id3Frame : this.subFrames) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.chapterId = (String) Util.castNonNull(parcel.readString());
        this.startTimeMs = parcel.readInt();
        this.endTimeMs = parcel.readInt();
        this.startOffset = parcel.readLong();
        this.endOffset = parcel.readLong();
        int i10 = parcel.readInt();
        this.subFrames = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.subFrames[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
