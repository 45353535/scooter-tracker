package m2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements SensorEventListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f94459c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f94460b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            this.f94460b = bVar;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            b bVar = this.f94460b;
            if (bVar != null) {
                float[] fArr = event.values;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                    bVar.a();
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
