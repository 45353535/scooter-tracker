package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends AbstractMessage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Descriptors.Descriptor f19307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f19308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Descriptors.FieldDescriptor[] f19309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r2 f19310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19311f = -1;

    class a extends com.explorestack.protobuf.b {
        a() {
        }

        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public r parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            b bVarK = r.k(r.this.f19307b);
            try {
                bVarK.mergeFrom(lVar, wVar);
                return bVarK.buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(bVarK.buildPartial());
            } catch (IOException e11) {
                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(bVarK.buildPartial());
            }
        }
    }

    public static final class b extends AbstractMessage.Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Descriptors.Descriptor f19313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c0 f19314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Descriptors.FieldDescriptor[] f19315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r2 f19316e;

        /* synthetic */ b(Descriptors.Descriptor descriptor, a aVar) {
            this(descriptor);
        }

        private void o(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isRepeated()) {
                q(fieldDescriptor, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                q(fieldDescriptor, it.next());
            }
        }

        private void p() {
            if (this.f19314c.A()) {
                this.f19314c = this.f19314c.clone();
            }
        }

        private void q(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            j0.a(obj);
            if (!(obj instanceof Descriptors.EnumValueDescriptor)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        private void y(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.f19313b) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void z(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() != this.f19313b) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            y(fieldDescriptor);
            p();
            this.f19314c.g(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public r build() {
            if (isInitialized()) {
                return buildPartial();
            }
            Descriptors.Descriptor descriptor = this.f19313b;
            c0 c0Var = this.f19314c;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f19315d;
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) new r(descriptor, c0Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.f19316e));
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map getAllFields() {
            return this.f19314c.r();
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return this.f19313b;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            y(fieldDescriptor);
            Object objS = this.f19314c.s(fieldDescriptor);
            return objS == null ? fieldDescriptor.isRepeated() ? Collections.EMPTY_LIST : fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? r.h(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : objS;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            z(oneofDescriptor);
            return this.f19315d[oneofDescriptor.getIndex()];
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            y(fieldDescriptor);
            return this.f19314c.v(fieldDescriptor, i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a dynamic message type.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            y(fieldDescriptor);
            return this.f19314c.w(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public r2 getUnknownFields() {
            return this.f19316e;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            y(fieldDescriptor);
            return this.f19314c.z(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            z(oneofDescriptor);
            return this.f19315d[oneofDescriptor.getIndex()] != null;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public r buildPartial() {
            if (this.f19313b.getOptions().D()) {
                for (Descriptors.FieldDescriptor fieldDescriptor : this.f19313b.getFields()) {
                    if (fieldDescriptor.isOptional() && !this.f19314c.z(fieldDescriptor)) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.f19314c.L(fieldDescriptor, r.h(fieldDescriptor.getMessageType()));
                        } else {
                            this.f19314c.L(fieldDescriptor, fieldDescriptor.getDefaultValue());
                        }
                    }
                }
            }
            this.f19314c.F();
            Descriptors.Descriptor descriptor = this.f19313b;
            c0 c0Var = this.f19314c;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f19315d;
            return new r(descriptor, c0Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.f19316e);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return r.j(this.f19313b, this.f19314c);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b clear() {
            if (this.f19314c.A()) {
                this.f19314c = c0.J();
            } else {
                this.f19314c.h();
            }
            this.f19316e = r2.c();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            y(fieldDescriptor);
            p();
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f19315d;
                if (fieldDescriptorArr[index] == fieldDescriptor) {
                    fieldDescriptorArr[index] = null;
                }
            }
            this.f19314c.i(fieldDescriptor);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            z(oneofDescriptor);
            Descriptors.FieldDescriptor fieldDescriptor = this.f19315d[oneofDescriptor.getIndex()];
            if (fieldDescriptor != null) {
                clearField(fieldDescriptor);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b mo4427clone() {
            b bVar = new b(this.f19313b);
            bVar.f19314c.G(this.f19314c);
            bVar.mergeUnknownFields(this.f19316e);
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f19315d;
            System.arraycopy(fieldDescriptorArr, 0, bVar.f19315d, 0, fieldDescriptorArr.length);
            return bVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public r getDefaultInstanceForType() {
            return r.h(this.f19313b);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (!(message instanceof r)) {
                return (b) super.mergeFrom(message);
            }
            r rVar = (r) message;
            if (rVar.f19307b != this.f19313b) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            p();
            this.f19314c.G(rVar.f19308c);
            mergeUnknownFields(rVar.f19310e);
            int i10 = 0;
            while (true) {
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f19315d;
                if (i10 >= fieldDescriptorArr.length) {
                    return this;
                }
                if (fieldDescriptorArr[i10] == null) {
                    fieldDescriptorArr[i10] = rVar.f19309d[i10];
                } else if (rVar.f19309d[i10] != null && this.f19315d[i10] != rVar.f19309d[i10]) {
                    this.f19314c.i(this.f19315d[i10]);
                    this.f19315d[i10] = rVar.f19309d[i10];
                }
                i10++;
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mergeUnknownFields(r2 r2Var) {
            this.f19316e = r2.h(this.f19316e).x(r2Var).build();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            y(fieldDescriptor);
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return new b(fieldDescriptor.getMessageType());
            }
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            y(fieldDescriptor);
            p();
            if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                o(fieldDescriptor, obj);
            }
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                Descriptors.FieldDescriptor fieldDescriptor2 = this.f19315d[index];
                if (fieldDescriptor2 != null && fieldDescriptor2 != fieldDescriptor) {
                    this.f19314c.i(fieldDescriptor2);
                }
                this.f19315d[index] = fieldDescriptor;
            } else if (fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3 && !fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE && obj.equals(fieldDescriptor.getDefaultValue())) {
                this.f19314c.i(fieldDescriptor);
                return this;
            }
            this.f19314c.L(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            y(fieldDescriptor);
            p();
            this.f19314c.M(fieldDescriptor, i10, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b setUnknownFields(r2 r2Var) {
            this.f19316e = r2Var;
            return this;
        }

        private b(Descriptors.Descriptor descriptor) {
            this.f19313b = descriptor;
            this.f19314c = c0.J();
            this.f19316e = r2.c();
            this.f19315d = new Descriptors.FieldDescriptor[descriptor.toProto().a0()];
        }
    }

    r(Descriptors.Descriptor descriptor, c0 c0Var, Descriptors.FieldDescriptor[] fieldDescriptorArr, r2 r2Var) {
        this.f19307b = descriptor;
        this.f19308c = c0Var;
        this.f19309d = fieldDescriptorArr;
        this.f19310e = r2Var;
    }

    public static r h(Descriptors.Descriptor descriptor) {
        return new r(descriptor, c0.q(), new Descriptors.FieldDescriptor[descriptor.toProto().a0()], r2.c());
    }

    static boolean j(Descriptors.Descriptor descriptor, c0 c0Var) {
        for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
            if (fieldDescriptor.isRequired() && !c0Var.z(fieldDescriptor)) {
                return false;
            }
        }
        return c0Var.B();
    }

    public static b k(Descriptors.Descriptor descriptor) {
        return new b(descriptor, null);
    }

    private void n(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != this.f19307b) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    private void o(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() != this.f19307b) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map getAllFields() {
        return this.f19308c.r();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f19307b;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        n(fieldDescriptor);
        Object objS = this.f19308c.s(fieldDescriptor);
        return objS == null ? fieldDescriptor.isRepeated() ? Collections.EMPTY_LIST : fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? h(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : objS;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        o(oneofDescriptor);
        return this.f19309d[oneofDescriptor.getIndex()];
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return new a();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        n(fieldDescriptor);
        return this.f19308c.v(fieldDescriptor, i10);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        n(fieldDescriptor);
        return this.f19308c.w(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int iX;
        int serializedSize;
        int i10 = this.f19311f;
        if (i10 != -1) {
            return i10;
        }
        if (this.f19307b.getOptions().E()) {
            iX = this.f19308c.t();
            serializedSize = this.f19310e.f();
        } else {
            iX = this.f19308c.x();
            serializedSize = this.f19310e.getSerializedSize();
        }
        int i11 = iX + serializedSize;
        this.f19311f = i11;
        return i11;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public r2 getUnknownFields() {
        return this.f19310e;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        n(fieldDescriptor);
        return this.f19308c.z(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        o(oneofDescriptor);
        return this.f19309d[oneofDescriptor.getIndex()] != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public r getDefaultInstanceForType() {
        return h(this.f19307b);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return j(this.f19307b, this.f19308c);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return new b(this.f19307b, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return newBuilderForType().mergeFrom(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) {
        if (this.f19307b.getOptions().E()) {
            this.f19308c.R(nVar);
            this.f19310e.l(nVar);
        } else {
            this.f19308c.T(nVar);
            this.f19310e.writeTo(nVar);
        }
    }
}
