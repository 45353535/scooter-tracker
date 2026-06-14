package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f84436b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1 f84437a;

    public x(h1 h1Var) {
        this.f84437a = h1Var;
    }

    private v5 b(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f84436b));
        try {
            v5 v5Var = (v5) this.f84437a.c(stringReader, v5.class);
            stringReader.close();
            return v5Var;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private v6 c(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f84436b));
        try {
            v6 v6Var = (v6) this.f84437a.c(stringReader, v6.class);
            stringReader.close();
            return v6Var;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r11 = new io.sentry.u5(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        return r11;
     */
    @Override // io.sentry.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.u5 a(java.io.InputStream r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.x.a(java.io.InputStream):io.sentry.u5");
    }
}
