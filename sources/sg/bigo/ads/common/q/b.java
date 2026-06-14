package sg.bigo.ads.common.q;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f102685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f102686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SensorManager f102687c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final List<Integer> f102690f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f102688d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float[] f102689e = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f102692h = 1.0E-9f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SensorEventListener f102691g = new SensorEventListener() { // from class: sg.bigo.ads.common.q.b.1
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensorEvent.values.length < 3) {
                return;
            }
            int type = sensor.getType();
            if (type != 4) {
                if (type == 9 || type == 1) {
                    b.this.f102686b.a(type, sensorEvent.values, new float[3]);
                    return;
                }
                return;
            }
            float[] fArr = new float[3];
            b bVar = b.this;
            if (bVar.f102688d != 0) {
                float f10 = (sensorEvent.timestamp - r4) * 1.0E-9f;
                float[] fArr2 = bVar.f102689e;
                float f11 = fArr2[0];
                float[] fArr3 = sensorEvent.values;
                float f12 = f11 + (fArr3[0] * f10);
                fArr2[0] = f12;
                fArr2[1] = fArr2[1] + (fArr3[1] * f10);
                fArr2[2] = fArr2[2] + (fArr3[2] * f10);
                float fAbs = Math.abs((float) Math.toDegrees(f12));
                float fAbs2 = Math.abs((float) Math.toDegrees(b.this.f102689e[1]));
                float fAbs3 = Math.abs((float) Math.toDegrees(b.this.f102689e[2]));
                fArr[0] = fAbs;
                fArr[1] = fAbs2;
                fArr[2] = fAbs3;
            }
            b bVar2 = b.this;
            bVar2.f102688d = sensorEvent.timestamp;
            bVar2.f102686b.a(type, sensorEvent.values, fArr);
        }
    };

    public b(@NonNull Context context, @NonNull List<Integer> list, @NonNull a aVar) {
        this.f102685a = new WeakReference<>(context);
        this.f102690f = list;
        this.f102686b = aVar;
    }
}
