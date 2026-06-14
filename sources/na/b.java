package na;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;
import q9.d0;
import q9.o0;
import u9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends io.bidmachine.media3.exoplayer.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final t9.f f95682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d0 f95683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f95684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f95685v;

    public b() {
        super(6);
        this.f95682s = new t9.f(1);
        this.f95683t = new d0();
    }

    private float[] H(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f95683t.U(byteBuffer.array(), byteBuffer.limit());
        this.f95683t.W(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f95683t.u());
        }
        return fArr;
    }

    private void I() {
        a aVar = this.f95684u;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.j2
    public int a(io.bidmachine.media3.common.a aVar) {
        return "application/x-camera-motion".equals(aVar.f80561o) ? j0.a(4) : j0.a(0);
    }

    @Override // io.bidmachine.media3.exoplayer.i2, io.bidmachine.media3.exoplayer.j2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.g2.b
    public void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f95684u = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isReady() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void render(long j10, long j11) {
        while (!hasReadStreamToEnd() && this.f95685v < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + j10) {
            this.f95682s.c();
            if (E(l(), this.f95682s, 0) != -4 || this.f95682s.f()) {
                return;
            }
            long j12 = this.f95682s.f104990g;
            this.f95685v = j12;
            boolean z10 = j12 < n();
            if (this.f95684u != null && !z10) {
                this.f95682s.n();
                float[] fArrH = H((ByteBuffer) o0.i(this.f95682s.f104988e));
                if (fArrH != null) {
                    ((a) o0.i(this.f95684u)).onCameraMotion(this.f95685v - q(), fArrH);
                }
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void t() {
        I();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void w(long j10, boolean z10) {
        this.f95685v = Long.MIN_VALUE;
        I();
    }
}
