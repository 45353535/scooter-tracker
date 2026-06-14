package com.yandex.div.evaluable;

import androidx.core.app.NotificationCompat;
import com.taurusx.tax.f.y;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 H2\u00020\u0001:\u0001HB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0012J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0012J\u001b\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u0018J5\u0010\u0019\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u0002H\u00112\u0006\u0010\n\u001a\u0002H\u0011H\u0012¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0012J \u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0012J\u0015\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0010¢\u0006\u0002\b$J&\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020&2\u0006\u0010\t\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(H\u0012J\u0015\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+H\u0010¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0010¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u000204H\u0010¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u000208H\u0010¢\u0006\u0002\b9J\u0015\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0010¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020@H\u0010¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020\u00012\u0006\u0010?\u001a\u00020CH\u0010¢\u0006\u0002\bDJ\u0014\u0010E\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020GH\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006I"}, d2 = {"Lcom/yandex/div/evaluable/Evaluator;", "", "evaluationContext", "Lcom/yandex/div/evaluable/EvaluationContext;", "(Lcom/yandex/div/evaluable/EvaluationContext;)V", "getEvaluationContext", "()Lcom/yandex/div/evaluable/EvaluationContext;", "castArgumentsIfNeeded", "Lkotlin/Pair;", "left", "right", "castEvalArgumentsIfNeeded", "", "function", "Lcom/yandex/div/evaluable/Function;", "args", "eval", "T", "expr", "Lcom/yandex/div/evaluable/Evaluable;", "(Lcom/yandex/div/evaluable/Evaluable;)Ljava/lang/Object;", "evalBinary", BuildConfig.SDK_DEPENDENCY, "Lcom/yandex/div/evaluable/Evaluable$Binary;", "evalBinary$div_evaluable", "evalComparableTypes", "", "operator", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "(Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Object;", "evalComparison", "evalEquality", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "evalFunctionCall", "functionCall", "Lcom/yandex/div/evaluable/Evaluable$FunctionCall;", "evalFunctionCall$div_evaluable", "evalLogical", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "rightEvaluator", "Lkotlin/Function0;", "evalMethodCall", "methodCall", "Lcom/yandex/div/evaluable/Evaluable$MethodCall;", "evalMethodCall$div_evaluable", "evalStringTemplate", "", "stringTemplate", "Lcom/yandex/div/evaluable/Evaluable$StringTemplate;", "evalStringTemplate$div_evaluable", "evalTernary", "ternary", "Lcom/yandex/div/evaluable/Evaluable$Ternary;", "evalTernary$div_evaluable", "evalTry", "tryEvaluable", "Lcom/yandex/div/evaluable/Evaluable$Try;", "evalTry$div_evaluable", "evalUnary", "unary", "Lcom/yandex/div/evaluable/Evaluable$Unary;", "evalUnary$div_evaluable", "evalValue", NotificationCompat.CATEGORY_CALL, "Lcom/yandex/div/evaluable/Evaluable$Value;", "evalValue$div_evaluable", "evalVariable", "Lcom/yandex/div/evaluable/Evaluable$Variable;", "evalVariable$div_evaluable", "castIfPossible", "type", "Lcom/yandex/div/evaluable/EvaluableType;", y.f66058y, "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Evaluator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EvaluationContext evaluationContext;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\bJ%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/evaluable/Evaluator$Companion;", "", "()V", "evalFactor", "operator", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "left", "right", "evalFactor$div_evaluable", "evalSum", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "evalSum$div_evaluable", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r13, (java.lang.Object) (-1L)) != false) goto L21;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object evalFactor$div_evaluable(@org.jetbrains.annotations.NotNull com.yandex.div.evaluable.internal.Token.Operator.Binary.Factor r11, @org.jetbrains.annotations.NotNull java.lang.Object r12, @org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 440
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.Evaluator.Companion.evalFactor$div_evaluable(com.yandex.div.evaluable.internal.Token$Operator$Binary$Factor, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @NotNull
        public final Object evalSum$div_evaluable(@NotNull Token.Operator.Binary.Sum operator, @NotNull Object left, @NotNull Object right) {
            double dDoubleValue;
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            if ((left instanceof String) && (right instanceof String)) {
                if (!(operator instanceof Token.Operator.Binary.Sum.Plus)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
                    throw new g();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(left);
                sb2.append(right);
                return sb2.toString();
            }
            if (!(left instanceof Long) || !(right instanceof Long)) {
                if (!(left instanceof Double) || !(right instanceof Double)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
                    throw new g();
                }
                if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                    dDoubleValue = ((Number) left).doubleValue() + ((Number) right).doubleValue();
                } else {
                    if (!(operator instanceof Token.Operator.Binary.Sum.Minus)) {
                        throw new m();
                    }
                    dDoubleValue = ((Number) left).doubleValue() - ((Number) right).doubleValue();
                }
                return Double.valueOf(dDoubleValue);
            }
            if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                Number number = (Number) left;
                Number number2 = (Number) right;
                long jLongValue = number.longValue() + number2.longValue();
                if (((number.longValue() ^ jLongValue) & (number2.longValue() ^ jLongValue)) >= 0) {
                    return Long.valueOf(jLongValue);
                }
                throw new IntegerOverflow(left + " + " + right, null, 2, null);
            }
            if (!(operator instanceof Token.Operator.Binary.Sum.Minus)) {
                throw new m();
            }
            Number number3 = (Number) left;
            Number number4 = (Number) right;
            long jLongValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ jLongValue2)) >= 0) {
                return Long.valueOf(jLongValue2);
            }
            throw new IntegerOverflow(left + " - " + right, null, 2, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Evaluator(@NotNull EvaluationContext evaluationContext) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        this.evaluationContext = evaluationContext;
    }

    private Pair<Object, Object> castArgumentsIfNeeded(Object left, Object right) {
        return Intrinsics.areEqual(left.getClass(), right.getClass()) ? TuplesKt.to(left, right) : ((left instanceof Long) && (right instanceof Double)) ? TuplesKt.to(Double.valueOf(((Number) left).longValue()), right) : ((left instanceof Double) && (right instanceof Long)) ? TuplesKt.to(left, Double.valueOf(((Number) right).longValue())) : TuplesKt.to(left, right);
    }

    private List<Object> castEvalArgumentsIfNeeded(Function function, List<? extends Object> args) {
        EvaluableType evaluableType;
        List<FunctionArgument> declaredArgs = function.getDeclaredArgs();
        List<? extends Object> list = args;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i10 = 0;
        for (Object objCastIfPossible : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EvaluableType type = declaredArgs.get(kotlin.ranges.g.j(i10, CollectionsKt.getLastIndex(declaredArgs))).getType();
            EvaluableType.Companion companion = EvaluableType.INSTANCE;
            if (objCastIfPossible instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (objCastIfPossible instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (objCastIfPossible instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (objCastIfPossible instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (objCastIfPossible instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (objCastIfPossible instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (objCastIfPossible instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (objCastIfPossible instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(objCastIfPossible instanceof JSONArray)) {
                    if (objCastIfPossible == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to find type for ");
                    Intrinsics.checkNotNull(objCastIfPossible);
                    sb2.append(objCastIfPossible.getClass().getName());
                    throw new EvaluableException(sb2.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            if (type != evaluableType) {
                objCastIfPossible = castIfPossible(objCastIfPossible, type);
            }
            arrayList.add(objCastIfPossible);
            i10 = i11;
        }
        return arrayList;
    }

    private Object castIfPossible(Object obj, EvaluableType evaluableType) {
        return ((obj instanceof Long) && WhenMappings.$EnumSwitchMapping$0[evaluableType.ordinal()] == 1) ? Double.valueOf(((Number) obj).longValue()) : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends java.lang.Comparable<? super T>> java.lang.Object evalComparableTypes(com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison r4, T r5, T r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.Less
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            int r4 = r5.compareTo(r6)
            if (r4 >= 0) goto L2f
        Lc:
            r1 = r2
            goto L2f
        Le:
            boolean r0 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.LessOrEqual
            if (r0 == 0) goto L19
            int r4 = r5.compareTo(r6)
            if (r4 > 0) goto L2f
            goto Lc
        L19:
            boolean r0 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.GreaterOrEqual
            if (r0 == 0) goto L24
            int r4 = r5.compareTo(r6)
            if (r4 < 0) goto L2f
            goto Lc
        L24:
            boolean r4 = r4 instanceof com.yandex.div.evaluable.internal.Token.Operator.Binary.Comparison.Greater
            if (r4 == 0) goto L34
            int r4 = r5.compareTo(r6)
            if (r4 <= 0) goto L2f
            goto Lc
        L2f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L34:
            lf.m r4 = new lf.m
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.Evaluator.evalComparableTypes(com.yandex.div.evaluable.internal.Token$Operator$Binary$Comparison, java.lang.Comparable, java.lang.Comparable):java.lang.Object");
    }

    private Object evalComparison(Token.Operator.Binary.Comparison operator, Object left, Object right) {
        if ((left instanceof Double) && (right instanceof Double)) {
            return evalComparableTypes(operator, (Comparable) left, (Comparable) right);
        }
        if ((left instanceof Long) && (right instanceof Long)) {
            return evalComparableTypes(operator, (Comparable) left, (Comparable) right);
        }
        if ((left instanceof DateTime) && (right instanceof DateTime)) {
            return evalComparableTypes(operator, (Comparable) left, (Comparable) right);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
        throw new g();
    }

    private Object evalEquality(Token.Operator.Binary.Equality operator, Object left, Object right) {
        boolean zAreEqual;
        if (operator instanceof Token.Operator.Binary.Equality.Equal) {
            zAreEqual = Intrinsics.areEqual(left, right);
        } else {
            if (!(operator instanceof Token.Operator.Binary.Equality.NotEqual)) {
                throw new m();
            }
            zAreEqual = !Intrinsics.areEqual(left, right);
        }
        return Boolean.valueOf(zAreEqual);
    }

    private Object evalLogical(Token.Operator.Binary.Logical operator, Object left, Function0<? extends Object> rightEvaluator) {
        if (!(left instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + ' ' + operator + " ...", '\'' + operator + "' must be called with boolean operands.", null, 4, null);
            throw new g();
        }
        boolean z10 = operator instanceof Token.Operator.Binary.Logical.Or;
        if ((z10 && ((Boolean) left).booleanValue()) || ((operator instanceof Token.Operator.Binary.Logical.And) && !((Boolean) left).booleanValue())) {
            return left;
        }
        Object objInvoke = rightEvaluator.invoke();
        if (!(objInvoke instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, objInvoke);
            throw new g();
        }
        boolean z11 = true;
        if (!z10 ? !((Boolean) left).booleanValue() || !((Boolean) objInvoke).booleanValue() : !((Boolean) left).booleanValue() && !((Boolean) objInvoke).booleanValue()) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public <T> T eval(@NotNull Evaluable expr) throws EvaluableException {
        Intrinsics.checkNotNullParameter(expr, "expr");
        try {
            return (T) expr.eval$div_evaluable(this);
        } catch (EvaluableException e10) {
            throw e10;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e11);
        }
    }

    @NotNull
    public Object evalBinary$div_evaluable(@NotNull final Evaluable.Binary binary) {
        Intrinsics.checkNotNullParameter(binary, "binary");
        Object objEval = eval(binary.getLeft());
        binary.updateIsCacheable$div_evaluable(binary.getLeft().getIsCacheable());
        if (binary.getToken() instanceof Token.Operator.Binary.Logical) {
            return evalLogical((Token.Operator.Binary.Logical) binary.getToken(), objEval, new Function0<Object>() { // from class: com.yandex.div.evaluable.Evaluator$evalBinary$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Object invoke() {
                    Object objEval2 = this.this$0.eval(binary.getRight());
                    Evaluable.Binary binary2 = binary;
                    binary2.updateIsCacheable$div_evaluable(binary2.getRight().getIsCacheable());
                    return objEval2;
                }
            });
        }
        Object objEval2 = eval(binary.getRight());
        binary.updateIsCacheable$div_evaluable(binary.getRight().getIsCacheable());
        Pair<Object, Object> pairCastArgumentsIfNeeded = castArgumentsIfNeeded(objEval, objEval2);
        Object objComponent1 = pairCastArgumentsIfNeeded.component1();
        Object objComponent2 = pairCastArgumentsIfNeeded.component2();
        if (!Intrinsics.areEqual(objComponent1.getClass(), objComponent2.getClass())) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), objComponent1, objComponent2);
            throw new g();
        }
        Token.Operator.Binary token = binary.getToken();
        if (token instanceof Token.Operator.Binary.Equality) {
            return evalEquality((Token.Operator.Binary.Equality) binary.getToken(), objComponent1, objComponent2);
        }
        if (token instanceof Token.Operator.Binary.Sum) {
            return INSTANCE.evalSum$div_evaluable((Token.Operator.Binary.Sum) binary.getToken(), objComponent1, objComponent2);
        }
        if (token instanceof Token.Operator.Binary.Factor) {
            return INSTANCE.evalFactor$div_evaluable((Token.Operator.Binary.Factor) binary.getToken(), objComponent1, objComponent2);
        }
        if (token instanceof Token.Operator.Binary.Comparison) {
            return evalComparison((Token.Operator.Binary.Comparison) binary.getToken(), objComponent1, objComponent2);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), objComponent1, objComponent2);
        throw new g();
    }

    @NotNull
    public Object evalFunctionCall$div_evaluable(@NotNull Evaluable.FunctionCall functionCall) {
        EvaluableType evaluableType;
        Intrinsics.checkNotNullParameter(functionCall, "functionCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : functionCall.getArguments()) {
            arrayList.add(eval(evaluable));
            functionCall.updateIsCacheable$div_evaluable(evaluable.getIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.INSTANCE;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb2.append(obj.getClass().getName());
                    throw new EvaluableException(sb2.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function function = getEvaluationContext().getFunctionProvider().get(functionCall.getToken().getName(), arrayList2);
            Evaluable evaluableM7617constructorimpl = ExpressionContext.m7617constructorimpl(functionCall);
            functionCall.updateIsCacheable$div_evaluable(function.getIsPure());
            try {
                return function.m7618invokeex6DHhM(getEvaluationContext(), evaluableM7617constructorimpl, castEvalArgumentsIfNeeded(function, arrayList));
            } catch (IntegerOverflow unused) {
                throw new IntegerOverflow(EvaluableExceptionKt.functionToMessageFormat(function.getName(), arrayList), null, 2, null);
            }
        } catch (EvaluableException e10) {
            String name = functionCall.getToken().getName();
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(name, arrayList, message, null, 8, null);
            throw new g();
        }
    }

    @NotNull
    public Object evalMethodCall$div_evaluable(@NotNull Evaluable.MethodCall methodCall) {
        EvaluableType evaluableType;
        Intrinsics.checkNotNullParameter(methodCall, "methodCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : methodCall.getArguments()) {
            arrayList.add(eval(evaluable));
            methodCall.updateIsCacheable$div_evaluable(evaluable.getIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.INSTANCE;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb2.append(obj.getClass().getName());
                    throw new EvaluableException(sb2.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function method = getEvaluationContext().getFunctionProvider().getMethod(methodCall.getToken().getName(), arrayList2);
            Evaluable evaluableM7617constructorimpl = ExpressionContext.m7617constructorimpl(methodCall);
            methodCall.updateIsCacheable$div_evaluable(method.getIsPure());
            return method.m7618invokeex6DHhM(getEvaluationContext(), evaluableM7617constructorimpl, castEvalArgumentsIfNeeded(method, arrayList));
        } catch (EvaluableException e10) {
            String name = methodCall.getToken().getName();
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnMethodEvaluationFailed(name, arrayList, message, e10);
            throw new g();
        }
    }

    @NotNull
    public String evalStringTemplate$div_evaluable(@NotNull Evaluable.StringTemplate stringTemplate) {
        Intrinsics.checkNotNullParameter(stringTemplate, "stringTemplate");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : stringTemplate.getArguments()) {
            arrayList.add(eval(evaluable).toString());
            stringTemplate.updateIsCacheable$div_evaluable(evaluable.getIsCacheable());
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public Object evalTernary$div_evaluable(@NotNull Evaluable.Ternary ternary) {
        Intrinsics.checkNotNullParameter(ternary, "ternary");
        if (!(ternary.getToken() instanceof Token.Operator.TernaryIfElse)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getRawExpr(), ternary.getToken() + " was incorrectly parsed as a ternary operator.", null, 4, null);
            throw new g();
        }
        Object objEval = eval(ternary.getFirstExpression());
        ternary.updateIsCacheable$div_evaluable(ternary.getFirstExpression().getIsCacheable());
        if (objEval instanceof Boolean) {
            if (((Boolean) objEval).booleanValue()) {
                Object objEval2 = eval(ternary.getSecondExpression());
                ternary.updateIsCacheable$div_evaluable(ternary.getSecondExpression().getIsCacheable());
                return objEval2;
            }
            Object objEval3 = eval(ternary.getThirdExpression());
            ternary.updateIsCacheable$div_evaluable(ternary.getThirdExpression().getIsCacheable());
            return objEval3;
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getFirstExpression() + " ? " + ternary.getSecondExpression() + " : " + ternary.getThirdExpression(), "Ternary must be called with a Boolean value as a condition.", null, 4, null);
        throw new g();
    }

    @NotNull
    public Object evalTry$div_evaluable(@NotNull Evaluable.Try tryEvaluable) {
        Object objB;
        Intrinsics.checkNotNullParameter(tryEvaluable, "tryEvaluable");
        try {
            Result.Companion companion = Result.f93230c;
            Object objEval = eval(tryEvaluable.getTryExpression());
            tryEvaluable.updateIsCacheable$div_evaluable(tryEvaluable.getTryExpression().getIsCacheable());
            objB = Result.b(objEval);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.g(objB) == null) {
            return objB;
        }
        Object objEval2 = eval(tryEvaluable.getFallbackExpression());
        tryEvaluable.updateIsCacheable$div_evaluable(tryEvaluable.getFallbackExpression().getIsCacheable());
        return objEval2;
    }

    @NotNull
    public Object evalUnary$div_evaluable(@NotNull Evaluable.Unary unary) {
        Intrinsics.checkNotNullParameter(unary, "unary");
        Object objEval = eval(unary.getExpression());
        unary.updateIsCacheable$div_evaluable(unary.getExpression().getIsCacheable());
        Token.Operator token = unary.getToken();
        if (token instanceof Token.Operator.Unary.Plus) {
            if (objEval instanceof Long) {
                return Long.valueOf(((Number) objEval).longValue());
            }
            if (objEval instanceof Double) {
                return Double.valueOf(((Number) objEval).doubleValue());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('+');
            sb2.append(objEval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb2.toString(), "A Number is expected after a unary plus.", null, 4, null);
            throw new g();
        }
        if (token instanceof Token.Operator.Unary.Minus) {
            if (objEval instanceof Long) {
                return Long.valueOf(-((Number) objEval).longValue());
            }
            if (objEval instanceof Double) {
                return Double.valueOf(-((Number) objEval).doubleValue());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append('-');
            sb3.append(objEval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb3.toString(), "A Number is expected after a unary minus.", null, 4, null);
            throw new g();
        }
        if (!Intrinsics.areEqual(token, Token.Operator.Unary.Not.INSTANCE)) {
            throw new EvaluableException(unary.getToken() + " was incorrectly parsed as a unary operator.", null, 2, null);
        }
        if (objEval instanceof Boolean) {
            return Boolean.valueOf(!((Boolean) objEval).booleanValue());
        }
        String str = objEval instanceof String ? "'" : "";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default('!' + str + objEval + str, "A Boolean is expected after a unary not.", null, 4, null);
        throw new g();
    }

    @NotNull
    public Object evalValue$div_evaluable(@NotNull Evaluable.Value call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Token.Operand.Literal token = call.getToken();
        if (token instanceof Token.Operand.Literal.Num) {
            return ((Token.Operand.Literal.Num) token).getValue();
        }
        if (token instanceof Token.Operand.Literal.Bool) {
            return Boolean.valueOf(((Token.Operand.Literal.Bool) token).getValue());
        }
        if (token instanceof Token.Operand.Literal.Str) {
            return ((Token.Operand.Literal.Str) token).getValue();
        }
        throw new m();
    }

    @NotNull
    public Object evalVariable$div_evaluable(@NotNull Evaluable.Variable call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Object obj = getEvaluationContext().getVariableProvider().get(call.getToken());
        if (obj != null) {
            return obj;
        }
        throw new MissingVariableException(call.getToken(), null, 2, null);
    }

    @NotNull
    public EvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }
}
