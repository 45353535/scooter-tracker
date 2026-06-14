package f1;

import android.content.Context;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.DefaultDatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.PlatformScheduler;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.util.Util;
import f1.vb;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class td {
    public static final LoadControl a(int i10, int i11) {
        DefaultLoadControl defaultLoadControlBuild = new DefaultLoadControl.Builder().setBufferDurationsMs(i10, i11, i10, i10).build();
        Intrinsics.checkNotNullExpressionValue(defaultLoadControlBuild, "build(...)");
        return defaultLoadControlBuild;
    }

    public static /* synthetic */ LoadControl b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 500;
        }
        if ((i12 & 2) != 0) {
            i11 = 50000;
        }
        return a(i10, i11);
    }

    public static final DatabaseProvider c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DefaultDatabaseProvider(new k9(context, null, null, 0, 14, null));
    }

    public static final DownloadManager d(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory httpDataSourceFactory, DownloadManager.Listener listener, int i10, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(listener, "listener");
        DownloadManager downloadManager = new DownloadManager(context, databaseProvider, cache, httpDataSourceFactory, Executors.newFixedThreadPool(i10));
        downloadManager.setMaxParallelDownloads(i11);
        downloadManager.addListener(listener);
        return downloadManager;
    }

    public static /* synthetic */ DownloadManager e(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory factory, DownloadManager.Listener listener, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i10 = 2;
        }
        int i13 = i10;
        if ((i12 & 64) != 0) {
            i11 = 1;
        }
        return d(context, databaseProvider, cache, factory, listener, i13, i11);
    }

    public static final Scheduler f(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Util.SDK_INT >= 21) {
            return new PlatformScheduler(context, i10);
        }
        return null;
    }

    public static /* synthetic */ Scheduler g(Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return f(context, i10);
    }

    public static final MediaSource.Factory h(DataSource.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<this>");
        return new DefaultMediaSourceFactory(factory);
    }

    public static final Cache i(g7 fileCaching, DatabaseProvider databaseProvider, qb cachePolicy, vb.b evictorCallback, CacheEvictor evictor) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cachePolicy, "cachePolicy");
        Intrinsics.checkNotNullParameter(evictorCallback, "evictorCallback");
        Intrinsics.checkNotNullParameter(evictor, "evictor");
        return new SimpleCache(fileCaching.b(), evictor, databaseProvider);
    }

    public static /* synthetic */ Cache j(g7 g7Var, DatabaseProvider databaseProvider, qb qbVar, vb.b bVar, CacheEvictor cacheEvictor, int i10, Object obj) {
        vb.b bVar2;
        if ((i10 & 16) != 0) {
            bVar2 = bVar;
            cacheEvictor = new vb(qbVar.e(), bVar2, null, 4, null);
        } else {
            bVar2 = bVar;
        }
        return i(g7Var, databaseProvider, qbVar, bVar2, cacheEvictor);
    }

    public static final CacheDataSource.Factory k(Cache cache, HttpDataSource.Factory httpDataSourceFactory) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        CacheDataSource.Factory cacheWriteDataSinkFactory = new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(httpDataSourceFactory).setCacheWriteDataSinkFactory(null);
        Intrinsics.checkNotNullExpressionValue(cacheWriteDataSinkFactory, "setCacheWriteDataSinkFactory(...)");
        return cacheWriteDataSinkFactory;
    }

    public static final void l() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
    }

    public static final File m(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheDir = new d0(context.getCacheDir()).f69561h;
        Intrinsics.checkNotNullExpressionValue(precacheDir, "precacheDir");
        return precacheDir;
    }

    public static final File n(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheQueueDir = new d0(context.getCacheDir()).f69562i;
        Intrinsics.checkNotNullExpressionValue(precacheQueueDir, "precacheQueueDir");
        return precacheQueueDir;
    }
}
