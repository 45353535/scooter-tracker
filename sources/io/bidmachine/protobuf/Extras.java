package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class Extras extends h0 implements ExtrasOrBuilder {
    public static final int INTERNAL_FIELD_NUMBER = 2;
    public static final int PRIVATE_FIELD_NUMBER = 1;
    public static final int PUBLIC_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private Struct internal_;
    private byte memoizedIsInitialized;
    private Struct private_;
    private Struct public_;
    private static final Extras DEFAULT_INSTANCE = new Extras();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.Extras.1
        @Override // com.explorestack.protobuf.p1
        public Extras parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Extras(lVar, wVar);
        }
    };

    public static Extras getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Extras parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Extras) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Extras parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extras)) {
            return super.equals(obj);
        }
        Extras extras = (Extras) obj;
        if (hasPrivate() != extras.hasPrivate()) {
            return false;
        }
        if ((hasPrivate() && !getPrivate().equals(extras.getPrivate())) || hasInternal() != extras.hasInternal()) {
            return false;
        }
        if ((!hasInternal() || getInternal().equals(extras.getInternal())) && hasPublic() == extras.hasPublic()) {
            return (!hasPublic() || getPublic().equals(extras.getPublic())) && this.unknownFields.equals(extras.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getInternal() {
        Struct struct = this.internal_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public e2 getInternalOrBuilder() {
        return getInternal();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getPrivate() {
        Struct struct = this.private_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public e2 getPrivateOrBuilder() {
        return getPrivate();
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getPublic() {
        Struct struct = this.public_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public e2 getPublicOrBuilder() {
        return getPublic();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.private_ != null ? n.G(1, getPrivate()) : 0;
        if (this.internal_ != null) {
            iG += n.G(2, getInternal());
        }
        if (this.public_ != null) {
            iG += n.G(3, getPublic());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasInternal() {
        return this.internal_ != null;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasPrivate() {
        return this.private_ != null;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasPublic() {
        return this.public_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasPrivate()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getPrivate().hashCode();
        }
        if (hasInternal()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getInternal().hashCode();
        }
        if (hasPublic()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getPublic().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_fieldAccessorTable.d(Extras.class, Builder.class);
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
        return new Extras();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.private_ != null) {
            nVar.J0(1, getPrivate());
        }
        if (this.internal_ != null) {
            nVar.J0(2, getInternal());
        }
        if (this.public_ != null) {
            nVar.J0(3, getPublic());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements ExtrasOrBuilder {
        private a2 internalBuilder_;
        private Struct internal_;
        private a2 privateBuilder_;
        private Struct private_;
        private a2 publicBuilder_;
        private Struct public_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
        }

        private a2 getInternalFieldBuilder() {
            if (this.internalBuilder_ == null) {
                this.internalBuilder_ = new a2(getInternal(), getParentForChildren(), isClean());
                this.internal_ = null;
            }
            return this.internalBuilder_;
        }

        private a2 getPrivateFieldBuilder() {
            if (this.privateBuilder_ == null) {
                this.privateBuilder_ = new a2(getPrivate(), getParentForChildren(), isClean());
                this.private_ = null;
            }
            return this.privateBuilder_;
        }

        private a2 getPublicFieldBuilder() {
            if (this.publicBuilder_ == null) {
                this.publicBuilder_ = new a2(getPublic(), getParentForChildren(), isClean());
                this.public_ = null;
            }
            return this.publicBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearInternal() {
            if (this.internalBuilder_ == null) {
                this.internal_ = null;
                onChanged();
                return this;
            }
            this.internal_ = null;
            this.internalBuilder_ = null;
            return this;
        }

        public Builder clearPrivate() {
            if (this.privateBuilder_ == null) {
                this.private_ = null;
                onChanged();
                return this;
            }
            this.private_ = null;
            this.privateBuilder_ = null;
            return this;
        }

        public Builder clearPublic() {
            if (this.publicBuilder_ == null) {
                this.public_ = null;
                onChanged();
                return this;
            }
            this.public_ = null;
            this.publicBuilder_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getInternal() {
            a2 a2Var = this.internalBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.internal_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getInternalBuilder() {
            onChanged();
            return (Struct.Builder) getInternalFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public e2 getInternalOrBuilder() {
            a2 a2Var = this.internalBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.internal_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getPrivate() {
            a2 a2Var = this.privateBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.private_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getPrivateBuilder() {
            onChanged();
            return (Struct.Builder) getPrivateFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public e2 getPrivateOrBuilder() {
            a2 a2Var = this.privateBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.private_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getPublic() {
            a2 a2Var = this.publicBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.public_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getPublicBuilder() {
            onChanged();
            return (Struct.Builder) getPublicFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public e2 getPublicOrBuilder() {
            a2 a2Var = this.publicBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.public_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasInternal() {
            return (this.internalBuilder_ == null && this.internal_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasPrivate() {
            return (this.privateBuilder_ == null && this.private_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasPublic() {
            return (this.publicBuilder_ == null && this.public_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_fieldAccessorTable.d(Extras.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeInternal(Struct struct) {
            a2 a2Var = this.internalBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.internal_;
            if (struct2 != null) {
                this.internal_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.internal_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergePrivate(Struct struct) {
            a2 a2Var = this.privateBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.private_;
            if (struct2 != null) {
                this.private_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.private_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergePublic(Struct struct) {
            a2 a2Var = this.publicBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.public_;
            if (struct2 != null) {
                this.public_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.public_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder setInternal(Struct struct) {
            a2 a2Var = this.internalBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.internal_ = struct;
            onChanged();
            return this;
        }

        public Builder setPrivate(Struct struct) {
            a2 a2Var = this.privateBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.private_ = struct;
            onChanged();
            return this;
        }

        public Builder setPublic(Struct struct) {
            a2 a2Var = this.publicBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.public_ = struct;
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
        public Extras build() {
            Extras extrasBuildPartial = buildPartial();
            if (extrasBuildPartial.isInitialized()) {
                return extrasBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) extrasBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Extras buildPartial() {
            Extras extras = new Extras(this);
            a2 a2Var = this.privateBuilder_;
            if (a2Var == null) {
                extras.private_ = this.private_;
            } else {
                extras.private_ = (Struct) a2Var.a();
            }
            a2 a2Var2 = this.internalBuilder_;
            if (a2Var2 == null) {
                extras.internal_ = this.internal_;
            } else {
                extras.internal_ = (Struct) a2Var2.a();
            }
            a2 a2Var3 = this.publicBuilder_;
            if (a2Var3 == null) {
                extras.public_ = this.public_;
            } else {
                extras.public_ = (Struct) a2Var3.a();
            }
            onBuilt();
            return extras;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Extras getDefaultInstanceForType() {
            return Extras.getDefaultInstance();
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
            if (this.privateBuilder_ == null) {
                this.private_ = null;
            } else {
                this.private_ = null;
                this.privateBuilder_ = null;
            }
            if (this.internalBuilder_ == null) {
                this.internal_ = null;
            } else {
                this.internal_ = null;
                this.internalBuilder_ = null;
            }
            if (this.publicBuilder_ == null) {
                this.public_ = null;
                return this;
            }
            this.public_ = null;
            this.publicBuilder_ = null;
            return this;
        }

        public Builder setInternal(Struct.Builder builder) {
            a2 a2Var = this.internalBuilder_;
            if (a2Var == null) {
                this.internal_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setPrivate(Struct.Builder builder) {
            a2 a2Var = this.privateBuilder_;
            if (a2Var == null) {
                this.private_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setPublic(Struct.Builder builder) {
            a2 a2Var = this.publicBuilder_;
            if (a2Var == null) {
                this.public_ = builder.build();
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
            if (message instanceof Extras) {
                return mergeFrom((Extras) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Extras extras) {
            if (extras == Extras.getDefaultInstance()) {
                return this;
            }
            if (extras.hasPrivate()) {
                mergePrivate(extras.getPrivate());
            }
            if (extras.hasInternal()) {
                mergeInternal(extras.getInternal());
            }
            if (extras.hasPublic()) {
                mergePublic(extras.getPublic());
            }
            mergeUnknownFields(((h0) extras).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.Extras.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.Extras.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.Extras r3 = (io.bidmachine.protobuf.Extras) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.Extras r4 = (io.bidmachine.protobuf.Extras) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.Extras.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.Extras$Builder");
        }
    }

    public static Builder newBuilder(Extras extras) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(extras);
    }

    public static Extras parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Extras(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Extras parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Extras) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Extras parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Extras getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Extras parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Extras() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Extras parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Extras parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Extras) PARSER.parseFrom(bArr, wVar);
    }

    private Extras(l lVar, w wVar) throws InvalidProtocolBufferException {
        Struct.Builder builder;
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
                                Struct struct = this.private_;
                                builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.private_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.private_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                Struct struct3 = this.internal_;
                                builder = struct3 != null ? struct3.toBuilder() : null;
                                Struct struct4 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.internal_ = struct4;
                                if (builder != null) {
                                    builder.mergeFrom(struct4);
                                    this.internal_ = builder.buildPartial();
                                }
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                Struct struct5 = this.public_;
                                builder = struct5 != null ? struct5.toBuilder() : null;
                                Struct struct6 = (Struct) lVar.A(Struct.parser(), wVar);
                                this.public_ = struct6;
                                if (builder != null) {
                                    builder.mergeFrom(struct6);
                                    this.public_ = builder.buildPartial();
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

    public static Extras parseFrom(InputStream inputStream) throws IOException {
        return (Extras) h0.parseWithIOException(PARSER, inputStream);
    }

    public static Extras parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Extras) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Extras parseFrom(l lVar) throws IOException {
        return (Extras) h0.parseWithIOException(PARSER, lVar);
    }

    public static Extras parseFrom(l lVar, w wVar) throws IOException {
        return (Extras) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
