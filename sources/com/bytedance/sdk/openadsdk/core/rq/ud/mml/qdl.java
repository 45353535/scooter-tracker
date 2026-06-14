package com.bytedance.sdk.openadsdk.core.rq.ud.mml;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.adsdk.ugeno.yoga.ud.lnr;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends FrameLayout {
    private final C0275qdl lnr;
    private mml mml;
    private final RecyclerView qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final List<lnr> f17462ud;

    private static class ud extends RecyclerView.ViewHolder {
        private final ViewGroup qdl;

        public ud(@NonNull View view) {
            super(view);
            this.qdl = (ViewGroup) view;
        }

        public void qdl(lnr lnrVar) {
            View viewRq = lnrVar.rq();
            ViewParent parent = viewRq.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewRq);
            }
            this.qdl.removeAllViews();
            this.qdl.addView(viewRq, new lnr.qdl(lnrVar.fco(), lnrVar.mrf()));
        }
    }

    public qdl(@NonNull Context context) {
        super(context);
        this.f17462ud = new CopyOnWriteArrayList();
        C0275qdl c0275qdl = new C0275qdl();
        this.lnr = c0275qdl;
        RecyclerView recyclerView = new RecyclerView(context);
        this.qdl = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0275qdl);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            this.qdl.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.qdl.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
        if (lnrVar == null) {
            return;
        }
        this.f17462ud.add(lnrVar);
        C0275qdl c0275qdl = this.lnr;
        if (c0275qdl != null) {
            c0275qdl.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.rq.ud.mml.qdl$qdl, reason: collision with other inner class name */
    private class C0275qdl extends RecyclerView.Adapter<ud> {
        private C0275qdl() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return qdl.this.f17462ud.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public ud onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            com.bytedance.adsdk.ugeno.yoga.ud.lnr lnrVar = new com.bytedance.adsdk.ugeno.yoga.ud.lnr(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.ud.lnr lnrVar2 = (com.bytedance.adsdk.ugeno.ud.lnr) qdl.this.f17462ud.get(i10);
            lnrVar.setLayoutParams(new ViewGroup.LayoutParams(lnrVar2.fco(), lnrVar2.mrf()));
            return new ud(lnrVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull ud udVar, int i10) {
            udVar.qdl((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this.f17462ud.get(i10));
        }
    }

    public void qdl(mml mmlVar) {
        this.mml = mmlVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.rq.ud.mml.ud udVar) {
        ViewGroup.LayoutParams layoutParams = this.qdl.getLayoutParams();
        layoutParams.width = udVar.fco();
        layoutParams.height = udVar.mrf();
        this.qdl.setLayoutParams(layoutParams);
    }
}
