package wh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.c0;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f108032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f108033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f108034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f108035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f108036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f108037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f108038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f108039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f108040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f108041j;

    public i(c0 canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, Long l10, long j13) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f108032a = canonicalPath;
        this.f108033b = z10;
        this.f108034c = comment;
        this.f108035d = j10;
        this.f108036e = j11;
        this.f108037f = j12;
        this.f108038g = i10;
        this.f108039h = l10;
        this.f108040i = j13;
        this.f108041j = new ArrayList();
    }

    public final c0 a() {
        return this.f108032a;
    }

    public final List b() {
        return this.f108041j;
    }

    public final long c() {
        return this.f108036e;
    }

    public final int d() {
        return this.f108038g;
    }

    public final Long e() {
        return this.f108039h;
    }

    public final long f() {
        return this.f108040i;
    }

    public final long g() {
        return this.f108037f;
    }

    public final boolean h() {
        return this.f108033b;
    }

    public /* synthetic */ i(c0 c0Var, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l10, (i11 & 256) != 0 ? -1L : j13);
    }
}
