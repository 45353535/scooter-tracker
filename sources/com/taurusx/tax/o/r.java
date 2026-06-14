package com.taurusx.tax.o;

import com.taurusx.tax.o.g0;
import com.taurusx.tax.o.i;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class r extends g {

    public static /* synthetic */ class z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f66514z;

        static {
            int[] iArr = new int[g0.f.values().length];
            f66514z = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f66514z;
                g0.f fVar = g0.f.INLINE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public r(Map<String, String> map, g0 g0Var) {
        super(map, g0Var);
    }

    @Override // com.taurusx.tax.o.g
    public void z() {
        String strC = c(g.f66428y);
        if (strC == null || strC.equals("")) {
            this.f66429w.z(i.w.PLAY_VIDEO, "Video can't be played with null or empty URL");
        } else {
            this.f66429w.getDisplayController().s(strC);
        }
    }

    @Override // com.taurusx.tax.o.g
    public boolean z(g0.f fVar) {
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            return super.z(fVar);
        }
        return false;
    }
}
