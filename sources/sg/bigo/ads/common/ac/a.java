package sg.bigo.ads.common.ac;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public C1255a f102283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f102284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f102285c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.ac.a$a, reason: collision with other inner class name */
    public static class C1255a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f102286a = false;

        C1255a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f102286a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a(@NonNull Context context) {
        this(context, new C1255a());
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.f102285c <= 3000;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f102283a.f102286a = false;
            this.f102285c = System.currentTimeMillis();
            this.f102284b.f102537a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.f102284b.f102538b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    private a(Context context, @NonNull C1255a c1255a) {
        super(context, c1255a);
        this.f102285c = -1L;
        this.f102284b = new i();
        this.f102283a = c1255a;
        setIsLongpressEnabled(false);
    }
}
