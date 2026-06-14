package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i10) {
            return this.subMeshes[i10];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i10, float[] fArr, float[] fArr2, int i11) {
            this.textureId = i10;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i11;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int i10) {
        this(mesh, mesh, i10);
    }

    public static Projection createEquirectangular(int i10) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i10) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i10;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        int i14;
        int i15 = i10;
        int i16 = 3;
        int i17 = 1;
        Assertions.checkArgument(f10 > 0.0f);
        Assertions.checkArgument(i15 >= 1);
        Assertions.checkArgument(i11 >= 1);
        Assertions.checkArgument(f11 > 0.0f && f11 <= 180.0f);
        Assertions.checkArgument(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i15;
        float f14 = radians2 / i11;
        int i18 = i11 + 1;
        int i19 = ((i18 * 2) + 2) * i15;
        float[] fArr = new float[i19 * 3];
        float[] fArr2 = new float[i19 * 2];
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < i15) {
            float f15 = radians / 2.0f;
            float f16 = (i20 * f13) - f15;
            int i23 = i16;
            int i24 = i20 + 1;
            int i25 = i17;
            float f17 = (i24 * f13) - f15;
            int i26 = 0;
            while (i26 < i18) {
                float f18 = radians;
                float f19 = radians2;
                int i27 = i22;
                int i28 = 0;
                int i29 = 2;
                while (i28 < i29) {
                    int i30 = i24;
                    float f20 = i26 * f14;
                    float f21 = f13;
                    float f22 = f14;
                    double d10 = f10;
                    double d11 = (f20 + 3.1415927f) - (f19 / 2.0f);
                    double d12 = i28 == 0 ? f16 : f17;
                    fArr[i21] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    fArr[i21 + 1] = (float) (d10 * Math.sin(d12));
                    int i31 = i21 + 3;
                    fArr[i21 + 2] = (float) (Math.cos(d11) * d10 * Math.cos(d12));
                    fArr2[i27] = f20 / f19;
                    int i32 = i27 + 2;
                    fArr2[i27 + 1] = ((i20 + i28) * f21) / f18;
                    if ((i26 == 0 && i28 == 0) || (i26 == i11 && i28 == i25)) {
                        i13 = i23;
                        System.arraycopy(fArr, i21, fArr, i31, i13);
                        i21 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i27, fArr2, i32, 2);
                        i27 += 4;
                    } else {
                        i13 = i23;
                        i14 = 2;
                        i21 = i31;
                        i27 = i32;
                    }
                    i28++;
                    i23 = i13;
                    i25 = 1;
                    i29 = i14;
                    i24 = i30;
                    f13 = f21;
                    f14 = f22;
                }
                i26 += i25;
                radians = f18;
                i22 = i27;
                i24 = i24;
                f14 = f14;
                radians2 = f19;
            }
            int i33 = i24;
            i15 = i10;
            i16 = i23;
            i17 = i25;
            i20 = i33;
        }
        int i34 = i17;
        SubMesh[] subMeshArr = new SubMesh[i34];
        subMeshArr[0] = new SubMesh(0, fArr, fArr2, i34);
        return new Projection(new Mesh(subMeshArr), i12);
    }
}
