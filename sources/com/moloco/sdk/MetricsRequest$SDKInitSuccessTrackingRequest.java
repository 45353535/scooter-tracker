package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class MetricsRequest$SDKInitSuccessTrackingRequest extends GeneratedMessageLite<MetricsRequest$SDKInitSuccessTrackingRequest, a> implements MessageLiteOrBuilder {
    private static final MetricsRequest$SDKInitSuccessTrackingRequest DEFAULT_INSTANCE;
    private static volatile Parser<MetricsRequest$SDKInitSuccessTrackingRequest> PARSER;

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private a() {
            super(MetricsRequest$SDKInitSuccessTrackingRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest = new MetricsRequest$SDKInitSuccessTrackingRequest();
        DEFAULT_INSTANCE = metricsRequest$SDKInitSuccessTrackingRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$SDKInitSuccessTrackingRequest.class, metricsRequest$SDKInitSuccessTrackingRequest);
    }

    private MetricsRequest$SDKInitSuccessTrackingRequest() {
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$SDKInitSuccessTrackingRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (l.f55782a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$SDKInitSuccessTrackingRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$SDKInitSuccessTrackingRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$SDKInitSuccessTrackingRequest.class) {
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

    public static a newBuilder(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$SDKInitSuccessTrackingRequest);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$SDKInitSuccessTrackingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitSuccessTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
