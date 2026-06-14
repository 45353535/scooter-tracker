package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;

    @Nullable
    private Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.hls.offline.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j10, long j11, long j12) {
        Downloader.ProgressListener progressListener = this.progressListener;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void download(@Nullable Downloader.ProgressListener progressListener) throws InterruptedException, IOException {
        this.progressListener = progressListener;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-1000);
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.isCanceled) {
                    break;
                }
                this.downloadRunnable = new RunnableFutureTask<Void, IOException>() { // from class: com.google.android.exoplayer2.offline.ProgressiveDownloader.1
                    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
                    protected void cancelWork() {
                        ProgressiveDownloader.this.cacheWriter.cancel();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
                    public Void doWork() throws IOException {
                        ProgressiveDownloader.this.cacheWriter.cache();
                        return null;
                    }
                };
                PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-1000);
                }
                this.executor.execute(this.downloadRunnable);
                try {
                    this.downloadRunnable.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) Assertions.checkNotNull(e10.getCause());
                    if (!(th2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        Util.sneakyThrow(th2);
                    }
                }
            } catch (Throwable th3) {
                ((RunnableFutureTask) Assertions.checkNotNull(this.downloadRunnable)).blockUntilFinished();
                PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.remove(-1000);
                }
                throw th3;
            }
        }
        ((RunnableFutureTask) Assertions.checkNotNull(this.downloadRunnable)).blockUntilFinished();
        PriorityTaskManager priorityTaskManager4 = this.priorityTaskManager;
        if (priorityTaskManager4 != null) {
            priorityTaskManager4.remove(-1000);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this.executor = (Executor) Assertions.checkNotNull(executor);
        Assertions.checkNotNull(mediaItem.localConfiguration);
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(mediaItem.localConfiguration.uri).setKey(mediaItem.localConfiguration.customCacheKey).setFlags(4).build();
        this.dataSpec = dataSpecBuild;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = cacheDataSourceCreateDataSourceForDownloading;
        this.cacheWriter = new CacheWriter(cacheDataSourceCreateDataSourceForDownloading, dataSpecBuild, null, new CacheWriter.ProgressListener() { // from class: com.google.android.exoplayer2.offline.p
            @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
            public final void onProgress(long j10, long j11, long j12) {
                this.f25015a.onProgress(j10, j11, j12);
            }
        });
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }
}
