package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes9.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    private static void a(long j10, StringBuffer stringBuffer) {
        long j11 = j10 << 1;
        if (j10 < 0) {
            j11 = ~j11;
        }
        while (j11 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j11)) + 63)));
            j11 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j11 + 63)));
    }

    private static boolean b(double d10, double d11, double d12, double d13, double d14, boolean z10) {
        if ((d14 >= 0.0d && d14 >= d12) || ((d14 < 0.0d && d14 < d12) || d13 <= -1.5707963267948966d || d10 <= -1.5707963267948966d || d11 <= -1.5707963267948966d || d10 >= 1.5707963267948966d || d11 >= 1.5707963267948966d || d12 <= -3.141592653589793d)) {
            return false;
        }
        double d15 = (((d12 - d14) * d10) + (d11 * d14)) / d12;
        if (d10 >= 0.0d && d11 >= 0.0d && d13 < d15) {
            return false;
        }
        if ((d10 > 0.0d || d11 > 0.0d || d13 < d15) && d13 < 1.5707963267948966d) {
            return z10 ? Math.tan(d13) >= g(d10, d11, d12, d14) : MathUtil.g(d13) >= e(d10, d11, d12, d14);
        }
        return true;
    }

    private static boolean c(LatLng latLng, List list, boolean z10, boolean z11, double d10) {
        return locationIndexOnEdgeOrPath(latLng, list, z10, z11, d10) >= 0;
    }

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z10) {
        return containsLocation(latLng.latitude, latLng.longitude, list, z10);
    }

    private static boolean d(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = MathUtil.d(d10, d14, d11 - d15);
        if (d17 <= d16) {
            return true;
        }
        double d18 = MathUtil.d(d12, d14, d13 - d15);
        if (d18 <= d16) {
            return true;
        }
        double dE = MathUtil.e(MathUtil.i(d17) * f(d10, d11, d12, d13, d14, d15));
        if (dE > d16) {
            return false;
        }
        double d19 = MathUtil.d(d10, d12, d11 - d13);
        double d20 = ((1.0d - (d19 * 2.0d)) * dE) + d19;
        if (d17 <= d20 && d18 <= d20) {
            if (d19 < 0.74d) {
                return true;
            }
            double d21 = 1.0d - (2.0d * dE);
            if (MathUtil.j((d17 - dE) / d21, (d18 - dE) / d21) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public static List<LatLng> decode(String str) {
        int i10;
        int i11;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            int i15 = 1;
            int i16 = 0;
            int i17 = 1;
            while (true) {
                i10 = i12 + 1;
                int iCharAt = str.charAt(i12) - '@';
                i17 += iCharAt << i16;
                i16 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i12 = i10;
            }
            int i18 = ((i17 & 1) != 0 ? ~(i17 >> 1) : i17 >> 1) + i13;
            int i19 = 0;
            while (true) {
                i11 = i10 + 1;
                int iCharAt2 = str.charAt(i10) - '@';
                i15 += iCharAt2 << i19;
                i19 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i10 = i11;
            }
            i14 += (i15 & 1) != 0 ? ~(i15 >> 1) : i15 >> 1;
            arrayList.add(new LatLng(((double) i18) * 1.0E-5d, ((double) i14) * 1.0E-5d));
            i13 = i18;
            i12 = i11;
        }
        return arrayList;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double radians5 = Math.toRadians(latLng3.latitude);
        double radians6 = Math.toRadians(latLng3.longitude);
        double dCos = Math.cos(radians3);
        double d10 = radians5 - radians3;
        double d11 = (radians6 - radians4) * dCos;
        double d12 = (((radians - radians3) * d10) + (((radians2 - radians4) * dCos) * d11)) / ((d10 * d10) + (d11 * d11));
        if (d12 <= 0.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        if (d12 >= 1.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng3);
        }
        double d13 = latLng2.latitude;
        double d14 = d13 + ((latLng3.latitude - d13) * d12);
        double d15 = latLng2.longitude;
        return SphericalUtil.computeDistanceBetween(latLng, new LatLng(d14, d15 + (d12 * (latLng3.longitude - d15))));
    }

    private static double e(double d10, double d11, double d12, double d13) {
        return ((MathUtil.g(d10) * (d12 - d13)) + (MathUtil.g(d11) * d13)) / d12;
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j10 = 0;
        long j11 = 0;
        for (LatLng latLng : list) {
            long jRound = Math.round(latLng.latitude * 100000.0d);
            long jRound2 = Math.round(latLng.longitude * 100000.0d);
            a(jRound - j10, stringBuffer);
            a(jRound2 - j11, stringBuffer);
            j10 = jRound;
            j11 = jRound2;
        }
        return stringBuffer.toString();
    }

    private static double f(double d10, double d11, double d12, double d13, double d14, double d15) {
        double dSin = Math.sin(d10);
        double dCos = Math.cos(d12);
        double dCos2 = Math.cos(d14);
        double d16 = d15 - d11;
        double d17 = d13 - d11;
        double dSin2 = Math.sin(d16) * dCos2;
        double dSin3 = Math.sin(d17) * dCos;
        double d18 = dSin * 2.0d;
        double dSin4 = Math.sin(d14 - d10) + (dCos2 * d18 * MathUtil.c(d16));
        double dSin5 = Math.sin(d12 - d10) + (d18 * dCos * MathUtil.c(d17));
        double d19 = ((dSin2 * dSin2) + (dSin4 * dSin4)) * ((dSin3 * dSin3) + (dSin5 * dSin5));
        if (d19 <= 0.0d) {
            return 1.0d;
        }
        return ((dSin2 * dSin5) - (dSin4 * dSin3)) / Math.sqrt(d19);
    }

    private static double g(double d10, double d11, double d12, double d13) {
        return ((Math.tan(d10) * Math.sin(d12 - d13)) + (Math.tan(d11) * Math.sin(d13))) / Math.sin(d12);
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z10, double d10) {
        return c(latLng, list, true, z10, d10);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z10, double d10) {
        return c(latLng, list, false, z10, d10);
    }

    public static int locationIndexOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z10, boolean z11, double d10) {
        int i10;
        double d11;
        int i11 = 0;
        char c10 = 1;
        int size = list.size();
        int i12 = -1;
        if (size == 0) {
            return -1;
        }
        double d12 = d10 / 6371009.0d;
        double dC = MathUtil.c(d12);
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        LatLng latLng2 = list.get(z10 ? size - 1 : 0);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        if (z11) {
            int i13 = 0;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.latitude);
                double radians6 = Math.toRadians(latLng3.longitude);
                if (d(radians3, radians4, radians5, radians6, radians, radians2, dC)) {
                    return Math.max(0, i13 - 1);
                }
                i13++;
                radians3 = radians5;
                radians4 = radians6;
            }
        } else {
            double d13 = radians - d12;
            double d14 = radians + d12;
            double dG = MathUtil.g(radians3);
            double dG2 = MathUtil.g(radians);
            int i14 = 0;
            for (LatLng latLng4 : list) {
                char c11 = c10;
                int i15 = i12;
                double d15 = d14;
                double radians7 = Math.toRadians(latLng4.latitude);
                double dG3 = MathUtil.g(radians7);
                int i16 = i11;
                double radians8 = Math.toRadians(latLng4.longitude);
                if (Math.max(radians3, radians7) < d13 || Math.min(radians3, radians7) > d15) {
                    i10 = i16;
                    d11 = radians;
                } else {
                    double dK = MathUtil.k(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double dK2 = MathUtil.k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double[] dArr = new double[3];
                    dArr[i16] = dK2;
                    dArr[c11] = dK2 + 6.283185307179586d;
                    dArr[2] = dK2 - 6.283185307179586d;
                    int i17 = i16;
                    while (i17 < 3) {
                        double d16 = dArr[i17];
                        double d17 = dG3 - dG;
                        double d18 = (dK * dK) + (d17 * d17);
                        double dB = d18 > 0.0d ? MathUtil.b(((d16 * dK) + ((dG2 - dG) * d17)) / d18, 0.0d, 1.0d) : 0.0d;
                        double d19 = radians;
                        if (MathUtil.d(d19, MathUtil.f(dG + (dB * d17)), d16 - (dB * dK)) < dC) {
                            return Math.max(i16, i14 - 1);
                        }
                        i17++;
                        radians = d19;
                    }
                    d11 = radians;
                    i10 = i16;
                }
                i14++;
                i11 = i10;
                radians4 = radians8;
                radians3 = radians7;
                i12 = i15;
                c10 = c11;
                d14 = d15;
                dG = dG3;
                radians = d11;
            }
        }
        return i12;
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z10, double d10) {
        return locationIndexOnEdgeOrPath(latLng, list, false, z10, d10);
    }

    public static List<LatLng> simplify(List<LatLng> list, double d10) {
        LatLng latLng;
        int size = list.size();
        int i10 = 1;
        if (size < 1) {
            throw new IllegalArgumentException("Polyline must have at least 1 point");
        }
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean zIsClosedPolygon = isClosedPolygon(list);
        if (zIsClosedPolygon) {
            latLng = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(new LatLng(latLng.latitude + 1.0E-11d, latLng.longitude + 1.0E-11d));
        } else {
            latLng = null;
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i11 = 0;
        dArr[0] = 1.0d;
        int i12 = size - 1;
        dArr[i12] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i12});
            int i13 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                int i14 = iArr[0] + i10;
                double d11 = 0.0d;
                while (i14 < iArr[i10]) {
                    int i15 = i10;
                    double dDistanceToLine = distanceToLine(list.get(i14), list.get(iArr[0]), list.get(iArr[i15]));
                    if (dDistanceToLine > d11) {
                        i13 = i14;
                        d11 = dDistanceToLine;
                    }
                    i14++;
                    i10 = i15;
                }
                int i16 = i10;
                if (d11 > d10) {
                    dArr[i13] = d11;
                    stack.push(new int[]{iArr[0], i13});
                    stack.push(new int[]{i13, iArr[i16]});
                }
                i10 = i16;
            }
        }
        if (zIsClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng2 : list) {
            if (dArr[i11] != 0.0d) {
                arrayList.add(latLng2);
            }
            i11++;
        }
        return arrayList;
    }

    public static boolean containsLocation(double d10, double d11, List<LatLng> list, boolean z10) {
        int size = list.size();
        boolean z11 = false;
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d10);
        double radians2 = Math.toRadians(d11);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.latitude);
        double radians4 = Math.toRadians(latLng.longitude);
        int i10 = 0;
        double d12 = radians3;
        for (LatLng latLng2 : list) {
            double dK = MathUtil.k(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d12 && dK == 0.0d) {
                return true;
            }
            boolean z12 = z11;
            double radians5 = Math.toRadians(latLng2.latitude);
            double radians6 = Math.toRadians(latLng2.longitude);
            if (b(d12, radians5, MathUtil.k(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, dK, z10)) {
                i10++;
            }
            d12 = radians5;
            z11 = z12;
            radians4 = radians6;
        }
        boolean z13 = z11;
        if ((i10 & 1) != 0) {
            return true;
        }
        return z13;
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z10) {
        return isLocationOnEdge(latLng, list, z10, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z10) {
        return isLocationOnPath(latLng, list, z10, 0.1d);
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z10) {
        return locationIndexOnPath(latLng, list, z10, 0.1d);
    }
}
