package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;
import com.moloco.sdk.MetricsRequest$SDKInitSuccessTrackingRequest;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class MetricsRequest$SDKInitTrackingRequest extends GeneratedMessageLite<MetricsRequest$SDKInitTrackingRequest, a> implements MessageLiteOrBuilder {
    private static final MetricsRequest$SDKInitTrackingRequest DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 2;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile Parser<MetricsRequest$SDKInitTrackingRequest> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int initStatusCase_ = 0;
    private Object initStatus_;
    private long latencyMs_;

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public a a(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
            copyOnWrite();
            ((MetricsRequest$SDKInitTrackingRequest) this.instance).setFailure(metricsRequest$SDKInitFailureTrackingRequest);
            return this;
        }

        public a b(long j10) {
            copyOnWrite();
            ((MetricsRequest$SDKInitTrackingRequest) this.instance).setLatencyMs(j10);
            return this;
        }

        public a c(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
            copyOnWrite();
            ((MetricsRequest$SDKInitTrackingRequest) this.instance).setSuccess(metricsRequest$SDKInitSuccessTrackingRequest);
            return this;
        }

        private a() {
            super(MetricsRequest$SDKInitTrackingRequest.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        SUCCESS(1),
        FAILURE(2),
        INITSTATUS_NOT_SET(0);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53872b;

        b(int i10) {
            this.f53872b = i10;
        }

        public static b g(int i10) {
            if (i10 == 0) {
                return INITSTATUS_NOT_SET;
            }
            if (i10 == 1) {
                return SUCCESS;
            }
            if (i10 != 2) {
                return null;
            }
            return FAILURE;
        }
    }

    static {
        MetricsRequest$SDKInitTrackingRequest metricsRequest$SDKInitTrackingRequest = new MetricsRequest$SDKInitTrackingRequest();
        DEFAULT_INSTANCE = metricsRequest$SDKInitTrackingRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$SDKInitTrackingRequest.class, metricsRequest$SDKInitTrackingRequest);
    }

    private MetricsRequest$SDKInitTrackingRequest() {
    }

    private void clearFailure() {
        if (this.initStatusCase_ == 2) {
            this.initStatusCase_ = 0;
            this.initStatus_ = null;
        }
    }

    private void clearInitStatus() {
        this.initStatusCase_ = 0;
        this.initStatus_ = null;
    }

    private void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    private void clearSuccess() {
        if (this.initStatusCase_ == 1) {
            this.initStatusCase_ = 0;
            this.initStatus_ = null;
        }
    }

    public static MetricsRequest$SDKInitTrackingRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeFailure(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        metricsRequest$SDKInitFailureTrackingRequest.getClass();
        if (this.initStatusCase_ != 2 || this.initStatus_ == MetricsRequest$SDKInitFailureTrackingRequest.getDefaultInstance()) {
            this.initStatus_ = metricsRequest$SDKInitFailureTrackingRequest;
        } else {
            this.initStatus_ = ((MetricsRequest$SDKInitFailureTrackingRequest.a) MetricsRequest$SDKInitFailureTrackingRequest.newBuilder((MetricsRequest$SDKInitFailureTrackingRequest) this.initStatus_).mergeFrom(metricsRequest$SDKInitFailureTrackingRequest)).buildPartial();
        }
        this.initStatusCase_ = 2;
    }

    private void mergeSuccess(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
        metricsRequest$SDKInitSuccessTrackingRequest.getClass();
        if (this.initStatusCase_ != 1 || this.initStatus_ == MetricsRequest$SDKInitSuccessTrackingRequest.getDefaultInstance()) {
            this.initStatus_ = metricsRequest$SDKInitSuccessTrackingRequest;
        } else {
            this.initStatus_ = ((MetricsRequest$SDKInitSuccessTrackingRequest.a) MetricsRequest$SDKInitSuccessTrackingRequest.newBuilder((MetricsRequest$SDKInitSuccessTrackingRequest) this.initStatus_).mergeFrom(metricsRequest$SDKInitSuccessTrackingRequest)).buildPartial();
        }
        this.initStatusCase_ = 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$SDKInitTrackingRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$SDKInitTrackingRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailure(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        metricsRequest$SDKInitFailureTrackingRequest.getClass();
        this.initStatus_ = metricsRequest$SDKInitFailureTrackingRequest;
        this.initStatusCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j10) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
        metricsRequest$SDKInitSuccessTrackingRequest.getClass();
        this.initStatus_ = metricsRequest$SDKInitSuccessTrackingRequest;
        this.initStatusCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (l.f55782a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$SDKInitTrackingRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဃ\u0000", new Object[]{"initStatus_", "initStatusCase_", "bitField0_", MetricsRequest$SDKInitSuccessTrackingRequest.class, MetricsRequest$SDKInitFailureTrackingRequest.class, "latencyMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$SDKInitTrackingRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$SDKInitTrackingRequest.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public MetricsRequest$SDKInitFailureTrackingRequest getFailure() {
        return this.initStatusCase_ == 2 ? (MetricsRequest$SDKInitFailureTrackingRequest) this.initStatus_ : MetricsRequest$SDKInitFailureTrackingRequest.getDefaultInstance();
    }

    public b getInitStatusCase() {
        return b.g(this.initStatusCase_);
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public MetricsRequest$SDKInitSuccessTrackingRequest getSuccess() {
        return this.initStatusCase_ == 1 ? (MetricsRequest$SDKInitSuccessTrackingRequest) this.initStatus_ : MetricsRequest$SDKInitSuccessTrackingRequest.getDefaultInstance();
    }

    public boolean hasFailure() {
        return this.initStatusCase_ == 2;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSuccess() {
        return this.initStatusCase_ == 1;
    }

    public static a newBuilder(MetricsRequest$SDKInitTrackingRequest metricsRequest$SDKInitTrackingRequest) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$SDKInitTrackingRequest);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
