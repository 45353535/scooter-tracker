package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class np1 {

    @NotNull
    public static final jp1 Companion = new jp1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KSerializer[] f113993e = {null, null, null, new yg.f(kp1.f112800a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f113997d;

    public /* synthetic */ np1(int i10, String str, String str2, String str3, List list) {
        if (15 != (i10 & 15)) {
            yg.e2.a(i10, 15, ip1.f112075a.getDescriptor());
        }
        this.f113994a = str;
        this.f113995b = str2;
        this.f113996c = str3;
        this.f113997d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np1)) {
            return false;
        }
        np1 np1Var = (np1) obj;
        return Intrinsics.areEqual(this.f113994a, np1Var.f113994a) && Intrinsics.areEqual(this.f113995b, np1Var.f113995b) && Intrinsics.areEqual(this.f113996c, np1Var.f113996c) && Intrinsics.areEqual(this.f113997d, np1Var.f113997d);
    }

    public final int hashCode() {
        int iA = j4.a(this.f113995b, this.f113994a.hashCode() * 31, 31);
        String str = this.f113996c;
        return this.f113997d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationNetworkData(name=" + this.f113994a + ", id=" + this.f113995b + ", version=" + this.f113996c + ", adapters=" + this.f113997d + ")";
    }

    public np1(String str, String str2, String str3, ArrayList arrayList) {
        this.f113994a = str;
        this.f113995b = str2;
        this.f113996c = str3;
        this.f113997d = arrayList;
    }
}
