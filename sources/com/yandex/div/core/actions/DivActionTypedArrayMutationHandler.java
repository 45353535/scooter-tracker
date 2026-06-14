package com.yandex.div.core.actions;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.e2;
import k8.m5;
import k8.u1;
import k8.z1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0010J1\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedArrayMutationHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Lk8/u1;", "action", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handle", "(Lk8/u1;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/z1;", "(Lk8/z1;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/e2;", "(Lk8/e2;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "scopeId", "Lk8/m5;", "", "handleAction", "(Ljava/lang/String;Lk8/m5;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivActionTypedArrayMutationHandler implements DivActionTypedHandler {
    private final void handle(u1 action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.f91548c.evaluate(resolver);
        Expression expression = action.f91546a;
        final Integer numValueOf = expression != null ? Integer.valueOf((int) ((Number) expression.evaluate(resolver)).longValue()) : null;
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(action.f91547b, resolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(view, str, resolver, new Function1<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final JSONArray invoke(@NotNull JSONArray jSONArray) {
                int length = jSONArray.length();
                Integer num = numValueOf;
                if (num == null || num.intValue() == length) {
                    final Object obj = objEvaluate;
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1<List<Object>, Unit>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<Object> list) {
                            invoke2(list);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull List<Object> list) {
                            list.add(obj);
                        }
                    });
                }
                if (g.v(0, length).k(num.intValue())) {
                    final Integer num2 = numValueOf;
                    final Object obj2 = objEvaluate;
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1<List<Object>, Unit>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<Object> list) {
                            invoke2(list);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull List<Object> list) {
                            list.add(num2.intValue(), obj2);
                        }
                    });
                }
                DivActionTypedUtilsKt.logError(view, new IndexOutOfBoundsException("Index out of bound (" + numValueOf + ") for mutation " + str + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull m5 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (action instanceof m5.c) {
            handle(((m5.c) action).c(), view, resolver);
            return true;
        }
        if (action instanceof m5.d) {
            handle(((m5.d) action).c(), view, resolver);
            return true;
        }
        if (!(action instanceof m5.e)) {
            return false;
        }
        handle(((m5.e) action).c(), view, resolver);
        return true;
    }

    private final void handle(z1 action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.f92853b.evaluate(resolver);
        final int iLongValue = (int) ((Number) action.f92852a.evaluate(resolver)).longValue();
        DivActionTypedArrayMutationHandlerKt.updateVariable(view, str, resolver, new Function1<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final JSONArray invoke(@NotNull JSONArray jSONArray) {
                int length = jSONArray.length();
                final int i10 = iLongValue;
                if (i10 >= 0 && i10 < length) {
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1<List<Object>, Unit>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<Object> list) {
                            invoke2(list);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull List<Object> list) {
                            list.remove(i10);
                        }
                    });
                }
                DivActionTypedUtilsKt.logError(view, new IndexOutOfBoundsException("Index out of bound (" + iLongValue + ") for mutation " + str + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    private final void handle(e2 action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.f87159c.evaluate(resolver);
        final int iLongValue = (int) ((Number) action.f87157a.evaluate(resolver)).longValue();
        final Object objEvaluate = DivActionTypedUtilsKt.evaluate(action.f87158b, resolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(view, str, resolver, new Function1<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final JSONArray invoke(@NotNull JSONArray jSONArray) {
                int length = jSONArray.length();
                final int i10 = iLongValue;
                if (i10 >= 0 && i10 < length) {
                    final Object obj = objEvaluate;
                    return DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1<List<Object>, Unit>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler.handle.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<Object> list) {
                            invoke2(list);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull List<Object> list) {
                            list.set(i10, obj);
                        }
                    });
                }
                DivActionTypedUtilsKt.logError(view, new IndexOutOfBoundsException("Index out of bound (" + iLongValue + ") for mutation " + str + " (" + length + ')'));
                return jSONArray;
            }
        });
    }
}
