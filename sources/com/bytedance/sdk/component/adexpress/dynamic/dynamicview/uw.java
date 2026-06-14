package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class uw extends mo {
    public uw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.jpc += 6;
        if (this.fs.gy()) {
            com.bytedance.sdk.component.adexpress.mo.qdl qdlVar = new com.bytedance.sdk.component.adexpress.mo.qdl(context, this.fs.wd(), this.fs.mzz(), 1, this.fs.jpc());
            this.bjy = qdlVar;
            qdlVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.bjy = textView;
            textView.setIncludeFontPadding(false);
        }
        this.bjy.setTag(Integer.valueOf(getClickArea()));
        addView(this.bjy, getWidgetLayoutParams());
    }

    private boolean qdl() {
        DynamicRootView dynamicRootView = this.rdp;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.rdp.getRenderRequest().to() == 4) ? false : true;
    }

    private void rq() {
        if (this.bjy instanceof com.bytedance.sdk.component.adexpress.mo.qdl) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.optString(i10));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setTextColor(this.fs.wd());
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setTextSize(this.fs.mzz());
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setAnimationType(this.fs.ag());
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setAnimationDuration(this.fs.ax() * 1000);
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).qdl();
        }
    }

    private void to() {
        int iQdl;
        if (TextUtils.equals(this.exu.to().ud(), "source") || TextUtils.equals(this.exu.to().ud(), "title") || TextUtils.equals(this.exu.to().ud(), "text_star")) {
            int[] iArrUd = com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud(this.fs.mo(), this.fs.mzz(), true);
            int iQdl2 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.ud());
            int iQdl3 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.lnr());
            int iQdl4 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.mml());
            int iQdl5 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.qdl());
            int iMin = Math.min(iQdl2, iQdl5);
            if (TextUtils.equals(this.exu.to().ud(), "source") && (iQdl = ((this.jpc - ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.mzz()))) - iQdl2) - iQdl5) > 1 && iQdl <= iMin * 2) {
                int i10 = iQdl / 2;
                this.bjy.setPadding(iQdl3, iQdl2 - i10, iQdl4, iQdl5 - (iQdl - i10));
                return;
            }
            int i11 = (((iArrUd[1] + iQdl2) + iQdl5) - this.jpc) - 2;
            if (i11 <= 1) {
                return;
            }
            if (i11 <= iMin * 2) {
                int i12 = i11 / 2;
                this.bjy.setPadding(iQdl3, iQdl2 - i12, iQdl4, iQdl5 - (i11 - i12));
            } else if (i11 > iQdl2 + iQdl5) {
                final int i13 = (i11 - iQdl2) - iQdl5;
                this.bjy.setPadding(iQdl3, 0, iQdl4, 0);
                if (i13 <= ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 1.0f)) + 1) {
                    ((TextView) this.bjy).setTextSize(this.fs.mzz() - 1.0f);
                } else if (i13 <= (((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.bjy).setTextSize(this.fs.mzz() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uw.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = uw.this.bjy.getLayoutParams();
                                uw uwVar = uw.this;
                                layoutParams.height = uwVar.jpc + i13;
                                uwVar.bjy.setLayoutParams(layoutParams);
                                uw.this.bjy.setTranslationY(-i13);
                                ((ViewGroup) uw.this.bjy.getParent()).setClipChildren(false);
                                ((ViewGroup) uw.this.bjy.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iQdl2 > iQdl5) {
                this.bjy.setPadding(iQdl3, iQdl2 - (i11 - iMin), iQdl4, iQdl5 - iMin);
            } else {
                this.bjy.setPadding(iQdl3, iQdl2 - iMin, iQdl4, iQdl5 - (i11 - iMin));
            }
        }
        if (TextUtils.equals(this.exu.to().ud(), "fillButton")) {
            this.bjy.setTextAlignment(2);
            ((TextView) this.bjy).setGravity(17);
        }
    }

    public String getText() {
        String strMo = this.fs.mo();
        if (TextUtils.isEmpty(strMo)) {
            if (!com.bytedance.sdk.component.adexpress.mml.ud() && TextUtils.equals(this.exu.to().ud(), "text_star")) {
                strMo = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.mml.ud() && TextUtils.equals(this.exu.to().ud(), "score-count")) {
                strMo = "6870";
            }
        }
        return (TextUtils.equals(this.exu.to().ud(), "title") || TextUtils.equals(this.exu.to().ud(), "subtitle")) ? strMo.replace(IOUtils.LINE_SEPARATOR_UNIX, "") : strMo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        int i10;
        double d10;
        super.tvp();
        if (TextUtils.isEmpty(getText())) {
            this.bjy.setVisibility(4);
            return true;
        }
        if (this.fs.gy()) {
            rq();
            return true;
        }
        ((TextView) this.bjy).setText(this.fs.mo());
        ((TextView) this.bjy).setTextDirection(5);
        this.bjy.setTextAlignment(this.fs.jpc());
        ((TextView) this.bjy).setTextColor(this.fs.wd());
        ((TextView) this.bjy).setTextSize(this.fs.mzz());
        if (this.fs.oth()) {
            int iLjh = this.fs.ljh();
            if (iLjh > 0) {
                ((TextView) this.bjy).setLines(iLjh);
                ((TextView) this.bjy).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.bjy).setMaxLines(1);
            ((TextView) this.bjy).setGravity(17);
            ((TextView) this.bjy).setEllipsize(TextUtils.TruncateAt.END);
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        if (jpcVar != null && jpcVar.to() != null) {
            if (com.bytedance.sdk.component.adexpress.mml.ud() && qdl() && (TextUtils.equals(this.exu.to().ud(), "text_star") || TextUtils.equals(this.exu.to().ud(), "score-count") || TextUtils.equals(this.exu.to().ud(), "score-count-type-1") || TextUtils.equals(this.exu.to().ud(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.exu.to().ud(), "score-count") || TextUtils.equals(this.exu.to().ud(), "score-count-type-2")) {
                try {
                    try {
                        i10 = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
                if (i10 < 0) {
                    if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                        setVisibility(8);
                        return true;
                    }
                    this.bjy.setVisibility(0);
                }
                if (TextUtils.equals(this.exu.to().ud(), "score-count-type-2")) {
                    ((TextView) this.bjy).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                    ((TextView) this.bjy).setGravity(17);
                    return true;
                }
                qdl((TextView) this.bjy, i10, getContext(), "tt_comment_num");
            } else if (TextUtils.equals(this.exu.to().ud(), "text_star")) {
                try {
                    d10 = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d10 = -1.0d;
                }
                if (d10 < 0.0d || d10 > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                        setVisibility(8);
                        return true;
                    }
                    this.bjy.setVisibility(0);
                }
                ((TextView) this.bjy).setIncludeFontPadding(false);
                ((TextView) this.bjy).setText(String.format("%.1f", Double.valueOf(d10)));
            } else if (TextUtils.equals("privacy-detail", this.exu.to().ud())) {
                ((TextView) this.bjy).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.exu.to().ud(), "development-name")) {
                ((TextView) this.bjy).setText(com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.exu.to().ud(), "app-version")) {
                ((TextView) this.bjy).setText(com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.bjy).setText(getText());
            }
            this.bjy.setTextAlignment(this.fs.jpc());
            ((TextView) this.bjy).setGravity(this.fs.tvp());
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                to();
            }
        }
        return true;
    }

    public void qdl(TextView textView, int i10, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.ljh.qdl(context, str), Integer.valueOf(i10)) + ")");
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }
}
