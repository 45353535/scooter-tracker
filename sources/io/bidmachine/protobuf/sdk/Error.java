package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Error extends h0 implements ErrorOrBuilder {
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private Data error_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Data reason_;
    private static final Error DEFAULT_INSTANCE = new Error();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Error.1
        @Override // com.explorestack.protobuf.p1
        public Error parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Error(lVar, wVar);
        }
    };

    public static final class Data extends h0 implements DataOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int code_;
        private volatile Object description_;
        private byte memoizedIsInitialized;
        private static final Data DEFAULT_INSTANCE = new Data();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Error.Data.1
            @Override // com.explorestack.protobuf.p1
            public Data parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Data(lVar, wVar);
            }
        };

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            return getCode() == data.getCode() && getDescription().equals(data.getDescription()) && this.unknownFields.equals(data.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.description_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int i11 = this.code_;
            int iR = i11 != 0 ? n.R(1, i11) : 0;
            if (!getDescriptionBytes().isEmpty()) {
                iR += h0.computeStringSize(2, this.description_);
            }
            int serializedSize = iR + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable.d(Data.class, Builder.class);
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
            return new Data();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            int i10 = this.code_;
            if (i10 != 0) {
                nVar.Q0(1, i10);
            }
            if (!getDescriptionBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.description_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements DataOrBuilder {
            private int code_;
            private Object description_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.description_ = Data.getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable.d(Data.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCode(int i10) {
                this.code_ = i10;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.description_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data build() {
                Data dataBuildPartial = buildPartial();
                if (dataBuildPartial.isInitialized()) {
                    return dataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                data.code_ = this.code_;
                data.description_ = this.description_;
                onBuilt();
                return data;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return Data.getDefaultInstance();
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
                this.code_ = 0;
                this.description_ = "";
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (data.getCode() != 0) {
                    setCode(data.getCode());
                }
                if (!data.getDescription().isEmpty()) {
                    this.description_ = data.description_;
                    onChanged();
                }
                mergeUnknownFields(((h0) data).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.Error.Data.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Error.Data.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Error$Data r3 = (io.bidmachine.protobuf.sdk.Error.Data) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Error$Data r4 = (io.bidmachine.protobuf.sdk.Error.Data) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Error.Data.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Error$Data$Builder");
            }
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Data(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Data parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Data) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Data parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Data() {
            this.memoizedIsInitialized = (byte) -1;
            this.description_ = "";
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Data parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr, wVar);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, inputStream);
        }

        private Data(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.code_ = lVar.G();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.description_ = lVar.J();
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

        public static Data parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Data parseFrom(l lVar) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, lVar);
        }

        public static Data parseFrom(l lVar, w wVar) throws IOException {
            return (Data) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface DataOrBuilder extends MessageOrBuilder {
        int getCode();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getDescription();

        ByteString getDescriptionBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Error getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Error) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return super.equals(obj);
        }
        Error error = (Error) obj;
        if (!getName().equals(error.getName()) || hasError() != error.hasError()) {
            return false;
        }
        if ((!hasError() || getError().equals(error.getError())) && hasReason() == error.hasReason()) {
            return (!hasReason() || getReason().equals(error.getReason())) && this.unknownFields.equals(error.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getError() {
        Data data = this.error_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
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

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getReason() {
        Data data = this.reason_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getReasonOrBuilder() {
        return getReason();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? h0.computeStringSize(1, this.name_) : 0;
        if (this.error_ != null) {
            iComputeStringSize += n.G(2, getError());
        }
        if (this.reason_ != null) {
            iComputeStringSize += n.G(3, getReason());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasReason() {
        return this.reason_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (hasError()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getError().hashCode();
        }
        if (hasReason()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getReason().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable.d(Error.class, Builder.class);
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
        return new Error();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.name_);
        }
        if (this.error_ != null) {
            nVar.J0(2, getError());
        }
        if (this.reason_ != null) {
            nVar.J0(3, getReason());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements ErrorOrBuilder {
        private a2 errorBuilder_;
        private Data error_;
        private Object name_;
        private a2 reasonBuilder_;
        private Data reason_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        private a2 getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new a2(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private a2 getReasonFieldBuilder() {
            if (this.reasonBuilder_ == null) {
                this.reasonBuilder_ = new a2(getReason(), getParentForChildren(), isClean());
                this.reason_ = null;
            }
            return this.reasonBuilder_;
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

        public Builder clearName() {
            this.name_ = Error.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder clearReason() {
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
                onChanged();
                return this;
            }
            this.reason_ = null;
            this.reasonBuilder_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getError() {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                return (Data) a2Var.e();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        public Data.Builder getErrorBuilder() {
            onChanged();
            return (Data.Builder) getErrorFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getErrorOrBuilder() {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                return (DataOrBuilder) a2Var.f();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getReason() {
            a2 a2Var = this.reasonBuilder_;
            if (a2Var != null) {
                return (Data) a2Var.e();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        public Data.Builder getReasonBuilder() {
            onChanged();
            return (Data.Builder) getReasonFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getReasonOrBuilder() {
            a2 a2Var = this.reasonBuilder_;
            if (a2Var != null) {
                return (DataOrBuilder) a2Var.f();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasReason() {
            return (this.reasonBuilder_ == null && this.reason_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable.d(Error.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeError(Data data) {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                a2Var.g(data);
                return this;
            }
            Data data2 = this.error_;
            if (data2 != null) {
                this.error_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
            } else {
                this.error_ = data;
            }
            onChanged();
            return this;
        }

        public Builder mergeReason(Data data) {
            a2 a2Var = this.reasonBuilder_;
            if (a2Var != null) {
                a2Var.g(data);
                return this;
            }
            Data data2 = this.reason_;
            if (data2 != null) {
                this.reason_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
            } else {
                this.reason_ = data;
            }
            onChanged();
            return this;
        }

        public Builder setError(Data data) {
            a2 a2Var = this.errorBuilder_;
            if (a2Var != null) {
                a2Var.i(data);
                return this;
            }
            data.getClass();
            this.error_ = data;
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

        public Builder setReason(Data data) {
            a2 a2Var = this.reasonBuilder_;
            if (a2Var != null) {
                a2Var.i(data);
                return this;
            }
            data.getClass();
            this.reason_ = data;
            onChanged();
            return this;
        }

        private Builder() {
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error build() {
            Error errorBuildPartial = buildPartial();
            if (errorBuildPartial.isInitialized()) {
                return errorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error buildPartial() {
            Error error = new Error(this);
            error.name_ = this.name_;
            a2 a2Var = this.errorBuilder_;
            if (a2Var == null) {
                error.error_ = this.error_;
            } else {
                error.error_ = (Data) a2Var.a();
            }
            a2 a2Var2 = this.reasonBuilder_;
            if (a2Var2 == null) {
                error.reason_ = this.reason_;
            } else {
                error.reason_ = (Data) a2Var2.a();
            }
            onBuilt();
            return error;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Error getDefaultInstanceForType() {
            return Error.getDefaultInstance();
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
            this.name_ = "";
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
                return this;
            }
            this.reason_ = null;
            this.reasonBuilder_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setError(Data.Builder builder) {
            a2 a2Var = this.errorBuilder_;
            if (a2Var == null) {
                this.error_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setReason(Data.Builder builder) {
            a2 a2Var = this.reasonBuilder_;
            if (a2Var == null) {
                this.reason_ = builder.build();
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
            if (message instanceof Error) {
                return mergeFrom((Error) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Error error) {
            if (error == Error.getDefaultInstance()) {
                return this;
            }
            if (!error.getName().isEmpty()) {
                this.name_ = error.name_;
                onChanged();
            }
            if (error.hasError()) {
                mergeError(error.getError());
            }
            if (error.hasReason()) {
                mergeReason(error.getReason());
            }
            mergeUnknownFields(((h0) error).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.Error.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Error.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Error r3 = (io.bidmachine.protobuf.sdk.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Error r4 = (io.bidmachine.protobuf.sdk.Error) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Error.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Error$Builder");
        }
    }

    public static Builder newBuilder(Error error) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
    }

    public static Error parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Error(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Error parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Error) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Error getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Error parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Error() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }

    public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static Error parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(bArr, wVar);
    }

    public static Error parseFrom(InputStream inputStream) throws IOException {
        return (Error) h0.parseWithIOException(PARSER, inputStream);
    }

    private Error(l lVar, w wVar) throws InvalidProtocolBufferException {
        Data.Builder builder;
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
                            if (iK != 10) {
                                if (iK == 18) {
                                    Data data = this.error_;
                                    builder = data != null ? data.toBuilder() : null;
                                    Data data2 = (Data) lVar.A(Data.parser(), wVar);
                                    this.error_ = data2;
                                    if (builder != null) {
                                        builder.mergeFrom(data2);
                                        this.error_ = builder.buildPartial();
                                    }
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Data data3 = this.reason_;
                                    builder = data3 != null ? data3.toBuilder() : null;
                                    Data data4 = (Data) lVar.A(Data.parser(), wVar);
                                    this.reason_ = data4;
                                    if (builder != null) {
                                        builder.mergeFrom(data4);
                                        this.reason_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.name_ = lVar.J();
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

    public static Error parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Error) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Error parseFrom(l lVar) throws IOException {
        return (Error) h0.parseWithIOException(PARSER, lVar);
    }

    public static Error parseFrom(l lVar, w wVar) throws IOException {
        return (Error) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
