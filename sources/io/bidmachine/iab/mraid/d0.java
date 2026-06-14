package io.bidmachine.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f80204a;

    private static final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f80205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile long f80206c;

        public final long a() {
            return this.f80206c;
        }

        public final boolean b() {
            return this.f80205b;
        }

        public final void c() {
            this.f80205b = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            this.f80205b = true;
            this.f80206c = System.currentTimeMillis();
            return super.onSingleTapUp(e10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(Context context) {
        this(context, new a());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final long a() {
        return this.f80204a.a();
    }

    public final boolean b() {
        return this.f80204a.b();
    }

    public final void c() {
        this.f80204a.c();
    }

    private d0(Context context, a aVar) {
        super(context, aVar);
        this.f80204a = aVar;
        setIsLongpressEnabled(false);
    }
}
