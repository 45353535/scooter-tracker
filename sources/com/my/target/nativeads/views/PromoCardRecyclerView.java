package com.my.target.nativeads.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.a3;
import com.my.target.bc;
import com.my.target.c9;
import com.my.target.common.models.ImageData;
import com.my.target.gb;
import com.my.target.kb;
import com.my.target.m8;
import com.my.target.ma;
import com.my.target.nativeads.banners.NativePromoCard;
import com.my.target.nativeads.views.PromoCardSnapHelper;
import com.my.target.nativeads.views.PromoCardView;
import com.my.target.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PromoCardRecyclerView extends RecyclerView implements c9, PromoCardSnapHelper.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f60395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PromoCardSnapHelper f60396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c9.a f60399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f60401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f60402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PromoCardAdapter f60403i;

    public static abstract class PromoCardAdapter extends RecyclerView.Adapter<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f60404a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f60405b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f60406c;

        public void a(c cVar) {
            this.f60406c = cVar;
        }

        public final /* synthetic */ void b(View view) {
            c cVar = this.f60406c;
            if (cVar != null) {
                cVar.a(view, 2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f60404a.size();
        }

        @NonNull
        public List<NativePromoCard> getNativePromoCards() {
            return this.f60405b;
        }

        @NonNull
        public abstract PromoCardView getPromoCardView();

        @SuppressLint({"NotifyDataSetChanged"})
        public void setCards(@NonNull List<NativePromoCard> list) {
            this.f60404a.clear();
            this.f60405b.clear();
            for (NativePromoCard nativePromoCard : list) {
                this.f60404a.add(new d(nativePromoCard));
                this.f60405b.add(nativePromoCard);
            }
            notifyDataSetChanged();
        }

        public final /* synthetic */ void a(View view) {
            c cVar = this.f60406c;
            if (cVar != null) {
                cVar.a(view, 1);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull f fVar, int i10) {
            PromoCardView promoCardViewA = fVar.a();
            ArrayList arrayList = new ArrayList(this.f60404a);
            ArrayList arrayList2 = new ArrayList(this.f60405b);
            if (i10 < arrayList.size() && arrayList.size() == arrayList2.size()) {
                a((NativePromoCard) arrayList2.get(i10), promoCardViewA, (PromoCardView.Card) arrayList.get(i10));
                c cVar = this.f60406c;
                if (cVar != null) {
                    cVar.a(i10);
                }
            }
            promoCardViewA.getView().setContentDescription("card_" + i10);
            promoCardViewA.getView().setOnClickListener(new View.OnClickListener() { // from class: p5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98065b.a(view);
                }
            });
            promoCardViewA.setCtaOnClickListener(new View.OnClickListener() { // from class: p5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98066b.b(view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public f onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            return new f(getPromoCardView());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(@NonNull f fVar) {
            NativePromoCard nativePromoCard;
            ImageData image;
            int layoutPosition = fVar.getLayoutPosition();
            PromoCardView promoCardViewA = fVar.a();
            ma maVar = (ma) promoCardViewA.getMediaAdView().getImageView();
            maVar.setImageData(null);
            if (layoutPosition > 0 && layoutPosition < this.f60405b.size() && (nativePromoCard = (NativePromoCard) this.f60405b.get(layoutPosition)) != null && (image = nativePromoCard.getImage()) != null) {
                a3.a(image, maVar);
            }
            promoCardViewA.getView().setOnClickListener(null);
            promoCardViewA.setCtaOnClickListener(null);
            super.onViewRecycled(fVar);
        }

        public void b() {
            Iterator it = this.f60405b.iterator();
            while (it.hasNext()) {
                this.f60404a.add(new d((NativePromoCard) it.next()));
            }
            notifyDataSetChanged();
        }

        public void a() {
            this.f60404a.clear();
            notifyDataSetChanged();
        }

        public final void a(NativePromoCard nativePromoCard, PromoCardView promoCardView, PromoCardView.Card card) {
            if (nativePromoCard.getImage() != null) {
                promoCardView.getMediaAdView().setPlaceHolderDimension(nativePromoCard.getImage().getWidth(), nativePromoCard.getImage().getHeight());
                if (nativePromoCard.getImage().getData() != null) {
                    promoCardView.getMediaAdView().getImageView().setImageBitmap(nativePromoCard.getImage().getData());
                } else {
                    a3.b(nativePromoCard.getImage(), promoCardView.getMediaAdView().getImageView());
                }
            }
            promoCardView.setCard(card);
        }
    }

    public class a implements c {
        public a() {
        }

        @Override // com.my.target.m8
        public void a(View view, int i10) {
            PromoCardRecyclerView.this.a(view, i10);
        }

        @Override // com.my.target.nativeads.views.PromoCardRecyclerView.c
        public void a(int i10) {
            PromoCardRecyclerView.this.a(i10);
        }
    }

    public class b extends RecyclerView.OnScrollListener {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            PromoCardRecyclerView.this.f60398d = !r2.canScrollHorizontally(1);
            PromoCardRecyclerView promoCardRecyclerView = PromoCardRecyclerView.this;
            promoCardRecyclerView.f60397c = true ^ promoCardRecyclerView.canScrollHorizontally(-1);
        }
    }

    public interface c extends m8 {
        void a(int i10);
    }

    public static final class d extends PromoCardView.Card {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NativePromoCard f60409a;

        public d(NativePromoCard nativePromoCard) {
            this.f60409a = nativePromoCard;
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getCtaButtonText() {
            return this.f60409a.getCtaText();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getCurrency() {
            return this.f60409a.getCurrency();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getDescription() {
            return this.f60409a.getDescription();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getDiscountText() {
            return this.f60409a.getDiscount();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getOldPriceText() {
            return this.f60409a.getOldPrice();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getPriceText() {
            return this.f60409a.getPrice();
        }

        @Override // com.my.target.nativeads.views.PromoCardView.Card
        public String getTitle() {
            return this.f60409a.getTitle();
        }
    }

    public static final class e extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60410a;

        public e(int i10) {
            this.f60410a = i10 / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (state.getItemCount() == 1) {
                return;
            }
            if (childAdapterPosition == 0) {
                rect.right = this.f60410a;
            } else {
                if (childAdapterPosition == state.getItemCount() - 1) {
                    rect.left = this.f60410a;
                    return;
                }
                int i10 = this.f60410a;
                rect.right = i10;
                rect.left = i10;
            }
        }
    }

    public static class f extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromoCardView f60411a;

        public f(PromoCardView promoCardView) {
            super(promoCardView.getView());
            promoCardView.getView().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.f60411a = promoCardView;
        }

        public PromoCardView a() {
            return this.f60411a;
        }
    }

    public PromoCardRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    public void a(View view, int i10) {
        View viewFindContainingItemView;
        if (this.f60400f || (viewFindContainingItemView = this.f60395a.findContainingItemView(view)) == null) {
            return;
        }
        if (!this.f60395a.a(viewFindContainingItemView)) {
            smoothScrollBy(this.f60396b.calculateDistanceToFinalSnap(this.f60395a, viewFindContainingItemView)[0], 0);
            return;
        }
        int position = this.f60395a.getPosition(viewFindContainingItemView);
        c9.a aVar = this.f60399e;
        if (aVar == null || position < 0) {
            return;
        }
        aVar.a(viewFindContainingItemView, position, i10);
    }

    @Override // com.my.target.c9
    public void dispose() {
        PromoCardAdapter promoCardAdapter = this.f60403i;
        if (promoCardAdapter != null) {
            promoCardAdapter.a();
        }
    }

    @Override // com.my.target.c9
    @Nullable
    public Parcelable getState() {
        return this.f60395a.onSaveInstanceState();
    }

    @Override // com.my.target.c9
    @NonNull
    public int[] getVisibleCardNumbers() {
        int iFindFirstVisibleItemPosition = this.f60395a.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.f60395a.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (bc.a(this.f60395a.findViewByPosition(iFindFirstVisibleItemPosition)) < 50.0f) {
            iFindFirstVisibleItemPosition++;
        }
        if (bc.a(this.f60395a.findViewByPosition(iFindLastVisibleItemPosition)) < 50.0f) {
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

    @Override // com.my.target.nativeads.views.PromoCardSnapHelper.a
    public boolean isReachedEnd() {
        return this.f60398d;
    }

    @Override // com.my.target.nativeads.views.PromoCardSnapHelper.a
    public boolean isReachedStart() {
        return this.f60397c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        super.onScrollStateChanged(i10);
        boolean z10 = i10 != 0;
        this.f60400f = z10;
        if (z10) {
            return;
        }
        a();
    }

    @Override // com.my.target.c9
    public void restoreState(@NonNull Parcelable parcelable) {
        PromoCardAdapter promoCardAdapter = this.f60403i;
        if (promoCardAdapter != null) {
            promoCardAdapter.b();
        }
        this.f60395a.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof PromoCardAdapter) {
            setPromoCardAdapter((PromoCardAdapter) adapter);
        } else {
            gb.a("PromoCardRecyclerView: You must use setPromoCardAdapter(PromoCardAdapter) method with custom CardRecyclerView");
        }
    }

    public void setPromoCardAdapter(@Nullable PromoCardAdapter promoCardAdapter) {
        if (promoCardAdapter == null) {
            return;
        }
        this.f60403i = promoCardAdapter;
        promoCardAdapter.a(this.f60401g);
        this.f60395a.a(new x0.a() { // from class: p5.a
            @Override // com.my.target.x0.a
            public final void a() {
                this.f98064a.a();
            }
        });
        setLayoutManager(this.f60395a);
        super.swapAdapter(this.f60403i, true);
    }

    @Override // com.my.target.c9
    public void setPromoCardSliderListener(@Nullable c9.a aVar) {
        this.f60399e = aVar;
    }

    public PromoCardRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PromoCardRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1.0f, -1);
    }

    public PromoCardRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, float f10, int i11) {
        super(context, attributeSet, i10);
        this.f60401g = new a();
        this.f60402h = -1;
        this.f60395a = new x0(f10, getContext());
        setHasFixedSize(true);
        int iA = kb.a(i11 == -1 ? 16 : i11, context);
        PromoCardSnapHelper promoCardSnapHelper = new PromoCardSnapHelper(iA, this);
        this.f60396b = promoCardSnapHelper;
        promoCardSnapHelper.attachToRecyclerView(this);
        addItemDecoration(new e(iA));
        addOnScrollListener(new b());
    }

    public void a(int i10) {
        c9.a aVar = this.f60399e;
        if (aVar != null) {
            aVar.a(i10, getContext());
        }
    }

    public final void a() {
        int iFindFirstCompletelyVisibleItemPosition = this.f60395a.findFirstCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition >= 0 && this.f60402h != iFindFirstCompletelyVisibleItemPosition) {
            this.f60402h = iFindFirstCompletelyVisibleItemPosition;
            if (this.f60399e == null || this.f60395a.findViewByPosition(iFindFirstCompletelyVisibleItemPosition) == null) {
                return;
            }
            this.f60399e.a(new int[]{this.f60402h}, getContext());
        }
    }
}
