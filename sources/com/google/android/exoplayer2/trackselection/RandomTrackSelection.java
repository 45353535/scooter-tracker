package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.RandomTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, int i10, Random random) {
        super(trackGroup, iArr, i10);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return 3;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.length; i11++) {
            if (!isBlacklisted(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        this.selectedIndex = this.random.nextInt(i10);
        if (i10 != this.length) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.length; i13++) {
                if (!isBlacklisted(i13, jElapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.selectedIndex == i12) {
                        this.selectedIndex = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }

    public static final class Factory implements ExoTrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        public static /* synthetic */ ExoTrackSelection a(Factory factory, ExoTrackSelection.Definition definition) {
            factory.getClass();
            return new RandomTrackSelection(definition.group, definition.tracks, definition.type, factory.random);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new TrackSelectionUtil.AdaptiveTrackSelectionFactory() { // from class: com.google.android.exoplayer2.trackselection.p
                @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
                    return RandomTrackSelection.Factory.a(this.f25155a, definition);
                }
            });
        }

        public Factory(int i10) {
            this.random = new Random(i10);
        }
    }
}
