package na;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes12.dex */
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f95690b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f95691c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f95692d = new float[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f95693e = new float[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Display f95694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a[] f95695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f95696h;

    public interface a {
        void onOrientationChange(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f95694f = display;
        this.f95695g = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, this.f95691c);
        SensorManager.getOrientation(this.f95691c, this.f95693e);
        return this.f95693e[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f95695g) {
            aVar.onOrientationChange(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f95696h) {
            c.a(this.f95692d, fArr);
            this.f95696h = true;
        }
        float[] fArr2 = this.f95691c;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f95691c, 0, this.f95692d, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f95691c;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f95691c, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f95690b, sensorEvent.values);
        d(this.f95690b, this.f95694f.getRotation());
        float fA = a(this.f95690b);
        e(this.f95690b);
        c(this.f95690b);
        b(this.f95690b, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
