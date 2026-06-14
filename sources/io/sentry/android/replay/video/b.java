package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f83203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaMuxer f83204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f83205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f83208f;

    public b(String path, float f10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f83203a = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.f83204b = new MediaMuxer(path, 0);
    }

    public long a() {
        if (this.f83207e == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.f83208f + this.f83203a, TimeUnit.MICROSECONDS);
    }

    public boolean b() {
        return this.f83205c;
    }

    public void c(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        long j10 = this.f83203a;
        int i10 = this.f83207e;
        this.f83207e = i10 + 1;
        long j11 = j10 * ((long) i10);
        this.f83208f = j11;
        bufferInfo.presentationTimeUs = j11;
        this.f83204b.writeSampleData(this.f83206d, encodedData, bufferInfo);
    }

    public void d() {
        this.f83204b.stop();
        this.f83204b.release();
    }

    public void e(MediaFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.f83206d = this.f83204b.addTrack(videoFormat);
        this.f83204b.start();
        this.f83205c = true;
    }
}
