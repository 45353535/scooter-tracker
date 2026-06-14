package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.o0;
import com.explorestack.protobuf.p0;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.t1;
import com.explorestack.protobuf.w;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i f13009g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p1 f13010h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f13011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f13012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f13013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f13014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f13015f;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public i parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new i(lVar, wVar, null);
        }
    }

    public static final class b extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final b f13016e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final p1 f13017f = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile Object f13018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f13019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f13020d;

        class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new b(lVar, wVar, null);
            }
        }

        /* JADX INFO: renamed from: com.appodeal.ads.api.i$b$b, reason: collision with other inner class name */
        public static final class C0195b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f13021b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f13022c;

            /* synthetic */ C0195b(a aVar) {
                this();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0195b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C0195b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return com.appodeal.ads.api.c.I;
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
                return com.appodeal.ads.api.c.J.d(b.class, C0195b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b buildPartial() {
                b bVar = new b(this, (a) null);
                bVar.f13018b = this.f13021b;
                bVar.f13019c = this.f13022c;
                onBuilt();
                return bVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public C0195b clear() {
                super.clear();
                this.f13021b = "";
                this.f13022c = "";
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public C0195b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C0195b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0195b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C0195b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0195b mo4427clone() {
                return (C0195b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b getDefaultInstanceForType() {
                return b.t();
            }

            public C0195b q(b bVar) {
                if (bVar == b.t()) {
                    return this;
                }
                if (!bVar.o().isEmpty()) {
                    this.f13021b = bVar.f13018b;
                    onChanged();
                }
                if (!bVar.r().isEmpty()) {
                    this.f13022c = bVar.f13019c;
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
            public com.appodeal.ads.api.i.b.C0195b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.i.b.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.appodeal.ads.api.i$b r3 = (com.appodeal.ads.api.i.b) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.appodeal.ads.api.i$b r4 = (com.appodeal.ads.api.i.b) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.i.b.C0195b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.i$b$b");
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public C0195b mergeFrom(Message message) {
                if (message instanceof b) {
                    return q((b) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C0195b mergeUnknownFields(r2 r2Var) {
                return (C0195b) super.mergeUnknownFields(r2Var);
            }

            public C0195b u(String str) {
                str.getClass();
                this.f13021b = str;
                onChanged();
                return this;
            }

            public C0195b v(String str) {
                str.getClass();
                this.f13022c = str;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public C0195b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C0195b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public C0195b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C0195b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final C0195b setUnknownFields(r2 r2Var) {
                return (C0195b) super.setUnknownFields(r2Var);
            }

            /* synthetic */ C0195b(h0.c cVar, a aVar) {
                this(cVar);
            }

            private C0195b() {
                this.f13021b = "";
                this.f13022c = "";
                maybeForceBuilderInitialization();
            }

            private C0195b(h0.c cVar) {
                super(cVar);
                this.f13021b = "";
                this.f13022c = "";
                maybeForceBuilderInitialization();
            }
        }

        /* synthetic */ b(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
            this(lVar, wVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return com.appodeal.ads.api.c.I;
        }

        public static p1 parser() {
            return f13017f;
        }

        public static b t() {
            return f13016e;
        }

        public static C0195b v() {
            return f13016e.toBuilder();
        }

        public static C0195b x(b bVar) {
            return f13016e.toBuilder().q(bVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C0195b newBuilderForType() {
            return v();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public C0195b newBuilderForType(h0.c cVar) {
            return new C0195b(cVar, null);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0195b toBuilder() {
            a aVar = null;
            return this == f13016e ? new C0195b(aVar) : new C0195b(aVar).q(this);
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
            return o().equals(bVar.o()) && r().equals(bVar.r()) && this.unknownFields.equals(bVar.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f13017f;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !q().isEmpty() ? h0.computeStringSize(1, this.f13018b) : 0;
            if (!s().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.f13019c);
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + o().hashCode()) * 37) + 2) * 53) + r().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return com.appodeal.ads.api.c.J.d(b.class, C0195b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f13020d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f13020d = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new b();
        }

        public String o() {
            Object obj = this.f13018b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f13018b = stringUtf8;
            return stringUtf8;
        }

        public ByteString q() {
            Object obj = this.f13018b;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f13018b = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String r() {
            Object obj = this.f13019c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f13019c = stringUtf8;
            return stringUtf8;
        }

        public ByteString s() {
            Object obj = this.f13019c;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f13019c = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b getDefaultInstanceForType() {
            return f13016e;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!q().isEmpty()) {
                h0.writeString(nVar, 1, this.f13018b);
            }
            if (!s().isEmpty()) {
                h0.writeString(nVar, 2, this.f13019c);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* synthetic */ b(h0.b bVar, a aVar) {
            this(bVar);
        }

        private b(h0.b bVar) {
            super(bVar);
            this.f13020d = (byte) -1;
        }

        private b() {
            this.f13020d = (byte) -1;
            this.f13018b = "";
            this.f13019c = "";
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
                                this.f13018b = lVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.f13019c = lVar.J();
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

    public static final class c extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f13023e = new c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final p1 f13024f = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile Object f13025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f13026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f13027d;

        class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new c(lVar, wVar, null);
            }
        }

        public static final class b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f13028b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f13029c;

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
                return com.appodeal.ads.api.c.G;
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
                return com.appodeal.ads.api.c.H.d(c.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c buildPartial() {
                c cVar = new c(this, (a) null);
                cVar.f13025b = this.f13028b;
                cVar.f13026c = this.f13029c;
                onBuilt();
                return cVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f13028b = "";
                this.f13029c = "";
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

            public b q(c cVar) {
                if (cVar == c.t()) {
                    return this;
                }
                if (!cVar.o().isEmpty()) {
                    this.f13028b = cVar.f13025b;
                    onChanged();
                }
                if (!cVar.r().isEmpty()) {
                    this.f13029c = cVar.f13026c;
                    onChanged();
                }
                mergeUnknownFields(((h0) cVar).unknownFields);
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
            public com.appodeal.ads.api.i.c.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.i.c.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.appodeal.ads.api.i$c r3 = (com.appodeal.ads.api.i.c) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.appodeal.ads.api.i$c r4 = (com.appodeal.ads.api.i.c) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.i.c.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.i$c$b");
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof c) {
                    return q((c) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b u(String str) {
                str.getClass();
                this.f13028b = str;
                onChanged();
                return this;
            }

            public b v(String str) {
                str.getClass();
                this.f13029c = str;
                onChanged();
                return this;
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

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            /* synthetic */ b(h0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f13028b = "";
                this.f13029c = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f13028b = "";
                this.f13029c = "";
                maybeForceBuilderInitialization();
            }
        }

        /* synthetic */ c(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
            this(lVar, wVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return com.appodeal.ads.api.c.G;
        }

        public static p1 parser() {
            return f13024f;
        }

        public static c t() {
            return f13023e;
        }

        public static b v() {
            return f13023e.toBuilder();
        }

        public static b x(c cVar) {
            return f13023e.toBuilder().q(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return v();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar, null);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            a aVar = null;
            return this == f13023e ? new b(aVar) : new b(aVar).q(this);
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
            return o().equals(cVar.o()) && r().equals(cVar.r()) && this.unknownFields.equals(cVar.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f13024f;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !q().isEmpty() ? h0.computeStringSize(1, this.f13025b) : 0;
            if (!s().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.f13026c);
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + o().hashCode()) * 37) + 2) * 53) + r().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return com.appodeal.ads.api.c.H.d(c.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f13027d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f13027d = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new c();
        }

        public String o() {
            Object obj = this.f13025b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f13025b = stringUtf8;
            return stringUtf8;
        }

        public ByteString q() {
            Object obj = this.f13025b;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f13025b = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String r() {
            Object obj = this.f13026c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f13026c = stringUtf8;
            return stringUtf8;
        }

        public ByteString s() {
            Object obj = this.f13026c;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f13026c = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public c getDefaultInstanceForType() {
            return f13023e;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!q().isEmpty()) {
                h0.writeString(nVar, 1, this.f13025b);
            }
            if (!s().isEmpty()) {
                h0.writeString(nVar, 2, this.f13026c);
            }
            this.unknownFields.writeTo(nVar);
        }

        /* synthetic */ c(h0.b bVar, a aVar) {
            this(bVar);
        }

        private c(h0.b bVar) {
            super(bVar);
            this.f13027d = (byte) -1;
        }

        private c() {
            this.f13027d = (byte) -1;
            this.f13025b = "";
            this.f13026c = "";
        }

        private c(com.explorestack.protobuf.l lVar, w wVar) {
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
                                this.f13025b = lVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.f13026c = lVar.J();
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

    public static final class d extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f13030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a2 f13031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f13032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a2 f13033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private e f13034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a2 f13035g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f f13036h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private a2 f13037i;

        /* synthetic */ d(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public d A(e.b bVar) {
            a2 a2Var = this.f13035g;
            if (a2Var != null) {
                a2Var.i(bVar.build());
                return this;
            }
            this.f13034f = bVar.build();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (d) super.setField(fieldDescriptor, obj);
        }

        public d C(f.b bVar) {
            a2 a2Var = this.f13037i;
            if (a2Var != null) {
                a2Var.i(bVar.build());
                return this;
            }
            this.f13036h = bVar.build();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public d setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (d) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final d setUnknownFields(r2 r2Var) {
            return (d) super.setUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (d) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return com.appodeal.ads.api.c.E;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public i build() {
            i iVarBuildPartial = buildPartial();
            if (iVarBuildPartial.isInitialized()) {
                return iVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) iVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return com.appodeal.ads.api.c.F.d(i.class, d.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public i buildPartial() {
            i iVar = new i(this, (a) null);
            a2 a2Var = this.f13031c;
            if (a2Var == null) {
                iVar.f13011b = this.f13030b;
            } else {
                iVar.f13011b = (c) a2Var.a();
            }
            a2 a2Var2 = this.f13033e;
            if (a2Var2 == null) {
                iVar.f13012c = this.f13032d;
            } else {
                iVar.f13012c = (b) a2Var2.a();
            }
            a2 a2Var3 = this.f13035g;
            if (a2Var3 == null) {
                iVar.f13013d = this.f13034f;
            } else {
                iVar.f13013d = (e) a2Var3.a();
            }
            a2 a2Var4 = this.f13037i;
            if (a2Var4 == null) {
                iVar.f13014e = this.f13036h;
            } else {
                iVar.f13014e = (f) a2Var4.a();
            }
            onBuilt();
            return iVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public d clear() {
            super.clear();
            if (this.f13031c == null) {
                this.f13030b = null;
            } else {
                this.f13030b = null;
                this.f13031c = null;
            }
            if (this.f13033e == null) {
                this.f13032d = null;
            } else {
                this.f13032d = null;
                this.f13033e = null;
            }
            if (this.f13035g == null) {
                this.f13034f = null;
            } else {
                this.f13034f = null;
                this.f13035g = null;
            }
            if (this.f13037i == null) {
                this.f13036h = null;
                return this;
            }
            this.f13036h = null;
            this.f13037i = null;
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public d clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (d) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public d clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (d) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public d mo4427clone() {
            return (d) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public i getDefaultInstanceForType() {
            return i.s();
        }

        public d q(b bVar) {
            a2 a2Var = this.f13033e;
            if (a2Var != null) {
                a2Var.g(bVar);
                return this;
            }
            b bVar2 = this.f13032d;
            if (bVar2 != null) {
                this.f13032d = b.x(bVar2).q(bVar).buildPartial();
            } else {
                this.f13032d = bVar;
            }
            onChanged();
            return this;
        }

        public d r(c cVar) {
            a2 a2Var = this.f13031c;
            if (a2Var != null) {
                a2Var.g(cVar);
                return this;
            }
            c cVar2 = this.f13030b;
            if (cVar2 != null) {
                this.f13030b = c.x(cVar2).q(cVar).buildPartial();
            } else {
                this.f13030b = cVar;
            }
            onChanged();
            return this;
        }

        public d s(e eVar) {
            a2 a2Var = this.f13035g;
            if (a2Var != null) {
                a2Var.g(eVar);
                return this;
            }
            e eVar2 = this.f13034f;
            if (eVar2 != null) {
                this.f13034f = e.v(eVar2).q(eVar).buildPartial();
            } else {
                this.f13034f = eVar;
            }
            onChanged();
            return this;
        }

        public d t(f fVar) {
            a2 a2Var = this.f13037i;
            if (a2Var != null) {
                a2Var.g(fVar);
                return this;
            }
            f fVar2 = this.f13036h;
            if (fVar2 != null) {
                this.f13036h = f.A(fVar2).r(fVar).buildPartial();
            } else {
                this.f13036h = fVar;
            }
            onChanged();
            return this;
        }

        public d u(i iVar) {
            if (iVar == i.s()) {
                return this;
            }
            if (iVar.A()) {
                r(iVar.r());
            }
            if (iVar.x()) {
                q(iVar.q());
            }
            if (iVar.B()) {
                s(iVar.u());
            }
            if (iVar.C()) {
                t(iVar.v());
            }
            mergeUnknownFields(((h0) iVar).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.appodeal.ads.api.i.d mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.i.o()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.i r3 = (com.appodeal.ads.api.i) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.u(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.appodeal.ads.api.i r4 = (com.appodeal.ads.api.i) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.u(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.i.d.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.i$d");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public d mergeFrom(Message message) {
            if (message instanceof i) {
                return u((i) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public final d mergeUnknownFields(r2 r2Var) {
            return (d) super.mergeUnknownFields(r2Var);
        }

        public d y(b.C0195b c0195b) {
            a2 a2Var = this.f13033e;
            if (a2Var != null) {
                a2Var.i(c0195b.build());
                return this;
            }
            this.f13032d = c0195b.build();
            onChanged();
            return this;
        }

        public d z(c.b bVar) {
            a2 a2Var = this.f13031c;
            if (a2Var != null) {
                a2Var.i(bVar.build());
                return this;
            }
            this.f13030b = bVar.build();
            onChanged();
            return this;
        }

        /* synthetic */ d(h0.c cVar, a aVar) {
            this(cVar);
        }

        private d() {
            maybeForceBuilderInitialization();
        }

        private d(h0.c cVar) {
            super(cVar);
            maybeForceBuilderInitialization();
        }
    }

    public static final class e extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final e f13038e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final p1 f13039f = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile Object f13040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f13041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f13042d;

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
            private Object f13043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f13044c;

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
                return com.appodeal.ads.api.c.K;
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
                return com.appodeal.ads.api.c.L.d(e.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e buildPartial() {
                e eVar = new e(this, (a) null);
                eVar.f13040b = this.f13043b;
                eVar.f13041c = this.f13044c;
                onBuilt();
                return eVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f13043b = "";
                this.f13044c = "";
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
            public e getDefaultInstanceForType() {
                return e.s();
            }

            public b q(e eVar) {
                if (eVar == e.s()) {
                    return this;
                }
                if (!eVar.getUserId().isEmpty()) {
                    this.f13043b = eVar.f13040b;
                    onChanged();
                }
                if (!eVar.q().isEmpty()) {
                    this.f13044c = eVar.f13041c;
                    onChanged();
                }
                mergeUnknownFields(((h0) eVar).unknownFields);
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
            public com.appodeal.ads.api.i.e.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.i.e.o()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.appodeal.ads.api.i$e r3 = (com.appodeal.ads.api.i.e) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.appodeal.ads.api.i$e r4 = (com.appodeal.ads.api.i.e) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.i.e.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.i$e$b");
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof e) {
                    return q((e) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(r2 r2Var) {
                return (b) super.mergeUnknownFields(r2Var);
            }

            public b u(String str) {
                str.getClass();
                this.f13044c = str;
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

            public b y(String str) {
                str.getClass();
                this.f13043b = str;
                onChanged();
                return this;
            }

            /* synthetic */ b(h0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f13043b = "";
                this.f13044c = "";
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f13043b = "";
                this.f13044c = "";
                maybeForceBuilderInitialization();
            }
        }

        /* synthetic */ e(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
            this(lVar, wVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return com.appodeal.ads.api.c.K;
        }

        public static p1 parser() {
            return f13039f;
        }

        public static e s() {
            return f13038e;
        }

        public static b u() {
            return f13038e.toBuilder();
        }

        public static b v(e eVar) {
            return f13038e.toBuilder().q(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar, null);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            a aVar = null;
            return this == f13038e ? new b(aVar) : new b(aVar).q(this);
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
            return getUserId().equals(eVar.getUserId()) && q().equals(eVar.q()) && this.unknownFields.equals(eVar.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f13039f;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getUserIdBytes().isEmpty() ? h0.computeStringSize(1, this.f13040b) : 0;
            if (!r().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.f13041c);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public String getUserId() {
            Object obj = this.f13040b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f13040b = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUserIdBytes() {
            Object obj = this.f13040b;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f13040b = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + q().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return com.appodeal.ads.api.c.L.d(e.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f13042d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f13042d = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new e();
        }

        public String q() {
            Object obj = this.f13041c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f13041c = stringUtf8;
            return stringUtf8;
        }

        public ByteString r() {
            Object obj = this.f13041c;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f13041c = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public e getDefaultInstanceForType() {
            return f13038e;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getUserIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.f13040b);
            }
            if (!r().isEmpty()) {
                h0.writeString(nVar, 2, this.f13041c);
            }
            this.unknownFields.writeTo(nVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return u();
        }

        /* synthetic */ e(h0.b bVar, a aVar) {
            this(bVar);
        }

        private e(h0.b bVar) {
            super(bVar);
            this.f13042d = (byte) -1;
        }

        private e() {
            this.f13042d = (byte) -1;
            this.f13040b = "";
            this.f13041c = "";
        }

        private e(com.explorestack.protobuf.l lVar, w wVar) {
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
                                this.f13040b = lVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.f13041c = lVar.J();
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

    public static final class f extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final f f13045e = new f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final p1 f13046f = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile Object f13047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p0 f13048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f13049d;

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
            private int f13050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f13051c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private p0 f13052d;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            private void p() {
                if ((this.f13050b & 1) == 0) {
                    this.f13052d = new o0(this.f13052d);
                    this.f13050b |= 1;
                }
            }

            public b g(Iterable iterable) {
                p();
                a.AbstractC0320a.addAll(iterable, (List) this.f13052d);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return com.appodeal.ads.api.c.M;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
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
                return com.appodeal.ads.api.c.N.d(f.class, b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public f buildPartial() {
                f fVar = new f(this, (a) null);
                fVar.f13047b = this.f13051c;
                if ((this.f13050b & 1) != 0) {
                    this.f13052d = this.f13052d.getUnmodifiableView();
                    this.f13050b &= -2;
                }
                fVar.f13048c = this.f13052d;
                onBuilt();
                return fVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f13051c = "";
                this.f13052d = o0.f19269e;
                this.f13050b &= -2;
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
                return f.s();
            }

            public b r(f fVar) {
                if (fVar == f.s()) {
                    return this;
                }
                if (!fVar.q().isEmpty()) {
                    this.f13051c = fVar.f13047b;
                    onChanged();
                }
                if (!fVar.f13048c.isEmpty()) {
                    if (this.f13052d.isEmpty()) {
                        this.f13052d = fVar.f13048c;
                        this.f13050b &= -2;
                    } else {
                        p();
                        this.f13052d.addAll(fVar.f13048c);
                    }
                    onChanged();
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
            public com.appodeal.ads.api.i.f.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.i.f.o()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.appodeal.ads.api.i$f r3 = (com.appodeal.ads.api.i.f) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.appodeal.ads.api.i$f r4 = (com.appodeal.ads.api.i.f) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.i.f.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.i$f$b");
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

            public b v(String str) {
                str.getClass();
                this.f13051c = str;
                onChanged();
                return this;
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

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(r2 r2Var) {
                return (b) super.setUnknownFields(r2Var);
            }

            /* synthetic */ b(h0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f13051c = "";
                this.f13052d = o0.f19269e;
                maybeForceBuilderInitialization();
            }

            private b(h0.c cVar) {
                super(cVar);
                this.f13051c = "";
                this.f13052d = o0.f19269e;
                maybeForceBuilderInitialization();
            }
        }

        /* synthetic */ f(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
            this(lVar, wVar);
        }

        public static b A(f fVar) {
            return f13045e.toBuilder().r(fVar);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return com.appodeal.ads.api.c.M;
        }

        public static p1 parser() {
            return f13046f;
        }

        public static f s() {
            return f13045e;
        }

        public static b x() {
            return f13045e.toBuilder();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return x();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(h0.c cVar) {
            return new b(cVar, null);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            a aVar = null;
            return this == f13045e ? new b(aVar) : new b(aVar).r(this);
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
            return q().equals(fVar.q()) && v().equals(fVar.v()) && this.unknownFields.equals(fVar.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f13046f;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !r().isEmpty() ? h0.computeStringSize(1, this.f13047b) : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.f13048c.size(); i11++) {
                iComputeStringSizeNoTag += h0.computeStringSizeNoTag(this.f13048c.getRaw(i11));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + v().size() + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + q().hashCode();
            if (u() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + v().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return com.appodeal.ads.api.c.N.d(f.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f13049d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f13049d = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new f();
        }

        public String q() {
            Object obj = this.f13047b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f13047b = stringUtf8;
            return stringUtf8;
        }

        public ByteString r() {
            Object obj = this.f13047b;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f13047b = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public f getDefaultInstanceForType() {
            return f13045e;
        }

        public int u() {
            return this.f13048c.size();
        }

        public t1 v() {
            return this.f13048c;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!r().isEmpty()) {
                h0.writeString(nVar, 1, this.f13047b);
            }
            for (int i10 = 0; i10 < this.f13048c.size(); i10++) {
                h0.writeString(nVar, 2, this.f13048c.getRaw(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        /* synthetic */ f(h0.b bVar, a aVar) {
            this(bVar);
        }

        private f(h0.b bVar) {
            super(bVar);
            this.f13049d = (byte) -1;
        }

        private f() {
            this.f13049d = (byte) -1;
            this.f13047b = "";
            this.f13048c = o0.f19269e;
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
                                this.f13047b = lVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                String strJ = lVar.J();
                                if (!z11) {
                                    this.f13048c = new o0();
                                    z11 = true;
                                }
                                this.f13048c.add(strJ);
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
                        this.f13048c = this.f13048c.getUnmodifiableView();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.f13048c = this.f13048c.getUnmodifiableView();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    /* synthetic */ i(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static d D() {
        return f13009g.toBuilder();
    }

    public static d E(i iVar) {
        return f13009g.toBuilder().u(iVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return com.appodeal.ads.api.c.E;
    }

    public static p1 parser() {
        return f13010h;
    }

    public static i s() {
        return f13009g;
    }

    public boolean A() {
        return this.f13011b != null;
    }

    public boolean B() {
        return this.f13013d != null;
    }

    public boolean C() {
        return this.f13014e != null;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public d newBuilderForType() {
        return D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public d newBuilderForType(h0.c cVar) {
        return new d(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public d toBuilder() {
        a aVar = null;
        return this == f13009g ? new d(aVar) : new d(aVar).u(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return super.equals(obj);
        }
        i iVar = (i) obj;
        if (A() != iVar.A()) {
            return false;
        }
        if ((A() && !r().equals(iVar.r())) || x() != iVar.x()) {
            return false;
        }
        if ((x() && !q().equals(iVar.q())) || B() != iVar.B()) {
            return false;
        }
        if ((!B() || u().equals(iVar.u())) && C() == iVar.C()) {
            return (!C() || v().equals(iVar.v())) && this.unknownFields.equals(iVar.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f13010h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.f13011b != null ? n.G(1, r()) : 0;
        if (this.f13012c != null) {
            iG += n.G(2, q());
        }
        if (this.f13013d != null) {
            iG += n.G(3, u());
        }
        if (this.f13014e != null) {
            iG += n.G(4, v());
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
        if (A()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + r().hashCode();
        }
        if (x()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + q().hashCode();
        }
        if (B()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + u().hashCode();
        }
        if (C()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + v().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return com.appodeal.ads.api.c.F.d(i.class, d.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f13015f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f13015f = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new i();
    }

    public b q() {
        b bVar = this.f13012c;
        return bVar == null ? b.t() : bVar;
    }

    public c r() {
        c cVar = this.f13011b;
        return cVar == null ? c.t() : cVar;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public i getDefaultInstanceForType() {
        return f13009g;
    }

    public e u() {
        e eVar = this.f13013d;
        return eVar == null ? e.s() : eVar;
    }

    public f v() {
        f fVar = this.f13014e;
        return fVar == null ? f.s() : fVar;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) {
        if (this.f13011b != null) {
            nVar.J0(1, r());
        }
        if (this.f13012c != null) {
            nVar.J0(2, q());
        }
        if (this.f13013d != null) {
            nVar.J0(3, u());
        }
        if (this.f13014e != null) {
            nVar.J0(4, v());
        }
        this.unknownFields.writeTo(nVar);
    }

    public boolean x() {
        return this.f13012c != null;
    }

    /* synthetic */ i(h0.b bVar, a aVar) {
        this(bVar);
    }

    private i(h0.b bVar) {
        super(bVar);
        this.f13015f = (byte) -1;
    }

    private i() {
        this.f13015f = (byte) -1;
    }

    private i(com.explorestack.protobuf.l lVar, w wVar) {
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
                            c cVar = this.f13011b;
                            c.b builder = cVar != null ? cVar.toBuilder() : null;
                            c cVar2 = (c) lVar.A(c.parser(), wVar);
                            this.f13011b = cVar2;
                            if (builder != null) {
                                builder.q(cVar2);
                                this.f13011b = builder.buildPartial();
                            }
                        } else if (iK == 18) {
                            b bVar = this.f13012c;
                            b.C0195b builder2 = bVar != null ? bVar.toBuilder() : null;
                            b bVar2 = (b) lVar.A(b.parser(), wVar);
                            this.f13012c = bVar2;
                            if (builder2 != null) {
                                builder2.q(bVar2);
                                this.f13012c = builder2.buildPartial();
                            }
                        } else if (iK == 26) {
                            e eVar = this.f13013d;
                            e.b builder3 = eVar != null ? eVar.toBuilder() : null;
                            e eVar2 = (e) lVar.A(e.parser(), wVar);
                            this.f13013d = eVar2;
                            if (builder3 != null) {
                                builder3.q(eVar2);
                                this.f13013d = builder3.buildPartial();
                            }
                        } else if (iK != 34) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            f fVar = this.f13014e;
                            f.b builder4 = fVar != null ? fVar.toBuilder() : null;
                            f fVar2 = (f) lVar.A(f.parser(), wVar);
                            this.f13014e = fVar2;
                            if (builder4 != null) {
                                builder4.r(fVar2);
                                this.f13014e = builder4.buildPartial();
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
