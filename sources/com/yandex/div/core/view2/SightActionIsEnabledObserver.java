package com.yandex.div.core.view2;

import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k8.dp;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import l7.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001'B_\u0012*\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0002\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0004\b\u0010\u0010\u001bR8\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"0!j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 ¨\u0006("}, d2 = {"Lcom/yandex/div/core/view2/SightActionIsEnabledObserver;", "", "Lkotlin/Function5;", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Landroid/view/View;", "Lk8/y0;", "Lk8/dp;", "", "onEnable", "onDisable", "<init>", "(Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function5;)V", "addSubscriptionIfNeeded", "(Landroid/view/View;)V", "action", "cancelObserving", "(Lk8/dp;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "div2View", "resolver", "div", "", "actions", "observe", "(Landroid/view/View;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/y0;Ljava/util/List;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/jvm/functions/Function5;", "Ljava/util/WeakHashMap;", "", "boundedActions", "Ljava/util/WeakHashMap;", "Ljava/util/HashMap;", "Lcom/yandex/div/core/view2/SightActionIsEnabledObserver$Subscription;", "Lkotlin/collections/HashMap;", BillingClient.FeatureType.SUBSCRIPTIONS, "Ljava/util/HashMap;", "hasSubscription", "Subscription", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SightActionIsEnabledObserver {

    @NotNull
    private final Function5<Div2View, ExpressionResolver, View, y0, dp, Unit> onDisable;

    @NotNull
    private final Function5<Div2View, ExpressionResolver, View, y0, dp, Unit> onEnable;

    @NotNull
    private final WeakHashMap<View, Set<dp>> boundedActions = new WeakHashMap<>();

    @NotNull
    private final HashMap<dp, Subscription> subscriptions = new HashMap<>();

    @NotNull
    private final WeakHashMap<View, Unit> hasSubscription = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR%\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/SightActionIsEnabledObserver$Subscription;", "", "Lcom/yandex/div/core/Disposable;", "disposable", "Landroid/view/View;", "owner", "<init>", "(Lcom/yandex/div/core/Disposable;Landroid/view/View;)V", "", "close", "()V", "Lcom/yandex/div/core/Disposable;", "getDisposable", "()Lcom/yandex/div/core/Disposable;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getOwner", "()Ljava/lang/ref/WeakReference;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Subscription {

        @NotNull
        private final Disposable disposable;

        @NotNull
        private final WeakReference<View> owner;

        public Subscription(@NotNull Disposable disposable, @NotNull View view) {
            this.disposable = disposable;
            this.owner = new WeakReference<>(view);
        }

        public final void close() {
            this.disposable.close();
        }

        @NotNull
        public final WeakReference<View> getOwner() {
            return this.owner;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SightActionIsEnabledObserver(@NotNull Function5<? super Div2View, ? super ExpressionResolver, ? super View, ? super y0, ? super dp, Unit> function5, @NotNull Function5<? super Div2View, ? super ExpressionResolver, ? super View, ? super y0, ? super dp, Unit> function52) {
        this.onEnable = function5;
        this.onDisable = function52;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSubscriptionIfNeeded(View view) {
        if (this.hasSubscription.containsKey(view) || !(view instanceof ExpressionSubscriber)) {
            return;
        }
        ((ExpressionSubscriber) view).addSubscription(new w(this, view));
        this.hasSubscription.put(view, Unit.f93236a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver sightActionIsEnabledObserver, View view) {
        Set<dp> setRemove = sightActionIsEnabledObserver.boundedActions.remove(view);
        if (setRemove == null) {
            setRemove = SetsKt.emptySet();
        }
        sightActionIsEnabledObserver.cancelObserving(setRemove);
    }

    private final void cancelObserving(dp action) {
        Set<dp> set;
        Subscription subscriptionRemove = this.subscriptions.remove(action);
        if (subscriptionRemove == null) {
            return;
        }
        subscriptionRemove.close();
        View view = subscriptionRemove.getOwner().get();
        if (view == null || (set = this.boundedActions.get(view)) == null) {
            return;
        }
        set.remove(action);
    }

    public final void observe(@NotNull final View view, @NotNull final Div2View div2View, @NotNull final ExpressionResolver resolver, @NotNull final y0 div, @NotNull List<? extends dp> actions) {
        Subscription subscriptionRemove;
        addSubscriptionIfNeeded(view);
        WeakHashMap<View, Set<dp>> weakHashMap = this.boundedActions;
        Set<dp> setEmptySet = weakHashMap.get(view);
        if (setEmptySet == null) {
            setEmptySet = SetsKt.emptySet();
        }
        Set setIntersect = CollectionsKt.intersect(actions, setEmptySet);
        Set<dp> mutableSet = CollectionsKt.toMutableSet(setIntersect);
        for (dp dpVar : setEmptySet) {
            if (!setIntersect.contains(dpVar) && (subscriptionRemove = this.subscriptions.remove(dpVar)) != null) {
                subscriptionRemove.close();
            }
        }
        for (final dp dpVar2 : actions) {
            if (!setIntersect.contains(dpVar2)) {
                mutableSet.add(dpVar2);
                cancelObserving(dpVar2);
                this.subscriptions.put(dpVar2, new Subscription(dpVar2.isEnabled().observe(resolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.SightActionIsEnabledObserver$observe$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(boolean z10) {
                        if (z10) {
                            this.this$0.onEnable.invoke(div2View, resolver, view, div, dpVar2);
                        } else {
                            this.this$0.onDisable.invoke(div2View, resolver, view, div, dpVar2);
                        }
                    }
                }), view));
            }
        }
        weakHashMap.put(view, mutableSet);
    }

    public final void cancelObserving(@NotNull Iterable<? extends dp> actions) {
        Iterator<? extends dp> it = actions.iterator();
        while (it.hasNext()) {
            cancelObserving(it.next());
        }
    }
}
