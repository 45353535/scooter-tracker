package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class x0 extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f61015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f61016b;

    public interface a {
        void a();
    }

    public x0(float f10, Context context) {
        super(context, 0, false);
        this.f61015a = e2.a(f10, -1.0f) == 0 ? 0.75f : f10;
    }

    public void a(a aVar) {
        this.f61016b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i10, int i11) {
        ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).width = (int) (getWidth() * this.f61015a);
        super.measureChildWithMargins(view, i10, i11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.f61016b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean a(View view) {
        return findViewByPosition(findFirstCompletelyVisibleItemPosition()) == view;
    }
}
