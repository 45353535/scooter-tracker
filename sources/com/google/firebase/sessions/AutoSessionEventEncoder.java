package com.google.firebase.sessions;

import com.amazon.device.ads.DtbDeviceData;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import net.pubnative.lite.sdk.models.AdExperience;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoSessionEventEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoSessionEventEncoder();

    private static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final AndroidApplicationInfoEncoder f33200a = new AndroidApplicationInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f33201b = FieldDescriptor.of("packageName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f33202c = FieldDescriptor.of("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f33203d = FieldDescriptor.of("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f33204e = FieldDescriptor.of("deviceManufacturer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f33205f = FieldDescriptor.of("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f33206g = FieldDescriptor.of("appProcessDetails");

        private AndroidApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f33201b, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(f33202c, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(f33203d, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(f33204e, androidApplicationInfo.getDeviceManufacturer());
            objectEncoderContext.add(f33205f, androidApplicationInfo.getCurrentProcessDetails());
            objectEncoderContext.add(f33206g, androidApplicationInfo.getAppProcessDetails());
        }
    }

    private static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ApplicationInfoEncoder f33207a = new ApplicationInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f33208b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.APP_ID);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f33209c = FieldDescriptor.of("deviceModel");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f33210d = FieldDescriptor.of("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f33211e = FieldDescriptor.of(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f33212f = FieldDescriptor.of("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f33213g = FieldDescriptor.of("androidAppInfo");

        private ApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f33208b, applicationInfo.getAppId());
            objectEncoderContext.add(f33209c, applicationInfo.getDeviceModel());
            objectEncoderContext.add(f33210d, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(f33211e, applicationInfo.getOsVersion());
            objectEncoderContext.add(f33212f, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(f33213g, applicationInfo.getAndroidAppInfo());
        }
    }

    private static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final DataCollectionStatusEncoder f33214a = new DataCollectionStatusEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f33215b = FieldDescriptor.of(AdExperience.PERFORMANCE);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f33216c = FieldDescriptor.of("crashlytics");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f33217d = FieldDescriptor.of("sessionSamplingRate");

        private DataCollectionStatusEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f33215b, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(f33216c, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(f33217d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    private static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ProcessDetailsEncoder f33218a = new ProcessDetailsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f33219b = FieldDescriptor.of("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f33220c = FieldDescriptor.of("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f33221d = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f33222e = FieldDescriptor.of("defaultProcess");

        private ProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f33219b, processDetails.getProcessName());
            objectEncoderContext.add(f33220c, processDetails.getPid());
            objectEncoderContext.add(f33221d, processDetails.getImportance());
            objectEncoderContext.add(f33222e, processDetails.isDefaultProcess());
        }
    }

    private static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SessionEventEncoder f33223a = new SessionEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f33224b = FieldDescriptor.of("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f33225c = FieldDescriptor.of("sessionData");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f33226d = FieldDescriptor.of("applicationInfo");

        private SessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f33224b, sessionEvent.getEventType());
            objectEncoderContext.add(f33225c, sessionEvent.getSessionData());
            objectEncoderContext.add(f33226d, sessionEvent.getApplicationInfo());
        }
    }

    private static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SessionInfoEncoder f33227a = new SessionInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f33228b = FieldDescriptor.of(JsonStorageKeyNames.SESSION_ID_KEY);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f33229c = FieldDescriptor.of("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f33230d = FieldDescriptor.of("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f33231e = FieldDescriptor.of("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f33232f = FieldDescriptor.of("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f33233g = FieldDescriptor.of("firebaseInstallationId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f33234h = FieldDescriptor.of("firebaseAuthenticationToken");

        private SessionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f33228b, sessionInfo.getSessionId());
            objectEncoderContext.add(f33229c, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(f33230d, sessionInfo.getSessionIndex());
            objectEncoderContext.add(f33231e, sessionInfo.getEventTimestampUs());
            objectEncoderContext.add(f33232f, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(f33233g, sessionInfo.getFirebaseInstallationId());
            objectEncoderContext.add(f33234h, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    private AutoSessionEventEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, SessionEventEncoder.f33223a);
        encoderConfig.registerEncoder(SessionInfo.class, SessionInfoEncoder.f33227a);
        encoderConfig.registerEncoder(DataCollectionStatus.class, DataCollectionStatusEncoder.f33214a);
        encoderConfig.registerEncoder(ApplicationInfo.class, ApplicationInfoEncoder.f33207a);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, AndroidApplicationInfoEncoder.f33200a);
        encoderConfig.registerEncoder(ProcessDetails.class, ProcessDetailsEncoder.f33218a);
    }
}
