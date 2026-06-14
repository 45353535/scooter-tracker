package u9;

import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f105284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f105285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f105286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f105287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f105288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f105289l;

    private void b(long j10, int i10) {
        this.f105288k += j10;
        this.f105289l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return o0.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f105278a), Integer.valueOf(this.f105279b), Integer.valueOf(this.f105280c), Integer.valueOf(this.f105281d), Integer.valueOf(this.f105282e), Integer.valueOf(this.f105283f), Integer.valueOf(this.f105284g), Integer.valueOf(this.f105285h), Integer.valueOf(this.f105286i), Integer.valueOf(this.f105287j), Long.valueOf(this.f105288k), Integer.valueOf(this.f105289l));
    }
}
