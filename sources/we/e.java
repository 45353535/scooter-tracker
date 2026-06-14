package we;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.ktor.utils.io.d0;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xe.j;
import xe.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f107926a = SetsKt.setOf((Object[]) new Character[]{Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), '?', '#', '@'});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f107927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final xe.c f107928c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f107929r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f107930s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f107931t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f107932u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f107933v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f107934w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f107933v = obj;
            this.f107934w |= Integer.MIN_VALUE;
            return e.g(null, null, null, this);
        }
    }

    static {
        d0.a aVar = d0.f82089b;
        f107927b = d0.j(aVar.b(), aVar.c());
        f107928c = xe.c.f108177b.c(CollectionsKt.listOf((Object[]) new String[]{"HTTP/1.0", "HTTP/1.1"}));
    }

    private static final Void a(CharSequence charSequence, char c10) {
        throw new h("Character with code " + (c10 & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    private static final boolean b(char c10) {
        return Intrinsics.compare((int) c10, 32) <= 0 || StringsKt.f0("\"(),/:;<=>?@[\\]{}", c10, false, 2, null);
    }

    private static final Void c(CharSequence charSequence, j jVar) {
        throw new h("No colon in HTTP header in " + charSequence.subSequence(jVar.b(), jVar.a()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    public static final int d(xe.d text, j range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int iA = range.a();
        for (int iB = range.b(); iB < iA; iB++) {
            char cCharAt = text.charAt(iB);
            if (cCharAt == ':' && iB != range.b()) {
                range.d(iB + 1);
                return iB;
            }
            if (b(cCharAt)) {
                e(text, iB, range.b(), cCharAt);
                throw new lf.g();
            }
        }
        c(text, range);
        throw new lf.g();
    }

    private static final Void e(xe.d dVar, int i10, int i11, char c10) {
        if (c10 == ':') {
            throw new h("Empty header names are not allowed as per RFC7230.");
        }
        if (i10 == i11) {
            throw new h("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        a(dVar, c10);
        throw new lf.g();
    }

    public static final void f(xe.d text, j range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int iB = range.b();
        int iA = range.a();
        int iA2 = k.a(text, iB, iA);
        if (iA2 >= iA) {
            range.d(iA);
            return;
        }
        int i10 = iA2;
        int i11 = i10;
        while (i10 < iA) {
            char cCharAt = text.charAt(i10);
            if (cCharAt != '\t') {
                if (cCharAt == '\n' || cCharAt == '\r') {
                    a(text, cCharAt);
                    throw new lf.g();
                }
                if (cCharAt != ' ') {
                    i11 = i10;
                }
            }
            i10++;
        }
        range.d(iA2);
        range.c(i11 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:23:0x006c, B:25:0x0074, B:29:0x007c, B:32:0x0090, B:33:0x00b0, B:34:0x00b7, B:35:0x00b8, B:37:0x00c4), top: B:47:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:23:0x006c, B:25:0x0074, B:29:0x007c, B:32:0x0090, B:33:0x00b0, B:34:0x00b7, B:35:0x00b8, B:37:0x00c4), top: B:47:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:47:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(io.ktor.utils.io.e r10, xe.d r11, xe.j r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we.e.g(io.ktor.utils.io.e, xe.d, xe.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object h(io.ktor.utils.io.e eVar, xe.d dVar, j jVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            jVar = new j(0, 0);
        }
        return g(eVar, dVar, jVar, continuation);
    }

    private static final void i(CharSequence charSequence) {
        if (StringsKt.m0(charSequence, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            throw new h("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Set set = f107926a;
            if (set.contains(Character.valueOf(cCharAt))) {
                throw new h("Host cannot contain any of the following symbols: " + set);
            }
        }
    }
}
