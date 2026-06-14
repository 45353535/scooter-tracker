package com.explorestack.protobuf.compiler;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.DescriptorProtos;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a2;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PluginProtos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Descriptors.Descriptor f18901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0.f f18902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Descriptors.Descriptor f18903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0.f f18904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Descriptors.Descriptor f18905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0.f f18906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Descriptors.Descriptor f18907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h0.f f18908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Descriptors.FileDescriptor f18909i = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"F\n\u0007Version\u0012\r\n\u0005major\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005minor\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005patch\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006suffix\u0018\u0004 \u0001(\t\"º\u0001\n\u0014CodeGeneratorRequest\u0012\u0018\n\u0010file_to_generate\u0018\u0001 \u0003(\t\u0012\u0011\n\tparameter\u0018\u0002 \u0001(\t\u00128\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProto\u0012;\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.Version\"Á\u0002\n\u0015CodeGeneratorResponse\u0012\r\n\u0005error\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012supported_features\u0018\u0002 \u0001(\u0004\u0012B\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.File\u001a\u007f\n\u0004File\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000finsertion_point\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u000f \u0001(\t\u0012?\n\u0013generated_code_info\u0018\u0010 \u0001(\u000b2\".google.protobuf.GeneratedCodeInfo\"8\n\u0007Feature\u0012\u0010\n\fFEATURE_NONE\u0010\u0000\u0012\u001b\n\u0017FEATURE_PROTO3_OPTIONAL\u0010\u0001BW\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ)google.golang.org/protobuf/types/pluginpb"}, new Descriptors.FileDescriptor[]{DescriptorProtos.a0()});

    public static final class CodeGeneratorResponse extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final CodeGeneratorResponse f18910g = new CodeGeneratorResponse();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final p1 f18911h = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f18913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f18914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f18915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f18916f;

        public enum Feature implements j0.c {
            FEATURE_NONE(0),
            FEATURE_PROTO3_OPTIONAL(1);

            public static final int FEATURE_NONE_VALUE = 0;
            public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
            private final int value;
            private static final j0.d internalValueMap = new a();
            private static final Feature[] VALUES = values();

            static class a implements j0.d {
                a() {
                }
            }

            Feature(int i10) {
                this.value = i10;
            }

            public static Feature forNumber(int i10) {
                if (i10 == 0) {
                    return FEATURE_NONE;
                }
                if (i10 != 1) {
                    return null;
                }
                return FEATURE_PROTO3_OPTIONAL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CodeGeneratorResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static j0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.j0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Feature valueOf(int i10) {
                return forNumber(i10);
            }

            public static Feature valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse parsePartialFrom(l lVar, w wVar) {
                return new CodeGeneratorResponse(lVar, wVar);
            }
        }

        public static final class c extends h0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final c f18922h = new c();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final p1 f18923i = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18924b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private volatile Object f18925c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private volatile Object f18926d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private volatile Object f18927e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private DescriptorProtos.i f18928f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private byte f18929g;

            static class a extends com.explorestack.protobuf.b {
                a() {
                }

                @Override // com.explorestack.protobuf.p1
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c parsePartialFrom(l lVar, w wVar) {
                    return new c(lVar, wVar);
                }
            }

            public static b C() {
                return f18922h.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.f18907g;
            }

            public static c t() {
                return f18922h;
            }

            public boolean A() {
                return (this.f18924b & 8) != 0;
            }

            public boolean B() {
                return (this.f18924b & 2) != 0;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return C();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.h0
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType(h0.c cVar) {
                return new b(cVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return this == f18922h ? new b() : new b().u(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (hasName() != cVar.hasName()) {
                    return false;
                }
                if ((hasName() && !getName().equals(cVar.getName())) || B() != cVar.B()) {
                    return false;
                }
                if ((B() && !x().equals(cVar.x())) || hasContent() != cVar.hasContent()) {
                    return false;
                }
                if ((!hasContent() || getContent().equals(cVar.getContent())) && A() == cVar.A()) {
                    return (!A() || v().equals(cVar.v())) && this.unknownFields.equals(cVar.unknownFields);
                }
                return false;
            }

            public String getContent() {
                Object obj = this.f18927e;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f18927e = stringUtf8;
                }
                return stringUtf8;
            }

            public String getName() {
                Object obj = this.f18925c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f18925c = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public p1 getParserForType() {
                return f18923i;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = (this.f18924b & 1) != 0 ? h0.computeStringSize(1, this.f18925c) : 0;
                if ((this.f18924b & 2) != 0) {
                    iComputeStringSize += h0.computeStringSize(2, this.f18926d);
                }
                if ((this.f18924b & 4) != 0) {
                    iComputeStringSize += h0.computeStringSize(15, this.f18927e);
                }
                if ((this.f18924b & 8) != 0) {
                    iComputeStringSize += n.G(16, v());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.MessageOrBuilder
            public final r2 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasContent() {
                return (this.f18924b & 4) != 0;
            }

            public boolean hasName() {
                return (this.f18924b & 1) != 0;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasName()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
                }
                if (B()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + x().hashCode();
                }
                if (hasContent()) {
                    iHashCode = (((iHashCode * 37) + 15) * 53) + getContent().hashCode();
                }
                if (A()) {
                    iHashCode = (((iHashCode * 37) + 16) * 53) + v().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.h0
            protected h0.f internalGetFieldAccessorTable() {
                return PluginProtos.f18908h.d(c.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18929g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f18929g = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.h0
            protected Object newInstance(h0.g gVar) {
                return new c();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return f18922h;
            }

            public DescriptorProtos.i v() {
                DescriptorProtos.i iVar = this.f18928f;
                return iVar == null ? DescriptorProtos.i.n() : iVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(n nVar) throws IOException {
                if ((this.f18924b & 1) != 0) {
                    h0.writeString(nVar, 1, this.f18925c);
                }
                if ((this.f18924b & 2) != 0) {
                    h0.writeString(nVar, 2, this.f18926d);
                }
                if ((this.f18924b & 4) != 0) {
                    h0.writeString(nVar, 15, this.f18927e);
                }
                if ((this.f18924b & 8) != 0) {
                    nVar.J0(16, v());
                }
                this.unknownFields.writeTo(nVar);
            }

            public String x() {
                Object obj = this.f18926d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f18926d = stringUtf8;
                }
                return stringUtf8;
            }

            public static final class b extends h0.b implements MessageOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f18930b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private Object f18931c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private Object f18932d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Object f18933e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private DescriptorProtos.i f18934f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private a2 f18935g;

                private void maybeForceBuilderInitialization() {
                    if (h0.alwaysUseFieldBuilders) {
                        r();
                    }
                }

                private a2 r() {
                    if (this.f18935g == null) {
                        this.f18935g = new a2(q(), getParentForChildren(), isClean());
                        this.f18934f = null;
                    }
                    return this.f18935g;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return PluginProtos.f18907g;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cVarBuildPartial);
                }

                @Override // com.explorestack.protobuf.h0.b
                protected h0.f internalGetFieldAccessorTable() {
                    return PluginProtos.f18908h.d(c.class, b.class);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c buildPartial() {
                    c cVar = new c(this);
                    int i10 = this.f18930b;
                    int i11 = (i10 & 1) != 0 ? 1 : 0;
                    cVar.f18925c = this.f18931c;
                    if ((i10 & 2) != 0) {
                        i11 |= 2;
                    }
                    cVar.f18926d = this.f18932d;
                    if ((i10 & 4) != 0) {
                        i11 |= 4;
                    }
                    cVar.f18927e = this.f18933e;
                    if ((i10 & 8) != 0) {
                        a2 a2Var = this.f18935g;
                        if (a2Var == null) {
                            cVar.f18928f = this.f18934f;
                        } else {
                            cVar.f18928f = (DescriptorProtos.i) a2Var.a();
                        }
                        i11 |= 8;
                    }
                    cVar.f18924b = i11;
                    onBuilt();
                    return cVar;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b clear() {
                    super.clear();
                    this.f18931c = "";
                    int i10 = this.f18930b;
                    this.f18932d = "";
                    this.f18933e = "";
                    this.f18930b = i10 & (-8);
                    a2 a2Var = this.f18935g;
                    if (a2Var == null) {
                        this.f18934f = null;
                    } else {
                        a2Var.b();
                    }
                    this.f18930b &= -9;
                    return this;
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public b mo4427clone() {
                    return (b) super.mo4427clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public c getDefaultInstanceForType() {
                    return c.t();
                }

                public DescriptorProtos.i q() {
                    a2 a2Var = this.f18935g;
                    if (a2Var != null) {
                        return (DescriptorProtos.i) a2Var.e();
                    }
                    DescriptorProtos.i iVar = this.f18934f;
                    return iVar == null ? DescriptorProtos.i.n() : iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.c.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.c.f18923i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$c r3 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.c) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.u(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$c r4 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.c) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.u(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.c.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$c$b");
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(Message message) {
                    if (message instanceof c) {
                        return u((c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public b u(c cVar) {
                    if (cVar == c.t()) {
                        return this;
                    }
                    if (cVar.hasName()) {
                        this.f18930b |= 1;
                        this.f18931c = cVar.f18925c;
                        onChanged();
                    }
                    if (cVar.B()) {
                        this.f18930b |= 2;
                        this.f18932d = cVar.f18926d;
                        onChanged();
                    }
                    if (cVar.hasContent()) {
                        this.f18930b |= 4;
                        this.f18933e = cVar.f18927e;
                        onChanged();
                    }
                    if (cVar.A()) {
                        v(cVar.v());
                    }
                    mergeUnknownFields(((h0) cVar).unknownFields);
                    onChanged();
                    return this;
                }

                public b v(DescriptorProtos.i iVar) {
                    DescriptorProtos.i iVar2;
                    a2 a2Var = this.f18935g;
                    if (a2Var == null) {
                        if ((this.f18930b & 8) == 0 || (iVar2 = this.f18934f) == null || iVar2 == DescriptorProtos.i.n()) {
                            this.f18934f = iVar;
                        } else {
                            this.f18934f = DescriptorProtos.i.r(this.f18934f).t(iVar).buildPartial();
                        }
                        onChanged();
                    } else {
                        a2Var.g(iVar);
                    }
                    this.f18930b |= 8;
                    return this;
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public final b mergeUnknownFields(r2 r2Var) {
                    return (b) super.mergeUnknownFields(r2Var);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(r2 r2Var) {
                    return (b) super.setUnknownFields(r2Var);
                }

                private b() {
                    this.f18931c = "";
                    this.f18932d = "";
                    this.f18933e = "";
                    maybeForceBuilderInitialization();
                }

                private b(h0.c cVar) {
                    super(cVar);
                    this.f18931c = "";
                    this.f18932d = "";
                    this.f18933e = "";
                    maybeForceBuilderInitialization();
                }
            }

            private c(h0.b bVar) {
                super(bVar);
                this.f18929g = (byte) -1;
            }

            private c() {
                this.f18929g = (byte) -1;
                this.f18925c = "";
                this.f18926d = "";
                this.f18927e = "";
            }

            private c(l lVar, w wVar) {
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
                                    ByteString byteStringR = lVar.r();
                                    this.f18924b = 1 | this.f18924b;
                                    this.f18925c = byteStringR;
                                } else if (iK == 18) {
                                    ByteString byteStringR2 = lVar.r();
                                    this.f18924b |= 2;
                                    this.f18926d = byteStringR2;
                                } else if (iK == 122) {
                                    ByteString byteStringR3 = lVar.r();
                                    this.f18924b |= 4;
                                    this.f18927e = byteStringR3;
                                } else if (iK != 130) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    DescriptorProtos.i.c builder = (this.f18924b & 8) != 0 ? this.f18928f.toBuilder() : null;
                                    DescriptorProtos.i iVar = (DescriptorProtos.i) lVar.A(DescriptorProtos.i.f18605e, wVar);
                                    this.f18928f = iVar;
                                    if (builder != null) {
                                        builder.t(iVar);
                                        this.f18928f = builder.buildPartial();
                                    }
                                    this.f18924b |= 8;
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
        }

        public static b C() {
            return f18910g.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.f18905e;
        }

        public static CodeGeneratorResponse s() {
            return f18910g;
        }

        public long A() {
            return this.f18914d;
        }

        public boolean B() {
            return (this.f18912b & 2) != 0;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return C();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f18910g ? new b() : new b().u(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorResponse)) {
                return super.equals(obj);
            }
            CodeGeneratorResponse codeGeneratorResponse = (CodeGeneratorResponse) obj;
            if (hasError() != codeGeneratorResponse.hasError()) {
                return false;
            }
            if ((!hasError() || u().equals(codeGeneratorResponse.u())) && B() == codeGeneratorResponse.B()) {
                return (!B() || A() == codeGeneratorResponse.A()) && x().equals(codeGeneratorResponse.x()) && this.unknownFields.equals(codeGeneratorResponse.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f18911h;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f18912b & 1) != 0 ? h0.computeStringSize(1, this.f18913c) : 0;
            if ((this.f18912b & 2) != 0) {
                iComputeStringSize += n.a0(2, this.f18914d);
            }
            for (int i11 = 0; i11 < this.f18915e.size(); i11++) {
                iComputeStringSize += n.G(15, (MessageLite) this.f18915e.get(i11));
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasError() {
            return (this.f18912b & 1) != 0;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasError()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + u().hashCode();
            }
            if (B()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + j0.i(A());
            }
            if (v() > 0) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + x().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return PluginProtos.f18906f.d(CodeGeneratorResponse.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18916f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f18916f = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new CodeGeneratorResponse();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public CodeGeneratorResponse getDefaultInstanceForType() {
            return f18910g;
        }

        public String u() {
            Object obj = this.f18913c;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f18913c = stringUtf8;
            }
            return stringUtf8;
        }

        public int v() {
            return this.f18915e.size();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if ((this.f18912b & 1) != 0) {
                h0.writeString(nVar, 1, this.f18913c);
            }
            if ((this.f18912b & 2) != 0) {
                nVar.Y0(2, this.f18914d);
            }
            for (int i10 = 0; i10 < this.f18915e.size(); i10++) {
                nVar.J0(15, (MessageLite) this.f18915e.get(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public List x() {
            return this.f18915e;
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f18917b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f18918c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f18919d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List f18920e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private v1 f18921f;

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            private void p() {
                if ((this.f18917b & 4) == 0) {
                    this.f18920e = new ArrayList(this.f18920e);
                    this.f18917b |= 4;
                }
            }

            private v1 r() {
                if (this.f18921f == null) {
                    this.f18921f = new v1(this.f18920e, (this.f18917b & 4) != 0, getParentForChildren(), isClean());
                    this.f18920e = null;
                }
                return this.f18921f;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.f18905e;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse build() {
                CodeGeneratorResponse codeGeneratorResponseBuildPartial = buildPartial();
                if (codeGeneratorResponseBuildPartial.isInitialized()) {
                    return codeGeneratorResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) codeGeneratorResponseBuildPartial);
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return PluginProtos.f18906f.d(CodeGeneratorResponse.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse buildPartial() {
                CodeGeneratorResponse codeGeneratorResponse = new CodeGeneratorResponse(this);
                int i10 = this.f18917b;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                codeGeneratorResponse.f18913c = this.f18918c;
                if ((i10 & 2) != 0) {
                    codeGeneratorResponse.f18914d = this.f18919d;
                    i11 |= 2;
                }
                v1 v1Var = this.f18921f;
                if (v1Var == null) {
                    if ((this.f18917b & 4) != 0) {
                        this.f18920e = DesugarCollections.unmodifiableList(this.f18920e);
                        this.f18917b &= -5;
                    }
                    codeGeneratorResponse.f18915e = this.f18920e;
                } else {
                    codeGeneratorResponse.f18915e = v1Var.f();
                }
                codeGeneratorResponse.f18912b = i11;
                onBuilt();
                return codeGeneratorResponse;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f18918c = "";
                int i10 = this.f18917b;
                this.f18919d = 0L;
                this.f18917b = i10 & (-4);
                v1 v1Var = this.f18921f;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.f18920e = Collections.EMPTY_LIST;
                this.f18917b = i10 & (-8);
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mo4427clone() {
                return (b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse getDefaultInstanceForType() {
                return CodeGeneratorResponse.s();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.f18911h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse r3 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.u(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse r4 = (com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.u(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.compiler.PluginProtos.CodeGeneratorResponse.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.compiler.PluginProtos$CodeGeneratorResponse$b");
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof CodeGeneratorResponse) {
                    return u((CodeGeneratorResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b u(CodeGeneratorResponse codeGeneratorResponse) {
                if (codeGeneratorResponse == CodeGeneratorResponse.s()) {
                    return this;
                }
                if (codeGeneratorResponse.hasError()) {
                    this.f18917b |= 1;
                    this.f18918c = codeGeneratorResponse.f18913c;
                    onChanged();
                }
                if (codeGeneratorResponse.B()) {
                    y(codeGeneratorResponse.A());
                }
                if (this.f18921f == null) {
                    if (!codeGeneratorResponse.f18915e.isEmpty()) {
                        if (this.f18920e.isEmpty()) {
                            this.f18920e = codeGeneratorResponse.f18915e;
                            this.f18917b &= -5;
                        } else {
                            p();
                            this.f18920e.addAll(codeGeneratorResponse.f18915e);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorResponse.f18915e.isEmpty()) {
                    if (this.f18921f.t()) {
                        this.f18921f.h();
                        this.f18921f = null;
                        this.f18920e = codeGeneratorResponse.f18915e;
                        this.f18917b &= -5;
                        this.f18921f = h0.alwaysUseFieldBuilders ? r() : null;
                    } else {
                        this.f18921f.a(codeGeneratorResponse.f18915e);
                    }
                }
                mergeUnknownFields(((h0) codeGeneratorResponse).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public b y(long j10) {
                this.f18917b |= 2;
                this.f18919d = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            private b() {
                this.f18918c = "";
                this.f18920e = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f18918c = "";
                this.f18920e = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        private CodeGeneratorResponse(h0.b bVar) {
            super(bVar);
            this.f18916f = (byte) -1;
        }

        private CodeGeneratorResponse() {
            this.f18916f = (byte) -1;
            this.f18913c = "";
            this.f18915e = Collections.EMPTY_LIST;
        }

        private CodeGeneratorResponse(l lVar, w wVar) {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                ByteString byteStringR = lVar.r();
                                this.f18912b = 1 | this.f18912b;
                                this.f18913c = byteStringR;
                            } else if (iK == 16) {
                                this.f18912b |= 2;
                                this.f18914d = lVar.M();
                            } else if (iK != 122) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((c10 & 4) == 0) {
                                    this.f18915e = new ArrayList();
                                    c10 = 4;
                                }
                                this.f18915e.add(lVar.A(c.f18923i, wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((c10 & 4) != 0) {
                        this.f18915e = DesugarCollections.unmodifiableList(this.f18915e);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((c10 & 4) != 0) {
                this.f18915e = DesugarCollections.unmodifiableList(this.f18915e);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    static {
        Descriptors.Descriptor descriptor = e().getMessageTypes().get(0);
        f18901a = descriptor;
        f18902b = new h0.f(descriptor, new String[]{"Major", "Minor", "Patch", "Suffix"});
        Descriptors.Descriptor descriptor2 = e().getMessageTypes().get(1);
        f18903c = descriptor2;
        f18904d = new h0.f(descriptor2, new String[]{"FileToGenerate", "Parameter", "ProtoFile", "CompilerVersion"});
        Descriptors.Descriptor descriptor3 = e().getMessageTypes().get(2);
        f18905e = descriptor3;
        f18906f = new h0.f(descriptor3, new String[]{"Error", "SupportedFeatures", "File"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f18907g = descriptor4;
        f18908h = new h0.f(descriptor4, new String[]{"Name", "InsertionPoint", "Content", "GeneratedCodeInfo"});
        DescriptorProtos.a0();
    }

    public static Descriptors.FileDescriptor e() {
        return f18909i;
    }
}
