package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.r2;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o1 f19271e = new o1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p1 f19272f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f19273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Any f19274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f19275d;

    static class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o1 parsePartialFrom(l lVar, w wVar) {
            return new o1(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f19276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Any f19277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a2 f19278d;

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private void maybeForceBuilderInitialization() {
            boolean z10 = h0.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return l2.f19217i;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public o1 build() {
            o1 o1VarBuildPartial = buildPartial();
            if (o1VarBuildPartial.isInitialized()) {
                return o1VarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) o1VarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return l2.f19218j.d(o1.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public o1 buildPartial() {
            o1 o1Var = new o1(this, (a) null);
            o1Var.f19273b = this.f19276b;
            a2 a2Var = this.f19278d;
            if (a2Var == null) {
                o1Var.f19274c = this.f19277c;
            } else {
                o1Var.f19274c = (Any) a2Var.a();
            }
            onBuilt();
            return o1Var;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f19276b = "";
            if (this.f19278d == null) {
                this.f19277c = null;
                return this;
            }
            this.f19277c = null;
            this.f19278d = null;
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
        public o1 getDefaultInstanceForType() {
            return o1.m();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.o1.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.o1.access$500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.o1 r3 = (com.explorestack.protobuf.o1) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.s(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.explorestack.protobuf.o1 r4 = (com.explorestack.protobuf.o1) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.s(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.o1.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.o1$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof o1) {
                return s((o1) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public b s(o1 o1Var) {
            if (o1Var == o1.m()) {
                return this;
            }
            if (!o1Var.getName().isEmpty()) {
                this.f19276b = o1Var.f19273b;
                onChanged();
            }
            if (o1Var.hasValue()) {
                u(o1Var.o());
            }
            mergeUnknownFields(o1Var.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b u(Any any) {
            a2 a2Var = this.f19278d;
            if (a2Var != null) {
                a2Var.g(any);
                return this;
            }
            Any any2 = this.f19277c;
            if (any2 != null) {
                this.f19277c = Any.newBuilder(any2).mergeFrom(any).buildPartial();
            } else {
                this.f19277c = any;
            }
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r2 r2Var) {
            return (b) super.setUnknownFields(r2Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            this.f19276b = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f19276b = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ o1(l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return l2.f19217i;
    }

    public static o1 m() {
        return f19271e;
    }

    public static p1 parser() {
        return f19272f;
    }

    public static b q() {
        return f19271e.toBuilder();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return super.equals(obj);
        }
        o1 o1Var = (o1) obj;
        if (getName().equals(o1Var.getName()) && hasValue() == o1Var.hasValue()) {
            return (!hasValue() || o().equals(o1Var.o())) && this.unknownFields.equals(o1Var.unknownFields);
        }
        return false;
    }

    public String getName() {
        Object obj = this.f19273b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f19273b = stringUtf8;
        return stringUtf8;
    }

    public ByteString getNameBytes() {
        Object obj = this.f19273b;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f19273b = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f19272f;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? h0.computeStringSize(1, this.f19273b) : 0;
        if (this.f19274c != null) {
            iComputeStringSize += n.G(2, o());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasValue() {
        return this.f19274c != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (hasValue()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + o().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return l2.f19218j.d(o1.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f19275d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f19275d = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public o1 getDefaultInstanceForType() {
        return f19271e;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new o1();
    }

    public Any o() {
        Any any = this.f19274c;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f19271e ? new b(aVar) : new b(aVar).s(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getNameBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.f19273b);
        }
        if (this.f19274c != null) {
            nVar.J0(2, o());
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ o1(h0.b bVar, a aVar) {
        this(bVar);
    }

    private o1(h0.b bVar) {
        super(bVar);
        this.f19275d = (byte) -1;
    }

    private o1() {
        this.f19275d = (byte) -1;
        this.f19273b = "";
    }

    private o1(l lVar, w wVar) {
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
                            this.f19273b = lVar.J();
                        } else if (iK != 18) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Any any = this.f19274c;
                            Any.Builder builder = any != null ? any.toBuilder() : null;
                            Any any2 = (Any) lVar.A(Any.parser(), wVar);
                            this.f19274c = any2;
                            if (builder != null) {
                                builder.mergeFrom(any2);
                                this.f19274c = builder.buildPartial();
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
}
