package com.yandex.div.internal;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0002\u000e\u000fB!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/internal/ComparisonFailure;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "", PglCryptUtils.KEY_MESSAGE, "expected", "actual", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getExpected", "()Ljava/lang/String;", "getActual", "getMessage", y.f66058y, "ComparisonCompactor", "assertion_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComparisonFailure extends AssertionError {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actual;

    @NotNull
    private final String expected;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/ComparisonFailure$Companion;", "", "()V", "MAX_CONTEXT_LENGTH", "", "serialVersionUID", "", "assertion_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/internal/ComparisonFailure$ComparisonCompactor;", "", "contextLength", "", "expected", "", "actual", "(ILjava/lang/String;Ljava/lang/String;)V", "prefix", "suffix", "areStringsEqual", "", "compact", PglCryptUtils.KEY_MESSAGE, "compactString", "source", "computeCommonPrefix", "computeCommonSuffix", "findCommonPrefix", "", "findCommonSuffix", y.f66058y, "assertion_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ComparisonCompactor {

        @Nullable
        private final String actual;
        private final int contextLength;

        @Nullable
        private final String expected;
        private int prefix;
        private int suffix;

        public ComparisonCompactor(int i10, @Nullable String str, @Nullable String str2) {
            this.contextLength = i10;
            this.expected = str;
            this.actual = str2;
        }

        private final boolean areStringsEqual() {
            return Intrinsics.areEqual(this.expected, this.actual);
        }

        private final String compactString(String source) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            String strSubstring = source.substring(this.prefix, (source.length() - this.suffix) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(']');
            String string = sb2.toString();
            if (this.prefix > 0) {
                string = computeCommonPrefix() + string;
            }
            if (this.suffix <= 0) {
                return string;
            }
            return string + computeCommonSuffix();
        }

        private final String computeCommonPrefix() {
            String str = this.prefix > this.contextLength ? APSSharedUtil.TRUNCATE_SEPARATOR : "";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str2 = this.expected;
            Intrinsics.checkNotNull(str2);
            String strSubstring = str2.substring(Math.max(0, this.prefix - this.contextLength), this.prefix);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            return sb2.toString();
        }

        private final String computeCommonSuffix() {
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int iMin = Math.min((str.length() - this.suffix) + 1 + this.contextLength, this.expected.length());
            String str2 = (this.expected.length() - this.suffix) + 1 < this.expected.length() - this.contextLength ? APSSharedUtil.TRUNCATE_SEPARATOR : "";
            StringBuilder sb2 = new StringBuilder();
            String str3 = this.expected;
            String strSubstring = str3.substring((str3.length() - this.suffix) + 1, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(str2);
            return sb2.toString();
        }

        private final void findCommonPrefix() {
            this.prefix = 0;
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int length = str.length();
            String str2 = this.actual;
            Intrinsics.checkNotNull(str2);
            int iMin = Math.min(length, str2.length());
            while (true) {
                int i10 = this.prefix;
                if (i10 >= iMin || this.expected.charAt(i10) != this.actual.charAt(this.prefix)) {
                    return;
                } else {
                    this.prefix++;
                }
            }
        }

        private final void findCommonSuffix() {
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int length = str.length() - 1;
            String str2 = this.actual;
            Intrinsics.checkNotNull(str2);
            int length2 = str2.length() - 1;
            while (true) {
                int i10 = this.prefix;
                if (length2 < i10 || length < i10 || this.expected.charAt(length) != this.actual.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.suffix = this.expected.length() - length;
        }

        @NotNull
        public final String compact(@Nullable String message) {
            if (this.expected == null || this.actual == null || areStringsEqual()) {
                return Assert.format(message, this.expected, this.actual);
            }
            findCommonPrefix();
            findCommonSuffix();
            return Assert.format(message, compactString(this.expected), compactString(this.actual));
        }
    }

    public ComparisonFailure(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        super(str);
        this.expected = str2;
        this.actual = str3;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return new ComparisonCompactor(20, this.expected, this.actual).compact(super.getMessage());
    }
}
