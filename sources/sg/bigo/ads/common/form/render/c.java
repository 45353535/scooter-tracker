package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.api.a.f;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.MixtureTextView;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    public interface a {
        void a();

        void a(String str);

        void b();

        void b(int i10);

        void b(String str);

        void c();

        void c(String str);
    }

    private static double a(int i10, int i11) {
        if (i11 == 0) {
            return 1.0d;
        }
        double d10 = ((double) i10) / ((double) i11);
        return (d10 < 0.25d || d10 > 1.0d) ? d10 < 0.25d ? 0.25d : 1.0d : d10;
    }

    public static int a(@NonNull Context context, @NonNull e eVar) {
        f fVarJ = eVar.j();
        if (fVarJ == null) {
            return 0;
        }
        return (int) (((double) context.getResources().getDisplayMetrics().widthPixels) * a(fVarJ.b(), fVarJ.a()));
    }

    public static PrivacyCheckBox a(@NonNull View view, @NonNull e eVar, @Nullable Map<String, Object> map, final a aVar) {
        MixtureTextView mixtureTextView = (MixtureTextView) view.findViewById(R.id.inter_form_privacy_desc);
        final PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) view.findViewById(R.id.inter_form_check_box);
        TextView textView = (TextView) view.findViewById(R.id.inter_form_privacy_notice);
        if (mixtureTextView == null || privacyCheckBox == null || textView == null) {
            return null;
        }
        textView.setText(sg.bigo.ads.common.form.a.a(textView.getContext(), R.string.bigo_ad_form_privacy_notice));
        privacyCheckBox.a(sg.bigo.ads.common.form.a.a(map));
        View viewFindViewById = view.findViewById(R.id.bigo_ad_check_box_expand);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    privacyCheckBox.a(!r2.f102910a);
                }
            });
        }
        e.b bVarL = eVar.l();
        String str = bVarL != null ? bVarL.f102110a : "";
        final String str2 = bVarL != null ? bVarL.f102111b : "";
        String strReplace = "  ".concat(String.valueOf(sg.bigo.ads.common.utils.a.b(mixtureTextView.getContext(), R.string.bigo_ad_form_privacy_content, sg.bigo.ads.common.form.a.f102345b))).replace("{company_name}", str);
        final SpannableString spannableString = new SpannableString(strReplace);
        String[] strArr = {str, "BIGO"};
        for (int i10 = 0; i10 < 2; i10++) {
            String str3 = strArr[i10];
            spannableString.setSpan(new UnderlineSpan() { // from class: sg.bigo.ads.common.form.render.FormViewHelper$5
                @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                }
            }, strReplace.lastIndexOf(str3), strReplace.lastIndexOf(str3) + str3.length(), 33);
        }
        mixtureTextView.setText(spannableString);
        mixtureTextView.setClickListener(new MixtureTextView.a() { // from class: sg.bigo.ads.common.form.render.c.5
            @Override // sg.bigo.ads.common.view.MixtureTextView.a
            public final void a(UnderlineSpan underlineSpan) {
                if (aVar == null || underlineSpan == null) {
                    return;
                }
                if ("BIGO".equals(spannableString.subSequence(spannableString.getSpanStart(underlineSpan), spannableString.getSpanEnd(underlineSpan)).toString())) {
                    aVar.b("https://www.adsbigo.com/privacy.html");
                } else {
                    aVar.a(str2);
                }
            }
        });
        return privacyCheckBox;
    }

    private static void a(@NonNull View view, @NonNull e eVar, final a aVar) {
        final e.a aVarN = eVar.n();
        TextView textView = (TextView) view.findViewById(R.id.inter_feedback_title);
        if (textView != null) {
            textView.setText(aVarN.f102106a);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_feedback_dec);
        if (textView2 != null) {
            textView2.setText(aVarN.f102107b);
        }
        Button button = (Button) view.findViewById(R.id.inter_feedback_cta);
        if (button != null) {
            button.setText(aVarN.f102108c);
            button.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.c(aVarN.f102109d);
                    }
                }
            });
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, Context context, @NonNull e eVar, a aVar, int i10) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_submit_success_container);
        View viewA = sg.bigo.ads.common.utils.a.a(context, sg.bigo.ads.common.form.render.a.a(7), null, false);
        if (viewGroup2 == null || viewA == null) {
            return;
        }
        u.a(viewA, viewGroup2, null, -1);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.inter_form_icon_layout);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(4);
        }
        HeightScrollView heightScrollView = (HeightScrollView) viewGroup.findViewById(R.id.inter_form_scroll);
        if (heightScrollView != null) {
            heightScrollView.setVisibility(4);
        }
        a(viewA, eVar, aVar);
        if (aVar == null || i10 == 5) {
            return;
        }
        aVar.b(i10);
    }
}
