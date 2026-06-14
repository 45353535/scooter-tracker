package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.SearchRoute;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k8.ar;
import k8.f7;
import k8.ff;
import k8.gf;
import k8.gn;
import k8.jk;
import k8.jp;
import k8.la;
import k8.to;
import k8.xc;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.v0;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001:B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0013\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010!\u001a\u00020 *\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J;\u0010!\u001a\u00020 *\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010%J'\u0010&\u001a\u00020 *\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J-\u0010/\u001a\u00020\u0011*\u00020\u00042\u0006\u0010-\u001a\u00020(2\u0006\u0010\f\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b/\u00100J\u0011\u00103\u001a\u000202*\u000201¢\u0006\u0004\b3\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0018\u00109\u001a\u000206*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$i;", "Lk8/ff;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "pagerIndicatorConnector", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;)V", "Lk8/f7;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lkotlin/Function1;", "", "", "callback", "observeWidthAndHeightSubscription", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "indicator", "applyStyle", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/ff;)V", "Lk8/gn;", "Landroid/util/DisplayMetrics;", "metrics", "Lcom/yandex/div/json/expressions/Expression;", "", "deprecatedColor", "", "multiplier", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "toIndicatorParamsShape", "(Lk8/gn;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/Expression;F)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "Lk8/to;", "color", "(Lk8/to;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/Expression;F)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "multiply", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;FLjava/lang/Integer;)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;Lk8/y0$i;)V", "bindingContext", "oldDiv", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;Lcom/yandex/div/core/view2/BindingContext;Lk8/ff;Lk8/ff;)V", "Lk8/ff$a;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "convert", "(Lk8/ff$a;)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "Lk8/gf;", "getItemsPlacementCompat", "(Lk8/ff;)Lk8/gf;", "itemsPlacementCompat", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivIndicatorBinder extends DivViewBinder<y0.i, ff, DivPagerIndicatorView> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0002\b\nJQ\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivIndicatorBinder$Companion;", "", "()V", "createCircle", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "color", "", "radius", "", "multiplier", "createCircle$div_release", "createRoundedRectangle", "width", "height", "cornerRadius", "strokeWidth", "strokeColor", "createRoundedRectangle$div_release", "(IFFFFLjava/lang/Float;Ljava/lang/Integer;)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IndicatorParams$Shape createCircle$div_release(int color, float radius, float multiplier) {
            return new IndicatorParams$Shape.Circle(color, new IndicatorParams$ItemSize.Circle(radius * multiplier));
        }

        @NotNull
        public final IndicatorParams$Shape createRoundedRectangle$div_release(int color, float width, float height, float cornerRadius, float multiplier, @Nullable Float strokeWidth, @Nullable Integer strokeColor) {
            return new IndicatorParams$Shape.RoundedRect(color, new IndicatorParams$ItemSize.RoundedRect(width * multiplier, height * multiplier, cornerRadius * multiplier), strokeWidth != null ? strokeWidth.floatValue() : 0.0f, strokeColor != null ? strokeColor.intValue() : 0);
        }

        private Companion() {
        }
    }

    public DivIndicatorBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector) {
        super(divBaseBinder);
        this.pagerIndicatorConnector = pagerIndicatorConnector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void applyStyle(com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView r17, com.yandex.div.json.expressions.ExpressionResolver r18, k8.ff r19) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivIndicatorBinder.applyStyle(com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView, com.yandex.div.json.expressions.ExpressionResolver, k8.ff):void");
    }

    private final gf getItemsPlacementCompat(ff ffVar) {
        gf gfVar = ffVar.f87493v;
        return gfVar == null ? new gf.c(new la(ffVar.F)) : gfVar;
    }

    private final IndicatorParams$Shape multiply(IndicatorParams$Shape indicatorParams$Shape, float f10, Integer num) {
        if (!(indicatorParams$Shape instanceof IndicatorParams$Shape.RoundedRect)) {
            if (indicatorParams$Shape instanceof IndicatorParams$Shape.Circle) {
                return INSTANCE.createCircle$div_release(num != null ? num.intValue() : indicatorParams$Shape.getColor(), ((IndicatorParams$Shape.Circle) indicatorParams$Shape).getItemSize().getRadius(), f10);
            }
            throw new m();
        }
        Companion companion = INSTANCE;
        int iIntValue = num != null ? num.intValue() : indicatorParams$Shape.getColor();
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) indicatorParams$Shape;
        return companion.createRoundedRectangle$div_release(iIntValue, roundedRect.getItemSize().getItemWidth(), roundedRect.getItemSize().getItemHeight(), roundedRect.getItemSize().getCornerRadius(), f10, Float.valueOf(roundedRect.getStrokeWidth()), Integer.valueOf(roundedRect.getStrokeColor()));
    }

    static /* synthetic */ IndicatorParams$Shape multiply$default(DivIndicatorBinder divIndicatorBinder, IndicatorParams$Shape indicatorParams$Shape, float f10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return divIndicatorBinder.multiply(indicatorParams$Shape, f10, num);
    }

    private final void observeWidthAndHeightSubscription(DivPagerIndicatorView divPagerIndicatorView, f7 f7Var, ExpressionResolver expressionResolver, Function1<Object, Unit> function1) {
        Object objB = f7Var.getWidth().b();
        if (objB instanceof xc) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (xc) objB, expressionResolver, function1);
        }
        Object objB2 = f7Var.getHeight().b();
        if (objB2 instanceof xc) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (xc) objB2, expressionResolver, function1);
        }
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(gn gnVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f10) {
        jp jpVar;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        ar arVar = gnVar.f87844e;
        if (arVar == null || (expression4 = arVar.f86315c) == null || (jpVar = (jp) expression4.evaluate(expressionResolver)) == null) {
            jpVar = jp.DP;
        }
        ar arVar2 = gnVar.f87844e;
        Integer num = null;
        Integer numValueOf = (arVar2 == null || (expression3 = arVar2.f86316d) == null) ? null : Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Double.valueOf(((Number) expression3.evaluate(expressionResolver)).doubleValue()), displayMetrics, jpVar));
        Companion companion = INSTANCE;
        Expression<Integer> expression5 = gnVar.f87840a;
        if (expression5 == null) {
            expression5 = expression;
        }
        int iIntValue = expression5.evaluate(expressionResolver).intValue();
        float pxF = BaseDivViewExtensionsKt.toPxF(gnVar.f87843d, displayMetrics, expressionResolver);
        float pxF2 = BaseDivViewExtensionsKt.toPxF(gnVar.f87842c, displayMetrics, expressionResolver);
        float pxF3 = BaseDivViewExtensionsKt.toPxF(gnVar.f87841b, displayMetrics, expressionResolver);
        Float fValueOf = numValueOf != null ? Float.valueOf(numValueOf.intValue()) : null;
        ar arVar3 = gnVar.f87844e;
        if (arVar3 != null && (expression2 = arVar3.f86313a) != null) {
            num = (Integer) expression2.evaluate(expressionResolver);
        }
        return companion.createRoundedRectangle$div_release(iIntValue, pxF, pxF2, pxF3, f10, fValueOf, num);
    }

    static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, gn gnVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(gnVar, displayMetrics, expressionResolver, (Expression<Integer>) expression, f10);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivPagerIndicatorView view, @NotNull y0.i div) {
        f7 f7Var;
        y0 y0VarRootDiv$div_release = context.getDivView().rootDiv$div_release();
        if (y0VarRootDiv$div_release != null) {
            ExpressionResolver expressionResolver = context.getExpressionResolver();
            f7 f7VarC = div.c();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ArrayList<SearchRoute> arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator itWithIndex = CollectionsKt.withIndex(DivTreeWalkKt.walk(y0VarRootDiv$div_release, expressionResolver).onEnter(new Function1<y0, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull y0 y0Var) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onEnter();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.f93280b;
                    if (searchRoute != null) {
                        searchRoute.onEnter();
                    }
                    return Boolean.TRUE;
                }
            }).onLeave(new Function1<y0, Unit>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(y0 y0Var) {
                    invoke2(y0Var);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull y0 y0Var) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onLeave();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.f93280b;
                    if (searchRoute != null) {
                        searchRoute.onLeave();
                    }
                }
            }).iterator());
            while (true) {
                f7Var = null;
                if (!itWithIndex.hasNext()) {
                    break;
                }
                f7 f7VarC2 = ((DivItemBuilderResult) ((IndexedValue) itWithIndex.next()).getValue()).getDiv().c();
                if (f7VarC2 == f7VarC) {
                    for (SearchRoute searchRoute : arrayList) {
                        if (((f7) searchRoute.getItem()) != null) {
                            linkedHashMap.put(searchRoute.getItem(), Integer.valueOf(searchRoute.getMovedDistance()));
                        }
                    }
                    arrayList.clear();
                    ref$ObjectRef.f93280b = new SearchRoute(null);
                }
                if (f7VarC2 instanceof jk) {
                    jk jkVar = (jk) f7VarC2;
                    if (div.d().A == null || Intrinsics.areEqual(jkVar.getId(), div.d().A)) {
                        Object obj = ref$ObjectRef.f93280b;
                        if (obj != null) {
                            linkedHashMap.put(f7VarC2, Integer.valueOf(((SearchRoute) obj).getMovedDistance()));
                        } else {
                            arrayList.add(new SearchRoute(f7VarC2));
                        }
                    }
                }
            }
            Integer num = (Integer) CollectionsKt.minOrNull((Iterable) linkedHashMap.values());
            if (num != null) {
                int iIntValue = num.intValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() == iIntValue) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap2.keySet();
                if (!setKeySet.isEmpty()) {
                    if (setKeySet.size() > 1) {
                        Log.w("SearchUtil", "Distance clash when searching for the nearest " + v0.b(jk.class).getSimpleName() + ". First found is taken");
                    }
                    f7Var = (f7) CollectionsKt.first(setKeySet);
                }
            }
            jk jkVar2 = (jk) f7Var;
            if (jkVar2 != null) {
                this.pagerIndicatorConnector.submitIndicator$div_release(view, jkVar2);
            }
        }
        super.bindView(context, view, div);
    }

    @NotNull
    public final IndicatorParams$Animation convert(@NotNull ff.a aVar) {
        return aVar == ff.a.WORM ? IndicatorParams$Animation.WORM : aVar == ff.a.SLIDER ? IndicatorParams$Animation.SLIDER : IndicatorParams$Animation.SCALE;
    }

    static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, to toVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(toVar, displayMetrics, expressionResolver, (Expression<Integer>) expression, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivPagerIndicatorView divPagerIndicatorView, @NotNull BindingContext bindingContext, @NotNull final ff ffVar, @Nullable ff ffVar2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyStyle(divPagerIndicatorView, expressionResolver, ffVar);
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bind$callback$1
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
                this.this$0.applyStyle(divPagerIndicatorView, expressionResolver, ffVar);
            }
        };
        divPagerIndicatorView.addSubscription(ffVar.f87479h.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(ffVar.f87473b.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(ffVar.f87474c.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(ffVar.f87490s.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(ffVar.f87496y.observe(expressionResolver, function1));
        ExpressionSubscribersKt.observeShape(divPagerIndicatorView, ffVar.E, expressionResolver, function1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, ffVar.f87475d, expressionResolver, function1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, ffVar.f87492u, expressionResolver, function1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, ffVar.f87491t, expressionResolver, function1);
        gf itemsPlacementCompat = getItemsPlacementCompat(ffVar);
        if (itemsPlacementCompat instanceof gf.c) {
            gf.c cVar = (gf.c) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(cVar.c().f88773a.f92339b.observe(expressionResolver, function1));
            divPagerIndicatorView.addSubscription(cVar.c().f88773a.f92338a.observe(expressionResolver, function1));
        } else if (itemsPlacementCompat instanceof gf.d) {
            gf.d dVar = (gf.d) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(dVar.c().f92228a.f92339b.observe(expressionResolver, function1));
            divPagerIndicatorView.addSubscription(dVar.c().f92228a.f92338a.observe(expressionResolver, function1));
            divPagerIndicatorView.addSubscription(dVar.c().f92229b.observe(expressionResolver, function1));
        }
        observeWidthAndHeightSubscription(divPagerIndicatorView, ffVar, expressionResolver, function1);
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(to toVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f10) {
        if (toVar instanceof to.d) {
            return toIndicatorParamsShape(((to.d) toVar).c(), displayMetrics, expressionResolver, expression, f10);
        }
        if (!(toVar instanceof to.a)) {
            throw new m();
        }
        return INSTANCE.createCircle$div_release(expression.evaluate(expressionResolver).intValue(), BaseDivViewExtensionsKt.toPxF(((to.a) toVar).c().f86907b, displayMetrics, expressionResolver), f10);
    }
}
