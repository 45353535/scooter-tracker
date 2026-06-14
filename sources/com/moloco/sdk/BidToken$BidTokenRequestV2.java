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
public final class BidToken$BidTokenRequestV2 extends GeneratedMessageLite<BidToken$BidTokenRequestV2, a> implements MessageLiteOrBuilder {
    public static final int BID_TOKEN_COMPONENTS_FIELD_NUMBER = 2;
    private static final BidToken$BidTokenRequestV2 DEFAULT_INSTANCE;
    private static volatile Parser<BidToken$BidTokenRequestV2> PARSER;
    private BidTokenComponents bidTokenComponents_;

    public static final class BidTokenComponents extends GeneratedMessageLite<BidTokenComponents, a> implements MessageLiteOrBuilder {
        private static final BidTokenComponents DEFAULT_INSTANCE;
        public static final int IDFV_FIELD_NUMBER = 1;
        private static volatile Parser<BidTokenComponents> PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        private int bitField0_;
        private String idfv_ = "";
        private Privacy privacy_;

        public static final class Privacy extends GeneratedMessageLite<Privacy, a> implements MessageLiteOrBuilder {
            public static final int CCPA_FIELD_NUMBER = 1;
            public static final int COPPA_FIELD_NUMBER = 3;
            private static final Privacy DEFAULT_INSTANCE;
            public static final int GDPR_FIELD_NUMBER = 2;
            private static volatile Parser<Privacy> PARSER = null;
            public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
            public static final int US_PRIVACY_FIELD_NUMBER = 4;
            private int bitField0_;
            private boolean ccpa_;
            private boolean coppa_;
            private boolean gdpr_;
            private String usPrivacy_ = "";
            private String tcfConsentString_ = "";

            public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
                private a() {
                    super(Privacy.DEFAULT_INSTANCE);
                }
            }

            static {
                Privacy privacy = new Privacy();
                DEFAULT_INSTANCE = privacy;
                GeneratedMessageLite.registerDefaultInstance(Privacy.class, privacy);
            }

            private Privacy() {
            }

            private void clearCcpa() {
                this.bitField0_ &= -2;
                this.ccpa_ = false;
            }

            private void clearCoppa() {
                this.bitField0_ &= -5;
                this.coppa_ = false;
            }

            private void clearGdpr() {
                this.bitField0_ &= -3;
                this.gdpr_ = false;
            }

            private void clearTcfConsentString() {
                this.bitField0_ &= -17;
                this.tcfConsentString_ = getDefaultInstance().getTcfConsentString();
            }

            private void clearUsPrivacy() {
                this.bitField0_ &= -9;
                this.usPrivacy_ = getDefaultInstance().getUsPrivacy();
            }

            public static Privacy getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Privacy parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Privacy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Privacy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Privacy> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setCcpa(boolean z10) {
                this.bitField0_ |= 1;
                this.ccpa_ = z10;
            }

            private void setCoppa(boolean z10) {
                this.bitField0_ |= 4;
                this.coppa_ = z10;
            }

            private void setGdpr(boolean z10) {
                this.bitField0_ |= 2;
                this.gdpr_ = z10;
            }

            private void setTcfConsentString(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.tcfConsentString_ = str;
            }

            private void setTcfConsentStringBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.tcfConsentString_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            private void setUsPrivacy(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.usPrivacy_ = str;
            }

            private void setUsPrivacyBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.usPrivacy_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (c.f54114a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Privacy();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Privacy> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Privacy.class) {
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

            public boolean getCcpa() {
                return this.ccpa_;
            }

            public boolean getCoppa() {
                return this.coppa_;
            }

            public boolean getGdpr() {
                return this.gdpr_;
            }

            public String getTcfConsentString() {
                return this.tcfConsentString_;
            }

            public ByteString getTcfConsentStringBytes() {
                return ByteString.copyFromUtf8(this.tcfConsentString_);
            }

            public String getUsPrivacy() {
                return this.usPrivacy_;
            }

            public ByteString getUsPrivacyBytes() {
                return ByteString.copyFromUtf8(this.usPrivacy_);
            }

            public boolean hasCcpa() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasCoppa() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasGdpr() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasTcfConsentString() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasUsPrivacy() {
                return (this.bitField0_ & 8) != 0;
            }

            public static a newBuilder(Privacy privacy) {
                return DEFAULT_INSTANCE.createBuilder(privacy);
            }

            public static Privacy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Privacy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Privacy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Privacy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Privacy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Privacy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Privacy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Privacy parseFrom(InputStream inputStream) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Privacy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Privacy parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Privacy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(BidTokenComponents.DEFAULT_INSTANCE);
            }
        }

        static {
            BidTokenComponents bidTokenComponents = new BidTokenComponents();
            DEFAULT_INSTANCE = bidTokenComponents;
            GeneratedMessageLite.registerDefaultInstance(BidTokenComponents.class, bidTokenComponents);
        }

        private BidTokenComponents() {
        }

        private void clearIdfv() {
            this.bitField0_ &= -2;
            this.idfv_ = getDefaultInstance().getIdfv();
        }

        private void clearPrivacy() {
            this.privacy_ = null;
        }

        public static BidTokenComponents getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergePrivacy(Privacy privacy) {
            privacy.getClass();
            Privacy privacy2 = this.privacy_;
            if (privacy2 == null || privacy2 == Privacy.getDefaultInstance()) {
                this.privacy_ = privacy;
            } else {
                this.privacy_ = (Privacy) ((Privacy.a) Privacy.newBuilder(this.privacy_).mergeFrom(privacy)).buildPartial();
            }
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BidTokenComponents parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenComponents parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BidTokenComponents> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIdfv(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.idfv_ = str;
        }

        private void setIdfvBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.idfv_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setPrivacy(Privacy privacy) {
            privacy.getClass();
            this.privacy_ = privacy;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (c.f54114a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BidTokenComponents();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002\t", new Object[]{"bitField0_", "idfv_", "privacy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BidTokenComponents> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BidTokenComponents.class) {
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

        public String getIdfv() {
            return this.idfv_;
        }

        public ByteString getIdfvBytes() {
            return ByteString.copyFromUtf8(this.idfv_);
        }

        public Privacy getPrivacy() {
            Privacy privacy = this.privacy_;
            return privacy == null ? Privacy.getDefaultInstance() : privacy;
        }

        public boolean hasIdfv() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPrivacy() {
            return this.privacy_ != null;
        }

        public static a newBuilder(BidTokenComponents bidTokenComponents) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenComponents);
        }

        public static BidTokenComponents parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BidTokenComponents parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BidTokenComponents parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(InputStream inputStream) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenComponents parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BidTokenComponents parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private a() {
            super(BidToken$BidTokenRequestV2.DEFAULT_INSTANCE);
        }
    }

    static {
        BidToken$BidTokenRequestV2 bidToken$BidTokenRequestV2 = new BidToken$BidTokenRequestV2();
        DEFAULT_INSTANCE = bidToken$BidTokenRequestV2;
        GeneratedMessageLite.registerDefaultInstance(BidToken$BidTokenRequestV2.class, bidToken$BidTokenRequestV2);
    }

    private BidToken$BidTokenRequestV2() {
    }

    private void clearBidTokenComponents() {
        this.bidTokenComponents_ = null;
    }

    public static BidToken$BidTokenRequestV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBidTokenComponents(BidTokenComponents bidTokenComponents) {
        bidTokenComponents.getClass();
        BidTokenComponents bidTokenComponents2 = this.bidTokenComponents_;
        if (bidTokenComponents2 == null || bidTokenComponents2 == BidTokenComponents.getDefaultInstance()) {
            this.bidTokenComponents_ = bidTokenComponents;
        } else {
            this.bidTokenComponents_ = (BidTokenComponents) ((BidTokenComponents.a) BidTokenComponents.newBuilder(this.bidTokenComponents_).mergeFrom(bidTokenComponents)).buildPartial();
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidToken$BidTokenRequestV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidToken$BidTokenRequestV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBidTokenComponents(BidTokenComponents bidTokenComponents) {
        bidTokenComponents.getClass();
        this.bidTokenComponents_ = bidTokenComponents;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c.f54114a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$BidTokenRequestV2();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"bidTokenComponents_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$BidTokenRequestV2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidToken$BidTokenRequestV2.class) {
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

    public BidTokenComponents getBidTokenComponents() {
        BidTokenComponents bidTokenComponents = this.bidTokenComponents_;
        return bidTokenComponents == null ? BidTokenComponents.getDefaultInstance() : bidTokenComponents;
    }

    public boolean hasBidTokenComponents() {
        return this.bidTokenComponents_ != null;
    }

    public static a newBuilder(BidToken$BidTokenRequestV2 bidToken$BidTokenRequestV2) {
        return DEFAULT_INSTANCE.createBuilder(bidToken$BidTokenRequestV2);
    }

    public static BidToken$BidTokenRequestV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
