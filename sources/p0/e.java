package p0;

import java.io.EOFException;
import p0.c;
import vh.g;
import vh.h;

/* JADX INFO: loaded from: classes5.dex */
final class e extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final h f98029o = h.j("'\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final h f98030p = h.j("\"\\");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final h f98031q = h.j("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final h f98032r = h.j("\n\r");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final h f98033s = h.j("*/");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g f98034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vh.e f98035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f98036k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f98037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f98038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f98039n;

    e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f98034i = gVar;
        this.f98035j = gVar.buffer();
        p(6);
    }

    private int M() throws b, EOFException {
        int[] iArr = this.f98011c;
        int i10 = this.f98010b;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iV = V(true);
            this.f98035j.readByte();
            if (iV != 44) {
                if (iV != 59) {
                    if (iV != 93) {
                        throw y("Unterminated array");
                    }
                    this.f98036k = 4;
                    return 4;
                }
                z();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iV2 = V(true);
                    this.f98035j.readByte();
                    if (iV2 != 44) {
                        if (iV2 != 59) {
                            if (iV2 != 125) {
                                throw y("Unterminated object");
                            }
                            this.f98036k = 2;
                            return 2;
                        }
                        z();
                    }
                }
                int iV3 = V(true);
                if (iV3 == 34) {
                    this.f98035j.readByte();
                    this.f98036k = 13;
                    return 13;
                }
                if (iV3 == 39) {
                    this.f98035j.readByte();
                    z();
                    this.f98036k = 12;
                    return 12;
                }
                if (iV3 != 125) {
                    z();
                    if (!U((char) iV3)) {
                        throw y("Expected name");
                    }
                    this.f98036k = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw y("Expected name");
                }
                this.f98035j.readByte();
                this.f98036k = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iV4 = V(true);
                this.f98035j.readByte();
                if (iV4 != 58) {
                    if (iV4 != 61) {
                        throw y("Expected ':'");
                    }
                    z();
                    if (this.f98034i.request(1L) && this.f98035j.z(0L) == 62) {
                        this.f98035j.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (V(false) == -1) {
                    this.f98036k = 18;
                    return 18;
                }
                z();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iV5 = V(true);
        if (iV5 == 34) {
            this.f98035j.readByte();
            this.f98036k = 9;
            return 9;
        }
        if (iV5 == 39) {
            z();
            this.f98035j.readByte();
            this.f98036k = 8;
            return 8;
        }
        if (iV5 != 44 && iV5 != 59) {
            if (iV5 == 91) {
                this.f98035j.readByte();
                this.f98036k = 3;
                return 3;
            }
            if (iV5 != 93) {
                if (iV5 == 123) {
                    this.f98035j.readByte();
                    this.f98036k = 1;
                    return 1;
                }
                int iE0 = e0();
                if (iE0 != 0) {
                    return iE0;
                }
                int iI0 = i0();
                if (iI0 != 0) {
                    return iI0;
                }
                if (!U(this.f98035j.z(0L))) {
                    throw y("Expected value");
                }
                z();
                this.f98036k = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f98035j.readByte();
                this.f98036k = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw y("Unexpected value");
        }
        z();
        this.f98036k = 7;
        return 7;
    }

    private int R(String str, c.a aVar) {
        int length = aVar.f98016a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f98016a[i10])) {
                this.f98036k = 0;
                this.f98012d[this.f98010b - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean U(int i10) throws b {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        z();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f98035j.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f98034i.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        z();
        r3 = r6.f98035j.z(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f98035j.readByte();
        r6.f98035j.readByte();
        t0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f98035j.readByte();
        r6.f98035j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (s0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw y("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        z();
        t0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int V(boolean r7) throws p0.b, java.io.EOFException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            vh.g r2 = r6.f98034i
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            vh.e r2 = r6.f98035j
            long r4 = (long) r1
            byte r2 = r2.z(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            vh.e r3 = r6.f98035j
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            vh.g r3 = r6.f98034i
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            goto L7d
        L3a:
            r6.z()
            vh.e r3 = r6.f98035j
            r4 = 1
            byte r3 = r3.z(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            goto L7d
        L4c:
            vh.e r1 = r6.f98035j
            r1.readByte()
            vh.e r1 = r6.f98035j
            r1.readByte()
            r6.t0()
            goto L1
        L5a:
            vh.e r1 = r6.f98035j
            r1.readByte()
            vh.e r1 = r6.f98035j
            r1.readByte()
            boolean r1 = r6.s0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            p0.b r7 = r6.y(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.z()
            r6.t0()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.e.V(boolean):int");
    }

    private String W(h hVar) throws b, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jA0 = this.f98034i.a0(hVar);
            if (jA0 == -1) {
                throw y("Unterminated string");
            }
            if (this.f98035j.z(jA0) != 92) {
                if (sb2 == null) {
                    String utf8 = this.f98035j.readUtf8(jA0);
                    this.f98035j.readByte();
                    return utf8;
                }
                sb2.append(this.f98035j.readUtf8(jA0));
                this.f98035j.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f98035j.readUtf8(jA0));
            this.f98035j.readByte();
            sb2.append(n0());
        }
    }

    private String b0() {
        long jA0 = this.f98034i.a0(f98031q);
        return jA0 != -1 ? this.f98035j.readUtf8(jA0) : this.f98035j.readUtf8();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int e0() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bZ = this.f98035j.z(0L);
        if (bZ == 116 || bZ == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bZ == 102 || bZ == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bZ != 110 && bZ != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f98034i.request(i12)) {
                return 0;
            }
            byte bZ2 = this.f98035j.z(i11);
            if (bZ2 != str.charAt(i11) && bZ2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f98034i.request(length + 1) && U(this.f98035j.z(length))) {
            return 0;
        }
        this.f98035j.skip(length);
        this.f98036k = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (U(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        r19.f98037l = r8;
        r19.f98035j.skip(r5);
        r19.f98036k = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
    
        r19.f98038m = r5;
        r19.f98036k = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int i0() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.e.i0():int");
    }

    private char n0() throws b, EOFException {
        int i10;
        if (!this.f98034i.request(1L)) {
            throw y("Unterminated escape sequence");
        }
        byte b10 = this.f98035j.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f98014f) {
                return (char) b10;
            }
            throw y("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f98034i.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bZ = this.f98035j.z(i11);
            char c11 = (char) (c10 << 4);
            if (bZ >= 48 && bZ <= 57) {
                i10 = bZ - 48;
            } else if (bZ >= 97 && bZ <= 102) {
                i10 = bZ - 87;
            } else {
                if (bZ < 65 || bZ > 70) {
                    throw y("\\u" + this.f98035j.readUtf8(4L));
                }
                i10 = bZ - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f98035j.skip(4L);
        return c10;
    }

    private void r0(h hVar) throws b, EOFException {
        while (true) {
            long jA0 = this.f98034i.a0(hVar);
            if (jA0 == -1) {
                throw y("Unterminated string");
            }
            if (this.f98035j.z(jA0) != 92) {
                this.f98035j.skip(jA0 + 1);
                return;
            } else {
                this.f98035j.skip(jA0 + 1);
                n0();
            }
        }
    }

    private boolean s0() throws EOFException {
        g gVar = this.f98034i;
        h hVar = f98033s;
        long jC = gVar.C(hVar);
        boolean z10 = jC != -1;
        vh.e eVar = this.f98035j;
        eVar.skip(z10 ? jC + ((long) hVar.K()) : eVar.e0());
        return z10;
    }

    private void t0() throws EOFException {
        long jA0 = this.f98034i.a0(f98032r);
        vh.e eVar = this.f98035j;
        eVar.skip(jA0 != -1 ? jA0 + 1 : eVar.e0());
    }

    private void u0() throws EOFException {
        long jA0 = this.f98034i.a0(f98031q);
        vh.e eVar = this.f98035j;
        if (jA0 == -1) {
            jA0 = eVar.e0();
        }
        eVar.skip(jA0);
    }

    private void z() throws b {
        if (!this.f98014f) {
            throw y("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // p0.c
    public void beginArray() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 3) {
            p(1);
            this.f98013e[this.f98010b - 1] = 0;
            this.f98036k = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + o() + " at path " + getPath());
        }
    }

    @Override // p0.c
    public void beginObject() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 1) {
            p(3);
            this.f98036k = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + o() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f98036k = 0;
        this.f98011c[0] = 8;
        this.f98010b = 1;
        this.f98035j.n();
        this.f98034i.close();
    }

    @Override // p0.c
    public void endArray() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM != 4) {
            throw new a("Expected END_ARRAY but was " + o() + " at path " + getPath());
        }
        int i10 = this.f98010b;
        this.f98010b = i10 - 1;
        int[] iArr = this.f98013e;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f98036k = 0;
    }

    @Override // p0.c
    public void endObject() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM != 2) {
            throw new a("Expected END_OBJECT but was " + o() + " at path " + getPath());
        }
        int i10 = this.f98010b;
        int i11 = i10 - 1;
        this.f98010b = i11;
        this.f98012d[i11] = null;
        int[] iArr = this.f98013e;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f98036k = 0;
    }

    @Override // p0.c
    public boolean hasNext() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        return (iM == 2 || iM == 4 || iM == 18) ? false : true;
    }

    @Override // p0.c
    public boolean m() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 5) {
            this.f98036k = 0;
            int[] iArr = this.f98013e;
            int i10 = this.f98010b - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM == 6) {
            this.f98036k = 0;
            int[] iArr2 = this.f98013e;
            int i11 = this.f98010b - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + o() + " at path " + getPath());
    }

    @Override // p0.c
    public double nextDouble() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 16) {
            this.f98036k = 0;
            int[] iArr = this.f98013e;
            int i10 = this.f98010b - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f98037l;
        }
        if (iM == 17) {
            this.f98039n = this.f98035j.readUtf8(this.f98038m);
        } else if (iM == 9) {
            this.f98039n = W(f98030p);
        } else if (iM == 8) {
            this.f98039n = W(f98029o);
        } else if (iM == 10) {
            this.f98039n = b0();
        } else if (iM != 11) {
            throw new a("Expected a double but was " + o() + " at path " + getPath());
        }
        this.f98036k = 11;
        try {
            double d10 = Double.parseDouble(this.f98039n);
            if (this.f98014f || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f98039n = null;
                this.f98036k = 0;
                int[] iArr2 = this.f98013e;
                int i11 = this.f98010b - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new b("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f98039n + " at path " + getPath());
        }
    }

    @Override // p0.c
    public int nextInt() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 16) {
            long j10 = this.f98037l;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f98036k = 0;
                int[] iArr = this.f98013e;
                int i11 = this.f98010b - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a("Expected an int but was " + this.f98037l + " at path " + getPath());
        }
        if (iM == 17) {
            this.f98039n = this.f98035j.readUtf8(this.f98038m);
        } else if (iM == 9 || iM == 8) {
            String strW = iM == 9 ? W(f98030p) : W(f98029o);
            this.f98039n = strW;
            try {
                int i12 = Integer.parseInt(strW);
                this.f98036k = 0;
                int[] iArr2 = this.f98013e;
                int i13 = this.f98010b - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iM != 11) {
            throw new a("Expected an int but was " + o() + " at path " + getPath());
        }
        this.f98036k = 11;
        try {
            double d10 = Double.parseDouble(this.f98039n);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f98039n = null;
                this.f98036k = 0;
                int[] iArr3 = this.f98013e;
                int i15 = this.f98010b - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f98039n + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f98039n + " at path " + getPath());
        }
    }

    @Override // p0.c
    public String nextName() throws b, EOFException {
        String strW;
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 14) {
            strW = b0();
        } else if (iM == 13) {
            strW = W(f98030p);
        } else if (iM == 12) {
            strW = W(f98029o);
        } else {
            if (iM != 15) {
                throw new a("Expected a name but was " + o() + " at path " + getPath());
            }
            strW = this.f98039n;
        }
        this.f98036k = 0;
        this.f98012d[this.f98010b - 1] = strW;
        return strW;
    }

    @Override // p0.c
    public String nextString() throws b, EOFException {
        String utf8;
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 10) {
            utf8 = b0();
        } else if (iM == 9) {
            utf8 = W(f98030p);
        } else if (iM == 8) {
            utf8 = W(f98029o);
        } else if (iM == 11) {
            utf8 = this.f98039n;
            this.f98039n = null;
        } else if (iM == 16) {
            utf8 = Long.toString(this.f98037l);
        } else {
            if (iM != 17) {
                throw new a("Expected a string but was " + o() + " at path " + getPath());
            }
            utf8 = this.f98035j.readUtf8(this.f98038m);
        }
        this.f98036k = 0;
        int[] iArr = this.f98013e;
        int i10 = this.f98010b - 1;
        iArr[i10] = iArr[i10] + 1;
        return utf8;
    }

    @Override // p0.c
    public c.b o() throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        switch (iM) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p0.c
    public int q(c.a aVar) throws b, EOFException {
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM < 12 || iM > 15) {
            return -1;
        }
        if (iM == 15) {
            return R(this.f98039n, aVar);
        }
        int iW0 = this.f98034i.w0(aVar.f98017b);
        if (iW0 != -1) {
            this.f98036k = 0;
            this.f98012d[this.f98010b - 1] = aVar.f98016a[iW0];
            return iW0;
        }
        String str = this.f98012d[this.f98010b - 1];
        String strNextName = nextName();
        int iR = R(strNextName, aVar);
        if (iR == -1) {
            this.f98036k = 15;
            this.f98039n = strNextName;
            this.f98012d[this.f98010b - 1] = str;
        }
        return iR;
    }

    @Override // p0.c
    public void s() throws b, EOFException {
        if (this.f98015g) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int iM = this.f98036k;
        if (iM == 0) {
            iM = M();
        }
        if (iM == 14) {
            u0();
        } else if (iM == 13) {
            r0(f98030p);
        } else if (iM == 12) {
            r0(f98029o);
        } else if (iM != 15) {
            throw new a("Expected a name but was " + o() + " at path " + getPath());
        }
        this.f98036k = 0;
        this.f98012d[this.f98010b - 1] = "null";
    }

    @Override // p0.c
    public void skipValue() throws b, EOFException {
        if (this.f98015g) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iM = this.f98036k;
            if (iM == 0) {
                iM = M();
            }
            if (iM == 3) {
                p(1);
            } else if (iM == 1) {
                p(3);
            } else {
                if (iM == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f98010b--;
                } else if (iM == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f98010b--;
                } else if (iM == 14 || iM == 10) {
                    u0();
                } else if (iM == 9 || iM == 13) {
                    r0(f98030p);
                } else if (iM == 8 || iM == 12) {
                    r0(f98029o);
                } else if (iM == 17) {
                    this.f98035j.skip(this.f98038m);
                } else if (iM == 18) {
                    throw new a("Expected a value but was " + o() + " at path " + getPath());
                }
                this.f98036k = 0;
            }
            i10++;
            this.f98036k = 0;
        } while (i10 != 0);
        int[] iArr = this.f98013e;
        int i11 = this.f98010b;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f98012d[i11 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f98034i + ")";
    }
}
