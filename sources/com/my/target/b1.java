package com.my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.a1;
import com.my.target.c1;
import com.my.target.common.NavigationType;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes11.dex */
public class b1 extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f59232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearSnapHelper f59233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f59234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1.b f59235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View.OnClickListener f59236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View.OnClickListener f59239h;

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list;
            ViewParent parent = view.getParent();
            while (parent != 0 && !(parent instanceof u0)) {
                parent = parent.getParent();
            }
            b1 b1Var = b1.this;
            c1.b bVar = b1Var.f59235d;
            if (bVar == null || (list = b1Var.f59234c) == null || parent == 0) {
                return;
            }
            bVar.a((g4) list.get(b1Var.getCardLayoutManager().getPosition((View) parent)), 2);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View viewFindContainingItemView;
            b1 b1Var;
            c1.b bVar;
            List list;
            b1 b1Var2 = b1.this;
            if (b1Var2.f59237f || (viewFindContainingItemView = b1Var2.getCardLayoutManager().findContainingItemView(view)) == null) {
                return;
            }
            if (!b1.this.getCardLayoutManager().a(viewFindContainingItemView)) {
                b1 b1Var3 = b1.this;
                if (!b1Var3.f59238g) {
                    b1Var3.a(viewFindContainingItemView);
                    return;
                }
            }
            if (!view.isClickable() || (bVar = (b1Var = b1.this).f59235d) == null || (list = b1Var.f59234c) == null) {
                return;
            }
            bVar.a((g4) list.get(b1Var.getCardLayoutManager().getPosition(viewFindContainingItemView)), 1);
        }
    }

    public static class c extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f59242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f59243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f59244c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f59245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View.OnClickListener f59246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View.OnClickListener f59247f;

        public c(List list, Context context) {
            this.f59243b = list;
            this.f59242a = context;
            this.f59245d = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        }

        public List a() {
            return this.f59243b;
        }

        public void b(View.OnClickListener onClickListener) {
            this.f59247f = onClickListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return a().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            if (i10 == 0) {
                return 1;
            }
            return i10 == getItemCount() - 1 ? 2 : 0;
        }

        public void a(View.OnClickListener onClickListener) {
            this.f59246e = onClickListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(d dVar, int i10) {
            u0 u0VarA = dVar.a();
            g4 g4Var = (g4) a().get(i10);
            if (!this.f59244c.contains(g4Var)) {
                this.f59244c.add(g4Var);
                bb.b(g4Var.x(), Reporting.EventType.RENDER, 1, dVar.itemView.getContext());
            }
            a(g4Var, u0VarA);
            u0VarA.a(this.f59246e, g4Var.g(), this.f59247f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public d onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new d(new u0(this.f59245d, this.f59242a));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(d dVar) {
            dVar.a().a(null, null, null);
        }

        public final void a(g4 g4Var, u0 u0Var) {
            ImageData imageDataS = g4Var.s();
            if (imageDataS != null) {
                ma smartImageView = u0Var.getSmartImageView();
                smartImageView.setPlaceholderDimensions(imageDataS.getWidth(), imageDataS.getHeight());
                a3.b(imageDataS, smartImageView);
            }
            u0Var.getTitleTextView().setText(g4Var.A());
            u0Var.getDescriptionTextView().setText(g4Var.k());
            u0Var.getCtaButtonView().setText(g4Var.i());
            TextView domainTextView = u0Var.getDomainTextView();
            String strN = g4Var.n();
            StarsRatingView ratingView = u0Var.getRatingView();
            if (NavigationType.WEB.equals(g4Var.t())) {
                ratingView.setVisibility(8);
                domainTextView.setVisibility(0);
                domainTextView.setText(strN);
                return;
            }
            domainTextView.setVisibility(8);
            float fW = g4Var.w();
            if (fW > 0.0f) {
                ratingView.setVisibility(0);
                ratingView.setRating(fW);
            } else {
                ratingView.setVisibility(8);
            }
        }
    }

    public static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f59248a;

        public d(u0 u0Var) {
            super(u0Var);
            this.f59248a = u0Var;
        }

        public u0 a() {
            return this.f59248a;
        }
    }

    public b1(Context context) {
        this(context, null);
    }

    @NonNull
    private List<g4> getVisibleCards() {
        int iFindFirstCompletelyVisibleItemPosition;
        int iFindLastCompletelyVisibleItemPosition;
        ArrayList arrayList = new ArrayList();
        if (this.f59234c != null && (iFindFirstCompletelyVisibleItemPosition = getCardLayoutManager().findFirstCompletelyVisibleItemPosition()) <= (iFindLastCompletelyVisibleItemPosition = getCardLayoutManager().findLastCompletelyVisibleItemPosition()) && iFindFirstCompletelyVisibleItemPosition >= 0 && iFindLastCompletelyVisibleItemPosition < this.f59234c.size()) {
            while (iFindFirstCompletelyVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition) {
                arrayList.add((g4) this.f59234c.get(iFindFirstCompletelyVisibleItemPosition));
                iFindFirstCompletelyVisibleItemPosition++;
            }
        }
        return arrayList;
    }

    private void setCardLayoutManager(@NonNull a1 a1Var) {
        a1Var.a(new a1.a() { // from class: k5.h
            @Override // com.my.target.a1.a
            public final void a() {
                this.f86043a.a();
            }
        });
        super.setLayoutManager(a1Var);
    }

    public void a(List list) {
        c cVar = new c(list, getContext());
        this.f59234c = list;
        cVar.a(this.f59239h);
        cVar.b(this.f59236e);
        setCardLayoutManager(this.f59232a);
        setAdapter(cVar);
    }

    @VisibleForTesting(otherwise = 3)
    public a1 getCardLayoutManager() {
        return this.f59232a;
    }

    @NonNull
    @VisibleForTesting
    public LinearSnapHelper getSnapHelper() {
        return this.f59233b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (i12 > i13) {
            this.f59238g = true;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        super.onScrollStateChanged(i10);
        boolean z10 = i10 != 0;
        this.f59237f = z10;
        if (z10) {
            return;
        }
        a();
    }

    public void setCarouselListener(@Nullable c1.b bVar) {
        this.f59235d = bVar;
    }

    public void setSideSlidesMargins(int i10) {
        getCardLayoutManager().a(i10);
    }

    public b1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f59236e = new a();
        this.f59239h = new b();
        setOverScrollMode(2);
        this.f59232a = new a1(context);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        this.f59233b = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(this);
    }

    public void a(boolean z10) {
        if (z10) {
            this.f59233b.attachToRecyclerView(this);
        } else {
            this.f59233b.attachToRecyclerView(null);
        }
    }

    public void a(View view) {
        int[] iArrCalculateDistanceToFinalSnap = this.f59233b.calculateDistanceToFinalSnap(getCardLayoutManager(), view);
        if (iArrCalculateDistanceToFinalSnap != null) {
            smoothScrollBy(iArrCalculateDistanceToFinalSnap[0], 0);
        }
    }

    public final void a() {
        c1.b bVar = this.f59235d;
        if (bVar != null) {
            bVar.a(getVisibleCards());
        }
    }
}
