package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public abstract class BasePreloadManager<T> {
    private final MediaSource.Factory mediaSourceFactory;
    protected final Comparator<T> rankingDataComparator;
    private final TargetPreloadStatusControl<T> targetPreloadStatusControl;

    @Nullable
    @GuardedBy("lock")
    private TargetPreloadStatusControl.PreloadStatus targetPreloadStatusOfCurrentPreloadingSource;
    private final Object lock = new Object();
    private final Map<MediaItem, BasePreloadManager<T>.MediaSourceHolder> mediaItemMediaSourceHolderMap = new HashMap();
    private final Handler startPreloadingHandler = Util.createHandlerForCurrentOrMainLooper();

    @GuardedBy("lock")
    private final PriorityQueue<BasePreloadManager<T>.MediaSourceHolder> sourceHolderPriorityQueue = new PriorityQueue<>();

    protected static abstract class BuilderBase<T> {
        protected final MediaSource.Factory mediaSourceFactory;
        protected final Comparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T> targetPreloadStatusControl;

        public BuilderBase(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactory = factory;
        }

        public abstract BasePreloadManager<T> build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class MediaSourceHolder implements Comparable<BasePreloadManager<T>.MediaSourceHolder> {
        public final MediaSource mediaSource;
        public final T rankingData;
        public final long startPositionUs;

        public MediaSourceHolder(BasePreloadManager basePreloadManager, MediaSource mediaSource, T t10) {
            this(mediaSource, t10, -9223372036854775807L);
        }

        public MediaSourceHolder(MediaSource mediaSource, T t10, long j10) {
            this.mediaSource = mediaSource;
            this.rankingData = t10;
            this.startPositionUs = j10;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T>.MediaSourceHolder mediaSourceHolder) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }
    }

    protected BasePreloadManager(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
    }

    public static /* synthetic */ void a(BasePreloadManager basePreloadManager, MediaSource mediaSource) {
        synchronized (basePreloadManager.lock) {
            try {
                if (!basePreloadManager.sourceHolderPriorityQueue.isEmpty() && ((MediaSourceHolder) Assertions.checkNotNull(basePreloadManager.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource) {
                    do {
                        basePreloadManager.sourceHolderPriorityQueue.poll();
                        if (basePreloadManager.sourceHolderPriorityQueue.isEmpty()) {
                            break;
                        }
                    } while (!basePreloadManager.maybeStartPreloadNextSource());
                }
            } finally {
            }
        }
    }

    @GuardedBy("lock")
    private boolean maybeStartPreloadNextSource() {
        if (!shouldStartPreloadingNextSource()) {
            return false;
        }
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek());
        TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
        this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
        if (targetPreloadStatus != null) {
            preloadSourceInternal(mediaSourceHolder.mediaSource, mediaSourceHolder.startPositionUs);
            return true;
        }
        clearSourceInternal(mediaSourceHolder.mediaSource);
        return false;
    }

    public final void add(MediaItem mediaItem, T t10) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), t10);
    }

    protected abstract void clearSourceInternal(MediaSource mediaSource);

    protected MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return mediaSource;
    }

    @Nullable
    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    @Nullable
    protected final TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (!this.sourceHolderPriorityQueue.isEmpty() && ((MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource) {
                    return this.targetPreloadStatusOfCurrentPreloadingSource;
                }
                return null;
            } finally {
            }
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            try {
                this.sourceHolderPriorityQueue.clear();
                this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
                while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                    this.sourceHolderPriorityQueue.poll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void onPreloadCompleted(final MediaSource mediaSource) {
        this.startPreloadingHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.a
            @Override // java.lang.Runnable
            public final void run() {
                BasePreloadManager.a(this.f5168b, mediaSource);
            }
        });
    }

    protected abstract void preloadSourceInternal(MediaSource mediaSource, long j10);

    public final void release() {
        reset();
        releaseInternal();
    }

    protected void releaseInternal() {
    }

    protected abstract void releaseSourceInternal(MediaSource mediaSource);

    public final boolean remove(MediaItem mediaItem) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return false;
        }
        MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public final void reset() {
        Iterator<BasePreloadManager<T>.MediaSourceHolder> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    protected boolean shouldStartPreloadingNextSource() {
        return true;
    }

    public final void add(MediaSource mediaSource, T t10) {
        MediaSource mediaSourceCreateMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(mediaSourceCreateMediaSourceForPreloading.getMediaItem(), new MediaSourceHolder(this, mediaSourceCreateMediaSourceForPreloading, t10));
    }

    public final boolean remove(MediaSource mediaSource) {
        MediaItem mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }
}
