package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class AdNetwork extends h0 implements AdNetworkOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int CLASS_NAME_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private List<AdUnit> adUnits_;
    private volatile Object className_;
    private w0 customParams_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private static final AdNetwork DEFAULT_INSTANCE = new AdNetwork();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.AdNetwork.1
        @Override // com.explorestack.protobuf.p1
        public AdNetwork parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new AdNetwork(lVar, wVar);
        }
    };

    public static final class AdUnit extends h0 implements AdUnitOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        public static final int CUSTOM_PARAMS_FIELD_NUMBER = 2;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.AdNetwork.AdUnit.1
            @Override // com.explorestack.protobuf.p1
            public AdUnit parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AdUnit(lVar, wVar);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object adFormat_;
        private w0 customParams_;
        private byte memoizedIsInitialized;

        private static final class CustomParamsDefaultEntryHolder {
            static final u0 defaultEntry;

            static {
                Descriptors.Descriptor descriptor = InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor;
                z2.b bVar = z2.b.f19481l;
                defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
            }

            private CustomParamsDefaultEntryHolder() {
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public w0 internalGetCustomParams() {
            w0 w0Var = this.customParams_;
            return w0Var == null ? w0.g(CustomParamsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().i().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return super.equals(obj);
            }
            AdUnit adUnit = (AdUnit) obj;
            return getAdFormat().equals(adUnit.getAdFormat()) && internalGetCustomParams().equals(adUnit.internalGetCustomParams()) && this.unknownFields.equals(adUnit.unknownFields);
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getAdFormat() {
            Object obj = this.adFormat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adFormat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public ByteString getAdFormatBytes() {
            Object obj = this.adFormat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adFormat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().i().size();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().i();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetCustomParams().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetCustomParams().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
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
            int iComputeStringSize = !getAdFormatBytes().isEmpty() ? h0.computeStringSize(1, this.adFormat_) : 0;
            for (Map.Entry entry : internalGetCustomParams().i().entrySet()) {
                iComputeStringSize += n.G(2, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdFormat().hashCode();
            if (!internalGetCustomParams().i().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetCustomParams().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0
        protected w0 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetCustomParams();
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
            return new AdUnit();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getAdFormatBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.adFormat_);
            }
            h0.serializeStringMapTo(nVar, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 2);
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AdUnitOrBuilder {
            private Object adFormat_;
            private int bitField0_;
            private w0 customParams_;

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            private w0 internalGetCustomParams() {
                w0 w0Var = this.customParams_;
                return w0Var == null ? w0.g(CustomParamsDefaultEntryHolder.defaultEntry) : w0Var;
            }

            private w0 internalGetMutableCustomParams() {
                onChanged();
                if (this.customParams_ == null) {
                    this.customParams_ = w0.p(CustomParamsDefaultEntryHolder.defaultEntry);
                }
                if (!this.customParams_.m()) {
                    this.customParams_ = this.customParams_.f();
                }
                return this.customParams_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearAdFormat() {
                this.adFormat_ = AdUnit.getDefaultInstance().getAdFormat();
                onChanged();
                return this;
            }

            public Builder clearCustomParams() {
                internalGetMutableCustomParams().l().clear();
                return this;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public boolean containsCustomParams(String str) {
                str.getClass();
                return internalGetCustomParams().i().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getAdFormat() {
                Object obj = this.adFormat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adFormat_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public ByteString getAdFormatBytes() {
                Object obj = this.adFormat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adFormat_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getCustomParams() {
                return getCustomParamsMap();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public int getCustomParamsCount() {
                return internalGetCustomParams().i().size();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public Map<String, String> getCustomParamsMap() {
                return internalGetCustomParams().i();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrDefault(String str, String str2) {
                str.getClass();
                Map mapI = internalGetCustomParams().i();
                return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrThrow(String str) {
                str.getClass();
                Map mapI = internalGetCustomParams().i();
                if (mapI.containsKey(str)) {
                    return (String) mapI.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            @Deprecated
            public Map<String, String> getMutableCustomParams() {
                return internalGetMutableCustomParams().l();
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable.d(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMapField(int i10) {
                if (i10 == 2) {
                    return internalGetCustomParams();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected w0 internalGetMutableMapField(int i10) {
                if (i10 == 2) {
                    return internalGetMutableCustomParams();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllCustomParams(Map<String, String> map) {
                internalGetMutableCustomParams().l().putAll(map);
                return this;
            }

            public Builder putCustomParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCustomParams().l().put(str, str2);
                return this;
            }

            public Builder removeCustomParams(String str) {
                str.getClass();
                internalGetMutableCustomParams().l().remove(str);
                return this;
            }

            public Builder setAdFormat(String str) {
                str.getClass();
                this.adFormat_ = str;
                onChanged();
                return this;
            }

            public Builder setAdFormatBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.adFormat_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit build() {
                AdUnit adUnitBuildPartial = buildPartial();
                if (adUnitBuildPartial.isInitialized()) {
                    return adUnitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit buildPartial() {
                AdUnit adUnit = new AdUnit(this);
                adUnit.adFormat_ = this.adFormat_;
                adUnit.customParams_ = internalGetCustomParams();
                adUnit.customParams_.n();
                onBuilt();
                return adUnit;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return AdUnit.getDefaultInstance();
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
                this.adFormat_ = "";
                internalGetMutableCustomParams().a();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdUnit) {
                    return mergeFrom((AdUnit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdUnit adUnit) {
                if (adUnit == AdUnit.getDefaultInstance()) {
                    return this;
                }
                if (!adUnit.getAdFormat().isEmpty()) {
                    this.adFormat_ = adUnit.adFormat_;
                    onChanged();
                }
                internalGetMutableCustomParams().o(adUnit.internalGetCustomParams());
                mergeUnknownFields(((h0) adUnit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.AdNetwork.AdUnit.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.AdNetwork.AdUnit.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.AdNetwork$AdUnit r3 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.AdNetwork$AdUnit r4 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.AdNetwork$AdUnit$Builder");
            }
        }

        public static Builder newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AdUnit(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdUnit) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdUnit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdUnit parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdUnit() {
            this.memoizedIsInitialized = (byte) -1;
            this.adFormat_ = "";
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static AdUnit parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr, wVar);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, inputStream);
        }

        private AdUnit(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK == 10) {
                                this.adFormat_ = lVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.customParams_ = w0.p(CustomParamsDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                u0 u0Var = (u0) lVar.A(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                                this.customParams_.l().put(u0Var.i(), u0Var.k());
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

        public static AdUnit parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static AdUnit parseFrom(l lVar) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, lVar);
        }

        public static AdUnit parseFrom(l lVar, w wVar) throws IOException {
            return (AdUnit) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface AdUnitOrBuilder extends MessageOrBuilder {
        boolean containsCustomParams(String str);

        String getAdFormat();

        ByteString getAdFormatBytes();

        @Deprecated
        Map<String, String> getCustomParams();

        int getCustomParamsCount();

        Map<String, String> getCustomParamsMap();

        String getCustomParamsOrDefault(String str, String str2);

        String getCustomParamsOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private static final class CustomParamsDefaultEntryHolder {
        static final u0 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = InitProto.internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor;
            z2.b bVar = z2.b.f19481l;
            defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
        }

        private CustomParamsDefaultEntryHolder() {
        }
    }

    public static AdNetwork getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetCustomParams() {
        w0 w0Var = this.customParams_;
        return w0Var == null ? w0.g(CustomParamsDefaultEntryHolder.defaultEntry) : w0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public boolean containsCustomParams(String str) {
        str.getClass();
        return internalGetCustomParams().i().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdNetwork)) {
            return super.equals(obj);
        }
        AdNetwork adNetwork = (AdNetwork) obj;
        return getName().equals(adNetwork.getName()) && getClassName().equals(adNetwork.getClassName()) && internalGetCustomParams().equals(adNetwork.internalGetCustomParams()) && getAdUnitsList().equals(adNetwork.getAdUnitsList()) && this.unknownFields.equals(adNetwork.unknownFields);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnit getAdUnits(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getClassName() {
        Object obj = this.className_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.className_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public ByteString getClassNameBytes() {
        Object obj = this.className_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.className_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public int getCustomParamsCount() {
        return internalGetCustomParams().i().size();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().i();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrDefault(String str, String str2) {
        str.getClass();
        Map mapI = internalGetCustomParams().i();
        return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetCustomParams().i();
        if (mapI.containsKey(str)) {
            return (String) mapI.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
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

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? h0.computeStringSize(1, this.name_) : 0;
        if (!getClassNameBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.className_);
        }
        for (Map.Entry entry : internalGetCustomParams().i().entrySet()) {
            iComputeStringSize += n.G(3, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
        for (int i11 = 0; i11 < this.adUnits_.size(); i11++) {
            iComputeStringSize += n.G(4, this.adUnits_.get(i11));
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getClassName().hashCode();
        if (!internalGetCustomParams().i().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetCustomParams().hashCode();
        }
        if (getAdUnitsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getAdUnitsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.d(AdNetwork.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.h0
    protected w0 internalGetMapField(int i10) {
        if (i10 == 3) {
            return internalGetCustomParams();
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
        return new AdNetwork();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.name_);
        }
        if (!getClassNameBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.className_);
        }
        h0.serializeStringMapTo(nVar, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 3);
        for (int i10 = 0; i10 < this.adUnits_.size(); i10++) {
            nVar.J0(4, this.adUnits_.get(i10));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements AdNetworkOrBuilder {
        private v1 adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;
        private Object className_;
        private w0 customParams_;
        private Object name_;

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 2;
            }
        }

        private v1 getAdUnitsFieldBuilder() {
            if (this.adUnitsBuilder_ == null) {
                this.adUnitsBuilder_ = new v1(this.adUnits_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        private w0 internalGetCustomParams() {
            w0 w0Var = this.customParams_;
            return w0Var == null ? w0.g(CustomParamsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private w0 internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = w0.p(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.m()) {
                this.customParams_ = this.customParams_.f();
            }
            return this.customParams_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getAdUnitsFieldBuilder();
            }
        }

        public Builder addAdUnits(AdUnit adUnit) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.e(adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.add(adUnit);
            onChanged();
            return this;
        }

        public AdUnit.Builder addAdUnitsBuilder() {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().c(AdUnit.getDefaultInstance());
        }

        public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureAdUnitsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.adUnits_);
            onChanged();
            return this;
        }

        public Builder clearAdUnits() {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.adUnits_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearClassName() {
            this.className_ = AdNetwork.getDefaultInstance().getClassName();
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().l().clear();
            return this;
        }

        public Builder clearName() {
            this.name_ = AdNetwork.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().i().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public AdUnit getAdUnits(int i10) {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? this.adUnits_.get(i10) : (AdUnit) v1Var.n(i10);
        }

        public AdUnit.Builder getAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().k(i10);
        }

        public List<AdUnit.Builder> getAdUnitsBuilderList() {
            return getAdUnitsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public int getAdUnitsCount() {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? this.adUnits_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public List<AdUnit> getAdUnitsList() {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.adUnits_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var == null ? this.adUnits_.get(i10) : (AdUnitOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            v1 v1Var = this.adUnitsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.adUnits_);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getClassName() {
            Object obj = this.className_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.className_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getClassNameBytes() {
            Object obj = this.className_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.className_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().i().size();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().i();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetCustomParams().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetCustomParams().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().l();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.d(AdNetwork.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMapField(int i10) {
            if (i10 == 3) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMutableMapField(int i10) {
            if (i10 == 3) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().l().putAll(map);
            return this;
        }

        public Builder putCustomParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomParams().l().put(str, str2);
            return this;
        }

        public Builder removeAdUnits(int i10) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureAdUnitsIsMutable();
            this.adUnits_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeCustomParams(String str) {
            str.getClass();
            internalGetMutableCustomParams().l().remove(str);
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit adUnit) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.set(i10, adUnit);
            onChanged();
            return this;
        }

        public Builder setClassName(String str) {
            str.getClass();
            this.className_ = str;
            onChanged();
            return this;
        }

        public Builder setClassNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.className_ = byteString;
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

        private Builder() {
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork build() {
            AdNetwork adNetworkBuildPartial = buildPartial();
            if (adNetworkBuildPartial.isInitialized()) {
                return adNetworkBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adNetworkBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork buildPartial() {
            AdNetwork adNetwork = new AdNetwork(this);
            adNetwork.name_ = this.name_;
            adNetwork.className_ = this.className_;
            adNetwork.customParams_ = internalGetCustomParams();
            adNetwork.customParams_.n();
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var != null) {
                adNetwork.adUnits_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -3;
                }
                adNetwork.adUnits_ = this.adUnits_;
            }
            onBuilt();
            return adNetwork;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public AdNetwork getDefaultInstanceForType() {
            return AdNetwork.getDefaultInstance();
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

        public AdUnit.Builder addAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().b(i10, AdUnit.getDefaultInstance());
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
            this.className_ = "";
            internalGetMutableCustomParams().a();
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                this.adUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                return this;
            }
            v1Var.g();
            return this;
        }

        public Builder addAdUnits(int i10, AdUnit adUnit) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, adUnit);
                onChanged();
                return this;
            }
            v1Var.d(i10, adUnit);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdNetwork) {
                return mergeFrom((AdNetwork) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit.Builder builder) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AdNetwork adNetwork) {
            if (adNetwork == AdNetwork.getDefaultInstance()) {
                return this;
            }
            if (!adNetwork.getName().isEmpty()) {
                this.name_ = adNetwork.name_;
                onChanged();
            }
            if (!adNetwork.getClassName().isEmpty()) {
                this.className_ = adNetwork.className_;
                onChanged();
            }
            internalGetMutableCustomParams().o(adNetwork.internalGetCustomParams());
            if (this.adUnitsBuilder_ == null) {
                if (!adNetwork.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = adNetwork.adUnits_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(adNetwork.adUnits_);
                    }
                    onChanged();
                }
            } else if (!adNetwork.adUnits_.isEmpty()) {
                if (!this.adUnitsBuilder_.t()) {
                    this.adUnitsBuilder_.a(adNetwork.adUnits_);
                } else {
                    this.adUnitsBuilder_.h();
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = adNetwork.adUnits_;
                    this.bitField0_ &= -3;
                    this.adUnitsBuilder_ = h0.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) adNetwork).unknownFields);
            onChanged();
            return this;
        }

        public Builder addAdUnits(AdUnit.Builder builder) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addAdUnits(int i10, AdUnit.Builder builder) {
            v1 v1Var = this.adUnitsBuilder_;
            if (v1Var == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.AdNetwork.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.AdNetwork.access$2200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.AdNetwork r3 = (io.bidmachine.protobuf.AdNetwork) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.AdNetwork r4 = (io.bidmachine.protobuf.AdNetwork) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.AdNetwork$Builder");
        }
    }

    public static Builder newBuilder(AdNetwork adNetwork) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adNetwork);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteBuffer, wVar);
    }

    private AdNetwork(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (AdNetwork) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static AdNetwork parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AdNetwork getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdNetwork parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdNetwork() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.className_ = "";
        this.adUnits_ = Collections.EMPTY_LIST;
    }

    public static AdNetwork parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static AdNetwork parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(bArr, wVar);
    }

    public static AdNetwork parseFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) h0.parseWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (AdNetwork) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    private AdNetwork(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.name_ = lVar.J();
                        } else if (iK == 18) {
                            this.className_ = lVar.J();
                        } else if (iK == 26) {
                            if ((i10 & 1) == 0) {
                                this.customParams_ = w0.p(CustomParamsDefaultEntryHolder.defaultEntry);
                                i10 |= 1;
                            }
                            u0 u0Var = (u0) lVar.A(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                            this.customParams_.l().put(u0Var.i(), u0Var.k());
                        } else if (iK != 34) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            if ((i10 & 2) == 0) {
                                this.adUnits_ = new ArrayList();
                                i10 |= 2;
                            }
                            this.adUnits_.add((AdUnit) lVar.A(AdUnit.parser(), wVar));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 2) != 0) {
                    this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 2) != 0) {
            this.adUnits_ = DesugarCollections.unmodifiableList(this.adUnits_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static AdNetwork parseFrom(l lVar) throws IOException {
        return (AdNetwork) h0.parseWithIOException(PARSER, lVar);
    }

    public static AdNetwork parseFrom(l lVar, w wVar) throws IOException {
        return (AdNetwork) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
