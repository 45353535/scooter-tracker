package id;

import ic.n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum i0 implements pd.p {
    LeftRight("right"),
    TopBottom("bottom"),
    RightLeft("left"),
    BottomTop("top");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74531c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74537b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i0 a(String str) {
            return (i0) pd.g0.l(i0.values(), str);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.LeftRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.TopBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.RightLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i0.BottomTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    i0(String str) {
        this.f74537b = str;
    }

    public final n.c g() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return n.c.LEFT_RIGHT;
        }
        if (i10 == 2) {
            return n.c.TOP_BOTTOM;
        }
        if (i10 == 3) {
            return n.c.RIGHT_LEFT;
        }
        if (i10 == 4) {
            return n.c.BOTTOM_TOP;
        }
        throw new lf.m();
    }

    @Override // pd.p
    public String getKey() {
        return this.f74537b;
    }
}
