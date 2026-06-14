package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;
import io.bidmachine.protobuf.sdk.AdFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Placement extends h0 implements PlacementOrBuilder {
    public static final int AD_FORMAT_FIELD_NUMBER = 5;
    public static final int AD_TYPE_FIELD_NUMBER = 1;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 3;
    public static final int HB_PLACEMENT_FIELD_NUMBER = 4;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private AdFormat adFormat_;
    private volatile Object adType_;
    private Struct customData_;
    private HeaderBiddingPlacement hbPlacement_;
    private byte memoizedIsInitialized;
    private StringValue placementId_;
    private static final Placement DEFAULT_INSTANCE = new Placement();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Placement.1
        @Override // com.explorestack.protobuf.p1
        public Placement parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Placement(lVar, wVar);
        }
    };

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getAdType().equals(placement.getAdType()) || hasPlacementId() != placement.hasPlacementId()) {
            return false;
        }
        if ((hasPlacementId() && !getPlacementId().equals(placement.getPlacementId())) || hasCustomData() != placement.hasCustomData()) {
            return false;
        }
        if ((hasCustomData() && !getCustomData().equals(placement.getCustomData())) || hasHbPlacement() != placement.hasHbPlacement()) {
            return false;
        }
        if ((!hasHbPlacement() || getHbPlacement().equals(placement.getHbPlacement())) && hasAdFormat() == placement.hasAdFormat()) {
            return (!hasAdFormat() || getAdFormat().equals(placement.getAdFormat())) && this.unknownFields.equals(placement.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public AdFormat getAdFormat() {
        AdFormat adFormat = this.adFormat_;
        return adFormat == null ? AdFormat.getDefaultInstance() : adFormat;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public AdFormatOrBuilder getAdFormatOrBuilder() {
        return getAdFormat();
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    @Deprecated
    public String getAdType() {
        Object obj = this.adType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.adType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    @Deprecated
    public ByteString getAdTypeBytes() {
        Object obj = this.adType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.adType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public Struct getCustomData() {
        Struct struct = this.customData_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public e2 getCustomDataOrBuilder() {
        return getCustomData();
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public HeaderBiddingPlacement getHbPlacement() {
        HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
        return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
        return getHbPlacement();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public StringValue getPlacementId() {
        StringValue stringValue = this.placementId_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public d2 getPlacementIdOrBuilder() {
        return getPlacementId();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getAdTypeBytes().isEmpty() ? h0.computeStringSize(1, this.adType_) : 0;
        if (this.placementId_ != null) {
            iComputeStringSize += n.G(2, getPlacementId());
        }
        if (this.customData_ != null) {
            iComputeStringSize += n.G(3, getCustomData());
        }
        if (this.hbPlacement_ != null) {
            iComputeStringSize += n.G(4, getHbPlacement());
        }
        if (this.adFormat_ != null) {
            iComputeStringSize += n.G(5, getAdFormat());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasAdFormat() {
        return this.adFormat_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasCustomData() {
        return this.customData_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasHbPlacement() {
        return this.hbPlacement_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasPlacementId() {
        return this.placementId_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdType().hashCode();
        if (hasPlacementId()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getPlacementId().hashCode();
        }
        if (hasCustomData()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getCustomData().hashCode();
        }
        if (hasHbPlacement()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getHbPlacement().hashCode();
        }
        if (hasAdFormat()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getAdFormat().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_fieldAccessorTable.d(Placement.class, Builder.class);
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
        return new Placement();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getAdTypeBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.adType_);
        }
        if (this.placementId_ != null) {
            nVar.J0(2, getPlacementId());
        }
        if (this.customData_ != null) {
            nVar.J0(3, getCustomData());
        }
        if (this.hbPlacement_ != null) {
            nVar.J0(4, getHbPlacement());
        }
        if (this.adFormat_ != null) {
            nVar.J0(5, getAdFormat());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements PlacementOrBuilder {
        private a2 adFormatBuilder_;
        private AdFormat adFormat_;
        private Object adType_;
        private a2 customDataBuilder_;
        private Struct customData_;
        private a2 hbPlacementBuilder_;
        private HeaderBiddingPlacement hbPlacement_;
        private a2 placementIdBuilder_;
        private StringValue placementId_;

        private a2 getAdFormatFieldBuilder() {
            if (this.adFormatBuilder_ == null) {
                this.adFormatBuilder_ = new a2(getAdFormat(), getParentForChildren(), isClean());
                this.adFormat_ = null;
            }
            return this.adFormatBuilder_;
        }

        private a2 getCustomDataFieldBuilder() {
            if (this.customDataBuilder_ == null) {
                this.customDataBuilder_ = new a2(getCustomData(), getParentForChildren(), isClean());
                this.customData_ = null;
            }
            return this.customDataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
        }

        private a2 getHbPlacementFieldBuilder() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacementBuilder_ = new a2(getHbPlacement(), getParentForChildren(), isClean());
                this.hbPlacement_ = null;
            }
            return this.hbPlacementBuilder_;
        }

        private a2 getPlacementIdFieldBuilder() {
            if (this.placementIdBuilder_ == null) {
                this.placementIdBuilder_ = new a2(getPlacementId(), getParentForChildren(), isClean());
                this.placementId_ = null;
            }
            return this.placementIdBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearAdFormat() {
            if (this.adFormatBuilder_ == null) {
                this.adFormat_ = null;
                onChanged();
                return this;
            }
            this.adFormat_ = null;
            this.adFormatBuilder_ = null;
            return this;
        }

        @Deprecated
        public Builder clearAdType() {
            this.adType_ = Placement.getDefaultInstance().getAdType();
            onChanged();
            return this;
        }

        public Builder clearCustomData() {
            if (this.customDataBuilder_ == null) {
                this.customData_ = null;
                onChanged();
                return this;
            }
            this.customData_ = null;
            this.customDataBuilder_ = null;
            return this;
        }

        public Builder clearHbPlacement() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
                onChanged();
                return this;
            }
            this.hbPlacement_ = null;
            this.hbPlacementBuilder_ = null;
            return this;
        }

        public Builder clearPlacementId() {
            if (this.placementIdBuilder_ == null) {
                this.placementId_ = null;
                onChanged();
                return this;
            }
            this.placementId_ = null;
            this.placementIdBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public AdFormat getAdFormat() {
            a2 a2Var = this.adFormatBuilder_;
            if (a2Var != null) {
                return (AdFormat) a2Var.e();
            }
            AdFormat adFormat = this.adFormat_;
            return adFormat == null ? AdFormat.getDefaultInstance() : adFormat;
        }

        public AdFormat.Builder getAdFormatBuilder() {
            onChanged();
            return (AdFormat.Builder) getAdFormatFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public AdFormatOrBuilder getAdFormatOrBuilder() {
            a2 a2Var = this.adFormatBuilder_;
            if (a2Var != null) {
                return (AdFormatOrBuilder) a2Var.f();
            }
            AdFormat adFormat = this.adFormat_;
            return adFormat == null ? AdFormat.getDefaultInstance() : adFormat;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        @Deprecated
        public String getAdType() {
            Object obj = this.adType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        @Deprecated
        public ByteString getAdTypeBytes() {
            Object obj = this.adType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public Struct getCustomData() {
            a2 a2Var = this.customDataBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.customData_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getCustomDataBuilder() {
            onChanged();
            return (Struct.Builder) getCustomDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public e2 getCustomDataOrBuilder() {
            a2 a2Var = this.customDataBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.customData_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public HeaderBiddingPlacement getHbPlacement() {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                return (HeaderBiddingPlacement) a2Var.e();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        public HeaderBiddingPlacement.Builder getHbPlacementBuilder() {
            onChanged();
            return (HeaderBiddingPlacement.Builder) getHbPlacementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                return (HeaderBiddingPlacementOrBuilder) a2Var.f();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public StringValue getPlacementId() {
            a2 a2Var = this.placementIdBuilder_;
            if (a2Var != null) {
                return (StringValue) a2Var.e();
            }
            StringValue stringValue = this.placementId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getPlacementIdBuilder() {
            onChanged();
            return (StringValue.Builder) getPlacementIdFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public d2 getPlacementIdOrBuilder() {
            a2 a2Var = this.placementIdBuilder_;
            if (a2Var != null) {
                return (d2) a2Var.f();
            }
            StringValue stringValue = this.placementId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasAdFormat() {
            return (this.adFormatBuilder_ == null && this.adFormat_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasCustomData() {
            return (this.customDataBuilder_ == null && this.customData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasHbPlacement() {
            return (this.hbPlacementBuilder_ == null && this.hbPlacement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasPlacementId() {
            return (this.placementIdBuilder_ == null && this.placementId_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_fieldAccessorTable.d(Placement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAdFormat(AdFormat adFormat) {
            a2 a2Var = this.adFormatBuilder_;
            if (a2Var != null) {
                a2Var.g(adFormat);
                return this;
            }
            AdFormat adFormat2 = this.adFormat_;
            if (adFormat2 != null) {
                this.adFormat_ = AdFormat.newBuilder(adFormat2).mergeFrom(adFormat).buildPartial();
            } else {
                this.adFormat_ = adFormat;
            }
            onChanged();
            return this;
        }

        public Builder mergeCustomData(Struct struct) {
            a2 a2Var = this.customDataBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.customData_;
            if (struct2 != null) {
                this.customData_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.customData_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                a2Var.g(headerBiddingPlacement);
                return this;
            }
            HeaderBiddingPlacement headerBiddingPlacement2 = this.hbPlacement_;
            if (headerBiddingPlacement2 != null) {
                this.hbPlacement_ = HeaderBiddingPlacement.newBuilder(headerBiddingPlacement2).mergeFrom(headerBiddingPlacement).buildPartial();
            } else {
                this.hbPlacement_ = headerBiddingPlacement;
            }
            onChanged();
            return this;
        }

        public Builder mergePlacementId(StringValue stringValue) {
            a2 a2Var = this.placementIdBuilder_;
            if (a2Var != null) {
                a2Var.g(stringValue);
                return this;
            }
            StringValue stringValue2 = this.placementId_;
            if (stringValue2 != null) {
                this.placementId_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
            } else {
                this.placementId_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder setAdFormat(AdFormat adFormat) {
            a2 a2Var = this.adFormatBuilder_;
            if (a2Var != null) {
                a2Var.i(adFormat);
                return this;
            }
            adFormat.getClass();
            this.adFormat_ = adFormat;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setAdType(String str) {
            str.getClass();
            this.adType_ = str;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setAdTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.adType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCustomData(Struct struct) {
            a2 a2Var = this.customDataBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.customData_ = struct;
            onChanged();
            return this;
        }

        public Builder setHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                a2Var.i(headerBiddingPlacement);
                return this;
            }
            headerBiddingPlacement.getClass();
            this.hbPlacement_ = headerBiddingPlacement;
            onChanged();
            return this;
        }

        public Builder setPlacementId(StringValue stringValue) {
            a2 a2Var = this.placementIdBuilder_;
            if (a2Var != null) {
                a2Var.i(stringValue);
                return this;
            }
            stringValue.getClass();
            this.placementId_ = stringValue;
            onChanged();
            return this;
        }

        private Builder() {
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement build() {
            Placement placementBuildPartial = buildPartial();
            if (placementBuildPartial.isInitialized()) {
                return placementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) placementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement buildPartial() {
            Placement placement = new Placement(this);
            placement.adType_ = this.adType_;
            a2 a2Var = this.placementIdBuilder_;
            if (a2Var == null) {
                placement.placementId_ = this.placementId_;
            } else {
                placement.placementId_ = (StringValue) a2Var.a();
            }
            a2 a2Var2 = this.customDataBuilder_;
            if (a2Var2 == null) {
                placement.customData_ = this.customData_;
            } else {
                placement.customData_ = (Struct) a2Var2.a();
            }
            a2 a2Var3 = this.hbPlacementBuilder_;
            if (a2Var3 == null) {
                placement.hbPlacement_ = this.hbPlacement_;
            } else {
                placement.hbPlacement_ = (HeaderBiddingPlacement) a2Var3.a();
            }
            a2 a2Var4 = this.adFormatBuilder_;
            if (a2Var4 == null) {
                placement.adFormat_ = this.adFormat_;
            } else {
                placement.adFormat_ = (AdFormat) a2Var4.a();
            }
            onBuilt();
            return placement;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Placement getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
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
            this.adType_ = "";
            if (this.placementIdBuilder_ == null) {
                this.placementId_ = null;
            } else {
                this.placementId_ = null;
                this.placementIdBuilder_ = null;
            }
            if (this.customDataBuilder_ == null) {
                this.customData_ = null;
            } else {
                this.customData_ = null;
                this.customDataBuilder_ = null;
            }
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
            } else {
                this.hbPlacement_ = null;
                this.hbPlacementBuilder_ = null;
            }
            if (this.adFormatBuilder_ == null) {
                this.adFormat_ = null;
                return this;
            }
            this.adFormat_ = null;
            this.adFormatBuilder_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setAdFormat(AdFormat.Builder builder) {
            a2 a2Var = this.adFormatBuilder_;
            if (a2Var == null) {
                this.adFormat_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setCustomData(Struct.Builder builder) {
            a2 a2Var = this.customDataBuilder_;
            if (a2Var == null) {
                this.customData_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setHbPlacement(HeaderBiddingPlacement.Builder builder) {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var == null) {
                this.hbPlacement_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setPlacementId(StringValue.Builder builder) {
            a2 a2Var = this.placementIdBuilder_;
            if (a2Var == null) {
                this.placementId_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getAdType().isEmpty()) {
                this.adType_ = placement.adType_;
                onChanged();
            }
            if (placement.hasPlacementId()) {
                mergePlacementId(placement.getPlacementId());
            }
            if (placement.hasCustomData()) {
                mergeCustomData(placement.getCustomData());
            }
            if (placement.hasHbPlacement()) {
                mergeHbPlacement(placement.getHbPlacement());
            }
            if (placement.hasAdFormat()) {
                mergeAdFormat(placement.getAdFormat());
            }
            mergeUnknownFields(((h0) placement).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.Placement.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Placement.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Placement r3 = (io.bidmachine.protobuf.sdk.Placement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Placement r4 = (io.bidmachine.protobuf.sdk.Placement) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Placement.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Placement$Builder");
        }
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Placement(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Placement) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Placement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Placement parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Placement() {
        this.memoizedIsInitialized = (byte) -1;
        this.adType_ = "";
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Placement parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr, wVar);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, inputStream);
    }

    private Placement(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK != 10) {
                            if (iK == 18) {
                                StringValue stringValue = this.placementId_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.placementId_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.placementId_ = builder.buildPartial();
                                }
                            } else if (iK == 26) {
                                Struct struct = this.customData_;
                                Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.customData_ = struct2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct2);
                                    this.customData_ = builder2.buildPartial();
                                }
                            } else if (iK == 34) {
                                HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
                                HeaderBiddingPlacement.Builder builder3 = headerBiddingPlacement != null ? headerBiddingPlacement.toBuilder() : null;
                                HeaderBiddingPlacement headerBiddingPlacement2 = (HeaderBiddingPlacement) lVar.A(HeaderBiddingPlacement.parser(), wVar);
                                this.hbPlacement_ = headerBiddingPlacement2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(headerBiddingPlacement2);
                                    this.hbPlacement_ = builder3.buildPartial();
                                }
                            } else if (iK != 42) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                AdFormat adFormat = this.adFormat_;
                                AdFormat.Builder builder4 = adFormat != null ? adFormat.toBuilder() : null;
                                AdFormat adFormat2 = (AdFormat) lVar.A(AdFormat.parser(), wVar);
                                this.adFormat_ = adFormat2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(adFormat2);
                                    this.adFormat_ = builder4.buildPartial();
                                }
                            }
                        } else {
                            this.adType_ = lVar.J();
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

    public static Placement parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Placement parseFrom(l lVar) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, lVar);
    }

    public static Placement parseFrom(l lVar, w wVar) throws IOException {
        return (Placement) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
