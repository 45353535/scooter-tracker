package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/state/UpdateStateScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "blockId", "", "divViewState", "Lcom/yandex/div/core/state/DivViewState;", "layoutManager", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "(Ljava/lang/String;Lcom/yandex/div/core/state/DivViewState;Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;)V", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpdateStateScrollListener extends RecyclerView.OnScrollListener {

    @NotNull
    private final String blockId;

    @NotNull
    private final DivViewState divViewState;

    @NotNull
    private final DivGalleryItemHelper layoutManager;

    public UpdateStateScrollListener(@NotNull String str, @NotNull DivViewState divViewState, @NotNull DivGalleryItemHelper divGalleryItemHelper) {
        this.blockId = str;
        this.divViewState = divViewState;
        this.layoutManager = divGalleryItemHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        View view;
        super.onScrolled(recyclerView, dx, dy);
        int iFirstVisibleItemPosition = this.layoutManager.firstVisibleItemPosition();
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iFirstVisibleItemPosition);
        this.divViewState.putBlockState(this.blockId, new GalleryState(iFirstVisibleItemPosition, (viewHolderFindViewHolderForLayoutPosition == null || (view = viewHolderFindViewHolderForLayoutPosition.itemView) == null) ? 0 : this.layoutManager.calcScrollOffset(view)));
    }
}
