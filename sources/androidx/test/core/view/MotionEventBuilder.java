package androidx.test.core.view;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MotionEventBuilder {
    private long downTime = 0;
    private long eventTime = SystemClock.uptimeMillis();
    private int action = 0;
    private int actionIndex = -1;
    private List<MotionEvent.PointerProperties> pointerPropertiesList = new ArrayList();
    private List<MotionEvent.PointerCoords> pointerCoordsList = new ArrayList();
    private int metaState = 0;
    private int buttonState = 0;
    private float xPrecision = 0.0f;
    private float yPrecision = 0.0f;
    private int deviceId = 0;
    private int edgeFlags = 0;
    private int source = 0;
    private int flags = 0;

    private MotionEventBuilder() {
    }

    private static void checkState(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static MotionEventBuilder newBuilder() {
        return new MotionEventBuilder();
    }

    public MotionEvent build() {
        if (this.pointerPropertiesList.size() == 0) {
            setPointer(0.0f, 0.0f);
        }
        int i10 = this.actionIndex;
        if (i10 != -1) {
            this.action = (i10 << 8) | this.action;
        }
        long j10 = this.downTime;
        long j11 = this.eventTime;
        int i11 = this.action;
        int size = this.pointerPropertiesList.size();
        List<MotionEvent.PointerProperties> list = this.pointerPropertiesList;
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) list.toArray(new MotionEvent.PointerProperties[list.size()]);
        List<MotionEvent.PointerCoords> list2 = this.pointerCoordsList;
        return MotionEvent.obtain(j10, j11, i11, size, pointerPropertiesArr, (MotionEvent.PointerCoords[]) list2.toArray(new MotionEvent.PointerCoords[list2.size()]), this.metaState, this.buttonState, this.xPrecision, this.yPrecision, this.deviceId, this.edgeFlags, this.source, this.flags);
    }

    public MotionEventBuilder setAction(int i10) {
        this.action = i10;
        return this;
    }

    public MotionEventBuilder setActionIndex(int i10) {
        checkState(i10 <= 255, "pointerIndex must be less than 0xff");
        this.actionIndex = i10;
        return this;
    }

    public MotionEventBuilder setButtonState(int i10) {
        this.buttonState = i10;
        return this;
    }

    public MotionEventBuilder setDeviceId(int i10) {
        this.deviceId = i10;
        return this;
    }

    public MotionEventBuilder setDownTime(long j10) {
        this.downTime = j10;
        return this;
    }

    public MotionEventBuilder setEdgeFlags(int i10) {
        this.edgeFlags = i10;
        return this;
    }

    public MotionEventBuilder setEventTime(long j10) {
        this.eventTime = j10;
        return this;
    }

    public MotionEventBuilder setFlags(int i10) {
        this.flags = i10;
        return this;
    }

    public MotionEventBuilder setMetaState(int i10) {
        this.metaState = i10;
        return this;
    }

    public MotionEventBuilder setPointer(float f10, float f11) {
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = this.pointerPropertiesList.size();
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = f10;
        pointerCoords.y = f11;
        return setPointer(pointerProperties, pointerCoords);
    }

    public MotionEventBuilder setSource(int i10) {
        this.source = i10;
        return this;
    }

    public MotionEventBuilder setXPrecision(float f10) {
        this.xPrecision = f10;
        return this;
    }

    public MotionEventBuilder setYPrecision(float f10) {
        this.yPrecision = f10;
        return this;
    }

    public MotionEventBuilder setPointer(MotionEvent.PointerProperties pointerProperties, MotionEvent.PointerCoords pointerCoords) {
        this.pointerPropertiesList.add(pointerProperties);
        this.pointerCoordsList.add(pointerCoords);
        return this;
    }
}
