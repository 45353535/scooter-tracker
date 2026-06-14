package yads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class nk0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f113942h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f113943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f113944c = new int[1];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f113945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f113946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLSurface f113947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f113948g;

    public nk0(Handler handler) {
        this.f113943b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f113948g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b() {
        this.f113943b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f113948g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f113944c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f113945d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f113945d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f113947f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f113945d, this.f113947f);
            }
            EGLContext eGLContext = this.f113946e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f113945d, eGLContext);
            }
            if (w83.f117341a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f113945d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f113945d);
            }
            this.f113945d = null;
            this.f113946e = null;
            this.f113947f = null;
            this.f113948g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f113943b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f113948g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void a(int i10) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.f113945d = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f113942h, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (zEglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = this.f113945d;
                    if (i10 == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eGLContextEglCreateContext != null) {
                        this.f113946e = eGLContextEglCreateContext;
                        EGLDisplay eGLDisplay2 = this.f113945d;
                        if (i10 == 1) {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i10 == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurfaceEglCreatePbufferSurface == null) {
                                throw new mk0("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                            this.f113947f = eGLSurfaceEglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f113944c, 0);
                            dy0.a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f113944c[0]);
                            this.f113948g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new mk0("eglMakeCurrent failed");
                    }
                    throw new mk0("eglCreateContext failed");
                }
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
                int i11 = w83.f117341a;
                throw new mk0(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
            }
            throw new mk0("eglInitialize failed");
        }
        throw new mk0("eglGetDisplay failed");
    }
}
