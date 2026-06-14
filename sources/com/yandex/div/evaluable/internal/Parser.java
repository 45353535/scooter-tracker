package com.yandex.div.evaluable.internal;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/evaluable/internal/Parser;", "", "()V", "and", "Lcom/yandex/div/evaluable/Evaluable;", "state", "Lcom/yandex/div/evaluable/internal/Parser$ParsingState;", NotificationCompat.CATEGORY_CALL, "prefix", "comparison", "equal", "exponent", "expression", "factor", "method", "or", "parse", "tokens", "", "Lcom/yandex/div/evaluable/internal/Token;", "rawExpression", "", "parseFunction", "token", "Lcom/yandex/div/evaluable/internal/Token$Function;", "sum", "try", "unary", "ParsingState", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Parser {

    @NotNull
    public static final Parser INSTANCE = new Parser();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/evaluable/internal/Parser$ParsingState;", "", "", "Lcom/yandex/div/evaluable/internal/Token;", "tokens", "", "rawExpr", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "currentToken", "()Lcom/yandex/div/evaluable/internal/Token;", "next", "", ToolBar.FORWARD, "()I", "", "isNotAtEnd", "()Z", "isAtEnd", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "Ljava/lang/String;", "getRawExpr", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "setIndex", "(I)V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class ParsingState {
        private int index;

        @NotNull
        private final String rawExpr;

        @NotNull
        private final List<Token> tokens;

        /* JADX WARN: Multi-variable type inference failed */
        public ParsingState(@NotNull List<? extends Token> tokens, @NotNull String rawExpr) {
            Intrinsics.checkNotNullParameter(tokens, "tokens");
            Intrinsics.checkNotNullParameter(rawExpr, "rawExpr");
            this.tokens = tokens;
            this.rawExpr = rawExpr;
        }

        @NotNull
        public final Token currentToken() {
            return this.tokens.get(this.index);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsingState)) {
                return false;
            }
            ParsingState parsingState = (ParsingState) other;
            return Intrinsics.areEqual(this.tokens, parsingState.tokens) && Intrinsics.areEqual(this.rawExpr, parsingState.rawExpr);
        }

        public final int forward() {
            int i10 = this.index;
            this.index = i10 + 1;
            return i10;
        }

        @NotNull
        public final String getRawExpr() {
            return this.rawExpr;
        }

        public int hashCode() {
            return (this.tokens.hashCode() * 31) + this.rawExpr.hashCode();
        }

        public final boolean isAtEnd() {
            return this.index >= this.tokens.size();
        }

        public final boolean isNotAtEnd() {
            return !isAtEnd();
        }

        @NotNull
        public final Token next() {
            return this.tokens.get(forward());
        }

        @NotNull
        public String toString() {
            return "ParsingState(tokens=" + this.tokens + ", rawExpr=" + this.rawExpr + ')';
        }
    }

    private Parser() {
    }

    private final Evaluable and(ParsingState state) {
        Evaluable evaluableEqual = equal(state);
        while (state.isNotAtEnd() && (state.currentToken() instanceof Token.Operator.Binary.Logical.And)) {
            state.forward();
            evaluableEqual = new Evaluable.Binary(Token.Operator.Binary.Logical.And.INSTANCE, evaluableEqual, equal(state), state.getRawExpr());
        }
        return evaluableEqual;
    }

    private final Evaluable call(ParsingState state, Evaluable prefix) {
        if (state.isAtEnd()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        Token next = state.next();
        if (prefix != null && !(next instanceof Token.Function)) {
            throw new EvaluableException("Method expected after .", null, 2, null);
        }
        if (next instanceof Token.Operand.Literal) {
            return new Evaluable.Value((Token.Operand.Literal) next, state.getRawExpr());
        }
        if (next instanceof Token.Operand.Variable) {
            return new Evaluable.Variable(((Token.Operand.Variable) next).getName(), state.getRawExpr(), null);
        }
        if (next instanceof Token.Function) {
            return parseFunction((Token.Function) next, state, prefix);
        }
        if (next instanceof Token$Bracket$LeftRound) {
            Evaluable evaluableExpression = expression(state);
            if (state.next() instanceof Token$Bracket$RightRound) {
                return evaluableExpression;
            }
            throw new EvaluableException("')' expected after expression", null, 2, null);
        }
        if (!(next instanceof Token$StringTemplate$Start)) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        while (state.isNotAtEnd() && !(state.currentToken() instanceof Token$StringTemplate$End)) {
            if ((state.currentToken() instanceof Token$StringTemplate$StartOfExpression) || (state.currentToken() instanceof Token$StringTemplate$EndOfExpression)) {
                state.forward();
            } else {
                arrayList.add(expression(state));
            }
        }
        if (state.next() instanceof Token$StringTemplate$End) {
            return new Evaluable.StringTemplate(arrayList, state.getRawExpr());
        }
        throw new EvaluableException("expected ''' at end of a string template", null, 2, null);
    }

    static /* synthetic */ Evaluable call$default(Parser parser, ParsingState parsingState, Evaluable evaluable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            evaluable = null;
        }
        return parser.call(parsingState, evaluable);
    }

    private final Evaluable comparison(ParsingState state) {
        Evaluable evaluableSum = sum(state);
        while (state.isNotAtEnd() && (state.currentToken() instanceof Token.Operator.Binary.Comparison)) {
            Token next = state.next();
            Evaluable evaluableSum2 = sum(state);
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableSum = new Evaluable.Binary((Token.Operator.Binary) next, evaluableSum, evaluableSum2, state.getRawExpr());
        }
        return evaluableSum;
    }

    private final Evaluable equal(ParsingState state) {
        Evaluable evaluableComparison = comparison(state);
        while (state.isNotAtEnd() && (state.currentToken() instanceof Token.Operator.Binary.Equality)) {
            Token next = state.next();
            Evaluable evaluableComparison2 = comparison(state);
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableComparison = new Evaluable.Binary((Token.Operator.Binary) next, evaluableComparison, evaluableComparison2, state.getRawExpr());
        }
        return evaluableComparison;
    }

    private final Evaluable exponent(ParsingState state) {
        Evaluable evaluableMethod = method(state);
        if (!state.isNotAtEnd() || !(state.currentToken() instanceof Token.Operator.Binary.Power)) {
            return evaluableMethod;
        }
        state.forward();
        return new Evaluable.Binary(Token.Operator.Binary.Power.INSTANCE, evaluableMethod, unary(state), state.getRawExpr());
    }

    private final Evaluable expression(ParsingState state) {
        Evaluable evaluableM7630try = m7630try(state);
        if (!state.isNotAtEnd() || !(state.currentToken() instanceof Token.Operator.TernaryIf)) {
            return evaluableM7630try;
        }
        state.forward();
        Evaluable evaluableExpression = expression(state);
        if (state.isAtEnd() || !(state.currentToken() instanceof Token.Operator.TernaryElse)) {
            throw new EvaluableException("':' expected in ternary-if-else expression", null, 2, null);
        }
        state.forward();
        return new Evaluable.Ternary(Token.Operator.TernaryIfElse.INSTANCE, evaluableM7630try, evaluableExpression, expression(state), state.getRawExpr());
    }

    private final Evaluable factor(ParsingState state) {
        Evaluable evaluableUnary = unary(state);
        while (state.isNotAtEnd() && (state.currentToken() instanceof Token.Operator.Binary.Factor)) {
            Token next = state.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableUnary = new Evaluable.Binary((Token.Operator.Binary) next, evaluableUnary, unary(state), state.getRawExpr());
        }
        return evaluableUnary;
    }

    private final Evaluable method(ParsingState state) {
        Evaluable evaluableCall$default = call$default(this, state, null, 2, null);
        while (state.isNotAtEnd() && (state.currentToken() instanceof Token.Operator.Dot)) {
            state.forward();
            evaluableCall$default = call(state, evaluableCall$default);
        }
        return evaluableCall$default;
    }

    private final Evaluable or(ParsingState state) {
        Evaluable evaluableAnd = and(state);
        while (state.isNotAtEnd() && (state.currentToken() instanceof Token.Operator.Binary.Logical.Or)) {
            state.forward();
            evaluableAnd = new Evaluable.Binary(Token.Operator.Binary.Logical.Or.INSTANCE, evaluableAnd, and(state), state.getRawExpr());
        }
        return evaluableAnd;
    }

    private final Evaluable parseFunction(Token.Function token, ParsingState state, Evaluable prefix) {
        if (!(state.next() instanceof Token$Bracket$LeftRound)) {
            throw new EvaluableException("'(' expected after function call", null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        if (prefix != null) {
            arrayList.add(prefix);
        }
        while (!(state.currentToken() instanceof Token$Bracket$RightRound)) {
            arrayList.add(expression(state));
            if (state.currentToken() instanceof Token.Function.ArgumentDelimiter) {
                state.forward();
            }
        }
        if (state.next() instanceof Token$Bracket$RightRound) {
            return prefix == null ? new Evaluable.FunctionCall(token, arrayList, state.getRawExpr()) : new Evaluable.MethodCall(token, arrayList, state.getRawExpr());
        }
        throw new EvaluableException("expected ')' after a function call", null, 2, null);
    }

    private final Evaluable sum(ParsingState state) {
        Evaluable evaluableFactor = factor(state);
        while (state.isNotAtEnd() && (state.currentToken() instanceof Token.Operator.Binary.Sum)) {
            Token next = state.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableFactor = new Evaluable.Binary((Token.Operator.Binary) next, evaluableFactor, factor(state), state.getRawExpr());
        }
        return evaluableFactor;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    private final Evaluable m7630try(ParsingState state) {
        Evaluable evaluableOr = or(state);
        if (!state.isNotAtEnd() || !(state.currentToken() instanceof Token.Operator.Try)) {
            return evaluableOr;
        }
        Token next = state.next();
        Evaluable evaluableExpression = expression(state);
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Try");
        return new Evaluable.Try((Token.Operator.Try) next, evaluableOr, evaluableExpression, state.getRawExpr());
    }

    private final Evaluable unary(ParsingState state) {
        if (!state.isNotAtEnd() || !(state.currentToken() instanceof Token.Operator.Unary)) {
            return exponent(state);
        }
        Token next = state.next();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator");
        return new Evaluable.Unary((Token.Operator) next, unary(state), state.getRawExpr());
    }

    @NotNull
    public final Evaluable parse(@NotNull List<? extends Token> tokens, @NotNull String rawExpression) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        if (tokens.isEmpty()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        ParsingState parsingState = new ParsingState(tokens, rawExpression);
        Evaluable evaluableExpression = expression(parsingState);
        if (parsingState.isNotAtEnd()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        return evaluableExpression;
    }
}
