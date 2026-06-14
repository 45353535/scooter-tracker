package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5585z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f78602a;

    public C5585z2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C5585z2(LocationManager locationManager) {
        this.f78602a = locationManager;
    }
}
