package com.mobilefuse.sdk.telemetry;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ACTION_EXCEPTION' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rj\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryBaseActionType;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "category", "", PglCryptUtils.KEY_MESSAGE, "logExtraMessage", "enabledBreadcrumbSending", "", "includeInLogsPrinting", "includeImplicitParamsInLogs", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getCategory", "()Ljava/lang/String;", "getEnabledBreadcrumbSending", "()Z", "getIncludeImplicitParamsInLogs", "getIncludeInLogsPrinting", "getLogExtraMessage", "getMessage", "ACTION_EXCEPTION", "APP_LAUNCHED", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetryBaseActionType implements TelemetryActionType {
    private static final /* synthetic */ TelemetryBaseActionType[] $VALUES;
    public static final TelemetryBaseActionType ACTION_EXCEPTION;
    public static final TelemetryBaseActionType APP_LAUNCHED;

    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;

    @NotNull
    private final String logExtraMessage;

    @NotNull
    private final String message;

    static {
        boolean z10 = false;
        boolean z11 = false;
        TelemetryBaseActionType telemetryBaseActionType = new TelemetryBaseActionType("ACTION_EXCEPTION", 0, "exception", "Exception", null, false, z10, z11, 52, null);
        ACTION_EXCEPTION = telemetryBaseActionType;
        TelemetryBaseActionType telemetryBaseActionType2 = new TelemetryBaseActionType("APP_LAUNCHED", 1, "app", "App launched", null, z10, z11, false, 52, null);
        APP_LAUNCHED = telemetryBaseActionType2;
        $VALUES = new TelemetryBaseActionType[]{telemetryBaseActionType, telemetryBaseActionType2};
    }

    private TelemetryBaseActionType(String str, int i10, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        this.category = str2;
        this.message = str3;
        this.logExtraMessage = str4;
        this.enabledBreadcrumbSending = z10;
        this.includeInLogsPrinting = z11;
        this.includeImplicitParamsInLogs = z12;
    }

    public static TelemetryBaseActionType valueOf(String str) {
        return (TelemetryBaseActionType) Enum.valueOf(TelemetryBaseActionType.class, str);
    }

    public static TelemetryBaseActionType[] values() {
        return (TelemetryBaseActionType[]) $VALUES.clone();
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

    /* synthetic */ TelemetryBaseActionType(String str, int i10, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? "" : str3, (i11 & 4) != 0 ? "" : str4, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? true : z11, (i11 & 32) != 0 ? true : z12);
    }
}
