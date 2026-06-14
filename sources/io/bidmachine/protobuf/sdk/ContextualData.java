package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ContextualData extends h0 implements ContextualDataOrBuilder {
    public static final int DATA_FIELD_NUMBER = 3;
    public static final int MEDIATOR_NAME_FIELD_NUMBER = 2;
    public static final int PLACEMENT_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private ImpressionData data_;
    private volatile Object mediatorName_;
    private byte memoizedIsInitialized;
    private volatile Object placement_;
    private static final ContextualData DEFAULT_INSTANCE = new ContextualData();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.ContextualData.1
        @Override // com.explorestack.protobuf.p1
        public ContextualData parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new ContextualData(lVar, wVar);
        }
    };

    public static final class ImpressionData extends h0 implements ImpressionDataOrBuilder {
        public static final int AGENCY_FIELD_NUMBER = 8;
        public static final int BUNDLE_FIELD_NUMBER = 6;
        public static final int CLCURL_FIELD_NUMBER = 10;
        public static final int IMAGENCY_FIELD_NUMBER = 7;
        public static final int IMBUNDLE_FIELD_NUMBER = 5;
        public static final int IMCURL_FIELD_NUMBER = 9;
        public static final int IMD_FIELD_NUMBER = 2;
        public static final int IMIMD_FIELD_NUMBER = 1;
        public static final int IMWP_FIELD_NUMBER = 3;
        public static final int WP_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object agency_;
        private volatile Object bundle_;
        private volatile Object clcurl_;
        private volatile Object imagency_;
        private volatile Object imbundle_;
        private volatile Object imcurl_;
        private int imd_;
        private int imimd_;
        private float imwp_;
        private byte memoizedIsInitialized;
        private float wp_;
        private static final ImpressionData DEFAULT_INSTANCE = new ImpressionData();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.1
            @Override // com.explorestack.protobuf.p1
            public ImpressionData parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new ImpressionData(lVar, wVar);
            }
        };

        public static ImpressionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ImpressionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImpressionData) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ImpressionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ImpressionData)) {
                return super.equals(obj);
            }
            ImpressionData impressionData = (ImpressionData) obj;
            return getImimd() == impressionData.getImimd() && getImd() == impressionData.getImd() && Float.floatToIntBits(getImwp()) == Float.floatToIntBits(impressionData.getImwp()) && Float.floatToIntBits(getWp()) == Float.floatToIntBits(impressionData.getWp()) && getImbundle().equals(impressionData.getImbundle()) && getBundle().equals(impressionData.getBundle()) && getImagency().equals(impressionData.getImagency()) && getAgency().equals(impressionData.getAgency()) && getImcurl().equals(impressionData.getImcurl()) && getClcurl().equals(impressionData.getClcurl()) && this.unknownFields.equals(impressionData.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getAgency() {
            Object obj = this.agency_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.agency_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getAgencyBytes() {
            Object obj = this.agency_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.agency_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getClcurl() {
            Object obj = this.clcurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.clcurl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getClcurlBytes() {
            Object obj = this.clcurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clcurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getImagency() {
            Object obj = this.imagency_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imagency_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getImagencyBytes() {
            Object obj = this.imagency_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imagency_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getImbundle() {
            Object obj = this.imbundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imbundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getImbundleBytes() {
            Object obj = this.imbundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imbundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public String getImcurl() {
            Object obj = this.imcurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imcurl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public ByteString getImcurlBytes() {
            Object obj = this.imcurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imcurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public int getImd() {
            return this.imd_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public int getImimd() {
            return this.imimd_;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public float getImwp() {
            return this.imwp_;
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
            int i11 = this.imimd_;
            int iY = i11 != 0 ? n.Y(1, i11) : 0;
            int i12 = this.imd_;
            if (i12 != 0) {
                iY += n.Y(2, i12);
            }
            float f10 = this.imwp_;
            if (f10 != 0.0f) {
                iY += n.r(3, f10);
            }
            float f11 = this.wp_;
            if (f11 != 0.0f) {
                iY += n.r(4, f11);
            }
            if (!getImbundleBytes().isEmpty()) {
                iY += h0.computeStringSize(5, this.imbundle_);
            }
            if (!getBundleBytes().isEmpty()) {
                iY += h0.computeStringSize(6, this.bundle_);
            }
            if (!getImagencyBytes().isEmpty()) {
                iY += h0.computeStringSize(7, this.imagency_);
            }
            if (!getAgencyBytes().isEmpty()) {
                iY += h0.computeStringSize(8, this.agency_);
            }
            if (!getImcurlBytes().isEmpty()) {
                iY += h0.computeStringSize(9, this.imcurl_);
            }
            if (!getClcurlBytes().isEmpty()) {
                iY += h0.computeStringSize(10, this.clcurl_);
            }
            int serializedSize = iY + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
        public float getWp() {
            return this.wp_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImimd()) * 37) + 2) * 53) + getImd()) * 37) + 3) * 53) + Float.floatToIntBits(getImwp())) * 37) + 4) * 53) + Float.floatToIntBits(getWp())) * 37) + 5) * 53) + getImbundle().hashCode()) * 37) + 6) * 53) + getBundle().hashCode()) * 37) + 7) * 53) + getImagency().hashCode()) * 37) + 8) * 53) + getAgency().hashCode()) * 37) + 9) * 53) + getImcurl().hashCode()) * 37) + 10) * 53) + getClcurl().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_fieldAccessorTable.d(ImpressionData.class, Builder.class);
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
            return new ImpressionData();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            int i10 = this.imimd_;
            if (i10 != 0) {
                nVar.W0(1, i10);
            }
            int i11 = this.imd_;
            if (i11 != 0) {
                nVar.W0(2, i11);
            }
            float f10 = this.imwp_;
            if (f10 != 0.0f) {
                nVar.B0(3, f10);
            }
            float f11 = this.wp_;
            if (f11 != 0.0f) {
                nVar.B0(4, f11);
            }
            if (!getImbundleBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.imbundle_);
            }
            if (!getBundleBytes().isEmpty()) {
                h0.writeString(nVar, 6, this.bundle_);
            }
            if (!getImagencyBytes().isEmpty()) {
                h0.writeString(nVar, 7, this.imagency_);
            }
            if (!getAgencyBytes().isEmpty()) {
                h0.writeString(nVar, 8, this.agency_);
            }
            if (!getImcurlBytes().isEmpty()) {
                h0.writeString(nVar, 9, this.imcurl_);
            }
            if (!getClcurlBytes().isEmpty()) {
                h0.writeString(nVar, 10, this.clcurl_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ImpressionDataOrBuilder {
            private Object agency_;
            private Object bundle_;
            private Object clcurl_;
            private Object imagency_;
            private Object imbundle_;
            private Object imcurl_;
            private int imd_;
            private int imimd_;
            private float imwp_;
            private float wp_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearAgency() {
                this.agency_ = ImpressionData.getDefaultInstance().getAgency();
                onChanged();
                return this;
            }

            public Builder clearBundle() {
                this.bundle_ = ImpressionData.getDefaultInstance().getBundle();
                onChanged();
                return this;
            }

            public Builder clearClcurl() {
                this.clcurl_ = ImpressionData.getDefaultInstance().getClcurl();
                onChanged();
                return this;
            }

            public Builder clearImagency() {
                this.imagency_ = ImpressionData.getDefaultInstance().getImagency();
                onChanged();
                return this;
            }

            public Builder clearImbundle() {
                this.imbundle_ = ImpressionData.getDefaultInstance().getImbundle();
                onChanged();
                return this;
            }

            public Builder clearImcurl() {
                this.imcurl_ = ImpressionData.getDefaultInstance().getImcurl();
                onChanged();
                return this;
            }

            public Builder clearImd() {
                this.imd_ = 0;
                onChanged();
                return this;
            }

            public Builder clearImimd() {
                this.imimd_ = 0;
                onChanged();
                return this;
            }

            public Builder clearImwp() {
                this.imwp_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWp() {
                this.wp_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getAgency() {
                Object obj = this.agency_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.agency_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getAgencyBytes() {
                Object obj = this.agency_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.agency_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getBundle() {
                Object obj = this.bundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getBundleBytes() {
                Object obj = this.bundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getClcurl() {
                Object obj = this.clcurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.clcurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getClcurlBytes() {
                Object obj = this.clcurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.clcurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getImagency() {
                Object obj = this.imagency_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.imagency_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getImagencyBytes() {
                Object obj = this.imagency_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imagency_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getImbundle() {
                Object obj = this.imbundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.imbundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getImbundleBytes() {
                Object obj = this.imbundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imbundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public String getImcurl() {
                Object obj = this.imcurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.imcurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public ByteString getImcurlBytes() {
                Object obj = this.imcurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imcurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public int getImd() {
                return this.imd_;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public int getImimd() {
                return this.imimd_;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public float getImwp() {
                return this.imwp_;
            }

            @Override // io.bidmachine.protobuf.sdk.ContextualData.ImpressionDataOrBuilder
            public float getWp() {
                return this.wp_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_fieldAccessorTable.d(ImpressionData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAgency(String str) {
                str.getClass();
                this.agency_ = str;
                onChanged();
                return this;
            }

            public Builder setAgencyBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.agency_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBundle(String str) {
                str.getClass();
                this.bundle_ = str;
                onChanged();
                return this;
            }

            public Builder setBundleBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.bundle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setClcurl(String str) {
                str.getClass();
                this.clcurl_ = str;
                onChanged();
                return this;
            }

            public Builder setClcurlBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.clcurl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImagency(String str) {
                str.getClass();
                this.imagency_ = str;
                onChanged();
                return this;
            }

            public Builder setImagencyBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.imagency_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImbundle(String str) {
                str.getClass();
                this.imbundle_ = str;
                onChanged();
                return this;
            }

            public Builder setImbundleBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.imbundle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImcurl(String str) {
                str.getClass();
                this.imcurl_ = str;
                onChanged();
                return this;
            }

            public Builder setImcurlBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.imcurl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImd(int i10) {
                this.imd_ = i10;
                onChanged();
                return this;
            }

            public Builder setImimd(int i10) {
                this.imimd_ = i10;
                onChanged();
                return this;
            }

            public Builder setImwp(float f10) {
                this.imwp_ = f10;
                onChanged();
                return this;
            }

            public Builder setWp(float f10) {
                this.wp_ = f10;
                onChanged();
                return this;
            }

            private Builder() {
                this.imbundle_ = "";
                this.bundle_ = "";
                this.imagency_ = "";
                this.agency_ = "";
                this.imcurl_ = "";
                this.clcurl_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionData build() {
                ImpressionData impressionDataBuildPartial = buildPartial();
                if (impressionDataBuildPartial.isInitialized()) {
                    return impressionDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) impressionDataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionData buildPartial() {
                ImpressionData impressionData = new ImpressionData(this);
                impressionData.imimd_ = this.imimd_;
                impressionData.imd_ = this.imd_;
                impressionData.imwp_ = this.imwp_;
                impressionData.wp_ = this.wp_;
                impressionData.imbundle_ = this.imbundle_;
                impressionData.bundle_ = this.bundle_;
                impressionData.imagency_ = this.imagency_;
                impressionData.agency_ = this.agency_;
                impressionData.imcurl_ = this.imcurl_;
                impressionData.clcurl_ = this.clcurl_;
                onBuilt();
                return impressionData;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public ImpressionData getDefaultInstanceForType() {
                return ImpressionData.getDefaultInstance();
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
                this.imimd_ = 0;
                this.imd_ = 0;
                this.imwp_ = 0.0f;
                this.wp_ = 0.0f;
                this.imbundle_ = "";
                this.bundle_ = "";
                this.imagency_ = "";
                this.agency_ = "";
                this.imcurl_ = "";
                this.clcurl_ = "";
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ImpressionData) {
                    return mergeFrom((ImpressionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ImpressionData impressionData) {
                if (impressionData == ImpressionData.getDefaultInstance()) {
                    return this;
                }
                if (impressionData.getImimd() != 0) {
                    setImimd(impressionData.getImimd());
                }
                if (impressionData.getImd() != 0) {
                    setImd(impressionData.getImd());
                }
                if (impressionData.getImwp() != 0.0f) {
                    setImwp(impressionData.getImwp());
                }
                if (impressionData.getWp() != 0.0f) {
                    setWp(impressionData.getWp());
                }
                if (!impressionData.getImbundle().isEmpty()) {
                    this.imbundle_ = impressionData.imbundle_;
                    onChanged();
                }
                if (!impressionData.getBundle().isEmpty()) {
                    this.bundle_ = impressionData.bundle_;
                    onChanged();
                }
                if (!impressionData.getImagency().isEmpty()) {
                    this.imagency_ = impressionData.imagency_;
                    onChanged();
                }
                if (!impressionData.getAgency().isEmpty()) {
                    this.agency_ = impressionData.agency_;
                    onChanged();
                }
                if (!impressionData.getImcurl().isEmpty()) {
                    this.imcurl_ = impressionData.imcurl_;
                    onChanged();
                }
                if (!impressionData.getClcurl().isEmpty()) {
                    this.clcurl_ = impressionData.clcurl_;
                    onChanged();
                }
                mergeUnknownFields(((h0) impressionData).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.imbundle_ = "";
                this.bundle_ = "";
                this.imagency_ = "";
                this.agency_ = "";
                this.imcurl_ = "";
                this.clcurl_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.access$1500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.ContextualData$ImpressionData r3 = (io.bidmachine.protobuf.sdk.ContextualData.ImpressionData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.ContextualData$ImpressionData r4 = (io.bidmachine.protobuf.sdk.ContextualData.ImpressionData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.ContextualData.ImpressionData.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.ContextualData$ImpressionData$Builder");
            }
        }

        public static Builder newBuilder(ImpressionData impressionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(impressionData);
        }

        public static ImpressionData parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteBuffer, wVar);
        }

        private ImpressionData(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ImpressionData parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (ImpressionData) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static ImpressionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ImpressionData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ImpressionData parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ImpressionData() {
            this.memoizedIsInitialized = (byte) -1;
            this.imbundle_ = "";
            this.bundle_ = "";
            this.imagency_ = "";
            this.agency_ = "";
            this.imcurl_ = "";
            this.clcurl_ = "";
        }

        public static ImpressionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static ImpressionData parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (ImpressionData) PARSER.parseFrom(bArr, wVar);
        }

        public static ImpressionData parseFrom(InputStream inputStream) throws IOException {
            return (ImpressionData) h0.parseWithIOException(PARSER, inputStream);
        }

        public static ImpressionData parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (ImpressionData) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static ImpressionData parseFrom(l lVar) throws IOException {
            return (ImpressionData) h0.parseWithIOException(PARSER, lVar);
        }

        private ImpressionData(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            case 8:
                                this.imimd_ = lVar.L();
                                break;
                            case 16:
                                this.imd_ = lVar.L();
                                break;
                            case 29:
                                this.imwp_ = lVar.w();
                                break;
                            case 37:
                                this.wp_ = lVar.w();
                                break;
                            case 42:
                                this.imbundle_ = lVar.J();
                                break;
                            case 50:
                                this.bundle_ = lVar.J();
                                break;
                            case 58:
                                this.imagency_ = lVar.J();
                                break;
                            case 66:
                                this.agency_ = lVar.J();
                                break;
                            case 74:
                                this.imcurl_ = lVar.J();
                                break;
                            case 82:
                                this.clcurl_ = lVar.J();
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

        public static ImpressionData parseFrom(l lVar, w wVar) throws IOException {
            return (ImpressionData) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ImpressionDataOrBuilder extends MessageOrBuilder {
        String getAgency();

        ByteString getAgencyBytes();

        String getBundle();

        ByteString getBundleBytes();

        String getClcurl();

        ByteString getClcurlBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getImagency();

        ByteString getImagencyBytes();

        String getImbundle();

        ByteString getImbundleBytes();

        String getImcurl();

        ByteString getImcurlBytes();

        int getImd();

        int getImimd();

        float getImwp();

        float getWp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static ContextualData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ContextualData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextualData) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ContextualData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextualData)) {
            return super.equals(obj);
        }
        ContextualData contextualData = (ContextualData) obj;
        if (getPlacement().equals(contextualData.getPlacement()) && getMediatorName().equals(contextualData.getMediatorName()) && hasData() == contextualData.hasData()) {
            return (!hasData() || getData().equals(contextualData.getData())) && this.unknownFields.equals(contextualData.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ImpressionData getData() {
        ImpressionData impressionData = this.data_;
        return impressionData == null ? ImpressionData.getDefaultInstance() : impressionData;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ImpressionDataOrBuilder getDataOrBuilder() {
        return getData();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public String getMediatorName() {
        Object obj = this.mediatorName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.mediatorName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ByteString getMediatorNameBytes() {
        Object obj = this.mediatorName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.mediatorName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public String getPlacement() {
        Object obj = this.placement_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.placement_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public ByteString getPlacementBytes() {
        Object obj = this.placement_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.placement_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getPlacementBytes().isEmpty() ? h0.computeStringSize(1, this.placement_) : 0;
        if (!getMediatorNameBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.mediatorName_);
        }
        if (this.data_ != null) {
            iComputeStringSize += n.G(3, getData());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
    public boolean hasData() {
        return this.data_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPlacement().hashCode()) * 37) + 2) * 53) + getMediatorName().hashCode();
        if (hasData()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getData().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_fieldAccessorTable.d(ContextualData.class, Builder.class);
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
        return new ContextualData();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getPlacementBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.placement_);
        }
        if (!getMediatorNameBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.mediatorName_);
        }
        if (this.data_ != null) {
            nVar.J0(3, getData());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements ContextualDataOrBuilder {
        private a2 dataBuilder_;
        private ImpressionData data_;
        private Object mediatorName_;
        private Object placement_;

        private a2 getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
                this.dataBuilder_ = new a2(getData(), getParentForChildren(), isClean());
                this.data_ = null;
            }
            return this.dataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearData() {
            if (this.dataBuilder_ == null) {
                this.data_ = null;
                onChanged();
                return this;
            }
            this.data_ = null;
            this.dataBuilder_ = null;
            return this;
        }

        public Builder clearMediatorName() {
            this.mediatorName_ = ContextualData.getDefaultInstance().getMediatorName();
            onChanged();
            return this;
        }

        public Builder clearPlacement() {
            this.placement_ = ContextualData.getDefaultInstance().getPlacement();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ImpressionData getData() {
            a2 a2Var = this.dataBuilder_;
            if (a2Var != null) {
                return (ImpressionData) a2Var.e();
            }
            ImpressionData impressionData = this.data_;
            return impressionData == null ? ImpressionData.getDefaultInstance() : impressionData;
        }

        public ImpressionData.Builder getDataBuilder() {
            onChanged();
            return (ImpressionData.Builder) getDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ImpressionDataOrBuilder getDataOrBuilder() {
            a2 a2Var = this.dataBuilder_;
            if (a2Var != null) {
                return (ImpressionDataOrBuilder) a2Var.f();
            }
            ImpressionData impressionData = this.data_;
            return impressionData == null ? ImpressionData.getDefaultInstance() : impressionData;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public String getMediatorName() {
            Object obj = this.mediatorName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mediatorName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ByteString getMediatorNameBytes() {
            Object obj = this.mediatorName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mediatorName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public String getPlacement() {
            Object obj = this.placement_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.placement_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public ByteString getPlacementBytes() {
            Object obj = this.placement_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.placement_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextualDataOrBuilder
        public boolean hasData() {
            return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_ContextualData_fieldAccessorTable.d(ContextualData.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeData(ImpressionData impressionData) {
            a2 a2Var = this.dataBuilder_;
            if (a2Var != null) {
                a2Var.g(impressionData);
                return this;
            }
            ImpressionData impressionData2 = this.data_;
            if (impressionData2 != null) {
                this.data_ = ImpressionData.newBuilder(impressionData2).mergeFrom(impressionData).buildPartial();
            } else {
                this.data_ = impressionData;
            }
            onChanged();
            return this;
        }

        public Builder setData(ImpressionData impressionData) {
            a2 a2Var = this.dataBuilder_;
            if (a2Var != null) {
                a2Var.i(impressionData);
                return this;
            }
            impressionData.getClass();
            this.data_ = impressionData;
            onChanged();
            return this;
        }

        public Builder setMediatorName(String str) {
            str.getClass();
            this.mediatorName_ = str;
            onChanged();
            return this;
        }

        public Builder setMediatorNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.mediatorName_ = byteString;
            onChanged();
            return this;
        }

        public Builder setPlacement(String str) {
            str.getClass();
            this.placement_ = str;
            onChanged();
            return this;
        }

        public Builder setPlacementBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.placement_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.placement_ = "";
            this.mediatorName_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ContextualData build() {
            ContextualData contextualDataBuildPartial = buildPartial();
            if (contextualDataBuildPartial.isInitialized()) {
                return contextualDataBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextualDataBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ContextualData buildPartial() {
            ContextualData contextualData = new ContextualData(this);
            contextualData.placement_ = this.placement_;
            contextualData.mediatorName_ = this.mediatorName_;
            a2 a2Var = this.dataBuilder_;
            if (a2Var == null) {
                contextualData.data_ = this.data_;
            } else {
                contextualData.data_ = (ImpressionData) a2Var.a();
            }
            onBuilt();
            return contextualData;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public ContextualData getDefaultInstanceForType() {
            return ContextualData.getDefaultInstance();
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
            this.placement_ = "";
            this.mediatorName_ = "";
            if (this.dataBuilder_ == null) {
                this.data_ = null;
                return this;
            }
            this.data_ = null;
            this.dataBuilder_ = null;
            return this;
        }

        public Builder setData(ImpressionData.Builder builder) {
            a2 a2Var = this.dataBuilder_;
            if (a2Var == null) {
                this.data_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.placement_ = "";
            this.mediatorName_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ContextualData) {
                return mergeFrom((ContextualData) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ContextualData contextualData) {
            if (contextualData == ContextualData.getDefaultInstance()) {
                return this;
            }
            if (!contextualData.getPlacement().isEmpty()) {
                this.placement_ = contextualData.placement_;
                onChanged();
            }
            if (!contextualData.getMediatorName().isEmpty()) {
                this.mediatorName_ = contextualData.mediatorName_;
                onChanged();
            }
            if (contextualData.hasData()) {
                mergeData(contextualData.getData());
            }
            mergeUnknownFields(((h0) contextualData).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.ContextualData.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.ContextualData.access$3100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.ContextualData r3 = (io.bidmachine.protobuf.sdk.ContextualData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.ContextualData r4 = (io.bidmachine.protobuf.sdk.ContextualData) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.ContextualData.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.ContextualData$Builder");
        }
    }

    public static Builder newBuilder(ContextualData contextualData) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(contextualData);
    }

    public static ContextualData parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteBuffer, wVar);
    }

    private ContextualData(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ContextualData parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (ContextualData) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static ContextualData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public ContextualData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ContextualData parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ContextualData() {
        this.memoizedIsInitialized = (byte) -1;
        this.placement_ = "";
        this.mediatorName_ = "";
    }

    public static ContextualData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static ContextualData parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (ContextualData) PARSER.parseFrom(bArr, wVar);
    }

    public static ContextualData parseFrom(InputStream inputStream) throws IOException {
        return (ContextualData) h0.parseWithIOException(PARSER, inputStream);
    }

    private ContextualData(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.placement_ = lVar.J();
                        } else if (iK == 18) {
                            this.mediatorName_ = lVar.J();
                        } else if (iK != 26) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            ImpressionData impressionData = this.data_;
                            ImpressionData.Builder builder = impressionData != null ? impressionData.toBuilder() : null;
                            ImpressionData impressionData2 = (ImpressionData) lVar.A(ImpressionData.parser(), wVar);
                            this.data_ = impressionData2;
                            if (builder != null) {
                                builder.mergeFrom(impressionData2);
                                this.data_ = builder.buildPartial();
                            }
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

    public static ContextualData parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (ContextualData) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static ContextualData parseFrom(l lVar) throws IOException {
        return (ContextualData) h0.parseWithIOException(PARSER, lVar);
    }

    public static ContextualData parseFrom(l lVar, w wVar) throws IOException {
        return (ContextualData) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
