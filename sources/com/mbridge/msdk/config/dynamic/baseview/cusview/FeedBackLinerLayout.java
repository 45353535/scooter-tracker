package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class FeedBackLinerLayout extends ComponentLinearLayout implements com.mbridge.msdk.config.dynamic.baseview.inter.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FeedbackRadioGroup f47415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f47417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FeedBackLinerLayout f47418d;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f47419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ColorStateList f47420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f47421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f47422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47423e;

        private b() {
        }
    }

    public FeedBackLinerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47417c = new HashMap();
        this.f47418d = this;
    }

    private FeedbackRadioGroup a() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            Log.w("FeedBackLinerLayout", "Context is null");
            return null;
        }
        try {
            FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
            this.f47415a = feedbackRadioGroup;
            feedbackRadioGroup.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, v0.a(contextD, 4.0f), 0, 0);
            this.f47415a.setLayoutParams(layoutParams);
            a(this.f47415a, contextD);
            return this.f47415a;
        } catch (Exception e10) {
            Log.e("FeedBackLinerLayout", "Error creating FeedbackRadioGroup", e10);
            return null;
        }
    }

    private void setupRadioButtonClickListener(final RadioButton radioButton) {
        radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47453b.a(radioButton, view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.f47416b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(String.valueOf(tag), this.f47417c);
        return map;
    }

    public void init(List<Object> list) {
        if (list == null) {
            Log.w("FeedBackLinerLayout", "FBK configuration is null");
            return;
        }
        try {
            removeAllViews();
            FeedbackRadioGroup feedbackRadioGroupA = a();
            if (feedbackRadioGroupA == null) {
                Log.w("FeedBackLinerLayout", "Failed to create FeedbackRadioGroup");
                return;
            }
            feedbackRadioGroupA.setTag("feedback_group");
            a(feedbackRadioGroupA, list);
            addView(feedbackRadioGroupA);
        } catch (Exception e10) {
            Log.e("FeedBackLinerLayout", "Error initializing FeedBackLinerLayout", e10);
        }
    }

    public void setOutDataScope(String str) {
        this.f47416b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (String.valueOf(map.get("clickable")).equals("true")) {
            setViewClickListener();
        }
        if (map.get("saveContent") instanceof String) {
            setOutDataScope("saveContent");
        }
        Object obj = map.get("data");
        if (obj instanceof List) {
            init((List) obj);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        if (obj instanceof List) {
            init((List) obj);
        }
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, Context context) {
        try {
            int iA = i0.a(context, "mbridge_cm_feedback_choice_btn_bg", "drawable");
            if (iA != 0) {
                feedbackRadioGroup.setBackgroundResource(iA);
            }
            int iA2 = v0.a(context, 8.0f);
            feedbackRadioGroup.setPadding(iA2, iA2, iA2, iA2);
        } catch (Exception e10) {
            Log.w("FeedBackLinerLayout", "Error setting up RadioGroup style", e10);
        }
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, List<Object> list) {
        RadioButton radioButtonA;
        if (feedbackRadioGroup == null) {
            Log.w("FeedBackLinerLayout", "RadioGroup is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (list != null && !list.isEmpty() && contextD != null) {
            try {
                b bVarA = a(contextD);
                float size = 1.0f / list.size();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    String strValueOf = String.valueOf(list.get(i10));
                    if (!TextUtils.isEmpty(strValueOf) && (radioButtonA = a(contextD, strValueOf, bVarA, size)) != null) {
                        feedbackRadioGroup.addView(radioButtonA);
                    }
                }
                return;
            } catch (Exception e10) {
                Log.e("FeedBackLinerLayout", "Error adding RadioButtons to RadioGroup", e10);
                return;
            }
        }
        Log.w("FeedBackLinerLayout", "Invalid parameters for adding RadioButtons");
    }

    private b a(Context context) {
        b bVar = new b();
        try {
            bVar.f47419a = i0.a(context, "mbridge_cm_feedback_choice_btn_bg", "drawable");
            int iA = i0.a(context, "mbridge_cm_feedback_rb_text_color_color_list", "color");
            Resources resourcesA = i0.a(context);
            if (resourcesA != null && iA != 0) {
                try {
                    bVar.f47420b = resourcesA.getColorStateList(iA);
                } catch (Exception e10) {
                    Log.w("FeedBackLinerLayout", "Error loading color state list", e10);
                }
            }
            bVar.f47421c = v0.a(context, 8.0f);
            bVar.f47422d = v0.a(context, 4.0f);
            bVar.f47423e = v0.c(context, 14.0f);
        } catch (Exception e11) {
            Log.w("FeedBackLinerLayout", "Error creating RadioButton style", e11);
        }
        return bVar;
    }

    private RadioButton a(Context context, String str, b bVar, float f10) {
        try {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(str);
            radioButton.setTag(str);
            a(radioButton, bVar);
            radioButton.setLayoutParams(a(bVar, f10));
            setupRadioButtonClickListener(radioButton);
            return radioButton;
        } catch (Exception e10) {
            Log.e("FeedBackLinerLayout", "Error creating RadioButton for text: " + str, e10);
            return null;
        }
    }

    private void a(RadioButton radioButton, b bVar) {
        try {
            ColorStateList colorStateList = bVar.f47420b;
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
                radioButton.setButtonTintList(bVar.f47420b);
            }
            int i10 = bVar.f47421c;
            radioButton.setPadding(i10, i10, i10, i10);
            radioButton.setCompoundDrawablePadding(bVar.f47421c / 2);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            radioButton.setSingleLine(true);
            radioButton.setTextSize(0, bVar.f47423e);
        } catch (Exception e10) {
            Log.w("FeedBackLinerLayout", "Error applying RadioButton style", e10);
        }
    }

    private RadioGroup.LayoutParams a(b bVar, float f10) {
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        layoutParams.weight = f10;
        int i10 = bVar.f47422d;
        int i11 = i10 / 2;
        layoutParams.setMargins(i10, i11, i10, i11);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(RadioButton radioButton, View view) {
        if (TextUtils.isEmpty(this.f47416b)) {
            return;
        }
        a(radioButton);
        HashMap map = new HashMap();
        map.put("property", this.f47417c);
        f.a(this.xmlView, "feedbackItemView", map);
    }

    private void a(RadioButton radioButton) {
        if (TextUtils.isEmpty(this.f47416b) || radioButton == null) {
            return;
        }
        try {
            CharSequence text = radioButton.getText();
            if (text instanceof String) {
                String strValueOf = String.valueOf(text);
                if (this.f47417c.containsKey("selectedContents")) {
                    Object obj = this.f47417c.get("selectedContents");
                    if (obj instanceof List) {
                        List list = (List) obj;
                        list.clear();
                        list.add(strValueOf);
                        return;
                    }
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(strValueOf);
                this.f47417c.put("selectedContents", arrayList);
            }
        } catch (Throwable th2) {
            q0.b("FeedBackLinerLayout", th2.getMessage(), th2);
        }
    }
}
