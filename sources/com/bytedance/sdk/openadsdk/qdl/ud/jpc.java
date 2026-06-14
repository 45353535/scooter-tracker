package com.bytedance.sdk.openadsdk.qdl.ud;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.bch.ud.mzz;
import com.bytedance.sdk.openadsdk.core.jtx;
import com.bytedance.sdk.openadsdk.core.mml.wd;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.bytedance.sdk.openadsdk.utils.uw;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends PAGNativeAd {
    private boolean jpc;
    protected final Context lnr;
    protected qdl mml;
    protected int mo;
    protected int mzz;
    protected jtx qdl;
    private boolean tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected final ljh f17797ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected String f17798wd;

    public jpc(@NonNull Context context, @NonNull ljh ljhVar, int i10, boolean z10) {
        this.f17797ud = ljhVar;
        this.lnr = context;
        this.mzz = i10;
        this.mo = ljhVar.fz();
        String strLnr = gy.lnr(i10);
        this.f17798wd = strLnr;
        if (z10) {
            this.mml = new qdl(context, ljhVar, strLnr);
            this.qdl = new jtx(context, this, ljhVar, qdl(i10), this.mml);
        }
    }

    private List<View> qdl(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                linkedList.add(list.get(i10));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedList.add(list2.get(i11));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        ljh ljhVar = this.f17797ud;
        if (ljhVar == null || ljhVar.dsy() == null) {
            return null;
        }
        try {
            return this.f17797ud.dsy().get(str);
        } catch (Throwable th2) {
            aaj.lnr("TTNativeAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        ljh ljhVar = this.f17797ud;
        if (ljhVar != null) {
            return ljhVar.dsy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new mml(jpc());
    }

    public qdl jpc() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.tvp) {
            return;
        }
        rc.qdl(this.f17797ud, d10, str, str2);
        this.tvp = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        qdl(viewGroup, null, list, list2, view, new wd(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    protected boolean wd() {
        ljh ljhVar = this.f17797ud;
        return (ljhVar == null || ljhVar.ygv() == 5 || yt.mml().lnr(this.mo) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.jpc) {
            return;
        }
        rc.qdl(this.f17797ud, d10);
        this.jpc = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String qdl(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    protected void qdl(String str) {
        this.f17798wd = str;
    }

    public void qdl(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @NonNull List<View> list2, @Nullable List<View> list3, @Nullable View view, final mo moVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (wd()) {
            list3 = qdl(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && moVar != null && moVar.ud()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.jpc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strQdl = uw.qdl();
                    TTDelegateActivity.qdl(jpc.this.f17797ud, strQdl, new wd.qdl() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.jpc.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.mml.wd.qdl
                        public void qdl() {
                            moVar.qdl();
                            tvp.ud().mo(strQdl);
                            PAGMediaView pAGMediaViewQdl = jpc.this.jpc().qdl();
                            if (pAGMediaViewQdl != null) {
                                pAGMediaViewQdl.close();
                            }
                        }
                    });
                }
            });
        }
        this.qdl.qdl(viewGroup, list, list2, list4, moVar);
        ljh ljhVar = this.f17797ud;
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(viewGroup, this.f17797ud, (ljhVar == null || ljhVar.dk() != 2) ? null : new mzz.qdl(this.f17797ud.ra()));
    }
}
