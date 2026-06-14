package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CoderResult f84521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f84522b;

    public final int a(char c10, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c10)) {
            if (!charBuffer.hasRemaining()) {
                this.f84521a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c11 = charBuffer.get();
            if (Character.isLowSurrogate(c11)) {
                int codePoint = Character.toCodePoint(c10, c11);
                this.f84522b = true;
                this.f84521a = null;
                return codePoint;
            }
            this.f84521a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c10)) {
            this.f84521a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.f84522b = false;
        this.f84521a = null;
        return c10;
    }

    public final int b(char c10, char[] cArr, int i10, int i11) {
        if (!Character.isHighSurrogate(c10)) {
            if (Character.isLowSurrogate(c10)) {
                this.f84521a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f84522b = false;
            this.f84521a = null;
            return c10;
        }
        if (i11 - i10 < 2) {
            this.f84521a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c11 = cArr[i10 + 1];
        if (Character.isLowSurrogate(c11)) {
            int codePoint = Character.toCodePoint(c10, c11);
            this.f84522b = true;
            this.f84521a = null;
            return codePoint;
        }
        this.f84521a = CoderResult.malformedForLength(1);
        return -1;
    }
}
