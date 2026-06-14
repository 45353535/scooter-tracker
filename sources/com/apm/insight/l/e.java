package com.apm.insight.l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends PrintWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f7954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Charset f7955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f7956c;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(@NonNull OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f7955b = null;
        this.f7954a = messageDigest;
        this.f7956c = aVar;
        if (messageDigest != null) {
            this.f7955b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f7954a;
        if (messageDigest != null) {
            messageDigest.update(this.f7955b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f7954a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f7954a != null) {
            a aVar = this.f7956c;
            if (aVar == null || aVar.a(str)) {
                this.f7954a.update(this.f7955b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }
}
