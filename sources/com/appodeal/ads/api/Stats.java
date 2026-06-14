package com.appodeal.ads.api;

import com.appodeal.ads.api.b;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
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

/* JADX INFO: loaded from: classes6.dex */
public final class Stats extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Stats f12784j = new Stats();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p1 f12785k = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f12787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f12791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f12792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte f12793i;

    public enum AdUnitRequestResult implements j0.c {
        SUCCESSFUL(0),
        NOFILL(1),
        TIMEOUTREACHED(2),
        EXCEPTION(3),
        UNDEFINEDADAPTER(4),
        INCORRECTADUNIT(5),
        INVALIDASSETS(6),
        CANCELED(7),
        UNRECOGNIZED(-1);

        public static final int CANCELED_VALUE = 7;
        public static final int EXCEPTION_VALUE = 3;
        public static final int INCORRECTADUNIT_VALUE = 5;
        public static final int INVALIDASSETS_VALUE = 6;
        public static final int NOFILL_VALUE = 1;
        public static final int SUCCESSFUL_VALUE = 0;
        public static final int TIMEOUTREACHED_VALUE = 2;
        public static final int UNDEFINEDADAPTER_VALUE = 4;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final AdUnitRequestResult[] VALUES = values();

        class a implements j0.d {
            a() {
            }
        }

        AdUnitRequestResult(int i10) {
            this.value = i10;
        }

        public static AdUnitRequestResult forNumber(int i10) {
            switch (i10) {
                case 0:
                    return SUCCESSFUL;
                case 1:
                    return NOFILL;
                case 2:
                    return TIMEOUTREACHED;
                case 3:
                    return EXCEPTION;
                case 4:
                    return UNDEFINEDADAPTER;
                case 5:
                    return INCORRECTADUNIT;
                case 6:
                    return INVALIDASSETS;
                case 7:
                    return CANCELED;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Stats.getDescriptor().getEnumTypes().get(0);
        }

        public static j0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.j0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static AdUnitRequestResult valueOf(int i10) {
            return forNumber(i10);
        }

        public static AdUnitRequestResult valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Stats parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new Stats(lVar, wVar, null);
        }
    }

    public static final class b extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final b f12794n = new b();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final p1 f12795o = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f12797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f12798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f12799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f12800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f12801g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private double f12802h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private double f12803i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile Object f12804j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private volatile Object f12805k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Struct f12806l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f12807m;

        class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
                return new b(lVar, wVar, null);
            }
        }

        /* JADX INFO: renamed from: com.appodeal.ads.api.Stats$b$b, reason: collision with other inner class name */
        public static final class C0192b extends h0.b implements MessageOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f12808b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f12809c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f12810d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private long f12811e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f12812f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f12813g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private double f12814h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private double f12815i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Object f12816j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Object f12817k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Struct f12818l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private a2 f12819m;

            /* synthetic */ C0192b(a aVar) {
                this();
            }

            private a2 getExtFieldBuilder() {
                if (this.f12819m == null) {
                    this.f12819m = new a2(getExt(), getParentForChildren(), isClean());
                    this.f12818l = null;
                }
                return this.f12819m;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getExtFieldBuilder();
                }
            }

            public C0192b A(String str) {
                str.getClass();
                this.f12809c = str;
                onChanged();
                return this;
            }

            public C0192b B(boolean z10) {
                this.f12813g = z10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public C0192b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C0192b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public C0192b D(AdUnitRequestResult adUnitRequestResult) {
                adUnitRequestResult.getClass();
                this.f12812f = adUnitRequestResult.getNumber();
                onChanged();
                return this;
            }

            public C0192b E(int i10) {
                this.f12812f = i10;
                onChanged();
                return this;
            }

            public C0192b F(long j10) {
                this.f12810d = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public final C0192b setUnknownFields(r2 r2Var) {
                return (C0192b) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0192b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C0192b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return com.appodeal.ads.api.c.f12900y;
            }

            public Struct getExt() {
                a2 a2Var = this.f12819m;
                if (a2Var != null) {
                    return (Struct) a2Var.e();
                }
                Struct struct = this.f12818l;
                return struct == null ? Struct.getDefaultInstance() : struct;
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
                return com.appodeal.ads.api.c.f12901z.d(b.class, C0192b.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b buildPartial() {
                b bVar = new b(this, (a) null);
                int i10 = this.f12808b;
                bVar.f12797c = this.f12809c;
                bVar.f12798d = this.f12810d;
                bVar.f12799e = this.f12811e;
                bVar.f12800f = this.f12812f;
                bVar.f12801g = this.f12813g;
                bVar.f12802h = this.f12814h;
                bVar.f12803i = this.f12815i;
                bVar.f12804j = this.f12816j;
                bVar.f12805k = this.f12817k;
                int i11 = 1;
                if ((i10 & 1) != 0) {
                    a2 a2Var = this.f12819m;
                    if (a2Var == null) {
                        bVar.f12806l = this.f12818l;
                    } else {
                        bVar.f12806l = (Struct) a2Var.a();
                    }
                } else {
                    i11 = 0;
                }
                bVar.f12796b = i11;
                onBuilt();
                return bVar;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public C0192b clear() {
                super.clear();
                this.f12809c = "";
                this.f12810d = 0L;
                this.f12811e = 0L;
                this.f12812f = 0;
                this.f12813g = false;
                this.f12814h = 0.0d;
                this.f12815i = 0.0d;
                this.f12816j = "";
                this.f12817k = "";
                a2 a2Var = this.f12819m;
                if (a2Var == null) {
                    this.f12818l = null;
                } else {
                    a2Var.b();
                }
                this.f12808b &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public C0192b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C0192b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0192b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C0192b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public C0192b mo4427clone() {
                return (C0192b) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b getDefaultInstanceForType() {
                return b.G();
            }

            public C0192b q(Struct struct) {
                Struct struct2;
                a2 a2Var = this.f12819m;
                if (a2Var == null) {
                    if ((this.f12808b & 1) == 0 || (struct2 = this.f12818l) == null || struct2 == Struct.getDefaultInstance()) {
                        this.f12818l = struct;
                    } else {
                        this.f12818l = Struct.newBuilder(this.f12818l).mergeFrom(struct).buildPartial();
                    }
                    onChanged();
                } else {
                    a2Var.g(struct);
                }
                this.f12808b |= 1;
                return this;
            }

            public C0192b r(b bVar) {
                if (bVar == b.G()) {
                    return this;
                }
                if (!bVar.getId().isEmpty()) {
                    this.f12809c = bVar.f12797c;
                    onChanged();
                }
                if (bVar.P() != 0) {
                    F(bVar.P());
                }
                if (bVar.M() != 0) {
                    z(bVar.M());
                }
                if (bVar.f12800f != 0) {
                    E(bVar.O());
                }
                if (bVar.N()) {
                    B(bVar.N());
                }
                if (bVar.K() != 0.0d) {
                    v(bVar.K());
                }
                if (bVar.L() != 0.0d) {
                    w(bVar.L());
                }
                if (!bVar.E().isEmpty()) {
                    this.f12816j = bVar.f12804j;
                    onChanged();
                }
                if (!bVar.I().isEmpty()) {
                    this.f12817k = bVar.f12805k;
                    onChanged();
                }
                if (bVar.hasExt()) {
                    q(bVar.getExt());
                }
                mergeUnknownFields(((h0) bVar).unknownFields);
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
            public com.appodeal.ads.api.Stats.b.C0192b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.Stats.b.s()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.appodeal.ads.api.Stats$b r3 = (com.appodeal.ads.api.Stats.b) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.appodeal.ads.api.Stats$b r4 = (com.appodeal.ads.api.Stats.b) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Stats.b.C0192b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.Stats$b$b");
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0192b mergeFrom(Message message) {
                if (message instanceof b) {
                    return r((b) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C0192b mergeUnknownFields(r2 r2Var) {
                return (C0192b) super.mergeUnknownFields(r2Var);
            }

            public C0192b v(double d10) {
                this.f12814h = d10;
                onChanged();
                return this;
            }

            public C0192b w(double d10) {
                this.f12815i = d10;
                onChanged();
                return this;
            }

            public C0192b x(Struct struct) {
                a2 a2Var = this.f12819m;
                if (a2Var == null) {
                    struct.getClass();
                    this.f12818l = struct;
                    onChanged();
                } else {
                    a2Var.i(struct);
                }
                this.f12808b |= 1;
                return this;
            }

            @Override // com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public C0192b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C0192b) super.setField(fieldDescriptor, obj);
            }

            public C0192b z(long j10) {
                this.f12811e = j10;
                onChanged();
                return this;
            }

            /* synthetic */ C0192b(h0.c cVar, a aVar) {
                this(cVar);
            }

            private C0192b() {
                this.f12809c = "";
                this.f12812f = 0;
                this.f12816j = "";
                this.f12817k = "";
                maybeForceBuilderInitialization();
            }

            private C0192b(h0.c cVar) {
                super(cVar);
                this.f12809c = "";
                this.f12812f = 0;
                this.f12816j = "";
                this.f12817k = "";
                maybeForceBuilderInitialization();
            }
        }

        /* synthetic */ b(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
            this(lVar, wVar);
        }

        public static b G() {
            return f12794n;
        }

        public static C0192b Q() {
            return f12794n.toBuilder();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return com.appodeal.ads.api.c.f12900y;
        }

        public static p1 parser() {
            return f12795o;
        }

        public String E() {
            Object obj = this.f12804j;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f12804j = stringUtf8;
            return stringUtf8;
        }

        public ByteString F() {
            Object obj = this.f12804j;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f12804j = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b getDefaultInstanceForType() {
            return f12794n;
        }

        public String I() {
            Object obj = this.f12805k;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f12805k = stringUtf8;
            return stringUtf8;
        }

        public ByteString J() {
            Object obj = this.f12805k;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f12805k = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public double K() {
            return this.f12802h;
        }

        public double L() {
            return this.f12803i;
        }

        public long M() {
            return this.f12799e;
        }

        public boolean N() {
            return this.f12801g;
        }

        public int O() {
            return this.f12800f;
        }

        public long P() {
            return this.f12798d;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public C0192b newBuilderForType() {
            return Q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public C0192b newBuilderForType(h0.c cVar) {
            return new C0192b(cVar, null);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public C0192b toBuilder() {
            a aVar = null;
            return this == f12794n ? new C0192b(aVar) : new C0192b(aVar).r(this);
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
            if (getId().equals(bVar.getId()) && P() == bVar.P() && M() == bVar.M() && this.f12800f == bVar.f12800f && N() == bVar.N() && Double.doubleToLongBits(K()) == Double.doubleToLongBits(bVar.K()) && Double.doubleToLongBits(L()) == Double.doubleToLongBits(bVar.L()) && E().equals(bVar.E()) && I().equals(bVar.I()) && hasExt() == bVar.hasExt()) {
                return (!hasExt() || getExt().equals(bVar.getExt())) && this.unknownFields.equals(bVar.unknownFields);
            }
            return false;
        }

        public Struct getExt() {
            Struct struct = this.f12806l;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public String getId() {
            Object obj = this.f12797c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f12797c = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.f12797c;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.f12797c = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return f12795o;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? h0.computeStringSize(1, this.f12797c) : 0;
            long j10 = this.f12798d;
            if (j10 != 0) {
                iComputeStringSize += n.z(2, j10);
            }
            long j11 = this.f12799e;
            if (j11 != 0) {
                iComputeStringSize += n.z(3, j11);
            }
            if (this.f12800f != AdUnitRequestResult.SUCCESSFUL.getNumber()) {
                iComputeStringSize += n.l(4, this.f12800f);
            }
            boolean z10 = this.f12801g;
            if (z10) {
                iComputeStringSize += n.e(5, z10);
            }
            double d10 = this.f12802h;
            if (d10 != 0.0d) {
                iComputeStringSize += n.j(6, d10);
            }
            double d11 = this.f12803i;
            if (d11 != 0.0d) {
                iComputeStringSize += n.j(7, d11);
            }
            if (!F().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(8, this.f12804j);
            }
            if (!J().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(9, this.f12805k);
            }
            if ((1 & this.f12796b) != 0) {
                iComputeStringSize += n.G(10, getExt());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasExt() {
            return (this.f12796b & 1) != 0;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + j0.i(P())) * 37) + 3) * 53) + j0.i(M())) * 37) + 4) * 53) + this.f12800f) * 37) + 5) * 53) + j0.d(N())) * 37) + 6) * 53) + j0.i(Double.doubleToLongBits(K()))) * 37) + 7) * 53) + j0.i(Double.doubleToLongBits(L()))) * 37) + 8) * 53) + E().hashCode()) * 37) + 9) * 53) + I().hashCode();
            if (hasExt()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getExt().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return com.appodeal.ads.api.c.f12901z.d(b.class, C0192b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f12807m;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f12807m = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new b();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getIdBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.f12797c);
            }
            long j10 = this.f12798d;
            if (j10 != 0) {
                nVar.H0(2, j10);
            }
            long j11 = this.f12799e;
            if (j11 != 0) {
                nVar.H0(3, j11);
            }
            if (this.f12800f != AdUnitRequestResult.SUCCESSFUL.getNumber()) {
                nVar.v0(4, this.f12800f);
            }
            boolean z10 = this.f12801g;
            if (z10) {
                nVar.n0(5, z10);
            }
            double d10 = this.f12802h;
            if (d10 != 0.0d) {
                nVar.t0(6, d10);
            }
            double d11 = this.f12803i;
            if (d11 != 0.0d) {
                nVar.t0(7, d11);
            }
            if (!F().isEmpty()) {
                h0.writeString(nVar, 8, this.f12804j);
            }
            if (!J().isEmpty()) {
                h0.writeString(nVar, 9, this.f12805k);
            }
            if ((this.f12796b & 1) != 0) {
                nVar.J0(10, getExt());
            }
            this.unknownFields.writeTo(nVar);
        }

        /* synthetic */ b(h0.b bVar, a aVar) {
            this(bVar);
        }

        private b(h0.b bVar) {
            super(bVar);
            this.f12807m = (byte) -1;
        }

        private b() {
            this.f12807m = (byte) -1;
            this.f12797c = "";
            this.f12800f = 0;
            this.f12804j = "";
            this.f12805k = "";
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
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 10:
                                this.f12797c = lVar.J();
                                break;
                            case 16:
                                this.f12798d = lVar.z();
                                break;
                            case 24:
                                this.f12799e = lVar.z();
                                break;
                            case 32:
                                this.f12800f = lVar.t();
                                break;
                            case 40:
                                this.f12801g = lVar.q();
                                break;
                            case 49:
                                this.f12802h = lVar.s();
                                break;
                            case 57:
                                this.f12803i = lVar.s();
                                break;
                            case 66:
                                this.f12804j = lVar.J();
                                break;
                            case 74:
                                this.f12805k = lVar.J();
                                break;
                            case 82:
                                Struct.Builder builder = (this.f12796b & 1) != 0 ? this.f12806l.toBuilder() : null;
                                Struct struct = (Struct) lVar.A(Struct.parser(), wVar);
                                this.f12806l = struct;
                                if (builder != null) {
                                    builder.mergeFrom(struct);
                                    this.f12806l = builder.buildPartial();
                                }
                                this.f12796b |= 1;
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

    public static final class c extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f12822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f12823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f12825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List f12826h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private v1 f12827i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f12828j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private v1 f12829k;

        /* synthetic */ c(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                s();
                t();
            }
        }

        private void q() {
            if ((this.f12820b & 1) == 0) {
                this.f12826h = new ArrayList(this.f12826h);
                this.f12820b |= 1;
            }
        }

        private void r() {
            if ((this.f12820b & 2) == 0) {
                this.f12828j = new ArrayList(this.f12828j);
                this.f12820b |= 2;
            }
        }

        private v1 s() {
            if (this.f12827i == null) {
                this.f12827i = new v1(this.f12826h, (this.f12820b & 1) != 0, getParentForChildren(), isClean());
                this.f12826h = null;
            }
            return this.f12827i;
        }

        private v1 t() {
            if (this.f12829k == null) {
                this.f12829k = new v1(this.f12828j, (this.f12820b & 2) != 0, getParentForChildren(), isClean());
                this.f12828j = null;
            }
            return this.f12829k;
        }

        public c A(boolean z10) {
            this.f12825g = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (c) super.setField(fieldDescriptor, obj);
        }

        public c C(long j10) {
            this.f12823e = j10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (c) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        public c E(long j10) {
            this.f12822d = j10;
            onChanged();
            return this;
        }

        public c F(boolean z10) {
            this.f12824f = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public final c setUnknownFields(r2 r2Var) {
            return (c) super.setUnknownFields(r2Var);
        }

        public c g(b bVar) {
            v1 v1Var = this.f12827i;
            if (v1Var != null) {
                v1Var.e(bVar);
                return this;
            }
            bVar.getClass();
            q();
            this.f12826h.add(bVar);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return com.appodeal.ads.api.c.f12898w;
        }

        public c h(b.C0194b c0194b) {
            v1 v1Var = this.f12829k;
            if (v1Var != null) {
                v1Var.e(c0194b.build());
                return this;
            }
            r();
            this.f12828j.add(c0194b.build());
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (c) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return com.appodeal.ads.api.c.f12899x.d(Stats.class, c.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Stats build() {
            Stats statsBuildPartial = buildPartial();
            if (statsBuildPartial.isInitialized()) {
                return statsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) statsBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Stats buildPartial() {
            Stats stats = new Stats(this, (a) null);
            stats.f12786b = this.f12821c;
            stats.f12787c = this.f12822d;
            stats.f12788d = this.f12823e;
            stats.f12789e = this.f12824f;
            stats.f12790f = this.f12825g;
            v1 v1Var = this.f12827i;
            if (v1Var == null) {
                if ((this.f12820b & 1) != 0) {
                    this.f12826h = DesugarCollections.unmodifiableList(this.f12826h);
                    this.f12820b &= -2;
                }
                stats.f12791g = this.f12826h;
            } else {
                stats.f12791g = v1Var.f();
            }
            v1 v1Var2 = this.f12829k;
            if (v1Var2 == null) {
                if ((this.f12820b & 2) != 0) {
                    this.f12828j = DesugarCollections.unmodifiableList(this.f12828j);
                    this.f12820b &= -3;
                }
                stats.f12792h = this.f12828j;
            } else {
                stats.f12792h = v1Var2.f();
            }
            onBuilt();
            return stats;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public c clear() {
            super.clear();
            this.f12821c = 0;
            this.f12822d = 0L;
            this.f12823e = 0L;
            this.f12824f = false;
            this.f12825g = false;
            v1 v1Var = this.f12827i;
            if (v1Var == null) {
                this.f12826h = Collections.EMPTY_LIST;
                this.f12820b &= -2;
            } else {
                v1Var.g();
            }
            v1 v1Var2 = this.f12829k;
            if (v1Var2 != null) {
                v1Var2.g();
                return this;
            }
            this.f12828j = Collections.EMPTY_LIST;
            this.f12820b &= -3;
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (c) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public c clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (c) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public c mo4427clone() {
            return (c) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Stats getDefaultInstanceForType() {
            return Stats.E();
        }

        public c v(Stats stats) {
            if (stats == Stats.E()) {
                return this;
            }
            if (stats.C() != 0) {
                z(stats.C());
            }
            if (stats.H() != 0) {
                E(stats.H());
            }
            if (stats.G() != 0) {
                C(stats.G());
            }
            if (stats.I()) {
                F(stats.I());
            }
            if (stats.D()) {
                A(stats.D());
            }
            if (this.f12827i == null) {
                if (!stats.f12791g.isEmpty()) {
                    if (this.f12826h.isEmpty()) {
                        this.f12826h = stats.f12791g;
                        this.f12820b &= -2;
                    } else {
                        q();
                        this.f12826h.addAll(stats.f12791g);
                    }
                    onChanged();
                }
            } else if (!stats.f12791g.isEmpty()) {
                if (this.f12827i.t()) {
                    this.f12827i.h();
                    this.f12827i = null;
                    this.f12826h = stats.f12791g;
                    this.f12820b &= -2;
                    this.f12827i = h0.alwaysUseFieldBuilders ? s() : null;
                } else {
                    this.f12827i.a(stats.f12791g);
                }
            }
            if (this.f12829k == null) {
                if (!stats.f12792h.isEmpty()) {
                    if (this.f12828j.isEmpty()) {
                        this.f12828j = stats.f12792h;
                        this.f12820b &= -3;
                    } else {
                        r();
                        this.f12828j.addAll(stats.f12792h);
                    }
                    onChanged();
                }
            } else if (!stats.f12792h.isEmpty()) {
                if (this.f12829k.t()) {
                    this.f12829k.h();
                    this.f12829k = null;
                    this.f12828j = stats.f12792h;
                    this.f12820b &= -3;
                    this.f12829k = h0.alwaysUseFieldBuilders ? t() : null;
                } else {
                    this.f12829k.a(stats.f12792h);
                }
            }
            mergeUnknownFields(((h0) stats).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.appodeal.ads.api.Stats.c mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.Stats.access$3500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.Stats r3 = (com.appodeal.ads.api.Stats) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.v(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.appodeal.ads.api.Stats r4 = (com.appodeal.ads.api.Stats) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.v(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Stats.c.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.Stats$c");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public c mergeFrom(Message message) {
            if (message instanceof Stats) {
                return v((Stats) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final c mergeUnknownFields(r2 r2Var) {
            return (c) super.mergeUnknownFields(r2Var);
        }

        public c z(int i10) {
            this.f12821c = i10;
            onChanged();
            return this;
        }

        /* synthetic */ c(h0.c cVar, a aVar) {
            this(cVar);
        }

        private c() {
            List list = Collections.EMPTY_LIST;
            this.f12826h = list;
            this.f12828j = list;
            maybeForceBuilderInitialization();
        }

        private c(h0.c cVar) {
            super(cVar);
            List list = Collections.EMPTY_LIST;
            this.f12826h = list;
            this.f12828j = list;
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ Stats(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static Stats E() {
        return f12784j;
    }

    public static c J() {
        return f12784j.toBuilder();
    }

    public static c K(Stats stats) {
        return f12784j.toBuilder().v(stats);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return com.appodeal.ads.api.c.f12898w;
    }

    public static p1 parser() {
        return f12785k;
    }

    public int A() {
        return this.f12792h.size();
    }

    public List B() {
        return this.f12792h;
    }

    public int C() {
        return this.f12786b;
    }

    public boolean D() {
        return this.f12790f;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Stats getDefaultInstanceForType() {
        return f12784j;
    }

    public long G() {
        return this.f12788d;
    }

    public long H() {
        return this.f12787c;
    }

    public boolean I() {
        return this.f12789e;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType() {
        return J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType(h0.c cVar) {
        return new c(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public c toBuilder() {
        a aVar = null;
        return this == f12784j ? new c(aVar) : new c(aVar).v(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Stats)) {
            return super.equals(obj);
        }
        Stats stats = (Stats) obj;
        return C() == stats.C() && H() == stats.H() && G() == stats.G() && I() == stats.I() && D() == stats.D() && x().equals(stats.x()) && B().equals(stats.B()) && this.unknownFields.equals(stats.unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12785k;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f12786b;
        int iX = i11 != 0 ? n.x(1, i11) : 0;
        long j10 = this.f12787c;
        if (j10 != 0) {
            iX += n.z(2, j10);
        }
        long j11 = this.f12788d;
        if (j11 != 0) {
            iX += n.z(3, j11);
        }
        boolean z10 = this.f12789e;
        if (z10) {
            iX += n.e(4, z10);
        }
        boolean z11 = this.f12790f;
        if (z11) {
            iX += n.e(5, z11);
        }
        for (int i12 = 0; i12 < this.f12791g.size(); i12++) {
            iX += n.G(6, (MessageLite) this.f12791g.get(i12));
        }
        for (int i13 = 0; i13 < this.f12792h.size(); i13++) {
            iX += n.G(7, (MessageLite) this.f12792h.get(i13));
        }
        int serializedSize = iX + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + C()) * 37) + 2) * 53) + j0.i(H())) * 37) + 3) * 53) + j0.i(G())) * 37) + 4) * 53) + j0.d(I())) * 37) + 5) * 53) + j0.d(D());
        if (v() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + x().hashCode();
        }
        if (A() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + B().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return com.appodeal.ads.api.c.f12899x.d(Stats.class, c.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12793i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12793i = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Stats();
    }

    public int v() {
        return this.f12791g.size();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) {
        int i10 = this.f12786b;
        if (i10 != 0) {
            nVar.F0(1, i10);
        }
        long j10 = this.f12787c;
        if (j10 != 0) {
            nVar.H0(2, j10);
        }
        long j11 = this.f12788d;
        if (j11 != 0) {
            nVar.H0(3, j11);
        }
        boolean z10 = this.f12789e;
        if (z10) {
            nVar.n0(4, z10);
        }
        boolean z11 = this.f12790f;
        if (z11) {
            nVar.n0(5, z11);
        }
        for (int i11 = 0; i11 < this.f12791g.size(); i11++) {
            nVar.J0(6, (MessageLite) this.f12791g.get(i11));
        }
        for (int i12 = 0; i12 < this.f12792h.size(); i12++) {
            nVar.J0(7, (MessageLite) this.f12792h.get(i12));
        }
        this.unknownFields.writeTo(nVar);
    }

    public List x() {
        return this.f12791g;
    }

    /* synthetic */ Stats(h0.b bVar, a aVar) {
        this(bVar);
    }

    private Stats(h0.b bVar) {
        super(bVar);
        this.f12793i = (byte) -1;
    }

    private Stats() {
        this.f12793i = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.f12791g = list;
        this.f12792h = list;
    }

    private Stats(com.explorestack.protobuf.l lVar, w wVar) {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f12786b = lVar.y();
                            } else if (iK == 16) {
                                this.f12787c = lVar.z();
                            } else if (iK == 24) {
                                this.f12788d = lVar.z();
                            } else if (iK == 32) {
                                this.f12789e = lVar.q();
                            } else if (iK == 40) {
                                this.f12790f = lVar.q();
                            } else if (iK == 50) {
                                if ((i10 & 1) == 0) {
                                    this.f12791g = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f12791g.add(lVar.A(b.parser(), wVar));
                            } else if (iK != 58) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.f12792h = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f12792h.add(lVar.A(com.appodeal.ads.api.b.parser(), wVar));
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) != 0) {
                    this.f12791g = DesugarCollections.unmodifiableList(this.f12791g);
                }
                if ((i10 & 2) != 0) {
                    this.f12792h = DesugarCollections.unmodifiableList(this.f12792h);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.f12791g = DesugarCollections.unmodifiableList(this.f12791g);
        }
        if ((i10 & 2) != 0) {
            this.f12792h = DesugarCollections.unmodifiableList(this.f12792h);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
