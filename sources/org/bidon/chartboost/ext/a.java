package org.bidon.chartboost.ext;

import b1.b;
import e1.a;
import e1.i;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97215a = "9.10.2.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97216b = b.e();

    /* JADX INFO: renamed from: org.bidon.chartboost.ext.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1125a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.EnumC0857a.values().length];
            try {
                iArr[a.EnumC0857a.f68676d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0857a.f68677e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0857a.f68678f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0857a.f68679g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC0857a.f68681i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC0857a.f68682j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[i.a.values().length];
            try {
                iArr2[i.a.f68754d.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[i.a.f68756f.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[i.a.f68757g.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[i.a.f68758h.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[i.a.f68759i.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BidonError a(e1.a aVar) {
        a.EnumC0857a enumC0857aA = aVar != null ? aVar.a() : null;
        switch (enumC0857aA == null ? -1 : C1125a.$EnumSwitchMapping$0[enumC0857aA.ordinal()]) {
            case 1:
                DemandId demandIdA = org.bidon.chartboost.a.a();
                Exception excB = aVar.b();
                return new BidonError.NetworkError(demandIdA, excB != null ? excB.getMessage() : null);
            case 2:
                DemandId demandIdA2 = org.bidon.chartboost.a.a();
                Exception excB2 = aVar.b();
                return new BidonError.NetworkError(demandIdA2, excB2 != null ? excB2.getMessage() : null);
            case 3:
                return new BidonError.NoFill(org.bidon.chartboost.a.a());
            case 4:
                return BidonError.SdkNotInitialized.INSTANCE;
            case 5:
                return new BidonError.NoFill(org.bidon.chartboost.a.a());
            case 6:
                return BidonError.AdNotReady.INSTANCE;
            default:
                return new BidonError.Unspecified(org.bidon.chartboost.a.a(), aVar != null ? aVar.b() : null, null, 4, null);
        }
    }

    public static final BidonError b(i iVar) {
        i.a aVarA = iVar != null ? iVar.a() : null;
        int i10 = aVarA == null ? -1 : C1125a.$EnumSwitchMapping$1[aVarA.ordinal()];
        if (i10 == 1) {
            return BidonError.SdkNotInitialized.INSTANCE;
        }
        if (i10 == 2) {
            DemandId demandIdA = org.bidon.chartboost.a.a();
            Exception excB = iVar.b();
            return new BidonError.NetworkError(demandIdA, excB != null ? excB.getMessage() : null);
        }
        if (i10 == 3) {
            return BidonError.AdNotReady.INSTANCE;
        }
        if (i10 == 4) {
            return new BidonError.NoFill(org.bidon.chartboost.a.a());
        }
        if (i10 != 5) {
            return new BidonError.Unspecified(org.bidon.chartboost.a.a(), iVar != null ? iVar.b() : null, null, 4, null);
        }
        return BidonError.AdNotReady.INSTANCE;
    }

    public static final String c() {
        return f97215a;
    }

    public static final String d() {
        return f97216b;
    }
}
