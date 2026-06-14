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
public final class IlrdRequest$MaxImpression extends GeneratedMessageLite<IlrdRequest$MaxImpression, a> implements MessageLiteOrBuilder {
    public static final int AD_FORMAT_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
    private static final IlrdRequest$MaxImpression DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int MAX_AD_UNIT_ID_FIELD_NUMBER = 4;
    public static final int NETWORK_NAME_FIELD_NUMBER = 5;
    private static volatile Parser<IlrdRequest$MaxImpression> PARSER = null;
    public static final int REVENUE_FIELD_NUMBER = 6;
    public static final int THIRD_PARTY_AD_PLACEMENT_ID_FIELD_NUMBER = 7;
    public static final int USER_SEGMENT_FIELD_NUMBER = 8;
    private double revenue_;
    private String adFormat_ = "";
    private String countryCode_ = "";
    private String id_ = "";
    private String maxAdUnitId_ = "";
    private String networkName_ = "";
    private String thirdPartyAdPlacementId_ = "";
    private String userSegment_ = "";

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public a a(String str) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setAdFormat(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setCountryCode(str);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setId(str);
            return this;
        }

        public a d(String str) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setMaxAdUnitId(str);
            return this;
        }

        public a e(String str) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setNetworkName(str);
            return this;
        }

        public a f(double d10) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setRevenue(d10);
            return this;
        }

        public a g(String str) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setThirdPartyAdPlacementId(str);
            return this;
        }

        public a h(String str) {
            copyOnWrite();
            ((IlrdRequest$MaxImpression) this.instance).setUserSegment(str);
            return this;
        }

        private a() {
            super(IlrdRequest$MaxImpression.DEFAULT_INSTANCE);
        }
    }

    static {
        IlrdRequest$MaxImpression ilrdRequest$MaxImpression = new IlrdRequest$MaxImpression();
        DEFAULT_INSTANCE = ilrdRequest$MaxImpression;
        GeneratedMessageLite.registerDefaultInstance(IlrdRequest$MaxImpression.class, ilrdRequest$MaxImpression);
    }

    private IlrdRequest$MaxImpression() {
    }

    private void clearAdFormat() {
        this.adFormat_ = getDefaultInstance().getAdFormat();
    }

    private void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearMaxAdUnitId() {
        this.maxAdUnitId_ = getDefaultInstance().getMaxAdUnitId();
    }

    private void clearNetworkName() {
        this.networkName_ = getDefaultInstance().getNetworkName();
    }

    private void clearRevenue() {
        this.revenue_ = 0.0d;
    }

    private void clearThirdPartyAdPlacementId() {
        this.thirdPartyAdPlacementId_ = getDefaultInstance().getThirdPartyAdPlacementId();
    }

    private void clearUserSegment() {
        this.userSegment_ = getDefaultInstance().getUserSegment();
    }

    public static IlrdRequest$MaxImpression getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IlrdRequest$MaxImpression parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IlrdRequest$MaxImpression> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdFormat(String str) {
        str.getClass();
        this.adFormat_ = str;
    }

    private void setAdFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adFormat_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        str.getClass();
        this.countryCode_ = str;
    }

    private void setCountryCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAdUnitId(String str) {
        str.getClass();
        this.maxAdUnitId_ = str;
    }

    private void setMaxAdUnitIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.maxAdUnitId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkName(String str) {
        str.getClass();
        this.networkName_ = str;
    }

    private void setNetworkNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.networkName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevenue(double d10) {
        this.revenue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyAdPlacementId(String str) {
        str.getClass();
        this.thirdPartyAdPlacementId_ = str;
    }

    private void setThirdPartyAdPlacementIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.thirdPartyAdPlacementId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSegment(String str) {
        str.getClass();
        this.userSegment_ = str;
    }

    private void setUserSegmentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userSegment_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (g.f54123a[methodToInvoke.ordinal()]) {
            case 1:
                return new IlrdRequest$MaxImpression();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0000\u0007Ȉ\bȈ", new Object[]{"adFormat_", "countryCode_", "id_", "maxAdUnitId_", "networkName_", "revenue_", "thirdPartyAdPlacementId_", "userSegment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IlrdRequest$MaxImpression> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IlrdRequest$MaxImpression.class) {
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

    public String getAdFormat() {
        return this.adFormat_;
    }

    public ByteString getAdFormatBytes() {
        return ByteString.copyFromUtf8(this.adFormat_);
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public ByteString getCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.countryCode_);
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public String getMaxAdUnitId() {
        return this.maxAdUnitId_;
    }

    public ByteString getMaxAdUnitIdBytes() {
        return ByteString.copyFromUtf8(this.maxAdUnitId_);
    }

    public String getNetworkName() {
        return this.networkName_;
    }

    public ByteString getNetworkNameBytes() {
        return ByteString.copyFromUtf8(this.networkName_);
    }

    public double getRevenue() {
        return this.revenue_;
    }

    public String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId_;
    }

    public ByteString getThirdPartyAdPlacementIdBytes() {
        return ByteString.copyFromUtf8(this.thirdPartyAdPlacementId_);
    }

    public String getUserSegment() {
        return this.userSegment_;
    }

    public ByteString getUserSegmentBytes() {
        return ByteString.copyFromUtf8(this.userSegment_);
    }

    public static a newBuilder(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        return DEFAULT_INSTANCE.createBuilder(ilrdRequest$MaxImpression);
    }

    public static IlrdRequest$MaxImpression parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IlrdRequest$MaxImpression parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$MaxImpression parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IlrdRequest$MaxImpression parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
