package com.moloco.sdk;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.ironsource.R5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BidRequest$SdkBidRequest extends GeneratedMessageLite<BidRequest$SdkBidRequest, a> implements MessageLiteOrBuilder {
    public static final int APP_FIELD_NUMBER = 1;
    private static final BidRequest$SdkBidRequest DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int IMP_FIELD_NUMBER = 3;
    private static volatile Parser<BidRequest$SdkBidRequest> PARSER = null;
    public static final int REGS_FIELD_NUMBER = 4;
    public static final int TMAX_FIELD_NUMBER = 5;
    public static final int USER_FIELD_NUMBER = 6;
    private App app_;
    private int bitField0_;
    private Device device_;
    private Imp imp_;
    private byte memoizedIsInitialized = 2;
    private Regs regs_;
    private int tmax_;
    private User user_;

    public static final class App extends GeneratedMessageLite<App, a> implements MessageLiteOrBuilder {
        public static final int BUNDLE_FIELD_NUMBER = 1;
        private static final App DEFAULT_INSTANCE;
        private static volatile Parser<App> PARSER = null;
        public static final int VER_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String bundle_ = "";
        private String ver_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(App.DEFAULT_INSTANCE);
            }
        }

        static {
            App app = new App();
            DEFAULT_INSTANCE = app;
            GeneratedMessageLite.registerDefaultInstance(App.class, app);
        }

        private App() {
        }

        private void clearBundle() {
            this.bitField0_ &= -2;
            this.bundle_ = getDefaultInstance().getBundle();
        }

        private void clearVer() {
            this.bitField0_ &= -3;
            this.ver_ = getDefaultInstance().getVer();
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<App> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBundle(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.bundle_ = str;
        }

        private void setBundleBytes(ByteString byteString) {
            this.bundle_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setVer(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.ver_ = str;
        }

        private void setVerBytes(ByteString byteString) {
            this.ver_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                case 1:
                    return new App();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"bitField0_", "bundle_", "ver_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<App> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (App.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getBundle() {
            return this.bundle_;
        }

        public ByteString getBundleBytes() {
            return ByteString.copyFromUtf8(this.bundle_);
        }

        public String getVer() {
            return this.ver_;
        }

        public ByteString getVerBytes() {
            return ByteString.copyFromUtf8(this.ver_);
        }

        public boolean hasBundle() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVer() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(App app) {
            return DEFAULT_INSTANCE.createBuilder(app);
        }

        public static App parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static App parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static App parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static App parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Device extends GeneratedMessageLite.ExtendableMessage<Device, a> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
        public static final int CARRIER_FIELD_NUMBER = 10;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 17;
        private static final Device DEFAULT_INSTANCE;
        public static final int DEVICETYPE_FIELD_NUMBER = 18;
        public static final int DIDMD5_FIELD_NUMBER = 6;
        public static final int DIDSHA1_FIELD_NUMBER = 5;
        public static final int DNT_FIELD_NUMBER = 1;
        public static final int DPIDMD5_FIELD_NUMBER = 8;
        public static final int DPIDSHA1_FIELD_NUMBER = 7;
        public static final int FLASHVER_FIELD_NUMBER = 19;
        public static final int GEOFETCH_FIELD_NUMBER = 29;
        public static final int GEO_FIELD_NUMBER = 4;
        public static final int HWV_FIELD_NUMBER = 24;
        public static final int H_FIELD_NUMBER = 26;
        public static final int IFA_FIELD_NUMBER = 20;
        public static final int IPV6_FIELD_NUMBER = 9;
        public static final int IP_FIELD_NUMBER = 3;
        public static final int JS_FIELD_NUMBER = 16;
        public static final int LANGB_FIELD_NUMBER = 32;
        public static final int LANGUAGE_FIELD_NUMBER = 11;
        public static final int LMT_FIELD_NUMBER = 23;
        public static final int MACMD5_FIELD_NUMBER = 22;
        public static final int MACSHA1_FIELD_NUMBER = 21;
        public static final int MAKE_FIELD_NUMBER = 12;
        public static final int MCCMNC_FIELD_NUMBER = 30;
        public static final int MODEL_FIELD_NUMBER = 13;
        public static final int OSV_FIELD_NUMBER = 15;
        public static final int OS_FIELD_NUMBER = 14;
        private static volatile Parser<Device> PARSER = null;
        public static final int PPI_FIELD_NUMBER = 27;
        public static final int PXRATIO_FIELD_NUMBER = 28;
        public static final int SUA_FIELD_NUMBER = 31;
        public static final int UA_FIELD_NUMBER = 2;
        public static final int W_FIELD_NUMBER = 25;
        private int bitField0_;
        private int connectiontype_;
        private boolean dnt_;
        private Geo geo_;
        private boolean geofetch_;
        private int h_;
        private boolean js_;
        private boolean lmt_;
        private int ppi_;
        private double pxratio_;
        private UserAgent sua_;
        private int w_;
        private byte memoizedIsInitialized = 2;
        private String ua_ = "";
        private String ip_ = "";
        private String ipv6_ = "";
        private int devicetype_ = 1;
        private String make_ = "";
        private String model_ = "";
        private String os_ = "";
        private String osv_ = "";
        private String hwv_ = "";
        private String flashver_ = "";
        private String language_ = "";
        private String langb_ = "";
        private String carrier_ = "";
        private String mccmnc_ = "";
        private String ifa_ = "";
        private String didsha1_ = "";
        private String didmd5_ = "";
        private String dpidsha1_ = "";
        private String dpidmd5_ = "";
        private String macsha1_ = "";
        private String macmd5_ = "";

        public static final class Geo extends GeneratedMessageLite.ExtendableMessage<Geo, a> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
            public static final int ACCURACY_FIELD_NUMBER = 11;
            public static final int CITY_FIELD_NUMBER = 7;
            public static final int COUNTRY_FIELD_NUMBER = 3;
            private static final Geo DEFAULT_INSTANCE;
            public static final int IPSERVICE_FIELD_NUMBER = 13;
            public static final int LASTFIX_FIELD_NUMBER = 12;
            public static final int LAT_FIELD_NUMBER = 1;
            public static final int LON_FIELD_NUMBER = 2;
            public static final int METRO_FIELD_NUMBER = 6;
            private static volatile Parser<Geo> PARSER = null;
            public static final int REGIONFIPS104_FIELD_NUMBER = 5;
            public static final int REGION_FIELD_NUMBER = 4;
            public static final int TYPE_FIELD_NUMBER = 9;
            public static final int UTCOFFSET_FIELD_NUMBER = 10;
            public static final int ZIP_FIELD_NUMBER = 8;
            private int accuracy_;
            private int bitField0_;
            private int lastfix_;
            private double lat_;
            private double lon_;
            private int utcoffset_;
            private byte memoizedIsInitialized = 2;
            private String country_ = "";
            private String region_ = "";
            private String regionfips104_ = "";
            private String metro_ = "";
            private String city_ = "";
            private String zip_ = "";
            private int type_ = 1;
            private int ipservice_ = 1;

            public static final class a extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                private a() {
                    super(Geo.DEFAULT_INSTANCE);
                }
            }

            public enum b implements Internal.EnumLite {
                IP2LOCATION(1),
                NEUSTAR(2),
                MAXMIND(3),
                NETACUITY(4);


                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53457g = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53459b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public b findValueByNumber(int i10) {
                        return b.g(i10);
                    }
                }

                /* JADX INFO: renamed from: com.moloco.sdk.BidRequest$SdkBidRequest$Device$Geo$b$b, reason: collision with other inner class name */
                private static final class C0645b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53460a = new C0645b();

                    private C0645b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return b.g(i10) != null;
                    }
                }

                b(int i10) {
                    this.f53459b = i10;
                }

                public static b g(int i10) {
                    if (i10 == 1) {
                        return IP2LOCATION;
                    }
                    if (i10 == 2) {
                        return NEUSTAR;
                    }
                    if (i10 == 3) {
                        return MAXMIND;
                    }
                    if (i10 != 4) {
                        return null;
                    }
                    return NETACUITY;
                }

                public static Internal.EnumVerifier h() {
                    return C0645b.f53460a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53459b;
                }
            }

            public enum c implements Internal.EnumLite {
                GPS_LOCATION(1),
                IP(2),
                USER_PROVIDED(3);


                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53464f = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53466b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c findValueByNumber(int i10) {
                        return c.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53467a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return c.g(i10) != null;
                    }
                }

                c(int i10) {
                    this.f53466b = i10;
                }

                public static c g(int i10) {
                    if (i10 == 1) {
                        return GPS_LOCATION;
                    }
                    if (i10 == 2) {
                        return IP;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return USER_PROVIDED;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53467a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53466b;
                }
            }

            static {
                Geo geo = new Geo();
                DEFAULT_INSTANCE = geo;
                GeneratedMessageLite.registerDefaultInstance(Geo.class, geo);
            }

            private Geo() {
            }

            private void clearAccuracy() {
                this.bitField0_ &= -513;
                this.accuracy_ = 0;
            }

            private void clearCity() {
                this.bitField0_ &= -65;
                this.city_ = getDefaultInstance().getCity();
            }

            private void clearCountry() {
                this.bitField0_ &= -5;
                this.country_ = getDefaultInstance().getCountry();
            }

            private void clearIpservice() {
                this.bitField0_ &= -2049;
                this.ipservice_ = 1;
            }

            private void clearLastfix() {
                this.bitField0_ &= -1025;
                this.lastfix_ = 0;
            }

            private void clearLat() {
                this.bitField0_ &= -2;
                this.lat_ = 0.0d;
            }

            private void clearLon() {
                this.bitField0_ &= -3;
                this.lon_ = 0.0d;
            }

            private void clearMetro() {
                this.bitField0_ &= -33;
                this.metro_ = getDefaultInstance().getMetro();
            }

            private void clearRegion() {
                this.bitField0_ &= -9;
                this.region_ = getDefaultInstance().getRegion();
            }

            private void clearRegionfips104() {
                this.bitField0_ &= -17;
                this.regionfips104_ = getDefaultInstance().getRegionfips104();
            }

            private void clearType() {
                this.bitField0_ &= -257;
                this.type_ = 1;
            }

            private void clearUtcoffset() {
                this.bitField0_ &= -4097;
                this.utcoffset_ = 0;
            }

            private void clearZip() {
                this.bitField0_ &= -129;
                this.zip_ = getDefaultInstance().getZip();
            }

            public static Geo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static a newBuilder() {
                return (a) DEFAULT_INSTANCE.createBuilder();
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

            private void setAccuracy(int i10) {
                this.bitField0_ |= 512;
                this.accuracy_ = i10;
            }

            private void setCity(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.city_ = str;
            }

            private void setCityBytes(ByteString byteString) {
                this.city_ = byteString.toStringUtf8();
                this.bitField0_ |= 64;
            }

            private void setCountry(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.country_ = str;
            }

            private void setCountryBytes(ByteString byteString) {
                this.country_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setIpservice(b bVar) {
                this.ipservice_ = bVar.getNumber();
                this.bitField0_ |= 2048;
            }

            private void setLastfix(int i10) {
                this.bitField0_ |= 1024;
                this.lastfix_ = i10;
            }

            private void setLat(double d10) {
                this.bitField0_ |= 1;
                this.lat_ = d10;
            }

            private void setLon(double d10) {
                this.bitField0_ |= 2;
                this.lon_ = d10;
            }

            private void setMetro(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.metro_ = str;
            }

            private void setMetroBytes(ByteString byteString) {
                this.metro_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            private void setRegion(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.region_ = str;
            }

            private void setRegionBytes(ByteString byteString) {
                this.region_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            private void setRegionfips104(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.regionfips104_ = str;
            }

            private void setRegionfips104Bytes(ByteString byteString) {
                this.regionfips104_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            private void setType(c cVar) {
                this.type_ = cVar.getNumber();
                this.bitField0_ |= 256;
            }

            private void setUtcoffset(int i10) {
                this.bitField0_ |= 4096;
                this.utcoffset_ = i10;
            }

            private void setZip(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.zip_ = str;
            }

            private void setZipBytes(ByteString byteString) {
                this.zip_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Geo();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဌ\b\nင\f\u000bင\t\fင\n\rဌ\u000b", new Object[]{"bitField0_", "lat_", "lon_", "country_", "region_", "regionfips104_", "metro_", "city_", "zip_", "type_", c.h(), "utcoffset_", "accuracy_", "lastfix_", "ipservice_", b.h()});
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public int getAccuracy() {
                return this.accuracy_;
            }

            public String getCity() {
                return this.city_;
            }

            public ByteString getCityBytes() {
                return ByteString.copyFromUtf8(this.city_);
            }

            public String getCountry() {
                return this.country_;
            }

            public ByteString getCountryBytes() {
                return ByteString.copyFromUtf8(this.country_);
            }

            public b getIpservice() {
                b bVarG = b.g(this.ipservice_);
                return bVarG == null ? b.IP2LOCATION : bVarG;
            }

            public int getLastfix() {
                return this.lastfix_;
            }

            public double getLat() {
                return this.lat_;
            }

            public double getLon() {
                return this.lon_;
            }

            public String getMetro() {
                return this.metro_;
            }

            public ByteString getMetroBytes() {
                return ByteString.copyFromUtf8(this.metro_);
            }

            public String getRegion() {
                return this.region_;
            }

            public ByteString getRegionBytes() {
                return ByteString.copyFromUtf8(this.region_);
            }

            public String getRegionfips104() {
                return this.regionfips104_;
            }

            public ByteString getRegionfips104Bytes() {
                return ByteString.copyFromUtf8(this.regionfips104_);
            }

            public c getType() {
                c cVarG = c.g(this.type_);
                return cVarG == null ? c.GPS_LOCATION : cVarG;
            }

            public int getUtcoffset() {
                return this.utcoffset_;
            }

            public String getZip() {
                return this.zip_;
            }

            public ByteString getZipBytes() {
                return ByteString.copyFromUtf8(this.zip_);
            }

            public boolean hasAccuracy() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasCity() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasCountry() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasIpservice() {
                return (this.bitField0_ & 2048) != 0;
            }

            public boolean hasLastfix() {
                return (this.bitField0_ & 1024) != 0;
            }

            public boolean hasLat() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasLon() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasMetro() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasRegion() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasRegionfips104() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasType() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasUtcoffset() {
                return (this.bitField0_ & 4096) != 0;
            }

            public boolean hasZip() {
                return (this.bitField0_ & 128) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static a newBuilder(Geo geo) {
                return (a) DEFAULT_INSTANCE.createBuilder(geo);
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

        public static final class UserAgent extends GeneratedMessageLite<UserAgent, b> implements MessageLiteOrBuilder {
            public static final int ARCHITECTURE_FIELD_NUMBER = 4;
            public static final int BITNESS_FIELD_NUMBER = 5;
            public static final int BROWSERS_FIELD_NUMBER = 1;
            private static final UserAgent DEFAULT_INSTANCE;
            public static final int MOBILE_FIELD_NUMBER = 3;
            public static final int MODEL_FIELD_NUMBER = 6;
            private static volatile Parser<UserAgent> PARSER = null;
            public static final int PLATFORM_FIELD_NUMBER = 2;
            public static final int SOURCE_FIELD_NUMBER = 7;
            private int bitField0_;
            private boolean mobile_;
            private BrandVersion platform_;
            private int source_;
            private Internal.ProtobufList<BrandVersion> browsers_ = GeneratedMessageLite.emptyProtobufList();
            private String architecture_ = "";
            private String bitness_ = "";
            private String model_ = "";

            public static final class BrandVersion extends GeneratedMessageLite<BrandVersion, a> implements a {
                public static final int BRAND_FIELD_NUMBER = 1;
                private static final BrandVersion DEFAULT_INSTANCE;
                private static volatile Parser<BrandVersion> PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 2;
                private int bitField0_;
                private String brand_ = "";
                private Internal.ProtobufList<String> version_ = GeneratedMessageLite.emptyProtobufList();

                public static final class a extends GeneratedMessageLite.Builder implements a {
                    private a() {
                        super(BrandVersion.DEFAULT_INSTANCE);
                    }
                }

                static {
                    BrandVersion brandVersion = new BrandVersion();
                    DEFAULT_INSTANCE = brandVersion;
                    GeneratedMessageLite.registerDefaultInstance(BrandVersion.class, brandVersion);
                }

                private BrandVersion() {
                }

                private void addAllVersion(Iterable<String> iterable) {
                    ensureVersionIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.version_);
                }

                private void addVersion(String str) {
                    str.getClass();
                    ensureVersionIsMutable();
                    this.version_.add(str);
                }

                private void addVersionBytes(ByteString byteString) {
                    ensureVersionIsMutable();
                    this.version_.add(byteString.toStringUtf8());
                }

                private void clearBrand() {
                    this.bitField0_ &= -2;
                    this.brand_ = getDefaultInstance().getBrand();
                }

                private void clearVersion() {
                    this.version_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureVersionIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.version_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.version_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static BrandVersion getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static BrandVersion parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BrandVersion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<BrandVersion> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setBrand(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.brand_ = str;
                }

                private void setBrandBytes(ByteString byteString) {
                    this.brand_ = byteString.toStringUtf8();
                    this.bitField0_ |= 1;
                }

                private void setVersion(int i10, String str) {
                    str.getClass();
                    ensureVersionIsMutable();
                    this.version_.set(i10, str);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new BrandVersion();
                        case 2:
                            return new a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "brand_", "version_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<BrandVersion> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (BrandVersion.class) {
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

                public String getBrand() {
                    return this.brand_;
                }

                public ByteString getBrandBytes() {
                    return ByteString.copyFromUtf8(this.brand_);
                }

                public String getVersion(int i10) {
                    return this.version_.get(i10);
                }

                public ByteString getVersionBytes(int i10) {
                    return ByteString.copyFromUtf8(this.version_.get(i10));
                }

                public int getVersionCount() {
                    return this.version_.size();
                }

                public List<String> getVersionList() {
                    return this.version_;
                }

                public boolean hasBrand() {
                    return (this.bitField0_ & 1) != 0;
                }

                public static a newBuilder(BrandVersion brandVersion) {
                    return DEFAULT_INSTANCE.createBuilder(brandVersion);
                }

                public static BrandVersion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static BrandVersion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static BrandVersion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(InputStream inputStream) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BrandVersion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static BrandVersion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public interface a extends MessageLiteOrBuilder {
            }

            public static final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
                private b() {
                    super(UserAgent.DEFAULT_INSTANCE);
                }
            }

            public enum c implements Internal.EnumLite {
                UNKNOWN_SOURCE(0),
                CLIENT_HINTS_LOW_ENTROPY(1),
                CLIENT_HINTS_HIGH_ENTROPY(2),
                USER_AGENT_STRING(3);


                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53472g = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53474b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c findValueByNumber(int i10) {
                        return c.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53475a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return c.g(i10) != null;
                    }
                }

                c(int i10) {
                    this.f53474b = i10;
                }

                public static c g(int i10) {
                    if (i10 == 0) {
                        return UNKNOWN_SOURCE;
                    }
                    if (i10 == 1) {
                        return CLIENT_HINTS_LOW_ENTROPY;
                    }
                    if (i10 == 2) {
                        return CLIENT_HINTS_HIGH_ENTROPY;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return USER_AGENT_STRING;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53475a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53474b;
                }
            }

            static {
                UserAgent userAgent = new UserAgent();
                DEFAULT_INSTANCE = userAgent;
                GeneratedMessageLite.registerDefaultInstance(UserAgent.class, userAgent);
            }

            private UserAgent() {
            }

            private void addAllBrowsers(Iterable<? extends BrandVersion> iterable) {
                ensureBrowsersIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.browsers_);
            }

            private void addBrowsers(BrandVersion brandVersion) {
                brandVersion.getClass();
                ensureBrowsersIsMutable();
                this.browsers_.add(brandVersion);
            }

            private void clearArchitecture() {
                this.bitField0_ &= -5;
                this.architecture_ = getDefaultInstance().getArchitecture();
            }

            private void clearBitness() {
                this.bitField0_ &= -9;
                this.bitness_ = getDefaultInstance().getBitness();
            }

            private void clearBrowsers() {
                this.browsers_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearMobile() {
                this.bitField0_ &= -3;
                this.mobile_ = false;
            }

            private void clearModel() {
                this.bitField0_ &= -17;
                this.model_ = getDefaultInstance().getModel();
            }

            private void clearPlatform() {
                this.platform_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSource() {
                this.bitField0_ &= -33;
                this.source_ = 0;
            }

            private void ensureBrowsersIsMutable() {
                Internal.ProtobufList<BrandVersion> protobufList = this.browsers_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.browsers_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static UserAgent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergePlatform(BrandVersion brandVersion) {
                brandVersion.getClass();
                BrandVersion brandVersion2 = this.platform_;
                if (brandVersion2 == null || brandVersion2 == BrandVersion.getDefaultInstance()) {
                    this.platform_ = brandVersion;
                } else {
                    this.platform_ = (BrandVersion) ((BrandVersion.a) BrandVersion.newBuilder(this.platform_).mergeFrom(brandVersion)).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static b newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static UserAgent parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UserAgent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<UserAgent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeBrowsers(int i10) {
                ensureBrowsersIsMutable();
                this.browsers_.remove(i10);
            }

            private void setArchitecture(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.architecture_ = str;
            }

            private void setArchitectureBytes(ByteString byteString) {
                this.architecture_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setBitness(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.bitness_ = str;
            }

            private void setBitnessBytes(ByteString byteString) {
                this.bitness_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            private void setBrowsers(int i10, BrandVersion brandVersion) {
                brandVersion.getClass();
                ensureBrowsersIsMutable();
                this.browsers_.set(i10, brandVersion);
            }

            private void setMobile(boolean z10) {
                this.bitField0_ |= 2;
                this.mobile_ = z10;
            }

            private void setModel(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.model_ = str;
            }

            private void setModelBytes(ByteString byteString) {
                this.model_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            private void setPlatform(BrandVersion brandVersion) {
                brandVersion.getClass();
                this.platform_ = brandVersion;
                this.bitField0_ |= 1;
            }

            private void setSource(c cVar) {
                this.source_ = cVar.getNumber();
                this.bitField0_ |= 32;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new UserAgent();
                    case 2:
                        return new b();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဌ\u0005", new Object[]{"bitField0_", "browsers_", BrandVersion.class, "platform_", "mobile_", "architecture_", "bitness_", "model_", "source_", c.h()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<UserAgent> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (UserAgent.class) {
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

            public String getArchitecture() {
                return this.architecture_;
            }

            public ByteString getArchitectureBytes() {
                return ByteString.copyFromUtf8(this.architecture_);
            }

            public String getBitness() {
                return this.bitness_;
            }

            public ByteString getBitnessBytes() {
                return ByteString.copyFromUtf8(this.bitness_);
            }

            public BrandVersion getBrowsers(int i10) {
                return this.browsers_.get(i10);
            }

            public int getBrowsersCount() {
                return this.browsers_.size();
            }

            public List<BrandVersion> getBrowsersList() {
                return this.browsers_;
            }

            public a getBrowsersOrBuilder(int i10) {
                return this.browsers_.get(i10);
            }

            public List<? extends a> getBrowsersOrBuilderList() {
                return this.browsers_;
            }

            public boolean getMobile() {
                return this.mobile_;
            }

            public String getModel() {
                return this.model_;
            }

            public ByteString getModelBytes() {
                return ByteString.copyFromUtf8(this.model_);
            }

            public BrandVersion getPlatform() {
                BrandVersion brandVersion = this.platform_;
                return brandVersion == null ? BrandVersion.getDefaultInstance() : brandVersion;
            }

            public c getSource() {
                c cVarG = c.g(this.source_);
                return cVarG == null ? c.UNKNOWN_SOURCE : cVarG;
            }

            public boolean hasArchitecture() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasBitness() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasMobile() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasModel() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasPlatform() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSource() {
                return (this.bitField0_ & 32) != 0;
            }

            public static b newBuilder(UserAgent userAgent) {
                return DEFAULT_INSTANCE.createBuilder(userAgent);
            }

            public static UserAgent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UserAgent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static UserAgent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addBrowsers(int i10, BrandVersion brandVersion) {
                brandVersion.getClass();
                ensureBrowsersIsMutable();
                this.browsers_.add(i10, brandVersion);
            }

            public static UserAgent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static UserAgent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static UserAgent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static UserAgent parseFrom(InputStream inputStream) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UserAgent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UserAgent parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static UserAgent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
            private a() {
                super(Device.DEFAULT_INSTANCE);
            }
        }

        public enum b implements Internal.EnumLite {
            CONNECTION_UNKNOWN(0),
            ETHERNET(1),
            WIFI(2),
            CELL_UNKNOWN(3),
            CELL_2G(4),
            CELL_3G(5),
            CELL_4G(6),
            CELL_5G(7);


            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53484k = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53486b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public b findValueByNumber(int i10) {
                    return b.g(i10);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.BidRequest$SdkBidRequest$Device$b$b, reason: collision with other inner class name */
            private static final class C0646b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53487a = new C0646b();

                private C0646b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return b.g(i10) != null;
                }
            }

            b(int i10) {
                this.f53486b = i10;
            }

            public static b g(int i10) {
                switch (i10) {
                    case 0:
                        return CONNECTION_UNKNOWN;
                    case 1:
                        return ETHERNET;
                    case 2:
                        return WIFI;
                    case 3:
                        return CELL_UNKNOWN;
                    case 4:
                        return CELL_2G;
                    case 5:
                        return CELL_3G;
                    case 6:
                        return CELL_4G;
                    case 7:
                        return CELL_5G;
                    default:
                        return null;
                }
            }

            public static Internal.EnumVerifier h() {
                return C0646b.f53487a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53486b;
            }
        }

        public enum c implements Internal.EnumLite {
            MOBILE(1),
            PERSONAL_COMPUTER(2),
            CONNECTED_TV(3),
            HIGHEND_PHONE(4),
            TABLET(5),
            CONNECTED_DEVICE(6),
            SET_TOP_BOX(7),
            OOH_DEVICE(8);


            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53496k = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53498b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c findValueByNumber(int i10) {
                    return c.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53499a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return c.g(i10) != null;
                }
            }

            c(int i10) {
                this.f53498b = i10;
            }

            public static c g(int i10) {
                switch (i10) {
                    case 1:
                        return MOBILE;
                    case 2:
                        return PERSONAL_COMPUTER;
                    case 3:
                        return CONNECTED_TV;
                    case 4:
                        return HIGHEND_PHONE;
                    case 5:
                        return TABLET;
                    case 6:
                        return CONNECTED_DEVICE;
                    case 7:
                        return SET_TOP_BOX;
                    case 8:
                        return OOH_DEVICE;
                    default:
                        return null;
                }
            }

            public static Internal.EnumVerifier h() {
                return b.f53499a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53498b;
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            GeneratedMessageLite.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        private void clearCarrier() {
            this.bitField0_ &= -4194305;
            this.carrier_ = getDefaultInstance().getCarrier();
        }

        private void clearConnectiontype() {
            this.bitField0_ &= -16777217;
            this.connectiontype_ = 0;
        }

        private void clearDevicetype() {
            this.bitField0_ &= -129;
            this.devicetype_ = 1;
        }

        private void clearDidmd5() {
            this.bitField0_ &= -134217729;
            this.didmd5_ = getDefaultInstance().getDidmd5();
        }

        private void clearDidsha1() {
            this.bitField0_ &= -67108865;
            this.didsha1_ = getDefaultInstance().getDidsha1();
        }

        private void clearDnt() {
            this.bitField0_ &= -3;
            this.dnt_ = false;
        }

        private void clearDpidmd5() {
            this.bitField0_ &= -536870913;
            this.dpidmd5_ = getDefaultInstance().getDpidmd5();
        }

        private void clearDpidsha1() {
            this.bitField0_ &= -268435457;
            this.dpidsha1_ = getDefaultInstance().getDpidsha1();
        }

        private void clearFlashver() {
            this.bitField0_ &= -524289;
            this.flashver_ = getDefaultInstance().getFlashver();
        }

        private void clearGeo() {
            this.geo_ = null;
            this.bitField0_ &= -2;
        }

        private void clearGeofetch() {
            this.bitField0_ &= -262145;
            this.geofetch_ = false;
        }

        private void clearH() {
            this.bitField0_ &= -16385;
            this.h_ = 0;
        }

        private void clearHwv() {
            this.bitField0_ &= -4097;
            this.hwv_ = getDefaultInstance().getHwv();
        }

        private void clearIfa() {
            this.bitField0_ &= -33554433;
            this.ifa_ = getDefaultInstance().getIfa();
        }

        private void clearIp() {
            this.bitField0_ &= -33;
            this.ip_ = getDefaultInstance().getIp();
        }

        private void clearIpv6() {
            this.bitField0_ &= -65;
            this.ipv6_ = getDefaultInstance().getIpv6();
        }

        private void clearJs() {
            this.bitField0_ &= -131073;
            this.js_ = false;
        }

        private void clearLangb() {
            this.bitField0_ &= -2097153;
            this.langb_ = getDefaultInstance().getLangb();
        }

        private void clearLanguage() {
            this.bitField0_ &= -1048577;
            this.language_ = getDefaultInstance().getLanguage();
        }

        private void clearLmt() {
            this.bitField0_ &= -5;
            this.lmt_ = false;
        }

        private void clearMacmd5() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.macmd5_ = getDefaultInstance().getMacmd5();
        }

        private void clearMacsha1() {
            this.bitField0_ &= -1073741825;
            this.macsha1_ = getDefaultInstance().getMacsha1();
        }

        private void clearMake() {
            this.bitField0_ &= -257;
            this.make_ = getDefaultInstance().getMake();
        }

        private void clearMccmnc() {
            this.bitField0_ &= -8388609;
            this.mccmnc_ = getDefaultInstance().getMccmnc();
        }

        private void clearModel() {
            this.bitField0_ &= -513;
            this.model_ = getDefaultInstance().getModel();
        }

        private void clearOs() {
            this.bitField0_ &= -1025;
            this.os_ = getDefaultInstance().getOs();
        }

        private void clearOsv() {
            this.bitField0_ &= -2049;
            this.osv_ = getDefaultInstance().getOsv();
        }

        private void clearPpi() {
            this.bitField0_ &= -32769;
            this.ppi_ = 0;
        }

        private void clearPxratio() {
            this.bitField0_ &= -65537;
            this.pxratio_ = 0.0d;
        }

        private void clearSua() {
            this.sua_ = null;
            this.bitField0_ &= -17;
        }

        private void clearUa() {
            this.bitField0_ &= -9;
            this.ua_ = getDefaultInstance().getUa();
        }

        private void clearW() {
            this.bitField0_ &= -8193;
            this.w_ = 0;
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void mergeGeo(Geo geo) {
            geo.getClass();
            Geo geo2 = this.geo_;
            if (geo2 == null || geo2 == Geo.getDefaultInstance()) {
                this.geo_ = geo;
            } else {
                this.geo_ = (Geo) ((Geo.a) Geo.newBuilder(this.geo_).mergeFrom(geo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeSua(UserAgent userAgent) {
            userAgent.getClass();
            UserAgent userAgent2 = this.sua_;
            if (userAgent2 == null || userAgent2 == UserAgent.getDefaultInstance()) {
                this.sua_ = userAgent;
            } else {
                this.sua_ = (UserAgent) ((UserAgent.b) UserAgent.newBuilder(this.sua_).mergeFrom(userAgent)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Device> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCarrier(String str) {
            str.getClass();
            this.bitField0_ |= 4194304;
            this.carrier_ = str;
        }

        private void setCarrierBytes(ByteString byteString) {
            this.carrier_ = byteString.toStringUtf8();
            this.bitField0_ |= 4194304;
        }

        private void setConnectiontype(b bVar) {
            this.connectiontype_ = bVar.getNumber();
            this.bitField0_ |= 16777216;
        }

        private void setDevicetype(c cVar) {
            this.devicetype_ = cVar.getNumber();
            this.bitField0_ |= 128;
        }

        private void setDidmd5(String str) {
            str.getClass();
            this.bitField0_ |= 134217728;
            this.didmd5_ = str;
        }

        private void setDidmd5Bytes(ByteString byteString) {
            this.didmd5_ = byteString.toStringUtf8();
            this.bitField0_ |= 134217728;
        }

        private void setDidsha1(String str) {
            str.getClass();
            this.bitField0_ |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            this.didsha1_ = str;
        }

        private void setDidsha1Bytes(ByteString byteString) {
            this.didsha1_ = byteString.toStringUtf8();
            this.bitField0_ |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }

        private void setDnt(boolean z10) {
            this.bitField0_ |= 2;
            this.dnt_ = z10;
        }

        private void setDpidmd5(String str) {
            str.getClass();
            this.bitField0_ |= 536870912;
            this.dpidmd5_ = str;
        }

        private void setDpidmd5Bytes(ByteString byteString) {
            this.dpidmd5_ = byteString.toStringUtf8();
            this.bitField0_ |= 536870912;
        }

        private void setDpidsha1(String str) {
            str.getClass();
            this.bitField0_ |= 268435456;
            this.dpidsha1_ = str;
        }

        private void setDpidsha1Bytes(ByteString byteString) {
            this.dpidsha1_ = byteString.toStringUtf8();
            this.bitField0_ |= 268435456;
        }

        private void setFlashver(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.flashver_ = str;
        }

        private void setFlashverBytes(ByteString byteString) {
            this.flashver_ = byteString.toStringUtf8();
            this.bitField0_ |= 524288;
        }

        private void setGeo(Geo geo) {
            geo.getClass();
            this.geo_ = geo;
            this.bitField0_ |= 1;
        }

        private void setGeofetch(boolean z10) {
            this.bitField0_ |= 262144;
            this.geofetch_ = z10;
        }

        private void setH(int i10) {
            this.bitField0_ |= 16384;
            this.h_ = i10;
        }

        private void setHwv(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.hwv_ = str;
        }

        private void setHwvBytes(ByteString byteString) {
            this.hwv_ = byteString.toStringUtf8();
            this.bitField0_ |= 4096;
        }

        private void setIfa(String str) {
            str.getClass();
            this.bitField0_ |= 33554432;
            this.ifa_ = str;
        }

        private void setIfaBytes(ByteString byteString) {
            this.ifa_ = byteString.toStringUtf8();
            this.bitField0_ |= 33554432;
        }

        private void setIp(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.ip_ = str;
        }

        private void setIpBytes(ByteString byteString) {
            this.ip_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        private void setIpv6(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.ipv6_ = str;
        }

        private void setIpv6Bytes(ByteString byteString) {
            this.ipv6_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        private void setJs(boolean z10) {
            this.bitField0_ |= 131072;
            this.js_ = z10;
        }

        private void setLangb(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.langb_ = str;
        }

        private void setLangbBytes(ByteString byteString) {
            this.langb_ = byteString.toStringUtf8();
            this.bitField0_ |= 2097152;
        }

        private void setLanguage(String str) {
            str.getClass();
            this.bitField0_ |= 1048576;
            this.language_ = str;
        }

        private void setLanguageBytes(ByteString byteString) {
            this.language_ = byteString.toStringUtf8();
            this.bitField0_ |= 1048576;
        }

        private void setLmt(boolean z10) {
            this.bitField0_ |= 4;
            this.lmt_ = z10;
        }

        private void setMacmd5(String str) {
            str.getClass();
            this.bitField0_ |= Integer.MIN_VALUE;
            this.macmd5_ = str;
        }

        private void setMacmd5Bytes(ByteString byteString) {
            this.macmd5_ = byteString.toStringUtf8();
            this.bitField0_ |= Integer.MIN_VALUE;
        }

        private void setMacsha1(String str) {
            str.getClass();
            this.bitField0_ |= 1073741824;
            this.macsha1_ = str;
        }

        private void setMacsha1Bytes(ByteString byteString) {
            this.macsha1_ = byteString.toStringUtf8();
            this.bitField0_ |= 1073741824;
        }

        private void setMake(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.make_ = str;
        }

        private void setMakeBytes(ByteString byteString) {
            this.make_ = byteString.toStringUtf8();
            this.bitField0_ |= 256;
        }

        private void setMccmnc(String str) {
            str.getClass();
            this.bitField0_ |= 8388608;
            this.mccmnc_ = str;
        }

        private void setMccmncBytes(ByteString byteString) {
            this.mccmnc_ = byteString.toStringUtf8();
            this.bitField0_ |= 8388608;
        }

        private void setModel(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.model_ = str;
        }

        private void setModelBytes(ByteString byteString) {
            this.model_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        private void setOs(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.os_ = str;
        }

        private void setOsBytes(ByteString byteString) {
            this.os_ = byteString.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        private void setOsv(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.osv_ = str;
        }

        private void setOsvBytes(ByteString byteString) {
            this.osv_ = byteString.toStringUtf8();
            this.bitField0_ |= 2048;
        }

        private void setPpi(int i10) {
            this.bitField0_ |= 32768;
            this.ppi_ = i10;
        }

        private void setPxratio(double d10) {
            this.bitField0_ |= 65536;
            this.pxratio_ = d10;
        }

        private void setSua(UserAgent userAgent) {
            userAgent.getClass();
            this.sua_ = userAgent;
            this.bitField0_ |= 16;
        }

        private void setUa(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.ua_ = str;
        }

        private void setUaBytes(ByteString byteString) {
            this.ua_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        private void setW(int i10) {
            this.bitField0_ |= 8192;
            this.w_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u0001  \u0000\u0000\u0001\u0001ဇ\u0001\u0002ဈ\u0003\u0003ဈ\u0005\u0004ᐉ\u0000\u0005ဈ\u001a\u0006ဈ\u001b\u0007ဈ\u001c\bဈ\u001d\tဈ\u0006\nဈ\u0016\u000bဈ\u0014\fဈ\b\rဈ\t\u000eဈ\n\u000fဈ\u000b\u0010ဇ\u0011\u0011ဌ\u0018\u0012ဌ\u0007\u0013ဈ\u0013\u0014ဈ\u0019\u0015ဈ\u001e\u0016ဈ\u001f\u0017ဇ\u0002\u0018ဈ\f\u0019င\r\u001aင\u000e\u001bင\u000f\u001cက\u0010\u001dဇ\u0012\u001eဈ\u0017\u001fဉ\u0004 ဈ\u0015", new Object[]{"bitField0_", "dnt_", "ua_", "ip_", "geo_", "didsha1_", "didmd5_", "dpidsha1_", "dpidmd5_", "ipv6_", "carrier_", "language_", "make_", "model_", "os_", "osv_", "js_", "connectiontype_", b.h(), "devicetype_", c.h(), "flashver_", "ifa_", "macsha1_", "macmd5_", "lmt_", "hwv_", "w_", "h_", "ppi_", "pxratio_", "geofetch_", "mccmnc_", "sua_", "langb_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Device> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Device.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getCarrier() {
            return this.carrier_;
        }

        public ByteString getCarrierBytes() {
            return ByteString.copyFromUtf8(this.carrier_);
        }

        public b getConnectiontype() {
            b bVarG = b.g(this.connectiontype_);
            return bVarG == null ? b.CONNECTION_UNKNOWN : bVarG;
        }

        public c getDevicetype() {
            c cVarG = c.g(this.devicetype_);
            return cVarG == null ? c.MOBILE : cVarG;
        }

        @Deprecated
        public String getDidmd5() {
            return this.didmd5_;
        }

        @Deprecated
        public ByteString getDidmd5Bytes() {
            return ByteString.copyFromUtf8(this.didmd5_);
        }

        @Deprecated
        public String getDidsha1() {
            return this.didsha1_;
        }

        @Deprecated
        public ByteString getDidsha1Bytes() {
            return ByteString.copyFromUtf8(this.didsha1_);
        }

        public boolean getDnt() {
            return this.dnt_;
        }

        @Deprecated
        public String getDpidmd5() {
            return this.dpidmd5_;
        }

        @Deprecated
        public ByteString getDpidmd5Bytes() {
            return ByteString.copyFromUtf8(this.dpidmd5_);
        }

        @Deprecated
        public String getDpidsha1() {
            return this.dpidsha1_;
        }

        @Deprecated
        public ByteString getDpidsha1Bytes() {
            return ByteString.copyFromUtf8(this.dpidsha1_);
        }

        public String getFlashver() {
            return this.flashver_;
        }

        public ByteString getFlashverBytes() {
            return ByteString.copyFromUtf8(this.flashver_);
        }

        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        public boolean getGeofetch() {
            return this.geofetch_;
        }

        public int getH() {
            return this.h_;
        }

        public String getHwv() {
            return this.hwv_;
        }

        public ByteString getHwvBytes() {
            return ByteString.copyFromUtf8(this.hwv_);
        }

        public String getIfa() {
            return this.ifa_;
        }

        public ByteString getIfaBytes() {
            return ByteString.copyFromUtf8(this.ifa_);
        }

        public String getIp() {
            return this.ip_;
        }

        public ByteString getIpBytes() {
            return ByteString.copyFromUtf8(this.ip_);
        }

        public String getIpv6() {
            return this.ipv6_;
        }

        public ByteString getIpv6Bytes() {
            return ByteString.copyFromUtf8(this.ipv6_);
        }

        public boolean getJs() {
            return this.js_;
        }

        public String getLangb() {
            return this.langb_;
        }

        public ByteString getLangbBytes() {
            return ByteString.copyFromUtf8(this.langb_);
        }

        public String getLanguage() {
            return this.language_;
        }

        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        public boolean getLmt() {
            return this.lmt_;
        }

        @Deprecated
        public String getMacmd5() {
            return this.macmd5_;
        }

        @Deprecated
        public ByteString getMacmd5Bytes() {
            return ByteString.copyFromUtf8(this.macmd5_);
        }

        @Deprecated
        public String getMacsha1() {
            return this.macsha1_;
        }

        @Deprecated
        public ByteString getMacsha1Bytes() {
            return ByteString.copyFromUtf8(this.macsha1_);
        }

        public String getMake() {
            return this.make_;
        }

        public ByteString getMakeBytes() {
            return ByteString.copyFromUtf8(this.make_);
        }

        public String getMccmnc() {
            return this.mccmnc_;
        }

        public ByteString getMccmncBytes() {
            return ByteString.copyFromUtf8(this.mccmnc_);
        }

        public String getModel() {
            return this.model_;
        }

        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        public String getOs() {
            return this.os_;
        }

        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        public String getOsv() {
            return this.osv_;
        }

        public ByteString getOsvBytes() {
            return ByteString.copyFromUtf8(this.osv_);
        }

        public int getPpi() {
            return this.ppi_;
        }

        public double getPxratio() {
            return this.pxratio_;
        }

        public UserAgent getSua() {
            UserAgent userAgent = this.sua_;
            return userAgent == null ? UserAgent.getDefaultInstance() : userAgent;
        }

        public String getUa() {
            return this.ua_;
        }

        public ByteString getUaBytes() {
            return ByteString.copyFromUtf8(this.ua_);
        }

        public int getW() {
            return this.w_;
        }

        public boolean hasCarrier() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasConnectiontype() {
            return (this.bitField0_ & 16777216) != 0;
        }

        public boolean hasDevicetype() {
            return (this.bitField0_ & 128) != 0;
        }

        @Deprecated
        public boolean hasDidmd5() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Deprecated
        public boolean hasDidsha1() {
            return (this.bitField0_ & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
        }

        public boolean hasDnt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Deprecated
        public boolean hasDpidmd5() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Deprecated
        public boolean hasDpidsha1() {
            return (this.bitField0_ & 268435456) != 0;
        }

        public boolean hasFlashver() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasGeo() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasGeofetch() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasH() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasHwv() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasIfa() {
            return (this.bitField0_ & 33554432) != 0;
        }

        public boolean hasIp() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasIpv6() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasJs() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasLangb() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasLanguage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasLmt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Deprecated
        public boolean hasMacmd5() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Deprecated
        public boolean hasMacsha1() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        public boolean hasMake() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasMccmnc() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasModel() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasOs() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasOsv() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasPpi() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasPxratio() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasSua() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasUa() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasW() {
            return (this.bitField0_ & 8192) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(Device device) {
            return (a) DEFAULT_INSTANCE.createBuilder(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Imp extends GeneratedMessageLite.ExtendableMessage<Imp, d> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
        public static final int AUDIO_FIELD_NUMBER = 15;
        public static final int BANNER_FIELD_NUMBER = 2;
        public static final int BIDFLOORCUR_FIELD_NUMBER = 9;
        public static final int BIDFLOOR_FIELD_NUMBER = 8;
        public static final int CLICKBROWSER_FIELD_NUMBER = 16;
        private static final Imp DEFAULT_INSTANCE;
        public static final int DISPLAYMANAGERVER_FIELD_NUMBER = 5;
        public static final int DISPLAYMANAGER_FIELD_NUMBER = 4;
        public static final int EXP_FIELD_NUMBER = 14;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IFRAMEBUSTER_FIELD_NUMBER = 10;
        public static final int INSTL_FIELD_NUMBER = 6;
        public static final int METRIC_FIELD_NUMBER = 17;
        public static final int NATIVE_FIELD_NUMBER = 13;
        private static volatile Parser<Imp> PARSER = null;
        public static final int PMP_FIELD_NUMBER = 11;
        public static final int RWDD_FIELD_NUMBER = 18;
        public static final int SECURE_FIELD_NUMBER = 12;
        public static final int SSAI_FIELD_NUMBER = 19;
        public static final int TAGID_FIELD_NUMBER = 7;
        public static final int VIDEO_FIELD_NUMBER = 3;
        private Audio audio_;
        private Banner banner_;
        private double bidfloor_;
        private int bitField0_;
        private boolean clickbrowser_;
        private int exp_;
        private boolean instl_;
        private Native native_;
        private Pmp pmp_;
        private boolean rwdd_;
        private boolean secure_;
        private int ssai_;
        private Video video_;
        private byte memoizedIsInitialized = 2;
        private String id_ = "";
        private String displaymanager_ = "";
        private String displaymanagerver_ = "";
        private String tagid_ = "";
        private String bidfloorcur_ = "USD";
        private Internal.ProtobufList<String> iframebuster_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Metric> metric_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Audio extends GeneratedMessageLite.ExtendableMessage<Audio, f> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
            public static final int API_FIELD_NUMBER = 13;
            public static final int BATTR_FIELD_NUMBER = 7;
            public static final int COMPANIONAD_FIELD_NUMBER = 12;
            public static final int COMPANIONTYPE_FIELD_NUMBER = 20;
            private static final Audio DEFAULT_INSTANCE;
            public static final int DELIVERY_FIELD_NUMBER = 11;
            public static final int FEED_FIELD_NUMBER = 22;
            public static final int MAXBITRATE_FIELD_NUMBER = 10;
            public static final int MAXDURATION_FIELD_NUMBER = 3;
            public static final int MAXEXTENDED_FIELD_NUMBER = 8;
            public static final int MAXSEQ_FIELD_NUMBER = 21;
            public static final int MIMES_FIELD_NUMBER = 1;
            public static final int MINBITRATE_FIELD_NUMBER = 9;
            public static final int MINCPMPERSEC_FIELD_NUMBER = 30;
            public static final int MINDURATION_FIELD_NUMBER = 2;
            public static final int NVOL_FIELD_NUMBER = 24;
            private static volatile Parser<Audio> PARSER = null;
            public static final int PODDUR_FIELD_NUMBER = 25;
            public static final int PODID_FIELD_NUMBER = 27;
            public static final int PODSEQ_FIELD_NUMBER = 28;
            public static final int PROTOCOLS_FIELD_NUMBER = 4;
            public static final int RQDDURS_FIELD_NUMBER = 26;
            public static final int SEQUENCE_FIELD_NUMBER = 6;
            public static final int SLOTINPOD_FIELD_NUMBER = 29;
            public static final int STARTDELAY_FIELD_NUMBER = 5;
            public static final int STITCHED_FIELD_NUMBER = 23;
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private int companiontypeMemoizedSerializedSize;
            private int deliveryMemoizedSerializedSize;
            private int maxbitrate_;
            private int maxduration_;
            private int maxextended_;
            private int maxseq_;
            private int minbitrate_;
            private double mincpmpersec_;
            private int minduration_;
            private int nvol_;
            private int poddur_;
            private int podseq_;
            private int protocolsMemoizedSerializedSize;
            private int slotinpod_;
            private int startdelay_;
            private boolean stitched_;
            private static final Internal.ListAdapter.Converter<Integer, j> protocols_converter_ = new a();
            private static final Internal.ListAdapter.Converter<Integer, g> battr_converter_ = new b();
            private static final Internal.ListAdapter.Converter<Integer, f> delivery_converter_ = new c();
            private static final Internal.ListAdapter.Converter<Integer, a> api_converter_ = new d();
            private static final Internal.ListAdapter.Converter<Integer, e> companiontype_converter_ = new e();
            private int rqddursMemoizedSerializedSize = -1;
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList protocols_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList rqddurs_ = GeneratedMessageLite.emptyIntList();
            private String podid_ = "";
            private int sequence_ = 1;
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList delivery_ = GeneratedMessageLite.emptyIntList();
            private Internal.ProtobufList<Banner> companionad_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList companiontype_ = GeneratedMessageLite.emptyIntList();
            private int feed_ = 1;

            class a implements Internal.ListAdapter.Converter {
                a() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public j convert(Integer num) {
                    j jVarG = j.g(num.intValue());
                    return jVarG == null ? j.VAST_1_0 : jVarG;
                }
            }

            class b implements Internal.ListAdapter.Converter {
                b() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public g convert(Integer num) {
                    g gVarG = g.g(num.intValue());
                    return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
                }
            }

            class c implements Internal.ListAdapter.Converter {
                c() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public f convert(Integer num) {
                    f fVarG = f.g(num.intValue());
                    return fVarG == null ? f.STREAMING : fVarG;
                }
            }

            class d implements Internal.ListAdapter.Converter {
                d() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a convert(Integer num) {
                    a aVarG = a.g(num.intValue());
                    return aVarG == null ? a.VPAID_1 : aVarG;
                }
            }

            class e implements Internal.ListAdapter.Converter {
                e() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public e convert(Integer num) {
                    e eVarG = e.g(num.intValue());
                    return eVarG == null ? e.STATIC : eVarG;
                }
            }

            public static final class f extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                private f() {
                    super(Audio.DEFAULT_INSTANCE);
                }
            }

            public enum g implements Internal.EnumLite {
                MUSIC_SERVICE(1),
                BROADCAST(2),
                PODCAST(3);


                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53503f = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53505b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public g findValueByNumber(int i10) {
                        return g.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53506a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return g.g(i10) != null;
                    }
                }

                g(int i10) {
                    this.f53505b = i10;
                }

                public static g g(int i10) {
                    if (i10 == 1) {
                        return MUSIC_SERVICE;
                    }
                    if (i10 == 2) {
                        return BROADCAST;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return PODCAST;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53506a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53505b;
                }
            }

            public enum h implements Internal.EnumLite {
                NONE(0),
                AVERAGE_VOLUME(1),
                PEAK_VOLUME(2),
                LOUDNESS(3),
                CUSTOM_VOLUME(4);


                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53512h = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53514b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public h findValueByNumber(int i10) {
                        return h.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53515a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return h.g(i10) != null;
                    }
                }

                h(int i10) {
                    this.f53514b = i10;
                }

                public static h g(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return AVERAGE_VOLUME;
                    }
                    if (i10 == 2) {
                        return PEAK_VOLUME;
                    }
                    if (i10 == 3) {
                        return LOUDNESS;
                    }
                    if (i10 != 4) {
                        return null;
                    }
                    return CUSTOM_VOLUME;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53515a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53514b;
                }
            }

            static {
                Audio audio = new Audio();
                DEFAULT_INSTANCE = audio;
                GeneratedMessageLite.registerDefaultInstance(Audio.class, audio);
            }

            private Audio() {
            }

            private void addAllApi(Iterable<? extends a> iterable) {
                ensureApiIsMutable();
                Iterator<? extends a> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            private void addAllBattr(Iterable<? extends g> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends g> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            private void addAllCompanionad(Iterable<? extends Banner> iterable) {
                ensureCompanionadIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.companionad_);
            }

            private void addAllCompaniontype(Iterable<? extends e> iterable) {
                ensureCompaniontypeIsMutable();
                Iterator<? extends e> it = iterable.iterator();
                while (it.hasNext()) {
                    this.companiontype_.addInt(it.next().getNumber());
                }
            }

            private void addAllDelivery(Iterable<? extends f> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends f> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.addInt(it.next().getNumber());
                }
            }

            private void addAllMimes(Iterable<String> iterable) {
                ensureMimesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
            }

            private void addAllProtocols(Iterable<? extends j> iterable) {
                ensureProtocolsIsMutable();
                Iterator<? extends j> it = iterable.iterator();
                while (it.hasNext()) {
                    this.protocols_.addInt(it.next().getNumber());
                }
            }

            private void addAllRqddurs(Iterable<? extends Integer> iterable) {
                ensureRqddursIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.rqddurs_);
            }

            private void addApi(a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.addInt(aVar.getNumber());
            }

            private void addBattr(g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(gVar.getNumber());
            }

            private void addCompanionad(Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(banner);
            }

            private void addCompaniontype(e eVar) {
                eVar.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.addInt(eVar.getNumber());
            }

            private void addDelivery(f fVar) {
                fVar.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.addInt(fVar.getNumber());
            }

            private void addMimes(String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.add(str);
            }

            private void addMimesBytes(ByteString byteString) {
                ensureMimesIsMutable();
                this.mimes_.add(byteString.toStringUtf8());
            }

            private void addProtocols(j jVar) {
                jVar.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.addInt(jVar.getNumber());
            }

            private void addRqddurs(int i10) {
                ensureRqddursIsMutable();
                this.rqddurs_.addInt(i10);
            }

            private void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearCompanionad() {
                this.companionad_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearCompaniontype() {
                this.companiontype_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearDelivery() {
                this.delivery_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearFeed() {
                this.bitField0_ &= -8193;
                this.feed_ = 1;
            }

            private void clearMaxbitrate() {
                this.bitField0_ &= -2049;
                this.maxbitrate_ = 0;
            }

            private void clearMaxduration() {
                this.bitField0_ &= -3;
                this.maxduration_ = 0;
            }

            private void clearMaxextended() {
                this.bitField0_ &= -513;
                this.maxextended_ = 0;
            }

            private void clearMaxseq() {
                this.bitField0_ &= -4097;
                this.maxseq_ = 0;
            }

            private void clearMimes() {
                this.mimes_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearMinbitrate() {
                this.bitField0_ &= -1025;
                this.minbitrate_ = 0;
            }

            private void clearMincpmpersec() {
                this.bitField0_ &= -257;
                this.mincpmpersec_ = 0.0d;
            }

            private void clearMinduration() {
                this.bitField0_ &= -2;
                this.minduration_ = 0;
            }

            private void clearNvol() {
                this.bitField0_ &= -32769;
                this.nvol_ = 0;
            }

            private void clearPoddur() {
                this.bitField0_ &= -5;
                this.poddur_ = 0;
            }

            private void clearPodid() {
                this.bitField0_ &= -17;
                this.podid_ = getDefaultInstance().getPodid();
            }

            private void clearPodseq() {
                this.bitField0_ &= -33;
                this.podseq_ = 0;
            }

            private void clearProtocols() {
                this.protocols_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearRqddurs() {
                this.rqddurs_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearSequence() {
                this.bitField0_ &= -65;
                this.sequence_ = 1;
            }

            private void clearSlotinpod() {
                this.bitField0_ &= -129;
                this.slotinpod_ = 0;
            }

            private void clearStartdelay() {
                this.bitField0_ &= -9;
                this.startdelay_ = 0;
            }

            private void clearStitched() {
                this.bitField0_ &= -16385;
                this.stitched_ = false;
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureCompanionadIsMutable() {
                Internal.ProtobufList<Banner> protobufList = this.companionad_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.companionad_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureCompaniontypeIsMutable() {
                Internal.IntList intList = this.companiontype_;
                if (intList.isModifiable()) {
                    return;
                }
                this.companiontype_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureDeliveryIsMutable() {
                Internal.IntList intList = this.delivery_;
                if (intList.isModifiable()) {
                    return;
                }
                this.delivery_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureMimesIsMutable() {
                Internal.ProtobufList<String> protobufList = this.mimes_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureProtocolsIsMutable() {
                Internal.IntList intList = this.protocols_;
                if (intList.isModifiable()) {
                    return;
                }
                this.protocols_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureRqddursIsMutable() {
                Internal.IntList intList = this.rqddurs_;
                if (intList.isModifiable()) {
                    return;
                }
                this.rqddurs_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Audio getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static f newBuilder() {
                return (f) DEFAULT_INSTANCE.createBuilder();
            }

            public static Audio parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Audio parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Audio> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeCompanionad(int i10) {
                ensureCompanionadIsMutable();
                this.companionad_.remove(i10);
            }

            private void setApi(int i10, a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, aVar.getNumber());
            }

            private void setBattr(int i10, g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, gVar.getNumber());
            }

            private void setCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.set(i10, banner);
            }

            private void setCompaniontype(int i10, e eVar) {
                eVar.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.setInt(i10, eVar.getNumber());
            }

            private void setDelivery(int i10, f fVar) {
                fVar.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.setInt(i10, fVar.getNumber());
            }

            private void setFeed(g gVar) {
                this.feed_ = gVar.getNumber();
                this.bitField0_ |= 8192;
            }

            private void setMaxbitrate(int i10) {
                this.bitField0_ |= 2048;
                this.maxbitrate_ = i10;
            }

            private void setMaxduration(int i10) {
                this.bitField0_ |= 2;
                this.maxduration_ = i10;
            }

            private void setMaxextended(int i10) {
                this.bitField0_ |= 512;
                this.maxextended_ = i10;
            }

            private void setMaxseq(int i10) {
                this.bitField0_ |= 4096;
                this.maxseq_ = i10;
            }

            private void setMimes(int i10, String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.set(i10, str);
            }

            private void setMinbitrate(int i10) {
                this.bitField0_ |= 1024;
                this.minbitrate_ = i10;
            }

            private void setMincpmpersec(double d10) {
                this.bitField0_ |= 256;
                this.mincpmpersec_ = d10;
            }

            private void setMinduration(int i10) {
                this.bitField0_ |= 1;
                this.minduration_ = i10;
            }

            private void setNvol(h hVar) {
                this.nvol_ = hVar.getNumber();
                this.bitField0_ |= 32768;
            }

            private void setPoddur(int i10) {
                this.bitField0_ |= 4;
                this.poddur_ = i10;
            }

            private void setPodid(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.podid_ = str;
            }

            private void setPodidBytes(ByteString byteString) {
                this.podid_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            private void setPodseq(i iVar) {
                this.podseq_ = iVar.getNumber();
                this.bitField0_ |= 32;
            }

            private void setProtocols(int i10, j jVar) {
                jVar.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.setInt(i10, jVar.getNumber());
            }

            private void setRqddurs(int i10, int i11) {
                ensureRqddursIsMutable();
                this.rqddurs_.setInt(i10, i11);
            }

            private void setSequence(int i10) {
                this.bitField0_ |= 64;
                this.sequence_ = i10;
            }

            private void setSlotinpod(l lVar) {
                this.slotinpod_ = lVar.getNumber();
                this.bitField0_ |= 128;
            }

            private void setStartdelay(int i10) {
                this.bitField0_ |= 8;
                this.startdelay_ = i10;
            }

            private void setStitched(boolean z10) {
                this.bitField0_ |= 16384;
                this.stitched_ = z10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Audio();
                    case 2:
                        return new f();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u001e\u0018\u0000\b\u0001\u0001\u001a\u0002င\u0000\u0003င\u0001\u0004,\u0005င\u0003\u0006င\u0006\u0007,\bင\t\tင\n\nင\u000b\u000b,\fЛ\r,\u0014,\u0015င\f\u0016ဌ\r\u0017ဇ\u000e\u0018ဌ\u000f\u0019င\u0002\u001a'\u001bဈ\u0004\u001cဌ\u0005\u001dဌ\u0007\u001eက\b", new Object[]{"bitField0_", "mimes_", "minduration_", "maxduration_", "protocols_", j.h(), "startdelay_", "sequence_", "battr_", g.h(), "maxextended_", "minbitrate_", "maxbitrate_", "delivery_", f.h(), "companionad_", Banner.class, "api_", a.h(), "companiontype_", e.h(), "maxseq_", "feed_", g.h(), "stitched_", "nvol_", h.h(), "poddur_", "rqddurs_", "podid_", "podseq_", i.h(), "slotinpod_", l.h(), "mincpmpersec_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Audio> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Audio.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public a getApi(int i10) {
                a aVarG = a.g(this.api_.getInt(i10));
                return aVarG == null ? a.VPAID_1 : aVarG;
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public List<a> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            public g getBattr(int i10) {
                g gVarG = g.g(this.battr_.getInt(i10));
                return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
            }

            public int getBattrCount() {
                return this.battr_.size();
            }

            public List<g> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            public Banner getCompanionad(int i10) {
                return this.companionad_.get(i10);
            }

            public int getCompanionadCount() {
                return this.companionad_.size();
            }

            public List<Banner> getCompanionadList() {
                return this.companionad_;
            }

            public c getCompanionadOrBuilder(int i10) {
                return this.companionad_.get(i10);
            }

            public List<? extends c> getCompanionadOrBuilderList() {
                return this.companionad_;
            }

            public e getCompaniontype(int i10) {
                e eVarG = e.g(this.companiontype_.getInt(i10));
                return eVarG == null ? e.STATIC : eVarG;
            }

            public int getCompaniontypeCount() {
                return this.companiontype_.size();
            }

            public List<e> getCompaniontypeList() {
                return new Internal.ListAdapter(this.companiontype_, companiontype_converter_);
            }

            public f getDelivery(int i10) {
                f fVarG = f.g(this.delivery_.getInt(i10));
                return fVarG == null ? f.STREAMING : fVarG;
            }

            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            public List<f> getDeliveryList() {
                return new Internal.ListAdapter(this.delivery_, delivery_converter_);
            }

            public g getFeed() {
                g gVarG = g.g(this.feed_);
                return gVarG == null ? g.MUSIC_SERVICE : gVarG;
            }

            public int getMaxbitrate() {
                return this.maxbitrate_;
            }

            public int getMaxduration() {
                return this.maxduration_;
            }

            public int getMaxextended() {
                return this.maxextended_;
            }

            public int getMaxseq() {
                return this.maxseq_;
            }

            public String getMimes(int i10) {
                return this.mimes_.get(i10);
            }

            public ByteString getMimesBytes(int i10) {
                return ByteString.copyFromUtf8(this.mimes_.get(i10));
            }

            public int getMimesCount() {
                return this.mimes_.size();
            }

            public List<String> getMimesList() {
                return this.mimes_;
            }

            public int getMinbitrate() {
                return this.minbitrate_;
            }

            public double getMincpmpersec() {
                return this.mincpmpersec_;
            }

            public int getMinduration() {
                return this.minduration_;
            }

            public h getNvol() {
                h hVarG = h.g(this.nvol_);
                return hVarG == null ? h.NONE : hVarG;
            }

            public int getPoddur() {
                return this.poddur_;
            }

            public String getPodid() {
                return this.podid_;
            }

            public ByteString getPodidBytes() {
                return ByteString.copyFromUtf8(this.podid_);
            }

            public i getPodseq() {
                i iVarG = i.g(this.podseq_);
                return iVarG == null ? i.POD_SEQUENCE_ANY : iVarG;
            }

            public j getProtocols(int i10) {
                j jVarG = j.g(this.protocols_.getInt(i10));
                return jVarG == null ? j.VAST_1_0 : jVarG;
            }

            public int getProtocolsCount() {
                return this.protocols_.size();
            }

            public List<j> getProtocolsList() {
                return new Internal.ListAdapter(this.protocols_, protocols_converter_);
            }

            public int getRqddurs(int i10) {
                return this.rqddurs_.getInt(i10);
            }

            public int getRqddursCount() {
                return this.rqddurs_.size();
            }

            public List<Integer> getRqddursList() {
                return this.rqddurs_;
            }

            @Deprecated
            public int getSequence() {
                return this.sequence_;
            }

            public l getSlotinpod() {
                l lVarG = l.g(this.slotinpod_);
                return lVarG == null ? l.SLOT_POSITION_POD_ANY : lVarG;
            }

            public int getStartdelay() {
                return this.startdelay_;
            }

            public boolean getStitched() {
                return this.stitched_;
            }

            public boolean hasFeed() {
                return (this.bitField0_ & 8192) != 0;
            }

            public boolean hasMaxbitrate() {
                return (this.bitField0_ & 2048) != 0;
            }

            public boolean hasMaxduration() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasMaxextended() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasMaxseq() {
                return (this.bitField0_ & 4096) != 0;
            }

            public boolean hasMinbitrate() {
                return (this.bitField0_ & 1024) != 0;
            }

            public boolean hasMincpmpersec() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasMinduration() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasNvol() {
                return (this.bitField0_ & 32768) != 0;
            }

            public boolean hasPoddur() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasPodid() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasPodseq() {
                return (this.bitField0_ & 32) != 0;
            }

            @Deprecated
            public boolean hasSequence() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasSlotinpod() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasStartdelay() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasStitched() {
                return (this.bitField0_ & 16384) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static f newBuilder(Audio audio) {
                return (f) DEFAULT_INSTANCE.createBuilder(audio);
            }

            public static Audio parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Audio parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Audio parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(i10, banner);
            }

            public static Audio parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Audio parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Audio parseFrom(InputStream inputStream) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Audio parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Audio parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Audio parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Banner extends GeneratedMessageLite.ExtendableMessage<Banner, f> implements c {
            public static final int API_FIELD_NUMBER = 10;
            public static final int BATTR_FIELD_NUMBER = 6;
            public static final int BTYPE_FIELD_NUMBER = 5;
            private static final Banner DEFAULT_INSTANCE;
            public static final int EXPDIR_FIELD_NUMBER = 9;
            public static final int FORMAT_FIELD_NUMBER = 15;
            public static final int HMAX_FIELD_NUMBER = 12;
            public static final int HMIN_FIELD_NUMBER = 14;
            public static final int H_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 3;
            public static final int MIMES_FIELD_NUMBER = 7;
            private static volatile Parser<Banner> PARSER = null;
            public static final int POS_FIELD_NUMBER = 4;
            public static final int TOPFRAME_FIELD_NUMBER = 8;
            public static final int VCM_FIELD_NUMBER = 16;
            public static final int WMAX_FIELD_NUMBER = 11;
            public static final int WMIN_FIELD_NUMBER = 13;
            public static final int W_FIELD_NUMBER = 1;
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private int btypeMemoizedSerializedSize;
            private int expdirMemoizedSerializedSize;
            private int h_;
            private int hmax_;
            private int hmin_;
            private int pos_;
            private boolean topframe_;
            private boolean vcm_;
            private int w_;
            private int wmax_;
            private int wmin_;
            private static final Internal.ListAdapter.Converter<Integer, e> btype_converter_ = new a();
            private static final Internal.ListAdapter.Converter<Integer, g> battr_converter_ = new b();
            private static final Internal.ListAdapter.Converter<Integer, g> expdir_converter_ = new c();
            private static final Internal.ListAdapter.Converter<Integer, a> api_converter_ = new d();
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<Format> format_ = GeneratedMessageLite.emptyProtobufList();
            private String id_ = "";
            private Internal.IntList btype_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();
            private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList expdir_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();

            public static final class Format extends GeneratedMessageLite.ExtendableMessage<Format, a> implements h {
                private static final Format DEFAULT_INSTANCE;
                public static final int HRATIO_FIELD_NUMBER = 4;
                public static final int H_FIELD_NUMBER = 2;
                private static volatile Parser<Format> PARSER = null;
                public static final int WMIN_FIELD_NUMBER = 5;
                public static final int WRATIO_FIELD_NUMBER = 3;
                public static final int W_FIELD_NUMBER = 1;
                private int bitField0_;
                private int h_;
                private int hratio_;
                private byte memoizedIsInitialized = 2;
                private int w_;
                private int wmin_;
                private int wratio_;

                public static final class a extends GeneratedMessageLite.ExtendableBuilder implements h {
                    private a() {
                        super(Format.DEFAULT_INSTANCE);
                    }
                }

                static {
                    Format format = new Format();
                    DEFAULT_INSTANCE = format;
                    GeneratedMessageLite.registerDefaultInstance(Format.class, format);
                }

                private Format() {
                }

                private void clearH() {
                    this.bitField0_ &= -3;
                    this.h_ = 0;
                }

                private void clearHratio() {
                    this.bitField0_ &= -9;
                    this.hratio_ = 0;
                }

                private void clearW() {
                    this.bitField0_ &= -2;
                    this.w_ = 0;
                }

                private void clearWmin() {
                    this.bitField0_ &= -17;
                    this.wmin_ = 0;
                }

                private void clearWratio() {
                    this.bitField0_ &= -5;
                    this.wratio_ = 0;
                }

                public static Format getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static a newBuilder() {
                    return (a) DEFAULT_INSTANCE.createBuilder();
                }

                public static Format parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Format) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Format parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Format> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setH(int i10) {
                    this.bitField0_ |= 2;
                    this.h_ = i10;
                }

                private void setHratio(int i10) {
                    this.bitField0_ |= 8;
                    this.hratio_ = i10;
                }

                private void setW(int i10) {
                    this.bitField0_ |= 1;
                    this.w_ = i10;
                }

                private void setWmin(int i10) {
                    this.bitField0_ |= 16;
                    this.wmin_ = i10;
                }

                private void setWratio(int i10) {
                    this.bitField0_ |= 4;
                    this.wratio_ = i10;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Format();
                        case 2:
                            return new a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "w_", "h_", "wratio_", "hratio_", "wmin_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Format> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (Format.class) {
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
                            return Byte.valueOf(this.memoizedIsInitialized);
                        case 7:
                            this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                public int getH() {
                    return this.h_;
                }

                public int getHratio() {
                    return this.hratio_;
                }

                public int getW() {
                    return this.w_;
                }

                public int getWmin() {
                    return this.wmin_;
                }

                public int getWratio() {
                    return this.wratio_;
                }

                public boolean hasH() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasHratio() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasW() {
                    return (this.bitField0_ & 1) != 0;
                }

                public boolean hasWmin() {
                    return (this.bitField0_ & 16) != 0;
                }

                public boolean hasWratio() {
                    return (this.bitField0_ & 4) != 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static a newBuilder(Format format) {
                    return (a) DEFAULT_INSTANCE.createBuilder(format);
                }

                public static Format parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Format) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Format parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static Format parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Format parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Format parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Format parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Format parseFrom(InputStream inputStream) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Format parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Format parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Format parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            class a implements Internal.ListAdapter.Converter {
                a() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public e convert(Integer num) {
                    e eVarG = e.g(num.intValue());
                    return eVarG == null ? e.XHTML_TEXT_AD : eVarG;
                }
            }

            class b implements Internal.ListAdapter.Converter {
                b() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public g convert(Integer num) {
                    g gVarG = g.g(num.intValue());
                    return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
                }
            }

            class c implements Internal.ListAdapter.Converter {
                c() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public g convert(Integer num) {
                    g gVarG = g.g(num.intValue());
                    return gVarG == null ? g.LEFT : gVarG;
                }
            }

            class d implements Internal.ListAdapter.Converter {
                d() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a convert(Integer num) {
                    a aVarG = a.g(num.intValue());
                    return aVarG == null ? a.VPAID_1 : aVarG;
                }
            }

            public enum e implements Internal.EnumLite {
                XHTML_TEXT_AD(1),
                XHTML_BANNER_AD(2),
                JAVASCRIPT_AD(3),
                IFRAME(4);


                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53520g = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53522b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public e findValueByNumber(int i10) {
                        return e.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53523a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return e.g(i10) != null;
                    }
                }

                e(int i10) {
                    this.f53522b = i10;
                }

                public static e g(int i10) {
                    if (i10 == 1) {
                        return XHTML_TEXT_AD;
                    }
                    if (i10 == 2) {
                        return XHTML_BANNER_AD;
                    }
                    if (i10 == 3) {
                        return JAVASCRIPT_AD;
                    }
                    if (i10 != 4) {
                        return null;
                    }
                    return IFRAME;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53523a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53522b;
                }
            }

            public static final class f extends GeneratedMessageLite.ExtendableBuilder implements c {
                private f() {
                    super(Banner.DEFAULT_INSTANCE);
                }
            }

            public enum g implements Internal.EnumLite {
                LEFT(1),
                RIGHT(2),
                UP(3),
                DOWN(4),
                EXPANDABLE_FULLSCREEN(5),
                RESIZE_MINIMIZE(6);


                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53530i = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53532b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public g findValueByNumber(int i10) {
                        return g.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53533a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return g.g(i10) != null;
                    }
                }

                g(int i10) {
                    this.f53532b = i10;
                }

                public static g g(int i10) {
                    switch (i10) {
                        case 1:
                            return LEFT;
                        case 2:
                            return RIGHT;
                        case 3:
                            return UP;
                        case 4:
                            return DOWN;
                        case 5:
                            return EXPANDABLE_FULLSCREEN;
                        case 6:
                            return RESIZE_MINIMIZE;
                        default:
                            return null;
                    }
                }

                public static Internal.EnumVerifier h() {
                    return b.f53533a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53532b;
                }
            }

            public interface h extends GeneratedMessageLite.ExtendableMessageOrBuilder {
            }

            static {
                Banner banner = new Banner();
                DEFAULT_INSTANCE = banner;
                GeneratedMessageLite.registerDefaultInstance(Banner.class, banner);
            }

            private Banner() {
            }

            private void addAllApi(Iterable<? extends a> iterable) {
                ensureApiIsMutable();
                Iterator<? extends a> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            private void addAllBattr(Iterable<? extends g> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends g> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            private void addAllBtype(Iterable<? extends e> iterable) {
                ensureBtypeIsMutable();
                Iterator<? extends e> it = iterable.iterator();
                while (it.hasNext()) {
                    this.btype_.addInt(it.next().getNumber());
                }
            }

            private void addAllExpdir(Iterable<? extends g> iterable) {
                ensureExpdirIsMutable();
                Iterator<? extends g> it = iterable.iterator();
                while (it.hasNext()) {
                    this.expdir_.addInt(it.next().getNumber());
                }
            }

            private void addAllFormat(Iterable<? extends Format> iterable) {
                ensureFormatIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.format_);
            }

            private void addAllMimes(Iterable<String> iterable) {
                ensureMimesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
            }

            private void addApi(a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.addInt(aVar.getNumber());
            }

            private void addBattr(g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(gVar.getNumber());
            }

            private void addBtype(e eVar) {
                eVar.getClass();
                ensureBtypeIsMutable();
                this.btype_.addInt(eVar.getNumber());
            }

            private void addExpdir(g gVar) {
                gVar.getClass();
                ensureExpdirIsMutable();
                this.expdir_.addInt(gVar.getNumber());
            }

            private void addFormat(Format format) {
                format.getClass();
                ensureFormatIsMutable();
                this.format_.add(format);
            }

            private void addMimes(String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.add(str);
            }

            private void addMimesBytes(ByteString byteString) {
                ensureMimesIsMutable();
                this.mimes_.add(byteString.toStringUtf8());
            }

            private void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearBtype() {
                this.btype_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearExpdir() {
                this.expdir_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearFormat() {
                this.format_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearH() {
                this.bitField0_ &= -3;
                this.h_ = 0;
            }

            private void clearHmax() {
                this.bitField0_ &= -129;
                this.hmax_ = 0;
            }

            private void clearHmin() {
                this.bitField0_ &= -513;
                this.hmin_ = 0;
            }

            private void clearId() {
                this.bitField0_ &= -5;
                this.id_ = getDefaultInstance().getId();
            }

            private void clearMimes() {
                this.mimes_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearPos() {
                this.bitField0_ &= -9;
                this.pos_ = 0;
            }

            private void clearTopframe() {
                this.bitField0_ &= -17;
                this.topframe_ = false;
            }

            private void clearVcm() {
                this.bitField0_ &= -33;
                this.vcm_ = false;
            }

            private void clearW() {
                this.bitField0_ &= -2;
                this.w_ = 0;
            }

            private void clearWmax() {
                this.bitField0_ &= -65;
                this.wmax_ = 0;
            }

            private void clearWmin() {
                this.bitField0_ &= -257;
                this.wmin_ = 0;
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBtypeIsMutable() {
                Internal.IntList intList = this.btype_;
                if (intList.isModifiable()) {
                    return;
                }
                this.btype_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureExpdirIsMutable() {
                Internal.IntList intList = this.expdir_;
                if (intList.isModifiable()) {
                    return;
                }
                this.expdir_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureFormatIsMutable() {
                Internal.ProtobufList<Format> protobufList = this.format_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.format_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureMimesIsMutable() {
                Internal.ProtobufList<String> protobufList = this.mimes_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Banner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static f newBuilder() {
                return (f) DEFAULT_INSTANCE.createBuilder();
            }

            public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Banner> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeFormat(int i10) {
                ensureFormatIsMutable();
                this.format_.remove(i10);
            }

            private void setApi(int i10, a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, aVar.getNumber());
            }

            private void setBattr(int i10, g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, gVar.getNumber());
            }

            private void setBtype(int i10, e eVar) {
                eVar.getClass();
                ensureBtypeIsMutable();
                this.btype_.setInt(i10, eVar.getNumber());
            }

            private void setExpdir(int i10, g gVar) {
                gVar.getClass();
                ensureExpdirIsMutable();
                this.expdir_.setInt(i10, gVar.getNumber());
            }

            private void setFormat(int i10, Format format) {
                format.getClass();
                ensureFormatIsMutable();
                this.format_.set(i10, format);
            }

            private void setH(int i10) {
                this.bitField0_ |= 2;
                this.h_ = i10;
            }

            private void setHmax(int i10) {
                this.bitField0_ |= 128;
                this.hmax_ = i10;
            }

            private void setHmin(int i10) {
                this.bitField0_ |= 512;
                this.hmin_ = i10;
            }

            private void setId(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.id_ = str;
            }

            private void setIdBytes(ByteString byteString) {
                this.id_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setMimes(int i10, String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.set(i10, str);
            }

            private void setPos(b bVar) {
                this.pos_ = bVar.getNumber();
                this.bitField0_ |= 8;
            }

            private void setTopframe(boolean z10) {
                this.bitField0_ |= 16;
                this.topframe_ = z10;
            }

            private void setVcm(boolean z10) {
                this.bitField0_ |= 32;
                this.vcm_ = z10;
            }

            private void setW(int i10) {
                this.bitField0_ |= 1;
                this.w_ = i10;
            }

            private void setWmax(int i10) {
                this.bitField0_ |= 64;
                this.wmax_ = i10;
            }

            private void setWmin(int i10) {
                this.bitField0_ |= 256;
                this.wmin_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Banner();
                    case 2:
                        return new f();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0006\u0001\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005,\u0006,\u0007\u001a\bဇ\u0004\t,\n,\u000bင\u0006\fင\u0007\rင\b\u000eင\t\u000fЛ\u0010ဇ\u0005", new Object[]{"bitField0_", "w_", "h_", "id_", "pos_", b.h(), "btype_", e.h(), "battr_", g.h(), "mimes_", "topframe_", "expdir_", g.h(), "api_", a.h(), "wmax_", "hmax_", "wmin_", "hmin_", "format_", Format.class, "vcm_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Banner> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Banner.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public a getApi(int i10) {
                a aVarG = a.g(this.api_.getInt(i10));
                return aVarG == null ? a.VPAID_1 : aVarG;
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public List<a> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            public g getBattr(int i10) {
                g gVarG = g.g(this.battr_.getInt(i10));
                return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
            }

            public int getBattrCount() {
                return this.battr_.size();
            }

            public List<g> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            public e getBtype(int i10) {
                e eVarG = e.g(this.btype_.getInt(i10));
                return eVarG == null ? e.XHTML_TEXT_AD : eVarG;
            }

            public int getBtypeCount() {
                return this.btype_.size();
            }

            public List<e> getBtypeList() {
                return new Internal.ListAdapter(this.btype_, btype_converter_);
            }

            public g getExpdir(int i10) {
                g gVarG = g.g(this.expdir_.getInt(i10));
                return gVarG == null ? g.LEFT : gVarG;
            }

            public int getExpdirCount() {
                return this.expdir_.size();
            }

            public List<g> getExpdirList() {
                return new Internal.ListAdapter(this.expdir_, expdir_converter_);
            }

            public Format getFormat(int i10) {
                return this.format_.get(i10);
            }

            public int getFormatCount() {
                return this.format_.size();
            }

            public List<Format> getFormatList() {
                return this.format_;
            }

            public h getFormatOrBuilder(int i10) {
                return this.format_.get(i10);
            }

            public List<? extends h> getFormatOrBuilderList() {
                return this.format_;
            }

            public int getH() {
                return this.h_;
            }

            @Deprecated
            public int getHmax() {
                return this.hmax_;
            }

            @Deprecated
            public int getHmin() {
                return this.hmin_;
            }

            public String getId() {
                return this.id_;
            }

            public ByteString getIdBytes() {
                return ByteString.copyFromUtf8(this.id_);
            }

            public String getMimes(int i10) {
                return this.mimes_.get(i10);
            }

            public ByteString getMimesBytes(int i10) {
                return ByteString.copyFromUtf8(this.mimes_.get(i10));
            }

            public int getMimesCount() {
                return this.mimes_.size();
            }

            public List<String> getMimesList() {
                return this.mimes_;
            }

            public b getPos() {
                b bVarG = b.g(this.pos_);
                return bVarG == null ? b.UNKNOWN : bVarG;
            }

            public boolean getTopframe() {
                return this.topframe_;
            }

            public boolean getVcm() {
                return this.vcm_;
            }

            public int getW() {
                return this.w_;
            }

            @Deprecated
            public int getWmax() {
                return this.wmax_;
            }

            @Deprecated
            public int getWmin() {
                return this.wmin_;
            }

            public boolean hasH() {
                return (this.bitField0_ & 2) != 0;
            }

            @Deprecated
            public boolean hasHmax() {
                return (this.bitField0_ & 128) != 0;
            }

            @Deprecated
            public boolean hasHmin() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasId() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasPos() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasTopframe() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasVcm() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasW() {
                return (this.bitField0_ & 1) != 0;
            }

            @Deprecated
            public boolean hasWmax() {
                return (this.bitField0_ & 64) != 0;
            }

            @Deprecated
            public boolean hasWmin() {
                return (this.bitField0_ & 256) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static f newBuilder(Banner banner) {
                return (f) DEFAULT_INSTANCE.createBuilder(banner);
            }

            public static Banner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addFormat(int i10, Format format) {
                format.getClass();
                ensureFormatIsMutable();
                this.format_.add(i10, format);
            }

            public static Banner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Banner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Banner parseFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Banner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Banner parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Banner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Metric extends GeneratedMessageLite.ExtendableMessage<Metric, a> implements h {
            private static final Metric DEFAULT_INSTANCE;
            private static volatile Parser<Metric> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            public static final int VENDOR_FIELD_NUMBER = 3;
            private int bitField0_;
            private double value_;
            private byte memoizedIsInitialized = 2;
            private String type_ = "";
            private String vendor_ = "";

            public static final class a extends GeneratedMessageLite.ExtendableBuilder implements h {
                private a() {
                    super(Metric.DEFAULT_INSTANCE);
                }
            }

            static {
                Metric metric = new Metric();
                DEFAULT_INSTANCE = metric;
                GeneratedMessageLite.registerDefaultInstance(Metric.class, metric);
            }

            private Metric() {
            }

            private void clearType() {
                this.bitField0_ &= -2;
                this.type_ = getDefaultInstance().getType();
            }

            private void clearValue() {
                this.bitField0_ &= -3;
                this.value_ = 0.0d;
            }

            private void clearVendor() {
                this.bitField0_ &= -5;
                this.vendor_ = getDefaultInstance().getVendor();
            }

            public static Metric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static a newBuilder() {
                return (a) DEFAULT_INSTANCE.createBuilder();
            }

            public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Metric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Metric> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setType(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.type_ = str;
            }

            private void setTypeBytes(ByteString byteString) {
                this.type_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            private void setValue(double d10) {
                this.bitField0_ |= 2;
                this.value_ = d10;
            }

            private void setVendor(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.vendor_ = str;
            }

            private void setVendorBytes(ByteString byteString) {
                this.vendor_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Metric();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "type_", "value_", "vendor_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Metric> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Metric.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public String getType() {
                return this.type_;
            }

            public ByteString getTypeBytes() {
                return ByteString.copyFromUtf8(this.type_);
            }

            public double getValue() {
                return this.value_;
            }

            public String getVendor() {
                return this.vendor_;
            }

            public ByteString getVendorBytes() {
                return ByteString.copyFromUtf8(this.vendor_);
            }

            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasVendor() {
                return (this.bitField0_ & 4) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static a newBuilder(Metric metric) {
                return (a) DEFAULT_INSTANCE.createBuilder(metric);
            }

            public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Metric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Metric parseFrom(InputStream inputStream) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Native extends GeneratedMessageLite.ExtendableMessage<Native, c> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
            public static final int API_FIELD_NUMBER = 3;
            public static final int BATTR_FIELD_NUMBER = 4;
            private static final Native DEFAULT_INSTANCE;
            private static volatile Parser<Native> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int REQUEST_NATIVE_FIELD_NUMBER = 50;
            public static final int VER_FIELD_NUMBER = 2;
            private static final Internal.ListAdapter.Converter<Integer, a> api_converter_ = new a();
            private static final Internal.ListAdapter.Converter<Integer, g> battr_converter_ = new b();
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private Object requestOneof_;
            private int requestOneofCase_ = 0;
            private byte memoizedIsInitialized = 2;
            private String ver_ = "";
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();

            public static final class NativeRequest extends GeneratedMessageLite.ExtendableMessage<NativeRequest, b> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                public static final int ASSETS_FIELD_NUMBER = 6;
                public static final int AURLSUPPORT_FIELD_NUMBER = 11;
                public static final int CONTEXTSUBTYPE_FIELD_NUMBER = 8;
                public static final int CONTEXT_FIELD_NUMBER = 7;
                private static final NativeRequest DEFAULT_INSTANCE;
                public static final int DURLSUPPORT_FIELD_NUMBER = 12;
                public static final int EVENTTRACKERS_FIELD_NUMBER = 13;
                private static volatile Parser<NativeRequest> PARSER = null;
                public static final int PLCMTCNT_FIELD_NUMBER = 4;
                public static final int PLCMTTYPE_FIELD_NUMBER = 9;
                public static final int PRIVACY_FIELD_NUMBER = 14;
                public static final int SEQ_FIELD_NUMBER = 5;
                public static final int VER_FIELD_NUMBER = 1;
                private boolean aurlsupport_;
                private int bitField0_;
                private boolean durlsupport_;
                private boolean privacy_;
                private int seq_;
                private byte memoizedIsInitialized = 2;
                private String ver_ = "";
                private int context_ = 1;
                private int contextsubtype_ = 10;
                private int plcmttype_ = 1;
                private int plcmtcnt_ = 1;
                private Internal.ProtobufList<Asset> assets_ = GeneratedMessageLite.emptyProtobufList();
                private Internal.ProtobufList<EventTrackers> eventtrackers_ = GeneratedMessageLite.emptyProtobufList();

                public static final class Asset extends GeneratedMessageLite.ExtendableMessage<Asset, b> implements a {
                    public static final int DATA_FIELD_NUMBER = 6;
                    private static final Asset DEFAULT_INSTANCE;
                    public static final int ID_FIELD_NUMBER = 1;
                    public static final int IMG_FIELD_NUMBER = 4;
                    private static volatile Parser<Asset> PARSER = null;
                    public static final int REQUIRED_FIELD_NUMBER = 2;
                    public static final int TITLE_FIELD_NUMBER = 3;
                    public static final int VIDEO_FIELD_NUMBER = 5;
                    private Object assetOneof_;
                    private int bitField0_;
                    private int id_;
                    private boolean required_;
                    private int assetOneofCase_ = 0;
                    private byte memoizedIsInitialized = 2;

                    public static final class Data extends GeneratedMessageLite.ExtendableMessage<Data, a> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                        private static final Data DEFAULT_INSTANCE;
                        public static final int LEN_FIELD_NUMBER = 2;
                        private static volatile Parser<Data> PARSER = null;
                        public static final int TYPE_FIELD_NUMBER = 1;
                        private int bitField0_;
                        private int len_;
                        private byte memoizedIsInitialized = 2;
                        private int type_ = 1;

                        public static final class a extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                            private a() {
                                super(Data.DEFAULT_INSTANCE);
                            }
                        }

                        public enum b implements Internal.EnumLite {
                            SPONSORED(1),
                            DESC(2),
                            RATING(3),
                            LIKES(4),
                            DOWNLOADS(5),
                            PRICE(6),
                            SALEPRICE(7),
                            PHONE(8),
                            ADDRESS(9),
                            DESC2(10),
                            DISPLAYURL(11),
                            CTATEXT(12),
                            EXCHANGE_SPECIFIC(500);


                            /* JADX INFO: renamed from: p, reason: collision with root package name */
                            private static final Internal.EnumLiteMap f53547p = new a();

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private final int f53549b;

                            class a implements Internal.EnumLiteMap {
                                a() {
                                }

                                @Override // com.google.protobuf.Internal.EnumLiteMap
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public b findValueByNumber(int i10) {
                                    return b.g(i10);
                                }
                            }

                            /* JADX INFO: renamed from: com.moloco.sdk.BidRequest$SdkBidRequest$Imp$Native$NativeRequest$Asset$Data$b$b, reason: collision with other inner class name */
                            private static final class C0647b implements Internal.EnumVerifier {

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                static final Internal.EnumVerifier f53550a = new C0647b();

                                private C0647b() {
                                }

                                @Override // com.google.protobuf.Internal.EnumVerifier
                                public boolean isInRange(int i10) {
                                    return b.g(i10) != null;
                                }
                            }

                            b(int i10) {
                                this.f53549b = i10;
                            }

                            public static b g(int i10) {
                                if (i10 == 500) {
                                    return EXCHANGE_SPECIFIC;
                                }
                                switch (i10) {
                                    case 1:
                                        return SPONSORED;
                                    case 2:
                                        return DESC;
                                    case 3:
                                        return RATING;
                                    case 4:
                                        return LIKES;
                                    case 5:
                                        return DOWNLOADS;
                                    case 6:
                                        return PRICE;
                                    case 7:
                                        return SALEPRICE;
                                    case 8:
                                        return PHONE;
                                    case 9:
                                        return ADDRESS;
                                    case 10:
                                        return DESC2;
                                    case 11:
                                        return DISPLAYURL;
                                    case 12:
                                        return CTATEXT;
                                    default:
                                        return null;
                                }
                            }

                            public static Internal.EnumVerifier h() {
                                return C0647b.f53550a;
                            }

                            @Override // com.google.protobuf.Internal.EnumLite
                            public final int getNumber() {
                                return this.f53549b;
                            }
                        }

                        static {
                            Data data = new Data();
                            DEFAULT_INSTANCE = data;
                            GeneratedMessageLite.registerDefaultInstance(Data.class, data);
                        }

                        private Data() {
                        }

                        private void clearLen() {
                            this.bitField0_ &= -3;
                            this.len_ = 0;
                        }

                        private void clearType() {
                            this.bitField0_ &= -2;
                            this.type_ = 1;
                        }

                        public static Data getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static a newBuilder() {
                            return (a) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
                            return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static Parser<Data> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        private void setLen(int i10) {
                            this.bitField0_ |= 2;
                            this.len_ = i10;
                        }

                        private void setType(b bVar) {
                            this.type_ = bVar.getNumber();
                            this.bitField0_ |= 1;
                        }

                        @Override // com.google.protobuf.GeneratedMessageLite
                        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                            Parser defaultInstanceBasedParser;
                            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                                case 1:
                                    return new Data();
                                case 2:
                                    return new a();
                                case 3:
                                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001", new Object[]{"bitField0_", "type_", b.h(), "len_"});
                                case 4:
                                    return DEFAULT_INSTANCE;
                                case 5:
                                    Parser<Data> parser = PARSER;
                                    if (parser != null) {
                                        return parser;
                                    }
                                    synchronized (Data.class) {
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
                                    return Byte.valueOf(this.memoizedIsInitialized);
                                case 7:
                                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                    return null;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        public int getLen() {
                            return this.len_;
                        }

                        public b getType() {
                            b bVarG = b.g(this.type_);
                            return bVarG == null ? b.SPONSORED : bVarG;
                        }

                        public boolean hasLen() {
                            return (this.bitField0_ & 2) != 0;
                        }

                        public boolean hasType() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static a newBuilder(Data data) {
                            return (a) DEFAULT_INSTANCE.createBuilder(data);
                        }

                        public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                        }

                        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                        }

                        public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                        }

                        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                        }

                        public static Data parseFrom(InputStream inputStream) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Data parseFrom(CodedInputStream codedInputStream) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                        }

                        public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                        }
                    }

                    public static final class Image extends GeneratedMessageLite.ExtendableMessage<Image, a> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                        private static final Image DEFAULT_INSTANCE;
                        public static final int HMIN_FIELD_NUMBER = 5;
                        public static final int H_FIELD_NUMBER = 3;
                        public static final int MIMES_FIELD_NUMBER = 6;
                        private static volatile Parser<Image> PARSER = null;
                        public static final int TYPE_FIELD_NUMBER = 1;
                        public static final int WMIN_FIELD_NUMBER = 4;
                        public static final int W_FIELD_NUMBER = 2;
                        private int bitField0_;
                        private int h_;
                        private int hmin_;
                        private int w_;
                        private int wmin_;
                        private byte memoizedIsInitialized = 2;
                        private int type_ = 1;
                        private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();

                        public static final class a extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                            private a() {
                                super(Image.DEFAULT_INSTANCE);
                            }
                        }

                        public enum b implements Internal.EnumLite {
                            ICON(1),
                            LOGO(2),
                            MAIN(3);


                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            private static final Internal.EnumLiteMap f53554f = new a();

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private final int f53556b;

                            class a implements Internal.EnumLiteMap {
                                a() {
                                }

                                @Override // com.google.protobuf.Internal.EnumLiteMap
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public b findValueByNumber(int i10) {
                                    return b.g(i10);
                                }
                            }

                            /* JADX INFO: renamed from: com.moloco.sdk.BidRequest$SdkBidRequest$Imp$Native$NativeRequest$Asset$Image$b$b, reason: collision with other inner class name */
                            private static final class C0648b implements Internal.EnumVerifier {

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                static final Internal.EnumVerifier f53557a = new C0648b();

                                private C0648b() {
                                }

                                @Override // com.google.protobuf.Internal.EnumVerifier
                                public boolean isInRange(int i10) {
                                    return b.g(i10) != null;
                                }
                            }

                            b(int i10) {
                                this.f53556b = i10;
                            }

                            public static b g(int i10) {
                                if (i10 == 1) {
                                    return ICON;
                                }
                                if (i10 == 2) {
                                    return LOGO;
                                }
                                if (i10 != 3) {
                                    return null;
                                }
                                return MAIN;
                            }

                            public static Internal.EnumVerifier h() {
                                return C0648b.f53557a;
                            }

                            @Override // com.google.protobuf.Internal.EnumLite
                            public final int getNumber() {
                                return this.f53556b;
                            }
                        }

                        static {
                            Image image = new Image();
                            DEFAULT_INSTANCE = image;
                            GeneratedMessageLite.registerDefaultInstance(Image.class, image);
                        }

                        private Image() {
                        }

                        private void addAllMimes(Iterable<String> iterable) {
                            ensureMimesIsMutable();
                            AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
                        }

                        private void addMimes(String str) {
                            str.getClass();
                            ensureMimesIsMutable();
                            this.mimes_.add(str);
                        }

                        private void addMimesBytes(ByteString byteString) {
                            ensureMimesIsMutable();
                            this.mimes_.add(byteString.toStringUtf8());
                        }

                        private void clearH() {
                            this.bitField0_ &= -5;
                            this.h_ = 0;
                        }

                        private void clearHmin() {
                            this.bitField0_ &= -17;
                            this.hmin_ = 0;
                        }

                        private void clearMimes() {
                            this.mimes_ = GeneratedMessageLite.emptyProtobufList();
                        }

                        private void clearType() {
                            this.bitField0_ &= -2;
                            this.type_ = 1;
                        }

                        private void clearW() {
                            this.bitField0_ &= -3;
                            this.w_ = 0;
                        }

                        private void clearWmin() {
                            this.bitField0_ &= -9;
                            this.wmin_ = 0;
                        }

                        private void ensureMimesIsMutable() {
                            Internal.ProtobufList<String> protobufList = this.mimes_;
                            if (protobufList.isModifiable()) {
                                return;
                            }
                            this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
                        }

                        public static Image getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static a newBuilder() {
                            return (a) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static Image parseDelimitedFrom(InputStream inputStream) throws IOException {
                            return (Image) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Image parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static Parser<Image> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        private void setH(int i10) {
                            this.bitField0_ |= 4;
                            this.h_ = i10;
                        }

                        private void setHmin(int i10) {
                            this.bitField0_ |= 16;
                            this.hmin_ = i10;
                        }

                        private void setMimes(int i10, String str) {
                            str.getClass();
                            ensureMimesIsMutable();
                            this.mimes_.set(i10, str);
                        }

                        private void setType(b bVar) {
                            this.type_ = bVar.getNumber();
                            this.bitField0_ |= 1;
                        }

                        private void setW(int i10) {
                            this.bitField0_ |= 2;
                            this.w_ = i10;
                        }

                        private void setWmin(int i10) {
                            this.bitField0_ |= 8;
                            this.wmin_ = i10;
                        }

                        @Override // com.google.protobuf.GeneratedMessageLite
                        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                            Parser defaultInstanceBasedParser;
                            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                                case 1:
                                    return new Image();
                                case 2:
                                    return new a();
                                case 3:
                                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001a", new Object[]{"bitField0_", "type_", b.h(), "w_", "h_", "wmin_", "hmin_", "mimes_"});
                                case 4:
                                    return DEFAULT_INSTANCE;
                                case 5:
                                    Parser<Image> parser = PARSER;
                                    if (parser != null) {
                                        return parser;
                                    }
                                    synchronized (Image.class) {
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
                                    return Byte.valueOf(this.memoizedIsInitialized);
                                case 7:
                                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                    return null;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        public int getH() {
                            return this.h_;
                        }

                        public int getHmin() {
                            return this.hmin_;
                        }

                        public String getMimes(int i10) {
                            return this.mimes_.get(i10);
                        }

                        public ByteString getMimesBytes(int i10) {
                            return ByteString.copyFromUtf8(this.mimes_.get(i10));
                        }

                        public int getMimesCount() {
                            return this.mimes_.size();
                        }

                        public List<String> getMimesList() {
                            return this.mimes_;
                        }

                        public b getType() {
                            b bVarG = b.g(this.type_);
                            return bVarG == null ? b.ICON : bVarG;
                        }

                        public int getW() {
                            return this.w_;
                        }

                        public int getWmin() {
                            return this.wmin_;
                        }

                        public boolean hasH() {
                            return (this.bitField0_ & 4) != 0;
                        }

                        public boolean hasHmin() {
                            return (this.bitField0_ & 16) != 0;
                        }

                        public boolean hasType() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        public boolean hasW() {
                            return (this.bitField0_ & 2) != 0;
                        }

                        public boolean hasWmin() {
                            return (this.bitField0_ & 8) != 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static a newBuilder(Image image) {
                            return (a) DEFAULT_INSTANCE.createBuilder(image);
                        }

                        public static Image parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Image) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Image parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                        }

                        public static Image parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                        }

                        public static Image parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                        }

                        public static Image parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static Image parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                        }

                        public static Image parseFrom(InputStream inputStream) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Image parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Image parseFrom(CodedInputStream codedInputStream) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                        }

                        public static Image parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                        }
                    }

                    public static final class Title extends GeneratedMessageLite.ExtendableMessage<Title, a> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                        private static final Title DEFAULT_INSTANCE;
                        public static final int LEN_FIELD_NUMBER = 1;
                        private static volatile Parser<Title> PARSER;
                        private int bitField0_;
                        private int len_;
                        private byte memoizedIsInitialized = 2;

                        public static final class a extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                            private a() {
                                super(Title.DEFAULT_INSTANCE);
                            }
                        }

                        static {
                            Title title = new Title();
                            DEFAULT_INSTANCE = title;
                            GeneratedMessageLite.registerDefaultInstance(Title.class, title);
                        }

                        private Title() {
                        }

                        private void clearLen() {
                            this.bitField0_ &= -2;
                            this.len_ = 0;
                        }

                        public static Title getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static a newBuilder() {
                            return (a) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static Title parseDelimitedFrom(InputStream inputStream) throws IOException {
                            return (Title) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Title parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static Parser<Title> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        private void setLen(int i10) {
                            this.bitField0_ |= 1;
                            this.len_ = i10;
                        }

                        @Override // com.google.protobuf.GeneratedMessageLite
                        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                            Parser defaultInstanceBasedParser;
                            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                                case 1:
                                    return new Title();
                                case 2:
                                    return new a();
                                case 3:
                                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"bitField0_", "len_"});
                                case 4:
                                    return DEFAULT_INSTANCE;
                                case 5:
                                    Parser<Title> parser = PARSER;
                                    if (parser != null) {
                                        return parser;
                                    }
                                    synchronized (Title.class) {
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
                                    return Byte.valueOf(this.memoizedIsInitialized);
                                case 7:
                                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                    return null;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        public int getLen() {
                            return this.len_;
                        }

                        public boolean hasLen() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static a newBuilder(Title title) {
                            return (a) DEFAULT_INSTANCE.createBuilder(title);
                        }

                        public static Title parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Title) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Title parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                        }

                        public static Title parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                        }

                        public static Title parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                        }

                        public static Title parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static Title parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                        }

                        public static Title parseFrom(InputStream inputStream) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Title parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Title parseFrom(CodedInputStream codedInputStream) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                        }

                        public static Title parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                        }
                    }

                    public enum a {
                        TITLE(3),
                        IMG(4),
                        VIDEO(5),
                        DATA(6),
                        ASSETONEOF_NOT_SET(0);


                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private final int f53564b;

                        a(int i10) {
                            this.f53564b = i10;
                        }

                        public static a g(int i10) {
                            if (i10 == 0) {
                                return ASSETONEOF_NOT_SET;
                            }
                            if (i10 == 3) {
                                return TITLE;
                            }
                            if (i10 == 4) {
                                return IMG;
                            }
                            if (i10 == 5) {
                                return VIDEO;
                            }
                            if (i10 != 6) {
                                return null;
                            }
                            return DATA;
                        }
                    }

                    public static final class b extends GeneratedMessageLite.ExtendableBuilder implements a {
                        private b() {
                            super(Asset.DEFAULT_INSTANCE);
                        }
                    }

                    static {
                        Asset asset = new Asset();
                        DEFAULT_INSTANCE = asset;
                        GeneratedMessageLite.registerDefaultInstance(Asset.class, asset);
                    }

                    private Asset() {
                    }

                    private void clearAssetOneof() {
                        this.assetOneofCase_ = 0;
                        this.assetOneof_ = null;
                    }

                    private void clearData() {
                        if (this.assetOneofCase_ == 6) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    private void clearId() {
                        this.bitField0_ &= -2;
                        this.id_ = 0;
                    }

                    private void clearImg() {
                        if (this.assetOneofCase_ == 4) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    private void clearRequired() {
                        this.bitField0_ &= -3;
                        this.required_ = false;
                    }

                    private void clearTitle() {
                        if (this.assetOneofCase_ == 3) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    private void clearVideo() {
                        if (this.assetOneofCase_ == 5) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    public static Asset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private void mergeData(Data data) {
                        data.getClass();
                        if (this.assetOneofCase_ != 6 || this.assetOneof_ == Data.getDefaultInstance()) {
                            this.assetOneof_ = data;
                        } else {
                            this.assetOneof_ = ((Data.a) Data.newBuilder((Data) this.assetOneof_).mergeFrom(data)).buildPartial();
                        }
                        this.assetOneofCase_ = 6;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private void mergeImg(Image image) {
                        image.getClass();
                        if (this.assetOneofCase_ != 4 || this.assetOneof_ == Image.getDefaultInstance()) {
                            this.assetOneof_ = image;
                        } else {
                            this.assetOneof_ = ((Image.a) Image.newBuilder((Image) this.assetOneof_).mergeFrom(image)).buildPartial();
                        }
                        this.assetOneofCase_ = 4;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private void mergeTitle(Title title) {
                        title.getClass();
                        if (this.assetOneofCase_ != 3 || this.assetOneof_ == Title.getDefaultInstance()) {
                            this.assetOneof_ = title;
                        } else {
                            this.assetOneof_ = ((Title.a) Title.newBuilder((Title) this.assetOneof_).mergeFrom(title)).buildPartial();
                        }
                        this.assetOneofCase_ = 3;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private void mergeVideo(Video video) {
                        video.getClass();
                        if (this.assetOneofCase_ != 5 || this.assetOneof_ == Video.getDefaultInstance()) {
                            this.assetOneof_ = video;
                        } else {
                            this.assetOneof_ = ((Video.g) Video.newBuilder((Video) this.assetOneof_).mergeFrom(video)).buildPartial();
                        }
                        this.assetOneofCase_ = 5;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static b newBuilder() {
                        return (b) DEFAULT_INSTANCE.createBuilder();
                    }

                    public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static Parser<Asset> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    private void setData(Data data) {
                        data.getClass();
                        this.assetOneof_ = data;
                        this.assetOneofCase_ = 6;
                    }

                    private void setId(int i10) {
                        this.bitField0_ |= 1;
                        this.id_ = i10;
                    }

                    private void setImg(Image image) {
                        image.getClass();
                        this.assetOneof_ = image;
                        this.assetOneofCase_ = 4;
                    }

                    private void setRequired(boolean z10) {
                        this.bitField0_ |= 2;
                        this.required_ = z10;
                    }

                    private void setTitle(Title title) {
                        title.getClass();
                        this.assetOneof_ = title;
                        this.assetOneofCase_ = 3;
                    }

                    private void setVideo(Video video) {
                        video.getClass();
                        this.assetOneof_ = video;
                        this.assetOneofCase_ = 5;
                    }

                    @Override // com.google.protobuf.GeneratedMessageLite
                    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                        Parser defaultInstanceBasedParser;
                        switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                            case 1:
                                return new Asset();
                            case 2:
                                return new b();
                            case 3:
                                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᔄ\u0000\u0002ဇ\u0001\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000", new Object[]{"assetOneof_", "assetOneofCase_", "bitField0_", "id_", "required_", Title.class, Image.class, Video.class, Data.class});
                            case 4:
                                return DEFAULT_INSTANCE;
                            case 5:
                                Parser<Asset> parser = PARSER;
                                if (parser != null) {
                                    return parser;
                                }
                                synchronized (Asset.class) {
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
                                return Byte.valueOf(this.memoizedIsInitialized);
                            case 7:
                                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                return null;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }

                    public a getAssetOneofCase() {
                        return a.g(this.assetOneofCase_);
                    }

                    public Data getData() {
                        return this.assetOneofCase_ == 6 ? (Data) this.assetOneof_ : Data.getDefaultInstance();
                    }

                    public int getId() {
                        return this.id_;
                    }

                    public Image getImg() {
                        return this.assetOneofCase_ == 4 ? (Image) this.assetOneof_ : Image.getDefaultInstance();
                    }

                    public boolean getRequired() {
                        return this.required_;
                    }

                    public Title getTitle() {
                        return this.assetOneofCase_ == 3 ? (Title) this.assetOneof_ : Title.getDefaultInstance();
                    }

                    public Video getVideo() {
                        return this.assetOneofCase_ == 5 ? (Video) this.assetOneof_ : Video.getDefaultInstance();
                    }

                    public boolean hasData() {
                        return this.assetOneofCase_ == 6;
                    }

                    public boolean hasId() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    public boolean hasImg() {
                        return this.assetOneofCase_ == 4;
                    }

                    public boolean hasRequired() {
                        return (this.bitField0_ & 2) != 0;
                    }

                    public boolean hasTitle() {
                        return this.assetOneofCase_ == 3;
                    }

                    public boolean hasVideo() {
                        return this.assetOneofCase_ == 5;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static b newBuilder(Asset asset) {
                        return (b) DEFAULT_INSTANCE.createBuilder(asset);
                    }

                    public static Asset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Asset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                    }

                    public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                    }

                    public static Asset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                    }

                    public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static Asset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                    }

                    public static Asset parseFrom(InputStream inputStream) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Asset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Asset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                    }

                    public static Asset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class EventTrackers extends GeneratedMessageLite.ExtendableMessage<EventTrackers, b> implements e {
                    private static final EventTrackers DEFAULT_INSTANCE;
                    public static final int EVENT_FIELD_NUMBER = 1;
                    public static final int METHODS_FIELD_NUMBER = 2;
                    private static volatile Parser<EventTrackers> PARSER;
                    private static final Internal.ListAdapter.Converter<Integer, c> methods_converter_ = new a();
                    private int bitField0_;
                    private int event_;
                    private byte memoizedIsInitialized = 2;
                    private Internal.IntList methods_ = GeneratedMessageLite.emptyIntList();

                    class a implements Internal.ListAdapter.Converter {
                        a() {
                        }

                        @Override // com.google.protobuf.Internal.ListAdapter.Converter
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public c convert(Integer num) {
                            c cVarG = c.g(num.intValue());
                            return cVarG == null ? c.IMG : cVarG;
                        }
                    }

                    public static final class b extends GeneratedMessageLite.ExtendableBuilder implements e {
                        private b() {
                            super(EventTrackers.DEFAULT_INSTANCE);
                        }
                    }

                    public enum c implements Internal.EnumLite {
                        IMG(1),
                        JS(2);


                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static final Internal.EnumLiteMap f53567e = new a();

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private final int f53569b;

                        class a implements Internal.EnumLiteMap {
                            a() {
                            }

                            @Override // com.google.protobuf.Internal.EnumLiteMap
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public c findValueByNumber(int i10) {
                                return c.g(i10);
                            }
                        }

                        private static final class b implements Internal.EnumVerifier {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            static final Internal.EnumVerifier f53570a = new b();

                            private b() {
                            }

                            @Override // com.google.protobuf.Internal.EnumVerifier
                            public boolean isInRange(int i10) {
                                return c.g(i10) != null;
                            }
                        }

                        c(int i10) {
                            this.f53569b = i10;
                        }

                        public static c g(int i10) {
                            if (i10 == 1) {
                                return IMG;
                            }
                            if (i10 != 2) {
                                return null;
                            }
                            return JS;
                        }

                        public static Internal.EnumVerifier h() {
                            return b.f53570a;
                        }

                        @Override // com.google.protobuf.Internal.EnumLite
                        public final int getNumber() {
                            return this.f53569b;
                        }
                    }

                    public enum d implements Internal.EnumLite {
                        UNKNOWN_EVENT(0),
                        MAKE_BID(6),
                        WIN(1),
                        IMP(2),
                        IMP_EXTRA(14),
                        CLICK(3),
                        POSTBACK(5),
                        INSTALL(4),
                        CUSTOM_ACTION(23),
                        CUSTOM_KPI_ACTION(24),
                        FIRST_PURCHASE(9),
                        PURCHASE(10),
                        LEGACY_FIRST_PURCHASE(11),
                        CALL(12),
                        FIRST_CALL(13),
                        DELIVERY(15),
                        REENGAGE(16),
                        REGISTER(17),
                        AUTHORIZE(20),
                        VAST(7),
                        SPEND(8),
                        OPEN_COMMUNITY(18),
                        INVITE(19),
                        INSTALL_CT(21),
                        INSTALL_VT(22),
                        CUSTOM_ACTION_00(100),
                        CUSTOM_ACTION_01(101),
                        CUSTOM_ACTION_02(102),
                        CUSTOM_ACTION_03(103),
                        CUSTOM_ACTION_04(104),
                        CUSTOM_ACTION_05(105),
                        CUSTOM_ACTION_06(106),
                        CUSTOM_ACTION_07(107),
                        CUSTOM_ACTION_08(108),
                        CUSTOM_ACTION_09(109),
                        CUSTOM_ACTION_10(110),
                        CUSTOM_ACTION_11(111),
                        CUSTOM_ACTION_12(112),
                        CUSTOM_ACTION_13(113),
                        CUSTOM_ACTION_14(114),
                        CUSTOM_ACTION_15(115);

                        private static final Internal.EnumLiteMap R = new a();

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private final int f53595b;

                        class a implements Internal.EnumLiteMap {
                            a() {
                            }

                            @Override // com.google.protobuf.Internal.EnumLiteMap
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public d findValueByNumber(int i10) {
                                return d.g(i10);
                            }
                        }

                        private static final class b implements Internal.EnumVerifier {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            static final Internal.EnumVerifier f53596a = new b();

                            private b() {
                            }

                            @Override // com.google.protobuf.Internal.EnumVerifier
                            public boolean isInRange(int i10) {
                                return d.g(i10) != null;
                            }
                        }

                        d(int i10) {
                            this.f53595b = i10;
                        }

                        public static d g(int i10) {
                            switch (i10) {
                                case 0:
                                    return UNKNOWN_EVENT;
                                case 1:
                                    return WIN;
                                case 2:
                                    return IMP;
                                case 3:
                                    return CLICK;
                                case 4:
                                    return INSTALL;
                                case 5:
                                    return POSTBACK;
                                case 6:
                                    return MAKE_BID;
                                case 7:
                                    return VAST;
                                case 8:
                                    return SPEND;
                                case 9:
                                    return FIRST_PURCHASE;
                                case 10:
                                    return PURCHASE;
                                case 11:
                                    return LEGACY_FIRST_PURCHASE;
                                case 12:
                                    return CALL;
                                case 13:
                                    return FIRST_CALL;
                                case 14:
                                    return IMP_EXTRA;
                                case 15:
                                    return DELIVERY;
                                case 16:
                                    return REENGAGE;
                                case 17:
                                    return REGISTER;
                                case 18:
                                    return OPEN_COMMUNITY;
                                case 19:
                                    return INVITE;
                                case 20:
                                    return AUTHORIZE;
                                case 21:
                                    return INSTALL_CT;
                                case 22:
                                    return INSTALL_VT;
                                case 23:
                                    return CUSTOM_ACTION;
                                case 24:
                                    return CUSTOM_KPI_ACTION;
                                default:
                                    switch (i10) {
                                        case 100:
                                            return CUSTOM_ACTION_00;
                                        case 101:
                                            return CUSTOM_ACTION_01;
                                        case 102:
                                            return CUSTOM_ACTION_02;
                                        case 103:
                                            return CUSTOM_ACTION_03;
                                        case 104:
                                            return CUSTOM_ACTION_04;
                                        case 105:
                                            return CUSTOM_ACTION_05;
                                        case 106:
                                            return CUSTOM_ACTION_06;
                                        case 107:
                                            return CUSTOM_ACTION_07;
                                        case 108:
                                            return CUSTOM_ACTION_08;
                                        case 109:
                                            return CUSTOM_ACTION_09;
                                        case 110:
                                            return CUSTOM_ACTION_10;
                                        case 111:
                                            return CUSTOM_ACTION_11;
                                        case 112:
                                            return CUSTOM_ACTION_12;
                                        case 113:
                                            return CUSTOM_ACTION_13;
                                        case 114:
                                            return CUSTOM_ACTION_14;
                                        case 115:
                                            return CUSTOM_ACTION_15;
                                        default:
                                            return null;
                                    }
                            }
                        }

                        public static Internal.EnumVerifier h() {
                            return b.f53596a;
                        }

                        @Override // com.google.protobuf.Internal.EnumLite
                        public final int getNumber() {
                            return this.f53595b;
                        }
                    }

                    static {
                        EventTrackers eventTrackers = new EventTrackers();
                        DEFAULT_INSTANCE = eventTrackers;
                        GeneratedMessageLite.registerDefaultInstance(EventTrackers.class, eventTrackers);
                    }

                    private EventTrackers() {
                    }

                    private void addAllMethods(Iterable<? extends c> iterable) {
                        ensureMethodsIsMutable();
                        Iterator<? extends c> it = iterable.iterator();
                        while (it.hasNext()) {
                            this.methods_.addInt(it.next().getNumber());
                        }
                    }

                    private void addMethods(c cVar) {
                        cVar.getClass();
                        ensureMethodsIsMutable();
                        this.methods_.addInt(cVar.getNumber());
                    }

                    private void clearEvent() {
                        this.bitField0_ &= -2;
                        this.event_ = 0;
                    }

                    private void clearMethods() {
                        this.methods_ = GeneratedMessageLite.emptyIntList();
                    }

                    private void ensureMethodsIsMutable() {
                        Internal.IntList intList = this.methods_;
                        if (intList.isModifiable()) {
                            return;
                        }
                        this.methods_ = GeneratedMessageLite.mutableCopy(intList);
                    }

                    public static EventTrackers getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static b newBuilder() {
                        return (b) DEFAULT_INSTANCE.createBuilder();
                    }

                    public static EventTrackers parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static EventTrackers parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static Parser<EventTrackers> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    private void setEvent(d dVar) {
                        this.event_ = dVar.getNumber();
                        this.bitField0_ |= 1;
                    }

                    private void setMethods(int i10, c cVar) {
                        cVar.getClass();
                        ensureMethodsIsMutable();
                        this.methods_.setInt(i10, cVar.getNumber());
                    }

                    @Override // com.google.protobuf.GeneratedMessageLite
                    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                        Parser defaultInstanceBasedParser;
                        switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                            case 1:
                                return new EventTrackers();
                            case 2:
                                return new b();
                            case 3:
                                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔌ\u0000\u0002\u001e", new Object[]{"bitField0_", "event_", d.h(), "methods_", c.h()});
                            case 4:
                                return DEFAULT_INSTANCE;
                            case 5:
                                Parser<EventTrackers> parser = PARSER;
                                if (parser != null) {
                                    return parser;
                                }
                                synchronized (EventTrackers.class) {
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
                                return Byte.valueOf(this.memoizedIsInitialized);
                            case 7:
                                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                return null;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }

                    public d getEvent() {
                        d dVarG = d.g(this.event_);
                        return dVarG == null ? d.UNKNOWN_EVENT : dVarG;
                    }

                    public c getMethods(int i10) {
                        c cVarG = c.g(this.methods_.getInt(i10));
                        return cVarG == null ? c.IMG : cVarG;
                    }

                    public int getMethodsCount() {
                        return this.methods_.size();
                    }

                    public List<c> getMethodsList() {
                        return new Internal.ListAdapter(this.methods_, methods_converter_);
                    }

                    public boolean hasEvent() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static b newBuilder(EventTrackers eventTrackers) {
                        return (b) DEFAULT_INSTANCE.createBuilder(eventTrackers);
                    }

                    public static EventTrackers parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                    }

                    public static EventTrackers parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static EventTrackers parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(InputStream inputStream) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static EventTrackers parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                    }

                    public static EventTrackers parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                    }
                }

                public interface a extends GeneratedMessageLite.ExtendableMessageOrBuilder {
                }

                public static final class b extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                    private b() {
                        super(NativeRequest.DEFAULT_INSTANCE);
                    }
                }

                public enum c implements Internal.EnumLite {
                    CONTENT_GENERAL_OR_MIXED(10),
                    CONTENT_ARTICLE(11),
                    CONTENT_VIDEO(12),
                    CONTENT_AUDIO(13),
                    CONTENT_IMAGE(14),
                    CONTENT_USER_GENERATED(15),
                    SOCIAL_GENERAL(20),
                    SOCIAL_EMAIL(21),
                    SOCIAL_CHAT_IM(22),
                    PRODUCT_SELLING(30),
                    PRODUCT_MARKETPLACE(31),
                    PRODUCT_REVIEW(32);


                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    private static final Internal.EnumLiteMap f53609o = new a();

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f53611b;

                    class a implements Internal.EnumLiteMap {
                        a() {
                        }

                        @Override // com.google.protobuf.Internal.EnumLiteMap
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public c findValueByNumber(int i10) {
                            return c.g(i10);
                        }
                    }

                    private static final class b implements Internal.EnumVerifier {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        static final Internal.EnumVerifier f53612a = new b();

                        private b() {
                        }

                        @Override // com.google.protobuf.Internal.EnumVerifier
                        public boolean isInRange(int i10) {
                            return c.g(i10) != null;
                        }
                    }

                    c(int i10) {
                        this.f53611b = i10;
                    }

                    public static c g(int i10) {
                        switch (i10) {
                            case 10:
                                return CONTENT_GENERAL_OR_MIXED;
                            case 11:
                                return CONTENT_ARTICLE;
                            case 12:
                                return CONTENT_VIDEO;
                            case 13:
                                return CONTENT_AUDIO;
                            case 14:
                                return CONTENT_IMAGE;
                            case 15:
                                return CONTENT_USER_GENERATED;
                            default:
                                switch (i10) {
                                    case 20:
                                        return SOCIAL_GENERAL;
                                    case 21:
                                        return SOCIAL_EMAIL;
                                    case 22:
                                        return SOCIAL_CHAT_IM;
                                    default:
                                        switch (i10) {
                                            case 30:
                                                return PRODUCT_SELLING;
                                            case 31:
                                                return PRODUCT_MARKETPLACE;
                                            case 32:
                                                return PRODUCT_REVIEW;
                                            default:
                                                return null;
                                        }
                                }
                        }
                    }

                    public static Internal.EnumVerifier h() {
                        return b.f53612a;
                    }

                    @Override // com.google.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.f53611b;
                    }
                }

                public enum d implements Internal.EnumLite {
                    CONTENT(1),
                    SOCIAL(2),
                    PRODUCT(3);


                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final Internal.EnumLiteMap f53616f = new a();

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f53618b;

                    class a implements Internal.EnumLiteMap {
                        a() {
                        }

                        @Override // com.google.protobuf.Internal.EnumLiteMap
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public d findValueByNumber(int i10) {
                            return d.g(i10);
                        }
                    }

                    private static final class b implements Internal.EnumVerifier {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        static final Internal.EnumVerifier f53619a = new b();

                        private b() {
                        }

                        @Override // com.google.protobuf.Internal.EnumVerifier
                        public boolean isInRange(int i10) {
                            return d.g(i10) != null;
                        }
                    }

                    d(int i10) {
                        this.f53618b = i10;
                    }

                    public static d g(int i10) {
                        if (i10 == 1) {
                            return CONTENT;
                        }
                        if (i10 == 2) {
                            return SOCIAL;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return PRODUCT;
                    }

                    public static Internal.EnumVerifier h() {
                        return b.f53619a;
                    }

                    @Override // com.google.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.f53618b;
                    }
                }

                public interface e extends GeneratedMessageLite.ExtendableMessageOrBuilder {
                }

                public enum f implements Internal.EnumLite {
                    IN_FEED(1),
                    ATOMIC_UNIT(2),
                    OUTSIDE(3),
                    RECOMMENDATION(4);


                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final Internal.EnumLiteMap f53624g = new a();

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f53626b;

                    class a implements Internal.EnumLiteMap {
                        a() {
                        }

                        @Override // com.google.protobuf.Internal.EnumLiteMap
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public f findValueByNumber(int i10) {
                            return f.g(i10);
                        }
                    }

                    private static final class b implements Internal.EnumVerifier {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        static final Internal.EnumVerifier f53627a = new b();

                        private b() {
                        }

                        @Override // com.google.protobuf.Internal.EnumVerifier
                        public boolean isInRange(int i10) {
                            return f.g(i10) != null;
                        }
                    }

                    f(int i10) {
                        this.f53626b = i10;
                    }

                    public static f g(int i10) {
                        if (i10 == 1) {
                            return IN_FEED;
                        }
                        if (i10 == 2) {
                            return ATOMIC_UNIT;
                        }
                        if (i10 == 3) {
                            return OUTSIDE;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return RECOMMENDATION;
                    }

                    public static Internal.EnumVerifier h() {
                        return b.f53627a;
                    }

                    @Override // com.google.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.f53626b;
                    }
                }

                static {
                    NativeRequest nativeRequest = new NativeRequest();
                    DEFAULT_INSTANCE = nativeRequest;
                    GeneratedMessageLite.registerDefaultInstance(NativeRequest.class, nativeRequest);
                }

                private NativeRequest() {
                }

                private void addAllAssets(Iterable<? extends Asset> iterable) {
                    ensureAssetsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.assets_);
                }

                private void addAllEventtrackers(Iterable<? extends EventTrackers> iterable) {
                    ensureEventtrackersIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.eventtrackers_);
                }

                private void addAssets(Asset asset) {
                    asset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.add(asset);
                }

                private void addEventtrackers(EventTrackers eventTrackers) {
                    eventTrackers.getClass();
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.add(eventTrackers);
                }

                private void clearAssets() {
                    this.assets_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void clearAurlsupport() {
                    this.bitField0_ &= -65;
                    this.aurlsupport_ = false;
                }

                private void clearContext() {
                    this.bitField0_ &= -3;
                    this.context_ = 1;
                }

                private void clearContextsubtype() {
                    this.bitField0_ &= -5;
                    this.contextsubtype_ = 10;
                }

                private void clearDurlsupport() {
                    this.bitField0_ &= -129;
                    this.durlsupport_ = false;
                }

                private void clearEventtrackers() {
                    this.eventtrackers_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void clearPlcmtcnt() {
                    this.bitField0_ &= -17;
                    this.plcmtcnt_ = 1;
                }

                private void clearPlcmttype() {
                    this.bitField0_ &= -9;
                    this.plcmttype_ = 1;
                }

                private void clearPrivacy() {
                    this.bitField0_ &= -257;
                    this.privacy_ = false;
                }

                private void clearSeq() {
                    this.bitField0_ &= -33;
                    this.seq_ = 0;
                }

                private void clearVer() {
                    this.bitField0_ &= -2;
                    this.ver_ = getDefaultInstance().getVer();
                }

                private void ensureAssetsIsMutable() {
                    Internal.ProtobufList<Asset> protobufList = this.assets_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.assets_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                private void ensureEventtrackersIsMutable() {
                    Internal.ProtobufList<EventTrackers> protobufList = this.eventtrackers_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.eventtrackers_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static NativeRequest getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static b newBuilder() {
                    return (b) DEFAULT_INSTANCE.createBuilder();
                }

                public static NativeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static NativeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<NativeRequest> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void removeAssets(int i10) {
                    ensureAssetsIsMutable();
                    this.assets_.remove(i10);
                }

                private void removeEventtrackers(int i10) {
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.remove(i10);
                }

                private void setAssets(int i10, Asset asset) {
                    asset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.set(i10, asset);
                }

                private void setAurlsupport(boolean z10) {
                    this.bitField0_ |= 64;
                    this.aurlsupport_ = z10;
                }

                private void setContext(d dVar) {
                    this.context_ = dVar.getNumber();
                    this.bitField0_ |= 2;
                }

                private void setContextsubtype(c cVar) {
                    this.contextsubtype_ = cVar.getNumber();
                    this.bitField0_ |= 4;
                }

                private void setDurlsupport(boolean z10) {
                    this.bitField0_ |= 128;
                    this.durlsupport_ = z10;
                }

                private void setEventtrackers(int i10, EventTrackers eventTrackers) {
                    eventTrackers.getClass();
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.set(i10, eventTrackers);
                }

                private void setPlcmtcnt(int i10) {
                    this.bitField0_ |= 16;
                    this.plcmtcnt_ = i10;
                }

                private void setPlcmttype(f fVar) {
                    this.plcmttype_ = fVar.getNumber();
                    this.bitField0_ |= 8;
                }

                private void setPrivacy(boolean z10) {
                    this.bitField0_ |= 256;
                    this.privacy_ = z10;
                }

                private void setSeq(int i10) {
                    this.bitField0_ |= 32;
                    this.seq_ = i10;
                }

                private void setVer(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.ver_ = str;
                }

                private void setVerBytes(ByteString byteString) {
                    this.ver_ = byteString.toStringUtf8();
                    this.bitField0_ |= 1;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new NativeRequest();
                        case 2:
                            return new b();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0002\u0002\u0001ဈ\u0000\u0004င\u0004\u0005င\u0005\u0006Л\u0007ဌ\u0001\bဌ\u0002\tဌ\u0003\u000bဇ\u0006\fဇ\u0007\rЛ\u000eဇ\b", new Object[]{"bitField0_", "ver_", "plcmtcnt_", "seq_", "assets_", Asset.class, "context_", d.h(), "contextsubtype_", c.h(), "plcmttype_", f.h(), "aurlsupport_", "durlsupport_", "eventtrackers_", EventTrackers.class, "privacy_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<NativeRequest> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (NativeRequest.class) {
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
                            return Byte.valueOf(this.memoizedIsInitialized);
                        case 7:
                            this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                public Asset getAssets(int i10) {
                    return this.assets_.get(i10);
                }

                public int getAssetsCount() {
                    return this.assets_.size();
                }

                public List<Asset> getAssetsList() {
                    return this.assets_;
                }

                public a getAssetsOrBuilder(int i10) {
                    return this.assets_.get(i10);
                }

                public List<? extends a> getAssetsOrBuilderList() {
                    return this.assets_;
                }

                public boolean getAurlsupport() {
                    return this.aurlsupport_;
                }

                public d getContext() {
                    d dVarG = d.g(this.context_);
                    return dVarG == null ? d.CONTENT : dVarG;
                }

                public c getContextsubtype() {
                    c cVarG = c.g(this.contextsubtype_);
                    return cVarG == null ? c.CONTENT_GENERAL_OR_MIXED : cVarG;
                }

                public boolean getDurlsupport() {
                    return this.durlsupport_;
                }

                public EventTrackers getEventtrackers(int i10) {
                    return this.eventtrackers_.get(i10);
                }

                public int getEventtrackersCount() {
                    return this.eventtrackers_.size();
                }

                public List<EventTrackers> getEventtrackersList() {
                    return this.eventtrackers_;
                }

                public e getEventtrackersOrBuilder(int i10) {
                    return this.eventtrackers_.get(i10);
                }

                public List<? extends e> getEventtrackersOrBuilderList() {
                    return this.eventtrackers_;
                }

                public int getPlcmtcnt() {
                    return this.plcmtcnt_;
                }

                public f getPlcmttype() {
                    f fVarG = f.g(this.plcmttype_);
                    return fVarG == null ? f.IN_FEED : fVarG;
                }

                public boolean getPrivacy() {
                    return this.privacy_;
                }

                public int getSeq() {
                    return this.seq_;
                }

                public String getVer() {
                    return this.ver_;
                }

                public ByteString getVerBytes() {
                    return ByteString.copyFromUtf8(this.ver_);
                }

                public boolean hasAurlsupport() {
                    return (this.bitField0_ & 64) != 0;
                }

                public boolean hasContext() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasContextsubtype() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasDurlsupport() {
                    return (this.bitField0_ & 128) != 0;
                }

                public boolean hasPlcmtcnt() {
                    return (this.bitField0_ & 16) != 0;
                }

                public boolean hasPlcmttype() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasPrivacy() {
                    return (this.bitField0_ & 256) != 0;
                }

                public boolean hasSeq() {
                    return (this.bitField0_ & 32) != 0;
                }

                public boolean hasVer() {
                    return (this.bitField0_ & 1) != 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static b newBuilder(NativeRequest nativeRequest) {
                    return (b) DEFAULT_INSTANCE.createBuilder(nativeRequest);
                }

                public static NativeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void addAssets(int i10, Asset asset) {
                    asset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.add(i10, asset);
                }

                private void addEventtrackers(int i10, EventTrackers eventTrackers) {
                    eventTrackers.getClass();
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.add(i10, eventTrackers);
                }

                public static NativeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static NativeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(InputStream inputStream) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static NativeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static NativeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            class a implements Internal.ListAdapter.Converter {
                a() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a convert(Integer num) {
                    a aVarG = a.g(num.intValue());
                    return aVarG == null ? a.VPAID_1 : aVarG;
                }
            }

            class b implements Internal.ListAdapter.Converter {
                b() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public g convert(Integer num) {
                    g gVarG = g.g(num.intValue());
                    return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
                }
            }

            public static final class c extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                private c() {
                    super(Native.DEFAULT_INSTANCE);
                }
            }

            public enum d {
                REQUEST(1),
                REQUEST_NATIVE(50),
                REQUESTONEOF_NOT_SET(0);


                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53632b;

                d(int i10) {
                    this.f53632b = i10;
                }

                public static d g(int i10) {
                    if (i10 == 0) {
                        return REQUESTONEOF_NOT_SET;
                    }
                    if (i10 == 1) {
                        return REQUEST;
                    }
                    if (i10 != 50) {
                        return null;
                    }
                    return REQUEST_NATIVE;
                }
            }

            static {
                Native r02 = new Native();
                DEFAULT_INSTANCE = r02;
                GeneratedMessageLite.registerDefaultInstance(Native.class, r02);
            }

            private Native() {
            }

            private void addAllApi(Iterable<? extends a> iterable) {
                ensureApiIsMutable();
                Iterator<? extends a> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            private void addAllBattr(Iterable<? extends g> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends g> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            private void addApi(a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.addInt(aVar.getNumber());
            }

            private void addBattr(g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(gVar.getNumber());
            }

            private void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearRequest() {
                if (this.requestOneofCase_ == 1) {
                    this.requestOneofCase_ = 0;
                    this.requestOneof_ = null;
                }
            }

            private void clearRequestNative() {
                if (this.requestOneofCase_ == 50) {
                    this.requestOneofCase_ = 0;
                    this.requestOneof_ = null;
                }
            }

            private void clearRequestOneof() {
                this.requestOneofCase_ = 0;
                this.requestOneof_ = null;
            }

            private void clearVer() {
                this.bitField0_ &= -5;
                this.ver_ = getDefaultInstance().getVer();
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void mergeRequestNative(NativeRequest nativeRequest) {
                nativeRequest.getClass();
                if (this.requestOneofCase_ != 50 || this.requestOneof_ == NativeRequest.getDefaultInstance()) {
                    this.requestOneof_ = nativeRequest;
                } else {
                    this.requestOneof_ = ((NativeRequest.b) NativeRequest.newBuilder((NativeRequest) this.requestOneof_).mergeFrom(nativeRequest)).buildPartial();
                }
                this.requestOneofCase_ = 50;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static c newBuilder() {
                return (c) DEFAULT_INSTANCE.createBuilder();
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

            private void setApi(int i10, a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, aVar.getNumber());
            }

            private void setBattr(int i10, g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, gVar.getNumber());
            }

            private void setRequest(String str) {
                str.getClass();
                this.requestOneofCase_ = 1;
                this.requestOneof_ = str;
            }

            private void setRequestBytes(ByteString byteString) {
                this.requestOneof_ = byteString.toStringUtf8();
                this.requestOneofCase_ = 1;
            }

            private void setRequestNative(NativeRequest nativeRequest) {
                nativeRequest.getClass();
                this.requestOneof_ = nativeRequest;
                this.requestOneofCase_ = 50;
            }

            private void setVer(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.ver_ = str;
            }

            private void setVerBytes(ByteString byteString) {
                this.ver_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Native();
                    case 2:
                        return new c();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u00012\u0005\u0000\u0002\u0001\u0001ျ\u0000\u0002ဈ\u0002\u0003,\u0004,2ᐼ\u0000", new Object[]{"requestOneof_", "requestOneofCase_", "bitField0_", "ver_", "api_", a.h(), "battr_", g.h(), NativeRequest.class});
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public a getApi(int i10) {
                a aVarG = a.g(this.api_.getInt(i10));
                return aVarG == null ? a.VPAID_1 : aVarG;
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public List<a> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            public g getBattr(int i10) {
                g gVarG = g.g(this.battr_.getInt(i10));
                return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
            }

            public int getBattrCount() {
                return this.battr_.size();
            }

            public List<g> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            public String getRequest() {
                return this.requestOneofCase_ == 1 ? (String) this.requestOneof_ : "";
            }

            public ByteString getRequestBytes() {
                return ByteString.copyFromUtf8(this.requestOneofCase_ == 1 ? (String) this.requestOneof_ : "");
            }

            public NativeRequest getRequestNative() {
                return this.requestOneofCase_ == 50 ? (NativeRequest) this.requestOneof_ : NativeRequest.getDefaultInstance();
            }

            public d getRequestOneofCase() {
                return d.g(this.requestOneofCase_);
            }

            public String getVer() {
                return this.ver_;
            }

            public ByteString getVerBytes() {
                return ByteString.copyFromUtf8(this.ver_);
            }

            public boolean hasRequest() {
                return this.requestOneofCase_ == 1;
            }

            public boolean hasRequestNative() {
                return this.requestOneofCase_ == 50;
            }

            public boolean hasVer() {
                return (this.bitField0_ & 4) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static c newBuilder(Native r12) {
                return (c) DEFAULT_INSTANCE.createBuilder(r12);
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

        public static final class Pmp extends GeneratedMessageLite.ExtendableMessage<Pmp, a> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
            public static final int DEALS_FIELD_NUMBER = 2;
            private static final Pmp DEFAULT_INSTANCE;
            private static volatile Parser<Pmp> PARSER = null;
            public static final int PRIVATE_AUCTION_FIELD_NUMBER = 1;
            private int bitField0_;
            private boolean privateAuction_;
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<Deal> deals_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Deal extends GeneratedMessageLite.ExtendableMessage<Deal, b> implements b {
                public static final int AT_FIELD_NUMBER = 6;
                public static final int BIDFLOORCUR_FIELD_NUMBER = 3;
                public static final int BIDFLOOR_FIELD_NUMBER = 2;
                private static final Deal DEFAULT_INSTANCE;
                public static final int ID_FIELD_NUMBER = 1;
                private static volatile Parser<Deal> PARSER = null;
                public static final int WADOMAIN_FIELD_NUMBER = 5;
                public static final int WSEAT_FIELD_NUMBER = 4;
                private double bidfloor_;
                private int bitField0_;
                private byte memoizedIsInitialized = 2;
                private String id_ = "";
                private String bidfloorcur_ = "USD";
                private Internal.ProtobufList<String> wseat_ = GeneratedMessageLite.emptyProtobufList();
                private Internal.ProtobufList<String> wadomain_ = GeneratedMessageLite.emptyProtobufList();
                private int at_ = 1;

                public enum a implements Internal.EnumLite {
                    FIRST_PRICE(1),
                    SECOND_PRICE(2),
                    FIXED_PRICE(3);


                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final Internal.EnumLiteMap f53636f = new C0649a();

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f53638b;

                    /* JADX INFO: renamed from: com.moloco.sdk.BidRequest$SdkBidRequest$Imp$Pmp$Deal$a$a, reason: collision with other inner class name */
                    class C0649a implements Internal.EnumLiteMap {
                        C0649a() {
                        }

                        @Override // com.google.protobuf.Internal.EnumLiteMap
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public a findValueByNumber(int i10) {
                            return a.g(i10);
                        }
                    }

                    private static final class b implements Internal.EnumVerifier {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        static final Internal.EnumVerifier f53639a = new b();

                        private b() {
                        }

                        @Override // com.google.protobuf.Internal.EnumVerifier
                        public boolean isInRange(int i10) {
                            return a.g(i10) != null;
                        }
                    }

                    a(int i10) {
                        this.f53638b = i10;
                    }

                    public static a g(int i10) {
                        if (i10 == 1) {
                            return FIRST_PRICE;
                        }
                        if (i10 == 2) {
                            return SECOND_PRICE;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return FIXED_PRICE;
                    }

                    public static Internal.EnumVerifier h() {
                        return b.f53639a;
                    }

                    @Override // com.google.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.f53638b;
                    }
                }

                public static final class b extends GeneratedMessageLite.ExtendableBuilder implements b {
                    private b() {
                        super(Deal.DEFAULT_INSTANCE);
                    }
                }

                static {
                    Deal deal = new Deal();
                    DEFAULT_INSTANCE = deal;
                    GeneratedMessageLite.registerDefaultInstance(Deal.class, deal);
                }

                private Deal() {
                }

                private void addAllWadomain(Iterable<String> iterable) {
                    ensureWadomainIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.wadomain_);
                }

                private void addAllWseat(Iterable<String> iterable) {
                    ensureWseatIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.wseat_);
                }

                private void addWadomain(String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.add(str);
                }

                private void addWadomainBytes(ByteString byteString) {
                    ensureWadomainIsMutable();
                    this.wadomain_.add(byteString.toStringUtf8());
                }

                private void addWseat(String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.add(str);
                }

                private void addWseatBytes(ByteString byteString) {
                    ensureWseatIsMutable();
                    this.wseat_.add(byteString.toStringUtf8());
                }

                private void clearAt() {
                    this.bitField0_ &= -9;
                    this.at_ = 1;
                }

                private void clearBidfloor() {
                    this.bitField0_ &= -3;
                    this.bidfloor_ = 0.0d;
                }

                private void clearBidfloorcur() {
                    this.bitField0_ &= -5;
                    this.bidfloorcur_ = getDefaultInstance().getBidfloorcur();
                }

                private void clearId() {
                    this.bitField0_ &= -2;
                    this.id_ = getDefaultInstance().getId();
                }

                private void clearWadomain() {
                    this.wadomain_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void clearWseat() {
                    this.wseat_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureWadomainIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.wadomain_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.wadomain_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                private void ensureWseatIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.wseat_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.wseat_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static Deal getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static b newBuilder() {
                    return (b) DEFAULT_INSTANCE.createBuilder();
                }

                public static Deal parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Deal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Deal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Deal> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setAt(a aVar) {
                    this.at_ = aVar.getNumber();
                    this.bitField0_ |= 8;
                }

                private void setBidfloor(double d10) {
                    this.bitField0_ |= 2;
                    this.bidfloor_ = d10;
                }

                private void setBidfloorcur(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.bidfloorcur_ = str;
                }

                private void setBidfloorcurBytes(ByteString byteString) {
                    this.bidfloorcur_ = byteString.toStringUtf8();
                    this.bitField0_ |= 4;
                }

                private void setId(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.id_ = str;
                }

                private void setIdBytes(ByteString byteString) {
                    this.id_ = byteString.toStringUtf8();
                    this.bitField0_ |= 1;
                }

                private void setWadomain(int i10, String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.set(i10, str);
                }

                private void setWseat(int i10, String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.set(i10, str);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Deal();
                        case 2:
                            return new b();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0001\u0001ᔈ\u0000\u0002က\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0006ဌ\u0003", new Object[]{"bitField0_", "id_", "bidfloor_", "bidfloorcur_", "wseat_", "wadomain_", "at_", a.h()});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Deal> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (Deal.class) {
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
                            return Byte.valueOf(this.memoizedIsInitialized);
                        case 7:
                            this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                public a getAt() {
                    a aVarG = a.g(this.at_);
                    return aVarG == null ? a.FIRST_PRICE : aVarG;
                }

                public double getBidfloor() {
                    return this.bidfloor_;
                }

                public String getBidfloorcur() {
                    return this.bidfloorcur_;
                }

                public ByteString getBidfloorcurBytes() {
                    return ByteString.copyFromUtf8(this.bidfloorcur_);
                }

                public String getId() {
                    return this.id_;
                }

                public ByteString getIdBytes() {
                    return ByteString.copyFromUtf8(this.id_);
                }

                public String getWadomain(int i10) {
                    return this.wadomain_.get(i10);
                }

                public ByteString getWadomainBytes(int i10) {
                    return ByteString.copyFromUtf8(this.wadomain_.get(i10));
                }

                public int getWadomainCount() {
                    return this.wadomain_.size();
                }

                public List<String> getWadomainList() {
                    return this.wadomain_;
                }

                public String getWseat(int i10) {
                    return this.wseat_.get(i10);
                }

                public ByteString getWseatBytes(int i10) {
                    return ByteString.copyFromUtf8(this.wseat_.get(i10));
                }

                public int getWseatCount() {
                    return this.wseat_.size();
                }

                public List<String> getWseatList() {
                    return this.wseat_;
                }

                public boolean hasAt() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasBidfloor() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasBidfloorcur() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasId() {
                    return (this.bitField0_ & 1) != 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static b newBuilder(Deal deal) {
                    return (b) DEFAULT_INSTANCE.createBuilder(deal);
                }

                public static Deal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Deal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Deal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static Deal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Deal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Deal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Deal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Deal parseFrom(InputStream inputStream) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Deal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Deal parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Deal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                private a() {
                    super(Pmp.DEFAULT_INSTANCE);
                }
            }

            public interface b extends GeneratedMessageLite.ExtendableMessageOrBuilder {
            }

            static {
                Pmp pmp = new Pmp();
                DEFAULT_INSTANCE = pmp;
                GeneratedMessageLite.registerDefaultInstance(Pmp.class, pmp);
            }

            private Pmp() {
            }

            private void addAllDeals(Iterable<? extends Deal> iterable) {
                ensureDealsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.deals_);
            }

            private void addDeals(Deal deal) {
                deal.getClass();
                ensureDealsIsMutable();
                this.deals_.add(deal);
            }

            private void clearDeals() {
                this.deals_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearPrivateAuction() {
                this.bitField0_ &= -2;
                this.privateAuction_ = false;
            }

            private void ensureDealsIsMutable() {
                Internal.ProtobufList<Deal> protobufList = this.deals_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.deals_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Pmp getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static a newBuilder() {
                return (a) DEFAULT_INSTANCE.createBuilder();
            }

            public static Pmp parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Pmp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Pmp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Pmp> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeDeals(int i10) {
                ensureDealsIsMutable();
                this.deals_.remove(i10);
            }

            private void setDeals(int i10, Deal deal) {
                deal.getClass();
                ensureDealsIsMutable();
                this.deals_.set(i10, deal);
            }

            private void setPrivateAuction(boolean z10) {
                this.bitField0_ |= 1;
                this.privateAuction_ = z10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Pmp();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဇ\u0000\u0002Л", new Object[]{"bitField0_", "privateAuction_", "deals_", Deal.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Pmp> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Pmp.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public Deal getDeals(int i10) {
                return this.deals_.get(i10);
            }

            public int getDealsCount() {
                return this.deals_.size();
            }

            public List<Deal> getDealsList() {
                return this.deals_;
            }

            public b getDealsOrBuilder(int i10) {
                return this.deals_.get(i10);
            }

            public List<? extends b> getDealsOrBuilderList() {
                return this.deals_;
            }

            public boolean getPrivateAuction() {
                return this.privateAuction_;
            }

            public boolean hasPrivateAuction() {
                return (this.bitField0_ & 1) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static a newBuilder(Pmp pmp) {
                return (a) DEFAULT_INSTANCE.createBuilder(pmp);
            }

            public static Pmp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pmp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Pmp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Pmp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addDeals(int i10, Deal deal) {
                deal.getClass();
                ensureDealsIsMutable();
                this.deals_.add(i10, deal);
            }

            public static Pmp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Pmp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Pmp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Pmp parseFrom(InputStream inputStream) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Pmp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Pmp parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Pmp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Video extends GeneratedMessageLite.ExtendableMessage<Video, g> implements GeneratedMessageLite.ExtendableMessageOrBuilder {
            public static final int API_FIELD_NUMBER = 19;
            public static final int BATTR_FIELD_NUMBER = 10;
            public static final int BOXINGALLOWED_FIELD_NUMBER = 14;
            public static final int COMPANIONAD_FIELD_NUMBER = 18;
            public static final int COMPANIONTYPE_FIELD_NUMBER = 20;
            private static final Video DEFAULT_INSTANCE;
            public static final int DELIVERY_FIELD_NUMBER = 16;
            public static final int H_FIELD_NUMBER = 7;
            public static final int LINEARITY_FIELD_NUMBER = 2;
            public static final int MAXBITRATE_FIELD_NUMBER = 13;
            public static final int MAXDURATION_FIELD_NUMBER = 4;
            public static final int MAXEXTENDED_FIELD_NUMBER = 11;
            public static final int MAXSEQ_FIELD_NUMBER = 28;
            public static final int MIMES_FIELD_NUMBER = 1;
            public static final int MINBITRATE_FIELD_NUMBER = 12;
            public static final int MINCPMPERSEC_FIELD_NUMBER = 34;
            public static final int MINDURATION_FIELD_NUMBER = 3;
            private static volatile Parser<Video> PARSER = null;
            public static final int PLACEMENT_FIELD_NUMBER = 26;
            public static final int PLAYBACKEND_FIELD_NUMBER = 27;
            public static final int PLAYBACKMETHOD_FIELD_NUMBER = 15;
            public static final int PODDUR_FIELD_NUMBER = 29;
            public static final int PODID_FIELD_NUMBER = 30;
            public static final int PODSEQ_FIELD_NUMBER = 31;
            public static final int POS_FIELD_NUMBER = 17;
            public static final int PROTOCOLS_FIELD_NUMBER = 21;
            public static final int PROTOCOL_FIELD_NUMBER = 5;
            public static final int RQDDURS_FIELD_NUMBER = 32;
            public static final int SEQUENCE_FIELD_NUMBER = 9;
            public static final int SKIPAFTER_FIELD_NUMBER = 25;
            public static final int SKIPMIN_FIELD_NUMBER = 24;
            public static final int SKIP_FIELD_NUMBER = 23;
            public static final int SLOTINPOD_FIELD_NUMBER = 33;
            public static final int STARTDELAY_FIELD_NUMBER = 8;
            public static final int W_FIELD_NUMBER = 6;
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private int companiontypeMemoizedSerializedSize;
            private int deliveryMemoizedSerializedSize;
            private int h_;
            private int maxbitrate_;
            private int maxduration_;
            private int maxextended_;
            private int maxseq_;
            private int minbitrate_;
            private double mincpmpersec_;
            private int minduration_;
            private int placement_;
            private int playbackmethodMemoizedSerializedSize;
            private int poddur_;
            private int podseq_;
            private int pos_;
            private int protocolsMemoizedSerializedSize;
            private boolean skip_;
            private int skipafter_;
            private int skipmin_;
            private int slotinpod_;
            private int startdelay_;
            private int w_;
            private static final Internal.ListAdapter.Converter<Integer, j> protocols_converter_ = new a();
            private static final Internal.ListAdapter.Converter<Integer, g> battr_converter_ = new b();
            private static final Internal.ListAdapter.Converter<Integer, i> playbackmethod_converter_ = new c();
            private static final Internal.ListAdapter.Converter<Integer, f> delivery_converter_ = new d();
            private static final Internal.ListAdapter.Converter<Integer, a> api_converter_ = new e();
            private static final Internal.ListAdapter.Converter<Integer, e> companiontype_converter_ = new f();
            private int rqddursMemoizedSerializedSize = -1;
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList protocols_ = GeneratedMessageLite.emptyIntList();
            private String podid_ = "";
            private Internal.IntList rqddurs_ = GeneratedMessageLite.emptyIntList();
            private int linearity_ = 1;
            private int sequence_ = 1;
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();
            private boolean boxingallowed_ = true;
            private Internal.IntList playbackmethod_ = GeneratedMessageLite.emptyIntList();
            private int playbackend_ = 1;
            private Internal.IntList delivery_ = GeneratedMessageLite.emptyIntList();
            private Internal.ProtobufList<Banner> companionad_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList companiontype_ = GeneratedMessageLite.emptyIntList();
            private int protocol_ = 1;

            class a implements Internal.ListAdapter.Converter {
                a() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public j convert(Integer num) {
                    j jVarG = j.g(num.intValue());
                    return jVarG == null ? j.VAST_1_0 : jVarG;
                }
            }

            class b implements Internal.ListAdapter.Converter {
                b() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public g convert(Integer num) {
                    g gVarG = g.g(num.intValue());
                    return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
                }
            }

            class c implements Internal.ListAdapter.Converter {
                c() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public i convert(Integer num) {
                    i iVarG = i.g(num.intValue());
                    return iVarG == null ? i.AUTO_PLAY_SOUND_ON : iVarG;
                }
            }

            class d implements Internal.ListAdapter.Converter {
                d() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public f convert(Integer num) {
                    f fVarG = f.g(num.intValue());
                    return fVarG == null ? f.STREAMING : fVarG;
                }
            }

            class e implements Internal.ListAdapter.Converter {
                e() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a convert(Integer num) {
                    a aVarG = a.g(num.intValue());
                    return aVarG == null ? a.VPAID_1 : aVarG;
                }
            }

            class f implements Internal.ListAdapter.Converter {
                f() {
                }

                @Override // com.google.protobuf.Internal.ListAdapter.Converter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public e convert(Integer num) {
                    e eVarG = e.g(num.intValue());
                    return eVarG == null ? e.STATIC : eVarG;
                }
            }

            public static final class g extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
                private g() {
                    super(Video.DEFAULT_INSTANCE);
                }
            }

            public enum h implements Internal.EnumLite {
                COMPLETION_OR_USER(1),
                LEAVING_OR_USER(2),
                LEAVING_CONTINUES_OR_USER(3);


                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53643f = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53645b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public h findValueByNumber(int i10) {
                        return h.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53646a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return h.g(i10) != null;
                    }
                }

                h(int i10) {
                    this.f53645b = i10;
                }

                public static h g(int i10) {
                    if (i10 == 1) {
                        return COMPLETION_OR_USER;
                    }
                    if (i10 == 2) {
                        return LEAVING_OR_USER;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return LEAVING_CONTINUES_OR_USER;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53646a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53645b;
                }
            }

            public enum i implements Internal.EnumLite {
                AUTO_PLAY_SOUND_ON(1),
                AUTO_PLAY_SOUND_OFF(2),
                CLICK_TO_PLAY(3),
                MOUSE_OVER(4),
                ENTER_SOUND_ON(5),
                ENTER_SOUND_OFF(6),
                CONTINUOUS(7);


                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53654j = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53656b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public i findValueByNumber(int i10) {
                        return i.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53657a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return i.g(i10) != null;
                    }
                }

                i(int i10) {
                    this.f53656b = i10;
                }

                public static i g(int i10) {
                    switch (i10) {
                        case 1:
                            return AUTO_PLAY_SOUND_ON;
                        case 2:
                            return AUTO_PLAY_SOUND_OFF;
                        case 3:
                            return CLICK_TO_PLAY;
                        case 4:
                            return MOUSE_OVER;
                        case 5:
                            return ENTER_SOUND_ON;
                        case 6:
                            return ENTER_SOUND_OFF;
                        case 7:
                            return CONTINUOUS;
                        default:
                            return null;
                    }
                }

                public static Internal.EnumVerifier h() {
                    return b.f53657a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53656b;
                }
            }

            public enum j implements Internal.EnumLite {
                LINEAR(1),
                NON_LINEAR(2);


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53660e = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53662b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public j findValueByNumber(int i10) {
                        return j.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53663a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return j.g(i10) != null;
                    }
                }

                j(int i10) {
                    this.f53662b = i10;
                }

                public static j g(int i10) {
                    if (i10 == 1) {
                        return LINEAR;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return NON_LINEAR;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53663a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53662b;
                }
            }

            public enum k implements Internal.EnumLite {
                UNDEFINED_VIDEO_PLACEMENT(0),
                IN_STREAM_PLACEMENT(1),
                IN_BANNER_PLACEMENT(2),
                IN_ARTICLE_PLACEMENT(3),
                IN_FEED_PLACEMENT(4),
                FLOATING_PLACEMENT(5);


                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final Internal.EnumLiteMap f53670i = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f53672b;

                class a implements Internal.EnumLiteMap {
                    a() {
                    }

                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public k findValueByNumber(int i10) {
                        return k.g(i10);
                    }
                }

                private static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    static final Internal.EnumVerifier f53673a = new b();

                    private b() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return k.g(i10) != null;
                    }
                }

                k(int i10) {
                    this.f53672b = i10;
                }

                public static k g(int i10) {
                    if (i10 == 0) {
                        return UNDEFINED_VIDEO_PLACEMENT;
                    }
                    if (i10 == 1) {
                        return IN_STREAM_PLACEMENT;
                    }
                    if (i10 == 2) {
                        return IN_BANNER_PLACEMENT;
                    }
                    if (i10 == 3) {
                        return IN_ARTICLE_PLACEMENT;
                    }
                    if (i10 == 4) {
                        return IN_FEED_PLACEMENT;
                    }
                    if (i10 != 5) {
                        return null;
                    }
                    return FLOATING_PLACEMENT;
                }

                public static Internal.EnumVerifier h() {
                    return b.f53673a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f53672b;
                }
            }

            static {
                Video video = new Video();
                DEFAULT_INSTANCE = video;
                GeneratedMessageLite.registerDefaultInstance(Video.class, video);
            }

            private Video() {
            }

            private void addAllApi(Iterable<? extends a> iterable) {
                ensureApiIsMutable();
                Iterator<? extends a> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            private void addAllBattr(Iterable<? extends g> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends g> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            private void addAllCompanionad(Iterable<? extends Banner> iterable) {
                ensureCompanionadIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.companionad_);
            }

            private void addAllCompaniontype(Iterable<? extends e> iterable) {
                ensureCompaniontypeIsMutable();
                Iterator<? extends e> it = iterable.iterator();
                while (it.hasNext()) {
                    this.companiontype_.addInt(it.next().getNumber());
                }
            }

            private void addAllDelivery(Iterable<? extends f> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends f> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.addInt(it.next().getNumber());
                }
            }

            private void addAllMimes(Iterable<String> iterable) {
                ensureMimesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
            }

            private void addAllPlaybackmethod(Iterable<? extends i> iterable) {
                ensurePlaybackmethodIsMutable();
                Iterator<? extends i> it = iterable.iterator();
                while (it.hasNext()) {
                    this.playbackmethod_.addInt(it.next().getNumber());
                }
            }

            private void addAllProtocols(Iterable<? extends j> iterable) {
                ensureProtocolsIsMutable();
                Iterator<? extends j> it = iterable.iterator();
                while (it.hasNext()) {
                    this.protocols_.addInt(it.next().getNumber());
                }
            }

            private void addAllRqddurs(Iterable<? extends Integer> iterable) {
                ensureRqddursIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.rqddurs_);
            }

            private void addApi(a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.addInt(aVar.getNumber());
            }

            private void addBattr(g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(gVar.getNumber());
            }

            private void addCompanionad(Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(banner);
            }

            private void addCompaniontype(e eVar) {
                eVar.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.addInt(eVar.getNumber());
            }

            private void addDelivery(f fVar) {
                fVar.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.addInt(fVar.getNumber());
            }

            private void addMimes(String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.add(str);
            }

            private void addMimesBytes(ByteString byteString) {
                ensureMimesIsMutable();
                this.mimes_.add(byteString.toStringUtf8());
            }

            private void addPlaybackmethod(i iVar) {
                iVar.getClass();
                ensurePlaybackmethodIsMutable();
                this.playbackmethod_.addInt(iVar.getNumber());
            }

            private void addProtocols(j jVar) {
                jVar.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.addInt(jVar.getNumber());
            }

            private void addRqddurs(int i10) {
                ensureRqddursIsMutable();
                this.rqddurs_.addInt(i10);
            }

            private void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearBoxingallowed() {
                this.bitField0_ &= -1048577;
                this.boxingallowed_ = true;
            }

            private void clearCompanionad() {
                this.companionad_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearCompaniontype() {
                this.companiontype_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearDelivery() {
                this.delivery_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearH() {
                this.bitField0_ &= -65;
                this.h_ = 0;
            }

            private void clearLinearity() {
                this.bitField0_ &= -1025;
                this.linearity_ = 1;
            }

            private void clearMaxbitrate() {
                this.bitField0_ &= -524289;
                this.maxbitrate_ = 0;
            }

            private void clearMaxduration() {
                this.bitField0_ &= -3;
                this.maxduration_ = 0;
            }

            private void clearMaxextended() {
                this.bitField0_ &= -131073;
                this.maxextended_ = 0;
            }

            private void clearMaxseq() {
                this.bitField0_ &= -9;
                this.maxseq_ = 0;
            }

            private void clearMimes() {
                this.mimes_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearMinbitrate() {
                this.bitField0_ &= -262145;
                this.minbitrate_ = 0;
            }

            private void clearMincpmpersec() {
                this.bitField0_ &= -65537;
                this.mincpmpersec_ = 0.0d;
            }

            private void clearMinduration() {
                this.bitField0_ &= -2;
                this.minduration_ = 0;
            }

            private void clearPlacement() {
                this.bitField0_ &= -513;
                this.placement_ = 0;
            }

            private void clearPlaybackend() {
                this.bitField0_ &= -2097153;
                this.playbackend_ = 1;
            }

            private void clearPlaybackmethod() {
                this.playbackmethod_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearPoddur() {
                this.bitField0_ &= -17;
                this.poddur_ = 0;
            }

            private void clearPodid() {
                this.bitField0_ &= -129;
                this.podid_ = getDefaultInstance().getPodid();
            }

            private void clearPodseq() {
                this.bitField0_ &= -257;
                this.podseq_ = 0;
            }

            private void clearPos() {
                this.bitField0_ &= -4194305;
                this.pos_ = 0;
            }

            private void clearProtocol() {
                this.bitField0_ &= -8388609;
                this.protocol_ = 1;
            }

            private void clearProtocols() {
                this.protocols_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearRqddurs() {
                this.rqddurs_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearSequence() {
                this.bitField0_ &= -16385;
                this.sequence_ = 1;
            }

            private void clearSkip() {
                this.bitField0_ &= -2049;
                this.skip_ = false;
            }

            private void clearSkipafter() {
                this.bitField0_ &= -8193;
                this.skipafter_ = 0;
            }

            private void clearSkipmin() {
                this.bitField0_ &= -4097;
                this.skipmin_ = 0;
            }

            private void clearSlotinpod() {
                this.bitField0_ &= -32769;
                this.slotinpod_ = 0;
            }

            private void clearStartdelay() {
                this.bitField0_ &= -5;
                this.startdelay_ = 0;
            }

            private void clearW() {
                this.bitField0_ &= -33;
                this.w_ = 0;
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureCompanionadIsMutable() {
                Internal.ProtobufList<Banner> protobufList = this.companionad_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.companionad_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureCompaniontypeIsMutable() {
                Internal.IntList intList = this.companiontype_;
                if (intList.isModifiable()) {
                    return;
                }
                this.companiontype_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureDeliveryIsMutable() {
                Internal.IntList intList = this.delivery_;
                if (intList.isModifiable()) {
                    return;
                }
                this.delivery_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureMimesIsMutable() {
                Internal.ProtobufList<String> protobufList = this.mimes_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensurePlaybackmethodIsMutable() {
                Internal.IntList intList = this.playbackmethod_;
                if (intList.isModifiable()) {
                    return;
                }
                this.playbackmethod_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureProtocolsIsMutable() {
                Internal.IntList intList = this.protocols_;
                if (intList.isModifiable()) {
                    return;
                }
                this.protocols_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureRqddursIsMutable() {
                Internal.IntList intList = this.rqddurs_;
                if (intList.isModifiable()) {
                    return;
                }
                this.rqddurs_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Video getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static g newBuilder() {
                return (g) DEFAULT_INSTANCE.createBuilder();
            }

            public static Video parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Video) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Video parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Video> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeCompanionad(int i10) {
                ensureCompanionadIsMutable();
                this.companionad_.remove(i10);
            }

            private void setApi(int i10, a aVar) {
                aVar.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, aVar.getNumber());
            }

            private void setBattr(int i10, g gVar) {
                gVar.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, gVar.getNumber());
            }

            private void setBoxingallowed(boolean z10) {
                this.bitField0_ |= 1048576;
                this.boxingallowed_ = z10;
            }

            private void setCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.set(i10, banner);
            }

            private void setCompaniontype(int i10, e eVar) {
                eVar.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.setInt(i10, eVar.getNumber());
            }

            private void setDelivery(int i10, f fVar) {
                fVar.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.setInt(i10, fVar.getNumber());
            }

            private void setH(int i10) {
                this.bitField0_ |= 64;
                this.h_ = i10;
            }

            private void setLinearity(j jVar) {
                this.linearity_ = jVar.getNumber();
                this.bitField0_ |= 1024;
            }

            private void setMaxbitrate(int i10) {
                this.bitField0_ |= 524288;
                this.maxbitrate_ = i10;
            }

            private void setMaxduration(int i10) {
                this.bitField0_ |= 2;
                this.maxduration_ = i10;
            }

            private void setMaxextended(int i10) {
                this.bitField0_ |= 131072;
                this.maxextended_ = i10;
            }

            private void setMaxseq(int i10) {
                this.bitField0_ |= 8;
                this.maxseq_ = i10;
            }

            private void setMimes(int i10, String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.set(i10, str);
            }

            private void setMinbitrate(int i10) {
                this.bitField0_ |= 262144;
                this.minbitrate_ = i10;
            }

            private void setMincpmpersec(double d10) {
                this.bitField0_ |= 65536;
                this.mincpmpersec_ = d10;
            }

            private void setMinduration(int i10) {
                this.bitField0_ |= 1;
                this.minduration_ = i10;
            }

            private void setPlacement(k kVar) {
                this.placement_ = kVar.getNumber();
                this.bitField0_ |= 512;
            }

            private void setPlaybackend(h hVar) {
                this.playbackend_ = hVar.getNumber();
                this.bitField0_ |= 2097152;
            }

            private void setPlaybackmethod(int i10, i iVar) {
                iVar.getClass();
                ensurePlaybackmethodIsMutable();
                this.playbackmethod_.setInt(i10, iVar.getNumber());
            }

            private void setPoddur(int i10) {
                this.bitField0_ |= 16;
                this.poddur_ = i10;
            }

            private void setPodid(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.podid_ = str;
            }

            private void setPodidBytes(ByteString byteString) {
                this.podid_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            private void setPodseq(i iVar) {
                this.podseq_ = iVar.getNumber();
                this.bitField0_ |= 256;
            }

            private void setPos(b bVar) {
                this.pos_ = bVar.getNumber();
                this.bitField0_ |= 4194304;
            }

            private void setProtocol(j jVar) {
                this.protocol_ = jVar.getNumber();
                this.bitField0_ |= 8388608;
            }

            private void setProtocols(int i10, j jVar) {
                jVar.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.setInt(i10, jVar.getNumber());
            }

            private void setRqddurs(int i10, int i11) {
                ensureRqddursIsMutable();
                this.rqddurs_.setInt(i10, i11);
            }

            private void setSequence(int i10) {
                this.bitField0_ |= 16384;
                this.sequence_ = i10;
            }

            private void setSkip(boolean z10) {
                this.bitField0_ |= 2048;
                this.skip_ = z10;
            }

            private void setSkipafter(int i10) {
                this.bitField0_ |= 8192;
                this.skipafter_ = i10;
            }

            private void setSkipmin(int i10) {
                this.bitField0_ |= 4096;
                this.skipmin_ = i10;
            }

            private void setSlotinpod(l lVar) {
                this.slotinpod_ = lVar.getNumber();
                this.bitField0_ |= 32768;
            }

            private void setStartdelay(int i10) {
                this.bitField0_ |= 4;
                this.startdelay_ = i10;
            }

            private void setW(int i10) {
                this.bitField0_ |= 32;
                this.w_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Video();
                    case 2:
                        return new g();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001!\u0000\u0001\u0001\"!\u0000\t\u0001\u0001\u001a\u0002ဌ\n\u0003င\u0000\u0004င\u0001\u0005ဌ\u0017\u0006င\u0005\u0007င\u0006\bင\u0002\tင\u000e\n,\u000bင\u0011\fင\u0012\rင\u0013\u000eဇ\u0014\u000f,\u0010,\u0011ဌ\u0016\u0012Л\u0013,\u0014,\u0015,\u0017ဇ\u000b\u0018င\f\u0019င\r\u001aဌ\t\u001bဌ\u0015\u001cင\u0003\u001dင\u0004\u001eဈ\u0007\u001fဌ\b '!ဌ\u000f\"က\u0010", new Object[]{"bitField0_", "mimes_", "linearity_", j.h(), "minduration_", "maxduration_", "protocol_", j.h(), "w_", "h_", "startdelay_", "sequence_", "battr_", g.h(), "maxextended_", "minbitrate_", "maxbitrate_", "boxingallowed_", "playbackmethod_", i.h(), "delivery_", f.h(), "pos_", b.h(), "companionad_", Banner.class, "api_", a.h(), "companiontype_", e.h(), "protocols_", j.h(), "skip_", "skipmin_", "skipafter_", "placement_", k.h(), "playbackend_", h.h(), "maxseq_", "poddur_", "podid_", "podseq_", i.h(), "rqddurs_", "slotinpod_", l.h(), "mincpmpersec_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Video> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Video.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public a getApi(int i10) {
                a aVarG = a.g(this.api_.getInt(i10));
                return aVarG == null ? a.VPAID_1 : aVarG;
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public List<a> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            public g getBattr(int i10) {
                g gVarG = g.g(this.battr_.getInt(i10));
                return gVarG == null ? g.AUDIO_AUTO_PLAY : gVarG;
            }

            public int getBattrCount() {
                return this.battr_.size();
            }

            public List<g> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            public boolean getBoxingallowed() {
                return this.boxingallowed_;
            }

            public Banner getCompanionad(int i10) {
                return this.companionad_.get(i10);
            }

            public int getCompanionadCount() {
                return this.companionad_.size();
            }

            public List<Banner> getCompanionadList() {
                return this.companionad_;
            }

            public c getCompanionadOrBuilder(int i10) {
                return this.companionad_.get(i10);
            }

            public List<? extends c> getCompanionadOrBuilderList() {
                return this.companionad_;
            }

            public e getCompaniontype(int i10) {
                e eVarG = e.g(this.companiontype_.getInt(i10));
                return eVarG == null ? e.STATIC : eVarG;
            }

            public int getCompaniontypeCount() {
                return this.companiontype_.size();
            }

            public List<e> getCompaniontypeList() {
                return new Internal.ListAdapter(this.companiontype_, companiontype_converter_);
            }

            public f getDelivery(int i10) {
                f fVarG = f.g(this.delivery_.getInt(i10));
                return fVarG == null ? f.STREAMING : fVarG;
            }

            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            public List<f> getDeliveryList() {
                return new Internal.ListAdapter(this.delivery_, delivery_converter_);
            }

            public int getH() {
                return this.h_;
            }

            public j getLinearity() {
                j jVarG = j.g(this.linearity_);
                return jVarG == null ? j.LINEAR : jVarG;
            }

            public int getMaxbitrate() {
                return this.maxbitrate_;
            }

            public int getMaxduration() {
                return this.maxduration_;
            }

            public int getMaxextended() {
                return this.maxextended_;
            }

            public int getMaxseq() {
                return this.maxseq_;
            }

            public String getMimes(int i10) {
                return this.mimes_.get(i10);
            }

            public ByteString getMimesBytes(int i10) {
                return ByteString.copyFromUtf8(this.mimes_.get(i10));
            }

            public int getMimesCount() {
                return this.mimes_.size();
            }

            public List<String> getMimesList() {
                return this.mimes_;
            }

            public int getMinbitrate() {
                return this.minbitrate_;
            }

            public double getMincpmpersec() {
                return this.mincpmpersec_;
            }

            public int getMinduration() {
                return this.minduration_;
            }

            public k getPlacement() {
                k kVarG = k.g(this.placement_);
                return kVarG == null ? k.UNDEFINED_VIDEO_PLACEMENT : kVarG;
            }

            public h getPlaybackend() {
                h hVarG = h.g(this.playbackend_);
                return hVarG == null ? h.COMPLETION_OR_USER : hVarG;
            }

            public i getPlaybackmethod(int i10) {
                i iVarG = i.g(this.playbackmethod_.getInt(i10));
                return iVarG == null ? i.AUTO_PLAY_SOUND_ON : iVarG;
            }

            public int getPlaybackmethodCount() {
                return this.playbackmethod_.size();
            }

            public List<i> getPlaybackmethodList() {
                return new Internal.ListAdapter(this.playbackmethod_, playbackmethod_converter_);
            }

            public int getPoddur() {
                return this.poddur_;
            }

            public String getPodid() {
                return this.podid_;
            }

            public ByteString getPodidBytes() {
                return ByteString.copyFromUtf8(this.podid_);
            }

            public i getPodseq() {
                i iVarG = i.g(this.podseq_);
                return iVarG == null ? i.POD_SEQUENCE_ANY : iVarG;
            }

            public b getPos() {
                b bVarG = b.g(this.pos_);
                return bVarG == null ? b.UNKNOWN : bVarG;
            }

            @Deprecated
            public j getProtocol() {
                j jVarG = j.g(this.protocol_);
                return jVarG == null ? j.VAST_1_0 : jVarG;
            }

            public j getProtocols(int i10) {
                j jVarG = j.g(this.protocols_.getInt(i10));
                return jVarG == null ? j.VAST_1_0 : jVarG;
            }

            public int getProtocolsCount() {
                return this.protocols_.size();
            }

            public List<j> getProtocolsList() {
                return new Internal.ListAdapter(this.protocols_, protocols_converter_);
            }

            public int getRqddurs(int i10) {
                return this.rqddurs_.getInt(i10);
            }

            public int getRqddursCount() {
                return this.rqddurs_.size();
            }

            public List<Integer> getRqddursList() {
                return this.rqddurs_;
            }

            @Deprecated
            public int getSequence() {
                return this.sequence_;
            }

            public boolean getSkip() {
                return this.skip_;
            }

            public int getSkipafter() {
                return this.skipafter_;
            }

            public int getSkipmin() {
                return this.skipmin_;
            }

            public l getSlotinpod() {
                l lVarG = l.g(this.slotinpod_);
                return lVarG == null ? l.SLOT_POSITION_POD_ANY : lVarG;
            }

            public int getStartdelay() {
                return this.startdelay_;
            }

            public int getW() {
                return this.w_;
            }

            public boolean hasBoxingallowed() {
                return (this.bitField0_ & 1048576) != 0;
            }

            public boolean hasH() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasLinearity() {
                return (this.bitField0_ & 1024) != 0;
            }

            public boolean hasMaxbitrate() {
                return (this.bitField0_ & 524288) != 0;
            }

            public boolean hasMaxduration() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasMaxextended() {
                return (this.bitField0_ & 131072) != 0;
            }

            public boolean hasMaxseq() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasMinbitrate() {
                return (this.bitField0_ & 262144) != 0;
            }

            public boolean hasMincpmpersec() {
                return (this.bitField0_ & 65536) != 0;
            }

            public boolean hasMinduration() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPlacement() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasPlaybackend() {
                return (this.bitField0_ & 2097152) != 0;
            }

            public boolean hasPoddur() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasPodid() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasPodseq() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasPos() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Deprecated
            public boolean hasProtocol() {
                return (this.bitField0_ & 8388608) != 0;
            }

            @Deprecated
            public boolean hasSequence() {
                return (this.bitField0_ & 16384) != 0;
            }

            public boolean hasSkip() {
                return (this.bitField0_ & 2048) != 0;
            }

            public boolean hasSkipafter() {
                return (this.bitField0_ & 8192) != 0;
            }

            public boolean hasSkipmin() {
                return (this.bitField0_ & 4096) != 0;
            }

            public boolean hasSlotinpod() {
                return (this.bitField0_ & 32768) != 0;
            }

            public boolean hasStartdelay() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasW() {
                return (this.bitField0_ & 32) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static g newBuilder(Video video) {
                return (g) DEFAULT_INSTANCE.createBuilder(video);
            }

            public static Video parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Video) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Video parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Video parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(i10, banner);
            }

            public static Video parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Video parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Video parseFrom(InputStream inputStream) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Video parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Video parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Video parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a implements Internal.EnumLite {
            VPAID_1(1),
            VPAID_2(2),
            MRAID_1(3),
            ORMMA(4),
            MRAID_2(5),
            MRAID_3(6),
            OMID_1(7),
            SIMID_1_0(8),
            SIMID_1_1(9);


            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53683l = new C0650a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53685b;

            /* JADX INFO: renamed from: com.moloco.sdk.BidRequest$SdkBidRequest$Imp$a$a, reason: collision with other inner class name */
            class C0650a implements Internal.EnumLiteMap {
                C0650a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a findValueByNumber(int i10) {
                    return a.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53686a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return a.g(i10) != null;
                }
            }

            a(int i10) {
                this.f53685b = i10;
            }

            public static a g(int i10) {
                switch (i10) {
                    case 1:
                        return VPAID_1;
                    case 2:
                        return VPAID_2;
                    case 3:
                        return MRAID_1;
                    case 4:
                        return ORMMA;
                    case 5:
                        return MRAID_2;
                    case 6:
                        return MRAID_3;
                    case 7:
                        return OMID_1;
                    case 8:
                        return SIMID_1_0;
                    case 9:
                        return SIMID_1_1;
                    default:
                        return null;
                }
            }

            public static Internal.EnumVerifier h() {
                return b.f53686a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53685b;
            }
        }

        public enum b implements Internal.EnumLite {
            UNKNOWN(0),
            ABOVE_THE_FOLD(1),
            LOCKED(2),
            BELOW_THE_FOLD(3),
            HEADER(4),
            FOOTER(5),
            SIDEBAR(6),
            AD_POSITION_FULLSCREEN(7);


            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53695k = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53697b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public b findValueByNumber(int i10) {
                    return b.g(i10);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.BidRequest$SdkBidRequest$Imp$b$b, reason: collision with other inner class name */
            private static final class C0651b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53698a = new C0651b();

                private C0651b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return b.g(i10) != null;
                }
            }

            b(int i10) {
                this.f53697b = i10;
            }

            public static b g(int i10) {
                switch (i10) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return ABOVE_THE_FOLD;
                    case 2:
                        return LOCKED;
                    case 3:
                        return BELOW_THE_FOLD;
                    case 4:
                        return HEADER;
                    case 5:
                        return FOOTER;
                    case 6:
                        return SIDEBAR;
                    case 7:
                        return AD_POSITION_FULLSCREEN;
                    default:
                        return null;
                }
            }

            public static Internal.EnumVerifier h() {
                return C0651b.f53698a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53697b;
            }
        }

        public interface c extends GeneratedMessageLite.ExtendableMessageOrBuilder {
        }

        public static final class d extends GeneratedMessageLite.ExtendableBuilder implements GeneratedMessageLite.ExtendableMessageOrBuilder {
            private d() {
                super(Imp.DEFAULT_INSTANCE);
            }
        }

        public enum e implements Internal.EnumLite {
            STATIC(1),
            HTML(2),
            COMPANION_IFRAME(3);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53702f = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53704b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public e findValueByNumber(int i10) {
                    return e.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53705a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return e.g(i10) != null;
                }
            }

            e(int i10) {
                this.f53704b = i10;
            }

            public static e g(int i10) {
                if (i10 == 1) {
                    return STATIC;
                }
                if (i10 == 2) {
                    return HTML;
                }
                if (i10 != 3) {
                    return null;
                }
                return COMPANION_IFRAME;
            }

            public static Internal.EnumVerifier h() {
                return b.f53705a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53704b;
            }
        }

        public enum f implements Internal.EnumLite {
            STREAMING(1),
            PROGRESSIVE(2),
            DOWNLOAD(3);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53709f = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53711b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public f findValueByNumber(int i10) {
                    return f.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53712a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return f.g(i10) != null;
                }
            }

            f(int i10) {
                this.f53711b = i10;
            }

            public static f g(int i10) {
                if (i10 == 1) {
                    return STREAMING;
                }
                if (i10 == 2) {
                    return PROGRESSIVE;
                }
                if (i10 != 3) {
                    return null;
                }
                return DOWNLOAD;
            }

            public static Internal.EnumVerifier h() {
                return b.f53712a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53711b;
            }
        }

        public enum g implements Internal.EnumLite {
            AUDIO_AUTO_PLAY(1),
            AUDIO_USER_INITIATED(2),
            EXPANDABLE_AUTOMATIC(3),
            EXPANDABLE_CLICK_INITIATED(4),
            EXPANDABLE_ROLLOVER_INITIATED(5),
            VIDEO_IN_BANNER_AUTO_PLAY(6),
            VIDEO_IN_BANNER_USER_INITIATED(7),
            POP(8),
            PROVOCATIVE_OR_SUGGESTIVE(9),
            ANNOYING(10),
            SURVEYS(11),
            TEXT_ONLY(12),
            USER_INTERACTIVE(13),
            WINDOWS_DIALOG_OR_ALERT_STYLE(14),
            HAS_AUDIO_ON_OFF_BUTTON(15),
            AD_CAN_BE_SKIPPED(16),
            FLASH(17),
            RESPONSIVE(18);


            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53731u = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53733b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public g findValueByNumber(int i10) {
                    return g.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53734a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return g.g(i10) != null;
                }
            }

            g(int i10) {
                this.f53733b = i10;
            }

            public static g g(int i10) {
                switch (i10) {
                    case 1:
                        return AUDIO_AUTO_PLAY;
                    case 2:
                        return AUDIO_USER_INITIATED;
                    case 3:
                        return EXPANDABLE_AUTOMATIC;
                    case 4:
                        return EXPANDABLE_CLICK_INITIATED;
                    case 5:
                        return EXPANDABLE_ROLLOVER_INITIATED;
                    case 6:
                        return VIDEO_IN_BANNER_AUTO_PLAY;
                    case 7:
                        return VIDEO_IN_BANNER_USER_INITIATED;
                    case 8:
                        return POP;
                    case 9:
                        return PROVOCATIVE_OR_SUGGESTIVE;
                    case 10:
                        return ANNOYING;
                    case 11:
                        return SURVEYS;
                    case 12:
                        return TEXT_ONLY;
                    case 13:
                        return USER_INTERACTIVE;
                    case 14:
                        return WINDOWS_DIALOG_OR_ALERT_STYLE;
                    case 15:
                        return HAS_AUDIO_ON_OFF_BUTTON;
                    case 16:
                        return AD_CAN_BE_SKIPPED;
                    case 17:
                        return FLASH;
                    case 18:
                        return RESPONSIVE;
                    default:
                        return null;
                }
            }

            public static Internal.EnumVerifier h() {
                return b.f53734a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53733b;
            }
        }

        public interface h extends GeneratedMessageLite.ExtendableMessageOrBuilder {
        }

        public enum i implements Internal.EnumLite {
            POD_SEQUENCE_ANY(0),
            POD_SEQUENCE_LAST(-1),
            POD_SEQUENCE_FIRST(1);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53738f = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53740b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public i findValueByNumber(int i10) {
                    return i.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53741a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return i.g(i10) != null;
                }
            }

            i(int i10) {
                this.f53740b = i10;
            }

            public static i g(int i10) {
                if (i10 == -1) {
                    return POD_SEQUENCE_LAST;
                }
                if (i10 == 0) {
                    return POD_SEQUENCE_ANY;
                }
                if (i10 != 1) {
                    return null;
                }
                return POD_SEQUENCE_FIRST;
            }

            public static Internal.EnumVerifier h() {
                return b.f53741a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53740b;
            }
        }

        public enum j implements Internal.EnumLite {
            VAST_1_0(1),
            VAST_2_0(2),
            VAST_3_0(3),
            VAST_1_0_WRAPPER(4),
            VAST_2_0_WRAPPER(5),
            VAST_3_0_WRAPPER(6),
            VAST_4_0(7),
            VAST_4_0_WRAPPER(8),
            DAAST_1_0(9),
            DAAST_1_0_WRAPPER(10),
            VAST_4_1(11),
            VAST_4_1_WRAPPER(12),
            VAST_4_2(13),
            VAST_4_2_WRAPPER(14);


            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53756q = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53758b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public j findValueByNumber(int i10) {
                    return j.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53759a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return j.g(i10) != null;
                }
            }

            j(int i10) {
                this.f53758b = i10;
            }

            public static j g(int i10) {
                switch (i10) {
                    case 1:
                        return VAST_1_0;
                    case 2:
                        return VAST_2_0;
                    case 3:
                        return VAST_3_0;
                    case 4:
                        return VAST_1_0_WRAPPER;
                    case 5:
                        return VAST_2_0_WRAPPER;
                    case 6:
                        return VAST_3_0_WRAPPER;
                    case 7:
                        return VAST_4_0;
                    case 8:
                        return VAST_4_0_WRAPPER;
                    case 9:
                        return DAAST_1_0;
                    case 10:
                        return DAAST_1_0_WRAPPER;
                    case 11:
                        return VAST_4_1;
                    case 12:
                        return VAST_4_1_WRAPPER;
                    case 13:
                        return VAST_4_2;
                    case 14:
                        return VAST_4_2_WRAPPER;
                    default:
                        return null;
                }
            }

            public static Internal.EnumVerifier h() {
                return b.f53759a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53758b;
            }
        }

        public enum k implements Internal.EnumLite {
            SERVER_SIDE_AD_INSERTION_TYPE_UNKNOWN(0),
            CLIENT_SIDE_ONLY(1),
            SERVER_SIDE_STITCHED_CLIENT_TRACKER(2),
            SERVER_SIDE_ONLY(3);


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53764g = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53766b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public k findValueByNumber(int i10) {
                    return k.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53767a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return k.g(i10) != null;
                }
            }

            k(int i10) {
                this.f53766b = i10;
            }

            public static k g(int i10) {
                if (i10 == 0) {
                    return SERVER_SIDE_AD_INSERTION_TYPE_UNKNOWN;
                }
                if (i10 == 1) {
                    return CLIENT_SIDE_ONLY;
                }
                if (i10 == 2) {
                    return SERVER_SIDE_STITCHED_CLIENT_TRACKER;
                }
                if (i10 != 3) {
                    return null;
                }
                return SERVER_SIDE_ONLY;
            }

            public static Internal.EnumVerifier h() {
                return b.f53767a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53766b;
            }
        }

        public enum l implements Internal.EnumLite {
            SLOT_POSITION_POD_ANY(0),
            SLOT_POSITION_POD_LAST(-1),
            SLOT_POSITION_POD_FIRST(1),
            SLOT_POSITION_POD_FIRST_OR_LAST(2);


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final Internal.EnumLiteMap f53772g = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f53774b;

            class a implements Internal.EnumLiteMap {
                a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public l findValueByNumber(int i10) {
                    return l.g(i10);
                }
            }

            private static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final Internal.EnumVerifier f53775a = new b();

                private b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return l.g(i10) != null;
                }
            }

            l(int i10) {
                this.f53774b = i10;
            }

            public static l g(int i10) {
                if (i10 == -1) {
                    return SLOT_POSITION_POD_LAST;
                }
                if (i10 == 0) {
                    return SLOT_POSITION_POD_ANY;
                }
                if (i10 == 1) {
                    return SLOT_POSITION_POD_FIRST;
                }
                if (i10 != 2) {
                    return null;
                }
                return SLOT_POSITION_POD_FIRST_OR_LAST;
            }

            public static Internal.EnumVerifier h() {
                return b.f53775a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f53774b;
            }
        }

        static {
            Imp imp = new Imp();
            DEFAULT_INSTANCE = imp;
            GeneratedMessageLite.registerDefaultInstance(Imp.class, imp);
        }

        private Imp() {
        }

        private void addAllIframebuster(Iterable<String> iterable) {
            ensureIframebusterIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.iframebuster_);
        }

        private void addAllMetric(Iterable<? extends Metric> iterable) {
            ensureMetricIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.metric_);
        }

        private void addIframebuster(String str) {
            str.getClass();
            ensureIframebusterIsMutable();
            this.iframebuster_.add(str);
        }

        private void addIframebusterBytes(ByteString byteString) {
            ensureIframebusterIsMutable();
            this.iframebuster_.add(byteString.toStringUtf8());
        }

        private void addMetric(Metric metric) {
            metric.getClass();
            ensureMetricIsMutable();
            this.metric_.add(metric);
        }

        private void clearAudio() {
            this.audio_ = null;
            this.bitField0_ &= -9;
        }

        private void clearBanner() {
            this.banner_ = null;
            this.bitField0_ &= -3;
        }

        private void clearBidfloor() {
            this.bitField0_ &= -257;
            this.bidfloor_ = 0.0d;
        }

        private void clearBidfloorcur() {
            this.bitField0_ &= -513;
            this.bidfloorcur_ = getDefaultInstance().getBidfloorcur();
        }

        private void clearClickbrowser() {
            this.bitField0_ &= -1025;
            this.clickbrowser_ = false;
        }

        private void clearDisplaymanager() {
            this.bitField0_ &= -17;
            this.displaymanager_ = getDefaultInstance().getDisplaymanager();
        }

        private void clearDisplaymanagerver() {
            this.bitField0_ &= -33;
            this.displaymanagerver_ = getDefaultInstance().getDisplaymanagerver();
        }

        private void clearExp() {
            this.bitField0_ &= -65537;
            this.exp_ = 0;
        }

        private void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        private void clearIframebuster() {
            this.iframebuster_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearInstl() {
            this.bitField0_ &= -65;
            this.instl_ = false;
        }

        private void clearMetric() {
            this.metric_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearNative() {
            this.native_ = null;
            this.bitField0_ &= -32769;
        }

        private void clearPmp() {
            this.pmp_ = null;
            this.bitField0_ &= -16385;
        }

        private void clearRwdd() {
            this.bitField0_ &= -4097;
            this.rwdd_ = false;
        }

        private void clearSecure() {
            this.bitField0_ &= -2049;
            this.secure_ = false;
        }

        private void clearSsai() {
            this.bitField0_ &= -8193;
            this.ssai_ = 0;
        }

        private void clearTagid() {
            this.bitField0_ &= -129;
            this.tagid_ = getDefaultInstance().getTagid();
        }

        private void clearVideo() {
            this.video_ = null;
            this.bitField0_ &= -5;
        }

        private void ensureIframebusterIsMutable() {
            Internal.ProtobufList<String> protobufList = this.iframebuster_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.iframebuster_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureMetricIsMutable() {
            Internal.ProtobufList<Metric> protobufList = this.metric_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.metric_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Imp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void mergeAudio(Audio audio) {
            audio.getClass();
            Audio audio2 = this.audio_;
            if (audio2 == null || audio2 == Audio.getDefaultInstance()) {
                this.audio_ = audio;
            } else {
                this.audio_ = (Audio) ((Audio.f) Audio.newBuilder(this.audio_).mergeFrom(audio)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void mergeBanner(Banner banner) {
            banner.getClass();
            Banner banner2 = this.banner_;
            if (banner2 == null || banner2 == Banner.getDefaultInstance()) {
                this.banner_ = banner;
            } else {
                this.banner_ = (Banner) ((Banner.f) Banner.newBuilder(this.banner_).mergeFrom(banner)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void mergeNative(Native r32) {
            r32.getClass();
            Native r02 = this.native_;
            if (r02 == null || r02 == Native.getDefaultInstance()) {
                this.native_ = r32;
            } else {
                this.native_ = (Native) ((Native.c) Native.newBuilder(this.native_).mergeFrom(r32)).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void mergePmp(Pmp pmp) {
            pmp.getClass();
            Pmp pmp2 = this.pmp_;
            if (pmp2 == null || pmp2 == Pmp.getDefaultInstance()) {
                this.pmp_ = pmp;
            } else {
                this.pmp_ = (Pmp) ((Pmp.a) Pmp.newBuilder(this.pmp_).mergeFrom(pmp)).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void mergeVideo(Video video) {
            video.getClass();
            Video video2 = this.video_;
            if (video2 == null || video2 == Video.getDefaultInstance()) {
                this.video_ = video;
            } else {
                this.video_ = (Video) ((Video.g) Video.newBuilder(this.video_).mergeFrom(video)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static d newBuilder() {
            return (d) DEFAULT_INSTANCE.createBuilder();
        }

        public static Imp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Imp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Imp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Imp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeMetric(int i10) {
            ensureMetricIsMutable();
            this.metric_.remove(i10);
        }

        private void setAudio(Audio audio) {
            audio.getClass();
            this.audio_ = audio;
            this.bitField0_ |= 8;
        }

        private void setBanner(Banner banner) {
            banner.getClass();
            this.banner_ = banner;
            this.bitField0_ |= 2;
        }

        private void setBidfloor(double d10) {
            this.bitField0_ |= 256;
            this.bidfloor_ = d10;
        }

        private void setBidfloorcur(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.bidfloorcur_ = str;
        }

        private void setBidfloorcurBytes(ByteString byteString) {
            this.bidfloorcur_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        private void setClickbrowser(boolean z10) {
            this.bitField0_ |= 1024;
            this.clickbrowser_ = z10;
        }

        private void setDisplaymanager(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.displaymanager_ = str;
        }

        private void setDisplaymanagerBytes(ByteString byteString) {
            this.displaymanager_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        private void setDisplaymanagerver(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.displaymanagerver_ = str;
        }

        private void setDisplaymanagerverBytes(ByteString byteString) {
            this.displaymanagerver_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        private void setExp(int i10) {
            this.bitField0_ |= 65536;
            this.exp_ = i10;
        }

        private void setId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }

        private void setIdBytes(ByteString byteString) {
            this.id_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setIframebuster(int i10, String str) {
            str.getClass();
            ensureIframebusterIsMutable();
            this.iframebuster_.set(i10, str);
        }

        private void setInstl(boolean z10) {
            this.bitField0_ |= 64;
            this.instl_ = z10;
        }

        private void setMetric(int i10, Metric metric) {
            metric.getClass();
            ensureMetricIsMutable();
            this.metric_.set(i10, metric);
        }

        private void setNative(Native r22) {
            r22.getClass();
            this.native_ = r22;
            this.bitField0_ |= 32768;
        }

        private void setPmp(Pmp pmp) {
            pmp.getClass();
            this.pmp_ = pmp;
            this.bitField0_ |= 16384;
        }

        private void setRwdd(boolean z10) {
            this.bitField0_ |= 4096;
            this.rwdd_ = z10;
        }

        private void setSecure(boolean z10) {
            this.bitField0_ |= 2048;
            this.secure_ = z10;
        }

        private void setSsai(k kVar) {
            this.ssai_ = kVar.getNumber();
            this.bitField0_ |= 8192;
        }

        private void setTagid(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.tagid_ = str;
        }

        private void setTagidBytes(ByteString byteString) {
            this.tagid_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        private void setVideo(Video video) {
            video.getClass();
            this.video_ = video;
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Imp();
                case 2:
                    return new d();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0002\u0007\u0001ᔈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဇ\u0006\u0007ဈ\u0007\bက\b\tဈ\t\n\u001a\u000bᐉ\u000e\fဇ\u000b\rᐉ\u000f\u000eင\u0010\u000fᐉ\u0003\u0010ဇ\n\u0011Л\u0012ဇ\f\u0013ဌ\r", new Object[]{"bitField0_", "id_", "banner_", "video_", "displaymanager_", "displaymanagerver_", "instl_", "tagid_", "bidfloor_", "bidfloorcur_", "iframebuster_", "pmp_", "secure_", "native_", "exp_", "audio_", "clickbrowser_", "metric_", Metric.class, "rwdd_", "ssai_", k.h()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Imp> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Imp.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Audio getAudio() {
            Audio audio = this.audio_;
            return audio == null ? Audio.getDefaultInstance() : audio;
        }

        public Banner getBanner() {
            Banner banner = this.banner_;
            return banner == null ? Banner.getDefaultInstance() : banner;
        }

        public double getBidfloor() {
            return this.bidfloor_;
        }

        public String getBidfloorcur() {
            return this.bidfloorcur_;
        }

        public ByteString getBidfloorcurBytes() {
            return ByteString.copyFromUtf8(this.bidfloorcur_);
        }

        public boolean getClickbrowser() {
            return this.clickbrowser_;
        }

        public String getDisplaymanager() {
            return this.displaymanager_;
        }

        public ByteString getDisplaymanagerBytes() {
            return ByteString.copyFromUtf8(this.displaymanager_);
        }

        public String getDisplaymanagerver() {
            return this.displaymanagerver_;
        }

        public ByteString getDisplaymanagerverBytes() {
            return ByteString.copyFromUtf8(this.displaymanagerver_);
        }

        public int getExp() {
            return this.exp_;
        }

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public String getIframebuster(int i10) {
            return this.iframebuster_.get(i10);
        }

        public ByteString getIframebusterBytes(int i10) {
            return ByteString.copyFromUtf8(this.iframebuster_.get(i10));
        }

        public int getIframebusterCount() {
            return this.iframebuster_.size();
        }

        public List<String> getIframebusterList() {
            return this.iframebuster_;
        }

        public boolean getInstl() {
            return this.instl_;
        }

        public Metric getMetric(int i10) {
            return this.metric_.get(i10);
        }

        public int getMetricCount() {
            return this.metric_.size();
        }

        public List<Metric> getMetricList() {
            return this.metric_;
        }

        public h getMetricOrBuilder(int i10) {
            return this.metric_.get(i10);
        }

        public List<? extends h> getMetricOrBuilderList() {
            return this.metric_;
        }

        public Native getNative() {
            Native r02 = this.native_;
            return r02 == null ? Native.getDefaultInstance() : r02;
        }

        public Pmp getPmp() {
            Pmp pmp = this.pmp_;
            return pmp == null ? Pmp.getDefaultInstance() : pmp;
        }

        public boolean getRwdd() {
            return this.rwdd_;
        }

        public boolean getSecure() {
            return this.secure_;
        }

        public k getSsai() {
            k kVarG = k.g(this.ssai_);
            return kVarG == null ? k.SERVER_SIDE_AD_INSERTION_TYPE_UNKNOWN : kVarG;
        }

        public String getTagid() {
            return this.tagid_;
        }

        public ByteString getTagidBytes() {
            return ByteString.copyFromUtf8(this.tagid_);
        }

        public Video getVideo() {
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        public boolean hasAudio() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasBanner() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasBidfloor() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasBidfloorcur() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasClickbrowser() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasDisplaymanager() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDisplaymanagerver() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasExp() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasInstl() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasNative() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasPmp() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasRwdd() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasSecure() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasSsai() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasTagid() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasVideo() {
            return (this.bitField0_ & 4) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static d newBuilder(Imp imp) {
            return (d) DEFAULT_INSTANCE.createBuilder(imp);
        }

        public static Imp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Imp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Imp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Imp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addMetric(int i10, Metric metric) {
            metric.getClass();
            ensureMetricIsMutable();
            this.metric_.add(i10, metric);
        }

        public static Imp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Imp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Imp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Imp parseFrom(InputStream inputStream) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Imp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Imp parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Imp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Regs extends GeneratedMessageLite<Regs, a> implements MessageLiteOrBuilder {
        public static final int COPPA_FIELD_NUMBER = 1;
        private static final Regs DEFAULT_INSTANCE;
        public static final int EXT_FIELD_NUMBER = 2;
        private static volatile Parser<Regs> PARSER;
        private int bitField0_;
        private boolean coppa_;
        private Ext ext_;
        private byte memoizedIsInitialized = 2;

        public static final class Ext extends GeneratedMessageLite<Ext, a> implements MessageLiteOrBuilder {
            public static final int CCPA_FIELD_NUMBER = 1;
            private static final Ext DEFAULT_INSTANCE;
            public static final int GDPR_FIELD_NUMBER = 2;
            private static volatile Parser<Ext> PARSER = null;
            public static final int US_PRIVACY_FIELD_NUMBER = 3;
            private int bitField0_;
            private int ccpa_;
            private int gdpr_;
            private byte memoizedIsInitialized = 2;
            private String usPrivacy_ = "";

            public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
                private a() {
                    super(Ext.DEFAULT_INSTANCE);
                }
            }

            static {
                Ext ext = new Ext();
                DEFAULT_INSTANCE = ext;
                GeneratedMessageLite.registerDefaultInstance(Ext.class, ext);
            }

            private Ext() {
            }

            private void clearCcpa() {
                this.bitField0_ &= -2;
                this.ccpa_ = 0;
            }

            private void clearGdpr() {
                this.bitField0_ &= -3;
                this.gdpr_ = 0;
            }

            private void clearUsPrivacy() {
                this.bitField0_ &= -5;
                this.usPrivacy_ = getDefaultInstance().getUsPrivacy();
            }

            public static Ext getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Ext parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Ext> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setCcpa(int i10) {
                this.bitField0_ |= 1;
                this.ccpa_ = i10;
            }

            private void setGdpr(int i10) {
                this.bitField0_ |= 2;
                this.gdpr_ = i10;
            }

            private void setUsPrivacy(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.usPrivacy_ = str;
            }

            private void setUsPrivacyBytes(ByteString byteString) {
                this.usPrivacy_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Ext();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔈ\u0002", new Object[]{"bitField0_", "ccpa_", "gdpr_", "usPrivacy_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Ext> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Ext.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public int getCcpa() {
                return this.ccpa_;
            }

            public int getGdpr() {
                return this.gdpr_;
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

            public boolean hasGdpr() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasUsPrivacy() {
                return (this.bitField0_ & 4) != 0;
            }

            public static a newBuilder(Ext ext) {
                return DEFAULT_INSTANCE.createBuilder(ext);
            }

            public static Ext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Ext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Ext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Ext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Ext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Ext parseFrom(InputStream inputStream) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ext parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Ext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(Regs.DEFAULT_INSTANCE);
            }
        }

        static {
            Regs regs = new Regs();
            DEFAULT_INSTANCE = regs;
            GeneratedMessageLite.registerDefaultInstance(Regs.class, regs);
        }

        private Regs() {
        }

        private void clearCoppa() {
            this.bitField0_ &= -2;
            this.coppa_ = false;
        }

        private void clearExt() {
            this.ext_ = null;
            this.bitField0_ &= -3;
        }

        public static Regs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeExt(Ext ext) {
            ext.getClass();
            Ext ext2 = this.ext_;
            if (ext2 == null || ext2 == Ext.getDefaultInstance()) {
                this.ext_ = ext;
            } else {
                this.ext_ = (Ext) ((Ext.a) Ext.newBuilder(this.ext_).mergeFrom(ext)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Regs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Regs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Regs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCoppa(boolean z10) {
            this.bitField0_ |= 1;
            this.coppa_ = z10;
        }

        private void setExt(Ext ext) {
            ext.getClass();
            this.ext_ = ext;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Regs();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "coppa_", R5.f41662b});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Regs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Regs.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getCoppa() {
            return this.coppa_;
        }

        public Ext getExt() {
            Ext ext = this.ext_;
            return ext == null ? Ext.getDefaultInstance() : ext;
        }

        public boolean hasCoppa() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasExt() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(Regs regs) {
            return DEFAULT_INSTANCE.createBuilder(regs);
        }

        public static Regs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Regs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Regs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Regs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Regs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Regs parseFrom(InputStream inputStream) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Regs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Regs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Regs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class User extends GeneratedMessageLite<User, a> implements MessageLiteOrBuilder {
        private static final User DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<User> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String id_ = "";

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(User.DEFAULT_INSTANCE);
            }
        }

        static {
            User user = new User();
            DEFAULT_INSTANCE = user;
            GeneratedMessageLite.registerDefaultInstance(User.class, user);
        }

        private User() {
        }

        private void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<User> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }

        private void setIdBytes(ByteString byteString) {
            this.id_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
                case 1:
                    return new User();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"bitField0_", "id_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<User> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (User.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(User user) {
            return DEFAULT_INSTANCE.createBuilder(user);
        }

        public static User parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static User parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static User parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static User parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private a() {
            super(BidRequest$SdkBidRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        BidRequest$SdkBidRequest bidRequest$SdkBidRequest = new BidRequest$SdkBidRequest();
        DEFAULT_INSTANCE = bidRequest$SdkBidRequest;
        GeneratedMessageLite.registerDefaultInstance(BidRequest$SdkBidRequest.class, bidRequest$SdkBidRequest);
    }

    private BidRequest$SdkBidRequest() {
    }

    private void clearApp() {
        this.app_ = null;
        this.bitField0_ &= -2;
    }

    private void clearDevice() {
        this.device_ = null;
        this.bitField0_ &= -3;
    }

    private void clearImp() {
        this.imp_ = null;
        this.bitField0_ &= -5;
    }

    private void clearRegs() {
        this.regs_ = null;
        this.bitField0_ &= -9;
    }

    private void clearTmax() {
        this.bitField0_ &= -17;
        this.tmax_ = 0;
    }

    private void clearUser() {
        this.user_ = null;
        this.bitField0_ &= -33;
    }

    public static BidRequest$SdkBidRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeApp(App app) {
        app.getClass();
        App app2 = this.app_;
        if (app2 == null || app2 == App.getDefaultInstance()) {
            this.app_ = app;
        } else {
            this.app_ = (App) ((App.a) App.newBuilder(this.app_).mergeFrom(app)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeDevice(Device device) {
        device.getClass();
        Device device2 = this.device_;
        if (device2 == null || device2 == Device.getDefaultInstance()) {
            this.device_ = device;
        } else {
            this.device_ = (Device) ((Device.a) Device.newBuilder(this.device_).mergeFrom(device)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeImp(Imp imp) {
        imp.getClass();
        Imp imp2 = this.imp_;
        if (imp2 == null || imp2 == Imp.getDefaultInstance()) {
            this.imp_ = imp;
        } else {
            this.imp_ = (Imp) ((Imp.d) Imp.newBuilder(this.imp_).mergeFrom(imp)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeRegs(Regs regs) {
        regs.getClass();
        Regs regs2 = this.regs_;
        if (regs2 == null || regs2 == Regs.getDefaultInstance()) {
            this.regs_ = regs;
        } else {
            this.regs_ = (Regs) ((Regs.a) Regs.newBuilder(this.regs_).mergeFrom(regs)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeUser(User user) {
        user.getClass();
        User user2 = this.user_;
        if (user2 == null || user2 == User.getDefaultInstance()) {
            this.user_ = user;
        } else {
            this.user_ = (User) ((User.a) User.newBuilder(this.user_).mergeFrom(user)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidRequest$SdkBidRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidRequest$SdkBidRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setApp(App app) {
        app.getClass();
        this.app_ = app;
        this.bitField0_ |= 1;
    }

    private void setDevice(Device device) {
        device.getClass();
        this.device_ = device;
        this.bitField0_ |= 2;
    }

    private void setImp(Imp imp) {
        imp.getClass();
        this.imp_ = imp;
        this.bitField0_ |= 4;
    }

    private void setRegs(Regs regs) {
        regs.getClass();
        this.regs_ = regs;
        this.bitField0_ |= 8;
    }

    private void setTmax(int i10) {
        this.bitField0_ |= 16;
        this.tmax_ = i10;
    }

    private void setUser(User user) {
        user.getClass();
        this.user_ = user;
        this.bitField0_ |= 32;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (com.moloco.sdk.a.f53923a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidRequest$SdkBidRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔉ\u0001\u0003ᔉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006ᐉ\u0005", new Object[]{"bitField0_", "app_", "device_", "imp_", "regs_", "tmax_", "user_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidRequest$SdkBidRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidRequest$SdkBidRequest.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    public Imp getImp() {
        Imp imp = this.imp_;
        return imp == null ? Imp.getDefaultInstance() : imp;
    }

    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    public int getTmax() {
        return this.tmax_;
    }

    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    public boolean hasApp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDevice() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasImp() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRegs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTmax() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUser() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(BidRequest$SdkBidRequest bidRequest$SdkBidRequest) {
        return DEFAULT_INSTANCE.createBuilder(bidRequest$SdkBidRequest);
    }

    public static BidRequest$SdkBidRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidRequest$SdkBidRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(InputStream inputStream) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidRequest$SdkBidRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidRequest$SdkBidRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
