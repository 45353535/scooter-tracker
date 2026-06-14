package com.google.android.material.dialog;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class InsetDialogOnTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Dialog f26477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26480e;

    public InsetDialogOnTouchListener(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f26477b = dialog;
        this.f26478c = rect.left;
        this.f26479d = rect.top;
        this.f26480e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f26478c + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f26479d + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f26480e;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f26477b.onTouchEvent(motionEventObtain);
    }
}
