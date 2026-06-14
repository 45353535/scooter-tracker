package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes7.dex */
public final class FrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public FrameProcessingException(String str) {
        this(str, -9223372036854775807L);
    }

    public static FrameProcessingException from(Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public FrameProcessingException(String str, long j10) {
        super(str);
        this.presentationTimeUs = j10;
    }

    public static FrameProcessingException from(Exception exc, long j10) {
        return exc instanceof FrameProcessingException ? (FrameProcessingException) exc : new FrameProcessingException(exc, j10);
    }

    public FrameProcessingException(String str, Throwable th2) {
        this(str, th2, -9223372036854775807L);
    }

    public FrameProcessingException(String str, Throwable th2, long j10) {
        super(str, th2);
        this.presentationTimeUs = j10;
    }

    public FrameProcessingException(Throwable th2) {
        this(th2, -9223372036854775807L);
    }

    public FrameProcessingException(Throwable th2, long j10) {
        super(th2);
        this.presentationTimeUs = j10;
    }
}
