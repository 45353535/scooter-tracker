package com.vungle.ads.internal.network;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.c1;
import yg.e2;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rB_\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010!J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!\"\u0004\b4\u00105R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00102\u001a\u0004\b6\u0010!\"\u0004\b7\u00105R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat;", "", "Lcom/vungle/ads/internal/network/HttpMethod;", "method", "", "", "headers", "body", "", "retryAttempt", "retryCount", "tpatKey", "<init>", "(Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/network/FailedTpat;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/vungle/ads/internal/network/HttpMethod;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/lang/String;", "component4", "()I", "component5", "component6", MenuActionType.COPY, "(Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)Lcom/vungle/ads/internal/network/FailedTpat;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/network/HttpMethod;", "getMethod", "Ljava/util/Map;", "getHeaders", "Ljava/lang/String;", "getBody", "I", "getRetryAttempt", "setRetryAttempt", "(I)V", "getRetryCount", "setRetryCount", "getTpatKey", "setTpatKey", "(Ljava/lang/String;)V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class FailedTpat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String body;

    @Nullable
    private final Map<String, String> headers;

    @NotNull
    private final HttpMethod method;
    private int retryAttempt;
    private int retryCount;

    @Nullable
    private String tpatKey;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/network/FailedTpat;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FailedTpat$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FailedTpat(int i10, HttpMethod httpMethod, Map map, String str, int i11, int i12, String str2, t2 t2Var) {
        if (16 != (i10 & 16)) {
            e2.a(i10, 16, FailedTpat$$serializer.INSTANCE.getDescriptor());
        }
        this.method = (i10 & 1) == 0 ? HttpMethod.GET : httpMethod;
        if ((i10 & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i10 & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i10 & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i11;
        }
        this.retryCount = i12;
        if ((i10 & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedTpat copy$default(FailedTpat failedTpat, HttpMethod httpMethod, Map map, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            httpMethod = failedTpat.method;
        }
        if ((i12 & 2) != 0) {
            map = failedTpat.headers;
        }
        if ((i12 & 4) != 0) {
            str = failedTpat.body;
        }
        if ((i12 & 8) != 0) {
            i10 = failedTpat.retryAttempt;
        }
        if ((i12 & 16) != 0) {
            i11 = failedTpat.retryCount;
        }
        if ((i12 & 32) != 0) {
            str2 = failedTpat.tpatKey;
        }
        int i13 = i11;
        String str3 = str2;
        return failedTpat.copy(httpMethod, map, str, i10, i13, str3);
    }

    public static final void write$Self(@NotNull FailedTpat self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.r(serialDesc, 0) || self.method != HttpMethod.GET) {
            output.F(serialDesc, 0, HttpMethod$$serializer.INSTANCE, self.method);
        }
        if (output.r(serialDesc, 1) || self.headers != null) {
            y2 y2Var = y2.f119104a;
            output.h(serialDesc, 1, new c1(y2Var, y2Var), self.headers);
        }
        if (output.r(serialDesc, 2) || self.body != null) {
            output.h(serialDesc, 2, y2.f119104a, self.body);
        }
        if (output.r(serialDesc, 3) || self.retryAttempt != 0) {
            output.o(serialDesc, 3, self.retryAttempt);
        }
        output.o(serialDesc, 4, self.retryCount);
        if (!output.r(serialDesc, 5) && self.tpatKey == null) {
            return;
        }
        output.h(serialDesc, 5, y2.f119104a, self.tpatKey);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HttpMethod getMethod() {
        return this.method;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.headers;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTpatKey() {
        return this.tpatKey;
    }

    @NotNull
    public final FailedTpat copy(@NotNull HttpMethod method, @Nullable Map<String, String> headers, @Nullable String body, int retryAttempt, int retryCount, @Nullable String tpatKey) {
        Intrinsics.checkNotNullParameter(method, "method");
        return new FailedTpat(method, headers, body, retryAttempt, retryCount, tpatKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailedTpat)) {
            return false;
        }
        FailedTpat failedTpat = (FailedTpat) other;
        return this.method == failedTpat.method && Intrinsics.areEqual(this.headers, failedTpat.headers) && Intrinsics.areEqual(this.body, failedTpat.body) && this.retryAttempt == failedTpat.retryAttempt && this.retryCount == failedTpat.retryCount && Intrinsics.areEqual(this.tpatKey, failedTpat.tpatKey);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    public final String getTpatKey() {
        return this.tpatKey;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.retryAttempt) * 31) + this.retryCount) * 31;
        String str2 = this.tpatKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRetryAttempt(int i10) {
        this.retryAttempt = i10;
    }

    public final void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public final void setTpatKey(@Nullable String str) {
        this.tpatKey = str;
    }

    @NotNull
    public String toString() {
        return "FailedTpat(method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", retryAttempt=" + this.retryAttempt + ", retryCount=" + this.retryCount + ", tpatKey=" + this.tpatKey + ')';
    }

    public FailedTpat(@NotNull HttpMethod method, @Nullable Map<String, String> map, @Nullable String str, int i10, int i11, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.method = method;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i10;
        this.retryCount = i11;
        this.tpatKey = str2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ FailedTpat(com.vungle.ads.internal.network.HttpMethod r2, java.util.Map r3, java.lang.String r4, int r5, int r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.vungle.ads.internal.network.HttpMethod r2 = com.vungle.ads.internal.network.HttpMethod.GET
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = 0
        L16:
            r8 = r8 & 32
            if (r8 == 0) goto L22
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L29
        L22:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L29:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.FailedTpat.<init>(com.vungle.ads.internal.network.HttpMethod, java.util.Map, java.lang.String, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
