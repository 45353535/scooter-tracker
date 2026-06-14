package com.appodeal.ads.api;

import com.appodeal.ads.api.a;
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
public final class j extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final j f13053p = new j();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final p1 f13054q = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f13056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Object f13057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f13058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f13059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f13060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.appodeal.ads.api.a f13062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f13063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f13064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f13066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f13067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f13068o;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new j(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f13070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f13071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f13072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f13073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f13074g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f13075h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private com.appodeal.ads.api.a f13076i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private a2 f13077j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f13078k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f13079l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f13080m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f13081n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f13082o;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public b A(long j10) {
            this.f13082o = j10;
            onChanged();
            return this;
        }

        public b B(long j10) {
            this.f13078k = j10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        public b D(int i10) {
            this.f13075h = i10;
            onChanged();
            return this;
        }

        public b E(long j10) {
            this.f13072e = j10;
            onChanged();
            return this;
        }

        public b F(long j10) {
            this.f13074g = j10;
            onChanged();
            return this;
        }

        public b G(String str) {
            str.getClass();
            this.f13073f = str;
            onChanged();
            return this;
        }

        public b H(boolean z10) {
            this.f13069b = z10;
            onChanged();
            return this;
        }

        public b I(String str) {
            str.getClass();
            this.f13071d = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
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
            return c.f12888m;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public j build() {
            j jVarBuildPartial = buildPartial();
            if (jVarBuildPartial.isInitialized()) {
                return jVarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) jVarBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12889n.d(j.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public j buildPartial() {
            j jVar = new j(this, (a) null);
            jVar.f13055b = this.f13069b;
            jVar.f13056c = this.f13070c;
            jVar.f13057d = this.f13071d;
            jVar.f13058e = this.f13072e;
            jVar.f13059f = this.f13073f;
            jVar.f13060g = this.f13074g;
            jVar.f13061h = this.f13075h;
            a2 a2Var = this.f13077j;
            if (a2Var == null) {
                jVar.f13062i = this.f13076i;
            } else {
                jVar.f13062i = (com.appodeal.ads.api.a) a2Var.a();
            }
            jVar.f13063j = this.f13078k;
            jVar.f13064k = this.f13079l;
            jVar.f13065l = this.f13080m;
            jVar.f13066m = this.f13081n;
            jVar.f13067n = this.f13082o;
            onBuilt();
            return jVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f13069b = false;
            this.f13070c = "";
            this.f13071d = "";
            this.f13072e = 0L;
            this.f13073f = "";
            this.f13074g = 0L;
            this.f13075h = 0;
            if (this.f13077j == null) {
                this.f13076i = null;
            } else {
                this.f13076i = null;
                this.f13077j = null;
            }
            this.f13078k = 0L;
            this.f13079l = 0L;
            this.f13080m = 0;
            this.f13081n = 0L;
            this.f13082o = 0L;
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
        public j getDefaultInstanceForType() {
            return j.I();
        }

        public b q(com.appodeal.ads.api.a aVar) {
            a2 a2Var = this.f13077j;
            if (a2Var != null) {
                a2Var.g(aVar);
                return this;
            }
            com.appodeal.ads.api.a aVar2 = this.f13076i;
            if (aVar2 != null) {
                this.f13076i = com.appodeal.ads.api.a.a0(aVar2).q(aVar).buildPartial();
            } else {
                this.f13076i = aVar;
            }
            onChanged();
            return this;
        }

        public b r(j jVar) {
            if (jVar == j.I()) {
                return this;
            }
            if (jVar.getTest()) {
                H(jVar.getTest());
            }
            if (!jVar.K().isEmpty()) {
                this.f13070c = jVar.f13056c;
                onChanged();
            }
            if (!jVar.U().isEmpty()) {
                this.f13071d = jVar.f13057d;
                onChanged();
            }
            if (jVar.P() != 0) {
                E(jVar.P());
            }
            if (!jVar.S().isEmpty()) {
                this.f13073f = jVar.f13059f;
                onChanged();
            }
            if (jVar.Q() != 0) {
                F(jVar.Q());
            }
            if (jVar.O() != 0) {
                D(jVar.O());
            }
            if (jVar.W()) {
                q(jVar.G());
            }
            if (jVar.N() != 0) {
                B(jVar.N());
            }
            if (jVar.F() != 0) {
                w(jVar.F());
            }
            if (jVar.E() != 0) {
                v(jVar.E());
            }
            if (jVar.H() != 0) {
                x(jVar.H());
            }
            if (jVar.M() != 0) {
                A(jVar.M());
            }
            mergeUnknownFields(((h0) jVar).unknownFields);
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
        public com.appodeal.ads.api.j.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.j.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.j r3 = (com.appodeal.ads.api.j) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.appodeal.ads.api.j r4 = (com.appodeal.ads.api.j) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.j.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.j$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof j) {
                return r((j) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b v(int i10) {
            this.f13080m = i10;
            onChanged();
            return this;
        }

        public b w(long j10) {
            this.f13079l = j10;
            onChanged();
            return this;
        }

        public b x(long j10) {
            this.f13081n = j10;
            onChanged();
            return this;
        }

        public b y(String str) {
            str.getClass();
            this.f13070c = str;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f13070c = "";
            this.f13071d = "";
            this.f13073f = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f13070c = "";
            this.f13071d = "";
            this.f13073f = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ j(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static j I() {
        return f13053p;
    }

    public static b X() {
        return f13053p.toBuilder();
    }

    public static b Y(j jVar) {
        return f13053p.toBuilder().r(jVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12888m;
    }

    public static p1 parser() {
        return f13054q;
    }

    public int E() {
        return this.f13065l;
    }

    public long F() {
        return this.f13064k;
    }

    public com.appodeal.ads.api.a G() {
        com.appodeal.ads.api.a aVar = this.f13062i;
        return aVar == null ? com.appodeal.ads.api.a.M() : aVar;
    }

    public long H() {
        return this.f13066m;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public j getDefaultInstanceForType() {
        return f13053p;
    }

    public String K() {
        Object obj = this.f13056c;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f13056c = stringUtf8;
        return stringUtf8;
    }

    public ByteString L() {
        Object obj = this.f13056c;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f13056c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public long M() {
        return this.f13067n;
    }

    public long N() {
        return this.f13063j;
    }

    public int O() {
        return this.f13061h;
    }

    public long P() {
        return this.f13058e;
    }

    public long Q() {
        return this.f13060g;
    }

    public String S() {
        Object obj = this.f13059f;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f13059f = stringUtf8;
        return stringUtf8;
    }

    public ByteString T() {
        Object obj = this.f13059f;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f13059f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String U() {
        Object obj = this.f13057d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f13057d = stringUtf8;
        return stringUtf8;
    }

    public ByteString V() {
        Object obj = this.f13057d;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f13057d = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public boolean W() {
        return this.f13062i != null;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return X();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f13053p ? new b(aVar) : new b(aVar).r(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (getTest() == jVar.getTest() && K().equals(jVar.K()) && U().equals(jVar.U()) && P() == jVar.P() && S().equals(jVar.S()) && Q() == jVar.Q() && O() == jVar.O() && W() == jVar.W()) {
            return (!W() || G().equals(jVar.G())) && N() == jVar.N() && F() == jVar.F() && E() == jVar.E() && H() == jVar.H() && M() == jVar.M() && this.unknownFields.equals(jVar.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f13054q;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.f13055b;
        int iE = z10 ? n.e(1, z10) : 0;
        if (!L().isEmpty()) {
            iE += h0.computeStringSize(2, this.f13056c);
        }
        if (!V().isEmpty()) {
            iE += h0.computeStringSize(3, this.f13057d);
        }
        long j10 = this.f13058e;
        if (j10 != 0) {
            iE += n.z(4, j10);
        }
        if (!T().isEmpty()) {
            iE += h0.computeStringSize(5, this.f13059f);
        }
        long j11 = this.f13060g;
        if (j11 != 0) {
            iE += n.z(6, j11);
        }
        int i11 = this.f13061h;
        if (i11 != 0) {
            iE += n.x(7, i11);
        }
        if (this.f13062i != null) {
            iE += n.G(8, G());
        }
        long j12 = this.f13063j;
        if (j12 != 0) {
            iE += n.z(9, j12);
        }
        long j13 = this.f13064k;
        if (j13 != 0) {
            iE += n.z(10, j13);
        }
        int i12 = this.f13065l;
        if (i12 != 0) {
            iE += n.x(11, i12);
        }
        long j14 = this.f13066m;
        if (j14 != 0) {
            iE += n.z(12, j14);
        }
        long j15 = this.f13067n;
        if (j15 != 0) {
            iE += n.z(13, j15);
        }
        int serializedSize = iE + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean getTest() {
        return this.f13055b;
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
        int iHashCode = ((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getTest())) * 37) + 2) * 53) + K().hashCode()) * 37) + 3) * 53) + U().hashCode()) * 37) + 4) * 53) + j0.i(P())) * 37) + 5) * 53) + S().hashCode()) * 37) + 6) * 53) + j0.i(Q())) * 37) + 7) * 53) + O();
        if (W()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + G().hashCode();
        }
        int i11 = (((((((((((((((((((((iHashCode * 37) + 9) * 53) + j0.i(N())) * 37) + 10) * 53) + j0.i(F())) * 37) + 11) * 53) + E()) * 37) + 12) * 53) + j0.i(H())) * 37) + 13) * 53) + j0.i(M())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12889n.d(j.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f13068o;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f13068o = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new j();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        boolean z10 = this.f13055b;
        if (z10) {
            nVar.n0(1, z10);
        }
        if (!L().isEmpty()) {
            h0.writeString(nVar, 2, this.f13056c);
        }
        if (!V().isEmpty()) {
            h0.writeString(nVar, 3, this.f13057d);
        }
        long j10 = this.f13058e;
        if (j10 != 0) {
            nVar.H0(4, j10);
        }
        if (!T().isEmpty()) {
            h0.writeString(nVar, 5, this.f13059f);
        }
        long j11 = this.f13060g;
        if (j11 != 0) {
            nVar.H0(6, j11);
        }
        int i10 = this.f13061h;
        if (i10 != 0) {
            nVar.F0(7, i10);
        }
        if (this.f13062i != null) {
            nVar.J0(8, G());
        }
        long j12 = this.f13063j;
        if (j12 != 0) {
            nVar.H0(9, j12);
        }
        long j13 = this.f13064k;
        if (j13 != 0) {
            nVar.H0(10, j13);
        }
        int i11 = this.f13065l;
        if (i11 != 0) {
            nVar.F0(11, i11);
        }
        long j14 = this.f13066m;
        if (j14 != 0) {
            nVar.H0(12, j14);
        }
        long j15 = this.f13067n;
        if (j15 != 0) {
            nVar.H0(13, j15);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ j(h0.b bVar, a aVar) {
        this(bVar);
    }

    private j(h0.b bVar) {
        super(bVar);
        this.f13068o = (byte) -1;
    }

    private j() {
        this.f13068o = (byte) -1;
        this.f13056c = "";
        this.f13057d = "";
        this.f13059f = "";
    }

    private j(com.explorestack.protobuf.l lVar, w wVar) {
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
                        case 8:
                            this.f13055b = lVar.q();
                            break;
                        case 18:
                            this.f13056c = lVar.J();
                            break;
                        case 26:
                            this.f13057d = lVar.J();
                            break;
                        case 32:
                            this.f13058e = lVar.z();
                            break;
                        case 42:
                            this.f13059f = lVar.J();
                            break;
                        case 48:
                            this.f13060g = lVar.z();
                            break;
                        case 56:
                            this.f13061h = lVar.y();
                            break;
                        case 66:
                            com.appodeal.ads.api.a aVar = this.f13062i;
                            a.b bVarD0 = aVar != null ? aVar.toBuilder() : null;
                            com.appodeal.ads.api.a aVar2 = (com.appodeal.ads.api.a) lVar.A(com.appodeal.ads.api.a.parser(), wVar);
                            this.f13062i = aVar2;
                            if (bVarD0 != null) {
                                bVarD0.q(aVar2);
                                this.f13062i = bVarD0.buildPartial();
                            }
                            break;
                        case 72:
                            this.f13063j = lVar.z();
                            break;
                        case 80:
                            this.f13064k = lVar.z();
                            break;
                        case 88:
                            this.f13065l = lVar.y();
                            break;
                        case 96:
                            this.f13066m = lVar.z();
                            break;
                        case 104:
                            this.f13067n = lVar.z();
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
