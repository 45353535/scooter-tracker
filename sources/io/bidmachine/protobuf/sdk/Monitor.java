package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.sdk.Error;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Monitor extends h0 implements MonitorOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int RECORDS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Record> records_;
    private static final Monitor DEFAULT_INSTANCE = new Monitor();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Monitor.1
        @Override // com.explorestack.protobuf.p1
        public Monitor parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Monitor(lVar, wVar);
        }
    };

    public static final class Configuration extends h0 implements ConfigurationOrBuilder {
        public static final int BATCH_SIZE_FIELD_NUMBER = 3;
        public static final int INTERVAL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int SHOULD_REPORT_FIELD_NUMBER = 5;
        public static final int URL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private UInt32Value batchSize_;
        private UInt32Value interval_;
        private byte memoizedIsInitialized;
        private StringValue name_;
        private BoolValue shouldReport_;
        private StringValue url_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Monitor.Configuration.1
            @Override // com.explorestack.protobuf.p1
            public Configuration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Configuration(lVar, wVar);
            }
        };

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (hasName() != configuration.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(configuration.getName())) || hasUrl() != configuration.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(configuration.getUrl())) || hasBatchSize() != configuration.hasBatchSize()) {
                return false;
            }
            if ((hasBatchSize() && !getBatchSize().equals(configuration.getBatchSize())) || hasInterval() != configuration.hasInterval()) {
                return false;
            }
            if ((!hasInterval() || getInterval().equals(configuration.getInterval())) && hasShouldReport() == configuration.hasShouldReport()) {
                return (!hasShouldReport() || getShouldReport().equals(configuration.getShouldReport())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getBatchSize() {
            UInt32Value uInt32Value = this.batchSize_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public n2 getBatchSizeOrBuilder() {
            return getBatchSize();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getInterval() {
            UInt32Value uInt32Value = this.interval_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public n2 getIntervalOrBuilder() {
            return getInterval();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public d2 getNameOrBuilder() {
            return getName();
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
            int iG = this.name_ != null ? n.G(1, getName()) : 0;
            if (this.url_ != null) {
                iG += n.G(2, getUrl());
            }
            if (this.batchSize_ != null) {
                iG += n.G(3, getBatchSize());
            }
            if (this.interval_ != null) {
                iG += n.G(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                iG += n.G(5, getShouldReport());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public BoolValue getShouldReport() {
            BoolValue boolValue = this.shouldReport_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public g getShouldReportOrBuilder() {
            return getShouldReport();
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getUrl() {
            StringValue stringValue = this.url_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public d2 getUrlOrBuilder() {
            return getUrl();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasBatchSize() {
            return this.batchSize_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasInterval() {
            return this.interval_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasName() {
            return this.name_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasShouldReport() {
            return this.shouldReport_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasUrl() {
            return this.url_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasUrl()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getUrl().hashCode();
            }
            if (hasBatchSize()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getBatchSize().hashCode();
            }
            if (hasInterval()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getInterval().hashCode();
            }
            if (hasShouldReport()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getShouldReport().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
            return new Configuration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.name_ != null) {
                nVar.J0(1, getName());
            }
            if (this.url_ != null) {
                nVar.J0(2, getUrl());
            }
            if (this.batchSize_ != null) {
                nVar.J0(3, getBatchSize());
            }
            if (this.interval_ != null) {
                nVar.J0(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                nVar.J0(5, getShouldReport());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ConfigurationOrBuilder {
            private a2 batchSizeBuilder_;
            private UInt32Value batchSize_;
            private a2 intervalBuilder_;
            private UInt32Value interval_;
            private a2 nameBuilder_;
            private StringValue name_;
            private a2 shouldReportBuilder_;
            private BoolValue shouldReport_;
            private a2 urlBuilder_;
            private StringValue url_;

            private a2 getBatchSizeFieldBuilder() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSizeBuilder_ = new a2(getBatchSize(), getParentForChildren(), isClean());
                    this.batchSize_ = null;
                }
                return this.batchSizeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            private a2 getIntervalFieldBuilder() {
                if (this.intervalBuilder_ == null) {
                    this.intervalBuilder_ = new a2(getInterval(), getParentForChildren(), isClean());
                    this.interval_ = null;
                }
                return this.intervalBuilder_;
            }

            private a2 getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new a2(getName(), getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            private a2 getShouldReportFieldBuilder() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReportBuilder_ = new a2(getShouldReport(), getParentForChildren(), isClean());
                    this.shouldReport_ = null;
                }
                return this.shouldReportBuilder_;
            }

            private a2 getUrlFieldBuilder() {
                if (this.urlBuilder_ == null) {
                    this.urlBuilder_ = new a2(getUrl(), getParentForChildren(), isClean());
                    this.url_ = null;
                }
                return this.urlBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearBatchSize() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                    onChanged();
                    return this;
                }
                this.batchSize_ = null;
                this.batchSizeBuilder_ = null;
                return this;
            }

            public Builder clearInterval() {
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                    onChanged();
                    return this;
                }
                this.interval_ = null;
                this.intervalBuilder_ = null;
                return this;
            }

            public Builder clearName() {
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                    onChanged();
                    return this;
                }
                this.name_ = null;
                this.nameBuilder_ = null;
                return this;
            }

            public Builder clearShouldReport() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                    onChanged();
                    return this;
                }
                this.shouldReport_ = null;
                this.shouldReportBuilder_ = null;
                return this;
            }

            public Builder clearUrl() {
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                    onChanged();
                    return this;
                }
                this.url_ = null;
                this.urlBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getBatchSize() {
                a2 a2Var = this.batchSizeBuilder_;
                if (a2Var != null) {
                    return (UInt32Value) a2Var.e();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getBatchSizeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getBatchSizeFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public n2 getBatchSizeOrBuilder() {
                a2 a2Var = this.batchSizeBuilder_;
                if (a2Var != null) {
                    return (n2) a2Var.f();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getInterval() {
                a2 a2Var = this.intervalBuilder_;
                if (a2Var != null) {
                    return (UInt32Value) a2Var.e();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getIntervalBuilder() {
                onChanged();
                return (UInt32Value.Builder) getIntervalFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public n2 getIntervalOrBuilder() {
                a2 a2Var = this.intervalBuilder_;
                if (a2Var != null) {
                    return (n2) a2Var.f();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getName() {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getNameBuilder() {
                onChanged();
                return (StringValue.Builder) getNameFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public d2 getNameOrBuilder() {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public BoolValue getShouldReport() {
                a2 a2Var = this.shouldReportBuilder_;
                if (a2Var != null) {
                    return (BoolValue) a2Var.e();
                }
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public BoolValue.Builder getShouldReportBuilder() {
                onChanged();
                return (BoolValue.Builder) getShouldReportFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public g getShouldReportOrBuilder() {
                a2 a2Var = this.shouldReportBuilder_;
                if (a2Var != null) {
                    return (g) a2Var.f();
                }
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getUrl() {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    return (StringValue) a2Var.e();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getUrlBuilder() {
                onChanged();
                return (StringValue.Builder) getUrlFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public d2 getUrlOrBuilder() {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    return (d2) a2Var.f();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasBatchSize() {
                return (this.batchSizeBuilder_ == null && this.batchSize_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasInterval() {
                return (this.intervalBuilder_ == null && this.interval_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasName() {
                return (this.nameBuilder_ == null && this.name_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasShouldReport() {
                return (this.shouldReportBuilder_ == null && this.shouldReport_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasUrl() {
                return (this.urlBuilder_ == null && this.url_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBatchSize(UInt32Value uInt32Value) {
                a2 a2Var = this.batchSizeBuilder_;
                if (a2Var != null) {
                    a2Var.g(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.batchSize_;
                if (uInt32Value2 != null) {
                    this.batchSize_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.batchSize_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeInterval(UInt32Value uInt32Value) {
                a2 a2Var = this.intervalBuilder_;
                if (a2Var != null) {
                    a2Var.g(uInt32Value);
                    return this;
                }
                UInt32Value uInt32Value2 = this.interval_;
                if (uInt32Value2 != null) {
                    this.interval_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                } else {
                    this.interval_ = uInt32Value;
                }
                onChanged();
                return this;
            }

            public Builder mergeName(StringValue stringValue) {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.name_;
                if (stringValue2 != null) {
                    this.name_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.name_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeShouldReport(BoolValue boolValue) {
                a2 a2Var = this.shouldReportBuilder_;
                if (a2Var != null) {
                    a2Var.g(boolValue);
                    return this;
                }
                BoolValue boolValue2 = this.shouldReport_;
                if (boolValue2 != null) {
                    this.shouldReport_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                } else {
                    this.shouldReport_ = boolValue;
                }
                onChanged();
                return this;
            }

            public Builder mergeUrl(StringValue stringValue) {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    a2Var.g(stringValue);
                    return this;
                }
                StringValue stringValue2 = this.url_;
                if (stringValue2 != null) {
                    this.url_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.url_ = stringValue;
                }
                onChanged();
                return this;
            }

            public Builder setBatchSize(UInt32Value uInt32Value) {
                a2 a2Var = this.batchSizeBuilder_;
                if (a2Var != null) {
                    a2Var.i(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.batchSize_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setInterval(UInt32Value uInt32Value) {
                a2 a2Var = this.intervalBuilder_;
                if (a2Var != null) {
                    a2Var.i(uInt32Value);
                    return this;
                }
                uInt32Value.getClass();
                this.interval_ = uInt32Value;
                onChanged();
                return this;
            }

            public Builder setName(StringValue stringValue) {
                a2 a2Var = this.nameBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.name_ = stringValue;
                onChanged();
                return this;
            }

            public Builder setShouldReport(BoolValue boolValue) {
                a2 a2Var = this.shouldReportBuilder_;
                if (a2Var != null) {
                    a2Var.i(boolValue);
                    return this;
                }
                boolValue.getClass();
                this.shouldReport_ = boolValue;
                onChanged();
                return this;
            }

            public Builder setUrl(StringValue stringValue) {
                a2 a2Var = this.urlBuilder_;
                if (a2Var != null) {
                    a2Var.i(stringValue);
                    return this;
                }
                stringValue.getClass();
                this.url_ = stringValue;
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
            public Configuration build() {
                Configuration configurationBuildPartial = buildPartial();
                if (configurationBuildPartial.isInitialized()) {
                    return configurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                a2 a2Var = this.nameBuilder_;
                if (a2Var == null) {
                    configuration.name_ = this.name_;
                } else {
                    configuration.name_ = (StringValue) a2Var.a();
                }
                a2 a2Var2 = this.urlBuilder_;
                if (a2Var2 == null) {
                    configuration.url_ = this.url_;
                } else {
                    configuration.url_ = (StringValue) a2Var2.a();
                }
                a2 a2Var3 = this.batchSizeBuilder_;
                if (a2Var3 == null) {
                    configuration.batchSize_ = this.batchSize_;
                } else {
                    configuration.batchSize_ = (UInt32Value) a2Var3.a();
                }
                a2 a2Var4 = this.intervalBuilder_;
                if (a2Var4 == null) {
                    configuration.interval_ = this.interval_;
                } else {
                    configuration.interval_ = (UInt32Value) a2Var4.a();
                }
                a2 a2Var5 = this.shouldReportBuilder_;
                if (a2Var5 == null) {
                    configuration.shouldReport_ = this.shouldReport_;
                } else {
                    configuration.shouldReport_ = (BoolValue) a2Var5.a();
                }
                onBuilt();
                return configuration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
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
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                } else {
                    this.url_ = null;
                    this.urlBuilder_ = null;
                }
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                } else {
                    this.batchSize_ = null;
                    this.batchSizeBuilder_ = null;
                }
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                } else {
                    this.interval_ = null;
                    this.intervalBuilder_ = null;
                }
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                    return this;
                }
                this.shouldReport_ = null;
                this.shouldReportBuilder_ = null;
                return this;
            }

            public Builder setBatchSize(UInt32Value.Builder builder) {
                a2 a2Var = this.batchSizeBuilder_;
                if (a2Var == null) {
                    this.batchSize_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setInterval(UInt32Value.Builder builder) {
                a2 a2Var = this.intervalBuilder_;
                if (a2Var == null) {
                    this.interval_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setName(StringValue.Builder builder) {
                a2 a2Var = this.nameBuilder_;
                if (a2Var == null) {
                    this.name_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setShouldReport(BoolValue.Builder builder) {
                a2 a2Var = this.shouldReportBuilder_;
                if (a2Var == null) {
                    this.shouldReport_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setUrl(StringValue.Builder builder) {
                a2 a2Var = this.urlBuilder_;
                if (a2Var == null) {
                    this.url_ = builder.build();
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
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasName()) {
                    mergeName(configuration.getName());
                }
                if (configuration.hasUrl()) {
                    mergeUrl(configuration.getUrl());
                }
                if (configuration.hasBatchSize()) {
                    mergeBatchSize(configuration.getBatchSize());
                }
                if (configuration.hasInterval()) {
                    mergeInterval(configuration.getInterval());
                }
                if (configuration.hasShouldReport()) {
                    mergeShouldReport(configuration.getShouldReport());
                }
                mergeUnknownFields(((h0) configuration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.Monitor.Configuration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Monitor.Configuration.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Monitor$Configuration r3 = (io.bidmachine.protobuf.sdk.Monitor.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Monitor$Configuration r4 = (io.bidmachine.protobuf.sdk.Monitor.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Monitor.Configuration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Monitor$Configuration$Builder");
            }
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Configuration(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Configuration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Configuration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Configuration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Configuration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr, wVar);
        }

        private Configuration(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                StringValue stringValue = this.name_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.name_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.name_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                StringValue stringValue3 = this.url_;
                                StringValue.Builder builder2 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.url_ = stringValue4;
                                if (builder2 != null) {
                                    builder2.mergeFrom(stringValue4);
                                    this.url_ = builder2.buildPartial();
                                }
                            } else if (iK == 26) {
                                UInt32Value uInt32Value = this.batchSize_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                this.batchSize_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.batchSize_ = builder3.buildPartial();
                                }
                            } else if (iK == 34) {
                                UInt32Value uInt32Value3 = this.interval_;
                                UInt32Value.Builder builder4 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                UInt32Value uInt32Value4 = (UInt32Value) lVar.A(UInt32Value.parser(), wVar);
                                this.interval_ = uInt32Value4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(uInt32Value4);
                                    this.interval_ = builder4.buildPartial();
                                }
                            } else if (iK != 42) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                BoolValue boolValue = this.shouldReport_;
                                BoolValue.Builder builder5 = boolValue != null ? boolValue.toBuilder() : null;
                                BoolValue boolValue2 = (BoolValue) lVar.A(BoolValue.parser(), wVar);
                                this.shouldReport_ = boolValue2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(boolValue2);
                                    this.shouldReport_ = builder5.buildPartial();
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

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Configuration parseFrom(l lVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar);
        }

        public static Configuration parseFrom(l lVar, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        UInt32Value getBatchSize();

        n2 getBatchSizeOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        UInt32Value getInterval();

        n2 getIntervalOrBuilder();

        StringValue getName();

        d2 getNameOrBuilder();

        BoolValue getShouldReport();

        g getShouldReportOrBuilder();

        StringValue getUrl();

        d2 getUrlOrBuilder();

        boolean hasBatchSize();

        boolean hasInterval();

        boolean hasName();

        boolean hasShouldReport();

        boolean hasUrl();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Record extends h0 implements RecordOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Error error_;
        private Struct fields_;
        private byte memoizedIsInitialized;
        private Timestamp timestamp_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Monitor.Record.1
            @Override // com.explorestack.protobuf.p1
            public Record parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Record(lVar, wVar);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Record parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Record) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Record)) {
                return super.equals(obj);
            }
            Record record = (Record) obj;
            if (hasTimestamp() != record.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && !getTimestamp().equals(record.getTimestamp())) || hasFields() != record.hasFields()) {
                return false;
            }
            if ((!hasFields() || getFields().equals(record.getFields())) && hasError() == record.hasError()) {
                return (!hasError() || getError().equals(record.getError())) && this.unknownFields.equals(record.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Struct getFields() {
            Struct struct = this.fields_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public e2 getFieldsOrBuilder() {
            return getFields();
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
            int iG = this.timestamp_ != null ? n.G(1, getTimestamp()) : 0;
            if (this.fields_ != null) {
                iG += n.G(2, getFields());
            }
            if (this.error_ != null) {
                iG += n.G(3, getError());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public j2 getTimestampOrBuilder() {
            return getTimestamp();
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasFields() {
            return this.fields_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTimestamp().hashCode();
            }
            if (hasFields()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getFields().hashCode();
            }
            if (hasError()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getError().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable.d(Record.class, Builder.class);
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
            return new Record();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.timestamp_ != null) {
                nVar.J0(1, getTimestamp());
            }
            if (this.fields_ != null) {
                nVar.J0(2, getFields());
            }
            if (this.error_ != null) {
                nVar.J0(3, getError());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements RecordOrBuilder {
            private a2 errorBuilder_;
            private Error error_;
            private a2 fieldsBuilder_;
            private Struct fields_;
            private a2 timestampBuilder_;
            private Timestamp timestamp_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            private a2 getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new a2(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private a2 getFieldsFieldBuilder() {
                if (this.fieldsBuilder_ == null) {
                    this.fieldsBuilder_ = new a2(getFields(), getParentForChildren(), isClean());
                    this.fields_ = null;
                }
                return this.fieldsBuilder_;
            }

            private a2 getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new a2(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
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

            public Builder clearFields() {
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                    onChanged();
                    return this;
                }
                this.fields_ = null;
                this.fieldsBuilder_ = null;
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                    return this;
                }
                this.timestamp_ = null;
                this.timestampBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                a2 a2Var = this.errorBuilder_;
                if (a2Var != null) {
                    return (ErrorOrBuilder) a2Var.f();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Struct getFields() {
                a2 a2Var = this.fieldsBuilder_;
                if (a2Var != null) {
                    return (Struct) a2Var.e();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getFieldsBuilder() {
                onChanged();
                return (Struct.Builder) getFieldsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public e2 getFieldsOrBuilder() {
                a2 a2Var = this.fieldsBuilder_;
                if (a2Var != null) {
                    return (e2) a2Var.f();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Timestamp getTimestamp() {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    return (Timestamp) a2Var.e();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (Timestamp.Builder) getTimestampFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public j2 getTimestampOrBuilder() {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    return (j2) a2Var.f();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasError() {
                return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasFields() {
                return (this.fieldsBuilder_ == null && this.fields_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasTimestamp() {
                return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable.d(Record.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
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

            public Builder mergeFields(Struct struct) {
                a2 a2Var = this.fieldsBuilder_;
                if (a2Var != null) {
                    a2Var.g(struct);
                    return this;
                }
                Struct struct2 = this.fields_;
                if (struct2 != null) {
                    this.fields_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.fields_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    a2Var.g(timestamp);
                    return this;
                }
                Timestamp timestamp2 = this.timestamp_;
                if (timestamp2 != null) {
                    this.timestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.timestamp_ = timestamp;
                }
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

            public Builder setFields(Struct struct) {
                a2 a2Var = this.fieldsBuilder_;
                if (a2Var != null) {
                    a2Var.i(struct);
                    return this;
                }
                struct.getClass();
                this.fields_ = struct;
                onChanged();
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    a2Var.i(timestamp);
                    return this;
                }
                timestamp.getClass();
                this.timestamp_ = timestamp;
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
            public Record build() {
                Record recordBuildPartial = buildPartial();
                if (recordBuildPartial.isInitialized()) {
                    return recordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recordBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record buildPartial() {
                Record record = new Record(this);
                a2 a2Var = this.timestampBuilder_;
                if (a2Var == null) {
                    record.timestamp_ = this.timestamp_;
                } else {
                    record.timestamp_ = (Timestamp) a2Var.a();
                }
                a2 a2Var2 = this.fieldsBuilder_;
                if (a2Var2 == null) {
                    record.fields_ = this.fields_;
                } else {
                    record.fields_ = (Struct) a2Var2.a();
                }
                a2 a2Var3 = this.errorBuilder_;
                if (a2Var3 == null) {
                    record.error_ = this.error_;
                } else {
                    record.error_ = (Error) a2Var3.a();
                }
                onBuilt();
                return record;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Record getDefaultInstanceForType() {
                return Record.getDefaultInstance();
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
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                } else {
                    this.fields_ = null;
                    this.fieldsBuilder_ = null;
                }
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                    return this;
                }
                this.error_ = null;
                this.errorBuilder_ = null;
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

            public Builder setFields(Struct.Builder builder) {
                a2 a2Var = this.fieldsBuilder_;
                if (a2Var == null) {
                    this.fields_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var == null) {
                    this.timestamp_ = builder.build();
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
                if (message instanceof Record) {
                    return mergeFrom((Record) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Record record) {
                if (record == Record.getDefaultInstance()) {
                    return this;
                }
                if (record.hasTimestamp()) {
                    mergeTimestamp(record.getTimestamp());
                }
                if (record.hasFields()) {
                    mergeFields(record.getFields());
                }
                if (record.hasError()) {
                    mergeError(record.getError());
                }
                mergeUnknownFields(((h0) record).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.Monitor.Record.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Monitor.Record.access$2000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Monitor$Record r3 = (io.bidmachine.protobuf.sdk.Monitor.Record) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Monitor$Record r4 = (io.bidmachine.protobuf.sdk.Monitor.Record) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Monitor.Record.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Monitor$Record$Builder");
            }
        }

        public static Builder newBuilder(Record record) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(record);
        }

        public static Record parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Record(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Record) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Record parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Record getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Record parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Record() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Record parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr, wVar);
        }

        private Record(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = lVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    Timestamp timestamp = this.timestamp_;
                                    Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                                    this.timestamp_ = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.timestamp_ = builder.buildPartial();
                                    }
                                } else if (iK == 18) {
                                    Struct struct = this.fields_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                    this.fields_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.fields_ = builder2.buildPartial();
                                    }
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Error error = this.error_;
                                    Error.Builder builder3 = error != null ? error.toBuilder() : null;
                                    Error error2 = (Error) lVar.A(Error.parser(), wVar);
                                    this.error_ = error2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(error2);
                                        this.error_ = builder3.buildPartial();
                                    }
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
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Record parseFrom(InputStream inputStream) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Record parseFrom(l lVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, lVar);
        }

        public static Record parseFrom(l lVar, w wVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface RecordOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        Error getError();

        ErrorOrBuilder getErrorOrBuilder();

        Struct getFields();

        e2 getFieldsOrBuilder();

        Timestamp getTimestamp();

        j2 getTimestampOrBuilder();

        boolean hasError();

        boolean hasFields();

        boolean hasTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Monitor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitor) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Monitor)) {
            return super.equals(obj);
        }
        Monitor monitor = (Monitor) obj;
        return getName().equals(monitor.getName()) && getRecordsList().equals(monitor.getRecordsList()) && this.unknownFields.equals(monitor.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
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

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
        return this.records_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? h0.computeStringSize(1, this.name_) : 0;
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iComputeStringSize += n.G(2, this.records_.get(i11));
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
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
        if (getRecordsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getRecordsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable.d(Monitor.class, Builder.class);
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
        return new Monitor();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.name_);
        }
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            nVar.J0(2, this.records_.get(i10));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements MonitorOrBuilder {
        private int bitField0_;
        private Object name_;
        private v1 recordsBuilder_;
        private List<Record> records_;

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        private v1 getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new v1(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getRecordsFieldBuilder();
            }
        }

        public Builder addAllRecords(Iterable<? extends Record> iterable) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureRecordsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.records_);
            onChanged();
            return this;
        }

        public Builder addRecords(Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.e(record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.add(record);
            onChanged();
            return this;
        }

        public Record.Builder addRecordsBuilder() {
            return (Record.Builder) getRecordsFieldBuilder().c(Record.getDefaultInstance());
        }

        public Builder clearName() {
            this.name_ = Monitor.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder clearRecords() {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.records_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public Record getRecords(int i10) {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.get(i10) : (Record) v1Var.n(i10);
        }

        public Record.Builder getRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().k(i10);
        }

        public List<Record.Builder> getRecordsBuilderList() {
            return getRecordsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public int getRecordsCount() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<Record> getRecordsList() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.records_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.get(i10) : (RecordOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.records_);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable.d(Monitor.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeRecords(int i10) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureRecordsIsMutable();
            this.records_.remove(i10);
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

        public Builder setRecords(int i10, Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.set(i10, record);
            onChanged();
            return this;
        }

        private Builder() {
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor build() {
            Monitor monitorBuildPartial = buildPartial();
            if (monitorBuildPartial.isInitialized()) {
                return monitorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitorBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor buildPartial() {
            Monitor monitor = new Monitor(this);
            monitor.name_ = this.name_;
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                monitor.records_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.records_ = DesugarCollections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                monitor.records_ = this.records_;
            }
            onBuilt();
            return monitor;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Monitor getDefaultInstanceForType() {
            return Monitor.getDefaultInstance();
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

        public Record.Builder addRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().b(i10, Record.getDefaultInstance());
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
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                this.records_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            v1Var.g();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.name_ = "";
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addRecords(int i10, Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(i10, record);
                onChanged();
                return this;
            }
            v1Var.d(i10, record);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Monitor) {
                return mergeFrom((Monitor) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRecords(int i10, Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Monitor monitor) {
            if (monitor == Monitor.getDefaultInstance()) {
                return this;
            }
            if (!monitor.getName().isEmpty()) {
                this.name_ = monitor.name_;
                onChanged();
            }
            if (this.recordsBuilder_ == null) {
                if (!monitor.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = monitor.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(monitor.records_);
                    }
                    onChanged();
                }
            } else if (!monitor.records_.isEmpty()) {
                if (!this.recordsBuilder_.t()) {
                    this.recordsBuilder_.a(monitor.records_);
                } else {
                    this.recordsBuilder_.h();
                    this.recordsBuilder_ = null;
                    this.records_ = monitor.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = h0.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) monitor).unknownFields);
            onChanged();
            return this;
        }

        public Builder addRecords(Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addRecords(int i10, Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.sdk.Monitor.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Monitor.access$3000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Monitor r3 = (io.bidmachine.protobuf.sdk.Monitor) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Monitor r4 = (io.bidmachine.protobuf.sdk.Monitor) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Monitor.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Monitor$Builder");
        }
    }

    public static Builder newBuilder(Monitor monitor) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(monitor);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Monitor(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Monitor) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Monitor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Monitor getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Monitor parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Monitor() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.records_ = Collections.EMPTY_LIST;
    }

    public static Monitor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Monitor parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Monitor) PARSER.parseFrom(bArr, wVar);
    }

    public static Monitor parseFrom(InputStream inputStream) throws IOException {
        return (Monitor) h0.parseWithIOException(PARSER, inputStream);
    }

    private Monitor(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.name_ = lVar.J();
                        } else if (iK != 18) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            if (!z11) {
                                this.records_ = new ArrayList();
                                z11 = true;
                            }
                            this.records_.add((Record) lVar.A(Record.parser(), wVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.records_ = DesugarCollections.unmodifiableList(this.records_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.records_ = DesugarCollections.unmodifiableList(this.records_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Monitor parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Monitor) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Monitor parseFrom(l lVar) throws IOException {
        return (Monitor) h0.parseWithIOException(PARSER, lVar);
    }

    public static Monitor parseFrom(l lVar, w wVar) throws IOException {
        return (Monitor) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
