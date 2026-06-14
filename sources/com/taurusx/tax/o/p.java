package com.taurusx.tax.o;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.o.g0;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class p extends g {

    public static /* synthetic */ class z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f66476z;

        static {
            int[] iArr = new int[g0.f.values().length];
            f66476z = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f66476z;
                g0.f fVar = g0.f.INLINE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public p(Map<String, String> map, g0 g0Var) {
        super(map, g0Var);
    }

    @Override // com.taurusx.tax.o.g
    public void z() {
        int iY = y(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        int iY2 = y("h");
        String strC = c("url");
        boolean z10 = z("shouldUseCustomClose");
        boolean z11 = z("lockOrientation");
        if (iY <= 0) {
            iY = this.f66429w.getDisplayController().f66492p;
        }
        int i10 = iY;
        if (iY2 <= 0) {
            iY2 = this.f66429w.getDisplayController().f66486i;
        }
        this.f66429w.getDisplayController().z(strC, i10, iY2, z10, z11);
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
