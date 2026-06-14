package ma;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import q9.p;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends GLSurfaceView implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f94673c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f94674b;

    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float[] f94675k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f94676l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float[] f94677m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String[] f94678n = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final FloatBuffer f94679o = q9.p.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final GLSurfaceView f94680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f94681c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f94682d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f94683e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f94684f = new int[3];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AtomicReference f94685g = new AtomicReference();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final FloatBuffer[] f94686h = new FloatBuffer[3];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private q9.o f94687i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f94688j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f94680b = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f94683e;
                this.f94684f[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f94681c, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f94687i.j(f94678n[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    q9.p.a(3553, this.f94681c[i10], 9729);
                }
                q9.p.b();
            } catch (p.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        public void a(t9.i iVar) {
            androidx.privacysandbox.ads.adservices.topics.a.a(this.f94685g.getAndSet(iVar));
            this.f94680b.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            androidx.privacysandbox.ads.adservices.topics.a.a(this.f94685g.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                q9.o oVar = new q9.o("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f94687i = oVar;
                GLES20.glVertexAttribPointer(oVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f94679o);
                this.f94682d[0] = this.f94687i.e("in_tc_y");
                this.f94682d[1] = this.f94687i.e("in_tc_u");
                this.f94682d[2] = this.f94687i.e("in_tc_v");
                this.f94688j = this.f94687i.j("mColorConversion");
                q9.p.b();
                b();
                q9.p.b();
            } catch (p.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public p(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(t9.i iVar) {
        this.f94674b.a(iVar);
    }

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f94674b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public q getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
