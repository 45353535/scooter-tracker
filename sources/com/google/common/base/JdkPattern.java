package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class JdkPattern extends CommonPattern implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f28895b;

    private static final class JdkMatcher extends CommonMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matcher f28896a;

        JdkMatcher(Matcher matcher) {
            this.f28896a = (Matcher) Preconditions.checkNotNull(matcher);
        }

        @Override // com.google.common.base.CommonMatcher
        public int end() {
            return this.f28896a.end();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find() {
            return this.f28896a.find();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean matches() {
            return this.f28896a.matches();
        }

        @Override // com.google.common.base.CommonMatcher
        public String replaceAll(String str) {
            return this.f28896a.replaceAll(str);
        }

        @Override // com.google.common.base.CommonMatcher
        public int start() {
            return this.f28896a.start();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find(int i10) {
            return this.f28896a.find(i10);
        }
    }

    JdkPattern(Pattern pattern) {
        this.f28895b = (Pattern) Preconditions.checkNotNull(pattern);
    }

    @Override // com.google.common.base.CommonPattern
    public int flags() {
        return this.f28895b.flags();
    }

    @Override // com.google.common.base.CommonPattern
    public CommonMatcher matcher(CharSequence charSequence) {
        return new JdkMatcher(this.f28895b.matcher(charSequence));
    }

    @Override // com.google.common.base.CommonPattern
    public String pattern() {
        return this.f28895b.pattern();
    }

    @Override // com.google.common.base.CommonPattern
    public String toString() {
        return this.f28895b.toString();
    }
}
