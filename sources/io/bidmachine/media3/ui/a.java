package io.bidmachine.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import io.bidmachine.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p9.a;

/* JADX INFO: loaded from: classes12.dex */
final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f81591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f81592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f81594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private yb.a f81595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f81596g;

    public a(Context context) {
        this(context, null);
    }

    private static p9.a b(p9.a aVar) {
        a.b bVarP = aVar.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (aVar.f98082f == 0) {
            bVarP.h(1.0f - aVar.f98081e, 0);
        } else {
            bVarP.h((-aVar.f98081e) - 1.0f, 1);
        }
        int i10 = aVar.f98083g;
        if (i10 == 0) {
            bVarP.i(2);
        } else if (i10 == 2) {
            bVarP.i(0);
        }
        return bVarP.a();
    }

    @Override // io.bidmachine.media3.ui.SubtitleView.a
    public void a(List list, yb.a aVar, float f10, int i10, float f11) {
        this.f81592c = list;
        this.f81595f = aVar;
        this.f81594e = f10;
        this.f81593d = i10;
        this.f81596g = f11;
        while (this.f81591b.size() < list.size()) {
            this.f81591b.add(new d0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f81592c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float f10 = g0.f(this.f81593d, this.f81594e, height, i10);
        if (f10 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            p9.a aVarB = (p9.a) list.get(i11);
            if (aVarB.f98092p != Integer.MIN_VALUE) {
                aVarB = b(aVarB);
            }
            ((d0) this.f81591b.get(i11)).b(aVarB, this.f81595f, f10, g0.f(aVarB.f98090n, aVarB.f98091o, height, i10), this.f81596g, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81591b = new ArrayList();
        this.f81592c = Collections.EMPTY_LIST;
        this.f81593d = 0;
        this.f81594e = 0.0533f;
        this.f81595f = yb.a.f118892g;
        this.f81596g = 0.08f;
    }
}
