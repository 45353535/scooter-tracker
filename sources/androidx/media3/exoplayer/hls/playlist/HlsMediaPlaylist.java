package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;

    @Nullable
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, @Nullable Segment segment, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, segment, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.isIndependent = z11;
            this.isPreload = z12;
        }

        public Part copyWith(long j10, int i10) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i10, j10, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j10, int i10) {
            this.playlistUri = uri;
            this.lastMediaSequence = j10;
            this.lastPartIndex = i10;
        }
    }

    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;

        @Nullable
        public final DrmInitData drmInitData;
        public final long durationUs;

        @Nullable
        public final String encryptionIV;

        @Nullable
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;

        @Nullable
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, @Nullable Segment segment, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j12, long j13, boolean z10) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j10;
            this.relativeDiscontinuitySequence = i10;
            this.relativeStartTimeUs = j11;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j12;
            this.byteRangeLength = j13;
            this.hasGapTag = z10;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l10) {
            if (this.relativeStartTimeUs > l10.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l10.longValue() ? -1 : 0;
        }
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.skipUntilUs = j10;
            this.canSkipDateRanges = z10;
            this.holdBackUs = j11;
            this.partHoldBackUs = j12;
            this.canBlockReload = z11;
        }
    }

    public HlsMediaPlaylist(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, @Nullable DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map) {
        super(str, list, z12);
        this.playlistType = i10;
        this.startTimeUs = j11;
        this.preciseStart = z10;
        this.hasDiscontinuitySequence = z11;
        this.discontinuitySequence = i11;
        this.mediaSequence = j12;
        this.version = i12;
        this.targetDurationUs = j13;
        this.partTargetDurationUs = j14;
        this.hasEndTag = z13;
        this.hasProgramDateTime = z14;
        this.protectionSchemes = drmInitData;
        this.segments = ImmutableList.copyOf((Collection) list2);
        this.trailingParts = ImmutableList.copyOf((Collection) list3);
        this.renditionReports = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            Part part = (Part) Iterables.getLast(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            Segment segment = (Segment) Iterables.getLast(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        }
        this.startOffsetUs = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.durationUs, j10) : Math.max(0L, this.durationUs + j10) : -9223372036854775807L;
        this.hasPositiveStartOffset = j10 >= 0;
        this.serverControl = serverControl;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    public HlsMediaPlaylist copyWith(long j10, int i10) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j10, true, i10, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(@Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j10 = this.mediaSequence;
            long j11 = hlsMediaPlaylist.mediaSequence;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.segments.size() - hlsMediaPlaylist.segments.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.trailingParts.size();
                int size3 = hlsMediaPlaylist.trailingParts.size();
                if (size2 <= size3 && (size2 != size3 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String str, long j10, long j11, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, ImmutableList.of());
        }

        public Segment copyWith(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.parts.size(); i11++) {
                Part part = this.parts.get(i11);
                arrayList.add(part.copyWith(j11, i10));
                j11 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i10, j10, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(String str, @Nullable Segment segment, String str2, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j12, long j13, boolean z10, List<Part> list) {
            super(str, segment, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.title = str2;
            this.parts = ImmutableList.copyOf((Collection) list);
        }
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }
}
