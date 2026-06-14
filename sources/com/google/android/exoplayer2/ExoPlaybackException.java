package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;

    @Nullable
    public final MediaPeriodId mediaPeriodId;

    @Nullable
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @Nullable
    public final String rendererName;
    public final int type;
    public static final Bundleable.Creator<ExoPlaybackException> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.d
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ExoPlaybackException.a(bundle);
        }
    };
    private static final String FIELD_TYPE = Util.intToStringMaxRadix(1001);
    private static final String FIELD_RENDERER_NAME = Util.intToStringMaxRadix(1002);
    private static final String FIELD_RENDERER_INDEX = Util.intToStringMaxRadix(1003);
    private static final String FIELD_RENDERER_FORMAT = Util.intToStringMaxRadix(1004);
    private static final String FIELD_RENDERER_FORMAT_SUPPORT = Util.intToStringMaxRadix(1005);
    private static final String FIELD_IS_RECOVERABLE = Util.intToStringMaxRadix(1006);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static /* synthetic */ ExoPlaybackException a(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th2, String str, int i10, @Nullable Format format, int i11, boolean z10, int i12) {
        if (format == null) {
            i11 = 4;
        }
        return new ExoPlaybackException(1, th2, null, i12, str, i10, format, i11, z10);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i10, @Nullable String str, @Nullable String str2, int i11, @Nullable Format format, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + format + ", format_supported=" + Util.getFormatSupportString(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @CheckResult
    ExoPlaybackException copyWithMediaPeriodId(@Nullable MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(@Nullable PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) Util.castNonNull(playbackException);
        return this.type == exoPlaybackException.type && Util.areEqual(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Util.areEqual(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Util.areEqual(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public Exception getRendererException() {
        Assertions.checkState(this.type == 1);
        return (Exception) Assertions.checkNotNull(getCause());
    }

    public IOException getSourceException() {
        Assertions.checkState(this.type == 0);
        return (IOException) Assertions.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        Assertions.checkState(this.type == 2);
        return (RuntimeException) Assertions.checkNotNull(getCause());
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putString(FIELD_RENDERER_NAME, this.rendererName);
        bundle.putInt(FIELD_RENDERER_INDEX, this.rendererIndex);
        Format format = this.rendererFormat;
        if (format != null) {
            bundle.putBundle(FIELD_RENDERER_FORMAT, format.toBundle());
        }
        bundle.putInt(FIELD_RENDERER_FORMAT_SUPPORT, this.rendererFormatSupport);
        bundle.putBoolean(FIELD_IS_RECOVERABLE, this.isRecoverable);
        return bundle;
    }

    private ExoPlaybackException(int i10, @Nullable Throwable th2, @Nullable String str, int i11, @Nullable String str2, int i12, @Nullable Format format, int i13, boolean z10) {
        this(deriveMessage(i10, str, str2, i12, format, i13), th2, i11, i10, str2, i12, format, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(FIELD_TYPE, 2);
        this.rendererName = bundle.getString(FIELD_RENDERER_NAME);
        this.rendererIndex = bundle.getInt(FIELD_RENDERER_INDEX, -1);
        Bundle bundle2 = bundle.getBundle(FIELD_RENDERER_FORMAT);
        this.rendererFormat = bundle2 == null ? null : (Format) Format.CREATOR.fromBundle(bundle2);
        this.rendererFormatSupport = bundle.getInt(FIELD_RENDERER_FORMAT_SUPPORT, 4);
        this.isRecoverable = bundle.getBoolean(FIELD_IS_RECOVERABLE, false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(String str, @Nullable Throwable th2, int i10, int i11, @Nullable String str2, int i12, @Nullable Format format, int i13, @Nullable MediaPeriodId mediaPeriodId, long j10, boolean z10) {
        super(str, th2, i10, j10);
        Assertions.checkArgument(!z10 || i11 == 1);
        Assertions.checkArgument(th2 != null || i11 == 3);
        this.type = i11;
        this.rendererName = str2;
        this.rendererIndex = i12;
        this.rendererFormat = format;
        this.rendererFormatSupport = i13;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z10;
    }
}
