package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class e extends d {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[cg.b.values().length];
            try {
                iArr[cg.b.f6836c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cg.b.f6837d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cg.b.f6838e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cg.b.f6839f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cg.b.f6840g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[cg.b.f6841h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[cg.b.f6842i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final cg.b d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return cg.b.f6842i;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return cg.b.f6841h;
        }
        if (c10 == 'M') {
            return cg.b.f6840g;
        }
        if (c10 == 'S') {
            return cg.b.f6839f;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    public static final cg.b e(String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return cg.b.f6837d;
                                }
                            } else if (shortName.equals("ns")) {
                                return cg.b.f6836c;
                            }
                        } else if (shortName.equals("ms")) {
                            return cg.b.f6838e;
                        }
                    } else if (shortName.equals("s")) {
                        return cg.b.f6839f;
                    }
                } else if (shortName.equals("m")) {
                    return cg.b.f6840g;
                }
            } else if (shortName.equals("h")) {
                return cg.b.f6841h;
            }
        } else if (shortName.equals("d")) {
            return cg.b.f6842i;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    public static final String f(cg.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (a.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + bVar).toString());
        }
    }
}
