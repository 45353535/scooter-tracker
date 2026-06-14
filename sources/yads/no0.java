package yads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class no0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ti3 f113992a;

    public /* synthetic */ no0() {
        this(new ti3());
    }

    public final mo0 a(View view) {
        int iA;
        this.f113992a.getClass();
        RectF rectF = null;
        if (ti3.a(view)) {
            iA = qi3.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float fA = qi3.a(context, rect.left);
                float fD = zf.a.d(rect.top / context.getResources().getDisplayMetrics().density);
                float fD2 = zf.a.d(rect.right / context.getResources().getDisplayMetrics().density);
                float fD3 = zf.a.d(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f10 = fD3 - fD;
                if (fD2 - fA > 0.0f && f10 > 0.0f) {
                    rectF = new RectF(fA, fD, fD2, fD3);
                }
            }
        } else {
            iA = 0;
        }
        return new mo0(iA, rectF);
    }

    public no0(ti3 ti3Var) {
        this.f113992a = ti3Var;
    }
}
