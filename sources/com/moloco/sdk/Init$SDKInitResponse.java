package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.moloco.sdk.ConfigsOuterClass$Configs;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Init$SDKInitResponse extends GeneratedMessageLite<Init$SDKInitResponse, b> implements MessageLiteOrBuilder {
    public static final int AD_SERVER_URL_FIELD_NUMBER = 6;
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BID_TOKEN_CONFIG_FIELD_NUMBER = 12;
    public static final int CONFIGS_FIELD_NUMBER = 16;
    public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 7;
    public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 3;
    public static final int CRASH_REPORTING_CONFIG_FIELD_NUMBER = 15;
    private static final Init$SDKInitResponse DEFAULT_INSTANCE;
    public static final int DIRECT_ADS_CONFIG_FIELD_NUMBER = 18;
    public static final int EVENT_COLLECTION_CONFIG_FIELD_NUMBER = 11;
    public static final int EXPERIMENTAL_FEATURE_FLAGS_FIELD_NUMBER = 13;
    public static final int GEO_FIELD_NUMBER = 10;
    public static final int ILRD_CONFIG_FIELD_NUMBER = 17;
    public static final int OPERATIONAL_METRICS_CONFIG_FIELD_NUMBER = 14;
    private static volatile Parser<Init$SDKInitResponse> PARSER = null;
    public static final int PLATFORM_ID_FIELD_NUMBER = 8;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 2;
    public static final int RESOLVED_REGION_FIELD_NUMBER = 5;
    public static final int VERIFY_BANNER_VISIBLE_FIELD_NUMBER = 9;
    private BidTokenConfig bidTokenConfig_;
    private ConfigsOuterClass$Configs configs_;
    private CrashReportingConfig crashReportingConfig_;
    private DirectAdsConfig directAdsConfig_;
    private EventCollectionConfig eventCollectionConfig_;
    private Geo geo_;
    private ILRDConfig ilrdConfig_;
    private OperationalMetricsConfig operationalMetricsConfig_;
    private int resolvedRegion_;
    private boolean verifyBannerVisible_;
    private String appId_ = "";
    private String publisherId_ = "";
    private String countryIso3Code_ = "";
    private Internal.ProtobufList<AdUnit> adUnits_ = GeneratedMessageLite.emptyProtobufList();
    private String adServerUrl_ = "";
    private String countryIso2Code_ = "";
    private String platformId_ = "";
    private Internal.ProtobufList<ExperimentalFeatureFlag> experimentalFeatureFlags_ = GeneratedMessageLite.emptyProtobufList();

    public static final class AdUnit extends GeneratedMessageLite<AdUnit, a> implements a {
        public static final int AD_FREQUENCY_FIELD_NUMBER = 3;
        public static final int BID_FLOOR_FIELD_NUMBER = 4;
        private static final AdUnit DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int NATIVE_FIELD_NUMBER = 6;
        private static volatile Parser<AdUnit> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int adFrequency_;
        private float bidFloor_;
        private String id_ = "";
        private String name_ = "";
        private Native native_;
        private int type_;

        public static final class Native extends GeneratedMessageLite<Native, a> implements MessageLiteOrBuilder {
            private static final Native DEFAULT_INSTANCE;
            private static volatile Parser<Native> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int type_;

            public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
                private a() {
                    super(Native.DEFAULT_INSTANCE);
                }
            }

            public enum b implements Internal.EnumLite {
                UNKNOWN_TYPE(0),
                LOGO(1),
                IMAGE(2),
                VIDEO(3),
                UNRECOGNIZED(-1);


                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53822h = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53824b;

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
                    this.f53824b = i10;
                }

                public static b g(int i10) {
                    if (i10 == 0) {
                        return UNKNOWN_TYPE;
                    }
                    if (i10 == 1) {
                        return LOGO;
                    }
                    if (i10 == 2) {
                        return IMAGE;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return VIDEO;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f53824b;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
            }

            static {
                Native r02 = new Native();
                DEFAULT_INSTANCE = r02;
                GeneratedMessageLite.registerDefaultInstance(Native.class, r02);
            }

            private Native() {
            }

            private void clearType() {
                this.type_ = 0;
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Native> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setType(b bVar) {
                this.type_ = bVar.getNumber();
            }

            private void setTypeValue(int i10) {
                this.type_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (j.f55781a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Native();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Native> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Native.class) {
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

            public b getType() {
                b bVarG = b.g(this.type_);
                return bVarG == null ? b.UNRECOGNIZED : bVarG;
            }

            public int getTypeValue() {
                return this.type_;
            }

            public static a newBuilder(Native r12) {
                return DEFAULT_INSTANCE.createBuilder(r12);
            }

            public static Native parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Native parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Native parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Native parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Native parseFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Native parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Native parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Native parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends GeneratedMessageLite.Builder implements a {
            private a() {
                super(AdUnit.DEFAULT_INSTANCE);
            }
        }

        public enum b implements Internal.EnumLite {
            INVALID(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE(3),
            REWARD_VIDEO(4),
            MREC(6),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53832j = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53834b;

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
                this.f53834b = i10;
            }

            public static b g(int i10) {
                if (i10 == 0) {
                    return INVALID;
                }
                if (i10 == 1) {
                    return BANNER;
                }
                if (i10 == 2) {
                    return INTERSTITIAL;
                }
                if (i10 == 3) {
                    return NATIVE;
                }
                if (i10 == 4) {
                    return REWARD_VIDEO;
                }
                if (i10 != 6) {
                    return null;
                }
                return MREC;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f53834b;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            AdUnit adUnit = new AdUnit();
            DEFAULT_INSTANCE = adUnit;
            GeneratedMessageLite.registerDefaultInstance(AdUnit.class, adUnit);
        }

        private AdUnit() {
        }

        private void clearAdFrequency() {
            this.adFrequency_ = 0;
        }

        private void clearBidFloor() {
            this.bidFloor_ = 0.0f;
        }

        private void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearNative() {
            this.native_ = null;
        }

        private void clearType() {
            this.type_ = 0;
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeNative(Native r32) {
            r32.getClass();
            Native r02 = this.native_;
            if (r02 == null || r02 == Native.getDefaultInstance()) {
                this.native_ = r32;
            } else {
                this.native_ = (Native) ((Native.a) Native.newBuilder(this.native_).mergeFrom(r32)).buildPartial();
            }
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdUnit> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFrequency(int i10) {
            this.adFrequency_ = i10;
        }

        private void setBidFloor(float f10) {
            this.bidFloor_ = f10;
        }

        private void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        private void setIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        private void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        private void setNative(Native r12) {
            r12.getClass();
            this.native_ = r12;
        }

        private void setType(b bVar) {
            this.type_ = bVar.getNumber();
        }

        private void setTypeValue(int i10) {
            this.type_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdUnit();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0001\u0005Ȉ\u0006\t", new Object[]{"id_", "type_", "adFrequency_", "bidFloor_", "name_", "native_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdUnit> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdUnit.class) {
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

        public int getAdFrequency() {
            return this.adFrequency_;
        }

        public float getBidFloor() {
            return this.bidFloor_;
        }

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public Native getNative() {
            Native r02 = this.native_;
            return r02 == null ? Native.getDefaultInstance() : r02;
        }

        public b getType() {
            b bVarG = b.g(this.type_);
            return bVarG == null ? b.UNRECOGNIZED : bVarG;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasNative() {
            return this.native_ != null;
        }

        public static a newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.createBuilder(adUnit);
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdUnit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdUnit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdUnit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class BidTokenConfig extends GeneratedMessageLite<BidTokenConfig, a> implements MessageLiteOrBuilder {
        public static final int BID_TOKEN_URL_FIELD_NUMBER = 2;
        private static final BidTokenConfig DEFAULT_INSTANCE;
        private static volatile Parser<BidTokenConfig> PARSER;
        private String bidTokenUrl_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(BidTokenConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            BidTokenConfig bidTokenConfig = new BidTokenConfig();
            DEFAULT_INSTANCE = bidTokenConfig;
            GeneratedMessageLite.registerDefaultInstance(BidTokenConfig.class, bidTokenConfig);
        }

        private BidTokenConfig() {
        }

        private void clearBidTokenUrl() {
            this.bidTokenUrl_ = getDefaultInstance().getBidTokenUrl();
        }

        public static BidTokenConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BidTokenConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BidTokenConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBidTokenUrl(String str) {
            str.getClass();
            this.bidTokenUrl_ = str;
        }

        private void setBidTokenUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bidTokenUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BidTokenConfig();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"bidTokenUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BidTokenConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BidTokenConfig.class) {
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

        public String getBidTokenUrl() {
            return this.bidTokenUrl_;
        }

        public ByteString getBidTokenUrlBytes() {
            return ByteString.copyFromUtf8(this.bidTokenUrl_);
        }

        public static a newBuilder(BidTokenConfig bidTokenConfig) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenConfig);
        }

        public static BidTokenConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BidTokenConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BidTokenConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(InputStream inputStream) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BidTokenConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CrashReportingConfig extends GeneratedMessageLite<CrashReportingConfig, a> implements MessageLiteOrBuilder {
        private static final CrashReportingConfig DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<CrashReportingConfig> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private String url_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(CrashReportingConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            CrashReportingConfig crashReportingConfig = new CrashReportingConfig();
            DEFAULT_INSTANCE = crashReportingConfig;
            GeneratedMessageLite.registerDefaultInstance(CrashReportingConfig.class, crashReportingConfig);
        }

        private CrashReportingConfig() {
        }

        private void clearEnabled() {
            this.enabled_ = false;
        }

        private void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static CrashReportingConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CrashReportingConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashReportingConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CrashReportingConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEnabled(boolean z10) {
            this.enabled_ = z10;
        }

        private void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        private void setUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CrashReportingConfig();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"enabled_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CrashReportingConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CrashReportingConfig.class) {
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

        public boolean getEnabled() {
            return this.enabled_;
        }

        public String getUrl() {
            return this.url_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static a newBuilder(CrashReportingConfig crashReportingConfig) {
            return DEFAULT_INSTANCE.createBuilder(crashReportingConfig);
        }

        public static CrashReportingConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CrashReportingConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CrashReportingConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(InputStream inputStream) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashReportingConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CrashReportingConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DirectAdsConfig extends GeneratedMessageLite<DirectAdsConfig, a> implements MessageLiteOrBuilder {
        private static final DirectAdsConfig DEFAULT_INSTANCE;
        private static volatile Parser<DirectAdsConfig> PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(DirectAdsConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            DirectAdsConfig directAdsConfig = new DirectAdsConfig();
            DEFAULT_INSTANCE = directAdsConfig;
            GeneratedMessageLite.registerDefaultInstance(DirectAdsConfig.class, directAdsConfig);
        }

        private DirectAdsConfig() {
        }

        private void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static DirectAdsConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DirectAdsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DirectAdsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectAdsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DirectAdsConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        private void setUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DirectAdsConfig();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DirectAdsConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DirectAdsConfig.class) {
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

        public String getUrl() {
            return this.url_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static a newBuilder(DirectAdsConfig directAdsConfig) {
            return DEFAULT_INSTANCE.createBuilder(directAdsConfig);
        }

        public static DirectAdsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DirectAdsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DirectAdsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DirectAdsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DirectAdsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DirectAdsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DirectAdsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DirectAdsConfig parseFrom(InputStream inputStream) throws IOException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DirectAdsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DirectAdsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DirectAdsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DirectAdsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EventCollectionConfig extends GeneratedMessageLite<EventCollectionConfig, a> implements MessageLiteOrBuilder {
        public static final int APP_BACKGROUND_TRACKING_URL_FIELD_NUMBER = 3;
        public static final int APP_FOREGROUND_TRACKING_URL_FIELD_NUMBER = 4;
        private static final EventCollectionConfig DEFAULT_INSTANCE;
        public static final int EVENT_COLLECTION_ENABLED_FIELD_NUMBER = 1;
        public static final int MREF_COLLECTION_ENABLED_FIELD_NUMBER = 2;
        private static volatile Parser<EventCollectionConfig> PARSER;
        private String appBackgroundTrackingUrl_ = "";
        private String appForegroundTrackingUrl_ = "";
        private boolean eventCollectionEnabled_;
        private boolean mrefCollectionEnabled_;

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(EventCollectionConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            EventCollectionConfig eventCollectionConfig = new EventCollectionConfig();
            DEFAULT_INSTANCE = eventCollectionConfig;
            GeneratedMessageLite.registerDefaultInstance(EventCollectionConfig.class, eventCollectionConfig);
        }

        private EventCollectionConfig() {
        }

        private void clearAppBackgroundTrackingUrl() {
            this.appBackgroundTrackingUrl_ = getDefaultInstance().getAppBackgroundTrackingUrl();
        }

        private void clearAppForegroundTrackingUrl() {
            this.appForegroundTrackingUrl_ = getDefaultInstance().getAppForegroundTrackingUrl();
        }

        private void clearEventCollectionEnabled() {
            this.eventCollectionEnabled_ = false;
        }

        private void clearMrefCollectionEnabled() {
            this.mrefCollectionEnabled_ = false;
        }

        public static EventCollectionConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EventCollectionConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventCollectionConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EventCollectionConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppBackgroundTrackingUrl(String str) {
            str.getClass();
            this.appBackgroundTrackingUrl_ = str;
        }

        private void setAppBackgroundTrackingUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appBackgroundTrackingUrl_ = byteString.toStringUtf8();
        }

        private void setAppForegroundTrackingUrl(String str) {
            str.getClass();
            this.appForegroundTrackingUrl_ = str;
        }

        private void setAppForegroundTrackingUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appForegroundTrackingUrl_ = byteString.toStringUtf8();
        }

        private void setEventCollectionEnabled(boolean z10) {
            this.eventCollectionEnabled_ = z10;
        }

        private void setMrefCollectionEnabled(boolean z10) {
            this.mrefCollectionEnabled_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EventCollectionConfig();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"eventCollectionEnabled_", "mrefCollectionEnabled_", "appBackgroundTrackingUrl_", "appForegroundTrackingUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EventCollectionConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EventCollectionConfig.class) {
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

        public String getAppBackgroundTrackingUrl() {
            return this.appBackgroundTrackingUrl_;
        }

        public ByteString getAppBackgroundTrackingUrlBytes() {
            return ByteString.copyFromUtf8(this.appBackgroundTrackingUrl_);
        }

        public String getAppForegroundTrackingUrl() {
            return this.appForegroundTrackingUrl_;
        }

        public ByteString getAppForegroundTrackingUrlBytes() {
            return ByteString.copyFromUtf8(this.appForegroundTrackingUrl_);
        }

        public boolean getEventCollectionEnabled() {
            return this.eventCollectionEnabled_;
        }

        public boolean getMrefCollectionEnabled() {
            return this.mrefCollectionEnabled_;
        }

        public static a newBuilder(EventCollectionConfig eventCollectionConfig) {
            return DEFAULT_INSTANCE.createBuilder(eventCollectionConfig);
        }

        public static EventCollectionConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EventCollectionConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EventCollectionConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(InputStream inputStream) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventCollectionConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EventCollectionConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ExperimentalFeatureFlag extends GeneratedMessageLite<ExperimentalFeatureFlag, a> implements c {
        private static final ExperimentalFeatureFlag DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<ExperimentalFeatureFlag> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String name_ = "";
        private String value_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements c {
            private a() {
                super(ExperimentalFeatureFlag.DEFAULT_INSTANCE);
            }
        }

        static {
            ExperimentalFeatureFlag experimentalFeatureFlag = new ExperimentalFeatureFlag();
            DEFAULT_INSTANCE = experimentalFeatureFlag;
            GeneratedMessageLite.registerDefaultInstance(ExperimentalFeatureFlag.class, experimentalFeatureFlag);
        }

        private ExperimentalFeatureFlag() {
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static ExperimentalFeatureFlag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExperimentalFeatureFlag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExperimentalFeatureFlag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        private void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        private void setValueBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExperimentalFeatureFlag();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExperimentalFeatureFlag> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExperimentalFeatureFlag.class) {
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

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public String getValue() {
            return this.value_;
        }

        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public static a newBuilder(ExperimentalFeatureFlag experimentalFeatureFlag) {
            return DEFAULT_INSTANCE.createBuilder(experimentalFeatureFlag);
        }

        public static ExperimentalFeatureFlag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExperimentalFeatureFlag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(InputStream inputStream) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentalFeatureFlag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExperimentalFeatureFlag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Geo extends GeneratedMessageLite<Geo, a> implements MessageLiteOrBuilder {
        public static final int CITY_FIELD_NUMBER = 6;
        public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 2;
        public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 1;
        private static final Geo DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 4;
        private static volatile Parser<Geo> PARSER = null;
        public static final int REGION_FIELD_NUMBER = 7;
        public static final int ZIP_CODE_FIELD_NUMBER = 5;
        private float latitude_;
        private float longitude_;
        private String countryIso3Code_ = "";
        private String countryIso2Code_ = "";
        private String zipCode_ = "";
        private String city_ = "";
        private String region_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(Geo.DEFAULT_INSTANCE);
            }
        }

        static {
            Geo geo = new Geo();
            DEFAULT_INSTANCE = geo;
            GeneratedMessageLite.registerDefaultInstance(Geo.class, geo);
        }

        private Geo() {
        }

        private void clearCity() {
            this.city_ = getDefaultInstance().getCity();
        }

        private void clearCountryIso2Code() {
            this.countryIso2Code_ = getDefaultInstance().getCountryIso2Code();
        }

        private void clearCountryIso3Code() {
            this.countryIso3Code_ = getDefaultInstance().getCountryIso3Code();
        }

        private void clearLatitude() {
            this.latitude_ = 0.0f;
        }

        private void clearLongitude() {
            this.longitude_ = 0.0f;
        }

        private void clearRegion() {
            this.region_ = getDefaultInstance().getRegion();
        }

        private void clearZipCode() {
            this.zipCode_ = getDefaultInstance().getZipCode();
        }

        public static Geo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Geo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Geo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCity(String str) {
            str.getClass();
            this.city_ = str;
        }

        private void setCityBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.city_ = byteString.toStringUtf8();
        }

        private void setCountryIso2Code(String str) {
            str.getClass();
            this.countryIso2Code_ = str;
        }

        private void setCountryIso2CodeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.countryIso2Code_ = byteString.toStringUtf8();
        }

        private void setCountryIso3Code(String str) {
            str.getClass();
            this.countryIso3Code_ = str;
        }

        private void setCountryIso3CodeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.countryIso3Code_ = byteString.toStringUtf8();
        }

        private void setLatitude(float f10) {
            this.latitude_ = f10;
        }

        private void setLongitude(float f10) {
            this.longitude_ = f10;
        }

        private void setRegion(String str) {
            str.getClass();
            this.region_ = str;
        }

        private void setRegionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.region_ = byteString.toStringUtf8();
        }

        private void setZipCode(String str) {
            str.getClass();
            this.zipCode_ = str;
        }

        private void setZipCodeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.zipCode_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Geo();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"countryIso3Code_", "countryIso2Code_", "latitude_", "longitude_", "zipCode_", "city_", "region_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Geo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Geo.class) {
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

        public String getCity() {
            return this.city_;
        }

        public ByteString getCityBytes() {
            return ByteString.copyFromUtf8(this.city_);
        }

        public String getCountryIso2Code() {
            return this.countryIso2Code_;
        }

        public ByteString getCountryIso2CodeBytes() {
            return ByteString.copyFromUtf8(this.countryIso2Code_);
        }

        public String getCountryIso3Code() {
            return this.countryIso3Code_;
        }

        public ByteString getCountryIso3CodeBytes() {
            return ByteString.copyFromUtf8(this.countryIso3Code_);
        }

        public float getLatitude() {
            return this.latitude_;
        }

        public float getLongitude() {
            return this.longitude_;
        }

        public String getRegion() {
            return this.region_;
        }

        public ByteString getRegionBytes() {
            return ByteString.copyFromUtf8(this.region_);
        }

        public String getZipCode() {
            return this.zipCode_;
        }

        public ByteString getZipCodeBytes() {
            return ByteString.copyFromUtf8(this.zipCode_);
        }

        public static a newBuilder(Geo geo) {
            return DEFAULT_INSTANCE.createBuilder(geo);
        }

        public static Geo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Geo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Geo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Geo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Geo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Geo parseFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ILRDConfig extends GeneratedMessageLite<ILRDConfig, b> implements MessageLiteOrBuilder {
        private static final ILRDConfig DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 5;
        public static final int MAX_SESSION_LEN_FIELD_NUMBER = 6;
        private static volatile Parser<ILRDConfig> PARSER = null;
        public static final int RAW_IMP_URL_FIELD_NUMBER = 2;
        public static final int RETRY_COUNT_FIELD_NUMBER = 4;
        public static final int SESSION_EXP_FIELD_NUMBER = 3;
        public static final int SUPPORTED_NETWORKS_FIELD_NUMBER = 8;
        public static final int UPLOAD_INTERVAL_FIELD_NUMBER = 7;
        private static final Internal.ListAdapter.Converter<Integer, e> supportedNetworks_converter_ = new a();
        private boolean enabled_;
        private int maxBatchSize_;
        private int maxSessionLen_;
        private int retryCount_;
        private int sessionExp_;
        private int supportedNetworksMemoizedSerializedSize;
        private int uploadInterval_;
        private String rawImpUrl_ = "";
        private Internal.IntList supportedNetworks_ = GeneratedMessageLite.emptyIntList();

        class a implements Internal.ListAdapter.Converter {
            a() {
            }

            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e convert(Integer num) {
                e eVarG = e.g(num.intValue());
                return eVarG == null ? e.UNRECOGNIZED : eVarG;
            }
        }

        public static final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private b() {
                super(ILRDConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            ILRDConfig iLRDConfig = new ILRDConfig();
            DEFAULT_INSTANCE = iLRDConfig;
            GeneratedMessageLite.registerDefaultInstance(ILRDConfig.class, iLRDConfig);
        }

        private ILRDConfig() {
        }

        private void addAllSupportedNetworks(Iterable<? extends e> iterable) {
            ensureSupportedNetworksIsMutable();
            Iterator<? extends e> it = iterable.iterator();
            while (it.hasNext()) {
                this.supportedNetworks_.addInt(it.next().getNumber());
            }
        }

        private void addAllSupportedNetworksValue(Iterable<Integer> iterable) {
            ensureSupportedNetworksIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.supportedNetworks_.addInt(it.next().intValue());
            }
        }

        private void addSupportedNetworks(e eVar) {
            eVar.getClass();
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.addInt(eVar.getNumber());
        }

        private void addSupportedNetworksValue(int i10) {
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.addInt(i10);
        }

        private void clearEnabled() {
            this.enabled_ = false;
        }

        private void clearMaxBatchSize() {
            this.maxBatchSize_ = 0;
        }

        private void clearMaxSessionLen() {
            this.maxSessionLen_ = 0;
        }

        private void clearRawImpUrl() {
            this.rawImpUrl_ = getDefaultInstance().getRawImpUrl();
        }

        private void clearRetryCount() {
            this.retryCount_ = 0;
        }

        private void clearSessionExp() {
            this.sessionExp_ = 0;
        }

        private void clearSupportedNetworks() {
            this.supportedNetworks_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearUploadInterval() {
            this.uploadInterval_ = 0;
        }

        private void ensureSupportedNetworksIsMutable() {
            Internal.IntList intList = this.supportedNetworks_;
            if (intList.isModifiable()) {
                return;
            }
            this.supportedNetworks_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ILRDConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ILRDConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ILRDConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ILRDConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEnabled(boolean z10) {
            this.enabled_ = z10;
        }

        private void setMaxBatchSize(int i10) {
            this.maxBatchSize_ = i10;
        }

        private void setMaxSessionLen(int i10) {
            this.maxSessionLen_ = i10;
        }

        private void setRawImpUrl(String str) {
            str.getClass();
            this.rawImpUrl_ = str;
        }

        private void setRawImpUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rawImpUrl_ = byteString.toStringUtf8();
        }

        private void setRetryCount(int i10) {
            this.retryCount_ = i10;
        }

        private void setSessionExp(int i10) {
            this.sessionExp_ = i10;
        }

        private void setSupportedNetworks(int i10, e eVar) {
            eVar.getClass();
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.setInt(i10, eVar.getNumber());
        }

        private void setSupportedNetworksValue(int i10, int i11) {
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.setInt(i10, i11);
        }

        private void setUploadInterval(int i10) {
            this.uploadInterval_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ILRDConfig();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b,", new Object[]{"enabled_", "rawImpUrl_", "sessionExp_", "retryCount_", "maxBatchSize_", "maxSessionLen_", "uploadInterval_", "supportedNetworks_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ILRDConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ILRDConfig.class) {
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

        public boolean getEnabled() {
            return this.enabled_;
        }

        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }

        public int getMaxSessionLen() {
            return this.maxSessionLen_;
        }

        public String getRawImpUrl() {
            return this.rawImpUrl_;
        }

        public ByteString getRawImpUrlBytes() {
            return ByteString.copyFromUtf8(this.rawImpUrl_);
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public int getSessionExp() {
            return this.sessionExp_;
        }

        public e getSupportedNetworks(int i10) {
            e eVarG = e.g(this.supportedNetworks_.getInt(i10));
            return eVarG == null ? e.UNRECOGNIZED : eVarG;
        }

        public int getSupportedNetworksCount() {
            return this.supportedNetworks_.size();
        }

        public List<e> getSupportedNetworksList() {
            return new Internal.ListAdapter(this.supportedNetworks_, supportedNetworks_converter_);
        }

        public int getSupportedNetworksValue(int i10) {
            return this.supportedNetworks_.getInt(i10);
        }

        public List<Integer> getSupportedNetworksValueList() {
            return this.supportedNetworks_;
        }

        public int getUploadInterval() {
            return this.uploadInterval_;
        }

        public static b newBuilder(ILRDConfig iLRDConfig) {
            return DEFAULT_INSTANCE.createBuilder(iLRDConfig);
        }

        public static ILRDConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ILRDConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ILRDConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(InputStream inputStream) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ILRDConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ILRDConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OperationalMetricsConfig extends GeneratedMessageLite<OperationalMetricsConfig, a> implements MessageLiteOrBuilder {
        private static final OperationalMetricsConfig DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<OperationalMetricsConfig> PARSER = null;
        public static final int POLLING_INTERVAL_SECONDS_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private int pollingIntervalSeconds_;
        private String url_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(OperationalMetricsConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            OperationalMetricsConfig operationalMetricsConfig = new OperationalMetricsConfig();
            DEFAULT_INSTANCE = operationalMetricsConfig;
            GeneratedMessageLite.registerDefaultInstance(OperationalMetricsConfig.class, operationalMetricsConfig);
        }

        private OperationalMetricsConfig() {
        }

        private void clearEnabled() {
            this.enabled_ = false;
        }

        private void clearPollingIntervalSeconds() {
            this.pollingIntervalSeconds_ = 0;
        }

        private void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static OperationalMetricsConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationalMetricsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationalMetricsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OperationalMetricsConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEnabled(boolean z10) {
            this.enabled_ = z10;
        }

        private void setPollingIntervalSeconds(int i10) {
            this.pollingIntervalSeconds_ = i10;
        }

        private void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        private void setUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j.f55781a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationalMetricsConfig();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004", new Object[]{"enabled_", "url_", "pollingIntervalSeconds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OperationalMetricsConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OperationalMetricsConfig.class) {
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

        public boolean getEnabled() {
            return this.enabled_;
        }

        public int getPollingIntervalSeconds() {
            return this.pollingIntervalSeconds_;
        }

        public String getUrl() {
            return this.url_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static a newBuilder(OperationalMetricsConfig operationalMetricsConfig) {
            return DEFAULT_INSTANCE.createBuilder(operationalMetricsConfig);
        }

        public static OperationalMetricsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationalMetricsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationalMetricsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(InputStream inputStream) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationalMetricsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OperationalMetricsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface a extends MessageLiteOrBuilder {
    }

    public static final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private b() {
            super(Init$SDKInitResponse.DEFAULT_INSTANCE);
        }
    }

    public interface c extends MessageLiteOrBuilder {
    }

    public enum d implements Internal.EnumLite {
        UNKNOWN_REGION(0),
        US(1),
        ASIA(2),
        EU(3),
        LOCAL(4),
        UNIT(5),
        INDIA(6),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Internal.EnumLiteMap f53843k = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53845b;

        class a implements Internal.EnumLiteMap {
            a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d findValueByNumber(int i10) {
                return d.g(i10);
            }
        }

        d(int i10) {
            this.f53845b = i10;
        }

        public static d g(int i10) {
            switch (i10) {
                case 0:
                    return UNKNOWN_REGION;
                case 1:
                    return US;
                case 2:
                    return ASIA;
                case 3:
                    return EU;
                case 4:
                    return LOCAL;
                case 5:
                    return UNIT;
                case 6:
                    return INDIA;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f53845b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum e implements Internal.EnumLite {
        UNKNOWN(0),
        MAX(1),
        LEVEL_PLAY(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Internal.EnumLiteMap f53850g = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53852b;

        class a implements Internal.EnumLiteMap {
            a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e findValueByNumber(int i10) {
                return e.g(i10);
            }
        }

        e(int i10) {
            this.f53852b = i10;
        }

        public static e g(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return MAX;
            }
            if (i10 != 2) {
                return null;
            }
            return LEVEL_PLAY;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f53852b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Init$SDKInitResponse init$SDKInitResponse = new Init$SDKInitResponse();
        DEFAULT_INSTANCE = init$SDKInitResponse;
        GeneratedMessageLite.registerDefaultInstance(Init$SDKInitResponse.class, init$SDKInitResponse);
    }

    private Init$SDKInitResponse() {
    }

    private void addAdUnits(AdUnit adUnit) {
        adUnit.getClass();
        ensureAdUnitsIsMutable();
        this.adUnits_.add(adUnit);
    }

    private void addAllAdUnits(Iterable<? extends AdUnit> iterable) {
        ensureAdUnitsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.adUnits_);
    }

    private void addAllExperimentalFeatureFlags(Iterable<? extends ExperimentalFeatureFlag> iterable) {
        ensureExperimentalFeatureFlagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.experimentalFeatureFlags_);
    }

    private void addExperimentalFeatureFlags(ExperimentalFeatureFlag experimentalFeatureFlag) {
        experimentalFeatureFlag.getClass();
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.add(experimentalFeatureFlag);
    }

    private void clearAdServerUrl() {
        this.adServerUrl_ = getDefaultInstance().getAdServerUrl();
    }

    private void clearAdUnits() {
        this.adUnits_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAppId() {
        this.appId_ = getDefaultInstance().getAppId();
    }

    private void clearBidTokenConfig() {
        this.bidTokenConfig_ = null;
    }

    private void clearConfigs() {
        this.configs_ = null;
    }

    private void clearCountryIso2Code() {
        this.countryIso2Code_ = getDefaultInstance().getCountryIso2Code();
    }

    private void clearCountryIso3Code() {
        this.countryIso3Code_ = getDefaultInstance().getCountryIso3Code();
    }

    private void clearCrashReportingConfig() {
        this.crashReportingConfig_ = null;
    }

    private void clearDirectAdsConfig() {
        this.directAdsConfig_ = null;
    }

    private void clearEventCollectionConfig() {
        this.eventCollectionConfig_ = null;
    }

    private void clearExperimentalFeatureFlags() {
        this.experimentalFeatureFlags_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearGeo() {
        this.geo_ = null;
    }

    private void clearIlrdConfig() {
        this.ilrdConfig_ = null;
    }

    private void clearOperationalMetricsConfig() {
        this.operationalMetricsConfig_ = null;
    }

    private void clearPlatformId() {
        this.platformId_ = getDefaultInstance().getPlatformId();
    }

    private void clearPublisherId() {
        this.publisherId_ = getDefaultInstance().getPublisherId();
    }

    private void clearResolvedRegion() {
        this.resolvedRegion_ = 0;
    }

    private void clearVerifyBannerVisible() {
        this.verifyBannerVisible_ = false;
    }

    private void ensureAdUnitsIsMutable() {
        Internal.ProtobufList<AdUnit> protobufList = this.adUnits_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.adUnits_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureExperimentalFeatureFlagsIsMutable() {
        Internal.ProtobufList<ExperimentalFeatureFlag> protobufList = this.experimentalFeatureFlags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.experimentalFeatureFlags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Init$SDKInitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBidTokenConfig(BidTokenConfig bidTokenConfig) {
        bidTokenConfig.getClass();
        BidTokenConfig bidTokenConfig2 = this.bidTokenConfig_;
        if (bidTokenConfig2 == null || bidTokenConfig2 == BidTokenConfig.getDefaultInstance()) {
            this.bidTokenConfig_ = bidTokenConfig;
        } else {
            this.bidTokenConfig_ = (BidTokenConfig) ((BidTokenConfig.a) BidTokenConfig.newBuilder(this.bidTokenConfig_).mergeFrom(bidTokenConfig)).buildPartial();
        }
    }

    private void mergeConfigs(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        configsOuterClass$Configs.getClass();
        ConfigsOuterClass$Configs configsOuterClass$Configs2 = this.configs_;
        if (configsOuterClass$Configs2 == null || configsOuterClass$Configs2 == ConfigsOuterClass$Configs.getDefaultInstance()) {
            this.configs_ = configsOuterClass$Configs;
        } else {
            this.configs_ = (ConfigsOuterClass$Configs) ((ConfigsOuterClass$Configs.a) ConfigsOuterClass$Configs.newBuilder(this.configs_).mergeFrom(configsOuterClass$Configs)).buildPartial();
        }
    }

    private void mergeCrashReportingConfig(CrashReportingConfig crashReportingConfig) {
        crashReportingConfig.getClass();
        CrashReportingConfig crashReportingConfig2 = this.crashReportingConfig_;
        if (crashReportingConfig2 == null || crashReportingConfig2 == CrashReportingConfig.getDefaultInstance()) {
            this.crashReportingConfig_ = crashReportingConfig;
        } else {
            this.crashReportingConfig_ = (CrashReportingConfig) ((CrashReportingConfig.a) CrashReportingConfig.newBuilder(this.crashReportingConfig_).mergeFrom(crashReportingConfig)).buildPartial();
        }
    }

    private void mergeDirectAdsConfig(DirectAdsConfig directAdsConfig) {
        directAdsConfig.getClass();
        DirectAdsConfig directAdsConfig2 = this.directAdsConfig_;
        if (directAdsConfig2 == null || directAdsConfig2 == DirectAdsConfig.getDefaultInstance()) {
            this.directAdsConfig_ = directAdsConfig;
        } else {
            this.directAdsConfig_ = (DirectAdsConfig) ((DirectAdsConfig.a) DirectAdsConfig.newBuilder(this.directAdsConfig_).mergeFrom(directAdsConfig)).buildPartial();
        }
    }

    private void mergeEventCollectionConfig(EventCollectionConfig eventCollectionConfig) {
        eventCollectionConfig.getClass();
        EventCollectionConfig eventCollectionConfig2 = this.eventCollectionConfig_;
        if (eventCollectionConfig2 == null || eventCollectionConfig2 == EventCollectionConfig.getDefaultInstance()) {
            this.eventCollectionConfig_ = eventCollectionConfig;
        } else {
            this.eventCollectionConfig_ = (EventCollectionConfig) ((EventCollectionConfig.a) EventCollectionConfig.newBuilder(this.eventCollectionConfig_).mergeFrom(eventCollectionConfig)).buildPartial();
        }
    }

    private void mergeGeo(Geo geo) {
        geo.getClass();
        Geo geo2 = this.geo_;
        if (geo2 == null || geo2 == Geo.getDefaultInstance()) {
            this.geo_ = geo;
        } else {
            this.geo_ = (Geo) ((Geo.a) Geo.newBuilder(this.geo_).mergeFrom(geo)).buildPartial();
        }
    }

    private void mergeIlrdConfig(ILRDConfig iLRDConfig) {
        iLRDConfig.getClass();
        ILRDConfig iLRDConfig2 = this.ilrdConfig_;
        if (iLRDConfig2 == null || iLRDConfig2 == ILRDConfig.getDefaultInstance()) {
            this.ilrdConfig_ = iLRDConfig;
        } else {
            this.ilrdConfig_ = (ILRDConfig) ((ILRDConfig.b) ILRDConfig.newBuilder(this.ilrdConfig_).mergeFrom(iLRDConfig)).buildPartial();
        }
    }

    private void mergeOperationalMetricsConfig(OperationalMetricsConfig operationalMetricsConfig) {
        operationalMetricsConfig.getClass();
        OperationalMetricsConfig operationalMetricsConfig2 = this.operationalMetricsConfig_;
        if (operationalMetricsConfig2 == null || operationalMetricsConfig2 == OperationalMetricsConfig.getDefaultInstance()) {
            this.operationalMetricsConfig_ = operationalMetricsConfig;
        } else {
            this.operationalMetricsConfig_ = (OperationalMetricsConfig) ((OperationalMetricsConfig.a) OperationalMetricsConfig.newBuilder(this.operationalMetricsConfig_).mergeFrom(operationalMetricsConfig)).buildPartial();
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Init$SDKInitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Init$SDKInitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Init$SDKInitResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdUnits(int i10) {
        ensureAdUnitsIsMutable();
        this.adUnits_.remove(i10);
    }

    private void removeExperimentalFeatureFlags(int i10) {
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.remove(i10);
    }

    private void setAdServerUrl(String str) {
        str.getClass();
        this.adServerUrl_ = str;
    }

    private void setAdServerUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adServerUrl_ = byteString.toStringUtf8();
    }

    private void setAdUnits(int i10, AdUnit adUnit) {
        adUnit.getClass();
        ensureAdUnitsIsMutable();
        this.adUnits_.set(i10, adUnit);
    }

    private void setAppId(String str) {
        str.getClass();
        this.appId_ = str;
    }

    private void setAppIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appId_ = byteString.toStringUtf8();
    }

    private void setBidTokenConfig(BidTokenConfig bidTokenConfig) {
        bidTokenConfig.getClass();
        this.bidTokenConfig_ = bidTokenConfig;
    }

    private void setConfigs(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        configsOuterClass$Configs.getClass();
        this.configs_ = configsOuterClass$Configs;
    }

    private void setCountryIso2Code(String str) {
        str.getClass();
        this.countryIso2Code_ = str;
    }

    private void setCountryIso2CodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryIso2Code_ = byteString.toStringUtf8();
    }

    private void setCountryIso3Code(String str) {
        str.getClass();
        this.countryIso3Code_ = str;
    }

    private void setCountryIso3CodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryIso3Code_ = byteString.toStringUtf8();
    }

    private void setCrashReportingConfig(CrashReportingConfig crashReportingConfig) {
        crashReportingConfig.getClass();
        this.crashReportingConfig_ = crashReportingConfig;
    }

    private void setDirectAdsConfig(DirectAdsConfig directAdsConfig) {
        directAdsConfig.getClass();
        this.directAdsConfig_ = directAdsConfig;
    }

    private void setEventCollectionConfig(EventCollectionConfig eventCollectionConfig) {
        eventCollectionConfig.getClass();
        this.eventCollectionConfig_ = eventCollectionConfig;
    }

    private void setExperimentalFeatureFlags(int i10, ExperimentalFeatureFlag experimentalFeatureFlag) {
        experimentalFeatureFlag.getClass();
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.set(i10, experimentalFeatureFlag);
    }

    private void setGeo(Geo geo) {
        geo.getClass();
        this.geo_ = geo;
    }

    private void setIlrdConfig(ILRDConfig iLRDConfig) {
        iLRDConfig.getClass();
        this.ilrdConfig_ = iLRDConfig;
    }

    private void setOperationalMetricsConfig(OperationalMetricsConfig operationalMetricsConfig) {
        operationalMetricsConfig.getClass();
        this.operationalMetricsConfig_ = operationalMetricsConfig;
    }

    private void setPlatformId(String str) {
        str.getClass();
        this.platformId_ = str;
    }

    private void setPlatformIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.platformId_ = byteString.toStringUtf8();
    }

    private void setPublisherId(String str) {
        str.getClass();
        this.publisherId_ = str;
    }

    private void setPublisherIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publisherId_ = byteString.toStringUtf8();
    }

    private void setResolvedRegion(d dVar) {
        this.resolvedRegion_ = dVar.getNumber();
    }

    private void setResolvedRegionValue(int i10) {
        this.resolvedRegion_ = i10;
    }

    private void setVerifyBannerVisible(boolean z10) {
        this.verifyBannerVisible_ = z10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (j.f55781a[methodToInvoke.ordinal()]) {
            case 1:
                return new Init$SDKInitResponse();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\t\u000b\t\f\t\r\u001b\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t", new Object[]{"appId_", "publisherId_", "countryIso3Code_", "adUnits_", AdUnit.class, "resolvedRegion_", "adServerUrl_", "countryIso2Code_", "platformId_", "verifyBannerVisible_", "geo_", "eventCollectionConfig_", "bidTokenConfig_", "experimentalFeatureFlags_", ExperimentalFeatureFlag.class, "operationalMetricsConfig_", "crashReportingConfig_", "configs_", "ilrdConfig_", "directAdsConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Init$SDKInitResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Init$SDKInitResponse.class) {
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

    public String getAdServerUrl() {
        return this.adServerUrl_;
    }

    public ByteString getAdServerUrlBytes() {
        return ByteString.copyFromUtf8(this.adServerUrl_);
    }

    public AdUnit getAdUnits(int i10) {
        return this.adUnits_.get(i10);
    }

    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    public a getAdUnitsOrBuilder(int i10) {
        return this.adUnits_.get(i10);
    }

    public List<? extends a> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    public String getAppId() {
        return this.appId_;
    }

    public ByteString getAppIdBytes() {
        return ByteString.copyFromUtf8(this.appId_);
    }

    public BidTokenConfig getBidTokenConfig() {
        BidTokenConfig bidTokenConfig = this.bidTokenConfig_;
        return bidTokenConfig == null ? BidTokenConfig.getDefaultInstance() : bidTokenConfig;
    }

    public ConfigsOuterClass$Configs getConfigs() {
        ConfigsOuterClass$Configs configsOuterClass$Configs = this.configs_;
        return configsOuterClass$Configs == null ? ConfigsOuterClass$Configs.getDefaultInstance() : configsOuterClass$Configs;
    }

    public String getCountryIso2Code() {
        return this.countryIso2Code_;
    }

    public ByteString getCountryIso2CodeBytes() {
        return ByteString.copyFromUtf8(this.countryIso2Code_);
    }

    public String getCountryIso3Code() {
        return this.countryIso3Code_;
    }

    public ByteString getCountryIso3CodeBytes() {
        return ByteString.copyFromUtf8(this.countryIso3Code_);
    }

    public CrashReportingConfig getCrashReportingConfig() {
        CrashReportingConfig crashReportingConfig = this.crashReportingConfig_;
        return crashReportingConfig == null ? CrashReportingConfig.getDefaultInstance() : crashReportingConfig;
    }

    public DirectAdsConfig getDirectAdsConfig() {
        DirectAdsConfig directAdsConfig = this.directAdsConfig_;
        return directAdsConfig == null ? DirectAdsConfig.getDefaultInstance() : directAdsConfig;
    }

    public EventCollectionConfig getEventCollectionConfig() {
        EventCollectionConfig eventCollectionConfig = this.eventCollectionConfig_;
        return eventCollectionConfig == null ? EventCollectionConfig.getDefaultInstance() : eventCollectionConfig;
    }

    public ExperimentalFeatureFlag getExperimentalFeatureFlags(int i10) {
        return this.experimentalFeatureFlags_.get(i10);
    }

    public int getExperimentalFeatureFlagsCount() {
        return this.experimentalFeatureFlags_.size();
    }

    public List<ExperimentalFeatureFlag> getExperimentalFeatureFlagsList() {
        return this.experimentalFeatureFlags_;
    }

    public c getExperimentalFeatureFlagsOrBuilder(int i10) {
        return this.experimentalFeatureFlags_.get(i10);
    }

    public List<? extends c> getExperimentalFeatureFlagsOrBuilderList() {
        return this.experimentalFeatureFlags_;
    }

    public Geo getGeo() {
        Geo geo = this.geo_;
        return geo == null ? Geo.getDefaultInstance() : geo;
    }

    public ILRDConfig getIlrdConfig() {
        ILRDConfig iLRDConfig = this.ilrdConfig_;
        return iLRDConfig == null ? ILRDConfig.getDefaultInstance() : iLRDConfig;
    }

    public OperationalMetricsConfig getOperationalMetricsConfig() {
        OperationalMetricsConfig operationalMetricsConfig = this.operationalMetricsConfig_;
        return operationalMetricsConfig == null ? OperationalMetricsConfig.getDefaultInstance() : operationalMetricsConfig;
    }

    public String getPlatformId() {
        return this.platformId_;
    }

    public ByteString getPlatformIdBytes() {
        return ByteString.copyFromUtf8(this.platformId_);
    }

    public String getPublisherId() {
        return this.publisherId_;
    }

    public ByteString getPublisherIdBytes() {
        return ByteString.copyFromUtf8(this.publisherId_);
    }

    public d getResolvedRegion() {
        d dVarG = d.g(this.resolvedRegion_);
        return dVarG == null ? d.UNRECOGNIZED : dVarG;
    }

    public int getResolvedRegionValue() {
        return this.resolvedRegion_;
    }

    public boolean getVerifyBannerVisible() {
        return this.verifyBannerVisible_;
    }

    public boolean hasBidTokenConfig() {
        return this.bidTokenConfig_ != null;
    }

    public boolean hasConfigs() {
        return this.configs_ != null;
    }

    public boolean hasCrashReportingConfig() {
        return this.crashReportingConfig_ != null;
    }

    public boolean hasDirectAdsConfig() {
        return this.directAdsConfig_ != null;
    }

    public boolean hasEventCollectionConfig() {
        return this.eventCollectionConfig_ != null;
    }

    public boolean hasGeo() {
        return this.geo_ != null;
    }

    public boolean hasIlrdConfig() {
        return this.ilrdConfig_ != null;
    }

    public boolean hasOperationalMetricsConfig() {
        return this.operationalMetricsConfig_ != null;
    }

    public static b newBuilder(Init$SDKInitResponse init$SDKInitResponse) {
        return DEFAULT_INSTANCE.createBuilder(init$SDKInitResponse);
    }

    public static Init$SDKInitResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addAdUnits(int i10, AdUnit adUnit) {
        adUnit.getClass();
        ensureAdUnitsIsMutable();
        this.adUnits_.add(i10, adUnit);
    }

    private void addExperimentalFeatureFlags(int i10, ExperimentalFeatureFlag experimentalFeatureFlag) {
        experimentalFeatureFlag.getClass();
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.add(i10, experimentalFeatureFlag);
    }

    public static Init$SDKInitResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Init$SDKInitResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(InputStream inputStream) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Init$SDKInitResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Init$SDKInitResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
