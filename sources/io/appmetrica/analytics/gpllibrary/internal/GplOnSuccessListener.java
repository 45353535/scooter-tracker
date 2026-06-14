package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes12.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f75351a;

    GplOnSuccessListener(LocationListener locationListener) {
        this.f75351a = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f75351a.onLocationChanged(location);
    }
}
