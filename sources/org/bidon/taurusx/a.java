package org.bidon.taurusx;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.taurusx.tax.w.s.w;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1150a f97716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f97717d = new a(LogConstants.KEY_MREC, 0, "MREC");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f97718e = new a("Banner", 1, "BANNER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f97719f = new a("Interstitial", 2, "INTERSTITIAL");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f97720g = new a("Rewarded", 3, w.f67531f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ a[] f97721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f97722i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97723b;

    /* JADX INFO: renamed from: org.bidon.taurusx.a$a, reason: collision with other inner class name */
    public static final class C1150a {
        public /* synthetic */ C1150a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            Object next;
            Iterator<E> it = a.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.N(((a) next).h(), str, true)) {
                    break;
                }
            }
            if (next != null) {
                return (a) next;
            }
            throw new IllegalArgumentException(("Unknown TaurusX ad format: " + str).toString());
        }

        private C1150a() {
        }
    }

    static {
        a[] aVarArrD = d();
        f97721h = aVarArrD;
        f97722i = qf.a.a(aVarArrD);
        f97716c = new C1150a(null);
    }

    private a(String str, int i10, String str2) {
        this.f97723b = str2;
    }

    private static final /* synthetic */ a[] d() {
        return new a[]{f97717d, f97718e, f97719f, f97720g};
    }

    public static EnumEntries g() {
        return f97722i;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f97721h.clone();
    }

    public final String h() {
        return this.f97723b;
    }
}
