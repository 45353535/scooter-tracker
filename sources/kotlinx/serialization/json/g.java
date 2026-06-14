package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f93693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f93694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f93695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f93696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f93697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f93698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f93699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f93700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f93701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f93702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f93703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f93704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f93705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f93706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f93707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f93708p;

    public g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, a classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f93693a = z10;
        this.f93694b = z11;
        this.f93695c = z12;
        this.f93696d = z13;
        this.f93697e = z14;
        this.f93698f = z15;
        this.f93699g = prettyPrintIndent;
        this.f93700h = z16;
        this.f93701i = z17;
        this.f93702j = classDiscriminator;
        this.f93703k = z18;
        this.f93704l = z19;
        this.f93705m = z20;
        this.f93706n = z21;
        this.f93707o = z22;
        this.f93708p = classDiscriminatorMode;
    }

    public final boolean a() {
        return this.f93707o;
    }

    public final boolean b() {
        return this.f93703k;
    }

    public final boolean c() {
        return this.f93696d;
    }

    public final boolean d() {
        return this.f93706n;
    }

    public final String e() {
        return this.f93702j;
    }

    public final a f() {
        return this.f93708p;
    }

    public final boolean g() {
        return this.f93700h;
    }

    public final boolean h() {
        return this.f93705m;
    }

    public final boolean i() {
        return this.f93693a;
    }

    public final boolean j() {
        return this.f93698f;
    }

    public final boolean k() {
        return this.f93694b;
    }

    public final z l() {
        return null;
    }

    public final boolean m() {
        return this.f93697e;
    }

    public final String n() {
        return this.f93699g;
    }

    public final boolean o() {
        return this.f93704l;
    }

    public final boolean p() {
        return this.f93701i;
    }

    public final boolean q() {
        return this.f93695c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f93693a + ", ignoreUnknownKeys=" + this.f93694b + ", isLenient=" + this.f93695c + ", allowStructuredMapKeys=" + this.f93696d + ", prettyPrint=" + this.f93697e + ", explicitNulls=" + this.f93698f + ", prettyPrintIndent='" + this.f93699g + "', coerceInputValues=" + this.f93700h + ", useArrayPolymorphism=" + this.f93701i + ", classDiscriminator='" + this.f93702j + "', allowSpecialFloatingPointValues=" + this.f93703k + ", useAlternativeNames=" + this.f93704l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f93705m + ", allowTrailingComma=" + this.f93706n + ", allowComments=" + this.f93707o + ", classDiscriminatorMode=" + this.f93708p + ')';
    }

    public /* synthetic */ g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : zVar, (i10 & 8192) != 0 ? false : z20, (i10 & 16384) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & 65536) != 0 ? a.f93653d : aVar);
    }
}
