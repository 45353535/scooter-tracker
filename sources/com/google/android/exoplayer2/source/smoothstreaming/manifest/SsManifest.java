package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class SsManifest implements FilterableManifest<SsManifest> {
    public static final int UNSET_LOOKAHEAD = -1;
    public final long durationUs;
    public final long dvrWindowLengthUs;
    public final boolean isLive;
    public final int lookAheadCount;
    public final int majorVersion;
    public final int minorVersion;

    @Nullable
    public final ProtectionElement protectionElement;
    public final StreamElement[] streamElements;

    public static class ProtectionElement {
        public final byte[] data;
        public final TrackEncryptionBox[] trackEncryptionBoxes;
        public final UUID uuid;

        public ProtectionElement(UUID uuid, byte[] bArr, TrackEncryptionBox[] trackEncryptionBoxArr) {
            this.uuid = uuid;
            this.data = bArr;
            this.trackEncryptionBoxes = trackEncryptionBoxArr;
        }
    }

    public SsManifest(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, @Nullable ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : Util.scaleLargeTimestamp(j11, 1000000L, j10), j12 != 0 ? Util.scaleLargeTimestamp(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, protectionElement, streamElementArr);
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public /* bridge */ /* synthetic */ SsManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public final SsManifest copy(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StreamElement streamElement = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            StreamElement streamElement2 = this.streamElements[streamKey.groupIndex];
            if (streamElement2 != streamElement && streamElement != null) {
                arrayList2.add(streamElement.copy((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(streamElement2.formats[streamKey.streamIndex]);
            i10++;
            streamElement = streamElement2;
        }
        if (streamElement != null) {
            arrayList2.add(streamElement.copy((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new SsManifest(this.majorVersion, this.minorVersion, this.durationUs, this.dvrWindowLengthUs, this.lookAheadCount, this.isLive, this.protectionElement, (StreamElement[]) arrayList2.toArray(new StreamElement[0]));
    }

    public static class StreamElement {
        private static final String URL_PLACEHOLDER_BITRATE_1 = "{bitrate}";
        private static final String URL_PLACEHOLDER_BITRATE_2 = "{Bitrate}";
        private static final String URL_PLACEHOLDER_START_TIME_1 = "{start time}";
        private static final String URL_PLACEHOLDER_START_TIME_2 = "{start_time}";
        private final String baseUri;
        public final int chunkCount;
        private final List<Long> chunkStartTimes;
        private final long[] chunkStartTimesUs;
        private final String chunkTemplate;
        public final int displayHeight;
        public final int displayWidth;
        public final Format[] formats;

        @Nullable
        public final String language;
        private final long lastChunkDurationUs;
        public final int maxHeight;
        public final int maxWidth;
        public final String name;
        public final String subType;
        public final long timescale;
        public final int type;

        public StreamElement(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @Nullable String str5, Format[] formatArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, formatArr, list, Util.scaleLargeTimestamps(list, 1000000L, j10), Util.scaleLargeTimestamp(j11, 1000000L, j10));
        }

        public Uri buildRequestUri(int i10, int i11) {
            Assertions.checkState(this.formats != null);
            Assertions.checkState(this.chunkStartTimes != null);
            Assertions.checkState(i11 < this.chunkStartTimes.size());
            String string = Integer.toString(this.formats[i10].bitrate);
            String string2 = this.chunkStartTimes.get(i11).toString();
            return UriUtil.resolveToUri(this.baseUri, this.chunkTemplate.replace(URL_PLACEHOLDER_BITRATE_1, string).replace(URL_PLACEHOLDER_BITRATE_2, string).replace(URL_PLACEHOLDER_START_TIME_1, string2).replace(URL_PLACEHOLDER_START_TIME_2, string2));
        }

        public StreamElement copy(Format[] formatArr) {
            return new StreamElement(this.baseUri, this.chunkTemplate, this.type, this.subType, this.timescale, this.name, this.maxWidth, this.maxHeight, this.displayWidth, this.displayHeight, this.language, formatArr, this.chunkStartTimes, this.chunkStartTimesUs, this.lastChunkDurationUs);
        }

        public long getChunkDurationUs(int i10) {
            if (i10 == this.chunkCount - 1) {
                return this.lastChunkDurationUs;
            }
            long[] jArr = this.chunkStartTimesUs;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int getChunkIndex(long j10) {
            return Util.binarySearchFloor(this.chunkStartTimesUs, j10, true, true);
        }

        public long getStartTimeUs(int i10) {
            return this.chunkStartTimesUs[i10];
        }

        private StreamElement(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @Nullable String str5, Format[] formatArr, List<Long> list, long[] jArr, long j11) {
            this.baseUri = str;
            this.chunkTemplate = str2;
            this.type = i10;
            this.subType = str3;
            this.timescale = j10;
            this.name = str4;
            this.maxWidth = i11;
            this.maxHeight = i12;
            this.displayWidth = i13;
            this.displayHeight = i14;
            this.language = str5;
            this.formats = formatArr;
            this.chunkStartTimes = list;
            this.chunkStartTimesUs = jArr;
            this.lastChunkDurationUs = j11;
            this.chunkCount = list.size();
        }
    }

    private SsManifest(int i10, int i11, long j10, long j11, int i12, boolean z10, @Nullable ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        this.majorVersion = i10;
        this.minorVersion = i11;
        this.durationUs = j10;
        this.dvrWindowLengthUs = j11;
        this.lookAheadCount = i12;
        this.isLive = z10;
        this.protectionElement = protectionElement;
        this.streamElements = streamElementArr;
    }
}
