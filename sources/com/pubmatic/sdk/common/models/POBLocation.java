package com.pubmatic.sdk.common.models;

import android.location.Location;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.pubmatic.sdk.common.log.POBLog;

/* JADX INFO: loaded from: classes11.dex */
public class POBLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f62400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f62401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f62402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f62403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Source f62404e;

    public enum Source {
        GPS(1),
        IP_ADDRESS(2),
        USER(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62406a;

        Source(int i10) {
            this.f62406a = i10;
        }

        public int getValue() {
            return this.f62406a;
        }
    }

    public POBLocation(@NonNull Source source, double d10, double d11) {
        this.f62404e = source;
        this.f62402c = d10;
        this.f62403d = d11;
    }

    public float getAccuracy() {
        return this.f62401b;
    }

    public long getLastFixInMillis() {
        return this.f62400a;
    }

    public double getLatitude() {
        return this.f62402c;
    }

    public double getLongitude() {
        return this.f62403d;
    }

    @Nullable
    public Source getSource() {
        return this.f62404e;
    }

    public POBLocation(@NonNull Location location) {
        if (location != null) {
            this.f62402c = location.getLatitude();
            this.f62403d = location.getLongitude();
            String provider = location.getProvider();
            if (provider != null && (provider.equalsIgnoreCase("network") || provider.equalsIgnoreCase("gps") || provider.equalsIgnoreCase(X3.f42018b))) {
                this.f62404e = Source.GPS;
            } else {
                this.f62404e = Source.USER;
            }
            this.f62401b = location.getAccuracy();
            this.f62400a = (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000;
            return;
        }
        POBLog.debug("POBLocation", "Provided location object is null", new Object[0]);
    }
}
