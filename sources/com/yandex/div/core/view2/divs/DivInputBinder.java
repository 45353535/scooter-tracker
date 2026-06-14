package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.util.inputfilter.BaseInputFilter;
import com.yandex.div.core.util.inputfilter.ExpressionInputFilter;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.inputfilter.RegexInputFilter;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.CurrencyInputMask;
import com.yandex.div.core.util.mask.FixedLengthInputMask;
import com.yandex.div.core.util.mask.PhoneInputMask;
import com.yandex.div.core.util.mask.PhoneInputMaskKt;
import com.yandex.div.core.util.validator.ExpressionValidator;
import com.yandex.div.core.util.validator.RegexValidator;
import com.yandex.div.core.util.validator.ValidatorItemData;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import k8.hl;
import k8.ih;
import k8.mh;
import k8.qc;
import k8.s9;
import k8.sh;
import k8.y0;
import k8.y5;
import k8.yf;
import k8.yg;
import k8.z5;
import k8.zf;
import k8.zg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0001I\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u001b\u001a\u00020\u001a*\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u001a*\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010#\u001a\u00020\u001a*\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\u001a*\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b%\u0010&J-\u0010(\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010+J#\u0010-\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010+J#\u0010.\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010+J#\u0010/\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010+J#\u00100\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u0010+J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J+\u00106\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002032\u0006\u00102\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010+J#\u0010<\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b<\u0010+J+\u0010?\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@JA\u0010J\u001a\u00020I*\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bJ\u0010KJ+\u0010L\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bL\u0010MJ%\u0010R\u001a\u0004\u0018\u00010Q*\u00020N2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bR\u0010SJ3\u0010V\u001a\u00020\u001a*\u00020Q2\u0006\u0010T\u001a\u00020G2\u0006\u0010U\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bV\u0010WJ+\u0010Z\u001a\u00020\u001a*\u00020Q2\u0006\u0010F\u001a\u00020E2\u0006\u0010U\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[JA\u0010^\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010F\u001a\u00020E2\u0014\u0010]\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020\u001a0\\H\u0002¢\u0006\u0004\b^\u0010_J9\u0010a\u001a\u00020\u001a*\u00020\u00042\u0006\u0010'\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010`\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020\u001a0\\H\u0002¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\u0002032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bc\u0010dJ5\u0010e\u001a\u00020\u001a*\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\be\u0010fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010gR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010hR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010iR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010jR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010kR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010l¨\u0006m"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivInputBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$j;", "Lk8/yf;", "Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "typefaceResolver", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "variableBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "actionBinder", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/util/AccessibilityStateProvider;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lcom/yandex/div/json/expressions/Expression;", "Lk8/y5;", "horizontalAlignment", "Lk8/z5;", "verticalAlignment", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "observeTextAlignment", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "applyTextAlignment", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/y5;Lk8/z5;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "newDiv", "oldDiv", "observeBackground", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lcom/yandex/div/core/view2/BindingContext;Lk8/yf;Lk8/yf;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "applyNativeBackgroundColor", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lcom/yandex/div/core/view2/BindingContext;Lk8/yf;Lk8/yf;)V", "div", "observeBaseTextProperties", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/yf;Lk8/yf;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeMaxVisibleLines", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/yf;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeMaxLength", "observeHintText", "observeHintColor", "observeHighlightColor", "observeKeyboardTypeAndCapitalization", "Lk8/yf$e;", "type", "", "getKeyboardType", "(Lk8/yf$e;)I", "observeEnterTypeAndActions", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/yf;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/yf$d;", "getImeAction", "(Lk8/yf$d;)I", "observeSelectAllOnFocus", "observeIsEnabled", "Lcom/yandex/div/core/state/DivStatePath;", "path", "observeText", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/yf;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/util/mask/BaseInputMask;", "inputMask", "Lcom/yandex/div/core/util/inputfilter/InputFiltersHolder;", "filters", "Lcom/yandex/div/core/view2/Div2View;", "divView", "", "secondaryVariable", "com/yandex/div/core/view2/divs/DivInputBinder$createCallbacks$1", "createCallbacks", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/util/mask/BaseInputMask;Lcom/yandex/div/core/util/inputfilter/InputFiltersHolder;Lcom/yandex/div/core/view2/Div2View;Ljava/lang/String;)Lcom/yandex/div/core/view2/divs/DivInputBinder$createCallbacks$1;", "observeValidators", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/yf;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/Div2View;)V", "Lk8/ih;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "Lcom/yandex/div/core/util/validator/ValidatorItemData;", "toValidatorDataItem", "(Lk8/ih;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)Lcom/yandex/div/core/util/validator/ValidatorItemData;", "newValue", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "validate", "(Lcom/yandex/div/core/util/validator/ValidatorItemData;Ljava/lang/String;Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "isValid", "attachAccessibility", "(Lcom/yandex/div/core/util/validator/ValidatorItemData;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Z)V", "Lkotlin/Function1;", "onMaskUpdate", "observeMask", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/yf;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/Div2View;Lkotlin/jvm/functions/Function1;)V", "onFiltersUpdate", "observeFilters", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lk8/yf;Lcom/yandex/div/core/view2/BindingContext;Lkotlin/jvm/functions/Function1;)V", "getCapitalization", "(Lk8/yf;Lcom/yandex/div/json/expressions/ExpressionResolver;)I", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivInputView;Lcom/yandex/div/core/view2/BindingContext;Lk8/yf;Lk8/yf;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivInputBinder extends DivViewBinder<y0.j, yf, DivInputView> {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[y5.values().length];
            try {
                iArr[y5.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y5.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y5.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y5.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y5.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[yf.e.values().length];
            try {
                iArr2[yf.e.SINGLE_LINE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[yf.e.MULTI_LINE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[yf.e.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[yf.e.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[yf.e.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[yf.e.PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[yf.e.PASSWORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[yf.d.values().length];
            try {
                iArr3[yf.d.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[yf.d.SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[yf.d.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[yf.d.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[yf.d.GO.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[yf.a.values().length];
            try {
                iArr4[yf.a.SENTENCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[yf.a.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[yf.a.ALL_CHARACTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.DivInputBinder$createCallbacks$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\u001a\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0012¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0012¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/yandex/div/core/view2/divs/DivInputBinder$createCallbacks$1", "", "Landroid/text/Editable;", "editable", "Lkotlin/Function1;", "", "", "valueUpdater", "applyMaskOrFilters", "(Landroid/text/Editable;Lkotlin/jvm/functions/Function1;)V", "value", "setSecondVariable", "(Ljava/lang/String;)V", "onVariableChanged", "setViewStateChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class AnonymousClass1 implements TwoWayVariableBinder.Callbacks {
        final /* synthetic */ BindingContext $bindingContext;
        final /* synthetic */ InputFiltersHolder $filters;
        final /* synthetic */ BaseInputMask $inputMask;
        final /* synthetic */ String $secondaryVariable;
        final /* synthetic */ DivInputView $this_createCallbacks;

        AnonymousClass1(BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, DivInputView divInputView, BindingContext bindingContext, String str) {
            this.$inputMask = baseInputMask;
            this.$filters = inputFiltersHolder;
            this.$this_createCallbacks = divInputView;
            this.$bindingContext = bindingContext;
            this.$secondaryVariable = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void applyMaskOrFilters(Editable editable, Function1<? super String, Unit> valueUpdater) {
            String string;
            String string2;
            String str = "";
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            BaseInputMask baseInputMask = this.$inputMask;
            if (baseInputMask != null) {
                DivInputView divInputView = this.$this_createCallbacks;
                if (!Intrinsics.areEqual(baseInputMask.getValue(), string)) {
                    Editable text = divInputView.getText();
                    if (text != null && (string2 = text.toString()) != null) {
                        str = string2;
                    }
                    baseInputMask.applyChangeFrom(str, Integer.valueOf(divInputView.getSelectionStart()));
                    divInputView.setText(baseInputMask.getValue());
                    divInputView.setSelection(baseInputMask.getCursorPosition());
                    setSecondVariable(baseInputMask.getValue());
                }
                valueUpdater.invoke(StringsKt.V(baseInputMask.getRawValue(), ',', '.', false, 4, null));
                return;
            }
            InputFiltersHolder inputFiltersHolder = this.$filters;
            if (inputFiltersHolder != null) {
                DivInputView divInputView2 = this.$this_createCallbacks;
                if (Intrinsics.areEqual(inputFiltersHolder.getCurrentValue(), string)) {
                    return;
                }
                if (!inputFiltersHolder.checkValue(string)) {
                    divInputView2.setText(inputFiltersHolder.getCurrentValue());
                    divInputView2.setSelection(inputFiltersHolder.getCursorPosition());
                    return;
                } else {
                    inputFiltersHolder.setCurrentValue(string);
                    inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
                }
            }
            valueUpdater.invoke(string);
        }

        private void setSecondVariable(String value) {
            VariableController variableController = UtilsKt.getVariableController(this.$bindingContext.getExpressionResolver());
            String str = this.$secondaryVariable;
            if (str != null) {
                Variable mutableVariable = variableController != null ? variableController.getMutableVariable(str) : null;
                if (mutableVariable != null) {
                    mutableVariable.set(value);
                }
            }
        }

        @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
        public void setViewStateChangeListener(@NotNull final Function1<? super String, Unit> valueUpdater) {
            this.$this_createCallbacks.addAfterTextChangeAction(new Function1<Editable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$createCallbacks$1$setViewStateChangeListener$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
                    invoke2(editable);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Editable editable) {
                    this.this$0.applyMaskOrFilters(editable, valueUpdater);
                }
            });
        }

        @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
        public void onVariableChanged(@Nullable String value) {
            if (value == null) {
                value = "";
            }
            BaseInputMask baseInputMask = this.$inputMask;
            if (baseInputMask != null) {
                DivInputView divInputView = this.$this_createCallbacks;
                baseInputMask.overrideRawValue(value);
                setSecondVariable(baseInputMask.getValue());
                divInputView.setText(baseInputMask.getValue());
                return;
            }
            InputFiltersHolder inputFiltersHolder = this.$filters;
            if (inputFiltersHolder != null) {
                if (!inputFiltersHolder.checkValue(value)) {
                    return;
                }
                inputFiltersHolder.setCurrentValue(value);
                inputFiltersHolder.setCursorPosition(value.length());
            }
            Editable text = this.$this_createCallbacks.getText();
            if (Intrinsics.areEqual(text != null ? text.toString() : null, value)) {
                return;
            }
            this.$this_createCallbacks.setText(value);
        }
    }

    public DivInputBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull TwoWayStringVariableBinder twoWayStringVariableBinder, @NotNull DivActionBinder divActionBinder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.actionBinder = divActionBinder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNativeBackgroundColor(DivInputView divInputView, BindingContext bindingContext, yf yfVar, yf yfVar2) {
        Drawable nativeBackground;
        Drawable drawable;
        Expression expression;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        yf.f fVar = yfVar.K;
        int iIntValue = (fVar == null || (expression = fVar.f92735a) == null) ? 0 : ((Number) expression.evaluate(expressionResolver)).intValue();
        if (iIntValue == 0 || (nativeBackground = divInputView.getNativeBackground()) == null) {
            drawable = null;
        } else {
            nativeBackground.setTint(iIntValue);
            drawable = nativeBackground;
        }
        this.baseBinder.bindBackground$div_release(bindingContext, divInputView, yfVar, yfVar2, ReleasablesKt.getExpressionSubscriber(divInputView), drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(DivInputView divInputView, y5 y5Var, z5 z5Var) {
        divInputView.setGravity(DivUtilKt.evaluateGravity(y5Var, z5Var));
        int i10 = y5Var == null ? -1 : WhenMappings.$EnumSwitchMapping$0[y5Var.ordinal()];
        int i11 = 5;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 4;
            } else if (i10 == 3 || (i10 != 4 && i10 == 5)) {
                i11 = 6;
            }
        }
        divInputView.setTextAlignment(i11);
    }

    private final void attachAccessibility(final ValidatorItemData validatorItemData, Div2View div2View, final DivInputView divInputView, final boolean z10) {
        final IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't find label with id '" + validatorItemData.getLabelId() + '\'');
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent().getViewIdProvider();
        if (!divInputView.isLaidOut() || divInputView.isLayoutRequested()) {
            divInputView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$attachAccessibility$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int viewId = viewIdProvider.getViewId(validatorItemData.getLabelId());
                    if (viewId == -1) {
                        orCreate.logError(illegalArgumentException);
                        return;
                    }
                    View viewFindViewById = divInputView.getRootView().findViewById(viewId);
                    if (viewFindViewById != null) {
                        viewFindViewById.setLabelFor(z10 ? -1 : divInputView.getId());
                    } else {
                        orCreate.logError(illegalArgumentException);
                    }
                }
            });
            return;
        }
        int viewId = viewIdProvider.getViewId(validatorItemData.getLabelId());
        if (viewId == -1) {
            orCreate.logError(illegalArgumentException);
            return;
        }
        View viewFindViewById = divInputView.getRootView().findViewById(viewId);
        if (viewFindViewById != null) {
            viewFindViewById.setLabelFor(z10 ? -1 : divInputView.getId());
        } else {
            orCreate.logError(illegalArgumentException);
        }
    }

    private final AnonymousClass1 createCallbacks(DivInputView divInputView, BindingContext bindingContext, BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, Div2View div2View, String str) {
        return new AnonymousClass1(baseInputMask, inputFiltersHolder, divInputView, bindingContext, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCapitalization(yf div, ExpressionResolver resolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$3[((yf.a) div.f92670f.evaluate(resolver)).ordinal()];
        if (i10 == 1) {
            return 16384;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 4096;
        }
        return 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImeAction(yf.d type) {
        int i10 = WhenMappings.$EnumSwitchMapping$2[type.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 == 3) {
            return 6;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 2;
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyboardType(yf.e type) {
        switch (WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 131073;
            case 3:
                return 33;
            case 4:
                return 17;
            case 5:
                return 12290;
            case 6:
                return 3;
            case 7:
                return 129;
            default:
                throw new m();
        }
    }

    private final void observeBackground(DivInputView divInputView, final BindingContext bindingContext, final yf yfVar, final yf yfVar2, ExpressionResolver expressionResolver) {
        final DivInputView divInputView2;
        Expression expression;
        Disposable disposableObserveAndGet = null;
        if (DivDataExtensionsKt.equalsToConstant(yfVar.K, yfVar2 != null ? yfVar2.K : null)) {
            return;
        }
        applyNativeBackgroundColor(divInputView, bindingContext, yfVar, yfVar2);
        if (DivDataExtensionsKt.isConstant(yfVar.K)) {
            return;
        }
        yf.f fVar = yfVar.K;
        if (fVar == null || (expression = fVar.f92735a) == null) {
            divInputView2 = divInputView;
        } else {
            divInputView2 = divInputView;
            disposableObserveAndGet = expression.observeAndGet(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeBackground.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.f93236a;
                }

                public final void invoke(int i10) {
                    DivInputBinder.this.applyNativeBackgroundColor(divInputView2, bindingContext, yfVar, yfVar2);
                }
            });
        }
        divInputView2.addSubscription(disposableObserveAndGet);
    }

    private final void observeBaseTextProperties(DivInputView divInputView, yf yfVar, yf yfVar2, ExpressionResolver expressionResolver) {
        Expression expression = yfVar.f92684q;
        Expression expression2 = yfVar.f92685r;
        Expression expression3 = yfVar.E;
        Expression expression4 = yfVar.S;
        Expression expression5 = yfVar.F;
        Expression expression6 = yfVar.f92683p;
        Expression expression7 = yfVar.f92687t;
        Expression expression8 = yfVar.f92688u;
        Expression expression9 = yfVar.f92686s;
        Expression expression10 = yfVar2 != null ? yfVar2.f92684q : null;
        Expression expression11 = yfVar2 != null ? yfVar2.f92685r : null;
        Expression expression12 = yfVar2 != null ? yfVar2.E : null;
        Expression expression13 = yfVar2 != null ? yfVar2.S : null;
        Expression expression14 = yfVar2 != null ? yfVar2.F : null;
        Expression expression15 = yfVar2 != null ? yfVar2.f92683p : null;
        TextViewExtensionsKt.observeBaseTextProperties(divInputView, expression, expression2, expression3, expression4, expression5, expression6, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, expression15, yfVar2 != null ? yfVar2.f92687t : null, yfVar2 != null ? yfVar2.f92688u : null, yfVar2 != null ? yfVar2.f92686s : null, yfVar2, this.typefaceResolver, expressionResolver);
    }

    private final void observeEnterTypeAndActions(DivInputView divInputView, yf yfVar, BindingContext bindingContext, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(yfVar.f92679l.observeAndGet(expressionResolver, new DivInputBinder$observeEnterTypeAndActions$callback$1(yfVar, expressionResolver, divInputView, this, bindingContext)));
    }

    private final void observeFilters(DivInputView divInputView, yf yfVar, final BindingContext bindingContext, final Function1<? super InputFiltersHolder, Unit> function1) {
        if (yfVar.H != null) {
            return;
        }
        final List<zf> list = yfVar.f92681n;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1<Object, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeFilters$updateFiltersData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                BaseInputFilter regexInputFilter;
                List<zf> list3 = list;
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivInputBinder divInputBinder = this;
                BindingContext bindingContext2 = bindingContext;
                ArrayList arrayList = new ArrayList();
                for (zf zfVar : list3) {
                    if (zfVar instanceof zf.d) {
                        try {
                            regexInputFilter = new RegexInputFilter((String) ((zf.d) zfVar).c().f88244a.evaluate(expressionResolver2));
                        } catch (PatternSyntaxException e10) {
                            divInputBinder.errorCollectors.getOrCreate(bindingContext2.getDivView().getDataTag(), bindingContext2.getDivView().getDivData()).logError(new IllegalArgumentException("Invalid regex pattern '" + e10.getPattern() + "'.", e10));
                            regexInputFilter = null;
                        }
                    } else {
                        if (!(zfVar instanceof zf.c)) {
                            throw new m();
                        }
                        regexInputFilter = new ExpressionInputFilter(((zf.c) zfVar).c().f86248a, expressionResolver2);
                    }
                    if (regexInputFilter != null) {
                        arrayList.add(regexInputFilter);
                    }
                }
                function1.invoke(new InputFiltersHolder(arrayList));
            }
        };
        for (zf zfVar : list) {
            if (zfVar instanceof zf.d) {
                divInputView.addSubscription(((zf.d) zfVar).c().f88244a.observe(expressionResolver, function12));
            } else {
                boolean z10 = zfVar instanceof zf.c;
            }
        }
        function12.invoke(Unit.f93236a);
    }

    private final void observeHighlightColor(final DivInputView divInputView, yf yfVar, final ExpressionResolver expressionResolver) {
        final Expression expression = yfVar.f92691x;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHighlightColor$callback$1
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
                divInputView.setHighlightColor(expression.evaluate(expressionResolver).intValue());
            }
        }));
    }

    private final void observeHintColor(final DivInputView divInputView, final yf yfVar, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(yfVar.f92692y.observeAndGet(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintColor$callback$1
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
                divInputView.setHintTextColor(((Number) yfVar.f92692y.evaluate(expressionResolver)).intValue());
            }
        }));
    }

    private final void observeHintText(final DivInputView divInputView, yf yfVar, final ExpressionResolver expressionResolver) {
        final Expression expression = yfVar.f92693z;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintText$callback$1
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
                divInputView.setInputHint(expression.evaluate(expressionResolver));
            }
        }));
    }

    private final void observeIsEnabled(final DivInputView divInputView, yf yfVar, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(yfVar.B.observeAndGet(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeIsEnabled$callback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                if (!z10 && divInputView.isFocused()) {
                    DivActionTypedUtilsKt.closeKeyboard(divInputView);
                }
                divInputView.setEnabled$div_release(z10);
            }
        }));
    }

    private final void observeKeyboardTypeAndCapitalization(final DivInputView divInputView, final yf yfVar, final ExpressionResolver expressionResolver) {
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1
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
                yf.e eVar = (yf.e) yfVar.C.evaluate(expressionResolver);
                divInputView.setInputType(this.getKeyboardType(eVar) | this.getCapitalization(yfVar, expressionResolver));
                divInputView.setHorizontallyScrolling(eVar != yf.e.MULTI_LINE_TEXT);
            }
        };
        divInputView.addSubscription(yfVar.C.observe(expressionResolver, function1));
        divInputView.addSubscription(yfVar.f92670f.observeAndGet(expressionResolver, function1));
    }

    private final void observeMask(final DivInputView divInputView, final yf yfVar, final ExpressionResolver expressionResolver, Div2View div2View, final Function1<? super BaseInputMask, Unit> function1) {
        Expression expression;
        Disposable disposableObserve;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final KeyListener keyListener = divInputView.getKeyListener();
        final Function2<Exception, Function0<? extends Unit>, Unit> function2 = new Function2<Exception, Function0<? extends Unit>, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$catchCommonMaskException$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc, Function0<? extends Unit> function0) {
                invoke2(exc, (Function0<Unit>) function0);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc, @NotNull Function0<Unit> function0) {
                if (!(exc instanceof PatternSyntaxException)) {
                    function0.invoke();
                    return;
                }
                orCreate.logError(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
            }
        };
        Function1<Object, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                BaseInputMask baseInputMask;
                Locale localeForLanguageTag;
                yg ygVar = yfVar.H;
                BaseInputMask phoneInputMask = null;
                zg zgVarB = ygVar != null ? ygVar.b() : null;
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                if (zgVarB instanceof qc) {
                    divInputView.setKeyListener(keyListener);
                    qc qcVar = (qc) zgVarB;
                    String str = (String) qcVar.f90564b.evaluate(expressionResolver);
                    List<qc.c> list = qcVar.f90565c;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (qc.c cVar : list) {
                        char cC1 = StringsKt.C1((CharSequence) cVar.f90572a.evaluate(expressionResolver2));
                        Expression expression2 = cVar.f90574c;
                        String str2 = expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null;
                        Character chD1 = StringsKt.D1((CharSequence) cVar.f90573b.evaluate(expressionResolver2));
                        arrayList.add(new BaseInputMask.MaskKey(cC1, str2, chD1 != null ? chD1.charValue() : (char) 0));
                    }
                    BaseInputMask.MaskData maskData = new BaseInputMask.MaskData(str, arrayList, ((Boolean) qcVar.f90563a.evaluate(expressionResolver)).booleanValue());
                    baseInputMask = (BaseInputMask) ref$ObjectRef.f93280b;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, maskData, false, 2, null);
                        phoneInputMask = baseInputMask;
                    } else {
                        final Function2<Exception, Function0<Unit>, Unit> function22 = function2;
                        phoneInputMask = new FixedLengthInputMask(maskData, new Function1<Exception, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                                invoke2(exc);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Exception exc) {
                                function22.invoke(exc, new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.2.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.f93236a;
                                    }
                                });
                            }
                        });
                    }
                } else if (zgVarB instanceof s9) {
                    Expression expression3 = ((s9) zgVarB).f90977a;
                    String str3 = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
                    if (str3 != null) {
                        localeForLanguageTag = Locale.forLanguageTag(str3);
                        ErrorCollector errorCollector = orCreate;
                        String languageTag = localeForLanguageTag.toLanguageTag();
                        if (!Intrinsics.areEqual(languageTag, str3)) {
                            errorCollector.logWarning(new IllegalArgumentException("Original locale tag '" + str3 + "' is not equals to final one '" + languageTag + '\''));
                        }
                    } else {
                        localeForLanguageTag = Locale.getDefault();
                    }
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
                    Object obj2 = ref$ObjectRef.f93280b;
                    BaseInputMask baseInputMask2 = (BaseInputMask) obj2;
                    if (baseInputMask2 != null) {
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                        ((CurrencyInputMask) obj2).updateCurrencyParams(localeForLanguageTag);
                        phoneInputMask = baseInputMask2;
                    } else {
                        final Function2<Exception, Function0<Unit>, Unit> function23 = function2;
                        phoneInputMask = new CurrencyInputMask(localeForLanguageTag, new Function1<Exception, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                                invoke2(exc);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Exception exc) {
                                function23.invoke(exc, new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.4.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.f93236a;
                                    }
                                });
                            }
                        });
                    }
                } else if (zgVarB instanceof hl) {
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
                    baseInputMask = (BaseInputMask) ref$ObjectRef.f93280b;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, PhoneInputMaskKt.getDEFAULT_MASK_DATA(), false, 2, null);
                        phoneInputMask = baseInputMask;
                    } else {
                        final Function2<Exception, Function0<Unit>, Unit> function24 = function2;
                        phoneInputMask = new PhoneInputMask(new Function1<Exception, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                                invoke2(exc);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Exception exc) {
                                function24.invoke(exc, new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.6.1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.f93236a;
                                    }
                                });
                            }
                        });
                    }
                } else {
                    divInputView.setKeyListener(keyListener);
                }
                ref$ObjectRef2.f93280b = phoneInputMask;
                function1.invoke((BaseInputMask) ref$ObjectRef.f93280b);
            }
        };
        yg ygVar = yfVar.H;
        zg zgVarB = ygVar != null ? ygVar.b() : null;
        if (zgVarB instanceof qc) {
            qc qcVar = (qc) zgVarB;
            divInputView.addSubscription(qcVar.f90564b.observe(expressionResolver, function12));
            for (qc.c cVar : qcVar.f90565c) {
                divInputView.addSubscription(cVar.f90572a.observe(expressionResolver, function12));
                Expression expression2 = cVar.f90574c;
                if (expression2 != null) {
                    divInputView.addSubscription(expression2.observe(expressionResolver, function12));
                }
                divInputView.addSubscription(cVar.f90573b.observe(expressionResolver, function12));
            }
            divInputView.addSubscription(qcVar.f90563a.observe(expressionResolver, function12));
        } else if ((zgVarB instanceof s9) && (expression = ((s9) zgVarB).f90977a) != null && (disposableObserve = expression.observe(expressionResolver, function12)) != null) {
            divInputView.addSubscription(disposableObserve);
        }
        function12.invoke(Unit.f93236a);
    }

    private final void observeMaxLength(final DivInputView divInputView, yf yfVar, final ExpressionResolver expressionResolver) {
        final Expression expression = yfVar.I;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxLength$callback$1
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
                int i10;
                DivInputView divInputView2 = divInputView;
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
                divInputView2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i10)});
            }
        }));
    }

    private final void observeMaxVisibleLines(final DivInputView divInputView, yf yfVar, final ExpressionResolver expressionResolver) {
        final Expression expression = yfVar.J;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxVisibleLines$callback$1
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
                int i10;
                DivInputView divInputView2 = divInputView;
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
                divInputView2.setMaxLines(i10);
            }
        }));
    }

    private final void observeSelectAllOnFocus(final DivInputView divInputView, final yf yfVar, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(yfVar.O.observeAndGet(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeSelectAllOnFocus$callback$1
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
                divInputView.setSelectAllOnFocus(((Boolean) yfVar.O.evaluate(expressionResolver)).booleanValue());
            }
        }));
    }

    private final void observeText(final DivInputView divInputView, yf yfVar, BindingContext bindingContext, DivStatePath divStatePath) {
        String strA;
        String str;
        zg zgVarB;
        Div2View divView = bindingContext.getDivView();
        divInputView.removeAfterTextChangeListener();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        observeMask(divInputView, yfVar, bindingContext.getExpressionResolver(), divView, new Function1<BaseInputMask, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseInputMask baseInputMask) {
                invoke2(baseInputMask);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable BaseInputMask baseInputMask) {
                ref$ObjectRef.f93280b = baseInputMask;
                if (baseInputMask != null) {
                    DivInputView divInputView2 = divInputView;
                    divInputView2.setText(baseInputMask.getValue());
                    divInputView2.setSelection(baseInputMask.getCursorPosition());
                }
            }
        });
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        observeFilters(divInputView, yfVar, bindingContext, new Function1<InputFiltersHolder, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeText.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InputFiltersHolder inputFiltersHolder) {
                invoke2(inputFiltersHolder);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable InputFiltersHolder inputFiltersHolder) {
                String string;
                ref$ObjectRef2.f93280b = inputFiltersHolder;
                if (inputFiltersHolder != null) {
                    DivInputView divInputView2 = divInputView;
                    Editable editableText = divInputView2.getEditableText();
                    if (editableText == null || (string = editableText.toString()) == null) {
                        string = "";
                    }
                    inputFiltersHolder.setCurrentValue(string);
                    inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
                }
            }
        });
        yg ygVar = yfVar.H;
        if (ygVar == null) {
            strA = yfVar.T;
            str = null;
        } else if (ygVar == null || (zgVarB = ygVar.b()) == null || (strA = zgVarB.a()) == null) {
            return;
        } else {
            str = yfVar.T;
        }
        divInputView.addSubscription(this.variableBinder.bindVariable(bindingContext, strA, createCallbacks(divInputView, bindingContext, (BaseInputMask) ref$ObjectRef.f93280b, (InputFiltersHolder) ref$ObjectRef2.f93280b, divView, str), divStatePath));
        observeValidators(divInputView, yfVar, bindingContext.getExpressionResolver(), divView);
    }

    private final void observeTextAlignment(final DivInputView divInputView, final Expression<y5> expression, final Expression<z5> expression2, final ExpressionResolver expressionResolver) {
        applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
        Function1<? super y5, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTextAlignment$callback$1
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
                this.this$0.applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
            }
        };
        divInputView.addSubscription(expression.observe(expressionResolver, function1));
        divInputView.addSubscription(expression2.observe(expressionResolver, function1));
    }

    private final void observeValidators(final DivInputView divInputView, final yf yfVar, final ExpressionResolver expressionResolver, final Div2View div2View) {
        final ArrayList arrayList = new ArrayList();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$revalidateExpressionValidator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(int i10) {
                this.this$0.validate(arrayList.get(i10), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
            }
        };
        divInputView.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s10) {
                if (s10 != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.validate((ValidatorItemData) it.next(), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        Function1<Object, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$callback$1
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
                arrayList.clear();
                List list = yfVar.f92661a0;
                if (list != null) {
                    DivInputBinder divInputBinder = this;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ErrorCollector errorCollector = orCreate;
                    List<ValidatorItemData> list2 = arrayList;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ValidatorItemData validatorDataItem = divInputBinder.toValidatorDataItem((ih) it.next(), expressionResolver2, errorCollector);
                        if (validatorDataItem != null) {
                            list2.add(validatorDataItem);
                        }
                    }
                    List<ValidatorItemData> list3 = arrayList;
                    DivInputBinder divInputBinder2 = this;
                    DivInputView divInputView2 = divInputView;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver3 = expressionResolver;
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        divInputBinder2.validate((ValidatorItemData) it2.next(), String.valueOf(divInputView2.getText()), divInputView2, div2View2, expressionResolver3);
                    }
                }
            }
        };
        List list = yfVar.f92661a0;
        if (list != null) {
            final int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ih ihVar = (ih) obj;
                if (ihVar instanceof ih.d) {
                    ih.d dVar = (ih.d) ihVar;
                    divInputView.addSubscription(dVar.c().f91063c.observe(expressionResolver, function12));
                    divInputView.addSubscription(dVar.c().f91062b.observe(expressionResolver, function12));
                    divInputView.addSubscription(dVar.c().f91061a.observe(expressionResolver, function12));
                } else {
                    if (!(ihVar instanceof ih.c)) {
                        throw new m();
                    }
                    ih.c cVar = (ih.c) ihVar;
                    divInputView.addSubscription(cVar.c().f88995b.observe(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.f93236a;
                        }

                        public final void invoke(boolean z10) {
                            function1.invoke(Integer.valueOf(i10));
                        }
                    }));
                    divInputView.addSubscription(cVar.c().f88996c.observe(expressionResolver, function12));
                    divInputView.addSubscription(cVar.c().f88994a.observe(expressionResolver, function12));
                }
                i10 = i11;
            }
        }
        function12.invoke(Unit.f93236a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidatorItemData toValidatorDataItem(ih ihVar, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!(ihVar instanceof ih.d)) {
            if (!(ihVar instanceof ih.c)) {
                throw new m();
            }
            final mh mhVarC = ((ih.c) ihVar).c();
            return new ValidatorItemData(new ExpressionValidator(((Boolean) mhVarC.f88994a.evaluate(expressionResolver)).booleanValue(), new Function0<Boolean>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.toValidatorDataItem.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return (Boolean) mhVarC.f88995b.evaluate(expressionResolver);
                }
            }), mhVarC.f88997d, (String) mhVarC.f88996c.evaluate(expressionResolver));
        }
        sh shVarC = ((ih.d) ihVar).c();
        try {
            return new ValidatorItemData(new RegexValidator(new Regex((String) shVarC.f91063c.evaluate(expressionResolver)), ((Boolean) shVarC.f91061a.evaluate(expressionResolver)).booleanValue()), shVarC.f91064d, (String) shVarC.f91062b.evaluate(expressionResolver));
        } catch (PatternSyntaxException e10) {
            errorCollector.logError(new IllegalArgumentException("Invalid regex pattern '" + e10.getPattern() + '\'', e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validate(ValidatorItemData validatorItemData, String str, DivInputView divInputView, Div2View div2View, ExpressionResolver expressionResolver) {
        boolean zValidate = validatorItemData.getValidator().validate(str);
        VariableMutationHandler.INSTANCE.setVariable(div2View, validatorItemData.getVariableName(), String.valueOf(zValidate), expressionResolver);
        attachAccessibility(validatorItemData, div2View, divInputView, zValidate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivInputView divInputView, @NotNull BindingContext bindingContext, @NotNull yf yfVar, @Nullable yf yfVar2, @NotNull DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divInputView.setTextAlignment(5);
        divInputView.setAccessibilityEnabled$div_release(this.accessibilityStateProvider.isAccessibilityEnabled(divInputView.getContext()));
        observeBackground(divInputView, bindingContext, yfVar, yfVar2, expressionResolver);
        observeBaseTextProperties(divInputView, yfVar, yfVar2, expressionResolver);
        observeTextAlignment(divInputView, yfVar.Q, yfVar.R, expressionResolver);
        observeMaxVisibleLines(divInputView, yfVar, expressionResolver);
        observeMaxLength(divInputView, yfVar, expressionResolver);
        observeHintText(divInputView, yfVar, expressionResolver);
        observeHintColor(divInputView, yfVar, expressionResolver);
        observeHighlightColor(divInputView, yfVar, expressionResolver);
        observeKeyboardTypeAndCapitalization(divInputView, yfVar, expressionResolver);
        observeEnterTypeAndActions(divInputView, yfVar, bindingContext, expressionResolver);
        observeSelectAllOnFocus(divInputView, yfVar, expressionResolver);
        observeIsEnabled(divInputView, yfVar, expressionResolver);
        observeText(divInputView, yfVar, bindingContext, divStatePath);
        divInputView.setFocusTracker$div_release(bindingContext.getDivView().getInputFocusTracker());
        InputFocusTracker focusTracker = divInputView.getFocusTracker();
        if (focusTracker != null) {
            focusTracker.requestFocusIfNeeded(divInputView);
        }
    }
}
