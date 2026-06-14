package ge;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f72760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f72761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f72762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f72763d;

    public b(a aVar, a aVar2, boolean z10, boolean z11) {
        this.f72760a = aVar;
        this.f72761b = aVar2;
        this.f72762c = z10;
        this.f72763d = z11;
    }

    static boolean b(a aVar, a aVar2, boolean z10) {
        if (z10 && aVar2.d(aVar)) {
            return true;
        }
        return !z10 && aVar2.c(aVar);
    }

    static boolean c(a aVar, a aVar2, boolean z10) {
        if (z10 && aVar2.f(aVar)) {
            return true;
        }
        return !z10 && aVar2.e(aVar);
    }

    public static b d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean zStartsWith = str.startsWith(C4240b4.j.f42672d);
            boolean zStartsWith2 = str.startsWith("(");
            if (zStartsWith || zStartsWith2) {
                str = str.substring(1);
            } else {
                zStartsWith = true;
            }
            boolean zEndsWith = str.endsWith(C4240b4.j.f42674e);
            boolean zEndsWith2 = str.endsWith(")");
            if (zEndsWith || zEndsWith2) {
                str = str.substring(0, str.length() - 1);
            } else {
                zEndsWith = true;
            }
            String[] strArrSplit = str.split(TokenBuilder.TOKEN_DELIMITER);
            if (strArrSplit.length >= 2) {
                return new b(a.g(strArrSplit[0]), a.g(strArrSplit[1]), zStartsWith, zEndsWith);
            }
            a aVarG = a.g(str);
            if (aVarG != null) {
                return new b(aVarG, aVarG, zStartsWith, zEndsWith);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean a(a aVar) {
        a aVar2;
        a aVar3 = this.f72760a;
        if (aVar3 != null && this.f72761b != null && b(aVar3, aVar, this.f72762c) && c(this.f72761b, aVar, this.f72763d)) {
            return true;
        }
        a aVar4 = this.f72760a;
        if (aVar4 != null && this.f72761b == null && b(aVar4, aVar, this.f72762c)) {
            return true;
        }
        if (this.f72760a == null && (aVar2 = this.f72761b) != null && c(aVar2, aVar, this.f72763d)) {
            return true;
        }
        return this.f72760a == null && this.f72761b == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f72762c == bVar.f72762c && this.f72763d == bVar.f72763d && Objects.equals(this.f72760a, bVar.f72760a) && Objects.equals(this.f72761b, bVar.f72761b)) {
                return true;
            }
        }
        return false;
    }
}
