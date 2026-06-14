package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UnknownNull;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, MediaSourceAndListener<T>> childSources = new HashMap<>();

    @Nullable
    private Handler eventHandler;

    @Nullable
    private TransferListener mediaTransferListener;

    private final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        private DrmSessionEventListener.EventDispatcher drmEventDispatcher;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @UnknownNull
        private final T f25048id;
        private MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;

        public ForwardingEventListener(@UnknownNull T t10) {
            this.mediaSourceEventDispatcher = CompositeMediaSource.this.createEventDispatcher(null);
            this.drmEventDispatcher = CompositeMediaSource.this.createDrmEventDispatcher(null);
            this.f25048id = t10;
        }

        private boolean maybeUpdateEventDispatcher(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (mediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.f25048id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.f25048id, i10);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                this.mediaSourceEventDispatcher = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId, 0L);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.drmEventDispatcher;
            if (eventDispatcher2.windowIndex == windowIndexForChildWindowIndex && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.drmEventDispatcher = CompositeMediaSource.this.createDrmEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            return true;
        }

        private MediaLoadData maybeUpdateMediaLoadData(MediaLoadData mediaLoadData) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f25048id, mediaLoadData.mediaStartTimeMs);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f25048id, mediaLoadData.mediaEndTimeMs);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysLoaded();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRemoved();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRestored();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            com.google.android.exoplayer2.drm.j.d(this, i10, mediaPeriodId);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionManagerError(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionReleased();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i11) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionAcquired(i11);
            }
        }
    }

    private static final class MediaSourceAndListener<T> {
        public final MediaSource.MediaSourceCaller caller;
        public final CompositeMediaSource<T>.ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, CompositeMediaSource<T>.ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    protected CompositeMediaSource() {
    }

    protected final void disableChildSource(@UnknownNull T t10) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.get(t10));
        mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void disableInternal() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    protected final void enableChildSource(@UnknownNull T t10) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.get(t10));
        mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void enableInternal() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    @Nullable
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@UnknownNull T t10, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    protected long getMediaTimeForChildMediaTime(@UnknownNull T t10, long j10) {
        return j10;
    }

    protected int getWindowIndexForChildWindowIndex(@UnknownNull T t10, int i10) {
        return i10;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<MediaSourceAndListener<T>> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onChildSourceInfoRefreshed(@UnknownNull T t10, MediaSource mediaSource, Timeline timeline);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void prepareChildSource(@UnknownNull final T t10, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t10));
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.source.a
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline) {
                this.f25052b.onChildSourceInfoRefreshed(t10, mediaSource2, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(t10);
        this.childSources.put(t10, new MediaSourceAndListener<>(mediaSource, mediaSourceCaller, forwardingEventListener));
        mediaSource.addEventListener((Handler) Assertions.checkNotNull(this.eventHandler), forwardingEventListener);
        mediaSource.addDrmEventListener((Handler) Assertions.checkNotNull(this.eventHandler), forwardingEventListener);
        mediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, getPlayerId());
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(mediaSourceCaller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.eventHandler = Util.createHandlerForCurrentLooper();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void releaseChildSource(@UnknownNull T t10) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.remove(t10));
        mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
        mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
        mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    protected void releaseSourceInternal() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
    }
}
