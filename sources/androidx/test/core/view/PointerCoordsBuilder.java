package androidx.test.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public class PointerCoordsBuilder {
    private float orientation;
    private float toolMajor;
    private float toolMinor;
    private float touchMajor;
    private float touchMinor;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f5458x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f5459y = 0.0f;
    private float pressure = 1.0f;
    private float size = 1.0f;

    private PointerCoordsBuilder() {
    }

    public static PointerCoordsBuilder newBuilder() {
        return new PointerCoordsBuilder();
    }

    public MotionEvent.PointerCoords build() {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = this.f5458x;
        pointerCoords.y = this.f5459y;
        pointerCoords.pressure = this.pressure;
        pointerCoords.size = this.size;
        pointerCoords.touchMajor = this.touchMajor;
        pointerCoords.touchMinor = this.touchMinor;
        pointerCoords.toolMajor = this.toolMajor;
        pointerCoords.toolMinor = this.toolMinor;
        pointerCoords.orientation = this.orientation;
        return pointerCoords;
    }

    public PointerCoordsBuilder setCoords(float f10, float f11) {
        this.f5458x = f10;
        this.f5459y = f11;
        return this;
    }

    public PointerCoordsBuilder setOrientation(float f10) {
        this.orientation = f10;
        return this;
    }

    public PointerCoordsBuilder setPressure(float f10) {
        this.pressure = f10;
        return this;
    }

    public PointerCoordsBuilder setSize(float f10) {
        this.size = f10;
        return this;
    }

    public PointerCoordsBuilder setTool(float f10, float f11) {
        this.toolMajor = f10;
        this.toolMinor = f11;
        return this;
    }

    public PointerCoordsBuilder setTouch(float f10, float f11) {
        this.touchMajor = f10;
        this.touchMinor = f11;
        return this;
    }
}
