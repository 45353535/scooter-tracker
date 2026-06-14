package com.google.maps.android.data.geojson;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.data.Style;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonPolygonStyle extends Style implements GeoJsonStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f33979d = {KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};

    public GeoJsonPolygonStyle() {
        PolygonOptions polygonOptions = new PolygonOptions();
        this.f33958c = polygonOptions;
        polygonOptions.clickable(true);
    }

    private void a() {
        setChanged();
        notifyObservers();
    }

    public int getFillColor() {
        return this.f33958c.getFillColor();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return f33979d;
    }

    public int getStrokeColor() {
        return this.f33958c.getStrokeColor();
    }

    public int getStrokeJointType() {
        return this.f33958c.getStrokeJointType();
    }

    public List<PatternItem> getStrokePattern() {
        return this.f33958c.getStrokePattern();
    }

    public float getStrokeWidth() {
        return this.f33958c.getStrokeWidth();
    }

    public float getZIndex() {
        return this.f33958c.getZIndex();
    }

    public boolean isClickable() {
        return this.f33958c.isClickable();
    }

    public boolean isGeodesic() {
        return this.f33958c.isGeodesic();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.f33958c.isVisible();
    }

    public void setClickable(boolean z10) {
        this.f33958c.clickable(z10);
        a();
    }

    public void setFillColor(int i10) {
        setPolygonFillColor(i10);
        a();
    }

    public void setGeodesic(boolean z10) {
        this.f33958c.geodesic(z10);
        a();
    }

    public void setStrokeColor(int i10) {
        this.f33958c.strokeColor(i10);
        a();
    }

    public void setStrokeJointType(int i10) {
        this.f33958c.strokeJointType(i10);
        a();
    }

    public void setStrokePattern(List<PatternItem> list) {
        this.f33958c.strokePattern(list);
        a();
    }

    public void setStrokeWidth(float f10) {
        setPolygonStrokeWidth(f10);
        a();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z10) {
        this.f33958c.visible(z10);
        a();
    }

    public void setZIndex(float f10) {
        this.f33958c.zIndex(f10);
        a();
    }

    public PolygonOptions toPolygonOptions() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.fillColor(this.f33958c.getFillColor());
        polygonOptions.geodesic(this.f33958c.isGeodesic());
        polygonOptions.strokeColor(this.f33958c.getStrokeColor());
        polygonOptions.strokeJointType(this.f33958c.getStrokeJointType());
        polygonOptions.strokePattern(this.f33958c.getStrokePattern());
        polygonOptions.strokeWidth(this.f33958c.getStrokeWidth());
        polygonOptions.visible(this.f33958c.isVisible());
        polygonOptions.zIndex(this.f33958c.getZIndex());
        polygonOptions.clickable(this.f33958c.isClickable());
        return polygonOptions;
    }

    @NonNull
    public String toString() {
        return "PolygonStyle{\n geometry type=" + Arrays.toString(f33979d) + ",\n fill color=" + getFillColor() + ",\n geodesic=" + isGeodesic() + ",\n stroke color=" + getStrokeColor() + ",\n stroke joint type=" + getStrokeJointType() + ",\n stroke pattern=" + getStrokePattern() + ",\n stroke width=" + getStrokeWidth() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + ",\n clickable=" + isClickable() + "\n}\n";
    }
}
