package com.yandex.div.core.view2;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import k8.as;
import k8.ee;
import k8.f7;
import k8.g1;
import k8.rn;
import k8.td;
import k8.te;
import k8.tp;
import k8.u8;
import k8.us;
import k8.yf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0011\u0018\u00002\u00020\u0001:\u0001=B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0012¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f*\u00020\b2\u0006\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0012¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\tH\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010!\u001a\u00020\f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0012¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\f*\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#H\u0012¢\u0006\u0004\b&\u0010'J5\u0010(\u001a\u00020\f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0012¢\u0006\u0004\b(\u0010\"J\u001f\u0010+\u001a\u00020\f*\u00020\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0012¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\u00020\f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0012¢\u0006\u0004\b-\u0010\"J\u001d\u0010/\u001a\u00020\f*\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010#H\u0012¢\u0006\u0004\b/\u00100J5\u00101\u001a\u00020\f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0012¢\u0006\u0004\b1\u0010\"J%\u00103\u001a\u00020\f*\u00020\b2\u0006\u0010\u000f\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0012¢\u0006\u0004\b3\u00104J9\u00105\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b5\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0018\u0010<\u001a\u00020#*\u00020\u00158RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/yandex/div/core/view2/DivAccessibilityBinder;", "", "", "enabled", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "<init>", "(ZLcom/yandex/div/core/util/AccessibilityStateProvider;)V", "Landroid/view/View;", "Lk8/f7;", "newDiv", "oldDiv", "", "bindType", "(Landroid/view/View;Lk8/f7;Lk8/f7;)V", "divBase", "Lk8/g1$d;", "accessibilityType", "applyType", "(Landroid/view/View;Lk8/f7;Lk8/g1$d;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;", "type", "Landroidx/core/view/AccessibilityDelegateCompat;", "getAccessibilityDelegate", "(Landroid/view/View;Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;)Landroidx/core/view/AccessibilityDelegateCompat;", "div", "toAccessibilityType", "(Lk8/g1$d;Lk8/f7;)Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "bindDescriptionAndHint", "(Landroid/view/View;Lk8/f7;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "", "description", "hint", "applyDescriptionAndHint", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "bindMode", "Lk8/g1$c;", C4240b4.a.f42515t, "applyMode", "(Landroid/view/View;Lk8/g1$c;)V", "bindStateDescription", "stateDescription", "applyStateDescription", "(Landroid/view/View;Ljava/lang/String;)V", "bindCheckedState", "isChecked", "applyCheckedState", "(Landroid/view/View;Lk8/f7;Ljava/lang/Boolean;)V", "bind", "Z", "getEnabled", "()Z", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "getToClassName", "(Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;)Ljava/lang/String;", "toClassName", "AccessibilityType", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivAccessibilityBinder {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final boolean enabled;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/DivAccessibilityBinder$AccessibilityType;", "", "(Ljava/lang/String;I)V", "NONE", "BUTTON", "EDIT_TEXT", "HEADER", "IMAGE", "LIST", "SLIDER", "SELECT", "TAB_WIDGET", "PAGER", AdPreferences.TYPE_TEXT, "RADIO_BUTTON", "CHECK_BOX", "CONTAINER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum AccessibilityType {
        NONE,
        BUTTON,
        EDIT_TEXT,
        HEADER,
        IMAGE,
        LIST,
        SLIDER,
        SELECT,
        TAB_WIDGET,
        PAGER,
        TEXT,
        RADIO_BUTTON,
        CHECK_BOX,
        CONTAINER
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[g1.d.values().length];
            try {
                iArr[g1.d.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g1.d.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g1.d.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g1.d.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g1.d.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g1.d.EDIT_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g1.d.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[g1.d.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[g1.d.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[g1.d.TAB_BAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[g1.d.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[g1.d.CHECKBOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccessibilityType.values().length];
            try {
                iArr2[AccessibilityType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AccessibilityType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AccessibilityType.EDIT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[AccessibilityType.HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[AccessibilityType.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[AccessibilityType.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AccessibilityType.PAGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[AccessibilityType.SLIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[AccessibilityType.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[AccessibilityType.TAB_WIDGET.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[AccessibilityType.TEXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[AccessibilityType.CHECK_BOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[AccessibilityType.RADIO_BUTTON.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[AccessibilityType.CONTAINER.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DivAccessibilityBinder(boolean z10, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        this.enabled = z10;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyCheckedState(View view, f7 f7Var, Boolean bool) {
        g1.d dVar;
        g1 g1VarO = f7Var.o();
        AccessibilityType accessibilityType = (g1VarO == null || (dVar = g1VarO.f87695g) == null) ? null : toAccessibilityType(dVar, f7Var);
        if (accessibilityType == AccessibilityType.CHECK_BOX || accessibilityType == AccessibilityType.RADIO_BUTTON) {
            AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
            ExtensiveAccessibilityDelegate extensiveAccessibilityDelegate = accessibilityDelegate instanceof ExtensiveAccessibilityDelegate ? (ExtensiveAccessibilityDelegate) accessibilityDelegate : null;
            if (extensiveAccessibilityDelegate != null) {
                extensiveAccessibilityDelegate.setChecked(bool);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDescriptionAndHint(View view, String str, String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null && !Intrinsics.areEqual(str, str2)) {
            str = str + '\n' + str2;
        }
        view.setContentDescription(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyMode(View view, g1.c cVar) {
        g1.c cVar2 = g1.c.MERGE;
        int i10 = 0;
        ViewCompat.setScreenReaderFocusable(view, cVar == cVar2);
        if (cVar == g1.c.EXCLUDE) {
            i10 = 4;
        } else {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null && !StringsKt.y0(contentDescription) && (cVar == cVar2 || (view instanceof DivImageView) || (view instanceof DivGifImageView))) {
                i10 = 1;
            }
        }
        view.setImportantForAccessibility(i10);
    }

    static /* synthetic */ void applyMode$default(DivAccessibilityBinder divAccessibilityBinder, View view, g1.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMode");
        }
        if ((i10 & 1) != 0) {
            cVar = null;
        }
        divAccessibilityBinder.applyMode(view, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyStateDescription(View view, String str) {
        ViewCompat.setStateDescription(view, str);
    }

    private void applyType(View view, f7 f7Var, g1.d dVar) {
        if (dVar == null) {
            dVar = g1.d.AUTO;
        }
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view, toAccessibilityType(dVar, f7Var));
        if (accessibilityDelegate != null) {
            ViewCompat.setAccessibilityDelegate(view, accessibilityDelegate);
        }
    }

    private void bindCheckedState(final View view, final f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        g1 g1VarO;
        g1 g1VarO2 = f7Var.o();
        Expression expression = g1VarO2 != null ? g1VarO2.f87691c : null;
        if (ExpressionsKt.equalsToConstant(expression, (f7Var2 == null || (g1VarO = f7Var2.o()) == null) ? null : g1VarO.f87691c)) {
            return;
        }
        applyCheckedState(view, f7Var, expression != null ? (Boolean) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder.bindCheckedState.1
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
                DivAccessibilityBinder.this.applyCheckedState(view, f7Var, Boolean.valueOf(z10));
            }
        }) : null);
    }

    private void bindDescriptionAndHint(final View view, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        g1 g1VarO;
        g1 g1VarO2;
        g1 g1VarO3 = f7Var.o();
        final Expression expression = g1VarO3 != null ? g1VarO3.f87689a : null;
        g1 g1VarO4 = f7Var.o();
        final Expression expression2 = g1VarO4 != null ? g1VarO4.f87690b : null;
        if (ExpressionsKt.equalsToConstant(expression, (f7Var2 == null || (g1VarO2 = f7Var2.o()) == null) ? null : g1VarO2.f87689a)) {
            if (ExpressionsKt.equalsToConstant(expression2, (f7Var2 == null || (g1VarO = f7Var2.o()) == null) ? null : g1VarO.f87690b)) {
                return;
            }
        }
        applyDescriptionAndHint(view, expression != null ? (String) expression.evaluate(expressionResolver) : null, expression2 != null ? (String) expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindDescriptionAndHint$callback$1
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
                Expression expression3;
                DivAccessibilityBinder divAccessibilityBinder = this.this$0;
                View view2 = view;
                Expression<String> expression4 = expression;
                g1.c cVar = null;
                String strEvaluate = expression4 != null ? expression4.evaluate(expressionResolver) : null;
                Expression<String> expression5 = expression2;
                divAccessibilityBinder.applyDescriptionAndHint(view2, strEvaluate, expression5 != null ? expression5.evaluate(expressionResolver) : null);
                DivAccessibilityBinder divAccessibilityBinder2 = this.this$0;
                View view3 = view;
                g1 g1VarO5 = f7Var.o();
                if (g1VarO5 != null && (expression3 = g1VarO5.f87692d) != null) {
                    cVar = (g1.c) expression3.evaluate(expressionResolver);
                }
                divAccessibilityBinder2.applyMode(view3, cVar);
            }
        };
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
    }

    private void bindMode(final View view, f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        g1 g1VarO;
        if (getEnabled()) {
            g1 g1VarO2 = f7Var.o();
            Expression expression = g1VarO2 != null ? g1VarO2.f87692d : null;
            if (ExpressionsKt.equalsToConstant(expression, (f7Var2 == null || (g1VarO = f7Var2.o()) == null) ? null : g1VarO.f87692d)) {
                return;
            }
            applyMode(view, expression != null ? (g1.c) expression.evaluate(expressionResolver) : null);
            if (ExpressionsKt.isConstantOrNull(expression)) {
                return;
            }
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1<g1.c, Unit>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder.bindMode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(g1.c cVar) {
                    invoke2(cVar);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull g1.c cVar) {
                    DivAccessibilityBinder.this.applyMode(view, cVar);
                }
            }) : null);
        }
    }

    private void bindStateDescription(final View view, f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        g1 g1VarO;
        g1 g1VarO2 = f7Var.o();
        Expression expression = g1VarO2 != null ? g1VarO2.f87694f : null;
        if (ExpressionsKt.equalsToConstant(expression, (f7Var2 == null || (g1VarO = f7Var2.o()) == null) ? null : g1VarO.f87694f)) {
            return;
        }
        applyStateDescription(view, expression != null ? (String) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder.bindStateDescription.1
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
                DivAccessibilityBinder.this.applyStateDescription(view, str);
            }
        }) : null);
    }

    private void bindType(View view, f7 f7Var, f7 f7Var2) {
        if (this.accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            if (f7Var2 != null) {
                g1 g1VarO = f7Var.o();
                g1.d dVar = g1VarO != null ? g1VarO.f87695g : null;
                g1 g1VarO2 = f7Var2.o();
                if (dVar == (g1VarO2 != null ? g1VarO2.f87695g : null)) {
                    return;
                }
            }
            g1 g1VarO3 = f7Var.o();
            applyType(view, f7Var, g1VarO3 != null ? g1VarO3.f87695g : null);
        }
    }

    private AccessibilityDelegateCompat getAccessibilityDelegate(View view, AccessibilityType type) {
        if (type == AccessibilityType.LIST && (view instanceof BackHandlingRecyclerView)) {
            return new AccessibilityListDelegate((BackHandlingRecyclerView) view);
        }
        String toClassName = getToClassName(type);
        boolean z10 = type == AccessibilityType.HEADER;
        CharSequence accessibilityClassName = view.getAccessibilityClassName();
        if (!(toClassName.length() == 0 || Intrinsics.areEqual(toClassName, accessibilityClassName)) || z10) {
            return new ExtensiveAccessibilityDelegate(toClassName, z10, type == AccessibilityType.CHECK_BOX || type == AccessibilityType.RADIO_BUTTON);
        }
        return null;
    }

    private String getToClassName(AccessibilityType accessibilityType) {
        switch (WhenMappings.$EnumSwitchMapping$1[accessibilityType.ordinal()]) {
            case 1:
                return "";
            case 2:
                return "android.widget.Button";
            case 3:
                return AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName;
            case 4:
                return "";
            case 5:
                return "android.widget.ImageView";
            case 6:
                return "";
            case 7:
                return "androidx.viewpager.widget.ViewPager";
            case 8:
                return "";
            case 9:
                return "android.widget.Spinner";
            case 10:
                return "android.widget.TabWidget";
            case 11:
                return AndroidComposeViewAccessibilityDelegateCompat.TextClassName;
            case 12:
                return "android.widget.CheckBox";
            case 13:
                return "android.widget.RadioButton";
            case 14:
                return "android.view.ViewGroup";
            default:
                throw new m();
        }
    }

    private AccessibilityType toAccessibilityType(g1.d dVar, f7 f7Var) {
        switch (WhenMappings.$EnumSwitchMapping$0[dVar.ordinal()]) {
            case 1:
                if (f7Var instanceof yf) {
                    return AccessibilityType.EDIT_TEXT;
                }
                if (f7Var instanceof us) {
                    return AccessibilityType.TEXT;
                }
                if (f7Var instanceof as) {
                    return AccessibilityType.TAB_WIDGET;
                }
                if (f7Var instanceof rn) {
                    return AccessibilityType.SELECT;
                }
                if (f7Var instanceof tp) {
                    return AccessibilityType.SLIDER;
                }
                if (f7Var instanceof te) {
                    return AccessibilityType.IMAGE;
                }
                if (f7Var instanceof ee) {
                    return AccessibilityType.IMAGE;
                }
                if (f7Var instanceof td) {
                    g1 g1VarO = f7Var.o();
                    if ((g1VarO != null ? g1VarO.f87689a : null) != null) {
                        return AccessibilityType.PAGER;
                    }
                }
                return f7Var instanceof u8 ? AccessibilityType.CONTAINER : AccessibilityType.NONE;
            case 2:
                return AccessibilityType.NONE;
            case 3:
                return AccessibilityType.BUTTON;
            case 4:
                return AccessibilityType.IMAGE;
            case 5:
                return AccessibilityType.TEXT;
            case 6:
                return AccessibilityType.EDIT_TEXT;
            case 7:
                return AccessibilityType.HEADER;
            case 8:
                return AccessibilityType.LIST;
            case 9:
                return AccessibilityType.SELECT;
            case 10:
                return AccessibilityType.TAB_WIDGET;
            case 11:
                return AccessibilityType.RADIO_BUTTON;
            case 12:
                return AccessibilityType.CHECK_BOX;
            default:
                throw new m();
        }
    }

    public void bind(@NotNull View view, @NotNull f7 newDiv, @Nullable f7 oldDiv, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        if (newDiv.o() == null) {
            if ((oldDiv != null ? oldDiv.o() : null) == null) {
                if (getEnabled()) {
                    applyMode$default(this, view, null, 1, null);
                    return;
                }
                return;
            }
        }
        bindType(view, newDiv, oldDiv);
        bindDescriptionAndHint(view, newDiv, oldDiv, resolver, subscriber);
        bindMode(view, newDiv, oldDiv, resolver, subscriber);
        bindStateDescription(view, newDiv, oldDiv, resolver, subscriber);
        bindCheckedState(view, newDiv, oldDiv, resolver, subscriber);
    }

    public boolean getEnabled() {
        return this.enabled;
    }
}
