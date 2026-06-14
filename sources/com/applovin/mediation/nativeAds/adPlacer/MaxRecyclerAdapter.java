package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.e5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f11779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RecyclerView.Adapter f11780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f11781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f11782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e5 f11783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f11784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f11786h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f11788a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f11788a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f11788a;
        }
    }

    class a implements e5.a {
        a() {
        }

        @Override // com.applovin.impl.e5.a
        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.f11779a.updateFillablePositions(i10, Math.min(i11 + MaxRecyclerAdapter.this.f11785g, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    private class b extends RecyclerView.AdapterDataObserver {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f11779a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f11779a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f11780b.getItemCount();
            if (MaxRecyclerAdapter.this.f11786h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f11786h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f11779a.getAdjustedPosition(i10);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f11779a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f11780b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f11786h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f11786h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f11779a.getAdjustedPosition(i10);
            int adjustedCount = MaxRecyclerAdapter.this.f11779a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f11779a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f11779a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f11779a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i11), size);
        }

        /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        b bVar = new b(this, null);
        this.f11781c = bVar;
        this.f11785g = 8;
        this.f11786h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f11779a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f11780b = adapter;
        adapter.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f11780b.unregisterAdapterDataObserver(this.f11781c);
        } catch (Exception unused) {
        }
        this.f11779a.destroy();
        e5 e5Var = this.f11783e;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f11779a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f11779a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11779a.getAdjustedCount(this.f11780b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        if (this.f11780b.hasStableIds()) {
            return this.f11779a.isFilledPosition(i10) ? this.f11779a.getAdItemId(i10) : this.f11780b.getItemId(this.f11779a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (this.f11779a.isAdPosition(i10)) {
            return -42;
        }
        return this.f11780b.getItemViewType(this.f11779a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f11779a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f11779a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f11784f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f11784f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f11784f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f11784f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f11782d = recyclerView;
        e5 e5Var = new e5(recyclerView);
        this.f11783e = e5Var;
        e5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        this.f11783e.a(viewHolder.itemView, i10);
        if (!this.f11779a.isAdPosition(i10)) {
            this.f11780b.onBindViewHolder(viewHolder, this.f11779a.getOriginalPosition(i10));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f11779a.getAdSize(i10);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f11779a.renderAd(i10, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 != -42) {
            return this.f11780b.onCreateViewHolder(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.f11782d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f11782d = null;
        e5 e5Var = this.f11783e;
        if (e5Var != null) {
            e5Var.a();
            this.f11783e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f11780b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f11780b.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f11780b.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        e5 e5Var = this.f11783e;
        if (e5Var != null) {
            e5Var.b(viewHolder.itemView);
        }
        if (!(viewHolder instanceof MaxAdRecyclerViewHolder)) {
            this.f11780b.onViewRecycled(viewHolder);
            return;
        }
        if (this.f11779a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
        }
        super.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f11786h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f11780b.unregisterAdapterDataObserver(this.f11781c);
        this.f11780b.setHasStableIds(z10);
        this.f11780b.registerAdapterDataObserver(this.f11781c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f11784f = listener;
    }

    public void setLookAhead(int i10) {
        this.f11785g = i10;
    }
}
