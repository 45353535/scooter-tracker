package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    private static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ClientMetricsEncoder f24284a = new ClientMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24285b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24286c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final FieldDescriptor f24287d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FieldDescriptor f24288e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        private ClientMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24285b, clientMetrics.getWindowInternal());
            objectEncoderContext.add(f24286c, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(f24287d, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(f24288e, clientMetrics.getAppNamespace());
        }
    }

    private static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final GlobalMetricsEncoder f24289a = new GlobalMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24290b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private GlobalMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24290b, globalMetrics.getStorageMetricsInternal());
        }
    }

    private static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final LogEventDroppedEncoder f24291a = new LogEventDroppedEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24292b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24293c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        private LogEventDroppedEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24292b, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(f24293c, logEventDropped.getReason());
        }
    }

    private static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final LogSourceMetricsEncoder f24294a = new LogSourceMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24295b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24296c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private LogSourceMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24295b, logSourceMetrics.getLogSource());
            objectEncoderContext.add(f24296c, logSourceMetrics.getLogEventDroppedList());
        }
    }

    private static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ProtoEncoderDoNotUseEncoder f24297a = new ProtoEncoderDoNotUseEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24298b = FieldDescriptor.of("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24298b, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    private static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final StorageMetricsEncoder f24299a = new StorageMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24300b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24301c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private StorageMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24300b, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(f24301c, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    private static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final TimeWindowEncoder f24302a = new TimeWindowEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final FieldDescriptor f24303b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final FieldDescriptor f24304c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private TimeWindowEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24303b, timeWindow.getStartMs());
            objectEncoderContext.add(f24304c, timeWindow.getEndMs());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f24297a);
        encoderConfig.registerEncoder(ClientMetrics.class, ClientMetricsEncoder.f24284a);
        encoderConfig.registerEncoder(TimeWindow.class, TimeWindowEncoder.f24302a);
        encoderConfig.registerEncoder(LogSourceMetrics.class, LogSourceMetricsEncoder.f24294a);
        encoderConfig.registerEncoder(LogEventDropped.class, LogEventDroppedEncoder.f24291a);
        encoderConfig.registerEncoder(GlobalMetrics.class, GlobalMetricsEncoder.f24289a);
        encoderConfig.registerEncoder(StorageMetrics.class, StorageMetricsEncoder.f24299a);
    }
}
