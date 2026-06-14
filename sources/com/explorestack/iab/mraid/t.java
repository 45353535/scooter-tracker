package com.explorestack.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public class t extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18179a;

    static class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18180b = false;

        a() {
        }

        boolean a() {
            return this.f18180b;
        }

        void b() {
            this.f18180b = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f18180b = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public t(Context context) {
        this(context, new a());
    }

    public boolean a() {
        return this.f18179a.a();
    }

    public void b() {
        this.f18179a.b();
    }

    private t(Context context, a aVar) {
        super(context, aVar);
        this.f18179a = aVar;
        setIsLongpressEnabled(false);
    }
}
