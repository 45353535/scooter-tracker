package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.v7;
import io.sentry.w8;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window.Callback f82502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f82503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetectorCompat f82504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v7 f82505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f82506g;

    class a implements b {
        a() {
        }

        @Override // io.sentry.android.core.internal.gestures.h.b
        public /* synthetic */ MotionEvent a(MotionEvent motionEvent) {
            return i.a(this, motionEvent);
        }
    }

    interface b {
        MotionEvent a(MotionEvent motionEvent);
    }

    public h(Window.Callback callback, Context context, g gVar, v7 v7Var) {
        this(callback, new GestureDetectorCompat(context, gVar, new Handler(Looper.getMainLooper())), gVar, v7Var, new a());
    }

    private void b(MotionEvent motionEvent) {
        this.f82504e.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f82503d.k(motionEvent);
        }
    }

    public Window.Callback a() {
        return this.f82502c;
    }

    public void c() {
        this.f82503d.m(w8.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                b(this.f82506g.a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, v7 v7Var, b bVar) {
        super(callback);
        this.f82502c = callback;
        this.f82503d = gVar;
        this.f82505f = v7Var;
        this.f82504e = gestureDetectorCompat;
        this.f82506g = bVar;
    }
}
