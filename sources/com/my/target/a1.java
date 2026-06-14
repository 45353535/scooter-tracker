package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class a1 extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f59076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59080g;

    public interface a {
        void a();
    }

    public a1(Context context) {
        super(context, 0, false);
        this.f59074a = kb.e(context).b(4);
    }

    public void a(a aVar) {
        this.f59076c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i10, int i11) {
        int height = getHeight();
        int width = getWidth();
        if (height != this.f59080g || width != this.f59079f || this.f59077d <= 0 || this.f59078e <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            float width2 = getWidth() / view.getMeasuredWidth();
            if (width2 > 1.0f) {
                this.f59077d = (int) (((double) width) / (Math.floor(width2) + 0.5d));
            } else {
                this.f59077d = (int) (width / 1.5f);
            }
            this.f59078e = height;
            this.f59079f = width;
            this.f59080g = height;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (view != getChildAt(0)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = kb.a(this.f59075b / 2, view.getContext());
        }
        if (view != getChildAt(getChildCount())) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = kb.a(this.f59075b / 2, view.getContext());
        }
        int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(width, getWidthMode(), 0, this.f59077d, canScrollHorizontally());
        int heightMode = getHeightMode();
        int i12 = this.f59074a;
        view.measure(childMeasureSpec, RecyclerView.LayoutManager.getChildMeasureSpec(height, heightMode, i12, height - (i12 * 2), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.f59076c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(int i10) {
        this.f59075b = i10;
    }

    public boolean a(View view) {
        int iFindFirstCompletelyVisibleItemPosition = findFirstCompletelyVisibleItemPosition();
        int position = getPosition(view);
        return iFindFirstCompletelyVisibleItemPosition <= position && position <= findLastCompletelyVisibleItemPosition();
    }
}
