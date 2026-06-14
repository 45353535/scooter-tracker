package com.yandex.div.core.view2;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnyThread;
import androidx.core.os.HandlerCompat;
import androidx.core.view.ViewGroupKt;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SynchronizedWeakHashMap;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivSightExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k8.dp;
import k8.hx;
import k8.ra;
import k8.y0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0012¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010%\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0012¢\u0006\u0004\b%\u0010&JE\u0010*\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#H\u0012¢\u0006\u0004\b*\u0010+J1\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0012¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0012¢\u0006\u0004\b0\u00101J1\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\b\b\u0000\u00102*\u00020\u001f*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0012¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f05H\u0016¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\u00112\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0017¢\u0006\u0004\b9\u0010:JQ\u0010;\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0017¢\u0006\u0004\b;\u0010\u001eJ'\u0010<\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010=J)\u0010@\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010>\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b@\u0010=J)\u0010A\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010>\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bA\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010E\u001a\u00020D8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020#8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020#8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0M8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0M8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bP\u0010OR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0M8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bQ\u0010OR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0R8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bS\u0010TR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0U0M8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bV\u0010OR\u0016\u0010W\u001a\u00020\u000f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "", "Lcom/yandex/div/core/view2/ViewVisibilityCalculator;", "viewVisibilityCalculator", "Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;", "visibilityActionDispatcher", "<init>", "(Lcom/yandex/div/core/view2/ViewVisibilityCalculator;Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/y0;", "div", "Lkotlin/Function2;", "", "trackAction", "", "trackViewsHierarchy", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0;Lkotlin/jvm/functions/Function2;)V", "Lcom/yandex/div/core/view2/Div2View;", "scope", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "Lk8/hx;", "appearActions", "Lk8/ra;", "disappearActions", "trackVisibilityActions", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Lk8/y0;Ljava/util/List;Ljava/util/List;)V", "Lk8/dp;", "action", "", "visibilityPercentage", "Lcom/yandex/div/core/view2/DivVisibilityTokenHolder;", "trackedTokens", "shouldTrackVisibilityAction", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Lk8/dp;ILcom/yandex/div/core/view2/DivVisibilityTokenHolder;)Z", "actions", "", "delayMs", "startTracking", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Ljava/util/List;JLcom/yandex/div/core/view2/DivVisibilityTokenHolder;)V", "Lcom/yandex/div/core/view2/CompositeLogId;", "compositeLogId", "cancelTracking", "(Lcom/yandex/div/core/view2/CompositeLogId;Landroid/view/View;Lk8/dp;Lcom/yandex/div/core/view2/DivVisibilityTokenHolder;)V", "updateVisibility", "(Landroid/view/View;Lk8/y0;I)V", "T", "filterEnabled", "(Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "", "getDivWithWaitingDisappearActions", "()Ljava/util/Map;", "viewList", "updateVisibleViews", "(Ljava/util/List;)V", "trackVisibilityActionsOf", "trackDetachedView", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0;)V", "root", "rootDiv", "startTrackingViewsHierarchy", "cancelTrackingViewsHierarchy", "Lcom/yandex/div/core/view2/ViewVisibilityCalculator;", "Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "appearTrackedTokens", "Lcom/yandex/div/core/view2/DivVisibilityTokenHolder;", "disappearTrackedTokens", "Lcom/yandex/div/core/view2/SightActionIsEnabledObserver;", "isEnabledObserver", "Lcom/yandex/div/core/view2/SightActionIsEnabledObserver;", "Ljava/util/WeakHashMap;", "visibleActions", "Ljava/util/WeakHashMap;", "enqueuedVisibilityActions", "previousVisibilityIsFull", "Lcom/yandex/div/core/util/SynchronizedWeakHashMap;", "divWithWaitingDisappearActions", "Lcom/yandex/div/core/util/SynchronizedWeakHashMap;", "", "appearedForDisappearActions", "hasPostedUpdateVisibilityTask", "Z", "Ljava/lang/Runnable;", "updateVisibilityTask", "Ljava/lang/Runnable;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivVisibilityActionTracker {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean hasPostedUpdateVisibilityTask;

    @NotNull
    private final ViewVisibilityCalculator viewVisibilityCalculator;

    @NotNull
    private final DivVisibilityActionDispatcher visibilityActionDispatcher;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final DivVisibilityTokenHolder appearTrackedTokens = new DivVisibilityTokenHolder();

    @NotNull
    private final DivVisibilityTokenHolder disappearTrackedTokens = new DivVisibilityTokenHolder();

    @NotNull
    private final SightActionIsEnabledObserver isEnabledObserver = new SightActionIsEnabledObserver(new Function5<Div2View, ExpressionResolver, View, y0, dp, Unit>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$1
        {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Div2View div2View, ExpressionResolver expressionResolver, View view, y0 y0Var, dp dpVar) {
            invoke2(div2View, expressionResolver, view, y0Var, dpVar);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull y0 y0Var, @NotNull dp dpVar) {
            if (dpVar instanceof hx) {
                this.this$0.trackVisibilityActions(div2View, expressionResolver, view, y0Var, CollectionsKt.listOf(dpVar), CollectionsKt.emptyList());
            } else if (dpVar instanceof ra) {
                this.this$0.trackVisibilityActions(div2View, expressionResolver, view, y0Var, CollectionsKt.emptyList(), CollectionsKt.listOf(dpVar));
            }
        }
    }, new Function5<Div2View, ExpressionResolver, View, y0, dp, Unit>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$2
        {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Div2View div2View, ExpressionResolver expressionResolver, View view, y0 y0Var, dp dpVar) {
            invoke2(div2View, expressionResolver, view, y0Var, dpVar);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull y0 y0Var, @NotNull dp dpVar) {
            if (dpVar instanceof hx) {
                DivVisibilityActionTracker divVisibilityActionTracker = this.this$0;
                divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver, null, dpVar, 0, divVisibilityActionTracker.appearTrackedTokens);
            } else if (dpVar instanceof ra) {
                DivVisibilityActionTracker divVisibilityActionTracker2 = this.this$0;
                divVisibilityActionTracker2.shouldTrackVisibilityAction(div2View, expressionResolver, null, dpVar, 0, divVisibilityActionTracker2.disappearTrackedTokens);
            }
        }
    });

    @NotNull
    private final WeakHashMap<View, y0> visibleActions = new WeakHashMap<>();

    @NotNull
    private final WeakHashMap<View, y0> enqueuedVisibilityActions = new WeakHashMap<>();

    @NotNull
    private final WeakHashMap<View, Boolean> previousVisibilityIsFull = new WeakHashMap<>();

    @NotNull
    private final SynchronizedWeakHashMap<View, y0> divWithWaitingDisappearActions = new SynchronizedWeakHashMap<>();

    @NotNull
    private final WeakHashMap<View, Set<ra>> appearedForDisappearActions = new WeakHashMap<>();

    @NotNull
    private final Runnable updateVisibilityTask = new Runnable() { // from class: l7.u
        @Override // java.lang.Runnable
        public final void run() {
            DivVisibilityActionTracker.updateVisibilityTask$lambda$0(this.f94076b);
        }
    };

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionTracker$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivVisibilityActionTracker(@NotNull ViewVisibilityCalculator viewVisibilityCalculator, @NotNull DivVisibilityActionDispatcher divVisibilityActionDispatcher) {
        this.viewVisibilityCalculator = viewVisibilityCalculator;
        this.visibilityActionDispatcher = divVisibilityActionDispatcher;
    }

    private void cancelTracking(CompositeLogId compositeLogId, View view, dp action, DivVisibilityTokenHolder trackedTokens) {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "DivVisibilityActionTracker", "cancelTracking: id=" + compositeLogId);
        }
        trackedTokens.remove(compositeLogId, new Function1<Map<CompositeLogId, ? extends dp>, Unit>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker.cancelTracking.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<CompositeLogId, ? extends dp> map) {
                invoke2(map);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Map<CompositeLogId, ? extends dp> map) {
                DivVisibilityActionTracker.this.handler.removeCallbacksAndMessages(map);
            }
        });
        Set<ra> set = this.appearedForDisappearActions.get(view);
        if (!(action instanceof ra) || view == null || set == null) {
            return;
        }
        set.remove(action);
        if (set.isEmpty()) {
            this.appearedForDisappearActions.remove(view);
            this.divWithWaitingDisappearActions.remove(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends dp> List<T> filterEnabled(List<? extends T> list, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((dp) obj).isEnabled().evaluate(expressionResolver)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldTrackVisibilityAction(com.yandex.div.core.view2.Div2View r8, com.yandex.div.json.expressions.ExpressionResolver r9, android.view.View r10, k8.dp r11, int r12, com.yandex.div.core.view2.DivVisibilityTokenHolder r13) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof k8.hx
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            long r3 = (long) r12
            r12 = r11
            k8.hx r12 = (k8.hx) r12
            com.yandex.div.json.expressions.Expression r12 = r12.f88153k
            java.lang.Object r12 = r12.evaluate(r9)
            java.lang.Number r12 = (java.lang.Number) r12
            long r5 = r12.longValue()
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 < 0) goto L1c
        L1a:
            r12 = r1
            goto L57
        L1c:
            r12 = r2
            goto L57
        L1e:
            boolean r0 = r11 instanceof k8.ra
            if (r0 == 0) goto L49
            java.util.WeakHashMap<android.view.View, java.util.Set<k8.ra>> r0 = r7.appearedForDisappearActions
            java.lang.Object r0 = r0.get(r10)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L31
            boolean r0 = r0.contains(r11)
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L1c
            long r3 = (long) r12
            r12 = r11
            k8.ra r12 = (k8.ra) r12
            com.yandex.div.json.expressions.Expression r12 = r12.f90665k
            java.lang.Object r12 = r12.evaluate(r9)
            java.lang.Number r12 = (java.lang.Number) r12
            long r5 = r12.longValue()
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 > 0) goto L1c
            goto L1a
        L49:
            com.yandex.div.internal.KAssert r12 = com.yandex.div.internal.KAssert.INSTANCE
            boolean r12 = com.yandex.div.internal.Assert.isEnabled()
            if (r12 == 0) goto L1c
            java.lang.String r12 = "Trying to check visibility for class without known visibility range"
            com.yandex.div.internal.Assert.fail(r12)
            goto L1c
        L57:
            com.yandex.div.json.expressions.Expression r0 = r11.b()
            java.lang.Object r9 = r0.evaluate(r9)
            java.lang.String r9 = (java.lang.String) r9
            com.yandex.div.core.view2.CompositeLogId r8 = com.yandex.div.core.view2.CompositeLogIdKt.compositeLogIdOf(r8, r9)
            com.yandex.div.core.view2.CompositeLogId r8 = r13.getLogId(r8)
            if (r10 == 0) goto L70
            if (r8 != 0) goto L70
            if (r12 == 0) goto L70
            return r1
        L70:
            if (r10 == 0) goto L76
            if (r8 != 0) goto L76
            if (r12 == 0) goto L8e
        L76:
            if (r10 == 0) goto L7c
            if (r8 == 0) goto L7c
            if (r12 != 0) goto L8e
        L7c:
            if (r10 == 0) goto L86
            if (r8 == 0) goto L86
            if (r12 != 0) goto L86
            r7.cancelTracking(r8, r10, r11, r13)
            goto L8e
        L86:
            if (r10 != 0) goto L8e
            if (r8 == 0) goto L8e
            r9 = 0
            r7.cancelTracking(r8, r9, r11, r13)
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.DivVisibilityActionTracker.shouldTrackVisibilityAction(com.yandex.div.core.view2.Div2View, com.yandex.div.json.expressions.ExpressionResolver, android.view.View, k8.dp, int, com.yandex.div.core.view2.DivVisibilityTokenHolder):boolean");
    }

    private void startTracking(final Div2View scope, final ExpressionResolver resolver, final View view, final List<? extends dp> actions, long delayMs, DivVisibilityTokenHolder trackedTokens) {
        HashMap map = new HashMap(actions.size(), 1.0f);
        for (dp dpVar : actions) {
            CompositeLogId compositeLogIdCompositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(scope, (String) dpVar.b().evaluate(resolver));
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, "DivVisibilityActionTracker", "startTracking: id=" + compositeLogIdCompositeLogIdOf);
            }
            Pair pair = TuplesKt.to(compositeLogIdCompositeLogIdOf, dpVar);
            map.put(pair.getFirst(), pair.getSecond());
        }
        final Map<CompositeLogId, dp> mapSynchronizedMap = DesugarCollections.synchronizedMap(map);
        trackedTokens.add(mapSynchronizedMap);
        final String logId = scope.getLogId();
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTracking$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                KLog kLog2 = KLog.INSTANCE;
                if (kLog2.isAtLeast(Severity.INFO)) {
                    kLog2.print(4, "DivVisibilityActionTracker", "dispatchActions: id=" + CollectionsKt.joinToString$default(mapSynchronizedMap.keySet(), null, null, null, 0, null, null, 63, null));
                }
                Set set = (Set) this.this$0.appearedForDisappearActions.get(view);
                if (set != null) {
                    List list = actions;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof ra) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.remove((ra) it.next());
                    }
                    if (set.isEmpty()) {
                        this.this$0.appearedForDisappearActions.remove(view);
                        this.this$0.divWithWaitingDisappearActions.remove(view);
                    }
                }
                if (Intrinsics.areEqual(scope.getLogId(), logId)) {
                    this.this$0.visibilityActionDispatcher.dispatchActions(scope, resolver, view, (dp[]) mapSynchronizedMap.values().toArray(new dp[0]));
                }
            }
        };
        if (mapSynchronizedMap == null) {
            handler.postDelayed(runnable, delayMs);
        } else {
            HandlerCompat.postDelayed(handler, runnable, mapSynchronizedMap, delayMs);
        }
    }

    private void trackViewsHierarchy(BindingContext context, View view, y0 div, Function2<? super View, ? super y0, Boolean> trackAction) {
        if (trackAction.invoke(view, div).booleanValue() && (view instanceof ViewGroup)) {
            for (View view2 : ViewGroupKt.getChildren((ViewGroup) view)) {
                trackViewsHierarchy(context, view2, context.getDivView().takeBindingDiv$div_release(view2), trackAction);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackVisibilityActions(Div2View scope, ExpressionResolver resolver, View view, y0 div, List<hx> appearActions, List<ra> disappearActions) {
        DivVisibilityActionTracker divVisibilityActionTracker = this;
        ExpressionResolver expressionResolver = resolver;
        View view2 = view;
        Assert.assertMainThread();
        int iCalculateVisibilityPercentage = divVisibilityActionTracker.viewVisibilityCalculator.calculateVisibilityPercentage(view2);
        divVisibilityActionTracker.updateVisibility(view2, div, iCalculateVisibilityPercentage);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : appearActions) {
            Long lValueOf = Long.valueOf(DivSightExtensionsKt.getDuration((hx) obj).evaluate(expressionResolver).longValue());
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(list.size());
            for (Object obj2 : list) {
                int i10 = iCalculateVisibilityPercentage;
                if (divVisibilityActionTracker.shouldTrackVisibilityAction(scope, expressionResolver, view2, (hx) obj2, iCalculateVisibilityPercentage, divVisibilityActionTracker.appearTrackedTokens)) {
                    arrayList2.add(obj2);
                }
                expressionResolver = resolver;
                view2 = view;
                iCalculateVisibilityPercentage = i10;
            }
            int i11 = iCalculateVisibilityPercentage;
            if (arrayList2.isEmpty()) {
                expressionResolver = resolver;
                view2 = view;
            } else {
                expressionResolver = resolver;
                view2 = view;
                divVisibilityActionTracker.startTracking(scope, expressionResolver, view2, arrayList2, jLongValue, divVisibilityActionTracker.appearTrackedTokens);
            }
            iCalculateVisibilityPercentage = i11;
        }
        int i12 = iCalculateVisibilityPercentage;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : disappearActions) {
            Long lValueOf2 = Long.valueOf(DivSightExtensionsKt.getDuration((ra) obj3).evaluate(expressionResolver).longValue());
            Object arrayList3 = linkedHashMap2.get(lValueOf2);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap2.put(lValueOf2, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long jLongValue2 = ((Number) entry2.getKey()).longValue();
            List list2 = (List) entry2.getValue();
            List<ra> list3 = list2;
            boolean z10 = false;
            for (ra raVar : list3) {
                boolean z11 = z10;
                z10 = true;
                boolean z12 = ((long) i12) > ((Number) raVar.f90665k.evaluate(expressionResolver)).longValue();
                if (!z11 && !z12) {
                    z10 = false;
                }
                if (z12) {
                    WeakHashMap<View, Set<ra>> weakHashMap = divVisibilityActionTracker.appearedForDisappearActions;
                    Set<ra> linkedHashSet = weakHashMap.get(view2);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        weakHashMap.put(view2, linkedHashSet);
                    }
                    linkedHashSet.add(raVar);
                }
            }
            if (z10) {
                divVisibilityActionTracker.divWithWaitingDisappearActions.put(view2, div);
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            for (Object obj4 : list3) {
                if (divVisibilityActionTracker.shouldTrackVisibilityAction(scope, expressionResolver, view2, (ra) obj4, i12, divVisibilityActionTracker.disappearTrackedTokens)) {
                    arrayList4.add(obj4);
                }
                expressionResolver = resolver;
                view2 = view;
            }
            if (!arrayList4.isEmpty()) {
                divVisibilityActionTracker.startTracking(scope, resolver, view, arrayList4, jLongValue2, divVisibilityActionTracker.disappearTrackedTokens);
            }
            divVisibilityActionTracker = this;
            expressionResolver = resolver;
            view2 = view;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackVisibilityActionsOf$default(DivVisibilityActionTracker divVisibilityActionTracker, Div2View div2View, ExpressionResolver expressionResolver, View view, y0 y0Var, List list, List list2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityActionsOf");
        }
        if ((i10 & 16) != 0) {
            list = DivUtilKt.getAllAppearActions(y0Var.c());
        }
        List list3 = list;
        if ((i10 & 32) != 0) {
            list2 = DivUtilKt.getAllDisappearActions(y0Var.c());
        }
        divVisibilityActionTracker.trackVisibilityActionsOf(div2View, expressionResolver, view, y0Var, list3, list2);
    }

    private void updateVisibility(View view, y0 div, int visibilityPercentage) {
        if (visibilityPercentage > 0) {
            this.visibleActions.put(view, div);
        } else {
            this.visibleActions.remove(view);
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVisibilityTask$lambda$0(DivVisibilityActionTracker divVisibilityActionTracker) {
        divVisibilityActionTracker.visibilityActionDispatcher.dispatchVisibleViewsChanged(divVisibilityActionTracker.visibleActions);
        divVisibilityActionTracker.hasPostedUpdateVisibilityTask = false;
    }

    public void cancelTrackingViewsHierarchy(@NotNull final BindingContext context, @NotNull View root, @Nullable y0 div) {
        trackViewsHierarchy(context, root, div, new Function2<View, y0, Boolean>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker.cancelTrackingViewsHierarchy.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull View view, @Nullable y0 y0Var) {
                DivVisibilityActionTracker.this.previousVisibilityIsFull.remove(view);
                if (y0Var != null) {
                    DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                    BindingContext bindingContext = context;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), null, y0Var, null, null, 48, null);
                }
                return Boolean.TRUE;
            }
        });
    }

    @NotNull
    public Map<View, y0> getDivWithWaitingDisappearActions() {
        return this.divWithWaitingDisappearActions.createMap();
    }

    public void startTrackingViewsHierarchy(@NotNull final BindingContext context, @NotNull View root, @Nullable y0 rootDiv) {
        trackViewsHierarchy(context, root, rootDiv, new Function2<View, y0, Boolean>() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker.startTrackingViewsHierarchy.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull View view, @Nullable y0 y0Var) {
                boolean z10;
                boolean zIsViewFullyVisible = DivVisibilityActionTracker.this.viewVisibilityCalculator.isViewFullyVisible(view);
                if (zIsViewFullyVisible && Intrinsics.areEqual(DivVisibilityActionTracker.this.previousVisibilityIsFull.get(view), Boolean.TRUE)) {
                    z10 = false;
                } else {
                    DivVisibilityActionTracker.this.previousVisibilityIsFull.put(view, Boolean.valueOf(zIsViewFullyVisible));
                    if (y0Var != null) {
                        DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                        BindingContext bindingContext = context;
                        DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, y0Var, null, null, 48, null);
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    public void trackDetachedView(@NotNull BindingContext context, @NotNull View view, @NotNull y0 div) {
        List listK = div.c().k();
        if (listK == null) {
            return;
        }
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        trackVisibilityActions(context.getDivView(), expressionResolver, view, div, CollectionsKt.emptyList(), filterEnabled(listK, expressionResolver));
    }

    @AnyThread
    public void trackVisibilityActionsOf(@NotNull final Div2View scope, @NotNull final ExpressionResolver resolver, @Nullable final View view, @NotNull final y0 div, @NotNull final List<hx> appearActions, @NotNull final List<ra> disappearActions) {
        List<ra> list = disappearActions;
        final List<? extends dp> listPlus = CollectionsKt.plus((Collection) appearActions, (Iterable) list);
        if (listPlus.isEmpty()) {
            return;
        }
        final DivDataTag dataTag = scope.getDataTag();
        if (view == null) {
            this.isEnabledObserver.cancelObserving(listPlus);
            Iterator<T> it = appearActions.iterator();
            while (it.hasNext()) {
                shouldTrackVisibilityAction(scope, resolver, null, (hx) it.next(), 0, this.appearTrackedTokens);
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                shouldTrackVisibilityAction(scope, resolver, null, (ra) it2.next(), 0, this.disappearTrackedTokens);
            }
            return;
        }
        if (this.enqueuedVisibilityActions.containsKey(view)) {
            return;
        }
        if (ViewsKt.isHierarchyLaidOut(view) && !view.isLayoutRequested()) {
            if (Intrinsics.areEqual(scope.getDataTag(), dataTag)) {
                this.isEnabledObserver.observe(view, scope, resolver, div, listPlus);
                trackVisibilityActions(scope, resolver, view, div, filterEnabled(appearActions, resolver), filterEnabled(disappearActions, resolver));
            }
            this.enqueuedVisibilityActions.remove(view);
            return;
        }
        View viewFarthestLayoutCaller = ViewsKt.farthestLayoutCaller(view);
        if (viewFarthestLayoutCaller != null) {
            viewFarthestLayoutCaller.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActionsOf$$inlined$doOnHierarchyLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    if (Intrinsics.areEqual(scope.getDataTag(), dataTag)) {
                        this.isEnabledObserver.observe(view, scope, resolver, div, listPlus);
                        DivVisibilityActionTracker divVisibilityActionTracker = this;
                        Div2View div2View = scope;
                        ExpressionResolver expressionResolver = resolver;
                        divVisibilityActionTracker.trackVisibilityActions(div2View, expressionResolver, view, div, divVisibilityActionTracker.filterEnabled(appearActions, expressionResolver), this.filterEnabled(disappearActions, resolver));
                    }
                    this.enqueuedVisibilityActions.remove(view);
                }
            });
            Unit unit = Unit.f93236a;
        }
        this.enqueuedVisibilityActions.put(view, div);
    }

    @AnyThread
    public void updateVisibleViews(@NotNull List<? extends View> viewList) {
        Iterator<Map.Entry<View, y0>> it = this.visibleActions.entrySet().iterator();
        while (it.hasNext()) {
            if (!viewList.contains(it.next().getKey())) {
                it.remove();
            }
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }
}
