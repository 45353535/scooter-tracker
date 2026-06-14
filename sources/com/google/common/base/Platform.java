package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class Platform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PatternCompiler f28918a = e();

    private static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public CommonPattern compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }

        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
            return true;
        }
    }

    static CommonPattern a(String str) {
        Preconditions.checkNotNull(str);
        return f28918a.compile(str);
    }

    static String b(String str) {
        if (i(str)) {
            return null;
        }
        return str;
    }

    static String c(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    static Optional d(Class cls, String str) {
        WeakReference weakReference = (WeakReference) Enums.a(cls).get(str);
        return weakReference == null ? Optional.absent() : Optional.fromNullable((Enum) cls.cast(weakReference.get()));
    }

    private static PatternCompiler e() {
        return new JdkPatternCompiler();
    }

    static String f(String str) {
        return str == null ? "" : str;
    }

    static boolean g() {
        return f28918a.isPcreLike();
    }

    static CharMatcher h(CharMatcher charMatcher) {
        return charMatcher.e();
    }

    static boolean i(String str) {
        return str == null || str.isEmpty();
    }
}
