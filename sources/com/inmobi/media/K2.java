package com.inmobi.media;

import android.content.Context;
import android.os.storage.StorageManager;
import androidx.media3.common.MediaItem;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import com.inmobi.media.K2;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4240b4;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class K2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy f37184h = lf.i.b(lf.l.f94209b, new Function0() { // from class: w3.i2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return K2.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37185a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f37186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.VideoCacheConfig f37187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LeastRecentlyUsedCacheEvictor f37188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StandaloneDatabaseProvider f37189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f37190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile SimpleCache f37191g;

    public K2() {
        Context context = Ji.f37157a;
        Intrinsics.checkNotNull(context);
        this.f37186b = context;
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.f37187c = ((AdConfig) Y3.f38021a.a(AdConfig.class)).getHybridNative().getVideoCache();
        this.f37189e = new StandaloneDatabaseProvider(context);
        this.f37190f = new AtomicInteger(0);
        this.f37188d = new LeastRecentlyUsedCacheEvictor(a(context));
    }

    public static final K2 b() {
        return new K2();
    }

    public final long a(Context context) {
        long j10 = 1024;
        long maxSize = this.f37187c.getMaxSize() * j10 * j10;
        C4148x5.f39893a.getClass();
        if (C4148x5.y()) {
            try {
                Object systemService = context.getSystemService(C4240b4.a.f42506k);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                StorageManager storageManager = (StorageManager) systemService;
                UUID uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                Intrinsics.checkNotNullExpressionValue(uuidForPath, "getUuidForPath(...)");
                return Math.min(maxSize, storageManager.getCacheQuotaBytes(uuidForPath));
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        return maxSize;
    }

    public final SimpleCache a() throws IOException {
        File file = new File(this.f37186b.getCacheDir(), "im_exoplayer_video_cache");
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Could not create cache directory: " + file);
        }
        return new SimpleCache(file, this.f37188d, this.f37189e);
    }

    public final MediaSource a(String url, boolean z10) {
        DataSource.Factory factory;
        SimpleCache simpleCacheA;
        Intrinsics.checkNotNullParameter(url, "url");
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(url).setCustomCacheKey(url).build();
        Intrinsics.checkNotNullExpressionValue(mediaItemBuild, "build(...)");
        if (this.f37187c.getIsEnabled() && z10) {
            DefaultDataSource.Factory factory2 = new DefaultDataSource.Factory(this.f37186b);
            synchronized (this.f37185a) {
                simpleCacheA = this.f37191g;
                if (simpleCacheA == null) {
                    simpleCacheA = a();
                    this.f37191g = simpleCacheA;
                }
            }
            factory = new CacheDataSource.Factory().setCache(simpleCacheA).setUpstreamDataSourceFactory(factory2).setCacheWriteDataSinkFactory(new CacheDataSink.Factory().setCache(simpleCacheA)).setCacheReadDataSourceFactory(new FileDataSource.Factory()).setFlags(2);
            Intrinsics.checkNotNullExpressionValue(factory, "setFlags(...)");
        } else {
            factory = new DefaultDataSource.Factory(this.f37186b);
        }
        MediaSource mediaSourceCreateMediaSource = new DefaultMediaSourceFactory(factory).createMediaSource(mediaItemBuild);
        Intrinsics.checkNotNullExpressionValue(mediaSourceCreateMediaSource, "createMediaSource(...)");
        return mediaSourceCreateMediaSource;
    }

    public final int a(String url) {
        SimpleCache simpleCache;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            synchronized (this.f37185a) {
                simpleCache = this.f37191g;
            }
            if (simpleCache == null) {
                return 0;
            }
            ContentMetadata contentMetadata = simpleCache.getContentMetadata(url);
            Intrinsics.checkNotNullExpressionValue(contentMetadata, "getContentMetadata(...)");
            long jA = androidx.media3.datasource.cache.c.a(contentMetadata);
            if (jA <= 0) {
                return 0;
            }
            return (int) ((simpleCache.getCachedLength(url, 0L, jA) * ((long) 100)) / jA);
        } catch (Exception e10) {
            e10.getMessage();
            return 0;
        }
    }
}
