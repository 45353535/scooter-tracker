package com.appodeal.ads.api;

import com.appodeal.ads.api.l;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k f13083g = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p1 f13084h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f13086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Object f13087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f13088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f13089f;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public k parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new k(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l f13091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a2 f13092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f13093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f13094f;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return c.f12884i;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public k build() {
            k kVarBuildPartial = buildPartial();
            if (kVarBuildPartial.isInitialized()) {
                return kVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) kVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12885j.d(k.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public k buildPartial() {
            k kVar = new k(this, (a) null);
            kVar.f13085b = this.f13090b;
            a2 a2Var = this.f13092d;
            if (a2Var == null) {
                kVar.f13086c = this.f13091c;
            } else {
                kVar.f13086c = (l) a2Var.a();
            }
            kVar.f13087d = this.f13093e;
            kVar.f13088e = this.f13094f;
            onBuilt();
            return kVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f13090b = false;
            if (this.f13092d == null) {
                this.f13091c = null;
            } else {
                this.f13091c = null;
                this.f13092d = null;
            }
            this.f13093e = "";
            this.f13094f = "";
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
        public k getDefaultInstanceForType() {
            return k.s();
        }

        public b q(k kVar) {
            if (kVar == k.s()) {
                return this;
            }
            if (kVar.r()) {
                v(kVar.r());
            }
            if (kVar.A()) {
                u(kVar.x());
            }
            if (!kVar.getId().isEmpty()) {
                this.f13093e = kVar.f13087d;
                onChanged();
            }
            if (!kVar.u().isEmpty()) {
                this.f13094f = kVar.f13088e;
                onChanged();
            }
            mergeUnknownFields(((h0) kVar).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.appodeal.ads.api.k.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.k.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.k r3 = (com.appodeal.ads.api.k) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.q(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.appodeal.ads.api.k r4 = (com.appodeal.ads.api.k) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.q(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.k.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.k$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof k) {
                return q((k) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b u(l lVar) {
            a2 a2Var = this.f13092d;
            if (a2Var != null) {
                a2Var.g(lVar);
                return this;
            }
            l lVar2 = this.f13091c;
            if (lVar2 != null) {
                this.f13091c = l.u(lVar2).q(lVar).buildPartial();
            } else {
                this.f13091c = lVar;
            }
            onChanged();
            return this;
        }

        public b v(boolean z10) {
            this.f13090b = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b x(String str) {
            str.getClass();
            this.f13093e = str;
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
            this.f13093e = "";
            this.f13094f = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f13093e = "";
            this.f13094f = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ k(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static b B() {
        return f13083g.toBuilder();
    }

    public static b C(k kVar) {
        return f13083g.toBuilder().q(kVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12884i;
    }

    public static p1 parser() {
        return f13084h;
    }

    public static k s() {
        return f13083g;
    }

    public boolean A() {
        return this.f13086c != null;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f13083g ? new b(aVar) : new b(aVar).q(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return super.equals(obj);
        }
        k kVar = (k) obj;
        if (r() == kVar.r() && A() == kVar.A()) {
            return (!A() || x().equals(kVar.x())) && getId().equals(kVar.getId()) && u().equals(kVar.u()) && this.unknownFields.equals(kVar.unknownFields);
        }
        return false;
    }

    public String getId() {
        Object obj = this.f13087d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f13087d = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdBytes() {
        Object obj = this.f13087d;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f13087d = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f13084h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.f13085b;
        int iE = z10 ? n.e(1, z10) : 0;
        if (this.f13086c != null) {
            iE += n.G(2, x());
        }
        if (!getIdBytes().isEmpty()) {
            iE += h0.computeStringSize(3, this.f13087d);
        }
        if (!v().isEmpty()) {
            iE += h0.computeStringSize(4, this.f13088e);
        }
        int serializedSize = iE + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(r());
        if (A()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + x().hashCode();
        }
        int iHashCode2 = (((((((((iHashCode * 37) + 3) * 53) + getId().hashCode()) * 37) + 4) * 53) + u().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12885j.d(k.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f13089f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f13089f = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new k();
    }

    public boolean r() {
        return this.f13085b;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public k getDefaultInstanceForType() {
        return f13083g;
    }

    public String u() {
        Object obj = this.f13088e;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f13088e = stringUtf8;
        return stringUtf8;
    }

    public ByteString v() {
        Object obj = this.f13088e;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f13088e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        boolean z10 = this.f13085b;
        if (z10) {
            nVar.n0(1, z10);
        }
        if (this.f13086c != null) {
            nVar.J0(2, x());
        }
        if (!getIdBytes().isEmpty()) {
            h0.writeString(nVar, 3, this.f13087d);
        }
        if (!v().isEmpty()) {
            h0.writeString(nVar, 4, this.f13088e);
        }
        this.unknownFields.writeTo(nVar);
    }

    public l x() {
        l lVar = this.f13086c;
        return lVar == null ? l.r() : lVar;
    }

    /* synthetic */ k(h0.b bVar, a aVar) {
        this(bVar);
    }

    private k(h0.b bVar) {
        super(bVar);
        this.f13089f = (byte) -1;
    }

    private k() {
        this.f13089f = (byte) -1;
        this.f13087d = "";
        this.f13088e = "";
    }

    private k(com.explorestack.protobuf.l lVar, w wVar) {
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
                            this.f13085b = lVar.q();
                        } else if (iK == 18) {
                            l lVar2 = this.f13086c;
                            l.b bVarA = lVar2 != null ? lVar2.toBuilder() : null;
                            l lVar3 = (l) lVar.A(l.parser(), wVar);
                            this.f13086c = lVar3;
                            if (bVarA != null) {
                                bVarA.q(lVar3);
                                this.f13086c = bVarA.buildPartial();
                            }
                        } else if (iK == 26) {
                            this.f13087d = lVar.J();
                        } else if (iK != 34) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.f13088e = lVar.J();
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
