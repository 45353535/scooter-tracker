package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.r2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Field extends h0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Field f18752m = new Field();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final p1 f18753n = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f18757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f18758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f18761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Object f18762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile Object f18763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f18764l;

    public enum Cardinality implements j0.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final Cardinality[] VALUES = values();

        static class a implements j0.d {
            a() {
            }
        }

        Cardinality(int i10) {
            this.value = i10;
        }

        public static Cardinality forNumber(int i10) {
            if (i10 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i10 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i10 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i10 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Field.getDescriptor().getEnumTypes().get(1);
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
        public static Cardinality valueOf(int i10) {
            return forNumber(i10);
        }

        public static Cardinality valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum Kind implements j0.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final j0.d internalValueMap = new a();
        private static final Kind[] VALUES = values();

        static class a implements j0.d {
            a() {
            }
        }

        Kind(int i10) {
            this.value = i10;
        }

        public static Kind forNumber(int i10) {
            switch (i10) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Field.getDescriptor().getEnumTypes().get(0);
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
        public static Kind valueOf(int i10) {
            return forNumber(i10);
        }

        public static Kind valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Field parsePartialFrom(l lVar, w wVar) {
            return new Field(lVar, wVar, null);
        }
    }

    public static final class b extends h0.b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f18768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f18769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f18770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f18771h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f18772i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f18773j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private v1 f18774k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Object f18775l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Object f18776m;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                r();
            }
        }

        private void p() {
            if ((this.f18765b & 1) == 0) {
                this.f18773j = new ArrayList(this.f18773j);
                this.f18765b |= 1;
            }
        }

        private v1 r() {
            if (this.f18774k == null) {
                this.f18774k = new v1(this.f18773j, (this.f18765b & 1) != 0, getParentForChildren(), isClean());
                this.f18773j = null;
            }
            return this.f18774k;
        }

        public b A(int i10) {
            this.f18771h = i10;
            onChanged();
            return this;
        }

        public b B(boolean z10) {
            this.f18772i = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
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
            return l2.f19211c;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Field build() {
            Field fieldBuildPartial = buildPartial();
            if (fieldBuildPartial.isInitialized()) {
                return fieldBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) fieldBuildPartial);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return l2.f19212d.d(Field.class, b.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Field buildPartial() {
            Field field = new Field(this, (a) null);
            field.f18754b = this.f18766c;
            field.f18755c = this.f18767d;
            field.f18756d = this.f18768e;
            field.f18757e = this.f18769f;
            field.f18758f = this.f18770g;
            field.f18759g = this.f18771h;
            field.f18760h = this.f18772i;
            v1 v1Var = this.f18774k;
            if (v1Var == null) {
                if ((this.f18765b & 1) != 0) {
                    this.f18773j = DesugarCollections.unmodifiableList(this.f18773j);
                    this.f18765b &= -2;
                }
                field.f18761i = this.f18773j;
            } else {
                field.f18761i = v1Var.f();
            }
            field.f18762j = this.f18775l;
            field.f18763k = this.f18776m;
            onBuilt();
            return field;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f18766c = 0;
            this.f18767d = 0;
            this.f18768e = 0;
            this.f18769f = "";
            this.f18770g = "";
            this.f18771h = 0;
            this.f18772i = false;
            v1 v1Var = this.f18774k;
            if (v1Var == null) {
                this.f18773j = Collections.EMPTY_LIST;
                this.f18765b &= -2;
            } else {
                v1Var.g();
            }
            this.f18775l = "";
            this.f18776m = "";
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
        public Field getDefaultInstanceForType() {
            return Field.F();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.explorestack.protobuf.Field.b mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.Field.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.Field r3 = (com.explorestack.protobuf.Field) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.t(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.explorestack.protobuf.Field r4 = (com.explorestack.protobuf.Field) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.t(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.Field.b.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):com.explorestack.protobuf.Field$b");
        }

        public b t(Field field) {
            if (field == Field.F()) {
                return this;
            }
            if (field.f18754b != 0) {
                y(field.L());
            }
            if (field.f18755c != 0) {
                w(field.E());
            }
            if (field.M() != 0) {
                z(field.M());
            }
            if (!field.getName().isEmpty()) {
                this.f18769f = field.f18757e;
                onChanged();
            }
            if (!field.getTypeUrl().isEmpty()) {
                this.f18770g = field.f18758f;
                onChanged();
            }
            if (field.N() != 0) {
                A(field.N());
            }
            if (field.Q()) {
                B(field.Q());
            }
            if (this.f18774k == null) {
                if (!field.f18761i.isEmpty()) {
                    if (this.f18773j.isEmpty()) {
                        this.f18773j = field.f18761i;
                        this.f18765b &= -2;
                    } else {
                        p();
                        this.f18773j.addAll(field.f18761i);
                    }
                    onChanged();
                }
            } else if (!field.f18761i.isEmpty()) {
                if (this.f18774k.t()) {
                    this.f18774k.h();
                    this.f18774k = null;
                    this.f18773j = field.f18761i;
                    this.f18765b &= -2;
                    this.f18774k = h0.alwaysUseFieldBuilders ? r() : null;
                } else {
                    this.f18774k.a(field.f18761i);
                }
            }
            if (!field.J().isEmpty()) {
                this.f18775l = field.f18762j;
                onChanged();
            }
            if (!field.H().isEmpty()) {
                this.f18776m = field.f18763k;
                onChanged();
            }
            mergeUnknownFields(field.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof Field) {
                return t((Field) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(r2 r2Var) {
            return (b) super.mergeUnknownFields(r2Var);
        }

        public b w(int i10) {
            this.f18767d = i10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b y(int i10) {
            this.f18766c = i10;
            onChanged();
            return this;
        }

        public b z(int i10) {
            this.f18768e = i10;
            onChanged();
            return this;
        }

        /* synthetic */ b(h0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f18766c = 0;
            this.f18767d = 0;
            this.f18769f = "";
            this.f18770g = "";
            this.f18773j = Collections.EMPTY_LIST;
            this.f18775l = "";
            this.f18776m = "";
            maybeForceBuilderInitialization();
        }

        private b(h0.c cVar) {
            super(cVar);
            this.f18766c = 0;
            this.f18767d = 0;
            this.f18769f = "";
            this.f18770g = "";
            this.f18773j = Collections.EMPTY_LIST;
            this.f18775l = "";
            this.f18776m = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ Field(l lVar, w wVar, a aVar) {
        this(lVar, wVar);
    }

    public static Field F() {
        return f18752m;
    }

    public static b S() {
        return f18752m.toBuilder();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return l2.f19211c;
    }

    public int E() {
        return this.f18755c;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Field getDefaultInstanceForType() {
        return f18752m;
    }

    public String H() {
        Object obj = this.f18763k;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18763k = stringUtf8;
        return stringUtf8;
    }

    public ByteString I() {
        Object obj = this.f18763k;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f18763k = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String J() {
        Object obj = this.f18762j;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18762j = stringUtf8;
        return stringUtf8;
    }

    public ByteString K() {
        Object obj = this.f18762j;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f18762j = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public int L() {
        return this.f18754b;
    }

    public int M() {
        return this.f18756d;
    }

    public int N() {
        return this.f18759g;
    }

    public int O() {
        return this.f18761i.size();
    }

    public List P() {
        return this.f18761i;
    }

    public boolean Q() {
        return this.f18760h;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return S();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(h0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f18752m ? new b(aVar) : new b(aVar).t(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return super.equals(obj);
        }
        Field field = (Field) obj;
        return this.f18754b == field.f18754b && this.f18755c == field.f18755c && M() == field.M() && getName().equals(field.getName()) && getTypeUrl().equals(field.getTypeUrl()) && N() == field.N() && Q() == field.Q() && P().equals(field.P()) && J().equals(field.J()) && H().equals(field.H()) && this.unknownFields.equals(field.unknownFields);
    }

    public String getName() {
        Object obj = this.f18757e;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18757e = stringUtf8;
        return stringUtf8;
    }

    public ByteString getNameBytes() {
        Object obj = this.f18757e;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f18757e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return f18753n;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iL = this.f18754b != Kind.TYPE_UNKNOWN.getNumber() ? n.l(1, this.f18754b) : 0;
        if (this.f18755c != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            iL += n.l(2, this.f18755c);
        }
        int i11 = this.f18756d;
        if (i11 != 0) {
            iL += n.x(3, i11);
        }
        if (!getNameBytes().isEmpty()) {
            iL += h0.computeStringSize(4, this.f18757e);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            iL += h0.computeStringSize(6, this.f18758f);
        }
        int i12 = this.f18759g;
        if (i12 != 0) {
            iL += n.x(7, i12);
        }
        boolean z10 = this.f18760h;
        if (z10) {
            iL += n.e(8, z10);
        }
        for (int i13 = 0; i13 < this.f18761i.size(); i13++) {
            iL += n.G(9, (MessageLite) this.f18761i.get(i13));
        }
        if (!K().isEmpty()) {
            iL += h0.computeStringSize(10, this.f18762j);
        }
        if (!I().isEmpty()) {
            iL += h0.computeStringSize(11, this.f18763k);
        }
        int serializedSize = iL + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getTypeUrl() {
        Object obj = this.f18758f;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18758f = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTypeUrlBytes() {
        Object obj = this.f18758f;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f18758f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iHashCode = ((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f18754b) * 37) + 2) * 53) + this.f18755c) * 37) + 3) * 53) + M()) * 37) + 4) * 53) + getName().hashCode()) * 37) + 6) * 53) + getTypeUrl().hashCode()) * 37) + 7) * 53) + N()) * 37) + 8) * 53) + j0.d(Q());
        if (O() > 0) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + P().hashCode();
        }
        int iHashCode2 = (((((((((iHashCode * 37) + 10) * 53) + J().hashCode()) * 37) + 11) * 53) + H().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return l2.f19212d.d(Field.class, b.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f18764l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f18764l = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new Field();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.f18754b != Kind.TYPE_UNKNOWN.getNumber()) {
            nVar.v0(1, this.f18754b);
        }
        if (this.f18755c != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            nVar.v0(2, this.f18755c);
        }
        int i10 = this.f18756d;
        if (i10 != 0) {
            nVar.F0(3, i10);
        }
        if (!getNameBytes().isEmpty()) {
            h0.writeString(nVar, 4, this.f18757e);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            h0.writeString(nVar, 6, this.f18758f);
        }
        int i11 = this.f18759g;
        if (i11 != 0) {
            nVar.F0(7, i11);
        }
        boolean z10 = this.f18760h;
        if (z10) {
            nVar.n0(8, z10);
        }
        for (int i12 = 0; i12 < this.f18761i.size(); i12++) {
            nVar.J0(9, (MessageLite) this.f18761i.get(i12));
        }
        if (!K().isEmpty()) {
            h0.writeString(nVar, 10, this.f18762j);
        }
        if (!I().isEmpty()) {
            h0.writeString(nVar, 11, this.f18763k);
        }
        this.unknownFields.writeTo(nVar);
    }

    /* synthetic */ Field(h0.b bVar, a aVar) {
        this(bVar);
    }

    private Field(h0.b bVar) {
        super(bVar);
        this.f18764l = (byte) -1;
    }

    private Field() {
        this.f18764l = (byte) -1;
        this.f18754b = 0;
        this.f18755c = 0;
        this.f18757e = "";
        this.f18758f = "";
        this.f18761i = Collections.EMPTY_LIST;
        this.f18762j = "";
        this.f18763k = "";
    }

    private Field(l lVar, w wVar) {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f18754b = lVar.t();
                            break;
                        case 16:
                            this.f18755c = lVar.t();
                            break;
                        case 24:
                            this.f18756d = lVar.y();
                            break;
                        case 34:
                            this.f18757e = lVar.J();
                            break;
                        case 50:
                            this.f18758f = lVar.J();
                            break;
                        case 56:
                            this.f18759g = lVar.y();
                            break;
                        case 64:
                            this.f18760h = lVar.q();
                            break;
                        case 74:
                            if (!z11) {
                                this.f18761i = new ArrayList();
                                z11 = true;
                            }
                            this.f18761i.add(lVar.A(o1.parser(), wVar));
                            break;
                        case 82:
                            this.f18762j = lVar.J();
                            break;
                        case 90:
                            this.f18763k = lVar.J();
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
                if (z11) {
                    this.f18761i = DesugarCollections.unmodifiableList(this.f18761i);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.f18761i = DesugarCollections.unmodifiableList(this.f18761i);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
