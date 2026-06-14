package io.bidmachine.ads.networks.nast;

import ac.h;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.Constants;
import io.bidmachine.Function;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import od.c;
import od.k;
import od.n;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
public class NastParams extends o {

    @Nullable
    final LabelData adLabelData;

    @Nullable
    final String callToAction;

    @Nullable
    final String clickUrl;

    @Nullable
    final String description;

    @Nullable
    final String iconUrl;

    @Nullable
    final String imageUrl;

    @Nullable
    final PrivacySheetData privacySheetData;

    @Nullable
    final Float rating;

    @Nullable
    final String title;

    @Nullable
    final String videoAdm;

    @Nullable
    final String videoUrl;

    NastParams(@NonNull k kVar) {
        super(kVar);
        this.title = kVar.l("title");
        this.description = kVar.l("description");
        this.callToAction = kVar.l("cta");
        this.rating = kVar.c("rating");
        this.iconUrl = kVar.l("iconUrl");
        this.imageUrl = kVar.l("imageUrl");
        this.videoUrl = kVar.l("videoUrl");
        this.videoAdm = kVar.l("videoAdm");
        this.clickUrl = kVar.l(Constants.CLICK_URL);
        this.adLabelData = (LabelData) kVar.h("adLabel", new Function() { // from class: io.bidmachine.ads.networks.nast.a
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return NastParams.b(obj);
            }
        });
        this.privacySheetData = (PrivacySheetData) kVar.h("privacySheet", new Function() { // from class: io.bidmachine.ads.networks.nast.b
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return NastParams.a(obj);
            }
        });
    }

    public static /* synthetic */ PrivacySheetData a(Object obj) {
        return (PrivacySheetData) obj;
    }

    public static /* synthetic */ LabelData b(Object obj) {
        return (LabelData) obj;
    }

    public boolean isValid(@NonNull c cVar) {
        if (TextUtils.isEmpty(this.title)) {
            cVar.onAdLoadFailed(ae.a.k("title"));
            return false;
        }
        if (!TextUtils.isEmpty(this.callToAction)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("cta"));
        return false;
    }

    boolean isValid(@NonNull n nVar, @NonNull c cVar) {
        if (!isValid(cVar)) {
            return false;
        }
        h adRequestParameters = nVar.getAdRequestParameters();
        if (adRequestParameters.c() && adRequestParameters.a(MediaAssetType.Icon) && TextUtils.isEmpty(this.iconUrl)) {
            cVar.onAdLoadFailed(ae.a.k("iconUrl"));
            return false;
        }
        if (adRequestParameters.c() && adRequestParameters.a(MediaAssetType.Image) && TextUtils.isEmpty(this.imageUrl)) {
            cVar.onAdLoadFailed(ae.a.k("imageUrl"));
            return false;
        }
        if (!adRequestParameters.c() || !adRequestParameters.a(MediaAssetType.Video) || !TextUtils.isEmpty(this.videoAdm) || !TextUtils.isEmpty(this.videoUrl)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("videoAdm or videoUrl"));
        return false;
    }
}
