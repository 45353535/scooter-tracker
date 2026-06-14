package com.inmobi.media;

import android.view.MotionEvent;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3931oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f39187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f39190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f39191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f39192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f39195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONArray f39196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MotionEvent f39197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39198l;

    public C3931oc(GestureDetectorOnGestureListenerC3635ci mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f39187a = mListener;
        this.f39188b = C3931oc.class.getSimpleName();
        this.f39198l = Integer.MAX_VALUE;
        this.f39193g = -1;
        this.f39194h = -1;
    }

    public final void a(MotionEvent event) {
        float y10;
        float x10;
        float f10;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            String TAG = this.f39188b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            event.toString();
            this.f39193g = event.getPointerId(event.getActionIndex());
            this.f39196j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(event.getX())), Integer.valueOf(F3.c(event.getY()))}));
            JSONArray jSONArray2 = this.f39196j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            String TAG2 = this.f39188b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            event.toString();
            this.f39193g = -1;
            JSONArray jSONArray3 = this.f39196j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.f39187a.a(this);
            this.f39196j = new JSONArray();
            return;
        }
        float y11 = 0.0f;
        if (actionMasked == 2) {
            JSONArray jSONArray4 = this.f39196j;
            int i10 = this.f39193g;
            if (i10 == -1 || this.f39194h == -1) {
                if (i10 == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int iC = F3.c(event.getX());
                    int iC2 = F3.c(event.getY());
                    JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    JSONArray jSONArray6 = new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iC), Integer.valueOf(iC2)}));
                    float f11 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f12 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) Math.sqrt((f12 * f12) + (f11 * f11))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int iFindPointerIndex = event.findPointerIndex(i10);
            int iFindPointerIndex2 = event.findPointerIndex(this.f39194h);
            if (iFindPointerIndex >= 0) {
                x10 = event.getX(iFindPointerIndex);
                y10 = event.getY(iFindPointerIndex);
            } else {
                Lazy lazy = P9.f37527a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f39193g + " is " + iFindPointerIndex + " | Pointer count=" + event.getPointerCount())));
                y10 = 0.0f;
                x10 = 0.0f;
            }
            if (iFindPointerIndex2 >= 0) {
                float x11 = event.getX(iFindPointerIndex2);
                y11 = event.getY(iFindPointerIndex2);
                f10 = x11;
            } else {
                Lazy lazy2 = P9.f37527a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f39194h + " is " + iFindPointerIndex2 + " | Pointer count=" + event.getPointerCount())));
                f10 = 0.0f;
            }
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.f39190d - this.f39192f, this.f39189c - this.f39191e)) - ((float) Math.atan2(y11 - y10, f10 - x10)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.f39195i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            String TAG3 = this.f39188b;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            event.toString();
            this.f39193g = -1;
            this.f39194h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            String TAG4 = this.f39188b;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            event.toString();
            this.f39194h = -1;
            if (this.f39195i > 30.0f) {
                MotionEvent motionEvent = this.f39197k;
                if (motionEvent != null) {
                    this.f39187a.b(this, motionEvent, event);
                }
                this.f39195i = 0.0f;
            }
            float x12 = event.getX() - event.getX(1);
            float y12 = event.getY() - event.getY(1);
            if (Math.abs(((int) Math.sqrt((y12 * y12) + (x12 * x12))) - this.f39198l) > 500) {
                MotionEvent motionEvent2 = this.f39197k;
                if (motionEvent2 != null) {
                    this.f39187a.a(this, motionEvent2, event);
                }
                this.f39198l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        String TAG5 = this.f39188b;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        event.toString();
        this.f39194h = event.getPointerId(event.getActionIndex());
        this.f39197k = MotionEvent.obtain(event);
        int iFindPointerIndex3 = event.findPointerIndex(this.f39193g);
        int iFindPointerIndex4 = event.findPointerIndex(this.f39194h);
        if (iFindPointerIndex3 >= 0) {
            this.f39191e = event.getX(iFindPointerIndex3);
            this.f39192f = event.getY(iFindPointerIndex3);
        } else {
            Lazy lazy3 = P9.f37527a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f39193g + " is " + iFindPointerIndex3 + " | Pointer count=" + event.getPointerCount())));
        }
        if (iFindPointerIndex4 >= 0) {
            this.f39189c = event.getX(iFindPointerIndex4);
            this.f39190d = event.getY(iFindPointerIndex4);
        } else {
            Lazy lazy4 = P9.f37527a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID2=" + this.f39194h + " is " + iFindPointerIndex4 + " | Pointer count=" + event.getPointerCount())));
        }
        float f13 = this.f39191e - this.f39189c;
        float f14 = this.f39192f - this.f39190d;
        this.f39198l = (int) Math.sqrt((f14 * f14) + (f13 * f13));
    }
}
