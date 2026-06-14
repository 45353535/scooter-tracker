package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Configuration extends h0 implements ConfigurationOrBuilder {
    public static final int BPK_FIELD_NUMBER = 3;
    public static final int MONITORS_FIELD_NUMBER = 1;
    public static final int READERS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private StringValue bpk_;
    private byte memoizedIsInitialized;
    private List<Monitor.Configuration> monitors_;
    private List<Reader.Configuration> readers_;
    private static final Configuration DEFAULT_INSTANCE = new Configuration();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Configuration.1
        @Override // com.explorestack.protobuf.p1
        public Configuration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Configuration(lVar, wVar);
        }
    };

    public static Configuration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
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
        if (getMonitorsList().equals(configuration.getMonitorsList()) && getReadersList().equals(configuration.getReadersList()) && hasBpk() == configuration.hasBpk()) {
            return (!hasBpk() || getBpk().equals(configuration.getBpk())) && this.unknownFields.equals(configuration.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public StringValue getBpk() {
        StringValue stringValue = this.bpk_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public d2 getBpkOrBuilder() {
        return getBpk();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.Configuration getMonitors(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getMonitorsCount() {
        return this.monitors_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Monitor.Configuration> getMonitorsList() {
        return this.monitors_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
        return this.monitors_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.Configuration getReaders(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getReadersCount() {
        return this.readers_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Reader.Configuration> getReadersList() {
        return this.readers_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
        return this.readers_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.monitors_.size(); i11++) {
            iG += n.G(1, this.monitors_.get(i11));
        }
        for (int i12 = 0; i12 < this.readers_.size(); i12++) {
            iG += n.G(2, this.readers_.get(i12));
        }
        if (this.bpk_ != null) {
            iG += n.G(3, getBpk());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public boolean hasBpk() {
        return this.bpk_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getMonitorsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getMonitorsList().hashCode();
        }
        if (getReadersCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getReadersList().hashCode();
        }
        if (hasBpk()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getBpk().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
        for (int i10 = 0; i10 < this.monitors_.size(); i10++) {
            nVar.J0(1, this.monitors_.get(i10));
        }
        for (int i11 = 0; i11 < this.readers_.size(); i11++) {
            nVar.J0(2, this.readers_.get(i11));
        }
        if (this.bpk_ != null) {
            nVar.J0(3, getBpk());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements ConfigurationOrBuilder {
        private int bitField0_;
        private a2 bpkBuilder_;
        private StringValue bpk_;
        private v1 monitorsBuilder_;
        private List<Monitor.Configuration> monitors_;
        private v1 readersBuilder_;
        private List<Reader.Configuration> readers_;

        private void ensureMonitorsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.monitors_ = new ArrayList(this.monitors_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureReadersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.readers_ = new ArrayList(this.readers_);
                this.bitField0_ |= 2;
            }
        }

        private a2 getBpkFieldBuilder() {
            if (this.bpkBuilder_ == null) {
                this.bpkBuilder_ = new a2(getBpk(), getParentForChildren(), isClean());
                this.bpk_ = null;
            }
            return this.bpkBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        private v1 getMonitorsFieldBuilder() {
            if (this.monitorsBuilder_ == null) {
                this.monitorsBuilder_ = new v1(this.monitors_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.monitors_ = null;
            }
            return this.monitorsBuilder_;
        }

        private v1 getReadersFieldBuilder() {
            if (this.readersBuilder_ == null) {
                this.readersBuilder_ = new v1(this.readers_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.readers_ = null;
            }
            return this.readersBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getMonitorsFieldBuilder();
                getReadersFieldBuilder();
            }
        }

        public Builder addAllMonitors(Iterable<? extends Monitor.Configuration> iterable) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureMonitorsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.monitors_);
            onChanged();
            return this;
        }

        public Builder addAllReaders(Iterable<? extends Reader.Configuration> iterable) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureReadersIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.readers_);
            onChanged();
            return this;
        }

        public Builder addMonitors(Monitor.Configuration configuration) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var != null) {
                v1Var.e(configuration);
                return this;
            }
            configuration.getClass();
            ensureMonitorsIsMutable();
            this.monitors_.add(configuration);
            onChanged();
            return this;
        }

        public Monitor.Configuration.Builder addMonitorsBuilder() {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().c(Monitor.Configuration.getDefaultInstance());
        }

        public Builder addReaders(Reader.Configuration configuration) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var != null) {
                v1Var.e(configuration);
                return this;
            }
            configuration.getClass();
            ensureReadersIsMutable();
            this.readers_.add(configuration);
            onChanged();
            return this;
        }

        public Reader.Configuration.Builder addReadersBuilder() {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().c(Reader.Configuration.getDefaultInstance());
        }

        public Builder clearBpk() {
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
                onChanged();
                return this;
            }
            this.bpk_ = null;
            this.bpkBuilder_ = null;
            return this;
        }

        public Builder clearMonitors() {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.monitors_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearReaders() {
            v1 v1Var = this.readersBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.readers_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public StringValue getBpk() {
            a2 a2Var = this.bpkBuilder_;
            if (a2Var != null) {
                return (StringValue) a2Var.e();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getBpkBuilder() {
            onChanged();
            return (StringValue.Builder) getBpkFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public d2 getBpkOrBuilder() {
            a2 a2Var = this.bpkBuilder_;
            if (a2Var != null) {
                return (d2) a2Var.f();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.Configuration getMonitors(int i10) {
            v1 v1Var = this.monitorsBuilder_;
            return v1Var == null ? this.monitors_.get(i10) : (Monitor.Configuration) v1Var.n(i10);
        }

        public Monitor.Configuration.Builder getMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().k(i10);
        }

        public List<Monitor.Configuration.Builder> getMonitorsBuilderList() {
            return getMonitorsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getMonitorsCount() {
            v1 v1Var = this.monitorsBuilder_;
            return v1Var == null ? this.monitors_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Monitor.Configuration> getMonitorsList() {
            v1 v1Var = this.monitorsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.monitors_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
            v1 v1Var = this.monitorsBuilder_;
            return v1Var == null ? this.monitors_.get(i10) : (Monitor.ConfigurationOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
            v1 v1Var = this.monitorsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.monitors_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.Configuration getReaders(int i10) {
            v1 v1Var = this.readersBuilder_;
            return v1Var == null ? this.readers_.get(i10) : (Reader.Configuration) v1Var.n(i10);
        }

        public Reader.Configuration.Builder getReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().k(i10);
        }

        public List<Reader.Configuration.Builder> getReadersBuilderList() {
            return getReadersFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getReadersCount() {
            v1 v1Var = this.readersBuilder_;
            return v1Var == null ? this.readers_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Reader.Configuration> getReadersList() {
            v1 v1Var = this.readersBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.readers_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
            v1 v1Var = this.readersBuilder_;
            return v1Var == null ? this.readers_.get(i10) : (Reader.ConfigurationOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
            v1 v1Var = this.readersBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.readers_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public boolean hasBpk() {
            return (this.bpkBuilder_ == null && this.bpk_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeBpk(StringValue stringValue) {
            a2 a2Var = this.bpkBuilder_;
            if (a2Var != null) {
                a2Var.g(stringValue);
                return this;
            }
            StringValue stringValue2 = this.bpk_;
            if (stringValue2 != null) {
                this.bpk_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
            } else {
                this.bpk_ = stringValue;
            }
            onChanged();
            return this;
        }

        public Builder removeMonitors(int i10) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureMonitorsIsMutable();
            this.monitors_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeReaders(int i10) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureReadersIsMutable();
            this.readers_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setBpk(StringValue stringValue) {
            a2 a2Var = this.bpkBuilder_;
            if (a2Var != null) {
                a2Var.i(stringValue);
                return this;
            }
            stringValue.getClass();
            this.bpk_ = stringValue;
            onChanged();
            return this;
        }

        public Builder setMonitors(int i10, Monitor.Configuration configuration) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, configuration);
                return this;
            }
            configuration.getClass();
            ensureMonitorsIsMutable();
            this.monitors_.set(i10, configuration);
            onChanged();
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration configuration) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, configuration);
                return this;
            }
            configuration.getClass();
            ensureReadersIsMutable();
            this.readers_.set(i10, configuration);
            onChanged();
            return this;
        }

        private Builder() {
            List list = Collections.EMPTY_LIST;
            this.monitors_ = list;
            this.readers_ = list;
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
            int i10 = this.bitField0_;
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var == null) {
                if ((i10 & 1) != 0) {
                    this.monitors_ = DesugarCollections.unmodifiableList(this.monitors_);
                    this.bitField0_ &= -2;
                }
                configuration.monitors_ = this.monitors_;
            } else {
                configuration.monitors_ = v1Var.f();
            }
            v1 v1Var2 = this.readersBuilder_;
            if (v1Var2 != null) {
                configuration.readers_ = v1Var2.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.readers_ = DesugarCollections.unmodifiableList(this.readers_);
                    this.bitField0_ &= -3;
                }
                configuration.readers_ = this.readers_;
            }
            a2 a2Var = this.bpkBuilder_;
            if (a2Var == null) {
                configuration.bpk_ = this.bpk_;
            } else {
                configuration.bpk_ = (StringValue) a2Var.a();
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

        public Monitor.Configuration.Builder addMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().b(i10, Monitor.Configuration.getDefaultInstance());
        }

        public Reader.Configuration.Builder addReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().b(i10, Reader.Configuration.getDefaultInstance());
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
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var == null) {
                this.monitors_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                v1Var.g();
            }
            v1 v1Var2 = this.readersBuilder_;
            if (v1Var2 == null) {
                this.readers_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
            } else {
                v1Var2.g();
            }
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
                return this;
            }
            this.bpk_ = null;
            this.bpkBuilder_ = null;
            return this;
        }

        public Builder setBpk(StringValue.Builder builder) {
            a2 a2Var = this.bpkBuilder_;
            if (a2Var == null) {
                this.bpk_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            List list = Collections.EMPTY_LIST;
            this.monitors_ = list;
            this.readers_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder addMonitors(int i10, Monitor.Configuration configuration) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, configuration);
                onChanged();
                return this;
            }
            v1Var.d(i10, configuration);
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration configuration) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.add(i10, configuration);
                onChanged();
                return this;
            }
            v1Var.d(i10, configuration);
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

        public Builder setMonitors(int i10, Monitor.Configuration.Builder builder) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var == null) {
                ensureMonitorsIsMutable();
                this.monitors_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration.Builder builder) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var == null) {
                ensureReadersIsMutable();
                this.readers_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Configuration configuration) {
            if (configuration == Configuration.getDefaultInstance()) {
                return this;
            }
            if (this.monitorsBuilder_ == null) {
                if (!configuration.monitors_.isEmpty()) {
                    if (this.monitors_.isEmpty()) {
                        this.monitors_ = configuration.monitors_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMonitorsIsMutable();
                        this.monitors_.addAll(configuration.monitors_);
                    }
                    onChanged();
                }
            } else if (!configuration.monitors_.isEmpty()) {
                if (!this.monitorsBuilder_.t()) {
                    this.monitorsBuilder_.a(configuration.monitors_);
                } else {
                    this.monitorsBuilder_.h();
                    this.monitorsBuilder_ = null;
                    this.monitors_ = configuration.monitors_;
                    this.bitField0_ &= -2;
                    this.monitorsBuilder_ = h0.alwaysUseFieldBuilders ? getMonitorsFieldBuilder() : null;
                }
            }
            if (this.readersBuilder_ == null) {
                if (!configuration.readers_.isEmpty()) {
                    if (this.readers_.isEmpty()) {
                        this.readers_ = configuration.readers_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureReadersIsMutable();
                        this.readers_.addAll(configuration.readers_);
                    }
                    onChanged();
                }
            } else if (!configuration.readers_.isEmpty()) {
                if (!this.readersBuilder_.t()) {
                    this.readersBuilder_.a(configuration.readers_);
                } else {
                    this.readersBuilder_.h();
                    this.readersBuilder_ = null;
                    this.readers_ = configuration.readers_;
                    this.bitField0_ &= -3;
                    this.readersBuilder_ = h0.alwaysUseFieldBuilders ? getReadersFieldBuilder() : null;
                }
            }
            if (configuration.hasBpk()) {
                mergeBpk(configuration.getBpk());
            }
            mergeUnknownFields(((h0) configuration).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMonitors(Monitor.Configuration.Builder builder) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addReaders(Reader.Configuration.Builder builder) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var == null) {
                ensureReadersIsMutable();
                this.readers_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addMonitors(int i10, Monitor.Configuration.Builder builder) {
            v1 v1Var = this.monitorsBuilder_;
            if (v1Var == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration.Builder builder) {
            v1 v1Var = this.readersBuilder_;
            if (v1Var == null) {
                ensureReadersIsMutable();
                this.readers_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.sdk.Configuration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Configuration.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Configuration r3 = (io.bidmachine.protobuf.sdk.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Configuration r4 = (io.bidmachine.protobuf.sdk.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Configuration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Configuration$Builder");
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
        List list = Collections.EMPTY_LIST;
        this.monitors_ = list;
        this.readers_ = list;
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

    public static Configuration parseFrom(InputStream inputStream) throws IOException {
        return (Configuration) h0.parseWithIOException(PARSER, inputStream);
    }

    private Configuration(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if ((i10 & 1) == 0) {
                                    this.monitors_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.monitors_.add((Monitor.Configuration) lVar.A(Monitor.Configuration.parser(), wVar));
                            } else if (iK == 18) {
                                if ((i10 & 2) == 0) {
                                    this.readers_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.readers_.add((Reader.Configuration) lVar.A(Reader.Configuration.parser(), wVar));
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                StringValue stringValue = this.bpk_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) lVar.A(StringValue.parser(), wVar);
                                this.bpk_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.bpk_ = builder.buildPartial();
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
                if ((i10 & 1) != 0) {
                    this.monitors_ = DesugarCollections.unmodifiableList(this.monitors_);
                }
                if ((i10 & 2) != 0) {
                    this.readers_ = DesugarCollections.unmodifiableList(this.readers_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.monitors_ = DesugarCollections.unmodifiableList(this.monitors_);
        }
        if ((i10 & 2) != 0) {
            this.readers_ = DesugarCollections.unmodifiableList(this.readers_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
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
