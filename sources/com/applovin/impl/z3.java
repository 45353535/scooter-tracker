package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
public class z3 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e3 f11616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f11617o;

    public z3(e3 e3Var, Context context) {
        super(r2.c.DETAIL);
        this.f11616n = e3Var;
        this.f11617o = context;
        this.f10276c = t();
        this.f10277d = s();
    }

    private SpannedString q() {
        if (!this.f11616n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
        }
        if (TextUtils.isEmpty(this.f11616n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f11616n.c(), ViewCompat.MEASURED_STATE_MASK));
        if (this.f11616n.A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", m0.a(R.color.applovin_sdk_orangeColor, this.f11617o)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f11616n.k(), ViewCompat.MEASURED_STATE_MASK));
        }
        if (!this.f11616n.B()) {
            spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f11616n.q() == e3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        } else if (this.f11616n.q() == e3.a.INCOMPLETE_INTEGRATION && this.f11616n.E()) {
            spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.f11616n.g(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.f11616n.F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
        }
        if (!StringUtils.isValidString(this.f11616n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.f11616n.z() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f11616n.p(), ViewCompat.MEASURED_STATE_MASK));
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.r2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.r2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f11617o);
    }

    @Override // com.applovin.impl.r2
    public int h() {
        int iH = this.f11616n.h();
        return iH > 0 ? iH : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return this.f11616n.q() != e3.a.MISSING;
    }

    public e3 r() {
        return this.f11616n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f10276c) + ", detailText=" + ((Object) this.f10277d) + ", network=" + this.f11616n + "}";
    }
}
