package io.bidmachine.protobuf.predictor;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u;
import com.explorestack.protobuf.w;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class Predictor {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n-bidmachine/protobuf/predictor/predictor.proto\u0012\tpredictor\"7\n\u000fWinRateResponse\u0012\u0017\n\u000fwin_probability\u0018\u0001 \u0001(\u0002\u0012\u000b\n\u0003fee\u0018\u0002 \u0001(\u0002\"Ð\u0005\n\u001bGetBidMachineWinRateRequest\u0012\u0012\n\nrequest_id\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bday_of_week\u0018\u0002 \u0001(\u0005\u0012\u0010\n\butc_hour\u0018\u0003 \u0001(\u0005\u0012\u0011\n\tseller_id\u0018\u0004 \u0001(\t\u0012\"\n\u0007ad_type\u0018\u0005 \u0001(\u000e2\u0011.predictor.AdType\u0012\u001b\n\u0013is_rewarded_request\u0018\u0006 \u0001(\b\u0012\u000b\n\u0003app\u0018\u0007 \u0001(\t\u0012&\n\u0002os\u0018\b \u0001(\u000e2\u001a.predictor.OperatingSystem\u0012\u0012\n\nos_version\u0018\t \u0001(\t\u0012\u0010\n\blanguage\u0018\n \u0001(\t\u0012\u000f\n\u0007country\u0018\u000b \u0001(\t\u0012\u000e\n\u0006region\u0018\f \u0001(\t\u0012\f\n\u0004city\u0018\r \u0001(\t\u0012\u000b\n\u0003zip\u0018\u000e \u0001(\t\u0012\r\n\u0005width\u0018\u000f \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0010 \u0001(\u0005\u00122\n\u000fconnection_type\u0018\u0011 \u0001(\u000e2\u0019.predictor.ConnectionType\u0012*\n\u000bdevice_type\u0018\u0012 \u0001(\u000e2\u0015.predictor.DeviceType\u0012\u000e\n\u0006is_ifa\u0018\u0013 \u0001(\b\u0012\u001c\n\u0014bm_cached_lurl_price\u0018\u0014 \u0001(\u0001\u0012!\n\u0019cached_lurl_millis_passed\u0018\u0015 \u0001(\u0003\u0012\u0011\n\tbid_floor\u0018\u0016 \u0001(\u0001\u0012\u0011\n\tagency_id\u0018\u0017 \u0001(\t\u0012\u0016\n\u000eoriginal_floor\u0018\u0018 \u0001(\u0001\u0012\u0011\n\tbid_price\u0018b \u0001(\u0002\u0012\u001a\n\u0012winrate_model_name\u0018c \u0001(\t\u0012\u0015\n\rstrategy_name\u0018d \u0001(\t\u0012\u0012\n\nmin_margin\u0018e \u0001(\u0001\u0012\u0012\n\nmax_margin\u0018f \u0001(\u0001\u0012\u000f\n\u0007epsilon\u0018g \u0001(\u0001*`\n\u0006AdType\u0012\u0017\n\u0013AD_TYPE_UNSPECIFIED\u0010\u0000\u0012\n\n\u0006BANNER\u0010\u0001\u0012\u0010\n\fINTERSTITIAL\u0010\u0002\u0012\t\n\u0005VIDEO\u0010\u0003\u0012\b\n\u0004MREC\u0010\u0005\u0012\n\n\u0006NATIVE\u0010\u0006*\u0087\u0001\n\u000eConnectionType\u0012\u001a\n\u0016ConnectionType_UNKNOWN\u0010\u0000\u0012\t\n\u0005WIRED\u0010\u0001\u0012\b\n\u0004WIFI\u0010\u0002\u0012\u0010\n\fCELL_UNKNOWN\u0010\u0003\u0012\u000b\n\u0007CELL_2G\u0010\u0004\u0012\u000b\n\u0007CELL_3G\u0010\u0005\u0012\u000b\n\u0007CELL_4G\u0010\u0006\u0012\u000b\n\u0007CELL_5G\u0010\u0007*N\n\nDeviceType\u0012\u0016\n\u0012DeviceType_UNKNOWN\u0010\u0000\u0012\u0011\n\rMOBILE_TABLET\u0010\u0001\u0012\t\n\u0005PHONE\u0010\u0004\u0012\n\n\u0006TABLET\u0010\u0005*=\n\u000fOperatingSystem\u0012\u0014\n\u0010OTHER_NOT_LISTED\u0010\u0000\u0012\u000b\n\u0007ANDROID\u0010\u0002\u0012\u0007\n\u0003IOS\u0010\r2n\n\u0010PredictorService\u0012Z\n\u0014GetBidMachineWinRate\u0012&.predictor.GetBidMachineWinRateRequest\u001a\u001a.predictor.WinRateResponseB\"\n io.bidmachine.protobuf.predictorb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_predictor_GetBidMachineWinRateRequest_descriptor;
    private static final h0.f internal_static_predictor_GetBidMachineWinRateRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_predictor_WinRateResponse_descriptor;
    private static final h0.f internal_static_predictor_WinRateResponse_fieldAccessorTable;

    public enum AdType implements j0.c {
        AD_TYPE_UNSPECIFIED(0),
        BANNER(1),
        INTERSTITIAL(2),
        VIDEO(3),
        MREC(5),
        NATIVE(6),
        UNRECOGNIZED(-1);

        public static final int AD_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int BANNER_VALUE = 1;
        public static final int INTERSTITIAL_VALUE = 2;
        public static final int MREC_VALUE = 5;
        public static final int NATIVE_VALUE = 6;
        public static final int VIDEO_VALUE = 3;
        private final int value;
        private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.predictor.Predictor.AdType.1
            public AdType findValueByNumber(int i10) {
                return AdType.forNumber(i10);
            }
        };
        private static final AdType[] VALUES = values();

        AdType(int i10) {
            this.value = i10;
        }

        public static AdType forNumber(int i10) {
            if (i10 == 0) {
                return AD_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return BANNER;
            }
            if (i10 == 2) {
                return INTERSTITIAL;
            }
            if (i10 == 3) {
                return VIDEO;
            }
            if (i10 == 5) {
                return MREC;
            }
            if (i10 != 6) {
                return null;
            }
            return NATIVE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Predictor.getDescriptor().getEnumTypes().get(0);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static AdType valueOf(int i10) {
            return forNumber(i10);
        }

        public static AdType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum ConnectionType implements j0.c {
        ConnectionType_UNKNOWN(0),
        WIRED(1),
        WIFI(2),
        CELL_UNKNOWN(3),
        CELL_2G(4),
        CELL_3G(5),
        CELL_4G(6),
        CELL_5G(7),
        UNRECOGNIZED(-1);

        public static final int CELL_2G_VALUE = 4;
        public static final int CELL_3G_VALUE = 5;
        public static final int CELL_4G_VALUE = 6;
        public static final int CELL_5G_VALUE = 7;
        public static final int CELL_UNKNOWN_VALUE = 3;
        public static final int ConnectionType_UNKNOWN_VALUE = 0;
        public static final int WIFI_VALUE = 2;
        public static final int WIRED_VALUE = 1;
        private final int value;
        private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.predictor.Predictor.ConnectionType.1
            public ConnectionType findValueByNumber(int i10) {
                return ConnectionType.forNumber(i10);
            }
        };
        private static final ConnectionType[] VALUES = values();

        ConnectionType(int i10) {
            this.value = i10;
        }

        public static ConnectionType forNumber(int i10) {
            switch (i10) {
                case 0:
                    return ConnectionType_UNKNOWN;
                case 1:
                    return WIRED;
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

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Predictor.getDescriptor().getEnumTypes().get(1);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static ConnectionType valueOf(int i10) {
            return forNumber(i10);
        }

        public static ConnectionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum DeviceType implements j0.c {
        DeviceType_UNKNOWN(0),
        MOBILE_TABLET(1),
        PHONE(4),
        TABLET(5),
        UNRECOGNIZED(-1);

        public static final int DeviceType_UNKNOWN_VALUE = 0;
        public static final int MOBILE_TABLET_VALUE = 1;
        public static final int PHONE_VALUE = 4;
        public static final int TABLET_VALUE = 5;
        private final int value;
        private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.predictor.Predictor.DeviceType.1
            public DeviceType findValueByNumber(int i10) {
                return DeviceType.forNumber(i10);
            }
        };
        private static final DeviceType[] VALUES = values();

        DeviceType(int i10) {
            this.value = i10;
        }

        public static DeviceType forNumber(int i10) {
            if (i10 == 0) {
                return DeviceType_UNKNOWN;
            }
            if (i10 == 1) {
                return MOBILE_TABLET;
            }
            if (i10 == 4) {
                return PHONE;
            }
            if (i10 != 5) {
                return null;
            }
            return TABLET;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Predictor.getDescriptor().getEnumTypes().get(2);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static DeviceType valueOf(int i10) {
            return forNumber(i10);
        }

        public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class GetBidMachineWinRateRequest extends h0 implements GetBidMachineWinRateRequestOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 5;
        public static final int AGENCY_ID_FIELD_NUMBER = 23;
        public static final int APP_FIELD_NUMBER = 7;
        public static final int BID_FLOOR_FIELD_NUMBER = 22;
        public static final int BID_PRICE_FIELD_NUMBER = 98;
        public static final int BM_CACHED_LURL_PRICE_FIELD_NUMBER = 20;
        public static final int CACHED_LURL_MILLIS_PASSED_FIELD_NUMBER = 21;
        public static final int CITY_FIELD_NUMBER = 13;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 17;
        public static final int COUNTRY_FIELD_NUMBER = 11;
        public static final int DAY_OF_WEEK_FIELD_NUMBER = 2;
        public static final int DEVICE_TYPE_FIELD_NUMBER = 18;
        public static final int EPSILON_FIELD_NUMBER = 103;
        public static final int HEIGHT_FIELD_NUMBER = 16;
        public static final int IS_IFA_FIELD_NUMBER = 19;
        public static final int IS_REWARDED_REQUEST_FIELD_NUMBER = 6;
        public static final int LANGUAGE_FIELD_NUMBER = 10;
        public static final int MAX_MARGIN_FIELD_NUMBER = 102;
        public static final int MIN_MARGIN_FIELD_NUMBER = 101;
        public static final int ORIGINAL_FLOOR_FIELD_NUMBER = 24;
        public static final int OS_FIELD_NUMBER = 8;
        public static final int OS_VERSION_FIELD_NUMBER = 9;
        public static final int REGION_FIELD_NUMBER = 12;
        public static final int REQUEST_ID_FIELD_NUMBER = 1;
        public static final int SELLER_ID_FIELD_NUMBER = 4;
        public static final int STRATEGY_NAME_FIELD_NUMBER = 100;
        public static final int UTC_HOUR_FIELD_NUMBER = 3;
        public static final int WIDTH_FIELD_NUMBER = 15;
        public static final int WINRATE_MODEL_NAME_FIELD_NUMBER = 99;
        public static final int ZIP_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0;
        private int adType_;
        private volatile Object agencyId_;
        private volatile Object app_;
        private double bidFloor_;
        private float bidPrice_;
        private double bmCachedLurlPrice_;
        private long cachedLurlMillisPassed_;
        private volatile Object city_;
        private int connectionType_;
        private volatile Object country_;
        private int dayOfWeek_;
        private int deviceType_;
        private double epsilon_;
        private int height_;
        private boolean isIfa_;
        private boolean isRewardedRequest_;
        private volatile Object language_;
        private double maxMargin_;
        private byte memoizedIsInitialized;
        private double minMargin_;
        private double originalFloor_;
        private volatile Object osVersion_;
        private int os_;
        private volatile Object region_;
        private volatile Object requestId_;
        private volatile Object sellerId_;
        private volatile Object strategyName_;
        private int utcHour_;
        private int width_;
        private volatile Object winrateModelName_;
        private volatile Object zip_;
        private static final GetBidMachineWinRateRequest DEFAULT_INSTANCE = new GetBidMachineWinRateRequest();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequest.1
            @Override // com.explorestack.protobuf.p1
            public GetBidMachineWinRateRequest parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new GetBidMachineWinRateRequest(lVar, wVar);
            }
        };

        public static GetBidMachineWinRateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Predictor.internal_static_predictor_GetBidMachineWinRateRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetBidMachineWinRateRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetBidMachineWinRateRequest) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetBidMachineWinRateRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetBidMachineWinRateRequest) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetBidMachineWinRateRequest)) {
                return super.equals(obj);
            }
            GetBidMachineWinRateRequest getBidMachineWinRateRequest = (GetBidMachineWinRateRequest) obj;
            return getRequestId().equals(getBidMachineWinRateRequest.getRequestId()) && getDayOfWeek() == getBidMachineWinRateRequest.getDayOfWeek() && getUtcHour() == getBidMachineWinRateRequest.getUtcHour() && getSellerId().equals(getBidMachineWinRateRequest.getSellerId()) && this.adType_ == getBidMachineWinRateRequest.adType_ && getIsRewardedRequest() == getBidMachineWinRateRequest.getIsRewardedRequest() && getApp().equals(getBidMachineWinRateRequest.getApp()) && this.os_ == getBidMachineWinRateRequest.os_ && getOsVersion().equals(getBidMachineWinRateRequest.getOsVersion()) && getLanguage().equals(getBidMachineWinRateRequest.getLanguage()) && getCountry().equals(getBidMachineWinRateRequest.getCountry()) && getRegion().equals(getBidMachineWinRateRequest.getRegion()) && getCity().equals(getBidMachineWinRateRequest.getCity()) && getZip().equals(getBidMachineWinRateRequest.getZip()) && getWidth() == getBidMachineWinRateRequest.getWidth() && getHeight() == getBidMachineWinRateRequest.getHeight() && this.connectionType_ == getBidMachineWinRateRequest.connectionType_ && this.deviceType_ == getBidMachineWinRateRequest.deviceType_ && getIsIfa() == getBidMachineWinRateRequest.getIsIfa() && Double.doubleToLongBits(getBmCachedLurlPrice()) == Double.doubleToLongBits(getBidMachineWinRateRequest.getBmCachedLurlPrice()) && getCachedLurlMillisPassed() == getBidMachineWinRateRequest.getCachedLurlMillisPassed() && Double.doubleToLongBits(getBidFloor()) == Double.doubleToLongBits(getBidMachineWinRateRequest.getBidFloor()) && getAgencyId().equals(getBidMachineWinRateRequest.getAgencyId()) && Double.doubleToLongBits(getOriginalFloor()) == Double.doubleToLongBits(getBidMachineWinRateRequest.getOriginalFloor()) && Float.floatToIntBits(getBidPrice()) == Float.floatToIntBits(getBidMachineWinRateRequest.getBidPrice()) && getWinrateModelName().equals(getBidMachineWinRateRequest.getWinrateModelName()) && getStrategyName().equals(getBidMachineWinRateRequest.getStrategyName()) && Double.doubleToLongBits(getMinMargin()) == Double.doubleToLongBits(getBidMachineWinRateRequest.getMinMargin()) && Double.doubleToLongBits(getMaxMargin()) == Double.doubleToLongBits(getBidMachineWinRateRequest.getMaxMargin()) && Double.doubleToLongBits(getEpsilon()) == Double.doubleToLongBits(getBidMachineWinRateRequest.getEpsilon()) && this.unknownFields.equals(getBidMachineWinRateRequest.unknownFields);
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getAgencyId() {
            Object obj = this.agencyId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.agencyId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getAgencyIdBytes() {
            Object obj = this.agencyId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.agencyId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getApp() {
            Object obj = this.app_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.app_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getAppBytes() {
            Object obj = this.app_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.app_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public double getBidFloor() {
            return this.bidFloor_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public float getBidPrice() {
            return this.bidPrice_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public double getBmCachedLurlPrice() {
            return this.bmCachedLurlPrice_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public long getCachedLurlMillisPassed() {
            return this.cachedLurlMillisPassed_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ConnectionType getConnectionType() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.connectionType_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getConnectionTypeValue() {
            return this.connectionType_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getCountry() {
            Object obj = this.country_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.country_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getCountryBytes() {
            Object obj = this.country_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.country_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getDayOfWeek() {
            return this.dayOfWeek_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getDeviceTypeValue() {
            return this.deviceType_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public double getEpsilon() {
            return this.epsilon_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public boolean getIsIfa() {
            return this.isIfa_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public boolean getIsRewardedRequest() {
            return this.isRewardedRequest_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getLanguage() {
            Object obj = this.language_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.language_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getLanguageBytes() {
            Object obj = this.language_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.language_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public double getMaxMargin() {
            return this.maxMargin_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public double getMinMargin() {
            return this.minMargin_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public double getOriginalFloor() {
            return this.originalFloor_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public OperatingSystem getOs() {
            OperatingSystem operatingSystemValueOf = OperatingSystem.valueOf(this.os_);
            return operatingSystemValueOf == null ? OperatingSystem.UNRECOGNIZED : operatingSystemValueOf;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getOsVersion() {
            Object obj = this.osVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getOsVersionBytes() {
            Object obj = this.osVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getRegion() {
            Object obj = this.region_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.region_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getRegionBytes() {
            Object obj = this.region_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.region_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getRequestId() {
            Object obj = this.requestId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.requestId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getRequestIdBytes() {
            Object obj = this.requestId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.requestId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getSellerId() {
            Object obj = this.sellerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sellerId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getSellerIdBytes() {
            Object obj = this.sellerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sellerId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getRequestIdBytes().isEmpty() ? h0.computeStringSize(1, this.requestId_) : 0;
            int i11 = this.dayOfWeek_;
            if (i11 != 0) {
                iComputeStringSize += n.x(2, i11);
            }
            int i12 = this.utcHour_;
            if (i12 != 0) {
                iComputeStringSize += n.x(3, i12);
            }
            if (!getSellerIdBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(4, this.sellerId_);
            }
            if (this.adType_ != AdType.AD_TYPE_UNSPECIFIED.getNumber()) {
                iComputeStringSize += n.l(5, this.adType_);
            }
            boolean z10 = this.isRewardedRequest_;
            if (z10) {
                iComputeStringSize += n.e(6, z10);
            }
            if (!getAppBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(7, this.app_);
            }
            if (this.os_ != OperatingSystem.OTHER_NOT_LISTED.getNumber()) {
                iComputeStringSize += n.l(8, this.os_);
            }
            if (!getOsVersionBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(9, this.osVersion_);
            }
            if (!getLanguageBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(10, this.language_);
            }
            if (!getCountryBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(11, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(12, this.region_);
            }
            if (!getCityBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(13, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(14, this.zip_);
            }
            int i13 = this.width_;
            if (i13 != 0) {
                iComputeStringSize += n.x(15, i13);
            }
            int i14 = this.height_;
            if (i14 != 0) {
                iComputeStringSize += n.x(16, i14);
            }
            if (this.connectionType_ != ConnectionType.ConnectionType_UNKNOWN.getNumber()) {
                iComputeStringSize += n.l(17, this.connectionType_);
            }
            if (this.deviceType_ != DeviceType.DeviceType_UNKNOWN.getNumber()) {
                iComputeStringSize += n.l(18, this.deviceType_);
            }
            boolean z11 = this.isIfa_;
            if (z11) {
                iComputeStringSize += n.e(19, z11);
            }
            double d10 = this.bmCachedLurlPrice_;
            if (d10 != 0.0d) {
                iComputeStringSize += n.j(20, d10);
            }
            long j10 = this.cachedLurlMillisPassed_;
            if (j10 != 0) {
                iComputeStringSize += n.z(21, j10);
            }
            double d11 = this.bidFloor_;
            if (d11 != 0.0d) {
                iComputeStringSize += n.j(22, d11);
            }
            if (!getAgencyIdBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(23, this.agencyId_);
            }
            double d12 = this.originalFloor_;
            if (d12 != 0.0d) {
                iComputeStringSize += n.j(24, d12);
            }
            float f10 = this.bidPrice_;
            if (f10 != 0.0f) {
                iComputeStringSize += n.r(98, f10);
            }
            if (!getWinrateModelNameBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(99, this.winrateModelName_);
            }
            if (!getStrategyNameBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(100, this.strategyName_);
            }
            double d13 = this.minMargin_;
            if (d13 != 0.0d) {
                iComputeStringSize += n.j(101, d13);
            }
            double d14 = this.maxMargin_;
            if (d14 != 0.0d) {
                iComputeStringSize += n.j(102, d14);
            }
            double d15 = this.epsilon_;
            if (d15 != 0.0d) {
                iComputeStringSize += n.j(103, d15);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getStrategyName() {
            Object obj = this.strategyName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.strategyName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getStrategyNameBytes() {
            Object obj = this.strategyName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.strategyName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getUtcHour() {
            return this.utcHour_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getWinrateModelName() {
            Object obj = this.winrateModelName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.winrateModelName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getWinrateModelNameBytes() {
            Object obj = this.winrateModelName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.winrateModelName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public String getZip() {
            Object obj = this.zip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.zip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
        public ByteString getZipBytes() {
            Object obj = this.zip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.zip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getRequestId().hashCode()) * 37) + 2) * 53) + getDayOfWeek()) * 37) + 3) * 53) + getUtcHour()) * 37) + 4) * 53) + getSellerId().hashCode()) * 37) + 5) * 53) + this.adType_) * 37) + 6) * 53) + j0.d(getIsRewardedRequest())) * 37) + 7) * 53) + getApp().hashCode()) * 37) + 8) * 53) + this.os_) * 37) + 9) * 53) + getOsVersion().hashCode()) * 37) + 10) * 53) + getLanguage().hashCode()) * 37) + 11) * 53) + getCountry().hashCode()) * 37) + 12) * 53) + getRegion().hashCode()) * 37) + 13) * 53) + getCity().hashCode()) * 37) + 14) * 53) + getZip().hashCode()) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getHeight()) * 37) + 17) * 53) + this.connectionType_) * 37) + 18) * 53) + this.deviceType_) * 37) + 19) * 53) + j0.d(getIsIfa())) * 37) + 20) * 53) + j0.i(Double.doubleToLongBits(getBmCachedLurlPrice()))) * 37) + 21) * 53) + j0.i(getCachedLurlMillisPassed())) * 37) + 22) * 53) + j0.i(Double.doubleToLongBits(getBidFloor()))) * 37) + 23) * 53) + getAgencyId().hashCode()) * 37) + 24) * 53) + j0.i(Double.doubleToLongBits(getOriginalFloor()))) * 37) + 98) * 53) + Float.floatToIntBits(getBidPrice())) * 37) + 99) * 53) + getWinrateModelName().hashCode()) * 37) + 100) * 53) + getStrategyName().hashCode()) * 37) + 101) * 53) + j0.i(Double.doubleToLongBits(getMinMargin()))) * 37) + 102) * 53) + j0.i(Double.doubleToLongBits(getMaxMargin()))) * 37) + 103) * 53) + j0.i(Double.doubleToLongBits(getEpsilon()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return Predictor.internal_static_predictor_GetBidMachineWinRateRequest_fieldAccessorTable.d(GetBidMachineWinRateRequest.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new GetBidMachineWinRateRequest();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getRequestIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.requestId_);
            }
            int i10 = this.dayOfWeek_;
            if (i10 != 0) {
                nVar.F0(2, i10);
            }
            int i11 = this.utcHour_;
            if (i11 != 0) {
                nVar.F0(3, i11);
            }
            if (!getSellerIdBytes().isEmpty()) {
                h0.writeString(nVar, 4, this.sellerId_);
            }
            if (this.adType_ != AdType.AD_TYPE_UNSPECIFIED.getNumber()) {
                nVar.v0(5, this.adType_);
            }
            boolean z10 = this.isRewardedRequest_;
            if (z10) {
                nVar.n0(6, z10);
            }
            if (!getAppBytes().isEmpty()) {
                h0.writeString(nVar, 7, this.app_);
            }
            if (this.os_ != OperatingSystem.OTHER_NOT_LISTED.getNumber()) {
                nVar.v0(8, this.os_);
            }
            if (!getOsVersionBytes().isEmpty()) {
                h0.writeString(nVar, 9, this.osVersion_);
            }
            if (!getLanguageBytes().isEmpty()) {
                h0.writeString(nVar, 10, this.language_);
            }
            if (!getCountryBytes().isEmpty()) {
                h0.writeString(nVar, 11, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                h0.writeString(nVar, 12, this.region_);
            }
            if (!getCityBytes().isEmpty()) {
                h0.writeString(nVar, 13, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                h0.writeString(nVar, 14, this.zip_);
            }
            int i12 = this.width_;
            if (i12 != 0) {
                nVar.F0(15, i12);
            }
            int i13 = this.height_;
            if (i13 != 0) {
                nVar.F0(16, i13);
            }
            if (this.connectionType_ != ConnectionType.ConnectionType_UNKNOWN.getNumber()) {
                nVar.v0(17, this.connectionType_);
            }
            if (this.deviceType_ != DeviceType.DeviceType_UNKNOWN.getNumber()) {
                nVar.v0(18, this.deviceType_);
            }
            boolean z11 = this.isIfa_;
            if (z11) {
                nVar.n0(19, z11);
            }
            double d10 = this.bmCachedLurlPrice_;
            if (d10 != 0.0d) {
                nVar.t0(20, d10);
            }
            long j10 = this.cachedLurlMillisPassed_;
            if (j10 != 0) {
                nVar.H0(21, j10);
            }
            double d11 = this.bidFloor_;
            if (d11 != 0.0d) {
                nVar.t0(22, d11);
            }
            if (!getAgencyIdBytes().isEmpty()) {
                h0.writeString(nVar, 23, this.agencyId_);
            }
            double d12 = this.originalFloor_;
            if (d12 != 0.0d) {
                nVar.t0(24, d12);
            }
            float f10 = this.bidPrice_;
            if (f10 != 0.0f) {
                nVar.B0(98, f10);
            }
            if (!getWinrateModelNameBytes().isEmpty()) {
                h0.writeString(nVar, 99, this.winrateModelName_);
            }
            if (!getStrategyNameBytes().isEmpty()) {
                h0.writeString(nVar, 100, this.strategyName_);
            }
            double d13 = this.minMargin_;
            if (d13 != 0.0d) {
                nVar.t0(101, d13);
            }
            double d14 = this.maxMargin_;
            if (d14 != 0.0d) {
                nVar.t0(102, d14);
            }
            double d15 = this.epsilon_;
            if (d15 != 0.0d) {
                nVar.t0(103, d15);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements GetBidMachineWinRateRequestOrBuilder {
            private int adType_;
            private Object agencyId_;
            private Object app_;
            private double bidFloor_;
            private float bidPrice_;
            private double bmCachedLurlPrice_;
            private long cachedLurlMillisPassed_;
            private Object city_;
            private int connectionType_;
            private Object country_;
            private int dayOfWeek_;
            private int deviceType_;
            private double epsilon_;
            private int height_;
            private boolean isIfa_;
            private boolean isRewardedRequest_;
            private Object language_;
            private double maxMargin_;
            private double minMargin_;
            private double originalFloor_;
            private Object osVersion_;
            private int os_;
            private Object region_;
            private Object requestId_;
            private Object sellerId_;
            private Object strategyName_;
            private int utcHour_;
            private int width_;
            private Object winrateModelName_;
            private Object zip_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Predictor.internal_static_predictor_GetBidMachineWinRateRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAgencyId() {
                this.agencyId_ = GetBidMachineWinRateRequest.getDefaultInstance().getAgencyId();
                onChanged();
                return this;
            }

            public Builder clearApp() {
                this.app_ = GetBidMachineWinRateRequest.getDefaultInstance().getApp();
                onChanged();
                return this;
            }

            public Builder clearBidFloor() {
                this.bidFloor_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearBidPrice() {
                this.bidPrice_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearBmCachedLurlPrice() {
                this.bmCachedLurlPrice_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearCachedLurlMillisPassed() {
                this.cachedLurlMillisPassed_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearCity() {
                this.city_ = GetBidMachineWinRateRequest.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder clearConnectionType() {
                this.connectionType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCountry() {
                this.country_ = GetBidMachineWinRateRequest.getDefaultInstance().getCountry();
                onChanged();
                return this;
            }

            public Builder clearDayOfWeek() {
                this.dayOfWeek_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDeviceType() {
                this.deviceType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEpsilon() {
                this.epsilon_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsIfa() {
                this.isIfa_ = false;
                onChanged();
                return this;
            }

            public Builder clearIsRewardedRequest() {
                this.isRewardedRequest_ = false;
                onChanged();
                return this;
            }

            public Builder clearLanguage() {
                this.language_ = GetBidMachineWinRateRequest.getDefaultInstance().getLanguage();
                onChanged();
                return this;
            }

            public Builder clearMaxMargin() {
                this.maxMargin_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearMinMargin() {
                this.minMargin_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearOriginalFloor() {
                this.originalFloor_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearOs() {
                this.os_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOsVersion() {
                this.osVersion_ = GetBidMachineWinRateRequest.getDefaultInstance().getOsVersion();
                onChanged();
                return this;
            }

            public Builder clearRegion() {
                this.region_ = GetBidMachineWinRateRequest.getDefaultInstance().getRegion();
                onChanged();
                return this;
            }

            public Builder clearRequestId() {
                this.requestId_ = GetBidMachineWinRateRequest.getDefaultInstance().getRequestId();
                onChanged();
                return this;
            }

            public Builder clearSellerId() {
                this.sellerId_ = GetBidMachineWinRateRequest.getDefaultInstance().getSellerId();
                onChanged();
                return this;
            }

            public Builder clearStrategyName() {
                this.strategyName_ = GetBidMachineWinRateRequest.getDefaultInstance().getStrategyName();
                onChanged();
                return this;
            }

            public Builder clearUtcHour() {
                this.utcHour_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWinrateModelName() {
                this.winrateModelName_ = GetBidMachineWinRateRequest.getDefaultInstance().getWinrateModelName();
                onChanged();
                return this;
            }

            public Builder clearZip() {
                this.zip_ = GetBidMachineWinRateRequest.getDefaultInstance().getZip();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getAgencyId() {
                Object obj = this.agencyId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.agencyId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getAgencyIdBytes() {
                Object obj = this.agencyId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.agencyId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getApp() {
                Object obj = this.app_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.app_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getAppBytes() {
                Object obj = this.app_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.app_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public double getBidFloor() {
                return this.bidFloor_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public float getBidPrice() {
                return this.bidPrice_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public double getBmCachedLurlPrice() {
                return this.bmCachedLurlPrice_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public long getCachedLurlMillisPassed() {
                return this.cachedLurlMillisPassed_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ConnectionType getConnectionType() {
                ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.connectionType_);
                return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getConnectionTypeValue() {
                return this.connectionType_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getCountry() {
                Object obj = this.country_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.country_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getCountryBytes() {
                Object obj = this.country_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.country_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getDayOfWeek() {
                return this.dayOfWeek_;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Predictor.internal_static_predictor_GetBidMachineWinRateRequest_descriptor;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public DeviceType getDeviceType() {
                DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
                return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getDeviceTypeValue() {
                return this.deviceType_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public double getEpsilon() {
                return this.epsilon_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public boolean getIsIfa() {
                return this.isIfa_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public boolean getIsRewardedRequest() {
                return this.isRewardedRequest_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getLanguage() {
                Object obj = this.language_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.language_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getLanguageBytes() {
                Object obj = this.language_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.language_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public double getMaxMargin() {
                return this.maxMargin_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public double getMinMargin() {
                return this.minMargin_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public double getOriginalFloor() {
                return this.originalFloor_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public OperatingSystem getOs() {
                OperatingSystem operatingSystemValueOf = OperatingSystem.valueOf(this.os_);
                return operatingSystemValueOf == null ? OperatingSystem.UNRECOGNIZED : operatingSystemValueOf;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getOsValue() {
                return this.os_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getOsVersion() {
                Object obj = this.osVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.osVersion_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getOsVersionBytes() {
                Object obj = this.osVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.osVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getRegion() {
                Object obj = this.region_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.region_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getRegionBytes() {
                Object obj = this.region_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.region_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getRequestId() {
                Object obj = this.requestId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.requestId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getRequestIdBytes() {
                Object obj = this.requestId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.requestId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getSellerId() {
                Object obj = this.sellerId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sellerId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getSellerIdBytes() {
                Object obj = this.sellerId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sellerId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getStrategyName() {
                Object obj = this.strategyName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.strategyName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getStrategyNameBytes() {
                Object obj = this.strategyName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.strategyName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getUtcHour() {
                return this.utcHour_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getWinrateModelName() {
                Object obj = this.winrateModelName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.winrateModelName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getWinrateModelNameBytes() {
                Object obj = this.winrateModelName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.winrateModelName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public String getZip() {
                Object obj = this.zip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.zip_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequestOrBuilder
            public ByteString getZipBytes() {
                Object obj = this.zip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.zip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return Predictor.internal_static_predictor_GetBidMachineWinRateRequest_fieldAccessorTable.d(GetBidMachineWinRateRequest.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setAgencyId(String str) {
                str.getClass();
                this.agencyId_ = str;
                onChanged();
                return this;
            }

            public Builder setAgencyIdBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.agencyId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setApp(String str) {
                str.getClass();
                this.app_ = str;
                onChanged();
                return this;
            }

            public Builder setAppBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.app_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBidFloor(double d10) {
                this.bidFloor_ = d10;
                onChanged();
                return this;
            }

            public Builder setBidPrice(float f10) {
                this.bidPrice_ = f10;
                onChanged();
                return this;
            }

            public Builder setBmCachedLurlPrice(double d10) {
                this.bmCachedLurlPrice_ = d10;
                onChanged();
                return this;
            }

            public Builder setCachedLurlMillisPassed(long j10) {
                this.cachedLurlMillisPassed_ = j10;
                onChanged();
                return this;
            }

            public Builder setCity(String str) {
                str.getClass();
                this.city_ = str;
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.city_ = byteString;
                onChanged();
                return this;
            }

            public Builder setConnectionType(ConnectionType connectionType) {
                connectionType.getClass();
                this.connectionType_ = connectionType.getNumber();
                onChanged();
                return this;
            }

            public Builder setConnectionTypeValue(int i10) {
                this.connectionType_ = i10;
                onChanged();
                return this;
            }

            public Builder setCountry(String str) {
                str.getClass();
                this.country_ = str;
                onChanged();
                return this;
            }

            public Builder setCountryBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.country_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDayOfWeek(int i10) {
                this.dayOfWeek_ = i10;
                onChanged();
                return this;
            }

            public Builder setDeviceType(DeviceType deviceType) {
                deviceType.getClass();
                this.deviceType_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setDeviceTypeValue(int i10) {
                this.deviceType_ = i10;
                onChanged();
                return this;
            }

            public Builder setEpsilon(double d10) {
                this.epsilon_ = d10;
                onChanged();
                return this;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            public Builder setIsIfa(boolean z10) {
                this.isIfa_ = z10;
                onChanged();
                return this;
            }

            public Builder setIsRewardedRequest(boolean z10) {
                this.isRewardedRequest_ = z10;
                onChanged();
                return this;
            }

            public Builder setLanguage(String str) {
                str.getClass();
                this.language_ = str;
                onChanged();
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.language_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMaxMargin(double d10) {
                this.maxMargin_ = d10;
                onChanged();
                return this;
            }

            public Builder setMinMargin(double d10) {
                this.minMargin_ = d10;
                onChanged();
                return this;
            }

            public Builder setOriginalFloor(double d10) {
                this.originalFloor_ = d10;
                onChanged();
                return this;
            }

            public Builder setOs(OperatingSystem operatingSystem) {
                operatingSystem.getClass();
                this.os_ = operatingSystem.getNumber();
                onChanged();
                return this;
            }

            public Builder setOsValue(int i10) {
                this.os_ = i10;
                onChanged();
                return this;
            }

            public Builder setOsVersion(String str) {
                str.getClass();
                this.osVersion_ = str;
                onChanged();
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.osVersion_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRegion(String str) {
                str.getClass();
                this.region_ = str;
                onChanged();
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.region_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRequestId(String str) {
                str.getClass();
                this.requestId_ = str;
                onChanged();
                return this;
            }

            public Builder setRequestIdBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.requestId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSellerId(String str) {
                str.getClass();
                this.sellerId_ = str;
                onChanged();
                return this;
            }

            public Builder setSellerIdBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.sellerId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStrategyName(String str) {
                str.getClass();
                this.strategyName_ = str;
                onChanged();
                return this;
            }

            public Builder setStrategyNameBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.strategyName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setUtcHour(int i10) {
                this.utcHour_ = i10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            public Builder setWinrateModelName(String str) {
                str.getClass();
                this.winrateModelName_ = str;
                onChanged();
                return this;
            }

            public Builder setWinrateModelNameBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.winrateModelName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setZip(String str) {
                str.getClass();
                this.zip_ = str;
                onChanged();
                return this;
            }

            public Builder setZipBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.zip_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.requestId_ = "";
                this.sellerId_ = "";
                this.adType_ = 0;
                this.app_ = "";
                this.os_ = 0;
                this.osVersion_ = "";
                this.language_ = "";
                this.country_ = "";
                this.region_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.connectionType_ = 0;
                this.deviceType_ = 0;
                this.agencyId_ = "";
                this.winrateModelName_ = "";
                this.strategyName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public GetBidMachineWinRateRequest build() {
                GetBidMachineWinRateRequest getBidMachineWinRateRequestBuildPartial = buildPartial();
                if (getBidMachineWinRateRequestBuildPartial.isInitialized()) {
                    return getBidMachineWinRateRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getBidMachineWinRateRequestBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public GetBidMachineWinRateRequest buildPartial() {
                GetBidMachineWinRateRequest getBidMachineWinRateRequest = new GetBidMachineWinRateRequest(this);
                getBidMachineWinRateRequest.requestId_ = this.requestId_;
                getBidMachineWinRateRequest.dayOfWeek_ = this.dayOfWeek_;
                getBidMachineWinRateRequest.utcHour_ = this.utcHour_;
                getBidMachineWinRateRequest.sellerId_ = this.sellerId_;
                getBidMachineWinRateRequest.adType_ = this.adType_;
                getBidMachineWinRateRequest.isRewardedRequest_ = this.isRewardedRequest_;
                getBidMachineWinRateRequest.app_ = this.app_;
                getBidMachineWinRateRequest.os_ = this.os_;
                getBidMachineWinRateRequest.osVersion_ = this.osVersion_;
                getBidMachineWinRateRequest.language_ = this.language_;
                getBidMachineWinRateRequest.country_ = this.country_;
                getBidMachineWinRateRequest.region_ = this.region_;
                getBidMachineWinRateRequest.city_ = this.city_;
                getBidMachineWinRateRequest.zip_ = this.zip_;
                getBidMachineWinRateRequest.width_ = this.width_;
                getBidMachineWinRateRequest.height_ = this.height_;
                getBidMachineWinRateRequest.connectionType_ = this.connectionType_;
                getBidMachineWinRateRequest.deviceType_ = this.deviceType_;
                getBidMachineWinRateRequest.isIfa_ = this.isIfa_;
                getBidMachineWinRateRequest.bmCachedLurlPrice_ = this.bmCachedLurlPrice_;
                getBidMachineWinRateRequest.cachedLurlMillisPassed_ = this.cachedLurlMillisPassed_;
                getBidMachineWinRateRequest.bidFloor_ = this.bidFloor_;
                getBidMachineWinRateRequest.agencyId_ = this.agencyId_;
                getBidMachineWinRateRequest.originalFloor_ = this.originalFloor_;
                getBidMachineWinRateRequest.bidPrice_ = this.bidPrice_;
                getBidMachineWinRateRequest.winrateModelName_ = this.winrateModelName_;
                getBidMachineWinRateRequest.strategyName_ = this.strategyName_;
                getBidMachineWinRateRequest.minMargin_ = this.minMargin_;
                getBidMachineWinRateRequest.maxMargin_ = this.maxMargin_;
                getBidMachineWinRateRequest.epsilon_ = this.epsilon_;
                onBuilt();
                return getBidMachineWinRateRequest;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public GetBidMachineWinRateRequest getDefaultInstanceForType() {
                return GetBidMachineWinRateRequest.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.requestId_ = "";
                this.dayOfWeek_ = 0;
                this.utcHour_ = 0;
                this.sellerId_ = "";
                this.adType_ = 0;
                this.isRewardedRequest_ = false;
                this.app_ = "";
                this.os_ = 0;
                this.osVersion_ = "";
                this.language_ = "";
                this.country_ = "";
                this.region_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.width_ = 0;
                this.height_ = 0;
                this.connectionType_ = 0;
                this.deviceType_ = 0;
                this.isIfa_ = false;
                this.bmCachedLurlPrice_ = 0.0d;
                this.cachedLurlMillisPassed_ = 0L;
                this.bidFloor_ = 0.0d;
                this.agencyId_ = "";
                this.originalFloor_ = 0.0d;
                this.bidPrice_ = 0.0f;
                this.winrateModelName_ = "";
                this.strategyName_ = "";
                this.minMargin_ = 0.0d;
                this.maxMargin_ = 0.0d;
                this.epsilon_ = 0.0d;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetBidMachineWinRateRequest) {
                    return mergeFrom((GetBidMachineWinRateRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetBidMachineWinRateRequest getBidMachineWinRateRequest) {
                if (getBidMachineWinRateRequest == GetBidMachineWinRateRequest.getDefaultInstance()) {
                    return this;
                }
                if (!getBidMachineWinRateRequest.getRequestId().isEmpty()) {
                    this.requestId_ = getBidMachineWinRateRequest.requestId_;
                    onChanged();
                }
                if (getBidMachineWinRateRequest.getDayOfWeek() != 0) {
                    setDayOfWeek(getBidMachineWinRateRequest.getDayOfWeek());
                }
                if (getBidMachineWinRateRequest.getUtcHour() != 0) {
                    setUtcHour(getBidMachineWinRateRequest.getUtcHour());
                }
                if (!getBidMachineWinRateRequest.getSellerId().isEmpty()) {
                    this.sellerId_ = getBidMachineWinRateRequest.sellerId_;
                    onChanged();
                }
                if (getBidMachineWinRateRequest.adType_ != 0) {
                    setAdTypeValue(getBidMachineWinRateRequest.getAdTypeValue());
                }
                if (getBidMachineWinRateRequest.getIsRewardedRequest()) {
                    setIsRewardedRequest(getBidMachineWinRateRequest.getIsRewardedRequest());
                }
                if (!getBidMachineWinRateRequest.getApp().isEmpty()) {
                    this.app_ = getBidMachineWinRateRequest.app_;
                    onChanged();
                }
                if (getBidMachineWinRateRequest.os_ != 0) {
                    setOsValue(getBidMachineWinRateRequest.getOsValue());
                }
                if (!getBidMachineWinRateRequest.getOsVersion().isEmpty()) {
                    this.osVersion_ = getBidMachineWinRateRequest.osVersion_;
                    onChanged();
                }
                if (!getBidMachineWinRateRequest.getLanguage().isEmpty()) {
                    this.language_ = getBidMachineWinRateRequest.language_;
                    onChanged();
                }
                if (!getBidMachineWinRateRequest.getCountry().isEmpty()) {
                    this.country_ = getBidMachineWinRateRequest.country_;
                    onChanged();
                }
                if (!getBidMachineWinRateRequest.getRegion().isEmpty()) {
                    this.region_ = getBidMachineWinRateRequest.region_;
                    onChanged();
                }
                if (!getBidMachineWinRateRequest.getCity().isEmpty()) {
                    this.city_ = getBidMachineWinRateRequest.city_;
                    onChanged();
                }
                if (!getBidMachineWinRateRequest.getZip().isEmpty()) {
                    this.zip_ = getBidMachineWinRateRequest.zip_;
                    onChanged();
                }
                if (getBidMachineWinRateRequest.getWidth() != 0) {
                    setWidth(getBidMachineWinRateRequest.getWidth());
                }
                if (getBidMachineWinRateRequest.getHeight() != 0) {
                    setHeight(getBidMachineWinRateRequest.getHeight());
                }
                if (getBidMachineWinRateRequest.connectionType_ != 0) {
                    setConnectionTypeValue(getBidMachineWinRateRequest.getConnectionTypeValue());
                }
                if (getBidMachineWinRateRequest.deviceType_ != 0) {
                    setDeviceTypeValue(getBidMachineWinRateRequest.getDeviceTypeValue());
                }
                if (getBidMachineWinRateRequest.getIsIfa()) {
                    setIsIfa(getBidMachineWinRateRequest.getIsIfa());
                }
                if (getBidMachineWinRateRequest.getBmCachedLurlPrice() != 0.0d) {
                    setBmCachedLurlPrice(getBidMachineWinRateRequest.getBmCachedLurlPrice());
                }
                if (getBidMachineWinRateRequest.getCachedLurlMillisPassed() != 0) {
                    setCachedLurlMillisPassed(getBidMachineWinRateRequest.getCachedLurlMillisPassed());
                }
                if (getBidMachineWinRateRequest.getBidFloor() != 0.0d) {
                    setBidFloor(getBidMachineWinRateRequest.getBidFloor());
                }
                if (!getBidMachineWinRateRequest.getAgencyId().isEmpty()) {
                    this.agencyId_ = getBidMachineWinRateRequest.agencyId_;
                    onChanged();
                }
                if (getBidMachineWinRateRequest.getOriginalFloor() != 0.0d) {
                    setOriginalFloor(getBidMachineWinRateRequest.getOriginalFloor());
                }
                if (getBidMachineWinRateRequest.getBidPrice() != 0.0f) {
                    setBidPrice(getBidMachineWinRateRequest.getBidPrice());
                }
                if (!getBidMachineWinRateRequest.getWinrateModelName().isEmpty()) {
                    this.winrateModelName_ = getBidMachineWinRateRequest.winrateModelName_;
                    onChanged();
                }
                if (!getBidMachineWinRateRequest.getStrategyName().isEmpty()) {
                    this.strategyName_ = getBidMachineWinRateRequest.strategyName_;
                    onChanged();
                }
                if (getBidMachineWinRateRequest.getMinMargin() != 0.0d) {
                    setMinMargin(getBidMachineWinRateRequest.getMinMargin());
                }
                if (getBidMachineWinRateRequest.getMaxMargin() != 0.0d) {
                    setMaxMargin(getBidMachineWinRateRequest.getMaxMargin());
                }
                if (getBidMachineWinRateRequest.getEpsilon() != 0.0d) {
                    setEpsilon(getBidMachineWinRateRequest.getEpsilon());
                }
                mergeUnknownFields(((h0) getBidMachineWinRateRequest).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.requestId_ = "";
                this.sellerId_ = "";
                this.adType_ = 0;
                this.app_ = "";
                this.os_ = 0;
                this.osVersion_ = "";
                this.language_ = "";
                this.country_ = "";
                this.region_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.connectionType_ = 0;
                this.deviceType_ = 0;
                this.agencyId_ = "";
                this.winrateModelName_ = "";
                this.strategyName_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequest.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequest.access$4800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.predictor.Predictor$GetBidMachineWinRateRequest r3 = (io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequest) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.predictor.Predictor$GetBidMachineWinRateRequest r4 = (io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequest) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.predictor.Predictor.GetBidMachineWinRateRequest.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.predictor.Predictor$GetBidMachineWinRateRequest$Builder");
            }
        }

        public static Builder newBuilder(GetBidMachineWinRateRequest getBidMachineWinRateRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getBidMachineWinRateRequest);
        }

        public static GetBidMachineWinRateRequest parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (GetBidMachineWinRateRequest) PARSER.parseFrom(byteBuffer, wVar);
        }

        private GetBidMachineWinRateRequest(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetBidMachineWinRateRequest parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (GetBidMachineWinRateRequest) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static GetBidMachineWinRateRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetBidMachineWinRateRequest) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public GetBidMachineWinRateRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetBidMachineWinRateRequest parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (GetBidMachineWinRateRequest) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetBidMachineWinRateRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.requestId_ = "";
            this.sellerId_ = "";
            this.adType_ = 0;
            this.app_ = "";
            this.os_ = 0;
            this.osVersion_ = "";
            this.language_ = "";
            this.country_ = "";
            this.region_ = "";
            this.city_ = "";
            this.zip_ = "";
            this.connectionType_ = 0;
            this.deviceType_ = 0;
            this.agencyId_ = "";
            this.winrateModelName_ = "";
            this.strategyName_ = "";
        }

        public static GetBidMachineWinRateRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetBidMachineWinRateRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static GetBidMachineWinRateRequest parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (GetBidMachineWinRateRequest) PARSER.parseFrom(bArr, wVar);
        }

        public static GetBidMachineWinRateRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetBidMachineWinRateRequest) h0.parseWithIOException(PARSER, inputStream);
        }

        public static GetBidMachineWinRateRequest parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (GetBidMachineWinRateRequest) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static GetBidMachineWinRateRequest parseFrom(l lVar) throws IOException {
            return (GetBidMachineWinRateRequest) h0.parseWithIOException(PARSER, lVar);
        }

        public static GetBidMachineWinRateRequest parseFrom(l lVar, w wVar) throws IOException {
            return (GetBidMachineWinRateRequest) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private GetBidMachineWinRateRequest(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 10:
                                this.requestId_ = lVar.J();
                                break;
                            case 16:
                                this.dayOfWeek_ = lVar.y();
                                break;
                            case 24:
                                this.utcHour_ = lVar.y();
                                break;
                            case 34:
                                this.sellerId_ = lVar.J();
                                break;
                            case 40:
                                this.adType_ = lVar.t();
                                break;
                            case 48:
                                this.isRewardedRequest_ = lVar.q();
                                break;
                            case 58:
                                this.app_ = lVar.J();
                                break;
                            case 64:
                                this.os_ = lVar.t();
                                break;
                            case 74:
                                this.osVersion_ = lVar.J();
                                break;
                            case 82:
                                this.language_ = lVar.J();
                                break;
                            case 90:
                                this.country_ = lVar.J();
                                break;
                            case 98:
                                this.region_ = lVar.J();
                                break;
                            case 106:
                                this.city_ = lVar.J();
                                break;
                            case 114:
                                this.zip_ = lVar.J();
                                break;
                            case 120:
                                this.width_ = lVar.y();
                                break;
                            case 128:
                                this.height_ = lVar.y();
                                break;
                            case 136:
                                this.connectionType_ = lVar.t();
                                break;
                            case 144:
                                this.deviceType_ = lVar.t();
                                break;
                            case 152:
                                this.isIfa_ = lVar.q();
                                break;
                            case 161:
                                this.bmCachedLurlPrice_ = lVar.s();
                                break;
                            case 168:
                                this.cachedLurlMillisPassed_ = lVar.z();
                                break;
                            case 177:
                                this.bidFloor_ = lVar.s();
                                break;
                            case 186:
                                this.agencyId_ = lVar.J();
                                break;
                            case 193:
                                this.originalFloor_ = lVar.s();
                                break;
                            case 789:
                                this.bidPrice_ = lVar.w();
                                break;
                            case 794:
                                this.winrateModelName_ = lVar.J();
                                break;
                            case EVENT_TYPE_EXTENDED_NURL_VALUE:
                                this.strategyName_ = lVar.J();
                                break;
                            case 809:
                                this.minMargin_ = lVar.s();
                                break;
                            case 817:
                                this.maxMargin_ = lVar.s();
                                break;
                            case 825:
                                this.epsilon_ = lVar.s();
                                break;
                            default:
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface GetBidMachineWinRateRequestOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        String getAgencyId();

        ByteString getAgencyIdBytes();

        String getApp();

        ByteString getAppBytes();

        double getBidFloor();

        float getBidPrice();

        double getBmCachedLurlPrice();

        long getCachedLurlMillisPassed();

        String getCity();

        ByteString getCityBytes();

        ConnectionType getConnectionType();

        int getConnectionTypeValue();

        String getCountry();

        ByteString getCountryBytes();

        int getDayOfWeek();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        DeviceType getDeviceType();

        int getDeviceTypeValue();

        double getEpsilon();

        int getHeight();

        boolean getIsIfa();

        boolean getIsRewardedRequest();

        String getLanguage();

        ByteString getLanguageBytes();

        double getMaxMargin();

        double getMinMargin();

        double getOriginalFloor();

        OperatingSystem getOs();

        int getOsValue();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getRegion();

        ByteString getRegionBytes();

        String getRequestId();

        ByteString getRequestIdBytes();

        String getSellerId();

        ByteString getSellerIdBytes();

        String getStrategyName();

        ByteString getStrategyNameBytes();

        int getUtcHour();

        int getWidth();

        String getWinrateModelName();

        ByteString getWinrateModelNameBytes();

        String getZip();

        ByteString getZipBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum OperatingSystem implements j0.c {
        OTHER_NOT_LISTED(0),
        ANDROID(2),
        IOS(13),
        UNRECOGNIZED(-1);

        public static final int ANDROID_VALUE = 2;
        public static final int IOS_VALUE = 13;
        public static final int OTHER_NOT_LISTED_VALUE = 0;
        private final int value;
        private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.predictor.Predictor.OperatingSystem.1
            public OperatingSystem findValueByNumber(int i10) {
                return OperatingSystem.forNumber(i10);
            }
        };
        private static final OperatingSystem[] VALUES = values();

        OperatingSystem(int i10) {
            this.value = i10;
        }

        public static OperatingSystem forNumber(int i10) {
            if (i10 == 0) {
                return OTHER_NOT_LISTED;
            }
            if (i10 == 2) {
                return ANDROID;
            }
            if (i10 != 13) {
                return null;
            }
            return IOS;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Predictor.getDescriptor().getEnumTypes().get(3);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static OperatingSystem valueOf(int i10) {
            return forNumber(i10);
        }

        public static OperatingSystem valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class WinRateResponse extends h0 implements WinRateResponseOrBuilder {
        public static final int FEE_FIELD_NUMBER = 2;
        public static final int WIN_PROBABILITY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float fee_;
        private byte memoizedIsInitialized;
        private float winProbability_;
        private static final WinRateResponse DEFAULT_INSTANCE = new WinRateResponse();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.predictor.Predictor.WinRateResponse.1
            @Override // com.explorestack.protobuf.p1
            public WinRateResponse parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new WinRateResponse(lVar, wVar);
            }
        };

        public static WinRateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Predictor.internal_static_predictor_WinRateResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WinRateResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WinRateResponse) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WinRateResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WinRateResponse) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WinRateResponse)) {
                return super.equals(obj);
            }
            WinRateResponse winRateResponse = (WinRateResponse) obj;
            return Float.floatToIntBits(getWinProbability()) == Float.floatToIntBits(winRateResponse.getWinProbability()) && Float.floatToIntBits(getFee()) == Float.floatToIntBits(winRateResponse.getFee()) && this.unknownFields.equals(winRateResponse.unknownFields);
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.WinRateResponseOrBuilder
        public float getFee() {
            return this.fee_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            float f10 = this.winProbability_;
            int iR = f10 != 0.0f ? n.r(1, f10) : 0;
            float f11 = this.fee_;
            if (f11 != 0.0f) {
                iR += n.r(2, f11);
            }
            int serializedSize = iR + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.predictor.Predictor.WinRateResponseOrBuilder
        public float getWinProbability() {
            return this.winProbability_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getWinProbability())) * 37) + 2) * 53) + Float.floatToIntBits(getFee())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return Predictor.internal_static_predictor_WinRateResponse_fieldAccessorTable.d(WinRateResponse.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new WinRateResponse();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            float f10 = this.winProbability_;
            if (f10 != 0.0f) {
                nVar.B0(1, f10);
            }
            float f11 = this.fee_;
            if (f11 != 0.0f) {
                nVar.B0(2, f11);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements WinRateResponseOrBuilder {
            private float fee_;
            private float winProbability_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Predictor.internal_static_predictor_WinRateResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearFee() {
                this.fee_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWinProbability() {
                this.winProbability_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Predictor.internal_static_predictor_WinRateResponse_descriptor;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.WinRateResponseOrBuilder
            public float getFee() {
                return this.fee_;
            }

            @Override // io.bidmachine.protobuf.predictor.Predictor.WinRateResponseOrBuilder
            public float getWinProbability() {
                return this.winProbability_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return Predictor.internal_static_predictor_WinRateResponse_fieldAccessorTable.d(WinRateResponse.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setFee(float f10) {
                this.fee_ = f10;
                onChanged();
                return this;
            }

            public Builder setWinProbability(float f10) {
                this.winProbability_ = f10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public WinRateResponse build() {
                WinRateResponse winRateResponseBuildPartial = buildPartial();
                if (winRateResponseBuildPartial.isInitialized()) {
                    return winRateResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) winRateResponseBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public WinRateResponse buildPartial() {
                WinRateResponse winRateResponse = new WinRateResponse(this);
                winRateResponse.winProbability_ = this.winProbability_;
                winRateResponse.fee_ = this.fee_;
                onBuilt();
                return winRateResponse;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public WinRateResponse getDefaultInstanceForType() {
                return WinRateResponse.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            private Builder(h0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.winProbability_ = 0.0f;
                this.fee_ = 0.0f;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WinRateResponse) {
                    return mergeFrom((WinRateResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WinRateResponse winRateResponse) {
                if (winRateResponse == WinRateResponse.getDefaultInstance()) {
                    return this;
                }
                if (winRateResponse.getWinProbability() != 0.0f) {
                    setWinProbability(winRateResponse.getWinProbability());
                }
                if (winRateResponse.getFee() != 0.0f) {
                    setFee(winRateResponse.getFee());
                }
                mergeUnknownFields(((h0) winRateResponse).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.predictor.Predictor.WinRateResponse.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.predictor.Predictor.WinRateResponse.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.predictor.Predictor$WinRateResponse r3 = (io.bidmachine.protobuf.predictor.Predictor.WinRateResponse) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.predictor.Predictor$WinRateResponse r4 = (io.bidmachine.protobuf.predictor.Predictor.WinRateResponse) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.predictor.Predictor.WinRateResponse.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.predictor.Predictor$WinRateResponse$Builder");
            }
        }

        public static Builder newBuilder(WinRateResponse winRateResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(winRateResponse);
        }

        public static WinRateResponse parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (WinRateResponse) PARSER.parseFrom(byteBuffer, wVar);
        }

        private WinRateResponse(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WinRateResponse parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (WinRateResponse) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static WinRateResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WinRateResponse) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public WinRateResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static WinRateResponse parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (WinRateResponse) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private WinRateResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WinRateResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WinRateResponse) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static WinRateResponse parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (WinRateResponse) PARSER.parseFrom(bArr, wVar);
        }

        private WinRateResponse(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 13) {
                                this.winProbability_ = lVar.w();
                            } else if (iK != 21) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.fee_ = lVar.w();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static WinRateResponse parseFrom(InputStream inputStream) throws IOException {
            return (WinRateResponse) h0.parseWithIOException(PARSER, inputStream);
        }

        public static WinRateResponse parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (WinRateResponse) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static WinRateResponse parseFrom(l lVar) throws IOException {
            return (WinRateResponse) h0.parseWithIOException(PARSER, lVar);
        }

        public static WinRateResponse parseFrom(l lVar, w wVar) throws IOException {
            return (WinRateResponse) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface WinRateResponseOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        float getFee();

        float getWinProbability();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_predictor_WinRateResponse_descriptor = descriptor2;
        internal_static_predictor_WinRateResponse_fieldAccessorTable = new h0.f(descriptor2, new String[]{"WinProbability", "Fee"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_predictor_GetBidMachineWinRateRequest_descriptor = descriptor3;
        internal_static_predictor_GetBidMachineWinRateRequest_fieldAccessorTable = new h0.f(descriptor3, new String[]{"RequestId", "DayOfWeek", "UtcHour", "SellerId", "AdType", "IsRewardedRequest", "App", "Os", "OsVersion", "Language", "Country", "Region", "City", "Zip", HttpHeaders.WIDTH, "Height", "ConnectionType", "DeviceType", "IsIfa", "BmCachedLurlPrice", "CachedLurlMillisPassed", "BidFloor", "AgencyId", "OriginalFloor", "BidPrice", "WinrateModelName", "StrategyName", "MinMargin", "MaxMargin", "Epsilon"});
    }

    private Predictor() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(w wVar) {
    }

    public static void registerAllExtensions(u uVar) {
        registerAllExtensions((w) uVar);
    }
}
