package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;
    private final int type;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    public static /* synthetic */ int a(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean blacklist(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsBlacklisted = isBlacklisted(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.length && !zIsBlacklisted) {
            zIsBlacklisted = (i11 == i10 || isBlacklisted(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zIsBlacklisted) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i10] = Math.max(jArr[i10], Util.addWithOverflowDefault(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.group == baseTrackSelection.group && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j10, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i10) {
        return this.formats[i10];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i10) {
        return this.tracks[i10];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (this.formats[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean isBlacklisted(int i10, long j10) {
        return this.excludeUntilTimes[i10] > j10;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onDiscontinuity() {
        o.a(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
        o.b(this, z10);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f10) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onRebuffer() {
        o.c(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ boolean shouldCancelChunkLoad(long j10, Chunk chunk, List list) {
        return o.d(this, j10, chunk, list);
    }

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i10) {
        int i11 = 0;
        Assertions.checkState(iArr.length > 0);
        this.type = i10;
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.formats[i12] = trackGroup.getFormat(iArr[i12]);
        }
        Arrays.sort(this.formats, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BaseTrackSelection.a((Format) obj, (Format) obj2);
            }
        });
        this.tracks = new int[this.length];
        while (true) {
            int i13 = this.length;
            if (i11 >= i13) {
                this.excludeUntilTimes = new long[i13];
                return;
            } else {
                this.tracks[i11] = trackGroup.indexOf(this.formats[i11]);
                i11++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.length; i11++) {
            if (this.tracks[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
