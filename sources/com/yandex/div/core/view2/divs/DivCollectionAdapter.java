package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.f7;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002 !B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ \u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/divs/DivCollectionAdapter;", "VH", "Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;", "Lcom/yandex/div/core/view2/divs/VisibilityAwareAdapter;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "path", "Lcom/yandex/div/core/state/DivStatePath;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Ljava/util/List;)V", "ids", "", "applyPatch", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "divPatchCache", "Lcom/yandex/div/core/downloader/DivPatchCache;", "getItemViewType", "", C4240b4.i.L, "onBindViewHolder", "", "holder", "(Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;I)V", "onViewAttachedToWindow", "(Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;)V", "setItems", "newItems", "updateIds", "DiffUtilCallback", "UpdateCallBack", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivCollectionAdapter<VH extends DivCollectionViewHolder> extends VisibilityAwareAdapter<VH> {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private List<String> ids;

    @NotNull
    private final DivStatePath path;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivCollectionAdapter$DiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldItems", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "newItems", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItem", "newItem", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "suppressMissingVariableException", "", "suppress", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DiffUtilCallback extends DiffUtil.Callback {

        @NotNull
        private final List<DivItemBuilderResult> newItems;

        @NotNull
        private final List<DivItemBuilderResult> oldItems;

        public DiffUtilCallback(@NotNull List<DivItemBuilderResult> list, @NotNull List<DivItemBuilderResult> list2) {
            this.oldItems = list;
            this.newItems = list2;
        }

        private final void suppressMissingVariableException(DivItemBuilderResult divItemBuilderResult, boolean z10) {
            ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            if (asImpl == null) {
                return;
            }
            asImpl.setSuppressMissingVariableException(z10);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return areContentsTheSame((DivItemBuilderResult) CollectionsKt.getOrNull(this.oldItems, oldItemPosition), (DivItemBuilderResult) CollectionsKt.getOrNull(this.newItems, newItemPosition));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            y0 div;
            f7 f7VarC;
            Expression expressionF;
            y0 div2;
            f7 f7VarC2;
            Expression expressionF2;
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) CollectionsKt.getOrNull(this.oldItems, oldItemPosition);
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) CollectionsKt.getOrNull(this.newItems, newItemPosition);
            String str = null;
            String str2 = (divItemBuilderResult == null || (div2 = divItemBuilderResult.getDiv()) == null || (f7VarC2 = div2.c()) == null || (expressionF2 = f7VarC2.f()) == null) ? null : (String) expressionF2.evaluate(divItemBuilderResult.getExpressionResolver());
            if (divItemBuilderResult2 != null && (div = divItemBuilderResult2.getDiv()) != null && (f7VarC = div.c()) != null && (expressionF = f7VarC.f()) != null) {
                str = (String) expressionF.evaluate(divItemBuilderResult2.getExpressionResolver());
            }
            return (str2 == null && str == null) ? areContentsTheSame(divItemBuilderResult, divItemBuilderResult2) : Intrinsics.areEqual(str2, str);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.newItems.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.oldItems.size();
        }

        private final boolean areContentsTheSame(DivItemBuilderResult oldItem, DivItemBuilderResult newItem) {
            if (oldItem == null || newItem == null) {
                return Intrinsics.areEqual(oldItem, newItem);
            }
            suppressMissingVariableException(oldItem, true);
            suppressMissingVariableException(newItem, true);
            boolean zA = oldItem.getDiv().a(newItem.getDiv(), oldItem.getExpressionResolver(), newItem.getExpressionResolver());
            suppressMissingVariableException(oldItem, false);
            suppressMissingVariableException(newItem, false);
            return zA;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivCollectionAdapter$UpdateCallBack;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "newItems", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Lcom/yandex/div/core/view2/divs/DivCollectionAdapter;Ljava/util/List;)V", "onChanged", "", C4240b4.i.L, "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class UpdateCallBack implements ListUpdateCallback {

        @NotNull
        private final List<DivItemBuilderResult> newItems;

        public UpdateCallBack(@NotNull List<DivItemBuilderResult> list) {
            this.newItems = list;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int position, int count, @Nullable Object payload) {
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int position, int count) {
            int size = position + count > this.newItems.size() ? this.newItems.size() - count : position;
            DivCollectionAdapter.this.addItems(position, this.newItems.subList(size, count + size));
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int fromPosition, int toPosition) {
            onRemoved(fromPosition, 1);
            onInserted(toPosition, 1);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int position, int count) {
            for (int i10 = 0; i10 < count; i10++) {
                DivCollectionAdapter.this.removeItem(position);
            }
        }
    }

    public DivCollectionAdapter(@NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath, @NotNull List<DivItemBuilderResult> list) {
        super(list);
        this.bindingContext = bindingContext;
        this.path = divStatePath;
        this.ids = DivPathUtils.INSTANCE.getItemIds(list);
    }

    private final void updateIds() {
        this.ids = DivPathUtils.INSTANCE.getItemIds(getItems());
    }

    public final boolean applyPatch(@Nullable RecyclerView recyclerView, @NotNull DivPatchCache divPatchCache, @NotNull BindingContext bindingContext) {
        divPatchCache.getPatch(bindingContext.getDivView().getDataTag());
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) CollectionsKt.getOrNull(getVisibleItems(), position);
        if (divItemBuilderResult == null) {
            return 0;
        }
        Expression expressionF = divItemBuilderResult.getDiv().c().f();
        String str = expressionF != null ? (String) expressionF.evaluate(divItemBuilderResult.getExpressionResolver()) : null;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setItems(@NotNull List<DivItemBuilderResult> newItems) {
        DiffUtilCallback diffUtilCallback = new DiffUtilCallback(getItems(), newItems);
        DiffUtil.calculateDiff(diffUtilCallback).dispatchUpdatesTo(new UpdateCallBack(newItems));
        updateIds();
        subscribeOnElements();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull VH holder, int position) {
        ExpressionResolver expressionResolver;
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(position);
        DivStatePath divStatePathAppendDiv = this.path.appendDiv(this.ids.get(getItems().indexOf(divItemBuilderResult)));
        ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = this.bindingContext.getDivView().getRuntimeStore().resolveRuntimeWith(this.bindingContext.getDivView(), divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), this.bindingContext.getExpressionResolver());
        if (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) {
            expressionResolver = divItemBuilderResult.getExpressionResolver();
        }
        holder.bind(this.bindingContext.getFor(expressionResolver), divItemBuilderResult.getDiv(), position, divStatePathAppendDiv);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull VH holder) {
        super.onViewAttachedToWindow(holder);
        holder.updateState();
    }
}
