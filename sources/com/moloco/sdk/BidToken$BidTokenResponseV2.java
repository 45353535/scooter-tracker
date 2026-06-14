package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
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
public final class BidToken$BidTokenResponseV2 extends GeneratedMessageLite<BidToken$BidTokenResponseV2, a> implements MessageLiteOrBuilder {
    public static final int BID_TOKEN_FIELD_NUMBER = 1;
    private static final BidToken$BidTokenResponseV2 DEFAULT_INSTANCE;
    private static volatile Parser<BidToken$BidTokenResponseV2> PARSER;
    private String bidToken_ = "";

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private a() {
            super(BidToken$BidTokenResponseV2.DEFAULT_INSTANCE);
        }
    }

    static {
        BidToken$BidTokenResponseV2 bidToken$BidTokenResponseV2 = new BidToken$BidTokenResponseV2();
        DEFAULT_INSTANCE = bidToken$BidTokenResponseV2;
        GeneratedMessageLite.registerDefaultInstance(BidToken$BidTokenResponseV2.class, bidToken$BidTokenResponseV2);
    }

    private BidToken$BidTokenResponseV2() {
    }

    private void clearBidToken() {
        this.bidToken_ = getDefaultInstance().getBidToken();
    }

    public static BidToken$BidTokenResponseV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidToken$BidTokenResponseV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidToken$BidTokenResponseV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBidToken(String str) {
        str.getClass();
        this.bidToken_ = str;
    }

    private void setBidTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bidToken_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c.f54114a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$BidTokenResponseV2();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"bidToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$BidTokenResponseV2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidToken$BidTokenResponseV2.class) {
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

    public String getBidToken() {
        return this.bidToken_;
    }

    public ByteString getBidTokenBytes() {
        return ByteString.copyFromUtf8(this.bidToken_);
    }

    public static a newBuilder(BidToken$BidTokenResponseV2 bidToken$BidTokenResponseV2) {
        return DEFAULT_INSTANCE.createBuilder(bidToken$BidTokenResponseV2);
    }

    public static BidToken$BidTokenResponseV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidToken$BidTokenResponseV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
