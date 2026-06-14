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
public final class Event extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Event f12758h = new Event();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p1 f12759i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f12761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f12763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f12764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f12765g;

    public enum EventType implements j0.c {
        INSTALL(0),
        IAP(1),
        SHOW(2),
        CLICK(3),
        FINISH(4),
        UNRECOGNIZED(-1);

        public static final int CLICK_VALUE = 3;
        public static final int FINISH_VALUE = 4;
        public static final int IAP_VALUE = 1;
        public static final int INSTALL_VALUE = 0;
        public static final int SHOW_VALUE = 2;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final EventType[] VALUES = values();

        class a implements j0.d {
            a() {
            }
        }

        EventType(int i10) {
            this.value = i10;
        }

        public static EventType forNumber(int i10) {
            if (i10 == 0) {
                return INSTALL;
            }
            if (i10 == 1) {
                return IAP;
            }
            if (i10 == 2) {
                return SHOW;
            }
            if (i10 == 3) {
                return CLICK;
            }
            if (i10 != 4) {
                return null;
            }
            return FINISH;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Event.getDescriptor().getEnumTypes().get(0);
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
        public static EventType valueOf(int i10) {
            return forNumber(i10);
        }

        public static EventType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public Event parsePartialFrom(com.explorestack.protobuf.l lVar, w wVar) {
            return new Event(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f12767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f12769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f12770f;

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
            return c.A;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Event build() {
            Event eventBuildPartial = buildPartial();
            if (eventBuildPartial.isInitialized()) {
                return eventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return c.B.d(Event.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Event buildPartial() {
            Event event = new Event(this, (a) null);
            event.f12760b = this.f12766b;
            event.f12761c = this.f12767c;
            event.f12762d = this.f12768d;
            event.f12763e = this.f12769e;
            event.f12764f = this.f12770f;
            onBuilt();
            return event;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f12766b = 0;
            this.f12767c = "";
            this.f12768d = 0;
            this.f12769e = "";
            this.f12770f = 0.0f;
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
        public Event getDefaultInstanceForType() {
            return Event.x();
        }

        public b q(Event event) {
            if (event == Event.x()) {
                return this;
            }
            if (event.f12760b != 0) {
                v(event.B());
            }
            if (!event.getId().isEmpty()) {
                this.f12767c = event.f12761c;
                onChanged();
            }
            if (event.C() != 0) {
                x(event.C());
            }
            if (!event.u().isEmpty()) {
                this.f12769e = event.f12763e;
                onChanged();
            }
            if (event.t() != 0.0f) {
                u(event.t());
            }
            mergeUnknownFields(((h0) event).unknownFields);
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
        public com.appodeal.ads.api.Event.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.appodeal.ads.api.Event.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.appodeal.ads.api.Event r3 = (com.appodeal.ads.api.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.appodeal.ads.api.Event r4 = (com.appodeal.ads.api.Event) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Event.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.appodeal.ads.api.Event$b");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof Event) {
                return q((Event) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b u(float f10) {
            this.f12770f = f10;
            onChanged();
            return this;
        }

        public b v(int i10) {
            this.f12766b = i10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b x(int i10) {
            this.f12768d = i10;
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
            this.f12766b = 0;
            this.f12767c = "";
            this.f12769e = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f12766b = 0;
            this.f12767c = "";
            this.f12769e = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ Event(com.explorestack.protobuf.l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static b D() {
        return f12758h.toBuilder();
    }

    public static b E(Event event) {
        return f12758h.toBuilder().q(event);
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return c.A;
    }

    public static p1 parser() {
        return f12759i;
    }

    public static Event x() {
        return f12758h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Event getDefaultInstanceForType() {
        return f12758h;
    }

    public int B() {
        return this.f12760b;
    }

    public int C() {
        return this.f12762d;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f12758h ? new b(aVar) : new b(aVar).q(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return super.equals(obj);
        }
        Event event = (Event) obj;
        return this.f12760b == event.f12760b && getId().equals(event.getId()) && C() == event.C() && u().equals(event.u()) && Float.floatToIntBits(t()) == Float.floatToIntBits(event.t()) && this.unknownFields.equals(event.unknownFields);
    }

    public String getId() {
        Object obj = this.f12761c;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12761c = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdBytes() {
        Object obj = this.f12761c;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12761c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f12759i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iL = this.f12760b != EventType.INSTALL.getNumber() ? n.l(1, this.f12760b) : 0;
        if (!getIdBytes().isEmpty()) {
            iL += h0.computeStringSize(2, this.f12761c);
        }
        int i11 = this.f12762d;
        if (i11 != 0) {
            iL += n.x(3, i11);
        }
        if (!v().isEmpty()) {
            iL += h0.computeStringSize(4, this.f12763e);
        }
        float f10 = this.f12764f;
        if (f10 != 0.0f) {
            iL += n.r(5, f10);
        }
        int serializedSize = iL + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f12760b) * 37) + 2) * 53) + getId().hashCode()) * 37) + 3) * 53) + C()) * 37) + 4) * 53) + u().hashCode()) * 37) + 5) * 53) + Float.floatToIntBits(t())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return c.B.d(Event.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f12765g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f12765g = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Event();
    }

    public float t() {
        return this.f12764f;
    }

    public String u() {
        Object obj = this.f12763e;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f12763e = stringUtf8;
        return stringUtf8;
    }

    public ByteString v() {
        Object obj = this.f12763e;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f12763e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.f12760b != EventType.INSTALL.getNumber()) {
            nVar.v0(1, this.f12760b);
        }
        if (!getIdBytes().isEmpty()) {
            h0.writeString(nVar, 2, this.f12761c);
        }
        int i10 = this.f12762d;
        if (i10 != 0) {
            nVar.F0(3, i10);
        }
        if (!v().isEmpty()) {
            h0.writeString(nVar, 4, this.f12763e);
        }
        float f10 = this.f12764f;
        if (f10 != 0.0f) {
            nVar.B0(5, f10);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ Event(h0.b bVar, a aVar) {
        this(bVar);
    }

    private Event(h0.b bVar) {
        super(bVar);
        this.f12765g = (byte) -1;
    }

    private Event() {
        this.f12765g = (byte) -1;
        this.f12760b = 0;
        this.f12761c = "";
        this.f12763e = "";
    }

    private Event(com.explorestack.protobuf.l lVar, w wVar) {
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
                                this.f12760b = lVar.t();
                            } else if (iK == 18) {
                                this.f12761c = lVar.J();
                            } else if (iK == 24) {
                                this.f12762d = lVar.y();
                            } else if (iK == 34) {
                                this.f12763e = lVar.J();
                            } else if (iK != 45) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.f12764f = lVar.w();
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
