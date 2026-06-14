package sg.bigo.ads.ad.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.d.f;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f100458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f100459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f100460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.a f100461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f100462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f100463f;

    public final void a() {
        n nVar = this.f100462e;
        if (nVar != null) {
            nVar.b();
            this.f100463f = false;
        }
    }

    public final void a(ViewGroup viewGroup, int i10, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        this.f100463f = false;
        this.f100461d = aVar;
        this.f100460c = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_close_btn);
        this.f100458a = (TextView) viewGroup.findViewById(R.id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.second_text);
        this.f100459b = textView;
        ViewGroup viewGroup2 = this.f100460c;
        if (viewGroup2 == null || this.f100458a == null || textView == null) {
            f.a aVar2 = this.f100461d;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.d.d.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.a aVar3 = d.this.f100461d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        });
        this.f100460c.setClickable(false);
        this.f100458a.setTextColor(1728053247);
        this.f100459b.setVisibility(0);
        n nVar = new n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.d.d.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                d dVar = d.this;
                dVar.f100463f = true;
                dVar.f100460c.setAlpha(1.0f);
                d.this.f100460c.setClickable(true);
                d.this.f100459b.setVisibility(8);
                d.this.f100458a.setTextColor(-1);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                d.this.f100459b.setText(q.a("%ds", Integer.valueOf(Math.round(j10 / 1000.0f))));
            }
        };
        this.f100462e = nVar;
        nVar.c();
    }
}
