package com.vungle.ads.internal.downloader;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import hh.b0;
import hh.c;
import hh.c0;
import hh.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.i;
import nh.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vh.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u000256B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b$\u0010\u0012J\u0019\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "downloadExecutor", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "<init>", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "downloadRequest", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "downloadError", "", "deliverError", "(Lcom/vungle/ads/internal/downloader/DownloadRequest;Lcom/vungle/ads/internal/downloader/AssetDownloadListener;Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;)V", "launchRequest", "(Lcom/vungle/ads/internal/downloader/DownloadRequest;Lcom/vungle/ads/internal/downloader/AssetDownloadListener;)V", "Lhh/b0;", "networkResponse", "Lhh/c0;", "decodeGzipIfNeeded", "(Lhh/b0;)Lhh/c0;", "Ljava/io/File;", C4240b4.i.f42616b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "deliverSuccess", "(Ljava/io/File;Lcom/vungle/ads/internal/downloader/DownloadRequest;Lcom/vungle/ads/internal/downloader/AssetDownloadListener;)V", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "progress", "onProgressChanged", "(Lcom/vungle/ads/internal/downloader/DownloadRequest;Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;Lcom/vungle/ads/internal/downloader/AssetDownloadListener;)V", "", "checkSpaceAvailable", "(Lcom/vungle/ads/internal/downloader/DownloadRequest;)Z", NativeAdPresenter.DOWNLOAD, "request", MenuActionType.CANCEL, "(Lcom/vungle/ads/internal/downloader/DownloadRequest;)V", "cancelAll", "()V", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "Lcom/vungle/ads/internal/util/PathProvider;", "Lhh/x;", "okHttpClient$delegate", "Lkotlin/Lazy;", "getOkHttpClient", "()Lhh/x;", "okHttpClient", "", "transitioning", "Ljava/util/List;", y.f66058y, "OkHttpSingleton", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AssetDownloader implements Downloader {

    @NotNull
    private static final String CONTENT_ENCODING = "Content-Encoding";

    @NotNull
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;

    @NotNull
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;

    @NotNull
    private static final String TAG = "AssetDownloader";

    @NotNull
    private final VungleThreadPoolExecutor downloadExecutor;

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy okHttpClient;

    @NotNull
    private final PathProvider pathProvider;

    @NotNull
    private final List<DownloadRequest> transitioning;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "<init>", "()V", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lhh/x;", "createOkHttpClient", "(Lcom/vungle/ads/internal/util/PathProvider;)Lhh/x;", "client", "Lhh/x;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class OkHttpSingleton {

        @NotNull
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();

        @Nullable
        private static x client;

        private OkHttpSingleton() {
        }

        @NotNull
        public final x createOkHttpClient(@NotNull PathProvider pathProvider) {
            Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
            x xVar = client;
            if (xVar != null) {
                return xVar;
            }
            x.a aVar = new x.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            x.a aVarH = aVar.O(60L, timeUnit).e(60L, timeUnit).d(null).g(true).h(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            if (configManager.isCleverCacheEnabled()) {
                long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
                int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
                String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
                long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
                if (jMin > 0) {
                    aVarH.d(new c(pathProvider.getCleverCacheDir(), jMin));
                } else {
                    Logger.INSTANCE.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
                }
            }
            x xVarC = aVarH.c();
            client = xVarC;
            return xVarC;
        }
    }

    public AssetDownloader(@NotNull VungleThreadPoolExecutor downloadExecutor, @NotNull PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = i.a(new Function0<x>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final x invoke() {
                return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final c0 decodeGzipIfNeeded(b0 networkResponse) {
        c0 c0VarM = networkResponse.m();
        if (!StringsKt.N(GZIP, b0.M(networkResponse, "Content-Encoding", null, 2, null), true) || c0VarM == null) {
            return c0VarM;
        }
        return new h(b0.M(networkResponse, "Content-Type", null, 2, null), -1L, vh.x.d(new r(c0VarM.getDelegateSource())));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener downloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (downloadListener != null) {
            downloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener listener) {
        Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (listener != null) {
            listener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m7522download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final x getOkHttpClient() {
        return (x) this.okHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0257, code lost:
    
        r7.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04c7 A[Catch: all -> 0x04ff, TRY_LEAVE, TryCatch #19 {all -> 0x04ff, blocks: (B:209:0x04ba, B:211:0x04c7), top: B:274:0x04ba }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173 A[Catch: all -> 0x0462, Exception -> 0x0469, TRY_LEAVE, TryCatch #0 {all -> 0x0462, blocks: (B:38:0x0169, B:39:0x016d, B:41:0x0173), top: B:263:0x0169 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.DownloadRequest r31, com.vungle.ads.internal.downloader.AssetDownloadListener r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.AssetDownloader.launchRequest(com.vungle.ads.internal.downloader.DownloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener):void");
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onProgress(progress, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(@Nullable DownloadRequest request) {
        if (request == null || request.isCancelled()) {
            return;
        }
        request.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(@Nullable final DownloadRequest downloadRequest, @Nullable final AssetDownloadListener downloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequest(downloadRequest, downloadListener);
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.a
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m7522download$lambda0(downloadRequest, this, downloadListener);
            }
        });
    }
}
