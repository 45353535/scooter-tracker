package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/view2/divs/ReleasingViewPool;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "releaseViewVisitor", "Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "(Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;)V", "viewsSet", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "clear", "", "getRecycledView", "viewType", "", "putRecycledView", "scrap", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReleasingViewPool extends RecyclerView.RecycledViewPool {

    @NotNull
    private final ReleaseViewVisitor releaseViewVisitor;

    @NotNull
    private final Set<RecyclerView.ViewHolder> viewsSet = new LinkedHashSet();

    public ReleasingViewPool(@NotNull ReleaseViewVisitor releaseViewVisitor) {
        this.releaseViewVisitor = releaseViewVisitor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void clear() {
        super.clear();
        Iterator<T> it = this.viewsSet.iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(this.releaseViewVisitor, ((RecyclerView.ViewHolder) it.next()).itemView);
        }
        this.viewsSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    @Nullable
    public RecyclerView.ViewHolder getRecycledView(int viewType) {
        RecyclerView.ViewHolder recycledView = super.getRecycledView(viewType);
        if (recycledView == null) {
            return null;
        }
        this.viewsSet.remove(recycledView);
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(@Nullable RecyclerView.ViewHolder scrap) {
        super.putRecycledView(scrap);
        if (scrap != null) {
            this.viewsSet.add(scrap);
        }
    }
}
