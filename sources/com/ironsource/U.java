package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class U {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f41810q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f41811r = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f41812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f41813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f41814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4460o2 f41815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final N0 f41821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final H0 f41822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f41823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f41824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f41825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f41826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f41827p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(@NotNull IronSource.a adUnit, @Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C4460o2 auctionSettings, int i10, int i11, boolean z10, int i12, int i13, @NotNull N0 loadingData, @NotNull H0 interactionData, long j10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.f41812a = adUnit;
        this.f41813b = str;
        this.f41814c = list;
        this.f41815d = auctionSettings;
        this.f41816e = i10;
        this.f41817f = i11;
        this.f41818g = z10;
        this.f41819h = i12;
        this.f41820i = i13;
        this.f41821j = loadingData;
        this.f41822k = interactionData;
        this.f41823l = j10;
        this.f41824m = z11;
        this.f41825n = z12;
        this.f41826o = z13;
        this.f41827p = z14;
    }

    public final void a(int i10) {
        this.f41816e = i10;
    }

    @NotNull
    public final IronSource.a b() {
        return this.f41812a;
    }

    public final boolean c() {
        return this.f41818g;
    }

    @NotNull
    public final C4460o2 d() {
        return this.f41815d;
    }

    public final long e() {
        return this.f41823l;
    }

    public final int f() {
        return this.f41819h;
    }

    @NotNull
    public final H0 g() {
        return this.f41822k;
    }

    @NotNull
    public final N0 h() {
        return this.f41821j;
    }

    public final int i() {
        return this.f41816e;
    }

    @Nullable
    public List<NetworkSettings> j() {
        return this.f41814c;
    }

    public final boolean k() {
        return this.f41824m;
    }

    public final boolean l() {
        return this.f41826o;
    }

    public final boolean m() {
        return this.f41827p;
    }

    public final int n() {
        return this.f41817f;
    }

    @Nullable
    public String o() {
        return this.f41813b;
    }

    public final boolean p() {
        return this.f41825n;
    }

    public final boolean q() {
        return this.f41815d.g() > 0;
    }

    @NotNull
    public final String r() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f43835x, Integer.valueOf(this.f41816e), com.ironsource.mediationsdk.d.f43836y, Boolean.valueOf(this.f41818g), com.ironsource.mediationsdk.d.f43837z, Boolean.valueOf(this.f41827p));
        Intrinsics.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final void a(boolean z10) {
        this.f41818g = z10;
    }

    public final void b(boolean z10) {
        this.f41827p = z10;
    }

    public final int a() {
        return this.f41820i;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        Iterator<T> it = listJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ U(IronSource.a aVar, String str, List list, C4460o2 c4460o2, int i10, int i11, boolean z10, int i12, int i13, N0 n02, H0 h02, long j10, boolean z11, boolean z12, boolean z13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, list, c4460o2, i10, i11, z10, i12, i13, n02, h02, j10, z11, z12, z13, (i14 & 32768) != 0 ? false : z14);
    }
}
