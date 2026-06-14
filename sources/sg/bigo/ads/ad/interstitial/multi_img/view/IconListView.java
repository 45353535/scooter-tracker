package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.e;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public class IconListView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f101494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a> f101495b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f101496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f101497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f101498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LinearLayout f101499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f101500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f101501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LinearLayout f101502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f101503h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f101504i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final f.a f101505j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f101506k;

        public a(Context context, f.a aVar, String str, boolean z10) {
            this.f101496a = context;
            View viewA = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
            this.f101497b = viewA;
            this.f101498c = z10;
            LinearLayout linearLayout = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_title_layout);
            this.f101499d = linearLayout;
            this.f101500e = (TextView) viewA.findViewById(R.id.bigo_ad_ic_title_txt);
            this.f101501f = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_desc_layout);
            this.f101502g = linearLayout2;
            this.f101503h = (TextView) viewA.findViewById(R.id.bigo_ad_ic_desc_txt);
            this.f101504i = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.f101505j = aVar;
            this.f101506k = str;
            a();
        }

        public void a() {
            if (this.f101505j.f101227r == 0) {
                this.f101500e.setVisibility(8);
            } else {
                this.f101500e.setVisibility(0);
                this.f101500e.setText(this.f101505j.f101227r);
                if (this.f101498c) {
                    this.f101500e.setTextColor(-1);
                }
            }
            if (this.f101505j.f101228s == 0) {
                this.f101501f.setVisibility(8);
            } else {
                this.f101501f.setVisibility(0);
                this.f101501f.setImageResource(this.f101505j.f101228s);
            }
            if (this.f101505j.f101229t == 0) {
                this.f101503h.setVisibility(8);
            } else {
                this.f101503h.setVisibility(0);
                this.f101503h.setText(this.f101505j.f101229t);
                if (this.f101498c) {
                    this.f101503h.setTextColor(q.b("#9AFFFFFF", -1));
                }
            }
            if (this.f101505j.f101230u == 0) {
                this.f101504i.setVisibility(8);
            } else {
                this.f101504i.setVisibility(0);
                this.f101504i.setImageResource(this.f101505j.f101230u);
            }
        }
    }

    public static class b extends a {
        public b(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f101500e.setVisibility(0);
            this.f101500e.setText(sg.bigo.ads.common.utils.a.a(this.f101496a, this.f101505j.f101227r, e.a(this.f101506k)));
            if (this.f101498c) {
                this.f101500e.setTextColor(-1);
            }
            this.f101501f.setVisibility(8);
            this.f101503h.setVisibility(0);
            this.f101503h.setText(this.f101505j.f101229t);
            if (this.f101498c) {
                this.f101503h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f101504i.setVisibility(8);
        }
    }

    public static class c extends a {
        public c(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f101500e.setVisibility(8);
            this.f101501f.setVisibility(0);
            this.f101501f.setImageResource(this.f101505j.f101228s);
            this.f101503h.setVisibility(0);
            this.f101503h.setText(this.f101505j.f101229t);
            if (this.f101498c) {
                this.f101503h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f101504i.setVisibility(0);
            this.f101504i.setImageResource(this.f101505j.f101230u);
        }
    }

    public static class d extends a {
        public d(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f101500e.setVisibility(0);
            this.f101500e.setText(sg.bigo.ads.common.utils.a.a(this.f101496a, this.f101505j.f101227r, e.c(this.f101506k)));
            if (this.f101498c) {
                this.f101500e.setTextColor(-1);
            }
            this.f101501f.setVisibility(0);
            this.f101501f.setImageResource(this.f101505j.f101228s);
            this.f101503h.setVisibility(0);
            this.f101503h.setText(e.b(this.f101506k) + " " + sg.bigo.ads.common.utils.a.a(this.f101496a, this.f101505j.f101229t, new Object[0]));
            if (this.f101498c) {
                this.f101503h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f101504i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    private List<a> a(Context context, int i10, String str) {
        d dVar;
        c cVar;
        ArrayList arrayList = new ArrayList();
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            List<f.a> listA = f.a.a(i10);
            Random random = new Random();
            while (!listA.isEmpty()) {
                arrayList.add(new a(context, listA.remove(random.nextInt(listA.size())), str, this.f101494a));
            }
            return arrayList;
        }
        boolean z10 = this.f101494a;
        if (z10) {
            dVar = new d(context, f.a.f101217i, str, z10);
            arrayList.add(dVar);
            arrayList.add(new b(context, f.a.f101218j, str, this.f101494a));
            cVar = new c(context, f.a.f101219k, str, this.f101494a);
        } else {
            dVar = new d(context, f.a.f101209a, str, z10);
            arrayList.add(dVar);
            arrayList.add(new b(context, f.a.f101210b, str, this.f101494a));
            cVar = new c(context, f.a.f101211c, str, this.f101494a);
        }
        arrayList.add(cVar);
        return arrayList;
    }

    public List<a> getItems() {
        return this.f101495b;
    }

    public void setThemeWhite(boolean z10) {
        this.f101494a = z10;
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(sg.bigo.ads.ad.interstitial.f r9) {
        /*
            r8 = this;
            r8.removeAllViews()
            if (r9 != 0) goto L7
            goto L9c
        L7:
            android.content.Context r0 = r8.getContext()
            int r1 = r9.f101205a
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L59
            r4 = 4
            r5 = 2
            if (r1 == r5) goto L49
            r6 = 3
            r7 = 8
            if (r1 == r6) goto L30
            if (r1 == r4) goto L1e
            goto L9c
        L1e:
            boolean r1 = r9.f101208d
            if (r1 == 0) goto L9c
            boolean r1 = r8.f101494a
            if (r1 == 0) goto L27
            r5 = r7
        L27:
            java.lang.String r9 = r9.f101207c
            java.util.List r9 = r8.a(r0, r5, r9)
        L2d:
            r8.f101495b = r9
            goto L5e
        L30:
            boolean r1 = r9.f101208d
            if (r1 == 0) goto L3c
            boolean r1 = r8.f101494a
            if (r1 == 0) goto L3a
            r4 = r7
            goto L42
        L3a:
            r4 = r5
            goto L42
        L3c:
            boolean r1 = r8.f101494a
            if (r1 == 0) goto L41
            goto L42
        L41:
            r4 = r3
        L42:
            java.lang.String r9 = r9.f101207c
            java.util.List r9 = r8.a(r0, r4, r9)
            goto L2d
        L49:
            boolean r1 = r9.f101208d
            if (r1 == 0) goto L54
        L4d:
            java.lang.String r9 = r9.f101207c
            java.util.List r9 = r8.a(r0, r2, r9)
            goto L2d
        L54:
            boolean r1 = r8.f101494a
            if (r1 == 0) goto L41
            goto L42
        L59:
            boolean r1 = r9.f101208d
            if (r1 == 0) goto L9c
            goto L4d
        L5e:
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r9 = r8.f101495b
            boolean r9 = sg.bigo.ads.common.utils.k.a(r9)
            if (r9 == 0) goto L67
            goto L9c
        L67:
            r9 = r2
        L68:
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r0 = r8.f101495b
            int r0 = r0.size()
            if (r9 >= r0) goto L9c
            if (r9 <= 0) goto L82
            android.content.Context r0 = r8.getContext()
            boolean r1 = r8.f101494a
            if (r1 == 0) goto L7d
            int r1 = sg.bigo.ads.R.layout.bigo_ad_layout_space
            goto L7f
        L7d:
            int r1 = sg.bigo.ads.R.layout.bigo_ad_layout_space_black
        L7f:
            sg.bigo.ads.common.utils.a.a(r0, r1, r8, r3)
        L82:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r2, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.weight = r1
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r1 = r8.f101495b
            java.lang.Object r1 = r1.get(r9)
            sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a r1 = (sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a) r1
            android.view.View r1 = r1.f101497b
            r8.addView(r1, r0)
            int r9 = r9 + 1
            goto L68
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a(sg.bigo.ads.ad.interstitial.f):void");
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f101494a = false;
        setOrientation(0);
        setGravity(17);
    }
}
