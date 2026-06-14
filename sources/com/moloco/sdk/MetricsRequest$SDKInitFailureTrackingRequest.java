package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class MetricsRequest$SDKInitFailureTrackingRequest extends GeneratedMessageLite<MetricsRequest$SDKInitFailureTrackingRequest, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_ERROR_FIELD_NUMBER = 2;
    private static final MetricsRequest$SDKInitFailureTrackingRequest DEFAULT_INSTANCE;
    private static volatile Parser<MetricsRequest$SDKInitFailureTrackingRequest> PARSER = null;
    public static final int SERVER_ERROR_FIELD_NUMBER = 1;
    private int errorTypeCase_ = 0;
    private Object errorType_;

    public static final class ClientError extends GeneratedMessageLite<ClientError, a> implements MessageLiteOrBuilder {
        public static final int CLIENT_FAILURE_TYPE_FIELD_NUMBER = 1;
        private static final ClientError DEFAULT_INSTANCE;
        private static volatile Parser<ClientError> PARSER;
        private int bitField0_;
        private int clientFailureType_;

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            public a a(b bVar) {
                copyOnWrite();
                ((ClientError) this.instance).setClientFailureType(bVar);
                return this;
            }

            private a() {
                super(ClientError.DEFAULT_INSTANCE);
            }
        }

        public enum b implements Internal.EnumLite {
            UNKNOWN(0),
            HTTP_SSL_ERROR(1),
            HTTP_UKNOWN_HOST(2),
            HTTP_REQUEST_TIMEOUT(3),
            HTTP_SOCKET(4),
            ANDROID_WORK_MANAGER_ISSUE(5),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53860j = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53862b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public b findValueByNumber(int i10) {
                    return b.g(i10);
                }
            }

            b(int i10) {
                this.f53862b = i10;
            }

            public static b g(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return HTTP_SSL_ERROR;
                }
                if (i10 == 2) {
                    return HTTP_UKNOWN_HOST;
                }
                if (i10 == 3) {
                    return HTTP_REQUEST_TIMEOUT;
                }
                if (i10 == 4) {
                    return HTTP_SOCKET;
                }
                if (i10 != 5) {
                    return null;
                }
                return ANDROID_WORK_MANAGER_ISSUE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f53862b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            ClientError clientError = new ClientError();
            DEFAULT_INSTANCE = clientError;
            GeneratedMessageLite.registerDefaultInstance(ClientError.class, clientError);
        }

        private ClientError() {
        }

        private void clearClientFailureType() {
            this.bitField0_ &= -2;
            this.clientFailureType_ = 0;
        }

        public static ClientError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClientError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientFailureType(b bVar) {
            this.clientFailureType_ = bVar.getNumber();
            this.bitField0_ |= 1;
        }

        private void setClientFailureTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.clientFailureType_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (l.f55782a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientError();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "clientFailureType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientError> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClientError.class) {
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

        public b getClientFailureType() {
            b bVarG = b.g(this.clientFailureType_);
            return bVarG == null ? b.UNRECOGNIZED : bVarG;
        }

        public int getClientFailureTypeValue() {
            return this.clientFailureType_;
        }

        public boolean hasClientFailureType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(ClientError clientError) {
            return DEFAULT_INSTANCE.createBuilder(clientError);
        }

        public static ClientError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientError parseFrom(InputStream inputStream) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientError parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ServerError extends GeneratedMessageLite<ServerError, a> implements MessageLiteOrBuilder {
        private static final ServerError DEFAULT_INSTANCE;
        private static volatile Parser<ServerError> PARSER = null;
        public static final int SERVER_HTTP_STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int serverHttpStatus_;

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            public a a(int i10) {
                copyOnWrite();
                ((ServerError) this.instance).setServerHttpStatus(i10);
                return this;
            }

            private a() {
                super(ServerError.DEFAULT_INSTANCE);
            }
        }

        static {
            ServerError serverError = new ServerError();
            DEFAULT_INSTANCE = serverError;
            GeneratedMessageLite.registerDefaultInstance(ServerError.class, serverError);
        }

        private ServerError() {
        }

        private void clearServerHttpStatus() {
            this.bitField0_ &= -2;
            this.serverHttpStatus_ = 0;
        }

        public static ServerError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ServerError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServerError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ServerError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerHttpStatus(int i10) {
            this.bitField0_ |= 1;
            this.serverHttpStatus_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (l.f55782a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServerError();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "serverHttpStatus_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ServerError> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ServerError.class) {
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

        public int getServerHttpStatus() {
            return this.serverHttpStatus_;
        }

        public boolean hasServerHttpStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(ServerError serverError) {
            return DEFAULT_INSTANCE.createBuilder(serverError);
        }

        public static ServerError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServerError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ServerError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ServerError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ServerError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServerError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ServerError parseFrom(InputStream inputStream) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServerError parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ServerError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public a a(ClientError clientError) {
            copyOnWrite();
            ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).setClientError(clientError);
            return this;
        }

        public a b(ServerError serverError) {
            copyOnWrite();
            ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).setServerError(serverError);
            return this;
        }

        private a() {
            super(MetricsRequest$SDKInitFailureTrackingRequest.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        SERVER_ERROR(1),
        CLIENT_ERROR(2),
        ERRORTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53867b;

        b(int i10) {
            this.f53867b = i10;
        }

        public static b g(int i10) {
            if (i10 == 0) {
                return ERRORTYPE_NOT_SET;
            }
            if (i10 == 1) {
                return SERVER_ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return CLIENT_ERROR;
        }
    }

    static {
        MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest = new MetricsRequest$SDKInitFailureTrackingRequest();
        DEFAULT_INSTANCE = metricsRequest$SDKInitFailureTrackingRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$SDKInitFailureTrackingRequest.class, metricsRequest$SDKInitFailureTrackingRequest);
    }

    private MetricsRequest$SDKInitFailureTrackingRequest() {
    }

    private void clearClientError() {
        if (this.errorTypeCase_ == 2) {
            this.errorTypeCase_ = 0;
            this.errorType_ = null;
        }
    }

    private void clearErrorType() {
        this.errorTypeCase_ = 0;
        this.errorType_ = null;
    }

    private void clearServerError() {
        if (this.errorTypeCase_ == 1) {
            this.errorTypeCase_ = 0;
            this.errorType_ = null;
        }
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClientError(ClientError clientError) {
        clientError.getClass();
        if (this.errorTypeCase_ != 2 || this.errorType_ == ClientError.getDefaultInstance()) {
            this.errorType_ = clientError;
        } else {
            this.errorType_ = ((ClientError.a) ClientError.newBuilder((ClientError) this.errorType_).mergeFrom(clientError)).buildPartial();
        }
        this.errorTypeCase_ = 2;
    }

    private void mergeServerError(ServerError serverError) {
        serverError.getClass();
        if (this.errorTypeCase_ != 1 || this.errorType_ == ServerError.getDefaultInstance()) {
            this.errorType_ = serverError;
        } else {
            this.errorType_ = ((ServerError.a) ServerError.newBuilder((ServerError) this.errorType_).mergeFrom(serverError)).buildPartial();
        }
        this.errorTypeCase_ = 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$SDKInitFailureTrackingRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientError(ClientError clientError) {
        clientError.getClass();
        this.errorType_ = clientError;
        this.errorTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerError(ServerError serverError) {
        serverError.getClass();
        this.errorType_ = serverError;
        this.errorTypeCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (l.f55782a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$SDKInitFailureTrackingRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"errorType_", "errorTypeCase_", ServerError.class, ClientError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$SDKInitFailureTrackingRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$SDKInitFailureTrackingRequest.class) {
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

    public ClientError getClientError() {
        return this.errorTypeCase_ == 2 ? (ClientError) this.errorType_ : ClientError.getDefaultInstance();
    }

    public b getErrorTypeCase() {
        return b.g(this.errorTypeCase_);
    }

    public ServerError getServerError() {
        return this.errorTypeCase_ == 1 ? (ServerError) this.errorType_ : ServerError.getDefaultInstance();
    }

    public boolean hasClientError() {
        return this.errorTypeCase_ == 2;
    }

    public boolean hasServerError() {
        return this.errorTypeCase_ == 1;
    }

    public static a newBuilder(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$SDKInitFailureTrackingRequest);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
