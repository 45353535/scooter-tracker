package f1;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ig extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GestureDetector f70131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f70132c;

    public ig(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f70131b = new GestureDetector(context, this);
    }

    public final boolean a() {
        return this.f70132c;
    }

    public final boolean b(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f70131b.onTouchEvent(event);
    }

    public final void c() {
        this.f70132c = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f70132c = true;
        return super.onSingleTapUp(e10);
    }
}
