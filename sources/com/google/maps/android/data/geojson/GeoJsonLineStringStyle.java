package com.google.maps.android.data.geojson;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonLineStringStyle extends Style implements GeoJsonStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f33972d = {"LineString", "MultiLineString", "GeometryCollection"};

    public GeoJsonLineStringStyle() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.f33957b = polylineOptions;
        polylineOptions.clickable(true);
    }

    private void a() {
        setChanged();
        notifyObservers();
    }

    public int getColor() {
        return this.f33957b.getColor();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return f33972d;
    }

    public List<PatternItem> getPattern() {
        return this.f33957b.getPattern();
    }

    public float getWidth() {
        return this.f33957b.getWidth();
    }

    public float getZIndex() {
        return this.f33957b.getZIndex();
    }

    public boolean isClickable() {
        return this.f33957b.isClickable();
    }

    public boolean isGeodesic() {
        return this.f33957b.isGeodesic();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.f33957b.isVisible();
    }

    public void setClickable(boolean z10) {
        this.f33957b.clickable(z10);
        a();
    }

    public void setColor(int i10) {
        this.f33957b.color(i10);
        a();
    }

    public void setGeodesic(boolean z10) {
        this.f33957b.geodesic(z10);
        a();
    }

    public void setPattern(List<PatternItem> list) {
        this.f33957b.pattern(list);
        a();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z10) {
        this.f33957b.visible(z10);
        a();
    }

    public void setWidth(float f10) {
        setLineStringWidth(f10);
        a();
    }

    public void setZIndex(float f10) {
        this.f33957b.zIndex(f10);
        a();
    }

    public PolylineOptions toPolylineOptions() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.f33957b.getColor());
        polylineOptions.clickable(this.f33957b.isClickable());
        polylineOptions.geodesic(this.f33957b.isGeodesic());
        polylineOptions.visible(this.f33957b.isVisible());
        polylineOptions.width(this.f33957b.getWidth());
        polylineOptions.zIndex(this.f33957b.getZIndex());
        polylineOptions.pattern(getPattern());
        return polylineOptions;
    }

    @NonNull
    public String toString() {
        return "LineStringStyle{\n geometry type=" + Arrays.toString(f33972d) + ",\n color=" + getColor() + ",\n clickable=" + isClickable() + ",\n geodesic=" + isGeodesic() + ",\n visible=" + isVisible() + ",\n width=" + getWidth() + ",\n z index=" + getZIndex() + ",\n pattern=" + getPattern() + "\n}\n";
    }
}
