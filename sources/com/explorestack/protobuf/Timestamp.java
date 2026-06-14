package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.r2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class Timestamp extends h0 implements j2 {
    public static final int NANOS_FIELD_NUMBER = 2;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int nanos_;
    private long seconds_;
    private static final Timestamp DEFAULT_INSTANCE = new Timestamp();
    private static final p1 PARSER = new b() { // from class: com.explorestack.protobuf.Timestamp.1
        @Override // com.explorestack.protobuf.p1
        public Timestamp parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Timestamp(lVar, wVar);
        }
    };

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return k2.f19143a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Timestamp) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Timestamp) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return super.equals(obj);
        }
        Timestamp timestamp = (Timestamp) obj;
        return getSeconds() == timestamp.getSeconds() && getNanos() == timestamp.getNanos() && this.unknownFields.equals(timestamp.unknownFields);
    }

    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        long j10 = this.seconds_;
        int iZ = j10 != 0 ? n.z(1, j10) : 0;
        int i11 = this.nanos_;
        if (i11 != 0) {
            iZ += n.x(2, i11);
        }
        int serializedSize = iZ + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getSeconds())) * 37) + 2) * 53) + getNanos()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return k2.f19144b.d(Timestamp.class, Builder.class);
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
        return new Timestamp();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        long j10 = this.seconds_;
        if (j10 != 0) {
            nVar.H0(1, j10);
        }
        int i10 = this.nanos_;
        if (i10 != 0) {
            nVar.F0(2, i10);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements j2 {
        private int nanos_;
        private long seconds_;

        public static final Descriptors.Descriptor getDescriptor() {
            return k2.f19143a;
        }

        private void maybeForceBuilderInitialization() {
            boolean z10 = h0.alwaysUseFieldBuilders;
        }

        public Builder clearNanos() {
            this.nanos_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSeconds() {
            this.seconds_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return k2.f19143a;
        }

        public int getNanos() {
            return this.nanos_;
        }

        public long getSeconds() {
            return this.seconds_;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return k2.f19144b.d(Timestamp.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setNanos(int i10) {
            this.nanos_ = i10;
            onChanged();
            return this;
        }

        public Builder setSeconds(long j10) {
            this.seconds_ = j10;
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
        public Timestamp build() {
            Timestamp timestampBuildPartial = buildPartial();
            if (timestampBuildPartial.isInitialized()) {
                return timestampBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) timestampBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Timestamp buildPartial() {
            Timestamp timestamp = new Timestamp(this);
            timestamp.seconds_ = this.seconds_;
            timestamp.nanos_ = this.nanos_;
            onBuilt();
            return timestamp;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Timestamp getDefaultInstanceForType() {
            return Timestamp.getDefaultInstance();
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
            this.seconds_ = 0L;
            this.nanos_ = 0;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Timestamp) {
                return mergeFrom((Timestamp) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Timestamp timestamp) {
            if (timestamp == Timestamp.getDefaultInstance()) {
                return this;
            }
            if (timestamp.getSeconds() != 0) {
                setSeconds(timestamp.getSeconds());
            }
            if (timestamp.getNanos() != 0) {
                setNanos(timestamp.getNanos());
            }
            mergeUnknownFields(timestamp.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.Timestamp.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.Timestamp.access$500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.Timestamp r3 = (com.explorestack.protobuf.Timestamp) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.Timestamp r4 = (com.explorestack.protobuf.Timestamp) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.Timestamp.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.Timestamp$Builder");
        }
    }

    public static Builder newBuilder(Timestamp timestamp) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(timestamp);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Timestamp) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Timestamp(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Timestamp) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Timestamp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Timestamp) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Timestamp getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Timestamp parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Timestamp) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Timestamp() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Timestamp) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Timestamp parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Timestamp) PARSER.parseFrom(bArr, wVar);
    }

    private Timestamp(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            this.seconds_ = lVar.z();
                        } else if (iK != 16) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.nanos_ = lVar.y();
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

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
        return (Timestamp) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Timestamp) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Timestamp parseFrom(l lVar) throws IOException {
        return (Timestamp) h0.parseWithIOException(PARSER, lVar);
    }

    public static Timestamp parseFrom(l lVar, w wVar) throws IOException {
        return (Timestamp) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
