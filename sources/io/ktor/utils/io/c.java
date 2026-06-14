package io.ktor.utils.io;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f82070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg.a f82071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f82072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f82073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pg.s f82074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f82075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pg.a f82076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f82077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f82078i;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82079r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82081t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82079r = obj;
            this.f82081t |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82082r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82084t;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82082r = obj;
            this.f82084t |= Integer.MIN_VALUE;
            return c.this.f(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.c$c, reason: collision with other inner class name */
    static final class C0989c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f82085r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f82086s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f82088u;

        C0989c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82086s = obj;
            this.f82088u |= Integer.MIN_VALUE;
            return c.this.g(false, this);
        }
    }

    public c(e channel, qg.a matchString, k writeChannel, long j10) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(matchString, "matchString");
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        this.f82070a = channel;
        this.f82071b = matchString;
        this.f82072c = writeChannel;
        this.f82073d = j10;
        if (matchString.f() <= 0) {
            throw new IllegalArgumentException("Empty match string not permitted for scanning");
        }
        this.f82074e = channel.g();
        this.f82075f = d();
        this.f82076g = new pg.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        if (io.ktor.utils.io.l.a(r1, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a9 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final int[] d() {
        int[] iArr = new int[this.f82071b.f()];
        int iF = this.f82071b.f();
        int i10 = 0;
        for (int i11 = 1; i11 < iF; i11++) {
            while (i10 > 0 && this.f82071b.d(i11) != this.f82071b.d(i10)) {
                i10 = iArr[i10 - 1];
            }
            if (this.f82071b.d(i11) == this.f82071b.d(i10)) {
                i10++;
            }
            iArr[i11] = i10;
        }
        return iArr;
    }

    private final void e(long j10) throws IOException {
        if (this.f82077h + j10 <= this.f82073d) {
            return;
        }
        throw new IOException("Limit of " + this.f82073d + " bytes exceeded while searching for \"" + h(this.f82071b) + '\"');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (io.ktor.utils.io.n.e(r12.f82072c, r13, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0043 -> B:27:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:22:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String h(qg.a aVar) {
        return StringsKt.W(qg.c.b(aVar), IOUtils.LINE_SEPARATOR_UNIX, "\\n", false, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r10.c(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if (r11 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[PHI: r10
  0x00bc: PHI (r10v2 boolean) = (r10v3 boolean), (r10v9 boolean) binds: [B:27:0x0072, B:22:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cf -> B:43:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r10, kotlin.coroutines.Continuation r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.g(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
