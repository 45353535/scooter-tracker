package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes11.dex */
public class f1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapDrawable f59619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f59623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f59624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f59625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f59626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f59627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f59628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f59629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59630m;

    public interface a {
        void b();
    }

    public f1(Context context) {
        super(context);
        this.f59623f = new Rect();
        this.f59624g = new Rect();
        this.f59625h = new Rect();
        this.f59626i = new Rect();
        this.f59630m = 8388661;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(l0.a(kb.e(context).b(30)));
        this.f59619b = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.f59618a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f59620c = kb.a(50, context);
        this.f59621d = kb.a(30, context);
        this.f59622e = kb.a(8, context);
        setWillNotDraw(false);
    }

    public boolean a(int i10, int i11, int i12) {
        Rect rect = this.f59624g;
        return i10 >= rect.left - i12 && i11 >= rect.top - i12 && i10 < rect.right + i12 && i11 < rect.bottom + i12;
    }

    public void b(int i10, Rect rect, Rect rect2) {
        int i11 = this.f59621d;
        Gravity.apply(i10, i11, i11, rect, rect2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f59628k) {
            this.f59628k = false;
            this.f59623f.set(0, 0, getWidth(), getHeight());
            a(this.f59620c, this.f59623f, this.f59624g);
            this.f59626i.set(this.f59624g);
            Rect rect = this.f59626i;
            int i10 = this.f59622e;
            rect.inset(i10, i10);
            a(this.f59621d, this.f59626i, this.f59625h);
            this.f59619b.setBounds(this.f59625h);
        }
        if (this.f59619b.isVisible()) {
            this.f59619b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f59628k = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f59619b.isVisible() || !a(x10, y10, this.f59618a)) {
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f59629l = true;
        } else if (action != 1) {
            if (action == 3) {
                this.f59629l = false;
            }
        } else if (this.f59629l) {
            a();
            this.f59629l = false;
        }
        return true;
    }

    @VisibleForTesting
    public void setCloseBounds(@NonNull Rect rect) {
        this.f59624g.set(rect);
    }

    public void setCloseGravity(int i10) {
        this.f59630m = i10;
    }

    public void setCloseVisible(boolean z10) {
        kb.a(this, z10 ? "close_button" : "closeable_layout");
        if (this.f59619b.setVisible(z10, false)) {
            invalidate(this.f59624g);
        }
    }

    public void setOnCloseListener(@Nullable a aVar) {
        this.f59627j = aVar;
    }

    public final void a(int i10, Rect rect, Rect rect2) {
        Gravity.apply(this.f59630m, i10, i10, rect, rect2);
    }

    public final void a() {
        playSoundEffect(0);
        a aVar = this.f59627j;
        if (aVar != null) {
            aVar.b();
        }
    }
}
