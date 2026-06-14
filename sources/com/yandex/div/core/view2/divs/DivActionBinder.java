package com.yandex.div.core.view2.divs;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.A1;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k8.a6;
import k8.j1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\b\u0011\u0018\u00002\u00020\u0001:\u0001]B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ¥\u0001\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J7\u0010%\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\"\u001a\u00020!H\u0010¢\u0006\u0004\b#\u0010$JO\u0010/\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010*\u001a\u00020!2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e\u0018\u00010+H\u0010¢\u0006\u0004\b-\u0010.JG\u00105\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u00100\u001a\u00020\u00122\u0006\u0010*\u001a\u00020!2\n\b\u0002\u00101\u001a\u0004\u0018\u00010!2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b3\u00104JG\u00107\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u00100\u001a\u00020\u00122\u0006\u0010*\u001a\u00020!2\n\b\u0002\u00101\u001a\u0004\u0018\u00010!2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002H\u0011¢\u0006\u0004\b6\u00104J-\u0010:\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0010¢\u0006\u0004\b8\u00109J\u0097\u0001\u0010;\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0012¢\u0006\u0004\b;\u0010 JS\u0010?\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010>\u001a\u00020\bH\u0012¢\u0006\u0004\b?\u0010@JC\u0010B\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010A\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0012¢\u0006\u0004\bB\u0010CJ'\u0010E\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bH\u0012¢\u0006\u0004\bE\u0010FJC\u0010G\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0012¢\u0006\u0004\bG\u0010HJ;\u0010K\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0012¢\u0006\u0004\bK\u0010LJO\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b\u0018\u00010M2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0012¢\u0006\u0004\bO\u0010PJO\u0010S\u001a\u00020\u001e*\u00020\u000f2:\u0010R\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b\u0018\u00010M0Q\"\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b\u0018\u00010MH\u0013¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\u00020!*\u00020!H\u0012¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0014\u0010\n\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\n\u0010ZR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0+8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder;", "", "Lcom/yandex/div/core/DivActionHandler;", "actionHandler", "Lcom/yandex/div/core/Div2Logger;", "logger", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "divActionBeaconSender", "", "longtapActionsPassToChild", "shouldIgnoreActionMenuItems", "<init>", "(Lcom/yandex/div/core/DivActionHandler;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;ZZ)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/view/View;", TypedValues.AttributesType.S_TARGET, "", "Lk8/j1;", "actions", "longTapActions", "doubleTapActions", "hoverStartActions", "hoverEndActions", "pressStartActions", "pressEndActions", "Lk8/a6;", "actionAnimation", "Lcom/yandex/div/json/expressions/Expression;", "captureFocusOnAction", "", "bindDivActions", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lk8/a6;Lcom/yandex/div/json/expressions/Expression;)V", "", "actionLogType", "handleBulkActions$div_release", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Ljava/util/List;Ljava/lang/String;)V", "handleBulkActions", "Lcom/yandex/div/core/DivViewFacade;", "divView", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "reason", "Lkotlin/Function1;", "onEachEnabledAction", "handleActions$div_release", "(Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/json/expressions/ExpressionResolver;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "handleActions", "action", "actionUid", "viewActionHandler", "handleAction$div_release", "(Lcom/yandex/div/core/DivViewFacade;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/j1;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/core/DivActionHandler;)Z", "handleAction", "handleActionWithoutEnableCheck$div_release", "handleActionWithoutEnableCheck", "handleTapClick$div_release", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Ljava/util/List;)V", "handleTapClick", "applyDivActions", "Lcom/yandex/div/core/view2/DivGestureListener;", "divGestureListener", "hasNonSingleTapActions", "bindTapActions", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lcom/yandex/div/core/view2/DivGestureListener;Ljava/util/List;ZLcom/yandex/div/json/expressions/Expression;Z)V", "noClickAction", "bindLongTapActions", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Ljava/util/List;ZLcom/yandex/div/json/expressions/Expression;)V", "passLongTapsToChildren", "clearLongClickListener", "(Landroid/view/View;ZZ)V", "bindDoubleTapActions", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lcom/yandex/div/core/view2/DivGestureListener;Ljava/util/List;Lcom/yandex/div/json/expressions/Expression;)V", "startActions", "endActions", "bindHoverActions", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Ljava/util/List;Ljava/util/List;)V", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "createPressTouchListener", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Ljava/util/List;Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "", "listeners", "attachTouchListeners", "(Landroid/view/View;[Lkotlin/jvm/functions/Function2;)V", "toDivActionReason", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/yandex/div/core/DivActionHandler;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "Z", "passToParentLongClickListener", "Lkotlin/jvm/functions/Function1;", "MenuWrapperListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivActionBinder {

    @NotNull
    private final DivActionHandler actionHandler;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final Div2Logger logger;
    private final boolean longtapActionsPassToChild;

    @NotNull
    private final Function1<View, Boolean> passToParentLongClickListener = new Function1<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$passToParentLongClickListener$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull View view) {
            boolean zPerformLongClick = false;
            do {
                ViewParent parent = view.getParent();
                view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (view == null || view.getParent() == null) {
                    break;
                }
                zPerformLongClick = view.performLongClick();
            } while (!zPerformLongClick);
            return Boolean.valueOf(zPerformLongClick);
        }
    };
    private final boolean shouldIgnoreActionMenuItems;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder$MenuWrapperListener;", "Lcom/yandex/div/internal/widget/menu/OverflowMenuWrapper$Listener$Simple;", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "Lk8/j1$c;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/BindingContext;Ljava/util/List;)V", "Landroidx/appcompat/widget/PopupMenu;", "popupMenu", "", "onMenuCreated", "(Landroidx/appcompat/widget/PopupMenu;)V", "Lcom/yandex/div/core/view2/BindingContext;", "Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class MenuWrapperListener extends OverflowMenuWrapper.Listener.Simple {

        @NotNull
        private final BindingContext context;

        @NotNull
        private final List<j1.c> items;

        public MenuWrapperListener(@NotNull BindingContext bindingContext, @NotNull List<j1.c> list) {
            this.context = bindingContext;
            this.items = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onMenuCreated$lambda$0(final Div2View div2View, final j1.c cVar, final ExpressionResolver expressionResolver, final DivActionBinder divActionBinder, final int i10, MenuItem menuItem) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            div2View.bulkActions$div_release(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$onMenuCreated$1$1
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
                    List list = cVar.f88321b;
                    List list2 = list;
                    List listListOf = null;
                    if (list2 == null || list2.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        j1 j1Var = cVar.f88320a;
                        if (j1Var != null) {
                            listListOf = CollectionsKt.listOf(j1Var);
                        }
                    } else {
                        listListOf = list;
                    }
                    List list3 = listListOf;
                    if (list3 == null || list3.isEmpty()) {
                        KAssert kAssert = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Menu item does not have any action");
                            return;
                        }
                        return;
                    }
                    List<j1> listOnlyEnabled = DivActionBinderKt.onlyEnabled(listListOf, expressionResolver);
                    DivActionBinder divActionBinder2 = divActionBinder;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    int i11 = i10;
                    j1.c cVar2 = cVar;
                    for (j1 j1Var2 : listOnlyEnabled) {
                        ExpressionResolver expressionResolver3 = expressionResolver2;
                        Div2View div2View3 = div2View2;
                        divActionBinder2.logger.logPopupMenuItemClick(div2View3, expressionResolver3, i11, (String) cVar2.f88322c.evaluate(expressionResolver3), j1Var2);
                        divActionBinder2.divActionBeaconSender.sendTapActionBeacon(j1Var2, expressionResolver3);
                        div2View2 = div2View3;
                        expressionResolver2 = expressionResolver3;
                        DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder2, div2View2, expressionResolver2, j1Var2, "menu", null, null, 48, null);
                        i11 = i11;
                    }
                    ref$BooleanRef.f93279b = true;
                }
            });
            return ref$BooleanRef.f93279b;
        }

        @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
        public void onMenuCreated(@NotNull PopupMenu popupMenu) {
            final Div2View divView = this.context.getDivView();
            final ExpressionResolver expressionResolver = this.context.getExpressionResolver();
            Menu menu = popupMenu.getMenu();
            for (final j1.c cVar : this.items) {
                final int size = menu.size();
                MenuItem menuItemAdd = menu.add((CharSequence) cVar.f88322c.evaluate(expressionResolver));
                final DivActionBinder divActionBinder = DivActionBinder.this;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.a
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return DivActionBinder.MenuWrapperListener.onMenuCreated$lambda$0(divView, cVar, expressionResolver, divActionBinder, size, menuItem);
                    }
                });
            }
        }
    }

    public DivActionBinder(@NotNull DivActionHandler divActionHandler, @NotNull Div2Logger div2Logger, @NotNull DivActionBeaconSender divActionBeaconSender, boolean z10, boolean z11) {
        this.actionHandler = divActionHandler;
        this.logger = div2Logger;
        this.divActionBeaconSender = divActionBeaconSender;
        this.longtapActionsPassToChild = z10;
        this.shouldIgnoreActionMenuItems = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDivActions(BindingContext context, View target, List<j1> actions, List<j1> longTapActions, List<j1> doubleTapActions, List<j1> hoverStartActions, List<j1> hoverEndActions, List<j1> pressStartActions, List<j1> pressEndActions, a6 actionAnimation, Expression<Boolean> captureFocusOnAction) {
        List<j1> list = longTapActions;
        DivGestureListener divGestureListener = new DivGestureListener(!list.isEmpty() || DivActionBinderKt.parentIsLongClickable(target));
        bindLongTapActions(context, target, longTapActions, actions.isEmpty(), captureFocusOnAction);
        bindDoubleTapActions(context, target, divGestureListener, doubleTapActions, captureFocusOnAction);
        bindTapActions(context, target, divGestureListener, actions, this.shouldIgnoreActionMenuItems, captureFocusOnAction, (list.isEmpty() && doubleTapActions.isEmpty()) ? false : true);
        Function2<View, MotionEvent, Boolean> function2CreateAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(target, context, !com.yandex.div.internal.util.CollectionsKt.allIsNullOrEmpty(actions, longTapActions, doubleTapActions) ? actionAnimation : null, divGestureListener);
        Function2<View, MotionEvent, Boolean> function2CreatePressTouchListener = createPressTouchListener(context, target, pressStartActions, pressEndActions);
        bindHoverActions(context, target, hoverStartActions, hoverEndActions);
        attachTouchListeners(target, function2CreateAnimatedTouchListener, function2CreatePressTouchListener);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void attachTouchListeners(View view, Function2<? super View, ? super MotionEvent, Boolean>... function2Arr) {
        final List listFilterNotNull = ArraysKt.filterNotNull(function2Arr);
        if (listFilterNotNull.isEmpty()) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: n7.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return DivActionBinder.attachTouchListeners$lambda$17(listFilterNotNull, view2, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachTouchListeners$lambda$17(List list, View view, MotionEvent motionEvent) {
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (((Boolean) ((Function2) it.next()).invoke(view, motionEvent)).booleanValue() || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    private void bindDoubleTapActions(final BindingContext context, final View target, DivGestureListener divGestureListener, final List<j1> actions, final Expression<Boolean> captureFocusOnAction) {
        Object obj = null;
        if (actions.isEmpty()) {
            divGestureListener.setOnDoubleTapListener(null);
            return;
        }
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List list = ((j1) next).f88309e;
            if (list != null && !list.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                obj = next;
                break;
            }
        }
        final j1 j1Var = (j1) obj;
        if (j1Var == null) {
            divGestureListener.setOnDoubleTapListener(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder.bindDoubleTapActions.2
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
                    DivActionBinderKt.captureFocusIfNeeded(target, captureFocusOnAction, context.getDivView().getInputFocusTracker(), context.getExpressionResolver());
                    this.handleBulkActions$div_release(context, target, actions, "double_click");
                }
            });
            return;
        }
        List list2 = j1Var.f88309e;
        if (list2 != null) {
            final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
            Div2View divView = context.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
            divGestureListener.setOnDoubleTapListener(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$1$1
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
                    this.this$0.logger.logDoubleClick(context.getDivView(), context.getExpressionResolver(), target, j1Var);
                    this.this$0.divActionBeaconSender.sendTapActionBeacon(j1Var, context.getExpressionResolver());
                    DivActionBinderKt.captureFocusIfNeeded(target, captureFocusOnAction, context.getDivView().getInputFocusTracker(), context.getExpressionResolver());
                    overflowMenuWrapperOverflowGravity.getOnMenuClickListener().onClick(target);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + j1Var.f88307c);
        }
    }

    private void bindHoverActions(final BindingContext context, final View target, final List<j1> startActions, final List<j1> endActions) {
        if (startActions.isEmpty() && endActions.isEmpty()) {
            target.setOnHoverListener(null);
        } else {
            target.setOnHoverListener(new View.OnHoverListener() { // from class: n7.c
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return DivActionBinder.bindHoverActions$lambda$15(this.f95121b, context, target, startActions, endActions, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindHoverActions$lambda$15(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, List list2, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 9) {
            divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "hover");
            return false;
        }
        if (action != 10) {
            return false;
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list2, "unhover");
        return false;
    }

    private void bindLongTapActions(final BindingContext context, final View target, final List<j1> actions, boolean noClickAction, final Expression<Boolean> captureFocusOnAction) {
        Object next;
        if (actions.isEmpty()) {
            clearLongClickListener(target, this.longtapActionsPassToChild, noClickAction);
            return;
        }
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = ((j1) next).f88309e;
            if (list != null && !list.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                break;
            }
        }
        final j1 j1Var = (j1) next;
        if (j1Var != null) {
            List list2 = j1Var.f88309e;
            if (list2 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + j1Var.f88307c);
                }
            } else {
                final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
                Div2View divView = context.getDivView();
                divView.clearSubscriptions();
                divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
                target.setOnLongClickListener(new View.OnLongClickListener() { // from class: n7.d
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return DivActionBinder.bindLongTapActions$lambda$10$lambda$9(this.f95126b, j1Var, context, captureFocusOnAction, overflowMenuWrapperOverflowGravity, target, actions, view);
                    }
                });
            }
        } else {
            target.setOnLongClickListener(new View.OnLongClickListener() { // from class: n7.e
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return DivActionBinder.bindLongTapActions$lambda$11(captureFocusOnAction, context, this, target, actions, view);
                }
            });
        }
        if (this.longtapActionsPassToChild) {
            DivActionBinderKt.setPenetratingLongClickable$default(target, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$10$lambda$9(DivActionBinder divActionBinder, j1 j1Var, BindingContext bindingContext, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view, List list, View view2) {
        String string = UUID.randomUUID().toString();
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(j1Var, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            divActionBinder.logger.logLongClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, (j1) it.next(), string);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$11(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "long_click");
        return true;
    }

    private void bindTapActions(final BindingContext context, final View target, DivGestureListener divGestureListener, final List<j1> actions, boolean shouldIgnoreActionMenuItems, final Expression<Boolean> captureFocusOnAction, boolean hasNonSingleTapActions) {
        Object obj = null;
        if (actions.isEmpty()) {
            if (hasNonSingleTapActions) {
                bindTapActions$setTapListener(divGestureListener, target, new View.OnClickListener() { // from class: n7.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DivActionBinder.bindTapActions$lambda$2(captureFocusOnAction, context, view);
                    }
                });
                return;
            }
            divGestureListener.setOnSingleTapListener(null);
            target.setOnClickListener(null);
            target.setClickable(false);
            return;
        }
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List list = ((j1) next).f88309e;
            if (list != null && !list.isEmpty() && !shouldIgnoreActionMenuItems) {
                obj = next;
                break;
            }
        }
        final j1 j1Var = (j1) obj;
        if (j1Var == null) {
            bindTapActions$setTapListener(divGestureListener, target, new View.OnClickListener() { // from class: n7.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DivActionBinder.bindTapActions$lambda$6(captureFocusOnAction, context, this, target, actions, view);
                }
            });
            return;
        }
        List list2 = j1Var.f88309e;
        if (list2 != null) {
            final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
            Div2View divView = context.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
            bindTapActions$setTapListener(divGestureListener, target, new View.OnClickListener() { // from class: n7.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DivActionBinder.bindTapActions$lambda$5$lambda$4(this.f95140b, context, target, j1Var, captureFocusOnAction, overflowMenuWrapperOverflowGravity, view);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + j1Var.f88307c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$2(Expression expression, BindingContext bindingContext, View view) {
        DivActionBinderKt.clearFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$5$lambda$4(DivActionBinder divActionBinder, BindingContext bindingContext, View view, j1 j1Var, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view2) {
        divActionBinder.logger.logClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, j1Var);
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(j1Var, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$6(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        handleBulkActions$div_release$default(divActionBinder, bindingContext, view, list, null, 8, null);
    }

    private static final void bindTapActions$setTapListener(DivGestureListener divGestureListener, final View view, final View.OnClickListener onClickListener) {
        if (divGestureListener.getOnDoubleTapListener() != null) {
            divGestureListener.setOnSingleTapListener(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindTapActions$setTapListener$1
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
                    onClickListener.onClick(view);
                }
            });
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    private void clearLongClickListener(View target, boolean passLongTapsToChildren, boolean noClickAction) {
        if (!passLongTapsToChildren || noClickAction) {
            target.setOnLongClickListener(null);
            target.setLongClickable(false);
        } else if (DivActionBinderKt.parentIsLongClickable(target)) {
            final Function1<View, Boolean> function1 = this.passToParentLongClickListener;
            target.setOnLongClickListener(new View.OnLongClickListener() { // from class: n7.i
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return DivActionBinder.clearLongClickListener$lambda$12(function1, view);
                }
            });
            DivActionBinderKt.setPenetratingLongClickable$default(target, null, 1, null);
        } else {
            target.setOnLongClickListener(null);
            target.setLongClickable(false);
            DivActionBinderKt.setPenetratingLongClickable(target, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearLongClickListener$lambda$12(Function1 function1, View view) {
        return ((Boolean) function1.invoke(view)).booleanValue();
    }

    private Function2<View, MotionEvent, Boolean> createPressTouchListener(final BindingContext context, final View target, final List<j1> pressStartActions, final List<j1> pressEndActions) {
        if (pressStartActions.isEmpty() && pressEndActions.isEmpty()) {
            return null;
        }
        return new Function2<View, MotionEvent, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder.createPressTouchListener.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull View view, @NotNull MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                boolean z10 = true;
                if (action == 0) {
                    DivActionBinder.this.handleBulkActions$div_release(context, target, pressStartActions, "press");
                } else if (action == 1 || action == 3) {
                    DivActionBinder.this.handleBulkActions$div_release(context, target, pressEndActions, "release");
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        };
    }

    public static /* synthetic */ boolean handleAction$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, j1 j1Var, String str, String str2, DivActionHandler divActionHandler, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAction");
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler = div2View != null ? div2View.getActionHandler() : null;
        }
        return divActionBinder.handleAction$div_release(divViewFacade, expressionResolver, j1Var, str, str2, divActionHandler);
    }

    public static /* synthetic */ boolean handleActionWithoutEnableCheck$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, j1 j1Var, String str, String str2, DivActionHandler divActionHandler, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActionWithoutEnableCheck");
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler = div2View != null ? div2View.getActionHandler() : null;
        }
        return divActionBinder.handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, j1Var, str, str2, divActionHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleActions$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List list, String str, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActions");
        }
        if ((i10 & 16) != 0) {
            function1 = null;
        }
        divActionBinder.handleActions$div_release(divViewFacade, expressionResolver, list, str, function1);
    }

    public static /* synthetic */ void handleBulkActions$div_release$default(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleBulkActions");
        }
        if ((i10 & 8) != 0) {
            str = "click";
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public String toDivActionReason(String str) {
        switch (str.hashCode()) {
            case -338877947:
                return !str.equals("long_click") ? A1.f40170e : "long_click";
            case -287575485:
                return !str.equals("unhover") ? A1.f40170e : "unhover";
            case 3027047:
                return !str.equals("blur") ? A1.f40170e : "blur";
            case 94750088:
                return !str.equals("click") ? A1.f40170e : "click";
            case 96667352:
                return !str.equals("enter") ? A1.f40170e : "enter";
            case 97604824:
                return !str.equals("focus") ? A1.f40170e : "focus";
            case 99469628:
                return !str.equals("hover") ? A1.f40170e : "hover";
            case 106931267:
                return !str.equals("press") ? A1.f40170e : "press";
            case 1090594823:
                return !str.equals("release") ? A1.f40170e : "release";
            case 1374143386:
                return !str.equals("double_click") ? A1.f40170e : "double_click";
            default:
                return A1.f40170e;
        }
    }

    public void bindDivActions(@NotNull final BindingContext context, @NotNull final View target, @Nullable final List<j1> actions, @Nullable final List<j1> longTapActions, @Nullable final List<j1> doubleTapActions, @Nullable final List<j1> hoverStartActions, @Nullable final List<j1> hoverEndActions, @Nullable final List<j1> pressStartActions, @Nullable final List<j1> pressEndActions, @NotNull final a6 actionAnimation, @NotNull final Expression<Boolean> captureFocusOnAction) {
        final ExpressionResolver expressionResolver = context.getExpressionResolver();
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$onApply$1
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
                List listOnlyEnabled = DivActionBinderKt.onlyEnabled(actions, expressionResolver);
                List listOnlyEnabled2 = DivActionBinderKt.onlyEnabled(doubleTapActions, expressionResolver);
                this.applyDivActions(context, target, listOnlyEnabled, DivActionBinderKt.onlyEnabled(longTapActions, expressionResolver), listOnlyEnabled2, DivActionBinderKt.onlyEnabled(hoverStartActions, expressionResolver), DivActionBinderKt.onlyEnabled(hoverEndActions, expressionResolver), DivActionBinderKt.onlyEnabled(pressStartActions, expressionResolver), DivActionBinderKt.onlyEnabled(pressEndActions, expressionResolver), actionAnimation, captureFocusOnAction);
            }
        };
        DivActionBinderKt.observe(target, (List<j1>) actions, expressionResolver, (Function1<Object, Unit>) new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$1
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
                function0.invoke();
            }
        });
        DivActionBinderKt.observe(target, (List<j1>) longTapActions, expressionResolver, (Function1<Object, Unit>) new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$2
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
                function0.invoke();
            }
        });
        DivActionBinderKt.observe(target, (List<j1>) doubleTapActions, expressionResolver, (Function1<Object, Unit>) new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$3
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
                function0.invoke();
            }
        });
        DivActionBinderKt.observe(target, (Expression<Boolean>) captureFocusOnAction, expressionResolver, (Function1<Object, Unit>) new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$4
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
                function0.invoke();
            }
        });
        function0.invoke();
    }

    public boolean handleAction$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @NotNull j1 action, @NotNull String reason, @Nullable String actionUid, @Nullable DivActionHandler viewActionHandler) {
        if (((Boolean) action.f88306b.evaluate(resolver)).booleanValue()) {
            return handleActionWithoutEnableCheck$div_release(divView, resolver, action, reason, actionUid, viewActionHandler);
        }
        return false;
    }

    @VisibleForTesting
    public boolean handleActionWithoutEnableCheck$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @NotNull j1 action, @NotNull String reason, @Nullable String actionUid, @Nullable DivActionHandler viewActionHandler) {
        String str;
        ExpressionResolver expressionResolver;
        j1 j1Var;
        DivViewFacade divViewFacade;
        if (!this.actionHandler.getUseActionUid() || actionUid == null) {
            if (viewActionHandler == null || !viewActionHandler.handleActionWithReason(action, divView, resolver, reason)) {
                return this.actionHandler.handleActionWithReason(action, divView, resolver, reason);
            }
            return true;
        }
        if (viewActionHandler != null) {
            divViewFacade = divView;
            str = reason;
            expressionResolver = resolver;
            j1Var = action;
            if (viewActionHandler.handleActionWithReason(j1Var, divViewFacade, expressionResolver, actionUid, str)) {
                return true;
            }
        } else {
            str = reason;
            expressionResolver = resolver;
            j1Var = action;
            divViewFacade = divView;
        }
        return this.actionHandler.handleActionWithReason(j1Var, divViewFacade, expressionResolver, actionUid, str);
    }

    public void handleActions$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @Nullable List<j1> actions, @NotNull String reason, @Nullable Function1<? super j1, Unit> onEachEnabledAction) {
        if (actions == null) {
            return;
        }
        for (j1 j1Var : DivActionBinderKt.onlyEnabled(actions, resolver)) {
            DivViewFacade divViewFacade = divView;
            ExpressionResolver expressionResolver = resolver;
            String str = reason;
            handleActionWithoutEnableCheck$div_release$default(this, divViewFacade, expressionResolver, j1Var, str, null, null, 48, null);
            if (onEachEnabledAction != null) {
                onEachEnabledAction.invoke(j1Var);
            }
            divView = divViewFacade;
            resolver = expressionResolver;
            reason = str;
        }
    }

    public void handleBulkActions$div_release(@NotNull BindingContext context, @NotNull final View target, @NotNull final List<j1> actions, @NotNull final String actionLogType) {
        final Div2View divView = context.getDivView();
        final ExpressionResolver expressionResolver = context.getExpressionResolver();
        divView.bulkActions$div_release(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00fe A[PHI: r16
  0x00fe: PHI (r16v2 k8.j1) = 
  (r16v1 k8.j1)
  (r16v1 k8.j1)
  (r16v1 k8.j1)
  (r16v1 k8.j1)
  (r16v3 k8.j1)
  (r16v1 k8.j1)
  (r16v1 k8.j1)
  (r16v1 k8.j1)
  (r16v1 k8.j1)
  (r16v1 k8.j1)
 binds: [B:6:0x0034, B:46:0x00fc, B:42:0x00e8, B:38:0x00d5, B:31:0x00ae, B:26:0x0096, B:22:0x0082, B:18:0x006e, B:13:0x0057, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    Method dump skipped, instruction units count: 344
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1.invoke2():void");
            }
        });
    }

    public void handleTapClick$div_release(@NotNull BindingContext context, @NotNull View target, @NotNull List<j1> actions) {
        Object next;
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        List listOnlyEnabled = DivActionBinderKt.onlyEnabled(actions, expressionResolver);
        Iterator it = listOnlyEnabled.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = ((j1) next).f88309e;
            if (!(list == null || list.isEmpty())) {
                break;
            }
        }
        j1 j1Var = (j1) next;
        if (j1Var == null) {
            handleBulkActions$div_release$default(this, context, target, listOnlyEnabled, null, 8, null);
            return;
        }
        List list2 = j1Var.f88309e;
        if (list2 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to bind empty menu action: " + j1Var.f88307c);
                return;
            }
            return;
        }
        OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
        Div2View divView = context.getDivView();
        divView.clearSubscriptions();
        divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
        this.logger.logClick(context.getDivView(), expressionResolver, target, j1Var);
        this.divActionBeaconSender.sendTapActionBeacon(j1Var, expressionResolver);
        overflowMenuWrapperOverflowGravity.getOnMenuClickListener().onClick(target);
    }
}
