package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4240b4;
import k8.jk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/WrapContentPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "isHorizontal", "", "parentSize", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "paddings", "Lk8/jk$c;", "alignment", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;ZILcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lk8/jk$c;)V", C4240b4.i.L, "", "getItemSize", "(I)Ljava/lang/Float;", "Landroidx/recyclerview/widget/RecyclerView;", "Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WrapContentPageSizeProvider extends DivPagerPageSizeProvider {
    private final boolean isHorizontal;

    @NotNull
    private final RecyclerView recyclerView;

    public WrapContentPageSizeProvider(@NotNull RecyclerView recyclerView, boolean z10, int i10, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull jk.c cVar) {
        super(i10, divPagerPaddingsHolder, cVar);
        this.recyclerView = recyclerView;
        this.isHorizontal = z10;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @Nullable
    public Float getItemSize(int position) {
        View viewFindViewByPosition;
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(position)) == null) {
            return null;
        }
        return Float.valueOf(this.isHorizontal ? viewFindViewByPosition.getWidth() : viewFindViewByPosition.getHeight());
    }
}
