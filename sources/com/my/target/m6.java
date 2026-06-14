package com.my.target;

import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class m6 extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f60132a;

    public interface a {
        void b();
    }

    public m6(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        a aVar;
        super.onScrollStateChanged(i10);
        if (i10 == 0 && (aVar = this.f60132a) != null) {
            aVar.b();
        }
    }

    public void setMoveStopListener(@Nullable a aVar) {
        this.f60132a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i10, int i11) {
        super.smoothScrollBy(i10, i11, new AccelerateDecelerateInterpolator());
    }
}
