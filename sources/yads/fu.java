package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public final class fu implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f110912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f110914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f110915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f110916e;

    public fu(Context context, View.OnClickListener onClickListener) {
        this.f110912a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f110913b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f110912a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i10 = action & 255;
        if (i10 == 0) {
            this.f110915d = x10;
            this.f110916e = y10;
            this.f110914c = true;
            return false;
        }
        if (i10 == 1) {
            if (this.f110914c) {
                this.f110912a.onClick(view);
            }
            return true;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f110914c = false;
                return false;
            }
        } else if (this.f110914c) {
            int i11 = (int) (x10 - this.f110915d);
            int i12 = (int) (y10 - this.f110916e);
            if ((i12 * i12) + (i11 * i11) > this.f110913b) {
                this.f110914c = false;
            }
        }
        return false;
    }
}
