package q9;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import q9.p;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f98816h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f98817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f98818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLDisplay f98819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLContext f98820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLSurface f98821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceTexture f98822g;

    public interface a {
    }

    public n(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws p.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f98816h, 0, eGLConfigArr, 0, 1, iArr, 0);
        p.c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, o0.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws p.a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        p.c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface d(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws p.a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            p.c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        p.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private static void f(int[] iArr) throws p.a {
        GLES20.glGenTextures(1, iArr, 0);
        p.b();
    }

    private static EGLDisplay g() throws p.a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        p.c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        p.c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture h() {
        return (SurfaceTexture) q9.a.e(this.f98822g);
    }

    public void i(int i10) throws p.a {
        EGLDisplay eGLDisplayG = g();
        this.f98819d = eGLDisplayG;
        EGLConfig eGLConfigA = a(eGLDisplayG);
        EGLContext eGLContextB = b(this.f98819d, eGLConfigA, i10);
        this.f98820e = eGLContextB;
        this.f98821f = d(this.f98819d, eGLConfigA, eGLContextB, i10);
        f(this.f98818c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f98818c[0]);
        this.f98822g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void j() {
        this.f98817b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f98822g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f98818c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f98819d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f98819d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f98821f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f98819d, this.f98821f);
            }
            EGLContext eGLContext = this.f98820e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f98819d, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f98819d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f98819d);
            }
            this.f98819d = null;
            this.f98820e = null;
            this.f98821f = null;
            this.f98822g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f98817b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        e();
        SurfaceTexture surfaceTexture = this.f98822g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public n(Handler handler, a aVar) {
        this.f98817b = handler;
        this.f98818c = new int[1];
    }

    private void e() {
    }
}
