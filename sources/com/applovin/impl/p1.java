package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.r2;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
public class p1 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q1 f10073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f10074o;

    public p1(q1 q1Var, Context context) {
        super(r2.c.DETAIL);
        this.f10073n = q1Var;
        this.f10074o = context;
        this.f10276c = r();
        this.f10277d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + n7.a(this.f10073n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f10073n.d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f10073n.f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.r2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.r2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f10074o);
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return true;
    }
}
