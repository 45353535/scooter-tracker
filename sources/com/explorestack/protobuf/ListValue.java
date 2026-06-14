package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.r2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ListValue extends h0 implements r0 {
    private static final ListValue DEFAULT_INSTANCE = new ListValue();
    private static final p1 PARSER = new b() { // from class: com.explorestack.protobuf.ListValue.1
        @Override // com.explorestack.protobuf.p1
        public ListValue parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new ListValue(lVar, wVar);
        }
    };
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return f2.f19018g;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListValue)) {
            return super.equals(obj);
        }
        ListValue listValue = (ListValue) obj;
        return getValuesList().equals(listValue.getValuesList()) && this.unknownFields.equals(listValue.unknownFields);
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
        int iG = 0;
        for (int i11 = 0; i11 < this.values_.size(); i11++) {
            iG += n.G(1, this.values_.get(i11));
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public Value getValues(int i10) {
        return this.values_.get(i10);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Value> getValuesList() {
        return this.values_;
    }

    public y2 getValuesOrBuilder(int i10) {
        return this.values_.get(i10);
    }

    public List<? extends y2> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getValuesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getValuesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return f2.f19019h.d(ListValue.class, Builder.class);
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
        return new ListValue();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        for (int i10 = 0; i10 < this.values_.size(); i10++) {
            nVar.J0(1, this.values_.get(i10));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements r0 {
        private int bitField0_;
        private v1 valuesBuilder_;
        private List<Value> values_;

        private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.values_ = new ArrayList(this.values_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return f2.f19018g;
        }

        private v1 getValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                this.valuesBuilder_ = new v1(this.values_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getValuesFieldBuilder();
            }
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureValuesIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.values_);
            onChanged();
            return this;
        }

        public Builder addValues(Value value) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var != null) {
                v1Var.e(value);
                return this;
            }
            value.getClass();
            ensureValuesIsMutable();
            this.values_.add(value);
            onChanged();
            return this;
        }

        public Value.Builder addValuesBuilder() {
            return (Value.Builder) getValuesFieldBuilder().c(Value.getDefaultInstance());
        }

        public Builder clearValues() {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.values_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return f2.f19018g;
        }

        public Value getValues(int i10) {
            v1 v1Var = this.valuesBuilder_;
            return v1Var == null ? this.values_.get(i10) : (Value) v1Var.n(i10);
        }

        public Value.Builder getValuesBuilder(int i10) {
            return (Value.Builder) getValuesFieldBuilder().k(i10);
        }

        public List<Value.Builder> getValuesBuilderList() {
            return getValuesFieldBuilder().l();
        }

        public int getValuesCount() {
            v1 v1Var = this.valuesBuilder_;
            return v1Var == null ? this.values_.size() : v1Var.m();
        }

        public List<Value> getValuesList() {
            v1 v1Var = this.valuesBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.values_) : v1Var.p();
        }

        public y2 getValuesOrBuilder(int i10) {
            v1 v1Var = this.valuesBuilder_;
            return v1Var == null ? this.values_.get(i10) : (y2) v1Var.q(i10);
        }

        public List<? extends y2> getValuesOrBuilderList() {
            v1 v1Var = this.valuesBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.values_);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return f2.f19019h.d(ListValue.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeValues(int i10) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureValuesIsMutable();
            this.values_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setValues(int i10, Value value) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, value);
                return this;
            }
            value.getClass();
            ensureValuesIsMutable();
            this.values_.set(i10, value);
            onChanged();
            return this;
        }

        private Builder() {
            this.values_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) listValueBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this);
            int i10 = this.bitField0_;
            v1 v1Var = this.valuesBuilder_;
            if (v1Var == null) {
                if ((i10 & 1) != 0) {
                    this.values_ = DesugarCollections.unmodifiableList(this.values_);
                    this.bitField0_ &= -2;
                }
                listValue.values_ = this.values_;
            } else {
                listValue.values_ = v1Var.f();
            }
            onBuilt();
            return listValue;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
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

        public Value.Builder addValuesBuilder(int i10) {
            return (Value.Builder) getValuesFieldBuilder().b(i10, Value.getDefaultInstance());
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
            v1 v1Var = this.valuesBuilder_;
            if (v1Var == null) {
                this.values_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            v1Var.g();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.values_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addValues(int i10, Value value) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(i10, value);
                onChanged();
                return this;
            }
            v1Var.d(i10, value);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ListValue) {
                return mergeFrom((ListValue) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setValues(int i10, Value.Builder builder) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var == null) {
                ensureValuesIsMutable();
                this.values_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(ListValue listValue) {
            if (listValue == ListValue.getDefaultInstance()) {
                return this;
            }
            if (this.valuesBuilder_ == null) {
                if (!listValue.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = listValue.values_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(listValue.values_);
                    }
                    onChanged();
                }
            } else if (!listValue.values_.isEmpty()) {
                if (!this.valuesBuilder_.t()) {
                    this.valuesBuilder_.a(listValue.values_);
                } else {
                    this.valuesBuilder_.h();
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    this.valuesBuilder_ = h0.alwaysUseFieldBuilders ? getValuesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(listValue.unknownFields);
            onChanged();
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var == null) {
                ensureValuesIsMutable();
                this.values_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addValues(int i10, Value.Builder builder) {
            v1 v1Var = this.valuesBuilder_;
            if (v1Var == null) {
                ensureValuesIsMutable();
                this.values_.add(i10, builder.build());
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
        public com.explorestack.protobuf.ListValue.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.ListValue.access$400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.ListValue r3 = (com.explorestack.protobuf.ListValue) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.ListValue r4 = (com.explorestack.protobuf.ListValue) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.ListValue.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.ListValue$Builder");
        }
    }

    public static Builder newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteBuffer, wVar);
    }

    private ListValue(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (ListValue) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ListValue parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.EMPTY_LIST;
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static ListValue parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(bArr, wVar);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) h0.parseWithIOException(PARSER, inputStream);
    }

    private ListValue(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK != 10) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.values_ = new ArrayList();
                                    z11 = true;
                                }
                                this.values_.add((Value) lVar.A(Value.parser(), wVar));
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
                    this.values_ = DesugarCollections.unmodifiableList(this.values_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.values_ = DesugarCollections.unmodifiableList(this.values_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static ListValue parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (ListValue) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static ListValue parseFrom(l lVar) throws IOException {
        return (ListValue) h0.parseWithIOException(PARSER, lVar);
    }

    public static ListValue parseFrom(l lVar, w wVar) throws IOException {
        return (ListValue) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
