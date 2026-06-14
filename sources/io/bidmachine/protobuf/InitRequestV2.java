package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.c;
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
public final class InitRequestV2 extends h0 implements InitRequestV2OrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    public static final int EXT_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Context context_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private static final InitRequestV2 DEFAULT_INSTANCE = new InitRequestV2();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.InitRequestV2.1
        @Override // com.explorestack.protobuf.p1
        public InitRequestV2 parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new InitRequestV2(lVar, wVar);
        }
    };

    public static InitRequestV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequestV2_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InitRequestV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitRequestV2) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitRequestV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InitRequestV2) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitRequestV2)) {
            return super.equals(obj);
        }
        InitRequestV2 initRequestV2 = (InitRequestV2) obj;
        if (hasContext() != initRequestV2.hasContext()) {
            return false;
        }
        if ((!hasContext() || getContext().equals(initRequestV2.getContext())) && hasExt() == initRequestV2.hasExt()) {
            return (!hasExt() || getExt().equals(initRequestV2.getExt())) && this.unknownFields.equals(initRequestV2.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
    public c getContextOrBuilder() {
        return getContext();
    }

    @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
    public e2 getExtOrBuilder() {
        return getExt();
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
        int iG = this.context_ != null ? n.G(1, getContext()) : 0;
        if (this.ext_ != null) {
            iG += n.G(2, getExt());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasContext()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getContext().hashCode();
        }
        if (hasExt()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getExt().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequestV2_fieldAccessorTable.d(InitRequestV2.class, Builder.class);
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
        return new InitRequestV2();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.context_ != null) {
            nVar.J0(1, getContext());
        }
        if (this.ext_ != null) {
            nVar.J0(2, getExt());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements InitRequestV2OrBuilder {
        private a2 contextBuilder_;
        private Context context_;
        private a2 extBuilder_;
        private Struct ext_;

        private a2 getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new a2(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequestV2_descriptor;
        }

        private a2 getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
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

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
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

        @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
        public c getContextOrBuilder() {
            a2 a2Var = this.contextBuilder_;
            if (a2Var != null) {
                return (c) a2Var.f();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequestV2_descriptor;
        }

        @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
        public Struct getExt() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
        public e2 getExtOrBuilder() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestV2OrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequestV2_fieldAccessorTable.d(InitRequestV2.class, Builder.class);
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

        public Builder mergeExt(Struct struct) {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.ext_;
            if (struct2 != null) {
                this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.ext_ = struct;
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

        public Builder setExt(Struct struct) {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.ext_ = struct;
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
        public InitRequestV2 build() {
            InitRequestV2 initRequestV2BuildPartial = buildPartial();
            if (initRequestV2BuildPartial.isInitialized()) {
                return initRequestV2BuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) initRequestV2BuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitRequestV2 buildPartial() {
            InitRequestV2 initRequestV2 = new InitRequestV2(this);
            a2 a2Var = this.contextBuilder_;
            if (a2Var == null) {
                initRequestV2.context_ = this.context_;
            } else {
                initRequestV2.context_ = (Context) a2Var.a();
            }
            a2 a2Var2 = this.extBuilder_;
            if (a2Var2 == null) {
                initRequestV2.ext_ = this.ext_;
            } else {
                initRequestV2.ext_ = (Struct) a2Var2.a();
            }
            onBuilt();
            return initRequestV2;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public InitRequestV2 getDefaultInstanceForType() {
            return InitRequestV2.getDefaultInstance();
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
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
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

        public Builder setExt(Struct.Builder builder) {
            a2 a2Var = this.extBuilder_;
            if (a2Var == null) {
                this.ext_ = builder.build();
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
            if (message instanceof InitRequestV2) {
                return mergeFrom((InitRequestV2) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(InitRequestV2 initRequestV2) {
            if (initRequestV2 == InitRequestV2.getDefaultInstance()) {
                return this;
            }
            if (initRequestV2.hasContext()) {
                mergeContext(initRequestV2.getContext());
            }
            if (initRequestV2.hasExt()) {
                mergeExt(initRequestV2.getExt());
            }
            mergeUnknownFields(((h0) initRequestV2).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.InitRequestV2.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.InitRequestV2.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.InitRequestV2 r3 = (io.bidmachine.protobuf.InitRequestV2) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.InitRequestV2 r4 = (io.bidmachine.protobuf.InitRequestV2) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitRequestV2.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.InitRequestV2$Builder");
        }
    }

    public static Builder newBuilder(InitRequestV2 initRequestV2) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initRequestV2);
    }

    public static InitRequestV2 parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (InitRequestV2) PARSER.parseFrom(byteBuffer, wVar);
    }

    private InitRequestV2(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static InitRequestV2 parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (InitRequestV2) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static InitRequestV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InitRequestV2) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public InitRequestV2 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InitRequestV2 parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (InitRequestV2) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private InitRequestV2() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static InitRequestV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InitRequestV2) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static InitRequestV2 parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (InitRequestV2) PARSER.parseFrom(bArr, wVar);
    }

    private InitRequestV2(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            Context context = this.context_;
                            Context.Builder builder = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) lVar.A(Context.parser(), wVar);
                            this.context_ = context2;
                            if (builder != null) {
                                builder.mergeFrom(context2);
                                this.context_ = builder.buildPartial();
                            }
                        } else if (iK != 18) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Struct struct = this.ext_;
                            Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder2 != null) {
                                builder2.mergeFrom(struct2);
                                this.ext_ = builder2.buildPartial();
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

    public static InitRequestV2 parseFrom(InputStream inputStream) throws IOException {
        return (InitRequestV2) h0.parseWithIOException(PARSER, inputStream);
    }

    public static InitRequestV2 parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (InitRequestV2) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static InitRequestV2 parseFrom(l lVar) throws IOException {
        return (InitRequestV2) h0.parseWithIOException(PARSER, lVar);
    }

    public static InitRequestV2 parseFrom(l lVar, w wVar) throws IOException {
        return (InitRequestV2) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
