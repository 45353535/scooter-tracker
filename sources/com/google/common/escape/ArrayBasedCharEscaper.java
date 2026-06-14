package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends CharEscaper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[][] f30490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char f30492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final char f30493e;

    protected ArrayBasedCharEscaper(Map map, char c10, char c11) {
        this(ArrayBasedEscaperMap.create(map), c10, c11);
    }

    @Override // com.google.common.escape.CharEscaper
    protected final char[] a(char c10) {
        char[] cArr;
        if (c10 < this.f30491c && (cArr = this.f30490b[c10]) != null) {
            return cArr;
        }
        if (c10 < this.f30492d || c10 > this.f30493e) {
            return d(c10);
        }
        return null;
    }

    protected abstract char[] d(char c10);

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < this.f30491c && this.f30490b[cCharAt] != null) || cCharAt > this.f30493e || cCharAt < this.f30492d) {
                return b(str, i10);
            }
        }
        return str;
    }

    protected ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c10, char c11) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] cArrB = arrayBasedEscaperMap.b();
        this.f30490b = cArrB;
        this.f30491c = cArrB.length;
        if (c11 < c10) {
            c11 = 0;
            c10 = 65535;
        }
        this.f30492d = c10;
        this.f30493e = c11;
    }
}
