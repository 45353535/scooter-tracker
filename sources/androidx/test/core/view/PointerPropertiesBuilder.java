package androidx.test.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public class PointerPropertiesBuilder {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f5460id;
    private int toolType;

    private PointerPropertiesBuilder() {
    }

    public static PointerPropertiesBuilder newBuilder() {
        return new PointerPropertiesBuilder();
    }

    public MotionEvent.PointerProperties build() {
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = this.f5460id;
        pointerProperties.toolType = this.toolType;
        return pointerProperties;
    }

    public PointerPropertiesBuilder setId(int i10) {
        this.f5460id = i10;
        return this;
    }

    public PointerPropertiesBuilder setToolType(int i10) {
        this.toolType = i10;
        return this;
    }
}
