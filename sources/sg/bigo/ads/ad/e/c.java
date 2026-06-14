package sg.bigo.ads.ad.e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f100496a;

    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public c(@NonNull Context context) {
        super(context, R.style.BigoAd_Dialog_Fullscreen);
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewA = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_dialog_reward_retain, null, false);
        setContentView(viewA);
        viewA.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.dismiss();
            }
        });
        viewA.findViewById(R.id.bigo_ad_btn_resume).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c.this.f100496a != null) {
                    c.this.f100496a.d();
                }
                c.this.dismiss();
            }
        });
        viewA.findViewById(R.id.bigo_ad_btn_skip).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c.this.f100496a != null) {
                    c.this.f100496a.c();
                }
                c.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        a aVar = this.f100496a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        super.onStop();
        a aVar = this.f100496a;
        if (aVar != null) {
            aVar.b();
            this.f100496a = null;
        }
    }

    public final void a(a aVar) {
        this.f100496a = aVar;
        getWindow().setFlags(8, 8);
        super.show();
        getWindow().getDecorView().setSystemUiVisibility(5894);
        getWindow().clearFlags(8);
    }
}
