package com.yandex.div.evaluable.internal;

import androidx.webkit.ProxyConfig;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCaseKt;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\b\u0005\u0006\u0007\b\t\n\u000b\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token;", "", "Function", "Operand", "Operator", "Lcom/yandex/div/evaluable/internal/Token$Function;", "Lcom/yandex/div/evaluable/internal/Token$Function$ArgumentDelimiter;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$End;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$EndOfExpression;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$Start;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$StartOfExpression;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Token {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Function;", "Lcom/yandex/div/evaluable/internal/Token;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "ArgumentDelimiter", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Function implements Token {

        @NotNull
        private final String name;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Function$ArgumentDelimiter;", "Lcom/yandex/div/evaluable/internal/Token;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ArgumentDelimiter implements Token {

            @NotNull
            public static final ArgumentDelimiter INSTANCE = new ArgumentDelimiter();

            private ArgumentDelimiter() {
            }

            @NotNull
            public String toString() {
                return StringUtils.COMMA;
            }
        }

        public Function(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Function) && Intrinsics.areEqual(this.name, ((Function) other).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Function(name=" + this.name + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand;", "Lcom/yandex/div/evaluable/internal/Token;", "Literal", "Variable", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Operand extends Token {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "Bool", "Num", "Str", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Bool;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Num;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Literal extends Operand {

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Bool;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "", "value", "constructor-impl", "(Z)Z", "", "toString-impl", "(Z)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Z)I", "hashCode", "", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "equals", "Z", "getValue", "()Z", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Bool implements Literal {
                private final boolean value;

                private /* synthetic */ Bool(boolean z10) {
                    this.value = z10;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Bool m7631boximpl(boolean z10) {
                    return new Bool(z10);
                }

                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static boolean m7632constructorimpl(boolean z10) {
                    return z10;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m7633equalsimpl(boolean z10, Object obj) {
                    return (obj instanceof Bool) && z10 == ((Bool) obj).getValue();
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m7634hashCodeimpl(boolean z10) {
                    if (z10) {
                        return 1;
                    }
                    return z10 ? 1 : 0;
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m7635toStringimpl(boolean z10) {
                    return "Bool(value=" + z10 + ')';
                }

                public boolean equals(Object obj) {
                    return m7633equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7634hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7635toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
                public final /* synthetic */ boolean getValue() {
                    return this.value;
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Num;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "", "value", "constructor-impl", "(Ljava/lang/Number;)Ljava/lang/Number;", "", "toString-impl", "(Ljava/lang/Number;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Number;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/Number;Ljava/lang/Object;)Z", "equals", "Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Num implements Literal {

                @NotNull
                private final Number value;

                private /* synthetic */ Num(Number number) {
                    this.value = number;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Num m7637boximpl(Number number) {
                    return new Num(number);
                }

                @NotNull
                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static Number m7638constructorimpl(@NotNull Number value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m7639equalsimpl(Number number, Object obj) {
                    return (obj instanceof Num) && Intrinsics.areEqual(number, ((Num) obj).getValue());
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m7640hashCodeimpl(Number number) {
                    return number.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m7641toStringimpl(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m7639equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7640hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7641toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
                public final /* synthetic */ Number getValue() {
                    return this.value;
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Str implements Literal {

                @NotNull
                private final String value;

                private /* synthetic */ Str(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Str m7643boximpl(String str) {
                    return new Str(str);
                }

                @NotNull
                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static String m7644constructorimpl(@NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m7645equalsimpl(String str, Object obj) {
                    return (obj instanceof Str) && Intrinsics.areEqual(str, ((Str) obj).getValue());
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m7646hashCodeimpl(String str) {
                    return str.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m7647toStringimpl(String str) {
                    return "Str(value=" + str + ')';
                }

                public boolean equals(Object obj) {
                    return m7645equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7646hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7647toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
                public final /* synthetic */ String getValue() {
                    return this.value;
                }
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "", "name", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Variable implements Operand {

            @NotNull
            private final String name;

            private /* synthetic */ Variable(String str) {
                this.name = str;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Variable m7649boximpl(String str) {
                return new Variable(str);
            }

            @NotNull
            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static String m7650constructorimpl(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return name;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m7651equalsimpl(String str, Object obj) {
                return (obj instanceof Variable) && Intrinsics.areEqual(str, ((Variable) obj).getName());
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m7652equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m7653hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m7654toStringimpl(String str) {
                return "Variable(name=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m7651equalsimpl(this.name, obj);
            }

            public int hashCode() {
                return m7653hashCodeimpl(this.name);
            }

            public String toString() {
                return m7654toStringimpl(this.name);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ String getName() {
                return this.name;
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/internal/Token;", "Binary", "Dot", "TernaryElse", "TernaryIf", "TernaryIfElse", "Try", "Unary", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Dot;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIf;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIfElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Operator extends Token {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Comparison", "Equality", "Factor", "Logical", "Power", "Sum", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Power;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Binary extends Operator {

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Greater", "GreaterOrEqual", "Less", "LessOrEqual", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Greater;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$GreaterOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Less;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$LessOrEqual;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Comparison extends Binary {

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Greater;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Greater implements Comparison {

                    @NotNull
                    public static final Greater INSTANCE = new Greater();

                    private Greater() {
                    }

                    @NotNull
                    public String toString() {
                        return ">";
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$GreaterOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class GreaterOrEqual implements Comparison {

                    @NotNull
                    public static final GreaterOrEqual INSTANCE = new GreaterOrEqual();

                    private GreaterOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return GetAdRequestUseCaseKt.DEFAULT_COMPARATOR;
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Less;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Less implements Comparison {

                    @NotNull
                    public static final Less INSTANCE = new Less();

                    private Less() {
                    }

                    @NotNull
                    public String toString() {
                        return "<";
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$LessOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class LessOrEqual implements Comparison {

                    @NotNull
                    public static final LessOrEqual INSTANCE = new LessOrEqual();

                    private LessOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "<=";
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Equal", "NotEqual", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$Equal;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$NotEqual;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Equality extends Binary {

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$Equal;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Equal implements Equality {

                    @NotNull
                    public static final Equal INSTANCE = new Equal();

                    private Equal() {
                    }

                    @NotNull
                    public String toString() {
                        return "==";
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$NotEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class NotEqual implements Equality {

                    @NotNull
                    public static final NotEqual INSTANCE = new NotEqual();

                    private NotEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "!=";
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Division", "Modulo", "Multiplication", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Division;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Modulo;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Multiplication;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Factor extends Binary {

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Division;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Division implements Factor {

                    @NotNull
                    public static final Division INSTANCE = new Division();

                    private Division() {
                    }

                    @NotNull
                    public String toString() {
                        return "/";
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Modulo;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Modulo implements Factor {

                    @NotNull
                    public static final Modulo INSTANCE = new Modulo();

                    private Modulo() {
                    }

                    @NotNull
                    public String toString() {
                        return "%";
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Multiplication;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Multiplication implements Factor {

                    @NotNull
                    public static final Multiplication INSTANCE = new Multiplication();

                    private Multiplication() {
                    }

                    @NotNull
                    public String toString() {
                        return ProxyConfig.MATCH_ALL_SCHEMES;
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "And", "Or", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$And;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$Or;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Logical extends Binary {

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$And;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class And implements Logical {

                    @NotNull
                    public static final And INSTANCE = new And();

                    private And() {
                    }

                    @NotNull
                    public String toString() {
                        return "&&";
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$Or;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Or implements Logical {

                    @NotNull
                    public static final Or INSTANCE = new Or();

                    private Or() {
                    }

                    @NotNull
                    public String toString() {
                        return "||";
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Power;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Power implements Binary {

                @NotNull
                public static final Power INSTANCE = new Power();

                private Power() {
                }

                @NotNull
                public String toString() {
                    return "^";
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Minus", "Plus", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Plus;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Sum extends Binary {

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Minus implements Sum {

                    @NotNull
                    public static final Minus INSTANCE = new Minus();

                    private Minus() {
                    }

                    @NotNull
                    public String toString() {
                        return TokenBuilder.TOKEN_DELIMITER;
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Plus implements Sum {

                    @NotNull
                    public static final Plus INSTANCE = new Plus();

                    private Plus() {
                    }

                    @NotNull
                    public String toString() {
                        return "+";
                    }
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Dot;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dot implements Operator {

            @NotNull
            public static final Dot INSTANCE = new Dot();

            private Dot() {
            }

            @NotNull
            public String toString() {
                return ".";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TernaryElse implements Operator {

            @NotNull
            public static final TernaryElse INSTANCE = new TernaryElse();

            private TernaryElse() {
            }

            @NotNull
            public String toString() {
                return StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIf;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TernaryIf implements Operator {

            @NotNull
            public static final TernaryIf INSTANCE = new TernaryIf();

            private TernaryIf() {
            }

            @NotNull
            public String toString() {
                return "?";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIfElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TernaryIfElse implements Operator {

            @NotNull
            public static final TernaryIfElse INSTANCE = new TernaryIfElse();

            private TernaryIfElse() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Try implements Operator {

            @NotNull
            public static final Try INSTANCE = new Try();

            private Try() {
            }

            @NotNull
            public String toString() {
                return "!:";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Minus", "Not", "Plus", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Not;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Plus;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Unary extends Operator {

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Minus implements Unary {

                @NotNull
                public static final Minus INSTANCE = new Minus();

                private Minus() {
                }

                @NotNull
                public String toString() {
                    return TokenBuilder.TOKEN_DELIMITER;
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Not;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Not implements Unary {

                @NotNull
                public static final Not INSTANCE = new Not();

                private Not() {
                }

                @NotNull
                public String toString() {
                    return "!";
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Plus implements Unary {

                @NotNull
                public static final Plus INSTANCE = new Plus();

                private Plus() {
                }

                @NotNull
                public String toString() {
                    return "+";
                }
            }
        }
    }
}
