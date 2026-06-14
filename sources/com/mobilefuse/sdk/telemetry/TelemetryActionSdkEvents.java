package com.mobilefuse.sdk.telemetry;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0003J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0013¨\u0006)"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryActionSdkEvents;", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "category", "", PglCryptUtils.KEY_MESSAGE, "logExtraMessage", "enabledBreadcrumbSending", "", "includeInLogsPrinting", "includeImplicitParamsInLogs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getCategory", "()Ljava/lang/String;", "getEnabledBreadcrumbSending", "()Z", "getIncludeImplicitParamsInLogs", "getIncludeInLogsPrinting", "getLogExtraMessage", "setLogExtraMessage", "(Ljava/lang/String;)V", "getMessage", "setMessage", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "updateExtraMessageField", "updatedValue", "updateMessagesValues", "newMessage", "newExtraMessage", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class TelemetryActionSdkEvents implements TelemetryActionType {

    @NotNull
    public static final TelemetryActionSdkEvents ADVERTISING_ID_OBTAINED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_BIDDING_LOAD_REQUESTED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_CREATED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_DESTROYED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_RENDERER_CREATED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_SET_MUTED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_INSTANCE_SET_TEST_MODE;

    @NotNull
    public static final TelemetryActionSdkEvents AD_LIFECYCLE_ERROR;

    @NotNull
    public static final TelemetryActionSdkEvents AD_LIFECYCLE_EVENT;

    @NotNull
    public static final TelemetryActionSdkEvents AD_LOAD_REQUESTED;

    @NotNull
    public static final TelemetryActionSdkEvents AD_MUTED_CALLBACK;

    @NotNull
    public static final TelemetryActionSdkEvents AD_SHOW_REQUESTED;

    @NotNull
    public static final TelemetryActionSdkEvents BID_TOKEN_GENERATED;

    @NotNull
    public static final TelemetryActionSdkEvents SDK_SET_PRIVACY_PREFERENCES;

    @NotNull
    public static final TelemetryActionSdkEvents SDK_SET_SPOOF_MODE_GLOBALLY;

    @NotNull
    public static final TelemetryActionSdkEvents SDK_SET_TEST_MODE_GLOBALLY;

    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;

    @NotNull
    private String logExtraMessage;

    @NotNull
    private String message;

    static {
        boolean z10 = false;
        boolean z11 = false;
        AD_INSTANCE_CREATED = new TelemetryActionSdkEvents("ad", "Ad instance created", "created for placement %s", false, z10, z11, 56, null);
        boolean z12 = false;
        ADVERTISING_ID_OBTAINED = new TelemetryActionSdkEvents("sdk", "Advertising ID obtained", "Got advertising ID %s", z10, z11, z12, 56, null);
        boolean z13 = false;
        SDK_SET_PRIVACY_PREFERENCES = new TelemetryActionSdkEvents("sdk", "Privacy Preferences set", "Privacy preferences were updated for: %s", z11, z12, z13, 56, null);
        boolean z14 = false;
        SDK_SET_TEST_MODE_GLOBALLY = new TelemetryActionSdkEvents("sdk", "Test mode set", "Test Mode was turned %s globally", z12, z13, z14, 56, null);
        boolean z15 = false;
        SDK_SET_SPOOF_MODE_GLOBALLY = new TelemetryActionSdkEvents("sdk", "Spoof mode set", "Spoof Mode was turned %s globally", z13, z14, z15, 56, null);
        boolean z16 = false;
        AD_INSTANCE_DESTROYED = new TelemetryActionSdkEvents("ad", "Ad instance destroyed", "destroyed", z14, z15, z16, 56, null);
        boolean z17 = false;
        AD_INSTANCE_RENDERER_CREATED = new TelemetryActionSdkEvents("ad", "Ad instance renderer created", "created %s renderer", z15, z16, z17, 56, null);
        AD_LOAD_REQUESTED = new TelemetryActionSdkEvents("ad", "Ad instance loadAd called", "loadAd() was called for placement %s", z16, z17, false, 56, null);
        boolean z18 = false;
        boolean z19 = false;
        AD_BIDDING_LOAD_REQUESTED = new TelemetryActionSdkEvents("ad", "Ad instance loadAdFromBiddingToken called", "loadAdFromBiddingToken() was called", false, z18, z19, 56, null);
        boolean z20 = false;
        AD_SHOW_REQUESTED = new TelemetryActionSdkEvents("ad", "Ad instance showAd() called", "showAd() called", z18, z19, z20, 56, null);
        boolean z21 = false;
        AD_INSTANCE_SET_MUTED = new TelemetryActionSdkEvents("ad", "Ad instance setMuted", "setMuted(%s) called", z19, z20, z21, 56, null);
        boolean z22 = false;
        AD_MUTED_CALLBACK = new TelemetryActionSdkEvents("ad", "Ad instance adMutedChanged callback", "- muted changed callback", z20, z21, z22, 56, null);
        boolean z23 = false;
        AD_INSTANCE_SET_TEST_MODE = new TelemetryActionSdkEvents("ad", "Ad instance setTestMode", "setTestMode(%s) called", z21, z22, z23, 56, null);
        boolean z24 = false;
        AD_LIFECYCLE_EVENT = new TelemetryActionSdkEvents("ad", "Ad instance %s callback", "- %s callback", z22, z23, z24, 56, null);
        boolean z25 = false;
        AD_LIFECYCLE_ERROR = new TelemetryActionSdkEvents("ad", "Ad instance adError callback", "- error with message: %s", z23, z24, z25, 56, null);
        BID_TOKEN_GENERATED = new TelemetryActionSdkEvents("bid", "Bidding token generated", "Bidding token generated", z24, z25, false, 56, null);
    }

    public TelemetryActionSdkEvents(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(str, str2, str3, false, false, false, 56, null);
    }

    public static /* synthetic */ TelemetryActionSdkEvents copy$default(TelemetryActionSdkEvents telemetryActionSdkEvents, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = telemetryActionSdkEvents.getCategory();
        }
        if ((i10 & 2) != 0) {
            str2 = telemetryActionSdkEvents.getMessage();
        }
        if ((i10 & 4) != 0) {
            str3 = telemetryActionSdkEvents.getLogExtraMessage();
        }
        if ((i10 & 8) != 0) {
            z10 = telemetryActionSdkEvents.getEnabledBreadcrumbSending();
        }
        if ((i10 & 16) != 0) {
            z11 = telemetryActionSdkEvents.getIncludeInLogsPrinting();
        }
        if ((i10 & 32) != 0) {
            z12 = telemetryActionSdkEvents.getIncludeImplicitParamsInLogs();
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return telemetryActionSdkEvents.copy(str, str2, str3, z10, z13, z14);
    }

    @NotNull
    public final String component1() {
        return getCategory();
    }

    @NotNull
    public final String component2() {
        return getMessage();
    }

    @NotNull
    public final String component3() {
        return getLogExtraMessage();
    }

    public final boolean component4() {
        return getEnabledBreadcrumbSending();
    }

    public final boolean component5() {
        return getIncludeInLogsPrinting();
    }

    public final boolean component6() {
        return getIncludeImplicitParamsInLogs();
    }

    @NotNull
    public final TelemetryActionSdkEvents copy(@NotNull String category, @NotNull String message, @NotNull String logExtraMessage, boolean enabledBreadcrumbSending, boolean includeInLogsPrinting, boolean includeImplicitParamsInLogs) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExtraMessage, "logExtraMessage");
        return new TelemetryActionSdkEvents(category, message, logExtraMessage, enabledBreadcrumbSending, includeInLogsPrinting, includeImplicitParamsInLogs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryActionSdkEvents)) {
            return false;
        }
        TelemetryActionSdkEvents telemetryActionSdkEvents = (TelemetryActionSdkEvents) other;
        return Intrinsics.areEqual(getCategory(), telemetryActionSdkEvents.getCategory()) && Intrinsics.areEqual(getMessage(), telemetryActionSdkEvents.getMessage()) && Intrinsics.areEqual(getLogExtraMessage(), telemetryActionSdkEvents.getLogExtraMessage()) && getEnabledBreadcrumbSending() == telemetryActionSdkEvents.getEnabledBreadcrumbSending() && getIncludeInLogsPrinting() == telemetryActionSdkEvents.getIncludeInLogsPrinting() && getIncludeImplicitParamsInLogs() == telemetryActionSdkEvents.getIncludeImplicitParamsInLogs();
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getCategory() {
        return this.category;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getEnabledBreadcrumbSending() {
        return this.enabledBreadcrumbSending;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeImplicitParamsInLogs() {
        return this.includeImplicitParamsInLogs;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeInLogsPrinting() {
        return this.includeInLogsPrinting;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getLogExtraMessage() {
        return this.logExtraMessage;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public int hashCode() {
        String category = getCategory();
        int iHashCode = (category != null ? category.hashCode() : 0) * 31;
        String message = getMessage();
        int iHashCode2 = (iHashCode + (message != null ? message.hashCode() : 0)) * 31;
        String logExtraMessage = getLogExtraMessage();
        int iHashCode3 = (iHashCode2 + (logExtraMessage != null ? logExtraMessage.hashCode() : 0)) * 31;
        boolean enabledBreadcrumbSending = getEnabledBreadcrumbSending();
        ?? r12 = enabledBreadcrumbSending;
        if (enabledBreadcrumbSending) {
            r12 = 1;
        }
        int i10 = (iHashCode3 + r12) * 31;
        boolean includeInLogsPrinting = getIncludeInLogsPrinting();
        ?? r13 = includeInLogsPrinting;
        if (includeInLogsPrinting) {
            r13 = 1;
        }
        int i11 = (i10 + r13) * 31;
        boolean includeImplicitParamsInLogs = getIncludeImplicitParamsInLogs();
        return i11 + (includeImplicitParamsInLogs ? 1 : includeImplicitParamsInLogs);
    }

    public void setLogExtraMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logExtraMessage = str;
    }

    public void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "TelemetryActionSdkEvents(category=" + getCategory() + ", message=" + getMessage() + ", logExtraMessage=" + getLogExtraMessage() + ", enabledBreadcrumbSending=" + getEnabledBreadcrumbSending() + ", includeInLogsPrinting=" + getIncludeInLogsPrinting() + ", includeImplicitParamsInLogs=" + getIncludeImplicitParamsInLogs() + ")";
    }

    @NotNull
    public final TelemetryActionSdkEvents updateExtraMessageField(@NotNull String updatedValue) {
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        String str = String.format(getLogExtraMessage(), Arrays.copyOf(new Object[]{updatedValue}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return copy$default(this, null, null, str, false, false, false, 59, null);
    }

    @NotNull
    public final TelemetryActionSdkEvents updateMessagesValues(@NotNull String newMessage, @NotNull String newExtraMessage) {
        Intrinsics.checkNotNullParameter(newMessage, "newMessage");
        Intrinsics.checkNotNullParameter(newExtraMessage, "newExtraMessage");
        String str = String.format(getMessage(), Arrays.copyOf(new Object[]{newMessage}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        String str2 = String.format(getLogExtraMessage(), Arrays.copyOf(new Object[]{newExtraMessage}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
        return copy$default(this, null, str, str2, false, false, false, 57, null);
    }

    public TelemetryActionSdkEvents(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z10) {
        this(str, str2, str3, z10, false, false, 48, null);
    }

    public TelemetryActionSdkEvents(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z10, boolean z11) {
        this(str, str2, str3, z10, z11, false, 32, null);
    }

    public TelemetryActionSdkEvents(@NotNull String category, @NotNull String message, @NotNull String logExtraMessage, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExtraMessage, "logExtraMessage");
        this.category = category;
        this.message = message;
        this.logExtraMessage = logExtraMessage;
        this.enabledBreadcrumbSending = z10;
        this.includeInLogsPrinting = z11;
        this.includeImplicitParamsInLogs = z12;
    }

    public /* synthetic */ TelemetryActionSdkEvents(String str, String str2, String str3, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }
}
