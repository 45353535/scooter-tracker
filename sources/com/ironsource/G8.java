package com.ironsource;

import android.view.View;
import com.ironsource.C4240b4;
import com.ironsource.C8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private C8 f40954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private View f40955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private View f40956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private View f40957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private View f40958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private View f40959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private View f40960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private View f40961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private a f40962i;

    public interface a {
        void a(@NotNull b bVar);

        void a(@NotNull gg ggVar);
    }

    public enum b {
        Title("title"),
        Advertiser(C4240b4.i.F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(C4240b4.i.J0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f40971a;

        b(String str) {
            this.f40971a = str;
        }

        @NotNull
        public final String b() {
            return this.f40971a;
        }
    }

    public static final class c implements C8.a {
        c() {
        }

        @Override // com.ironsource.C8.a
        public void a(@NotNull gg viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a aVarN = G8.this.n();
            if (aVarN != null) {
                aVarN.a(viewVisibilityParams);
            }
        }
    }

    public G8(@NotNull C8 containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.f40954a = containerView;
        this.f40955b = view;
        this.f40956c = view2;
        this.f40957d = view3;
        this.f40958e = view4;
        this.f40959f = view5;
        this.f40960g = view6;
        this.f40961h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.f40955b, b.Title);
        a(this, this.f40956c, b.Advertiser);
        a(this, this.f40958e, b.Body);
        a(this, this.f40960g, b.Cta);
        a(this, this.f40957d, b.Icon);
        a(this, this.f40954a, b.Container);
        a(this, this.f40961h, b.PrivacyIcon);
    }

    private final void s() {
        this.f40954a.setListener$mediationsdk_release(new c());
    }

    @NotNull
    public final C8 a() {
        return this.f40954a;
    }

    @Nullable
    public final View c() {
        return this.f40956c;
    }

    @Nullable
    public final View d() {
        return this.f40957d;
    }

    @Nullable
    public final View e() {
        return this.f40958e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g82 = (G8) obj;
        return Intrinsics.areEqual(this.f40954a, g82.f40954a) && Intrinsics.areEqual(this.f40955b, g82.f40955b) && Intrinsics.areEqual(this.f40956c, g82.f40956c) && Intrinsics.areEqual(this.f40957d, g82.f40957d) && Intrinsics.areEqual(this.f40958e, g82.f40958e) && Intrinsics.areEqual(this.f40959f, g82.f40959f) && Intrinsics.areEqual(this.f40960g, g82.f40960g) && Intrinsics.areEqual(this.f40961h, g82.f40961h);
    }

    @Nullable
    public final View f() {
        return this.f40959f;
    }

    @Nullable
    public final View g() {
        return this.f40960g;
    }

    @NotNull
    public final View h() {
        return this.f40961h;
    }

    public int hashCode() {
        int iHashCode = this.f40954a.hashCode() * 31;
        View view = this.f40955b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f40956c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f40957d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f40958e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f40959f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f40960g;
        return ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.f40961h.hashCode();
    }

    @Nullable
    public final View i() {
        return this.f40956c;
    }

    @Nullable
    public final View j() {
        return this.f40958e;
    }

    @NotNull
    public final C8 k() {
        return this.f40954a;
    }

    @Nullable
    public final View l() {
        return this.f40960g;
    }

    @Nullable
    public final View m() {
        return this.f40957d;
    }

    @Nullable
    public final a n() {
        return this.f40962i;
    }

    @Nullable
    public final View o() {
        return this.f40959f;
    }

    @NotNull
    public final View p() {
        return this.f40961h;
    }

    @Nullable
    public final View q() {
        return this.f40955b;
    }

    @NotNull
    public final JSONObject t() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("title", this.f40955b != null).put(C4240b4.i.F0, this.f40956c != null).put("body", this.f40958e != null).put("cta", this.f40960g != null).put("media", this.f40959f != null).put("icon", this.f40957d != null);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f40954a + ", titleView=" + this.f40955b + ", advertiserView=" + this.f40956c + ", iconView=" + this.f40957d + ", bodyView=" + this.f40958e + ", mediaView=" + this.f40959f + ", ctaView=" + this.f40960g + ", privacyIconView=" + this.f40961h + ")";
    }

    @NotNull
    public final G8 a(@NotNull C8 containerView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new G8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    @Nullable
    public final View b() {
        return this.f40955b;
    }

    public final void c(@Nullable View view) {
        this.f40960g = view;
    }

    public final void d(@Nullable View view) {
        this.f40957d = view;
    }

    public final void e(@Nullable View view) {
        this.f40959f = view;
    }

    public final void f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f40961h = view;
    }

    public final void g(@Nullable View view) {
        this.f40955b = view;
    }

    public static /* synthetic */ G8 a(G8 g82, C8 c82, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c82 = g82.f40954a;
        }
        if ((i10 & 2) != 0) {
            view = g82.f40955b;
        }
        if ((i10 & 4) != 0) {
            view2 = g82.f40956c;
        }
        if ((i10 & 8) != 0) {
            view3 = g82.f40957d;
        }
        if ((i10 & 16) != 0) {
            view4 = g82.f40958e;
        }
        if ((i10 & 32) != 0) {
            view5 = g82.f40959f;
        }
        if ((i10 & 64) != 0) {
            view6 = g82.f40960g;
        }
        if ((i10 & 128) != 0) {
            view7 = g82.f40961h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return g82.a(c82, view, view2, view3, view10, view11, view8, view9);
    }

    public final void b(@Nullable View view) {
        this.f40958e = view;
    }

    public final void a(@NotNull C8 c82) {
        Intrinsics.checkNotNullParameter(c82, "<set-?>");
        this.f40954a = c82;
    }

    public final void a(@Nullable View view) {
        this.f40956c = view;
    }

    public final void a(@Nullable a aVar) {
        this.f40962i = aVar;
    }

    private static final void a(final G8 g82, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.wh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    G8.a(this.f45801b, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(G8 this$0, b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.f40962i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ G8(C8 c82, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        View view8;
        View view9;
        view = (i10 & 2) != 0 ? null : view;
        view2 = (i10 & 4) != 0 ? null : view2;
        view3 = (i10 & 8) != 0 ? null : view3;
        view4 = (i10 & 16) != 0 ? null : view4;
        view5 = (i10 & 32) != 0 ? null : view5;
        if ((i10 & 64) != 0) {
            view8 = view7;
            view9 = null;
        } else {
            view8 = view7;
            view9 = view6;
        }
        this(c82, view, view2, view3, view4, view5, view9, view8);
    }
}
