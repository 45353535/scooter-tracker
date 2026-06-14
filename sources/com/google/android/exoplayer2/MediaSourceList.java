package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
final class MediaSourceList {
    private static final String TAG = "MediaSourceList";
    private final HandlerWrapper eventHandler;
    private final AnalyticsCollector eventListener;
    private boolean isPrepared;
    private final MediaSourceListInfoRefreshListener mediaSourceListInfoListener;

    @Nullable
    private TransferListener mediaTransferListener;
    private final PlayerId playerId;
    private ShuffleOrder shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod = new IdentityHashMap<>();
    private final Map<Object, MediaSourceHolder> mediaSourceByUid = new HashMap();
    private final List<MediaSourceHolder> mediaSourceHolders = new ArrayList();
    private final HashMap<MediaSourceHolder, MediaSourceAndListener> childSources = new HashMap<>();
    private final Set<MediaSourceHolder> enabledMediaSourceHolders = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final MediaSourceHolder f24624id;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.f24624id = mediaSourceHolder;
        }

        @Nullable
        private Pair<Integer, MediaSource.MediaPeriodId> getEventParameters(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId = MediaSourceList.getMediaPeriodIdForChildMediaPeriodId(this.f24624id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdForChildMediaPeriodId;
            }
            return Pair.create(Integer.valueOf(MediaSourceList.getWindowIndexForChildWindowIndex(this.f24624id, i10)), mediaPeriodId2);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24912b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onDownstreamFormatChanged(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, mediaLoadData);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24891b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onDrmKeysLoaded(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24939b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onDrmKeysRemoved(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.f2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24903b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onDrmKeysRestored(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            com.google.android.exoplayer2.drm.j.d(this, i10, mediaPeriodId);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24931b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onDrmSessionManagerError(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.h2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24923b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onDrmSessionReleased(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24965b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onLoadCanceled(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24827b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onLoadCompleted(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z10) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24987b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onLoadError(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, iOException, z10);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24947b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onLoadStarted(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24840b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onUpstreamDiscarded(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) Assertions.checkNotNull((MediaSource.MediaPeriodId) pair.second), mediaLoadData);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final int i11) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i10, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.ForwardingEventListener forwardingEventListener = this.f24956b;
                        Pair pair = eventParameters;
                        MediaSourceList.this.eventListener.onDrmSessionAcquired(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, i11);
                    }
                });
            }
        }
    }

    private static final class MediaSourceAndListener {
        public final MediaSource.MediaSourceCaller caller;
        public final ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    static final class MediaSourceHolder implements MediaSourceInfoHolder {
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z10) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z10);
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Timeline getTimeline() {
            return this.mediaSource.getTimeline();
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Object getUid() {
            return this.uid;
        }

        public void reset(int i10) {
            this.firstWindowIndexInChild = i10;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
        this.playerId = playerId;
        this.mediaSourceListInfoListener = mediaSourceListInfoRefreshListener;
        this.eventListener = analyticsCollector;
        this.eventHandler = handlerWrapper;
    }

    private void correctOffsets(int i10, int i11) {
        while (i10 < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i10).firstWindowIndexInChild += i11;
            i10++;
        }
    }

    private void disableChildSource(MediaSourceHolder mediaSourceHolder) {
        MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    private void disableUnusedMediaSources() {
        Iterator<MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i10 = 0; i10 < mediaSourceHolder.activeMediaPeriodIds.size(); i10++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i10).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i10) {
        return i10 + mediaSourceHolder.firstWindowIndexInChild;
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.remove(mediaSourceHolder));
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
        }
    }

    private void prepareChildSource(MediaSourceHolder mediaSourceHolder) {
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.mediaSource;
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.b2
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                this.f24821b.mediaSourceListInfoListener.onPlaylistUpdateRequested();
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        this.childSources.put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, mediaSourceCaller, forwardingEventListener));
        maskingMediaSource.addEventListener(Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.addDrmEventListener(Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, this.playerId);
    }

    private void removeMediaSourcesInternal(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i12);
            this.mediaSourceByUid.remove(mediaSourceHolderRemove.uid);
            correctOffsets(i12, -mediaSourceHolderRemove.mediaSource.getTimeline().getWindowCount());
            mediaSourceHolderRemove.isRemoved = true;
            if (this.isPrepared) {
                maybeReleaseChildSource(mediaSourceHolderRemove);
            }
        }
    }

    public Timeline addMediaSources(int i10, List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.shuffleOrder = shuffleOrder;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                MediaSourceHolder mediaSourceHolder = list.get(i11 - i10);
                if (i11 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i11 - 1);
                    mediaSourceHolder.reset(mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
                } else {
                    mediaSourceHolder.reset(0);
                }
                correctOffsets(i11, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
                this.mediaSourceHolders.add(i11, mediaSourceHolder);
                this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
                if (this.isPrepared) {
                    prepareChildSource(mediaSourceHolder);
                    if (this.mediaSourceByMediaPeriod.isEmpty()) {
                        this.enabledMediaSourceHolders.add(mediaSourceHolder);
                    } else {
                        disableChildSource(mediaSourceHolder);
                    }
                }
            }
        }
        return createTimeline();
    }

    public Timeline clear(@Nullable ShuffleOrder shuffleOrder) {
        if (shuffleOrder == null) {
            shuffleOrder = this.shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(0, getSize());
        return createTimeline();
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByUid.get(mediaSourceHolderUid));
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j10);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    public Timeline createTimeline() {
        if (this.mediaSourceHolders.isEmpty()) {
            return Timeline.EMPTY;
        }
        int windowCount = 0;
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i10);
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
        }
        return new PlaylistTimeline(this.mediaSourceHolders, this.shuffleOrder);
    }

    public int getSize() {
        return this.mediaSourceHolders.size();
    }

    public boolean isPrepared() {
        return this.isPrepared;
    }

    public Timeline moveMediaSource(int i10, int i11, ShuffleOrder shuffleOrder) {
        return moveMediaSourceRange(i10, i10 + 1, i11, shuffleOrder);
    }

    public Timeline moveMediaSourceRange(int i10, int i11, int i12, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize() && i12 >= 0);
        this.shuffleOrder = shuffleOrder;
        if (i10 == i11 || i10 == i12) {
            return createTimeline();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        Util.moveItems(this.mediaSourceHolders, i10, i11, i12);
        while (iMin <= iMax) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public void prepare(@Nullable TransferListener transferListener) {
        Assertions.checkState(!this.isPrepared);
        this.mediaTransferListener = transferListener;
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i10);
            prepareChildSource(mediaSourceHolder);
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        }
        this.isPrepared = true;
    }

    public void release() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            try {
                mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            } catch (RuntimeException e10) {
                Log.e(TAG, "Failed to release child source.", e10);
            }
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
        this.enabledMediaSourceHolders.clear();
        this.isPrepared = false;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).f25049id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    public Timeline removeMediaSourceRange(int i10, int i11, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize());
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(i10, i11);
        return createTimeline();
    }

    public Timeline setMediaSources(List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        removeMediaSourcesInternal(0, this.mediaSourceHolders.size());
        return addMediaSources(this.mediaSourceHolders.size(), list, shuffleOrder);
    }

    public Timeline setShuffleOrder(ShuffleOrder shuffleOrder) {
        int size = getSize();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
        }
        this.shuffleOrder = shuffleOrder;
        return createTimeline();
    }
}
