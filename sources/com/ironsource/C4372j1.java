package com.ironsource;

import com.ironsource.C4406l1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4372j1 implements InterfaceC4389k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f43390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final IronSource.a f43391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f43392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f43393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f43394f;

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f43395a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f43396b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f43397c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f43398d = 1;

        private a() {
        }
    }

    public C4372j1(@NotNull String version, @NotNull String instanceId, @NotNull IronSource.a adFormat, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f43389a = version;
        this.f43390b = instanceId;
        this.f43391c = adFormat;
        this.f43392d = z10;
        this.f43393e = z11;
        this.f43394f = z12;
    }

    @Override // com.ironsource.InterfaceC4389k1
    @NotNull
    public ArrayList<InterfaceC4423m1> a() {
        ArrayList<InterfaceC4423m1> arrayList = new ArrayList<>();
        arrayList.add(new C4406l1.v(this.f43389a));
        arrayList.add(new C4406l1.x(this.f43390b));
        arrayList.add(new C4406l1.a(this.f43391c));
        if (this.f43392d) {
            arrayList.add(new C4406l1.p(1));
        }
        if (this.f43393e) {
            arrayList.add(new C4406l1.e(1));
        }
        if (this.f43394f) {
            arrayList.add(new C4406l1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C4372j1(String str, String str2, IronSource.a aVar, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }
}
