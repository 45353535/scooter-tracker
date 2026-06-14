package com.my.target.nativeads.banners;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.s7;

/* JADX INFO: loaded from: classes11.dex */
public class NativeAppwallBanner {
    public final ImageData A;
    public final ImageData B;
    public final ImageData C;
    public boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f60237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f60238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f60239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f60240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f60242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f60243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f60244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f60245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f60246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f60247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f60248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f60249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f60250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f60251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f60252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f60253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f60254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageData f60255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageData f60256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageData f60257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageData f60258y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageData f60259z;

    public NativeAppwallBanner(s7 s7Var) {
        this.f60234a = s7Var.r();
        this.f60235b = s7Var.k();
        this.f60236c = s7Var.A();
        this.f60237d = s7Var.M();
        this.f60238e = s7Var.V();
        this.f60239f = s7Var.X();
        this.f60240g = s7Var.v();
        this.f60242i = s7Var.W();
        this.f60243j = s7Var.N();
        this.f60244k = s7Var.P();
        this.f60245l = s7Var.Q();
        this.f60246m = s7Var.F();
        this.f60247n = s7Var.w();
        this.D = s7Var.b0();
        this.f60248o = s7Var.d0();
        this.f60249p = s7Var.e0();
        this.f60250q = s7Var.c0();
        this.f60251r = s7Var.a0();
        this.f60252s = s7Var.f0();
        this.f60253t = s7Var.g0();
        this.f60254u = s7Var.Z();
        this.f60255v = s7Var.q();
        this.f60256w = s7Var.O();
        this.f60257x = s7Var.U();
        this.f60258y = s7Var.S();
        this.f60259z = s7Var.Y();
        this.A = s7Var.L();
        this.B = s7Var.T();
        this.C = s7Var.R();
        this.f60241h = s7Var.e();
    }

    public static NativeAppwallBanner a(s7 s7Var) {
        return new NativeAppwallBanner(s7Var);
    }

    @Nullable
    public ImageData getBubbleIcon() {
        return this.A;
    }

    @Nullable
    public String getBubbleId() {
        return this.f60237d;
    }

    @Nullable
    public String getBundleId() {
        return this.f60241h;
    }

    public int getCoins() {
        return this.f60243j;
    }

    @Nullable
    public ImageData getCoinsIcon() {
        return this.f60256w;
    }

    public int getCoinsIconBgColor() {
        return this.f60244k;
    }

    public int getCoinsIconTextColor() {
        return this.f60245l;
    }

    @Nullable
    public ImageData getCrossNotifIcon() {
        return this.C;
    }

    @NonNull
    public String getDescription() {
        return this.f60235b;
    }

    @Nullable
    public ImageData getGotoAppIcon() {
        return this.f60258y;
    }

    @Nullable
    public ImageData getIcon() {
        return this.f60255v;
    }

    @NonNull
    public String getId() {
        return this.f60234a;
    }

    @Nullable
    public ImageData getItemHighlightIcon() {
        return this.B;
    }

    @Nullable
    public ImageData getLabelIcon() {
        return this.f60257x;
    }

    @Nullable
    public String getLabelType() {
        return this.f60238e;
    }

    public int getMrgsId() {
        return this.f60242i;
    }

    @Nullable
    public String getPaidType() {
        return this.f60240g;
    }

    public float getRating() {
        return this.f60247n;
    }

    @Nullable
    public String getStatus() {
        return this.f60239f;
    }

    @Nullable
    public ImageData getStatusIcon() {
        return this.f60259z;
    }

    @NonNull
    public String getTitle() {
        return this.f60236c;
    }

    public int getVotes() {
        return this.f60246m;
    }

    public boolean isAppInstalled() {
        return this.f60254u;
    }

    public boolean isBanner() {
        return this.f60251r;
    }

    public boolean isHasNotification() {
        return this.D;
    }

    public boolean isItemHighlight() {
        return this.f60250q;
    }

    public boolean isMain() {
        return this.f60248o;
    }

    public boolean isRequireCategoryHighlight() {
        return this.f60249p;
    }

    public boolean isRequireWifi() {
        return this.f60252s;
    }

    public boolean isSubItem() {
        return this.f60253t;
    }

    public void setHasNotification(boolean z10) {
        this.D = z10;
    }

    @NonNull
    public String toString() {
        return "NativeAppwallBanner{id='" + this.f60234a + "', description='" + this.f60235b + "', title='" + this.f60236c + "', bubbleId='" + this.f60237d + "', labelType='" + this.f60238e + "', status='" + this.f60239f + "', paidType='" + this.f60240g + "', bundleId='" + this.f60241h + "', mrgsId=" + this.f60242i + ", coins=" + this.f60243j + ", coinsIconBgColor=" + this.f60244k + ", coinsIconTextColor=" + this.f60245l + ", votes=" + this.f60246m + ", rating=" + this.f60247n + ", isMain=" + this.f60248o + ", isRequireCategoryHighlight=" + this.f60249p + ", isItemHighlight=" + this.f60250q + ", isBanner=" + this.f60251r + ", isRequireWifi=" + this.f60252s + ", isSubItem=" + this.f60253t + ", appInstalled=" + this.f60254u + ", icon=" + this.f60255v + ", coinsIcon=" + this.f60256w + ", labelIcon=" + this.f60257x + ", gotoAppIcon=" + this.f60258y + ", statusIcon=" + this.f60259z + ", bubbleIcon=" + this.A + ", itemHighlightIcon=" + this.B + ", crossNotifIcon=" + this.C + ", hasNotification=" + this.D + '}';
    }
}
