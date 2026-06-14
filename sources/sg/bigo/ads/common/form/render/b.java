package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.b;
import sg.bigo.ads.common.form.render.c;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements b.a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f102387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final e f102388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.common.form.render.a.c f102389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f102390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f102391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f102392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f102393g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference<a> f102396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f102397k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f102395i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean[] f102398l = new boolean[13];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Runnable f102394h = new Runnable() { // from class: sg.bigo.ads.common.form.render.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            RelativeLayout relativeLayout = bVar.f102391e;
            if (relativeLayout == null || bVar.f102392f > 0) {
                d.a(bVar.f102394h);
                return;
            }
            if (!sg.bigo.ads.common.ab.a.a(relativeLayout, new Rect())) {
                d.a(2, b.this.f102394h, 500L);
                return;
            }
            d.a(b.this.f102394h);
            b.this.f102392f = System.currentTimeMillis();
            b bVar2 = b.this;
            bVar2.a(1, bVar2.f102393g, 0L);
        }
    };

    public interface a {
        void a();

        void a(String str);
    }

    public b(@NonNull Context context, @NonNull e eVar, @Nullable Map<String, Object> map, int i10, int i11, a aVar) {
        this.f102387a = context;
        this.f102388b = eVar;
        sg.bigo.ads.common.form.render.a.f102361a = eVar.d() == 1;
        this.f102389c = new sg.bigo.ads.common.form.render.a.c(eVar, map, context, this);
        this.f102396j = new WeakReference<>(aVar);
        this.f102393g = i10;
        this.f102397k = i11;
    }

    private void d(String str) {
        if (this.f102396j.get() != null) {
            this.f102396j.get().a(str);
        }
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a() {
        Button button = this.f102390d;
        if (button == null || this.f102395i) {
            return;
        }
        button.setEnabled(true);
        this.f102390d.setBackgroundResource(R.drawable.bigo_ad_btn_background);
        this.f102390d.setTextColor(-1);
        this.f102395i = true;
        a(2, this.f102393g, System.currentTimeMillis() - this.f102392f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b() {
        a(5, this.f102393g, System.currentTimeMillis() - this.f102392f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c() {
        a(6, this.f102393g, System.currentTimeMillis() - this.f102392f);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(int i10) {
        int i11;
        long jCurrentTimeMillis;
        int i12;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = this.f102393g;
                jCurrentTimeMillis = System.currentTimeMillis() - this.f102392f;
                i12 = 8;
            }
            sg.bigo.ads.common.form.a.b(this.f102397k);
        }
        i11 = this.f102393g;
        jCurrentTimeMillis = System.currentTimeMillis() - this.f102392f;
        i12 = 7;
        a(i12, i11, jCurrentTimeMillis);
        sg.bigo.ads.common.form.a.b(this.f102397k);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(int i10) {
        if (this.f102396j.get() != null) {
            this.f102396j.get().a();
        }
        sg.bigo.ads.common.form.b.a().a(sg.bigo.ads.common.form.a.a(this.f102388b, this.f102389c.b(), this.f102389c.a()), this, i10);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c(String str) {
        a(9, this.f102393g, System.currentTimeMillis() - this.f102392f);
        d(str);
    }

    final void a(int i10, int i11, long j10) {
        boolean[] zArr = this.f102398l;
        if (i10 >= zArr.length || zArr[i10]) {
            return;
        }
        sg.bigo.ads.core.d.b.a(i10, i11, j10);
        this.f102398l[i10] = true;
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(String str) {
        a(10, this.f102393g, System.currentTimeMillis() - this.f102392f);
        d(str);
    }

    public static void a(TextView textView, @Nullable String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a(String str) {
        a(11, this.f102393g, System.currentTimeMillis() - this.f102392f);
        d(str);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(Map<String, Object> map) {
        sg.bigo.ads.common.form.a.a(this.f102397k, map);
    }
}
