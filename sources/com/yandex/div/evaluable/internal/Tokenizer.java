package com.yandex.div.evaluable.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0012\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ%\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b(\u0010'J\u0013\u0010*\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b,\u0010+J'\u0010/\u001a\u00020\u000e*\u00020)2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b1\u0010+J\u0013\u00102\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b2\u0010+J\u0013\u00103\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b3\u0010+J\u001b\u00104\u001a\u00020\u000e*\u00020)2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u00020\u000e*\u00020)2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u00105J\u0013\u00107\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b7\u0010+J\u0013\u00108\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b8\u0010+J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u001f¢\u0006\u0004\b\b\u00109\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/yandex/div/evaluable/internal/Tokenizer;", "", "<init>", "()V", "", "input", "", "Lcom/yandex/div/evaluable/internal/Token;", "tokenize", "([C)Ljava/util/List;", "Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;", "state", "", "tokens", "", "isPartOfExpression", "", "processStringTemplate", "(Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;Ljava/util/List;Z)V", "isLiteral", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "processString-wB-4SYI", "(Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;Z)Ljava/lang/String;", "processString", "isAtEndOfString", "(Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;Z)Z", "processExpression", "(Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;Ljava/util/List;)Z", "processNumber", "(Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;Ljava/util/List;)V", "processIdentifier", "", "identifier", "processKeyword", "(Ljava/lang/String;Ljava/util/List;)Z", "Lcom/yandex/div/evaluable/EvaluableException;", "invalidToken", "(Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;)Lcom/yandex/div/evaluable/EvaluableException;", "isOperator", "(Ljava/util/List;)Z", "isUnaryOperator", "", "isAlphabetic", "(C)Z", "isNumber", "previousChar", "nextChar", "isDecimal", "(CCC)Z", "isWhiteSpace", "isValidIdentifier", "isDot", "isAtEndOfStringLiteral", "(CLcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;)Z", "isStartOfExpression", "isAtEndOfExpression", "isAtEnd", "(Ljava/lang/String;)Ljava/util/List;", "TokenizationState", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Tokenizer {

    @NotNull
    public static final Tokenizer INSTANCE = new Tokenizer();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010'R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;", "", "", "source", "<init>", "([C)V", "", "step", "", "prevChar", "(I)C", "", "currentCharIsEscaped", "()Z", "currentChar", "()C", C4240b4.i.L, "charAt", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "", "part", "(II)Ljava/lang/String;", "nextChar", "count", ToolBar.FORWARD, "(I)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "[C", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "setIndex", "(I)V", "", "Lcom/yandex/div/evaluable/internal/Token;", "tokens", "Ljava/util/List;", "getTokens", "()Ljava/util/List;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class TokenizationState {
        private int index;

        @NotNull
        private final char[] source;

        @NotNull
        private final List<Token> tokens;

        public TokenizationState(@NotNull char[] source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.tokens = new ArrayList();
        }

        public static /* synthetic */ int forward$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.forward(i10);
        }

        public static /* synthetic */ char nextChar$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.nextChar(i10);
        }

        public static /* synthetic */ char prevChar$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.prevChar(i10);
        }

        public final char charAt(int position) {
            if (position < 0) {
                return (char) 0;
            }
            char[] cArr = this.source;
            if (position < cArr.length) {
                return cArr[position];
            }
            return (char) 0;
        }

        public final char currentChar() {
            int i10 = this.index;
            char[] cArr = this.source;
            if (i10 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i10];
        }

        public final boolean currentCharIsEscaped() {
            int i10 = this.index;
            if (i10 >= this.source.length) {
                return false;
            }
            int i11 = 0;
            for (int i12 = i10 - 1; i12 > 0 && this.source[i12] == '\\'; i12--) {
                i11++;
            }
            return i11 % 2 == 1;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(TokenizationState.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Tokenizer.TokenizationState");
            return Arrays.equals(this.source, ((TokenizationState) other).source);
        }

        public final int forward(int count) {
            int i10 = this.index;
            this.index = count + i10;
            return i10;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final List<Token> getTokens() {
            return this.tokens;
        }

        public int hashCode() {
            return Arrays.hashCode(this.source);
        }

        public final char nextChar(int step) {
            int i10 = this.index;
            int i11 = i10 + step;
            char[] cArr = this.source;
            if (i11 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i10 + step];
        }

        @NotNull
        public final String part(int from, int to) {
            return StringsKt.C(this.source, from, to);
        }

        public final char prevChar(int step) {
            int i10 = this.index;
            if (i10 - step >= 0) {
                return this.source[i10 - step];
            }
            return (char) 0;
        }

        @NotNull
        public String toString() {
            return "TokenizationState(source=" + Arrays.toString(this.source) + ')';
        }
    }

    private Tokenizer() {
    }

    private final EvaluableException invalidToken(TokenizationState state) {
        return new EvaluableException("Invalid token '" + state.currentChar() + "' at position " + state.getIndex(), null, 2, null);
    }

    private final boolean isAlphabetic(char c10) {
        if ('a' > c10 || c10 >= '{') {
            return ('A' <= c10 && c10 < '[') || c10 == '_';
        }
        return true;
    }

    private final boolean isAtEnd(char c10) {
        return c10 == 0;
    }

    private final boolean isAtEndOfExpression(char c10) {
        return c10 == '}';
    }

    private final boolean isAtEndOfString(TokenizationState state, boolean isLiteral) {
        if (isAtEnd(state.currentChar()) || isStartOfExpression(state.currentChar(), state)) {
            return true;
        }
        return isLiteral && isAtEndOfStringLiteral(state.currentChar(), state);
    }

    private final boolean isAtEndOfStringLiteral(char c10, TokenizationState tokenizationState) {
        return c10 == '\'' && !tokenizationState.currentCharIsEscaped();
    }

    private final boolean isDecimal(char c10, char c11, char c12) {
        if (!Character.isDigit(c10)) {
            if (!(c10 == '.' ? Character.isDigit(c12) : !(c10 == 'e' || c10 == 'E') ? !((c10 == '+' || c10 == '-') && ((c11 == 'e' || c11 == 'E') && Character.isDigit(c12))) : !(Character.isDigit(c11) && (Character.isDigit(c12) || c12 == '+' || c12 == '-')))) {
                return false;
            }
        }
        return true;
    }

    private final boolean isDot(char c10) {
        return c10 == '.';
    }

    private final boolean isNumber(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    private final boolean isOperator(List<? extends Token> tokens) {
        if (tokens.isEmpty() || (CollectionsKt.last((List) tokens) instanceof Token.Operator.Unary)) {
            return false;
        }
        return (CollectionsKt.last((List) tokens) instanceof Token.Operand) || (CollectionsKt.last((List) tokens) instanceof Token$Bracket$RightRound);
    }

    private final boolean isStartOfExpression(char c10, TokenizationState tokenizationState) {
        return c10 == '@' && TokenizationState.prevChar$default(tokenizationState, 0, 1, null) != '\\' && TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '{';
    }

    private final boolean isUnaryOperator(List<? extends Token> tokens) {
        return (isOperator(tokens) || (CollectionsKt.lastOrNull((List) tokens) instanceof Token.Operator.Unary)) ? false : true;
    }

    private final boolean isValidIdentifier(char c10) {
        return isAlphabetic(c10) || isNumber(c10);
    }

    private final boolean isWhiteSpace(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n';
    }

    private final boolean processExpression(TokenizationState state, List<Token> tokens) {
        Token token;
        Token token2;
        if (!isStartOfExpression(state.currentChar(), state)) {
            return false;
        }
        state.forward(2);
        while (!isAtEnd(state.currentChar()) && state.currentChar() != '}') {
            char cCurrentChar = state.currentChar();
            if (cCurrentChar == '?') {
                tokens.add(Token.Operator.TernaryIf.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == ':') {
                tokens.add(Token.Operator.TernaryElse.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == '+') {
                if (isUnaryOperator(tokens)) {
                    token = Token.Operator.Unary.Plus.INSTANCE;
                } else {
                    if (!isOperator(tokens)) {
                        throw invalidToken(state);
                    }
                    token = Token.Operator.Binary.Sum.Plus.INSTANCE;
                }
                tokens.add(token);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == '-') {
                if (isUnaryOperator(tokens)) {
                    token2 = Token.Operator.Unary.Minus.INSTANCE;
                } else {
                    if (!isOperator(tokens)) {
                        throw invalidToken(state);
                    }
                    token2 = Token.Operator.Binary.Sum.Minus.INSTANCE;
                }
                tokens.add(token2);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == '*') {
                tokens.add(Token.Operator.Binary.Factor.Multiplication.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == '/') {
                tokens.add(Token.Operator.Binary.Factor.Division.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == '%') {
                tokens.add(Token.Operator.Binary.Factor.Modulo.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == '!') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '=') {
                    tokens.add(Token.Operator.Binary.Equality.NotEqual.INSTANCE);
                    state.forward(2);
                } else if (TokenizationState.nextChar$default(state, 0, 1, null) == ':') {
                    tokens.add(Token.Operator.Try.INSTANCE);
                    state.forward(2);
                } else {
                    if (!isUnaryOperator(tokens)) {
                        throw invalidToken(state);
                    }
                    tokens.add(Token.Operator.Unary.Not.INSTANCE);
                    TokenizationState.forward$default(state, 0, 1, null);
                }
            } else if (cCurrentChar == '&') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) != '&') {
                    throw invalidToken(state);
                }
                tokens.add(Token.Operator.Binary.Logical.And.INSTANCE);
                state.forward(2);
            } else if (cCurrentChar == '|') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) != '|') {
                    throw invalidToken(state);
                }
                tokens.add(Token.Operator.Binary.Logical.Or.INSTANCE);
                state.forward(2);
            } else if (cCurrentChar == '<') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '=') {
                    tokens.add(Token.Operator.Binary.Comparison.LessOrEqual.INSTANCE);
                    state.forward(2);
                } else {
                    tokens.add(Token.Operator.Binary.Comparison.Less.INSTANCE);
                    TokenizationState.forward$default(state, 0, 1, null);
                }
            } else if (cCurrentChar == '>') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '=') {
                    tokens.add(Token.Operator.Binary.Comparison.GreaterOrEqual.INSTANCE);
                    state.forward(2);
                } else {
                    tokens.add(Token.Operator.Binary.Comparison.Greater.INSTANCE);
                    TokenizationState.forward$default(state, 0, 1, null);
                }
            } else if (cCurrentChar == '=') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) != '=') {
                    throw invalidToken(state);
                }
                tokens.add(Token.Operator.Binary.Equality.Equal.INSTANCE);
                state.forward(2);
            } else if (cCurrentChar == '(') {
                tokens.add(Token$Bracket$LeftRound.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == ')') {
                tokens.add(Token$Bracket$RightRound.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == ',') {
                tokens.add(Token.Function.ArgumentDelimiter.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (cCurrentChar == '\'') {
                processStringTemplate$default(this, state, tokens, false, 4, null);
            } else {
                TokenizationState tokenizationState = state;
                List<Token> list = tokens;
                if (isWhiteSpace(tokenizationState.currentChar())) {
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                } else if (isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
                    processNumber(tokenizationState, list);
                } else if (isAlphabetic(tokenizationState.currentChar())) {
                    processIdentifier(tokenizationState, list);
                } else {
                    if (!isDot(tokenizationState.currentChar())) {
                        throw invalidToken(tokenizationState);
                    }
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                    list.add(Token.Operator.Dot.INSTANCE);
                }
                state = tokenizationState;
                tokens = list;
            }
        }
        TokenizationState tokenizationState2 = state;
        if (isAtEndOfExpression(tokenizationState2.currentChar())) {
            TokenizationState.forward$default(tokenizationState2, 0, 1, null);
            return true;
        }
        throw new TokenizingException("'}' expected at end of expression at " + tokenizationState2.getIndex(), null, 2, null);
    }

    private final void processIdentifier(TokenizationState state, List<Token> tokens) {
        Token.Function function;
        int index = state.getIndex();
        Integer num = null;
        while (true) {
            int index2 = state.getIndex();
            while (isValidIdentifier(state.currentChar())) {
                TokenizationState.forward$default(state, 0, 1, null);
            }
            if (isDot(state.currentChar())) {
                int index3 = state.getIndex() + 1;
                Integer numValueOf = Integer.valueOf(index3);
                TokenizationState.forward$default(state, 0, 1, null);
                if (index3 - index2 <= 1) {
                    throw new EvaluableException("Unexpected token: .", null, 2, null);
                }
                num = numValueOf;
            }
            if (!isValidIdentifier(state.currentChar()) && !isDot(state.currentChar())) {
                int index4 = state.getIndex();
                while (isWhiteSpace(state.currentChar())) {
                    TokenizationState.forward$default(state, 0, 1, null);
                }
                if (state.currentChar() == '(') {
                    function = new Token.Function(state.part(num != null ? num.intValue() : index, index4));
                    if (num == null) {
                        tokens.add(function);
                        return;
                    }
                    index4 = num.intValue() - 1;
                } else {
                    function = null;
                }
                String strPart = state.part(index, index4);
                Tokenizer tokenizer = INSTANCE;
                if (!tokenizer.processKeyword(strPart, tokens)) {
                    if (tokenizer.isDot(state.charAt(index4 - 1))) {
                        throw new EvaluableException("Unexpected token: .", null, 2, null);
                    }
                    tokens.add(Token.Operand.Variable.m7649boximpl(Token.Operand.Variable.m7650constructorimpl(strPart)));
                }
                if (function != null) {
                    tokens.add(Token.Operator.Dot.INSTANCE);
                    tokens.add(function);
                    return;
                }
                return;
            }
        }
    }

    private final boolean processKeyword(String identifier, List<Token> tokens) {
        Token.Operand.Literal.Bool boolM7631boximpl = Intrinsics.areEqual(identifier, "true") ? Token.Operand.Literal.Bool.m7631boximpl(Token.Operand.Literal.Bool.m7632constructorimpl(true)) : Intrinsics.areEqual(identifier, "false") ? Token.Operand.Literal.Bool.m7631boximpl(Token.Operand.Literal.Bool.m7632constructorimpl(false)) : null;
        if (boolM7631boximpl == null) {
            return false;
        }
        tokens.add(boolM7631boximpl);
        return true;
    }

    private final void processNumber(TokenizationState state, List<Token> tokens) {
        String strPart;
        String strPart2;
        int index = state.getIndex();
        boolean z10 = CollectionsKt.lastOrNull((List) tokens) instanceof Token.Operator.Unary.Minus;
        if (z10) {
            CollectionsKt.removeLastOrNull(tokens);
        }
        do {
            TokenizationState.forward$default(state, 0, 1, null);
        } while (Character.isDigit(state.currentChar()));
        if (state.charAt(index) != '.' && !isDecimal(state.currentChar(), TokenizationState.prevChar$default(state, 0, 1, null), TokenizationState.nextChar$default(state, 0, 1, null))) {
            if (z10) {
                strPart2 = '-' + state.part(index, state.getIndex());
            } else {
                strPart2 = state.part(index, state.getIndex());
            }
            try {
                tokens.add(Token.Operand.Literal.Num.m7637boximpl(Token.Operand.Literal.Num.m7638constructorimpl(Long.valueOf(Long.parseLong(strPart2)))));
                return;
            } catch (Exception unused) {
                throw new EvaluableException("Value " + strPart2 + " can't be converted to Integer type.", null, 2, null);
            }
        }
        while (isDecimal(state.currentChar(), TokenizationState.prevChar$default(state, 0, 1, null), TokenizationState.nextChar$default(state, 0, 1, null))) {
            TokenizationState.forward$default(state, 0, 1, null);
        }
        if (z10) {
            strPart = '-' + state.part(index, state.getIndex());
        } else {
            strPart = state.part(index, state.getIndex());
        }
        try {
            tokens.add(Token.Operand.Literal.Num.m7637boximpl(Token.Operand.Literal.Num.m7638constructorimpl(Double.valueOf(Double.parseDouble(strPart)))));
        } catch (Exception unused2) {
            throw new EvaluableException("Value " + strPart + " can't be converted to Number type.", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: processString-wB-4SYI, reason: not valid java name */
    private final String m7656processStringwB4SYI(TokenizationState state, boolean isLiteral) {
        int index = state.getIndex();
        while (!isAtEndOfString(state, isLiteral)) {
            TokenizationState.forward$default(state, 0, 1, null);
        }
        String strProcess$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, state.part(index, state.getIndex()), null, 2, null);
        if (strProcess$default.length() > 0) {
            return Token.Operand.Literal.Str.m7644constructorimpl(strProcess$default);
        }
        return null;
    }

    private final void processStringTemplate(TokenizationState state, List<Token> tokens, boolean isPartOfExpression) {
        if (isPartOfExpression) {
            TokenizationState.forward$default(state, 0, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        String strM7656processStringwB4SYI = m7656processStringwB4SYI(state, isPartOfExpression);
        if (isAtEnd(state.currentChar())) {
            if (isPartOfExpression) {
                throw new TokenizingException("''' expected at end of string literal at " + state.getIndex(), null, 2, null);
            }
            if (strM7656processStringwB4SYI != null) {
                tokens.add(Token.Operand.Literal.Str.m7643boximpl(strM7656processStringwB4SYI));
                return;
            }
            return;
        }
        if (isAtEndOfStringLiteral(state.currentChar(), state)) {
            if (strM7656processStringwB4SYI == null) {
                strM7656processStringwB4SYI = Token.Operand.Literal.Str.m7644constructorimpl("");
            }
            tokens.add(Token.Operand.Literal.Str.m7643boximpl(strM7656processStringwB4SYI));
            TokenizationState.forward$default(state, 0, 1, null);
            return;
        }
        if (strM7656processStringwB4SYI != null && isStartOfExpression(state.currentChar(), state)) {
            arrayList.add(Token$StringTemplate$Start.INSTANCE);
            arrayList.add(Token.Operand.Literal.Str.m7643boximpl(strM7656processStringwB4SYI));
        }
        while (isStartOfExpression(state.currentChar(), state)) {
            ArrayList arrayList2 = new ArrayList();
            processExpression(state, arrayList2);
            String strM7656processStringwB4SYI2 = m7656processStringwB4SYI(state, isPartOfExpression);
            if (!isPartOfExpression && arrayList.isEmpty() && strM7656processStringwB4SYI2 == null && !isStartOfExpression(state.currentChar(), state)) {
                tokens.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(Token$StringTemplate$Start.INSTANCE);
            }
            arrayList.add(Token$StringTemplate$StartOfExpression.INSTANCE);
            arrayList.addAll(arrayList2);
            arrayList.add(Token$StringTemplate$EndOfExpression.INSTANCE);
            if (strM7656processStringwB4SYI2 != null) {
                arrayList.add(Token.Operand.Literal.Str.m7643boximpl(strM7656processStringwB4SYI2));
            }
        }
        if (isPartOfExpression && !isAtEndOfStringLiteral(state.currentChar(), state)) {
            throw new TokenizingException("''' expected at end of string literal at " + state.getIndex(), null, 2, null);
        }
        if (!arrayList.isEmpty()) {
            tokens.addAll(arrayList);
            tokens.add(Token$StringTemplate$End.INSTANCE);
        }
        if (isPartOfExpression) {
            TokenizationState.forward$default(state, 0, 1, null);
        }
    }

    static /* synthetic */ void processStringTemplate$default(Tokenizer tokenizer, TokenizationState tokenizationState, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        tokenizer.processStringTemplate(tokenizationState, list, z10);
    }

    @NotNull
    public final List<Token> tokenize(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        char[] charArray = input.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        return tokenize(charArray);
    }

    private final List<Token> tokenize(char[] input) {
        TokenizationState tokenizationState = new TokenizationState(input);
        try {
            processStringTemplate(tokenizationState, tokenizationState.getTokens(), false);
            return tokenizationState.getTokens();
        } catch (EvaluableException e10) {
            if (!(e10 instanceof TokenizingException)) {
                throw e10;
            }
            throw new EvaluableException("Error tokenizing '" + StringsKt.B(input) + "'.", e10);
        }
    }
}
