package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.widget.ViewsKt;
import k8.jk;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\u0002*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00020\u0002*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001e\u001a\u00020\u0002*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/WrapContentPageSizeItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "", "parentSize", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "paddings", "Lk8/jk$c;", "alignment", "<init>", "(ILcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lk8/jk$c;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "I", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "Lk8/jk$c;", "getHorizontalOffset", "(Landroid/view/View;)I", "horizontalOffset", "getTopOffset", "topOffset", "getBottomOffset", "bottomOffset", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WrapContentPageSizeItemDecoration extends RecyclerView.ItemDecoration {

    @NotNull
    private final jk.c alignment;

    @NotNull
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jk.c.values().length];
            try {
                iArr[jk.c.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk.c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jk.c.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WrapContentPageSizeItemDecoration(int i10, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull jk.c cVar) {
        this.parentSize = i10;
        this.paddings = divPagerPaddingsHolder;
        this.alignment = cVar;
    }

    private final int getBottomOffset(View view) {
        float start;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = (this.parentSize - this.paddings.getStart()) - view.getMeasuredHeight();
        } else if (i10 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i10 != 3) {
                throw new m();
            }
            start = this.paddings.getEnd();
        }
        return a.d(start);
    }

    private final int getHorizontalOffset(View view) {
        float start;
        int measuredWidth;
        float measuredWidth2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = this.parentSize - this.paddings.getStart();
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (i10 == 2) {
                measuredWidth2 = (this.parentSize - view.getMeasuredWidth()) / 2.0f;
                return a.d(measuredWidth2);
            }
            if (i10 != 3) {
                throw new m();
            }
            start = this.parentSize - this.paddings.getEnd();
            measuredWidth = view.getMeasuredWidth();
        }
        measuredWidth2 = start - measuredWidth;
        return a.d(measuredWidth2);
    }

    private final int getTopOffset(View view) {
        float start;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            start = this.paddings.getStart();
        } else if (i10 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i10 != 3) {
                throw new m();
            }
            start = (this.parentSize - this.paddings.getEnd()) - view.getMeasuredHeight();
        }
        return a.d(start);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        View child;
        int width = parent.getWidth();
        DivPagerPaddingsHolder divPagerPaddingsHolder = this.paddings;
        int iD = width - a.d(divPagerPaddingsHolder.getLeft() + divPagerPaddingsHolder.getRight());
        int height = parent.getHeight();
        DivPagerPaddingsHolder divPagerPaddingsHolder2 = this.paddings;
        view.measure(ViewsKt.makeExactSpec(iD), ViewsKt.makeExactSpec(height - a.d(divPagerPaddingsHolder2.getTop() + divPagerPaddingsHolder2.getBottom())));
        DivPagerPageLayout divPagerPageLayout = view instanceof DivPagerPageLayout ? (DivPagerPageLayout) view : null;
        if (divPagerPageLayout == null || (child = divPagerPageLayout.getChild()) == null) {
            return;
        }
        Integer alignedLeft = this.paddings.getAlignedLeft();
        int iIntValue = alignedLeft != null ? alignedLeft.intValue() : getHorizontalOffset(child);
        Integer alignedTop = this.paddings.getAlignedTop();
        int iIntValue2 = alignedTop != null ? alignedTop.intValue() : getTopOffset(child);
        Integer alignedRight = this.paddings.getAlignedRight();
        int iIntValue3 = alignedRight != null ? alignedRight.intValue() : getHorizontalOffset(child);
        Integer alignedBottom = this.paddings.getAlignedBottom();
        outRect.set(iIntValue, iIntValue2, iIntValue3, alignedBottom != null ? alignedBottom.intValue() : getBottomOffset(child));
    }
}
