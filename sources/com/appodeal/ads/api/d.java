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
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d f12902q = new d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p1 f12903r = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f12904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f12905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f12907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f12908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f12910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Object f12911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f12912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f12913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile Object f12914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile Object f12915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f12916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f12917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte f12918p;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new d(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f12919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f12920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f12921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f12922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f12923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f12924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Object f12925h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f12926i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f12927j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f12928k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Object f12929l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Object f12930m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f12931n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f12932o;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public b A(String str) {
            str.getClass();
            this.f12930m = str;
            onChanged();
            return this;
        }

        public b B(long j10) {
            this.f12921d = j10;
            onChanged();
            return this;
        }

        public b C(String str) {
            str.getClass();
            this.f12923f = str;
            onChanged();
            return this;
        }

        public b D(long j10) {
            this.f12931n = j10;
            onChanged();
            return this;
        }

        public b E(boolean z10) {
            this.f12924g = z10;
            onChanged();
            return this;
        }

        public b F(String str) {
            str.getClass();
            this.f12922e = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        public b H(String str) {
            str.getClass();
            this.f12926i = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r2 r2Var) {
            return (b) super.setUnknownFields(r2Var);
        }

        public b J(String str) {
            str.getClass();
            this.f12920c = str;
            onChanged();
            return this;
        }

        public b K(int i10) {
            this.f12927j = i10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return c.f12876a;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public d build() {
            d dVarBuildPartial = buildPartial();
            if (dVarBuildPartial.isInitialized()) {
                return dVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12877b.d(d.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d buildPartial() {
            d dVar = new d(this, (a) null);
            dVar.f12904b = this.f12919b;
            dVar.f12905c = this.f12920c;
            dVar.f12906d = this.f12921d;
            dVar.f12907e = this.f12922e;
            dVar.f12908f = this.f12923f;
            dVar.f12909g = this.f12924g;
            dVar.f12910h = this.f12925h;
            dVar.f12911i = this.f12926i;
            dVar.f12912j = this.f12927j;
            dVar.f12913k = this.f12928k;
            dVar.f12914l = this.f12929l;
            dVar.f12915m = this.f12930m;
            dVar.f12916n = this.f12931n;
            dVar.f12917o = this.f12932o;
            onBuilt();
            return dVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f12919b = "";
            this.f12920c = "";
            this.f12921d = 0L;
            this.f12922e = "";
            this.f12923f = "";
            this.f12924g = false;
            this.f12925h = "";
            this.f12926i = "";
            this.f12927j = 0;
            this.f12928k = 0L;
            this.f12929l = "";
            this.f12930m = "";
            this.f12931n = 0L;
            this.f12932o = 0L;
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
        public d getDefaultInstanceForType() {
            return d.O();
        }

        public b q(d dVar) {
            if (dVar == d.O()) {
                return this;
            }
            if (!dVar.getBundle().isEmpty()) {
                this.f12919b = dVar.f12904b;
                onChanged();
            }
            if (!dVar.getVer().isEmpty()) {
                this.f12920c = dVar.f12905c;
                onChanged();
            }
            if (dVar.V() != 0) {
                B(dVar.V());
            }
            if (!dVar.a0().isEmpty()) {
                this.f12922e = dVar.f12907e;
                onChanged();
            }
            if (!dVar.W().isEmpty()) {
                this.f12923f = dVar.f12908f;
                onChanged();
            }
            if (dVar.Z()) {
                E(dVar.Z());
            }
            if (!dVar.L().isEmpty()) {
                this.f12925h = dVar.f12910h;
                onChanged();
            }
            if (!dVar.getSdk().isEmpty()) {
                this.f12926i = dVar.f12911i;
                onChanged();
            }
            if (dVar.c0() != 0) {
                K(dVar.c0());
            }
            if (dVar.N() != 0) {
                w(dVar.N());
            }
            if (!dVar.Q().isEmpty()) {
                this.f12929l = dVar.f12914l;
                onChanged();
            }
            if (!dVar.T().isEmpty()) {
                this.f12930m = dVar.f12915m;
                onChanged();
            }
            if (dVar.Y() != 0) {
                D(dVar.Y());
            }
            if (dVar.K() != 0) {
                u(dVar.K());
            }
            mergeUnknownFields(((h0) dVar).unknownFields);
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
        public com.appodeal.ads.api.d.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.d.access$1900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.d r3 = (com.appodeal.ads.api.d) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.appodeal.ads.api.d r4 = (com.appodeal.ads.api.d) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.d.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.d$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof d) {
                return q((d) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b u(long j10) {
            this.f12932o = j10;
            onChanged();
            return this;
        }

        public b v(String str) {
            str.getClass();
            this.f12925h = str;
            onChanged();
            return this;
        }

        public b w(long j10) {
            this.f12928k = j10;
            onChanged();
            return this;
        }

        public b x(String str) {
            str.getClass();
            this.f12919b = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b z(String str) {
            str.getClass();
            this.f12929l = str;
            onChanged();
            return this;
        }

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f12919b = "";
            this.f12920c = "";
            this.f12922e = "";
            this.f12923f = "";
            this.f12925h = "";
            this.f12926i = "";
            this.f12929l = "";
            this.f12930m = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f12919b = "";
            this.f12920c = "";
            this.f12922e = "";
            this.f12923f = "";
            this.f12925h = "";
            this.f12926i = "";
            this.f12929l = "";
            this.f12930m = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ d(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static d O() {
        return f12902q;
    }

    public static b d0() {
        return f12902q.toBuilder();
    }

    public static b e0(d dVar) {
        return f12902q.toBuilder().q(dVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12876a;
    }

    public static p1 parser() {
        return f12903r;
    }

    public long K() {
        return this.f12917o;
    }

    public String L() {
        Object obj = this.f12910h;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12910h = stringUtf8;
        return stringUtf8;
    }

    public ByteString M() {
        Object obj = this.f12910h;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12910h = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long N() {
        return this.f12913k;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public d getDefaultInstanceForType() {
        return f12902q;
    }

    public String Q() {
        Object obj = this.f12914l;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12914l = stringUtf8;
        return stringUtf8;
    }

    public ByteString S() {
        Object obj = this.f12914l;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12914l = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String T() {
        Object obj = this.f12915m;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12915m = stringUtf8;
        return stringUtf8;
    }

    public ByteString U() {
        Object obj = this.f12915m;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12915m = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long V() {
        return this.f12906d;
    }

    public String W() {
        Object obj = this.f12908f;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12908f = stringUtf8;
        return stringUtf8;
    }

    public ByteString X() {
        Object obj = this.f12908f;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12908f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long Y() {
        return this.f12916n;
    }

    public boolean Z() {
        return this.f12909g;
    }

    public String a0() {
        Object obj = this.f12907e;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12907e = stringUtf8;
        return stringUtf8;
    }

    public ByteString b0() {
        Object obj = this.f12907e;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12907e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public int c0() {
        return this.f12912j;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        return getBundle().equals(dVar.getBundle()) && getVer().equals(dVar.getVer()) && V() == dVar.V() && a0().equals(dVar.a0()) && W().equals(dVar.W()) && Z() == dVar.Z() && L().equals(dVar.L()) && getSdk().equals(dVar.getSdk()) && c0() == dVar.c0() && N() == dVar.N() && Q().equals(dVar.Q()) && T().equals(dVar.T()) && Y() == dVar.Y() && K() == dVar.K() && this.unknownFields.equals(dVar.unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return d0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    public String getBundle() {
        Object obj = this.f12904b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12904b = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBundleBytes() {
        Object obj = this.f12904b;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12904b = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12903r;
    }

    public String getSdk() {
        Object obj = this.f12911i;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12911i = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkBytes() {
        Object obj = this.f12911i;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12911i = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getBundleBytes().isEmpty() ? h0.computeStringSize(1, this.f12904b) : 0;
        if (!getVerBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(2, this.f12905c);
        }
        long j10 = this.f12906d;
        if (j10 != 0) {
            iComputeStringSize += n.z(3, j10);
        }
        if (!b0().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(4, this.f12907e);
        }
        if (!X().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(5, this.f12908f);
        }
        boolean z10 = this.f12909g;
        if (z10) {
            iComputeStringSize += n.e(6, z10);
        }
        if (!M().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(7, this.f12910h);
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(8, this.f12911i);
        }
        int i11 = this.f12912j;
        if (i11 != 0) {
            iComputeStringSize += n.x(9, i11);
        }
        long j11 = this.f12913k;
        if (j11 != 0) {
            iComputeStringSize += n.z(10, j11);
        }
        if (!S().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(11, this.f12914l);
        }
        if (!U().isEmpty()) {
            iComputeStringSize += h0.computeStringSize(12, this.f12915m);
        }
        long j12 = this.f12916n;
        if (j12 != 0) {
            iComputeStringSize += n.z(13, j12);
        }
        long j13 = this.f12917o;
        if (j13 != 0) {
            iComputeStringSize += n.z(14, j13);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public String getVer() {
        Object obj = this.f12905c;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12905c = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVerBytes() {
        Object obj = this.f12905c;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12905c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f12902q ? new b(aVar) : new b(aVar).q(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBundle().hashCode()) * 37) + 2) * 53) + getVer().hashCode()) * 37) + 3) * 53) + j0.i(V())) * 37) + 4) * 53) + a0().hashCode()) * 37) + 5) * 53) + W().hashCode()) * 37) + 6) * 53) + j0.d(Z())) * 37) + 7) * 53) + L().hashCode()) * 37) + 8) * 53) + getSdk().hashCode()) * 37) + 9) * 53) + c0()) * 37) + 10) * 53) + j0.i(N())) * 37) + 11) * 53) + Q().hashCode()) * 37) + 12) * 53) + T().hashCode()) * 37) + 13) * 53) + j0.i(Y())) * 37) + 14) * 53) + j0.i(K())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12877b.d(d.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12918p;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12918p = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new d();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getBundleBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.f12904b);
        }
        if (!getVerBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.f12905c);
        }
        long j10 = this.f12906d;
        if (j10 != 0) {
            nVar.H0(3, j10);
        }
        if (!b0().isEmpty()) {
            h0.writeString(nVar, 4, this.f12907e);
        }
        if (!X().isEmpty()) {
            h0.writeString(nVar, 5, this.f12908f);
        }
        boolean z10 = this.f12909g;
        if (z10) {
            nVar.n0(6, z10);
        }
        if (!M().isEmpty()) {
            h0.writeString(nVar, 7, this.f12910h);
        }
        if (!getSdkBytes().isEmpty()) {
            h0.writeString(nVar, 8, this.f12911i);
        }
        int i10 = this.f12912j;
        if (i10 != 0) {
            nVar.F0(9, i10);
        }
        long j11 = this.f12913k;
        if (j11 != 0) {
            nVar.H0(10, j11);
        }
        if (!S().isEmpty()) {
            h0.writeString(nVar, 11, this.f12914l);
        }
        if (!U().isEmpty()) {
            h0.writeString(nVar, 12, this.f12915m);
        }
        long j12 = this.f12916n;
        if (j12 != 0) {
            nVar.H0(13, j12);
        }
        long j13 = this.f12917o;
        if (j13 != 0) {
            nVar.H0(14, j13);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ d(h0.b bVar, a aVar) {
        this(bVar);
    }

    private d(h0.b bVar) {
        super(bVar);
        this.f12918p = (byte) -1;
    }

    private d() {
        this.f12918p = (byte) -1;
        this.f12904b = "";
        this.f12905c = "";
        this.f12907e = "";
        this.f12908f = "";
        this.f12910h = "";
        this.f12911i = "";
        this.f12914l = "";
        this.f12915m = "";
    }

    private d(com.explorestack.protobuf.l lVar, w wVar) {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 10:
                            this.f12904b = lVar.J();
                            break;
                        case 18:
                            this.f12905c = lVar.J();
                            break;
                        case 24:
                            this.f12906d = lVar.z();
                            break;
                        case 34:
                            this.f12907e = lVar.J();
                            break;
                        case 42:
                            this.f12908f = lVar.J();
                            break;
                        case 48:
                            this.f12909g = lVar.q();
                            break;
                        case 58:
                            this.f12910h = lVar.J();
                            break;
                        case 66:
                            this.f12911i = lVar.J();
                            break;
                        case 72:
                            this.f12912j = lVar.y();
                            break;
                        case 80:
                            this.f12913k = lVar.z();
                            break;
                        case 90:
                            this.f12914l = lVar.J();
                            break;
                        case 98:
                            this.f12915m = lVar.J();
                            break;
                        case 104:
                            this.f12916n = lVar.z();
                            break;
                        case 112:
                            this.f12917o = lVar.z();
                            break;
                        default:
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                z10 = true;
                            }
                            break;
                    }
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
