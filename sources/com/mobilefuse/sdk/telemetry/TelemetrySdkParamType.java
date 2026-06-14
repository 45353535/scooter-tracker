package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetrySdkParamType;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "value", "", "printInLogs", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getPrintInLogs", "()Z", "getValue", "()Ljava/lang/String;", "IFA", "IFA_SOURCE", "PLACEMENT_ID", "AD_INSTANCE_TYPE", "AD_SIZE", "BID_RESPONSE_ID", "BID_RESPONSE_CRID", "BID_RESPONSE_CPM", "BID_RESPONSE_TYPE", "BID_RESPONSE_EXPIRES", "BID_RESPONSE_CREATIVE_FORMAT", "BID_RESPONSE_LOSS_URL", "BID_RESPONSE_MUTED", "BID_RESPONSE_CLICK_BEHAVIOR", "BID_RESPONSE_MX_END_CARDS", "BID_RESPONSE_END_CARD_CLOSE_SECONDS", "BID_RESPONSE_FORCE_SKIP_SECONDS", "BID_RESPONSE_BLOCK_SKIP_SECONDS", "BID_RESPONSE_TOKEN", "BID_REPOSITORY_ID", "BID_REPOSITORY_TYPE", "BID_REQUEST_TOKEN", "AD_RENDERER", "TEST_MODE", "SPOOF_MODE", "MUTED", "APP_VERSION_NAME", "AD_INSTANCE_ID", "AD_INSTANCE_READY", "AD_CLICK_URL", "AD_LIFECYCLE_EVENT", "PRIVACY_PREFERENCES_SUBJECT_TO_COPPA", "PRIVACY_PREFERENCES_DNT", "PRIVACY_PREFERENCES_US_PRIVACY_STRING", "PRIVACY_PREFERENCES_GPP_CONTENT_STRING", "AD_TEST_MODE", "AD_ERROR_REASON", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public enum TelemetrySdkParamType implements TelemetryParamType {
    IFA(EidRequestBuilder.REQUEST_FIELD_IFA, false, 2, null),
    IFA_SOURCE("ifa.source", false, 2, null),
    PLACEMENT_ID("ad.placement.id", false, 2, null),
    AD_INSTANCE_TYPE("ad.instance.type", false, 2, null),
    AD_SIZE("ad.instance.size", false, 2, null),
    BID_RESPONSE_ID("bid.response.id", false, 2, null),
    BID_RESPONSE_CRID("bid.response.crid", false, 2, null),
    BID_RESPONSE_CPM("bid.response.cpm", false, 2, null),
    BID_RESPONSE_TYPE("bid.response.adtype", false, 2, null),
    BID_RESPONSE_EXPIRES("bid.response.expiry", false, 2, null),
    BID_RESPONSE_CREATIVE_FORMAT("bid.response.creative_format", false, 2, null),
    BID_RESPONSE_LOSS_URL("bid.response.loss_url", false, 2, null),
    BID_RESPONSE_MUTED("bid.response.muted", false, 2, null),
    BID_RESPONSE_CLICK_BEHAVIOR("bid.response.click_behavior", false, 2, null),
    BID_RESPONSE_MX_END_CARDS("bid.response.max_end_cards", false, 2, null),
    BID_RESPONSE_END_CARD_CLOSE_SECONDS("bid.response.end_card_close_seconds", false, 2, null),
    BID_RESPONSE_FORCE_SKIP_SECONDS("bid.response.force_skip_seconds", false, 2, null),
    BID_RESPONSE_BLOCK_SKIP_SECONDS("bid.response.block_skip_seconds", false, 2, null),
    BID_RESPONSE_TOKEN("bid.response.token", false, 2, null),
    BID_REPOSITORY_ID("bid.repository.id", false, 2, null),
    BID_REPOSITORY_TYPE("bid.repository.type", false, 2, null),
    BID_REQUEST_TOKEN("bid.request.token", false, 2, null),
    AD_RENDERER("ad.renderer.type", false, 2, null),
    TEST_MODE("sdk.testmode", false, 2, null),
    SPOOF_MODE("sdk.spoofmode", false, 2, null),
    MUTED("ad.instance.muted", false, 2, null),
    APP_VERSION_NAME("app.versionName", false, 2, null),
    AD_INSTANCE_ID("ad.instance.id", false, 2, null),
    AD_INSTANCE_READY("ad.instance.ready", false, 2, null),
    AD_CLICK_URL("ad.clickurl", false, 2, null),
    AD_LIFECYCLE_EVENT("event", false, 2, null),
    PRIVACY_PREFERENCES_SUBJECT_TO_COPPA("privacy.coppa", false, 2, null),
    PRIVACY_PREFERENCES_DNT("privacy.donottrack", false, 2, null),
    PRIVACY_PREFERENCES_US_PRIVACY_STRING("privacy.usstring", false, 2, null),
    PRIVACY_PREFERENCES_GPP_CONTENT_STRING("privacy.gppstring", false, 2, null),
    AD_TEST_MODE("ad.instance.testmode", false, 2, null),
    AD_ERROR_REASON("error.message", false, 2, null);

    private final boolean printInLogs;

    @NotNull
    private final String value;

    TelemetrySdkParamType(String str, boolean z10) {
        this.value = str;
        this.printInLogs = z10;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    public boolean getPrintInLogs() {
        return this.printInLogs;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    @NotNull
    public String getValue() {
        return this.value;
    }

    /* synthetic */ TelemetrySdkParamType(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
