package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f10274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f10275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SpannedString f10276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SpannedString f10277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f10278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f10279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f10280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f10281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f10282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f10283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f10284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f10285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f10286m;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f10287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f10288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SpannedString f10289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        SpannedString f10290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f10291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f10292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10293g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f10294h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f10295i = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f10296j = ViewCompat.MEASURED_STATE_MASK;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f10297k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f10298l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f10299m;

        public b(c cVar) {
            this.f10287a = cVar;
        }

        public b a(boolean z10) {
            this.f10288b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f10289c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f10290d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f10291e = str;
            return this;
        }

        public b a(String str) {
            this.f10292f = str;
            return this;
        }

        public b b(int i10) {
            this.f10298l = i10;
            return this;
        }

        public b c(int i10) {
            this.f10296j = i10;
            return this;
        }

        public b d(int i10) {
            this.f10295i = i10;
            return this;
        }

        public b a(int i10) {
            this.f10294h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f10299m = z10;
            return this;
        }

        public b a(Context context) {
            this.f10294h = R.drawable.applovin_ic_disclosure_arrow;
            this.f10298l = m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public r2 a() {
            return new r2(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10307a;

        c(int i10) {
            this.f10307a = i10;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f10307a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f10279f;
    }

    public String c() {
        return this.f10278e;
    }

    public int d() {
        return this.f10281h;
    }

    public int e() {
        return this.f10285l;
    }

    public SpannedString f() {
        return this.f10277d;
    }

    public int g() {
        return this.f10283j;
    }

    public int h() {
        return this.f10280g;
    }

    public int i() {
        return this.f10284k;
    }

    public int j() {
        return this.f10274a.b();
    }

    public SpannedString k() {
        return this.f10276c;
    }

    public int l() {
        return this.f10282i;
    }

    public int m() {
        return this.f10274a.c();
    }

    public boolean o() {
        return this.f10275b;
    }

    public boolean p() {
        return this.f10286m;
    }

    protected r2(c cVar) {
        this.f10280g = 0;
        this.f10281h = 0;
        this.f10282i = ViewCompat.MEASURED_STATE_MASK;
        this.f10283j = ViewCompat.MEASURED_STATE_MASK;
        this.f10284k = 0;
        this.f10285l = 0;
        this.f10274a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private r2(b bVar) {
        this.f10280g = 0;
        this.f10281h = 0;
        this.f10282i = ViewCompat.MEASURED_STATE_MASK;
        this.f10283j = ViewCompat.MEASURED_STATE_MASK;
        this.f10284k = 0;
        this.f10285l = 0;
        this.f10274a = bVar.f10287a;
        this.f10275b = bVar.f10288b;
        this.f10276c = bVar.f10289c;
        this.f10277d = bVar.f10290d;
        this.f10278e = bVar.f10291e;
        this.f10279f = bVar.f10292f;
        this.f10280g = bVar.f10293g;
        this.f10281h = bVar.f10294h;
        this.f10282i = bVar.f10295i;
        this.f10283j = bVar.f10296j;
        this.f10284k = bVar.f10297k;
        this.f10285l = bVar.f10298l;
        this.f10286m = bVar.f10299m;
    }
}
