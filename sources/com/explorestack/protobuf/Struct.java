package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.z2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Struct extends h0 implements e2 {
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private w0 fields_;
    private byte memoizedIsInitialized;
    private static final Struct DEFAULT_INSTANCE = new Struct();
    private static final p1 PARSER = new b() { // from class: com.explorestack.protobuf.Struct.1
        @Override // com.explorestack.protobuf.p1
        public Struct parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Struct(lVar, wVar);
        }
    };

    private static final class FieldsDefaultEntryHolder {
        static final u0 defaultEntry = u0.n(f2.f19014c, z2.b.f19481l, "", z2.b.f19483n, Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return f2.f19012a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetFields() {
        w0 w0Var = this.fields_;
        return w0Var == null ? w0.g(FieldsDefaultEntryHolder.defaultEntry) : w0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().i().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Struct)) {
            return super.equals(obj);
        }
        Struct struct = (Struct) obj;
        return internalGetFields().equals(struct.internalGetFields()) && this.unknownFields.equals(struct.unknownFields);
    }

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().i().size();
    }

    public Map<String, Value> getFieldsMap() {
        return internalGetFields().i();
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map mapI = internalGetFields().i();
        return mapI.containsKey(str) ? (Value) mapI.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetFields().i();
        if (mapI.containsKey(str)) {
            return (Value) mapI.get(str);
        }
        throw new IllegalArgumentException();
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
        for (Map.Entry entry : internalGetFields().i().entrySet()) {
            iG += n.G(1, FieldsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
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
        int iHashCode = 779 + getDescriptor().hashCode();
        if (!internalGetFields().i().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return f2.f19013b.d(Struct.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.h0
    protected w0 internalGetMapField(int i10) {
        if (i10 == 1) {
            return internalGetFields();
        }
        throw new RuntimeException("Invalid map field number: " + i10);
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
        return new Struct();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        h0.serializeStringMapTo(nVar, internalGetFields(), FieldsDefaultEntryHolder.defaultEntry, 1);
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements e2 {
        private int bitField0_;
        private w0 fields_;

        public static final Descriptors.Descriptor getDescriptor() {
            return f2.f19012a;
        }

        private w0 internalGetFields() {
            w0 w0Var = this.fields_;
            return w0Var == null ? w0.g(FieldsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private w0 internalGetMutableFields() {
            onChanged();
            if (this.fields_ == null) {
                this.fields_ = w0.p(FieldsDefaultEntryHolder.defaultEntry);
            }
            if (!this.fields_.m()) {
                this.fields_ = this.fields_.f();
            }
            return this.fields_;
        }

        private void maybeForceBuilderInitialization() {
            boolean z10 = h0.alwaysUseFieldBuilders;
        }

        public Builder clearFields() {
            internalGetMutableFields().l().clear();
            return this;
        }

        public boolean containsFields(String str) {
            str.getClass();
            return internalGetFields().i().containsKey(str);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return f2.f19012a;
        }

        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        public int getFieldsCount() {
            return internalGetFields().i().size();
        }

        public Map<String, Value> getFieldsMap() {
            return internalGetFields().i();
        }

        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map mapI = internalGetFields().i();
            return mapI.containsKey(str) ? (Value) mapI.get(str) : value;
        }

        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetFields().i();
            if (mapI.containsKey(str)) {
                return (Value) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            return internalGetMutableFields().l();
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return f2.f19013b.d(Struct.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMapField(int i10) {
            if (i10 == 1) {
                return internalGetFields();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMutableMapField(int i10) {
            if (i10 == 1) {
                return internalGetMutableFields();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllFields(Map<String, Value> map) {
            internalGetMutableFields().l().putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            internalGetMutableFields().l().put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            internalGetMutableFields().l().remove(str);
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
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) structBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Struct buildPartial() {
            Struct struct = new Struct(this);
            struct.fields_ = internalGetFields();
            struct.fields_.n();
            onBuilt();
            return struct;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Struct getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
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
            internalGetMutableFields().a();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Struct) {
                return mergeFrom((Struct) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().o(struct.internalGetFields());
            mergeUnknownFields(struct.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.Struct.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.Struct.access$500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.Struct r3 = (com.explorestack.protobuf.Struct) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.Struct r4 = (com.explorestack.protobuf.Struct) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.Struct.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.Struct$Builder");
        }
    }

    public static Builder newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Struct(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Struct) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Struct getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Struct parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Struct parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr, wVar);
    }

    private Struct(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.fields_ = w0.p(FieldsDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                u0 u0Var = (u0) lVar.A(FieldsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                this.fields_.l().put(u0Var.i(), u0Var.k());
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

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Struct) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Struct parseFrom(l lVar) throws IOException {
        return (Struct) h0.parseWithIOException(PARSER, lVar);
    }

    public static Struct parseFrom(l lVar, w wVar) throws IOException {
        return (Struct) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
