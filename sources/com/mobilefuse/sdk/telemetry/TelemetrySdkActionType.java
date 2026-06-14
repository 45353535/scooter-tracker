package com.mobilefuse.sdk.telemetry;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GOOGLE_PLAY_SERVICES_NOT_AVAILABLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B?\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetrySdkActionType;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "category", "", PglCryptUtils.KEY_MESSAGE, "logExtraMessage", "enabledBreadcrumbSending", "", "includeInLogsPrinting", "includeImplicitParamsInLogs", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getCategory", "()Ljava/lang/String;", "getEnabledBreadcrumbSending", "()Z", "getIncludeImplicitParamsInLogs", "getIncludeInLogsPrinting", "getLogExtraMessage", "getMessage", "setMessage", "(Ljava/lang/String;)V", "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", "EID_REQUEST_SENT", "EID_RESPONSE_RECEIVED", "BID_REQUEST_SENT", "BID_RESPONSE_RECEIVED", "BID_TOKEN_DECODED", "WINING_BID_SELECTED", "BID_INELIGIBLE_RESPONSE", "AD_LIFECYCLE_EVENT", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetrySdkActionType implements TelemetryActionType {
    private static final /* synthetic */ TelemetrySdkActionType[] $VALUES;
    public static final TelemetrySdkActionType AD_LIFECYCLE_EVENT;
    public static final TelemetrySdkActionType BID_INELIGIBLE_RESPONSE;
    public static final TelemetrySdkActionType BID_REQUEST_SENT;
    public static final TelemetrySdkActionType BID_RESPONSE_RECEIVED;
    public static final TelemetrySdkActionType BID_TOKEN_DECODED;
    public static final TelemetrySdkActionType EID_REQUEST_SENT;
    public static final TelemetrySdkActionType EID_RESPONSE_RECEIVED;
    public static final TelemetrySdkActionType GOOGLE_PLAY_SERVICES_NOT_AVAILABLE;
    public static final TelemetrySdkActionType WINING_BID_SELECTED;

    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;

    @NotNull
    private final String logExtraMessage;

    @NotNull
    private String message;

    static {
        boolean z10 = false;
        boolean z11 = false;
        TelemetrySdkActionType telemetrySdkActionType = new TelemetrySdkActionType("GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", 0, "sdk", "Play services failed", "Google Play Services is not available, so advertising ID will be zeroes", false, z10, z11, 56, null);
        GOOGLE_PLAY_SERVICES_NOT_AVAILABLE = telemetrySdkActionType;
        boolean z12 = false;
        TelemetrySdkActionType telemetrySdkActionType2 = new TelemetrySdkActionType("EID_REQUEST_SENT", 1, TelemetryCategory.EID, "EID request sent", null, z10, z11, z12, 52, null);
        EID_REQUEST_SENT = telemetrySdkActionType2;
        boolean z13 = false;
        TelemetrySdkActionType telemetrySdkActionType3 = new TelemetrySdkActionType("EID_RESPONSE_RECEIVED", 2, TelemetryCategory.EID, "EID response received", null, z11, z12, z13, 52, null);
        EID_RESPONSE_RECEIVED = telemetrySdkActionType3;
        boolean z14 = false;
        TelemetrySdkActionType telemetrySdkActionType4 = new TelemetrySdkActionType("BID_REQUEST_SENT", 3, "bid", "Bid Request sent", null, z12, z13, z14, 60, null);
        BID_REQUEST_SENT = telemetrySdkActionType4;
        boolean z15 = false;
        TelemetrySdkActionType telemetrySdkActionType5 = new TelemetrySdkActionType("BID_RESPONSE_RECEIVED", 4, "bid", "Bid Response received", null, z13, z14, z15, 60, null);
        BID_RESPONSE_RECEIVED = telemetrySdkActionType5;
        boolean z16 = false;
        TelemetrySdkActionType telemetrySdkActionType6 = new TelemetrySdkActionType("BID_TOKEN_DECODED", 5, "bid", "Bidding token decoded", "Bidding token decoded", z14, z15, z16, 56, null);
        BID_TOKEN_DECODED = telemetrySdkActionType6;
        boolean z17 = false;
        TelemetrySdkActionType telemetrySdkActionType7 = new TelemetrySdkActionType("WINING_BID_SELECTED", 6, "bid", "Selected winning Bid", null, z15, z16, z17, 60, null);
        WINING_BID_SELECTED = telemetrySdkActionType7;
        boolean z18 = false;
        TelemetrySdkActionType telemetrySdkActionType8 = new TelemetrySdkActionType("BID_INELIGIBLE_RESPONSE", 7, "bid", "Bid response ineligible", null, z16, z17, z18, 60, null);
        BID_INELIGIBLE_RESPONSE = telemetrySdkActionType8;
        TelemetrySdkActionType telemetrySdkActionType9 = new TelemetrySdkActionType("AD_LIFECYCLE_EVENT", 8, "ad", "Ad instance lifecycle event callbacks", null, z17, z18, false, 60, null);
        AD_LIFECYCLE_EVENT = telemetrySdkActionType9;
        $VALUES = new TelemetrySdkActionType[]{telemetrySdkActionType, telemetrySdkActionType2, telemetrySdkActionType3, telemetrySdkActionType4, telemetrySdkActionType5, telemetrySdkActionType6, telemetrySdkActionType7, telemetrySdkActionType8, telemetrySdkActionType9};
    }

    private TelemetrySdkActionType(String str, int i10, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        this.category = str2;
        this.message = str3;
        this.logExtraMessage = str4;
        this.enabledBreadcrumbSending = z10;
        this.includeInLogsPrinting = z11;
        this.includeImplicitParamsInLogs = z12;
    }

    public static TelemetrySdkActionType valueOf(String str) {
        return (TelemetrySdkActionType) Enum.valueOf(TelemetrySdkActionType.class, str);
    }

    public static TelemetrySdkActionType[] values() {
        return (TelemetrySdkActionType[]) $VALUES.clone();
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

    public void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* synthetic */ TelemetrySdkActionType(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 4
            if (r0 == 0) goto L6
            java.lang.String r14 = ""
        L6:
            r5 = r14
            r14 = r18 & 8
            r0 = 1
            if (r14 == 0) goto Le
            r6 = r0
            goto Lf
        Le:
            r6 = r15
        Lf:
            r14 = r18 & 16
            if (r14 == 0) goto L15
            r7 = r0
            goto L17
        L15:
            r7 = r16
        L17:
            r14 = r18 & 32
            if (r14 == 0) goto L22
            r8 = r0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0 = r9
            goto L29
        L22:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
        L29:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.telemetry.TelemetrySdkActionType.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
