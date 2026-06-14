package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import com.ironsource.C4240b4;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.jk;
import k8.ri;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/NeighbourPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/FixedPageSizeProvider;", "Lk8/ri;", C4240b4.a.f42515t, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroid/util/DisplayMetrics;", "metrics", "", "parentSize", "", "itemSpacing", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "paddings", "Lk8/jk$c;", "alignment", "<init>", "(Lk8/ri;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/DisplayMetrics;IFLcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lk8/jk$c;)V", C4240b4.i.L, "getItemSize", "(I)Ljava/lang/Float;", "neighbourPageWidth", "F", "neighbourSize", "getNeighbourSize", "()F", "itemSize", "", "hasOffScreenPages", "Z", "getHasOffScreenPages", "()Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NeighbourPageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourPageWidth;
    private final float neighbourSize;

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

    public NeighbourPageSizeProvider(@NotNull ri riVar, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics displayMetrics, int i10, float f10, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull jk.c cVar) {
        float start;
        float neighbourSize;
        super(i10, divPagerPaddingsHolder, cVar);
        float pxF = BaseDivViewExtensionsKt.toPxF(riVar.f90738a, displayMetrics, expressionResolver);
        this.neighbourPageWidth = pxF;
        this.neighbourSize = f10 + pxF;
        int i11 = WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i11 == 1) {
            start = i10 - divPagerPaddingsHolder.getStart();
            neighbourSize = getNeighbourSize();
        } else if (i11 == 2) {
            start = i10;
            neighbourSize = getNeighbourSize() * 2;
        } else {
            if (i11 != 3) {
                throw new m();
            }
            start = i10 - divPagerPaddingsHolder.getEnd();
            neighbourSize = getNeighbourSize();
        }
        this.itemSize = start - neighbourSize;
        this.hasOffScreenPages = pxF > 0.0f;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public boolean getHasOffScreenPages() {
        return this.hasOffScreenPages;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getItemSize() {
        return this.itemSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getNeighbourSize() {
        return this.neighbourSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @NotNull
    public Float getItemSize(int position) {
        return Float.valueOf(getItemSize());
    }
}
