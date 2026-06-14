package yads;

import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f112639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112640d;

    public k80(String str, int i10, Integer num, int i11) {
        this.f112637a = str;
        this.f112638b = i10;
        this.f112639c = num;
        this.f112640d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return Intrinsics.areEqual(this.f112637a, k80Var.f112637a) && this.f112638b == k80Var.f112638b && Intrinsics.areEqual(this.f112639c, k80Var.f112639c) && this.f112640d == k80Var.f112640d;
    }

    public final int hashCode() {
        int iA = bb3.a(this.f112638b, this.f112637a.hashCode() * 31, 31);
        Integer num = this.f112639c;
        return this.f112640d + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f112637a + ", color=" + this.f112638b + ", icon=" + this.f112639c + ", style=" + this.f112640d + ")";
    }

    public /* synthetic */ k80(String str, int i10, Integer num, int i11, int i12) {
        this(str, (i12 & 2) != 0 ? R$attr.debug_panel_label_primary : i10, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? R$style.DebugPanelText_Body1 : i11);
    }
}
