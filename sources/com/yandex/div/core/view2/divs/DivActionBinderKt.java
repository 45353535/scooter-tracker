package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.j1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\n\u001a\u00020\b*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\n\u001a\u00020\b*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000f\u001a)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\b*\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u001b\u001a\u00020\b*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a1\u0010\u001d\u001a\u00020\b*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroid/view/View;", "", "Lk8/j1;", "actions", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lkotlin/Function1;", "", "", "callback", "observe", "(Landroid/view/View;Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/json/expressions/Expression;", "", "captureFocusOnAction", "(Landroid/view/View;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "onlyEnabled", "(Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "parentIsLongClickable", "(Landroid/view/View;)Z", "isPenetratingLongClickable", "longClickable", "setPenetratingLongClickable", "(Landroid/view/View;Ljava/lang/Boolean;)V", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "inputFocusTracker", "expressionResolver", "clearFocusIfNeeded", "(Landroid/view/View;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/core/view2/reuse/InputFocusTracker;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "captureFocusIfNeeded", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivActionBinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureFocusIfNeeded(View view, Expression<Boolean> expression, InputFocusTracker inputFocusTracker, ExpressionResolver expressionResolver) {
        if (expression.evaluate(expressionResolver).booleanValue()) {
            BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
            view.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearFocusIfNeeded(View view, Expression<Boolean> expression, InputFocusTracker inputFocusTracker, ExpressionResolver expressionResolver) {
        if (expression.evaluate(expressionResolver).booleanValue()) {
            BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
        }
    }

    private static final boolean isPenetratingLongClickable(View view) {
        Object tag = view.getTag(R$id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observe(View view, List<j1> list, ExpressionResolver expressionResolver, Function1<Object, Unit> function1) {
        if ((view instanceof ExpressionSubscriber) && list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ExpressionSubscriber) view).addSubscription(((j1) it.next()).f88306b.observe(expressionResolver, function1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<j1> onlyEnabled(List<j1> list, ExpressionResolver expressionResolver) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((j1) obj).f88306b.evaluate(expressionResolver)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parentIsLongClickable(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return isPenetratingLongClickable(viewGroup) || parentIsLongClickable(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPenetratingLongClickable(View view, Boolean bool) {
        view.setTag(R$id.div_penetrating_longtap_tag, bool);
    }

    static /* synthetic */ void setPenetratingLongClickable$default(View view, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = Boolean.TRUE;
        }
        setPenetratingLongClickable(view, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observe(View view, Expression<Boolean> expression, ExpressionResolver expressionResolver, Function1<Object, Unit> function1) {
        if (view instanceof ExpressionSubscriber) {
            ((ExpressionSubscriber) view).addSubscription(expression.observe(expressionResolver, function1));
        }
    }
}
