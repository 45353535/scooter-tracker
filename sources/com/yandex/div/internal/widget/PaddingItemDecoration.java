package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Px;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/internal/widget/PaddingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "paddingLeft", "", "midItemPadding", "crossItemPadding", "paddingRight", "paddingTop", "paddingBottom", "orientation", "(IIIIIII)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaddingItemDecoration extends RecyclerView.ItemDecoration {

    @Px
    private final int crossItemPadding;

    @Px
    private final int midItemPadding;
    private final int orientation;

    @Px
    private final int paddingBottom;

    @Px
    private final int paddingLeft;

    @Px
    private final int paddingRight;

    @Px
    private final int paddingTop;

    public /* synthetic */ PaddingItemDecoration(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i10, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        int spanCount;
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            spanCount = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unsupported layoutManger: " + layoutManager);
                }
            }
            spanCount = 1;
        }
        if (spanCount != 1) {
            int i10 = this.midItemPadding / 2;
            int i11 = this.crossItemPadding / 2;
            int i12 = this.orientation;
            if (i12 == 0) {
                outRect.set(i10, i11, i10, i11);
                return;
            }
            if (i12 == 1) {
                outRect.set(i11, i10, i11, i10);
                return;
            }
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported orientation: " + this.orientation);
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            boolean z10 = childAdapterPosition == 0;
            int i13 = itemCount - 1;
            boolean z11 = childAdapterPosition == i13;
            int i14 = this.orientation;
            if (i14 == 0) {
                if (ViewsKt.isLayoutRtl(parent)) {
                    z10 = childAdapterPosition == i13;
                    z11 = childAdapterPosition == 0;
                }
                outRect.set(z10 ? this.paddingLeft : 0, this.paddingTop, z11 ? this.paddingRight : this.midItemPadding, this.paddingBottom);
                return;
            }
            if (i14 == 1) {
                outRect.set(this.paddingLeft, z10 ? this.paddingTop : 0, this.paddingRight, z11 ? this.paddingBottom : this.midItemPadding);
                return;
            }
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported orientation: " + this.orientation);
            }
        }
    }

    public PaddingItemDecoration(@Px int i10, @Px int i11, @Px int i12, @Px int i13, @Px int i14, @Px int i15, int i16) {
        this.paddingLeft = i10;
        this.midItemPadding = i11;
        this.crossItemPadding = i12;
        this.paddingRight = i13;
        this.paddingTop = i14;
        this.paddingBottom = i15;
        this.orientation = i16;
    }
}
