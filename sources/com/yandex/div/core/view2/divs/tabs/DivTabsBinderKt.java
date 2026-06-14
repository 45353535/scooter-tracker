package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.tabs.TabView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.as;
import k8.ep;
import k8.hb;
import k8.jd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u000f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0012\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0017\u001a\u00020\r*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "Lk8/as;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "tryReuse", "(Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;Lk8/as;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "", "Lk8/as$c;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "Lkotlin/Function1;", "", "", "observer", "observeFixedHeightChange", "(Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lkotlin/jvm/functions/Function1;)V", "Lk8/hb;", "observe", "(Lk8/hb;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/internal/widget/tabs/TabView;", "Lk8/as$e;", "style", "observeStyle", "(Lcom/yandex/div/internal/widget/tabs/TabView;Lk8/as$e;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "Lk8/jd;", "Lcom/yandex/div/core/font/DivTypefaceType;", "toTypefaceType", "(Lk8/jd;)Lcom/yandex/div/core/font/DivTypefaceType;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTabsBinderKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jd.values().length];
            try {
                iArr[jd.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jd.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jd.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jd.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe(hb hbVar, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1<Object, Unit> function1) {
        expressionSubscriber.addSubscription(hbVar.f88002c.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(hbVar.f88003d.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(hbVar.f88005f.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(hbVar.f88000a.observe(expressionResolver, function1));
        function1.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFixedHeightChange(List<as.c> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1<Object, Unit> function1) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ep height = ((as.c) it.next()).f86355a.c().getHeight();
            if (height instanceof ep.c) {
                ep.c cVar = (ep.c) height;
                expressionSubscriber.addSubscription(cVar.c().f92338a.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(cVar.c().f92339b.observe(expressionResolver, function1));
            }
        }
    }

    public static final void observeStyle(@NotNull final TabView tabView, @NotNull as.e eVar, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        TextViewExtensionsKt.observeFontSize(tabView, eVar.f86383j, eVar.f86384k, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLetterSpacing(tabView, eVar.f86391r, eVar.f86383j, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLineHeight(tabView, eVar.f86392s, eVar.f86384k, null, null, expressionResolver, expressionSubscriber);
        final hb hbVar = eVar.f86393t;
        final DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyTabPaddings$1
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
            public final void invoke2(@Nullable Object obj) {
                hb hbVar2 = hbVar;
                Expression expression = hbVar2.f88004e;
                if (expression == null && hbVar2.f88001b == null) {
                    tabView.setTabPadding(BaseDivViewExtensionsKt.dpToPx((Long) hbVar2.f88002c.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) hbVar.f88005f.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) hbVar.f88003d.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) hbVar.f88000a.evaluate(expressionResolver), displayMetrics));
                    return;
                }
                TabView tabView2 = tabView;
                int iDpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics);
                int iDpToPx2 = BaseDivViewExtensionsKt.dpToPx((Long) hbVar.f88005f.evaluate(expressionResolver), displayMetrics);
                Expression expression2 = hbVar.f88001b;
                tabView2.setTabPadding(iDpToPx, iDpToPx2, BaseDivViewExtensionsKt.dpToPx(expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null, displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) hbVar.f88000a.evaluate(expressionResolver), displayMetrics));
            }
        };
        expressionSubscriber.addSubscription(hbVar.f88005f.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(hbVar.f88000a.observe(expressionResolver, function1));
        Expression expression = hbVar.f88004e;
        if (expression == null && hbVar.f88001b == null) {
            expressionSubscriber.addSubscription(hbVar.f88002c.observe(expressionResolver, function1));
            expressionSubscriber.addSubscription(hbVar.f88003d.observe(expressionResolver, function1));
        } else {
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
            Expression expression2 = hbVar.f88001b;
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
        }
        function1.invoke(null);
        Expression expression3 = eVar.f86388o;
        if (expression3 == null) {
            expression3 = eVar.f86385l;
        }
        observeStyle$addToSubscriber(expression3, expressionSubscriber, expressionResolver, new Function1<jd, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt.observeStyle.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(jd jdVar) {
                invoke2(jdVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull jd jdVar) {
                tabView.setInactiveTypefaceType(DivTabsBinderKt.toTypefaceType(jdVar));
            }
        });
        Expression expression4 = eVar.f86376c;
        if (expression4 == null) {
            expression4 = eVar.f86385l;
        }
        observeStyle$addToSubscriber(expression4, expressionSubscriber, expressionResolver, new Function1<jd, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt.observeStyle.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(jd jdVar) {
                invoke2(jdVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull jd jdVar) {
                tabView.setActiveTypefaceType(DivTabsBinderKt.toTypefaceType(jdVar));
            }
        });
    }

    private static final void observeStyle$addToSubscriber(Expression<jd> expression, ExpressionSubscriber expressionSubscriber, ExpressionResolver expressionResolver, Function1<? super jd, Unit> function1) {
        expressionSubscriber.addSubscription(expression.observeAndGet(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTypefaceType toTypefaceType(jd jdVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[jdVar.ordinal()];
        if (i10 == 1) {
            return DivTypefaceType.MEDIUM;
        }
        if (i10 == 2) {
            return DivTypefaceType.REGULAR;
        }
        if (i10 == 3) {
            return DivTypefaceType.LIGHT;
        }
        if (i10 == 4) {
            return DivTypefaceType.BOLD;
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTabsAdapter tryReuse(DivTabsAdapter divTabsAdapter, as asVar, ExpressionResolver expressionResolver) {
        if (divTabsAdapter != null && divTabsAdapter.getIsDynamicHeight() == ((Boolean) asVar.f86335j.evaluate(expressionResolver)).booleanValue()) {
            return divTabsAdapter;
        }
        return null;
    }
}
