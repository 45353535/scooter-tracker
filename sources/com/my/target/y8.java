package com.my.target;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.c9;
import com.my.target.x0;
import com.my.target.x8;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class y8 extends RecyclerView implements z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f61098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x8.c f61099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8 f61100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f61101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c9.a f61102e;

    public static class b extends LinearLayoutManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x0.a f61104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f61105b;

        public b(Context context) {
            super(context, 0, false);
        }

        public void a(x0.a aVar) {
            this.f61104a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void measureChildWithMargins(View view, int i10, int i11) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int width = getWidth();
            if (getHeight() <= 0 || width <= 0) {
                return;
            }
            if (getItemViewType(view) == 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f61105b;
            } else if (getItemViewType(view) == 2) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f61105b;
            } else {
                int i12 = this.f61105b;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i12;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i12;
            }
            super.measureChildWithMargins(view, i10, i11);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            x0.a aVar = this.f61104a;
            if (aVar != null) {
                aVar.a();
            }
        }

        public void a(int i10) {
            this.f61105b = i10;
        }
    }

    public y8(Context context) {
        this(context, null);
    }

    private void setCardLayoutManager(b bVar) {
        bVar.a(new x0.a() { // from class: k5.z2
            @Override // com.my.target.x0.a
            public final void a() {
                this.f86173a.a();
            }
        });
        super.setLayoutManager(bVar);
    }

    @Override // com.my.target.c9
    public void dispose() {
        this.f61100c.a();
    }

    @Override // com.my.target.c9
    public Parcelable getState() {
        return this.f61098a.onSaveInstanceState();
    }

    @Override // com.my.target.z8
    public View getView() {
        return this;
    }

    @Override // com.my.target.c9
    @NonNull
    public int[] getVisibleCardNumbers() {
        int iFindFirstVisibleItemPosition = this.f61098a.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.f61098a.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (bc.a(this.f61098a.findViewByPosition(iFindFirstVisibleItemPosition)) < 50.0f) {
            iFindFirstVisibleItemPosition++;
        }
        if (bc.a(this.f61098a.findViewByPosition(iFindLastVisibleItemPosition)) < 50.0f) {
            iFindLastVisibleItemPosition--;
        }
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return new int[0];
        }
        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
            return new int[]{iFindFirstVisibleItemPosition};
        }
        int i10 = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = iFindFirstVisibleItemPosition;
            iFindFirstVisibleItemPosition++;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        super.onScrollStateChanged(i10);
        boolean z10 = i10 != 0;
        this.f61101d = z10;
        if (z10) {
            return;
        }
        a();
    }

    @Override // com.my.target.c9
    public void restoreState(Parcelable parcelable) {
        this.f61098a.onRestoreInstanceState(parcelable);
    }

    @Override // com.my.target.c9
    public void setPromoCardSliderListener(@Nullable c9.a aVar) {
        this.f61102e = aVar;
    }

    @Override // com.my.target.z8
    public void setupCards(@NonNull List<d7> list) {
        this.f61100c.a(list);
        if (isClickable()) {
            this.f61100c.a(this.f61099b);
        }
        setCardLayoutManager(this.f61098a);
        swapAdapter(this.f61100c, true);
    }

    public y8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c9.a aVar = this.f61102e;
        if (aVar != null) {
            aVar.a(getVisibleCardNumbers(), getContext());
        }
    }

    public y8(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f61099b = new a();
        b bVar = new b(context);
        this.f61098a = bVar;
        bVar.a(kb.a(4, context));
        this.f61100c = new x8(getContext());
        setHasFixedSize(true);
    }

    public class a implements x8.c {
        public a() {
        }

        @Override // com.my.target.m8
        public void a(View view, int i10) {
            View viewFindContainingItemView;
            int position;
            y8 y8Var = y8.this;
            if (y8Var.f61101d || !y8Var.isClickable() || (viewFindContainingItemView = y8.this.f61098a.findContainingItemView(view)) == null) {
                return;
            }
            y8 y8Var2 = y8.this;
            if (y8Var2.f61102e == null || (position = y8Var2.f61098a.getPosition(viewFindContainingItemView)) < 0) {
                return;
            }
            y8.this.f61102e.a(viewFindContainingItemView, position, i10);
        }

        @Override // com.my.target.x8.c
        public void a(int i10) {
            y8 y8Var = y8.this;
            c9.a aVar = y8Var.f61102e;
            if (aVar != null) {
                aVar.a(i10, y8Var.getContext());
            }
        }
    }
}
