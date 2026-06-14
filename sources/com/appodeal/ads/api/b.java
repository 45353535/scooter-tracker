package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f12867f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p1 f12868g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f12869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f12870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Object f12871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f12872e;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new b(lVar, wVar, null);
        }
    }

    /* JADX INFO: renamed from: com.appodeal.ads.api.b$b, reason: collision with other inner class name */
    public static final class C0194b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f12873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f12874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f12875d;

        /* synthetic */ C0194b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0194b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (C0194b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return c.f12894s;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b build() {
            b bVarBuildPartial = buildPartial();
            if (bVarBuildPartial.isInitialized()) {
                return bVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) bVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12895t.d(b.class, C0194b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b buildPartial() {
            b bVar = new b(this, (a) null);
            bVar.f12869b = this.f12873b;
            bVar.f12870c = this.f12874c;
            bVar.f12871d = this.f12875d;
            onBuilt();
            return bVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C0194b clear() {
            super.clear();
            this.f12873b = "";
            this.f12874c = "";
            this.f12875d = "";
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C0194b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (C0194b) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C0194b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (C0194b) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C0194b mo4427clone() {
            return (C0194b) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b getDefaultInstanceForType() {
            return b.r();
        }

        public C0194b q(b bVar) {
            if (bVar == b.r()) {
                return this;
            }
            if (!bVar.v().isEmpty()) {
                this.f12873b = bVar.f12869b;
                onChanged();
            }
            if (!bVar.A().isEmpty()) {
                this.f12874c = bVar.f12870c;
                onChanged();
            }
            if (!bVar.t().isEmpty()) {
                this.f12875d = bVar.f12871d;
                onChanged();
            }
            mergeUnknownFields(((h0) bVar).unknownFields);
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
        public com.appodeal.ads.api.b.C0194b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.b.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.b r3 = (com.appodeal.ads.api.b) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.appodeal.ads.api.b r4 = (com.appodeal.ads.api.b) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.b.C0194b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.b$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public C0194b mergeFrom(Message message) {
            if (message instanceof b) {
                return q((b) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final C0194b mergeUnknownFields(r2 r2Var) {
            return (C0194b) super.mergeUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0194b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (C0194b) super.setField(fieldDescriptor, obj);
        }

        public C0194b v(String str) {
            str.getClass();
            this.f12875d = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public C0194b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (C0194b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        public C0194b x(String str) {
            str.getClass();
            this.f12873b = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C0194b setUnknownFields(r2 r2Var) {
            return (C0194b) super.setUnknownFields(r2Var);
        }

        public C0194b z(String str) {
            str.getClass();
            this.f12874c = str;
            onChanged();
            return this;
        }

        /* synthetic */ C0194b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private C0194b() {
            this.f12873b = "";
            this.f12874c = "";
            this.f12875d = "";
            maybeForceBuilderInitialization();
        }

        private C0194b(h0.c cVar) {
            super(cVar);
            this.f12873b = "";
            this.f12874c = "";
            this.f12875d = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ b(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static C0194b C() {
        return f12867f.toBuilder();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12894s;
    }

    public static p1 parser() {
        return f12868g;
    }

    public static b r() {
        return f12867f;
    }

    public String A() {
        Object obj = this.f12870c;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12870c = stringUtf8;
        return stringUtf8;
    }

    public ByteString B() {
        Object obj = this.f12870c;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12870c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0194b newBuilderForType() {
        return C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0194b newBuilderForType(h0.c cVar) {
        return new C0194b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C0194b toBuilder() {
        a aVar = null;
        return this == f12867f ? new C0194b(aVar) : new C0194b(aVar).q(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        return v().equals(bVar.v()) && A().equals(bVar.A()) && t().equals(bVar.t()) && this.unknownFields.equals(bVar.unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12868g;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !x().isEmpty() ? h0.computeStringSize(1, this.f12869b) : 0;
        if (!B().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.f12870c);
        }
        if (!u().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(3, this.f12871d);
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
        int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + v().hashCode()) * 37) + 2) * 53) + A().hashCode()) * 37) + 3) * 53) + t().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12895t.d(b.class, C0194b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12872e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12872e = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new b();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b getDefaultInstanceForType() {
        return f12867f;
    }

    public String t() {
        Object obj = this.f12871d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12871d = stringUtf8;
        return stringUtf8;
    }

    public ByteString u() {
        Object obj = this.f12871d;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12871d = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String v() {
        Object obj = this.f12869b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12869b = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!x().isEmpty()) {
            h0.writeString(nVar, 1, this.f12869b);
        }
        if (!B().isEmpty()) {
            h0.writeString(nVar, 2, this.f12870c);
        }
        if (!u().isEmpty()) {
            h0.writeString(nVar, 3, this.f12871d);
        }
        this.unknownFields.writeTo(nVar);
    }

    public ByteString x() {
        Object obj = this.f12869b;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12869b = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    /* synthetic */ b(h0.b bVar, a aVar) {
        this(bVar);
    }

    private b(h0.b bVar) {
        super(bVar);
        this.f12872e = (byte) -1;
    }

    private b() {
        this.f12872e = (byte) -1;
        this.f12869b = "";
        this.f12870c = "";
        this.f12871d = "";
    }

    private b(com.explorestack.protobuf.l lVar, w wVar) {
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
                            this.f12869b = lVar.J();
                        } else if (iK == 18) {
                            this.f12870c = lVar.J();
                        } else if (iK != 26) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            this.f12871d = lVar.J();
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
