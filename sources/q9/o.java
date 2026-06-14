package q9;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;
import q9.p;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f98824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a[] f98825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f98826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f98827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f98828e;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f98830b;

        private a(String str, int i10) {
            this.f98829a = str;
            this.f98830b = i10;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, o.h(bArr));
            return new a(str, o.f(i10, str));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f98832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f98833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f98834d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f98835e = new int[4];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f98836f = 9729;

        private b(String str, int i10, int i11) {
            this.f98831a = str;
            this.f98832b = i10;
            this.f98833c = i11;
        }

        public static b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, o.h(bArr));
            return new b(str, o.i(i10, str), iArr2[0]);
        }
    }

    public o(String str, String str2) throws p.a {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f98824a = iGlCreateProgram;
        p.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        p.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f98827d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f98825b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f98824a, i10);
            this.f98825b[i10] = aVarA;
            this.f98827d.put(aVarA.f98829a, aVarA);
        }
        this.f98828e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f98824a, 35718, iArr3, 0);
        this.f98826c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b bVarA = b.a(this.f98824a, i11);
            this.f98826c[i11] = bVarA;
            this.f98828e.put(bVarA.f98831a, bVarA);
        }
        p.b();
    }

    private static void d(int i10, int i11, String str) throws p.a {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        p.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        p.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f98824a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) throws p.a {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        p.b();
        return iG;
    }

    public int j(String str) {
        return i(this.f98824a, str);
    }
}
