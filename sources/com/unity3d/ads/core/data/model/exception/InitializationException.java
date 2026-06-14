package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import eg.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PglCryptUtils.KEY_MESSAGE, "", "throwable", "", "reason", "reasonDebug", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getReason", "getReasonDebug", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InitializationException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String message;

    @NotNull
    private final String reason;

    @Nullable
    private final String reasonDebug;

    @Nullable
    private final Throwable throwable;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/InitializationException$Companion;", "", "()V", "parseFrom", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/Exception;", "Lkotlin/Exception;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InitializationException parseFrom(@NotNull Exception e10) {
            String str;
            Intrinsics.checkNotNullParameter(e10, "e");
            if (e10 instanceof v1 ? true : e10 instanceof NetworkTimeoutException) {
                return new InitializationException(AndroidInitializeBoldSDK.MSG_TIMEOUT, e10, "timeout", e10.getMessage());
            }
            if (e10 instanceof GatewayException) {
                GatewayException gatewayException = (GatewayException) e10;
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            }
            if (!(e10 instanceof UnityAdsNetworkException)) {
                return e10 instanceof InitializationException ? (InitializationException) e10 : new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, e10, "unknown", e10.getMessage());
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e10;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException("Network", e10, str, unityAdsNetworkException.getMessage());
        }

        private Companion() {
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th2, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th2, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th2 = initializationException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th2, str2, str3);
    }

    @NotNull
    public final String component1() {
        return getMessage();
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    @NotNull
    public final InitializationException copy(@NotNull String message, @Nullable Throwable throwable, @NotNull String reason, @Nullable String reasonDebug) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new InitializationException(message, throwable, reason, reasonDebug);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) other;
        return Intrinsics.areEqual(getMessage(), initializationException.getMessage()) && Intrinsics.areEqual(this.throwable, initializationException.throwable) && Intrinsics.areEqual(this.reason, initializationException.reason) && Intrinsics.areEqual(this.reasonDebug, initializationException.reasonDebug);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Throwable th2 = this.throwable;
        int iHashCode2 = (((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(@NotNull String message, @Nullable Throwable th2, @NotNull String reason, @Nullable String str) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.throwable = th2;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
