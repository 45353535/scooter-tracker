package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8.f7;
import k8.le;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B5\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010 \u001a\u00020\u0016*\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J7\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010&J1\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\"*\u00020'2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020#2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b0\u00101J#\u00102\u001a\u00020\u0016*\u00020-2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J+\u00106\u001a\u00020\u0016*\u00020-2\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0019H\u0002¢\u0006\u0004\b6\u00107J+\u00108\u001a\u00020\u0016*\u00020-2\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0019H\u0002¢\u0006\u0004\b8\u00107J/\u0010;\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b=\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@¨\u0006A"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGridBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$g;", "Lk8/le;", "Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/downloader/DivPatchManager;", "divPatchManager", "Lkf/a;", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "divViewCreator", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/downloader/DivPatchManager;Lkf/a;Lkf/a;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "div", "oldDiv", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "bindItems", "(Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;Lcom/yandex/div/core/view2/BindingContext;Lk8/le;Lk8/le;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/json/expressions/Expression;", "Lk8/y5;", "horizontalAlignment", "Lk8/z5;", "verticalAlignment", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "observeContentAlignment", "(Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "Lk8/y0;", FirebaseAnalytics.Param.ITEMS, "dispatchBinding", "(Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;Lcom/yandex/div/core/view2/BindingContext;Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;)Ljava/util/List;", "Landroid/view/ViewGroup;", "childDiv", "", "childIndex", "applyPatchToChild", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;I)Ljava/util/List;", "Landroid/view/View;", "childView", "Lk8/f7;", "bindLayoutParams", "(Landroid/view/View;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "applyGridLayoutParams", "(Landroid/view/View;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/f7;)V", "", "spanExpr", "applyColumnSpan", "(Landroid/view/View;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/Expression;)V", "applyRowSpan", POBCoreNativeConstants.NATIVE_CONTEXT, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;Lk8/y0$g;Lcom/yandex/div/core/state/DivStatePath;)V", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;Lcom/yandex/div/core/view2/BindingContext;Lk8/le;Lk8/le;)V", "Lcom/yandex/div/core/downloader/DivPatchManager;", "Lkf/a;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGridBinder extends DivViewBinder<y0.g, le, DivGridLayout> {

    @NotNull
    private final kf.a divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final kf.a divViewCreator;

    public DivGridBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivPatchManager divPatchManager, @NotNull kf.a aVar, @NotNull kf.a aVar2) {
        super(divBaseBinder);
        this.divPatchManager = divPatchManager;
        this.divBinder = aVar;
        this.divViewCreator = aVar2;
    }

    private final void applyColumnSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long jLongValue = expression.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i10 = 1;
        }
        if (divLayoutParams.getColumnSpan() != i10) {
            divLayoutParams.setColumnSpan(i10);
            view.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGridLayoutParams(View view, ExpressionResolver expressionResolver, f7 f7Var) {
        applyColumnSpan(view, expressionResolver, f7Var.b());
        applyRowSpan(view, expressionResolver, f7Var.e());
    }

    private final List<y0> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, y0 y0Var, int i10) {
        Div2View divView = bindingContext.getDivView();
        String id2 = y0Var.c().getId();
        if (id2 == null || divView.getComplexRebindInProgress$div_release()) {
            return CollectionsKt.listOf(y0Var);
        }
        Map<y0, View> mapCreateViewsForId = this.divPatchManager.createViewsForId(bindingContext, id2);
        if (mapCreateViewsForId == null) {
            return CollectionsKt.listOf(y0Var);
        }
        viewGroup.removeViewAt(i10);
        Iterator<Map.Entry<y0, View>> it = mapCreateViewsForId.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            viewGroup.addView(it.next().getValue(), i11 + i10, new DivLayoutParams(-2, -2));
            i11++;
        }
        return CollectionsKt.toList(mapCreateViewsForId.keySet());
    }

    private final void applyRowSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long jLongValue = expression.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i10 = 1;
        }
        if (divLayoutParams.getRowSpan() != i10) {
            divLayoutParams.setRowSpan(i10);
            view.requestLayout();
        }
    }

    private final void bindItems(DivGridLayout divGridLayout, BindingContext bindingContext, le leVar, le leVar2, DivStatePath divStatePath) {
        List list;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<y0> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(leVar);
        RebindUtilsKt.tryRebindPlainContainerChildren(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(nonNullItems, expressionResolver), this.divViewCreator);
        BaseDivViewExtensionsKt.trackVisibilityActions(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(dispatchBinding(divGridLayout, bindingContext, nonNullItems, divStatePath), expressionResolver), (leVar2 == null || (list = leVar2.f88817y) == null) ? null : DivCollectionExtensionsKt.toDivItemBuilderResult(list, expressionResolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindLayoutParams(final View childView, final f7 childDiv, final ExpressionResolver resolver) {
        applyGridLayoutParams(childView, resolver, childDiv);
        if (childView instanceof ExpressionSubscriber) {
            Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindLayoutParams$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object obj) {
                    this.this$0.applyGridLayoutParams(childView, resolver, childDiv);
                }
            };
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) childView;
            Expression expressionB = childDiv.b();
            expressionSubscriber.addSubscription(expressionB != null ? expressionB.observe(resolver, function1) : null);
            Expression expressionE = childDiv.e();
            expressionSubscriber.addSubscription(expressionE != null ? expressionE.observe(resolver, function1) : null);
        }
    }

    private final List<y0> dispatchBinding(DivGridLayout divGridLayout, BindingContext bindingContext, List<? extends y0> list, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int size = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<y0> listApplyPatchToChild = applyPatchToChild(divGridLayout, bindingContext, (y0) obj, i11 + size);
            size += listApplyPatchToChild.size() - 1;
            CollectionsKt.addAll(arrayList, listApplyPatchToChild);
            i11 = i12;
        }
        List<String> ids = DivPathUtils.INSTANCE.getIds(arrayList);
        for (Object obj2 : arrayList) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            y0 y0Var = (y0) obj2;
            View childAt = divGridLayout.getChildAt(i10);
            f7 f7VarC = y0Var.c();
            ((DivBinder) this.divBinder.get()).bind(bindingContext, childAt, y0Var, divStatePath.appendDiv(ids.get(i10)));
            bindLayoutParams(childAt, f7VarC, expressionResolver);
            if (DivUtilKt.getHasSightActions(f7VarC)) {
                divView.bindViewToDiv$div_release(childAt, y0Var);
            } else {
                divView.unbindViewFromDiv$div_release(childAt);
            }
            i10 = i13;
        }
        return arrayList;
    }

    private final void observeContentAlignment(final DivGridLayout divGridLayout, final Expression<y5> expression, final Expression<z5> expression2, final ExpressionResolver expressionResolver) {
        divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
        Function1<? super y5, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
            }
        };
        divGridLayout.addSubscription(expression.observe(expressionResolver, function1));
        divGridLayout.addSubscription(expression2.observe(expressionResolver, function1));
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivGridLayout view, @NotNull y0.g div, @NotNull DivStatePath path) {
        super.bindView(context, view, div, path);
        le leVarD = div.d();
        y0.g div2 = view.getDiv();
        bindItems(view, context, leVarD, div2 != null ? div2.d() : null, path);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivGridLayout divGridLayout, @NotNull BindingContext bindingContext, @NotNull le leVar, @Nullable le leVar2) {
        divGridLayout.setReleaseViewVisitor$div_release(bindingContext.getDivView().getReleaseViewVisitor$div_release());
        BaseDivViewExtensionsKt.applyDivActions(divGridLayout, bindingContext, leVar.f88794b, leVar.f88796d, leVar.A, leVar.f88809q, leVar.f88815w, leVar.f88814v, leVar.E, leVar.D, leVar.f88795c, leVar.f88803k);
        divGridLayout.addSubscription(leVar.f88804l.observeAndGet(bindingContext.getExpressionResolver(), new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder.bind.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                int i10;
                DivGridLayout divGridLayout2 = divGridLayout;
                long j11 = j10 >> 31;
                if (j11 == 0 || j11 == -1) {
                    i10 = (int) j10;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + j10 + "' to Int");
                    }
                    i10 = j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divGridLayout2.setColumnCount(i10);
            }
        }));
        observeContentAlignment(divGridLayout, leVar.f88806n, leVar.f88807o, bindingContext.getExpressionResolver());
    }
}
