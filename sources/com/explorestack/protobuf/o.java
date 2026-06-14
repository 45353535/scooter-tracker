package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.g2;
import com.explorestack.protobuf.j0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes7.dex */
final class o implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f19248a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f19249b = new HashSet(Arrays.asList("cached_size", "serialized_size", "class"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f19250c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19251d = 0;

    static class a implements j0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Descriptors.FieldDescriptor f19252a;

        a(Descriptors.FieldDescriptor fieldDescriptor) {
            this.f19252a = fieldDescriptor;
        }

        @Override // com.explorestack.protobuf.j0.e
        public boolean isInRange(int i10) {
            return this.f19252a.m4438getEnumType().m4437findValueByNumber(i10) != null;
        }
    }

    static class b implements j0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Descriptors.FieldDescriptor f19253a;

        b(Descriptors.FieldDescriptor fieldDescriptor) {
            this.f19253a = fieldDescriptor;
        }

        @Override // com.explorestack.protobuf.j0.e
        public boolean isInRange(int i10) {
            return this.f19253a.m4438getEnumType().m4437findValueByNumber(i10) != null;
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f19256c;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            f19256c = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19256c[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[l0.values().length];
            f19255b = iArr2;
            try {
                iArr2[l0.f19198j.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19255b[l0.f19200l.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19255b[l0.f19197i.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19255b[l0.f19196h.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19255b[l0.f19201m.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19255b[l0.f19194f.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19255b[l0.f19195g.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19255b[l0.f19199k.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19255b[l0.f19202n.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr3 = new int[Descriptors.FileDescriptor.Syntax.values().length];
            f19254a = iArr3;
            try {
                iArr3[Descriptors.FileDescriptor.Syntax.PROTO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f19254a[Descriptors.FileDescriptor.Syntax.PROTO3.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    private o() {
    }

    private static java.lang.reflect.Field c(Class cls, int i10) {
        return k(cls, "bitField" + i10 + "_");
    }

    private static b0 d(Class cls, Descriptors.FieldDescriptor fieldDescriptor, e eVar, boolean z10, j0.e eVar2) {
        n1 n1VarA = eVar.a(cls, fieldDescriptor.getContainingOneof());
        d0 d0VarO = o(fieldDescriptor);
        return b0.g(fieldDescriptor.getNumber(), d0VarO, n1VarA, p(cls, fieldDescriptor, d0VarO), z10, eVar2);
    }

    private static java.lang.reflect.Field e(Class cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return k(cls, l(fieldDescriptor));
    }

    private static c1 f(Class cls, Descriptors.Descriptor descriptor) {
        int i10 = c.f19254a[descriptor.getFile().getSyntax().ordinal()];
        if (i10 == 1) {
            return g(cls, descriptor);
        }
        if (i10 == 2) {
            return h(cls, descriptor);
        }
        throw new IllegalArgumentException("Unsupported syntax: " + descriptor.getFile().getSyntax());
    }

    private static g2 g(Class cls, Descriptors.Descriptor descriptor) {
        java.lang.reflect.Field field;
        List<Descriptors.FieldDescriptor> fields = descriptor.getFields();
        g2.a aVarC = g2.c(fields.size());
        aVarC.c(m(cls));
        aVarC.f(r1.PROTO2);
        aVarC.e(descriptor.getOptions().E());
        a aVar = null;
        e eVar = new e(aVar);
        java.lang.reflect.Field fieldC = null;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < fields.size()) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i11);
            boolean zO0 = fieldDescriptor.getFile().getOptions().o0();
            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.ENUM;
            j0.e aVar2 = javaType == javaType2 ? new a(fieldDescriptor) : aVar;
            if (fieldDescriptor.getContainingOneof() != null) {
                aVarC.d(d(cls, fieldDescriptor, eVar, zO0, aVar2));
            } else {
                java.lang.reflect.Field fieldJ = j(cls, fieldDescriptor);
                int number = fieldDescriptor.getNumber();
                d0 d0VarO = o(fieldDescriptor);
                if (fieldDescriptor.isMapField()) {
                    Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = fieldDescriptor.getMessageType().findFieldByNumber(2);
                    if (fieldDescriptorFindFieldByNumber.getJavaType() == javaType2) {
                        aVar2 = new b(fieldDescriptorFindFieldByNumber);
                    }
                    aVarC.d(b0.f(fieldJ, number, z1.B(cls, fieldDescriptor.getName()), aVar2));
                } else if (!fieldDescriptor.isRepeated()) {
                    if (fieldC == null) {
                        fieldC = c(cls, i12);
                    }
                    if (fieldDescriptor.isRequired()) {
                        field = fieldC;
                        aVarC.d(b0.k(fieldJ, number, d0VarO, field, i10, zO0, aVar2));
                    } else {
                        field = fieldC;
                        aVarC.d(b0.j(fieldJ, number, d0VarO, field, i10, zO0, aVar2));
                    }
                    fieldC = field;
                } else if (aVar2 != null) {
                    if (fieldDescriptor.isPacked()) {
                        aVarC.d(b0.i(fieldJ, number, d0VarO, aVar2, e(cls, fieldDescriptor)));
                    } else {
                        aVarC.d(b0.e(fieldJ, number, d0VarO, aVar2));
                    }
                } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    aVarC.d(b0.l(fieldJ, number, d0VarO, r(cls, fieldDescriptor)));
                } else if (fieldDescriptor.isPacked()) {
                    aVarC.d(b0.h(fieldJ, number, d0VarO, e(cls, fieldDescriptor)));
                } else {
                    aVarC.d(b0.d(fieldJ, number, d0VarO, zO0));
                }
                i11++;
                aVar = null;
            }
            i10 <<= 1;
            if (i10 == 0) {
                i12++;
                i10 = 1;
                fieldC = null;
            }
            i11++;
            aVar = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < fields.size(); i13++) {
            Descriptors.FieldDescriptor fieldDescriptor2 = fields.get(i13);
            if (fieldDescriptor2.isRequired() || (fieldDescriptor2.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && t(fieldDescriptor2.getMessageType()))) {
                arrayList.add(Integer.valueOf(fieldDescriptor2.getNumber()));
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        aVarC.b(iArr);
        return aVarC.a();
    }

    private static g2 h(Class cls, Descriptors.Descriptor descriptor) {
        List<Descriptors.FieldDescriptor> fields = descriptor.getFields();
        g2.a aVarC = g2.c(fields.size());
        aVarC.c(m(cls));
        aVarC.f(r1.PROTO3);
        e eVar = new e(null);
        for (int i10 = 0; i10 < fields.size(); i10++) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i10);
            if (fieldDescriptor.getContainingOneof() != null) {
                aVarC.d(d(cls, fieldDescriptor, eVar, true, null));
            } else if (fieldDescriptor.isMapField()) {
                aVarC.d(b0.f(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), z1.B(cls, fieldDescriptor.getName()), null));
            } else if (fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                aVarC.d(b0.l(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), o(fieldDescriptor), r(cls, fieldDescriptor)));
            } else if (fieldDescriptor.isPacked()) {
                aVarC.d(b0.h(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), o(fieldDescriptor), e(cls, fieldDescriptor)));
            } else {
                aVarC.d(b0.d(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), o(fieldDescriptor), true));
            }
        }
        return aVarC.a();
    }

    private static Descriptors.Descriptor i(Class cls) {
        return m(cls).getDescriptorForType();
    }

    private static java.lang.reflect.Field j(Class cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return k(cls, n(fieldDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field k(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unable to find field " + str + " in message class " + cls.getName());
        }
    }

    private static String l(Descriptors.FieldDescriptor fieldDescriptor) {
        return u(fieldDescriptor.getName()) + "MemoizedSerializedSize";
    }

    private static Message m(Class cls) {
        try {
            return (Message) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e10) {
            throw new IllegalArgumentException("Unable to get default instance for message class " + cls.getName(), e10);
        }
    }

    static String n(Descriptors.FieldDescriptor fieldDescriptor) {
        String name = fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName();
        return u(name) + (f19249b.contains(name) ? "__" : "_");
    }

    private static d0 o(Descriptors.FieldDescriptor fieldDescriptor) {
        switch (c.f19256c[fieldDescriptor.getType().ordinal()]) {
            case 1:
                return !fieldDescriptor.isRepeated() ? d0.f18954n : fieldDescriptor.isPacked() ? d0.W : d0.F;
            case 2:
                return fieldDescriptor.isRepeated() ? d0.I : d0.f18957q;
            case 3:
                return !fieldDescriptor.isRepeated() ? d0.f18945g : fieldDescriptor.isPacked() ? d0.P : d0.f18965y;
            case 4:
                return !fieldDescriptor.isRepeated() ? d0.f18959s : fieldDescriptor.isPacked() ? d0.Y : d0.K;
            case 5:
                return !fieldDescriptor.isRepeated() ? d0.f18953m : fieldDescriptor.isPacked() ? d0.V : d0.E;
            case 6:
                return !fieldDescriptor.isRepeated() ? d0.f18952l : fieldDescriptor.isPacked() ? d0.U : d0.D;
            case 7:
                return !fieldDescriptor.isRepeated() ? d0.f18947h : fieldDescriptor.isPacked() ? d0.Q : d0.f18966z;
            case 8:
                return fieldDescriptor.isRepeated() ? d0.f18942d0 : d0.f18964x;
            case 9:
                return !fieldDescriptor.isRepeated() ? d0.f18951k : fieldDescriptor.isPacked() ? d0.T : d0.C;
            case 10:
                return !fieldDescriptor.isRepeated() ? d0.f18949i : fieldDescriptor.isPacked() ? d0.R : d0.A;
            case 11:
                return fieldDescriptor.isMapField() ? d0.f18943e0 : fieldDescriptor.isRepeated() ? d0.H : d0.f18956p;
            case 12:
                return !fieldDescriptor.isRepeated() ? d0.f18960t : fieldDescriptor.isPacked() ? d0.Z : d0.L;
            case 13:
                return !fieldDescriptor.isRepeated() ? d0.f18961u : fieldDescriptor.isPacked() ? d0.f18939a0 : d0.M;
            case 14:
                return !fieldDescriptor.isRepeated() ? d0.f18962v : fieldDescriptor.isPacked() ? d0.f18940b0 : d0.N;
            case 15:
                return !fieldDescriptor.isRepeated() ? d0.f18963w : fieldDescriptor.isPacked() ? d0.f18941c0 : d0.O;
            case 16:
                return fieldDescriptor.isRepeated() ? d0.G : d0.f18955o;
            case 17:
                return !fieldDescriptor.isRepeated() ? d0.f18958r : fieldDescriptor.isPacked() ? d0.X : d0.J;
            case 18:
                return !fieldDescriptor.isRepeated() ? d0.f18950j : fieldDescriptor.isPacked() ? d0.S : d0.B;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + fieldDescriptor.getType());
        }
    }

    private static Class p(Class cls, Descriptors.FieldDescriptor fieldDescriptor, d0 d0Var) {
        switch (c.f19255b[d0Var.d().ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
                return ByteString.class;
            case 3:
                return Double.class;
            case 4:
                return Float.class;
            case 5:
            case 6:
                return Integer.class;
            case 7:
                return Long.class;
            case 8:
                return String.class;
            case 9:
                return q(cls, fieldDescriptor);
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + d0Var);
        }
    }

    private static Class q(Class cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(s(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), null).getReturnType();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Class r(Class cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(s(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), Integer.TYPE).getReturnType();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static String s(String str) {
        String strU = u(str);
        return "get" + Character.toUpperCase(strU.charAt(0)) + strU.substring(1, strU.length());
    }

    private static boolean t(Descriptors.Descriptor descriptor) {
        return f19250c.c(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        boolean z10 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '_') {
                z10 = true;
            } else if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
                z10 = true;
            } else if (z10) {
                sb2.append(Character.toUpperCase(cCharAt));
                z10 = false;
            } else if (i10 == 0) {
                sb2.append(Character.toLowerCase(cCharAt));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @Override // com.explorestack.protobuf.d1
    public boolean isSupported(Class cls) {
        return h0.class.isAssignableFrom(cls);
    }

    @Override // com.explorestack.protobuf.d1
    public c1 messageInfoFor(Class cls) {
        if (h0.class.isAssignableFrom(cls)) {
            return f(cls, i(cls));
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f19257a = new ConcurrentHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19258b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Stack f19259c = new Stack();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f19260d = new HashMap();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Descriptors.Descriptor f19261a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final int f19262b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f19263c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            b f19264d = null;

            a(Descriptors.Descriptor descriptor, int i10) {
                this.f19261a = descriptor;
                this.f19262b = i10;
                this.f19263c = i10;
            }
        }

        d() {
        }

        private void a(b bVar) {
            boolean z10;
            b bVar2;
            Iterator it = bVar.f19265a.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Descriptors.Descriptor descriptor = (Descriptors.Descriptor) it.next();
                z10 = true;
                if (descriptor.isExtendable()) {
                    break;
                }
                for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                    if (fieldDescriptor.isRequired() || (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && (bVar2 = ((a) this.f19260d.get(fieldDescriptor.getMessageType())).f19264d) != bVar && bVar2.f19266b)) {
                        break loop0;
                    }
                }
            }
            bVar.f19266b = z10;
            Iterator it2 = bVar.f19265a.iterator();
            while (it2.hasNext()) {
                this.f19257a.put((Descriptors.Descriptor) it2.next(), Boolean.valueOf(bVar.f19266b));
            }
        }

        private a b(Descriptors.Descriptor descriptor) {
            a aVar;
            int i10 = this.f19258b;
            this.f19258b = i10 + 1;
            a aVar2 = new a(descriptor, i10);
            this.f19259c.push(aVar2);
            this.f19260d.put(descriptor, aVar2);
            for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    a aVar3 = (a) this.f19260d.get(fieldDescriptor.getMessageType());
                    if (aVar3 == null) {
                        aVar2.f19263c = Math.min(aVar2.f19263c, b(fieldDescriptor.getMessageType()).f19263c);
                    } else if (aVar3.f19264d == null) {
                        aVar2.f19263c = Math.min(aVar2.f19263c, aVar3.f19263c);
                    }
                }
            }
            if (aVar2.f19262b == aVar2.f19263c) {
                b bVar = new b(null);
                do {
                    aVar = (a) this.f19259c.pop();
                    aVar.f19264d = bVar;
                    bVar.f19265a.add(aVar.f19261a);
                } while (aVar != aVar2);
                a(bVar);
            }
            return aVar2;
        }

        public boolean c(Descriptors.Descriptor descriptor) {
            Boolean bool = (Boolean) this.f19257a.get(descriptor);
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (this) {
                try {
                    Boolean bool2 = (Boolean) this.f19257a.get(descriptor);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return b(descriptor).f19264d.f19266b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List f19265a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f19266b;

            private b() {
                this.f19265a = new ArrayList();
                this.f19266b = false;
            }

            /* synthetic */ b(a aVar) {
                this();
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n1[] f19267a;

        private e() {
            this.f19267a = new n1[2];
        }

        private static n1 b(Class cls, Descriptors.OneofDescriptor oneofDescriptor) {
            String strU = o.u(oneofDescriptor.getName());
            return new n1(oneofDescriptor.getIndex(), o.k(cls, strU + "Case_"), o.k(cls, strU + "_"));
        }

        n1 a(Class cls, Descriptors.OneofDescriptor oneofDescriptor) {
            int index = oneofDescriptor.getIndex();
            n1[] n1VarArr = this.f19267a;
            if (index >= n1VarArr.length) {
                this.f19267a = (n1[]) Arrays.copyOf(n1VarArr, index * 2);
            }
            n1 n1Var = this.f19267a[index];
            if (n1Var != null) {
                return n1Var;
            }
            n1 n1VarB = b(cls, oneofDescriptor);
            this.f19267a[index] = n1VarB;
            return n1VarB;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
