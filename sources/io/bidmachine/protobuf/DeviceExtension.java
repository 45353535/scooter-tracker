package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
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
public final class DeviceExtension extends h0 implements DeviceExtensionOrBuilder {
    public static final int BATTERY_FIELD_NUMBER = 1;
    private static final DeviceExtension DEFAULT_INSTANCE = new DeviceExtension();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.DeviceExtension.1
        @Override // com.explorestack.protobuf.p1
        public DeviceExtension parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new DeviceExtension(lVar, wVar);
        }
    };
    public static final int ROOTED_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int battery_;
    private byte memoizedIsInitialized;
    private boolean rooted_;

    public static DeviceExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DeviceExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeviceExtension) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DeviceExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceExtension)) {
            return super.equals(obj);
        }
        DeviceExtension deviceExtension = (DeviceExtension) obj;
        return getBattery() == deviceExtension.getBattery() && getRooted() == deviceExtension.getRooted() && this.unknownFields.equals(deviceExtension.unknownFields);
    }

    @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
    public int getBattery() {
        return this.battery_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
    public boolean getRooted() {
        return this.rooted_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.battery_;
        int iY = i11 != 0 ? n.Y(1, i11) : 0;
        boolean z10 = this.rooted_;
        if (z10) {
            iY += n.e(2, z10);
        }
        int serializedSize = iY + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBattery()) * 37) + 2) * 53) + j0.d(getRooted())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_fieldAccessorTable.d(DeviceExtension.class, Builder.class);
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
        return new DeviceExtension();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        int i10 = this.battery_;
        if (i10 != 0) {
            nVar.W0(1, i10);
        }
        boolean z10 = this.rooted_;
        if (z10) {
            nVar.n0(2, z10);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements DeviceExtensionOrBuilder {
        private int battery_;
        private boolean rooted_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearBattery() {
            this.battery_ = 0;
            onChanged();
            return this;
        }

        public Builder clearRooted() {
            this.rooted_ = false;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
        public int getBattery() {
            return this.battery_;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.DeviceExtensionOrBuilder
        public boolean getRooted() {
            return this.rooted_;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_fieldAccessorTable.d(DeviceExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setBattery(int i10) {
            this.battery_ = i10;
            onChanged();
            return this;
        }

        public Builder setRooted(boolean z10) {
            this.rooted_ = z10;
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
        public DeviceExtension build() {
            DeviceExtension deviceExtensionBuildPartial = buildPartial();
            if (deviceExtensionBuildPartial.isInitialized()) {
                return deviceExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public DeviceExtension buildPartial() {
            DeviceExtension deviceExtension = new DeviceExtension(this);
            deviceExtension.battery_ = this.battery_;
            deviceExtension.rooted_ = this.rooted_;
            onBuilt();
            return deviceExtension;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public DeviceExtension getDefaultInstanceForType() {
            return DeviceExtension.getDefaultInstance();
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
            this.battery_ = 0;
            this.rooted_ = false;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof DeviceExtension) {
                return mergeFrom((DeviceExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DeviceExtension deviceExtension) {
            if (deviceExtension == DeviceExtension.getDefaultInstance()) {
                return this;
            }
            if (deviceExtension.getBattery() != 0) {
                setBattery(deviceExtension.getBattery());
            }
            if (deviceExtension.getRooted()) {
                setRooted(deviceExtension.getRooted());
            }
            mergeUnknownFields(((h0) deviceExtension).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.DeviceExtension.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.DeviceExtension.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.DeviceExtension r3 = (io.bidmachine.protobuf.DeviceExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.DeviceExtension r4 = (io.bidmachine.protobuf.DeviceExtension) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.DeviceExtension.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.DeviceExtension$Builder");
        }
    }

    public static Builder newBuilder(DeviceExtension deviceExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceExtension);
    }

    public static DeviceExtension parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteBuffer, wVar);
    }

    private DeviceExtension(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DeviceExtension parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (DeviceExtension) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static DeviceExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public DeviceExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static DeviceExtension parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private DeviceExtension() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static DeviceExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static DeviceExtension parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (DeviceExtension) PARSER.parseFrom(bArr, wVar);
    }

    private DeviceExtension(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            this.battery_ = lVar.L();
                        } else if (iK != 16) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.rooted_ = lVar.q();
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

    public static DeviceExtension parseFrom(InputStream inputStream) throws IOException {
        return (DeviceExtension) h0.parseWithIOException(PARSER, inputStream);
    }

    public static DeviceExtension parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (DeviceExtension) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static DeviceExtension parseFrom(l lVar) throws IOException {
        return (DeviceExtension) h0.parseWithIOException(PARSER, lVar);
    }

    public static DeviceExtension parseFrom(l lVar, w wVar) throws IOException {
        return (DeviceExtension) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
