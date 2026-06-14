package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class LineReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Readable f30940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f30941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharBuffer f30942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f30943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Queue f30944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LineBuffer f30945f;

    public LineReader(Readable readable) {
        CharBuffer charBufferC = CharStreams.c();
        this.f30942c = charBufferC;
        this.f30943d = charBufferC.array();
        this.f30944e = new ArrayDeque();
        this.f30945f = new LineBuffer() { // from class: com.google.common.io.LineReader.1
            @Override // com.google.common.io.LineBuffer
            protected void d(String str, String str2) {
                LineReader.this.f30944e.add(str);
            }
        };
        this.f30940a = (Readable) Preconditions.checkNotNull(readable);
        this.f30941b = readable instanceof Reader ? (Reader) readable : null;
    }

    @CanIgnoreReturnValue
    public String readLine() throws IOException {
        int i10;
        while (true) {
            if (this.f30944e.peek() != null) {
                break;
            }
            Java8Compatibility.a(this.f30942c);
            Reader reader = this.f30941b;
            if (reader != null) {
                char[] cArr = this.f30943d;
                i10 = reader.read(cArr, 0, cArr.length);
            } else {
                i10 = this.f30940a.read(this.f30942c);
            }
            if (i10 == -1) {
                this.f30945f.b();
                break;
            }
            this.f30945f.a(this.f30943d, 0, i10);
        }
        return (String) this.f30944e.poll();
    }
}
