package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class w70 {

    @NotNull
    public static final v70 Companion = new v70();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f117328h = {null, null, null, null, new yg.f(r40.f115293a), new yg.f(p30.f114542a), new yg.f(r70.f115355a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f117332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f117333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f117334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f117335g;

    public /* synthetic */ w70(int i10, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i10 & 64)) {
            yg.e2.a(i10, 64, u70.f116556a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f117329a = null;
        } else {
            this.f117329a = str;
        }
        if ((i10 & 2) == 0) {
            this.f117330b = null;
        } else {
            this.f117330b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f117331c = null;
        } else {
            this.f117331c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f117332d = null;
        } else {
            this.f117332d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f117333e = null;
        } else {
            this.f117333e = list;
        }
        if ((i10 & 32) == 0) {
            this.f117334f = null;
        } else {
            this.f117334f = list2;
        }
        this.f117335g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w70)) {
            return false;
        }
        w70 w70Var = (w70) obj;
        return Intrinsics.areEqual(this.f117329a, w70Var.f117329a) && Intrinsics.areEqual(this.f117330b, w70Var.f117330b) && Intrinsics.areEqual(this.f117331c, w70Var.f117331c) && Intrinsics.areEqual(this.f117332d, w70Var.f117332d) && Intrinsics.areEqual(this.f117333e, w70Var.f117333e) && Intrinsics.areEqual(this.f117334f, w70Var.f117334f) && Intrinsics.areEqual(this.f117335g, w70Var.f117335g);
    }

    public final int hashCode() {
        String str = this.f117329a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117330b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117331c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f117332d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f117333e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f117334f;
        return this.f117335g.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelRemoteData(pageId=" + this.f117329a + ", latestSdkVersion=" + this.f117330b + ", appAdsTxtUrl=" + this.f117331c + ", appStatus=" + this.f117332d + ", alerts=" + this.f117333e + ", adUnits=" + this.f117334f + ", mediationNetworks=" + this.f117335g + ")";
    }
}
