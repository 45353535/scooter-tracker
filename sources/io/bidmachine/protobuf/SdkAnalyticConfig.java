package io.bidmachine.protobuf;

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
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SdkAnalyticConfig extends h0 implements SdkAnalyticConfigOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 4;
    public static final int INTERVAL_FIELD_NUMBER = 3;
    public static final int METRIC_CONFIGS_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object context_;
    private int count_;
    private int interval_;
    private byte memoizedIsInitialized;
    private List<MetricConfig> metricConfigs_;
    private volatile Object url_;
    private static final SdkAnalyticConfig DEFAULT_INSTANCE = new SdkAnalyticConfig();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.SdkAnalyticConfig.1
        @Override // com.explorestack.protobuf.p1
        public SdkAnalyticConfig parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new SdkAnalyticConfig(lVar, wVar);
        }
    };

    public static final class MetricConfig extends h0 implements MetricConfigOrBuilder {
        public static final int DIMENSIONS_FIELD_NUMBER = 2;
        public static final int METRICS_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private p0 dimensions_;
        private byte memoizedIsInitialized;
        private p0 metrics_;
        private volatile Object name_;
        private static final MetricConfig DEFAULT_INSTANCE = new MetricConfig();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.1
            @Override // com.explorestack.protobuf.p1
            public MetricConfig parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new MetricConfig(lVar, wVar);
            }
        };

        public static final class Builder extends h0.b implements MetricConfigOrBuilder {
            private int bitField0_;
            private p0 dimensions_;
            private p0 metrics_;
            private Object name_;

            private void ensureDimensionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.dimensions_ = new o0(this.dimensions_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureMetricsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.metrics_ = new o0(this.metrics_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder addAllDimensions(Iterable<String> iterable) {
                ensureDimensionsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.dimensions_);
                onChanged();
                return this;
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                ensureMetricsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.metrics_);
                onChanged();
                return this;
            }

            public Builder addDimensions(String str) {
                str.getClass();
                ensureDimensionsIsMutable();
                this.dimensions_.add(str);
                onChanged();
                return this;
            }

            public Builder addDimensionsBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                ensureDimensionsIsMutable();
                this.dimensions_.c(byteString);
                onChanged();
                return this;
            }

            public Builder addMetrics(String str) {
                str.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(str);
                onChanged();
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                ensureMetricsIsMutable();
                this.metrics_.c(byteString);
                onChanged();
                return this;
            }

            public Builder clearDimensions() {
                this.dimensions_ = o0.f19269e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMetrics() {
                this.metrics_ = o0.f19269e;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = MetricConfig.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public String getDimensions(int i10) {
                return (String) this.dimensions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public ByteString getDimensionsBytes(int i10) {
                return this.dimensions_.getByteString(i10);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public String getMetrics(int i10) {
                return (String) this.metrics_.get(i10);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public ByteString getMetricsBytes(int i10) {
                return this.metrics_.getByteString(i10);
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public int getMetricsCount() {
                return this.metrics_.size();
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable.d(MetricConfig.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDimensions(int i10, String str) {
                str.getClass();
                ensureDimensionsIsMutable();
                this.dimensions_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setMetrics(int i10, String str) {
                str.getClass();
                ensureMetricsIsMutable();
                this.metrics_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public t1 getDimensionsList() {
                return this.dimensions_.getUnmodifiableView();
            }

            @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
            public t1 getMetricsList() {
                return this.metrics_.getUnmodifiableView();
            }

            private Builder() {
                this.name_ = "";
                p0 p0Var = o0.f19269e;
                this.dimensions_ = p0Var;
                this.metrics_ = p0Var;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public MetricConfig build() {
                MetricConfig metricConfigBuildPartial = buildPartial();
                if (metricConfigBuildPartial.isInitialized()) {
                    return metricConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricConfigBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public MetricConfig buildPartial() {
                MetricConfig metricConfig = new MetricConfig(this);
                metricConfig.name_ = this.name_;
                if ((this.bitField0_ & 1) != 0) {
                    this.dimensions_ = this.dimensions_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                metricConfig.dimensions_ = this.dimensions_;
                if ((this.bitField0_ & 2) != 0) {
                    this.metrics_ = this.metrics_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                metricConfig.metrics_ = this.metrics_;
                onBuilt();
                return metricConfig;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public MetricConfig getDefaultInstanceForType() {
                return MetricConfig.getDefaultInstance();
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
                this.name_ = "";
                p0 p0Var = o0.f19269e;
                this.dimensions_ = p0Var;
                int i10 = this.bitField0_;
                this.metrics_ = p0Var;
                this.bitField0_ = i10 & (-4);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MetricConfig) {
                    return mergeFrom((MetricConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.name_ = "";
                p0 p0Var = o0.f19269e;
                this.dimensions_ = p0Var;
                this.metrics_ = p0Var;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(MetricConfig metricConfig) {
                if (metricConfig == MetricConfig.getDefaultInstance()) {
                    return this;
                }
                if (!metricConfig.getName().isEmpty()) {
                    this.name_ = metricConfig.name_;
                    onChanged();
                }
                if (!metricConfig.dimensions_.isEmpty()) {
                    if (this.dimensions_.isEmpty()) {
                        this.dimensions_ = metricConfig.dimensions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureDimensionsIsMutable();
                        this.dimensions_.addAll(metricConfig.dimensions_);
                    }
                    onChanged();
                }
                if (!metricConfig.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = metricConfig.metrics_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(metricConfig.metrics_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((h0) metricConfig).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig r3 = (io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig r4 = (io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig$Builder");
            }
        }

        public static MetricConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MetricConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricConfig) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MetricConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricConfig) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricConfig)) {
                return super.equals(obj);
            }
            MetricConfig metricConfig = (MetricConfig) obj;
            return getName().equals(metricConfig.getName()) && getDimensionsList().equals(metricConfig.getDimensionsList()) && getMetricsList().equals(metricConfig.getMetricsList()) && this.unknownFields.equals(metricConfig.unknownFields);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public String getDimensions(int i10) {
            return (String) this.dimensions_.get(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public ByteString getDimensionsBytes(int i10) {
            return this.dimensions_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public int getDimensionsCount() {
            return this.dimensions_.size();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public String getMetrics(int i10) {
            return (String) this.metrics_.get(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public ByteString getMetricsBytes(int i10) {
            return this.metrics_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int iComputeStringSize = !getNameBytes().isEmpty() ? h0.computeStringSize(1, this.name_) : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.dimensions_.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.dimensions_.getRaw(i11));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + getDimensionsList().size();
            int iComputeStringSizeNoTag2 = 0;
            for (int i12 = 0; i12 < this.metrics_.size(); i12++) {
                iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.metrics_.getRaw(i12));
            }
            int size2 = size + iComputeStringSizeNoTag2 + getMetricsList().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size2;
            return size2;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
            if (getDimensionsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDimensionsList().hashCode();
            }
            if (getMetricsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMetricsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable.d(MetricConfig.class, Builder.class);
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
            return new MetricConfig();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getNameBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.name_);
            }
            for (int i10 = 0; i10 < this.dimensions_.size(); i10++) {
                h0.writeString(nVar, 2, this.dimensions_.getRaw(i10));
            }
            for (int i11 = 0; i11 < this.metrics_.size(); i11++) {
                h0.writeString(nVar, 3, this.metrics_.getRaw(i11));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(MetricConfig metricConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricConfig);
        }

        public static MetricConfig parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (MetricConfig) PARSER.parseFrom(byteBuffer, wVar);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public t1 getDimensionsList() {
            return this.dimensions_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfigOrBuilder
        public t1 getMetricsList() {
            return this.metrics_;
        }

        private MetricConfig(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MetricConfig parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (MetricConfig) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static MetricConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MetricConfig) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public MetricConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MetricConfig parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (MetricConfig) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MetricConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            p0 p0Var = o0.f19269e;
            this.dimensions_ = p0Var;
            this.metrics_ = p0Var;
        }

        public static MetricConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricConfig) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static MetricConfig parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (MetricConfig) PARSER.parseFrom(bArr, wVar);
        }

        public static MetricConfig parseFrom(InputStream inputStream) throws IOException {
            return (MetricConfig) h0.parseWithIOException(PARSER, inputStream);
        }

        public static MetricConfig parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (MetricConfig) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        private MetricConfig(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = lVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.name_ = lVar.J();
                                } else if (iK == 18) {
                                    String strJ = lVar.J();
                                    if ((i10 & 1) == 0) {
                                        this.dimensions_ = new o0();
                                        i10 |= 1;
                                    }
                                    this.dimensions_.add(strJ);
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    String strJ2 = lVar.J();
                                    if ((i10 & 2) == 0) {
                                        this.metrics_ = new o0();
                                        i10 |= 2;
                                    }
                                    this.metrics_.add(strJ2);
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) != 0) {
                        this.dimensions_ = this.dimensions_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.metrics_ = this.metrics_.getUnmodifiableView();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.dimensions_ = this.dimensions_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.metrics_ = this.metrics_.getUnmodifiableView();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static MetricConfig parseFrom(l lVar) throws IOException {
            return (MetricConfig) h0.parseWithIOException(PARSER, lVar);
        }

        public static MetricConfig parseFrom(l lVar, w wVar) throws IOException {
            return (MetricConfig) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface MetricConfigOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getDimensions(int i10);

        ByteString getDimensionsBytes(int i10);

        int getDimensionsCount();

        List<String> getDimensionsList();

        String getMetrics(int i10);

        ByteString getMetricsBytes(int i10);

        int getMetricsCount();

        List<String> getMetricsList();

        String getName();

        ByteString getNameBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static SdkAnalyticConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SdkAnalyticConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticConfig) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SdkAnalyticConfig) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkAnalyticConfig)) {
            return super.equals(obj);
        }
        SdkAnalyticConfig sdkAnalyticConfig = (SdkAnalyticConfig) obj;
        return getUrl().equals(sdkAnalyticConfig.getUrl()) && getContext().equals(sdkAnalyticConfig.getContext()) && getInterval() == sdkAnalyticConfig.getInterval() && getCount() == sdkAnalyticConfig.getCount() && getMetricConfigsList().equals(sdkAnalyticConfig.getMetricConfigsList()) && this.unknownFields.equals(sdkAnalyticConfig.unknownFields);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public String getContext() {
        Object obj = this.context_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.context_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public ByteString getContextBytes() {
        Object obj = this.context_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.context_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public int getCount() {
        return this.count_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public int getInterval() {
        return this.interval_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public MetricConfig getMetricConfigs(int i10) {
        return this.metricConfigs_.get(i10);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public int getMetricConfigsCount() {
        return this.metricConfigs_.size();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public List<MetricConfig> getMetricConfigsList() {
        return this.metricConfigs_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public MetricConfigOrBuilder getMetricConfigsOrBuilder(int i10) {
        return this.metricConfigs_.get(i10);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public List<? extends MetricConfigOrBuilder> getMetricConfigsOrBuilderList() {
        return this.metricConfigs_;
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
        int iComputeStringSize = !getUrlBytes().isEmpty() ? h0.computeStringSize(1, this.url_) : 0;
        if (!getContextBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.context_);
        }
        int i11 = this.interval_;
        if (i11 != 0) {
            iComputeStringSize += n.x(3, i11);
        }
        int i12 = this.count_;
        if (i12 != 0) {
            iComputeStringSize += n.x(4, i12);
        }
        for (int i13 = 0; i13 < this.metricConfigs_.size(); i13++) {
            iComputeStringSize += n.G(5, this.metricConfigs_.get(i13));
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public String getUrl() {
        Object obj = this.url_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.url_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
    public ByteString getUrlBytes() {
        Object obj = this.url_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.url_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getContext().hashCode()) * 37) + 3) * 53) + getInterval()) * 37) + 4) * 53) + getCount();
        if (getMetricConfigsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getMetricConfigsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable.d(SdkAnalyticConfig.class, Builder.class);
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
        return new SdkAnalyticConfig();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getUrlBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.url_);
        }
        if (!getContextBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.context_);
        }
        int i10 = this.interval_;
        if (i10 != 0) {
            nVar.F0(3, i10);
        }
        int i11 = this.count_;
        if (i11 != 0) {
            nVar.F0(4, i11);
        }
        for (int i12 = 0; i12 < this.metricConfigs_.size(); i12++) {
            nVar.J0(5, this.metricConfigs_.get(i12));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements SdkAnalyticConfigOrBuilder {
        private int bitField0_;
        private Object context_;
        private int count_;
        private int interval_;
        private v1 metricConfigsBuilder_;
        private List<MetricConfig> metricConfigs_;
        private Object url_;

        private void ensureMetricConfigsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metricConfigs_ = new ArrayList(this.metricConfigs_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
        }

        private v1 getMetricConfigsFieldBuilder() {
            if (this.metricConfigsBuilder_ == null) {
                this.metricConfigsBuilder_ = new v1(this.metricConfigs_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.metricConfigs_ = null;
            }
            return this.metricConfigsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getMetricConfigsFieldBuilder();
            }
        }

        public Builder addAllMetricConfigs(Iterable<? extends MetricConfig> iterable) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureMetricConfigsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.metricConfigs_);
            onChanged();
            return this;
        }

        public Builder addMetricConfigs(MetricConfig metricConfig) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var != null) {
                v1Var.e(metricConfig);
                return this;
            }
            metricConfig.getClass();
            ensureMetricConfigsIsMutable();
            this.metricConfigs_.add(metricConfig);
            onChanged();
            return this;
        }

        public MetricConfig.Builder addMetricConfigsBuilder() {
            return (MetricConfig.Builder) getMetricConfigsFieldBuilder().c(MetricConfig.getDefaultInstance());
        }

        public Builder clearContext() {
            this.context_ = SdkAnalyticConfig.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder clearCount() {
            this.count_ = 0;
            onChanged();
            return this;
        }

        public Builder clearInterval() {
            this.interval_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMetricConfigs() {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.metricConfigs_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearUrl() {
            this.url_ = SdkAnalyticConfig.getDefaultInstance().getUrl();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public int getInterval() {
            return this.interval_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public MetricConfig getMetricConfigs(int i10) {
            v1 v1Var = this.metricConfigsBuilder_;
            return v1Var == null ? this.metricConfigs_.get(i10) : (MetricConfig) v1Var.n(i10);
        }

        public MetricConfig.Builder getMetricConfigsBuilder(int i10) {
            return (MetricConfig.Builder) getMetricConfigsFieldBuilder().k(i10);
        }

        public List<MetricConfig.Builder> getMetricConfigsBuilderList() {
            return getMetricConfigsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public int getMetricConfigsCount() {
            v1 v1Var = this.metricConfigsBuilder_;
            return v1Var == null ? this.metricConfigs_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public List<MetricConfig> getMetricConfigsList() {
            v1 v1Var = this.metricConfigsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.metricConfigs_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public MetricConfigOrBuilder getMetricConfigsOrBuilder(int i10) {
            v1 v1Var = this.metricConfigsBuilder_;
            return v1Var == null ? this.metricConfigs_.get(i10) : (MetricConfigOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public List<? extends MetricConfigOrBuilder> getMetricConfigsOrBuilderList() {
            v1 v1Var = this.metricConfigsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.metricConfigs_);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticConfigOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable.d(SdkAnalyticConfig.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeMetricConfigs(int i10) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureMetricConfigsIsMutable();
            this.metricConfigs_.remove(i10);
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

        public Builder setCount(int i10) {
            this.count_ = i10;
            onChanged();
            return this;
        }

        public Builder setInterval(int i10) {
            this.interval_ = i10;
            onChanged();
            return this;
        }

        public Builder setMetricConfigs(int i10, MetricConfig metricConfig) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, metricConfig);
                return this;
            }
            metricConfig.getClass();
            ensureMetricConfigsIsMutable();
            this.metricConfigs_.set(i10, metricConfig);
            onChanged();
            return this;
        }

        public Builder setUrl(String str) {
            str.getClass();
            this.url_ = str;
            onChanged();
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.url_ = "";
            this.context_ = "";
            this.metricConfigs_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticConfig build() {
            SdkAnalyticConfig sdkAnalyticConfigBuildPartial = buildPartial();
            if (sdkAnalyticConfigBuildPartial.isInitialized()) {
                return sdkAnalyticConfigBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sdkAnalyticConfigBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticConfig buildPartial() {
            SdkAnalyticConfig sdkAnalyticConfig = new SdkAnalyticConfig(this);
            sdkAnalyticConfig.url_ = this.url_;
            sdkAnalyticConfig.context_ = this.context_;
            sdkAnalyticConfig.interval_ = this.interval_;
            sdkAnalyticConfig.count_ = this.count_;
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var != null) {
                sdkAnalyticConfig.metricConfigs_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.metricConfigs_ = DesugarCollections.unmodifiableList(this.metricConfigs_);
                    this.bitField0_ &= -2;
                }
                sdkAnalyticConfig.metricConfigs_ = this.metricConfigs_;
            }
            onBuilt();
            return sdkAnalyticConfig;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public SdkAnalyticConfig getDefaultInstanceForType() {
            return SdkAnalyticConfig.getDefaultInstance();
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

        public MetricConfig.Builder addMetricConfigsBuilder(int i10) {
            return (MetricConfig.Builder) getMetricConfigsFieldBuilder().b(i10, MetricConfig.getDefaultInstance());
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
            this.url_ = "";
            this.context_ = "";
            this.interval_ = 0;
            this.count_ = 0;
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var == null) {
                this.metricConfigs_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            v1Var.g();
            return this;
        }

        public Builder addMetricConfigs(int i10, MetricConfig metricConfig) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var == null) {
                metricConfig.getClass();
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(i10, metricConfig);
                onChanged();
                return this;
            }
            v1Var.d(i10, metricConfig);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SdkAnalyticConfig) {
                return mergeFrom((SdkAnalyticConfig) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMetricConfigs(int i10, MetricConfig.Builder builder) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.url_ = "";
            this.context_ = "";
            this.metricConfigs_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(SdkAnalyticConfig sdkAnalyticConfig) {
            if (sdkAnalyticConfig == SdkAnalyticConfig.getDefaultInstance()) {
                return this;
            }
            if (!sdkAnalyticConfig.getUrl().isEmpty()) {
                this.url_ = sdkAnalyticConfig.url_;
                onChanged();
            }
            if (!sdkAnalyticConfig.getContext().isEmpty()) {
                this.context_ = sdkAnalyticConfig.context_;
                onChanged();
            }
            if (sdkAnalyticConfig.getInterval() != 0) {
                setInterval(sdkAnalyticConfig.getInterval());
            }
            if (sdkAnalyticConfig.getCount() != 0) {
                setCount(sdkAnalyticConfig.getCount());
            }
            if (this.metricConfigsBuilder_ == null) {
                if (!sdkAnalyticConfig.metricConfigs_.isEmpty()) {
                    if (this.metricConfigs_.isEmpty()) {
                        this.metricConfigs_ = sdkAnalyticConfig.metricConfigs_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricConfigsIsMutable();
                        this.metricConfigs_.addAll(sdkAnalyticConfig.metricConfigs_);
                    }
                    onChanged();
                }
            } else if (!sdkAnalyticConfig.metricConfigs_.isEmpty()) {
                if (!this.metricConfigsBuilder_.t()) {
                    this.metricConfigsBuilder_.a(sdkAnalyticConfig.metricConfigs_);
                } else {
                    this.metricConfigsBuilder_.h();
                    this.metricConfigsBuilder_ = null;
                    this.metricConfigs_ = sdkAnalyticConfig.metricConfigs_;
                    this.bitField0_ &= -2;
                    this.metricConfigsBuilder_ = h0.alwaysUseFieldBuilders ? getMetricConfigsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) sdkAnalyticConfig).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMetricConfigs(MetricConfig.Builder builder) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addMetricConfigs(int i10, MetricConfig.Builder builder) {
            v1 v1Var = this.metricConfigsBuilder_;
            if (v1Var == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.SdkAnalyticConfig.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.SdkAnalyticConfig.access$2400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.SdkAnalyticConfig r3 = (io.bidmachine.protobuf.SdkAnalyticConfig) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.SdkAnalyticConfig r4 = (io.bidmachine.protobuf.SdkAnalyticConfig) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticConfig.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.SdkAnalyticConfig$Builder");
        }
    }

    public static Builder newBuilder(SdkAnalyticConfig sdkAnalyticConfig) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdkAnalyticConfig);
    }

    public static SdkAnalyticConfig parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (SdkAnalyticConfig) PARSER.parseFrom(byteBuffer, wVar);
    }

    private SdkAnalyticConfig(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SdkAnalyticConfig parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (SdkAnalyticConfig) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static SdkAnalyticConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SdkAnalyticConfig) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SdkAnalyticConfig getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SdkAnalyticConfig parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (SdkAnalyticConfig) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SdkAnalyticConfig() {
        this.memoizedIsInitialized = (byte) -1;
        this.url_ = "";
        this.context_ = "";
        this.metricConfigs_ = Collections.EMPTY_LIST;
    }

    public static SdkAnalyticConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SdkAnalyticConfig) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static SdkAnalyticConfig parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (SdkAnalyticConfig) PARSER.parseFrom(bArr, wVar);
    }

    public static SdkAnalyticConfig parseFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticConfig) h0.parseWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticConfig parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (SdkAnalyticConfig) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    private SdkAnalyticConfig(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.url_ = lVar.J();
                            } else if (iK == 18) {
                                this.context_ = lVar.J();
                            } else if (iK == 24) {
                                this.interval_ = lVar.y();
                            } else if (iK == 32) {
                                this.count_ = lVar.y();
                            } else if (iK != 42) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.metricConfigs_ = new ArrayList();
                                    z11 = true;
                                }
                                this.metricConfigs_.add((MetricConfig) lVar.A(MetricConfig.parser(), wVar));
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.metricConfigs_ = DesugarCollections.unmodifiableList(this.metricConfigs_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.metricConfigs_ = DesugarCollections.unmodifiableList(this.metricConfigs_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static SdkAnalyticConfig parseFrom(l lVar) throws IOException {
        return (SdkAnalyticConfig) h0.parseWithIOException(PARSER, lVar);
    }

    public static SdkAnalyticConfig parseFrom(l lVar, w wVar) throws IOException {
        return (SdkAnalyticConfig) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
