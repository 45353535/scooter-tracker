package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.render.a.a;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {
    public b(@NonNull e.c cVar, @Nullable Map<String, Object> map, Context context, a.InterfaceC1260a interfaceC1260a) {
        super(cVar, map, context, interfaceC1260a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        View viewA = sg.bigo.ads.common.utils.a.a(this.f102369h, sg.bigo.ads.common.form.render.a.a(2), null, false);
        this.f102370i = viewA;
        if (viewA == null) {
            return null;
        }
        a.a((TextView) viewA.findViewById(R.id.inter_form_edit_title), this.f102365d);
        a(1);
        final EditText editText = (EditText) this.f102370i.findViewById(R.id.inter_form_edit_content);
        String strA = sg.bigo.ads.common.form.a.a(this.f102366e, this.f102363b);
        if (editText != null) {
            editText.setTextColor(sg.bigo.ads.common.form.render.a.b());
            editText.setHint(sg.bigo.ads.common.form.a.a(this.f102369h, R.string.bigo_ad_form_question_hint));
            if (!q.a((CharSequence) strA)) {
                a.InterfaceC1260a interfaceC1260a = this.f102371j;
                if (interfaceC1260a != null) {
                    interfaceC1260a.a(this.f102362a.f102115d, strA);
                }
                this.f102364c = strA;
                editText.setText(strA);
            }
            editText.addTextChangedListener(new TextWatcher() { // from class: sg.bigo.ads.common.form.render.a.b.1
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    b.this.f102364c = editText.getText().toString();
                    b bVar = b.this;
                    a.InterfaceC1260a interfaceC1260a2 = bVar.f102371j;
                    if (interfaceC1260a2 != null) {
                        interfaceC1260a2.a(bVar.f102362a.f102115d, bVar.f102364c);
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sg.bigo.ads.common.form.render.a.b.2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    b bVar = b.this;
                    if (z10) {
                        bVar.a(2);
                    } else {
                        bVar.a();
                    }
                }
            });
        }
        return this.f102370i;
    }
}
