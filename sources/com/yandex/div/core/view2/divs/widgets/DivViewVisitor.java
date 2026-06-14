package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH\u0016¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;", "", "()V", "defaultVisit", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "visit", "Landroid/view/View;", "Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;", "Lcom/yandex/div/core/view2/divs/widgets/DivFrameLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivImageView;", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "Lcom/yandex/div/core/view2/divs/widgets/DivLinearLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;", "Lcom/yandex/div/core/view2/divs/widgets/DivSeparatorView;", "Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivSwitchView;", "Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivViewVisitor {
    public void defaultVisit(@NotNull DivHolderView<?> view) {
    }

    public void visit(@NotNull View view) {
    }

    public void visit(@NotNull DivWrapLayout view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivFrameLayout view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivGifImageView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivGridLayout view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivImageView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivLinearLayout view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivLineHeightTextView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivPagerIndicatorView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivPagerView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivRecyclerView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivSeparatorView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivStateLayout view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivTabsLayout view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivSliderView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivSelectView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivVideoView view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivCustomWrapper view) {
        defaultVisit(view);
    }

    public void visit(@NotNull DivSwitchView view) {
        defaultVisit(view);
    }
}
