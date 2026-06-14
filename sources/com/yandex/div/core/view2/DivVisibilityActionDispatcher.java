package com.yandex.div.core.view2;

import android.view.View;
import androidx.privacysandbox.ads.adservices.topics.a;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k8.dp;
import k8.hx;
import k8.ra;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\b\u0011\u0018\u0000 02\u00020\u0001:\u00010B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0012¢\u0006\u0004\b\u001a\u0010\u001eJ5\u0010!\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u001bJ#\u0010'\u001a\u00020\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b/\u0010.¨\u00061"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;", "", "Lcom/yandex/div/core/Div2Logger;", "logger", "", "visibilityListeners", "Lcom/yandex/div/core/DivActionHandler;", "divActionHandler", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "divActionBeaconSender", "<init>", "(Lcom/yandex/div/core/Div2Logger;Ljava/util/List;Lcom/yandex/div/core/DivActionHandler;Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;)V", "Lk8/dp;", "action", "", "Lcom/yandex/div/core/view2/CompositeLogId;", "", "countersFor", "(Lk8/dp;)Ljava/util/Map;", "Lcom/yandex/div/core/view2/Div2View;", "scope", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "logAction", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Lk8/dp;)V", "", "actionUid", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Lk8/dp;Ljava/lang/String;)V", "", "actions", "dispatchActions", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;[Lk8/dp;)V", "dispatchAction", "", "Lk8/y0;", "visibleViews", "dispatchVisibleViewsChanged", "(Ljava/util/Map;)V", "Lcom/yandex/div/core/Div2Logger;", "Ljava/util/List;", "Lcom/yandex/div/core/DivActionHandler;", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "appearLogCounters", "Ljava/util/Map;", "disappearLogCounters", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivVisibilityActionDispatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<CompositeLogId, Integer> appearLogCounters = CollectionsKt.arrayMap();

    @NotNull
    private final Map<CompositeLogId, Integer> disappearLogCounters = CollectionsKt.arrayMap();

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionHandler divActionHandler;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final List<Object> visibilityListeners;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher$Companion;", "", "()V", "LIMITLESS_LOG", "", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivVisibilityActionDispatcher(@NotNull Div2Logger div2Logger, @NotNull List<Object> list, @NotNull DivActionHandler divActionHandler, @NotNull DivActionBeaconSender divActionBeaconSender) {
        this.logger = div2Logger;
        this.visibilityListeners = list;
        this.divActionHandler = divActionHandler;
        this.divActionBeaconSender = divActionBeaconSender;
    }

    private Map<CompositeLogId, Integer> countersFor(dp action) {
        return action instanceof hx ? this.appearLogCounters : this.disappearLogCounters;
    }

    private void logAction(Div2View scope, ExpressionResolver resolver, View view, dp action) {
        if (action instanceof hx) {
            this.logger.logViewShown(scope, resolver, view, (hx) action);
        } else {
            Div2Logger div2Logger = this.logger;
            Intrinsics.checkNotNull(action, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(scope, resolver, view, (ra) action);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(action, resolver);
    }

    public void dispatchAction(@NotNull Div2View scope, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull dp action) {
        CompositeLogId compositeLogIdCompositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(scope, (String) action.b().evaluate(resolver));
        Map<CompositeLogId, Integer> mapCountersFor = countersFor(action);
        Integer num = mapCountersFor.get(compositeLogIdCompositeLogIdOf);
        if (num == null) {
            num = 0;
            mapCountersFor.put(compositeLogIdCompositeLogIdOf, num);
        }
        int iIntValue = num.intValue();
        KLog kLog = KLog.INSTANCE;
        Severity severity = Severity.INFO;
        if (kLog.isAtLeast(severity)) {
            kLog.print(4, "DivVisibilityActionDispatcher", "visibility action dispatched: id=" + compositeLogIdCompositeLogIdOf + ", counter=" + iIntValue);
        }
        long jLongValue = ((Number) action.c().evaluate(resolver)).longValue();
        if (jLongValue == 0 || iIntValue < jLongValue) {
            if (this.divActionHandler.getUseActionUid()) {
                String string = UUID.randomUUID().toString();
                DivActionHandler actionHandler = scope.getActionHandler();
                if (!(actionHandler != null ? actionHandler.handleAction(action, scope, resolver, string) : false) && !this.divActionHandler.handleAction(action, scope, resolver, string)) {
                    logAction(scope, resolver, view, action, string);
                }
            } else {
                DivActionHandler actionHandler2 = scope.getActionHandler();
                if (!(actionHandler2 != null ? actionHandler2.handleAction(action, scope, resolver) : false) && !this.divActionHandler.handleAction(action, scope, resolver)) {
                    logAction(scope, resolver, view, action);
                }
            }
            countersFor(action).put(compositeLogIdCompositeLogIdOf, Integer.valueOf(iIntValue + 1));
            if (kLog.isAtLeast(severity)) {
                kLog.print(4, "DivVisibilityActionDispatcher", "visibility action logged: " + compositeLogIdCompositeLogIdOf);
            }
        }
    }

    public void dispatchActions(@NotNull final Div2View scope, @NotNull final ExpressionResolver resolver, @NotNull final View view, @NotNull final dp[] actions) {
        scope.bulkActions$div_release(new Function0<Unit>() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher.dispatchActions.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                dp[] dpVarArr = actions;
                DivVisibilityActionDispatcher divVisibilityActionDispatcher = this;
                Div2View div2View = scope;
                ExpressionResolver expressionResolver = resolver;
                View view2 = view;
                for (dp dpVar : dpVarArr) {
                    divVisibilityActionDispatcher.dispatchAction(div2View, expressionResolver, view2, dpVar);
                }
            }
        });
    }

    public void dispatchVisibleViewsChanged(@NotNull Map<View, ? extends y0> visibleViews) {
        Iterator<T> it = this.visibilityListeners.iterator();
        if (it.hasNext()) {
            a.a(it.next());
            throw null;
        }
    }

    private void logAction(Div2View scope, ExpressionResolver resolver, View view, dp action, String actionUid) {
        if (action instanceof hx) {
            this.logger.logViewShown(scope, resolver, view, (hx) action, actionUid);
        } else {
            Div2Logger div2Logger = this.logger;
            Intrinsics.checkNotNull(action, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(scope, resolver, view, (ra) action, actionUid);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(action, resolver);
    }
}
