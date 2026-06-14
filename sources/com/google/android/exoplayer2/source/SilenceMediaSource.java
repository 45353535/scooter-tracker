package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final Format FORMAT;
    public static final String MEDIA_ID = "SilenceMediaSource";
    private static final MediaItem MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;
    private final MediaItem mediaItem;

    public static final class Factory {
        private long durationUs;

        @Nullable
        private Object tag;

        public SilenceMediaSource createMediaSource() {
            Assertions.checkState(this.durationUs > 0);
            return new SilenceMediaSource(this.durationUs, SilenceMediaSource.MEDIA_ITEM.buildUpon().setTag(this.tag).build());
        }

        @CanIgnoreReturnValue
        public Factory setDurationUs(@IntRange(from = 1) long j10) {
            this.durationUs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }
    }

    private static final class SilenceMediaPeriod implements MediaPeriod {
        private static final TrackGroupArray TRACKS = new TrackGroupArray(new TrackGroup(SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final ArrayList<SampleStream> sampleStreams = new ArrayList<>();

        public SilenceMediaPeriod(long j10) {
            this.durationUs = j10;
        }

        private long constrainSeekPosition(long j10) {
            return Util.constrainValue(j10, 0L, this.durationUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j10) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j10, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
            return constrainSeekPosition(j10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public /* synthetic */ List getStreamKeys(List list) {
            return k.a(this, list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j10) {
            callback.onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j10) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j10) {
            long jConstrainSeekPosition = constrainSeekPosition(j10);
            for (int i10 = 0; i10 < this.sampleStreams.size(); i10++) {
                ((SilenceSampleStream) this.sampleStreams.get(i10)).seekTo(jConstrainSeekPosition);
            }
            return jConstrainSeekPosition;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
            long jConstrainSeekPosition = constrainSeekPosition(j10);
            for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
                SampleStream sampleStream = sampleStreamArr[i10];
                if (sampleStream != null && (exoTrackSelectionArr[i10] == null || !zArr[i10])) {
                    this.sampleStreams.remove(sampleStream);
                    sampleStreamArr[i10] = null;
                }
                if (sampleStreamArr[i10] == null && exoTrackSelectionArr[i10] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream(this.durationUs);
                    silenceSampleStream.seekTo(jConstrainSeekPosition);
                    this.sampleStreams.add(silenceSampleStream);
                    sampleStreamArr[i10] = silenceSampleStream;
                    zArr2[i10] = true;
                }
            }
            return jConstrainSeekPosition;
        }
    }

    private static final class SilenceSampleStream implements SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        public SilenceSampleStream(long j10) {
            this.durationBytes = SilenceMediaSource.getAudioByteCount(j10);
            seekTo(0L);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (!this.sentFormat || (i10 & 2) != 0) {
                formatHolder.format = SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j10 = this.durationBytes;
            long j11 = this.positionBytes;
            long j12 = j10 - j11;
            if (j12 == 0) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            decoderInputBuffer.timeUs = SilenceMediaSource.getAudioPositionUs(j11);
            decoderInputBuffer.addFlag(1);
            int iMin = (int) Math.min(SilenceMediaSource.SILENCE_SAMPLE.length, j12);
            if ((i10 & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(iMin);
                decoderInputBuffer.data.put(SilenceMediaSource.SILENCE_SAMPLE, 0, iMin);
            }
            if ((i10 & 1) == 0) {
                this.positionBytes += (long) iMin;
            }
            return -4;
        }

        public void seekTo(long j10) {
            this.positionBytes = Util.constrainValue(SilenceMediaSource.getAudioByteCount(j10), 0L, this.durationBytes);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j10) {
            long j11 = this.positionBytes;
            seekTo(j10);
            return (int) ((this.positionBytes - j11) / ((long) SilenceMediaSource.SILENCE_SAMPLE.length));
        }
    }

    static {
        Format formatBuild = new Format.Builder().setSampleMimeType("audio/raw").setChannelCount(2).setSampleRate(SAMPLE_RATE_HZ).setPcmEncoding(2).build();
        FORMAT = formatBuild;
        MEDIA_ITEM = new MediaItem.Builder().setMediaId("SilenceMediaSource").setUri(Uri.EMPTY).setMimeType(formatBuild.sampleMimeType).build();
        SILENCE_SAMPLE = new byte[Util.getPcmFrameSize(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j10) {
        return ((long) Util.getPcmFrameSize(2, 2)) * ((j10 * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j10) {
        return ((j10 / ((long) Util.getPcmFrameSize(2, 2))) * 1000000) / 44100;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        return new SilenceMediaPeriod(this.durationUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.durationUs, true, false, false, (Object) null, this.mediaItem));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public SilenceMediaSource(long j10) {
        this(j10, MEDIA_ITEM);
    }

    private SilenceMediaSource(long j10, MediaItem mediaItem) {
        Assertions.checkArgument(j10 >= 0);
        this.durationUs = j10;
        this.mediaItem = mediaItem;
    }
}
