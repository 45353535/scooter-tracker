package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.v0;
import com.explorestack.protobuf.z2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends AbstractMessage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f19358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f19359e;

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends v0.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Descriptors.Descriptor f19365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p1 f19366f;

        class a extends com.explorestack.protobuf.b {
            a() {
            }

            @Override // com.explorestack.protobuf.p1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public u0 parsePartialFrom(l lVar, w wVar) {
                return new u0(c.this, lVar, wVar);
            }
        }

        public c(Descriptors.Descriptor descriptor, u0 u0Var, z2.b bVar, z2.b bVar2) {
            super(bVar, u0Var.f19356b, bVar2, u0Var.f19357c);
            this.f19365e = descriptor;
            this.f19366f = new a();
        }
    }

    private void g(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() == this.f19358d.f19365e) {
            return;
        }
        throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.f19358d.f19365e.getFullName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(c cVar, Object obj) {
        if (cVar.f19372c.d() == z2.c.MESSAGE) {
            return ((MessageLite) obj).isInitialized();
        }
        return true;
    }

    public static u0 n(Descriptors.Descriptor descriptor, z2.b bVar, Object obj, z2.b bVar2, Object obj2) {
        return new u0(descriptor, bVar, obj, bVar2, obj2);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor fieldDescriptor : this.f19358d.f19365e.getFields()) {
            if (hasField(fieldDescriptor)) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
            }
        }
        return DesugarCollections.unmodifiableMap(treeMap);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f19358d.f19365e;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        g(fieldDescriptor);
        Object objI = fieldDescriptor.getNumber() == 1 ? i() : k();
        return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.m4438getEnumType().findValueByNumberCreatingIfUnknown(((Integer) objI).intValue()) : objI;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return this.f19358d.f19366f;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.f19359e != -1) {
            return this.f19359e;
        }
        int iA = v0.a(this.f19358d, this.f19356b, this.f19357c);
        this.f19359e = iA;
        return iA;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public r2 getUnknownFields() {
        return r2.c();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public u0 getDefaultInstanceForType() {
        c cVar = this.f19358d;
        return new u0(cVar, cVar.f19371b, cVar.f19373d);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        g(fieldDescriptor);
        return true;
    }

    public Object i() {
        return this.f19356b;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return l(this.f19358d, this.f19357c);
    }

    final c j() {
        return this.f19358d;
    }

    public Object k() {
        return this.f19357c;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return new b(this.f19358d);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return new b(this.f19358d, this.f19356b, this.f19357c, true, true);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) {
        v0.d(nVar, this.f19358d, this.f19356b, this.f19357c);
    }

    public static class b extends AbstractMessage.Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f19360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f19361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f19362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f19363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19364f;

        private void j(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() == this.f19360b.f19365e) {
                return;
            }
            throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.f19360b.f19365e.getFullName());
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public u0 build() {
            u0 u0VarBuildPartial = buildPartial();
            if (u0VarBuildPartial.isInitialized()) {
                return u0VarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) u0VarBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (Descriptors.FieldDescriptor fieldDescriptor : this.f19360b.f19365e.getFields()) {
                if (hasField(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                }
            }
            return DesugarCollections.unmodifiableMap(treeMap);
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return this.f19360b.f19365e;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            j(fieldDescriptor);
            Object objQ = fieldDescriptor.getNumber() == 1 ? q() : r();
            return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.m4438getEnumType().findValueByNumberCreatingIfUnknown(((Integer) objQ).intValue()) : objQ;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public r2 getUnknownFields() {
            return r2.c();
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            j(fieldDescriptor);
            return fieldDescriptor.getNumber() == 1 ? this.f19363e : this.f19364f;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public u0 buildPartial() {
            return new u0(this.f19360b, this.f19361c, this.f19362d);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return u0.l(this.f19360b, this.f19362d);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            j(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                l();
                return this;
            }
            n();
            return this;
        }

        public b l() {
            this.f19361c = this.f19360b.f19371b;
            this.f19363e = false;
            return this;
        }

        public b n() {
            this.f19362d = this.f19360b.f19373d;
            this.f19364f = false;
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            j(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 2 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return ((Message) this.f19362d).newBuilderForType();
            }
            throw new RuntimeException("\"" + fieldDescriptor.getFullName() + "\" is not a message value field.");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b mo4427clone() {
            return new b(this.f19360b, this.f19361c, this.f19362d, this.f19363e, this.f19364f);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public u0 getDefaultInstanceForType() {
            c cVar = this.f19360b;
            return new u0(cVar, cVar.f19371b, cVar.f19373d);
        }

        public Object q() {
            return this.f19361c;
        }

        public Object r() {
            return this.f19362d;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            j(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                t(obj);
                return this;
            }
            if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                obj = Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber());
            } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && obj != null && !this.f19360b.f19373d.getClass().isInstance(obj)) {
                obj = ((Message) this.f19360b.f19373d).toBuilder().mergeFrom((Message) obj).build();
            }
            w(obj);
            return this;
        }

        public b t(Object obj) {
            this.f19361c = obj;
            this.f19363e = true;
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b setUnknownFields(r2 r2Var) {
            return this;
        }

        public b w(Object obj) {
            this.f19362d = obj;
            this.f19364f = true;
            return this;
        }

        private b(c cVar) {
            this(cVar, cVar.f19371b, cVar.f19373d, false, false);
        }

        private b(c cVar, Object obj, Object obj2, boolean z10, boolean z11) {
            this.f19360b = cVar;
            this.f19361c = obj;
            this.f19362d = obj2;
            this.f19363e = z10;
            this.f19364f = z11;
        }
    }

    private u0(Descriptors.Descriptor descriptor, z2.b bVar, Object obj, z2.b bVar2, Object obj2) {
        this.f19359e = -1;
        this.f19356b = obj;
        this.f19357c = obj2;
        this.f19358d = new c(descriptor, this, bVar, bVar2);
    }

    private u0(c cVar, Object obj, Object obj2) {
        this.f19359e = -1;
        this.f19356b = obj;
        this.f19357c = obj2;
        this.f19358d = cVar;
    }

    private u0(c cVar, l lVar, w wVar) throws InvalidProtocolBufferException {
        this.f19359e = -1;
        try {
            this.f19358d = cVar;
            Map.Entry entryB = v0.b(lVar, cVar, wVar);
            this.f19356b = entryB.getKey();
            this.f19357c = entryB.getValue();
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(this);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
        }
    }
}
