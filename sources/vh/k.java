package vh;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f106865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f106867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f106868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f106869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f106870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f106871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f106872h;

    public k(boolean z10, boolean z11, c0 c0Var, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f106865a = z10;
        this.f106866b = z11;
        this.f106867c = c0Var;
        this.f106868d = l10;
        this.f106869e = l11;
        this.f106870f = l12;
        this.f106871g = l13;
        this.f106872h = MapsKt.toMap(extras);
    }

    public static /* synthetic */ k b(k kVar, boolean z10, boolean z11, c0 c0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = kVar.f106865a;
        }
        if ((i10 & 2) != 0) {
            z11 = kVar.f106866b;
        }
        if ((i10 & 4) != 0) {
            c0Var = kVar.f106867c;
        }
        if ((i10 & 8) != 0) {
            l10 = kVar.f106868d;
        }
        if ((i10 & 16) != 0) {
            l11 = kVar.f106869e;
        }
        if ((i10 & 32) != 0) {
            l12 = kVar.f106870f;
        }
        if ((i10 & 64) != 0) {
            l13 = kVar.f106871g;
        }
        if ((i10 & 128) != 0) {
            map = kVar.f106872h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return kVar.a(z10, z11, c0Var, l10, l15, l16, l14, map2);
    }

    public final k a(boolean z10, boolean z11, c0 c0Var, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new k(z10, z11, c0Var, l10, l11, l12, l13, extras);
    }

    public final Long c() {
        return this.f106870f;
    }

    public final Long d() {
        return this.f106868d;
    }

    public final c0 e() {
        return this.f106867c;
    }

    public final boolean f() {
        return this.f106866b;
    }

    public final boolean g() {
        return this.f106865a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f106865a) {
            arrayList.add("isRegularFile");
        }
        if (this.f106866b) {
            arrayList.add("isDirectory");
        }
        if (this.f106868d != null) {
            arrayList.add("byteCount=" + this.f106868d);
        }
        if (this.f106869e != null) {
            arrayList.add("createdAt=" + this.f106869e);
        }
        if (this.f106870f != null) {
            arrayList.add("lastModifiedAt=" + this.f106870f);
        }
        if (this.f106871g != null) {
            arrayList.add("lastAccessedAt=" + this.f106871g);
        }
        if (!this.f106872h.isEmpty()) {
            arrayList.add("extras=" + this.f106872h);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ k(boolean z10, boolean z11, c0 c0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : c0Var, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? MapsKt.emptyMap() : map);
    }
}
