package com.fyber.inneractive.sdk.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.r;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IFyberAdIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClickListener f23815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f23821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f23824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Corner f23825k = Corner.BOTTOM_LEFT;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.a f23826l;

    public interface ClickListener {
        void a();
    }

    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public IFyberAdIdentifier(r rVar) {
        this.f23816b = 0;
        this.f23817c = 0;
        this.f23818d = 0;
        this.f23819e = 0;
        this.f23820f = 0;
        this.f23821g = null;
        this.f23822h = "";
        this.f23823i = "";
        this.f23824j = false;
        this.f23826l = com.fyber.inneractive.sdk.config.global.features.b.f20377e;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.b bVar = (com.fyber.inneractive.sdk.config.global.features.b) rVar.a(com.fyber.inneractive.sdk.config.global.features.b.class);
            Integer numA = bVar.a("ad_identifier_text_size_w");
            this.f23816b = numA != null ? numA.intValue() : 110;
            Integer numA2 = bVar.a("ad_identifier_text_size_h");
            this.f23817c = numA2 != null ? numA2.intValue() : 18;
            Integer numA3 = bVar.a("ad_identifier_image_size_w");
            this.f23818d = numA3 != null ? numA3.intValue() : 18;
            Integer numA4 = bVar.a("ad_identifier_image_size_h");
            this.f23819e = numA4 != null ? numA4.intValue() : 18;
            Integer numA5 = bVar.a("ad_identifier_text_size");
            this.f23820f = numA5 != null ? numA5.intValue() : 8;
            this.f23821g = bVar.a("ad_identifier_tint_color", "#75DCDCDC");
            this.f23826l = bVar.c();
            this.f23822h = bVar.a("ad_identifier_text", "Tap for more information");
            this.f23823i = bVar.a("ad_identifier_icon_url", null);
            this.f23824j = true;
        }
    }

    public abstract void a(ViewGroup viewGroup);
}
