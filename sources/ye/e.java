package ye;

import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ve.c0;
import ve.g;
import ve.h;
import ye.c;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f118926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f118927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f118928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f118929d;

    public /* synthetic */ e(String str, g gVar, c0 c0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, gVar, (i10 & 4) != 0 ? null : c0Var);
    }

    @Override // ye.c
    public Long a() {
        return Long.valueOf(this.f118929d.length);
    }

    @Override // ye.c
    public g b() {
        return this.f118927b;
    }

    @Override // ye.c.a
    public byte[] d() {
        return this.f118929d;
    }

    public String toString() {
        return "TextContent[" + b() + "] \"" + StringsKt.J1(this.f118926a, 30) + '\"';
    }

    public e(String text, g contentType, c0 c0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f118926a = text;
        this.f118927b = contentType;
        this.f118928c = c0Var;
        Charset charsetA = h.a(b());
        this.f118929d = hf.g.d(text, charsetA == null ? Charsets.UTF_8 : charsetA);
    }
}
