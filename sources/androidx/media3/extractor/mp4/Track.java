package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class Track {
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final long durationUs;

    @Nullable
    public final long[] editListDurations;

    @Nullable
    public final long[] editListMediaTimes;
    public final Format format;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f5304id;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;

    @Nullable
    private final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final long timescale;
    public final int type;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i10, int i11, long j10, long j11, long j12, Format format, int i12, @Nullable TrackEncryptionBox[] trackEncryptionBoxArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f5304id = i10;
        this.type = i11;
        this.timescale = j10;
        this.movieTimescale = j11;
        this.durationUs = j12;
        this.format = format;
        this.sampleTransformation = i12;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr;
        this.nalUnitLengthFieldLength = i13;
        this.editListDurations = jArr;
        this.editListMediaTimes = jArr2;
    }

    public Track copyWithFormat(Format format) {
        return new Track(this.f5304id, this.type, this.timescale, this.movieTimescale, this.durationUs, format, this.sampleTransformation, this.sampleDescriptionEncryptionBoxes, this.nalUnitLengthFieldLength, this.editListDurations, this.editListMediaTimes);
    }

    public Track copyWithoutEditLists() {
        return new Track(this.f5304id, this.type, this.timescale, this.movieTimescale, this.durationUs, this.format, this.sampleTransformation, this.sampleDescriptionEncryptionBoxes, this.nalUnitLengthFieldLength, null, null);
    }

    @Nullable
    public TrackEncryptionBox getSampleDescriptionEncryptionBox(int i10) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.sampleDescriptionEncryptionBoxes;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i10];
    }
}
