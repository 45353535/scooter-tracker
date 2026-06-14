package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.Iterator;
import java.util.List;
import k8.jk;
import k8.y0;
import kotlin.Metadata;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$¨\u0006*"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "Lk8/jk;", "divPager", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", FirebaseAnalytics.Param.ITEMS, "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "pagerView", "<init>", "(Lk8/jk;Ljava/util/List;Lcom/yandex/div/core/view2/BindingContext;Landroidx/recyclerview/widget/RecyclerView;Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)V", "", "trackVisibleViews", "()V", "trackVisibleChildren", "", "state", "onPageScrollStateChanged", "(I)V", C4240b4.i.L, "onPageSelected", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "Lk8/jk;", "Ljava/util/List;", "Lcom/yandex/div/core/view2/BindingContext;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "prevPosition", "I", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "minimumSignificantDx", "totalDelta", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final jk divPager;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final List<DivItemBuilderResult> items;
    private final int minimumSignificantDx;

    @NotNull
    private final DivPagerView pagerView;
    private int prevPosition = -1;

    @NotNull
    private final RecyclerView recyclerView;
    private int totalDelta;

    public DivPagerPageChangeCallback(@NotNull jk jkVar, @NotNull List<DivItemBuilderResult> list, @NotNull BindingContext bindingContext, @NotNull RecyclerView recyclerView, @NotNull DivPagerView divPagerView) {
        this.divPager = jkVar;
        this.items = list;
        this.bindingContext = bindingContext;
        this.recyclerView = recyclerView;
        this.pagerView = divPagerView;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVisibleChildren() {
        View view;
        int childAdapterPosition;
        Iterator it = ViewGroupKt.getChildren(this.recyclerView).iterator();
        while (it.hasNext() && (childAdapterPosition = this.recyclerView.getChildAdapterPosition((view = (View) it.next()))) != -1) {
            DivItemBuilderResult divItemBuilderResult = this.items.get(childAdapterPosition);
            this.divView.getDiv2Component().getVisibilityActionTracker().startTrackingViewsHierarchy(this.bindingContext.getFor(divItemBuilderResult.getExpressionResolver()), view, divItemBuilderResult.getDiv());
        }
    }

    private final void trackVisibleViews() {
        if (k.C(ViewGroupKt.getChildren(this.recyclerView)) > 0) {
            trackVisibleChildren();
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        if (!ViewsKt.isActuallyLaidOut(recyclerView) || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerPageChangeCallback$trackVisibleViews$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    this.this$0.trackVisibleChildren();
                }
            });
        } else {
            trackVisibleChildren();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    @SuppressLint({"SwitchIntDef"})
    public void onPageScrollStateChanged(int state) {
        super.onPageScrollStateChanged(state);
        if (state == 0) {
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        int width = this.minimumSignificantDx;
        if (width <= 0) {
            RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
            width = (layoutManager != null ? layoutManager.getWidth() : 0) / 20;
        }
        int i10 = this.totalDelta + positionOffsetPixels;
        this.totalDelta = i10;
        if (i10 > width) {
            this.totalDelta = 0;
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int position) {
        int i10;
        super.onPageSelected(position);
        trackVisibleViews();
        int i11 = this.prevPosition;
        if (position == i11) {
            return;
        }
        if (i11 != -1) {
            this.divView.unbindViewFromDiv$div_release(this.pagerView);
        }
        if (position == -1) {
            this.prevPosition = position;
            return;
        }
        int i12 = this.prevPosition;
        if (i12 != -1) {
            i10 = position;
            this.divView.getDiv2Component().getDiv2Logger().logPagerChangePage(this.divView, this.items.get(position).getExpressionResolver(), this.divPager, i10, position > i12 ? "next" : "back");
        } else {
            i10 = position;
        }
        y0 div = this.items.get(i10).getDiv();
        if (DivUtilKt.getHasSightActions(div.c())) {
            this.divView.bindViewToDiv$div_release(this.pagerView, div);
        }
        this.prevPosition = i10;
    }
}
