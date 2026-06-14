package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsReportJsonTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DataEncoder f32649a = new JsonDataEncoderBuilder().configureWith(AutoCrashlyticsReportEncoder.CONFIG).ignoreNullValues(true).build();

    /* JADX INFO: Access modifiers changed from: private */
    interface ObjectParser<T> {
        T parse(@NonNull JsonReader jsonReader) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread A(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Thread.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    builder.setFrames(l(jsonReader, new i()));
                    break;
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.FilesPayload.File B(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.File.Builder builder = CrashlyticsReport.FilesPayload.File.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                builder.setFilename(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                builder.setContents(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.FilesPayload C(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.FilesPayload.Builder builder = CrashlyticsReport.FilesPayload.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                builder.setFiles(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.e
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object parse(JsonReader jsonReader2) {
                        return CrashlyticsReportJsonTransform.B(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                builder.setOrgId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.OperatingSystem D(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.OperatingSystem.Builder builder = CrashlyticsReport.Session.OperatingSystem.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    builder.setBuildVersion(jsonReader.nextString());
                    break;
                case "jailbroken":
                    builder.setJailbroken(jsonReader.nextBoolean());
                    break;
                case "version":
                    builder.setVersion(jsonReader.nextString());
                    break;
                case "platform":
                    builder.setPlatform(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.Session.Event.Application.ProcessDetails E(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builder = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    builder.setPid(jsonReader.nextInt());
                    break;
                case "processName":
                    builder.setProcessName(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    builder.setDefaultProcess(jsonReader.nextBoolean());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static CrashlyticsReport F(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Builder builder = CrashlyticsReport.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -2118372775:
                    if (strNextName.equals("ndkPayload")) {
                        b10 = 0;
                    }
                    break;
                case -1962630338:
                    if (strNextName.equals("sdkVersion")) {
                        b10 = 1;
                    }
                    break;
                case -1907185581:
                    if (strNextName.equals("appQualitySessionId")) {
                        b10 = 2;
                    }
                    break;
                case -1375141843:
                    if (strNextName.equals("appExitInfo")) {
                        b10 = 3;
                    }
                    break;
                case -911706486:
                    if (strNextName.equals("buildVersion")) {
                        b10 = 4;
                    }
                    break;
                case -401988390:
                    if (strNextName.equals("firebaseAuthenticationToken")) {
                        b10 = 5;
                    }
                    break;
                case 344431858:
                    if (strNextName.equals("gmpAppId")) {
                        b10 = 6;
                    }
                    break;
                case 719853845:
                    if (strNextName.equals("installationUuid")) {
                        b10 = 7;
                    }
                    break;
                case 1047652060:
                    if (strNextName.equals("firebaseInstallationId")) {
                        b10 = 8;
                    }
                    break;
                case 1874684019:
                    if (strNextName.equals("platform")) {
                        b10 = 9;
                    }
                    break;
                case 1975623094:
                    if (strNextName.equals("displayVersion")) {
                        b10 = 10;
                    }
                    break;
                case 1984987798:
                    if (strNextName.equals(com.taurusx.tax.g.b.f66095s)) {
                        b10 = Ascii.VT;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    builder.setNdkPayload(C(jsonReader));
                    break;
                case 1:
                    builder.setSdkVersion(jsonReader.nextString());
                    break;
                case 2:
                    builder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case 3:
                    builder.setAppExitInfo(k(jsonReader));
                    break;
                case 4:
                    builder.setBuildVersion(jsonReader.nextString());
                    break;
                case 5:
                    builder.setFirebaseAuthenticationToken(jsonReader.nextString());
                    break;
                case 6:
                    builder.setGmpAppId(jsonReader.nextString());
                    break;
                case 7:
                    builder.setInstallationUuid(jsonReader.nextString());
                    break;
                case 8:
                    builder.setFirebaseInstallationId(jsonReader.nextString());
                    break;
                case 9:
                    builder.setPlatform(jsonReader.nextInt());
                    break;
                case 10:
                    builder.setDisplayVersion(jsonReader.nextString());
                    break;
                case 11:
                    builder.setSession(H(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant G(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builder = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                builder.setVariantId(jsonReader.nextString());
            } else if (strNextName.equals(ConfigContainer.ROLLOUT_METADATA_ID)) {
                builder.setRolloutId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static CrashlyticsReport.Session H(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Builder builder = CrashlyticsReport.Session.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -2128794476:
                    if (strNextName.equals("startedAt")) {
                        b10 = 0;
                    }
                    break;
                case -1907185581:
                    if (strNextName.equals("appQualitySessionId")) {
                        b10 = 1;
                    }
                    break;
                case -1618432855:
                    if (strNextName.equals("identifier")) {
                        b10 = 2;
                    }
                    break;
                case -1606742899:
                    if (strNextName.equals("endedAt")) {
                        b10 = 3;
                    }
                    break;
                case -1335157162:
                    if (strNextName.equals(C4240b4.i.G)) {
                        b10 = 4;
                    }
                    break;
                case -1291329255:
                    if (strNextName.equals("events")) {
                        b10 = 5;
                    }
                    break;
                case 3556:
                    if (strNextName.equals("os")) {
                        b10 = 6;
                    }
                    break;
                case 96801:
                    if (strNextName.equals("app")) {
                        b10 = 7;
                    }
                    break;
                case 3599307:
                    if (strNextName.equals("user")) {
                        b10 = 8;
                    }
                    break;
                case 286956243:
                    if (strNextName.equals("generator")) {
                        b10 = 9;
                    }
                    break;
                case 1025385094:
                    if (strNextName.equals("crashed")) {
                        b10 = 10;
                    }
                    break;
                case 2047016109:
                    if (strNextName.equals("generatorType")) {
                        b10 = Ascii.VT;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    builder.setStartedAt(jsonReader.nextLong());
                    break;
                case 1:
                    builder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case 2:
                    builder.setIdentifierFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    builder.setEndedAt(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    builder.setDevice(o(jsonReader));
                    break;
                case 5:
                    builder.setEvents(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.d
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.p(jsonReader2);
                        }
                    }));
                    break;
                case 6:
                    builder.setOs(D(jsonReader));
                    break;
                case 7:
                    builder.setApp(j(jsonReader));
                    break;
                case 8:
                    builder.setUser(I(jsonReader));
                    break;
                case 9:
                    builder.setGenerator(jsonReader.nextString());
                    break;
                case 10:
                    builder.setCrashed(jsonReader.nextBoolean());
                    break;
                case 11:
                    builder.setGeneratorType(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.User I(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.User.Builder builder = CrashlyticsReport.Session.User.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                builder.setIdentifier(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Application j(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Application.Builder builder = CrashlyticsReport.Session.Application.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    builder.setIdentifier(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    builder.setDevelopmentPlatform(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    builder.setDevelopmentPlatformVersion(jsonReader.nextString());
                    break;
                case "version":
                    builder.setVersion(jsonReader.nextString());
                    break;
                case "installationUuid":
                    builder.setInstallationUuid(jsonReader.nextString());
                    break;
                case "displayVersion":
                    builder.setDisplayVersion(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.ApplicationExitInfo k(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.ApplicationExitInfo.Builder builder = CrashlyticsReport.ApplicationExitInfo.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    builder.setBuildIdMappingForArch(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.a
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.m(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    builder.setPid(jsonReader.nextInt());
                    break;
                case "pss":
                    builder.setPss(jsonReader.nextLong());
                    break;
                case "rss":
                    builder.setRss(jsonReader.nextLong());
                    break;
                case "timestamp":
                    builder.setTimestamp(jsonReader.nextLong());
                    break;
                case "processName":
                    builder.setProcessName(jsonReader.nextString());
                    break;
                case "reasonCode":
                    builder.setReasonCode(jsonReader.nextInt());
                    break;
                case "traceFile":
                    builder.setTraceFile(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static List l(JsonReader jsonReader, ObjectParser objectParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(objectParser.parse(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch m(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builder = CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    builder.setLibraryName(jsonReader.nextString());
                    break;
                case "arch":
                    builder.setArch(jsonReader.nextString());
                    break;
                case "buildId":
                    builder.setBuildId(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.CustomAttribute n(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.CustomAttribute.Builder builder = CrashlyticsReport.CustomAttribute.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(C4240b4.i.W)) {
                builder.setKey(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                builder.setValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Device o(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Device.Builder builder = CrashlyticsReport.Session.Device.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    builder.setSimulator(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    builder.setManufacturer(jsonReader.nextString());
                    break;
                case "ram":
                    builder.setRam(jsonReader.nextLong());
                    break;
                case "arch":
                    builder.setArch(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    builder.setDiskSpace(jsonReader.nextLong());
                    break;
                case "cores":
                    builder.setCores(jsonReader.nextInt());
                    break;
                case "model":
                    builder.setModel(jsonReader.nextString());
                    break;
                case "state":
                    builder.setState(jsonReader.nextInt());
                    break;
                case "modelClass":
                    builder.setModelClass(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.Session.Event p(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Builder builder = CrashlyticsReport.Session.Event.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    builder.setDevice(s(jsonReader));
                    break;
                case "rollouts":
                    builder.setRollouts(y(jsonReader));
                    break;
                case "app":
                    builder.setApp(q(jsonReader));
                    break;
                case "log":
                    builder.setLog(w(jsonReader));
                    break;
                case "type":
                    builder.setType(jsonReader.nextString());
                    break;
                case "timestamp":
                    builder.setTimestamp(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.Application q(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Builder builder = CrashlyticsReport.Session.Event.Application.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    builder.setAppProcessDetails(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.c
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.E(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    builder.setBackground(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    builder.setExecution(t(jsonReader));
                    break;
                case "internalKeys":
                    builder.setInternalKeys(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.b
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.n(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    builder.setCustomAttributes(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.b
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.n(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    builder.setUiOrientation(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    builder.setCurrentProcessDetails(E(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.Session.Event.Application.Execution.BinaryImage r(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                case "size":
                    builder.setSize(jsonReader.nextLong());
                    break;
                case "uuid":
                    builder.setUuidFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    builder.setBaseAddress(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.Device s(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Device.Builder builder = CrashlyticsReport.Session.Event.Device.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    builder.setBatteryLevel(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    builder.setBatteryVelocity(jsonReader.nextInt());
                    break;
                case "orientation":
                    builder.setOrientation(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    builder.setDiskUsed(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    builder.setRamUsed(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    builder.setProximityOn(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.Application.Execution t(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    builder.setAppExitInfo(k(jsonReader));
                    break;
                case "threads":
                    builder.setThreads(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.g
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.A(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    builder.setSignal(z(jsonReader));
                    break;
                case "binaries":
                    builder.setBinaries(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.h
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final Object parse(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform.r(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    builder.setException(u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.Application.Execution.Exception u(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    builder.setFrames(l(jsonReader, new i()));
                    break;
                case "reason":
                    builder.setReason(jsonReader.nextString());
                    break;
                case "type":
                    builder.setType(jsonReader.nextString());
                    break;
                case "causedBy":
                    builder.setCausedBy(u(jsonReader));
                    break;
                case "overflowCount":
                    builder.setOverflowCount(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame v(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    builder.setOffset(jsonReader.nextLong());
                    break;
                case "symbol":
                    builder.setSymbol(jsonReader.nextString());
                    break;
                case "pc":
                    builder.setPc(jsonReader.nextLong());
                    break;
                case "file":
                    builder.setFile(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.Log w(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Log.Builder builder = CrashlyticsReport.Session.Event.Log.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                builder.setContent(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CrashlyticsReport.Session.Event.RolloutAssignment x(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutAssignment.Builder builder = CrashlyticsReport.Session.Event.RolloutAssignment.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    builder.setParameterKey(jsonReader.nextString());
                    break;
                case "templateVersion":
                    builder.setTemplateVersion(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    builder.setRolloutVariant(G(jsonReader));
                    break;
                case "parameterValue":
                    builder.setParameterValue(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.RolloutsState y(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.RolloutsState.Builder builder = CrashlyticsReport.Session.Event.RolloutsState.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                builder.setRolloutAssignments(l(jsonReader, new ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.f
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final Object parse(JsonReader jsonReader2) {
                        return CrashlyticsReportJsonTransform.x(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static CrashlyticsReport.Session.Event.Application.Execution.Signal z(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Signal.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    builder.setAddress(jsonReader.nextLong());
                    break;
                case "code":
                    builder.setCode(jsonReader.nextString());
                    break;
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @NonNull
    public CrashlyticsReport.ApplicationExitInfo applicationExitInfoFromJson(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfoK = k(jsonReader);
                jsonReader.close();
                return applicationExitInfoK;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    @NonNull
    public String applicationExitInfoToJson(@NonNull CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return f32649a.encode(applicationExitInfo);
    }

    @NonNull
    public CrashlyticsReport.Session.Event eventFromJson(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport.Session.Event eventP = p(jsonReader);
                jsonReader.close();
                return eventP;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    @NonNull
    public String eventToJson(@NonNull CrashlyticsReport.Session.Event event) {
        return f32649a.encode(event);
    }

    @NonNull
    public CrashlyticsReport reportFromJson(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport crashlyticsReportF = F(jsonReader);
                jsonReader.close();
                return crashlyticsReportF;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    @NonNull
    public String reportToJson(@NonNull CrashlyticsReport crashlyticsReport) {
        return f32649a.encode(crashlyticsReport);
    }
}
