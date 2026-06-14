package w8;

import com.explorestack.protobuf.adcom.Ad;
import com.vungle.ads.internal.Constants;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.TrackEventType;
import pd.f0;

/* JADX INFO: loaded from: classes12.dex */
final class k extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x8.b f107542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x8.a f107543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x8.c f107544f;

    k(Ad ad2) {
        super(ad2);
        x8.b bVar = new x8.b();
        this.f107542d = bVar;
        x8.a aVar = new x8.a(bVar);
        this.f107543e = aVar;
        this.f107544f = new x8.c(aVar);
        Ad.Display.Native r62 = ad2.getDisplay().getNative();
        Ad.Display.Native.LinkAsset link = r62.getLink();
        if (link != null && link != Ad.Display.Native.LinkAsset.getDefaultInstance()) {
            b().put(Constants.CLICK_URL, link.getUrl());
            for (int i10 = 0; i10 < link.getTrkrCount(); i10++) {
                a(TrackEventType.Click, link.getTrkr(i10));
            }
        }
        for (Ad.Display.Native.Asset asset : r62.getAssetList()) {
            int id2 = asset.getId();
            if (id2 == 4) {
                Ad.Display.Native.Asset.VideoAsset defaultInstance = Ad.Display.Native.Asset.VideoAsset.getDefaultInstance();
                if (!asset.getVideo().getCurl().equals(defaultInstance.getCurl())) {
                    b().put("videoUrl", asset.getVideo().getCurl());
                }
                if (!asset.getVideo().getAdm().equals(defaultInstance.getAdm())) {
                    b().put("videoAdm", asset.getVideo().getAdm());
                }
            } else if (id2 == 7) {
                try {
                    b().put("rating", Float.valueOf(asset.getData().getValue()));
                } catch (NumberFormatException unused) {
                }
            } else if (id2 == 8) {
                b().put("cta", asset.getData().getValue());
            } else if (id2 == 101) {
                f0.p(this.f107543e.a(asset.getLabel()), new pd.h() { // from class: w8.i
                    @Override // pd.h
                    public final void execute(Object obj) {
                        this.f107540a.b().put("adLabel", (LabelData) obj);
                    }
                });
            } else if (id2 == 102) {
                f0.p(this.f107544f.a(asset), new pd.h() { // from class: w8.j
                    @Override // pd.h
                    public final void execute(Object obj) {
                        this.f107541a.b().put("privacySheet", (PrivacySheetData) obj);
                    }
                });
            } else if (id2 == 123) {
                b().put("title", asset.getTitle().getText());
            } else if (id2 == 124) {
                b().put("iconUrl", asset.getImage().getUrl());
            } else if (id2 == 127) {
                b().put("description", asset.getData().getValue());
            } else if (id2 == 128) {
                b().put("imageUrl", asset.getImage().getUrl());
            }
        }
    }

    @Override // w8.h, zb.b
    public boolean f() {
        return true;
    }
}
