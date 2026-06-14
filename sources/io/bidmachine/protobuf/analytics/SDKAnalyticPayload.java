package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class SDKAnalyticPayload extends h0 implements SDKAnalyticPayloadOrBuilder {
    public static final int METRICS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Metric> metrics_;
    private static final SDKAnalyticPayload DEFAULT_INSTANCE = new SDKAnalyticPayload();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.1
        @Override // com.explorestack.protobuf.p1
        public SDKAnalyticPayload parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new SDKAnalyticPayload(lVar, wVar);
        }
    };

    public static final class Metric extends h0 implements MetricOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 2;
        private static final Metric DEFAULT_INSTANCE = new Metric();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.1
            @Override // com.explorestack.protobuf.p1
            public Metric parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Metric(lVar, wVar);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object context_;
        private List<MetricData> data_;
        private byte memoizedIsInitialized;

        public static final class MetricData extends h0 implements MetricDataOrBuilder {
            public static final int DIMENSIONS_FIELD_NUMBER = 3;
            public static final int ERROR_FIELD_NUMBER = 5;
            public static final int MEASURES_FIELD_NUMBER = 4;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int TIMESTAMP_FIELD_NUMBER = 1;
            public static final int TS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private List<Dimension> dimensions_;
            private Error error_;
            private List<Measure> measures_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object timestamp_;
            private Timestamp ts_;
            private static final MetricData DEFAULT_INSTANCE = new MetricData();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.1
                @Override // com.explorestack.protobuf.p1
                public MetricData parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new MetricData(lVar, wVar);
                }
            };

            public static final class Dimension extends h0 implements DimensionOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private volatile Object value_;
                private static final Dimension DEFAULT_INSTANCE = new Dimension();
                private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.1
                    @Override // com.explorestack.protobuf.p1
                    public Dimension parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new Dimension(lVar, wVar);
                    }
                };

                public static Dimension getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Dimension) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Dimension)) {
                        return super.equals(obj);
                    }
                    Dimension dimension = (Dimension) obj;
                    return getName().equals(dimension.getName()) && getValue().equals(dimension.getValue()) && this.unknownFields.equals(dimension.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
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
                    if (!getValueBytes().isEmpty()) {
                        iComputeStringSize += h0.computeStringSize(2, this.value_);
                    }
                    int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final r2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.h0
                protected h0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.d(Dimension.class, Builder.class);
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
                    return new Dimension();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(n nVar) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        h0.writeString(nVar, 1, this.name_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        h0.writeString(nVar, 2, this.value_);
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static final class Builder extends h0.b implements DimensionOrBuilder {
                    private Object name_;
                    private Object value_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = h0.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Dimension.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Dimension.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.d(Dimension.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
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

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        byteString.getClass();
                        a.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension build() {
                        Dimension dimensionBuildPartial = buildPartial();
                        if (dimensionBuildPartial.isInitialized()) {
                            return dimensionBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) dimensionBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension buildPartial() {
                        Dimension dimension = new Dimension(this);
                        dimension.name_ = this.name_;
                        dimension.value_ = this.value_;
                        onBuilt();
                        return dimension;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Dimension getDefaultInstanceForType() {
                        return Dimension.getDefaultInstance();
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
                        this.value_ = "";
                        return this;
                    }

                    private Builder(h0.c cVar) {
                        super(cVar);
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo4427clone() {
                        return (Builder) super.mo4427clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Dimension) {
                            return mergeFrom((Dimension) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Dimension dimension) {
                        if (dimension == Dimension.getDefaultInstance()) {
                            return this;
                        }
                        if (!dimension.getName().isEmpty()) {
                            this.name_ = dimension.name_;
                            onChanged();
                        }
                        if (!dimension.getValue().isEmpty()) {
                            this.value_ = dimension.value_;
                            onChanged();
                        }
                        mergeUnknownFields(((h0) dimension).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension$Builder");
                    }
                }

                public static Builder newBuilder(Dimension dimension) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(dimension);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteBuffer, wVar);
                }

                private Dimension(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Dimension) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static Dimension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Dimension getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Dimension parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Dimension() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.value_ = "";
                }

                public static Dimension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static Dimension parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (Dimension) PARSER.parseFrom(bArr, wVar);
                }

                public static Dimension parseFrom(InputStream inputStream) throws IOException {
                    return (Dimension) h0.parseWithIOException(PARSER, inputStream);
                }

                private Dimension(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        this.name_ = lVar.J();
                                    } else if (iK != 18) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        this.value_ = lVar.J();
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

                public static Dimension parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Dimension) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                public static Dimension parseFrom(l lVar) throws IOException {
                    return (Dimension) h0.parseWithIOException(PARSER, lVar);
                }

                public static Dimension parseFrom(l lVar, w wVar) throws IOException {
                    return (Dimension) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface DimensionOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                String getValue();

                ByteString getValueBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static final class Error extends h0 implements ErrorOrBuilder {
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.1
                    @Override // com.explorestack.protobuf.p1
                    public Error parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new Error(lVar, wVar);
                    }
                };

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
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
                    return getName().equals(error.getName()) && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                    if (!getDescriptionBytes().isEmpty()) {
                        iComputeStringSize += h0.computeStringSize(2, this.description_);
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
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.h0
                protected h0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.d(Error.class, Builder.class);
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
                    if (!getDescriptionBytes().isEmpty()) {
                        h0.writeString(nVar, 2, this.description_);
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static final class Builder extends h0.b implements ErrorOrBuilder {
                    private Object description_;
                    private Object name_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = h0.alwaysUseFieldBuilders;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Error.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.description_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.d(Error.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
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
                        this.description_ = "";
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
                        error.description_ = this.description_;
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
                        this.description_ = "";
                        return this;
                    }

                    private Builder(h0.c cVar) {
                        super(cVar);
                        this.name_ = "";
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
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
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
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.access$2800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error$Builder");
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
                    this.description_ = "";
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
                                        this.name_ = lVar.J();
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

            public interface ErrorOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

                String getDescription();

                ByteString getDescriptionBytes();

                String getName();

                ByteString getNameBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static final class Measure extends h0 implements MeasureOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private double value_;
                private static final Measure DEFAULT_INSTANCE = new Measure();
                private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.1
                    @Override // com.explorestack.protobuf.p1
                    public Measure parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                        return new Measure(lVar, wVar);
                    }
                };

                public static Measure getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Measure parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Measure) h0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteBuffer);
                }

                public static p1 parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Measure)) {
                        return super.equals(obj);
                    }
                    Measure measure = (Measure) obj;
                    return getName().equals(measure.getName()) && Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(measure.getValue()) && this.unknownFields.equals(measure.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
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
                    double d10 = this.value_;
                    if (d10 != 0.0d) {
                        iComputeStringSize += n.j(2, d10);
                    }
                    int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.MessageOrBuilder
                public final r2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public double getValue() {
                    return this.value_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getValue()))) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.h0
                protected h0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.d(Measure.class, Builder.class);
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
                    return new Measure();
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(n nVar) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        h0.writeString(nVar, 1, this.name_);
                    }
                    double d10 = this.value_;
                    if (d10 != 0.0d) {
                        nVar.t0(2, d10);
                    }
                    this.unknownFields.writeTo(nVar);
                }

                public static final class Builder extends h0.b implements MeasureOrBuilder {
                    private Object name_;
                    private double value_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = h0.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Measure.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = 0.0d;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public double getValue() {
                        return this.value_;
                    }

                    @Override // com.explorestack.protobuf.h0.b
                    protected h0.f internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.d(Measure.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
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

                    public Builder setValue(double d10) {
                        this.value_ = d10;
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
                    public Measure build() {
                        Measure measureBuildPartial = buildPartial();
                        if (measureBuildPartial.isInitialized()) {
                            return measureBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) measureBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure buildPartial() {
                        Measure measure = new Measure(this);
                        measure.name_ = this.name_;
                        measure.value_ = this.value_;
                        onBuilt();
                        return measure;
                    }

                    @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Measure getDefaultInstanceForType() {
                        return Measure.getDefaultInstance();
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
                        this.value_ = 0.0d;
                        return this;
                    }

                    private Builder(h0.c cVar) {
                        super(cVar);
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo4427clone() {
                        return (Builder) super.mo4427clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Measure) {
                            return mergeFrom((Measure) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Measure measure) {
                        if (measure == Measure.getDefaultInstance()) {
                            return this;
                        }
                        if (!measure.getName().isEmpty()) {
                            this.name_ = measure.name_;
                            onChanged();
                        }
                        if (measure.getValue() != 0.0d) {
                            setValue(measure.getValue());
                        }
                        mergeUnknownFields(((h0) measure).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure$Builder");
                    }
                }

                public static Builder newBuilder(Measure measure) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(measure);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteBuffer, wVar);
                }

                private Measure(h0.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Measure parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Measure) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
                }

                public static Measure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Measure getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Measure parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(byteString, wVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Measure() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                }

                public static Measure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.h0
                public Builder newBuilderForType(h0.c cVar) {
                    return new Builder(cVar);
                }

                public static Measure parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                    return (Measure) PARSER.parseFrom(bArr, wVar);
                }

                public static Measure parseFrom(InputStream inputStream) throws IOException {
                    return (Measure) h0.parseWithIOException(PARSER, inputStream);
                }

                private Measure(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                        this.name_ = lVar.J();
                                    } else if (iK != 17) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        this.value_ = lVar.s();
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

                public static Measure parseFrom(InputStream inputStream, w wVar) throws IOException {
                    return (Measure) h0.parseWithIOException(PARSER, inputStream, wVar);
                }

                public static Measure parseFrom(l lVar) throws IOException {
                    return (Measure) h0.parseWithIOException(PARSER, lVar);
                }

                public static Measure parseFrom(l lVar, w wVar) throws IOException {
                    return (Measure) h0.parseWithIOException(PARSER, lVar, wVar);
                }
            }

            public interface MeasureOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                double getValue();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static MetricData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MetricData) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MetricData)) {
                    return super.equals(obj);
                }
                MetricData metricData = (MetricData) obj;
                if (!getTimestamp().equals(metricData.getTimestamp()) || !getName().equals(metricData.getName()) || !getDimensionsList().equals(metricData.getDimensionsList()) || !getMeasuresList().equals(metricData.getMeasuresList()) || hasError() != metricData.hasError()) {
                    return false;
                }
                if ((!hasError() || getError().equals(metricData.getError())) && hasTs() == metricData.hasTs()) {
                    return (!hasTs() || getTs().equals(metricData.getTs())) && this.unknownFields.equals(metricData.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Dimension getDimensions(int i10) {
                return this.dimensions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Dimension> getDimensionsList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public DimensionOrBuilder getDimensionsOrBuilder(int i10) {
                return this.dimensions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Error getError() {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Measure getMeasures(int i10) {
                return this.measures_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getMeasuresCount() {
                return this.measures_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Measure> getMeasuresList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public MeasureOrBuilder getMeasuresOrBuilder(int i10) {
                return this.measures_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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
                int iComputeStringSize = !getTimestampBytes().isEmpty() ? h0.computeStringSize(1, this.timestamp_) : 0;
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += h0.computeStringSize(2, this.name_);
                }
                for (int i11 = 0; i11 < this.dimensions_.size(); i11++) {
                    iComputeStringSize += n.G(3, this.dimensions_.get(i11));
                }
                for (int i12 = 0; i12 < this.measures_.size(); i12++) {
                    iComputeStringSize += n.G(4, this.measures_.get(i12));
                }
                if (this.error_ != null) {
                    iComputeStringSize += n.G(5, getError());
                }
                if (this.ts_ != null) {
                    iComputeStringSize += n.G(6, getTs());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public String getTimestamp() {
                Object obj = this.timestamp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.timestamp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public ByteString getTimestampBytes() {
                Object obj = this.timestamp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.timestamp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Timestamp getTs() {
                Timestamp timestamp = this.ts_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public j2 getTsOrBuilder() {
                return getTs();
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasError() {
                return this.error_ != null;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasTs() {
                return this.ts_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getName().hashCode();
                if (getDimensionsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getDimensionsList().hashCode();
                }
                if (getMeasuresCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getMeasuresList().hashCode();
                }
                if (hasError()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getError().hashCode();
                }
                if (hasTs()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getTs().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.d(MetricData.class, Builder.class);
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
                return new MetricData();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getTimestampBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.timestamp_);
                }
                if (!getNameBytes().isEmpty()) {
                    h0.writeString(nVar, 2, this.name_);
                }
                for (int i10 = 0; i10 < this.dimensions_.size(); i10++) {
                    nVar.J0(3, this.dimensions_.get(i10));
                }
                for (int i11 = 0; i11 < this.measures_.size(); i11++) {
                    nVar.J0(4, this.measures_.get(i11));
                }
                if (this.error_ != null) {
                    nVar.J0(5, getError());
                }
                if (this.ts_ != null) {
                    nVar.J0(6, getTs());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements MetricDataOrBuilder {
                private int bitField0_;
                private v1 dimensionsBuilder_;
                private List<Dimension> dimensions_;
                private a2 errorBuilder_;
                private Error error_;
                private v1 measuresBuilder_;
                private List<Measure> measures_;
                private Object name_;
                private Object timestamp_;
                private a2 tsBuilder_;
                private Timestamp ts_;

                private void ensureDimensionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.dimensions_ = new ArrayList(this.dimensions_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureMeasuresIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.measures_ = new ArrayList(this.measures_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                private v1 getDimensionsFieldBuilder() {
                    if (this.dimensionsBuilder_ == null) {
                        this.dimensionsBuilder_ = new v1(this.dimensions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.dimensions_ = null;
                    }
                    return this.dimensionsBuilder_;
                }

                private a2 getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new a2(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private v1 getMeasuresFieldBuilder() {
                    if (this.measuresBuilder_ == null) {
                        this.measuresBuilder_ = new v1(this.measures_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.measures_ = null;
                    }
                    return this.measuresBuilder_;
                }

                private a2 getTsFieldBuilder() {
                    if (this.tsBuilder_ == null) {
                        this.tsBuilder_ = new a2(getTs(), getParentForChildren(), isClean());
                        this.ts_ = null;
                    }
                    return this.tsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getDimensionsFieldBuilder();
                        getMeasuresFieldBuilder();
                    }
                }

                public Builder addAllDimensions(Iterable<? extends Dimension> iterable) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.dimensions_);
                    onChanged();
                    return this;
                }

                public Builder addAllMeasures(Iterable<? extends Measure> iterable) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.measures_);
                    onChanged();
                    return this;
                }

                public Builder addDimensions(Dimension dimension) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var != null) {
                        v1Var.e(dimension);
                        return this;
                    }
                    dimension.getClass();
                    ensureDimensionsIsMutable();
                    this.dimensions_.add(dimension);
                    onChanged();
                    return this;
                }

                public Dimension.Builder addDimensionsBuilder() {
                    return (Dimension.Builder) getDimensionsFieldBuilder().c(Dimension.getDefaultInstance());
                }

                public Builder addMeasures(Measure measure) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var != null) {
                        v1Var.e(measure);
                        return this;
                    }
                    measure.getClass();
                    ensureMeasuresIsMutable();
                    this.measures_.add(measure);
                    onChanged();
                    return this;
                }

                public Measure.Builder addMeasuresBuilder() {
                    return (Measure.Builder) getMeasuresFieldBuilder().c(Measure.getDefaultInstance());
                }

                public Builder clearDimensions() {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.dimensions_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
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

                public Builder clearMeasures() {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.measures_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = MetricData.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder clearTimestamp() {
                    this.timestamp_ = MetricData.getDefaultInstance().getTimestamp();
                    onChanged();
                    return this;
                }

                public Builder clearTs() {
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        onChanged();
                        return this;
                    }
                    this.ts_ = null;
                    this.tsBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Dimension getDimensions(int i10) {
                    v1 v1Var = this.dimensionsBuilder_;
                    return v1Var == null ? this.dimensions_.get(i10) : (Dimension) v1Var.n(i10);
                }

                public Dimension.Builder getDimensionsBuilder(int i10) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().k(i10);
                }

                public List<Dimension.Builder> getDimensionsBuilderList() {
                    return getDimensionsFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getDimensionsCount() {
                    v1 v1Var = this.dimensionsBuilder_;
                    return v1Var == null ? this.dimensions_.size() : v1Var.m();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Dimension> getDimensionsList() {
                    v1 v1Var = this.dimensionsBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.dimensions_) : v1Var.p();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public DimensionOrBuilder getDimensionsOrBuilder(int i10) {
                    v1 v1Var = this.dimensionsBuilder_;
                    return v1Var == null ? this.dimensions_.get(i10) : (DimensionOrBuilder) v1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                    v1 v1Var = this.dimensionsBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.dimensions_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Error getError() {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        return (Error) a2Var.e();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                public Error.Builder getErrorBuilder() {
                    onChanged();
                    return (Error.Builder) getErrorFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ErrorOrBuilder getErrorOrBuilder() {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        return (ErrorOrBuilder) a2Var.f();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Measure getMeasures(int i10) {
                    v1 v1Var = this.measuresBuilder_;
                    return v1Var == null ? this.measures_.get(i10) : (Measure) v1Var.n(i10);
                }

                public Measure.Builder getMeasuresBuilder(int i10) {
                    return (Measure.Builder) getMeasuresFieldBuilder().k(i10);
                }

                public List<Measure.Builder> getMeasuresBuilderList() {
                    return getMeasuresFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getMeasuresCount() {
                    v1 v1Var = this.measuresBuilder_;
                    return v1Var == null ? this.measures_.size() : v1Var.m();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Measure> getMeasuresList() {
                    v1 v1Var = this.measuresBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.measures_) : v1Var.p();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public MeasureOrBuilder getMeasuresOrBuilder(int i10) {
                    v1 v1Var = this.measuresBuilder_;
                    return v1Var == null ? this.measures_.get(i10) : (MeasureOrBuilder) v1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                    v1 v1Var = this.measuresBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.measures_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public String getTimestamp() {
                    Object obj = this.timestamp_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.timestamp_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public ByteString getTimestampBytes() {
                    Object obj = this.timestamp_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.timestamp_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Timestamp getTs() {
                    a2 a2Var = this.tsBuilder_;
                    if (a2Var != null) {
                        return (Timestamp) a2Var.e();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                public Timestamp.Builder getTsBuilder() {
                    onChanged();
                    return (Timestamp.Builder) getTsFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public j2 getTsOrBuilder() {
                    a2 a2Var = this.tsBuilder_;
                    if (a2Var != null) {
                        return (j2) a2Var.f();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasError() {
                    return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasTs() {
                    return (this.tsBuilder_ == null && this.ts_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.d(MetricData.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeError(Error error) {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        a2Var.g(error);
                        return this;
                    }
                    Error error2 = this.error_;
                    if (error2 != null) {
                        this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
                    } else {
                        this.error_ = error;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeTs(Timestamp timestamp) {
                    a2 a2Var = this.tsBuilder_;
                    if (a2Var != null) {
                        a2Var.g(timestamp);
                        return this;
                    }
                    Timestamp timestamp2 = this.ts_;
                    if (timestamp2 != null) {
                        this.ts_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.ts_ = timestamp;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeDimensions(int i10) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureDimensionsIsMutable();
                    this.dimensions_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder removeMeasures(int i10) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureMeasuresIsMutable();
                    this.measures_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setDimensions(int i10, Dimension dimension) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, dimension);
                        return this;
                    }
                    dimension.getClass();
                    ensureDimensionsIsMutable();
                    this.dimensions_.set(i10, dimension);
                    onChanged();
                    return this;
                }

                public Builder setError(Error error) {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var != null) {
                        a2Var.i(error);
                        return this;
                    }
                    error.getClass();
                    this.error_ = error;
                    onChanged();
                    return this;
                }

                public Builder setMeasures(int i10, Measure measure) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, measure);
                        return this;
                    }
                    measure.getClass();
                    ensureMeasuresIsMutable();
                    this.measures_.set(i10, measure);
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

                @Deprecated
                public Builder setTimestamp(String str) {
                    str.getClass();
                    this.timestamp_ = str;
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder setTimestampBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.timestamp_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTs(Timestamp timestamp) {
                    a2 a2Var = this.tsBuilder_;
                    if (a2Var != null) {
                        a2Var.i(timestamp);
                        return this;
                    }
                    timestamp.getClass();
                    this.ts_ = timestamp;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.timestamp_ = "";
                    this.name_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.dimensions_ = list;
                    this.measures_ = list;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData build() {
                    MetricData metricDataBuildPartial = buildPartial();
                    if (metricDataBuildPartial.isInitialized()) {
                        return metricDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDataBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData buildPartial() {
                    MetricData metricData = new MetricData(this);
                    metricData.timestamp_ = this.timestamp_;
                    metricData.name_ = this.name_;
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var != null) {
                        metricData.dimensions_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.dimensions_ = DesugarCollections.unmodifiableList(this.dimensions_);
                            this.bitField0_ &= -2;
                        }
                        metricData.dimensions_ = this.dimensions_;
                    }
                    v1 v1Var2 = this.measuresBuilder_;
                    if (v1Var2 != null) {
                        metricData.measures_ = v1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.measures_ = DesugarCollections.unmodifiableList(this.measures_);
                            this.bitField0_ &= -3;
                        }
                        metricData.measures_ = this.measures_;
                    }
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var == null) {
                        metricData.error_ = this.error_;
                    } else {
                        metricData.error_ = (Error) a2Var.a();
                    }
                    a2 a2Var2 = this.tsBuilder_;
                    if (a2Var2 == null) {
                        metricData.ts_ = this.ts_;
                    } else {
                        metricData.ts_ = (Timestamp) a2Var2.a();
                    }
                    onBuilt();
                    return metricData;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public MetricData getDefaultInstanceForType() {
                    return MetricData.getDefaultInstance();
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

                public Dimension.Builder addDimensionsBuilder(int i10) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().b(i10, Dimension.getDefaultInstance());
                }

                public Measure.Builder addMeasuresBuilder(int i10) {
                    return (Measure.Builder) getMeasuresFieldBuilder().b(i10, Measure.getDefaultInstance());
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
                    this.timestamp_ = "";
                    this.name_ = "";
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var == null) {
                        this.dimensions_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        v1Var.g();
                    }
                    v1 v1Var2 = this.measuresBuilder_;
                    if (v1Var2 == null) {
                        this.measures_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                    } else {
                        v1Var2.g();
                    }
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        return this;
                    }
                    this.ts_ = null;
                    this.tsBuilder_ = null;
                    return this;
                }

                public Builder setError(Error.Builder builder) {
                    a2 a2Var = this.errorBuilder_;
                    if (a2Var == null) {
                        this.error_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder setTs(Timestamp.Builder builder) {
                    a2 a2Var = this.tsBuilder_;
                    if (a2Var == null) {
                        this.ts_ = builder.build();
                        onChanged();
                        return this;
                    }
                    a2Var.i(builder.build());
                    return this;
                }

                public Builder addDimensions(int i10, Dimension dimension) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i10, dimension);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, dimension);
                    return this;
                }

                public Builder addMeasures(int i10, Measure measure) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(i10, measure);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, measure);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof MetricData) {
                        return mergeFrom((MetricData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setDimensions(int i10, Dimension.Builder builder) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder setMeasures(int i10, Measure.Builder builder) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.timestamp_ = "";
                    this.name_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.dimensions_ = list;
                    this.measures_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(MetricData metricData) {
                    if (metricData == MetricData.getDefaultInstance()) {
                        return this;
                    }
                    if (!metricData.getTimestamp().isEmpty()) {
                        this.timestamp_ = metricData.timestamp_;
                        onChanged();
                    }
                    if (!metricData.getName().isEmpty()) {
                        this.name_ = metricData.name_;
                        onChanged();
                    }
                    if (this.dimensionsBuilder_ == null) {
                        if (!metricData.dimensions_.isEmpty()) {
                            if (this.dimensions_.isEmpty()) {
                                this.dimensions_ = metricData.dimensions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureDimensionsIsMutable();
                                this.dimensions_.addAll(metricData.dimensions_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.dimensions_.isEmpty()) {
                        if (!this.dimensionsBuilder_.t()) {
                            this.dimensionsBuilder_.a(metricData.dimensions_);
                        } else {
                            this.dimensionsBuilder_.h();
                            this.dimensionsBuilder_ = null;
                            this.dimensions_ = metricData.dimensions_;
                            this.bitField0_ &= -2;
                            this.dimensionsBuilder_ = h0.alwaysUseFieldBuilders ? getDimensionsFieldBuilder() : null;
                        }
                    }
                    if (this.measuresBuilder_ == null) {
                        if (!metricData.measures_.isEmpty()) {
                            if (this.measures_.isEmpty()) {
                                this.measures_ = metricData.measures_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureMeasuresIsMutable();
                                this.measures_.addAll(metricData.measures_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.measures_.isEmpty()) {
                        if (!this.measuresBuilder_.t()) {
                            this.measuresBuilder_.a(metricData.measures_);
                        } else {
                            this.measuresBuilder_.h();
                            this.measuresBuilder_ = null;
                            this.measures_ = metricData.measures_;
                            this.bitField0_ &= -3;
                            this.measuresBuilder_ = h0.alwaysUseFieldBuilders ? getMeasuresFieldBuilder() : null;
                        }
                    }
                    if (metricData.hasError()) {
                        mergeError(metricData.getError());
                    }
                    if (metricData.hasTs()) {
                        mergeTs(metricData.getTs());
                    }
                    mergeUnknownFields(((h0) metricData).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addDimensions(Dimension.Builder builder) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addMeasures(Measure.Builder builder) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addDimensions(int i10, Dimension.Builder builder) {
                    v1 v1Var = this.dimensionsBuilder_;
                    if (v1Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, builder.build());
                    return this;
                }

                public Builder addMeasures(int i10, Measure.Builder builder) {
                    v1 v1Var = this.measuresBuilder_;
                    if (v1Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.access$4500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Builder");
                }
            }

            public static Builder newBuilder(MetricData metricData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricData);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteBuffer, wVar);
            }

            private MetricData(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (MetricData) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static MetricData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public MetricData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static MetricData parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private MetricData() {
                this.memoizedIsInitialized = (byte) -1;
                this.timestamp_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.dimensions_ = list;
                this.measures_ = list;
            }

            public static MetricData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static MetricData parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (MetricData) PARSER.parseFrom(bArr, wVar);
            }

            public static MetricData parseFrom(InputStream inputStream) throws IOException {
                return (MetricData) h0.parseWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (MetricData) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            private MetricData(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.timestamp_ = lVar.J();
                                } else if (iK == 18) {
                                    this.name_ = lVar.J();
                                } else if (iK == 26) {
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 == 0) {
                                        this.dimensions_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.dimensions_.add((Dimension) lVar.A(Dimension.parser(), wVar));
                                } else if (iK != 34) {
                                    if (iK == 42) {
                                        Error error = this.error_;
                                        Error.Builder builder = error != null ? error.toBuilder() : null;
                                        Error error2 = (Error) lVar.A(Error.parser(), wVar);
                                        this.error_ = error2;
                                        if (builder != null) {
                                            builder.mergeFrom(error2);
                                            this.error_ = builder.buildPartial();
                                        }
                                    } else if (iK != 50) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        Timestamp timestamp = this.ts_;
                                        Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                                        Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                                        this.ts_ = timestamp2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(timestamp2);
                                            this.ts_ = builder2.buildPartial();
                                        }
                                    }
                                } else {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.measures_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.measures_.add((Measure) lVar.A(Measure.parser(), wVar));
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (((i10 == true ? 1 : 0) & 1) != 0) {
                            this.dimensions_ = DesugarCollections.unmodifiableList(this.dimensions_);
                        }
                        if (((i10 == true ? 1 : 0) & 2) != 0) {
                            this.measures_ = DesugarCollections.unmodifiableList(this.measures_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.dimensions_ = DesugarCollections.unmodifiableList(this.dimensions_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.measures_ = DesugarCollections.unmodifiableList(this.measures_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static MetricData parseFrom(l lVar) throws IOException {
                return (MetricData) h0.parseWithIOException(PARSER, lVar);
            }

            public static MetricData parseFrom(l lVar, w wVar) throws IOException {
                return (MetricData) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface MetricDataOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            MetricData.Dimension getDimensions(int i10);

            int getDimensionsCount();

            List<MetricData.Dimension> getDimensionsList();

            MetricData.DimensionOrBuilder getDimensionsOrBuilder(int i10);

            List<? extends MetricData.DimensionOrBuilder> getDimensionsOrBuilderList();

            MetricData.Error getError();

            MetricData.ErrorOrBuilder getErrorOrBuilder();

            MetricData.Measure getMeasures(int i10);

            int getMeasuresCount();

            List<MetricData.Measure> getMeasuresList();

            MetricData.MeasureOrBuilder getMeasuresOrBuilder(int i10);

            List<? extends MetricData.MeasureOrBuilder> getMeasuresOrBuilderList();

            String getName();

            ByteString getNameBytes();

            @Deprecated
            String getTimestamp();

            @Deprecated
            ByteString getTimestampBytes();

            Timestamp getTs();

            j2 getTsOrBuilder();

            boolean hasError();

            boolean hasTs();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Metric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metric) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metric)) {
                return super.equals(obj);
            }
            Metric metric = (Metric) obj;
            return getContext().equals(metric.getContext()) && getDataList().equals(metric.getDataList()) && this.unknownFields.equals(metric.unknownFields);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricData getData(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<MetricData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricDataOrBuilder getDataOrBuilder(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
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
            int iComputeStringSize = !getContextBytes().isEmpty() ? h0.computeStringSize(1, this.context_) : 0;
            for (int i11 = 0; i11 < this.data_.size(); i11++) {
                iComputeStringSize += n.G(2, this.data_.get(i11));
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContext().hashCode();
            if (getDataCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.d(Metric.class, Builder.class);
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
            return new Metric();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getContextBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.context_);
            }
            for (int i10 = 0; i10 < this.data_.size(); i10++) {
                nVar.J0(2, this.data_.get(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements MetricOrBuilder {
            private int bitField0_;
            private Object context_;
            private v1 dataBuilder_;
            private List<MetricData> data_;

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private v1 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new v1(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends MetricData> iterable) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureDataIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.data_);
                onChanged();
                return this;
            }

            public Builder addData(MetricData metricData) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.e(metricData);
                    return this;
                }
                metricData.getClass();
                ensureDataIsMutable();
                this.data_.add(metricData);
                onChanged();
                return this;
            }

            public MetricData.Builder addDataBuilder() {
                return (MetricData.Builder) getDataFieldBuilder().c(MetricData.getDefaultInstance());
            }

            public Builder clearContext() {
                this.context_ = Metric.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            public Builder clearData() {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.data_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricData getData(int i10) {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.get(i10) : (MetricData) v1Var.n(i10);
            }

            public MetricData.Builder getDataBuilder(int i10) {
                return (MetricData.Builder) getDataFieldBuilder().k(i10);
            }

            public List<MetricData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public int getDataCount() {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<MetricData> getDataList() {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.data_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricDataOrBuilder getDataOrBuilder(int i10) {
                v1 v1Var = this.dataBuilder_;
                return v1Var == null ? this.data_.get(i10) : (MetricDataOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
                v1 v1Var = this.dataBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.d(Metric.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeData(int i10) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureDataIsMutable();
                this.data_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setContext(String str) {
                str.getClass();
                this.context_ = str;
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
                onChanged();
                return this;
            }

            public Builder setData(int i10, MetricData metricData) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, metricData);
                    return this;
                }
                metricData.getClass();
                ensureDataIsMutable();
                this.data_.set(i10, metricData);
                onChanged();
                return this;
            }

            private Builder() {
                this.context_ = "";
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric build() {
                Metric metricBuildPartial = buildPartial();
                if (metricBuildPartial.isInitialized()) {
                    return metricBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric buildPartial() {
                Metric metric = new Metric(this);
                metric.context_ = this.context_;
                v1 v1Var = this.dataBuilder_;
                if (v1Var != null) {
                    metric.data_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = DesugarCollections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    metric.data_ = this.data_;
                }
                onBuilt();
                return metric;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Metric getDefaultInstanceForType() {
                return Metric.getDefaultInstance();
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

            public MetricData.Builder addDataBuilder(int i10) {
                return (MetricData.Builder) getDataFieldBuilder().b(i10, MetricData.getDefaultInstance());
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
                this.context_ = "";
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    this.data_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                v1Var.g();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.context_ = "";
                this.data_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i10, MetricData metricData) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i10, metricData);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, metricData);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Metric) {
                    return mergeFrom((Metric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i10, MetricData.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Metric metric) {
                if (metric == Metric.getDefaultInstance()) {
                    return this;
                }
                if (!metric.getContext().isEmpty()) {
                    this.context_ = metric.context_;
                    onChanged();
                }
                if (this.dataBuilder_ == null) {
                    if (!metric.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = metric.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(metric.data_);
                        }
                        onChanged();
                    }
                } else if (!metric.data_.isEmpty()) {
                    if (!this.dataBuilder_.t()) {
                        this.dataBuilder_.a(metric.data_);
                    } else {
                        this.dataBuilder_.h();
                        this.dataBuilder_ = null;
                        this.data_ = metric.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = h0.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) metric).unknownFields);
                onChanged();
                return this;
            }

            public Builder addData(MetricData.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addData(int i10, MetricData.Builder builder) {
                v1 v1Var = this.dataBuilder_;
                if (v1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(i10, builder.build());
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
            public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.access$5700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$Builder");
            }
        }

        public static Builder newBuilder(Metric metric) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Metric(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Metric parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Metric) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Metric getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Metric parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Metric() {
            this.memoizedIsInitialized = (byte) -1;
            this.context_ = "";
            this.data_ = Collections.EMPTY_LIST;
        }

        public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Metric parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Metric) PARSER.parseFrom(bArr, wVar);
        }

        public static Metric parseFrom(InputStream inputStream) throws IOException {
            return (Metric) h0.parseWithIOException(PARSER, inputStream);
        }

        private Metric(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                this.context_ = lVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.data_ = new ArrayList();
                                    z11 = true;
                                }
                                this.data_.add((MetricData) lVar.A(MetricData.parser(), wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.data_ = DesugarCollections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.data_ = DesugarCollections.unmodifiableList(this.data_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Metric parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Metric) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Metric parseFrom(l lVar) throws IOException {
            return (Metric) h0.parseWithIOException(PARSER, lVar);
        }

        public static Metric parseFrom(l lVar, w wVar) throws IOException {
            return (Metric) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface MetricOrBuilder extends MessageOrBuilder {
        String getContext();

        ByteString getContextBytes();

        Metric.MetricData getData(int i10);

        int getDataCount();

        List<Metric.MetricData> getDataList();

        Metric.MetricDataOrBuilder getDataOrBuilder(int i10);

        List<? extends Metric.MetricDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static SDKAnalyticPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKAnalyticPayload)) {
            return super.equals(obj);
        }
        SDKAnalyticPayload sDKAnalyticPayload = (SDKAnalyticPayload) obj;
        return getMetricsList().equals(sDKAnalyticPayload.getMetricsList()) && this.unknownFields.equals(sDKAnalyticPayload.unknownFields);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public Metric getMetrics(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<Metric> getMetricsList() {
        return this.metrics_;
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public MetricOrBuilder getMetricsOrBuilder(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
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
        for (int i11 = 0; i11 < this.metrics_.size(); i11++) {
            iG += n.G(1, this.metrics_.get(i11));
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
        if (getMetricsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getMetricsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.d(SDKAnalyticPayload.class, Builder.class);
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
        return new SDKAnalyticPayload();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        for (int i10 = 0; i10 < this.metrics_.size(); i10++) {
            nVar.J0(1, this.metrics_.get(i10));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements SDKAnalyticPayloadOrBuilder {
        private int bitField0_;
        private v1 metricsBuilder_;
        private List<Metric> metrics_;

        private void ensureMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metrics_ = new ArrayList(this.metrics_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        private v1 getMetricsFieldBuilder() {
            if (this.metricsBuilder_ == null) {
                this.metricsBuilder_ = new v1(this.metrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.metrics_ = null;
            }
            return this.metricsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getMetricsFieldBuilder();
            }
        }

        public Builder addAllMetrics(Iterable<? extends Metric> iterable) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureMetricsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.metrics_);
            onChanged();
            return this;
        }

        public Builder addMetrics(Metric metric) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var != null) {
                v1Var.e(metric);
                return this;
            }
            metric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(metric);
            onChanged();
            return this;
        }

        public Metric.Builder addMetricsBuilder() {
            return (Metric.Builder) getMetricsFieldBuilder().c(Metric.getDefaultInstance());
        }

        public Builder clearMetrics() {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.metrics_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public Metric getMetrics(int i10) {
            v1 v1Var = this.metricsBuilder_;
            return v1Var == null ? this.metrics_.get(i10) : (Metric) v1Var.n(i10);
        }

        public Metric.Builder getMetricsBuilder(int i10) {
            return (Metric.Builder) getMetricsFieldBuilder().k(i10);
        }

        public List<Metric.Builder> getMetricsBuilderList() {
            return getMetricsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public int getMetricsCount() {
            v1 v1Var = this.metricsBuilder_;
            return v1Var == null ? this.metrics_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<Metric> getMetricsList() {
            v1 v1Var = this.metricsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.metrics_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public MetricOrBuilder getMetricsOrBuilder(int i10) {
            v1 v1Var = this.metricsBuilder_;
            return v1Var == null ? this.metrics_.get(i10) : (MetricOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
            v1 v1Var = this.metricsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.metrics_);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.d(SDKAnalyticPayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeMetrics(int i10) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureMetricsIsMutable();
            this.metrics_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setMetrics(int i10, Metric metric) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, metric);
                return this;
            }
            metric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i10, metric);
            onChanged();
            return this;
        }

        private Builder() {
            this.metrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload build() {
            SDKAnalyticPayload sDKAnalyticPayloadBuildPartial = buildPartial();
            if (sDKAnalyticPayloadBuildPartial.isInitialized()) {
                return sDKAnalyticPayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDKAnalyticPayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload buildPartial() {
            SDKAnalyticPayload sDKAnalyticPayload = new SDKAnalyticPayload(this);
            int i10 = this.bitField0_;
            v1 v1Var = this.metricsBuilder_;
            if (v1Var == null) {
                if ((i10 & 1) != 0) {
                    this.metrics_ = DesugarCollections.unmodifiableList(this.metrics_);
                    this.bitField0_ &= -2;
                }
                sDKAnalyticPayload.metrics_ = this.metrics_;
            } else {
                sDKAnalyticPayload.metrics_ = v1Var.f();
            }
            onBuilt();
            return sDKAnalyticPayload;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public SDKAnalyticPayload getDefaultInstanceForType() {
            return SDKAnalyticPayload.getDefaultInstance();
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

        public Metric.Builder addMetricsBuilder(int i10) {
            return (Metric.Builder) getMetricsFieldBuilder().b(i10, Metric.getDefaultInstance());
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
            v1 v1Var = this.metricsBuilder_;
            if (v1Var == null) {
                this.metrics_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            v1Var.g();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.metrics_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addMetrics(int i10, Metric metric) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(i10, metric);
                onChanged();
                return this;
            }
            v1Var.d(i10, metric);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SDKAnalyticPayload) {
                return mergeFrom((SDKAnalyticPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMetrics(int i10, Metric.Builder builder) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(SDKAnalyticPayload sDKAnalyticPayload) {
            if (sDKAnalyticPayload == SDKAnalyticPayload.getDefaultInstance()) {
                return this;
            }
            if (this.metricsBuilder_ == null) {
                if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = sDKAnalyticPayload.metrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(sDKAnalyticPayload.metrics_);
                    }
                    onChanged();
                }
            } else if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                if (!this.metricsBuilder_.t()) {
                    this.metricsBuilder_.a(sDKAnalyticPayload.metrics_);
                } else {
                    this.metricsBuilder_.h();
                    this.metricsBuilder_ = null;
                    this.metrics_ = sDKAnalyticPayload.metrics_;
                    this.bitField0_ &= -2;
                    this.metricsBuilder_ = h0.alwaysUseFieldBuilders ? getMetricsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) sDKAnalyticPayload).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMetrics(Metric.Builder builder) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addMetrics(int i10, Metric.Builder builder) {
            v1 v1Var = this.metricsBuilder_;
            if (v1Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.access$6700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Builder");
        }
    }

    public static Builder newBuilder(SDKAnalyticPayload sDKAnalyticPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKAnalyticPayload);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteBuffer, wVar);
    }

    private SDKAnalyticPayload(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (SDKAnalyticPayload) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SDKAnalyticPayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDKAnalyticPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.metrics_ = Collections.EMPTY_LIST;
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (SDKAnalyticPayload) PARSER.parseFrom(bArr, wVar);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) h0.parseWithIOException(PARSER, inputStream);
    }

    private SDKAnalyticPayload(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.metrics_ = new ArrayList();
                                    z11 = true;
                                }
                                this.metrics_.add((Metric) lVar.A(Metric.parser(), wVar));
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
                    this.metrics_ = DesugarCollections.unmodifiableList(this.metrics_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.metrics_ = DesugarCollections.unmodifiableList(this.metrics_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (SDKAnalyticPayload) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static SDKAnalyticPayload parseFrom(l lVar) throws IOException {
        return (SDKAnalyticPayload) h0.parseWithIOException(PARSER, lVar);
    }

    public static SDKAnalyticPayload parseFrom(l lVar, w wVar) throws IOException {
        return (SDKAnalyticPayload) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
