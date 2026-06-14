package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3763hi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3763hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3635ci f38718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38719b;

    public C3763hi(GestureDetectorOnGestureListenerC3635ci view, long j10) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f38718a = view;
        this.f38719b = j10;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: w3.d8
            @Override // java.lang.Runnable
            public final void run() {
                C3763hi.a(this.f107018b);
            }
        }, this.f38719b);
    }

    public static final void a(C3763hi c3763hi) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = c3763hi.f38718a;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.i();
        }
        c3763hi.f38718a = null;
    }
}
