package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.a6;
import k8.cc;
import k8.f7;
import k8.hb;
import k8.j1;
import k8.jp;
import k8.k8;
import k8.kp;
import k8.oa;
import k8.w6;
import k8.xc;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt__SizeUnitUtilsKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public abstract class BaseDivViewExtensionsKt {
    public static final void applyAlignment(@NotNull View view, @Nullable y5 y5Var, @Nullable z5 z5Var) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAlignment(view, y5Var, z5Var);
    }

    public static final void applyBitmapFilters(@NotNull View view, @NotNull BindingContext bindingContext, @NotNull Bitmap bitmap, @Nullable List<? extends cc> list, @NotNull Function1<? super Bitmap, Unit> function1) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyBitmapFilters(view, bindingContext, bitmap, list, function1);
    }

    public static final void applyDivActions(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable j1 j1Var, @Nullable List<j1> list, @Nullable List<j1> list2, @Nullable List<j1> list3, @Nullable List<j1> list4, @Nullable List<j1> list5, @Nullable List<j1> list6, @Nullable List<j1> list7, @NotNull a6 a6Var, @NotNull Expression<Boolean> expression) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyDivActions(view, bindingContext, j1Var, list, list2, list3, list4, list5, list6, list7, a6Var, expression);
    }

    public static final void applyMargins(@NotNull View view, @Nullable hb hbVar, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyMargins(view, hbVar, expressionResolver);
    }

    public static final void applyPaddings(@NotNull View view, @Nullable hb hbVar, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyPaddings(view, hbVar, expressionResolver);
    }

    public static final void applyTransform(@NotNull View view, @NotNull f7 f7Var, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyTransform(view, f7Var, expressionResolver);
    }

    public static final void bindAspectRatio(@NotNull View view, @Nullable w6 w6Var, @Nullable w6 w6Var2, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindAspectRatio(view, w6Var, w6Var2, expressionResolver);
    }

    public static final void bindClipChildren(@NotNull ViewGroup viewGroup, @NotNull Expression<Boolean> expression, @Nullable Expression<Boolean> expression2, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindClipChildren(viewGroup, expression, expression2, expressionResolver);
    }

    public static final void bindItemBuilder(@NotNull k8 k8Var, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindItemBuilder(k8Var, expressionResolver, function1);
    }

    public static final void bindStates(@NotNull View view, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindStates(view, bindingContext, divBinder);
    }

    public static final void clearFocusOnClick(@NotNull View view, @NotNull InputFocusTracker inputFocusTracker) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
    }

    @Nullable
    public static final Function2<View, MotionEvent, Boolean> createAnimatedTouchListener(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable a6 a6Var, @Nullable DivGestureListener divGestureListener) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, a6Var, divGestureListener);
    }

    public static final int dpToPx(@Nullable Long l10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(l10, displayMetrics);
    }

    public static final <T extends Number> float dpToPxF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPxF(t10, displayMetrics);
    }

    public static final void drawShadow(@NotNull View view, @NotNull Canvas canvas) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.drawShadow(view, canvas);
    }

    public static final float fontSizeToPx(long j10, @NotNull jp jpVar, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.fontSizeToPx(j10, jpVar, displayMetrics);
    }

    public static final void gainAccessibilityFocus(@NotNull View view) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.gainAccessibilityFocus(view);
    }

    @Nullable
    public static final BindingContext getBindingContext(@NotNull View view) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getBindingContext(view);
    }

    public static final <T extends Number> int pxToDp(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDp(t10, displayMetrics);
    }

    public static final <T extends Number> float pxToDpF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDpF(t10, displayMetrics);
    }

    public static final int spToPx(@Nullable Long l10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(l10, displayMetrics);
    }

    public static final <T extends Number> float spToPxF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPxF(t10, displayMetrics);
    }

    public static final int toAndroidUnit(@NotNull jp jpVar) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toAndroidUnit(jpVar);
    }

    public static final int toPx(long j10, @NotNull jp jpVar, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(j10, jpVar, displayMetrics);
    }

    public static final float toPxF(long j10, @NotNull jp jpVar, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(j10, jpVar, displayMetrics);
    }

    @MainThread
    public static final void trackVisibilityActions(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View, @NotNull List<DivItemBuilderResult> list, @Nullable List<DivItemBuilderResult> list2) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, div2View, list, list2);
    }

    public static final int unitToPx(@Nullable Long l10, @NotNull DisplayMetrics displayMetrics, @NotNull jp jpVar) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(l10, displayMetrics, jpVar);
    }

    public static final <T extends Number> float unitToPxF(@Nullable T t10, @NotNull DisplayMetrics displayMetrics, @NotNull jp jpVar) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPxF(t10, displayMetrics, jpVar);
    }

    public static final <T extends Number> int dpToPx(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(t10, displayMetrics);
    }

    public static final <T extends Number> int spToPx(@Nullable T t10, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(t10, displayMetrics);
    }

    public static final int toPx(@NotNull oa oaVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(oaVar, displayMetrics, expressionResolver);
    }

    public static final float toPxF(@NotNull xc xcVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(xcVar, displayMetrics, expressionResolver);
    }

    public static final <T extends Number> int unitToPx(@Nullable T t10, @NotNull DisplayMetrics displayMetrics, @NotNull jp jpVar) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(t10, displayMetrics, jpVar);
    }

    public static final int toPx(@NotNull xc xcVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(xcVar, displayMetrics, expressionResolver);
    }

    public static final int toPx(@NotNull kp kpVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(kpVar, displayMetrics, expressionResolver);
    }
}
