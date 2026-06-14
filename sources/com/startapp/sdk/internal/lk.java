package com.startapp.sdk.internal;

import android.graphics.Rect;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;

/* JADX INFO: loaded from: classes11.dex */
public final class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f64893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f64894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[] f64895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NotDisplayedReason f64896d;

    public lk() {
        this.f64894b = new Rect();
    }

    public lk(NotDisplayedReason notDisplayedReason, float f10, Rect rect, Rect[] rectArr) {
        new Rect();
        this.f64893a = f10;
        this.f64894b = rect;
        this.f64895c = rectArr;
        this.f64896d = notDisplayedReason;
    }
}
