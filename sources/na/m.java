package na;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import na.d;

/* JADX INFO: loaded from: classes12.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f95767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f95768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final GestureDetector f95769f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f95765b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f95766c = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile float f95770g = 3.1415927f;

    public interface a {
        void onScrollChange(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f95767d = aVar;
        this.f95768e = f10;
        this.f95769f = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f95765b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // na.d.a
    public void onOrientationChange(float[] fArr, float f10) {
        this.f95770g = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f95765b.x) / this.f95768e;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f95765b;
        float f12 = (y10 - pointF.y) / this.f95768e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f95770g;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f95766c;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f95767d.onScrollChange(this.f95766c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f95767d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f95769f.onTouchEvent(motionEvent);
    }
}
