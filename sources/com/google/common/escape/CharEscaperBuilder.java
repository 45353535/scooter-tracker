package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class CharEscaperBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30503b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30502a = new HashMap();

    private static class CharArrayDecorator extends CharEscaper {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[][] f30504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30505c;

        CharArrayDecorator(char[][] cArr) {
            this.f30504b = cArr;
            this.f30505c = cArr.length;
        }

        @Override // com.google.common.escape.CharEscaper
        protected char[] a(char c10) {
            if (c10 < this.f30505c) {
                return this.f30504b[c10];
            }
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                char[][] cArr = this.f30504b;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return b(str, i10);
                }
            }
            return str;
        }
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscape(char c10, String str) {
        this.f30502a.put(Character.valueOf(c10), (String) Preconditions.checkNotNull(str));
        if (c10 > this.f30503b) {
            this.f30503b = c10;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscapes(char[] cArr, String str) {
        Preconditions.checkNotNull(str);
        for (char c10 : cArr) {
            addEscape(c10, str);
        }
        return this;
    }

    public char[][] toArray() {
        char[][] cArr = new char[this.f30503b + 1][];
        for (Map.Entry entry : this.f30502a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
        return cArr;
    }

    public Escaper toEscaper() {
        return new CharArrayDecorator(toArray());
    }
}
