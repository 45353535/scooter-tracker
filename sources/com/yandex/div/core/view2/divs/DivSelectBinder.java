package com.yandex.div.core.view2.divs;

import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.rn;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010#J5\u0010%\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$l;", "Lk8/rn;", "Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "typefaceResolver", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "variableBinder", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "div", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "", "applyOptions", "(Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;Lk8/rn;Lcom/yandex/div/core/view2/BindingContext;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "", "createObservedItemList", "(Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;Lk8/rn;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lcom/yandex/div/core/state/DivStatePath;", "path", "observeVariable", "(Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;Lk8/rn;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "oldDiv", "observeBaseTextProperties", "(Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;Lk8/rn;Lk8/rn;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeHintText", "(Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;Lk8/rn;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeHintColor", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;Lcom/yandex/div/core/view2/BindingContext;Lk8/rn;Lk8/rn;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivSelectBinder extends DivViewBinder<y0.l, rn, DivSelectView> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    public DivSelectBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull TwoWayStringVariableBinder twoWayStringVariableBinder, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.errorCollectors = errorCollectors;
    }

    private final void applyOptions(final DivSelectView divSelectView, final rn rnVar, final BindingContext bindingContext) {
        final Function2<View, MotionEvent, Boolean> function2CreateAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(divSelectView, bindingContext, UtilsKt.getDEFAULT_CLICK_ANIMATION(), null);
        divSelectView.setOnTouchListener(function2CreateAnimatedTouchListener != null ? new View.OnTouchListener() { // from class: n7.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DivSelectBinder.applyOptions$lambda$0(function2CreateAnimatedTouchListener, view, motionEvent);
            }
        } : null);
        final List<String> listCreateObservedItemList = createObservedItemList(divSelectView, rnVar, bindingContext.getExpressionResolver());
        divSelectView.setItems(listCreateObservedItemList);
        divSelectView.setOnItemSelectedListener(new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder.applyOptions.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f93236a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(int i10) {
                divSelectView.setText(listCreateObservedItemList.get(i10));
                Function1<String, Unit> valueUpdater = divSelectView.getValueUpdater();
                if (valueUpdater != 0) {
                    valueUpdater.invoke(((rn.c) rnVar.A.get(i10)).f90788b.evaluate(bindingContext.getExpressionResolver()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyOptions$lambda$0(Function2 function2, View view, MotionEvent motionEvent) {
        return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
    }

    private final List<String> createObservedItemList(final DivSelectView divSelectView, rn rnVar, ExpressionResolver expressionResolver) {
        final ArrayList arrayList = new ArrayList();
        final int i10 = 0;
        for (Object obj : rnVar.A) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            rn.c cVar = (rn.c) obj;
            Expression expression = cVar.f90787a;
            if (expression == null) {
                expression = cVar.f90788b;
            }
            arrayList.add(expression.evaluate(expressionResolver));
            expression.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$createObservedItemList$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str) {
                    arrayList.set(i10, str);
                    divSelectView.setItems(arrayList);
                }
            });
            i10 = i11;
        }
        return arrayList;
    }

    private final void observeBaseTextProperties(DivSelectView divSelectView, rn rnVar, rn rnVar2, ExpressionResolver expressionResolver) {
        Expression expression = rnVar.f90770m;
        Expression expression2 = rnVar.f90771n;
        Expression expression3 = rnVar.f90781x;
        Expression expression4 = rnVar.F;
        Expression expression5 = rnVar.f90782y;
        Expression expression6 = rnVar.f90769l;
        Expression expression7 = rnVar.f90773p;
        Expression expression8 = rnVar.f90774q;
        Expression expression9 = rnVar.f90772o;
        Expression expression10 = rnVar2 != null ? rnVar2.f90770m : null;
        Expression expression11 = rnVar2 != null ? rnVar2.f90771n : null;
        Expression expression12 = rnVar2 != null ? rnVar2.f90781x : null;
        Expression expression13 = rnVar2 != null ? rnVar2.F : null;
        Expression expression14 = rnVar2 != null ? rnVar2.f90782y : null;
        Expression expression15 = rnVar2 != null ? rnVar2.f90769l : null;
        TextViewExtensionsKt.observeBaseTextProperties(divSelectView, expression, expression2, expression3, expression4, expression5, expression6, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, expression15, rnVar2 != null ? rnVar2.f90773p : null, rnVar2 != null ? rnVar2.f90774q : null, rnVar2 != null ? rnVar2.f90772o : null, rnVar2, this.typefaceResolver, expressionResolver);
    }

    private final void observeHintColor(final DivSelectView divSelectView, rn rnVar, ExpressionResolver expressionResolver) {
        divSelectView.addSubscription(rnVar.f90777t.observeAndGet(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder.observeHintColor.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(int i10) {
                divSelectView.setHintTextColor(i10);
            }
        }));
    }

    private final void observeHintText(final DivSelectView divSelectView, rn rnVar, ExpressionResolver expressionResolver) {
        Expression expression = rnVar.f90778u;
        if (expression == null) {
            return;
        }
        divSelectView.addSubscription(expression.observeAndGet(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder.observeHintText.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                divSelectView.setHint(str);
            }
        }));
    }

    private final void observeVariable(final DivSelectView divSelectView, final rn rnVar, BindingContext bindingContext, DivStatePath divStatePath) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSelectView.addSubscription(this.variableBinder.bindVariable(bindingContext, rnVar.M, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1<? super String, Unit> valueUpdater) {
                divSelectView.setValueUpdater(valueUpdater);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable final String value) {
                CharSequence charSequence;
                Sequence sequenceAsSequence = CollectionsKt.asSequence(rnVar.A);
                final ExpressionResolver expressionResolver2 = expressionResolver;
                Iterator it = k.E(sequenceAsSequence, new Function1<rn.c, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull rn.c cVar) {
                        return Boolean.valueOf(Intrinsics.areEqual(cVar.f90788b.evaluate(expressionResolver2), value));
                    }
                }).iterator();
                DivSelectView divSelectView2 = divSelectView;
                if (it.hasNext()) {
                    rn.c cVar = (rn.c) it.next();
                    if (it.hasNext()) {
                        orCreate.logWarning(new Throwable("Multiple options found with value = \"" + value + "\", selecting first one"));
                    }
                    Expression expression = cVar.f90787a;
                    if (expression == null) {
                        expression = cVar.f90788b;
                    }
                    charSequence = (CharSequence) expression.evaluate(expressionResolver);
                } else {
                    orCreate.logWarning(new Throwable("No option found with value = \"" + value + '\"'));
                    charSequence = "";
                }
                divSelectView2.setText(charSequence);
            }
        }, divStatePath));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSelectView divSelectView, @NotNull BindingContext bindingContext, @NotNull rn rnVar, @Nullable rn rnVar2, @NotNull DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divSelectView.setTextAlignment(5);
        divSelectView.setFocusTracker(divView.getInputFocusTracker());
        applyOptions(divSelectView, rnVar, bindingContext);
        observeVariable(divSelectView, rnVar, bindingContext, divStatePath);
        observeBaseTextProperties(divSelectView, rnVar, rnVar2, expressionResolver);
        observeHintText(divSelectView, rnVar, expressionResolver);
        observeHintColor(divSelectView, rnVar, expressionResolver);
    }
}
