package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.AppOrBuilder;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.DeviceOrBuilder;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.PlacementOrBuilder;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.SDKOrBuilder;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.protobuf.sdk.User;
import io.bidmachine.protobuf.sdk.UserOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class RequestTokenPayload extends h0 implements RequestTokenPayloadOrBuilder {
    public static final int AD_TYPE_FIELD_NUMBER = 10;
    public static final int APP_DATA_FIELD_NUMBER = 6;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 4;
    public static final int DEVICE_DATA_FIELD_NUMBER = 3;
    public static final int EXT_FIELD_NUMBER = 7;
    public static final int HB_PLACEMENT_FIELD_NUMBER = 9;
    public static final int PLACEMENT_DATA_FIELD_NUMBER = 1;
    public static final int PLACEMENT_FIELD_NUMBER = 12;
    public static final int SESSION_DATA_FIELD_NUMBER = 2;
    public static final int SESSION_FIELD_NUMBER = 11;
    public static final int TOKEN_HASH_VALUE_FIELD_NUMBER = 8;
    public static final int USER_DATA_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private volatile Object adType_;
    private App appData_;
    private w0 customData_;
    private Device deviceData_;
    private Struct ext_;
    private HeaderBiddingPlacement hbPlacement_;
    private byte memoizedIsInitialized;
    private SDK placementData_;
    private Placement placement_;
    private SessionData sessionData_;
    private io.bidmachine.protobuf.sdk.Session session_;
    private volatile Object tokenHashValue_;
    private User userData_;
    private static final RequestTokenPayload DEFAULT_INSTANCE = new RequestTokenPayload();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.RequestTokenPayload.1
        @Override // com.explorestack.protobuf.p1
        public RequestTokenPayload parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new RequestTokenPayload(lVar, wVar);
        }
    };

    private static final class CustomDataDefaultEntryHolder {
        static final u0 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_descriptor;
            z2.b bVar = z2.b.f19481l;
            defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
        }

        private CustomDataDefaultEntryHolder() {
        }
    }

    public static final class SessionData extends h0 implements SessionDataOrBuilder {
        private static final SessionData DEFAULT_INSTANCE = new SessionData();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.RequestTokenPayload.SessionData.1
            @Override // com.explorestack.protobuf.p1
            public SessionData parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new SessionData(lVar, wVar);
            }
        };
        public static final int SESSIONDURATION_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SESSION_PLACEMENT_DATA_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object sessionId_;
        private w0 sessionPlacementData_;
        private long sessionduration_;

        public static final class SessionPlacementData extends h0 implements SessionPlacementDataOrBuilder {
            public static final int CLICKRATE_FIELD_NUMBER = 5;
            public static final int COMPLETIONRATE_FIELD_NUMBER = 7;
            public static final int IMPDEPTH_FIELD_NUMBER = 1;
            public static final int LASTADOMAIN_FIELD_NUMBER = 4;
            public static final int LASTBUNDLE_FIELD_NUMBER = 3;
            public static final int LASTCLICK_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private float clickrate_;
            private float completionrate_;
            private int impdepth_;
            private volatile Object lastadomain_;
            private volatile Object lastbundle_;
            private boolean lastclick_;
            private byte memoizedIsInitialized;
            private static final SessionPlacementData DEFAULT_INSTANCE = new SessionPlacementData();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.1
                @Override // com.explorestack.protobuf.p1
                public SessionPlacementData parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new SessionPlacementData(lVar, wVar);
                }
            };

            public static SessionPlacementData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SessionPlacementData)) {
                    return super.equals(obj);
                }
                SessionPlacementData sessionPlacementData = (SessionPlacementData) obj;
                return getImpdepth() == sessionPlacementData.getImpdepth() && getLastbundle().equals(sessionPlacementData.getLastbundle()) && getLastadomain().equals(sessionPlacementData.getLastadomain()) && Float.floatToIntBits(getClickrate()) == Float.floatToIntBits(sessionPlacementData.getClickrate()) && getLastclick() == sessionPlacementData.getLastclick() && Float.floatToIntBits(getCompletionrate()) == Float.floatToIntBits(sessionPlacementData.getCompletionrate()) && this.unknownFields.equals(sessionPlacementData.unknownFields);
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public float getClickrate() {
                return this.clickrate_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public float getCompletionrate() {
                return this.completionrate_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public int getImpdepth() {
                return this.impdepth_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public String getLastadomain() {
                Object obj = this.lastadomain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastadomain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public ByteString getLastadomainBytes() {
                Object obj = this.lastadomain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastadomain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public String getLastbundle() {
                Object obj = this.lastbundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastbundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public ByteString getLastbundleBytes() {
                Object obj = this.lastbundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastbundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public boolean getLastclick() {
                return this.lastclick_;
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
                int i11 = this.impdepth_;
                int iY = i11 != 0 ? n.Y(1, i11) : 0;
                if (!getLastbundleBytes().isEmpty()) {
                    iY += h0.computeStringSize(3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    iY += h0.computeStringSize(4, this.lastadomain_);
                }
                float f10 = this.clickrate_;
                if (f10 != 0.0f) {
                    iY += n.r(5, f10);
                }
                boolean z10 = this.lastclick_;
                if (z10) {
                    iY += n.e(6, z10);
                }
                float f11 = this.completionrate_;
                if (f11 != 0.0f) {
                    iY += n.r(7, f11);
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
                int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImpdepth()) * 37) + 3) * 53) + getLastbundle().hashCode()) * 37) + 4) * 53) + getLastadomain().hashCode()) * 37) + 5) * 53) + Float.floatToIntBits(getClickrate())) * 37) + 6) * 53) + j0.d(getLastclick())) * 37) + 7) * 53) + Float.floatToIntBits(getCompletionrate())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.d(SessionPlacementData.class, Builder.class);
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
                return new SessionPlacementData();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                int i10 = this.impdepth_;
                if (i10 != 0) {
                    nVar.W0(1, i10);
                }
                if (!getLastbundleBytes().isEmpty()) {
                    h0.writeString(nVar, 3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    h0.writeString(nVar, 4, this.lastadomain_);
                }
                float f10 = this.clickrate_;
                if (f10 != 0.0f) {
                    nVar.B0(5, f10);
                }
                boolean z10 = this.lastclick_;
                if (z10) {
                    nVar.n0(6, z10);
                }
                float f11 = this.completionrate_;
                if (f11 != 0.0f) {
                    nVar.B0(7, f11);
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements SessionPlacementDataOrBuilder {
                private float clickrate_;
                private float completionrate_;
                private int impdepth_;
                private Object lastadomain_;
                private Object lastbundle_;
                private boolean lastclick_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearClickrate() {
                    this.clickrate_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCompletionrate() {
                    this.completionrate_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearImpdepth() {
                    this.impdepth_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLastadomain() {
                    this.lastadomain_ = SessionPlacementData.getDefaultInstance().getLastadomain();
                    onChanged();
                    return this;
                }

                public Builder clearLastbundle() {
                    this.lastbundle_ = SessionPlacementData.getDefaultInstance().getLastbundle();
                    onChanged();
                    return this;
                }

                public Builder clearLastclick() {
                    this.lastclick_ = false;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public float getClickrate() {
                    return this.clickrate_;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public float getCompletionrate() {
                    return this.completionrate_;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public int getImpdepth() {
                    return this.impdepth_;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public String getLastadomain() {
                    Object obj = this.lastadomain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastadomain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public ByteString getLastadomainBytes() {
                    Object obj = this.lastadomain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastadomain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public String getLastbundle() {
                    Object obj = this.lastbundle_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastbundle_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public ByteString getLastbundleBytes() {
                    Object obj = this.lastbundle_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastbundle_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public boolean getLastclick() {
                    return this.lastclick_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.d(SessionPlacementData.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setClickrate(float f10) {
                    this.clickrate_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCompletionrate(float f10) {
                    this.completionrate_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setImpdepth(int i10) {
                    this.impdepth_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLastadomain(String str) {
                    str.getClass();
                    this.lastadomain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLastadomainBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.lastadomain_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLastbundle(String str) {
                    str.getClass();
                    this.lastbundle_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLastbundleBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.lastbundle_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLastclick(boolean z10) {
                    this.lastclick_ = z10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public SessionPlacementData build() {
                    SessionPlacementData sessionPlacementDataBuildPartial = buildPartial();
                    if (sessionPlacementDataBuildPartial.isInitialized()) {
                        return sessionPlacementDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionPlacementDataBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public SessionPlacementData buildPartial() {
                    SessionPlacementData sessionPlacementData = new SessionPlacementData(this);
                    sessionPlacementData.impdepth_ = this.impdepth_;
                    sessionPlacementData.lastbundle_ = this.lastbundle_;
                    sessionPlacementData.lastadomain_ = this.lastadomain_;
                    sessionPlacementData.clickrate_ = this.clickrate_;
                    sessionPlacementData.lastclick_ = this.lastclick_;
                    sessionPlacementData.completionrate_ = this.completionrate_;
                    onBuilt();
                    return sessionPlacementData;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public SessionPlacementData getDefaultInstanceForType() {
                    return SessionPlacementData.getDefaultInstance();
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
                    this.impdepth_ = 0;
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    this.clickrate_ = 0.0f;
                    this.lastclick_ = false;
                    this.completionrate_ = 0.0f;
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SessionPlacementData) {
                        return mergeFrom((SessionPlacementData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SessionPlacementData sessionPlacementData) {
                    if (sessionPlacementData == SessionPlacementData.getDefaultInstance()) {
                        return this;
                    }
                    if (sessionPlacementData.getImpdepth() != 0) {
                        setImpdepth(sessionPlacementData.getImpdepth());
                    }
                    if (!sessionPlacementData.getLastbundle().isEmpty()) {
                        this.lastbundle_ = sessionPlacementData.lastbundle_;
                        onChanged();
                    }
                    if (!sessionPlacementData.getLastadomain().isEmpty()) {
                        this.lastadomain_ = sessionPlacementData.lastadomain_;
                        onChanged();
                    }
                    if (sessionPlacementData.getClickrate() != 0.0f) {
                        setClickrate(sessionPlacementData.getClickrate());
                    }
                    if (sessionPlacementData.getLastclick()) {
                        setLastclick(sessionPlacementData.getLastclick());
                    }
                    if (sessionPlacementData.getCompletionrate() != 0.0f) {
                        setCompletionrate(sessionPlacementData.getCompletionrate());
                    }
                    mergeUnknownFields(((h0) sessionPlacementData).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.access$1100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData r3 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData r4 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData$Builder");
                }
            }

            public static Builder newBuilder(SessionPlacementData sessionPlacementData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionPlacementData);
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteBuffer, wVar);
            }

            private SessionPlacementData(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (SessionPlacementData) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static SessionPlacementData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public SessionPlacementData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SessionPlacementData parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private SessionPlacementData() {
                this.memoizedIsInitialized = (byte) -1;
                this.lastbundle_ = "";
                this.lastadomain_ = "";
            }

            public static SessionPlacementData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static SessionPlacementData parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(bArr, wVar);
            }

            public static SessionPlacementData parseFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) h0.parseWithIOException(PARSER, inputStream);
            }

            private SessionPlacementData(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.impdepth_ = lVar.L();
                                } else if (iK == 26) {
                                    this.lastbundle_ = lVar.J();
                                } else if (iK == 34) {
                                    this.lastadomain_ = lVar.J();
                                } else if (iK == 45) {
                                    this.clickrate_ = lVar.w();
                                } else if (iK == 48) {
                                    this.lastclick_ = lVar.q();
                                } else if (iK != 61) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.completionrate_ = lVar.w();
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

            public static SessionPlacementData parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (SessionPlacementData) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static SessionPlacementData parseFrom(l lVar) throws IOException {
                return (SessionPlacementData) h0.parseWithIOException(PARSER, lVar);
            }

            public static SessionPlacementData parseFrom(l lVar, w wVar) throws IOException {
                return (SessionPlacementData) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        private static final class SessionPlacementDataDefaultEntryHolder {
            static final u0 defaultEntry = u0.n(CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_descriptor, z2.b.f19481l, "", z2.b.f19483n, SessionPlacementData.getDefaultInstance());

            private SessionPlacementDataDefaultEntryHolder() {
            }
        }

        public interface SessionPlacementDataOrBuilder extends MessageOrBuilder {
            float getClickrate();

            float getCompletionrate();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            int getImpdepth();

            String getLastadomain();

            ByteString getLastadomainBytes();

            String getLastbundle();

            ByteString getLastbundleBytes();

            boolean getLastclick();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w0 internalGetSessionPlacementData() {
            w0 w0Var = this.sessionPlacementData_;
            return w0Var == null ? w0.g(SessionPlacementDataDefaultEntryHolder.defaultEntry) : w0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public boolean containsSessionPlacementData(String str) {
            str.getClass();
            return internalGetSessionPlacementData().i().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionData)) {
                return super.equals(obj);
            }
            SessionData sessionData = (SessionData) obj;
            return getSessionId().equals(sessionData.getSessionId()) && getSessionduration() == sessionData.getSessionduration() && internalGetSessionPlacementData().equals(sessionData.internalGetSessionPlacementData()) && this.unknownFields.equals(sessionData.unknownFields);
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
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                iComputeStringSize += n.a0(2, j10);
            }
            for (Map.Entry entry : internalGetSessionPlacementData().i().entrySet()) {
                iComputeStringSize += n.G(3, SessionPlacementDataDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        @Deprecated
        public Map<String, SessionPlacementData> getSessionPlacementData() {
            return getSessionPlacementDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public int getSessionPlacementDataCount() {
            return internalGetSessionPlacementData().i().size();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
            return internalGetSessionPlacementData().i();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
            str.getClass();
            Map mapI = internalGetSessionPlacementData().i();
            return mapI.containsKey(str) ? (SessionPlacementData) mapI.get(str) : sessionPlacementData;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetSessionPlacementData().i();
            if (mapI.containsKey(str)) {
                return (SessionPlacementData) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
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
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSessionId().hashCode()) * 37) + 2) * 53) + j0.i(getSessionduration());
            if (!internalGetSessionPlacementData().i().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetSessionPlacementData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.d(SessionData.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0
        protected w0 internalGetMapField(int i10) {
            if (i10 == 3) {
                return internalGetSessionPlacementData();
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
            return new SessionData();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getSessionIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.sessionId_);
            }
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                nVar.Y0(2, j10);
            }
            h0.serializeStringMapTo(nVar, internalGetSessionPlacementData(), SessionPlacementDataDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements SessionDataOrBuilder {
            private int bitField0_;
            private Object sessionId_;
            private w0 sessionPlacementData_;
            private long sessionduration_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            private w0 internalGetMutableSessionPlacementData() {
                onChanged();
                if (this.sessionPlacementData_ == null) {
                    this.sessionPlacementData_ = w0.p(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                }
                if (!this.sessionPlacementData_.m()) {
                    this.sessionPlacementData_ = this.sessionPlacementData_.f();
                }
                return this.sessionPlacementData_;
            }

            private w0 internalGetSessionPlacementData() {
                w0 w0Var = this.sessionPlacementData_;
                return w0Var == null ? w0.g(SessionPlacementDataDefaultEntryHolder.defaultEntry) : w0Var;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearSessionId() {
                this.sessionId_ = SessionData.getDefaultInstance().getSessionId();
                onChanged();
                return this;
            }

            public Builder clearSessionPlacementData() {
                internalGetMutableSessionPlacementData().l().clear();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public boolean containsSessionPlacementData(String str) {
                str.getClass();
                return internalGetSessionPlacementData().i().containsKey(str);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            @Deprecated
            public Map<String, SessionPlacementData> getMutableSessionPlacementData() {
                return internalGetMutableSessionPlacementData().l();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public String getSessionId() {
                Object obj = this.sessionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sessionId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public ByteString getSessionIdBytes() {
                Object obj = this.sessionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            @Deprecated
            public Map<String, SessionPlacementData> getSessionPlacementData() {
                return getSessionPlacementDataMap();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public int getSessionPlacementDataCount() {
                return internalGetSessionPlacementData().i().size();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
                return internalGetSessionPlacementData().i();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
                str.getClass();
                Map mapI = internalGetSessionPlacementData().i();
                return mapI.containsKey(str) ? (SessionPlacementData) mapI.get(str) : sessionPlacementData;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
                str.getClass();
                Map mapI = internalGetSessionPlacementData().i();
                if (mapI.containsKey(str)) {
                    return (SessionPlacementData) mapI.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.d(SessionData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMapField(int i10) {
                if (i10 == 3) {
                    return internalGetSessionPlacementData();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMutableMapField(int i10) {
                if (i10 == 3) {
                    return internalGetMutableSessionPlacementData();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllSessionPlacementData(Map<String, SessionPlacementData> map) {
                internalGetMutableSessionPlacementData().l().putAll(map);
                return this;
            }

            public Builder putSessionPlacementData(String str, SessionPlacementData sessionPlacementData) {
                str.getClass();
                sessionPlacementData.getClass();
                internalGetMutableSessionPlacementData().l().put(str, sessionPlacementData);
                return this;
            }

            public Builder removeSessionPlacementData(String str) {
                str.getClass();
                internalGetMutableSessionPlacementData().l().remove(str);
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

            public Builder setSessionduration(long j10) {
                this.sessionduration_ = j10;
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
            public SessionData build() {
                SessionData sessionDataBuildPartial = buildPartial();
                if (sessionDataBuildPartial.isInitialized()) {
                    return sessionDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionDataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionData buildPartial() {
                SessionData sessionData = new SessionData(this);
                sessionData.sessionId_ = this.sessionId_;
                sessionData.sessionduration_ = this.sessionduration_;
                sessionData.sessionPlacementData_ = internalGetSessionPlacementData();
                sessionData.sessionPlacementData_.n();
                onBuilt();
                return sessionData;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public SessionData getDefaultInstanceForType() {
                return SessionData.getDefaultInstance();
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
                this.sessionduration_ = 0L;
                internalGetMutableSessionPlacementData().a();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.sessionId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionData) {
                    return mergeFrom((SessionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionData sessionData) {
                if (sessionData == SessionData.getDefaultInstance()) {
                    return this;
                }
                if (!sessionData.getSessionId().isEmpty()) {
                    this.sessionId_ = sessionData.sessionId_;
                    onChanged();
                }
                if (sessionData.getSessionduration() != 0) {
                    setSessionduration(sessionData.getSessionduration());
                }
                internalGetMutableSessionPlacementData().o(sessionData.internalGetSessionPlacementData());
                mergeUnknownFields(((h0) sessionData).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.RequestTokenPayload.SessionData.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.RequestTokenPayload.SessionData.access$2400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.RequestTokenPayload$SessionData r3 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.RequestTokenPayload$SessionData r4 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.SessionData.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.RequestTokenPayload$SessionData$Builder");
            }
        }

        public static Builder newBuilder(SessionData sessionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionData);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteBuffer, wVar);
        }

        private SessionData(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (SessionData) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static SessionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SessionData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SessionData parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SessionData() {
            this.memoizedIsInitialized = (byte) -1;
            this.sessionId_ = "";
        }

        public static SessionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static SessionData parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(bArr, wVar);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) h0.parseWithIOException(PARSER, inputStream);
        }

        private SessionData(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if (iK == 10) {
                                    this.sessionId_ = lVar.J();
                                } else if (iK == 16) {
                                    this.sessionduration_ = lVar.M();
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.sessionPlacementData_ = w0.p(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                                        z11 = true;
                                    }
                                    u0 u0Var = (u0) lVar.A(SessionPlacementDataDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                    this.sessionPlacementData_.l().put(u0Var.i(), u0Var.k());
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

        public static SessionData parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (SessionData) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static SessionData parseFrom(l lVar) throws IOException {
            return (SessionData) h0.parseWithIOException(PARSER, lVar);
        }

        public static SessionData parseFrom(l lVar, w wVar) throws IOException {
            return (SessionData) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface SessionDataOrBuilder extends MessageOrBuilder {
        boolean containsSessionPlacementData(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getSessionId();

        ByteString getSessionIdBytes();

        @Deprecated
        Map<String, SessionData.SessionPlacementData> getSessionPlacementData();

        int getSessionPlacementDataCount();

        Map<String, SessionData.SessionPlacementData> getSessionPlacementDataMap();

        SessionData.SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionData.SessionPlacementData sessionPlacementData);

        SessionData.SessionPlacementData getSessionPlacementDataOrThrow(String str);

        long getSessionduration();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static RequestTokenPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetCustomData() {
        w0 w0Var = this.customData_;
        return w0Var == null ? w0.g(CustomDataDefaultEntryHolder.defaultEntry) : w0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean containsCustomData(String str) {
        str.getClass();
        return internalGetCustomData().i().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestTokenPayload)) {
            return super.equals(obj);
        }
        RequestTokenPayload requestTokenPayload = (RequestTokenPayload) obj;
        if (!getTokenHashValue().equals(requestTokenPayload.getTokenHashValue()) || !getAdType().equals(requestTokenPayload.getAdType()) || hasPlacementData() != requestTokenPayload.hasPlacementData()) {
            return false;
        }
        if ((hasPlacementData() && !getPlacementData().equals(requestTokenPayload.getPlacementData())) || hasSessionData() != requestTokenPayload.hasSessionData()) {
            return false;
        }
        if ((hasSessionData() && !getSessionData().equals(requestTokenPayload.getSessionData())) || hasSession() != requestTokenPayload.hasSession()) {
            return false;
        }
        if ((hasSession() && !getSession().equals(requestTokenPayload.getSession())) || hasDeviceData() != requestTokenPayload.hasDeviceData()) {
            return false;
        }
        if ((hasDeviceData() && !getDeviceData().equals(requestTokenPayload.getDeviceData())) || hasUserData() != requestTokenPayload.hasUserData()) {
            return false;
        }
        if ((hasUserData() && !getUserData().equals(requestTokenPayload.getUserData())) || hasAppData() != requestTokenPayload.hasAppData()) {
            return false;
        }
        if ((hasAppData() && !getAppData().equals(requestTokenPayload.getAppData())) || hasHbPlacement() != requestTokenPayload.hasHbPlacement()) {
            return false;
        }
        if ((hasHbPlacement() && !getHbPlacement().equals(requestTokenPayload.getHbPlacement())) || !internalGetCustomData().equals(requestTokenPayload.internalGetCustomData()) || hasPlacement() != requestTokenPayload.hasPlacement()) {
            return false;
        }
        if ((!hasPlacement() || getPlacement().equals(requestTokenPayload.getPlacement())) && hasExt() == requestTokenPayload.hasExt()) {
            return (!hasExt() || getExt().equals(requestTokenPayload.getExt())) && this.unknownFields.equals(requestTokenPayload.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getAdType() {
        Object obj = this.adType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.adType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public ByteString getAdTypeBytes() {
        Object obj = this.adType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.adType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public App getAppData() {
        App app = this.appData_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public AppOrBuilder getAppDataOrBuilder() {
        return getAppData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public Map<String, String> getCustomData() {
        return getCustomDataMap();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public int getCustomDataCount() {
        return internalGetCustomData().i().size();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public Map<String, String> getCustomDataMap() {
        return internalGetCustomData().i();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getCustomDataOrDefault(String str, String str2) {
        str.getClass();
        Map mapI = internalGetCustomData().i();
        return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getCustomDataOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetCustomData().i();
        if (mapI.containsKey(str)) {
            return (String) mapI.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Device getDeviceData() {
        Device device = this.deviceData_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public DeviceOrBuilder getDeviceDataOrBuilder() {
        return getDeviceData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public e2 getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public HeaderBiddingPlacement getHbPlacement() {
        HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
        return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
        return getHbPlacement();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Placement getPlacement() {
        Placement placement = this.placement_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public SDK getPlacementData() {
        SDK sdk = this.placementData_;
        return sdk == null ? SDK.getDefaultInstance() : sdk;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public SDKOrBuilder getPlacementDataOrBuilder() {
        return getPlacementData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public PlacementOrBuilder getPlacementOrBuilder() {
        return getPlacement();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.placementData_ != null ? n.G(1, getPlacementData()) : 0;
        if (this.sessionData_ != null) {
            iG += n.G(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            iG += n.G(3, getDeviceData());
        }
        for (Map.Entry entry : internalGetCustomData().i().entrySet()) {
            iG += n.G(4, CustomDataDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
        if (this.userData_ != null) {
            iG += n.G(5, getUserData());
        }
        if (this.appData_ != null) {
            iG += n.G(6, getAppData());
        }
        if (this.ext_ != null) {
            iG += n.G(7, getExt());
        }
        if (!getTokenHashValueBytes().isEmpty()) {
            iG += h0.computeStringSize(8, this.tokenHashValue_);
        }
        if (this.hbPlacement_ != null) {
            iG += n.G(9, getHbPlacement());
        }
        if (!getAdTypeBytes().isEmpty()) {
            iG += h0.computeStringSize(10, this.adType_);
        }
        if (this.session_ != null) {
            iG += n.G(11, getSession());
        }
        if (this.placement_ != null) {
            iG += n.G(12, getPlacement());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public io.bidmachine.protobuf.sdk.Session getSession() {
        io.bidmachine.protobuf.sdk.Session session = this.session_;
        return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public SessionData getSessionData() {
        SessionData sessionData = this.sessionData_;
        return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public SessionDataOrBuilder getSessionDataOrBuilder() {
        return getSessionData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public io.bidmachine.protobuf.sdk.SessionOrBuilder getSessionOrBuilder() {
        return getSession();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public String getTokenHashValue() {
        Object obj = this.tokenHashValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tokenHashValue_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public ByteString getTokenHashValueBytes() {
        Object obj = this.tokenHashValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tokenHashValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public User getUserData() {
        User user = this.userData_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public UserOrBuilder getUserDataOrBuilder() {
        return getUserData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasAppData() {
        return this.appData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasDeviceData() {
        return this.deviceData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean hasHbPlacement() {
        return this.hbPlacement_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasPlacement() {
        return this.placement_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasPlacementData() {
        return this.placementData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasSession() {
        return this.session_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean hasSessionData() {
        return this.sessionData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasUserData() {
        return this.userData_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 8) * 53) + getTokenHashValue().hashCode()) * 37) + 10) * 53) + getAdType().hashCode();
        if (hasPlacementData()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getPlacementData().hashCode();
        }
        if (hasSessionData()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getSessionData().hashCode();
        }
        if (hasSession()) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + getSession().hashCode();
        }
        if (hasDeviceData()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getDeviceData().hashCode();
        }
        if (hasUserData()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getUserData().hashCode();
        }
        if (hasAppData()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getAppData().hashCode();
        }
        if (hasHbPlacement()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + getHbPlacement().hashCode();
        }
        if (!internalGetCustomData().i().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + internalGetCustomData().hashCode();
        }
        if (hasPlacement()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + getPlacement().hashCode();
        }
        if (hasExt()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getExt().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.d(RequestTokenPayload.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.h0
    protected w0 internalGetMapField(int i10) {
        if (i10 == 4) {
            return internalGetCustomData();
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
        return new RequestTokenPayload();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.placementData_ != null) {
            nVar.J0(1, getPlacementData());
        }
        if (this.sessionData_ != null) {
            nVar.J0(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            nVar.J0(3, getDeviceData());
        }
        h0.serializeStringMapTo(nVar, internalGetCustomData(), CustomDataDefaultEntryHolder.defaultEntry, 4);
        if (this.userData_ != null) {
            nVar.J0(5, getUserData());
        }
        if (this.appData_ != null) {
            nVar.J0(6, getAppData());
        }
        if (this.ext_ != null) {
            nVar.J0(7, getExt());
        }
        if (!getTokenHashValueBytes().isEmpty()) {
            h0.writeString(nVar, 8, this.tokenHashValue_);
        }
        if (this.hbPlacement_ != null) {
            nVar.J0(9, getHbPlacement());
        }
        if (!getAdTypeBytes().isEmpty()) {
            h0.writeString(nVar, 10, this.adType_);
        }
        if (this.session_ != null) {
            nVar.J0(11, getSession());
        }
        if (this.placement_ != null) {
            nVar.J0(12, getPlacement());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements RequestTokenPayloadOrBuilder {
        private Object adType_;
        private a2 appDataBuilder_;
        private App appData_;
        private int bitField0_;
        private w0 customData_;
        private a2 deviceDataBuilder_;
        private Device deviceData_;
        private a2 extBuilder_;
        private Struct ext_;
        private a2 hbPlacementBuilder_;
        private HeaderBiddingPlacement hbPlacement_;
        private a2 placementBuilder_;
        private a2 placementDataBuilder_;
        private SDK placementData_;
        private Placement placement_;
        private a2 sessionBuilder_;
        private a2 sessionDataBuilder_;
        private SessionData sessionData_;
        private io.bidmachine.protobuf.sdk.Session session_;
        private Object tokenHashValue_;
        private a2 userDataBuilder_;
        private User userData_;

        private a2 getAppDataFieldBuilder() {
            if (this.appDataBuilder_ == null) {
                this.appDataBuilder_ = new a2(getAppData(), getParentForChildren(), isClean());
                this.appData_ = null;
            }
            return this.appDataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        private a2 getDeviceDataFieldBuilder() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceDataBuilder_ = new a2(getDeviceData(), getParentForChildren(), isClean());
                this.deviceData_ = null;
            }
            return this.deviceDataBuilder_;
        }

        private a2 getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new a2(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private a2 getHbPlacementFieldBuilder() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacementBuilder_ = new a2(getHbPlacement(), getParentForChildren(), isClean());
                this.hbPlacement_ = null;
            }
            return this.hbPlacementBuilder_;
        }

        private a2 getPlacementDataFieldBuilder() {
            if (this.placementDataBuilder_ == null) {
                this.placementDataBuilder_ = new a2(getPlacementData(), getParentForChildren(), isClean());
                this.placementData_ = null;
            }
            return this.placementDataBuilder_;
        }

        private a2 getPlacementFieldBuilder() {
            if (this.placementBuilder_ == null) {
                this.placementBuilder_ = new a2(getPlacement(), getParentForChildren(), isClean());
                this.placement_ = null;
            }
            return this.placementBuilder_;
        }

        private a2 getSessionDataFieldBuilder() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionDataBuilder_ = new a2(getSessionData(), getParentForChildren(), isClean());
                this.sessionData_ = null;
            }
            return this.sessionDataBuilder_;
        }

        private a2 getSessionFieldBuilder() {
            if (this.sessionBuilder_ == null) {
                this.sessionBuilder_ = new a2(getSession(), getParentForChildren(), isClean());
                this.session_ = null;
            }
            return this.sessionBuilder_;
        }

        private a2 getUserDataFieldBuilder() {
            if (this.userDataBuilder_ == null) {
                this.userDataBuilder_ = new a2(getUserData(), getParentForChildren(), isClean());
                this.userData_ = null;
            }
            return this.userDataBuilder_;
        }

        private w0 internalGetCustomData() {
            w0 w0Var = this.customData_;
            return w0Var == null ? w0.g(CustomDataDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private w0 internalGetMutableCustomData() {
            onChanged();
            if (this.customData_ == null) {
                this.customData_ = w0.p(CustomDataDefaultEntryHolder.defaultEntry);
            }
            if (!this.customData_.m()) {
                this.customData_ = this.customData_.f();
            }
            return this.customData_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        @Deprecated
        public Builder clearAdType() {
            this.adType_ = RequestTokenPayload.getDefaultInstance().getAdType();
            onChanged();
            return this;
        }

        public Builder clearAppData() {
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
                onChanged();
                return this;
            }
            this.appData_ = null;
            this.appDataBuilder_ = null;
            return this;
        }

        @Deprecated
        public Builder clearCustomData() {
            internalGetMutableCustomData().l().clear();
            return this;
        }

        public Builder clearDeviceData() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
                onChanged();
                return this;
            }
            this.deviceData_ = null;
            this.deviceDataBuilder_ = null;
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

        @Deprecated
        public Builder clearHbPlacement() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
                onChanged();
                return this;
            }
            this.hbPlacement_ = null;
            this.hbPlacementBuilder_ = null;
            return this;
        }

        public Builder clearPlacement() {
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
                onChanged();
                return this;
            }
            this.placement_ = null;
            this.placementBuilder_ = null;
            return this;
        }

        public Builder clearPlacementData() {
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
                onChanged();
                return this;
            }
            this.placementData_ = null;
            this.placementDataBuilder_ = null;
            return this;
        }

        public Builder clearSession() {
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
                onChanged();
                return this;
            }
            this.session_ = null;
            this.sessionBuilder_ = null;
            return this;
        }

        @Deprecated
        public Builder clearSessionData() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
                onChanged();
                return this;
            }
            this.sessionData_ = null;
            this.sessionDataBuilder_ = null;
            return this;
        }

        public Builder clearTokenHashValue() {
            this.tokenHashValue_ = RequestTokenPayload.getDefaultInstance().getTokenHashValue();
            onChanged();
            return this;
        }

        public Builder clearUserData() {
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
                onChanged();
                return this;
            }
            this.userData_ = null;
            this.userDataBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean containsCustomData(String str) {
            str.getClass();
            return internalGetCustomData().i().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getAdType() {
            Object obj = this.adType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public ByteString getAdTypeBytes() {
            Object obj = this.adType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public App getAppData() {
            a2 a2Var = this.appDataBuilder_;
            if (a2Var != null) {
                return (App) a2Var.e();
            }
            App app = this.appData_;
            return app == null ? App.getDefaultInstance() : app;
        }

        public App.Builder getAppDataBuilder() {
            onChanged();
            return (App.Builder) getAppDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public AppOrBuilder getAppDataOrBuilder() {
            a2 a2Var = this.appDataBuilder_;
            if (a2Var != null) {
                return (AppOrBuilder) a2Var.f();
            }
            App app = this.appData_;
            return app == null ? App.getDefaultInstance() : app;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public Map<String, String> getCustomData() {
            return getCustomDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public int getCustomDataCount() {
            return internalGetCustomData().i().size();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public Map<String, String> getCustomDataMap() {
            return internalGetCustomData().i();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getCustomDataOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetCustomData().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getCustomDataOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetCustomData().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public Device getDeviceData() {
            a2 a2Var = this.deviceDataBuilder_;
            if (a2Var != null) {
                return (Device) a2Var.e();
            }
            Device device = this.deviceData_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        public Device.Builder getDeviceDataBuilder() {
            onChanged();
            return (Device.Builder) getDeviceDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public DeviceOrBuilder getDeviceDataOrBuilder() {
            a2 a2Var = this.deviceDataBuilder_;
            if (a2Var != null) {
                return (DeviceOrBuilder) a2Var.f();
            }
            Device device = this.deviceData_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
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

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public e2 getExtOrBuilder() {
            a2 a2Var = this.extBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public HeaderBiddingPlacement getHbPlacement() {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                return (HeaderBiddingPlacement) a2Var.e();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Deprecated
        public HeaderBiddingPlacement.Builder getHbPlacementBuilder() {
            onChanged();
            return (HeaderBiddingPlacement.Builder) getHbPlacementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                return (HeaderBiddingPlacementOrBuilder) a2Var.f();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Deprecated
        public Map<String, String> getMutableCustomData() {
            return internalGetMutableCustomData().l();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public Placement getPlacement() {
            a2 a2Var = this.placementBuilder_;
            if (a2Var != null) {
                return (Placement) a2Var.e();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Placement.Builder getPlacementBuilder() {
            onChanged();
            return (Placement.Builder) getPlacementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public SDK getPlacementData() {
            a2 a2Var = this.placementDataBuilder_;
            if (a2Var != null) {
                return (SDK) a2Var.e();
            }
            SDK sdk = this.placementData_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        public SDK.Builder getPlacementDataBuilder() {
            onChanged();
            return (SDK.Builder) getPlacementDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public SDKOrBuilder getPlacementDataOrBuilder() {
            a2 a2Var = this.placementDataBuilder_;
            if (a2Var != null) {
                return (SDKOrBuilder) a2Var.f();
            }
            SDK sdk = this.placementData_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public PlacementOrBuilder getPlacementOrBuilder() {
            a2 a2Var = this.placementBuilder_;
            if (a2Var != null) {
                return (PlacementOrBuilder) a2Var.f();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public io.bidmachine.protobuf.sdk.Session getSession() {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                return (io.bidmachine.protobuf.sdk.Session) a2Var.e();
            }
            io.bidmachine.protobuf.sdk.Session session = this.session_;
            return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
        }

        public Session.Builder getSessionBuilder() {
            onChanged();
            return (Session.Builder) getSessionFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public SessionData getSessionData() {
            a2 a2Var = this.sessionDataBuilder_;
            if (a2Var != null) {
                return (SessionData) a2Var.e();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        @Deprecated
        public SessionData.Builder getSessionDataBuilder() {
            onChanged();
            return (SessionData.Builder) getSessionDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public SessionDataOrBuilder getSessionDataOrBuilder() {
            a2 a2Var = this.sessionDataBuilder_;
            if (a2Var != null) {
                return (SessionDataOrBuilder) a2Var.f();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public io.bidmachine.protobuf.sdk.SessionOrBuilder getSessionOrBuilder() {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                return (io.bidmachine.protobuf.sdk.SessionOrBuilder) a2Var.f();
            }
            io.bidmachine.protobuf.sdk.Session session = this.session_;
            return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public String getTokenHashValue() {
            Object obj = this.tokenHashValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tokenHashValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public ByteString getTokenHashValueBytes() {
            Object obj = this.tokenHashValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tokenHashValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public User getUserData() {
            a2 a2Var = this.userDataBuilder_;
            if (a2Var != null) {
                return (User) a2Var.e();
            }
            User user = this.userData_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public User.Builder getUserDataBuilder() {
            onChanged();
            return (User.Builder) getUserDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public UserOrBuilder getUserDataOrBuilder() {
            a2 a2Var = this.userDataBuilder_;
            if (a2Var != null) {
                return (UserOrBuilder) a2Var.f();
            }
            User user = this.userData_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasAppData() {
            return (this.appDataBuilder_ == null && this.appData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasDeviceData() {
            return (this.deviceDataBuilder_ == null && this.deviceData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean hasHbPlacement() {
            return (this.hbPlacementBuilder_ == null && this.hbPlacement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasPlacement() {
            return (this.placementBuilder_ == null && this.placement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasPlacementData() {
            return (this.placementDataBuilder_ == null && this.placementData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasSession() {
            return (this.sessionBuilder_ == null && this.session_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean hasSessionData() {
            return (this.sessionDataBuilder_ == null && this.sessionData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasUserData() {
            return (this.userDataBuilder_ == null && this.userData_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.d(RequestTokenPayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMapField(int i10) {
            if (i10 == 4) {
                return internalGetCustomData();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMutableMapField(int i10) {
            if (i10 == 4) {
                return internalGetMutableCustomData();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAppData(App app) {
            a2 a2Var = this.appDataBuilder_;
            if (a2Var != null) {
                a2Var.g(app);
                return this;
            }
            App app2 = this.appData_;
            if (app2 != null) {
                this.appData_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
            } else {
                this.appData_ = app;
            }
            onChanged();
            return this;
        }

        public Builder mergeDeviceData(Device device) {
            a2 a2Var = this.deviceDataBuilder_;
            if (a2Var != null) {
                a2Var.g(device);
                return this;
            }
            Device device2 = this.deviceData_;
            if (device2 != null) {
                this.deviceData_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
            } else {
                this.deviceData_ = device;
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

        @Deprecated
        public Builder mergeHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                a2Var.g(headerBiddingPlacement);
                return this;
            }
            HeaderBiddingPlacement headerBiddingPlacement2 = this.hbPlacement_;
            if (headerBiddingPlacement2 != null) {
                this.hbPlacement_ = HeaderBiddingPlacement.newBuilder(headerBiddingPlacement2).mergeFrom(headerBiddingPlacement).buildPartial();
            } else {
                this.hbPlacement_ = headerBiddingPlacement;
            }
            onChanged();
            return this;
        }

        public Builder mergePlacement(Placement placement) {
            a2 a2Var = this.placementBuilder_;
            if (a2Var != null) {
                a2Var.g(placement);
                return this;
            }
            Placement placement2 = this.placement_;
            if (placement2 != null) {
                this.placement_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
            } else {
                this.placement_ = placement;
            }
            onChanged();
            return this;
        }

        public Builder mergePlacementData(SDK sdk) {
            a2 a2Var = this.placementDataBuilder_;
            if (a2Var != null) {
                a2Var.g(sdk);
                return this;
            }
            SDK sdk2 = this.placementData_;
            if (sdk2 != null) {
                this.placementData_ = SDK.newBuilder(sdk2).mergeFrom(sdk).buildPartial();
            } else {
                this.placementData_ = sdk;
            }
            onChanged();
            return this;
        }

        public Builder mergeSession(io.bidmachine.protobuf.sdk.Session session) {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                a2Var.g(session);
                return this;
            }
            io.bidmachine.protobuf.sdk.Session session2 = this.session_;
            if (session2 != null) {
                this.session_ = io.bidmachine.protobuf.sdk.Session.newBuilder(session2).mergeFrom(session).buildPartial();
            } else {
                this.session_ = session;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Builder mergeSessionData(SessionData sessionData) {
            a2 a2Var = this.sessionDataBuilder_;
            if (a2Var != null) {
                a2Var.g(sessionData);
                return this;
            }
            SessionData sessionData2 = this.sessionData_;
            if (sessionData2 != null) {
                this.sessionData_ = SessionData.newBuilder(sessionData2).mergeFrom(sessionData).buildPartial();
            } else {
                this.sessionData_ = sessionData;
            }
            onChanged();
            return this;
        }

        public Builder mergeUserData(User user) {
            a2 a2Var = this.userDataBuilder_;
            if (a2Var != null) {
                a2Var.g(user);
                return this;
            }
            User user2 = this.userData_;
            if (user2 != null) {
                this.userData_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
            } else {
                this.userData_ = user;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Builder putAllCustomData(Map<String, String> map) {
            internalGetMutableCustomData().l().putAll(map);
            return this;
        }

        @Deprecated
        public Builder putCustomData(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomData().l().put(str, str2);
            return this;
        }

        @Deprecated
        public Builder removeCustomData(String str) {
            str.getClass();
            internalGetMutableCustomData().l().remove(str);
            return this;
        }

        @Deprecated
        public Builder setAdType(String str) {
            str.getClass();
            this.adType_ = str;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setAdTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.adType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAppData(App app) {
            a2 a2Var = this.appDataBuilder_;
            if (a2Var != null) {
                a2Var.i(app);
                return this;
            }
            app.getClass();
            this.appData_ = app;
            onChanged();
            return this;
        }

        public Builder setDeviceData(Device device) {
            a2 a2Var = this.deviceDataBuilder_;
            if (a2Var != null) {
                a2Var.i(device);
                return this;
            }
            device.getClass();
            this.deviceData_ = device;
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

        @Deprecated
        public Builder setHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var != null) {
                a2Var.i(headerBiddingPlacement);
                return this;
            }
            headerBiddingPlacement.getClass();
            this.hbPlacement_ = headerBiddingPlacement;
            onChanged();
            return this;
        }

        public Builder setPlacement(Placement placement) {
            a2 a2Var = this.placementBuilder_;
            if (a2Var != null) {
                a2Var.i(placement);
                return this;
            }
            placement.getClass();
            this.placement_ = placement;
            onChanged();
            return this;
        }

        public Builder setPlacementData(SDK sdk) {
            a2 a2Var = this.placementDataBuilder_;
            if (a2Var != null) {
                a2Var.i(sdk);
                return this;
            }
            sdk.getClass();
            this.placementData_ = sdk;
            onChanged();
            return this;
        }

        public Builder setSession(io.bidmachine.protobuf.sdk.Session session) {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var != null) {
                a2Var.i(session);
                return this;
            }
            session.getClass();
            this.session_ = session;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setSessionData(SessionData sessionData) {
            a2 a2Var = this.sessionDataBuilder_;
            if (a2Var != null) {
                a2Var.i(sessionData);
                return this;
            }
            sessionData.getClass();
            this.sessionData_ = sessionData;
            onChanged();
            return this;
        }

        public Builder setTokenHashValue(String str) {
            str.getClass();
            this.tokenHashValue_ = str;
            onChanged();
            return this;
        }

        public Builder setTokenHashValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tokenHashValue_ = byteString;
            onChanged();
            return this;
        }

        public Builder setUserData(User user) {
            a2 a2Var = this.userDataBuilder_;
            if (a2Var != null) {
                a2Var.i(user);
                return this;
            }
            user.getClass();
            this.userData_ = user;
            onChanged();
            return this;
        }

        private Builder() {
            this.tokenHashValue_ = "";
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestTokenPayload build() {
            RequestTokenPayload requestTokenPayloadBuildPartial = buildPartial();
            if (requestTokenPayloadBuildPartial.isInitialized()) {
                return requestTokenPayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestTokenPayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestTokenPayload buildPartial() {
            RequestTokenPayload requestTokenPayload = new RequestTokenPayload(this);
            requestTokenPayload.tokenHashValue_ = this.tokenHashValue_;
            requestTokenPayload.adType_ = this.adType_;
            a2 a2Var = this.placementDataBuilder_;
            if (a2Var == null) {
                requestTokenPayload.placementData_ = this.placementData_;
            } else {
                requestTokenPayload.placementData_ = (SDK) a2Var.a();
            }
            a2 a2Var2 = this.sessionDataBuilder_;
            if (a2Var2 == null) {
                requestTokenPayload.sessionData_ = this.sessionData_;
            } else {
                requestTokenPayload.sessionData_ = (SessionData) a2Var2.a();
            }
            a2 a2Var3 = this.sessionBuilder_;
            if (a2Var3 == null) {
                requestTokenPayload.session_ = this.session_;
            } else {
                requestTokenPayload.session_ = (io.bidmachine.protobuf.sdk.Session) a2Var3.a();
            }
            a2 a2Var4 = this.deviceDataBuilder_;
            if (a2Var4 == null) {
                requestTokenPayload.deviceData_ = this.deviceData_;
            } else {
                requestTokenPayload.deviceData_ = (Device) a2Var4.a();
            }
            a2 a2Var5 = this.userDataBuilder_;
            if (a2Var5 == null) {
                requestTokenPayload.userData_ = this.userData_;
            } else {
                requestTokenPayload.userData_ = (User) a2Var5.a();
            }
            a2 a2Var6 = this.appDataBuilder_;
            if (a2Var6 == null) {
                requestTokenPayload.appData_ = this.appData_;
            } else {
                requestTokenPayload.appData_ = (App) a2Var6.a();
            }
            a2 a2Var7 = this.hbPlacementBuilder_;
            if (a2Var7 == null) {
                requestTokenPayload.hbPlacement_ = this.hbPlacement_;
            } else {
                requestTokenPayload.hbPlacement_ = (HeaderBiddingPlacement) a2Var7.a();
            }
            requestTokenPayload.customData_ = internalGetCustomData();
            requestTokenPayload.customData_.n();
            a2 a2Var8 = this.placementBuilder_;
            if (a2Var8 == null) {
                requestTokenPayload.placement_ = this.placement_;
            } else {
                requestTokenPayload.placement_ = (Placement) a2Var8.a();
            }
            a2 a2Var9 = this.extBuilder_;
            if (a2Var9 == null) {
                requestTokenPayload.ext_ = this.ext_;
            } else {
                requestTokenPayload.ext_ = (Struct) a2Var9.a();
            }
            onBuilt();
            return requestTokenPayload;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public RequestTokenPayload getDefaultInstanceForType() {
            return RequestTokenPayload.getDefaultInstance();
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
            this.tokenHashValue_ = "";
            this.adType_ = "";
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
            } else {
                this.placementData_ = null;
                this.placementDataBuilder_ = null;
            }
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
            } else {
                this.sessionData_ = null;
                this.sessionDataBuilder_ = null;
            }
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
            } else {
                this.session_ = null;
                this.sessionBuilder_ = null;
            }
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
            } else {
                this.deviceData_ = null;
                this.deviceDataBuilder_ = null;
            }
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
            } else {
                this.userData_ = null;
                this.userDataBuilder_ = null;
            }
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
            } else {
                this.appData_ = null;
                this.appDataBuilder_ = null;
            }
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
            } else {
                this.hbPlacement_ = null;
                this.hbPlacementBuilder_ = null;
            }
            internalGetMutableCustomData().a();
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
        }

        public Builder setAppData(App.Builder builder) {
            a2 a2Var = this.appDataBuilder_;
            if (a2Var == null) {
                this.appData_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setDeviceData(Device.Builder builder) {
            a2 a2Var = this.deviceDataBuilder_;
            if (a2Var == null) {
                this.deviceData_ = builder.build();
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

        @Deprecated
        public Builder setHbPlacement(HeaderBiddingPlacement.Builder builder) {
            a2 a2Var = this.hbPlacementBuilder_;
            if (a2Var == null) {
                this.hbPlacement_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setPlacement(Placement.Builder builder) {
            a2 a2Var = this.placementBuilder_;
            if (a2Var == null) {
                this.placement_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setPlacementData(SDK.Builder builder) {
            a2 a2Var = this.placementDataBuilder_;
            if (a2Var == null) {
                this.placementData_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setSession(Session.Builder builder) {
            a2 a2Var = this.sessionBuilder_;
            if (a2Var == null) {
                this.session_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        @Deprecated
        public Builder setSessionData(SessionData.Builder builder) {
            a2 a2Var = this.sessionDataBuilder_;
            if (a2Var == null) {
                this.sessionData_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setUserData(User.Builder builder) {
            a2 a2Var = this.userDataBuilder_;
            if (a2Var == null) {
                this.userData_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.tokenHashValue_ = "";
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RequestTokenPayload) {
                return mergeFrom((RequestTokenPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestTokenPayload requestTokenPayload) {
            if (requestTokenPayload == RequestTokenPayload.getDefaultInstance()) {
                return this;
            }
            if (!requestTokenPayload.getTokenHashValue().isEmpty()) {
                this.tokenHashValue_ = requestTokenPayload.tokenHashValue_;
                onChanged();
            }
            if (!requestTokenPayload.getAdType().isEmpty()) {
                this.adType_ = requestTokenPayload.adType_;
                onChanged();
            }
            if (requestTokenPayload.hasPlacementData()) {
                mergePlacementData(requestTokenPayload.getPlacementData());
            }
            if (requestTokenPayload.hasSessionData()) {
                mergeSessionData(requestTokenPayload.getSessionData());
            }
            if (requestTokenPayload.hasSession()) {
                mergeSession(requestTokenPayload.getSession());
            }
            if (requestTokenPayload.hasDeviceData()) {
                mergeDeviceData(requestTokenPayload.getDeviceData());
            }
            if (requestTokenPayload.hasUserData()) {
                mergeUserData(requestTokenPayload.getUserData());
            }
            if (requestTokenPayload.hasAppData()) {
                mergeAppData(requestTokenPayload.getAppData());
            }
            if (requestTokenPayload.hasHbPlacement()) {
                mergeHbPlacement(requestTokenPayload.getHbPlacement());
            }
            internalGetMutableCustomData().o(requestTokenPayload.internalGetCustomData());
            if (requestTokenPayload.hasPlacement()) {
                mergePlacement(requestTokenPayload.getPlacement());
            }
            if (requestTokenPayload.hasExt()) {
                mergeExt(requestTokenPayload.getExt());
            }
            mergeUnknownFields(((h0) requestTokenPayload).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.RequestTokenPayload.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.RequestTokenPayload.access$4500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.RequestTokenPayload r3 = (io.bidmachine.protobuf.RequestTokenPayload) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.RequestTokenPayload r4 = (io.bidmachine.protobuf.RequestTokenPayload) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.RequestTokenPayload$Builder");
        }
    }

    public static Builder newBuilder(RequestTokenPayload requestTokenPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestTokenPayload);
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteBuffer, wVar);
    }

    private RequestTokenPayload(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (RequestTokenPayload) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public RequestTokenPayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private RequestTokenPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.tokenHashValue_ = "";
        this.adType_ = "";
    }

    public static RequestTokenPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static RequestTokenPayload parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(bArr, wVar);
    }

    public static RequestTokenPayload parseFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) h0.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RequestTokenPayload(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        byte b10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 10:
                            SDK sdk = this.placementData_;
                            SDK.Builder builder = sdk != null ? sdk.toBuilder() : null;
                            SDK sdk2 = (SDK) lVar.A(SDK.parser(), wVar);
                            this.placementData_ = sdk2;
                            if (builder != null) {
                                builder.mergeFrom(sdk2);
                                this.placementData_ = builder.buildPartial();
                            }
                            break;
                        case 18:
                            SessionData sessionData = this.sessionData_;
                            SessionData.Builder builder2 = sessionData != null ? sessionData.toBuilder() : null;
                            SessionData sessionData2 = (SessionData) lVar.A(SessionData.parser(), wVar);
                            this.sessionData_ = sessionData2;
                            if (builder2 != null) {
                                builder2.mergeFrom(sessionData2);
                                this.sessionData_ = builder2.buildPartial();
                            }
                            break;
                        case 26:
                            Device device = this.deviceData_;
                            Device.Builder builder3 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) lVar.A(Device.parser(), wVar);
                            this.deviceData_ = device2;
                            if (builder3 != null) {
                                builder3.mergeFrom(device2);
                                this.deviceData_ = builder3.buildPartial();
                            }
                            break;
                        case 34:
                            if (b10 == false) {
                                this.customData_ = w0.p(CustomDataDefaultEntryHolder.defaultEntry);
                                b10 = true;
                            }
                            u0 u0Var = (u0) lVar.A(CustomDataDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                            this.customData_.l().put(u0Var.i(), u0Var.k());
                            break;
                        case 42:
                            User user = this.userData_;
                            User.Builder builder4 = user != null ? user.toBuilder() : null;
                            User user2 = (User) lVar.A(User.parser(), wVar);
                            this.userData_ = user2;
                            if (builder4 != null) {
                                builder4.mergeFrom(user2);
                                this.userData_ = builder4.buildPartial();
                            }
                            break;
                        case 50:
                            App app = this.appData_;
                            App.Builder builder5 = app != null ? app.toBuilder() : null;
                            App app2 = (App) lVar.A(App.parser(), wVar);
                            this.appData_ = app2;
                            if (builder5 != null) {
                                builder5.mergeFrom(app2);
                                this.appData_ = builder5.buildPartial();
                            }
                            break;
                        case 58:
                            Struct struct = this.ext_;
                            Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.ext_ = struct2;
                            if (builder6 != null) {
                                builder6.mergeFrom(struct2);
                                this.ext_ = builder6.buildPartial();
                            }
                            break;
                        case 66:
                            this.tokenHashValue_ = lVar.J();
                            break;
                        case 74:
                            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
                            HeaderBiddingPlacement.Builder builder7 = headerBiddingPlacement != null ? headerBiddingPlacement.toBuilder() : null;
                            HeaderBiddingPlacement headerBiddingPlacement2 = (HeaderBiddingPlacement) lVar.A(HeaderBiddingPlacement.parser(), wVar);
                            this.hbPlacement_ = headerBiddingPlacement2;
                            if (builder7 != null) {
                                builder7.mergeFrom(headerBiddingPlacement2);
                                this.hbPlacement_ = builder7.buildPartial();
                            }
                            break;
                        case 82:
                            this.adType_ = lVar.J();
                            break;
                        case 90:
                            io.bidmachine.protobuf.sdk.Session session = this.session_;
                            Session.Builder builder8 = session != null ? session.toBuilder() : null;
                            io.bidmachine.protobuf.sdk.Session session2 = (io.bidmachine.protobuf.sdk.Session) lVar.A(io.bidmachine.protobuf.sdk.Session.parser(), wVar);
                            this.session_ = session2;
                            if (builder8 != null) {
                                builder8.mergeFrom(session2);
                                this.session_ = builder8.buildPartial();
                            }
                            break;
                        case 98:
                            Placement placement = this.placement_;
                            Placement.Builder builder9 = placement != null ? placement.toBuilder() : null;
                            Placement placement2 = (Placement) lVar.A(Placement.parser(), wVar);
                            this.placement_ = placement2;
                            if (builder9 != null) {
                                builder9.mergeFrom(placement2);
                                this.placement_ = builder9.buildPartial();
                            }
                            break;
                        default:
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                z10 = true;
                            }
                            break;
                    }
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

    public static RequestTokenPayload parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (RequestTokenPayload) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static RequestTokenPayload parseFrom(l lVar) throws IOException {
        return (RequestTokenPayload) h0.parseWithIOException(PARSER, lVar);
    }

    public static RequestTokenPayload parseFrom(l lVar, w wVar) throws IOException {
        return (RequestTokenPayload) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
