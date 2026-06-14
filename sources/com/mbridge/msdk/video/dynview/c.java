package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f52271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f52274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f52275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f52278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f52279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f52281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f52282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f52283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f52284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f52285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f52286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f52287q;

    public static class b implements InterfaceC0584c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f52288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f52289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f52291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f52292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f52294g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f52295h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f52296i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f52297j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f52298k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f52299l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f52300m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f52301n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f52302o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f52303p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f52304q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c fileDirs(List<String> list) {
            this.f52299l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c orientation(int i10) {
            this.f52293f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c a(Context context) {
            this.f52288a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c b(int i10) {
            this.f52290c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c c(String str) {
            this.f52289b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c d(int i10) {
            this.f52300m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c e(int i10) {
            this.f52303p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c f(int i10) {
            this.f52302o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c a(float f10) {
            this.f52292e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c b(float f10) {
            this.f52291d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c c(int i10) {
            this.f52294g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c a(View view) {
            this.f52295h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c b(String str) {
            this.f52304q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c a(List<CampaignEx> list) {
            this.f52296i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c a(int i10) {
            this.f52297j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c a(boolean z10) {
            this.f52298k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0584c
        public InterfaceC0584c a(String str) {
            this.f52301n = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    public interface InterfaceC0584c {
        InterfaceC0584c a(float f10);

        InterfaceC0584c a(int i10);

        InterfaceC0584c a(Context context);

        InterfaceC0584c a(View view);

        InterfaceC0584c a(String str);

        InterfaceC0584c a(List<CampaignEx> list);

        InterfaceC0584c a(boolean z10);

        InterfaceC0584c b(float f10);

        InterfaceC0584c b(int i10);

        InterfaceC0584c b(String str);

        c build();

        InterfaceC0584c c(int i10);

        InterfaceC0584c c(String str);

        InterfaceC0584c d(int i10);

        InterfaceC0584c e(int i10);

        InterfaceC0584c f(int i10);

        InterfaceC0584c fileDirs(List<String> list);

        InterfaceC0584c orientation(int i10);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f52279i;
    }

    public Context c() {
        return this.f52271a;
    }

    public List<String> d() {
        return this.f52282l;
    }

    public int e() {
        return this.f52285o;
    }

    public String f() {
        return this.f52272b;
    }

    public int g() {
        return this.f52273c;
    }

    public int h() {
        return this.f52276f;
    }

    public View i() {
        return this.f52278h;
    }

    public int j() {
        return this.f52277g;
    }

    public float k() {
        return this.f52274d;
    }

    public int l() {
        return this.f52280j;
    }

    public float m() {
        return this.f52275e;
    }

    public String n() {
        return this.f52287q;
    }

    public int o() {
        return this.f52286p;
    }

    public boolean p() {
        return this.f52281k;
    }

    private c(b bVar) {
        this.f52275e = bVar.f52292e;
        this.f52274d = bVar.f52291d;
        this.f52276f = bVar.f52293f;
        this.f52277g = bVar.f52294g;
        this.f52271a = bVar.f52288a;
        this.f52272b = bVar.f52289b;
        this.f52273c = bVar.f52290c;
        this.f52278h = bVar.f52295h;
        this.f52279i = bVar.f52296i;
        this.f52280j = bVar.f52297j;
        this.f52281k = bVar.f52298k;
        this.f52282l = bVar.f52299l;
        this.f52283m = bVar.f52300m;
        this.f52284n = bVar.f52301n;
        this.f52285o = bVar.f52302o;
        this.f52286p = bVar.f52303p;
        this.f52287q = bVar.f52304q;
    }
}
