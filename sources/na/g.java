package na;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import na.e;
import q9.o;
import q9.p;

/* JADX INFO: loaded from: classes12.dex */
final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f95706j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f95707k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f95708l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f95709m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f95710n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f95711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f95712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f95713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f95714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95719i;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f95720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f95721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f95722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f95723d;

        public a(e.b bVar) {
            this.f95720a = bVar.a();
            this.f95721b = p.e(bVar.f95704c);
            this.f95722c = p.e(bVar.f95705d);
            int i10 = bVar.f95703b;
            if (i10 == 1) {
                this.f95723d = 5;
            } else if (i10 != 2) {
                this.f95723d = 4;
            } else {
                this.f95723d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f95697a;
        e.a aVar2 = eVar.f95698b;
        return aVar.b() == 1 && aVar.a(0).f95702a == 0 && aVar2.b() == 1 && aVar2.a(0).f95702a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f95713c : this.f95712b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f95711a;
        GLES20.glUniformMatrix3fv(this.f95716f, 1, false, i11 == 1 ? z10 ? f95708l : f95707k : i11 == 2 ? z10 ? f95710n : f95709m : f95706j, 0);
        GLES20.glUniformMatrix4fv(this.f95715e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f95719i, 0);
        try {
            p.b();
        } catch (p.a e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f95717g, 3, 5126, false, 12, (Buffer) aVar.f95721b);
        try {
            p.b();
        } catch (p.a e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f95718h, 2, 5126, false, 8, (Buffer) aVar.f95722c);
        try {
            p.b();
        } catch (p.a e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f95723d, 0, aVar.f95720a);
        try {
            p.b();
        } catch (p.a e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            o oVar = new o("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f95714d = oVar;
            this.f95715e = oVar.j("uMvpMatrix");
            this.f95716f = this.f95714d.j("uTexMatrix");
            this.f95717g = this.f95714d.e("aPosition");
            this.f95718h = this.f95714d.e("aTexCoords");
            this.f95719i = this.f95714d.j("uTexture");
        } catch (p.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f95711a = eVar.f95699c;
            a aVar = new a(eVar.f95697a.a(0));
            this.f95712b = aVar;
            if (!eVar.f95700d) {
                aVar = new a(eVar.f95698b.a(0));
            }
            this.f95713c = aVar;
        }
    }
}
