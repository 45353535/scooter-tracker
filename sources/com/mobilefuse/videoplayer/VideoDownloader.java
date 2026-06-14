package com.mobilefuse.videoplayer;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VideoSource;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoDownloader;", "", "()V", "VIDEO_MAX_SIZE", "", Reporting.EventType.CACHE, "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "url", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/videoplayer/VideoDownloader$Listener;", "downloadFile", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/videoplayer/model/VastError;", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "Listener", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VideoDownloader {

    @NotNull
    public static final VideoDownloader INSTANCE = new VideoDownloader();
    private static final int VIDEO_MAX_SIZE = 52428800;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoDownloader$Listener;", "", "onComplete", "", "requestedUrl", "", "videoSource", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "onError", "error", "Lcom/mobilefuse/videoplayer/model/VastError;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public interface Listener {
        void onComplete(@NotNull String requestedUrl, @NotNull VideoSource videoSource);

        void onError(@NotNull VastError error);
    }

    private VideoDownloader() {
    }

    private final Either<VastError, VideoSource> downloadFile(String url) {
        Throwable th2;
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection2.setConnectTimeout(10000);
                httpURLConnection2.setReadTimeout(20000);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    if (httpURLConnection2.getContentLength() > VIDEO_MAX_SIZE) {
                        ErrorResult errorResult = new ErrorResult(VastError.UNIDENTIFIED);
                        httpURLConnection2.disconnect();
                        return errorResult;
                    }
                    String strCacheFile = VideoCache.INSTANCE.cacheFile(AppLifecycleHelper.getGlobalContext(), bufferedInputStream);
                    if (strCacheFile == null) {
                        ErrorResult errorResult2 = new ErrorResult(VastError.UNIDENTIFIED);
                        httpURLConnection2.disconnect();
                        return errorResult2;
                    }
                    SuccessResult successResult = new SuccessResult(new VideoSource(strCacheFile, url, false, 4, null));
                    httpURLConnection2.disconnect();
                    return successResult;
                }
                ErrorResult errorResult3 = responseCode != 404 ? responseCode != 408 ? new ErrorResult(VastError.UNIDENTIFIED) : new ErrorResult(VastError.MEDIAFILE_TIMEOUT) : new ErrorResult(VastError.MEDIAFILE_NOT_FOUND);
                httpURLConnection2.disconnect();
                return errorResult3;
            } catch (Throwable th3) {
                th2 = th3;
                httpURLConnection = httpURLConnection2;
                try {
                    th2.printStackTrace();
                    ErrorResult errorResult4 = new ErrorResult(VastError.MEDIAFILE_TIMEOUT);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return errorResult4;
                } finally {
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public final void cache(@NotNull Context context, @NotNull String url, @NotNull Listener listener) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VideoCache.INSTANCE.initialize(context);
            Either<VastError, VideoSource> eitherDownloadFile = INSTANCE.downloadFile(url);
            if (eitherDownloadFile instanceof SuccessResult) {
                listener.onComplete(url, (VideoSource) ((SuccessResult) eitherDownloadFile).getValue());
            } else if (eitherDownloadFile instanceof ErrorResult) {
                listener.onError((VastError) ((ErrorResult) eitherDownloadFile).getValue());
            }
            errorResult = new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (VideoDownloader$cache$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th3 = (Throwable) ((ErrorResult) errorResult).getValue();
            listener.onError(VastError.UNIDENTIFIED);
            th3.printStackTrace();
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            ((SuccessResult) errorResult).getValue();
        }
    }
}
