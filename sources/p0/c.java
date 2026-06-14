package p0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import vh.a0;
import vh.g;
import vh.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f98009h = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f98010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f98011c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String[] f98012d = new String[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f98013e = new int[32];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f98014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f98015g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f98016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a0 f98017b;

        private a(String[] strArr, a0 a0Var) {
            this.f98016a = strArr;
            this.f98017b = a0Var;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                vh.e eVar = new vh.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.w(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.readByteString();
                }
                return new a((String[]) strArr.clone(), a0.l(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f98009h[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f98009h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    public static c n(g gVar) {
        return new e(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(vh.f r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = p0.c.f98009h
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.w(vh.f, java.lang.String):void");
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return d.a(this.f98010b, this.f98011c, this.f98012d, this.f98013e);
    }

    public abstract boolean hasNext();

    public abstract boolean m();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract b o();

    final void p(int i10) {
        int i11 = this.f98010b;
        int[] iArr = this.f98011c;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new p0.a("Nesting too deep at " + getPath());
            }
            this.f98011c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f98012d;
            this.f98012d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f98013e;
            this.f98013e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f98011c;
        int i12 = this.f98010b;
        this.f98010b = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int q(a aVar);

    public abstract void s();

    public abstract void skipValue();

    final p0.b y(String str) throws p0.b {
        throw new p0.b(str + " at path " + getPath());
    }
}
