package net.pubnative.lite.sdk.views.shape.path.parser;

import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
class PathParser {
    private static final String TAG = SvgToPath.TAG;

    PathParser() {
    }

    public static Path doPath(String str) {
        char c10;
        int i10;
        float f10;
        double d10;
        double d11;
        double d12;
        boolean z10;
        float f11;
        double d13;
        boolean z11;
        double d14;
        RectF rectF;
        char c11;
        double d15;
        float f12;
        float f13;
        float fNextFloat;
        float fNextFloat2;
        float f14;
        float f15;
        String str2 = str;
        int length = str2.length();
        ParserHelper parserHelper = new ParserHelper(str2);
        parserHelper.skipWhitespace();
        Path path = new Path();
        RectF rectF2 = new RectF();
        float f16 = 0.0f;
        char c12 = 'x';
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (true) {
            int i11 = parserHelper.pos;
            if (i11 >= length) {
                return path;
            }
            char cCharAt = str2.charAt(i11);
            if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == '-') {
                if (c12 == 'M') {
                    c12 = 'L';
                } else if (c12 == 'm') {
                    c10 = 'l';
                }
                c10 = c12;
            } else {
                parserHelper.advance();
                c10 = cCharAt;
            }
            boolean z12 = true;
            path.computeBounds(rectF2, true);
            switch (c10) {
                case 'A':
                case 'a':
                    float f23 = f17;
                    float f24 = f18;
                    float fNextFloat3 = parserHelper.nextFloat();
                    float fNextFloat4 = parserHelper.nextFloat();
                    float fNextFloat5 = parserHelper.nextFloat();
                    int iNextFloat = (int) parserHelper.nextFloat();
                    int iNextFloat2 = (int) parserHelper.nextFloat();
                    float fNextFloat6 = parserHelper.nextFloat();
                    float fNextFloat7 = parserHelper.nextFloat();
                    if (c10 == 'a') {
                        fNextFloat6 += f23;
                        fNextFloat7 += f24;
                    }
                    i10 = length;
                    float f25 = fNextFloat7;
                    double d16 = f23;
                    double d17 = f24;
                    double d18 = fNextFloat6;
                    double d19 = f25;
                    double d20 = fNextFloat3;
                    double d21 = fNextFloat4;
                    double d22 = fNextFloat5;
                    if (iNextFloat == 1) {
                        f10 = f25;
                        d10 = d21;
                        d11 = d17;
                        d12 = d16;
                        z10 = true;
                    } else {
                        f10 = f25;
                        d10 = d21;
                        d11 = d17;
                        d12 = d16;
                        z10 = false;
                    }
                    if (iNextFloat2 == 1) {
                        z11 = true;
                        f11 = f10;
                        d13 = d18;
                        d14 = d22;
                        rectF = rectF2;
                        d15 = d19;
                        f12 = 0.0f;
                        f13 = fNextFloat6;
                        c11 = c10;
                    } else {
                        f11 = f10;
                        d13 = d18;
                        z11 = false;
                        d14 = d22;
                        rectF = rectF2;
                        c11 = c10;
                        d15 = d19;
                        f12 = 0.0f;
                        f13 = fNextFloat6;
                    }
                    drawArc(path, d12, d11, d13, d15, d20, d10, d14, z10, z11);
                    z12 = false;
                    f18 = f11;
                    f17 = f13;
                    break;
                case 'C':
                case 'c':
                    float f26 = f17;
                    float f27 = f18;
                    float fNextFloat8 = parserHelper.nextFloat();
                    float fNextFloat9 = parserHelper.nextFloat();
                    float fNextFloat10 = parserHelper.nextFloat();
                    float fNextFloat11 = parserHelper.nextFloat();
                    float fNextFloat12 = parserHelper.nextFloat();
                    float fNextFloat13 = parserHelper.nextFloat();
                    if (c10 == 'c') {
                        fNextFloat8 += f26;
                        fNextFloat10 += f26;
                        fNextFloat12 += f26;
                        fNextFloat9 += f27;
                        fNextFloat11 += f27;
                        fNextFloat13 += f27;
                    }
                    float f28 = fNextFloat8;
                    float f29 = fNextFloat9;
                    float f30 = fNextFloat10;
                    float f31 = fNextFloat11;
                    float f32 = fNextFloat12;
                    float f33 = fNextFloat13;
                    path.cubicTo(f28, f29, f30, f31, f32, f33);
                    f21 = f30;
                    f22 = f31;
                    i10 = length;
                    rectF = rectF2;
                    f17 = f32;
                    c11 = c10;
                    f18 = f33;
                    f12 = 0.0f;
                    break;
                case 'H':
                case 'h':
                    float f34 = f17;
                    float f35 = f18;
                    float fNextFloat14 = parserHelper.nextFloat();
                    if (c10 != 'h') {
                        path.lineTo(fNextFloat14, f35);
                        f18 = f35;
                        f17 = fNextFloat14;
                        i10 = length;
                        rectF = rectF2;
                        f12 = f16;
                        c11 = c10;
                        z12 = false;
                    } else {
                        path.rLineTo(fNextFloat14, f16);
                        float f36 = f34 + fNextFloat14;
                        i10 = length;
                        f18 = f35;
                        rectF = rectF2;
                        f12 = f16;
                        c11 = c10;
                        z12 = false;
                        f17 = f36;
                    }
                    break;
                case 'L':
                case 'l':
                    float f37 = f17;
                    float f38 = f18;
                    float fNextFloat15 = parserHelper.nextFloat();
                    float fNextFloat16 = parserHelper.nextFloat();
                    if (c10 == 'l') {
                        path.rLineTo(fNextFloat15, fNextFloat16);
                        float f39 = f37 + fNextFloat15;
                        f18 = f38 + fNextFloat16;
                        i10 = length;
                        f17 = f39;
                    } else {
                        path.lineTo(fNextFloat15, fNextFloat16);
                        i10 = length;
                        f17 = fNextFloat15;
                        f18 = fNextFloat16;
                    }
                    rectF = rectF2;
                    f12 = f16;
                    c11 = c10;
                    z12 = false;
                    break;
                case 'M':
                case 'm':
                    float f40 = f17;
                    float f41 = f18;
                    float fNextFloat17 = parserHelper.nextFloat();
                    float fNextFloat18 = parserHelper.nextFloat();
                    if (c10 == 'm') {
                        path.rMoveTo(fNextFloat17, fNextFloat18);
                        fNextFloat17 += f40;
                        fNextFloat18 += f41;
                    } else {
                        path.moveTo(fNextFloat17, fNextFloat18);
                    }
                    i10 = length;
                    f17 = fNextFloat17;
                    f19 = f17;
                    f18 = fNextFloat18;
                    f20 = f18;
                    rectF = rectF2;
                    f12 = f16;
                    c11 = c10;
                    z12 = false;
                    break;
                case 'Q':
                case 'q':
                    float fNextFloat19 = parserHelper.nextFloat();
                    float fNextFloat20 = parserHelper.nextFloat();
                    fNextFloat = parserHelper.nextFloat();
                    fNextFloat2 = parserHelper.nextFloat();
                    if (c10 == 'q') {
                        fNextFloat += f17;
                        fNextFloat2 += f18;
                        fNextFloat19 += f17;
                        fNextFloat20 += f18;
                    }
                    float f42 = f18;
                    float f43 = fNextFloat19;
                    path.cubicTo(f17, f42, f43, fNextFloat20, fNextFloat, fNextFloat2);
                    f21 = f43;
                    f22 = fNextFloat20;
                    i10 = length;
                    f17 = fNextFloat;
                    f18 = fNextFloat2;
                    rectF = rectF2;
                    f12 = f16;
                    c11 = c10;
                    break;
                case 'S':
                case 's':
                    float fNextFloat21 = parserHelper.nextFloat();
                    float fNextFloat22 = parserHelper.nextFloat();
                    float fNextFloat23 = parserHelper.nextFloat();
                    float fNextFloat24 = parserHelper.nextFloat();
                    if (c10 == 's') {
                        fNextFloat21 += f17;
                        fNextFloat23 += f17;
                        fNextFloat22 += f18;
                        fNextFloat24 += f18;
                    }
                    float f44 = (f18 * 2.0f) - f22;
                    f14 = fNextFloat21;
                    f15 = fNextFloat22;
                    fNextFloat = fNextFloat23;
                    fNextFloat2 = fNextFloat24;
                    path.cubicTo((f17 * 2.0f) - f21, f44, f14, f15, fNextFloat, fNextFloat2);
                    i10 = length;
                    f21 = f14;
                    f22 = f15;
                    f17 = fNextFloat;
                    f18 = fNextFloat2;
                    rectF = rectF2;
                    f12 = f16;
                    c11 = c10;
                    break;
                case 'T':
                case 't':
                    float fNextFloat25 = parserHelper.nextFloat();
                    float fNextFloat26 = parserHelper.nextFloat();
                    if (c10 == 't') {
                        fNextFloat25 += f17;
                        fNextFloat26 += f18;
                    }
                    fNextFloat2 = fNextFloat26;
                    fNextFloat = fNextFloat25;
                    float f45 = (f17 * 2.0f) - f21;
                    f15 = (2.0f * f18) - f22;
                    float f46 = f17;
                    float f47 = f18;
                    f14 = f45;
                    path.cubicTo(f46, f47, f14, f15, fNextFloat, fNextFloat2);
                    i10 = length;
                    f21 = f14;
                    f22 = f15;
                    f17 = fNextFloat;
                    f18 = fNextFloat2;
                    rectF = rectF2;
                    f12 = f16;
                    c11 = c10;
                    break;
                case 'V':
                case 'v':
                    float fNextFloat27 = parserHelper.nextFloat();
                    if (c10 != 'v') {
                        path.lineTo(f17, fNextFloat27);
                        i10 = length;
                        f18 = fNextFloat27;
                        rectF = rectF2;
                        f12 = f16;
                        c11 = c10;
                        z12 = false;
                    } else {
                        path.rLineTo(f16, fNextFloat27);
                        f18 += fNextFloat27;
                        i10 = length;
                        rectF = rectF2;
                        f12 = f16;
                        c11 = c10;
                        z12 = false;
                    }
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    i10 = length;
                    rectF = rectF2;
                    f12 = f16;
                    c11 = c10;
                    f17 = f19;
                    f18 = f20;
                    z12 = false;
                    break;
                default:
                    Log.w(TAG, "Invalid path command: " + c10);
                    parserHelper.advance();
                    i10 = length;
                    rectF = rectF2;
                    f12 = f16;
                    c11 = c10;
                    z12 = false;
                    break;
            }
            if (!z12) {
                f21 = f17;
                f22 = f18;
            }
            parserHelper.skipWhitespace();
            rectF2 = rectF;
            f16 = f12;
            length = i10;
            c12 = c11;
            str2 = str;
        }
    }

    private static void drawArc(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17 = (d10 - d12) / 2.0d;
        double d18 = (d11 - d13) / 2.0d;
        double radians = Math.toRadians(d16 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d19 = (dCos * d17) + (dSin * d18);
        double d20 = ((-dSin) * d17) + (d18 * dCos);
        double dAbs = Math.abs(d14);
        double dAbs2 = Math.abs(d15);
        double d21 = dAbs * dAbs;
        double d22 = dAbs2 * dAbs2;
        double d23 = d19 * d19;
        double d24 = d20 * d20;
        double d25 = (d23 / d21) + (d24 / d22);
        if (d25 > 1.0d) {
            dAbs *= Math.sqrt(d25);
            dAbs2 *= Math.sqrt(d25);
            d21 = dAbs * dAbs;
            d22 = dAbs2 * dAbs2;
        }
        double d26 = z10 == z11 ? -1.0d : 1.0d;
        double d27 = d21 * d22;
        double d28 = d21 * d24;
        double d29 = d22 * d23;
        double d30 = ((d27 - d28) - d29) / (d28 + d29);
        if (d30 < 0.0d) {
            d30 = 0.0d;
        }
        double dSqrt = d26 * Math.sqrt(d30);
        double d31 = ((dAbs * d20) / dAbs2) * dSqrt;
        double d32 = dAbs;
        double d33 = dSqrt * (-((dAbs2 * d19) / d32));
        double d34 = ((d10 + d12) / 2.0d) + ((dCos * d31) - (dSin * d33));
        double d35 = ((d11 + d13) / 2.0d) + (dSin * d31) + (dCos * d33);
        double d36 = (d19 - d31) / d32;
        double d37 = (d20 - d33) / dAbs2;
        double d38 = ((-d19) - d31) / d32;
        double d39 = ((-d20) - d33) / dAbs2;
        double d40 = (d36 * d36) + (d37 * d37);
        double degrees = Math.toDegrees((d37 < 0.0d ? -1.0d : 1.0d) * Math.acos(d36 / Math.sqrt(d40)));
        double degrees2 = Math.toDegrees(((d36 * d39) - (d37 * d38) < 0.0d ? -1.0d : 1.0d) * Math.acos(((d36 * d38) + (d37 * d39)) / Math.sqrt(d40 * ((d38 * d38) + (d39 * d39)))));
        if (!z11 && degrees2 > 0.0d) {
            degrees2 -= 360.0d;
        } else if (z11 && degrees2 < 0.0d) {
            degrees2 += 360.0d;
        }
        path.addArc(new RectF((float) (d34 - d32), (float) (d35 - dAbs2), (float) (d34 + d32), (float) (d35 + dAbs2)), (float) (degrees % 360.0d), (float) (degrees2 % 360.0d));
    }
}
