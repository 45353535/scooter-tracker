package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import k8.jp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import lf.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a/\u0010\u0017\u001a\u00020\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0004*\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u001d\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015\"$\u0010 \u001a\u0004\u0018\u00010\u0019\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "T", "Lcom/yandex/div/core/view2/items/Direction;", "direction", "", "currentItem", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/yandex/div/core/view2/items/Direction;)I", "completelyVisibleItemPosition", "", "canScroll", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "value", "Lk8/jp;", "sizeUnit", "Landroid/util/DisplayMetrics;", "metrics", "animated", "", "scrollTo", "(Landroidx/recyclerview/widget/RecyclerView;ILk8/jp;Landroid/util/DisplayMetrics;Z)V", "scrollRange", "(Landroidx/recyclerview/widget/RecyclerView;)I", "scrollOffset", "scrollToTheEnd", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/util/DisplayMetrics;Z)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "visibleItemPosition", "(Landroidx/recyclerview/widget/LinearLayoutManager;Lcom/yandex/div/core/view2/items/Direction;)I", "getItemCount", "itemCount", "getLinearLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivViewWithItemsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[jp.values().length];
            try {
                iArr2[jp.PX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[jp.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[jp.DP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final <T extends RecyclerView> boolean canScroll(T t10) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.getOrientation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return t10.canScrollHorizontally(1);
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return t10.canScrollVertically(1);
        }
        return false;
    }

    private static final <T extends RecyclerView> int completelyVisibleItemPosition(T t10, Direction direction) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager == null) {
            return -1;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i10 == 1) {
            return linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        }
        if (i10 == 2) {
            return canScroll(t10) ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() : linearLayoutManager.findLastCompletelyVisibleItemPosition();
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int currentItem(T t10, Direction direction) {
        Integer numValueOf = Integer.valueOf(completelyVisibleItemPosition(t10, direction));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager != null) {
            return visibleItemPosition(linearLayoutManager, direction);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getItemCount(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.getItemCount();
        }
        return 0;
    }

    private static final <T extends RecyclerView> LinearLayoutManager getLinearLayoutManager(T t10) {
        RecyclerView.LayoutManager layoutManager = t10.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollOffset(T t10) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.getOrientation()) : null;
        return (numValueOf != null && numValueOf.intValue() == 0) ? t10.computeHorizontalScrollOffset() : t10.computeVerticalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollRange(T t10) {
        int iComputeVerticalScrollRange;
        int paddingBottom;
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.getOrientation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            iComputeVerticalScrollRange = (t10.computeHorizontalScrollRange() - t10.getWidth()) + t10.getPaddingLeft();
            paddingBottom = t10.getPaddingRight();
        } else {
            iComputeVerticalScrollRange = (t10.computeVerticalScrollRange() - t10.getHeight()) + t10.getPaddingTop();
            paddingBottom = t10.getPaddingBottom();
        }
        return iComputeVerticalScrollRange + paddingBottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollTo(T t10, int i10, jp jpVar, DisplayMetrics displayMetrics, boolean z10) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[jpVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = BaseDivViewExtensionsKt.spToPx(Integer.valueOf(i10), displayMetrics);
            } else {
                if (i11 != 3) {
                    throw new m();
                }
                i10 = BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), displayMetrics);
            }
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager == null) {
            return;
        }
        Function2 divViewWithItemsKt$scrollTo$scroll$1 = z10 ? new DivViewWithItemsKt$scrollTo$scroll$1(t10) : new DivViewWithItemsKt$scrollTo$scroll$2(t10);
        int orientation = linearLayoutManager.getOrientation();
        if (orientation == 0) {
            divViewWithItemsKt$scrollTo$scroll$1.invoke(Integer.valueOf(i10 - t10.computeHorizontalScrollOffset()), 0);
        } else {
            if (orientation != 1) {
                return;
            }
            divViewWithItemsKt$scrollTo$scroll$1.invoke(0, Integer.valueOf(i10 - t10.computeVerticalScrollOffset()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollToTheEnd(T t10, DisplayMetrics displayMetrics, boolean z10) {
        scrollTo(t10, scrollRange(t10), jp.PX, displayMetrics, z10);
    }

    private static final int visibleItemPosition(LinearLayoutManager linearLayoutManager, Direction direction) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i10 == 1) {
            return linearLayoutManager.findLastVisibleItemPosition();
        }
        if (i10 == 2) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        throw new m();
    }
}
