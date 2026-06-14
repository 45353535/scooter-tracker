package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class rdp extends View {
    private final qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private View f16983ud;

    public interface qdl {
        View qdl(Context context);
    }

    public rdp(Context context, qdl qdlVar) {
        super(context);
        this.qdl = qdlVar;
        qdl();
    }

    private void qdl() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    private View ud() {
        qdl qdlVar;
        if (this.f16983ud == null && (qdlVar = this.qdl) != null) {
            this.f16983ud = qdlVar.qdl(getContext());
            qdl(this.f16983ud, (ViewGroup) getParent());
        }
        return this.f16983ud;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.f16983ud;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            ud();
        }
    }

    private void qdl(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
