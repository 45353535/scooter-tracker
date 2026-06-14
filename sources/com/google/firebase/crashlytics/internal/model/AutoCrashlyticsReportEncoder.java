package com.google.firebase.crashlytics.internal.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.ironsource.C4240b4;
import com.taurusx.tax.g.b;
import com.taurusx.tax.y.z.w.s;
import io.appmetrica.analytics.impl.H2;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoCrashlyticsReportEncoder();

    private static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder f32225a = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32226b = FieldDescriptor.of("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32227c = FieldDescriptor.of("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32228d = FieldDescriptor.of("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32226b, buildIdMappingForArch.getArch());
            objectEncoderContext.add(f32227c, buildIdMappingForArch.getLibraryName());
            objectEncoderContext.add(f32228d, buildIdMappingForArch.getBuildId());
        }
    }

    private static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportApplicationExitInfoEncoder f32229a = new CrashlyticsReportApplicationExitInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32230b = FieldDescriptor.of("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32231c = FieldDescriptor.of("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32232d = FieldDescriptor.of("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32233e = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32234f = FieldDescriptor.of("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32235g = FieldDescriptor.of("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f32236h = FieldDescriptor.of("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final FieldDescriptor f32237i = FieldDescriptor.of("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final FieldDescriptor f32238j = FieldDescriptor.of("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32230b, applicationExitInfo.getPid());
            objectEncoderContext.add(f32231c, applicationExitInfo.getProcessName());
            objectEncoderContext.add(f32232d, applicationExitInfo.getReasonCode());
            objectEncoderContext.add(f32233e, applicationExitInfo.getImportance());
            objectEncoderContext.add(f32234f, applicationExitInfo.getPss());
            objectEncoderContext.add(f32235g, applicationExitInfo.getRss());
            objectEncoderContext.add(f32236h, applicationExitInfo.getTimestamp());
            objectEncoderContext.add(f32237i, applicationExitInfo.getTraceFile());
            objectEncoderContext.add(f32238j, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    private static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportCustomAttributeEncoder f32239a = new CrashlyticsReportCustomAttributeEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32240b = FieldDescriptor.of(C4240b4.i.W);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32241c = FieldDescriptor.of("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32240b, customAttribute.getKey());
            objectEncoderContext.add(f32241c, customAttribute.getValue());
        }
    }

    private static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportEncoder f32242a = new CrashlyticsReportEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32243b = FieldDescriptor.of("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32244c = FieldDescriptor.of("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32245d = FieldDescriptor.of("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32246e = FieldDescriptor.of("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32247f = FieldDescriptor.of("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32248g = FieldDescriptor.of("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f32249h = FieldDescriptor.of("appQualitySessionId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final FieldDescriptor f32250i = FieldDescriptor.of("buildVersion");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final FieldDescriptor f32251j = FieldDescriptor.of("displayVersion");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final FieldDescriptor f32252k = FieldDescriptor.of(b.f66095s);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final FieldDescriptor f32253l = FieldDescriptor.of("ndkPayload");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final FieldDescriptor f32254m = FieldDescriptor.of("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32243b, crashlyticsReport.getSdkVersion());
            objectEncoderContext.add(f32244c, crashlyticsReport.getGmpAppId());
            objectEncoderContext.add(f32245d, crashlyticsReport.getPlatform());
            objectEncoderContext.add(f32246e, crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add(f32247f, crashlyticsReport.getFirebaseInstallationId());
            objectEncoderContext.add(f32248g, crashlyticsReport.getFirebaseAuthenticationToken());
            objectEncoderContext.add(f32249h, crashlyticsReport.getAppQualitySessionId());
            objectEncoderContext.add(f32250i, crashlyticsReport.getBuildVersion());
            objectEncoderContext.add(f32251j, crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add(f32252k, crashlyticsReport.getSession());
            objectEncoderContext.add(f32253l, crashlyticsReport.getNdkPayload());
            objectEncoderContext.add(f32254m, crashlyticsReport.getAppExitInfo());
        }
    }

    private static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportFilesPayloadEncoder f32255a = new CrashlyticsReportFilesPayloadEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32256b = FieldDescriptor.of("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32257c = FieldDescriptor.of("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32256b, filesPayload.getFiles());
            objectEncoderContext.add(f32257c, filesPayload.getOrgId());
        }
    }

    private static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportFilesPayloadFileEncoder f32258a = new CrashlyticsReportFilesPayloadFileEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32259b = FieldDescriptor.of("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32260c = FieldDescriptor.of("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32259b, file.getFilename());
            objectEncoderContext.add(f32260c, file.getContents());
        }
    }

    private static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionApplicationEncoder f32261a = new CrashlyticsReportSessionApplicationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32262b = FieldDescriptor.of("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32263c = FieldDescriptor.of("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32264d = FieldDescriptor.of("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32265e = FieldDescriptor.of("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32266f = FieldDescriptor.of("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32267g = FieldDescriptor.of("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f32268h = FieldDescriptor.of("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32262b, application.getIdentifier());
            objectEncoderContext.add(f32263c, application.getVersion());
            objectEncoderContext.add(f32264d, application.getDisplayVersion());
            objectEncoderContext.add(f32265e, application.getOrganization());
            objectEncoderContext.add(f32266f, application.getInstallationUuid());
            objectEncoderContext.add(f32267g, application.getDevelopmentPlatform());
            objectEncoderContext.add(f32268h, application.getDevelopmentPlatformVersion());
        }
    }

    private static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionApplicationOrganizationEncoder f32269a = new CrashlyticsReportSessionApplicationOrganizationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32270b = FieldDescriptor.of("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32270b, organization.getClsId());
        }
    }

    private static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionDeviceEncoder f32271a = new CrashlyticsReportSessionDeviceEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32272b = FieldDescriptor.of("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32273c = FieldDescriptor.of("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32274d = FieldDescriptor.of("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32275e = FieldDescriptor.of("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32276f = FieldDescriptor.of("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32277g = FieldDescriptor.of("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f32278h = FieldDescriptor.of("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final FieldDescriptor f32279i = FieldDescriptor.of(CommonUrlParts.MANUFACTURER);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final FieldDescriptor f32280j = FieldDescriptor.of("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32272b, device.getArch());
            objectEncoderContext.add(f32273c, device.getModel());
            objectEncoderContext.add(f32274d, device.getCores());
            objectEncoderContext.add(f32275e, device.getRam());
            objectEncoderContext.add(f32276f, device.getDiskSpace());
            objectEncoderContext.add(f32277g, device.isSimulator());
            objectEncoderContext.add(f32278h, device.getState());
            objectEncoderContext.add(f32279i, device.getManufacturer());
            objectEncoderContext.add(f32280j, device.getModelClass());
        }
    }

    private static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEncoder f32281a = new CrashlyticsReportSessionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32282b = FieldDescriptor.of("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32283c = FieldDescriptor.of("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32284d = FieldDescriptor.of("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32285e = FieldDescriptor.of("startedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32286f = FieldDescriptor.of("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32287g = FieldDescriptor.of("crashed");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f32288h = FieldDescriptor.of("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final FieldDescriptor f32289i = FieldDescriptor.of("user");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final FieldDescriptor f32290j = FieldDescriptor.of("os");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final FieldDescriptor f32291k = FieldDescriptor.of(C4240b4.i.G);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final FieldDescriptor f32292l = FieldDescriptor.of("events");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final FieldDescriptor f32293m = FieldDescriptor.of("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32282b, session.getGenerator());
            objectEncoderContext.add(f32283c, session.getIdentifierUtf8Bytes());
            objectEncoderContext.add(f32284d, session.getAppQualitySessionId());
            objectEncoderContext.add(f32285e, session.getStartedAt());
            objectEncoderContext.add(f32286f, session.getEndedAt());
            objectEncoderContext.add(f32287g, session.isCrashed());
            objectEncoderContext.add(f32288h, session.getApp());
            objectEncoderContext.add(f32289i, session.getUser());
            objectEncoderContext.add(f32290j, session.getOs());
            objectEncoderContext.add(f32291k, session.getDevice());
            objectEncoderContext.add(f32292l, session.getEvents());
            objectEncoderContext.add(f32293m, session.getGeneratorType());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationEncoder f32294a = new CrashlyticsReportSessionEventApplicationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32295b = FieldDescriptor.of("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32296c = FieldDescriptor.of("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32297d = FieldDescriptor.of("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32298e = FieldDescriptor.of(H2.f75840g);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32299f = FieldDescriptor.of("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32300g = FieldDescriptor.of("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final FieldDescriptor f32301h = FieldDescriptor.of("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32295b, application.getExecution());
            objectEncoderContext.add(f32296c, application.getCustomAttributes());
            objectEncoderContext.add(f32297d, application.getInternalKeys());
            objectEncoderContext.add(f32298e, application.getBackground());
            objectEncoderContext.add(f32299f, application.getCurrentProcessDetails());
            objectEncoderContext.add(f32300g, application.getAppProcessDetails());
            objectEncoderContext.add(f32301h, application.getUiOrientation());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder f32302a = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32303b = FieldDescriptor.of("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32304c = FieldDescriptor.of("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32305d = FieldDescriptor.of("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32306e = FieldDescriptor.of(CommonUrlParts.UUID);

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32303b, binaryImage.getBaseAddress());
            objectEncoderContext.add(f32304c, binaryImage.getSize());
            objectEncoderContext.add(f32305d, binaryImage.getName());
            objectEncoderContext.add(f32306e, binaryImage.getUuidUtf8Bytes());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder f32307a = new CrashlyticsReportSessionEventApplicationExecutionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32308b = FieldDescriptor.of("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32309c = FieldDescriptor.of("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32310d = FieldDescriptor.of("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32311e = FieldDescriptor.of("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32312f = FieldDescriptor.of("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32308b, execution.getThreads());
            objectEncoderContext.add(f32309c, execution.getException());
            objectEncoderContext.add(f32310d, execution.getAppExitInfo());
            objectEncoderContext.add(f32311e, execution.getSignal());
            objectEncoderContext.add(f32312f, execution.getBinaries());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder f32313a = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32314b = FieldDescriptor.of("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32315c = FieldDescriptor.of("reason");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32316d = FieldDescriptor.of(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32317e = FieldDescriptor.of("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32318f = FieldDescriptor.of("overflowCount");

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32314b, exception.getType());
            objectEncoderContext.add(f32315c, exception.getReason());
            objectEncoderContext.add(f32316d, exception.getFrames());
            objectEncoderContext.add(f32317e, exception.getCausedBy());
            objectEncoderContext.add(f32318f, exception.getOverflowCount());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder f32319a = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32320b = FieldDescriptor.of("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32321c = FieldDescriptor.of("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32322d = FieldDescriptor.of("address");

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32320b, signal.getName());
            objectEncoderContext.add(f32321c, signal.getCode());
            objectEncoderContext.add(f32322d, signal.getAddress());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder f32323a = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32324b = FieldDescriptor.of("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32325c = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32326d = FieldDescriptor.of(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32324b, thread.getName());
            objectEncoderContext.add(f32325c, thread.getImportance());
            objectEncoderContext.add(f32326d, thread.getFrames());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder f32327a = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32328b = FieldDescriptor.of(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32329c = FieldDescriptor.of("symbol");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32330d = FieldDescriptor.of(C4240b4.i.f42616b);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32331e = FieldDescriptor.of("offset");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32332f = FieldDescriptor.of("importance");

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32328b, frame.getPc());
            objectEncoderContext.add(f32329c, frame.getSymbol());
            objectEncoderContext.add(f32330d, frame.getFile());
            objectEncoderContext.add(f32331e, frame.getOffset());
            objectEncoderContext.add(f32332f, frame.getImportance());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder f32333a = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32334b = FieldDescriptor.of("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32335c = FieldDescriptor.of("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32336d = FieldDescriptor.of("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32337e = FieldDescriptor.of("defaultProcess");

        private CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32334b, processDetails.getProcessName());
            objectEncoderContext.add(f32335c, processDetails.getPid());
            objectEncoderContext.add(f32336d, processDetails.getImportance());
            objectEncoderContext.add(f32337e, processDetails.isDefaultProcess());
        }
    }

    private static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventDeviceEncoder f32338a = new CrashlyticsReportSessionEventDeviceEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32339b = FieldDescriptor.of(C4240b4.j.Y);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32340c = FieldDescriptor.of("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32341d = FieldDescriptor.of("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32342e = FieldDescriptor.of("orientation");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32343f = FieldDescriptor.of("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32344g = FieldDescriptor.of("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32339b, device.getBatteryLevel());
            objectEncoderContext.add(f32340c, device.getBatteryVelocity());
            objectEncoderContext.add(f32341d, device.isProximityOn());
            objectEncoderContext.add(f32342e, device.getOrientation());
            objectEncoderContext.add(f32343f, device.getRamUsed());
            objectEncoderContext.add(f32344g, device.getDiskUsed());
        }
    }

    private static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventEncoder f32345a = new CrashlyticsReportSessionEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32346b = FieldDescriptor.of("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32347c = FieldDescriptor.of("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32348d = FieldDescriptor.of("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32349e = FieldDescriptor.of(C4240b4.i.G);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final FieldDescriptor f32350f = FieldDescriptor.of(s.z.f67719y);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final FieldDescriptor f32351g = FieldDescriptor.of("rollouts");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32346b, event.getTimestamp());
            objectEncoderContext.add(f32347c, event.getType());
            objectEncoderContext.add(f32348d, event.getApp());
            objectEncoderContext.add(f32349e, event.getDevice());
            objectEncoderContext.add(f32350f, event.getLog());
            objectEncoderContext.add(f32351g, event.getRollouts());
        }
    }

    private static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventLogEncoder f32352a = new CrashlyticsReportSessionEventLogEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32353b = FieldDescriptor.of("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32353b, log.getContent());
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventRolloutAssignmentEncoder f32354a = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32355b = FieldDescriptor.of("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32356c = FieldDescriptor.of("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32357d = FieldDescriptor.of("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32358e = FieldDescriptor.of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32355b, rolloutAssignment.getRolloutVariant());
            objectEncoderContext.add(f32356c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f32357d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f32358e, rolloutAssignment.getTemplateVersion());
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder f32359a = new CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32360b = FieldDescriptor.of(ConfigContainer.ROLLOUT_METADATA_ID);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32361c = FieldDescriptor.of("variantId");

        private CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32360b, rolloutVariant.getRolloutId());
            objectEncoderContext.add(f32361c, rolloutVariant.getVariantId());
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionEventRolloutsStateEncoder f32362a = new CrashlyticsReportSessionEventRolloutsStateEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32363b = FieldDescriptor.of("assignments");

        private CrashlyticsReportSessionEventRolloutsStateEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.RolloutsState rolloutsState, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32363b, rolloutsState.getRolloutAssignments());
        }
    }

    private static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionOperatingSystemEncoder f32364a = new CrashlyticsReportSessionOperatingSystemEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32365b = FieldDescriptor.of("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f32366c = FieldDescriptor.of("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f32367d = FieldDescriptor.of("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f32368e = FieldDescriptor.of("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32365b, operatingSystem.getPlatform());
            objectEncoderContext.add(f32366c, operatingSystem.getVersion());
            objectEncoderContext.add(f32367d, operatingSystem.getBuildVersion());
            objectEncoderContext.add(f32368e, operatingSystem.isJailbroken());
        }
    }

    private static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final CrashlyticsReportSessionUserEncoder f32369a = new CrashlyticsReportSessionUserEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f32370b = FieldDescriptor.of("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f32370b, user.getIdentifier());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.f32242a;
        encoderConfig.registerEncoder(CrashlyticsReport.class, crashlyticsReportEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.f32281a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.f32261a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.f32269a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.f32369a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.f32364a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.f32271a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.f32345a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.f32294a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.f32307a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.f32323a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.f32327a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.f32313a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.f32229a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.f32225a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.f32319a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.f32302a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.f32239a;
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.f32333a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.f32338a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.f32352a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.f32362a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.f32354a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.f32359a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.f32255a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.f32258a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
