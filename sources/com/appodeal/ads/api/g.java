package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f12961d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p1 f12962e = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f12964c;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new g(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12965b;

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
            return c.f12882g;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public g build() {
            g gVarBuildPartial = buildPartial();
            if (gVarBuildPartial.isInitialized()) {
                return gVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) gVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12883h.d(g.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g buildPartial() {
            g gVar = new g(this, (a) null);
            gVar.f12963b = this.f12965b;
            onBuilt();
            return gVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f12965b = false;
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
        public g getDefaultInstanceForType() {
            return g.l();
        }

        public b q(g gVar) {
            if (gVar == g.l()) {
                return this;
            }
            if (gVar.getCoppa()) {
                u(gVar.getCoppa());
            }
            mergeUnknownFields(((h0) gVar).unknownFields);
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
        public com.appodeal.ads.api.g.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.g.access$600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.g r3 = (com.appodeal.ads.api.g) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.appodeal.ads.api.g r4 = (com.appodeal.ads.api.g) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.g.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.g$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof g) {
                return q((g) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b u(boolean z10) {
            this.f12965b = z10;
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

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ g(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12882g;
    }

    public static g l() {
        return f12961d;
    }

    public static b n() {
        return f12961d.toBuilder();
    }

    public static b o(g gVar) {
        return f12961d.toBuilder().q(gVar);
    }

    public static p1 parser() {
        return f12962e;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        return getCoppa() == gVar.getCoppa() && this.unknownFields.equals(gVar.unknownFields);
    }

    public boolean getCoppa() {
        return this.f12963b;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12962e;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.f12963b;
        int iE = (z10 ? n.e(1, z10) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = iE;
        return iE;
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
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getCoppa())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12883h.d(g.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12964c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12964c = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g getDefaultInstanceForType() {
        return f12961d;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new g();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f12961d ? new b(aVar) : new b(aVar).q(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) {
        boolean z10 = this.f12963b;
        if (z10) {
            nVar.n0(1, z10);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ g(h0.b bVar, a aVar) {
        this(bVar);
    }

    private g(h0.b bVar) {
        super(bVar);
        this.f12964c = (byte) -1;
    }

    private g() {
        this.f12964c = (byte) -1;
    }

    private g(com.explorestack.protobuf.l lVar, w wVar) {
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
                            if (iK != 8) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.f12963b = lVar.q();
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
}
