package com.yandex.div.core.view2.divs.pager;

import com.ironsource.C4240b4;
import k8.jk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PercentagePageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/FixedPageSizeProvider;", "Lk8/lj;", C4240b4.a.f42515t, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "parentSize", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "paddings", "Lk8/jk$c;", "alignment", "<init>", "(Lk8/lj;Lcom/yandex/div/json/expressions/ExpressionResolver;ILcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lk8/jk$c;)V", C4240b4.i.L, "", "getItemSize", "(I)Ljava/lang/Float;", "", "pageWidthPercentage", "D", "itemSize", "F", "()F", "neighbourSize", "getNeighbourSize", "", "hasOffScreenPages", "Z", "getHasOffScreenPages", "()Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PercentagePageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourSize;
    private final double pageWidthPercentage;

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

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PercentagePageSizeProvider(@org.jetbrains.annotations.NotNull k8.lj r5, @org.jetbrains.annotations.NotNull com.yandex.div.json.expressions.ExpressionResolver r6, int r7, @org.jetbrains.annotations.NotNull com.yandex.div.core.view2.divs.pager.DivPagerPaddingsHolder r8, @org.jetbrains.annotations.NotNull k8.jk.c r9) {
        /*
            r4 = this;
            r4.<init>(r7, r8, r9)
            k8.dl r5 = r5.f88838a
            com.yandex.div.json.expressions.Expression r5 = r5.f87052a
            java.lang.Object r5 = r5.evaluate(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            r4.pageWidthPercentage = r5
            double r0 = (double) r7
            double r0 = r0 * r5
            r2 = 100
            double r2 = (double) r2
            double r0 = r0 / r2
            float r0 = (float) r0
            r4.itemSize = r0
            int[] r0 = com.yandex.div.core.view2.divs.pager.PercentagePageSizeProvider.WhenMappings.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r0[r9]
            r0 = 1
            if (r9 == r0) goto L48
            r1 = 2
            if (r9 == r1) goto L3f
            r1 = 3
            if (r9 != r1) goto L39
            float r7 = (float) r7
            float r8 = r8.getEnd()
            float r7 = r7 - r8
            float r8 = r4.getItemSize()
        L37:
            float r7 = r7 - r8
            goto L53
        L39:
            lf.m r5 = new lf.m
            r5.<init>()
            throw r5
        L3f:
            float r7 = (float) r7
            float r8 = r4.getItemSize()
            float r7 = r7 - r8
            float r8 = (float) r1
            float r7 = r7 / r8
            goto L53
        L48:
            float r7 = (float) r7
            float r8 = r8.getStart()
            float r7 = r7 - r8
            float r8 = r4.getItemSize()
            goto L37
        L53:
            r4.neighbourSize = r7
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L5c
            goto L5d
        L5c:
            r0 = 0
        L5d:
            r4.hasOffScreenPages = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.pager.PercentagePageSizeProvider.<init>(k8.lj, com.yandex.div.json.expressions.ExpressionResolver, int, com.yandex.div.core.view2.divs.pager.DivPagerPaddingsHolder, k8.jk$c):void");
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
