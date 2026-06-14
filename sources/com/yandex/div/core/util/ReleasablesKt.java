package com.yandex.div.core.util;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "", "Lcom/yandex/div/core/view2/Releasable;", "getReleasableList", "(Landroid/view/View;)Ljava/lang/Iterable;", "releasableList", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "getExpressionSubscriber", "(Landroid/view/View;)Lcom/yandex/div/internal/core/ExpressionSubscriber;", "expressionSubscriber", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ReleasablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ExpressionSubscriber getExpressionSubscriber(@NotNull View view) {
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        int i10 = R$id.div_releasable_list;
        Object tag = view.getTag(i10);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            view.setTag(i10, sparseArrayCompat);
        }
        Object obj = sparseArrayCompat.get(0);
        ExpressionSubscriber expressionSubscriber = obj instanceof ExpressionSubscriber ? (ExpressionSubscriber) obj : null;
        if (expressionSubscriber != null) {
            return expressionSubscriber;
        }
        ExpressionSubscriberImpl expressionSubscriberImpl = new ExpressionSubscriberImpl();
        sparseArrayCompat.put(0, expressionSubscriberImpl);
        return expressionSubscriberImpl;
    }

    @Nullable
    public static final Iterable<Releasable> getReleasableList(@NotNull View view) {
        Object tag = view.getTag(R$id.div_releasable_list);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat != null) {
            return SparseArraysKt.toIterable(sparseArrayCompat);
        }
        return null;
    }
}
