package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface MediaSource {

    public interface Factory {
        public static final Factory UNSUPPORTED = MediaSourceFactory.UNSUPPORTED;

        MediaSource createMediaSource(MediaItem mediaItem);

        int[] getSupportedTypes();

        Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider);

        Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy);
    }

    public static final class MediaPeriodId extends com.google.android.exoplayer2.source.MediaPeriodId {
        public MediaPeriodId(Object obj) {
            super(obj);
        }

        public MediaPeriodId(Object obj, long j10) {
            super(obj, j10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public MediaPeriodId copyWithPeriodUid(Object obj) {
            return new MediaPeriodId(super.copyWithPeriodUid(obj));
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public MediaPeriodId copyWithWindowSequenceNumber(long j10) {
            return new MediaPeriodId(super.copyWithWindowSequenceNumber(j10));
        }

        public MediaPeriodId(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public MediaPeriodId(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public MediaPeriodId(com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId) {
            super(mediaPeriodId);
        }
    }

    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline);
    }

    void addDrmEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener);

    void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator, long j10);

    void disable(MediaSourceCaller mediaSourceCaller);

    void enable(MediaSourceCaller mediaSourceCaller);

    @Nullable
    Timeline getInitialTimeline();

    MediaItem getMediaItem();

    boolean isSingleWindow();

    void maybeThrowSourceInfoRefreshError() throws IOException;

    @Deprecated
    void prepareSource(MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener);

    void prepareSource(MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener, PlayerId playerId);

    void releasePeriod(MediaPeriod mediaPeriod);

    void releaseSource(MediaSourceCaller mediaSourceCaller);

    void removeDrmEventListener(DrmSessionEventListener drmSessionEventListener);

    void removeEventListener(MediaSourceEventListener mediaSourceEventListener);
}
