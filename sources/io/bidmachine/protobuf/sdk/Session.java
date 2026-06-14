package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.sdk.ContextualData;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Session extends h0 implements SessionOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final Session DEFAULT_INSTANCE = new Session();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Session.1
        @Override // com.explorestack.protobuf.p1
        public Session parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Session(lVar, wVar);
        }
    };
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Context context_;
    private byte memoizedIsInitialized;
    private volatile Object sessionId_;

    public static final class Context extends h0 implements ContextOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        public static final int IAP_FIELD_NUMBER = 6;
        public static final int LAST_SESSION_DURATION_FIELD_NUMBER = 5;
        public static final int RETENTION_FIELD_NUMBER = 3;
        public static final int SC_FIELD_NUMBER = 2;
        public static final int SESSIONDURATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ContextualData> data_;
        private BoolValue iap_;
        private long lastSessionDuration_;
        private byte memoizedIsInitialized;
        private int retention_;
        private int sc_;
        private long sessionduration_;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Session.Context.1
            @Override // com.explorestack.protobuf.p1
            public Context parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Context(lVar, wVar);
            }
        };

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Context) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return super.equals(obj);
            }
            Context context = (Context) obj;
            if (getSessionduration() == context.getSessionduration() && getSc() == context.getSc() && getRetention() == context.getRetention() && getDataList().equals(context.getDataList()) && getLastSessionDuration() == context.getLastSessionDuration() && hasIap() == context.hasIap()) {
                return (!hasIap() || getIap().equals(context.getIap())) && this.unknownFields.equals(context.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualData getData(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<ContextualData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualDataOrBuilder getDataOrBuilder(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValue getIap() {
            BoolValue boolValue = this.iap_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public g getIapOrBuilder() {
            return getIap();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getLastSessionDuration() {
            return this.lastSessionDuration_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getRetention() {
            return this.retention_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getSc() {
            return this.sc_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.sessionduration_;
            int iA0 = j10 != 0 ? n.a0(1, j10) : 0;
            int i11 = this.sc_;
            if (i11 != 0) {
                iA0 += n.Y(2, i11);
            }
            int i12 = this.retention_;
            if (i12 != 0) {
                iA0 += n.Y(3, i12);
            }
            for (int i13 = 0; i13 < this.data_.size(); i13++) {
                iA0 += n.G(4, this.data_.get(i13));
            }
            long j11 = this.lastSessionDuration_;
            if (j11 != 0) {
                iA0 += n.a0(5, j11);
            }
            if (this.iap_ != null) {
                iA0 += n.G(6, getIap());
            }
            int serializedSize = iA0 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public boolean hasIap() {
            return this.iap_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getSessionduration())) * 37) + 2) * 53) + getSc()) * 37) + 3) * 53) + getRetention();
            if (getDataCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDataList().hashCode();
            }
            int i11 = (((iHashCode * 37) + 5) * 53) + j0.i(getLastSessionDuration());
            if (hasIap()) {
                i11 = (((i11 * 37) + 6) * 53) + getIap().hashCode();
            }
            int iHashCode2 = (i11 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable.d(Context.class, Builder.class);
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
            return new Context();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                nVar.Y0(1, j10);
            }
            int i10 = this.sc_;
            if (i10 != 0) {
                nVar.W0(2, i10);
            }
            int i11 = this.retention_;
            if (i11 != 0) {
                nVar.W0(3, i11);
            }
            for (int i12 = 0; i12 < this.data_.size(); i12++) {
                nVar.J0(4, this.data_.get(i12));
            }
            long j11 = this.lastSessionDuration_;
            if (j11 != 0) {
                nVar.Y0(5, j11);
            }
            if (this.iap_ != null) {
                nVar.J0(6, getIap());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ContextOrBuilder {
            private int bitField0_;
            private v1 dataBuilder_;
            private List<ContextualData> data_;
            private a2 iapBuilder_;
            private BoolValue iap_;
            private long lastSessionDuration_;
            private int retention_;
            private int sc_;
            private long sessionduration_;

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new v1(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            private a2 getIapFieldBuilder() {
                if (this.iapBuilder_ == null) {
                    this.iapBuilder_ = new a2(getIap(), getParentForChildren(), isClean());
                    this.iap_ = null;
                }
                return this.iapBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends ContextualData> iterable) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureDataIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.data_);
                onChanged();
                return this;
            }

            public Builder addData(ContextualData contextualData) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.e(contextualData);
                    return this;
                }
                contextualData.getClass();
                ensureDataIsMutable();
                this.data_.add(contextualData);
                onChanged();
                return this;
            }

            public ContextualData.Builder addDataBuilder() {
                return (ContextualData.Builder) getDataFieldBuilder().c(ContextualData.getDefaultInstance());
            }

            public Builder clearData() {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.data_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearIap() {
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                    onChanged();
                    return this;
                }
                this.iap_ = null;
                this.iapBuilder_ = null;
                return this;
            }

            public Builder clearLastSessionDuration() {
                this.lastSessionDuration_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRetention() {
                this.retention_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSc() {
                this.sc_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualData getData(int i10) {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.get(i10) : (ContextualData) v1Var.n(i10);
            }

            public ContextualData.Builder getDataBuilder(int i10) {
                return (ContextualData.Builder) getDataFieldBuilder().k(i10);
            }

            public List<ContextualData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getDataCount() {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<ContextualData> getDataList() {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.data_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualDataOrBuilder getDataOrBuilder(int i10) {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.get(i10) : (ContextualDataOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
                v1 v1Var = this.dataBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValue getIap() {
                a2 a2Var = this.iapBuilder_;
                if (a2Var != null) {
                    return (BoolValue) a2Var.e();
                }
                BoolValue boolValue = this.iap_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public BoolValue.Builder getIapBuilder() {
                onChanged();
                return (BoolValue.Builder) getIapFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public g getIapOrBuilder() {
                a2 a2Var = this.iapBuilder_;
                if (a2Var != null) {
                    return (g) a2Var.f();
                }
                BoolValue boolValue = this.iap_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getLastSessionDuration() {
                return this.lastSessionDuration_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getRetention() {
                return this.retention_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getSc() {
                return this.sc_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public boolean hasIap() {
                return (this.iapBuilder_ == null && this.iap_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable.d(Context.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeIap(BoolValue boolValue) {
                a2 a2Var = this.iapBuilder_;
                if (a2Var != null) {
                    a2Var.g(boolValue);
                    return this;
                }
                BoolValue boolValue2 = this.iap_;
                if (boolValue2 != null) {
                    this.iap_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                } else {
                    this.iap_ = boolValue;
                }
                onChanged();
                return this;
            }

            public Builder removeData(int i10) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureDataIsMutable();
                this.data_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setData(int i10, ContextualData contextualData) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, contextualData);
                    return this;
                }
                contextualData.getClass();
                ensureDataIsMutable();
                this.data_.set(i10, contextualData);
                onChanged();
                return this;
            }

            public Builder setIap(BoolValue boolValue) {
                a2 a2Var = this.iapBuilder_;
                if (a2Var != null) {
                    a2Var.i(boolValue);
                    return this;
                }
                boolValue.getClass();
                this.iap_ = boolValue;
                onChanged();
                return this;
            }

            public Builder setLastSessionDuration(long j10) {
                this.lastSessionDuration_ = j10;
                onChanged();
                return this;
            }

            public Builder setRetention(int i10) {
                this.retention_ = i10;
                onChanged();
                return this;
            }

            public Builder setSc(int i10) {
                this.sc_ = i10;
                onChanged();
                return this;
            }

            public Builder setSessionduration(long j10) {
                this.sessionduration_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context build() {
                Context contextBuildPartial = buildPartial();
                if (contextBuildPartial.isInitialized()) {
                    return contextBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context buildPartial() {
                Context context = new Context(this);
                context.sessionduration_ = this.sessionduration_;
                context.sc_ = this.sc_;
                context.retention_ = this.retention_;
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    context.data_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = DesugarCollections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    context.data_ = this.data_;
                }
                context.lastSessionDuration_ = this.lastSessionDuration_;
                a2 a2Var = this.iapBuilder_;
                if (a2Var == null) {
                    context.iap_ = this.iap_;
                } else {
                    context.iap_ = (BoolValue) a2Var.a();
                }
                onBuilt();
                return context;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Context getDefaultInstanceForType() {
                return Context.getDefaultInstance();
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

            public ContextualData.Builder addDataBuilder(int i10) {
                return (ContextualData.Builder) getDataFieldBuilder().b(i10, ContextualData.getDefaultInstance());
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
                this.sessionduration_ = 0L;
                this.sc_ = 0;
                this.retention_ = 0;
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    this.data_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    v1Var.g();
                }
                this.lastSessionDuration_ = 0L;
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                    return this;
                }
                this.iap_ = null;
                this.iapBuilder_ = null;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setIap(BoolValue.Builder builder) {
                a2 a2Var = this.iapBuilder_;
                if (a2Var == null) {
                    this.iap_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addData(int i10, ContextualData contextualData) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i10, contextualData);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, contextualData);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Context) {
                    return mergeFrom((Context) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i10, ContextualData.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Context context) {
                if (context == Context.getDefaultInstance()) {
                    return this;
                }
                if (context.getSessionduration() != 0) {
                    setSessionduration(context.getSessionduration());
                }
                if (context.getSc() != 0) {
                    setSc(context.getSc());
                }
                if (context.getRetention() != 0) {
                    setRetention(context.getRetention());
                }
                if (this.dataBuilder_ == null) {
                    if (!context.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = context.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(context.data_);
                        }
                        onChanged();
                    }
                } else if (!context.data_.isEmpty()) {
                    if (!this.dataBuilder_.t()) {
                        this.dataBuilder_.a(context.data_);
                    } else {
                        this.dataBuilder_.h();
                        this.dataBuilder_ = null;
                        this.data_ = context.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = h0.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                if (context.getLastSessionDuration() != 0) {
                    setLastSessionDuration(context.getLastSessionDuration());
                }
                if (context.hasIap()) {
                    mergeIap(context.getIap());
                }
                mergeUnknownFields(((h0) context).unknownFields);
                onChanged();
                return this;
            }

            public Builder addData(ContextualData.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addData(int i10, ContextualData.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.sdk.Session.Context.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Session.Context.access$1200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Session$Context r3 = (io.bidmachine.protobuf.sdk.Session.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Session$Context r4 = (io.bidmachine.protobuf.sdk.Session.Context) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Session.Context.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Session$Context$Builder");
            }
        }

        public static Builder newBuilder(Context context) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
        }

        public static Context parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Context(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Context parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Context) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Context getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Context parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Context() {
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = Collections.EMPTY_LIST;
        }

        public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Context parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Context) PARSER.parseFrom(bArr, wVar);
        }

        public static Context parseFrom(InputStream inputStream) throws IOException {
            return (Context) h0.parseWithIOException(PARSER, inputStream);
        }

        private Context(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK == 8) {
                                this.sessionduration_ = lVar.M();
                            } else if (iK == 16) {
                                this.sc_ = lVar.L();
                            } else if (iK == 24) {
                                this.retention_ = lVar.L();
                            } else if (iK == 34) {
                                if (!z11) {
                                    this.data_ = new ArrayList();
                                    z11 = true;
                                }
                                this.data_.add((ContextualData) lVar.A(ContextualData.parser(), wVar));
                            } else if (iK == 40) {
                                this.lastSessionDuration_ = lVar.M();
                            } else if (iK != 50) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                BoolValue boolValue = this.iap_;
                                BoolValue.Builder builder = boolValue != null ? boolValue.toBuilder() : null;
                                BoolValue boolValue2 = (BoolValue) lVar.A(BoolValue.parser(), wVar);
                                this.iap_ = boolValue2;
                                if (builder != null) {
                                    builder.mergeFrom(boolValue2);
                                    this.iap_ = builder.buildPartial();
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
                    if (z11) {
                        this.data_ = DesugarCollections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.data_ = DesugarCollections.unmodifiableList(this.data_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Context parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Context) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Context parseFrom(l lVar) throws IOException {
            return (Context) h0.parseWithIOException(PARSER, lVar);
        }

        public static Context parseFrom(l lVar, w wVar) throws IOException {
            return (Context) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ContextOrBuilder extends MessageOrBuilder {
        ContextualData getData(int i10);

        int getDataCount();

        List<ContextualData> getDataList();

        ContextualDataOrBuilder getDataOrBuilder(int i10);

        List<? extends ContextualDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        BoolValue getIap();

        g getIapOrBuilder();

        long getLastSessionDuration();

        int getRetention();

        int getSc();

        long getSessionduration();

        boolean hasIap();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Session getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Session parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Session) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Session parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return super.equals(obj);
        }
        Session session = (Session) obj;
        if (getSessionId().equals(session.getSessionId()) && hasContext() == session.hasContext()) {
            return (!hasContext() || getContext().equals(session.getContext())) && this.unknownFields.equals(session.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ContextOrBuilder getContextOrBuilder() {
        return getContext();
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
        int iComputeStringSize = !getSessionIdBytes().isEmpty() ? h0.computeStringSize(1, this.sessionId_) : 0;
        if (this.context_ != null) {
            iComputeStringSize += n.G(2, getContext());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSessionId().hashCode();
        if (hasContext()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getContext().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable.d(Session.class, Builder.class);
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
        return new Session();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getSessionIdBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.sessionId_);
        }
        if (this.context_ != null) {
            nVar.J0(2, getContext());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements SessionOrBuilder {
        private a2 contextBuilder_;
        private Context context_;
        private Object sessionId_;

        private a2 getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new a2(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = Session.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public Context getContext() {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                return (Context) a2Var.e();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return (Context.Builder) getContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public ContextOrBuilder getContextOrBuilder() {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                return (ContextOrBuilder) a2Var.f();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable.d(Session.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeContext(Context context) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                a2Var.g(context);
                return this;
            }
            Context context2 = this.context_;
            if (context2 != null) {
                this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
            } else {
                this.context_ = context;
            }
            onChanged();
            return this;
        }

        public Builder setContext(Context context) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                a2Var.i(context);
                return this;
            }
            context.getClass();
            this.context_ = context;
            onChanged();
            return this;
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session build() {
            Session sessionBuildPartial = buildPartial();
            if (sessionBuildPartial.isInitialized()) {
                return sessionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session buildPartial() {
            Session session = new Session(this);
            session.sessionId_ = this.sessionId_;
            a2 a2Var = this.contextBuilder_;
            if (a2Var == null) {
                session.context_ = this.context_;
            } else {
                session.context_ = (Context) a2Var.a();
            }
            onBuilt();
            return session;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Session getDefaultInstanceForType() {
            return Session.getDefaultInstance();
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
            this.sessionId_ = "";
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setContext(Context.Builder builder) {
            a2 a2Var = this.contextBuilder_;
            if (a2Var == null) {
                this.context_ = builder.build();
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
            if (message instanceof Session) {
                return mergeFrom((Session) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Session session) {
            if (session == Session.getDefaultInstance()) {
                return this;
            }
            if (!session.getSessionId().isEmpty()) {
                this.sessionId_ = session.sessionId_;
                onChanged();
            }
            if (session.hasContext()) {
                mergeContext(session.getContext());
            }
            mergeUnknownFields(((h0) session).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.Session.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Session.access$2100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Session r3 = (io.bidmachine.protobuf.sdk.Session) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Session r4 = (io.bidmachine.protobuf.sdk.Session) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Session.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Session$Builder");
        }
    }

    public static Builder newBuilder(Session session) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
    }

    public static Session parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Session(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Session parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Session) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Session parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Session getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Session parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Session() {
        this.memoizedIsInitialized = (byte) -1;
        this.sessionId_ = "";
    }

    public static Session parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Session parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(bArr, wVar);
    }

    public static Session parseFrom(InputStream inputStream) throws IOException {
        return (Session) h0.parseWithIOException(PARSER, inputStream);
    }

    private Session(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            this.sessionId_ = lVar.J();
                        } else if (iK != 18) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Context context = this.context_;
                            Context.Builder builder = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) lVar.A(Context.parser(), wVar);
                            this.context_ = context2;
                            if (builder != null) {
                                builder.mergeFrom(context2);
                                this.context_ = builder.buildPartial();
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

    public static Session parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Session) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Session parseFrom(l lVar) throws IOException {
        return (Session) h0.parseWithIOException(PARSER, lVar);
    }

    public static Session parseFrom(l lVar, w wVar) throws IOException {
        return (Session) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
