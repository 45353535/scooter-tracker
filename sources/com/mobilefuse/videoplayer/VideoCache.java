package com.mobilefuse.videoplayer;

import android.content.Context;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.crypto.Crypto;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.b;
import uf.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoCache;", "", "()V", "MF_CACHE_DIR_NAME", "", "initialized", "", "cacheFile", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "inputStream", "Ljava/io/InputStream;", "cachedFileExists", C4240b4.i.W, "clearMfCache", "", "deleteCachedFile", "deleteContents", "dir", "Ljava/io/File;", "getCacheDirectory", "getCachedFilePath", MobileAdsBridgeBase.initializeMethodName, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VideoCache {

    @NotNull
    public static final VideoCache INSTANCE = new VideoCache();
    private static final String MF_CACHE_DIR_NAME = "mobilefuse_video";
    private static boolean initialized;

    private VideoCache() {
    }

    private final void clearMfCache(Context context) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VideoCache videoCache = INSTANCE;
            File cacheDirectory = videoCache.getCacheDirectory(context);
            if (cacheDirectory == null) {
                throw new IOException("can't get path to video cache dir");
            }
            videoCache.deleteContents(cacheDirectory);
        } catch (Throwable th2) {
            int i10 = VideoCache$clearMfCache$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    private final void deleteContents(File dir) throws IOException {
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + dir);
        }
        for (File file : fileArrListFiles) {
            Intrinsics.checkNotNullExpressionValue(file, "file");
            if (file.isDirectory()) {
                deleteContents(file);
            }
            if (!file.delete()) {
                throw new IOException("failed to delete file: " + file);
            }
        }
    }

    private final File getCacheDirectory(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, MF_CACHE_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public final String cacheFile(@NotNull Context context, @NotNull InputStream inputStream) {
        Either errorResult;
        String strSha1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object value = null;
        try {
            File cacheDirectory = INSTANCE.getCacheDirectory(context);
            if (cacheDirectory == null) {
                strSha1 = null;
                errorResult = new SuccessResult(strSha1);
            } else {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "UUID.randomUUID().toString()");
                strSha1 = Crypto.sha1(string);
                if (strSha1 == null) {
                    strSha1 = null;
                    errorResult = new SuccessResult(strSha1);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirectory, strSha1));
                        try {
                            b.b(inputStream, fileOutputStream, 0, 2, null);
                            c.a(fileOutputStream, null);
                            c.a(inputStream, null);
                            errorResult = new SuccessResult(strSha1);
                        } finally {
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            if (VideoCache$cacheFile$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (String) value;
    }

    public final boolean cachedFileExists(@NotNull Context context, @NotNull String key) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            File cacheDirectory = INSTANCE.getCacheDirectory(context);
            errorResult = new SuccessResult(Boolean.valueOf(cacheDirectory == null ? false : new File(cacheDirectory, key).exists()));
        } catch (Throwable th2) {
            if (VideoCache$cachedFileExists$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.FALSE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean deleteCachedFile(@NotNull Context context, @NotNull String key) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            File cacheDirectory = INSTANCE.getCacheDirectory(context);
            errorResult = new SuccessResult(Boolean.valueOf(cacheDirectory == null ? false : new File(cacheDirectory, key).delete()));
        } catch (Throwable th2) {
            if (VideoCache$deleteCachedFile$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.FALSE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @Nullable
    public final String getCachedFilePath(@NotNull Context context, @NotNull String key) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object value = null;
        try {
            File cacheDirectory = INSTANCE.getCacheDirectory(context);
            errorResult = new SuccessResult(cacheDirectory == null ? null : new File(cacheDirectory, key).getAbsolutePath());
        } catch (Throwable th2) {
            if (VideoCache$getCachedFilePath$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (String) value;
    }

    public final synchronized void initialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (initialized) {
            return;
        }
        initialized = true;
        clearMfCache(context);
    }
}
