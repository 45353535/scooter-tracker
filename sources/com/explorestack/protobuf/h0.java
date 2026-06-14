package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.c0;
import com.explorestack.protobuf.e1;
import com.explorestack.protobuf.g0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.m0;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.z2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h0 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected r2 unknownFields;

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractMessage.BuilderParent f19051a;

        a(AbstractMessage.BuilderParent builderParent) {
            this.f19051a = builderParent;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
        public void markDirty() {
            this.f19051a.markDirty();
        }
    }

    public static abstract class b extends AbstractMessage.Builder {
        private c builderParent;
        private boolean isClean;
        private com.explorestack.protobuf.h0$b.a meAsParent;
        private r2 unknownFields;

        private class a implements c {
            private a() {
            }

            @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                b.this.onChanged();
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        protected b() {
            this(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map e() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().f19060a.getFields();
            int fieldCount = 0;
            while (fieldCount < fields.size()) {
                Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
                Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
                if (containingOneof != null) {
                    fieldCount += containingOneof.getFieldCount() - 1;
                    if (hasOneof(containingOneof)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.isRepeated()) {
                    List list = (List) getField(oneofFieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(oneofFieldDescriptor, list);
                    }
                } else if (hasField(oneofFieldDescriptor)) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
                fieldCount++;
            }
            return treeMap;
        }

        private b f(r2 r2Var) {
            this.unknownFields = r2Var;
            onChanged();
            return this;
        }

        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().e(fieldDescriptor).e(this, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public b clear() {
            this.unknownFields = r2.c();
            onChanged();
            return this;
        }

        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            internalGetFieldAccessorTable().e(fieldDescriptor).a(this);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            internalGetFieldAccessorTable().f(oneofDescriptor).a(this);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: clone */
        public b mo4427clone() {
            b bVar = (b) getDefaultInstanceForType().newBuilderForType();
            bVar.mergeFrom(buildPartial());
            return bVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        void dispose() {
            this.builderParent = null;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return DesugarCollections.unmodifiableMap(e());
        }

        public abstract Descriptors.Descriptor getDescriptorForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object objC = internalGetFieldAccessorTable().e(fieldDescriptor).c(this);
            return fieldDescriptor.isRepeated() ? DesugarCollections.unmodifiableList((List) objC) : objC;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).m(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().f(oneofDescriptor).b(this);
        }

        protected c getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new a(this, null);
            }
            return this.meAsParent;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).d(this, i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).n(this, i10);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).l(this);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).g(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().f(oneofDescriptor).d(this);
        }

        protected abstract f internalGetFieldAccessorTable();

        protected w0 internalGetMapField(int i10) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        protected w0 internalGetMutableMapField(int i10) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        protected boolean isClean() {
            return this.isClean;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        protected void markClean() {
            this.isClean = true;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public b mergeUnknownFields(r2 r2Var) {
            return setUnknownFields(r2.h(this.unknownFields).x(r2Var).build());
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).p();
        }

        protected void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        protected final void onChanged() {
            c cVar;
            if (!this.isClean || (cVar = this.builderParent) == null) {
                return;
            }
            cVar.markDirty();
            this.isClean = false;
        }

        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().e(fieldDescriptor).j(this, obj);
            return this;
        }

        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            internalGetFieldAccessorTable().e(fieldDescriptor).k(this, i10, obj);
            return this;
        }

        public b setUnknownFields(r2 r2Var) {
            return f(r2Var);
        }

        protected b setUnknownFieldsProto3(r2 r2Var) {
            return f(r2Var);
        }

        protected b(c cVar) {
            this.unknownFields = r2.c();
            this.builderParent = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface c extends AbstractMessage.BuilderParent {
    }

    public static abstract class d extends b implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c0.b f19054b;

        protected d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c0 i() {
            c0.b bVar = this.f19054b;
            return bVar == null ? c0.q() : bVar.b();
        }

        private void l() {
            if (this.f19054b == null) {
                this.f19054b = c0.I();
            }
        }

        private void r(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.MessageOrBuilder
        public Map getAllFields() {
            Map mapE = e();
            c0.b bVar = this.f19054b;
            if (bVar != null) {
                mapE.putAll(bVar.e());
            }
            return DesugarCollections.unmodifiableMap(mapE);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getField(fieldDescriptor);
            }
            r(fieldDescriptor);
            c0.b bVar = this.f19054b;
            Object objF = bVar == null ? null : bVar.f(fieldDescriptor);
            return objF == null ? fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? r.h(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : objF;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getFieldBuilder(fieldDescriptor);
            }
            r(fieldDescriptor);
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            l();
            Object objG = this.f19054b.g(fieldDescriptor);
            if (objG == null) {
                r.b bVarK = r.k(fieldDescriptor.getMessageType());
                this.f19054b.s(fieldDescriptor, bVarK);
                onChanged();
                return bVarK;
            }
            if (objG instanceof Message.Builder) {
                return (Message.Builder) objG;
            }
            if (!(objG instanceof Message)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Message.Builder builder = ((Message) objG).toBuilder();
            this.f19054b.s(fieldDescriptor, builder);
            onChanged();
            return builder;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedField(fieldDescriptor, i10);
            }
            r(fieldDescriptor);
            c0.b bVar = this.f19054b;
            if (bVar != null) {
                return bVar.h(fieldDescriptor, i10);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldBuilder(fieldDescriptor, i10);
            }
            r(fieldDescriptor);
            l();
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objI = this.f19054b.i(fieldDescriptor, i10);
            if (objI instanceof Message.Builder) {
                return (Message.Builder) objI;
            }
            if (!(objI instanceof Message)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Message.Builder builder = ((Message) objI).toBuilder();
            this.f19054b.t(fieldDescriptor, i10, builder);
            onChanged();
            return builder;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            r(fieldDescriptor);
            c0.b bVar = this.f19054b;
            if (bVar == null) {
                return 0;
            }
            return bVar.j(fieldDescriptor);
        }

        public d h(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (d) super.addRepeatedField(fieldDescriptor, obj);
            }
            r(fieldDescriptor);
            l();
            this.f19054b.a(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.hasField(fieldDescriptor);
            }
            r(fieldDescriptor);
            c0.b bVar = this.f19054b;
            if (bVar == null) {
                return false;
            }
            return bVar.k(fieldDescriptor);
        }

        public d j() {
            this.f19054b = null;
            return (d) super.clear();
        }

        public d k(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return (d) super.clearField(fieldDescriptor);
            }
            r(fieldDescriptor);
            l();
            this.f19054b.c(fieldDescriptor);
            onChanged();
            return this;
        }

        protected boolean n() {
            c0.b bVar = this.f19054b;
            if (bVar == null) {
                return true;
            }
            return bVar.l();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return fieldDescriptor.isExtension() ? r.k(fieldDescriptor.getMessageType()) : super.newBuilderForField(fieldDescriptor);
        }

        protected final void o(e eVar) {
            if (eVar.f19055b != null) {
                l();
                this.f19054b.m(eVar.f19055b);
                onChanged();
            }
        }

        public d p(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (d) super.setField(fieldDescriptor, obj);
            }
            r(fieldDescriptor);
            l();
            this.f19054b.s(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        public d q(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (d) super.setRepeatedField(fieldDescriptor, i10, obj);
            }
            r(fieldDescriptor);
            l();
            this.f19054b.t(fieldDescriptor, i10, obj);
            onChanged();
            return this;
        }

        protected d(c cVar) {
            super(cVar);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Descriptors.Descriptor f19060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a[] f19061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f19062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c[] f19063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f19064e = false;

        private interface a {
            void a(b bVar);

            Object b(h0 h0Var);

            Object c(b bVar);

            Object d(b bVar, int i10);

            void e(b bVar, Object obj);

            boolean f(h0 h0Var);

            boolean g(b bVar);

            int h(h0 h0Var);

            Object i(h0 h0Var, int i10);

            void j(b bVar, Object obj);

            void k(b bVar, int i10, Object obj);

            int l(b bVar);

            Message.Builder m(b bVar);

            Message.Builder n(b bVar, int i10);

            Object o(h0 h0Var);

            Message.Builder p();
        }

        private static class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Descriptors.FieldDescriptor f19065a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Message f19066b;

            b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                this.f19065a = fieldDescriptor;
                this.f19066b = s((h0) h0.g(h0.d(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).j();
            }

            private Message q(Message message) {
                if (message == null) {
                    return null;
                }
                return this.f19066b.getClass().isInstance(message) ? message : this.f19066b.toBuilder().mergeFrom(message).build();
            }

            private w0 r(b bVar) {
                return bVar.internalGetMapField(this.f19065a.getNumber());
            }

            private w0 s(h0 h0Var) {
                return h0Var.internalGetMapField(this.f19065a.getNumber());
            }

            private w0 t(b bVar) {
                return bVar.internalGetMutableMapField(this.f19065a.getNumber());
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void a(b bVar) {
                t(bVar).k().clear();
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object b(h0 h0Var) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < h(h0Var); i10++) {
                    arrayList.add(i(h0Var, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < l(bVar); i10++) {
                    arrayList.add(d(bVar, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object d(b bVar, int i10) {
                return r(bVar).h().get(i10);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void e(b bVar, Object obj) {
                t(bVar).k().add(q((Message) obj));
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public boolean f(h0 h0Var) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public boolean g(b bVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public int h(h0 h0Var) {
                return s(h0Var).h().size();
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object i(h0 h0Var, int i10) {
                return s(h0Var).h().get(i10);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void j(b bVar, Object obj) {
                a(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    e(bVar, it.next());
                }
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void k(b bVar, int i10, Object obj) {
                t(bVar).k().set(i10, q((Message) obj));
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public int l(b bVar) {
                return r(bVar).h().size();
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder m(b bVar) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder n(b bVar, int i10) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object o(h0 h0Var) {
                return b(h0Var);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder p() {
                return this.f19066b.newBuilderForType();
            }
        }

        private static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Descriptors.Descriptor f19067a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Method f19068b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Method f19069c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Method f19070d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Descriptors.FieldDescriptor f19071e;

            c(Descriptors.Descriptor descriptor, int i10, String str, Class cls, Class cls2) {
                this.f19067a = descriptor;
                Descriptors.OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(i10);
                if (oneofDescriptor.isSynthetic()) {
                    this.f19068b = null;
                    this.f19069c = null;
                    this.f19071e = oneofDescriptor.getFields().get(0);
                } else {
                    this.f19068b = h0.d(cls, "get" + str + "Case", new Class[0]);
                    this.f19069c = h0.d(cls2, "get" + str + "Case", new Class[0]);
                    this.f19071e = null;
                }
                this.f19070d = h0.d(cls2, "clear" + str, new Class[0]);
            }

            public void a(b bVar) {
                h0.g(this.f19070d, bVar, new Object[0]);
            }

            public Descriptors.FieldDescriptor b(b bVar) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f19071e;
                if (fieldDescriptor != null) {
                    if (bVar.hasField(fieldDescriptor)) {
                        return this.f19071e;
                    }
                    return null;
                }
                int number = ((j0.c) h0.g(this.f19069c, bVar, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f19067a.findFieldByNumber(number);
                }
                return null;
            }

            public Descriptors.FieldDescriptor c(h0 h0Var) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f19071e;
                if (fieldDescriptor != null) {
                    if (h0Var.hasField(fieldDescriptor)) {
                        return this.f19071e;
                    }
                    return null;
                }
                int number = ((j0.c) h0.g(this.f19068b, h0Var, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f19067a.findFieldByNumber(number);
                }
                return null;
            }

            public boolean d(b bVar) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f19071e;
                return fieldDescriptor != null ? bVar.hasField(fieldDescriptor) : ((j0.c) h0.g(this.f19069c, bVar, new Object[0])).getNumber() != 0;
            }

            public boolean e(h0 h0Var) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f19071e;
                return fieldDescriptor != null ? h0Var.hasField(fieldDescriptor) : ((j0.c) h0.g(this.f19068b, h0Var, new Object[0])).getNumber() != 0;
            }
        }

        private static final class d extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Descriptors.EnumDescriptor f19072c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Method f19073d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Method f19074e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f19075f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Method f19076g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Method f19077h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Method f19078i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Method f19079j;

            d(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.f19072c = fieldDescriptor.m4438getEnumType();
                this.f19073d = h0.d(this.f19080a, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.f19074e = h0.d(this.f19080a, "getValueDescriptor", new Class[0]);
                boolean zSupportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.f19075f = zSupportsUnknownEnumValue;
                if (zSupportsUnknownEnumValue) {
                    Class cls3 = Integer.TYPE;
                    this.f19076g = h0.d(cls, "get" + str + "Value", cls3);
                    this.f19077h = h0.d(cls2, "get" + str + "Value", cls3);
                    this.f19078i = h0.d(cls2, "set" + str + "Value", cls3, cls3);
                    this.f19079j = h0.d(cls2, "add" + str + "Value", cls3);
                }
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public Object b(h0 h0Var) {
                ArrayList arrayList = new ArrayList();
                int iH = h(h0Var);
                for (int i10 = 0; i10 < iH; i10++) {
                    arrayList.add(i(h0Var, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                int iL = l(bVar);
                for (int i10 = 0; i10 < iL; i10++) {
                    arrayList.add(d(bVar, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public Object d(b bVar, int i10) {
                return this.f19075f ? this.f19072c.findValueByNumberCreatingIfUnknown(((Integer) h0.g(this.f19077h, bVar, Integer.valueOf(i10))).intValue()) : h0.g(this.f19074e, super.d(bVar, i10), new Object[0]);
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public void e(b bVar, Object obj) {
                if (this.f19075f) {
                    h0.g(this.f19079j, bVar, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.e(bVar, h0.g(this.f19073d, null, obj));
                }
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public Object i(h0 h0Var, int i10) {
                return this.f19075f ? this.f19072c.findValueByNumberCreatingIfUnknown(((Integer) h0.g(this.f19076g, h0Var, Integer.valueOf(i10))).intValue()) : h0.g(this.f19074e, super.i(h0Var, i10), new Object[0]);
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public void k(b bVar, int i10, Object obj) {
                if (this.f19075f) {
                    h0.g(this.f19078i, bVar, Integer.valueOf(i10), Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.k(bVar, i10, h0.g(this.f19073d, null, obj));
                }
            }
        }

        private static class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            protected final Class f19080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            protected final a f19081b;

            interface a {
                void a(b bVar);

                Object b(h0 h0Var);

                Object c(b bVar);

                Object d(b bVar, int i10);

                void e(b bVar, Object obj);

                int h(h0 h0Var);

                Object i(h0 h0Var, int i10);

                void k(b bVar, int i10, Object obj);

                int l(b bVar);
            }

            private static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                protected final Method f19082a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                protected final Method f19083b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                protected final Method f19084c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                protected final Method f19085d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                protected final Method f19086e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                protected final Method f19087f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                protected final Method f19088g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                protected final Method f19089h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                protected final Method f19090i;

                b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                    this.f19082a = h0.d(cls, "get" + str + "List", new Class[0]);
                    this.f19083b = h0.d(cls2, "get" + str + "List", new Class[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    sb2.append(str);
                    String string = sb2.toString();
                    Class cls3 = Integer.TYPE;
                    Method methodD = h0.d(cls, string, cls3);
                    this.f19084c = methodD;
                    this.f19085d = h0.d(cls2, "get" + str, cls3);
                    Class<?> returnType = methodD.getReturnType();
                    this.f19086e = h0.d(cls2, "set" + str, cls3, returnType);
                    this.f19087f = h0.d(cls2, "add" + str, returnType);
                    this.f19088g = h0.d(cls, "get" + str + "Count", new Class[0]);
                    this.f19089h = h0.d(cls2, "get" + str + "Count", new Class[0]);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("clear");
                    sb3.append(str);
                    this.f19090i = h0.d(cls2, sb3.toString(), new Class[0]);
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public void a(b bVar) {
                    h0.g(this.f19090i, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public Object b(h0 h0Var) {
                    return h0.g(this.f19082a, h0Var, new Object[0]);
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public Object c(b bVar) {
                    return h0.g(this.f19083b, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public Object d(b bVar, int i10) {
                    return h0.g(this.f19085d, bVar, Integer.valueOf(i10));
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public void e(b bVar, Object obj) {
                    h0.g(this.f19087f, bVar, obj);
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public int h(h0 h0Var) {
                    return ((Integer) h0.g(this.f19088g, h0Var, new Object[0])).intValue();
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public Object i(h0 h0Var, int i10) {
                    return h0.g(this.f19084c, h0Var, Integer.valueOf(i10));
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public void k(b bVar, int i10, Object obj) {
                    h0.g(this.f19086e, bVar, Integer.valueOf(i10), obj);
                }

                @Override // com.explorestack.protobuf.h0.f.e.a
                public int l(b bVar) {
                    return ((Integer) h0.g(this.f19089h, bVar, new Object[0])).intValue();
                }
            }

            e(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                b bVar = new b(fieldDescriptor, str, cls, cls2);
                this.f19080a = bVar.f19084c.getReturnType();
                this.f19081b = q(bVar);
            }

            static a q(b bVar) {
                return bVar;
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void a(b bVar) {
                this.f19081b.a(bVar);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object b(h0 h0Var) {
                return this.f19081b.b(h0Var);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object c(b bVar) {
                return this.f19081b.c(bVar);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object d(b bVar, int i10) {
                return this.f19081b.d(bVar, i10);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void e(b bVar, Object obj) {
                this.f19081b.e(bVar, obj);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public boolean f(h0 h0Var) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public boolean g(b bVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public int h(h0 h0Var) {
                return this.f19081b.h(h0Var);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object i(h0 h0Var, int i10) {
                return this.f19081b.i(h0Var, i10);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void j(b bVar, Object obj) {
                a(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    e(bVar, it.next());
                }
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void k(b bVar, int i10, Object obj) {
                this.f19081b.k(bVar, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public int l(b bVar) {
                return this.f19081b.l(bVar);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder m(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder n(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object o(h0 h0Var) {
                return b(h0Var);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder p() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.h0$f$f, reason: collision with other inner class name */
        private static final class C0323f extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Method f19091c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Method f19092d;

            C0323f(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.f19091c = h0.d(this.f19080a, "newBuilder", new Class[0]);
                this.f19092d = h0.d(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            private Object r(Object obj) {
                return this.f19080a.isInstance(obj) ? obj : ((Message.Builder) h0.g(this.f19091c, null, new Object[0])).mergeFrom((Message) obj).build();
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public void e(b bVar, Object obj) {
                super.e(bVar, r(obj));
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public void k(b bVar, int i10, Object obj) {
                super.k(bVar, i10, r(obj));
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public Message.Builder n(b bVar, int i10) {
                return (Message.Builder) h0.g(this.f19092d, bVar, Integer.valueOf(i10));
            }

            @Override // com.explorestack.protobuf.h0.f.e, com.explorestack.protobuf.h0.f.a
            public Message.Builder p() {
                return (Message.Builder) h0.g(this.f19091c, null, new Object[0]);
            }
        }

        private static final class g extends h {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Descriptors.EnumDescriptor f19093f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Method f19094g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Method f19095h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f19096i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Method f19097j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Method f19098k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Method f19099l;

            g(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f19093f = fieldDescriptor.m4438getEnumType();
                this.f19094g = h0.d(this.f19100a, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.f19095h = h0.d(this.f19100a, "getValueDescriptor", new Class[0]);
                boolean zSupportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.f19096i = zSupportsUnknownEnumValue;
                if (zSupportsUnknownEnumValue) {
                    this.f19097j = h0.d(cls, "get" + str + "Value", new Class[0]);
                    this.f19098k = h0.d(cls2, "get" + str + "Value", new Class[0]);
                    this.f19099l = h0.d(cls2, "set" + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public Object b(h0 h0Var) {
                if (!this.f19096i) {
                    return h0.g(this.f19095h, super.b(h0Var), new Object[0]);
                }
                return this.f19093f.findValueByNumberCreatingIfUnknown(((Integer) h0.g(this.f19097j, h0Var, new Object[0])).intValue());
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public Object c(b bVar) {
                if (!this.f19096i) {
                    return h0.g(this.f19095h, super.c(bVar), new Object[0]);
                }
                return this.f19093f.findValueByNumberCreatingIfUnknown(((Integer) h0.g(this.f19098k, bVar, new Object[0])).intValue());
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public void j(b bVar, Object obj) {
                if (this.f19096i) {
                    h0.g(this.f19099l, bVar, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.j(bVar, h0.g(this.f19094g, null, obj));
                }
            }
        }

        private static class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            protected final Class f19100a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            protected final Descriptors.FieldDescriptor f19101b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            protected final boolean f19102c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            protected final boolean f19103d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            protected final a f19104e;

            private interface a {
                void a(b bVar);

                Object b(h0 h0Var);

                Object c(b bVar);

                int d(h0 h0Var);

                int e(b bVar);

                boolean f(h0 h0Var);

                boolean g(b bVar);

                void j(b bVar, Object obj);
            }

            private static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                protected final Method f19105a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                protected final Method f19106b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                protected final Method f19107c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                protected final Method f19108d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                protected final Method f19109e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                protected final Method f19110f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                protected final Method f19111g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                protected final Method f19112h;

                b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2, boolean z10, boolean z11) {
                    Method methodD;
                    Method methodD2;
                    Method methodD3;
                    Method methodD4 = h0.d(cls, "get" + str, new Class[0]);
                    this.f19105a = methodD4;
                    this.f19106b = h0.d(cls2, "get" + str, new Class[0]);
                    this.f19107c = h0.d(cls2, "set" + str, methodD4.getReturnType());
                    Method methodD5 = null;
                    if (z11) {
                        methodD = h0.d(cls, "has" + str, new Class[0]);
                    } else {
                        methodD = null;
                    }
                    this.f19108d = methodD;
                    if (z11) {
                        methodD2 = h0.d(cls2, "has" + str, new Class[0]);
                    } else {
                        methodD2 = null;
                    }
                    this.f19109e = methodD2;
                    this.f19110f = h0.d(cls2, "clear" + str, new Class[0]);
                    if (z10) {
                        methodD3 = h0.d(cls, "get" + str2 + "Case", new Class[0]);
                    } else {
                        methodD3 = null;
                    }
                    this.f19111g = methodD3;
                    if (z10) {
                        methodD5 = h0.d(cls2, "get" + str2 + "Case", new Class[0]);
                    }
                    this.f19112h = methodD5;
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public void a(b bVar) {
                    h0.g(this.f19110f, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public Object b(h0 h0Var) {
                    return h0.g(this.f19105a, h0Var, new Object[0]);
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public Object c(b bVar) {
                    return h0.g(this.f19106b, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public int d(h0 h0Var) {
                    return ((j0.c) h0.g(this.f19111g, h0Var, new Object[0])).getNumber();
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public int e(b bVar) {
                    return ((j0.c) h0.g(this.f19112h, bVar, new Object[0])).getNumber();
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public boolean f(h0 h0Var) {
                    return ((Boolean) h0.g(this.f19108d, h0Var, new Object[0])).booleanValue();
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public boolean g(b bVar) {
                    return ((Boolean) h0.g(this.f19109e, bVar, new Object[0])).booleanValue();
                }

                @Override // com.explorestack.protobuf.h0.f.h.a
                public void j(b bVar, Object obj) {
                    h0.g(this.f19107c, bVar, obj);
                }
            }

            h(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                boolean z10 = (fieldDescriptor.getContainingOneof() == null || fieldDescriptor.getContainingOneof().isSynthetic()) ? false : true;
                this.f19102c = z10;
                boolean z11 = fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.hasOptionalKeyword() || (!z10 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
                this.f19103d = z11;
                b bVar = new b(fieldDescriptor, str, cls, cls2, str2, z10, z11);
                this.f19101b = fieldDescriptor;
                this.f19100a = bVar.f19105a.getReturnType();
                this.f19104e = q(bVar);
            }

            static a q(b bVar) {
                return bVar;
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void a(b bVar) {
                this.f19104e.a(bVar);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object b(h0 h0Var) {
                return this.f19104e.b(h0Var);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object c(b bVar) {
                return this.f19104e.c(bVar);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object d(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void e(b bVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public boolean f(h0 h0Var) {
                return !this.f19103d ? this.f19102c ? this.f19104e.d(h0Var) == this.f19101b.getNumber() : !b(h0Var).equals(this.f19101b.getDefaultValue()) : this.f19104e.f(h0Var);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public boolean g(b bVar) {
                return !this.f19103d ? this.f19102c ? this.f19104e.e(bVar) == this.f19101b.getNumber() : !c(bVar).equals(this.f19101b.getDefaultValue()) : this.f19104e.g(bVar);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public int h(h0 h0Var) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object i(h0 h0Var, int i10) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void j(b bVar, Object obj) {
                this.f19104e.j(bVar, obj);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public void k(b bVar, int i10, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public int l(b bVar) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder m(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder n(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Object o(h0 h0Var) {
                return b(h0Var);
            }

            @Override // com.explorestack.protobuf.h0.f.a
            public Message.Builder p() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }
        }

        private static final class i extends h {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Method f19113f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Method f19114g;

            i(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f19113f = h0.d(this.f19100a, "newBuilder", new Class[0]);
                this.f19114g = h0.d(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object r(Object obj) {
                return this.f19100a.isInstance(obj) ? obj : ((Message.Builder) h0.g(this.f19113f, null, new Object[0])).mergeFrom((Message) obj).buildPartial();
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public void j(b bVar, Object obj) {
                super.j(bVar, r(obj));
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public Message.Builder m(b bVar) {
                return (Message.Builder) h0.g(this.f19114g, bVar, new Object[0]);
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public Message.Builder p() {
                return (Message.Builder) h0.g(this.f19113f, null, new Object[0]);
            }
        }

        private static final class j extends h {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Method f19115f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Method f19116g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Method f19117h;

            j(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f19115f = h0.d(cls, "get" + str + "Bytes", new Class[0]);
                this.f19116g = h0.d(cls2, "get" + str + "Bytes", new Class[0]);
                this.f19117h = h0.d(cls2, "set" + str + "Bytes", ByteString.class);
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public void j(b bVar, Object obj) {
                if (obj instanceof ByteString) {
                    h0.g(this.f19117h, bVar, obj);
                } else {
                    super.j(bVar, obj);
                }
            }

            @Override // com.explorestack.protobuf.h0.f.h, com.explorestack.protobuf.h0.f.a
            public Object o(h0 h0Var) {
                return h0.g(this.f19115f, h0Var, new Object[0]);
            }
        }

        public f(Descriptors.Descriptor descriptor, String[] strArr) {
            this.f19060a = descriptor;
            this.f19062c = strArr;
            this.f19061b = new a[descriptor.getFields().size()];
            this.f19063d = new c[descriptor.getOneofs().size()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a e(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.f19060a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fieldDescriptor.isExtension()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f19061b[fieldDescriptor.getIndex()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c f(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() == this.f19060a) {
                return this.f19063d[oneofDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public f d(Class cls, Class cls2) {
            if (this.f19064e) {
                return this;
            }
            synchronized (this) {
                try {
                    if (this.f19064e) {
                        return this;
                    }
                    int length = this.f19061b.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        Descriptors.FieldDescriptor fieldDescriptor = this.f19060a.getFields().get(i10);
                        String str = fieldDescriptor.getContainingOneof() != null ? this.f19062c[fieldDescriptor.getContainingOneof().getIndex() + length] : null;
                        if (fieldDescriptor.isRepeated()) {
                            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                                if (fieldDescriptor.isMapField()) {
                                    this.f19061b[i10] = new b(fieldDescriptor, this.f19062c[i10], cls, cls2);
                                } else {
                                    this.f19061b[i10] = new C0323f(fieldDescriptor, this.f19062c[i10], cls, cls2);
                                }
                            } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                                this.f19061b[i10] = new d(fieldDescriptor, this.f19062c[i10], cls, cls2);
                            } else {
                                this.f19061b[i10] = new e(fieldDescriptor, this.f19062c[i10], cls, cls2);
                            }
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.f19061b[i10] = new i(fieldDescriptor, this.f19062c[i10], cls, cls2, str);
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.f19061b[i10] = new g(fieldDescriptor, this.f19062c[i10], cls, cls2, str);
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                            this.f19061b[i10] = new j(fieldDescriptor, this.f19062c[i10], cls, cls2, str);
                        } else {
                            this.f19061b[i10] = new h(fieldDescriptor, this.f19062c[i10], cls, cls2, str);
                        }
                        i10++;
                    }
                    int length2 = this.f19063d.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        this.f19063d[i11] = new c(this.f19060a, i11, this.f19062c[i11 + length], cls, cls2);
                    }
                    this.f19064e = true;
                    this.f19062c = null;
                    return this;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f19118a = new g();

        private g() {
        }
    }

    protected h0() {
        this.unknownFields = r2.c();
    }

    static /* synthetic */ s access$500(t tVar) {
        b(tVar);
        return null;
    }

    private static s b(t tVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map c(boolean r7) {
        /*
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.explorestack.protobuf.h0$f r1 = r6.internalGetFieldAccessorTable()
            com.explorestack.protobuf.Descriptors$Descriptor r1 = com.explorestack.protobuf.h0.f.a(r1)
            java.util.List r1 = r1.getFields()
            r2 = 0
        L12:
            int r3 = r1.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r1.get(r2)
            com.explorestack.protobuf.Descriptors$FieldDescriptor r3 = (com.explorestack.protobuf.Descriptors.FieldDescriptor) r3
            com.explorestack.protobuf.Descriptors$OneofDescriptor r4 = r3.getContainingOneof()
            if (r4 == 0) goto L37
            int r3 = r4.getFieldCount()
            int r3 = r3 + (-1)
            int r2 = r2 + r3
            boolean r3 = r6.hasOneof(r4)
            if (r3 != 0) goto L32
            goto L6d
        L32:
            com.explorestack.protobuf.Descriptors$FieldDescriptor r3 = r6.getOneofFieldDescriptor(r4)
            goto L54
        L37:
            boolean r4 = r3.isRepeated()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r6.getField(r3)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L6d
            r0.put(r3, r4)
            goto L6d
        L4d:
            boolean r4 = r6.hasField(r3)
            if (r4 != 0) goto L54
            goto L6d
        L54:
            if (r7 == 0) goto L66
            com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r4 = r3.getJavaType()
            com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.STRING
            if (r4 != r5) goto L66
            java.lang.Object r4 = r6.getFieldRaw(r3)
            r0.put(r3, r4)
            goto L6d
        L66:
            java.lang.Object r4 = r6.getField(r3)
            r0.put(r3, r4)
        L6d:
            int r2 = r2 + 1
            goto L12
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.h0.c(boolean):java.util.Map");
    }

    protected static boolean canUseUnsafe() {
        return w2.J() && w2.K();
    }

    protected static int computeStringSize(int i10, Object obj) {
        return obj instanceof String ? n.V(i10, (String) obj) : n.h(i10, (ByteString) obj);
    }

    protected static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? n.W((String) obj) : n.i((ByteString) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method d(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    protected static j0.a emptyBooleanList() {
        return h.j();
    }

    protected static j0.b emptyDoubleList() {
        return p.j();
    }

    protected static j0.f emptyFloatList() {
        return e0.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static j0.g emptyIntList() {
        return i0.j();
    }

    protected static j0.i emptyLongList() {
        return s0.j();
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object g(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    private static void h(n nVar, Map map, u0 u0Var, int i10, boolean z10) {
        if (map.containsKey(Boolean.valueOf(z10))) {
            nVar.J0(i10, u0Var.newBuilderForType().t(Boolean.valueOf(z10)).w(map.get(Boolean.valueOf(z10))).build());
        }
    }

    private static void i(n nVar, Map map, u0 u0Var, int i10) {
        for (Map.Entry entry : map.entrySet()) {
            nVar.J0(i10, u0Var.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static j0.g mutableCopy(j0.g gVar) {
        int size = gVar.size();
        return gVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static j0.a newBooleanList() {
        return new h();
    }

    protected static j0.b newDoubleList() {
        return new p();
    }

    protected static j0.f newFloatList() {
        return new e0();
    }

    protected static j0.g newIntList() {
        return new i0();
    }

    protected static j0.i newLongList() {
        return new s0();
    }

    protected static <M extends Message> M parseDelimitedWithIOException(p1 p1Var, InputStream inputStream) throws IOException {
        try {
            return (M) p1Var.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(p1 p1Var, InputStream inputStream) throws IOException {
        try {
            return (M) p1Var.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static <V> void serializeBooleanMapTo(n nVar, w0 w0Var, u0 u0Var, int i10) throws IOException {
        Map mapI = w0Var.i();
        if (!nVar.g0()) {
            i(nVar, mapI, u0Var, i10);
        } else {
            h(nVar, mapI, u0Var, i10, false);
            h(nVar, mapI, u0Var, i10, true);
        }
    }

    protected static <V> void serializeIntegerMapTo(n nVar, w0 w0Var, u0 u0Var, int i10) throws IOException {
        Map mapI = w0Var.i();
        if (!nVar.g0()) {
            i(nVar, mapI, u0Var, i10);
            return;
        }
        int size = mapI.size();
        int[] iArr = new int[size];
        Iterator it = mapI.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            nVar.J0(i10, u0Var.newBuilderForType().t(Integer.valueOf(i13)).w(mapI.get(Integer.valueOf(i13))).build());
        }
    }

    protected static <V> void serializeLongMapTo(n nVar, w0 w0Var, u0 u0Var, int i10) throws IOException {
        Map mapI = w0Var.i();
        if (!nVar.g0()) {
            i(nVar, mapI, u0Var, i10);
            return;
        }
        int size = mapI.size();
        long[] jArr = new long[size];
        Iterator it = mapI.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            nVar.J0(i10, u0Var.newBuilderForType().t(Long.valueOf(j10)).w(mapI.get(Long.valueOf(j10))).build());
        }
    }

    protected static <V> void serializeStringMapTo(n nVar, w0 w0Var, u0 u0Var, int i10) throws IOException {
        Map mapI = w0Var.i();
        if (!nVar.g0()) {
            i(nVar, mapI, u0Var, i10);
            return;
        }
        String[] strArr = (String[]) mapI.keySet().toArray(new String[mapI.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            nVar.J0(i10, u0Var.newBuilderForType().t(str).w(mapI.get(str)).build());
        }
    }

    static void setAlwaysUseFieldBuildersForTesting(boolean z10) {
        alwaysUseFieldBuilders = z10;
    }

    protected static void writeString(n nVar, int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            nVar.T0(i10, (String) obj);
        } else {
            nVar.r0(i10, (ByteString) obj);
        }
    }

    protected static void writeStringNoTag(n nVar, Object obj) throws IOException {
        if (obj instanceof String) {
            nVar.U0((String) obj);
        } else {
            nVar.s0((ByteString) obj);
        }
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return DesugarCollections.unmodifiableMap(c(false));
    }

    Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return DesugarCollections.unmodifiableMap(c(true));
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().f19060a;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).b(this);
    }

    Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).o(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().f(oneofDescriptor).c(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).i(this, i10);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).h(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).f(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().f(oneofDescriptor).e(this);
    }

    protected abstract f internalGetFieldAccessorTable();

    protected w0 internalGetMapField(int i10) {
        throw new RuntimeException("No map fields found in " + getClass().getName());
    }

    protected void makeExtensionsImmutable() {
    }

    protected void mergeFromAndMakeImmutableInternal(l lVar, w wVar) throws InvalidProtocolBufferException {
        x1 x1VarD = s1.a().d(this);
        try {
            x1VarD.a(this, m.f(lVar), wVar);
            x1VarD.makeImmutable(this);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(this);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage
    protected Message.Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType((c) new a(builderParent));
    }

    protected abstract Message.Builder newBuilderForType(c cVar);

    protected abstract Object newInstance(g gVar);

    protected boolean parseUnknownField(l lVar, r2.b bVar, w wVar, int i10) throws IOException {
        return lVar.N() ? lVar.O(i10) : bVar.r(i10, lVar);
    }

    protected boolean parseUnknownFieldProto3(l lVar, r2.b bVar, w wVar, int i10) throws IOException {
        return parseUnknownField(lVar, bVar, wVar, i10);
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new g0.c(this);
    }

    public static abstract class e extends h0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f19055b;

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator f19056a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry f19057b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f19058c;

            /* synthetic */ a(e eVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, n nVar) {
                while (true) {
                    Map.Entry entry = this.f19057b;
                    if (entry == null || ((Descriptors.FieldDescriptor) entry.getKey()).getNumber() >= i10) {
                        return;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) this.f19057b.getKey();
                    if (!this.f19058c || fieldDescriptor.getLiteJavaType() != z2.c.MESSAGE || fieldDescriptor.isRepeated()) {
                        c0.Q(fieldDescriptor, this.f19057b.getValue(), nVar);
                    } else if (this.f19057b instanceof m0.b) {
                        nVar.M0(fieldDescriptor.getNumber(), ((m0.b) this.f19057b).a().c());
                    } else {
                        nVar.L0(fieldDescriptor.getNumber(), (Message) this.f19057b.getValue());
                    }
                    if (this.f19056a.hasNext()) {
                        this.f19057b = (Map.Entry) this.f19056a.next();
                    } else {
                        this.f19057b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator itE = e.this.f19055b.E();
                this.f19056a = itE;
                if (itE.hasNext()) {
                    this.f19057b = (Map.Entry) itE.next();
                }
                this.f19058c = z10;
            }
        }

        protected e() {
            this.f19055b = c0.J();
        }

        private void o(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.MessageOrBuilder
        public Map getAllFields() {
            Map mapC = c(false);
            mapC.putAll(m());
            return DesugarCollections.unmodifiableMap(mapC);
        }

        @Override // com.explorestack.protobuf.h0
        public Map getAllFieldsRaw() {
            Map mapC = c(false);
            mapC.putAll(m());
            return DesugarCollections.unmodifiableMap(mapC);
        }

        @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getField(fieldDescriptor);
            }
            o(fieldDescriptor);
            Object objS = this.f19055b.s(fieldDescriptor);
            return objS == null ? fieldDescriptor.isRepeated() ? Collections.EMPTY_LIST : fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? r.h(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : objS;
        }

        @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedField(fieldDescriptor, i10);
            }
            o(fieldDescriptor);
            return this.f19055b.v(fieldDescriptor, i10);
        }

        @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            o(fieldDescriptor);
            return this.f19055b.w(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.hasField(fieldDescriptor);
            }
            o(fieldDescriptor);
            return this.f19055b.z(fieldDescriptor);
        }

        protected boolean k() {
            return this.f19055b.B();
        }

        protected int l() {
            return this.f19055b.x();
        }

        protected Map m() {
            return this.f19055b.r();
        }

        @Override // com.explorestack.protobuf.h0
        protected void makeExtensionsImmutable() {
            this.f19055b.F();
        }

        protected a n() {
            return new a(this, false, null);
        }

        @Override // com.explorestack.protobuf.h0
        protected boolean parseUnknownField(l lVar, r2.b bVar, w wVar, int i10) {
            if (lVar.N()) {
                bVar = null;
            }
            return e1.f(lVar, bVar, wVar, getDescriptorForType(), new e1.c(this.f19055b), i10);
        }

        @Override // com.explorestack.protobuf.h0
        protected boolean parseUnknownFieldProto3(l lVar, r2.b bVar, w wVar, int i10) {
            return parseUnknownField(lVar, bVar, wVar, i10);
        }

        protected e(d dVar) {
            super(dVar);
            this.f19055b = dVar.i();
        }
    }

    protected h0(b bVar) {
        this.unknownFields = bVar.getUnknownFields();
    }

    protected static j0.i mutableCopy(j0.i iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <M extends Message> M parseDelimitedWithIOException(p1 p1Var, InputStream inputStream, w wVar) throws IOException {
        try {
            return (M) p1Var.parseDelimitedFrom(inputStream, wVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(p1 p1Var, InputStream inputStream, w wVar) throws IOException {
        try {
            return (M) p1Var.parseFrom(inputStream, wVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static j0.f mutableCopy(j0.f fVar) {
        int size = fVar.size();
        return fVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <M extends Message> M parseWithIOException(p1 p1Var, l lVar) throws IOException {
        try {
            return (M) p1Var.parseFrom(lVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static j0.b mutableCopy(j0.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <M extends Message> M parseWithIOException(p1 p1Var, l lVar, w wVar) throws IOException {
        try {
            return (M) p1Var.parseFrom(lVar, wVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static j0.a mutableCopy(j0.a aVar) {
        int size = aVar.size();
        return aVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }
}
