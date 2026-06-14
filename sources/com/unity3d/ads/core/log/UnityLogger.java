package com.unity3d.ads.core.log;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/log/UnityLogger;", "Lcom/unity3d/ads/core/log/Logger;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/CreateFile;)V", "isForced", "", "value", "Lcom/unity3d/ads/core/log/LogLevel;", "logLevel", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevel;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevel;)V", "canLog", "targetLogLevel", "", "debug", "", "fb", "Lkotlin/Function0;", "", PglCryptUtils.KEY_MESSAGE, "error", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "info", "trace", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityLogger implements Logger {

    @NotNull
    private static final String LOG_TAG = "UnityAds";
    private final boolean isForced;

    @NotNull
    private LogLevel logLevel;

    public UnityLogger(@NotNull SessionRepository sessionRepository, @NotNull CreateFile createFile) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        this.logLevel = LogLevel.INFO;
        File fileInvoke = createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode");
        try {
            try {
                boolean enableTracing = sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing();
                if (fileInvoke.exists() || enableTracing) {
                    setLogLevel(LogLevel.TRACE);
                    debug("Unity logger initialized in TRACE mode");
                }
            } finally {
                this.isForced = getLogLevel() == LogLevel.TRACE;
            }
        } catch (Throwable unused) {
            Log.w("UnityAds", "An issue occurred while initializing the logger");
            this.isForced = getLogLevel() == LogLevel.TRACE;
        }
    }

    private final boolean canLog(int targetLogLevel) {
        return targetLogLevel >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(3)) {
            Log.d("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(@NotNull String message, @Nullable Throwable e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(6)) {
            Log.e("UnityAds", message, e10);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    @NotNull
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(4)) {
            Log.i("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(@NotNull LogLevel value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.isForced) {
            return;
        }
        this.logLevel = value;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull String message, @Nullable Throwable e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(2)) {
            Log.v("UnityAds", message, e10);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull Function0<String> fb2) {
        Intrinsics.checkNotNullParameter(fb2, "fb");
        if (canLog(3)) {
            debug(fb2.invoke());
        }
    }
}
