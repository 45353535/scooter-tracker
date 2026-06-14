package com.yandex.div.internal.widget.indicator;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import bg.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.my.target.common.menu.MenuActionType;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u000267B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u001cJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010+\u001a\u00060*R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010.R\u0016\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101¨\u00068"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer;", "", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "styleParams", "Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "singleIndicatorDrawer", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "animator", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;Landroid/view/View;)V", "", "calculateMaximumVisibleItems", "()V", "", C4240b4.i.L, "", "positionOffset", "adjustVisibleItems", "(IF)V", "adjustItemsPlacement", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "getItemSizeAt", "(I)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "positionFraction", "onPageScrolled", "onPageSelected", "(I)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "count", "setItemsCount", "viewportWidth", "viewportHeight", "(II)V", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "Landroid/view/View;", "Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$IndicatorsRibbon;", "ribbon", "Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$IndicatorsRibbon;", "itemsCount", "I", "maxVisibleCount", "baseYOffset", "F", "spaceBetweenCenters", "itemWidthMultiplier", "selectedItemPosition", "selectedItemFraction", "Indicator", "IndicatorsRibbon", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IndicatorsStripDrawer {

    @NotNull
    private final IndicatorAnimator animator;
    private float baseYOffset;
    private int itemsCount;
    private int maxVisibleCount;
    private float selectedItemFraction;
    private int selectedItemPosition;

    @NotNull
    private final SingleIndicatorDrawer singleIndicatorDrawer;
    private float spaceBetweenCenters;

    @NotNull
    private final Style styleParams;

    @NotNull
    private final View view;
    private int viewportHeight;
    private int viewportWidth;

    @NotNull
    private final IndicatorsRibbon ribbon = new IndicatorsRibbon();
    private float itemWidthMultiplier = 1.0f;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$IndicatorsRibbon;", "", "<init>", "(Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer;)V", "", "activePosition", "", "positionFraction", "", "Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$Indicator;", "relayoutVisibleItems", "(IF)Ljava/util/List;", "calcOffsetShiftFor", "(IF)F", "", "viewportItems", "", "downscaleAndDisperse", "(Ljava/util/List;)V", "absOffset", "calcScaleFraction", "(F)F", "item", "scaleFraction", "scaleItem", "(Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$Indicator;F)Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$Indicator;", "relayout", "(IF)V", "allItems", "Ljava/util/List;", "visibleItems", "getVisibleItems", "()Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class IndicatorsRibbon {

        @NotNull
        private final List<Indicator> allItems = new ArrayList();

        @NotNull
        private final List<Indicator> visibleItems = new ArrayList();

        public IndicatorsRibbon() {
        }

        private final float calcOffsetShiftFor(int activePosition, float positionFraction) {
            float centerOffset;
            if (this.allItems.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return (IndicatorsStripDrawer.this.viewportWidth / 2.0f) - (((Indicator) CollectionsKt.last((List) this.allItems)).getRight() / 2);
            }
            float f10 = IndicatorsStripDrawer.this.viewportWidth / 2.0f;
            if (ViewsKt.isLayoutRtl(IndicatorsStripDrawer.this.view)) {
                if (activePosition != -1) {
                    centerOffset = this.allItems.get((r1.size() - 1) - activePosition).getCenterOffset();
                }
                centerOffset = (f10 - centerOffset) + (IndicatorsStripDrawer.this.spaceBetweenCenters * positionFraction);
            } else {
                centerOffset = (f10 - (activePosition != -1 ? this.allItems.get(activePosition).getCenterOffset() : 0.0f)) - (IndicatorsStripDrawer.this.spaceBetweenCenters * positionFraction);
            }
            return IndicatorsStripDrawer.this.maxVisibleCount % 2 == 0 ? centerOffset + (IndicatorsStripDrawer.this.spaceBetweenCenters / 2) : centerOffset;
        }

        private final float calcScaleFraction(float absOffset) {
            float f10 = IndicatorsStripDrawer.this.spaceBetweenCenters + 0.0f;
            if (absOffset > f10) {
                absOffset = g.i(IndicatorsStripDrawer.this.viewportWidth - absOffset, f10);
            }
            if (absOffset > f10) {
                return 1.0f;
            }
            return g.m(absOffset / (f10 - 0.0f), 0.0f, 1.0f);
        }

        private final void downscaleAndDisperse(List<Indicator> viewportItems) {
            int iNextIndex;
            Indicator indicator;
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            int i10 = 0;
            int i11 = 0;
            for (Object obj : viewportItems) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Indicator indicator2 = (Indicator) obj;
                float fCalcScaleFraction = calcScaleFraction(indicator2.getCenterOffset());
                viewportItems.set(i11, (indicator2.getPosition() == 0 || indicator2.getPosition() == indicatorsStripDrawer.itemsCount + (-1) || indicator2.getActive()) ? Indicator.copy$default(indicator2, 0, false, 0.0f, null, fCalcScaleFraction, 15, null) : scaleItem(indicator2, fCalcScaleFraction));
                i11 = i12;
            }
            Iterator<Indicator> it = viewportItems.iterator();
            int i13 = 0;
            while (true) {
                iNextIndex = -1;
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (it.next().getScaleFactor() == 1.0f) {
                    break;
                } else {
                    i13++;
                }
            }
            Integer numValueOf = Integer.valueOf(i13);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                ListIterator<Indicator> listIterator = viewportItems.listIterator(viewportItems.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().getScaleFactor() == 1.0f) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Integer numValueOf2 = Integer.valueOf(iNextIndex);
                Integer num = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
                if (num != null) {
                    int i14 = iIntValue - 1;
                    int iIntValue2 = num.intValue() + 1;
                    IndicatorsStripDrawer indicatorsStripDrawer2 = IndicatorsStripDrawer.this;
                    for (Object obj2 : viewportItems) {
                        int i15 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Indicator indicator3 = (Indicator) obj2;
                        if (i10 < i14) {
                            Indicator indicator4 = (Indicator) CollectionsKt.getOrNull(viewportItems, i14);
                            if (indicator4 != null) {
                                viewportItems.set(i10, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() - (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator4.getScaleFactor())), null, 0.0f, 27, null));
                                if (i10 <= iIntValue2) {
                                }
                            }
                        } else if (i10 <= iIntValue2 && (indicator = (Indicator) CollectionsKt.getOrNull(viewportItems, iIntValue2)) != null) {
                            viewportItems.set(i10, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator.getScaleFactor())), null, 0.0f, 27, null));
                        }
                        i10 = i15;
                    }
                }
            }
        }

        private final List<Indicator> relayoutVisibleItems(int activePosition, float positionFraction) {
            float fCalcOffsetShiftFor = calcOffsetShiftFor(activePosition, positionFraction);
            List<Indicator> list = this.allItems;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Indicator indicator : list) {
                arrayList.add(Indicator.copy$default(indicator, 0, false, indicator.getCenterOffset() + fCalcOffsetShiftFor, null, 0.0f, 27, null));
            }
            List<Indicator> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            if (mutableList.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return mutableList;
            }
            final b bVarB = g.b(0.0f, IndicatorsStripDrawer.this.viewportWidth);
            int i10 = 0;
            if (bVarB.contains(Float.valueOf(((Indicator) CollectionsKt.first((List) mutableList)).getLeft()))) {
                float f10 = -((Indicator) CollectionsKt.first((List) mutableList)).getLeft();
                for (Object obj : mutableList) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Indicator indicator2 = (Indicator) obj;
                    mutableList.set(i10, Indicator.copy$default(indicator2, 0, false, indicator2.getCenterOffset() + f10, null, 0.0f, 27, null));
                    i10 = i11;
                }
            } else if (bVarB.contains(Float.valueOf(((Indicator) CollectionsKt.last((List) mutableList)).getRight()))) {
                float right = IndicatorsStripDrawer.this.viewportWidth - ((Indicator) CollectionsKt.last((List) mutableList)).getRight();
                for (Object obj2 : mutableList) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Indicator indicator3 = (Indicator) obj2;
                    mutableList.set(i10, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + right, null, 0.0f, 27, null));
                    i10 = i12;
                }
            }
            CollectionsKt.removeAll((List) mutableList, (Function1) new Function1<Indicator, Boolean>() { // from class: com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull IndicatorsStripDrawer.Indicator indicator4) {
                    return Boolean.valueOf(!bVarB.contains(Float.valueOf(indicator4.getCenterOffset())));
                }
            });
            downscaleAndDisperse(mutableList);
            return mutableList;
        }

        private final Indicator scaleItem(Indicator item, float scaleFraction) {
            IndicatorParams$ItemSize itemSize = item.getItemSize();
            float width = itemSize.getWidth() * scaleFraction;
            if (width <= IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize().getWidth()) {
                return Indicator.copy$default(item, 0, false, 0.0f, IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize(), scaleFraction, 7, null);
            }
            if (width >= itemSize.getWidth()) {
                return item;
            }
            if (itemSize instanceof IndicatorParams$ItemSize.RoundedRect) {
                IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSize;
                return Indicator.copy$default(item, 0, false, 0.0f, IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, width, roundedRect.getItemHeight() * (width / roundedRect.getItemWidth()), 0.0f, 4, null), scaleFraction, 7, null);
            }
            if (itemSize instanceof IndicatorParams$ItemSize.Circle) {
                return Indicator.copy$default(item, 0, false, 0.0f, ((IndicatorParams$ItemSize.Circle) itemSize).copy((itemSize.getWidth() * scaleFraction) / 2.0f), scaleFraction, 7, null);
            }
            throw new m();
        }

        @NotNull
        public final List<Indicator> getVisibleItems() {
            return this.visibleItems;
        }

        public final void relayout(int activePosition, float positionFraction) {
            this.allItems.clear();
            this.visibleItems.clear();
            if (IndicatorsStripDrawer.this.itemsCount <= 0) {
                return;
            }
            d indices = ViewsKt.getIndices(IndicatorsStripDrawer.this.view, 0, IndicatorsStripDrawer.this.itemsCount);
            int iE = indices.e();
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                IndicatorParams$ItemSize itemSizeAt = indicatorsStripDrawer.getItemSizeAt(iNextInt);
                this.allItems.add(new Indicator(iNextInt, iNextInt == activePosition, iNextInt == iE ? itemSizeAt.getWidth() / 2.0f : ((Indicator) CollectionsKt.last((List) this.allItems)).getCenterOffset() + indicatorsStripDrawer.spaceBetweenCenters, itemSizeAt, 0.0f, 16, null));
            }
            this.visibleItems.addAll(relayoutVisibleItems(activePosition, positionFraction));
        }
    }

    public IndicatorsStripDrawer(@NotNull Style style, @NotNull SingleIndicatorDrawer singleIndicatorDrawer, @NotNull IndicatorAnimator indicatorAnimator, @NotNull View view) {
        this.styleParams = style;
        this.singleIndicatorDrawer = singleIndicatorDrawer;
        this.animator = indicatorAnimator;
        this.view = view;
        this.baseYOffset = style.getInactiveShape().getItemSize().getWidth();
    }

    private final void adjustItemsPlacement() {
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            this.spaceBetweenCenters = ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            this.itemWidthMultiplier = 1.0f;
        } else if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch) {
            IndicatorParams$ItemPlacement.Stretch stretch = (IndicatorParams$ItemPlacement.Stretch) itemsPlacement;
            float itemSpacing = (this.viewportWidth + stretch.getItemSpacing()) / this.maxVisibleCount;
            this.spaceBetweenCenters = itemSpacing;
            this.itemWidthMultiplier = (itemSpacing - stretch.getItemSpacing()) / this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        this.animator.updateSpaceBetweenCenters(this.spaceBetweenCenters);
    }

    private final void adjustVisibleItems(int position, float positionOffset) {
        this.ribbon.relayout(position, positionOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorParams$ItemSize getItemSizeAt(int position) {
        IndicatorParams$ItemSize itemSizeAt = this.animator.getItemSizeAt(position);
        if (this.itemWidthMultiplier == 1.0f || !(itemSizeAt instanceof IndicatorParams$ItemSize.RoundedRect)) {
            return itemSizeAt;
        }
        IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSizeAt;
        IndicatorParams$ItemSize.RoundedRect roundedRectCopy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, roundedRect.getItemWidth() * this.itemWidthMultiplier, 0.0f, 0.0f, 6, null);
        this.animator.overrideItemWidth(roundedRectCopy$default.getItemWidth());
        return roundedRectCopy$default;
    }

    public final void calculateMaximumVisibleItems(int viewportWidth, int viewportHeight) {
        if (viewportWidth == 0 || viewportHeight == 0) {
            return;
        }
        this.viewportWidth = viewportWidth;
        this.viewportHeight = viewportHeight;
        calculateMaximumVisibleItems();
        adjustItemsPlacement();
        this.baseYOffset = viewportHeight / 2.0f;
        adjustVisibleItems(this.selectedItemPosition, this.selectedItemFraction);
    }

    public final void onDraw(@NotNull Canvas canvas) {
        Object next;
        RectF selectedItemRect;
        for (Indicator indicator : this.ribbon.getVisibleItems()) {
            this.singleIndicatorDrawer.draw(canvas, indicator.getCenterOffset(), this.baseYOffset, indicator.getItemSize(), this.animator.getColorAt(indicator.getPosition()), this.animator.getBorderWidthAt(indicator.getPosition()), this.animator.getBorderColorAt(indicator.getPosition()));
        }
        Iterator<T> it = this.ribbon.getVisibleItems().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((Indicator) next).getActive()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Indicator indicator2 = (Indicator) next;
        if (indicator2 == null || (selectedItemRect = this.animator.getSelectedItemRect(indicator2.getCenterOffset(), this.baseYOffset, this.viewportWidth, ViewsKt.isLayoutRtl(this.view))) == null) {
            return;
        }
        this.singleIndicatorDrawer.drawSelected(canvas, selectedItemRect);
    }

    public final void onPageScrolled(int position, float positionFraction) {
        this.selectedItemPosition = position;
        this.selectedItemFraction = positionFraction;
        this.animator.onPageScrolled(position, positionFraction);
        adjustVisibleItems(position, positionFraction);
    }

    public final void onPageSelected(int position) {
        this.selectedItemPosition = position;
        this.selectedItemFraction = 0.0f;
        this.animator.onPageSelected(position);
        adjustVisibleItems(position, 0.0f);
    }

    public final void setItemsCount(int count) {
        this.itemsCount = count;
        this.animator.setItemsCount(count);
        calculateMaximumVisibleItems();
        this.baseYOffset = this.viewportHeight / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0011\u0010$\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010&\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010\u001e¨\u0006'"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$Indicator;", "", "", C4240b4.i.L, "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "centerOffset", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "itemSize", "scaleFactor", "<init>", "(IZFLcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;F)V", MenuActionType.COPY, "(IZFLcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;F)Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer$Indicator;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Z", "getActive", "()Z", "F", "getCenterOffset", "()F", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "getItemSize", "()Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "getScaleFactor", "getLeft", "left", "getRight", "right", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class Indicator {
        private final boolean active;
        private final float centerOffset;

        @NotNull
        private final IndicatorParams$ItemSize itemSize;
        private final int position;
        private final float scaleFactor;

        public Indicator(int i10, boolean z10, float f10, @NotNull IndicatorParams$ItemSize indicatorParams$ItemSize, float f11) {
            this.position = i10;
            this.active = z10;
            this.centerOffset = f10;
            this.itemSize = indicatorParams$ItemSize;
            this.scaleFactor = f11;
        }

        public static /* synthetic */ Indicator copy$default(Indicator indicator, int i10, boolean z10, float f10, IndicatorParams$ItemSize indicatorParams$ItemSize, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = indicator.position;
            }
            if ((i11 & 2) != 0) {
                z10 = indicator.active;
            }
            if ((i11 & 4) != 0) {
                f10 = indicator.centerOffset;
            }
            if ((i11 & 8) != 0) {
                indicatorParams$ItemSize = indicator.itemSize;
            }
            if ((i11 & 16) != 0) {
                f11 = indicator.scaleFactor;
            }
            float f12 = f11;
            float f13 = f10;
            return indicator.copy(i10, z10, f13, indicatorParams$ItemSize, f12);
        }

        @NotNull
        public final Indicator copy(int position, boolean active, float centerOffset, @NotNull IndicatorParams$ItemSize itemSize, float scaleFactor) {
            return new Indicator(position, active, centerOffset, itemSize, scaleFactor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Indicator)) {
                return false;
            }
            Indicator indicator = (Indicator) other;
            return this.position == indicator.position && this.active == indicator.active && Float.compare(this.centerOffset, indicator.centerOffset) == 0 && Intrinsics.areEqual(this.itemSize, indicator.itemSize) && Float.compare(this.scaleFactor, indicator.scaleFactor) == 0;
        }

        public final boolean getActive() {
            return this.active;
        }

        public final float getCenterOffset() {
            return this.centerOffset;
        }

        @NotNull
        public final IndicatorParams$ItemSize getItemSize() {
            return this.itemSize;
        }

        public final float getLeft() {
            return this.centerOffset - (this.itemSize.getWidth() / 2.0f);
        }

        public final int getPosition() {
            return this.position;
        }

        public final float getRight() {
            return this.centerOffset + (this.itemSize.getWidth() / 2.0f);
        }

        public final float getScaleFactor() {
            return this.scaleFactor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int i10 = this.position * 31;
            boolean z10 = this.active;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return ((((((i10 + r12) * 31) + Float.floatToIntBits(this.centerOffset)) * 31) + this.itemSize.hashCode()) * 31) + Float.floatToIntBits(this.scaleFactor);
        }

        @NotNull
        public String toString() {
            return "Indicator(position=" + this.position + ", active=" + this.active + ", centerOffset=" + this.centerOffset + ", itemSize=" + this.itemSize + ", scaleFactor=" + this.scaleFactor + ')';
        }

        public /* synthetic */ Indicator(int i10, boolean z10, float f10, IndicatorParams$ItemSize indicatorParams$ItemSize, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, z10, f10, indicatorParams$ItemSize, (i11 & 16) != 0 ? 1.0f : f11);
        }
    }

    private final void calculateMaximumVisibleItems() {
        int maxVisibleItems;
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            maxVisibleItems = (int) (this.viewportWidth / ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters());
        } else {
            if (!(itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch)) {
                throw new m();
            }
            maxVisibleItems = ((IndicatorParams$ItemPlacement.Stretch) itemsPlacement).getMaxVisibleItems();
        }
        this.maxVisibleCount = g.j(maxVisibleItems, this.itemsCount);
    }
}
