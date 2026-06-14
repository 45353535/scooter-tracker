package com.my.target;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w5 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f61007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f61008b;

        static {
            boolean z10;
            try {
                Class.forName(b2.class.getName());
                z10 = true;
            } catch (Throwable unused) {
                gb.a("ExoPlayer doesn't exist, add ExoPlayer dependency to play video");
                z10 = false;
            }
            f61007a = z10;
            f61008b = true;
        }
    }

    public static boolean a() {
        return a.f61007a;
    }

    public static boolean b() {
        return a.f61008b;
    }

    public static y a(boolean z10, Context context) {
        if (z10) {
            try {
                if (a()) {
                    return b2.a(context);
                }
            } catch (Throwable th2) {
                gb.b("MediaUtils error: exception occurred while creating ExoVideoPlayer: " + th2.getMessage());
            }
        }
        return r1.j();
    }

    public static float[] b(v5 v5Var, float[] fArr, float f10) {
        Arrays.sort(fArr);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        int i11 = 0;
        for (s5 s5Var : v5Var.d()) {
            if (i11 >= fArr.length) {
                gb.a("MediaUtils: Midroll mediabanner missing - not enough user midPoints");
                s5Var.d(-1.0f);
            } else {
                float f11 = fArr[i11];
                if (f11 > f10) {
                    gb.a("MediaUtils: Cannot set midPoint " + f11 + " - out of duration");
                    s5Var.d(-1.0f);
                } else {
                    s5Var.d(f11);
                    treeSet.add(Float.valueOf(f11));
                    if (!"statistics".equals(s5Var.C())) {
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayListG = v5Var.g();
        int size = arrayListG.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListG.get(i12);
            i12++;
            u uVar = (u) obj;
            if (i11 >= fArr.length) {
                gb.a("MediaUtils: Midroll service missing - not enough user midPoints");
                uVar.b(-1.0f);
            } else {
                float f12 = fArr[i11];
                if (f12 > f10) {
                    gb.a("MediaUtils: Cannot set midPoint " + f12 + " - out of duration");
                    uVar.b(-1.0f);
                } else {
                    uVar.b(f12);
                    treeSet.add(Float.valueOf(f12));
                    i11++;
                }
            }
        }
        float[] fArr2 = new float[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            fArr2[i10] = ((Float) it.next()).floatValue();
            i10++;
        }
        return fArr2;
    }

    public static float[] a(float f10, float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = (f10 / 100.0f) * fArr[i10];
        }
        return fArr2;
    }

    public static float[] a(v5 v5Var, float[] fArr, float f10) {
        if (fArr != null && fArr.length != 0) {
            return b(v5Var, fArr, f10);
        }
        return a(v5Var, f10);
    }

    public static float[] a(w3 w3Var, float[] fArr, float f10) {
        if (fArr != null && fArr.length != 0) {
            return b(w3Var, fArr, f10);
        }
        return a(w3Var, f10);
    }

    public static float[] a(v5 v5Var, float f10) {
        float f11;
        float fY;
        TreeSet treeSet = new TreeSet();
        Iterator it = v5Var.d().iterator();
        while (true) {
            f11 = 10.0f;
            if (!it.hasNext()) {
                break;
            }
            s5 s5Var = (s5) it.next();
            float fS = s5Var.S();
            float fT = s5Var.T();
            if (fT >= 0.0f && fT <= 100.0f) {
                fS = f10 * (fT / 100.0f);
            } else if (fS < 0.0f || fS > f10) {
                if (fS == -1.0f && fT == -1.0f) {
                    fS = f10 * 0.5f;
                } else {
                    gb.a("MediaUtils: Midroll banner " + s5Var.r() + " excluded, had point=" + fS + ", pointP=" + fT + ", content duration=" + f10);
                }
            }
            float fRound = Math.round(fS * 10.0f) / 10.0f;
            s5Var.d(fRound);
            treeSet.add(Float.valueOf(fRound));
        }
        ArrayList arrayListG = v5Var.g();
        int size = arrayListG.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListG.get(i11);
            i11++;
            u uVar = (u) obj;
            float fY2 = uVar.y();
            float fZ = uVar.z();
            if (fZ >= 0.0f && fZ <= 100.0f) {
                fY = f10 * (fZ / 100.0f);
            } else if (fY2 >= 0.0f && fY2 <= f10) {
                fY = uVar.y();
            } else {
                gb.a("MediaUtils: Midroll service " + uVar.s() + " excluded, had point=" + fY2 + ", pointP=" + fZ + ", content duration=" + f10);
                f11 = 10.0f;
            }
            float fRound2 = Math.round(fY * f11) / f11;
            uVar.b(fRound2);
            treeSet.add(Float.valueOf(fRound2));
            f11 = 10.0f;
        }
        float[] fArr = new float[treeSet.size()];
        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            fArr[i10] = ((Float) it2.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static float[] b(w3 w3Var, float[] fArr, float f10) {
        Arrays.sort(fArr);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        int i11 = 0;
        for (k0 k0Var : w3Var.d()) {
            if (i11 >= fArr.length) {
                gb.a("MediaUtils: Midroll mediabanner missing - not enough user midPoints");
                k0Var.d(-1.0f);
            } else {
                float f11 = fArr[i11];
                if (f11 > f10) {
                    gb.a("MediaUtils: Cannot set midPoint " + f11 + " - out of duration");
                    k0Var.d(-1.0f);
                } else {
                    k0Var.d(f11);
                    treeSet.add(Float.valueOf(f11));
                    if (!"statistics".equals(k0Var.C())) {
                        i11++;
                    }
                }
            }
        }
        for (u uVar : w3Var.g()) {
            if (i11 >= fArr.length) {
                gb.a("MediaUtils: Midroll service missing - not enough user midPoints");
                uVar.b(-1.0f);
            } else {
                float f12 = fArr[i11];
                if (f12 > f10) {
                    gb.a("MediaUtils: Cannot set midPoint " + f12 + " - out of duration");
                    uVar.b(-1.0f);
                } else {
                    uVar.b(f12);
                    treeSet.add(Float.valueOf(f12));
                    i11++;
                }
            }
        }
        float[] fArr2 = new float[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            fArr2[i10] = ((Float) it.next()).floatValue();
            i10++;
        }
        return fArr2;
    }

    public static float[] a(w3 w3Var, float f10) {
        float fY;
        TreeSet treeSet = new TreeSet();
        for (k0 k0Var : w3Var.d()) {
            float fS = k0Var.S();
            float fT = k0Var.T();
            if (fT >= 0.0f && fT <= 100.0f) {
                fS = f10 * (fT / 100.0f);
            } else if (fS < 0.0f || fS > f10) {
                gb.a("MediaUtils: Midroll banner " + k0Var.r() + " excluded, had point=" + fS + ", pointP=" + fT + ", content duration=" + f10);
            }
            float fRound = Math.round(fS * 10.0f) / 10.0f;
            k0Var.d(fRound);
            treeSet.add(Float.valueOf(fRound));
        }
        for (u uVar : w3Var.g()) {
            float fY2 = uVar.y();
            float fZ = uVar.z();
            if (fZ >= 0.0f && fZ <= 100.0f) {
                fY = (fZ / 100.0f) * f10;
            } else if (fY2 >= 0.0f && fY2 <= f10) {
                fY = uVar.y();
            } else {
                gb.a("MediaUtils: Midroll service " + uVar.s() + " excluded, had point=" + fY2 + ", pointP=" + fZ + ", content duration=" + f10);
            }
            float fRound2 = Math.round(fY * 10.0f) / 10.0f;
            uVar.b(fRound2);
            treeSet.add(Float.valueOf(fRound2));
        }
        float[] fArr = new float[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Float) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }
}
