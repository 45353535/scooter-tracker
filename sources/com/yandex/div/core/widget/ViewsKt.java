package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001aA\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "value", "Lkotlin/Function1;", "modifier", "Lkotlin/properties/e;", "Landroid/view/View;", "appearanceAffecting", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/properties/e;", "dimensionAffecting", "", "measureSpec", "", "isExact", "(I)Z", "isUnspecified", "size", "makeExactSpec", "(I)I", "makeAtMostSpec", "makeUnspecifiedSpec", "()I", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ViewsKt {
    @NotNull
    public static final <T> e appearanceAffecting(T t10, @Nullable Function1<? super T, ? extends T> function1) {
        return new AppearanceAffectingViewProperty(t10, function1);
    }

    public static /* synthetic */ e appearanceAffecting$default(Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return appearanceAffecting(obj, function1);
    }

    @NotNull
    public static final <T> e dimensionAffecting(T t10, @Nullable Function1<? super T, ? extends T> function1) {
        return new DimensionAffectingViewProperty(t10, function1);
    }

    public static /* synthetic */ e dimensionAffecting$default(Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return dimensionAffecting(obj, function1);
    }

    public static final boolean isExact(int i10) {
        return View.MeasureSpec.getMode(i10) == 1073741824;
    }

    public static final boolean isUnspecified(int i10) {
        return View.MeasureSpec.getMode(i10) == 0;
    }

    public static final int makeAtMostSpec(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    public static final int makeExactSpec(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
    }

    public static final int makeUnspecifiedSpec() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
