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
public final class MetricsRequest$SDKInitTrackingResponse extends GeneratedMessageLite<MetricsRequest$SDKInitTrackingResponse, a> implements MessageLiteOrBuilder {
    private static final MetricsRequest$SDKInitTrackingResponse DEFAULT_INSTANCE;
    private static volatile Parser<MetricsRequest$SDKInitTrackingResponse> PARSER;

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private a() {
            super(MetricsRequest$SDKInitTrackingResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        MetricsRequest$SDKInitTrackingResponse metricsRequest$SDKInitTrackingResponse = new MetricsRequest$SDKInitTrackingResponse();
        DEFAULT_INSTANCE = metricsRequest$SDKInitTrackingResponse;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$SDKInitTrackingResponse.class, metricsRequest$SDKInitTrackingResponse);
    }

    private MetricsRequest$SDKInitTrackingResponse() {
    }

    public static MetricsRequest$SDKInitTrackingResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$SDKInitTrackingResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$SDKInitTrackingResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (l.f55782a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$SDKInitTrackingResponse();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$SDKInitTrackingResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$SDKInitTrackingResponse.class) {
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

    public static a newBuilder(MetricsRequest$SDKInitTrackingResponse metricsRequest$SDKInitTrackingResponse) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$SDKInitTrackingResponse);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$SDKInitTrackingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
