package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.Data;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class GlUtil {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    @RequiresApi(17)
    private static final class Api17 {
        private Api17() {
        }

        @DoNotInline
        public static EGLContext createEglContext(EGLDisplay eGLDisplay, int i10, int[] iArr) throws GlException {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), EGL14.EGL_NO_CONTEXT, new int[]{12440, i10, 12344}, 0);
            if (eGLContextEglCreateContext != null) {
                GlUtil.checkGlError();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i10);
        }

        @DoNotInline
        public static EGLDisplay createEglDisplay() throws GlException {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.checkGlException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            GlUtil.checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
            GlUtil.checkGlError();
            return eGLDisplayEglGetDisplay;
        }

        @DoNotInline
        public static EGLSurface createEglPbufferSurface(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), iArr2, 0);
            GlUtil.checkEglException("Error creating surface");
            return eGLSurfaceEglCreatePbufferSurface;
        }

        @DoNotInline
        public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            GlUtil.checkEglException("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                GlUtil.checkEglException("Error destroying context");
            }
            EGL14.eglReleaseThread();
            GlUtil.checkEglException("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            GlUtil.checkEglException("Error terminating display");
        }

        @DoNotInline
        public static void focusFramebufferUsingCurrentContext(int i10, int i11, int i12) throws GlException {
            GlUtil.checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i10) {
                GLES20.glBindFramebuffer(36160, i10);
            }
            GlUtil.checkGlError();
            GLES20.glViewport(0, 0, i11, i12);
            GlUtil.checkGlError();
        }

        @DoNotInline
        public static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws GlException {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GlUtil.checkEglException("Error making context current");
            focusFramebufferUsingCurrentContext(i10, i11, i12);
        }

        @DoNotInline
        private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new GlException("eglChooseConfig failed.");
        }

        @DoNotInline
        public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
            GlUtil.checkEglException("Error creating surface");
            return eGLSurfaceEglCreateWindowSurface;
        }
    }

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    private GlUtil() {
    }

    private static void assertValidTextureSize(int i10, int i11) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i12 = iArr[0];
        Assertions.checkState(i12 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i10 < 0 || i11 < 0) {
            throw new GlException("width or height is less than 0");
        }
        if (i10 > i12 || i11 > i12) {
            throw new GlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + i12);
        }
    }

    public static void bindTexture(int i10, int i11) throws GlException {
        GLES20.glBindTexture(i10, i11);
        checkGlError();
        GLES20.glTexParameteri(i10, Data.MAX_DATA_BYTES, 9729);
        checkGlError();
        GLES20.glTexParameteri(i10, 10241, 9729);
        checkGlError();
        GLES20.glTexParameteri(i10, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i10, 10243, 33071);
        checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(String str) throws GlException {
        int iEglGetError = EGL14.eglGetError();
        checkGlException(iEglGetError == 12288, str + ", error code: " + iEglGetError);
    }

    public static void checkGlError() throws GlException {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z10 = true;
        }
        if (z10) {
            throw new GlException(sb2.toString());
        }
    }

    public static void checkGlException(boolean z10, String str) throws GlException {
        if (!z10) {
            throw new GlException(str);
        }
    }

    public static void clearOutputFrame() throws GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    @RequiresApi(17)
    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws GlException {
        return createEglContext(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    @RequiresApi(17)
    public static EGLDisplay createEglDisplay() throws GlException {
        return Api17.createEglDisplay();
    }

    public static int createExternalTexture() throws GlException {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i10) throws GlException {
        checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        checkGlError();
        return iArr[0];
    }

    @RequiresApi(17)
    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        EGLSurface eGLSurfaceCreatePbufferSurface = isSurfacelessContextExtensionSupported() ? EGL14.EGL_NO_SURFACE : createPbufferSurface(eGLDisplay, 1, 1, iArr);
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreatePbufferSurface, 1, 1);
        return eGLSurfaceCreatePbufferSurface;
    }

    @RequiresApi(17)
    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i10, int i11, int[] iArr) throws GlException {
        return Api17.createEglPbufferSurface(eGLDisplay, iArr, new int[]{12375, i10, 12374, i11, 12344});
    }

    public static int createTexture(int i10, int i11, boolean z10) throws GlException {
        if (!z10) {
            return createTexture(i10, i11, 6408, 5121);
        }
        Assertions.checkState(Util.SDK_INT >= 18, "GLES30 extensions are not supported below API 18.");
        return createTexture(i10, i11, 34842, 5131);
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i10 = 0; i10 < list.size(); i10++) {
            System.arraycopy(list.get(i10), 0, fArr, i10 * 4, 4);
        }
        return fArr;
    }

    public static void deleteTexture(int i10) throws GlException {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        checkGlError();
    }

    @RequiresApi(17)
    public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws GlException {
        Api17.destroyEglContext(eGLDisplay, eGLContext);
    }

    @RequiresApi(17)
    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) throws GlException {
        Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i10, i11);
    }

    @RequiresApi(17)
    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws GlException {
        Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i10, i11, i12);
    }

    @RequiresApi(17)
    public static void focusFramebufferUsingCurrentContext(int i10, int i11, int i12) throws GlException {
        Api17.focusFramebufferUsingCurrentContext(i10, i11, i12);
    }

    @RequiresApi(17)
    public static EGLSurface focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
        return createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    private static int generateTexture() throws GlException {
        checkGlException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    @RequiresApi(17)
    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) throws GlException {
        return Api17.getEglSurface(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_8888, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i10 = Util.SDK_INT;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !(Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return Util.SDK_INT >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        String strGlGetString;
        if (Util.SDK_INT < 17) {
            return false;
        }
        if (Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplayCreateEglDisplay = createEglDisplay();
                EGLContext eGLContextCreateEglContext = createEglContext(eGLDisplayCreateEglDisplay);
                focusPlaceholderEglSurface(eGLContextCreateEglContext, eGLDisplayCreateEglDisplay);
                strGlGetString = GLES20.glGetString(7939);
                destroyEglContext(eGLDisplayCreateEglDisplay, eGLContextCreateEglContext);
            } catch (GlException unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains(EXTENSION_YUV_TARGET);
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    private static FloatBuffer createBuffer(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    @RequiresApi(17)
    public static EGLContext createEglContext(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        Assertions.checkArgument(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        return Api17.createEglContext(eGLDisplay, Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102) ? 3 : 2, iArr);
    }

    @RequiresApi(17)
    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr) throws GlException {
        return Api17.getEglSurface(eGLDisplay, obj, iArr, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    private static int createTexture(int i10, int i11, int i12, int i13) throws GlException {
        assertValidTextureSize(i10, i11);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, 6408, i13, ByteBuffer.allocateDirect(i10 * i11 * 4));
        checkGlError();
        return iGenerateTexture;
    }
}
