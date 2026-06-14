package kotlin.text;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 ,2\u00060\u0001j\u0002`\u0002:\u0002\u0019\u0015B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u001fJ%\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070&2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+¨\u0006-"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/k;", "option", "(Ljava/lang/String;Lkotlin/text/k;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "input", "", "g", "(Ljava/lang/CharSequence;)Z", "a", "", "startIndex", "Lkotlin/text/MatchResult;", "b", "(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;", "d", "(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "h", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "limit", "", "j", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "Ljava/util/regex/Pattern;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Pattern nativePattern;

    /* JADX INFO: renamed from: kotlin.text.Regex$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        private Companion() {
        }
    }

    private static final class b implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f93477d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f93478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f93479c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(String pattern, int i10) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.f93478b = pattern;
            this.f93479c = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f93478b, this.f93479c);
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ MatchResult c(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.b(charSequence, i10);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return new b(strPattern, this.nativePattern.flags());
    }

    public final boolean a(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final MatchResult b(CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return j.e(matcher, startIndex, input);
    }

    public final MatchResult d(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return j.f(matcher, input);
    }

    public final boolean g(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final String h(CharSequence input, Function1 transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iIntValue = 0;
        MatchResult matchResultC = c(this, input, 0, 2, null);
        if (matchResultC == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, matchResultC.d().getStart().intValue());
            sb2.append((CharSequence) transform.invoke(matchResultC));
            iIntValue = matchResultC.d().getEndInclusive().intValue() + 1;
            matchResultC = matchResultC.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultC != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String i(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List j(CharSequence input, int limit) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.T0(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return CollectionsKt.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(limit > 0 ? kotlin.ranges.g.j(limit, 10) : 10);
        int i10 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i10 >= 0 && arrayList.size() == i10) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern, k option) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, INSTANCE.b(option.g()));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
