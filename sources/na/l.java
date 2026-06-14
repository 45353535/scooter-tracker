package na;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ma.r;
import na.d;
import na.m;
import q9.p;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f95741n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f95742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SensorManager f95743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f95744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f95745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f95746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f95747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f95748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SurfaceTexture f95749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Surface f95750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f95751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f95752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f95753m;

    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f95754b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f95757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f95758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float[] f95759g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f95760h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f95761i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f95755c = new float[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f95756d = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f95762j = new float[16];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float[] f95763k = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f95757e = fArr;
            float[] fArr2 = new float[16];
            this.f95758f = fArr2;
            float[] fArr3 = new float[16];
            this.f95759g = fArr3;
            this.f95754b = iVar;
            p.k(fArr);
            p.k(fArr2);
            p.k(fArr3);
            this.f95761i = 3.1415927f;
        }

        private float a(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        private void b() {
            Matrix.setRotateM(this.f95758f, 0, -this.f95760h, (float) Math.cos(this.f95761i), (float) Math.sin(this.f95761i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f95763k, 0, this.f95757e, 0, this.f95759g, 0);
                Matrix.multiplyMM(this.f95762j, 0, this.f95758f, 0, this.f95763k, 0);
            }
            Matrix.multiplyMM(this.f95756d, 0, this.f95755c, 0, this.f95762j, 0);
            this.f95754b.c(this.f95756d, false);
        }

        @Override // na.d.a
        public synchronized void onOrientationChange(float[] fArr, float f10) {
            float[] fArr2 = this.f95757e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f95761i = -f10;
            b();
        }

        @Override // na.m.a
        public synchronized void onScrollChange(PointF pointF) {
            this.f95760h = pointF.y;
            b();
            Matrix.setRotateM(this.f95759g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // na.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f95755c, 0, a(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.f95754b.d());
        }
    }

    public interface b {
        void onVideoSurfaceCreated(Surface surface);

        void onVideoSurfaceDestroyed(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar) {
        Surface surface = lVar.f95750j;
        if (surface != null) {
            Iterator it = lVar.f95742b.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onVideoSurfaceDestroyed(surface);
            }
        }
        f(lVar.f95749i, surface);
        lVar.f95749i = null;
        lVar.f95750j = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.f95749i;
        Surface surface = lVar.f95750j;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.f95749i = surfaceTexture;
        lVar.f95750j = surface2;
        Iterator it = lVar.f95742b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onVideoSurfaceCreated(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f95746f.post(new Runnable() { // from class: na.k
            @Override // java.lang.Runnable
            public final void run() {
                l.b(this.f95739b, surfaceTexture);
            }
        });
    }

    private static void f(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void h() {
        boolean z10 = this.f95751k && this.f95752l;
        Sensor sensor = this.f95744d;
        if (sensor == null || z10 == this.f95753m) {
            return;
        }
        if (z10) {
            this.f95743c.registerListener(this.f95745e, sensor, 0);
        } else {
            this.f95743c.unregisterListener(this.f95745e);
        }
        this.f95753m = z10;
    }

    public void d(b bVar) {
        this.f95742b.add(bVar);
    }

    public void g(b bVar) {
        this.f95742b.remove(bVar);
    }

    public na.a getCameraMotionListener() {
        return this.f95748h;
    }

    public r getVideoFrameMetadataListener() {
        return this.f95748h;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f95750j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f95746f.post(new Runnable() { // from class: na.j
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f95738b);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f95752l = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f95752l = true;
        h();
    }

    public void setDefaultStereoMode(int i10) {
        this.f95748h.e(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f95751k = z10;
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95742b = new CopyOnWriteArrayList();
        this.f95746f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) q9.a.e(context.getSystemService("sensor"));
        this.f95743c = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f95744d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f95748h = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f95747g = mVar;
        this.f95745e = new d(((WindowManager) q9.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f95751k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
