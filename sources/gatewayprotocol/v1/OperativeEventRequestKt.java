package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/OperativeEventRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OperativeEventRequestKt {

    @NotNull
    public static final OperativeEventRequestKt INSTANCE = new OperativeEventRequestKt();

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010H\u001a\u00020IH\u0001J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u0006\u0010M\u001a\u00020KJ\u0006\u0010N\u001a\u00020KJ\u0006\u0010O\u001a\u00020KJ\u0006\u0010P\u001a\u00020KJ\u0006\u0010Q\u001a\u00020KJ\u0006\u0010R\u001a\u00020KJ\u0006\u0010S\u001a\u00020KJ\u0006\u0010T\u001a\u00020KJ\u0006\u0010U\u001a\u00020KJ\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020WJ\u0006\u0010Y\u001a\u00020WJ\u0006\u0010Z\u001a\u00020WJ\u0006\u0010[\u001a\u00020WR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R$\u00100\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0002092\u0006\u0010\u0005\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010@\u001a\u00020?2\u0006\u0010\u0005\u001a\u00020?8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010E\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0015\"\u0004\bG\u0010\u0017¨\u0006]"}, d2 = {"Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest$Builder;", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest$Builder;)V", "value", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "", "adFormatValue", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "Lcom/google/protobuf/ByteString;", "additionalData", "getAdditionalData", "()Lcom/google/protobuf/ByteString;", "setAdditionalData", "(Lcom/google/protobuf/ByteString;)V", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignState", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "eventId", "getEventId", "setEventId", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "eventType", "getEventType", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "setEventType", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;)V", "eventTypeValue", "getEventTypeValue", "setEventTypeValue", "impressionOpportunityId", "getImpressionOpportunityId", "setImpressionOpportunityId", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "", "sid", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "getTrackingToken", "setTrackingToken", "_build", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "clearAdFormat", "", "clearAdditionalData", "clearCampaignState", "clearDynamicDeviceInfo", "clearEventId", "clearEventType", "clearImpressionOpportunityId", "clearSessionCounters", "clearSid", "clearStaticDeviceInfo", "clearTrackingToken", "hasAdFormat", "", "hasCampaignState", "hasDynamicDeviceInfo", "hasSessionCounters", "hasStaticDeviceInfo", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final OperativeEventRequestOuterClass.OperativeEventRequest.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventRequest _build() {
            OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequestBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(operativeEventRequestBuild, "_builder.build()");
            return operativeEventRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdditionalData() {
            this._builder.clearAdditionalData();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSid() {
            this._builder.clearSid();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @NotNull
        public final ByteString getAdditionalData() {
            ByteString additionalData = this._builder.getAdditionalData();
            Intrinsics.checkNotNullExpressionValue(additionalData, "_builder.getAdditionalData()");
            return additionalData;
        }

        @NotNull
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            Intrinsics.checkNotNullExpressionValue(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        @NotNull
        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            Intrinsics.checkNotNullExpressionValue(eventId, "_builder.getEventId()");
            return eventId;
        }

        @NotNull
        public final OperativeEventRequestOuterClass.OperativeEventType getEventType() {
            OperativeEventRequestOuterClass.OperativeEventType eventType = this._builder.getEventType();
            Intrinsics.checkNotNullExpressionValue(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            Intrinsics.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            Intrinsics.checkNotNullExpressionValue(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @NotNull
        public final String getSid() {
            String sid = this._builder.getSid();
            Intrinsics.checkNotNullExpressionValue(sid, "_builder.getSid()");
            return sid;
        }

        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        @NotNull
        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            Intrinsics.checkNotNullExpressionValue(trackingToken, "_builder.getTrackingToken()");
            return trackingToken;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setAdditionalData(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdditionalData(value);
        }

        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setEventId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEventId(value);
        }

        public final void setEventType(@NotNull OperativeEventRequestOuterClass.OperativeEventType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEventType(value);
        }

        public final void setEventTypeValue(int i10) {
            this._builder.setEventTypeValue(i10);
        }

        public final void setImpressionOpportunityId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setSid(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSid(value);
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setTrackingToken(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTrackingToken(value);
        }

        private Dsl(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private OperativeEventRequestKt() {
    }
}
