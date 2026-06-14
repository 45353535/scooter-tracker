package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum e implements pd.p {
    Left("left"),
    Top("top"),
    Right("right"),
    Bottom("bottom");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74450c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74456b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String str) {
            return (e) pd.g0.l(e.values(), str);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    e(String str) {
        this.f74456b = str;
    }

    public final e g() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return Right;
        }
        if (i10 == 2) {
            return Bottom;
        }
        if (i10 == 3) {
            return Left;
        }
        if (i10 == 4) {
            return Top;
        }
        throw new lf.m();
    }

    @Override // pd.p
    public String getKey() {
        return this.f74456b;
    }
}
