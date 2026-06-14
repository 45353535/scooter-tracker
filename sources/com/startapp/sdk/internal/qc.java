package com.startapp.sdk.internal;

import android.hardware.SensorEvent;
import com.startapp.motiondetector.TravelRecognizer;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class qc extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f65153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelRecognizer f65154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f65155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f65156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f65157e;

    public qc(String str, MotionMetadata motionMetadata, int i10, double d10, long j10) {
        super(str);
        this.f65155c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f65156d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f65157e = new AtomicLong(0L);
        TravelRecognizer travelRecognizer = new TravelRecognizer(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f65154b = travelRecognizer;
        travelRecognizer.setTravelProbabilityMaximum(d10, j10);
        this.f65153a = new LinkedBlockingDeque(i10);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f65153a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f65153a.take();
                if (sensorEvent == null) {
                    return;
                }
                TravelRecognizer travelRecognizer = this.f65154b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                travelRecognizer.add(jCurrentTimeMillis, j10, fArr[0], fArr[1], fArr[2]);
                this.f65155c.set(Double.doubleToRawLongBits(this.f65154b.getTravelProbability()));
                this.f65156d.set(Double.doubleToRawLongBits(this.f65154b.getTravelProbabilityMaximumValue()));
                this.f65157e.set(this.f65154b.getTravelProbabilityMaximumTime());
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th2) {
                g9.a(th2);
                return;
            }
        }
    }
}
