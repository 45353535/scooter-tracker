package f1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c8 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f69513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f69514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f69515d;

    public c8(float f10, Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f69513b = f10;
        this.f69514c = onClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f69515d = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        Intrinsics.checkNotNullParameter(e22, "e2");
        this.f69515d = ((float) Math.hypot((double) f10, (double) f11)) > this.f69513b;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (this.f69515d) {
            return false;
        }
        this.f69514c.invoke();
        return true;
    }

    public /* synthetic */ c8(float f10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10.0f : f10, function0);
    }
}
