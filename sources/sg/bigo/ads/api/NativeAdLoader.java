package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.N6;
import java.util.Map;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdLoader extends AbstractAdLoader<NativeAd, NativeAdRequest> {

    public static class Builder implements AdLoader.Builder<NativeAd, Builder, NativeAdLoader> {
        private AdLoadListener<NativeAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(@Nullable AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<NativeAd>) adLoadListener);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public NativeAdLoader build() {
            return new NativeAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<NativeAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public NativeAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ Ad a(f fVar) {
        Map<String, String> map;
        if (fVar.f102174a.x() != 1) {
            return (NativeAd) super.a(fVar);
        }
        sg.bigo.ads.ad.b.b bVarA = sg.bigo.ads.ad.b.a.a(fVar);
        if (bVarA != null) {
            sg.bigo.ads.api.core.b bVar = (sg.bigo.ads.core.a.a) bVarA.f();
            if ((bVar instanceof sg.bigo.ads.controller.c.b) && bVar.al() && (map = ((sg.bigo.ads.controller.c.b) bVar).f103436y) != null && !q.a((Object) N6.J0) && !q.a((Object) "1") && !map.containsKey(N6.J0)) {
                map.put(N6.J0, "1");
            }
        }
        return bVarA;
    }
}
