package io.bidmachine.protobuf.rendering;

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
import com.explorestack.protobuf.j0;
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

/* JADX INFO: loaded from: classes3.dex */
public final class RenderingFeature extends h0 implements RenderingFeatureOrBuilder {
    public static final int BROKEN_CREATIVE_DETECTOR_FIELD_NUMBER = 1;
    private static final RenderingFeature DEFAULT_INSTANCE = new RenderingFeature();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.1
        @Override // com.explorestack.protobuf.p1
        public RenderingFeature parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new RenderingFeature(lVar, wVar);
        }
    };
    private static final long serialVersionUID = 0;
    private int featureCase_;
    private Object feature_;
    private byte memoizedIsInitialized;

    /* JADX INFO: renamed from: io.bidmachine.protobuf.rendering.RenderingFeature$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase;
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase;

        static {
            int[] iArr = new int[FeatureCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase = iArr;
            try {
                iArr[FeatureCase.BROKEN_CREATIVE_DETECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase[FeatureCase.FEATURE_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BrokenCreativeDetector.PayloadOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase = iArr2;
            try {
                iArr2[BrokenCreativeDetector.PayloadOneofCase.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase[BrokenCreativeDetector.PayloadOneofCase.CONFIGURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase[BrokenCreativeDetector.PayloadOneofCase.PAYLOADONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class BrokenCreativeDetector extends h0 implements BrokenCreativeDetectorOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 2;
        public static final int EVENT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private static final BrokenCreativeDetector DEFAULT_INSTANCE = new BrokenCreativeDetector();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.1
            @Override // com.explorestack.protobuf.p1
            public BrokenCreativeDetector parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new BrokenCreativeDetector(lVar, wVar);
            }
        };

        public static final class Algorithm extends h0 implements AlgorithmOrBuilder {
            public static final int NAME_FIELD_NUMBER = 1;
            public static final int THRESHOLD_FIELD_NUMBER = 3;
            public static final int WEIGHT_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private double threshold_;
            private double weight_;
            private static final Algorithm DEFAULT_INSTANCE = new Algorithm();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.1
                @Override // com.explorestack.protobuf.p1
                public Algorithm parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Algorithm(lVar, wVar);
                }
            };

            public static Algorithm getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Algorithm parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Algorithm) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Algorithm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Algorithm)) {
                    return super.equals(obj);
                }
                Algorithm algorithm = (Algorithm) obj;
                return getName().equals(algorithm.getName()) && Double.doubleToLongBits(getWeight()) == Double.doubleToLongBits(algorithm.getWeight()) && Double.doubleToLongBits(getThreshold()) == Double.doubleToLongBits(algorithm.getThreshold()) && this.unknownFields.equals(algorithm.unknownFields);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
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
                double d10 = this.weight_;
                if (d10 != 0.0d) {
                    iComputeStringSize += n.j(2, d10);
                }
                double d11 = this.threshold_;
                if (d11 != 0.0d) {
                    iComputeStringSize += n.j(3, d11);
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
            public double getThreshold() {
                return this.threshold_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
            public double getWeight() {
                return this.weight_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getWeight()))) * 37) + 3) * 53) + j0.i(Double.doubleToLongBits(getThreshold()))) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_fieldAccessorTable.d(Algorithm.class, Builder.class);
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
                return new Algorithm();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if (!getNameBytes().isEmpty()) {
                    h0.writeString(nVar, 1, this.name_);
                }
                double d10 = this.weight_;
                if (d10 != 0.0d) {
                    nVar.t0(2, d10);
                }
                double d11 = this.threshold_;
                if (d11 != 0.0d) {
                    nVar.t0(3, d11);
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements AlgorithmOrBuilder {
                private Object name_;
                private double threshold_;
                private double weight_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearName() {
                    this.name_ = Algorithm.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder clearThreshold() {
                    this.threshold_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearWeight() {
                    this.weight_ = 0.0d;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public double getThreshold() {
                    return this.threshold_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmOrBuilder
                public double getWeight() {
                    return this.weight_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_fieldAccessorTable.d(Algorithm.class, Builder.class);
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

                public Builder setThreshold(double d10) {
                    this.threshold_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setWeight(double d10) {
                    this.weight_ = d10;
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
                public Algorithm build() {
                    Algorithm algorithmBuildPartial = buildPartial();
                    if (algorithmBuildPartial.isInitialized()) {
                        return algorithmBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) algorithmBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Algorithm buildPartial() {
                    Algorithm algorithm = new Algorithm(this);
                    algorithm.name_ = this.name_;
                    algorithm.weight_ = this.weight_;
                    algorithm.threshold_ = this.threshold_;
                    onBuilt();
                    return algorithm;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Algorithm getDefaultInstanceForType() {
                    return Algorithm.getDefaultInstance();
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
                    this.weight_ = 0.0d;
                    this.threshold_ = 0.0d;
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
                    if (message instanceof Algorithm) {
                        return mergeFrom((Algorithm) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Algorithm algorithm) {
                    if (algorithm == Algorithm.getDefaultInstance()) {
                        return this;
                    }
                    if (!algorithm.getName().isEmpty()) {
                        this.name_ = algorithm.name_;
                        onChanged();
                    }
                    if (algorithm.getWeight() != 0.0d) {
                        setWeight(algorithm.getWeight());
                    }
                    if (algorithm.getThreshold() != 0.0d) {
                        setThreshold(algorithm.getThreshold());
                    }
                    mergeUnknownFields(((h0) algorithm).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Algorithm r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Algorithm r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Algorithm.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Algorithm$Builder");
                }
            }

            public static Builder newBuilder(Algorithm algorithm) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(algorithm);
            }

            public static Algorithm parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Algorithm(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Algorithm parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Algorithm) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Algorithm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Algorithm getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Algorithm parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Algorithm() {
                this.memoizedIsInitialized = (byte) -1;
                this.name_ = "";
            }

            public static Algorithm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Algorithm parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Algorithm) PARSER.parseFrom(bArr, wVar);
            }

            public static Algorithm parseFrom(InputStream inputStream) throws IOException {
                return (Algorithm) h0.parseWithIOException(PARSER, inputStream);
            }

            private Algorithm(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                } else if (iK == 17) {
                                    this.weight_ = lVar.s();
                                } else if (iK != 25) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.threshold_ = lVar.s();
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

            public static Algorithm parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Algorithm) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Algorithm parseFrom(l lVar) throws IOException {
                return (Algorithm) h0.parseWithIOException(PARSER, lVar);
            }

            public static Algorithm parseFrom(l lVar, w wVar) throws IOException {
                return (Algorithm) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface AlgorithmOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            String getName();

            ByteString getNameBytes();

            double getThreshold();

            double getWeight();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class AlgorithmResult extends h0 implements AlgorithmResultOrBuilder {
            public static final int ALGORITHM_FIELD_NUMBER = 3;
            public static final int DURATION_FIELD_NUMBER = 2;
            public static final int RESULT_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private Algorithm algorithm_;
            private double duration_;
            private byte memoizedIsInitialized;
            private int result_;
            private static final AlgorithmResult DEFAULT_INSTANCE = new AlgorithmResult();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.1
                @Override // com.explorestack.protobuf.p1
                public AlgorithmResult parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new AlgorithmResult(lVar, wVar);
                }
            };

            public static AlgorithmResult getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AlgorithmResult parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AlgorithmResult) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AlgorithmResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AlgorithmResult)) {
                    return super.equals(obj);
                }
                AlgorithmResult algorithmResult = (AlgorithmResult) obj;
                if (getResult() == algorithmResult.getResult() && Double.doubleToLongBits(getDuration()) == Double.doubleToLongBits(algorithmResult.getDuration()) && hasAlgorithm() == algorithmResult.hasAlgorithm()) {
                    return (!hasAlgorithm() || getAlgorithm().equals(algorithmResult.getAlgorithm())) && this.unknownFields.equals(algorithmResult.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public Algorithm getAlgorithm() {
                Algorithm algorithm = this.algorithm_;
                return algorithm == null ? Algorithm.getDefaultInstance() : algorithm;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public AlgorithmOrBuilder getAlgorithmOrBuilder() {
                return getAlgorithm();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public double getDuration() {
                return this.duration_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public int getResult() {
                return this.result_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.result_;
                int iX = i11 != 0 ? n.x(1, i11) : 0;
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    iX += n.j(2, d10);
                }
                if (this.algorithm_ != null) {
                    iX += n.G(3, getAlgorithm());
                }
                int serializedSize = iX + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
            public boolean hasAlgorithm() {
                return this.algorithm_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getResult()) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getDuration()));
                if (hasAlgorithm()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getAlgorithm().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_fieldAccessorTable.d(AlgorithmResult.class, Builder.class);
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
                return new AlgorithmResult();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                int i10 = this.result_;
                if (i10 != 0) {
                    nVar.F0(1, i10);
                }
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    nVar.t0(2, d10);
                }
                if (this.algorithm_ != null) {
                    nVar.J0(3, getAlgorithm());
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements AlgorithmResultOrBuilder {
                private a2 algorithmBuilder_;
                private Algorithm algorithm_;
                private double duration_;
                private int result_;

                private a2 getAlgorithmFieldBuilder() {
                    if (this.algorithmBuilder_ == null) {
                        this.algorithmBuilder_ = new a2(getAlgorithm(), getParentForChildren(), isClean());
                        this.algorithm_ = null;
                    }
                    return this.algorithmBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = h0.alwaysUseFieldBuilders;
                }

                public Builder clearAlgorithm() {
                    if (this.algorithmBuilder_ == null) {
                        this.algorithm_ = null;
                        onChanged();
                        return this;
                    }
                    this.algorithm_ = null;
                    this.algorithmBuilder_ = null;
                    return this;
                }

                public Builder clearDuration() {
                    this.duration_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearResult() {
                    this.result_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public Algorithm getAlgorithm() {
                    a2 a2Var = this.algorithmBuilder_;
                    if (a2Var != null) {
                        return (Algorithm) a2Var.e();
                    }
                    Algorithm algorithm = this.algorithm_;
                    return algorithm == null ? Algorithm.getDefaultInstance() : algorithm;
                }

                public Algorithm.Builder getAlgorithmBuilder() {
                    onChanged();
                    return (Algorithm.Builder) getAlgorithmFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public AlgorithmOrBuilder getAlgorithmOrBuilder() {
                    a2 a2Var = this.algorithmBuilder_;
                    if (a2Var != null) {
                        return (AlgorithmOrBuilder) a2Var.f();
                    }
                    Algorithm algorithm = this.algorithm_;
                    return algorithm == null ? Algorithm.getDefaultInstance() : algorithm;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public double getDuration() {
                    return this.duration_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public int getResult() {
                    return this.result_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResultOrBuilder
                public boolean hasAlgorithm() {
                    return (this.algorithmBuilder_ == null && this.algorithm_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_fieldAccessorTable.d(AlgorithmResult.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeAlgorithm(Algorithm algorithm) {
                    a2 a2Var = this.algorithmBuilder_;
                    if (a2Var != null) {
                        a2Var.g(algorithm);
                        return this;
                    }
                    Algorithm algorithm2 = this.algorithm_;
                    if (algorithm2 != null) {
                        this.algorithm_ = Algorithm.newBuilder(algorithm2).mergeFrom(algorithm).buildPartial();
                    } else {
                        this.algorithm_ = algorithm;
                    }
                    onChanged();
                    return this;
                }

                public Builder setAlgorithm(Algorithm algorithm) {
                    a2 a2Var = this.algorithmBuilder_;
                    if (a2Var != null) {
                        a2Var.i(algorithm);
                        return this;
                    }
                    algorithm.getClass();
                    this.algorithm_ = algorithm;
                    onChanged();
                    return this;
                }

                public Builder setDuration(double d10) {
                    this.duration_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setResult(int i10) {
                    this.result_ = i10;
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
                public AlgorithmResult build() {
                    AlgorithmResult algorithmResultBuildPartial = buildPartial();
                    if (algorithmResultBuildPartial.isInitialized()) {
                        return algorithmResultBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) algorithmResultBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AlgorithmResult buildPartial() {
                    AlgorithmResult algorithmResult = new AlgorithmResult(this);
                    algorithmResult.result_ = this.result_;
                    algorithmResult.duration_ = this.duration_;
                    a2 a2Var = this.algorithmBuilder_;
                    if (a2Var == null) {
                        algorithmResult.algorithm_ = this.algorithm_;
                    } else {
                        algorithmResult.algorithm_ = (Algorithm) a2Var.a();
                    }
                    onBuilt();
                    return algorithmResult;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public AlgorithmResult getDefaultInstanceForType() {
                    return AlgorithmResult.getDefaultInstance();
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
                    this.result_ = 0;
                    this.duration_ = 0.0d;
                    if (this.algorithmBuilder_ == null) {
                        this.algorithm_ = null;
                        return this;
                    }
                    this.algorithm_ = null;
                    this.algorithmBuilder_ = null;
                    return this;
                }

                public Builder setAlgorithm(Algorithm.Builder builder) {
                    a2 a2Var = this.algorithmBuilder_;
                    if (a2Var == null) {
                        this.algorithm_ = builder.build();
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
                    if (message instanceof AlgorithmResult) {
                        return mergeFrom((AlgorithmResult) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AlgorithmResult algorithmResult) {
                    if (algorithmResult == AlgorithmResult.getDefaultInstance()) {
                        return this;
                    }
                    if (algorithmResult.getResult() != 0) {
                        setResult(algorithmResult.getResult());
                    }
                    if (algorithmResult.getDuration() != 0.0d) {
                        setDuration(algorithmResult.getDuration());
                    }
                    if (algorithmResult.hasAlgorithm()) {
                        mergeAlgorithm(algorithmResult.getAlgorithm());
                    }
                    mergeUnknownFields(((h0) algorithmResult).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.access$1900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$AlgorithmResult r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$AlgorithmResult r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.AlgorithmResult.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$AlgorithmResult$Builder");
                }
            }

            public static Builder newBuilder(AlgorithmResult algorithmResult) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(algorithmResult);
            }

            public static AlgorithmResult parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteBuffer, wVar);
            }

            private AlgorithmResult(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AlgorithmResult parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (AlgorithmResult) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static AlgorithmResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AlgorithmResult getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AlgorithmResult parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AlgorithmResult() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AlgorithmResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static AlgorithmResult parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (AlgorithmResult) PARSER.parseFrom(bArr, wVar);
            }

            private AlgorithmResult(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    this.result_ = lVar.y();
                                } else if (iK == 17) {
                                    this.duration_ = lVar.s();
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    Algorithm algorithm = this.algorithm_;
                                    Algorithm.Builder builder = algorithm != null ? algorithm.toBuilder() : null;
                                    Algorithm algorithm2 = (Algorithm) lVar.A(Algorithm.parser(), wVar);
                                    this.algorithm_ = algorithm2;
                                    if (builder != null) {
                                        builder.mergeFrom(algorithm2);
                                        this.algorithm_ = builder.buildPartial();
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

            public static AlgorithmResult parseFrom(InputStream inputStream) throws IOException {
                return (AlgorithmResult) h0.parseWithIOException(PARSER, inputStream);
            }

            public static AlgorithmResult parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (AlgorithmResult) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static AlgorithmResult parseFrom(l lVar) throws IOException {
                return (AlgorithmResult) h0.parseWithIOException(PARSER, lVar);
            }

            public static AlgorithmResult parseFrom(l lVar, w wVar) throws IOException {
                return (AlgorithmResult) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface AlgorithmResultOrBuilder extends MessageOrBuilder {
            Algorithm getAlgorithm();

            AlgorithmOrBuilder getAlgorithmOrBuilder();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            double getDuration();

            int getResult();

            boolean hasAlgorithm();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Configuration extends h0 implements ConfigurationOrBuilder {
            public static final int ALGORITHMS_FIELD_NUMBER = 7;
            public static final int ALLOW_DUPLICATE_FIELD_NUMBER = 4;
            public static final int DOWNSCALE_FACTOR_FIELD_NUMBER = 2;
            public static final int ERROR_ONLY_FIELD_NUMBER = 3;
            public static final int STOP_AFTER_FIELD_NUMBER = 5;
            public static final int TIMEOUT_FIELD_NUMBER = 1;
            public static final int WEIGHT_THRESHOLD_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private List<Algorithm> algorithms_;
            private boolean allowDuplicate_;
            private double downscaleFactor_;
            private boolean errorOnly_;
            private byte memoizedIsInitialized;
            private volatile Object stopAfter_;
            private double timeout_;
            private double weightThreshold_;
            private static final Configuration DEFAULT_INSTANCE = new Configuration();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.1
                @Override // com.explorestack.protobuf.p1
                public Configuration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Configuration(lVar, wVar);
                }
            };

            public static Configuration getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Configuration)) {
                    return super.equals(obj);
                }
                Configuration configuration = (Configuration) obj;
                return Double.doubleToLongBits(getTimeout()) == Double.doubleToLongBits(configuration.getTimeout()) && Double.doubleToLongBits(getDownscaleFactor()) == Double.doubleToLongBits(configuration.getDownscaleFactor()) && getErrorOnly() == configuration.getErrorOnly() && getAllowDuplicate() == configuration.getAllowDuplicate() && getStopAfter().equals(configuration.getStopAfter()) && Double.doubleToLongBits(getWeightThreshold()) == Double.doubleToLongBits(configuration.getWeightThreshold()) && getAlgorithmsList().equals(configuration.getAlgorithmsList()) && this.unknownFields.equals(configuration.unknownFields);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public Algorithm getAlgorithms(int i10) {
                return this.algorithms_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public int getAlgorithmsCount() {
                return this.algorithms_.size();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public List<Algorithm> getAlgorithmsList() {
                return this.algorithms_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public AlgorithmOrBuilder getAlgorithmsOrBuilder(int i10) {
                return this.algorithms_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public List<? extends AlgorithmOrBuilder> getAlgorithmsOrBuilderList() {
                return this.algorithms_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public boolean getAllowDuplicate() {
                return this.allowDuplicate_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public double getDownscaleFactor() {
                return this.downscaleFactor_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public boolean getErrorOnly() {
                return this.errorOnly_;
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
                double d10 = this.timeout_;
                int iJ = d10 != 0.0d ? n.j(1, d10) : 0;
                double d11 = this.downscaleFactor_;
                if (d11 != 0.0d) {
                    iJ += n.j(2, d11);
                }
                boolean z10 = this.errorOnly_;
                if (z10) {
                    iJ += n.e(3, z10);
                }
                boolean z11 = this.allowDuplicate_;
                if (z11) {
                    iJ += n.e(4, z11);
                }
                if (!getStopAfterBytes().isEmpty()) {
                    iJ += h0.computeStringSize(5, this.stopAfter_);
                }
                double d12 = this.weightThreshold_;
                if (d12 != 0.0d) {
                    iJ += n.j(6, d12);
                }
                for (int i11 = 0; i11 < this.algorithms_.size(); i11++) {
                    iJ += n.G(7, this.algorithms_.get(i11));
                }
                int serializedSize = iJ + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public String getStopAfter() {
                Object obj = this.stopAfter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stopAfter_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public ByteString getStopAfterBytes() {
                Object obj = this.stopAfter_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stopAfter_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public double getTimeout() {
                return this.timeout_;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
            public double getWeightThreshold() {
                return this.weightThreshold_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(Double.doubleToLongBits(getTimeout()))) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getDownscaleFactor()))) * 37) + 3) * 53) + j0.d(getErrorOnly())) * 37) + 4) * 53) + j0.d(getAllowDuplicate())) * 37) + 5) * 53) + getStopAfter().hashCode()) * 37) + 6) * 53) + j0.i(Double.doubleToLongBits(getWeightThreshold()));
                if (getAlgorithmsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 7) * 53) + getAlgorithmsList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
                return new Configuration();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                double d10 = this.timeout_;
                if (d10 != 0.0d) {
                    nVar.t0(1, d10);
                }
                double d11 = this.downscaleFactor_;
                if (d11 != 0.0d) {
                    nVar.t0(2, d11);
                }
                boolean z10 = this.errorOnly_;
                if (z10) {
                    nVar.n0(3, z10);
                }
                boolean z11 = this.allowDuplicate_;
                if (z11) {
                    nVar.n0(4, z11);
                }
                if (!getStopAfterBytes().isEmpty()) {
                    h0.writeString(nVar, 5, this.stopAfter_);
                }
                double d12 = this.weightThreshold_;
                if (d12 != 0.0d) {
                    nVar.t0(6, d12);
                }
                for (int i10 = 0; i10 < this.algorithms_.size(); i10++) {
                    nVar.J0(7, this.algorithms_.get(i10));
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements ConfigurationOrBuilder {
                private v1 algorithmsBuilder_;
                private List<Algorithm> algorithms_;
                private boolean allowDuplicate_;
                private int bitField0_;
                private double downscaleFactor_;
                private boolean errorOnly_;
                private Object stopAfter_;
                private double timeout_;
                private double weightThreshold_;

                private void ensureAlgorithmsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.algorithms_ = new ArrayList(this.algorithms_);
                        this.bitField0_ |= 1;
                    }
                }

                private v1 getAlgorithmsFieldBuilder() {
                    if (this.algorithmsBuilder_ == null) {
                        this.algorithmsBuilder_ = new v1(this.algorithms_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.algorithms_ = null;
                    }
                    return this.algorithmsBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getAlgorithmsFieldBuilder();
                    }
                }

                public Builder addAlgorithms(Algorithm algorithm) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var != null) {
                        v1Var.e(algorithm);
                        return this;
                    }
                    algorithm.getClass();
                    ensureAlgorithmsIsMutable();
                    this.algorithms_.add(algorithm);
                    onChanged();
                    return this;
                }

                public Algorithm.Builder addAlgorithmsBuilder() {
                    return (Algorithm.Builder) getAlgorithmsFieldBuilder().c(Algorithm.getDefaultInstance());
                }

                public Builder addAllAlgorithms(Iterable<? extends Algorithm> iterable) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureAlgorithmsIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.algorithms_);
                    onChanged();
                    return this;
                }

                public Builder clearAlgorithms() {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.algorithms_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearAllowDuplicate() {
                    this.allowDuplicate_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearDownscaleFactor() {
                    this.downscaleFactor_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearErrorOnly() {
                    this.errorOnly_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearStopAfter() {
                    this.stopAfter_ = Configuration.getDefaultInstance().getStopAfter();
                    onChanged();
                    return this;
                }

                public Builder clearTimeout() {
                    this.timeout_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearWeightThreshold() {
                    this.weightThreshold_ = 0.0d;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public Algorithm getAlgorithms(int i10) {
                    v1 v1Var = this.algorithmsBuilder_;
                    return v1Var == null ? this.algorithms_.get(i10) : (Algorithm) v1Var.n(i10);
                }

                public Algorithm.Builder getAlgorithmsBuilder(int i10) {
                    return (Algorithm.Builder) getAlgorithmsFieldBuilder().k(i10);
                }

                public List<Algorithm.Builder> getAlgorithmsBuilderList() {
                    return getAlgorithmsFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public int getAlgorithmsCount() {
                    v1 v1Var = this.algorithmsBuilder_;
                    return v1Var == null ? this.algorithms_.size() : v1Var.m();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public List<Algorithm> getAlgorithmsList() {
                    v1 v1Var = this.algorithmsBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.algorithms_) : v1Var.p();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public AlgorithmOrBuilder getAlgorithmsOrBuilder(int i10) {
                    v1 v1Var = this.algorithmsBuilder_;
                    return v1Var == null ? this.algorithms_.get(i10) : (AlgorithmOrBuilder) v1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public List<? extends AlgorithmOrBuilder> getAlgorithmsOrBuilderList() {
                    v1 v1Var = this.algorithmsBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.algorithms_);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public boolean getAllowDuplicate() {
                    return this.allowDuplicate_;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public double getDownscaleFactor() {
                    return this.downscaleFactor_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public boolean getErrorOnly() {
                    return this.errorOnly_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public String getStopAfter() {
                    Object obj = this.stopAfter_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.stopAfter_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public ByteString getStopAfterBytes() {
                    Object obj = this.stopAfter_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.stopAfter_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public double getTimeout() {
                    return this.timeout_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.ConfigurationOrBuilder
                public double getWeightThreshold() {
                    return this.weightThreshold_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeAlgorithms(int i10) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureAlgorithmsIsMutable();
                    this.algorithms_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setAlgorithms(int i10, Algorithm algorithm) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, algorithm);
                        return this;
                    }
                    algorithm.getClass();
                    ensureAlgorithmsIsMutable();
                    this.algorithms_.set(i10, algorithm);
                    onChanged();
                    return this;
                }

                public Builder setAllowDuplicate(boolean z10) {
                    this.allowDuplicate_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setDownscaleFactor(double d10) {
                    this.downscaleFactor_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setErrorOnly(boolean z10) {
                    this.errorOnly_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setStopAfter(String str) {
                    str.getClass();
                    this.stopAfter_ = str;
                    onChanged();
                    return this;
                }

                public Builder setStopAfterBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.stopAfter_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTimeout(double d10) {
                    this.timeout_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setWeightThreshold(double d10) {
                    this.weightThreshold_ = d10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.stopAfter_ = "";
                    this.algorithms_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Configuration build() {
                    Configuration configurationBuildPartial = buildPartial();
                    if (configurationBuildPartial.isInitialized()) {
                        return configurationBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Configuration buildPartial() {
                    Configuration configuration = new Configuration(this);
                    configuration.timeout_ = this.timeout_;
                    configuration.downscaleFactor_ = this.downscaleFactor_;
                    configuration.errorOnly_ = this.errorOnly_;
                    configuration.allowDuplicate_ = this.allowDuplicate_;
                    configuration.stopAfter_ = this.stopAfter_;
                    configuration.weightThreshold_ = this.weightThreshold_;
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var != null) {
                        configuration.algorithms_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.algorithms_ = DesugarCollections.unmodifiableList(this.algorithms_);
                            this.bitField0_ &= -2;
                        }
                        configuration.algorithms_ = this.algorithms_;
                    }
                    onBuilt();
                    return configuration;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Configuration getDefaultInstanceForType() {
                    return Configuration.getDefaultInstance();
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

                public Algorithm.Builder addAlgorithmsBuilder(int i10) {
                    return (Algorithm.Builder) getAlgorithmsFieldBuilder().b(i10, Algorithm.getDefaultInstance());
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
                    this.timeout_ = 0.0d;
                    this.downscaleFactor_ = 0.0d;
                    this.errorOnly_ = false;
                    this.allowDuplicate_ = false;
                    this.stopAfter_ = "";
                    this.weightThreshold_ = 0.0d;
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var == null) {
                        this.algorithms_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        return this;
                    }
                    v1Var.g();
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.stopAfter_ = "";
                    this.algorithms_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addAlgorithms(int i10, Algorithm algorithm) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var == null) {
                        algorithm.getClass();
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.add(i10, algorithm);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, algorithm);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Configuration) {
                        return mergeFrom((Configuration) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAlgorithms(int i10, Algorithm.Builder builder) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var == null) {
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(Configuration configuration) {
                    if (configuration == Configuration.getDefaultInstance()) {
                        return this;
                    }
                    if (configuration.getTimeout() != 0.0d) {
                        setTimeout(configuration.getTimeout());
                    }
                    if (configuration.getDownscaleFactor() != 0.0d) {
                        setDownscaleFactor(configuration.getDownscaleFactor());
                    }
                    if (configuration.getErrorOnly()) {
                        setErrorOnly(configuration.getErrorOnly());
                    }
                    if (configuration.getAllowDuplicate()) {
                        setAllowDuplicate(configuration.getAllowDuplicate());
                    }
                    if (!configuration.getStopAfter().isEmpty()) {
                        this.stopAfter_ = configuration.stopAfter_;
                        onChanged();
                    }
                    if (configuration.getWeightThreshold() != 0.0d) {
                        setWeightThreshold(configuration.getWeightThreshold());
                    }
                    if (this.algorithmsBuilder_ == null) {
                        if (!configuration.algorithms_.isEmpty()) {
                            if (this.algorithms_.isEmpty()) {
                                this.algorithms_ = configuration.algorithms_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAlgorithmsIsMutable();
                                this.algorithms_.addAll(configuration.algorithms_);
                            }
                            onChanged();
                        }
                    } else if (!configuration.algorithms_.isEmpty()) {
                        if (!this.algorithmsBuilder_.t()) {
                            this.algorithmsBuilder_.a(configuration.algorithms_);
                        } else {
                            this.algorithmsBuilder_.h();
                            this.algorithmsBuilder_ = null;
                            this.algorithms_ = configuration.algorithms_;
                            this.bitField0_ &= -2;
                            this.algorithmsBuilder_ = h0.alwaysUseFieldBuilders ? getAlgorithmsFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) configuration).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAlgorithms(Algorithm.Builder builder) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var == null) {
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addAlgorithms(int i10, Algorithm.Builder builder) {
                    v1 v1Var = this.algorithmsBuilder_;
                    if (v1Var == null) {
                        ensureAlgorithmsIsMutable();
                        this.algorithms_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.access$4800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Configuration r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Configuration r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Configuration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Configuration$Builder");
                }
            }

            public static Builder newBuilder(Configuration configuration) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
            }

            public static Configuration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Configuration(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Configuration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Configuration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Configuration() {
                this.memoizedIsInitialized = (byte) -1;
                this.stopAfter_ = "";
                this.algorithms_ = Collections.EMPTY_LIST;
            }

            public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Configuration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Configuration) PARSER.parseFrom(bArr, wVar);
            }

            public static Configuration parseFrom(InputStream inputStream) throws IOException {
                return (Configuration) h0.parseWithIOException(PARSER, inputStream);
            }

            private Configuration(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    if (iK == 9) {
                                        this.timeout_ = lVar.s();
                                    } else if (iK == 17) {
                                        this.downscaleFactor_ = lVar.s();
                                    } else if (iK == 24) {
                                        this.errorOnly_ = lVar.q();
                                    } else if (iK == 32) {
                                        this.allowDuplicate_ = lVar.q();
                                    } else if (iK == 42) {
                                        this.stopAfter_ = lVar.J();
                                    } else if (iK == 49) {
                                        this.weightThreshold_ = lVar.s();
                                    } else if (iK != 58) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        if (!z11) {
                                            this.algorithms_ = new ArrayList();
                                            z11 = true;
                                        }
                                        this.algorithms_.add((Algorithm) lVar.A(Algorithm.parser(), wVar));
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
                            this.algorithms_ = DesugarCollections.unmodifiableList(this.algorithms_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.algorithms_ = DesugarCollections.unmodifiableList(this.algorithms_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Configuration parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Configuration) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Configuration parseFrom(l lVar) throws IOException {
                return (Configuration) h0.parseWithIOException(PARSER, lVar);
            }

            public static Configuration parseFrom(l lVar, w wVar) throws IOException {
                return (Configuration) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface ConfigurationOrBuilder extends MessageOrBuilder {
            Algorithm getAlgorithms(int i10);

            int getAlgorithmsCount();

            List<Algorithm> getAlgorithmsList();

            AlgorithmOrBuilder getAlgorithmsOrBuilder(int i10);

            List<? extends AlgorithmOrBuilder> getAlgorithmsOrBuilderList();

            boolean getAllowDuplicate();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            double getDownscaleFactor();

            boolean getErrorOnly();

            String getStopAfter();

            ByteString getStopAfterBytes();

            double getTimeout();

            double getWeightThreshold();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Event extends h0 implements EventOrBuilder {
            public static final int ALGORITHMS_RESULTS_FIELD_NUMBER = 5;
            public static final int COMPONENT_FIELD_NUMBER = 4;
            public static final int DURATION_FIELD_NUMBER = 3;
            public static final int PHASE_FIELD_NUMBER = 1;
            public static final int RESULT_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<AlgorithmResult> algorithmsResults_;
            private volatile Object component_;
            private double duration_;
            private byte memoizedIsInitialized;
            private int phase_;
            private int result_;
            private static final Event DEFAULT_INSTANCE = new Event();
            private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.1
                @Override // com.explorestack.protobuf.p1
                public Event parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                    return new Event(lVar, wVar);
                }
            };

            public static Event getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Event) h0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteBuffer);
            }

            public static p1 parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Event)) {
                    return super.equals(obj);
                }
                Event event = (Event) obj;
                return getPhase() == event.getPhase() && getResult() == event.getResult() && Double.doubleToLongBits(getDuration()) == Double.doubleToLongBits(event.getDuration()) && getComponent().equals(event.getComponent()) && getAlgorithmsResultsList().equals(event.getAlgorithmsResultsList()) && this.unknownFields.equals(event.unknownFields);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public AlgorithmResult getAlgorithmsResults(int i10) {
                return this.algorithmsResults_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public int getAlgorithmsResultsCount() {
                return this.algorithmsResults_.size();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public List<AlgorithmResult> getAlgorithmsResultsList() {
                return this.algorithmsResults_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public AlgorithmResultOrBuilder getAlgorithmsResultsOrBuilder(int i10) {
                return this.algorithmsResults_.get(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public List<? extends AlgorithmResultOrBuilder> getAlgorithmsResultsOrBuilderList() {
                return this.algorithmsResults_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public String getComponent() {
                Object obj = this.component_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.component_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public ByteString getComponentBytes() {
                Object obj = this.component_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.component_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public double getDuration() {
                return this.duration_;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public int getPhase() {
                return this.phase_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
            public int getResult() {
                return this.result_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.phase_;
                int iX = i11 != 0 ? n.x(1, i11) : 0;
                int i12 = this.result_;
                if (i12 != 0) {
                    iX += n.x(2, i12);
                }
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    iX += n.j(3, d10);
                }
                if (!getComponentBytes().isEmpty()) {
                    iX += h0.computeStringSize(4, this.component_);
                }
                for (int i13 = 0; i13 < this.algorithmsResults_.size(); i13++) {
                    iX += n.G(5, this.algorithmsResults_.get(i13));
                }
                int serializedSize = iX + this.unknownFields.getSerializedSize();
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
                int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPhase()) * 37) + 2) * 53) + getResult()) * 37) + 3) * 53) + j0.i(Double.doubleToLongBits(getDuration()))) * 37) + 4) * 53) + getComponent().hashCode();
                if (getAlgorithmsResultsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getAlgorithmsResultsList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_fieldAccessorTable.d(Event.class, Builder.class);
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
                return new Event();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                int i10 = this.phase_;
                if (i10 != 0) {
                    nVar.F0(1, i10);
                }
                int i11 = this.result_;
                if (i11 != 0) {
                    nVar.F0(2, i11);
                }
                double d10 = this.duration_;
                if (d10 != 0.0d) {
                    nVar.t0(3, d10);
                }
                if (!getComponentBytes().isEmpty()) {
                    h0.writeString(nVar, 4, this.component_);
                }
                for (int i12 = 0; i12 < this.algorithmsResults_.size(); i12++) {
                    nVar.J0(5, this.algorithmsResults_.get(i12));
                }
                this.unknownFields.writeTo(nVar);
            }

            public static final class Builder extends h0.b implements EventOrBuilder {
                private v1 algorithmsResultsBuilder_;
                private List<AlgorithmResult> algorithmsResults_;
                private int bitField0_;
                private Object component_;
                private double duration_;
                private int phase_;
                private int result_;

                private void ensureAlgorithmsResultsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.algorithmsResults_ = new ArrayList(this.algorithmsResults_);
                        this.bitField0_ |= 1;
                    }
                }

                private v1 getAlgorithmsResultsFieldBuilder() {
                    if (this.algorithmsResultsBuilder_ == null) {
                        this.algorithmsResultsBuilder_ = new v1(this.algorithmsResults_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.algorithmsResults_ = null;
                    }
                    return this.algorithmsResultsBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        getAlgorithmsResultsFieldBuilder();
                    }
                }

                public Builder addAlgorithmsResults(AlgorithmResult algorithmResult) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var != null) {
                        v1Var.e(algorithmResult);
                        return this;
                    }
                    algorithmResult.getClass();
                    ensureAlgorithmsResultsIsMutable();
                    this.algorithmsResults_.add(algorithmResult);
                    onChanged();
                    return this;
                }

                public AlgorithmResult.Builder addAlgorithmsResultsBuilder() {
                    return (AlgorithmResult.Builder) getAlgorithmsResultsFieldBuilder().c(AlgorithmResult.getDefaultInstance());
                }

                public Builder addAllAlgorithmsResults(Iterable<? extends AlgorithmResult> iterable) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var != null) {
                        v1Var.a(iterable);
                        return this;
                    }
                    ensureAlgorithmsResultsIsMutable();
                    a.AbstractC0320a.addAll((Iterable) iterable, (List) this.algorithmsResults_);
                    onChanged();
                    return this;
                }

                public Builder clearAlgorithmsResults() {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var != null) {
                        v1Var.g();
                        return this;
                    }
                    this.algorithmsResults_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearComponent() {
                    this.component_ = Event.getDefaultInstance().getComponent();
                    onChanged();
                    return this;
                }

                public Builder clearDuration() {
                    this.duration_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearPhase() {
                    this.phase_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearResult() {
                    this.result_ = 0;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public AlgorithmResult getAlgorithmsResults(int i10) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    return v1Var == null ? this.algorithmsResults_.get(i10) : (AlgorithmResult) v1Var.n(i10);
                }

                public AlgorithmResult.Builder getAlgorithmsResultsBuilder(int i10) {
                    return (AlgorithmResult.Builder) getAlgorithmsResultsFieldBuilder().k(i10);
                }

                public List<AlgorithmResult.Builder> getAlgorithmsResultsBuilderList() {
                    return getAlgorithmsResultsFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public int getAlgorithmsResultsCount() {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    return v1Var == null ? this.algorithmsResults_.size() : v1Var.m();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public List<AlgorithmResult> getAlgorithmsResultsList() {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    return v1Var == null ? DesugarCollections.unmodifiableList(this.algorithmsResults_) : v1Var.p();
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public AlgorithmResultOrBuilder getAlgorithmsResultsOrBuilder(int i10) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    return v1Var == null ? this.algorithmsResults_.get(i10) : (AlgorithmResultOrBuilder) v1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public List<? extends AlgorithmResultOrBuilder> getAlgorithmsResultsOrBuilderList() {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.algorithmsResults_);
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public String getComponent() {
                    Object obj = this.component_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.component_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public ByteString getComponentBytes() {
                    Object obj = this.component_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.component_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public double getDuration() {
                    return this.duration_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public int getPhase() {
                    return this.phase_;
                }

                @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.EventOrBuilder
                public int getResult() {
                    return this.result_;
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_fieldAccessorTable.d(Event.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeAlgorithmsResults(int i10) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var != null) {
                        v1Var.v(i10);
                        return this;
                    }
                    ensureAlgorithmsResultsIsMutable();
                    this.algorithmsResults_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setAlgorithmsResults(int i10, AlgorithmResult algorithmResult) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var != null) {
                        v1Var.w(i10, algorithmResult);
                        return this;
                    }
                    algorithmResult.getClass();
                    ensureAlgorithmsResultsIsMutable();
                    this.algorithmsResults_.set(i10, algorithmResult);
                    onChanged();
                    return this;
                }

                public Builder setComponent(String str) {
                    str.getClass();
                    this.component_ = str;
                    onChanged();
                    return this;
                }

                public Builder setComponentBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.component_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setDuration(double d10) {
                    this.duration_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setPhase(int i10) {
                    this.phase_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setResult(int i10) {
                    this.result_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.component_ = "";
                    this.algorithmsResults_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Event build() {
                    Event eventBuildPartial = buildPartial();
                    if (eventBuildPartial.isInitialized()) {
                        return eventBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Event buildPartial() {
                    Event event = new Event(this);
                    event.phase_ = this.phase_;
                    event.result_ = this.result_;
                    event.duration_ = this.duration_;
                    event.component_ = this.component_;
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var != null) {
                        event.algorithmsResults_ = v1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.algorithmsResults_ = DesugarCollections.unmodifiableList(this.algorithmsResults_);
                            this.bitField0_ &= -2;
                        }
                        event.algorithmsResults_ = this.algorithmsResults_;
                    }
                    onBuilt();
                    return event;
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Event getDefaultInstanceForType() {
                    return Event.getDefaultInstance();
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

                public AlgorithmResult.Builder addAlgorithmsResultsBuilder(int i10) {
                    return (AlgorithmResult.Builder) getAlgorithmsResultsFieldBuilder().b(i10, AlgorithmResult.getDefaultInstance());
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
                    this.phase_ = 0;
                    this.result_ = 0;
                    this.duration_ = 0.0d;
                    this.component_ = "";
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var == null) {
                        this.algorithmsResults_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        return this;
                    }
                    v1Var.g();
                    return this;
                }

                private Builder(h0.c cVar) {
                    super(cVar);
                    this.component_ = "";
                    this.algorithmsResults_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addAlgorithmsResults(int i10, AlgorithmResult algorithmResult) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var == null) {
                        algorithmResult.getClass();
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.add(i10, algorithmResult);
                        onChanged();
                        return this;
                    }
                    v1Var.d(i10, algorithmResult);
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4427clone() {
                    return (Builder) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Event) {
                        return mergeFrom((Event) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAlgorithmsResults(int i10, AlgorithmResult.Builder builder) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var == null) {
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.w(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(Event event) {
                    if (event == Event.getDefaultInstance()) {
                        return this;
                    }
                    if (event.getPhase() != 0) {
                        setPhase(event.getPhase());
                    }
                    if (event.getResult() != 0) {
                        setResult(event.getResult());
                    }
                    if (event.getDuration() != 0.0d) {
                        setDuration(event.getDuration());
                    }
                    if (!event.getComponent().isEmpty()) {
                        this.component_ = event.component_;
                        onChanged();
                    }
                    if (this.algorithmsResultsBuilder_ == null) {
                        if (!event.algorithmsResults_.isEmpty()) {
                            if (this.algorithmsResults_.isEmpty()) {
                                this.algorithmsResults_ = event.algorithmsResults_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAlgorithmsResultsIsMutable();
                                this.algorithmsResults_.addAll(event.algorithmsResults_);
                            }
                            onChanged();
                        }
                    } else if (!event.algorithmsResults_.isEmpty()) {
                        if (!this.algorithmsResultsBuilder_.t()) {
                            this.algorithmsResultsBuilder_.a(event.algorithmsResults_);
                        } else {
                            this.algorithmsResultsBuilder_.h();
                            this.algorithmsResultsBuilder_ = null;
                            this.algorithmsResults_ = event.algorithmsResults_;
                            this.bitField0_ &= -2;
                            this.algorithmsResultsBuilder_ = h0.alwaysUseFieldBuilders ? getAlgorithmsResultsFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((h0) event).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAlgorithmsResults(AlgorithmResult.Builder builder) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var == null) {
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    v1Var.e(builder.build());
                    return this;
                }

                public Builder addAlgorithmsResults(int i10, AlgorithmResult.Builder builder) {
                    v1 v1Var = this.algorithmsResultsBuilder_;
                    if (v1Var == null) {
                        ensureAlgorithmsResultsIsMutable();
                        this.algorithmsResults_.add(i10, builder.build());
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
                public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Event r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Event r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Event.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Event$Builder");
                }
            }

            public static Builder newBuilder(Event event) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
            }

            public static Event parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteBuffer, wVar);
            }

            private Event(h0.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Event parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
                return (Event) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
            }

            public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Event getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Event parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(byteString, wVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Event() {
                this.memoizedIsInitialized = (byte) -1;
                this.component_ = "";
                this.algorithmsResults_ = Collections.EMPTY_LIST;
            }

            public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            public Builder newBuilderForType(h0.c cVar) {
                return new Builder(cVar);
            }

            public static Event parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
                return (Event) PARSER.parseFrom(bArr, wVar);
            }

            public static Event parseFrom(InputStream inputStream) throws IOException {
                return (Event) h0.parseWithIOException(PARSER, inputStream);
            }

            private Event(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    if (iK == 8) {
                                        this.phase_ = lVar.y();
                                    } else if (iK == 16) {
                                        this.result_ = lVar.y();
                                    } else if (iK == 25) {
                                        this.duration_ = lVar.s();
                                    } else if (iK == 34) {
                                        this.component_ = lVar.J();
                                    } else if (iK != 42) {
                                        if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                        }
                                    } else {
                                        if (!z11) {
                                            this.algorithmsResults_ = new ArrayList();
                                            z11 = true;
                                        }
                                        this.algorithmsResults_.add((AlgorithmResult) lVar.A(AlgorithmResult.parser(), wVar));
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
                            this.algorithmsResults_ = DesugarCollections.unmodifiableList(this.algorithmsResults_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (z11) {
                    this.algorithmsResults_ = DesugarCollections.unmodifiableList(this.algorithmsResults_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Event parseFrom(InputStream inputStream, w wVar) throws IOException {
                return (Event) h0.parseWithIOException(PARSER, inputStream, wVar);
            }

            public static Event parseFrom(l lVar) throws IOException {
                return (Event) h0.parseWithIOException(PARSER, lVar);
            }

            public static Event parseFrom(l lVar, w wVar) throws IOException {
                return (Event) h0.parseWithIOException(PARSER, lVar, wVar);
            }
        }

        public interface EventOrBuilder extends MessageOrBuilder {
            AlgorithmResult getAlgorithmsResults(int i10);

            int getAlgorithmsResultsCount();

            List<AlgorithmResult> getAlgorithmsResultsList();

            AlgorithmResultOrBuilder getAlgorithmsResultsOrBuilder(int i10);

            List<? extends AlgorithmResultOrBuilder> getAlgorithmsResultsOrBuilderList();

            String getComponent();

            ByteString getComponentBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

            double getDuration();

            int getPhase();

            int getResult();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public enum PayloadOneofCase implements j0.c {
            EVENT(1),
            CONFIGURATION(2),
            PAYLOADONEOF_NOT_SET(0);

            private final int value;

            PayloadOneofCase(int i10) {
                this.value = i10;
            }

            public static PayloadOneofCase forNumber(int i10) {
                if (i10 == 0) {
                    return PAYLOADONEOF_NOT_SET;
                }
                if (i10 == 1) {
                    return EVENT;
                }
                if (i10 != 2) {
                    return null;
                }
                return CONFIGURATION;
            }

            @Override // com.explorestack.protobuf.j0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PayloadOneofCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public static BrokenCreativeDetector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BrokenCreativeDetector parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BrokenCreativeDetector) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BrokenCreativeDetector parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BrokenCreativeDetector)) {
                return super.equals(obj);
            }
            BrokenCreativeDetector brokenCreativeDetector = (BrokenCreativeDetector) obj;
            if (!getPayloadOneofCase().equals(brokenCreativeDetector.getPayloadOneofCase())) {
                return false;
            }
            int i10 = this.payloadOneofCase_;
            if (i10 != 1) {
                if (i10 == 2 && !getConfiguration().equals(brokenCreativeDetector.getConfiguration())) {
                    return false;
                }
            } else if (!getEvent().equals(brokenCreativeDetector.getEvent())) {
                return false;
            }
            return this.unknownFields.equals(brokenCreativeDetector.unknownFields);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public Configuration getConfiguration() {
            return this.payloadOneofCase_ == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public ConfigurationOrBuilder getConfigurationOrBuilder() {
            return this.payloadOneofCase_ == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public Event getEvent() {
            return this.payloadOneofCase_ == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public EventOrBuilder getEventOrBuilder() {
            return this.payloadOneofCase_ == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.payloadOneofCase_ == 1 ? n.G(1, (Event) this.payloadOneof_) : 0;
            if (this.payloadOneofCase_ == 2) {
                iG += n.G(2, (Configuration) this.payloadOneof_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public boolean hasConfiguration() {
            return this.payloadOneofCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
        public boolean hasEvent() {
            return this.payloadOneofCase_ == 1;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10;
            int iHashCode;
            int i11 = this.memoizedHashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode2 = 779 + getDescriptor().hashCode();
            int i12 = this.payloadOneofCase_;
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getConfiguration().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            i10 = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getEvent().hashCode();
            iHashCode2 = i10 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_fieldAccessorTable.d(BrokenCreativeDetector.class, Builder.class);
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
            return new BrokenCreativeDetector();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.payloadOneofCase_ == 1) {
                nVar.J0(1, (Event) this.payloadOneof_);
            }
            if (this.payloadOneofCase_ == 2) {
                nVar.J0(2, (Configuration) this.payloadOneof_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements BrokenCreativeDetectorOrBuilder {
            private a2 configurationBuilder_;
            private a2 eventBuilder_;
            private int payloadOneofCase_;
            private Object payloadOneof_;

            private a2 getConfigurationFieldBuilder() {
                if (this.configurationBuilder_ == null) {
                    if (this.payloadOneofCase_ != 2) {
                        this.payloadOneof_ = Configuration.getDefaultInstance();
                    }
                    this.configurationBuilder_ = new a2((Configuration) this.payloadOneof_, getParentForChildren(), isClean());
                    this.payloadOneof_ = null;
                }
                this.payloadOneofCase_ = 2;
                onChanged();
                return this.configurationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor;
            }

            private a2 getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    if (this.payloadOneofCase_ != 1) {
                        this.payloadOneof_ = Event.getDefaultInstance();
                    }
                    this.eventBuilder_ = new a2((Event) this.payloadOneof_, getParentForChildren(), isClean());
                    this.payloadOneof_ = null;
                }
                this.payloadOneofCase_ = 1;
                onChanged();
                return this.eventBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearConfiguration() {
                a2 a2Var = this.configurationBuilder_;
                if (a2Var == null) {
                    if (this.payloadOneofCase_ == 2) {
                        this.payloadOneofCase_ = 0;
                        this.payloadOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadOneofCase_ == 2) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                a2Var.b();
                return this;
            }

            public Builder clearEvent() {
                a2 a2Var = this.eventBuilder_;
                if (a2Var == null) {
                    if (this.payloadOneofCase_ == 1) {
                        this.payloadOneofCase_ = 0;
                        this.payloadOneof_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadOneofCase_ == 1) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                a2Var.b();
                return this;
            }

            public Builder clearPayloadOneof() {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public Configuration getConfiguration() {
                a2 a2Var = this.configurationBuilder_;
                return a2Var == null ? this.payloadOneofCase_ == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance() : this.payloadOneofCase_ == 2 ? (Configuration) a2Var.e() : Configuration.getDefaultInstance();
            }

            public Configuration.Builder getConfigurationBuilder() {
                return (Configuration.Builder) getConfigurationFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public ConfigurationOrBuilder getConfigurationOrBuilder() {
                a2 a2Var;
                int i10 = this.payloadOneofCase_;
                return (i10 != 2 || (a2Var = this.configurationBuilder_) == null) ? i10 == 2 ? (Configuration) this.payloadOneof_ : Configuration.getDefaultInstance() : (ConfigurationOrBuilder) a2Var.f();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public Event getEvent() {
                a2 a2Var = this.eventBuilder_;
                return a2Var == null ? this.payloadOneofCase_ == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance() : this.payloadOneofCase_ == 1 ? (Event) a2Var.e() : Event.getDefaultInstance();
            }

            public Event.Builder getEventBuilder() {
                return (Event.Builder) getEventFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public EventOrBuilder getEventOrBuilder() {
                a2 a2Var;
                int i10 = this.payloadOneofCase_;
                return (i10 != 1 || (a2Var = this.eventBuilder_) == null) ? i10 == 1 ? (Event) this.payloadOneof_ : Event.getDefaultInstance() : (EventOrBuilder) a2Var.f();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public PayloadOneofCase getPayloadOneofCase() {
                return PayloadOneofCase.forNumber(this.payloadOneofCase_);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public boolean hasConfiguration() {
                return this.payloadOneofCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetectorOrBuilder
            public boolean hasEvent() {
                return this.payloadOneofCase_ == 1;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_fieldAccessorTable.d(BrokenCreativeDetector.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfiguration(Configuration configuration) {
                a2 a2Var = this.configurationBuilder_;
                if (a2Var == null) {
                    if (this.payloadOneofCase_ != 2 || this.payloadOneof_ == Configuration.getDefaultInstance()) {
                        this.payloadOneof_ = configuration;
                    } else {
                        this.payloadOneof_ = Configuration.newBuilder((Configuration) this.payloadOneof_).mergeFrom(configuration).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadOneofCase_ == 2) {
                        a2Var.g(configuration);
                    }
                    this.configurationBuilder_.i(configuration);
                }
                this.payloadOneofCase_ = 2;
                return this;
            }

            public Builder mergeEvent(Event event) {
                a2 a2Var = this.eventBuilder_;
                if (a2Var == null) {
                    if (this.payloadOneofCase_ != 1 || this.payloadOneof_ == Event.getDefaultInstance()) {
                        this.payloadOneof_ = event;
                    } else {
                        this.payloadOneof_ = Event.newBuilder((Event) this.payloadOneof_).mergeFrom(event).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.payloadOneofCase_ == 1) {
                        a2Var.g(event);
                    }
                    this.eventBuilder_.i(event);
                }
                this.payloadOneofCase_ = 1;
                return this;
            }

            public Builder setConfiguration(Configuration configuration) {
                a2 a2Var = this.configurationBuilder_;
                if (a2Var == null) {
                    configuration.getClass();
                    this.payloadOneof_ = configuration;
                    onChanged();
                } else {
                    a2Var.i(configuration);
                }
                this.payloadOneofCase_ = 2;
                return this;
            }

            public Builder setEvent(Event event) {
                a2 a2Var = this.eventBuilder_;
                if (a2Var == null) {
                    event.getClass();
                    this.payloadOneof_ = event;
                    onChanged();
                } else {
                    a2Var.i(event);
                }
                this.payloadOneofCase_ = 1;
                return this;
            }

            private Builder() {
                this.payloadOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public BrokenCreativeDetector build() {
                BrokenCreativeDetector brokenCreativeDetectorBuildPartial = buildPartial();
                if (brokenCreativeDetectorBuildPartial.isInitialized()) {
                    return brokenCreativeDetectorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) brokenCreativeDetectorBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public BrokenCreativeDetector buildPartial() {
                BrokenCreativeDetector brokenCreativeDetector = new BrokenCreativeDetector(this);
                if (this.payloadOneofCase_ == 1) {
                    a2 a2Var = this.eventBuilder_;
                    if (a2Var == null) {
                        brokenCreativeDetector.payloadOneof_ = this.payloadOneof_;
                    } else {
                        brokenCreativeDetector.payloadOneof_ = a2Var.a();
                    }
                }
                if (this.payloadOneofCase_ == 2) {
                    a2 a2Var2 = this.configurationBuilder_;
                    if (a2Var2 == null) {
                        brokenCreativeDetector.payloadOneof_ = this.payloadOneof_;
                    } else {
                        brokenCreativeDetector.payloadOneof_ = a2Var2.a();
                    }
                }
                brokenCreativeDetector.payloadOneofCase_ = this.payloadOneofCase_;
                onBuilt();
                return brokenCreativeDetector;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public BrokenCreativeDetector getDefaultInstanceForType() {
                return BrokenCreativeDetector.getDefaultInstance();
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
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.payloadOneofCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BrokenCreativeDetector) {
                    return mergeFrom((BrokenCreativeDetector) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setConfiguration(Configuration.Builder builder) {
                a2 a2Var = this.configurationBuilder_;
                if (a2Var == null) {
                    this.payloadOneof_ = builder.build();
                    onChanged();
                } else {
                    a2Var.i(builder.build());
                }
                this.payloadOneofCase_ = 2;
                return this;
            }

            public Builder setEvent(Event.Builder builder) {
                a2 a2Var = this.eventBuilder_;
                if (a2Var == null) {
                    this.payloadOneof_ = builder.build();
                    onChanged();
                } else {
                    a2Var.i(builder.build());
                }
                this.payloadOneofCase_ = 1;
                return this;
            }

            public Builder mergeFrom(BrokenCreativeDetector brokenCreativeDetector) {
                if (brokenCreativeDetector == BrokenCreativeDetector.getDefaultInstance()) {
                    return this;
                }
                int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$BrokenCreativeDetector$PayloadOneofCase[brokenCreativeDetector.getPayloadOneofCase().ordinal()];
                if (i10 == 1) {
                    mergeEvent(brokenCreativeDetector.getEvent());
                } else if (i10 == 2) {
                    mergeConfiguration(brokenCreativeDetector.getConfiguration());
                }
                mergeUnknownFields(((h0) brokenCreativeDetector).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.access$5800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector r3 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector r4 = (io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.BrokenCreativeDetector.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.rendering.RenderingFeature$BrokenCreativeDetector$Builder");
            }
        }

        public static Builder newBuilder(BrokenCreativeDetector brokenCreativeDetector) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(brokenCreativeDetector);
        }

        public static BrokenCreativeDetector parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteBuffer, wVar);
        }

        private BrokenCreativeDetector(h0.b bVar) {
            super(bVar);
            this.payloadOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BrokenCreativeDetector parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (BrokenCreativeDetector) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static BrokenCreativeDetector parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public BrokenCreativeDetector getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static BrokenCreativeDetector parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BrokenCreativeDetector parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        private BrokenCreativeDetector() {
            this.payloadOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BrokenCreativeDetector parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (BrokenCreativeDetector) PARSER.parseFrom(bArr, wVar);
        }

        public static BrokenCreativeDetector parseFrom(InputStream inputStream) throws IOException {
            return (BrokenCreativeDetector) h0.parseWithIOException(PARSER, inputStream);
        }

        private BrokenCreativeDetector(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                Event.Builder builder = this.payloadOneofCase_ == 1 ? ((Event) this.payloadOneof_).toBuilder() : null;
                                MessageLite messageLiteA = lVar.A(Event.parser(), wVar);
                                this.payloadOneof_ = messageLiteA;
                                if (builder != null) {
                                    builder.mergeFrom((Event) messageLiteA);
                                    this.payloadOneof_ = builder.buildPartial();
                                }
                                this.payloadOneofCase_ = 1;
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                Configuration.Builder builder2 = this.payloadOneofCase_ == 2 ? ((Configuration) this.payloadOneof_).toBuilder() : null;
                                MessageLite messageLiteA2 = lVar.A(Configuration.parser(), wVar);
                                this.payloadOneof_ = messageLiteA2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((Configuration) messageLiteA2);
                                    this.payloadOneof_ = builder2.buildPartial();
                                }
                                this.payloadOneofCase_ = 2;
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

        public static BrokenCreativeDetector parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (BrokenCreativeDetector) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static BrokenCreativeDetector parseFrom(l lVar) throws IOException {
            return (BrokenCreativeDetector) h0.parseWithIOException(PARSER, lVar);
        }

        public static BrokenCreativeDetector parseFrom(l lVar, w wVar) throws IOException {
            return (BrokenCreativeDetector) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface BrokenCreativeDetectorOrBuilder extends MessageOrBuilder {
        BrokenCreativeDetector.Configuration getConfiguration();

        BrokenCreativeDetector.ConfigurationOrBuilder getConfigurationOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        BrokenCreativeDetector.Event getEvent();

        BrokenCreativeDetector.EventOrBuilder getEventOrBuilder();

        BrokenCreativeDetector.PayloadOneofCase getPayloadOneofCase();

        boolean hasConfiguration();

        boolean hasEvent();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum FeatureCase implements j0.c {
        BROKEN_CREATIVE_DETECTOR(1),
        FEATURE_NOT_SET(0);

        private final int value;

        FeatureCase(int i10) {
            this.value = i10;
        }

        public static FeatureCase forNumber(int i10) {
            if (i10 == 0) {
                return FEATURE_NOT_SET;
            }
            if (i10 != 1) {
                return null;
            }
            return BROKEN_CREATIVE_DETECTOR;
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FeatureCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static RenderingFeature getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RenderingFeature parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RenderingFeature) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RenderingFeature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RenderingFeature)) {
            return super.equals(obj);
        }
        RenderingFeature renderingFeature = (RenderingFeature) obj;
        if (getFeatureCase().equals(renderingFeature.getFeatureCase())) {
            return (this.featureCase_ != 1 || getBrokenCreativeDetector().equals(renderingFeature.getBrokenCreativeDetector())) && this.unknownFields.equals(renderingFeature.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public BrokenCreativeDetector getBrokenCreativeDetector() {
        return this.featureCase_ == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public BrokenCreativeDetectorOrBuilder getBrokenCreativeDetectorOrBuilder() {
        return this.featureCase_ == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public FeatureCase getFeatureCase() {
        return FeatureCase.forNumber(this.featureCase_);
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
        int iG = (this.featureCase_ == 1 ? n.G(1, (BrokenCreativeDetector) this.feature_) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = iG;
        return iG;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
    public boolean hasBrokenCreativeDetector() {
        return this.featureCase_ == 1;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (this.featureCase_ == 1) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getBrokenCreativeDetector().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_fieldAccessorTable.d(RenderingFeature.class, Builder.class);
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
        return new RenderingFeature();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.featureCase_ == 1) {
            nVar.J0(1, (BrokenCreativeDetector) this.feature_);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements RenderingFeatureOrBuilder {
        private a2 brokenCreativeDetectorBuilder_;
        private int featureCase_;
        private Object feature_;

        private a2 getBrokenCreativeDetectorFieldBuilder() {
            if (this.brokenCreativeDetectorBuilder_ == null) {
                if (this.featureCase_ != 1) {
                    this.feature_ = BrokenCreativeDetector.getDefaultInstance();
                }
                this.brokenCreativeDetectorBuilder_ = new a2((BrokenCreativeDetector) this.feature_, getParentForChildren(), isClean());
                this.feature_ = null;
            }
            this.featureCase_ = 1;
            onChanged();
            return this.brokenCreativeDetectorBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearBrokenCreativeDetector() {
            a2 a2Var = this.brokenCreativeDetectorBuilder_;
            if (a2Var == null) {
                if (this.featureCase_ == 1) {
                    this.featureCase_ = 0;
                    this.feature_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.featureCase_ == 1) {
                this.featureCase_ = 0;
                this.feature_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearFeature() {
            this.featureCase_ = 0;
            this.feature_ = null;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public BrokenCreativeDetector getBrokenCreativeDetector() {
            a2 a2Var = this.brokenCreativeDetectorBuilder_;
            return a2Var == null ? this.featureCase_ == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance() : this.featureCase_ == 1 ? (BrokenCreativeDetector) a2Var.e() : BrokenCreativeDetector.getDefaultInstance();
        }

        public BrokenCreativeDetector.Builder getBrokenCreativeDetectorBuilder() {
            return (BrokenCreativeDetector.Builder) getBrokenCreativeDetectorFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public BrokenCreativeDetectorOrBuilder getBrokenCreativeDetectorOrBuilder() {
            a2 a2Var;
            int i10 = this.featureCase_;
            return (i10 != 1 || (a2Var = this.brokenCreativeDetectorBuilder_) == null) ? i10 == 1 ? (BrokenCreativeDetector) this.feature_ : BrokenCreativeDetector.getDefaultInstance() : (BrokenCreativeDetectorOrBuilder) a2Var.f();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_descriptor;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public FeatureCase getFeatureCase() {
            return FeatureCase.forNumber(this.featureCase_);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingFeatureOrBuilder
        public boolean hasBrokenCreativeDetector() {
            return this.featureCase_ == 1;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return RenderingProto.internal_static_bidmachine_protobuf_RenderingFeature_fieldAccessorTable.d(RenderingFeature.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeBrokenCreativeDetector(BrokenCreativeDetector brokenCreativeDetector) {
            a2 a2Var = this.brokenCreativeDetectorBuilder_;
            if (a2Var == null) {
                if (this.featureCase_ != 1 || this.feature_ == BrokenCreativeDetector.getDefaultInstance()) {
                    this.feature_ = brokenCreativeDetector;
                } else {
                    this.feature_ = BrokenCreativeDetector.newBuilder((BrokenCreativeDetector) this.feature_).mergeFrom(brokenCreativeDetector).buildPartial();
                }
                onChanged();
            } else {
                if (this.featureCase_ == 1) {
                    a2Var.g(brokenCreativeDetector);
                }
                this.brokenCreativeDetectorBuilder_.i(brokenCreativeDetector);
            }
            this.featureCase_ = 1;
            return this;
        }

        public Builder setBrokenCreativeDetector(BrokenCreativeDetector brokenCreativeDetector) {
            a2 a2Var = this.brokenCreativeDetectorBuilder_;
            if (a2Var == null) {
                brokenCreativeDetector.getClass();
                this.feature_ = brokenCreativeDetector;
                onChanged();
            } else {
                a2Var.i(brokenCreativeDetector);
            }
            this.featureCase_ = 1;
            return this;
        }

        private Builder() {
            this.featureCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingFeature build() {
            RenderingFeature renderingFeatureBuildPartial = buildPartial();
            if (renderingFeatureBuildPartial.isInitialized()) {
                return renderingFeatureBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) renderingFeatureBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingFeature buildPartial() {
            RenderingFeature renderingFeature = new RenderingFeature(this);
            if (this.featureCase_ == 1) {
                a2 a2Var = this.brokenCreativeDetectorBuilder_;
                if (a2Var == null) {
                    renderingFeature.feature_ = this.feature_;
                } else {
                    renderingFeature.feature_ = a2Var.a();
                }
            }
            renderingFeature.featureCase_ = this.featureCase_;
            onBuilt();
            return renderingFeature;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public RenderingFeature getDefaultInstanceForType() {
            return RenderingFeature.getDefaultInstance();
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
            this.featureCase_ = 0;
            this.feature_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.featureCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RenderingFeature) {
                return mergeFrom((RenderingFeature) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setBrokenCreativeDetector(BrokenCreativeDetector.Builder builder) {
            a2 a2Var = this.brokenCreativeDetectorBuilder_;
            if (a2Var == null) {
                this.feature_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.featureCase_ = 1;
            return this;
        }

        public Builder mergeFrom(RenderingFeature renderingFeature) {
            if (renderingFeature == RenderingFeature.getDefaultInstance()) {
                return this;
            }
            if (AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$rendering$RenderingFeature$FeatureCase[renderingFeature.getFeatureCase().ordinal()] == 1) {
                mergeBrokenCreativeDetector(renderingFeature.getBrokenCreativeDetector());
            }
            mergeUnknownFields(((h0) renderingFeature).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.rendering.RenderingFeature.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.rendering.RenderingFeature.access$6700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.rendering.RenderingFeature r3 = (io.bidmachine.protobuf.rendering.RenderingFeature) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.rendering.RenderingFeature r4 = (io.bidmachine.protobuf.rendering.RenderingFeature) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.rendering.RenderingFeature.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.rendering.RenderingFeature$Builder");
        }
    }

    public static Builder newBuilder(RenderingFeature renderingFeature) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(renderingFeature);
    }

    public static RenderingFeature parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteBuffer, wVar);
    }

    private RenderingFeature(h0.b bVar) {
        super(bVar);
        this.featureCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RenderingFeature parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (RenderingFeature) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static RenderingFeature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public RenderingFeature getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RenderingFeature parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static RenderingFeature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private RenderingFeature() {
        this.featureCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RenderingFeature parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (RenderingFeature) PARSER.parseFrom(bArr, wVar);
    }

    public static RenderingFeature parseFrom(InputStream inputStream) throws IOException {
        return (RenderingFeature) h0.parseWithIOException(PARSER, inputStream);
    }

    private RenderingFeature(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                BrokenCreativeDetector.Builder builder = this.featureCase_ == 1 ? ((BrokenCreativeDetector) this.feature_).toBuilder() : null;
                                MessageLite messageLiteA = lVar.A(BrokenCreativeDetector.parser(), wVar);
                                this.feature_ = messageLiteA;
                                if (builder != null) {
                                    builder.mergeFrom((BrokenCreativeDetector) messageLiteA);
                                    this.feature_ = builder.buildPartial();
                                }
                                this.featureCase_ = 1;
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    }
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

    public static RenderingFeature parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (RenderingFeature) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static RenderingFeature parseFrom(l lVar) throws IOException {
        return (RenderingFeature) h0.parseWithIOException(PARSER, lVar);
    }

    public static RenderingFeature parseFrom(l lVar, w wVar) throws IOException {
        return (RenderingFeature) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
