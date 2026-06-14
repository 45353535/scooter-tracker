package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[][] f30496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char f30500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final char f30501g;

    @Override // com.google.common.escape.UnicodeEscaper
    protected final char[] b(int i10) {
        char[] cArr;
        if (i10 < this.f30497c && (cArr = this.f30496b[i10]) != null) {
            return cArr;
        }
        if (i10 < this.f30498d || i10 > this.f30499e) {
            return f(i10);
        }
        return null;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected final int e(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if ((cCharAt < this.f30497c && this.f30496b[cCharAt] != null) || cCharAt > this.f30501g || cCharAt < this.f30500f) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < this.f30497c && this.f30496b[cCharAt] != null) || cCharAt > this.f30501g || cCharAt < this.f30500f) {
                return c(str, i10);
            }
        }
        return str;
    }

    protected abstract char[] f(int i10);
}
