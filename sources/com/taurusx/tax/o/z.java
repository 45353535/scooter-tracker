package com.taurusx.tax.o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class z extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f66561f = 50.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f66562g = 100.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f66563t = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f66564a = w.UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66565c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f66566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f66567o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f66568s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f66569w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f66570y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f66571z;

    public enum w {
        UNSET,
        GOING_RIGHT,
        GOING_LEFT,
        FINISHED,
        FAILED
    }

    /* JADX INFO: renamed from: com.taurusx.tax.o.z$z, reason: collision with other inner class name */
    public static /* synthetic */ class C0813z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f66573z;

        static {
            int[] iArr = new int[w.values().length];
            f66573z = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f66573z;
                w wVar = w.UNSET;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f66573z;
                w wVar2 = w.UNSET;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f66573z;
                w wVar3 = w.UNSET;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public z(View view) {
        this.f66571z = 100.0f;
        if (view != null && view.getWidth() > 0) {
            this.f66571z = Math.min(100.0f, view.getWidth() / 3.0f);
        }
        this.f66566n = view;
    }

    private void a(float f10) {
        if (c(f10) && z(f10)) {
            this.f66564a = w.GOING_LEFT;
            this.f66568s = f10;
        }
    }

    private boolean c(float f10) {
        if (this.f66565c) {
            return true;
        }
        if (f10 < this.f66568s + this.f66571z) {
            return false;
        }
        this.f66570y = false;
        this.f66565c = true;
        return true;
    }

    private void o(float f10) {
        if (f10 > this.f66568s) {
            this.f66564a = w.GOING_RIGHT;
        }
    }

    private boolean w(float f10) {
        return f10 > this.f66569w;
    }

    private boolean y(float f10) {
        if (this.f66570y) {
            return true;
        }
        if (f10 > this.f66568s - this.f66571z) {
            return false;
        }
        this.f66565c = false;
        this.f66570y = true;
        o();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f66564a == w.FINISHED) {
            return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
        if (z(motionEvent.getY(), motionEvent2.getY())) {
            this.f66564a = w.FAILED;
            return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
        int iOrdinal = this.f66564a.ordinal();
        if (iOrdinal == 0) {
            this.f66568s = motionEvent.getX();
            o(motionEvent2.getX());
        } else if (iOrdinal == 1) {
            a(motionEvent2.getX());
        } else if (iOrdinal == 2) {
            s(motionEvent2.getX());
        }
        this.f66569w = motionEvent2.getX();
        return super.onScroll(motionEvent, motionEvent2, f10, f11);
    }

    public void s() {
        this.f66567o = 0;
        this.f66564a = w.UNSET;
    }

    public void z() {
        s();
    }

    private boolean z(float f10, float f11) {
        return Math.abs(f11 - f10) > 50.0f;
    }

    @Deprecated
    public w w() {
        return this.f66564a;
    }

    private void o() {
        int i10 = this.f66567o + 1;
        this.f66567o = i10;
        if (i10 >= 4) {
            this.f66564a = w.FINISHED;
        }
    }

    private void s(float f10) {
        if (y(f10) && w(f10)) {
            this.f66564a = w.GOING_RIGHT;
            this.f66568s = f10;
        }
    }

    private boolean z(float f10) {
        return f10 < this.f66569w;
    }

    @Deprecated
    public int c() {
        return this.f66567o;
    }

    @Deprecated
    public float y() {
        return this.f66571z;
    }
}
