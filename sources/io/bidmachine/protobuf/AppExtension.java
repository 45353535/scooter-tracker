package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public final class AppExtension extends h0 implements AppExtensionOrBuilder {
    public static final int INSTALL_TIME_FIELD_NUMBER = 1;
    public static final int UPTIME_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Timestamp installTime_;
    private byte memoizedIsInitialized;
    private long uptime_;
    private static final AppExtension DEFAULT_INSTANCE = new AppExtension();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.AppExtension.1
        @Override // com.explorestack.protobuf.p1
        public AppExtension parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new AppExtension(lVar, wVar);
        }
    };

    public static AppExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AppExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AppExtension) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AppExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppExtension)) {
            return super.equals(obj);
        }
        AppExtension appExtension = (AppExtension) obj;
        if (hasInstallTime() != appExtension.hasInstallTime()) {
            return false;
        }
        return (!hasInstallTime() || getInstallTime().equals(appExtension.getInstallTime())) && getUptime() == appExtension.getUptime() && this.unknownFields.equals(appExtension.unknownFields);
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public Timestamp getInstallTime() {
        Timestamp timestamp = this.installTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public j2 getInstallTimeOrBuilder() {
        return getInstallTime();
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
        int iG = this.installTime_ != null ? n.G(1, getInstallTime()) : 0;
        long j10 = this.uptime_;
        if (j10 != 0) {
            iG += n.a0(2, j10);
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public long getUptime() {
        return this.uptime_;
    }

    @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
    public boolean hasInstallTime() {
        return this.installTime_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasInstallTime()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getInstallTime().hashCode();
        }
        int i11 = (((((iHashCode * 37) + 2) * 53) + j0.i(getUptime())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_fieldAccessorTable.d(AppExtension.class, Builder.class);
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
        return new AppExtension();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.installTime_ != null) {
            nVar.J0(1, getInstallTime());
        }
        long j10 = this.uptime_;
        if (j10 != 0) {
            nVar.Y0(2, j10);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements AppExtensionOrBuilder {
        private a2 installTimeBuilder_;
        private Timestamp installTime_;
        private long uptime_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
        }

        private a2 getInstallTimeFieldBuilder() {
            if (this.installTimeBuilder_ == null) {
                this.installTimeBuilder_ = new a2(getInstallTime(), getParentForChildren(), isClean());
                this.installTime_ = null;
            }
            return this.installTimeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearInstallTime() {
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
                onChanged();
                return this;
            }
            this.installTime_ = null;
            this.installTimeBuilder_ = null;
            return this;
        }

        public Builder clearUptime() {
            this.uptime_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public Timestamp getInstallTime() {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                return (Timestamp) a2Var.e();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public j2 getInstallTimeOrBuilder() {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                return (j2) a2Var.f();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public long getUptime() {
            return this.uptime_;
        }

        @Override // io.bidmachine.protobuf.AppExtensionOrBuilder
        public boolean hasInstallTime() {
            return (this.installTimeBuilder_ == null && this.installTime_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_fieldAccessorTable.d(AppExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeInstallTime(Timestamp timestamp) {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                a2Var.g(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.installTime_;
            if (timestamp2 != null) {
                this.installTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.installTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder setInstallTime(Timestamp timestamp) {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var != null) {
                a2Var.i(timestamp);
                return this;
            }
            timestamp.getClass();
            this.installTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setUptime(long j10) {
            this.uptime_ = j10;
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
        public AppExtension build() {
            AppExtension appExtensionBuildPartial = buildPartial();
            if (appExtensionBuildPartial.isInitialized()) {
                return appExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) appExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AppExtension buildPartial() {
            AppExtension appExtension = new AppExtension(this);
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var == null) {
                appExtension.installTime_ = this.installTime_;
            } else {
                appExtension.installTime_ = (Timestamp) a2Var.a();
            }
            appExtension.uptime_ = this.uptime_;
            onBuilt();
            return appExtension;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public AppExtension getDefaultInstanceForType() {
            return AppExtension.getDefaultInstance();
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
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            this.uptime_ = 0L;
            return this;
        }

        public Builder setInstallTime(Timestamp.Builder builder) {
            a2 a2Var = this.installTimeBuilder_;
            if (a2Var == null) {
                this.installTime_ = builder.build();
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
            if (message instanceof AppExtension) {
                return mergeFrom((AppExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AppExtension appExtension) {
            if (appExtension == AppExtension.getDefaultInstance()) {
                return this;
            }
            if (appExtension.hasInstallTime()) {
                mergeInstallTime(appExtension.getInstallTime());
            }
            if (appExtension.getUptime() != 0) {
                setUptime(appExtension.getUptime());
            }
            mergeUnknownFields(((h0) appExtension).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.AppExtension.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.AppExtension.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.AppExtension r3 = (io.bidmachine.protobuf.AppExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.AppExtension r4 = (io.bidmachine.protobuf.AppExtension) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AppExtension.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.AppExtension$Builder");
        }
    }

    public static Builder newBuilder(AppExtension appExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(appExtension);
    }

    public static AppExtension parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteBuffer, wVar);
    }

    private AppExtension(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AppExtension parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (AppExtension) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static AppExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AppExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AppExtension parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AppExtension() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AppExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static AppExtension parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (AppExtension) PARSER.parseFrom(bArr, wVar);
    }

    private AppExtension(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            Timestamp timestamp = this.installTime_;
                            Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                            this.installTime_ = timestamp2;
                            if (builder != null) {
                                builder.mergeFrom(timestamp2);
                                this.installTime_ = builder.buildPartial();
                            }
                        } else if (iK != 16) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.uptime_ = lVar.M();
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

    public static AppExtension parseFrom(InputStream inputStream) throws IOException {
        return (AppExtension) h0.parseWithIOException(PARSER, inputStream);
    }

    public static AppExtension parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (AppExtension) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static AppExtension parseFrom(l lVar) throws IOException {
        return (AppExtension) h0.parseWithIOException(PARSER, lVar);
    }

    public static AppExtension parseFrom(l lVar, w wVar) throws IOException {
        return (AppExtension) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
