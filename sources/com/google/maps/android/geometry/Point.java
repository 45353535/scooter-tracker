package com.google.maps.android.geometry;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class Point {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final double f34025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final double f34026y;

    public Point(double d10, double d11) {
        this.f34025x = d10;
        this.f34026y = d11;
    }

    @NonNull
    public String toString() {
        return "Point{x=" + this.f34025x + ", y=" + this.f34026y + '}';
    }
}
