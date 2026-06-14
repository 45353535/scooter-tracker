package com.google.maps.android.data.geojson;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonPointStyle extends Style implements GeoJsonStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f33977d = {"Point", "MultiPoint", "GeometryCollection"};

    public GeoJsonPointStyle() {
        this.f33956a = new MarkerOptions();
    }

    private void a() {
        setChanged();
        notifyObservers();
    }

    public float getAlpha() {
        return this.f33956a.getAlpha();
    }

    public float getAnchorU() {
        return this.f33956a.getAnchorU();
    }

    public float getAnchorV() {
        return this.f33956a.getAnchorV();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return f33977d;
    }

    public BitmapDescriptor getIcon() {
        return this.f33956a.getIcon();
    }

    public float getInfoWindowAnchorU() {
        return this.f33956a.getInfoWindowAnchorU();
    }

    public float getInfoWindowAnchorV() {
        return this.f33956a.getInfoWindowAnchorV();
    }

    @Override // com.google.maps.android.data.Style
    public float getRotation() {
        return this.f33956a.getRotation();
    }

    public String getSnippet() {
        return this.f33956a.getSnippet();
    }

    public String getTitle() {
        return this.f33956a.getTitle();
    }

    public float getZIndex() {
        return this.f33956a.getZIndex();
    }

    public boolean isDraggable() {
        return this.f33956a.isDraggable();
    }

    public boolean isFlat() {
        return this.f33956a.isFlat();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.f33956a.isVisible();
    }

    public void setAlpha(float f10) {
        this.f33956a.alpha(f10);
        a();
    }

    public void setAnchor(float f10, float f11) {
        setMarkerHotSpot(f10, f11, "fraction", "fraction");
        a();
    }

    public void setDraggable(boolean z10) {
        this.f33956a.draggable(z10);
        a();
    }

    public void setFlat(boolean z10) {
        this.f33956a.flat(z10);
        a();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        this.f33956a.icon(bitmapDescriptor);
        a();
    }

    public void setInfoWindowAnchor(float f10, float f11) {
        this.f33956a.infoWindowAnchor(f10, f11);
        a();
    }

    public void setRotation(float f10) {
        setMarkerRotation(f10);
        a();
    }

    public void setSnippet(String str) {
        this.f33956a.snippet(str);
        a();
    }

    public void setTitle(String str) {
        this.f33956a.title(str);
        a();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z10) {
        this.f33956a.visible(z10);
        a();
    }

    public void setZIndex(float f10) {
        this.f33956a.zIndex(f10);
        a();
    }

    public MarkerOptions toMarkerOptions() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.alpha(this.f33956a.getAlpha());
        markerOptions.anchor(this.f33956a.getAnchorU(), this.f33956a.getAnchorV());
        markerOptions.draggable(this.f33956a.isDraggable());
        markerOptions.flat(this.f33956a.isFlat());
        markerOptions.icon(this.f33956a.getIcon());
        markerOptions.infoWindowAnchor(this.f33956a.getInfoWindowAnchorU(), this.f33956a.getInfoWindowAnchorV());
        markerOptions.rotation(this.f33956a.getRotation());
        markerOptions.snippet(this.f33956a.getSnippet());
        markerOptions.title(this.f33956a.getTitle());
        markerOptions.visible(this.f33956a.isVisible());
        markerOptions.zIndex(this.f33956a.getZIndex());
        return markerOptions;
    }

    @NonNull
    public String toString() {
        return "PointStyle{\n geometry type=" + Arrays.toString(f33977d) + ",\n alpha=" + getAlpha() + ",\n anchor U=" + getAnchorU() + ",\n anchor V=" + getAnchorV() + ",\n draggable=" + isDraggable() + ",\n flat=" + isFlat() + ",\n info window anchor U=" + getInfoWindowAnchorU() + ",\n info window anchor V=" + getInfoWindowAnchorV() + ",\n rotation=" + getRotation() + ",\n snippet=" + getSnippet() + ",\n title=" + getTitle() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + "\n}\n";
    }
}
