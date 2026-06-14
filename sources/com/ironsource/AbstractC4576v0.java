package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4576v0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a f45598r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f45599s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4304f0 f45600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f45602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<NetworkSettings> f45603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4432ma f45604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final C4460o2 f45605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f45607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f45609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f45610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final N0 f45611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f45612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f45613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f45614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f45615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f45616q;

    /* JADX INFO: renamed from: com.ironsource.v0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(@NotNull C4304f0 adProperties, @Nullable Xa xa2, @NotNull Function1<? super S3, ? extends AdFormatConfig> getAdFormatConfig, @NotNull Function2<? super C4559u0, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            List<C4588vc> listEmptyList;
            Ee eeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            Intrinsics.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            Intrinsics.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            AdFormatConfig adformatconfigInvoke = getAdFormatConfig.invoke((xa2 == null || (eeD = xa2.d()) == null) ? null : eeD.c());
            if (adformatconfigInvoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (xa2 == null || (listEmptyList = xa2.d(adProperties.e(), adProperties.c())) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4588vc) it.next()).f());
            }
            C4432ma c4432maB = C4432ma.b();
            Intrinsics.checkNotNullExpressionValue(c4432maB, "getInstance()");
            return createAdUnitData.invoke(new C4559u0(strF, arrayList, c4432maB), adformatconfigInvoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4576v0(@NotNull C4304f0 adProperties, boolean z10, @Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C4432ma publisherDataHolder, @NotNull C4460o2 auctionSettings, int i10, int i11, boolean z11, int i12, int i13, @NotNull N0 loadingData, long j10, boolean z12, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.f45600a = adProperties;
        this.f45601b = z10;
        this.f45602c = str;
        this.f45603d = providerList;
        this.f45604e = publisherDataHolder;
        this.f45605f = auctionSettings;
        this.f45606g = i10;
        this.f45607h = i11;
        this.f45608i = z11;
        this.f45609j = i12;
        this.f45610k = i13;
        this.f45611l = loadingData;
        this.f45612m = j10;
        this.f45613n = z12;
        this.f45614o = z13;
        this.f45615p = z14;
        this.f45616q = z15;
    }

    public final void a(int i10) {
        this.f45606g = i10;
    }

    @NotNull
    public C4304f0 b() {
        return this.f45600a;
    }

    @NotNull
    public abstract JSONObject b(@NotNull NetworkSettings networkSettings);

    @NotNull
    public abstract String c();

    public final boolean d() {
        return this.f45608i;
    }

    @NotNull
    public final C4460o2 e() {
        return this.f45605f;
    }

    public final long f() {
        return this.f45612m;
    }

    public final int g() {
        return this.f45609j;
    }

    public final int h() {
        return this.f45607h;
    }

    @NotNull
    public final N0 i() {
        return this.f45611l;
    }

    @NotNull
    public abstract String j();

    public final int k() {
        return this.f45606g;
    }

    @NotNull
    public final String l() {
        String strC;
        C4283dd c4283ddF = b().f();
        return (c4283ddF == null || (strC = c4283ddF.c()) == null) ? "" : strC;
    }

    @NotNull
    public final List<NetworkSettings> m() {
        return this.f45603d;
    }

    public final boolean n() {
        return this.f45613n;
    }

    @NotNull
    public final C4432ma o() {
        return this.f45604e;
    }

    public final boolean p() {
        return this.f45615p;
    }

    public final boolean q() {
        return this.f45616q;
    }

    @Nullable
    public final String r() {
        return this.f45602c;
    }

    public final boolean s() {
        return this.f45614o;
    }

    public final boolean t() {
        return this.f45605f.g() > 0;
    }

    public boolean u() {
        return this.f45601b;
    }

    @NotNull
    public final String v() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f43835x, Integer.valueOf(this.f45606g), com.ironsource.mediationsdk.d.f43836y, Boolean.valueOf(this.f45608i), com.ironsource.mediationsdk.d.f43837z, Boolean.valueOf(this.f45616q));
        Intrinsics.checkNotNullExpressionValue(str, "format(\n          Locale…     showPriorityEnabled)");
        return str;
    }

    public final void a(boolean z10) {
        this.f45608i = z10;
    }

    public final void b(boolean z10) {
        this.f45616q = z10;
    }

    public final int a() {
        return this.f45610k;
    }

    @Nullable
    public final NetworkSettings a(@NotNull String instanceName) {
        Object next;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Iterator<T> it = this.f45603d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                break;
            }
        }
        return (NetworkSettings) next;
    }

    @NotNull
    public AdData a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.f45602c);
        Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    public /* synthetic */ AbstractC4576v0(C4304f0 c4304f0, boolean z10, String str, List list, C4432ma c4432ma, C4460o2 c4460o2, int i10, int i11, boolean z11, int i12, int i13, N0 n02, long j10, boolean z12, boolean z13, boolean z14, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4304f0, z10, str, list, c4432ma, c4460o2, i10, i11, z11, i12, i13, n02, j10, z12, z13, z14, (i14 & 65536) != 0 ? false : z15);
    }
}
