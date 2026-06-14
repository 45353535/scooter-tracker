package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum j0 implements pd.p {
    Linear("linear"),
    Radial("radial"),
    Bilinear("bilinear");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74558c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74563b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j0 a(String str) {
            return (j0) pd.g0.l(j0.values(), str);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.Linear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.Radial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j0.Bilinear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    j0(String str) {
        this.f74563b = str;
    }

    public final int g() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 3;
        }
        throw new lf.m();
    }

    @Override // pd.p
    public String getKey() {
        return this.f74563b;
    }
}
