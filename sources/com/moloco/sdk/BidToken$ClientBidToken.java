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
public final class BidToken$ClientBidToken extends GeneratedMessageLite<BidToken$ClientBidToken, a> implements MessageLiteOrBuilder {
    private static final BidToken$ClientBidToken DEFAULT_INSTANCE;
    public static final int ES_FIELD_NUMBER = 1;
    private static volatile Parser<BidToken$ClientBidToken> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private ByteString es_;
    private ByteString payload_;

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public a a(ByteString byteString) {
            copyOnWrite();
            ((BidToken$ClientBidToken) this.instance).setEs(byteString);
            return this;
        }

        public a b(ByteString byteString) {
            copyOnWrite();
            ((BidToken$ClientBidToken) this.instance).setPayload(byteString);
            return this;
        }

        private a() {
            super(BidToken$ClientBidToken.DEFAULT_INSTANCE);
        }
    }

    static {
        BidToken$ClientBidToken bidToken$ClientBidToken = new BidToken$ClientBidToken();
        DEFAULT_INSTANCE = bidToken$ClientBidToken;
        GeneratedMessageLite.registerDefaultInstance(BidToken$ClientBidToken.class, bidToken$ClientBidToken);
    }

    private BidToken$ClientBidToken() {
        ByteString byteString = ByteString.EMPTY;
        this.es_ = byteString;
        this.payload_ = byteString;
    }

    private void clearEs() {
        this.es_ = getDefaultInstance().getEs();
    }

    private void clearPayload() {
        this.payload_ = getDefaultInstance().getPayload();
    }

    public static BidToken$ClientBidToken getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidToken$ClientBidToken parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$ClientBidToken parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidToken$ClientBidToken> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEs(ByteString byteString) {
        byteString.getClass();
        this.es_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(ByteString byteString) {
        byteString.getClass();
        this.payload_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c.f54114a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$ClientBidToken();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"es_", "payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$ClientBidToken> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidToken$ClientBidToken.class) {
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

    public ByteString getEs() {
        return this.es_;
    }

    public ByteString getPayload() {
        return this.payload_;
    }

    public static a newBuilder(BidToken$ClientBidToken bidToken$ClientBidToken) {
        return DEFAULT_INSTANCE.createBuilder(bidToken$ClientBidToken);
    }

    public static BidToken$ClientBidToken parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$ClientBidToken parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidToken$ClientBidToken parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidToken$ClientBidToken parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidToken$ClientBidToken parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidToken$ClientBidToken parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidToken$ClientBidToken parseFrom(InputStream inputStream) throws IOException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$ClientBidToken parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$ClientBidToken parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidToken$ClientBidToken parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$ClientBidToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
