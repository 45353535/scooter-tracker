package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e f12933g = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p1 f12934h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f12935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f12936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p0 f12937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p0 f12938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f12939f;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new e(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f12941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f12942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p0 f12943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p0 f12944f;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        private void p() {
            if ((this.f12940b & 1) == 0) {
                this.f12943e = new o0(this.f12943e);
                this.f12940b |= 1;
            }
        }

        private void q() {
            if ((this.f12940b & 2) == 0) {
                this.f12944f = new o0(this.f12944f);
                this.f12940b |= 2;
            }
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return c.f12890o;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public e build() {
            e eVarBuildPartial = buildPartial();
            if (eVarBuildPartial.isInitialized()) {
                return eVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) eVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12891p.d(e.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public e buildPartial() {
            e eVar = new e(this, (a) null);
            eVar.f12935b = this.f12941c;
            eVar.f12936c = this.f12942d;
            if ((this.f12940b & 1) != 0) {
                this.f12943e = this.f12943e.getUnmodifiableView();
                this.f12940b &= -2;
            }
            eVar.f12937d = this.f12943e;
            if ((this.f12940b & 2) != 0) {
                this.f12944f = this.f12944f.getUnmodifiableView();
                this.f12940b &= -3;
            }
            eVar.f12938e = this.f12944f;
            onBuilt();
            return eVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f12941c = 0.0f;
            this.f12942d = "";
            p0 p0Var = o0.f19269e;
            this.f12943e = p0Var;
            int i10 = this.f12940b;
            this.f12944f = p0Var;
            this.f12940b = i10 & (-4);
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
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public e getDefaultInstanceForType() {
            return e.x();
        }

        public b s(e eVar) {
            if (eVar == e.x()) {
                return this;
            }
            if (eVar.B() != 0.0f) {
                x(eVar.B());
            }
            if (!eVar.s().isEmpty()) {
                this.f12942d = eVar.f12936c;
                onChanged();
            }
            if (!eVar.f12937d.isEmpty()) {
                if (this.f12943e.isEmpty()) {
                    this.f12943e = eVar.f12937d;
                    this.f12940b &= -2;
                } else {
                    p();
                    this.f12943e.addAll(eVar.f12937d);
                }
                onChanged();
            }
            if (!eVar.f12938e.isEmpty()) {
                if (this.f12944f.isEmpty()) {
                    this.f12944f = eVar.f12938e;
                    this.f12940b &= -3;
                } else {
                    q();
                    this.f12944f.addAll(eVar.f12938e);
                }
                onChanged();
            }
            mergeUnknownFields(((h0) eVar).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.appodeal.ads.api.e.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.e.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.e r3 = (com.appodeal.ads.api.e) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.appodeal.ads.api.e r4 = (com.appodeal.ads.api.e) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.e.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.e$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof e) {
                return s((e) message);
            }
            super.mergeFrom(message);
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

        public b x(float f10) {
            this.f12941c = f10;
            onChanged();
            return this;
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

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f12942d = "";
            p0 p0Var = o0.f19269e;
            this.f12943e = p0Var;
            this.f12944f = p0Var;
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f12942d = "";
            p0 p0Var = o0.f19269e;
            this.f12943e = p0Var;
            this.f12944f = p0Var;
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ e(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static b E() {
        return f12933g.toBuilder();
    }

    public static b F(e eVar) {
        return f12933g.toBuilder().s(eVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12890o;
    }

    public static p1 parser() {
        return f12934h;
    }

    public static e x() {
        return f12933g;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public e getDefaultInstanceForType() {
        return f12933g;
    }

    public float B() {
        return this.f12935b;
    }

    public int C() {
        return this.f12938e.size();
    }

    public t1 D() {
        return this.f12938e;
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
        return this == f12933g ? new b(aVar) : new b(aVar).s(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        return Float.floatToIntBits(B()) == Float.floatToIntBits(eVar.B()) && s().equals(eVar.s()) && v().equals(eVar.v()) && D().equals(eVar.D()) && this.unknownFields.equals(eVar.unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12934h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        float f10 = this.f12935b;
        int iR = f10 != 0.0f ? n.r(1, f10) : 0;
        if (!t().isEmpty()) {
            iR += h0.computeStringSize(2, this.f12936c);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.f12937d.size(); i11++) {
            iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.f12937d.getRaw(i11));
        }
        int size = iR + iComputeStringSizeNoTag + v().size();
        int iComputeStringSizeNoTag2 = 0;
        for (int i12 = 0; i12 < this.f12938e.size(); i12++) {
            iComputeStringSizeNoTag2 += h0.computeStringSizeNoTag(this.f12938e.getRaw(i12));
        }
        int size2 = size + iComputeStringSizeNoTag2 + D().size() + this.unknownFields.getSerializedSize();
        this.memoizedSize = size2;
        return size2;
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
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(B())) * 37) + 2) * 53) + s().hashCode();
        if (u() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + v().hashCode();
        }
        if (C() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + D().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12891p.d(e.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12939f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12939f = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new e();
    }

    public String s() {
        Object obj = this.f12936c;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12936c = stringUtf8;
        return stringUtf8;
    }

    public ByteString t() {
        Object obj = this.f12936c;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12936c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public int u() {
        return this.f12937d.size();
    }

    public t1 v() {
        return this.f12937d;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        float f10 = this.f12935b;
        if (f10 != 0.0f) {
            nVar.B0(1, f10);
        }
        if (!t().isEmpty()) {
            h0.writeString(nVar, 2, this.f12936c);
        }
        for (int i10 = 0; i10 < this.f12937d.size(); i10++) {
            h0.writeString(nVar, 3, this.f12937d.getRaw(i10));
        }
        for (int i11 = 0; i11 < this.f12938e.size(); i11++) {
            h0.writeString(nVar, 4, this.f12938e.getRaw(i11));
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ e(h0.b bVar, a aVar) {
        this(bVar);
    }

    private e(h0.b bVar) {
        super(bVar);
        this.f12939f = (byte) -1;
    }

    private e() {
        this.f12939f = (byte) -1;
        this.f12936c = "";
        p0 p0Var = o0.f19269e;
        this.f12937d = p0Var;
        this.f12938e = p0Var;
    }

    private e(com.explorestack.protobuf.l lVar, w wVar) {
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
                        if (iK == 13) {
                            this.f12935b = lVar.w();
                        } else if (iK == 18) {
                            this.f12936c = lVar.J();
                        } else if (iK == 26) {
                            String strJ = lVar.J();
                            if ((i10 & 1) == 0) {
                                this.f12937d = new o0();
                                i10 |= 1;
                            }
                            this.f12937d.add(strJ);
                        } else if (iK != 34) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            String strJ2 = lVar.J();
                            if ((i10 & 2) == 0) {
                                this.f12938e = new o0();
                                i10 |= 2;
                            }
                            this.f12938e.add(strJ2);
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) != 0) {
                    this.f12937d = this.f12937d.getUnmodifiableView();
                }
                if ((i10 & 2) != 0) {
                    this.f12938e = this.f12938e.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.f12937d = this.f12937d.getUnmodifiableView();
        }
        if ((i10 & 2) != 0) {
            this.f12938e = this.f12938e.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
