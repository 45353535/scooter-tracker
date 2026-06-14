package com.google.maps.android.ui;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class AnimationUtil {

    interface LatLngInterpolator {

        public static class Linear implements LatLngInterpolator {
            @Override // com.google.maps.android.ui.AnimationUtil.LatLngInterpolator
            public LatLng interpolate(float f10, LatLng latLng, LatLng latLng2) {
                double d10 = latLng2.latitude;
                double d11 = latLng.latitude;
                double d12 = f10;
                double d13 = ((d10 - d11) * d12) + d11;
                double dSignum = latLng2.longitude - latLng.longitude;
                if (Math.abs(dSignum) > 180.0d) {
                    dSignum -= Math.signum(dSignum) * 360.0d;
                }
                return new LatLng(d13, (dSignum * d12) + latLng.longitude);
            }
        }

        LatLng interpolate(float f10, LatLng latLng, LatLng latLng2);
    }

    public static void animateMarkerTo(final Marker marker, final LatLng latLng) {
        final LatLngInterpolator.Linear linear = new LatLngInterpolator.Linear();
        final LatLng position = marker.getPosition();
        final Handler handler = new Handler();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        handler.post(new Runnable() { // from class: com.google.maps.android.ui.AnimationUtil.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            long f34056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            float f34057c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            float f34058d;

            @Override // java.lang.Runnable
            public void run() {
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                this.f34056b = jUptimeMillis2;
                float f10 = jUptimeMillis2 / 2000.0f;
                this.f34057c = f10;
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(f10);
                this.f34058d = interpolation;
                marker.setPosition(linear.interpolate(interpolation, position, latLng));
                if (this.f34057c < 1.0f) {
                    handler.postDelayed(this, 16L);
                }
            }
        });
    }
}
