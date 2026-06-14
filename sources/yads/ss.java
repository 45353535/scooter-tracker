package yads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class ss extends jo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fa0 f115916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w92 f115917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f115918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public rs f115919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f115920r;

    public ss() {
        super(6);
        this.f115916n = new fa0(1);
        this.f115917o = new w92();
    }

    @Override // yads.jo, yads.yc2
    public final void a(int i10, Object obj) {
        if (i10 == 8) {
            this.f115919q = (rs) obj;
        }
    }

    @Override // yads.jo
    public final String d() {
        return "CameraMotionRenderer";
    }

    @Override // yads.jo
    public final boolean f() {
        return e();
    }

    @Override // yads.jo
    public final boolean g() {
        return true;
    }

    @Override // yads.jo
    public final void h() {
        rs rsVar = this.f115919q;
        if (rsVar != null) {
            rsVar.a();
        }
    }

    @Override // yads.jo
    public final void a(long j10, boolean z10) {
        this.f115920r = Long.MIN_VALUE;
        rs rsVar = this.f115919q;
        if (rsVar != null) {
            rsVar.a();
        }
    }

    @Override // yads.jo
    public final void a(yv0[] yv0VarArr, long j10, long j11) {
        this.f115918p = j11;
    }

    @Override // yads.jo
    public final void a(long j10, long j11) {
        while (!e() && this.f115920r < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + j10) {
            this.f115916n.b();
            zv0 zv0Var = this.f112408c;
            float[] fArr = null;
            zv0Var.f118844a = null;
            zv0Var.f118845b = null;
            if (a(zv0Var, this.f115916n, 0) != -4 || this.f115916n.b(4)) {
                return;
            }
            fa0 fa0Var = this.f115916n;
            this.f115920r = fa0Var.f110672f;
            if (this.f115919q != null && !fa0Var.b(Integer.MIN_VALUE)) {
                this.f115916n.c();
                ByteBuffer byteBuffer = this.f115916n.f110670d;
                int i10 = w83.f117341a;
                if (byteBuffer.remaining() == 16) {
                    w92 w92Var = this.f115917o;
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    w92Var.f117356a = bArrArray;
                    w92Var.f117358c = iLimit;
                    w92Var.f117357b = 0;
                    this.f115917o.e(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr[i11] = Float.intBitsToFloat(this.f115917o.d());
                    }
                }
                if (fArr != null) {
                    this.f115919q.a(this.f115920r - this.f115918p, fArr);
                }
            }
        }
    }

    @Override // yads.jo
    public final int a(yv0 yv0Var) {
        if ("application/x-camera-motion".equals(yv0Var.f118398m)) {
            return jo.a(4, 0, 0);
        }
        return jo.a(0, 0, 0);
    }
}
