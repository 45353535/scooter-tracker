package io.bidmachine.protobuf.analytics.events;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class SDKEvent extends h0 implements SDKEventOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AD_TYPE_FIELD_NUMBER = 6;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 9;
    public static final int ERROR_FIELD_NUMBER = 8;
    public static final int FINISH_TIME_FIELD_NUMBER = 5;
    public static final int NETWORK_FIELD_NUMBER = 3;
    public static final int PRICE_FIELD_NUMBER = 7;
    public static final int START_TIME_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int action_;
    private StringValue adType_;
    private volatile Object context_;
    private Struct customParams_;
    private Error error_;
    private Timestamp finishTime_;
    private byte memoizedIsInitialized;
    private StringValue network_;
    private double price_;
    private Timestamp startTime_;
    private static final SDKEvent DEFAULT_INSTANCE = new SDKEvent();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.events.SDKEvent.1
        @Override // com.explorestack.protobuf.p1
        public SDKEvent parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new SDKEvent(lVar, wVar);
        }
    };

    public static SDKEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKEvent)) {
            return super.equals(obj);
        }
        SDKEvent sDKEvent = (SDKEvent) obj;
        if (getAction() != sDKEvent.getAction() || !getContext().equals(sDKEvent.getContext()) || hasNetwork() != sDKEvent.hasNetwork()) {
            return false;
        }
        if ((hasNetwork() && !getNetwork().equals(sDKEvent.getNetwork())) || hasStartTime() != sDKEvent.hasStartTime()) {
            return false;
        }
        if ((hasStartTime() && !getStartTime().equals(sDKEvent.getStartTime())) || hasFinishTime() != sDKEvent.hasFinishTime()) {
            return false;
        }
        if ((hasFinishTime() && !getFinishTime().equals(sDKEvent.getFinishTime())) || hasAdType() != sDKEvent.hasAdType()) {
            return false;
        }
        if ((hasAdType() && !getAdType().equals(sDKEvent.getAdType())) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(sDKEvent.getPrice()) || hasError() != sDKEvent.hasError()) {
            return false;
        }
        if ((!hasError() || getError().equals(sDKEvent.getError())) && hasCustomParams() == sDKEvent.hasCustomParams()) {
            return (!hasCustomParams() || getCustomParams().equals(sDKEvent.getCustomParams())) && this.unknownFields.equals(sDKEvent.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public int getAction() {
        return this.action_;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getAdType() {
        StringValue stringValue = this.adType_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public d2 getAdTypeOrBuilder() {
        return getAdType();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public String getContext() {
        Object obj = this.context_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.context_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ByteString getContextBytes() {
        Object obj = this.context_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.context_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Struct getCustomParams() {
        Struct struct = this.customParams_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public e2 getCustomParamsOrBuilder() {
        return getCustomParams();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Error getError() {
        Error error = this.error_;
        return error == null ? Error.getDefaultInstance() : error;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ErrorOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getFinishTime() {
        Timestamp timestamp = this.finishTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public j2 getFinishTimeOrBuilder() {
        return getFinishTime();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getNetwork() {
        StringValue stringValue = this.network_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public d2 getNetworkOrBuilder() {
        return getNetwork();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public double getPrice() {
        return this.price_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.action_;
        int iY = i11 != 0 ? n.Y(1, i11) : 0;
        if (!getContextBytes().isEmpty()) {
            iY += h0.computeStringSize(2, this.context_);
        }
        if (this.network_ != null) {
            iY += n.G(3, getNetwork());
        }
        if (this.startTime_ != null) {
            iY += n.G(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            iY += n.G(5, getFinishTime());
        }
        if (this.adType_ != null) {
            iY += n.G(6, getAdType());
        }
        double d10 = this.price_;
        if (d10 != 0.0d) {
            iY += n.j(7, d10);
        }
        if (this.error_ != null) {
            iY += n.G(8, getError());
        }
        if (this.customParams_ != null) {
            iY += n.G(9, getCustomParams());
        }
        int serializedSize = iY + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public j2 getStartTimeOrBuilder() {
        return getStartTime();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasAdType() {
        return this.adType_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasCustomParams() {
        return this.customParams_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasFinishTime() {
        return this.finishTime_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasNetwork() {
        return this.network_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAction()) * 37) + 2) * 53) + getContext().hashCode();
        if (hasNetwork()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getNetwork().hashCode();
        }
        if (hasStartTime()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getStartTime().hashCode();
        }
        if (hasFinishTime()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getFinishTime().hashCode();
        }
        if (hasAdType()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getAdType().hashCode();
        }
        int i11 = (((iHashCode * 37) + 7) * 53) + j0.i(Double.doubleToLongBits(getPrice()));
        if (hasError()) {
            i11 = (((i11 * 37) + 8) * 53) + getError().hashCode();
        }
        if (hasCustomParams()) {
            i11 = (((i11 * 37) + 9) * 53) + getCustomParams().hashCode();
        }
        int iHashCode2 = (i11 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.d(SDKEvent.class, Builder.class);
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
        return new SDKEvent();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        int i10 = this.action_;
        if (i10 != 0) {
            nVar.W0(1, i10);
        }
        if (!getContextBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.context_);
        }
        if (this.network_ != null) {
            nVar.J0(3, getNetwork());
        }
        if (this.startTime_ != null) {
            nVar.J0(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            nVar.J0(5, getFinishTime());
        }
        if (this.adType_ != null) {
            nVar.J0(6, getAdType());
        }
        double d10 = this.price_;
        if (d10 != 0.0d) {
            nVar.t0(7, d10);
        }
        if (this.error_ != null) {
            nVar.J0(8, getError());
        }
        if (this.customParams_ != null) {
            nVar.J0(9, getCustomParams());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements SDKEventOrBuilder {
        private int action_;
        private a2 adTypeBuilder_;
        private StringValue adType_;
        private Object context_;
        private a2 customParamsBuilder_;
        private Struct customParams_;
        private a2 errorBuilder_;
        private Error error_;
        private a2 finishTimeBuilder_;
        private Timestamp finishTime_;
        private a2 networkBuilder_;
        private StringValue network_;
        private double price_;
        private a2 startTimeBuilder_;
        private Timestamp startTime_;

        private a2 getAdTypeFieldBuilder() {
            if (this.adTypeBuilder_ == null) {
                this.adTypeBuilder_ = new a2(getAdType(), getParentForChildren(), isClean());
                this.adType_ = null;
            }
            return this.adTypeBuilder_;
        }

        private a2 getCustomParamsFieldBuilder() {
            if (this.customParamsBuilder_ == null) {
                this.customParamsBuilder_ = new a2(getCustomParams(), getParentForChildren(), isClean());
                this.customParams_ = null;
            }
            return this.customParamsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        private a2 getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new a2(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private a2 getFinishTimeFieldBuilder() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTimeBuilder_ = new a2(getFinishTime(), getParentForChildren(), isClean());
                this.finishTime_ = null;
            }
            return this.finishTimeBuilder_;
        }

        private a2 getNetworkFieldBuilder() {
            if (this.networkBuilder_ == null) {
                this.networkBuilder_ = new a2(getNetwork(), getParentForChildren(), isClean());
                this.network_ = null;
            }
            return this.networkBuilder_;
        }

        private a2 getStartTimeFieldBuilder() {
            if (this.startTimeBuilder_ == null) {
                this.startTimeBuilder_ = new a2(getStartTime(), getParentForChildren(), isClean());
                this.startTime_ = null;
            }
            return this.startTimeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearAction() {
            this.action_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdType() {
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
                onChanged();
                return this;
            }
            this.adType_ = null;
            this.adTypeBuilder_ = null;
            return this;
        }

        public Builder clearContext() {
            this.context_ = SDKEvent.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
                onChanged();
                return this;
            }
            this.customParams_ = null;
            this.customParamsBuilder_ = null;
            return this;
        }

        public Builder clearError() {
            if (this.errorBuilder_ == null) {
                this.error_ = null;
                onChanged();
                return this;
            }
            this.error_ = null;
            this.errorBuilder_ = null;
            return this;
        }

        public Builder clearFinishTime() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
                onChanged();
                return this;
            }
            this.finishTime_ = null;
            this.finishTimeBuilder_ = null;
            return this;
        }

        public Builder clearNetwork() {
            if (this.networkBuilder_ == null) {
                this.network_ = null;
                onChanged();
                return this;
            }
            this.network_ = null;
            this.networkBuilder_ = null;
            return this;
        }

        public Builder clearPrice() {
            this.price_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearStartTime() {
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
                onChanged();
                return this;
            }
            this.startTime_ = null;
            this.startTimeBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public int getAction() {
            return this.action_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getAdType() {
            a2 a2Var = this.adTypeBuilder_;
            if (a2Var != null) {
                return (StringValue) a2Var.e();
            }
            StringValue stringValue = this.adType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getAdTypeBuilder() {
            onChanged();
            return (StringValue.Builder) getAdTypeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public d2 getAdTypeOrBuilder() {
            a2 a2Var = this.adTypeBuilder_;
            if (a2Var != null) {
                return (d2) a2Var.f();
            }
            StringValue stringValue = this.adType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Struct getCustomParams() {
            a2 a2Var = this.customParamsBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.customParams_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getCustomParamsBuilder() {
            onChanged();
            return (Struct.Builder) getCustomParamsFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public e2 getCustomParamsOrBuilder() {
            a2 a2Var = this.customParamsBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.customParams_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Error getError() {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                return (Error) a2Var.e();
            }
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        public Error.Builder getErrorBuilder() {
            onChanged();
            return (Error.Builder) getErrorFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                return (ErrorOrBuilder) a2Var.f();
            }
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getFinishTime() {
            a2 a2Var = this.finishTimeBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.finishTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getFinishTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFinishTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public j2 getFinishTimeOrBuilder() {
            a2 a2Var = this.finishTimeBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.finishTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getNetwork() {
            a2 a2Var = this.networkBuilder_;
            if (a2Var != null) {
                return (StringValue) a2Var.e();
            }
            StringValue stringValue = this.network_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getNetworkBuilder() {
            onChanged();
            return (StringValue.Builder) getNetworkFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public d2 getNetworkOrBuilder() {
            a2 a2Var = this.networkBuilder_;
            if (a2Var != null) {
                return (d2) a2Var.f();
            }
            StringValue stringValue = this.network_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public double getPrice() {
            return this.price_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getStartTime() {
            a2 a2Var = this.startTimeBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getStartTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getStartTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public j2 getStartTimeOrBuilder() {
            a2 a2Var = this.startTimeBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasAdType() {
            return (this.adTypeBuilder_ == null && this.adType_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasCustomParams() {
            return (this.customParamsBuilder_ == null && this.customParams_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasFinishTime() {
            return (this.finishTimeBuilder_ == null && this.finishTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasNetwork() {
            return (this.networkBuilder_ == null && this.network_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasStartTime() {
            return (this.startTimeBuilder_ == null && this.startTime_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.d(SDKEvent.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAdType(StringValue stringValue) {
            a2 a2Var = this.adTypeBuilder_;
            if (a2Var != null) {
                a2Var.g(stringValue);
                return this;
            }
            StringValue stringValue2 = this.adType_;
            if (stringValue2 != null) {
                this.adType_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
            } else {
                this.adType_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder mergeCustomParams(Struct struct) {
            a2 a2Var = this.customParamsBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.customParams_;
            if (struct2 != null) {
                this.customParams_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.customParams_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeError(Error error) {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                a2Var.g(error);
                return this;
            }
            Error error2 = this.error_;
            if (error2 != null) {
                this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
            } else {
                this.error_ = error;
            }
            onChanged();
            return this;
        }

        public Builder mergeFinishTime(Timestamp timestamp) {
            a2 a2Var = this.finishTimeBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.finishTime_;
            if (timestamp2 != null) {
                this.finishTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.finishTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeNetwork(StringValue stringValue) {
            a2 a2Var = this.networkBuilder_;
            if (a2Var != null) {
                a2Var.g(stringValue);
                return this;
            }
            StringValue stringValue2 = this.network_;
            if (stringValue2 != null) {
                this.network_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
            } else {
                this.network_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder mergeStartTime(Timestamp timestamp) {
            a2 a2Var = this.startTimeBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.startTime_;
            if (timestamp2 != null) {
                this.startTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.startTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder setAction(int i10) {
            this.action_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdType(StringValue stringValue) {
            a2 a2Var = this.adTypeBuilder_;
            if (a2Var != null) {
                a2Var.i(stringValue);
                return this;
            }
            stringValue.getClass();
            this.adType_ = stringValue;
            onChanged();
            return this;
        }

        public Builder setContext(String str) {
            str.getClass();
            this.context_ = str;
            onChanged();
            return this;
        }

        public Builder setContextBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.context_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCustomParams(Struct struct) {
            a2 a2Var = this.customParamsBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.customParams_ = struct;
            onChanged();
            return this;
        }

        public Builder setError(Error error) {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                a2Var.i(error);
                return this;
            }
            error.getClass();
            this.error_ = error;
            onChanged();
            return this;
        }

        public Builder setFinishTime(Timestamp timestamp) {
            a2 a2Var = this.finishTimeBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.finishTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setNetwork(StringValue stringValue) {
            a2 a2Var = this.networkBuilder_;
            if (a2Var != null) {
                a2Var.i(stringValue);
                return this;
            }
            stringValue.getClass();
            this.network_ = stringValue;
            onChanged();
            return this;
        }

        public Builder setPrice(double d10) {
            this.price_ = d10;
            onChanged();
            return this;
        }

        public Builder setStartTime(Timestamp timestamp) {
            a2 a2Var = this.startTimeBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.startTime_ = timestamp;
            onChanged();
            return this;
        }

        private Builder() {
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent build() {
            SDKEvent sDKEventBuildPartial = buildPartial();
            if (sDKEventBuildPartial.isInitialized()) {
                return sDKEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDKEventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent buildPartial() {
            SDKEvent sDKEvent = new SDKEvent(this);
            sDKEvent.action_ = this.action_;
            sDKEvent.context_ = this.context_;
            a2 a2Var = this.networkBuilder_;
            if (a2Var == null) {
                sDKEvent.network_ = this.network_;
            } else {
                sDKEvent.network_ = (StringValue) a2Var.a();
            }
            a2 a2Var2 = this.startTimeBuilder_;
            if (a2Var2 == null) {
                sDKEvent.startTime_ = this.startTime_;
            } else {
                sDKEvent.startTime_ = (Timestamp) a2Var2.a();
            }
            a2 a2Var3 = this.finishTimeBuilder_;
            if (a2Var3 == null) {
                sDKEvent.finishTime_ = this.finishTime_;
            } else {
                sDKEvent.finishTime_ = (Timestamp) a2Var3.a();
            }
            a2 a2Var4 = this.adTypeBuilder_;
            if (a2Var4 == null) {
                sDKEvent.adType_ = this.adType_;
            } else {
                sDKEvent.adType_ = (StringValue) a2Var4.a();
            }
            sDKEvent.price_ = this.price_;
            a2 a2Var5 = this.errorBuilder_;
            if (a2Var5 == null) {
                sDKEvent.error_ = this.error_;
            } else {
                sDKEvent.error_ = (Error) a2Var5.a();
            }
            a2 a2Var6 = this.customParamsBuilder_;
            if (a2Var6 == null) {
                sDKEvent.customParams_ = this.customParams_;
            } else {
                sDKEvent.customParams_ = (Struct) a2Var6.a();
            }
            onBuilt();
            return sDKEvent;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public SDKEvent getDefaultInstanceForType() {
            return SDKEvent.getDefaultInstance();
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
            this.action_ = 0;
            this.context_ = "";
            if (this.networkBuilder_ == null) {
                this.network_ = null;
            } else {
                this.network_ = null;
                this.networkBuilder_ = null;
            }
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
            } else {
                this.finishTime_ = null;
                this.finishTimeBuilder_ = null;
            }
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
            } else {
                this.adType_ = null;
                this.adTypeBuilder_ = null;
            }
            this.price_ = 0.0d;
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
                return this;
            }
            this.customParams_ = null;
            this.customParamsBuilder_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setAdType(StringValue.Builder builder) {
            a2 a2Var = this.adTypeBuilder_;
            if (a2Var == null) {
                this.adType_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setCustomParams(Struct.Builder builder) {
            a2 a2Var = this.customParamsBuilder_;
            if (a2Var == null) {
                this.customParams_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setError(Error.Builder builder) {
            a2 a2Var = this.errorBuilder_;
            if (a2Var == null) {
                this.error_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setFinishTime(Timestamp.Builder builder) {
            a2 a2Var = this.finishTimeBuilder_;
            if (a2Var == null) {
                this.finishTime_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setNetwork(StringValue.Builder builder) {
            a2 a2Var = this.networkBuilder_;
            if (a2Var == null) {
                this.network_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setStartTime(Timestamp.Builder builder) {
            a2 a2Var = this.startTimeBuilder_;
            if (a2Var == null) {
                this.startTime_ = builder.build();
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
            if (message instanceof SDKEvent) {
                return mergeFrom((SDKEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SDKEvent sDKEvent) {
            if (sDKEvent == SDKEvent.getDefaultInstance()) {
                return this;
            }
            if (sDKEvent.getAction() != 0) {
                setAction(sDKEvent.getAction());
            }
            if (!sDKEvent.getContext().isEmpty()) {
                this.context_ = sDKEvent.context_;
                onChanged();
            }
            if (sDKEvent.hasNetwork()) {
                mergeNetwork(sDKEvent.getNetwork());
            }
            if (sDKEvent.hasStartTime()) {
                mergeStartTime(sDKEvent.getStartTime());
            }
            if (sDKEvent.hasFinishTime()) {
                mergeFinishTime(sDKEvent.getFinishTime());
            }
            if (sDKEvent.hasAdType()) {
                mergeAdType(sDKEvent.getAdType());
            }
            if (sDKEvent.getPrice() != 0.0d) {
                setPrice(sDKEvent.getPrice());
            }
            if (sDKEvent.hasError()) {
                mergeError(sDKEvent.getError());
            }
            if (sDKEvent.hasCustomParams()) {
                mergeCustomParams(sDKEvent.getCustomParams());
            }
            mergeUnknownFields(((h0) sDKEvent).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.analytics.events.SDKEvent.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.events.SDKEvent.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.events.SDKEvent r3 = (io.bidmachine.protobuf.analytics.events.SDKEvent) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.events.SDKEvent r4 = (io.bidmachine.protobuf.analytics.events.SDKEvent) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.events.SDKEvent.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.events.SDKEvent$Builder");
        }
    }

    public static Builder newBuilder(SDKEvent sDKEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKEvent);
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteBuffer, wVar);
    }

    private SDKEvent(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (SDKEvent) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static SDKEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SDKEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDKEvent parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDKEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.context_ = "";
    }

    public static SDKEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static SDKEvent parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (SDKEvent) PARSER.parseFrom(bArr, wVar);
    }

    public static SDKEvent parseFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) h0.parseWithIOException(PARSER, inputStream);
    }

    private SDKEvent(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.action_ = lVar.L();
                        } else if (iK != 18) {
                            if (iK == 26) {
                                StringValue stringValue = this.network_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.network_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.network_ = builder.buildPartial();
                                }
                            } else if (iK == 34) {
                                Timestamp timestamp = this.startTime_;
                                Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                                this.startTime_ = timestamp2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(timestamp2);
                                    this.startTime_ = builder2.buildPartial();
                                }
                            } else if (iK == 42) {
                                Timestamp timestamp3 = this.finishTime_;
                                Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                                Timestamp timestamp4 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                                this.finishTime_ = timestamp4;
                                if (builder3 != null) {
                                    builder3.mergeFrom(timestamp4);
                                    this.finishTime_ = builder3.buildPartial();
                                }
                            } else if (iK == 50) {
                                StringValue stringValue3 = this.adType_;
                                StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.adType_ = stringValue4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(stringValue4);
                                    this.adType_ = builder4.buildPartial();
                                }
                            } else if (iK == 57) {
                                this.price_ = lVar.s();
                            } else if (iK == 66) {
                                Error error = this.error_;
                                Error.Builder builder5 = error != null ? error.toBuilder() : null;
                                Error error2 = (Error) lVar.A(Error.parser(), wVar);
                                this.error_ = error2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(error2);
                                    this.error_ = builder5.buildPartial();
                                }
                            } else if (iK != 74) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                Struct struct = this.customParams_;
                                Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.customParams_ = struct2;
                                if (builder6 != null) {
                                    builder6.mergeFrom(struct2);
                                    this.customParams_ = builder6.buildPartial();
                                }
                            }
                        } else {
                            this.context_ = lVar.J();
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

    public static SDKEvent parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (SDKEvent) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static SDKEvent parseFrom(l lVar) throws IOException {
        return (SDKEvent) h0.parseWithIOException(PARSER, lVar);
    }

    public static SDKEvent parseFrom(l lVar, w wVar) throws IOException {
        return (SDKEvent) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
