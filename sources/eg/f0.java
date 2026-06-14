package eg;

import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f69146b = new f0("DEFAULT", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f69147c = new f0("LAZY", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f69148d = new f0("ATOMIC", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f69149e = new f0("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ f0[] f69150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f69151g;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.f69146b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.f69148d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.f69149e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f0.f69147c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        f0[] f0VarArrD = d();
        f69150f = f0VarArrD;
        f69151g = qf.a.a(f0VarArrD);
    }

    private f0(String str, int i10) {
    }

    private static final /* synthetic */ f0[] d() {
        return new f0[]{f69146b, f69147c, f69148d, f69149e};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f69150f.clone();
    }

    public final void g(Function2 function2, Object obj, Continuation continuation) {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            kg.a.d(function2, obj, continuation);
            return;
        }
        if (i10 == 2) {
            of.c.c(function2, obj, continuation);
        } else if (i10 == 3) {
            kg.b.c(function2, obj, continuation);
        } else if (i10 != 4) {
            throw new lf.m();
        }
    }

    public final boolean h() {
        return this == f69147c;
    }
}
