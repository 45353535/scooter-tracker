package com.yandex.div.core.view2.divs.pager;

import com.ironsource.C4240b4;
import com.ironsource.N6;
import k8.jk;
import kotlin.Metadata;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010\"\u001a\u00020\n*\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010\u001fJ'\u0010(\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b*\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0018\u00104\u001a\u00020\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u00106\u001a\u00020\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00103¨\u00067"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPageOffsetProvider;", "", "", "parentSize", "", "itemSpacing", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "pageSizeProvider", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "paddings", "", "infiniteScroll", "Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", N6.G1, "Lk8/jk$c;", "alignment", "<init>", "(IFLcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;ZLcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;Lk8/jk$c;)V", C4240b4.i.L, "pagePosition", "getOffset", "(FI)F", "sign", "getOnePositionOffset", "(II)F", "isOverlap", "getInitialOffset", "(FIZ)F", "prevActivePage", "nextActivePage", "getStartOffset", "(FII)F", "getEndOffset", "maxOffset", "biggerThan", "(FF)Z", "contentIsSmallerThanPager", "(II)Z", "getOffsetForSmallContent", "part", "getInitialStartOffset", "(IIF)F", "getPageOffset", "I", "F", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "Z", "Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "Lk8/jk$c;", "getFrac", "(F)F", CSSFontFeatureSettings.FEATURE_FRAC, "getFracInverted", "fracInverted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerPageOffsetProvider {

    @NotNull
    private final DivPagerAdapter adapter;

    @NotNull
    private final jk.c alignment;
    private final boolean infiniteScroll;
    private final float itemSpacing;

    @NotNull
    private final DivPagerPaddingsHolder paddings;

    @NotNull
    private final DivPagerPageSizeProvider pageSizeProvider;
    private final int parentSize;

    public DivPagerPageOffsetProvider(int i10, float f10, @NotNull DivPagerPageSizeProvider divPagerPageSizeProvider, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, boolean z10, @NotNull DivPagerAdapter divPagerAdapter, @NotNull jk.c cVar) {
        this.parentSize = i10;
        this.itemSpacing = f10;
        this.pageSizeProvider = divPagerPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.infiniteScroll = z10;
        this.adapter = divPagerAdapter;
        this.alignment = cVar;
    }

    private final boolean biggerThan(float f10, float f11) {
        return f10 >= Math.abs(f11);
    }

    private final boolean contentIsSmallerThanPager(int prevActivePage, int nextActivePage) {
        float start = (this.parentSize - this.paddings.getStart()) - this.paddings.getEnd();
        Float itemSize = this.pageSizeProvider.getItemSize(prevActivePage);
        if (itemSize != null) {
            float fFloatValue = itemSize.floatValue();
            if (fFloatValue >= start) {
                return false;
            }
            if (prevActivePage != nextActivePage) {
                float f10 = this.itemSpacing;
                Float itemSize2 = this.pageSizeProvider.getItemSize(nextActivePage);
                if (itemSize2 == null) {
                    return true;
                }
                fFloatValue += f10 + itemSize2.floatValue();
                if (fFloatValue >= start) {
                    return false;
                }
            }
            for (int i10 = prevActivePage - 1; -1 < i10; i10--) {
                float f11 = this.itemSpacing;
                Float itemSize3 = this.pageSizeProvider.getItemSize(i10);
                if (itemSize3 == null) {
                    break;
                }
                fFloatValue += f11 + itemSize3.floatValue();
                if (fFloatValue >= start) {
                    return false;
                }
            }
            int itemCount = this.adapter.getItemCount();
            for (int i11 = nextActivePage + 1; i11 < itemCount; i11++) {
                float f12 = this.itemSpacing;
                Float itemSize4 = this.pageSizeProvider.getItemSize(i11);
                if (itemSize4 == null) {
                    break;
                }
                fFloatValue += f12 + itemSize4.floatValue();
                if (fFloatValue >= start) {
                    return false;
                }
            }
        }
        return true;
    }

    private final float getEndOffset(float position, int prevActivePage, int nextActivePage) {
        Float nextNeighbourSize;
        Float itemSize;
        if (this.alignment != jk.c.END && (nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(prevActivePage)) != null) {
            float fFloatValue = nextNeighbourSize.floatValue();
            Float nextNeighbourSize2 = this.pageSizeProvider.getNextNeighbourSize(nextActivePage);
            if (nextNeighbourSize2 != null) {
                float fFloatValue2 = nextNeighbourSize2.floatValue();
                float frac = position > 0.0f ? getFrac(position) : getFracInverted(position);
                float end = ((fFloatValue * frac) + (fFloatValue2 * (1 - frac))) - this.paddings.getEnd();
                if (end != 0.0f && (itemSize = this.pageSizeProvider.getItemSize(nextActivePage)) != null) {
                    float fFloatValue3 = itemSize.floatValue() * frac;
                    if (biggerThan(fFloatValue3, end)) {
                        return 0.0f;
                    }
                    int itemCount = this.adapter.getItemCount();
                    for (int i10 = nextActivePage + 1; i10 < itemCount; i10++) {
                        Float itemSize2 = this.pageSizeProvider.getItemSize(i10);
                        if (itemSize2 == null) {
                            return 0.0f;
                        }
                        fFloatValue3 += itemSize2.floatValue() + this.itemSpacing;
                        if (biggerThan(fFloatValue3, end)) {
                            return 0.0f;
                        }
                    }
                    return end - fFloatValue3;
                }
            }
        }
        return 0.0f;
    }

    private final float getFrac(float f10) {
        float fAbs = Math.abs(f10);
        return fAbs - ((float) Math.floor(fAbs));
    }

    private final float getFracInverted(float f10) {
        float frac = getFrac(f10);
        if (frac > 0.0f) {
            return 1 - frac;
        }
        return 0.0f;
    }

    private final float getInitialOffset(float position, int pagePosition, boolean isOverlap) {
        if (isOverlap) {
            return 0.0f;
        }
        double d10 = position;
        int iCeil = pagePosition - ((int) Math.ceil(d10));
        int iFloor = pagePosition - ((int) Math.floor(d10));
        if (contentIsSmallerThanPager(iCeil, iFloor)) {
            return getOffsetForSmallContent(position, iCeil, iFloor);
        }
        if (this.infiniteScroll) {
            return 0.0f;
        }
        float startOffset = getStartOffset(position, iCeil, iFloor);
        if (startOffset != 0.0f) {
            return startOffset;
        }
        float endOffset = getEndOffset(position, iCeil, iFloor);
        if (endOffset == 0.0f) {
            return 0.0f;
        }
        return endOffset;
    }

    private final float getInitialStartOffset(int prevActivePage, int nextActivePage, float part) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(prevActivePage);
        if (prevNeighbourSize != null) {
            float fFloatValue = prevNeighbourSize.floatValue();
            Float prevNeighbourSize2 = this.pageSizeProvider.getPrevNeighbourSize(nextActivePage);
            if (prevNeighbourSize2 != null) {
                return ((fFloatValue * (1 - part)) + (prevNeighbourSize2.floatValue() * part)) - this.paddings.getStart();
            }
        }
        return 0.0f;
    }

    private final float getOffset(float position, int pagePosition) {
        if (position == 0.0f) {
            return 0.0f;
        }
        int iSignum = (int) Math.signum(position);
        int iAbs = (int) Math.abs(position);
        int i10 = 1;
        float onePositionOffset = 0.0f;
        if (1 <= iAbs) {
            while (true) {
                onePositionOffset += getOnePositionOffset(pagePosition, iSignum);
                pagePosition -= iSignum;
                if (i10 == iAbs) {
                    break;
                }
                i10++;
            }
        }
        float frac = getFrac(position);
        return onePositionOffset + (frac > 0.0f ? frac * getOnePositionOffset(pagePosition, iSignum) : 0.0f);
    }

    private final float getOffsetForSmallContent(float position, int prevActivePage, int nextActivePage) {
        float frac = position <= 0.0f ? getFrac(position) : getFracInverted(position);
        Float itemSize = this.pageSizeProvider.getItemSize(prevActivePage);
        if (itemSize == null) {
            return 0.0f;
        }
        float fFloatValue = itemSize.floatValue() * frac;
        for (int i10 = prevActivePage - 1; -1 < i10; i10--) {
            Float itemSize2 = this.pageSizeProvider.getItemSize(i10);
            if (itemSize2 == null) {
                return 0.0f;
            }
            fFloatValue += itemSize2.floatValue() + this.itemSpacing;
        }
        return fFloatValue - getInitialStartOffset(prevActivePage, nextActivePage, frac);
    }

    private final float getOnePositionOffset(int position, int sign) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(sign > 0 ? position : position + 1);
        if (prevNeighbourSize != null) {
            float fFloatValue = prevNeighbourSize.floatValue();
            DivPagerPageSizeProvider divPagerPageSizeProvider = this.pageSizeProvider;
            if (sign > 0) {
                position--;
            }
            Float nextNeighbourSize = divPagerPageSizeProvider.getNextNeighbourSize(position);
            if (nextNeighbourSize != null) {
                return ((fFloatValue + nextNeighbourSize.floatValue()) - this.itemSpacing) * sign;
            }
        }
        return 0.0f;
    }

    private final float getStartOffset(float position, int prevActivePage, int nextActivePage) {
        Float itemSize;
        if (this.alignment == jk.c.START) {
            return 0.0f;
        }
        float frac = position <= 0.0f ? getFrac(position) : getFracInverted(position);
        float initialStartOffset = getInitialStartOffset(prevActivePage, nextActivePage, frac);
        if (initialStartOffset == 0.0f || (itemSize = this.pageSizeProvider.getItemSize(prevActivePage)) == null) {
            return 0.0f;
        }
        float fFloatValue = itemSize.floatValue() * frac;
        if (biggerThan(fFloatValue, initialStartOffset)) {
            return 0.0f;
        }
        do {
            prevActivePage--;
            if (-1 >= prevActivePage) {
                return fFloatValue - initialStartOffset;
            }
            Float itemSize2 = this.pageSizeProvider.getItemSize(prevActivePage);
            if (itemSize2 == null) {
                return 0.0f;
            }
            fFloatValue += itemSize2.floatValue() + this.itemSpacing;
        } while (!biggerThan(fFloatValue, initialStartOffset));
        return 0.0f;
    }

    public final float getPageOffset(float position, int pagePosition, boolean isOverlap) {
        return getOffset(position, pagePosition) - getInitialOffset(position, pagePosition, isOverlap);
    }
}
