package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import k8.td;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "recycler", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "galleryItemHelper", "Lk8/td;", "galleryDiv", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;Lk8/td;)V", "", "trackViews", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lcom/yandex/div/core/view2/BindingContext;", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "Lk8/td;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "minimumSignificantDx", "I", "totalDelta", "", "alreadyLogged", "Z", "", "direction", "Ljava/lang/String;", "getDirection", "()Ljava/lang/String;", "setDirection", "(Ljava/lang/String;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGalleryScrollListener extends RecyclerView.OnScrollListener {
    private boolean alreadyLogged;

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private String direction;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final td galleryDiv;

    @NotNull
    private final DivGalleryItemHelper galleryItemHelper;
    private final int minimumSignificantDx;

    @NotNull
    private final DivRecyclerView recycler;
    private int totalDelta;

    public DivGalleryScrollListener(@NotNull BindingContext bindingContext, @NotNull DivRecyclerView divRecyclerView, @NotNull DivGalleryItemHelper divGalleryItemHelper, @NotNull td tdVar) {
        this.bindingContext = bindingContext;
        this.recycler = divRecyclerView;
        this.galleryItemHelper = divGalleryItemHelper;
        this.galleryDiv = tdVar;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
        this.direction = "next";
    }

    private final void trackViews() {
        DivVisibilityActionTracker visibilityActionTracker = this.divView.getDiv2Component().getVisibilityActionTracker();
        visibilityActionTracker.updateVisibleViews(k.c0(ViewGroupKt.getChildren(this.recycler)));
        for (View view : ViewGroupKt.getChildren(this.recycler)) {
            int childAdapterPosition = this.recycler.getChildAdapterPosition(view);
            if (childAdapterPosition != -1) {
                RecyclerView.Adapter adapter = this.recycler.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
                visibilityActionTracker.startTrackingViewsHierarchy(this.bindingContext, view, ((DivGalleryAdapter) adapter).getVisibleItems().get(childAdapterPosition).getDiv());
            }
        }
        Map<View, y0> divWithWaitingDisappearActions = visibilityActionTracker.getDivWithWaitingDisappearActions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, y0> entry : divWithWaitingDisappearActions.entrySet()) {
            if (!k.B(ViewGroupKt.getChildren(this.recycler), entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            visibilityActionTracker.trackDetachedView(this.bindingContext, (View) entry2.getKey(), (y0) entry2.getValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == 1) {
            this.alreadyLogged = false;
        }
        if (newState == 0) {
            this.divView.getDiv2Component().getDiv2Logger().logGalleryCompleteScroll(this.divView, this.bindingContext.getExpressionResolver(), this.galleryDiv, this.galleryItemHelper.firstVisibleItemPosition(), this.galleryItemHelper.lastVisibleItemPosition(), this.direction);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        int iWidth = this.minimumSignificantDx;
        if (iWidth <= 0) {
            iWidth = this.galleryItemHelper.width() / 20;
        }
        int iAbs = this.totalDelta + Math.abs(dx) + Math.abs(dy);
        this.totalDelta = iAbs;
        if (iAbs > iWidth) {
            this.totalDelta = 0;
            if (!this.alreadyLogged) {
                this.alreadyLogged = true;
                this.divView.getDiv2Component().getDiv2Logger().logGalleryScroll(this.divView);
                this.direction = (dx > 0 || dy > 0) ? "next" : "back";
            }
            trackViews();
        }
    }
}
