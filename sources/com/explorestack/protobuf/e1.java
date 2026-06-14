package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u;
import com.explorestack.protobuf.z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
abstract class e1 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18983a;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            f18983a = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18983a[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18983a[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Message.Builder f18984a;

        public b(Message.Builder builder) {
            this.f18984a = builder;
        }

        @Override // com.explorestack.protobuf.e1.d
        public u.b a(u uVar, Descriptors.Descriptor descriptor, int i10) {
            uVar.f(descriptor, i10);
            return null;
        }

        @Override // com.explorestack.protobuf.e1.d
        public d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f18984a.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.e1.d
        public d.a b() {
            return d.a.MESSAGE;
        }

        @Override // com.explorestack.protobuf.e1.d
        public Object c(l lVar, w wVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder builderNewBuilderForType = message != null ? message.newBuilderForType() : this.f18984a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) h(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            lVar.B(builderNewBuilderForType, wVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.e1.d
        public d d(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder builderNewBuilderForType = message != null ? message.newBuilderForType() : this.f18984a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) h(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            return new b(builderNewBuilderForType);
        }

        @Override // com.explorestack.protobuf.e1.d
        public Object e(l lVar, w wVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder builderNewBuilderForType = message != null ? message.newBuilderForType() : this.f18984a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) h(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            lVar.x(fieldDescriptor.getNumber(), builderNewBuilderForType, wVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.e1.d
        public u.b f(u uVar, String str) {
            uVar.e(str);
            return null;
        }

        @Override // com.explorestack.protobuf.e1.d
        public Object finish() {
            return this.f18984a.buildPartial();
        }

        @Override // com.explorestack.protobuf.e1.d
        public z2.d g(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return z2.d.f19506c;
            }
            fieldDescriptor.isRepeated();
            return z2.d.f19505b;
        }

        @Override // com.explorestack.protobuf.e1.d
        public Descriptors.Descriptor getDescriptorForType() {
            return this.f18984a.getDescriptorForType();
        }

        @Override // com.explorestack.protobuf.e1.d
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.f18984a.getOneofFieldDescriptor(oneofDescriptor);
        }

        public Object h(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f18984a.getField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.e1.d
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f18984a.hasField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.e1.d
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.f18984a.hasOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.e1.d
        public d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f18984a.setField(fieldDescriptor, obj);
            return this;
        }
    }

    static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f18985a;

        c(c0 c0Var) {
            this.f18985a = c0Var;
        }

        @Override // com.explorestack.protobuf.e1.d
        public u.b a(u uVar, Descriptors.Descriptor descriptor, int i10) {
            uVar.f(descriptor, i10);
            return null;
        }

        @Override // com.explorestack.protobuf.e1.d
        public d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f18985a.g(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.e1.d
        public d.a b() {
            return d.a.EXTENSION_SET;
        }

        @Override // com.explorestack.protobuf.e1.d
        public Object c(l lVar, w wVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder builderNewBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) h(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            lVar.B(builderNewBuilderForType, wVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.e1.d
        public d d(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        @Override // com.explorestack.protobuf.e1.d
        public Object e(l lVar, w wVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder builderNewBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) h(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            lVar.x(fieldDescriptor.getNumber(), builderNewBuilderForType, wVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.e1.d
        public u.b f(u uVar, String str) {
            uVar.e(str);
            return null;
        }

        @Override // com.explorestack.protobuf.e1.d
        public Object finish() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }

        @Override // com.explorestack.protobuf.e1.d
        public z2.d g(Descriptors.FieldDescriptor fieldDescriptor) {
            return fieldDescriptor.needsUtf8Check() ? z2.d.f19506c : z2.d.f19505b;
        }

        @Override // com.explorestack.protobuf.e1.d
        public Descriptors.Descriptor getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        @Override // com.explorestack.protobuf.e1.d
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return null;
        }

        public Object h(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f18985a.s(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.e1.d
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f18985a.z(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.e1.d
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return false;
        }

        @Override // com.explorestack.protobuf.e1.d
        public d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f18985a.L(fieldDescriptor, obj);
            return this;
        }
    }

    interface d {

        public enum a {
            MESSAGE,
            EXTENSION_SET
        }

        u.b a(u uVar, Descriptors.Descriptor descriptor, int i10);

        d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        a b();

        Object c(l lVar, w wVar, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        d d(Descriptors.FieldDescriptor fieldDescriptor, Message message);

        Object e(l lVar, w wVar, Descriptors.FieldDescriptor fieldDescriptor, Message message);

        u.b f(u uVar, String str);

        Object finish();

        z2.d g(Descriptors.FieldDescriptor fieldDescriptor);

        Descriptors.Descriptor getDescriptorForType();

        Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor);

        boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

        boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor);

        d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);
    }

    static String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    static List b(MessageOrBuilder messageOrBuilder) {
        ArrayList arrayList = new ArrayList();
        c(messageOrBuilder, "", arrayList);
        return arrayList;
    }

    private static void c(MessageOrBuilder messageOrBuilder, String str, List list) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                list.add(str + fieldDescriptor.getName());
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) value).iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        c((MessageOrBuilder) it.next(), h(str, key, i10), list);
                        i10++;
                    }
                } else if (messageOrBuilder.hasField(key)) {
                    c((MessageOrBuilder) value, h(str, key, -1), list);
                }
            }
        }
    }

    static int d(Message message, Map map) {
        boolean zE = message.getDescriptorForType().getOptions().E();
        int iF = 0;
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            iF += (zE && fieldDescriptor.isExtension() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !fieldDescriptor.isRepeated()) ? n.F(fieldDescriptor.getNumber(), (Message) value) : c0.p(fieldDescriptor, value);
        }
        r2 unknownFields = message.getUnknownFields();
        return iF + (zE ? unknownFields.f() : unknownFields.getSerializedSize());
    }

    static boolean e(MessageOrBuilder messageOrBuilder) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((Message) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean f(com.explorestack.protobuf.l r6, com.explorestack.protobuf.r2.b r7, com.explorestack.protobuf.w r8, com.explorestack.protobuf.Descriptors.Descriptor r9, com.explorestack.protobuf.e1.d r10, int r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.e1.f(com.explorestack.protobuf.l, com.explorestack.protobuf.r2$b, com.explorestack.protobuf.w, com.explorestack.protobuf.Descriptors$Descriptor, com.explorestack.protobuf.e1$d, int):boolean");
    }

    private static void g(l lVar, r2.b bVar, w wVar, Descriptors.Descriptor descriptor, d dVar) {
        int iL = 0;
        ByteString byteStringR = null;
        while (true) {
            int iK = lVar.K();
            if (iK == 0) {
                break;
            }
            if (iK == z2.f19470c) {
                iL = lVar.L();
                if (iL != 0 && (wVar instanceof u)) {
                    dVar.a((u) wVar, descriptor, iL);
                }
            } else if (iK == z2.f19471d) {
                byteStringR = lVar.r();
            } else if (!lVar.O(iK)) {
                break;
            }
        }
        lVar.a(z2.f19469b);
        if (byteStringR == null || iL == 0 || bVar == null) {
            return;
        }
        bVar.q(iL, r2.c.s().e(byteStringR).g());
    }

    private static String h(String str, Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        if (fieldDescriptor.isExtension()) {
            sb2.append('(');
            sb2.append(fieldDescriptor.getFullName());
            sb2.append(')');
        } else {
            sb2.append(fieldDescriptor.getName());
        }
        if (i10 != -1) {
            sb2.append('[');
            sb2.append(i10);
            sb2.append(']');
        }
        sb2.append('.');
        return sb2.toString();
    }

    static void i(Message message, Map map, n nVar, boolean z10) {
        boolean zE = message.getDescriptorForType().getOptions().E();
        if (z10) {
            TreeMap treeMap = new TreeMap(map);
            for (Descriptors.FieldDescriptor fieldDescriptor : message.getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !treeMap.containsKey(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, message.getField(fieldDescriptor));
                }
            }
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor2 = (Descriptors.FieldDescriptor) entry.getKey();
            Object value = entry.getValue();
            if (zE && fieldDescriptor2.isExtension() && fieldDescriptor2.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !fieldDescriptor2.isRepeated()) {
                nVar.L0(fieldDescriptor2.getNumber(), (Message) value);
            } else {
                c0.Q(fieldDescriptor2, value, nVar);
            }
        }
        r2 unknownFields = message.getUnknownFields();
        if (zE) {
            unknownFields.l(nVar);
        } else {
            unknownFields.writeTo(nVar);
        }
    }
}
