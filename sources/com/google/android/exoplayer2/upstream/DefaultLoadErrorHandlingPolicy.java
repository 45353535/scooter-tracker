package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    private static final int DEFAULT_BEHAVIOR_MIN_LOADABLE_RETRY_COUNT = -1;
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;

    @Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;
    private final int minimumLoadableRetryCount;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    @Nullable
    public LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        if (!isEligibleForFallback(loadErrorInfo.exception)) {
            return null;
        }
        if (fallbackOptions.isFallbackAvailable(1)) {
            return new LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
        }
        if (fallbackOptions.isFallbackAvailable(2)) {
            return new LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.minimumLoadableRetryCount;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        IOException iOException = loadErrorInfo.exception;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource.CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((loadErrorInfo.errorCount - 1) * 1000, 5000);
    }

    protected boolean isEligibleForFallback(IOException iOException) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public /* synthetic */ void onLoadTaskConcluded(long j10) {
        j.a(this, j10);
    }

    public DefaultLoadErrorHandlingPolicy(int i10) {
        this.minimumLoadableRetryCount = i10;
    }
}
