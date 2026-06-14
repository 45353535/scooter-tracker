package com.yandex.div.core.expression;

import a7.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0083\u0001\u0010\u001d\u001a\u00028\u0001\"\b\b\u0000\u0010\u0010*\u00020\u000f\"\b\b\u0001\u0010\u0011*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142*\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u0016j\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u0001`\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$Jo\u0010&\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022*\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u0016j\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u0001`\u00172\u0006\u0010%\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0002¢\u0006\u0004\b&\u0010'J;\u0010*\u001a\u00020)\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010+J\u0087\u0001\u0010.\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142*\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u0016j\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u0001`\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020)2\u0006\u0010\"\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J3\u00108\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0002032\f\u00106\u001a\b\u0012\u0004\u0012\u00020)05H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010<\u001a\u00020)H\u0000¢\u0006\u0004\b:\u0010;J\u001f\u0010B\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010UR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bV\u0010KR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR&\u0010[\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020Z0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR,\u0010]\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)050\\0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010YR\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006e"}, d2 = {"Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "", "path", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "runtimeStore", "Lcom/yandex/div/core/expression/variables/VariableController;", "variableController", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "itemBuilderData", "<init>", "(Ljava/lang/String;Lcom/yandex/div/core/expression/local/RuntimeStore;Lcom/yandex/div/core/expression/variables/VariableController;Lcom/yandex/div/evaluable/Evaluator;Lcom/yandex/div/core/view2/errors/ErrorCollector;Ljava/lang/String;)V", "", "R", "T", "expressionKey", "rawExpression", "Lcom/yandex/div/evaluable/Evaluable;", "evaluable", "Lkotlin/Function1;", "Lcom/yandex/div/internal/parser/Converter;", "converter", "Lcom/yandex/div/internal/parser/ValueValidator;", "validator", "Lcom/yandex/div/internal/parser/TypeHelper;", "fieldType", "tryResolve", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/evaluable/Evaluable;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/internal/parser/TypeHelper;)Ljava/lang/Object;", "getEvaluationResult", "(Ljava/lang/String;Lcom/yandex/div/evaluable/Evaluable;)Ljava/lang/Object;", "Lcom/yandex/div/evaluable/EvaluableException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "tryGetMissingVariableName", "(Lcom/yandex/div/evaluable/EvaluableException;)Ljava/lang/String;", "rawValue", "safeConvert", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lcom/yandex/div/internal/parser/TypeHelper;)Ljava/lang/Object;", "convertedValue", "", "safeValidate", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/internal/parser/ValueValidator;Ljava/lang/Object;)V", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "get", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/evaluable/Evaluable;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/internal/parser/TypeHelper;Lcom/yandex/div/json/ParsingErrorLogger;)Ljava/lang/Object;", "Lcom/yandex/div/json/ParsingException;", "notifyResolveFailed", "(Lcom/yandex/div/json/ParsingException;)V", "", "variableNames", "Lkotlin/Function0;", "callback", "Lcom/yandex/div/core/Disposable;", "subscribeToExpression", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Lcom/yandex/div/core/Disposable;", "subscribeOnVariables$div_release", "()V", "subscribeOnVariables", "pathSegment", "Lcom/yandex/div/core/expression/variables/ConstantsProvider;", "constants", "withConstants$div_release", "(Ljava/lang/String;Lcom/yandex/div/core/expression/variables/ConstantsProvider;)Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "withConstants", "element", "", FirebaseAnalytics.Param.INDEX, "Lorg/json/JSONObject;", "validateItemBuilderDataElement", "(Ljava/lang/Object;I)Lorg/json/JSONObject;", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "getRuntimeStore", "()Lcom/yandex/div/core/expression/local/RuntimeStore;", "Lcom/yandex/div/core/expression/variables/VariableController;", "getVariableController", "()Lcom/yandex/div/core/expression/variables/VariableController;", "Lcom/yandex/div/evaluable/Evaluator;", "getEvaluator", "()Lcom/yandex/div/evaluable/Evaluator;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "getItemBuilderData", "", "evaluationsCache", "Ljava/util/Map;", "", "varToExpressions", "Lcom/yandex/div/core/ObserverList;", "expressionObservers", "", "suppressMissingVariableException", "Z", "getSuppressMissingVariableException", "()Z", "setSuppressMissingVariableException", "(Z)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExpressionResolverImpl implements ExpressionResolver {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<String, Object> evaluationsCache;

    @NotNull
    private final Evaluator evaluator;

    @NotNull
    private final Map<String, ObserverList<Function0<Unit>>> expressionObservers;

    @Nullable
    private final String itemBuilderData;

    @NotNull
    private final String path;

    @NotNull
    private final RuntimeStore runtimeStore;
    private boolean suppressMissingVariableException;

    @NotNull
    private final Map<String, Set<String>> varToExpressions;

    @NotNull
    private final VariableController variableController;

    public ExpressionResolverImpl(@NotNull String str, @NotNull RuntimeStore runtimeStore, @NotNull VariableController variableController, @NotNull Evaluator evaluator, @NotNull ErrorCollector errorCollector, @Nullable String str2) {
        this.path = str;
        this.runtimeStore = runtimeStore;
        this.variableController = variableController;
        this.evaluator = evaluator;
        this.errorCollector = errorCollector;
        this.itemBuilderData = str2;
        this.evaluationsCache = new LinkedHashMap();
        this.varToExpressions = new LinkedHashMap();
        this.expressionObservers = new LinkedHashMap();
    }

    private final <R> R getEvaluationResult(String rawExpression, Evaluable evaluable) {
        R r10 = (R) this.evaluationsCache.get(rawExpression);
        if (r10 != null) {
            return r10;
        }
        R r11 = (R) this.evaluator.eval(evaluable);
        if (evaluable.getIsCacheable()) {
            for (String str : evaluable.getVariables()) {
                Map<String, Set<String>> map = this.varToExpressions;
                Set<String> linkedHashSet = map.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    map.put(str, linkedHashSet);
                }
                linkedHashSet.add(rawExpression);
            }
            this.evaluationsCache.put(rawExpression, r11);
        }
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private final <R, T> T safeConvert(String expressionKey, String rawExpression, Function1<? super R, ? extends T> converter, R rawValue, TypeHelper<T> fieldType) {
        ?? Invoke = rawValue;
        if (converter != null) {
            try {
                Invoke = converter.invoke(rawValue);
            } catch (ClassCastException e10) {
                throw ParsingExceptionKt.typeMismatch(expressionKey, rawExpression, rawValue, e10);
            } catch (Exception e11) {
                throw ParsingExceptionKt.invalidValue(expressionKey, rawExpression, rawValue, e11);
            }
        } else if (rawValue == 0) {
            Invoke = (T) null;
        }
        return safeConvert$fieldAwaitsStringButValueNotConverted(fieldType, (Object) Invoke) ? (T) String.valueOf((Object) Invoke) : (T) Invoke;
    }

    private static final <T> boolean safeConvert$fieldAwaitsStringButValueNotConverted(TypeHelper<T> typeHelper, T t10) {
        return (t10 == null || !(typeHelper.getTypeDefault() instanceof String) || typeHelper.isTypeValid(t10)) ? false : true;
    }

    private final <T> void safeValidate(String expressionKey, String rawExpression, ValueValidator<T> validator, T convertedValue) {
        try {
            if (validator.isValid(convertedValue)) {
            } else {
                throw ParsingExceptionKt.invalidValue(rawExpression, convertedValue);
            }
        } catch (ClassCastException e10) {
            throw ParsingExceptionKt.typeMismatch(expressionKey, rawExpression, convertedValue, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToExpression$lambda$7(ExpressionResolverImpl expressionResolverImpl, String str, Function0 function0) {
        ObserverList<Function0<Unit>> observerList = expressionResolverImpl.expressionObservers.get(str);
        if (observerList != null) {
            observerList.removeObserver(function0);
        }
    }

    private final String tryGetMissingVariableName(EvaluableException e10) {
        if (e10 instanceof MissingVariableException) {
            return ((MissingVariableException) e10).getVariableName();
        }
        return null;
    }

    private final <R, T> T tryResolve(String expressionKey, String rawExpression, Evaluable evaluable, Function1<? super R, ? extends T> converter, ValueValidator<T> validator, TypeHelper<T> fieldType) {
        String str;
        String str2;
        try {
            T t10 = (T) getEvaluationResult(rawExpression, evaluable);
            if (fieldType.isTypeValid(t10)) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of com.yandex.div.core.expression.ExpressionResolverImpl.tryResolve");
                str = expressionKey;
                str2 = rawExpression;
            } else {
                str = expressionKey;
                str2 = rawExpression;
                Object objSafeConvert = safeConvert(str, str2, converter, t10, fieldType);
                if (objSafeConvert == null) {
                    throw ParsingExceptionKt.invalidValue(str, str2, t10);
                }
                t10 = (T) objSafeConvert;
            }
            safeValidate(str, str2, validator, t10);
            return t10;
        } catch (EvaluableException e10) {
            String strTryGetMissingVariableName = tryGetMissingVariableName(e10);
            if (strTryGetMissingVariableName != null) {
                throw ParsingExceptionKt.missingVariable(expressionKey, rawExpression, strTryGetMissingVariableName, e10);
            }
            throw ParsingExceptionKt.resolveFailed(expressionKey, rawExpression, e10);
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    public <R, T> T get(@NotNull String expressionKey, @NotNull String rawExpression, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> converter, @NotNull ValueValidator<T> validator, @NotNull TypeHelper<T> fieldType, @NotNull ParsingErrorLogger logger) {
        try {
            return (T) tryResolve(expressionKey, rawExpression, evaluable, converter, validator, fieldType);
        } catch (ParsingException e10) {
            if (e10.getReason() == ParsingExceptionReason.MISSING_VARIABLE) {
                if (this.suppressMissingVariableException) {
                    throw ParsingExceptionKt.getSILENT_PARSING_EXCEPTION();
                }
                throw e10;
            }
            logger.logError(e10);
            this.errorCollector.logError(e10);
            return (T) tryResolve(expressionKey, rawExpression, evaluable, converter, validator, fieldType);
        }
    }

    @NotNull
    public final Evaluator getEvaluator() {
        return this.evaluator;
    }

    @Nullable
    public final String getItemBuilderData() {
        return this.itemBuilderData;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    @NotNull
    public final VariableController getVariableController() {
        return this.variableController;
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public void notifyResolveFailed(@NotNull ParsingException e10) {
        this.errorCollector.logError(e10);
    }

    public final void setSuppressMissingVariableException(boolean z10) {
        this.suppressMissingVariableException = z10;
    }

    public final void subscribeOnVariables$div_release() {
        this.variableController.setOnAnyVariableChangeCallback(this, new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.ExpressionResolverImpl$subscribeOnVariables$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Variable variable) {
                invoke2(variable);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Variable variable) {
                Set set = (Set) this.this$0.varToExpressions.get(variable.getName());
                List list = set != null ? CollectionsKt.toList(set) : null;
                if (list != null) {
                    ExpressionResolverImpl expressionResolverImpl = this.this$0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        expressionResolverImpl.evaluationsCache.remove((String) it.next());
                    }
                }
                if (list != null) {
                    ExpressionResolverImpl expressionResolverImpl2 = this.this$0;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ObserverList observerList = (ObserverList) expressionResolverImpl2.expressionObservers.get((String) it2.next());
                        if (observerList != null) {
                            Iterator<E> it3 = observerList.iterator();
                            while (it3.hasNext()) {
                                ((Function0) it3.next()).invoke();
                            }
                        }
                    }
                }
            }
        });
        this.variableController.restoreSubscriptions();
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    public Disposable subscribeToExpression(@NotNull String rawExpression, @NotNull List<String> variableNames, @NotNull Function0<Unit> callback) {
        for (String str : variableNames) {
            Map<String, Set<String>> map = this.varToExpressions;
            Set<String> linkedHashSet = map.get(str);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(str, linkedHashSet);
            }
            linkedHashSet.add(rawExpression);
        }
        Map<String, ObserverList<Function0<Unit>>> map2 = this.expressionObservers;
        ObserverList<Function0<Unit>> observerList = map2.get(rawExpression);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map2.put(rawExpression, observerList);
        }
        observerList.addObserver(callback);
        return new a(this, rawExpression, callback);
    }

    @Nullable
    public final JSONObject validateItemBuilderDataElement(@NotNull Object element, int index) {
        JSONObject jSONObject = element instanceof JSONObject ? (JSONObject) element : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.errorCollector.logError(ParsingExceptionKt.typeMismatch(index, element));
        return null;
    }

    @NotNull
    public final ExpressionResolverImpl withConstants$div_release(@NotNull String pathSegment, @NotNull ConstantsProvider constants) {
        VariableAndConstantController variableAndConstantController = new VariableAndConstantController(this.variableController, constants);
        return new ExpressionResolverImpl(this.path + IOUtils.DIR_SEPARATOR_UNIX + pathSegment, this.runtimeStore, variableAndConstantController, new Evaluator(new EvaluationContext(variableAndConstantController, this.evaluator.getEvaluationContext().getStoredValueProvider(), this.evaluator.getEvaluationContext().getFunctionProvider(), this.evaluator.getEvaluationContext().getWarningSender())), this.errorCollector, pathSegment);
    }

    public /* synthetic */ ExpressionResolverImpl(String str, RuntimeStore runtimeStore, VariableController variableController, Evaluator evaluator, ErrorCollector errorCollector, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, runtimeStore, variableController, evaluator, errorCollector, (i10 & 32) != 0 ? null : str2);
    }
}
