package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import k8.jk;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SBK\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b \u0010\u001cJ\u001f\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0014¢\u0006\u0004\b.\u0010\u0019J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0014¢\u0006\u0004\b/\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00104R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u0004058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010'\"\u0004\b=\u0010\u0019R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010G\u001a\u00020E2\u0006\u0010F\u001a\u00020E8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010;R\u0014\u0010O\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010'R\u0014\u0010P\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010JR\u0011\u0010R\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bQ\u0010'¨\u0006T"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "Lcom/yandex/div/core/view2/divs/DivCollectionAdapter;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerViewHolder;", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", FirebaseAnalytics.Param.ITEMS, "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Landroid/util/SparseArray;", "", "pageTranslations", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "pagerView", "<init>", "(Ljava/util/List;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/DivBinder;Landroid/util/SparseArray;Lcom/yandex/div/core/view2/DivViewCreator;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)V", "", "originalPosition", "", "notifyVirtualItemsChanged", "(I)V", C4240b4.i.L, "realItemPosition", "(I)I", "visibleItemIndex", "getPosition", "rawPosition", "getRealPosition", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/yandex/div/core/view2/divs/pager/DivPagerViewHolder;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Lcom/yandex/div/core/view2/divs/pager/DivPagerViewHolder;I)V", "newItems", "setItems", "(Ljava/util/List;)V", "notifyRawItemRemoved", "notifyRawItemInserted", "Lcom/yandex/div/core/view2/BindingContext;", "Lcom/yandex/div/core/view2/DivBinder;", "Landroid/util/SparseArray;", "Lcom/yandex/div/core/view2/DivViewCreator;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lkotlin/collections/AbstractList;", "itemsToShow", "Lkotlin/collections/AbstractList;", "getItemsToShow", "()Lkotlin/collections/AbstractList;", "orientation", "I", "getOrientation", "setOrientation", "Lk8/jk$c;", "crossAxisAlignment", "Lk8/jk$c;", "getCrossAxisAlignment", "()Lk8/jk$c;", "setCrossAxisAlignment", "(Lk8/jk$c;)V", "", "value", "infiniteScrollEnabled", "Z", "getInfiniteScrollEnabled", "()Z", "setInfiniteScrollEnabled", "(Z)V", "removedItems", "getOffsetToRealItem", "offsetToRealItem", "isHorizontal", "getCurrentItem", "currentItem", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerAdapter extends DivCollectionAdapter<DivPagerViewHolder> {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private jk.c crossAxisAlignment;

    @NotNull
    private final DivBinder divBinder;
    private boolean infiniteScrollEnabled;

    @NotNull
    private final AbstractList<DivItemBuilderResult> itemsToShow;
    private int orientation;

    @NotNull
    private final SparseArray<Float> pageTranslations;

    @NotNull
    private final DivPagerView pagerView;
    private int removedItems;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivPagerAdapter(@NotNull List<DivItemBuilderResult> list, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull SparseArray<Float> sparseArray, @NotNull DivViewCreator divViewCreator, @NotNull DivStatePath divStatePath, @NotNull DivPagerView divPagerView) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.pageTranslations = sparseArray;
        this.viewCreator = divViewCreator;
        this.pagerView = divPagerView;
        this.itemsToShow = new AbstractList<DivItemBuilderResult>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$itemsToShow$1
            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
            public int getSize() {
                return this.this$0.getVisibleItems().size() + (this.this$0.getInfiniteScrollEnabled() ? 4 : 0);
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            @Override // kotlin.collections.AbstractList, java.util.List
            @NotNull
            public DivItemBuilderResult get(int index) {
                return !this.this$0.getInfiniteScrollEnabled() ? this.this$0.getVisibleItems().get(index) : this.this$0.getVisibleItems().get(this.this$0.realItemPosition(index));
            }

            @Override // kotlin.collections.AbstractList, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            @Override // kotlin.collections.AbstractList, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }
        };
        this.crossAxisAlignment = jk.c.START;
    }

    private final int getOffsetToRealItem() {
        return this.infiniteScrollEnabled ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHorizontal() {
        return this.orientation == 0;
    }

    private final void notifyVirtualItemsChanged(int originalPosition) {
        if (originalPosition >= 0 && originalPosition < 2) {
            notifyItemRangeChanged(getVisibleItems().size() + originalPosition, 2 - originalPosition);
            return;
        }
        int size = getVisibleItems().size() - 2;
        if (originalPosition >= getVisibleItems().size() || size > originalPosition) {
            return;
        }
        notifyItemRangeChanged((originalPosition - getVisibleItems().size()) + 2, 2);
    }

    @NotNull
    public final jk.c getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int getCurrentItem() {
        return this.pagerView.getCurrentItem$div_release();
    }

    public final boolean getInfiniteScrollEnabled() {
        return this.infiniteScrollEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemsToShow.size();
    }

    @NotNull
    public final AbstractList<DivItemBuilderResult> getItemsToShow() {
        return this.itemsToShow;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPosition(int visibleItemIndex) {
        return visibleItemIndex + getOffsetToRealItem();
    }

    public final int getRealPosition(int rawPosition) {
        return rawPosition - getOffsetToRealItem();
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    protected void notifyRawItemInserted(int position) {
        if (!this.infiniteScrollEnabled) {
            notifyItemInserted(position);
        } else {
            notifyItemInserted(position + 2);
            notifyVirtualItemsChanged(position);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    protected void notifyRawItemRemoved(int position) {
        this.removedItems++;
        if (!this.infiniteScrollEnabled) {
            notifyItemRemoved(position);
        } else {
            notifyItemRemoved(position + 2);
            notifyVirtualItemsChanged(position);
        }
    }

    public final int realItemPosition(int position) {
        Integer numValueOf = Integer.valueOf(getVisibleItems().size());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return 0;
        }
        int iIntValue = numValueOf.intValue();
        return (getRealPosition(position) + iIntValue) % iIntValue;
    }

    public final void setCrossAxisAlignment(@NotNull jk.c cVar) {
        this.crossAxisAlignment = cVar;
    }

    public final void setInfiniteScrollEnabled(boolean z10) {
        if (this.infiniteScrollEnabled == z10) {
            return;
        }
        this.infiniteScrollEnabled = z10;
        notifyItemRangeChanged(0, getItemCount());
        DivPagerView divPagerView = this.pagerView;
        divPagerView.setCurrentItem$div_release(divPagerView.getCurrentItem$div_release() + (z10 ? 2 : -2));
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void setItems(@NotNull List<DivItemBuilderResult> newItems) {
        int size = getItems().size();
        this.removedItems = 0;
        int currentItem = getCurrentItem();
        super.setItems(newItems);
        if (this.removedItems == size) {
            this.pagerView.setCurrentItem$div_release(currentItem);
        }
    }

    public final void setOrientation(int i10) {
        this.orientation = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DivPagerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new DivPagerViewHolder(this.bindingContext, new DivPagerPageLayout(this.bindingContext.getDivView().getContext(), new Function0<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$view$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isHorizontal());
            }
        }), this.divBinder, this.viewCreator, new Function0<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter.onCreateViewHolder.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(DivPagerAdapter.this.isHorizontal());
            }
        }, new Function0<jk.c>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter.onCreateViewHolder.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final jk.c invoke() {
                return DivPagerAdapter.this.getCrossAxisAlignment();
            }
        });
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void onBindViewHolder(@NotNull DivPagerViewHolder holder, int position) {
        super.onBindViewHolder(holder, realItemPosition(position));
        Float f10 = this.pageTranslations.get(position);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            if (isHorizontal()) {
                holder.itemView.setTranslationX(fFloatValue);
            } else {
                holder.itemView.setTranslationY(fFloatValue);
            }
        }
    }
}
