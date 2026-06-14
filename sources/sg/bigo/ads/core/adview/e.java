package sg.bigo.ads.core.adview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile boolean f103879b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final a f103880a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final ViewGroup f103881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f103882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f103883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f103884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f103885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f103886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f103887g;

        public a(@NonNull ViewGroup viewGroup) {
            this.f103881a = viewGroup;
        }
    }

    class b extends Dialog {
        public b(Context context) {
            super(context, R.style.Dialog_FullScreen);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public final void dismiss() {
            super.dismiss();
            e.a();
        }

        @Override // android.app.Dialog
        protected final void onCreate(Bundle bundle) {
            View viewFindViewById;
            super.onCreate(bundle);
            View viewA = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_optionview_feedback, null, false);
            setContentView(viewA);
            e.a(getWindow());
            if (!TextUtils.isEmpty(e.this.f103880a.f103882b)) {
                View viewFindViewById2 = findViewById(R.id.bigo_ad_btn_why_this_ad);
                viewFindViewById2.setVisibility(0);
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f103880a.f103882b);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f103880a.f103883c)) {
                final View viewFindViewById3 = findViewById(R.id.inter_option_btn_copy_ru_ad_marker);
                if (viewFindViewById3 != null) {
                    TextView textView = (TextView) viewFindViewById3.findViewById(R.id.inter_option_text_copy_ru_ad_marker);
                    if (textView != null) {
                        textView.setText(sg.bigo.ads.common.utils.a.a(getContext(), R.string.bigo_ad_feedback_copy_ad_id, e.this.f103880a.f103883c));
                    }
                    viewFindViewById3.setVisibility(0);
                    viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (sg.bigo.ads.common.utils.c.g(viewFindViewById3.getContext(), e.this.f103880a.f103883c)) {
                                Toast.makeText(viewFindViewById3.getContext(), sg.bigo.ads.common.utils.a.a(viewFindViewById3.getContext(), R.string.bigo_ad_feedback_copied, new Object[0]), 0).show();
                            }
                            b.this.dismiss();
                        }
                    });
                }
                if (viewFindViewById3 != null && (viewFindViewById = viewFindViewById3.findViewById(R.id.inter_option_line)) != null) {
                    viewFindViewById.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(e.this.f103880a.f103884d)) {
                findViewById(R.id.inter_option_ll_ad_info).setVisibility(0);
                ((TextView) findViewById(R.id.inter_option_tv_ad_info)).setText(e.this.f103880a.f103884d);
            }
            if (!TextUtils.isEmpty(e.this.f103880a.f103885e)) {
                View viewFindViewById4 = findViewById(R.id.bigo_ad_btn_ad_copy_link);
                viewFindViewById4.setVisibility(0);
                final Context context = viewFindViewById4.getContext();
                viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (sg.bigo.ads.common.utils.c.g(context, e.this.f103880a.f103885e)) {
                            Context context2 = context;
                            Toast.makeText(context2, sg.bigo.ads.common.utils.a.a(context2, R.string.bigo_ad_feedback_link_copied, new Object[0]), 0).show();
                        }
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f103880a.f103886f)) {
                View viewFindViewById5 = findViewById(R.id.bigo_ad_btn_rec_rule);
                viewFindViewById5.setVisibility(0);
                viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f103880a.f103886f);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f103880a.f103887g)) {
                View viewFindViewById6 = findViewById(R.id.bigo_ad_btn_user_privacy);
                viewFindViewById6.setVisibility(0);
                viewFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f103880a.f103887g);
                        b.this.dismiss();
                    }
                });
            }
            viewA.findViewById(R.id.bigo_ad_feedback_background).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.dismiss();
                }
            });
        }
    }

    private e(@NonNull a aVar) {
        this.f103880a = aVar;
    }

    /* synthetic */ e(a aVar, byte b10) {
        this(aVar);
    }

    static /* synthetic */ void a(Window window) {
        if (window != null) {
            s.a(window);
        }
    }

    static /* synthetic */ boolean a() {
        f103879b = false;
        return false;
    }
}
