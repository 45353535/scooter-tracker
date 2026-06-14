package com.my.target;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.my.target.s6;

/* JADX INFO: loaded from: classes11.dex */
public class s6 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f60787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f60790g;

    public interface a {
        void a();

        void a(boolean z10);
    }

    public static class b extends GestureDetector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f60791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f60792b;

        public interface a {
            void a();
        }

        public b(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public void a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                onTouchEvent(motionEvent);
                return;
            }
            if (action != 1) {
                if (action == 2 && a(motionEvent, this.f60791a)) {
                    onTouchEvent(motionEvent);
                    return;
                }
                return;
            }
            if (this.f60792b == null) {
                gb.a("MraidWebView$ViewGestureDetector: View's onUserClick() is not registered");
            } else {
                gb.a("MraidWebView$ViewGestureDetector: Gestures - user clicked");
                this.f60792b.a();
            }
        }

        public b(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f60791a = view;
            setIsLongpressEnabled(false);
        }

        public void a(a aVar) {
            this.f60792b = aVar;
        }

        public final boolean a(MotionEvent motionEvent, View view) {
            if (motionEvent != null && view != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (x10 >= 0.0f && x10 <= view.getWidth() && y10 >= 0.0f && y10 <= view.getHeight()) {
                    return true;
                }
            }
            return false;
        }
    }

    public s6(Context context) {
        super(context);
        this.f60788e = getVisibility() == 0;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        final b bVar = new b(getContext(), this);
        bVar.a(new b.a() { // from class: k5.g2
            @Override // com.my.target.s6.b.a
            public final void a() {
                this.f86042a.i();
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: k5.h2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return s6.a(bVar, view, motionEvent);
            }
        });
    }

    public static /* synthetic */ boolean a(b bVar, View view, MotionEvent motionEvent) {
        bVar.a(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.f60789f = true;
    }

    public boolean h() {
        return this.f60788e;
    }

    @Override // com.my.target.m0, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        a(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = i10 == 0;
        if (z10 != this.f60788e) {
            this.f60788e = z10;
            a aVar = this.f60787d;
            if (aVar != null) {
                aVar.a(z10);
            }
        }
    }

    @VisibleForTesting
    public void setClicked(boolean z10) {
        this.f60789f = z10;
    }

    public void setVisibilityChangedListener(@Nullable a aVar) {
        this.f60787d = aVar;
    }

    public void a(boolean z10) {
        gb.a("MraidWebView: Pause, finishing " + z10);
        if (z10) {
            f();
            a("");
        }
        d();
    }

    public boolean g() {
        return this.f60789f;
    }

    public final void a(int i10, int i11) {
        int i12 = ((float) i10) / ((float) i11) > 1.0f ? 2 : 1;
        if (i12 != this.f60790g) {
            this.f60790g = i12;
            a aVar = this.f60787d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
