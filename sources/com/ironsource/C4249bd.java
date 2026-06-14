package com.ironsource;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4249bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f42766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private int[] f42769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private int[] f42770f;

    public C4249bd() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.f42765a;
    }

    @NotNull
    public final String b() {
        return this.f42766b;
    }

    public final boolean c() {
        return this.f42767c;
    }

    public final int d() {
        return this.f42768d;
    }

    @Nullable
    public final int[] e() {
        return this.f42769e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4249bd)) {
            return false;
        }
        C4249bd c4249bd = (C4249bd) obj;
        return this.f42765a == c4249bd.f42765a && Intrinsics.areEqual(this.f42766b, c4249bd.f42766b) && this.f42767c == c4249bd.f42767c && this.f42768d == c4249bd.f42768d && Intrinsics.areEqual(this.f42769e, c4249bd.f42769e) && Intrinsics.areEqual(this.f42770f, c4249bd.f42770f);
    }

    @Nullable
    public final int[] f() {
        return this.f42770f;
    }

    public final boolean g() {
        return this.f42767c;
    }

    public final int h() {
        return this.f42768d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        boolean z10 = this.f42765a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iHashCode = ((r02 * 31) + this.f42766b.hashCode()) * 31;
        boolean z11 = this.f42767c;
        int i10 = (((iHashCode + (z11 ? 1 : z11)) * 31) + this.f42768d) * 31;
        int[] iArr = this.f42769e;
        int iHashCode2 = (i10 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f42770f;
        return iHashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f42765a;
    }

    @NotNull
    public final String j() {
        return this.f42766b;
    }

    @Nullable
    public final int[] k() {
        return this.f42770f;
    }

    @Nullable
    public final int[] l() {
        return this.f42769e;
    }

    @NotNull
    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f42765a + ", pixelEventsUrl=" + this.f42766b + ", pixelEventsCompression=" + this.f42767c + ", pixelEventsCompressionLevel=" + this.f42768d + ", pixelOptOut=" + Arrays.toString(this.f42769e) + ", pixelOptIn=" + Arrays.toString(this.f42770f) + ")";
    }

    public C4249bd(boolean z10, @NotNull String pixelEventsUrl, boolean z11, int i10, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.f42765a = z10;
        this.f42766b = pixelEventsUrl;
        this.f42767c = z11;
        this.f42768d = i10;
        this.f42769e = iArr;
        this.f42770f = iArr2;
    }

    @NotNull
    public final C4249bd a(boolean z10, @NotNull String pixelEventsUrl, boolean z11, int i10, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new C4249bd(z10, pixelEventsUrl, z11, i10, iArr, iArr2);
    }

    public final void b(boolean z10) {
        this.f42765a = z10;
    }

    public static /* synthetic */ C4249bd a(C4249bd c4249bd, boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c4249bd.f42765a;
        }
        if ((i11 & 2) != 0) {
            str = c4249bd.f42766b;
        }
        if ((i11 & 4) != 0) {
            z11 = c4249bd.f42767c;
        }
        if ((i11 & 8) != 0) {
            i10 = c4249bd.f42768d;
        }
        if ((i11 & 16) != 0) {
            iArr = c4249bd.f42769e;
        }
        if ((i11 & 32) != 0) {
            iArr2 = c4249bd.f42770f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c4249bd.a(z10, str, z11, i10, iArr3, iArr4);
    }

    public final void b(@Nullable int[] iArr) {
        this.f42769e = iArr;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f42766b = str;
    }

    public final void a(boolean z10) {
        this.f42767c = z10;
    }

    public final void a(int i10) {
        this.f42768d = i10;
    }

    public final void a(@Nullable int[] iArr) {
        this.f42770f = iArr;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C4249bd(boolean r2, java.lang.String r3, boolean r4, int r5, int[] r6, int[] r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            java.lang.String r3 = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=3"
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = 0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = -1
        L15:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4249bd.<init>(boolean, java.lang.String, boolean, int, int[], int[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
