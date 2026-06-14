package com.google.maps.android.data;

import android.util.Log;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Style extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MarkerOptions f33956a = new MarkerOptions();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected PolylineOptions f33957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected PolygonOptions f33958c;

    public Style() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.f33957b = polylineOptions;
        polylineOptions.clickable(true);
        PolygonOptions polygonOptions = new PolygonOptions();
        this.f33958c = polygonOptions;
        polygonOptions.clickable(true);
    }

    public float getRotation() {
        return this.f33956a.getRotation();
    }

    public void setLineStringWidth(float f10) {
        this.f33957b.width(f10);
    }

    public void setMarkerHotSpot(float f10, float f11, String str, String str2) {
        if (!str.equals("fraction")) {
            Log.w("Style", "Hotspot xUnits other than \"fraction\" are not supported.");
            f10 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            Log.w("Style", "Hotspot yUnits other than \"fraction\" are not supported.");
            f11 = 1.0f;
        }
        this.f33956a.anchor(f10, f11);
    }

    public void setMarkerRotation(float f10) {
        this.f33956a.rotation(f10);
    }

    public void setPolygonFillColor(int i10) {
        this.f33958c.fillColor(i10);
    }

    public void setPolygonStrokeWidth(float f10) {
        this.f33958c.strokeWidth(f10);
    }
}
