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
public final class IlrdRequest$LevelPlayImpression extends GeneratedMessageLite<IlrdRequest$LevelPlayImpression, a> implements MessageLiteOrBuilder {
    public static final int AB_FIELD_NUMBER = 10;
    public static final int AD_FORMAT_FIELD_NUMBER = 2;
    public static final int AUCTION_ID_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 6;
    public static final int CREATIVE_ID_FIELD_NUMBER = 14;
    private static final IlrdRequest$LevelPlayImpression DEFAULT_INSTANCE;
    public static final int ENCRYPTED_CPM_FIELD_NUMBER = 13;
    public static final int INSTANCE_ID_FIELD_NUMBER = 5;
    public static final int INSTANCE_NAME_FIELD_NUMBER = 4;
    public static final int LIFETIME_REVENUE_FIELD_NUMBER = 12;
    public static final int NETWORK_NAME_FIELD_NUMBER = 3;
    private static volatile Parser<IlrdRequest$LevelPlayImpression> PARSER = null;
    public static final int PLACEMENT_FIELD_NUMBER = 7;
    public static final int PRECISION_FIELD_NUMBER = 9;
    public static final int REVENUE_FIELD_NUMBER = 8;
    public static final int SEGMENT_NAME_FIELD_NUMBER = 11;
    private double lifetimeRevenue_;
    private double revenue_;
    private String auctionId_ = "";
    private String adFormat_ = "";
    private String networkName_ = "";
    private String instanceName_ = "";
    private String instanceId_ = "";
    private String countryCode_ = "";
    private String placement_ = "";
    private String precision_ = "";
    private String ab_ = "";
    private String segmentName_ = "";
    private String encryptedCpm_ = "";
    private String creativeId_ = "";

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private a() {
            super(IlrdRequest$LevelPlayImpression.DEFAULT_INSTANCE);
        }
    }

    static {
        IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression = new IlrdRequest$LevelPlayImpression();
        DEFAULT_INSTANCE = ilrdRequest$LevelPlayImpression;
        GeneratedMessageLite.registerDefaultInstance(IlrdRequest$LevelPlayImpression.class, ilrdRequest$LevelPlayImpression);
    }

    private IlrdRequest$LevelPlayImpression() {
    }

    private void clearAb() {
        this.ab_ = getDefaultInstance().getAb();
    }

    private void clearAdFormat() {
        this.adFormat_ = getDefaultInstance().getAdFormat();
    }

    private void clearAuctionId() {
        this.auctionId_ = getDefaultInstance().getAuctionId();
    }

    private void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    private void clearCreativeId() {
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    private void clearEncryptedCpm() {
        this.encryptedCpm_ = getDefaultInstance().getEncryptedCpm();
    }

    private void clearInstanceId() {
        this.instanceId_ = getDefaultInstance().getInstanceId();
    }

    private void clearInstanceName() {
        this.instanceName_ = getDefaultInstance().getInstanceName();
    }

    private void clearLifetimeRevenue() {
        this.lifetimeRevenue_ = 0.0d;
    }

    private void clearNetworkName() {
        this.networkName_ = getDefaultInstance().getNetworkName();
    }

    private void clearPlacement() {
        this.placement_ = getDefaultInstance().getPlacement();
    }

    private void clearPrecision() {
        this.precision_ = getDefaultInstance().getPrecision();
    }

    private void clearRevenue() {
        this.revenue_ = 0.0d;
    }

    private void clearSegmentName() {
        this.segmentName_ = getDefaultInstance().getSegmentName();
    }

    public static IlrdRequest$LevelPlayImpression getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IlrdRequest$LevelPlayImpression parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IlrdRequest$LevelPlayImpression> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAb(String str) {
        str.getClass();
        this.ab_ = str;
    }

    private void setAbBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ab_ = byteString.toStringUtf8();
    }

    private void setAdFormat(String str) {
        str.getClass();
        this.adFormat_ = str;
    }

    private void setAdFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adFormat_ = byteString.toStringUtf8();
    }

    private void setAuctionId(String str) {
        str.getClass();
        this.auctionId_ = str;
    }

    private void setAuctionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.auctionId_ = byteString.toStringUtf8();
    }

    private void setCountryCode(String str) {
        str.getClass();
        this.countryCode_ = str;
    }

    private void setCountryCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.toStringUtf8();
    }

    private void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    private void setCreativeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.creativeId_ = byteString.toStringUtf8();
    }

    private void setEncryptedCpm(String str) {
        str.getClass();
        this.encryptedCpm_ = str;
    }

    private void setEncryptedCpmBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.encryptedCpm_ = byteString.toStringUtf8();
    }

    private void setInstanceId(String str) {
        str.getClass();
        this.instanceId_ = str;
    }

    private void setInstanceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.instanceId_ = byteString.toStringUtf8();
    }

    private void setInstanceName(String str) {
        str.getClass();
        this.instanceName_ = str;
    }

    private void setInstanceNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.instanceName_ = byteString.toStringUtf8();
    }

    private void setLifetimeRevenue(double d10) {
        this.lifetimeRevenue_ = d10;
    }

    private void setNetworkName(String str) {
        str.getClass();
        this.networkName_ = str;
    }

    private void setNetworkNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.networkName_ = byteString.toStringUtf8();
    }

    private void setPlacement(String str) {
        str.getClass();
        this.placement_ = str;
    }

    private void setPlacementBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.placement_ = byteString.toStringUtf8();
    }

    private void setPrecision(String str) {
        str.getClass();
        this.precision_ = str;
    }

    private void setPrecisionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.precision_ = byteString.toStringUtf8();
    }

    private void setRevenue(double d10) {
        this.revenue_ = d10;
    }

    private void setSegmentName(String str) {
        str.getClass();
        this.segmentName_ = str;
    }

    private void setSegmentNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.segmentName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (g.f54123a[methodToInvoke.ordinal()]) {
            case 1:
                return new IlrdRequest$LevelPlayImpression();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0000\tȈ\nȈ\u000bȈ\f\u0000\rȈ\u000eȈ", new Object[]{"auctionId_", "adFormat_", "networkName_", "instanceName_", "instanceId_", "countryCode_", "placement_", "revenue_", "precision_", "ab_", "segmentName_", "lifetimeRevenue_", "encryptedCpm_", "creativeId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IlrdRequest$LevelPlayImpression> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IlrdRequest$LevelPlayImpression.class) {
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

    public String getAb() {
        return this.ab_;
    }

    public ByteString getAbBytes() {
        return ByteString.copyFromUtf8(this.ab_);
    }

    public String getAdFormat() {
        return this.adFormat_;
    }

    public ByteString getAdFormatBytes() {
        return ByteString.copyFromUtf8(this.adFormat_);
    }

    public String getAuctionId() {
        return this.auctionId_;
    }

    public ByteString getAuctionIdBytes() {
        return ByteString.copyFromUtf8(this.auctionId_);
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public ByteString getCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.countryCode_);
    }

    public String getCreativeId() {
        return this.creativeId_;
    }

    public ByteString getCreativeIdBytes() {
        return ByteString.copyFromUtf8(this.creativeId_);
    }

    public String getEncryptedCpm() {
        return this.encryptedCpm_;
    }

    public ByteString getEncryptedCpmBytes() {
        return ByteString.copyFromUtf8(this.encryptedCpm_);
    }

    public String getInstanceId() {
        return this.instanceId_;
    }

    public ByteString getInstanceIdBytes() {
        return ByteString.copyFromUtf8(this.instanceId_);
    }

    public String getInstanceName() {
        return this.instanceName_;
    }

    public ByteString getInstanceNameBytes() {
        return ByteString.copyFromUtf8(this.instanceName_);
    }

    public double getLifetimeRevenue() {
        return this.lifetimeRevenue_;
    }

    public String getNetworkName() {
        return this.networkName_;
    }

    public ByteString getNetworkNameBytes() {
        return ByteString.copyFromUtf8(this.networkName_);
    }

    public String getPlacement() {
        return this.placement_;
    }

    public ByteString getPlacementBytes() {
        return ByteString.copyFromUtf8(this.placement_);
    }

    public String getPrecision() {
        return this.precision_;
    }

    public ByteString getPrecisionBytes() {
        return ByteString.copyFromUtf8(this.precision_);
    }

    public double getRevenue() {
        return this.revenue_;
    }

    public String getSegmentName() {
        return this.segmentName_;
    }

    public ByteString getSegmentNameBytes() {
        return ByteString.copyFromUtf8(this.segmentName_);
    }

    public static a newBuilder(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        return DEFAULT_INSTANCE.createBuilder(ilrdRequest$LevelPlayImpression);
    }

    public static IlrdRequest$LevelPlayImpression parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
