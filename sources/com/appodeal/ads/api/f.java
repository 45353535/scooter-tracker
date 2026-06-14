package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final f f12945i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p1 f12946j = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f12947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p0 f12951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte f12953h;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public f parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new f(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f12955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f12957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p0 f12959g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f12960h;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        private void p() {
            if ((this.f12954b & 1) == 0) {
                this.f12959g = new o0(this.f12959g);
                this.f12954b |= 1;
            }
        }

        public b A(boolean z10) {
            this.f12957e = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r2 r2Var) {
            return (b) super.setUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return c.C;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public f build() {
            f fVarBuildPartial = buildPartial();
            if (fVarBuildPartial.isInitialized()) {
                return fVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) fVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.D.d(f.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public f buildPartial() {
            f fVar = new f(this, (a) null);
            fVar.f12947b = this.f12955c;
            fVar.f12948c = this.f12956d;
            fVar.f12949d = this.f12957e;
            fVar.f12950e = this.f12958f;
            if ((this.f12954b & 1) != 0) {
                this.f12959g = this.f12959g.getUnmodifiableView();
                this.f12954b &= -2;
            }
            fVar.f12951f = this.f12959g;
            fVar.f12952g = this.f12960h;
            onBuilt();
            return fVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f12955c = "";
            this.f12956d = false;
            this.f12957e = false;
            this.f12958f = false;
            this.f12959g = o0.f19269e;
            this.f12954b &= -2;
            this.f12960h = false;
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
        public f getDefaultInstanceForType() {
            return f.v();
        }

        public b r(f fVar) {
            if (fVar == f.v()) {
                return this;
            }
            if (!fVar.getType().isEmpty()) {
                this.f12955c = fVar.f12947b;
                onChanged();
            }
            if (fVar.A()) {
                y(fVar.A());
            }
            if (fVar.B()) {
                A(fVar.B());
            }
            if (fVar.u()) {
                w(fVar.u());
            }
            if (!fVar.f12951f.isEmpty()) {
                if (this.f12959g.isEmpty()) {
                    this.f12959g = fVar.f12951f;
                    this.f12954b &= -2;
                } else {
                    p();
                    this.f12959g.addAll(fVar.f12951f);
                }
                onChanged();
            }
            if (fVar.t()) {
                v(fVar.t());
            }
            mergeUnknownFields(((h0) fVar).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.appodeal.ads.api.f.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.f.access$1100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.f r3 = (com.appodeal.ads.api.f) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.r(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.appodeal.ads.api.f r4 = (com.appodeal.ads.api.f) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.r(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.f.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.f$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof f) {
                return r((f) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b v(boolean z10) {
            this.f12960h = z10;
            onChanged();
            return this;
        }

        public b w(boolean z10) {
            this.f12958f = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b y(boolean z10) {
            this.f12956d = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f12955c = "";
            this.f12959g = o0.f19269e;
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f12955c = "";
            this.f12959g = o0.f19269e;
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ f(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static b E() {
        return f12945i.toBuilder();
    }

    public static b F(f fVar) {
        return f12945i.toBuilder().r(fVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.C;
    }

    public static p1 parser() {
        return f12946j;
    }

    public static f v() {
        return f12945i;
    }

    public boolean A() {
        return this.f12948c;
    }

    public boolean B() {
        return this.f12949d;
    }

    public int C() {
        return this.f12951f.size();
    }

    public t1 D() {
        return this.f12951f;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f12945i ? new b(aVar) : new b(aVar).r(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        return getType().equals(fVar.getType()) && A() == fVar.A() && B() == fVar.B() && u() == fVar.u() && D().equals(fVar.D()) && t() == fVar.t() && this.unknownFields.equals(fVar.unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12946j;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getTypeBytes().isEmpty() ? h0.computeStringSize(1, this.f12947b) : 0;
        boolean z10 = this.f12948c;
        if (z10) {
            iComputeStringSize += n.e(2, z10);
        }
        boolean z11 = this.f12949d;
        if (z11) {
            iComputeStringSize += n.e(3, z11);
        }
        boolean z12 = this.f12950e;
        if (z12) {
            iComputeStringSize += n.e(4, z12);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.f12951f.size(); i11++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.f12951f.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + D().size();
        boolean z13 = this.f12952g;
        if (z13) {
            size += n.e(6, z13);
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getType() {
        Object obj = this.f12947b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12947b = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTypeBytes() {
        Object obj = this.f12947b;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12947b = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode()) * 37) + 2) * 53) + j0.d(A())) * 37) + 3) * 53) + j0.d(B())) * 37) + 4) * 53) + j0.d(u());
        if (C() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + D().hashCode();
        }
        int iD = (((((iHashCode * 37) + 6) * 53) + j0.d(t())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iD;
        return iD;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.D.d(f.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12953h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12953h = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new f();
    }

    public boolean t() {
        return this.f12952g;
    }

    public boolean u() {
        return this.f12950e;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getTypeBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.f12947b);
        }
        boolean z10 = this.f12948c;
        if (z10) {
            nVar.n0(2, z10);
        }
        boolean z11 = this.f12949d;
        if (z11) {
            nVar.n0(3, z11);
        }
        boolean z12 = this.f12950e;
        if (z12) {
            nVar.n0(4, z12);
        }
        for (int i10 = 0; i10 < this.f12951f.size(); i10++) {
            h0.writeString(nVar, 5, this.f12951f.getRaw(i10));
        }
        boolean z13 = this.f12952g;
        if (z13) {
            nVar.n0(6, z13);
        }
        this.unknownFields.writeTo(nVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public f getDefaultInstanceForType() {
        return f12945i;
    }

    /* synthetic */ f(h0.b bVar, a aVar) {
        this(bVar);
    }

    private f(h0.b bVar) {
        super(bVar);
        this.f12953h = (byte) -1;
    }

    private f() {
        this.f12953h = (byte) -1;
        this.f12947b = "";
        this.f12951f = o0.f19269e;
    }

    private f(com.explorestack.protobuf.l lVar, w wVar) {
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
                            this.f12947b = lVar.J();
                        } else if (iK == 16) {
                            this.f12948c = lVar.q();
                        } else if (iK == 24) {
                            this.f12949d = lVar.q();
                        } else if (iK == 32) {
                            this.f12950e = lVar.q();
                        } else if (iK == 42) {
                            String strJ = lVar.J();
                            if (!z11) {
                                this.f12951f = new o0();
                                z11 = true;
                            }
                            this.f12951f.add(strJ);
                        } else if (iK != 48) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.f12952g = lVar.q();
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
                    this.f12951f = this.f12951f.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.f12951f = this.f12951f.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
