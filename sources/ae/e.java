package ae;

import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;
import pd.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y8.a f4264a = y8.a.FullLoad;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4265a;

        static {
            int[] iArr = new int[CreativeLoadingMethod.values().length];
            f4265a = iArr;
            try {
                iArr[CreativeLoadingMethod.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4265a[CreativeLoadingMethod.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ae.a a(y8.b r3) {
        /*
            int r0 = r3.c()
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L19
            r1 = 6
            if (r0 == r1) goto L16
            r1 = 7
            if (r0 == r1) goto L1c
            ae.a r1 = ae.a.f4248r
            goto L21
        L16:
            ae.a r1 = ae.a.f4244n
            goto L21
        L19:
            ae.a r1 = ae.a.f4246p
            goto L21
        L1c:
            ae.a r1 = ae.a.f4247q
            goto L21
        L1f:
            ae.a r1 = ae.a.f4235e
        L21:
            ae.a r2 = new ae.a
            java.lang.String r3 = r3.d()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.e.a(y8.b):ae.a");
    }

    public static y8.a b(Object obj) {
        CreativeLoadingMethod creativeLoadingMethodValueOf;
        if (obj == null) {
            return f4264a;
        }
        if (obj instanceof y8.a) {
            return (y8.a) obj;
        }
        if (obj instanceof CreativeLoadingMethod) {
            creativeLoadingMethodValueOf = (CreativeLoadingMethod) obj;
        } else if (obj instanceof String) {
            try {
                creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf((String) obj);
            } catch (IllegalArgumentException unused) {
                creativeLoadingMethodValueOf = null;
            }
        } else {
            creativeLoadingMethodValueOf = null;
        }
        if (creativeLoadingMethodValueOf == null) {
            return f4264a;
        }
        int i10 = a.f4265a[creativeLoadingMethodValueOf.ordinal()];
        return i10 != 1 ? i10 != 2 ? f4264a : y8.a.PartialLoad : y8.a.Stream;
    }

    public static b9.k c(AdExtension.ControlAsset controlAsset) {
        if (controlAsset == null) {
            return null;
        }
        try {
            b9.k kVar = new b9.k();
            kVar.V(controlAsset.getMargin());
            kVar.Z(controlAsset.getPadding());
            kVar.M(controlAsset.getContent());
            kVar.N(f0.t(controlAsset.getFill()));
            kVar.P(Integer.valueOf(controlAsset.getFontStyle()));
            kVar.f0(Integer.valueOf(controlAsset.getWidth()));
            kVar.Q(Integer.valueOf(controlAsset.getHeight()));
            kVar.S(Float.valueOf(controlAsset.getHideafter()));
            kVar.T(io.bidmachine.core.h.Z(controlAsset.getX()));
            kVar.d0(io.bidmachine.core.h.c0(controlAsset.getY()));
            kVar.W(Float.valueOf(controlAsset.getOpacity()));
            kVar.X(Boolean.valueOf(controlAsset.getOutlined()));
            kVar.a0(f0.t(controlAsset.getStroke()));
            kVar.b0(Float.valueOf(controlAsset.getStrokeWidth()));
            kVar.c0(controlAsset.getStyle());
            kVar.e0(Boolean.valueOf(controlAsset.getVisible()));
            return kVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
