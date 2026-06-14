package com.yandex.div.internal.widget.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimatorKt;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawerKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eJ\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u001f\u001a\u00020\u0016*\u00020\u0012H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/internal/widget/indicator/PagerIndicatorView;", "Landroid/view/View;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentAdapter", "Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "getCurrentAdapter", "()Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "divPager", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "onPageChangeListener", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "stripDrawer", "Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer;", "style", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "attachPager", "", "newDivPager", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setStyle", "update", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PagerIndicatorView extends View {

    @Nullable
    private DivPagerView divPager;

    @NotNull
    private final ViewPager2.OnPageChangeCallback onPageChangeListener;

    @Nullable
    private IndicatorsStripDrawer stripDrawer;

    @Nullable
    private Style style;

    public PagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.onPageChangeListener = new ViewPager2.OnPageChangeCallback() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1
            private final int toRealPosition(int i11) {
                DivPagerAdapter currentAdapter = this.this$0.getCurrentAdapter();
                return currentAdapter == null ? i11 : currentAdapter.realItemPosition(i11);
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x000f A[PHI: r1
  0x000f: PHI (r1v2 float) = (r1v0 float), (r1v1 float) binds: [B:5:0x000d, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onPageScrolled(int r4, float r5, int r6) {
                /*
                    r3 = this;
                    com.yandex.div.internal.widget.indicator.PagerIndicatorView r6 = r3.this$0
                    com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer r6 = com.yandex.div.internal.widget.indicator.PagerIndicatorView.access$getStripDrawer$p(r6)
                    if (r6 == 0) goto L22
                    com.yandex.div.internal.widget.indicator.PagerIndicatorView r0 = r3.this$0
                    r1 = 0
                    int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r2 >= 0) goto L11
                Lf:
                    r5 = r1
                    goto L18
                L11:
                    r1 = 1065353216(0x3f800000, float:1.0)
                    int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r2 <= 0) goto L18
                    goto Lf
                L18:
                    int r4 = r3.toRealPosition(r4)
                    r6.onPageScrolled(r4, r5)
                    r0.invalidate()
                L22:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1.onPageScrolled(int, float, int):void");
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                IndicatorsStripDrawer indicatorsStripDrawer = this.this$0.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = this.this$0;
                    indicatorsStripDrawer.onPageSelected(toRealPosition(position));
                    pagerIndicatorView.invalidate();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPager$lambda$3(PagerIndicatorView pagerIndicatorView) {
        IndicatorsStripDrawer indicatorsStripDrawer = pagerIndicatorView.stripDrawer;
        if (indicatorsStripDrawer != null) {
            pagerIndicatorView.update(indicatorsStripDrawer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DivPagerAdapter getCurrentAdapter() {
        ViewPager2 viewPager;
        DivPagerView divPagerView = this.divPager;
        RecyclerView.Adapter adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
        if (adapter instanceof DivPagerAdapter) {
            return (DivPagerAdapter) adapter;
        }
        return null;
    }

    private final void update(IndicatorsStripDrawer indicatorsStripDrawer) {
        DivPagerAdapter currentAdapter = getCurrentAdapter();
        if (currentAdapter != null) {
            indicatorsStripDrawer.setItemsCount(currentAdapter.getVisibleItems().size());
            indicatorsStripDrawer.onPageSelected(currentAdapter.realItemPosition(currentAdapter.getCurrentItem()));
            invalidate();
        }
    }

    public final void attachPager(@NotNull DivPagerView newDivPager) {
        DivPagerView divPagerView = this.divPager;
        if (divPagerView != null) {
            divPagerView.removeChangePageCallbackForIndicators(this.onPageChangeListener);
        }
        newDivPager.addChangePageCallbackForIndicators(this.onPageChangeListener);
        if (newDivPager == this.divPager) {
            return;
        }
        this.divPager = newDivPager;
        if (newDivPager.getViewPager().getAdapter() == null) {
            throw new IllegalArgumentException("Attached pager adapter is null!");
        }
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            update(indicatorsStripDrawer);
        }
        newDivPager.setPagerOnItemsCountChange$div_release(new DivPagerView.OnItemsUpdatedCallback() { // from class: b8.a
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OnItemsUpdatedCallback
            public final void onItemsUpdated() {
                PagerIndicatorView.attachPager$lambda$3(this.f5836a);
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            indicatorsStripDrawer.onDraw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.indicator.PagerIndicatorView.onMeasure(int, int):void");
    }

    public final void setStyle(@NotNull Style style) {
        this.style = style;
        IndicatorsStripDrawer indicatorsStripDrawer = new IndicatorsStripDrawer(style, SingleIndicatorDrawerKt.getIndicatorDrawer(style), IndicatorAnimatorKt.getIndicatorAnimator(style), this);
        indicatorsStripDrawer.calculateMaximumVisibleItems((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        update(indicatorsStripDrawer);
        this.stripDrawer = indicatorsStripDrawer;
        requestLayout();
    }
}
