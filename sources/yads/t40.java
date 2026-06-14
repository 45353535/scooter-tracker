package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class t40 {

    @NotNull
    public static final s40 Companion = new s40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116047c;

    public /* synthetic */ t40(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f116045a = null;
        } else {
            this.f116045a = str;
        }
        if ((i10 & 2) == 0) {
            this.f116046b = null;
        } else {
            this.f116046b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f116047c = null;
        } else {
            this.f116047c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40)) {
            return false;
        }
        t40 t40Var = (t40) obj;
        return Intrinsics.areEqual(this.f116045a, t40Var.f116045a) && Intrinsics.areEqual(this.f116046b, t40Var.f116046b) && Intrinsics.areEqual(this.f116047c, t40Var.f116047c);
    }

    public final int hashCode() {
        String str = this.f116045a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f116046b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f116047c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAlert(title=" + this.f116045a + ", message=" + this.f116046b + ", type=" + this.f116047c + ")";
    }
}
