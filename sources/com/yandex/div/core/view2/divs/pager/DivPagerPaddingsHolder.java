package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010!\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010#\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0017\u0010%\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010,\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010.\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0019\u00100\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+¨\u00062"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "", "Lk8/hb;", "paddings", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroid/view/View;", "parent", "Landroid/util/DisplayMetrics;", "metrics", "", "isHorizontal", "Lk8/jk$c;", "alignment", "<init>", "(Lk8/hb;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Landroid/util/DisplayMetrics;ZLk8/jk$c;)V", "Lcom/yandex/div/json/expressions/Expression;", "", "", "toPadding", "(Lcom/yandex/div/json/expressions/Expression;)F", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Landroid/util/DisplayMetrics;", "hasRelativePaddings", "Z", "left", "F", "getLeft", "()F", "top", "getTop", "right", "getRight", "bottom", "getBottom", "start", "getStart", "end", "getEnd", "", "alignedLeft", "Ljava/lang/Integer;", "getAlignedLeft", "()Ljava/lang/Integer;", "alignedTop", "getAlignedTop", "alignedRight", "getAlignedRight", "alignedBottom", "getAlignedBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerPaddingsHolder {

    @Nullable
    private final Integer alignedBottom;

    @Nullable
    private final Integer alignedLeft;

    @Nullable
    private final Integer alignedRight;

    @Nullable
    private final Integer alignedTop;
    private final float bottom;
    private final float end;
    private final boolean hasRelativePaddings;
    private final float left;

    @NotNull
    private final DisplayMetrics metrics;

    @NotNull
    private final ExpressionResolver resolver;
    private final float right;
    private final float start;
    private final float top;

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivPagerPaddingsHolder(@org.jetbrains.annotations.Nullable k8.hb r4, @org.jetbrains.annotations.NotNull com.yandex.div.json.expressions.ExpressionResolver r5, @org.jetbrains.annotations.NotNull android.view.View r6, @org.jetbrains.annotations.NotNull android.util.DisplayMetrics r7, boolean r8, @org.jetbrains.annotations.NotNull k8.jk.c r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.pager.DivPagerPaddingsHolder.<init>(k8.hb, com.yandex.div.json.expressions.ExpressionResolver, android.view.View, android.util.DisplayMetrics, boolean, k8.jk$c):void");
    }

    private final float toPadding(Expression<Long> expression) {
        if (expression != null) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression.evaluate(this.resolver).longValue()), this.metrics);
        }
        return 0.0f;
    }

    @Nullable
    public final Integer getAlignedBottom() {
        return this.alignedBottom;
    }

    @Nullable
    public final Integer getAlignedLeft() {
        return this.alignedLeft;
    }

    @Nullable
    public final Integer getAlignedRight() {
        return this.alignedRight;
    }

    @Nullable
    public final Integer getAlignedTop() {
        return this.alignedTop;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getTop() {
        return this.top;
    }
}
