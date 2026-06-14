package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.a;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final class r2 implements MessageLite {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r2 f19320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f19321e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f19322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19323c;

    public static final class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f19327f = s().g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f19328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f19329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f19330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f19331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f19332e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private c f19333a;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static a h() {
                a aVar = new a();
                aVar.f19333a = new c();
                return aVar;
            }

            public a b(int i10) {
                if (this.f19333a.f19329b == null) {
                    this.f19333a.f19329b = new ArrayList();
                }
                this.f19333a.f19329b.add(Integer.valueOf(i10));
                return this;
            }

            public a c(long j10) {
                if (this.f19333a.f19330c == null) {
                    this.f19333a.f19330c = new ArrayList();
                }
                this.f19333a.f19330c.add(Long.valueOf(j10));
                return this;
            }

            public a d(r2 r2Var) {
                if (this.f19333a.f19332e == null) {
                    this.f19333a.f19332e = new ArrayList();
                }
                this.f19333a.f19332e.add(r2Var);
                return this;
            }

            public a e(ByteString byteString) {
                if (this.f19333a.f19331d == null) {
                    this.f19333a.f19331d = new ArrayList();
                }
                this.f19333a.f19331d.add(byteString);
                return this;
            }

            public a f(long j10) {
                if (this.f19333a.f19328a == null) {
                    this.f19333a.f19328a = new ArrayList();
                }
                this.f19333a.f19328a.add(Long.valueOf(j10));
                return this;
            }

            public c g() {
                if (this.f19333a.f19328a == null) {
                    this.f19333a.f19328a = Collections.EMPTY_LIST;
                } else {
                    c cVar = this.f19333a;
                    cVar.f19328a = DesugarCollections.unmodifiableList(cVar.f19328a);
                }
                if (this.f19333a.f19329b == null) {
                    this.f19333a.f19329b = Collections.EMPTY_LIST;
                } else {
                    c cVar2 = this.f19333a;
                    cVar2.f19329b = DesugarCollections.unmodifiableList(cVar2.f19329b);
                }
                if (this.f19333a.f19330c == null) {
                    this.f19333a.f19330c = Collections.EMPTY_LIST;
                } else {
                    c cVar3 = this.f19333a;
                    cVar3.f19330c = DesugarCollections.unmodifiableList(cVar3.f19330c);
                }
                if (this.f19333a.f19331d == null) {
                    this.f19333a.f19331d = Collections.EMPTY_LIST;
                } else {
                    c cVar4 = this.f19333a;
                    cVar4.f19331d = DesugarCollections.unmodifiableList(cVar4.f19331d);
                }
                if (this.f19333a.f19332e == null) {
                    this.f19333a.f19332e = Collections.EMPTY_LIST;
                } else {
                    c cVar5 = this.f19333a;
                    cVar5.f19332e = DesugarCollections.unmodifiableList(cVar5.f19332e);
                }
                c cVar6 = this.f19333a;
                this.f19333a = null;
                return cVar6;
            }

            public a i(c cVar) {
                if (!cVar.f19328a.isEmpty()) {
                    if (this.f19333a.f19328a == null) {
                        this.f19333a.f19328a = new ArrayList();
                    }
                    this.f19333a.f19328a.addAll(cVar.f19328a);
                }
                if (!cVar.f19329b.isEmpty()) {
                    if (this.f19333a.f19329b == null) {
                        this.f19333a.f19329b = new ArrayList();
                    }
                    this.f19333a.f19329b.addAll(cVar.f19329b);
                }
                if (!cVar.f19330c.isEmpty()) {
                    if (this.f19333a.f19330c == null) {
                        this.f19333a.f19330c = new ArrayList();
                    }
                    this.f19333a.f19330c.addAll(cVar.f19330c);
                }
                if (!cVar.f19331d.isEmpty()) {
                    if (this.f19333a.f19331d == null) {
                        this.f19333a.f19331d = new ArrayList();
                    }
                    this.f19333a.f19331d.addAll(cVar.f19331d);
                }
                if (!cVar.f19332e.isEmpty()) {
                    if (this.f19333a.f19332e == null) {
                        this.f19333a.f19332e = new ArrayList();
                    }
                    this.f19333a.f19332e.addAll(cVar.f19332e);
                }
                return this;
            }
        }

        private Object[] n() {
            return new Object[]{this.f19328a, this.f19329b, this.f19330c, this.f19331d, this.f19332e};
        }

        public static a s() {
            return a.h();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Arrays.equals(n(), ((c) obj).n());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(n());
        }

        public List k() {
            return this.f19329b;
        }

        public List l() {
            return this.f19330c;
        }

        public List m() {
            return this.f19332e;
        }

        public List o() {
            return this.f19331d;
        }

        public int p(int i10) {
            Iterator it = this.f19328a.iterator();
            int iT = 0;
            while (it.hasNext()) {
                iT += n.a0(i10, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.f19329b.iterator();
            while (it2.hasNext()) {
                iT += n.n(i10, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.f19330c.iterator();
            while (it3.hasNext()) {
                iT += n.p(i10, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.f19331d.iterator();
            while (it4.hasNext()) {
                iT += n.h(i10, (ByteString) it4.next());
            }
            Iterator it5 = this.f19332e.iterator();
            while (it5.hasNext()) {
                iT += n.t(i10, (r2) it5.next());
            }
            return iT;
        }

        public int q(int i10) {
            Iterator it = this.f19331d.iterator();
            int iL = 0;
            while (it.hasNext()) {
                iL += n.L(i10, (ByteString) it.next());
            }
            return iL;
        }

        public List r() {
            return this.f19328a;
        }

        public void t(int i10, n nVar) {
            Iterator it = this.f19331d.iterator();
            while (it.hasNext()) {
                nVar.M0(i10, (ByteString) it.next());
            }
        }

        public void u(int i10, n nVar) {
            Iterator it = this.f19328a.iterator();
            while (it.hasNext()) {
                nVar.Y0(i10, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.f19329b.iterator();
            while (it2.hasNext()) {
                nVar.x0(i10, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.f19330c.iterator();
            while (it3.hasNext()) {
                nVar.z0(i10, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.f19331d.iterator();
            while (it4.hasNext()) {
                nVar.r0(i10, (ByteString) it4.next());
            }
            Iterator it5 = this.f19332e.iterator();
            while (it5.hasNext()) {
                nVar.D0(i10, (r2) it5.next());
            }
        }

        private c() {
        }
    }

    public static final class d extends com.explorestack.protobuf.b {
        @Override // com.explorestack.protobuf.p1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public r2 parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            b bVarG = r2.g();
            try {
                bVarG.mergeFrom(lVar);
                return bVarG.buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(bVarG.buildPartial());
            } catch (IOException e11) {
                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(bVarG.buildPartial());
            }
        }
    }

    static {
        Map map = Collections.EMPTY_MAP;
        f19320d = new r2(map, map);
        f19321e = new d();
    }

    r2(Map map, Map map2) {
        this.f19322b = map;
        this.f19323c = map2;
    }

    public static r2 c() {
        return f19320d;
    }

    public static b g() {
        return b.l();
    }

    public static b h(r2 r2Var) {
        return g().x(r2Var);
    }

    public static r2 j(ByteString byteString) {
        return g().mergeFrom(byteString).build();
    }

    public Map b() {
        return this.f19322b;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public r2 getDefaultInstanceForType() {
        return f19320d;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final d getParserForType() {
        return f19321e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2) && this.f19322b.equals(((r2) obj).f19322b);
    }

    public int f() {
        int iQ = 0;
        for (Map.Entry entry : this.f19322b.entrySet()) {
            iQ += ((c) entry.getValue()).q(((Integer) entry.getKey()).intValue());
        }
        return iQ;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int iP = 0;
        for (Map.Entry entry : this.f19322b.entrySet()) {
            iP += ((c) entry.getValue()).p(((Integer) entry.getKey()).intValue());
        }
        return iP;
    }

    public int hashCode() {
        return this.f19322b.hashCode();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return g();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return g().x(this);
    }

    public void l(n nVar) {
        for (Map.Entry entry : this.f19322b.entrySet()) {
            ((c) entry.getValue()).t(((Integer) entry.getKey()).intValue(), nVar);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            n nVarJ0 = n.j0(bArr);
            writeTo(nVarJ0);
            nVarJ0.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public String toString() {
        return TextFormat.printer().printToString(this);
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) {
        n nVarH0 = n.h0(outputStream);
        nVarH0.N0(getSerializedSize());
        writeTo(nVarH0);
        nVarH0.e0();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) {
        for (Map.Entry entry : this.f19322b.entrySet()) {
            ((c) entry.getValue()).u(((Integer) entry.getKey()).intValue(), nVar);
        }
    }

    public static final class b implements MessageLite.Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f19324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c.a f19326d;

        private b() {
        }

        private void F() {
            this.f19324b = Collections.EMPTY_MAP;
            this.f19325c = 0;
            this.f19326d = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b l() {
            b bVar = new b();
            bVar.F();
            return bVar;
        }

        private c.a o(int i10) {
            c.a aVar = this.f19326d;
            if (aVar != null) {
                int i11 = this.f19325c;
                if (i10 == i11) {
                    return aVar;
                }
                b(i11, aVar.g());
            }
            if (i10 == 0) {
                return null;
            }
            c cVar = (c) this.f19324b.get(Integer.valueOf(i10));
            this.f19325c = i10;
            c.a aVarS = c.s();
            this.f19326d = aVarS;
            if (cVar != null) {
                aVarS.i(cVar);
            }
            return this.f19326d;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            try {
                l lVarL = l.l(bArr);
                mergeFrom(lVarL);
                lVarL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                l lVarM = l.m(bArr, i10, i11);
                mergeFrom(lVarM);
                lVarM.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr, int i10, int i11, w wVar) {
            return mergeFrom(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr, w wVar) {
            return mergeFrom(bArr);
        }

        public b E(int i10, int i11) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            o(i10).f(i11);
            return this;
        }

        public b b(int i10, c cVar) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (this.f19326d != null && this.f19325c == i10) {
                this.f19326d = null;
                this.f19325c = 0;
            }
            if (this.f19324b.isEmpty()) {
                this.f19324b = new TreeMap();
            }
            this.f19324b.put(Integer.valueOf(i10), cVar);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public r2 build() {
            r2 r2Var;
            o(0);
            if (this.f19324b.isEmpty()) {
                r2Var = r2.c();
            } else {
                r2Var = new r2(DesugarCollections.unmodifiableMap(this.f19324b), DesugarCollections.unmodifiableMap(((TreeMap) this.f19324b).descendingMap()));
            }
            this.f19324b = null;
            return r2Var;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public r2 buildPartial() {
            return build();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b clear() {
            F();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b m4486clone() {
            o(0);
            return r2.g().x(new r2(this.f19324b, DesugarCollections.unmodifiableMap(((TreeMap) this.f19324b).descendingMap())));
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom(new a.AbstractC0320a.C0321a(inputStream, l.D(i10, inputStream)));
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public r2 getDefaultInstanceForType() {
            return r2.c();
        }

        public boolean p(int i10) {
            if (i10 != 0) {
                return i10 == this.f19325c || this.f19324b.containsKey(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }

        public b q(int i10, c cVar) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (p(i10)) {
                o(i10).i(cVar);
                return this;
            }
            b(i10, cVar);
            return this;
        }

        public boolean r(int i10, l lVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int iA = z2.a(i10);
            int iB = z2.b(i10);
            if (iB == 0) {
                o(iA).f(lVar.z());
                return true;
            }
            if (iB == 1) {
                o(iA).c(lVar.v());
                return true;
            }
            if (iB == 2) {
                o(iA).e(lVar.r());
                return true;
            }
            if (iB == 3) {
                b bVarG = r2.g();
                lVar.x(iA, bVarG, u.g());
                o(iA).d(bVarG.build());
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            o(iA).b(lVar.u());
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                l lVarNewCodedInput = byteString.newCodedInput();
                mergeFrom(lVarNewCodedInput);
                lVarNewCodedInput.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(ByteString byteString, w wVar) {
            return mergeFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(l lVar) {
            int iK;
            do {
                iK = lVar.K();
                if (iK == 0) {
                    break;
                }
            } while (r(iK, lVar));
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(l lVar, w wVar) {
            return mergeFrom(lVar);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(MessageLite messageLite) {
            if (messageLite instanceof r2) {
                return x((r2) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public b x(r2 r2Var) {
            if (r2Var != r2.c()) {
                for (Map.Entry entry : r2Var.f19322b.entrySet()) {
                    q(((Integer) entry.getKey()).intValue(), (c) entry.getValue());
                }
            }
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(InputStream inputStream) {
            l lVarG = l.g(inputStream);
            mergeFrom(lVarG);
            lVarG.a(0);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(InputStream inputStream, w wVar) {
            return mergeFrom(inputStream);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, w wVar) {
            return mergeDelimitedFrom(inputStream);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) {
        n nVarH0 = n.h0(outputStream);
        writeTo(nVarH0);
        nVarH0.e0();
    }
}
