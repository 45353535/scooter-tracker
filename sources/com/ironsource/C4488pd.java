package com.ironsource;

import com.ironsource.InterfaceC4582v6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4488pd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f44649b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f44650c = "type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f44651d = "single";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f44652e = "onShowSuccess";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f44653f = "onLoadSuccess";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final InterfaceC4582v6.c f44654a;

    /* JADX INFO: renamed from: com.ironsource.pd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4488pd(@org.jetbrains.annotations.NotNull org.json.JSONObject r3) {
        /*
            r2 = this;
            java.lang.String r0 = "features"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            java.lang.String r0 = "type"
            java.lang.String r3 = r3.optString(r0)
            if (r3 == 0) goto L48
            int r0 = r3.hashCode()
            r1 = -1900843810(0xffffffff8eb36cde, float:-4.4231742E-30)
            if (r0 == r1) goto L3c
            r1 = -999907609(0xffffffffc4669ee7, float:-922.48285)
            if (r0 == r1) goto L30
            r1 = -902265784(0xffffffffca388448, float:-3023122.0)
            if (r0 == r1) goto L24
            goto L48
        L24:
            java.lang.String r0 = "single"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2d
            goto L48
        L2d:
            com.ironsource.v6$c r3 = com.ironsource.InterfaceC4582v6.c.SINGLE
            goto L49
        L30:
            java.lang.String r0 = "onShowSuccess"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L39
            goto L48
        L39:
            com.ironsource.v6$c r3 = com.ironsource.InterfaceC4582v6.c.PROGRESSIVE_ON_SHOW_SUCCESS
            goto L49
        L3c:
            java.lang.String r0 = "onLoadSuccess"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L45
            goto L48
        L45:
            com.ironsource.v6$c r3 = com.ironsource.InterfaceC4582v6.c.PROGRESSIVE_ON_LOAD_SUCCESS
            goto L49
        L48:
            r3 = 0
        L49:
            r2.f44654a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4488pd.<init>(org.json.JSONObject):void");
    }

    @Nullable
    public final InterfaceC4582v6.c a() {
        return this.f44654a;
    }
}
