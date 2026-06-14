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
public final class Geo extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Geo f12771h = new Geo();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p1 f12772i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f12774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f12777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f12778g;

    public enum LocationType implements j0.c {
        LOCATIONTYPE_UNKNOWN(0),
        GPS(1),
        IP(2),
        USERPROVIDED(3),
        UNRECOGNIZED(-1);

        public static final int GPS_VALUE = 1;
        public static final int IP_VALUE = 2;
        public static final int LOCATIONTYPE_UNKNOWN_VALUE = 0;
        public static final int USERPROVIDED_VALUE = 3;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final LocationType[] VALUES = values();

        class a implements j0.d {
            a() {
            }
        }

        LocationType(int i10) {
            this.value = i10;
        }

        public static LocationType forNumber(int i10) {
            if (i10 == 0) {
                return LOCATIONTYPE_UNKNOWN;
            }
            if (i10 == 1) {
                return GPS;
            }
            if (i10 == 2) {
                return IP;
            }
            if (i10 != 3) {
                return null;
            }
            return USERPROVIDED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Geo.getDescriptor().getEnumTypes().get(0);
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
        public static LocationType valueOf(int i10) {
            return forNumber(i10);
        }

        public static LocationType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public Geo parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new Geo(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f12780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f12782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f12783f;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r2 r2Var) {
            return (b) super.setUnknownFields(r2Var);
        }

        public b C(int i10) {
            this.f12779b = i10;
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
            return c.f12880e;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Geo build() {
            Geo geoBuildPartial = buildPartial();
            if (geoBuildPartial.isInitialized()) {
                return geoBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) geoBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.f12881f.d(Geo.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Geo buildPartial() {
            Geo geo = new Geo(this, (a) null);
            geo.f12773b = this.f12779b;
            geo.f12774c = this.f12780c;
            geo.f12775d = this.f12781d;
            geo.f12776e = this.f12782e;
            geo.f12777f = this.f12783f;
            onBuilt();
            return geo;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f12779b = 0;
            this.f12780c = 0L;
            this.f12781d = 0;
            this.f12782e = 0.0f;
            this.f12783f = 0.0f;
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
        public Geo getDefaultInstanceForType() {
            return Geo.r();
        }

        public b q(Geo geo) {
            if (geo == Geo.r()) {
                return this;
            }
            if (geo.getUtcoffset() != 0) {
                C(geo.getUtcoffset());
            }
            if (geo.t() != 0) {
                w(geo.t());
            }
            if (geo.f12775d != 0) {
                z(geo.u());
            }
            if (geo.getLat() != 0.0f) {
                v(geo.getLat());
            }
            if (geo.getLon() != 0.0f) {
                x(geo.getLon());
            }
            mergeUnknownFields(((h0) geo).unknownFields);
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
        public com.appodeal.ads.api.Geo.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.Geo.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.Geo r3 = (com.appodeal.ads.api.Geo) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.appodeal.ads.api.Geo r4 = (com.appodeal.ads.api.Geo) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Geo.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.Geo$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof Geo) {
                return q((Geo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b v(float f10) {
            this.f12782e = f10;
            onChanged();
            return this;
        }

        public b w(long j10) {
            this.f12780c = j10;
            onChanged();
            return this;
        }

        public b x(float f10) {
            this.f12783f = f10;
            onChanged();
            return this;
        }

        public b y(LocationType locationType) {
            locationType.getClass();
            this.f12781d = locationType.getNumber();
            onChanged();
            return this;
        }

        public b z(int i10) {
            this.f12781d = i10;
            onChanged();
            return this;
        }

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f12781d = 0;
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f12781d = 0;
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ Geo(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.f12880e;
    }

    public static p1 parser() {
        return f12772i;
    }

    public static Geo r() {
        return f12771h;
    }

    public static b v() {
        return f12771h.toBuilder();
    }

    public static b x(Geo geo) {
        return f12771h.toBuilder().q(geo);
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
        return this == f12771h ? new b(aVar) : new b(aVar).q(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Geo)) {
            return super.equals(obj);
        }
        Geo geo = (Geo) obj;
        return getUtcoffset() == geo.getUtcoffset() && t() == geo.t() && this.f12775d == geo.f12775d && Float.floatToIntBits(getLat()) == Float.floatToIntBits(geo.getLat()) && Float.floatToIntBits(getLon()) == Float.floatToIntBits(geo.getLon()) && this.unknownFields.equals(geo.unknownFields);
    }

    public float getLat() {
        return this.f12776e;
    }

    public float getLon() {
        return this.f12777f;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12772i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f12773b;
        int iX = i11 != 0 ? n.x(1, i11) : 0;
        long j10 = this.f12774c;
        if (j10 != 0) {
            iX += n.z(2, j10);
        }
        if (this.f12775d != LocationType.LOCATIONTYPE_UNKNOWN.getNumber()) {
            iX += n.l(3, this.f12775d);
        }
        float f10 = this.f12776e;
        if (f10 != 0.0f) {
            iX += n.r(4, f10);
        }
        float f11 = this.f12777f;
        if (f11 != 0.0f) {
            iX += n.r(5, f11);
        }
        int serializedSize = iX + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    public int getUtcoffset() {
        return this.f12773b;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUtcoffset()) * 37) + 2) * 53) + j0.i(t())) * 37) + 3) * 53) + this.f12775d) * 37) + 4) * 53) + Float.floatToIntBits(getLat())) * 37) + 5) * 53) + Float.floatToIntBits(getLon())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.f12881f.d(Geo.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12778g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12778g = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Geo();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Geo getDefaultInstanceForType() {
        return f12771h;
    }

    public long t() {
        return this.f12774c;
    }

    public int u() {
        return this.f12775d;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) {
        int i10 = this.f12773b;
        if (i10 != 0) {
            nVar.F0(1, i10);
        }
        long j10 = this.f12774c;
        if (j10 != 0) {
            nVar.H0(2, j10);
        }
        if (this.f12775d != LocationType.LOCATIONTYPE_UNKNOWN.getNumber()) {
            nVar.v0(3, this.f12775d);
        }
        float f10 = this.f12776e;
        if (f10 != 0.0f) {
            nVar.B0(4, f10);
        }
        float f11 = this.f12777f;
        if (f11 != 0.0f) {
            nVar.B0(5, f11);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ Geo(h0.b bVar, a aVar) {
        this(bVar);
    }

    private Geo(h0.b bVar) {
        super(bVar);
        this.f12778g = (byte) -1;
    }

    private Geo() {
        this.f12778g = (byte) -1;
        this.f12775d = 0;
    }

    private Geo(com.explorestack.protobuf.l lVar, w wVar) {
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
                            if (iK == 8) {
                                this.f12773b = lVar.y();
                            } else if (iK == 16) {
                                this.f12774c = lVar.z();
                            } else if (iK == 24) {
                                this.f12775d = lVar.t();
                            } else if (iK == 37) {
                                this.f12776e = lVar.w();
                            } else if (iK != 45) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.f12777f = lVar.w();
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
