package dc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes12.dex */
abstract class m extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FrameLayout f68629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final r f68630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    View f68631d;

    public m(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    protected void a() {
        View view = this.f68631d;
        if (view != null) {
            super.removeView(view);
            this.f68631d = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        FrameLayout frameLayout = this.f68629b;
        if (view != frameLayout) {
            frameLayout.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        this.f68629b.bringChildToFront(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.f68629b.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.f68631d) {
            a();
        } else {
            this.f68629b.removeView(view);
        }
    }

    public m(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f68629b = frameLayout;
        r rVar = new r(context);
        this.f68630c = rVar;
        super.addView(frameLayout, -1, new FrameLayout.LayoutParams(-1, -1));
        super.addView(rVar, -1, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        FrameLayout frameLayout = this.f68629b;
        if (view != frameLayout) {
            frameLayout.addView(view, i10);
        } else {
            super.addView(view, i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        FrameLayout frameLayout = this.f68629b;
        if (view != frameLayout) {
            frameLayout.addView(view, i10, i11);
        } else {
            super.addView(view, i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.f68629b;
        if (view != frameLayout) {
            frameLayout.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.f68629b;
        if (view != frameLayout) {
            frameLayout.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }
}
