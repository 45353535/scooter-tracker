package com.taurusx.tax.o;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.taurusx.tax.log.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class m0 extends GestureDetector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.taurusx.tax.o.z f66470c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z f66471o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.taurusx.tax.w.s.z f66472w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.taurusx.tax.w.s.a f66473y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f66474z;

    public interface z {
        void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar);

        boolean w();

        void z();

        void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar);
    }

    public m0(Context context, View view) {
        this(context, view, new com.taurusx.tax.o.z(view));
    }

    public void z(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f66473y.f67468z = System.currentTimeMillis();
            this.f66472w.w(String.valueOf((int) motionEvent.getX()));
            this.f66472w.y(String.valueOf((int) motionEvent.getY()));
            onTouchEvent(motionEvent);
            z zVar = this.f66471o;
            if (zVar != null) {
                zVar.z(this.f66472w, this.f66473y);
                return;
            }
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (z(motionEvent, this.f66474z)) {
                onTouchEvent(motionEvent);
                return;
            } else {
                z();
                return;
            }
        }
        this.f66473y.f67466w = System.currentTimeMillis();
        this.f66473y.f67467y = motionEvent.getDownTime();
        this.f66473y.f67463c = motionEvent.getEventTime();
        this.f66473y.z(motionEvent);
        this.f66472w.o(String.valueOf((int) motionEvent.getX()));
        this.f66472w.s(String.valueOf((int) motionEvent.getY()));
        this.f66472w.c(String.valueOf(view.getHeight()));
        this.f66472w.a(String.valueOf(view.getWidth()));
        this.f66472w.z(String.valueOf(System.currentTimeMillis()));
        z zVar2 = this.f66471o;
        if (zVar2 != null) {
            zVar2.w(this.f66472w, this.f66473y);
        } else {
            LogUtil.d("ViewGestureDetector", "View's onUserClick() is not registered.");
        }
        this.f66470c.z();
    }

    public m0(Context context, View view, com.taurusx.tax.o.z zVar) {
        super(context, zVar);
        this.f66472w = new com.taurusx.tax.w.s.z();
        this.f66473y = new com.taurusx.tax.w.s.a();
        this.f66470c = zVar;
        this.f66474z = view;
        setIsLongpressEnabled(false);
    }

    public void z(z zVar) {
        this.f66471o = zVar;
    }

    public void z() {
        this.f66470c.s();
    }

    private boolean z(MotionEvent motionEvent, View view) {
        if (motionEvent != null && view != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 >= 0.0f && x10 <= view.getWidth() && y10 >= 0.0f && y10 <= view.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void z(com.taurusx.tax.o.z zVar) {
        this.f66470c = zVar;
    }
}
