package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Escapers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Escaper f30507a = new CharEscaper() { // from class: com.google.common.escape.Escapers.1
        @Override // com.google.common.escape.CharEscaper
        protected char[] a(char c10) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            return (String) Preconditions.checkNotNull(str);
        }
    };

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f30508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private char f30509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private char f30510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f30511d;

        @CanIgnoreReturnValue
        public Builder addEscape(char c10, String str) {
            Preconditions.checkNotNull(str);
            this.f30508a.put(Character.valueOf(c10), str);
            return this;
        }

        public Escaper build() {
            return new ArrayBasedCharEscaper(this.f30508a, this.f30509b, this.f30510c) { // from class: com.google.common.escape.Escapers.Builder.1

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private final char[] f30512f;

                {
                    this.f30512f = Builder.this.f30511d != null ? Builder.this.f30511d.toCharArray() : null;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                protected char[] d(char c10) {
                    return this.f30512f;
                }
            };
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c10, char c11) {
            this.f30509b = c10;
            this.f30510c = c11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
            this.f30511d = str;
            return this;
        }

        private Builder() {
            this.f30508a = new HashMap();
            this.f30509b = (char) 0;
            this.f30510c = (char) 65535;
            this.f30511d = null;
        }
    }

    private static String a(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static String computeReplacement(CharEscaper charEscaper, char c10) {
        return a(charEscaper.a(c10));
    }

    public static Escaper nullEscaper() {
        return f30507a;
    }

    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i10) {
        return a(unicodeEscaper.b(i10));
    }
}
