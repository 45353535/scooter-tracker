package com.yandex.div.evaluable;

import com.taurusx.tax.f.y;
import com.yandex.div.evaluable.function.GetBooleanValue;
import com.yandex.div.evaluable.function.GetColorValue;
import com.yandex.div.evaluable.function.GetColorValueString;
import com.yandex.div.evaluable.function.GetIntegerValue;
import com.yandex.div.evaluable.function.GetNumberValue;
import com.yandex.div.evaluable.function.GetStringValue;
import com.yandex.div.evaluable.function.GetUrlValueWithStringFallback;
import com.yandex.div.evaluable.function.GetUrlValueWithUrlFallback;
import com.yandex.div.evaluable.internal.Parser;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.internal.Tokenizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b&\u0018\u0000 \u001b2\u00020\u0001:\u000b\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\nJ\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H$J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0019R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006%"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable;", "", "rawExpr", "", "(Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "evalCalled", "", "isCacheable", "getRawExpr", "()Ljava/lang/String;", "variables", "getVariables", "checkIsCacheable", "eval", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "eval$div_evaluable", "evalImpl", "updateIsCacheable", "", "value", "updateIsCacheable$div_evaluable", "Binary", y.f66058y, "FunctionCall", "Lazy", "MethodCall", "StringTemplate", "Ternary", "Try", "Unary", "Value", "Variable", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Evaluable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<String> functionsWithVariableName = SetsKt.setOf((Object[]) new String[]{GetIntegerValue.INSTANCE.getName(), GetNumberValue.INSTANCE.getName(), GetStringValue.INSTANCE.getName(), GetColorValue.INSTANCE.getName(), GetColorValueString.INSTANCE.getName(), GetUrlValueWithUrlFallback.INSTANCE.getName(), GetUrlValueWithStringFallback.INSTANCE.getName(), GetBooleanValue.INSTANCE.getName()});
    private boolean evalCalled;
    private boolean isCacheable;

    @NotNull
    private final String rawExpr;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Binary;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "token", "left", "right", "", "rawExpression", "<init>", "(Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Lcom/yandex/div/evaluable/Evaluable;", "getLeft", "()Lcom/yandex/div/evaluable/Evaluable;", "getRight", "Ljava/lang/String;", "getRawExpression", "", "variables", "Ljava/util/List;", "getVariables", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Binary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable left;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable right;

        @NotNull
        private final Token.Operator.Binary token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(@NotNull Token.Operator.Binary token, @NotNull Evaluable left, @NotNull Evaluable right, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.left = left;
            this.right = right;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) left.getVariables(), (Iterable) right.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) left.getDynamicVariables(), (Iterable) right.getDynamicVariables());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) other;
            return Intrinsics.areEqual(this.token, binary.token) && Intrinsics.areEqual(this.left, binary.left) && Intrinsics.areEqual(this.right, binary.right) && Intrinsics.areEqual(this.rawExpression, binary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalBinary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getLeft() {
            return this.left;
        }

        @NotNull
        public final Evaluable getRight() {
            return this.right;
        }

        @NotNull
        public final Token.Operator.Binary getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.left.hashCode()) * 31) + this.right.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.left);
            sb2.append(' ');
            sb2.append(this.token);
            sb2.append(' ');
            sb2.append(this.right);
            sb2.append(')');
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Companion;", "", "<init>", "()V", "", "expr", "Lcom/yandex/div/evaluable/Evaluable;", "lazy", "(Ljava/lang/String;)Lcom/yandex/div/evaluable/Evaluable;", "", "functionsWithVariableName", "Ljava/util/Set;", "getFunctionsWithVariableName$div_evaluable", "()Ljava/util/Set;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getFunctionsWithVariableName$div_evaluable() {
            return Evaluable.functionsWithVariableName;
        }

        @NotNull
        public final Evaluable lazy(@NotNull String expr) {
            Intrinsics.checkNotNullParameter(expr, "expr");
            return new Lazy(expr);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0012R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u000bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u000b¨\u0006%"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$FunctionCall;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Function;", "token", "", "arguments", "", "rawExpression", "<init>", "(Lcom/yandex/div/evaluable/internal/Token$Function;Ljava/util/List;Ljava/lang/String;)V", "findDynamicVariables", "()Ljava/util/List;", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/internal/Token$Function;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Function;", "Ljava/util/List;", "getArguments", "Ljava/lang/String;", "getRawExpression", "variables", "getVariables", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FunctionCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            Object obj;
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list2 = (List) obj;
            this.variables = list2 == null ? CollectionsKt.emptyList() : list2;
            this.dynamicVariables = findDynamicVariables();
        }

        private final List<Evaluable> findDynamicVariables() {
            Object obj;
            List<Evaluable> listEmptyList = Evaluable.INSTANCE.getFunctionsWithVariableName$div_evaluable().contains(this.token.getName()) ? this.arguments : CollectionsKt.emptyList();
            List<Evaluable> list = this.arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getDynamicVariables());
            }
            Iterator it2 = CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf(listEmptyList)).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<Evaluable> list2 = (List) obj;
            return list2 == null ? CollectionsKt.emptyList() : list2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) other;
            return Intrinsics.areEqual(this.token, functionCall.token) && Intrinsics.areEqual(this.arguments, functionCall.arguments) && Intrinsics.areEqual(this.rawExpression, functionCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalFunctionCall$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return this.token.getName() + '(' + CollectionsKt.joinToString$default(this.arguments, Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null) + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Lazy;", "Lcom/yandex/div/evaluable/Evaluable;", "expr", "", "(Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "expression", "tokens", "Lcom/yandex/div/evaluable/internal/Token;", "variables", "getVariables", "evalImpl", "", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "initExpression", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Lazy extends Evaluable {

        @NotNull
        private final String expr;
        private Evaluable expression;

        @NotNull
        private final List<Token> tokens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lazy(@NotNull String expr) {
            super(expr);
            Intrinsics.checkNotNullParameter(expr, "expr");
            this.expr = expr;
            this.tokens = Tokenizer.INSTANCE.tokenize(expr);
        }

        private final void initExpression() {
            if (this.expression == null) {
                this.expression = Parser.INSTANCE.parse(this.tokens, getRawExpr());
            }
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            initExpression();
            Evaluable evaluable = this.expression;
            Evaluable evaluable2 = null;
            if (evaluable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
                evaluable = null;
            }
            Object objEval$div_evaluable = evaluable.eval$div_evaluable(evaluator);
            Evaluable evaluable3 = this.expression;
            if (evaluable3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
            } else {
                evaluable2 = evaluable3;
            }
            updateIsCacheable$div_evaluable(evaluable2.isCacheable);
            return objEval$div_evaluable;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            initExpression();
            Unit unit = Unit.f93236a;
            Evaluable evaluable = this.expression;
            if (evaluable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
                evaluable = null;
            }
            return evaluable.getDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            Evaluable evaluable = this.expression;
            if (evaluable != null) {
                if (evaluable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("expression");
                    evaluable = null;
                }
                return evaluable.getVariables();
            }
            List<Token> list = this.tokens;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Token.Operand.Variable) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Token.Operand.Variable) it.next()).getName());
            }
            return arrayList2;
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getExpr() {
            return this.expr;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$MethodCall;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Function;", "token", "", "arguments", "", "rawExpression", "<init>", "(Lcom/yandex/div/evaluable/internal/Token$Function;Ljava/util/List;Ljava/lang/String;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/internal/Token$Function;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Function;", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "Ljava/lang/String;", "getRawExpression", "variables", "getVariables", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MethodCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MethodCall(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            Object next;
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            Object next2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
            } else {
                next = null;
            }
            List<String> list2 = (List) next;
            this.variables = list2 == null ? CollectionsKt.emptyList() : list2;
            List<Evaluable> list3 = this.arguments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                while (it4.hasNext()) {
                    next2 = CollectionsKt.plus((Collection) next2, (Iterable) it4.next());
                }
            }
            List<Evaluable> list4 = (List) next2;
            this.dynamicVariables = list4 == null ? CollectionsKt.emptyList() : list4;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MethodCall)) {
                return false;
            }
            MethodCall methodCall = (MethodCall) other;
            return Intrinsics.areEqual(this.token, methodCall.token) && Intrinsics.areEqual(this.arguments, methodCall.arguments) && Intrinsics.areEqual(this.rawExpression, methodCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalMethodCall$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            String strJoinToString$default;
            if (this.arguments.size() > 1) {
                List<Evaluable> list = this.arguments;
                strJoinToString$default = CollectionsKt.joinToString$default(list.subList(1, list.size()), Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null);
            } else {
                strJoinToString$default = "";
            }
            return CollectionsKt.first((List) this.arguments) + '.' + this.token.getName() + '(' + strJoinToString$default + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$StringTemplate;", "Lcom/yandex/div/evaluable/Evaluable;", "", "arguments", "", "rawExpression", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "Ljava/lang/String;", "getRawExpression", "variables", "getVariables", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StringTemplate extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StringTemplate(@NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
            }
            this.variables = (List) next;
            List<Evaluable> list2 = this.arguments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it4.next();
            while (it4.hasNext()) {
                next2 = CollectionsKt.plus((Collection) next2, (Iterable) it4.next());
            }
            this.dynamicVariables = (List) next2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringTemplate)) {
                return false;
            }
            StringTemplate stringTemplate = (StringTemplate) other;
            return Intrinsics.areEqual(this.arguments, stringTemplate.arguments) && Intrinsics.areEqual(this.rawExpression, stringTemplate.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalStringTemplate$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (this.arguments.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return CollectionsKt.joinToString$default(this.arguments, "", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006*"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Ternary;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "token", "firstExpression", "secondExpression", "thirdExpression", "", "rawExpression", "<init>", "(Lcom/yandex/div/evaluable/internal/Token$Operator;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/Evaluable;", "getFirstExpression", "()Lcom/yandex/div/evaluable/Evaluable;", "getSecondExpression", "getThirdExpression", "Ljava/lang/String;", "getRawExpression", "", "variables", "Ljava/util/List;", "getVariables", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Ternary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable firstExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable secondExpression;

        @NotNull
        private final Evaluable thirdExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ternary(@NotNull Token.Operator token, @NotNull Evaluable firstExpression, @NotNull Evaluable secondExpression, @NotNull Evaluable thirdExpression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(firstExpression, "firstExpression");
            Intrinsics.checkNotNullParameter(secondExpression, "secondExpression");
            Intrinsics.checkNotNullParameter(thirdExpression, "thirdExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.firstExpression = firstExpression;
            this.secondExpression = secondExpression;
            this.thirdExpression = thirdExpression;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) firstExpression.getVariables(), (Iterable) secondExpression.getVariables()), (Iterable) thirdExpression.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) firstExpression.getDynamicVariables(), (Iterable) secondExpression.getDynamicVariables()), (Iterable) thirdExpression.getDynamicVariables());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) other;
            return Intrinsics.areEqual(this.token, ternary.token) && Intrinsics.areEqual(this.firstExpression, ternary.firstExpression) && Intrinsics.areEqual(this.secondExpression, ternary.secondExpression) && Intrinsics.areEqual(this.thirdExpression, ternary.thirdExpression) && Intrinsics.areEqual(this.rawExpression, ternary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalTernary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getFirstExpression() {
            return this.firstExpression;
        }

        @NotNull
        public final Evaluable getSecondExpression() {
            return this.secondExpression;
        }

        @NotNull
        public final Evaluable getThirdExpression() {
            return this.thirdExpression;
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((((this.token.hashCode() * 31) + this.firstExpression.hashCode()) * 31) + this.secondExpression.hashCode()) * 31) + this.thirdExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            Token.Operator.TernaryIf ternaryIf = Token.Operator.TernaryIf.INSTANCE;
            Token.Operator.TernaryElse ternaryElse = Token.Operator.TernaryElse.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.firstExpression);
            sb2.append(' ');
            sb2.append(ternaryIf);
            sb2.append(' ');
            sb2.append(this.secondExpression);
            sb2.append(' ');
            sb2.append(ternaryElse);
            sb2.append(' ');
            sb2.append(this.thirdExpression);
            sb2.append(')');
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Try;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "token", "tryExpression", "fallbackExpression", "", "rawExpression", "<init>", "(Lcom/yandex/div/evaluable/internal/Token$Operator$Try;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "Lcom/yandex/div/evaluable/Evaluable;", "getTryExpression", "()Lcom/yandex/div/evaluable/Evaluable;", "getFallbackExpression", "Ljava/lang/String;", "getRawExpression", "", "variables", "Ljava/util/List;", "getVariables", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Try extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable fallbackExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator.Try token;

        @NotNull
        private final Evaluable tryExpression;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Try(@NotNull Token.Operator.Try token, @NotNull Evaluable tryExpression, @NotNull Evaluable fallbackExpression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(tryExpression, "tryExpression");
            Intrinsics.checkNotNullParameter(fallbackExpression, "fallbackExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.tryExpression = tryExpression;
            this.fallbackExpression = fallbackExpression;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) tryExpression.getVariables(), (Iterable) fallbackExpression.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) tryExpression.getDynamicVariables(), (Iterable) fallbackExpression.getDynamicVariables());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Try)) {
                return false;
            }
            Try r52 = (Try) other;
            return Intrinsics.areEqual(this.token, r52.token) && Intrinsics.areEqual(this.tryExpression, r52.tryExpression) && Intrinsics.areEqual(this.fallbackExpression, r52.fallbackExpression) && Intrinsics.areEqual(this.rawExpression, r52.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalTry$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getFallbackExpression() {
            return this.fallbackExpression;
        }

        @NotNull
        public final Evaluable getTryExpression() {
            return this.tryExpression;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.tryExpression.hashCode()) * 31) + this.fallbackExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.tryExpression);
            sb2.append(' ');
            sb2.append(this.token);
            sb2.append(' ');
            sb2.append(this.fallbackExpression);
            sb2.append(')');
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Unary;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "token", "expression", "", "rawExpression", "<init>", "(Lcom/yandex/div/evaluable/internal/Token$Operator;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/Evaluable;", "getExpression", "()Lcom/yandex/div/evaluable/Evaluable;", "Ljava/lang/String;", "getRawExpression", "", "variables", "Ljava/util/List;", "getVariables", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Unary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable expression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unary(@NotNull Token.Operator token, @NotNull Evaluable expression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.expression = expression;
            this.rawExpression = rawExpression;
            this.variables = expression.getVariables();
            this.dynamicVariables = expression.getDynamicVariables();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) other;
            return Intrinsics.areEqual(this.token, unary.token) && Intrinsics.areEqual(this.expression, unary.expression) && Intrinsics.areEqual(this.rawExpression, unary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalUnary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getExpression() {
            return this.expression;
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.expression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.token);
            sb2.append(this.expression);
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Value;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "token", "", "rawExpression", "<init>", "(Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;Ljava/lang/String;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "Ljava/lang/String;", "getRawExpression", "", "variables", "Ljava/util/List;", "getVariables", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Value extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operand.Literal token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(@NotNull Token.Operand.Literal token, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.emptyList();
            this.dynamicVariables = CollectionsKt.emptyList();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return Intrinsics.areEqual(this.token, value.token) && Intrinsics.areEqual(this.rawExpression, value.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalValue$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Operand.Literal getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (this.token.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            Token.Operand.Literal literal = this.token;
            if (literal instanceof Token.Operand.Literal.Str) {
                return '\'' + ((Token.Operand.Literal.Str) this.token).getValue() + '\'';
            }
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).getValue().toString();
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return String.valueOf(((Token.Operand.Literal.Bool) literal).getValue());
            }
            throw new m();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Variable;", "Lcom/yandex/div/evaluable/Evaluable;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "token", "", "rawExpression", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/yandex/div/evaluable/Evaluator;", "evaluator", "", "evalImpl", "(Lcom/yandex/div/evaluable/Evaluator;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken-A4lXSVo", "getRawExpression", "", "variables", "Ljava/util/List;", "getVariables", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Variable extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String token;

        @NotNull
        private final List<String> variables;

        public /* synthetic */ Variable(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) other;
            return Token.Operand.Variable.m7652equalsimpl0(this.token, variable.token) && Intrinsics.areEqual(this.rawExpression, variable.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalVariable$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        /* JADX INFO: renamed from: getToken-A4lXSVo, reason: not valid java name and from getter */
        public final String getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (Token.Operand.Variable.m7653hashCodeimpl(this.token) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return this.token;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Variable(String token, String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.listOf(token);
            this.dynamicVariables = CollectionsKt.emptyList();
        }
    }

    public Evaluable(@NotNull String rawExpr) {
        Intrinsics.checkNotNullParameter(rawExpr, "rawExpr");
        this.rawExpr = rawExpr;
        this.isCacheable = true;
    }

    /* JADX INFO: renamed from: checkIsCacheable, reason: from getter */
    public final boolean getIsCacheable() {
        return this.isCacheable;
    }

    @NotNull
    public final Object eval$div_evaluable(@NotNull Evaluator evaluator) throws EvaluableException {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Object objEvalImpl = evalImpl(evaluator);
        this.evalCalled = true;
        return objEvalImpl;
    }

    @NotNull
    protected abstract Object evalImpl(@NotNull Evaluator evaluator) throws EvaluableException;

    @NotNull
    public abstract List<Evaluable> getDynamicVariables();

    @NotNull
    public final String getRawExpr() {
        return this.rawExpr;
    }

    @NotNull
    public abstract List<String> getVariables();

    public final void updateIsCacheable$div_evaluable(boolean value) {
        this.isCacheable = this.isCacheable && value;
    }
}
