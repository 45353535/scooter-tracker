package com.mbridge.msdk.config.component.sen;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.constraintlayout.motion.widget.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.sen.a> f47231b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SensorEventListener f47232c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f47230a = (SensorManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("sensor");

    class a implements SensorEventListener {
        a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            String lowerCase = sensorEvent.sensor.getName().toLowerCase();
            float[] fArr = sensorEvent.values;
            HashMap map = new HashMap();
            map.put("type", "accelerometer");
            map.put("x", String.valueOf(fArr[0]));
            map.put("y", String.valueOf(fArr[1]));
            map.put("z", String.valueOf(fArr[2]));
            float[] fArr2 = new float[3];
            float[] fArr3 = new float[3];
            float[] fArr4 = new float[3];
            float[] fArr5 = new float[9];
            float[] fArr6 = new float[9];
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr7 = sensorEvent.values;
                System.arraycopy(fArr7, 0, fArr2, 0, fArr7.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr8 = sensorEvent.values;
                System.arraycopy(fArr8, 0, fArr3, 0, fArr8.length);
            }
            if (lowerCase.contains("accelerometer")) {
                if (SensorManager.getRotationMatrix(fArr5, fArr6, fArr2, fArr3)) {
                    SensorManager.getOrientation(fArr5, fArr4);
                    Math.toDegrees(fArr4[0]);
                    float degrees = (float) Math.toDegrees(fArr4[1]);
                    float degrees2 = (float) Math.toDegrees(fArr4[2]);
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    float f12 = fArr[2];
                    double dSqrt = Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
                    map.put("tileX", String.valueOf(degrees));
                    map.put("tileY", String.valueOf(degrees2));
                    map.put("magnitude", String.valueOf(dSqrt));
                }
                map.put("type", "accelerometer");
                b.this.a((HashMap<String, Object>) map);
                return;
            }
            if (lowerCase.contains("magnetic")) {
                map.put("type", "magnetic");
                b.this.a((HashMap<String, Object>) map);
            } else if (lowerCase.contains("gyroscope")) {
                map.put("type", "gyroscope");
                b.this.a((HashMap<String, Object>) map);
            } else if (lowerCase.contains(Key.ROTATION)) {
                float f13 = fArr[3];
                map.put("type", Key.ROTATION);
                map.put("cos", String.valueOf(f13));
                b.this.a((HashMap<String, Object>) map);
            }
        }
    }

    public void b(com.mbridge.msdk.config.component.sen.a aVar) {
        if (aVar != null) {
            this.f47231b.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.sen.a aVar) {
        if (this.f47231b.contains(aVar)) {
            return;
        }
        this.f47231b.add(aVar);
    }

    public void a() {
        SensorManager sensorManager = this.f47230a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f47232c);
        }
        this.f47231b.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> map) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("917002");
        bVar.a(map);
        Iterator<com.mbridge.msdk.config.component.sen.a> it = this.f47231b.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("917002");
        HashMap map = new HashMap();
        map.put("type", str);
        map.put("code", a(str));
        map.put("reason", str2);
        bVar.a(map);
        Iterator<com.mbridge.msdk.config.component.sen.a> it = this.f47231b.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private String a(String str) {
        if (str.contains("accelerometer")) {
            return "200001";
        }
        if (str.contains("magnetic")) {
            return "200002";
        }
        if (str.contains("gyroscope")) {
            return "200003";
        }
        if (str.contains(Key.ROTATION)) {
            return "200004";
        }
        return "";
    }

    public void a(int i10, String str, int i11) {
        try {
            Sensor defaultSensor = this.f47230a.getDefaultSensor(i10);
            if (defaultSensor != null) {
                this.f47230a.registerListener(this.f47232c, defaultSensor, i11);
                return;
            }
            a(str, str + " is not available");
        } catch (Exception e10) {
            a(str, e10.getMessage());
        }
    }
}
