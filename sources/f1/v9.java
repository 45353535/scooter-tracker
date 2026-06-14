package f1;

import e1.a;
import e1.c;
import e1.d;
import e1.i;
import g1.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v9 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71380b;

        static {
            int[] iArr = new int[a.b.values().length];
            try {
                iArr[a.b.f72115c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.f72120h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.f72121i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.f72122j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.f72123k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.f72124l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.b.f72126n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.b.f72127o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.b.f72128p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.b.f72131s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.b.f72132t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.b.f72134v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.b.B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a.b.E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a.b.F.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[a.b.G.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f71379a = iArr;
            int[] iArr2 = new int[a.EnumC0885a.values().length];
            try {
                iArr2[a.EnumC0885a.f72108b.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[a.EnumC0885a.f72109c.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f71380b = iArr2;
        }
    }

    public static final e1.a a(a.d error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a.EnumC0857a enumC0857a = error == a.b.f72115c ? a.EnumC0857a.f68676d : (error == a.b.f72116d || error == a.b.f72119g) ? a.EnumC0857a.f68677e : error == a.b.f72120h ? a.EnumC0857a.f68678f : error == a.b.f72121i ? a.EnumC0857a.f68679g : error == a.b.f72129q ? a.EnumC0857a.f68680h : (error == a.b.f72130r || error == a.b.f72135w || error == a.b.D) ? a.EnumC0857a.f68681i : error == a.b.H ? a.EnumC0857a.f68676d : a.EnumC0857a.f68675c;
        return new e1.a(enumC0857a, null, 2, null);
    }

    public static final e1.d b(a.EnumC0885a error, String errorMsg) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        int i10 = a.f71380b[error.ordinal()];
        return new e1.d(i10 != 1 ? i10 != 2 ? d.a.f68736c : d.a.f68738e : d.a.f68737d, new Exception(errorMsg));
    }

    public static final e1.i c(a.b error) {
        i.a aVar;
        Intrinsics.checkNotNullParameter(error, "error");
        switch (a.f71379a[error.ordinal()]) {
            case 1:
                aVar = i.a.f68756f;
                break;
            case 2:
                aVar = i.a.f68758h;
                break;
            case 3:
                aVar = i.a.f68754d;
                break;
            case 4:
                aVar = i.a.f68755e;
                break;
            case 5:
                aVar = i.a.f68757g;
                break;
            case 6:
                aVar = i.a.f68757g;
                break;
            case 7:
                aVar = i.a.f68757g;
                break;
            case 8:
                aVar = i.a.f68757g;
                break;
            case 9:
                aVar = i.a.f68757g;
                break;
            case 10:
                aVar = i.a.f68757g;
                break;
            case 11:
                aVar = i.a.f68757g;
                break;
            case 12:
                aVar = i.a.f68757g;
                break;
            case 13:
                aVar = i.a.f68757g;
                break;
            case 14:
                aVar = i.a.f68757g;
                break;
            case 15:
                aVar = i.a.f68757g;
                break;
            case 16:
                aVar = i.a.f68756f;
                break;
            default:
                aVar = i.a.f68753c;
                break;
        }
        return new e1.i(aVar, null, 2, null);
    }

    public static final e1.i d(Throwable error) {
        i.a aVar;
        Intrinsics.checkNotNullParameter(error, "error");
        c.e fVar = error instanceof c.e ? (c.e) error : null;
        if (fVar == null) {
            fVar = new c.e.f(error.getMessage(), error);
        }
        if (fVar instanceof c.e.f) {
            aVar = i.a.f68753c;
        } else if (fVar instanceof c.e.b) {
            aVar = i.a.f68758h;
        } else if (fVar instanceof c.e.a) {
            aVar = i.a.f68763m;
        } else if (fVar instanceof c.e.C0863c) {
            aVar = i.a.f68764n;
        } else if (fVar instanceof c.e.C0864e) {
            aVar = i.a.f68761k;
        } else {
            if (!(fVar instanceof c.e.d)) {
                throw new lf.m();
            }
            aVar = i.a.f68754d;
        }
        return new e1.i(aVar, new Exception(error));
    }
}
