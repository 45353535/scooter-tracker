package com.google.android.datatransport.cct.internal;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoBatchedLogRequestEncoder();

    private static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final AndroidClientInfoEncoder f24143a = new AndroidClientInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24144b = FieldDescriptor.of("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24145c = FieldDescriptor.of("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f24146d = FieldDescriptor.of("hardware");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f24147e = FieldDescriptor.of(C4240b4.i.G);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f24148f = FieldDescriptor.of(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f24149g = FieldDescriptor.of("osBuild");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f24150h = FieldDescriptor.of(CommonUrlParts.MANUFACTURER);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final FieldDescriptor f24151i = FieldDescriptor.of("fingerprint");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final FieldDescriptor f24152j = FieldDescriptor.of(CommonUrlParts.LOCALE);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final FieldDescriptor f24153k = FieldDescriptor.of("country");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final FieldDescriptor f24154l = FieldDescriptor.of("mccMnc");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final FieldDescriptor f24155m = FieldDescriptor.of("applicationBuild");

        private AndroidClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24144b, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(f24145c, androidClientInfo.getModel());
            objectEncoderContext.add(f24146d, androidClientInfo.getHardware());
            objectEncoderContext.add(f24147e, androidClientInfo.getDevice());
            objectEncoderContext.add(f24148f, androidClientInfo.getProduct());
            objectEncoderContext.add(f24149g, androidClientInfo.getOsBuild());
            objectEncoderContext.add(f24150h, androidClientInfo.getManufacturer());
            objectEncoderContext.add(f24151i, androidClientInfo.getFingerprint());
            objectEncoderContext.add(f24152j, androidClientInfo.getLocale());
            objectEncoderContext.add(f24153k, androidClientInfo.getCountry());
            objectEncoderContext.add(f24154l, androidClientInfo.getMccMnc());
            objectEncoderContext.add(f24155m, androidClientInfo.getApplicationBuild());
        }
    }

    private static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final BatchedLogRequestEncoder f24156a = new BatchedLogRequestEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24157b = FieldDescriptor.of("logRequest");

        private BatchedLogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24157b, batchedLogRequest.getLogRequests());
        }
    }

    private static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ClientInfoEncoder f24158a = new ClientInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24159b = FieldDescriptor.of("clientType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24160c = FieldDescriptor.of("androidClientInfo");

        private ClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24159b, clientInfo.getClientType());
            objectEncoderContext.add(f24160c, clientInfo.getAndroidClientInfo());
        }
    }

    private static final class ComplianceDataEncoder implements ObjectEncoder<ComplianceData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ComplianceDataEncoder f24161a = new ComplianceDataEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24162b = FieldDescriptor.of("privacyContext");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24163c = FieldDescriptor.of("productIdOrigin");

        private ComplianceDataEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ComplianceData complianceData, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24162b, complianceData.getPrivacyContext());
            objectEncoderContext.add(f24163c, complianceData.getProductIdOrigin());
        }
    }

    private static final class ExperimentIdsEncoder implements ObjectEncoder<ExperimentIds> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ExperimentIdsEncoder f24164a = new ExperimentIdsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24165b = FieldDescriptor.of("clearBlob");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24166c = FieldDescriptor.of("encryptedBlob");

        private ExperimentIdsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ExperimentIds experimentIds, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24165b, experimentIds.getClearBlob());
            objectEncoderContext.add(f24166c, experimentIds.getEncryptedBlob());
        }
    }

    private static final class ExternalPRequestContextEncoder implements ObjectEncoder<ExternalPRequestContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ExternalPRequestContextEncoder f24167a = new ExternalPRequestContextEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24168b = FieldDescriptor.of("originAssociatedProductId");

        private ExternalPRequestContextEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ExternalPRequestContext externalPRequestContext, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24168b, externalPRequestContext.getOriginAssociatedProductId());
        }
    }

    private static final class ExternalPrivacyContextEncoder implements ObjectEncoder<ExternalPrivacyContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ExternalPrivacyContextEncoder f24169a = new ExternalPrivacyContextEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24170b = FieldDescriptor.of("prequest");

        private ExternalPrivacyContextEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ExternalPrivacyContext externalPrivacyContext, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24170b, externalPrivacyContext.getPrequest());
        }
    }

    private static final class LogEventEncoder implements ObjectEncoder<LogEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final LogEventEncoder f24171a = new LogEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24172b = FieldDescriptor.of("eventTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24173c = FieldDescriptor.of("eventCode");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f24174d = FieldDescriptor.of("complianceData");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f24175e = FieldDescriptor.of("eventUptimeMs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f24176f = FieldDescriptor.of("sourceExtension");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f24177g = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f24178h = FieldDescriptor.of("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final FieldDescriptor f24179i = FieldDescriptor.of("networkConnectionInfo");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final FieldDescriptor f24180j = FieldDescriptor.of("experimentIds");

        private LogEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24172b, logEvent.getEventTimeMs());
            objectEncoderContext.add(f24173c, logEvent.getEventCode());
            objectEncoderContext.add(f24174d, logEvent.getComplianceData());
            objectEncoderContext.add(f24175e, logEvent.getEventUptimeMs());
            objectEncoderContext.add(f24176f, logEvent.getSourceExtension());
            objectEncoderContext.add(f24177g, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(f24178h, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(f24179i, logEvent.getNetworkConnectionInfo());
            objectEncoderContext.add(f24180j, logEvent.getExperimentIds());
        }
    }

    private static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final LogRequestEncoder f24181a = new LogRequestEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24182b = FieldDescriptor.of("requestTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24183c = FieldDescriptor.of("requestUptimeMs");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f24184d = FieldDescriptor.of("clientInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f24185e = FieldDescriptor.of("logSource");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f24186f = FieldDescriptor.of("logSourceName");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f24187g = FieldDescriptor.of("logEvent");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f24188h = FieldDescriptor.of("qosTier");

        private LogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24182b, logRequest.getRequestTimeMs());
            objectEncoderContext.add(f24183c, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(f24184d, logRequest.getClientInfo());
            objectEncoderContext.add(f24185e, logRequest.getLogSource());
            objectEncoderContext.add(f24186f, logRequest.getLogSourceName());
            objectEncoderContext.add(f24187g, logRequest.getLogEvents());
            objectEncoderContext.add(f24188h, logRequest.getQosTier());
        }
    }

    private static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final NetworkConnectionInfoEncoder f24189a = new NetworkConnectionInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24190b = FieldDescriptor.of("networkType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24191c = FieldDescriptor.of("mobileSubtype");

        private NetworkConnectionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24190b, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(f24191c, networkConnectionInfo.getMobileSubtype());
        }
    }

    private AutoBatchedLogRequestEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.f24156a;
        encoderConfig.registerEncoder(BatchedLogRequest.class, batchedLogRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.f24181a;
        encoderConfig.registerEncoder(LogRequest.class, logRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.f24158a;
        encoderConfig.registerEncoder(ClientInfo.class, clientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.f24143a;
        encoderConfig.registerEncoder(AndroidClientInfo.class, androidClientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.f24171a;
        encoderConfig.registerEncoder(LogEvent.class, logEventEncoder);
        encoderConfig.registerEncoder(AutoValue_LogEvent.class, logEventEncoder);
        ComplianceDataEncoder complianceDataEncoder = ComplianceDataEncoder.f24161a;
        encoderConfig.registerEncoder(ComplianceData.class, complianceDataEncoder);
        encoderConfig.registerEncoder(AutoValue_ComplianceData.class, complianceDataEncoder);
        ExternalPrivacyContextEncoder externalPrivacyContextEncoder = ExternalPrivacyContextEncoder.f24169a;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        ExternalPRequestContextEncoder externalPRequestContextEncoder = ExternalPRequestContextEncoder.f24167a;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, externalPRequestContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPRequestContext.class, externalPRequestContextEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.f24189a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        ExperimentIdsEncoder experimentIdsEncoder = ExperimentIdsEncoder.f24164a;
        encoderConfig.registerEncoder(ExperimentIds.class, experimentIdsEncoder);
        encoderConfig.registerEncoder(AutoValue_ExperimentIds.class, experimentIdsEncoder);
    }
}
