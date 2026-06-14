package na;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import ma.r;
import q9.i0;
import q9.p;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
final class i implements r, a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SurfaceTexture f95734k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f95737n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f95725b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f95726c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f95727d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f95728e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i0 f95729f = new i0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i0 f95730g = new i0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f95731h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f95732i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile int f95735l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f95736m = -1;

    private void f(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f95737n;
        int i11 = this.f95736m;
        this.f95737n = bArr;
        if (i10 == -1) {
            i10 = this.f95735l;
        }
        this.f95736m = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f95737n)) {
            return;
        }
        byte[] bArr3 = this.f95737n;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f95736m) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f95736m);
        }
        this.f95730g.a(j10, eVarA);
    }

    @Override // ma.r
    public void a(long j10, long j11, io.bidmachine.media3.common.a aVar, MediaFormat mediaFormat) {
        this.f95729f.a(j11, Long.valueOf(j10));
        f(aVar.A, aVar.B, j11);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            p.b();
        } catch (p.a e10) {
            u.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f95725b.compareAndSet(true, false)) {
            ((SurfaceTexture) q9.a.e(this.f95734k)).updateTexImage();
            try {
                p.b();
            } catch (p.a e11) {
                u.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f95726c.compareAndSet(true, false)) {
                p.k(this.f95731h);
            }
            long timestamp = this.f95734k.getTimestamp();
            Long l10 = (Long) this.f95729f.g(timestamp);
            if (l10 != null) {
                this.f95728e.c(this.f95731h, l10.longValue());
            }
            e eVar = (e) this.f95730g.j(timestamp);
            if (eVar != null) {
                this.f95727d.d(eVar);
            }
        }
        Matrix.multiplyMM(this.f95732i, 0, fArr, 0, this.f95731h, 0);
        this.f95727d.a(this.f95733j, this.f95732i, z10);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            p.b();
            this.f95727d.b();
            p.b();
            this.f95733j = p.f();
        } catch (p.a e10) {
            u.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f95733j);
        this.f95734k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: na.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f95724b.f95725b.set(true);
            }
        });
        return this.f95734k;
    }

    public void e(int i10) {
        this.f95735l = i10;
    }

    @Override // na.a
    public void onCameraMotion(long j10, float[] fArr) {
        this.f95728e.e(j10, fArr);
    }

    @Override // na.a
    public void onCameraMotionReset() {
        this.f95729f.c();
        this.f95728e.d();
        this.f95726c.set(true);
    }
}
